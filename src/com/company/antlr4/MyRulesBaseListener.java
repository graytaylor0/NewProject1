package com.company.antlr4;

import com.company.DBMS;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

public class MyRulesBaseListener extends rulesBaseListener {
    public MyRulesBaseListener() {
        DBMS myDbms = new DBMS();
    }
    @Override public void exitShow_cmd(rulesParser.Show_cmdContext ctx) {
        //System.out.println("SHOW");
    }
    //@Override public void exitOperand(rulesParser.OperandContext ctx) {DBMS.terminalNodes.add(ctx.stop.getText());}
    //@Override public void exitLiteral(rulesParser.LiteralContext ctx) {DBMS.terminalNodes.add(ctx.stop.getText());}
    //@Override public void exitRelation_name(rulesParser.Relation_nameContext ctx) {DBMS.terminalNodes.add(ctx.stop.getText());}
    //@Override public void exitComparison(rulesParser.ComparisonContext ctx) {DBMS.terminalNodes.add(ctx.OP().getText());}
    @Override public void visitTerminal(TerminalNode node) {
            if(!(node.getText().equals(",")) && !(node.getText().equals(";"))) {
                DBMS.terminalNodes.add(node.getText());
            }
    }

    public void enterCommand(rulesParser.CommandContext ctx) {//<!-- -->
        // Enters a subtree where the parser rule cmd is the root
        List<ParseTree> children = ctx.children; // grabs the children nodes
        ParseTree first_child = children.get(0);

        String x = first_child.getText();
        int num = first_child.getChildCount();
        // If num is 0, the node is a leaf node
        // Assume that the second child is not a leaf node
        /*ParseTree second_child = children.get(1);
        ParseTree subtree_first_child = second_child.getChild(0);
        String y = subtree_first_child.getText();
         */
        // Put the extracted information in the listener's DBMS object
        //dbms.some_function(x, y);
    }
}

