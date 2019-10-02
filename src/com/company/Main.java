package com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.company.antlr4.MyRulesBaseListener;
import com.company.antlr4.rulesLexer;
import com.company.antlr4.rulesParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/com/company/queryTest.txt");
        Scanner scanner = new Scanner(file);
        List<String> lines = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.length() != 0) { lines.add(line); }
        }
        DBMS.movies.add(new Movie(0, "Spiderman", 2002, "Action", new ArrayList<Person>()));
        DBMS.movies.add(new Movie(1, "Batman", 2008, "Action", new ArrayList<Person>()));
        DBMS.movies.add(new Movie(2, "The Shining", 1980, "Horror", new ArrayList<Person>()));
        DBMS.movies.add(new Movie(3, "Superman", 2006, "Comedy", new ArrayList<Person>()));

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
            if(DBMS.terminalNodes.contains("<-")) {
                System.out.println(DBMS.terminalNodes);
                String type = DBMS.terminalNodes.remove(DBMS.terminalNodes.size() - 1);
                DBMS.terminalNodes = DBMS.postfix(DBMS.terminalNodes);
                System.out.println(DBMS.terminalNodes);
                QueryCommands.processQuery(DBMS.terminalNodes, type);
                //System.out.println(DBMS.terminalNodes);
            } else {
              //  DBMS.processCommand(DBMS.terminalNodes.get(0));
            }
            //System.out.println(DBMS.terminalNodes);
            DBMS.terminalNodes.clear();

        }
    }
}
