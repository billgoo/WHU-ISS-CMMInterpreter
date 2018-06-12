
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // choose a file from innership
        String fileName = " ";
        System.out.println("输出test的文件序号（1-12）：");
        Scanner in = new Scanner(System.in);
        int judge = in.nextInt();
        switch (judge) {
            case 1:
                fileName = "test1.cmm";
                break;
            case 2:
                fileName = "test2.cmm";
                break;
            case 3:
                fileName = "test3.cmm";
                break;
            case 4:
                fileName = "test4.cmm";
                break;
            case 5:
                fileName = "test5.cmm";
                break;
            case 6:
                fileName = "test6.cmm";
                break;
            case 7:
                fileName = "test7.cmm";
                break;
            case 8:
                fileName = "test8.cmm";
                break;
            case 9:
                fileName = "test9.cmm";
                break;
            case 10:
                fileName = "error1.cmm";
                break;
            case 11:
                fileName = "error2.cmm";
                break;
            case 12:
                fileName = "error3.cmm";
                break;
            default:
                System.out.println("Error!");
                break;
        }

        // create a CharStream that reads from file
        File file = new File(fileName);
        FileInputStream inputFile = null;
        try {
            inputFile = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        //lexer file in
        ANTLRInputStream input = null;
        try {
            input = new ANTLRInputStream(inputFile);
        } catch (IOException e) {
            e.printStackTrace();
        }

        CMMPARSERLexer lexer = new CMMPARSERLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CMMPARSERParser parser = new CMMPARSERParser(tokens);

        ParseTree parseTree = parser.prog();
        System.out.println(parseTree.toStringTree(parser));
        try {
            inputFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
