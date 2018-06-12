import org.antlr.v4.runtime.*;

import java.io.*;
import java.util.ArrayDeque;

public class Main {

    public static void main(String[] args) throws IOException {
        // create a CharStream that reads from file
        String fileName = "test1.cmm";
        File file = new File(fileName);
        FileInputStream inputFile = new FileInputStream(file);
        LineNumberReader lineNumberReader = new LineNumberReader(new FileReader(file));     //文件流操作参考自官方文档
        //lexer file in
        ANTLRInputStream input = new ANTLRInputStream(inputFile);
        CMMLEXERLexer lexer = new CMMLEXERLexer(input);
        //队列存储token
        ArrayDeque<Token> arrayDeque = new ArrayDeque<>();
        String[] tokenTags = CMMLEXERLexer._TOKEN_TAGS;
        int lineNum = 1;
        //visit整个文件并在eof的时候停止
        for (Token token = lexer.nextToken(); token.getType() != Token.EOF; token = lexer.nextToken()) {
            //转到下一行第一个token的时候开始处理上一行的输出，若多行注释则在遍历到注释后第一个token时整体输出
            if (lineNum != token.getLine()) {
                //整行先输出
                for (int i=lineNum; i<token.getLine(); i++) {
                    lineNumberReader.setLineNumber(i);
                    String s = lineNumberReader.readLine();
                    System.out.printf("%d: %s\n", i, s);
                }
                //非注释行逐个token输出
                while (!arrayDeque.isEmpty()) {
                    Token t = arrayDeque.pollFirst();
                    if (!tokenTags[t.getType()].equals("COMMENT") && !tokenTags[t.getType()].equals("LINE_COMMENT"))
                    {
                        System.out.printf("\t%d: %s %s\n", lineNum, tokenTags[t.getType()], t.getText());
                    }
                }
                //进入下一行
                lineNum = token.getLine();
            }
            arrayDeque.addLast(token);               //同一行轮流进queue
        }
        //EOF前一行
        Token token = lexer.nextToken();
        if (token.getType() == Token.EOF){
            lineNumberReader.setLineNumber(lineNum);
            String s = lineNumberReader.readLine();
            System.out.printf("%d: %s\n", lineNum, s);
            lineNum++;
            System.out.println("\t"+lineNum+": EOF" );
        }
        inputFile.close();
    }
}
