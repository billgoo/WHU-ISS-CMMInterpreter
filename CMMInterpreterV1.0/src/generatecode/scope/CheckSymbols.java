package generatecode.scope;
/***
 * Excerpted from "The Definitive ANTLR 4 Reference",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpantlr2 for more book information.
***/

import cmm.CMMParser;
import org.antlr.v4.runtime.Token;
import scope.Symbol;

public class CheckSymbols {
    public static Symbol.Type getType(int tokenType) {
        switch ( tokenType ) {
            case CMMParser.INT :   return Symbol.Type.tINT;
            case CMMParser.DOUBLE : return Symbol.Type.tDOUBLE;
            case CMMParser.BOOL : return Symbol.Type.tBOOL;
        }
        return Symbol.Type.tINVALID;
    }

    public static Symbol.Type getArrType(int tokenType) {
        switch ( tokenType ) {
            case CMMParser.INT :   return Symbol.Type.aINT;
            case CMMParser.DOUBLE : return Symbol.Type.aDOUBLE;
            case CMMParser.BOOL : return Symbol.Type.aBOOL;
        }
        return Symbol.Type.tINVALID;
    }

    public static void error(Token t, String msg) {
        System.err.printf("line %d:%d %s\n", t.getLine()-1, t.getCharPositionInLine(),
                          msg);
    }
}
