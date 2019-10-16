import json
import random
dictCount = 0
output_file_1 = open('outputP_1.txt', 'w+',encoding='utf-8')
output_file_2 = open('outputP_2.txt', 'w+',encoding='utf-8')
output_file_3 = open('outputP_3.txt', 'w+',encoding='utf-8')
output_file_4 = open('outputP_4.txt', 'w+',encoding='utf-8')
output_file = output_file_1
peopleToMovies = dict()
movies = []
count = 0
swappedCount = 0

def getRidOfNonGrammarChars(string):
    return string.replace(chr(226),'a').replace(chr(234),'e').replace(chr(224),'a').replace('/','_').replace(chr(252),'u').replace(chr(201),'E').replace(chr(232),'e').replace(chr(225),'a').replace(':','_').replace(';','_').replace(chr(237),'i').replace(chr(236),'i').replace(chr(231),'c').replace('!', '').replace('?', '').replace(' ', '_').replace('.', '').replace(chr(233), 'e').replace(chr(243), 'o').replace('\'','').replace('-','').replace('\\', '').replace(',', '').replace('(', '').replace(')', '')

with open('credits.json', encoding='utf-8') as json_file:
    moviesWithPeople = json.load(json_file)

with open('movies.json', encoding='utf-8') as json_file:
    moviesData = json.load(json_file)

for movie in moviesWithPeople:
    for person in movie['cast']:
        peopleToMovies[person['name']] = set()
    
    for person in movie['crew']:
        peopleToMovies[person['name']] = set()

for index, movie in enumerate(moviesData):
    cast_and_crew = moviesWithPeople[index]
    for cast in cast_and_crew['cast']:
        peopleToMovies[cast['name']].add(getRidOfNonGrammarChars(movie['title']))
    for crew in cast_and_crew['crew']:
        peopleToMovies[crew['name']].add(getRidOfNonGrammarChars(movie['title']))
    genreToWrite = ""
    if type(movie['genres']) == list:
        genreToWrite = movie['genres'][0]['name']
    elif type(movie['genres']) == dict:
        dictCount += 1
        try:
            genreToWrite = movie['genres']['name']
        except KeyError:
            pass

    movies.append([movie['id'], getRidOfNonGrammarChars(movie['title']), movie['release_date'][:4], movie['vote_average'], genreToWrite])

for movie in moviesWithPeople:
    if swappedCount == 0 and count > 250000:
        output_file = output_file_2
        swappedCount += 1
    
    if swappedCount == 1 and count > 500000:
        output_file = output_file_3
        swappedCount += 1

    if swappedCount == 2 and count > 750000:
        output_file = output_file_4
        swappedCount += 1
    
    for person in movie['cast']:
        output_file.write("INSERT INTO people VALUES FROM (" +  str(person['id']) + ", " + "\"" + getRidOfNonGrammarChars(person['name']) + "\", " + str(random.randint(10, 70)) + ", \"" +  getRidOfNonGrammarChars(person.get("character")) + "\", (\"" + "\", \"".join(list(peopleToMovies[person['name']])) + "\"))\n")
        count += 1
    for crew_member in movie['crew']:
        output_file.write("INSERT INTO people VALUES FROM (" +  str(crew_member['id']) + ", " + "\"" + getRidOfNonGrammarChars(crew_member['name']) + "\", " + str(random.randint(10, 70)) + ", \"" +  getRidOfNonGrammarChars(crew_member['job']) + "\", (\"" + "\", \"".join(list(peopleToMovies[crew_member['name']])) + "\"))\n")
        count += 1

for index, movie in enumerate(movies):
    peopleToAddToMovie = set()
    movieWithPeople = moviesWithPeople[index]
    for cast_member in movieWithPeople['cast']:
        peopleToAddToMovie.add(cast_member['name'])
    
    for crew_member in movieWithPeople['crew']:
        peopleToAddToMovie.add(crew_member['name'])

    output_file.write("INSERT INTO movies VALUES FROM (" + str(movie[0]) + ", \"" + movie[1] + "\", " + str(movie[2]) + ", " + str(int(movie[3] * 10)) + ", \"" + movie[4] + "\", " + "(\"" + "\", \"".join(list(peopleToAddToMovie)) + "\"))\n")



#print(peopleToMovies)

print(len(movies))
print(dictCount)
#print(movies)
output_file_1.close()
output_file_2.close()