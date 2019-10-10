package com.company;
import com.company.antlr4.MyRulesBaseListener;
import com.company.antlr4.rulesLexer;
import com.company.antlr4.rulesParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/com/company/commandTest.txt");
        Scanner scanner = new Scanner(file);
        List<String> lines = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.length() != 0) { lines.add(line); }
        }




        for (String line : lines) {
            CharStream charStream = CharStreams.fromString(line);
            rulesLexer lexer = new rulesLexer(charStream);
            CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
            rulesParser parser = new rulesParser(commonTokenStream);
            lexer.removeErrorListeners();
            parser.removeErrorListeners();
            rulesParser.ProgramContext programContext = parser.program();
            ParseTreeWalker walker = new ParseTreeWalker();
            MyRulesBaseListener listener = new MyRulesBaseListener();
            walker.walk(listener, programContext);

            // Action happens
            //determine if it is a query or command
            if(DBMS.terminalNodes.contains("<-")) {

                String type = DBMS.terminalNodes.remove(DBMS.terminalNodes.size() - 1);
                DBMS.terminalNodes = DBMS.postfix(DBMS.terminalNodes);

                QueryCommands.processQuery(DBMS.terminalNodes, type);

            } else {

                DBMS.processCommand(DBMS.terminalNodes.get(0));
            }

            DBMS.terminalNodes.clear();

        }
        largeDatabaseQueries ldbQ = new largeDatabaseQueries();
        System.out.println("--TESTING BIG QUERY COMMANDS BELOW ON " + DBMS.people.get(1).getName() + " --");
        System.out.println(DBMS.people.get(1));
        System.out.println(ldbQ.mostOccurrencesInGenre(DBMS.people.get(1)));
        System.out.println(ldbQ.constellationOfCoStars(DBMS.people.get(0),3));
    }
}
