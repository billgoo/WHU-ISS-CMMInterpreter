package scope;

import scope.Scope;

/***
 * Excerpted from "The Definitive ANTLR 4 Reference",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpantlr2 for more book information.
 * A generic programming language symbol && 变量类型枚举
***/
public class Symbol { // A generic programming language symbol
    // array是原来写的
    // 所以aARRAY生成代码没有用
    // a开头的和INVALID是中间代码用的
    // 原来的只用t INT DOUBLE BOOL ARRAY
    // ps: breakpdd 是用来检测break的
    public static enum Type {tINVALID, tINT, tDOUBLE, tINTARRAY, tDOUBLEARRAY, tBOOL, tBOOLARRAY,
        aINT, aDOUBLE, aINTARRAY, aDOUBLEARRAY, aBOOL, aBOOLARRAY,
        BREAKPDD, NOBREAK }

    String name;      // All symbols at least have a name
    Type type;
    Scope scope;      // All symbols know what scope contains them.
    Object value;

    public Symbol(String name) { this.name = name; }
    public Symbol(String name, Type type) { this(name); this.type = type; }
    // for compiler
    public Symbol(String name, Type type, Object value){
        this(name, type);
        this.value = value;
    }
    public String getName() { return this.name; }

    // for compiler
    public Object getValue() { return this.value; }
    public void setValue(Object value) {
        this.value = value;
    }

    public Type getType() { return type; }

    // compiler
    public void setType(Type _type){
        type = _type;
    }

    // generate code
    public String toString() {
        if ( type!= Type.tINVALID ) return '<'+getName()+":"+type+'>';
        return getName();
    }
}
