package scope;
/***
 * Excerpted from "The Definitive ANTLR 4 Reference",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpantlr2 for more book information.
 * 作用域基类
***/

import java.util.LinkedHashMap;
import java.util.Map;

public abstract class BaseScope implements Scope {
    Scope enclosingScope; // null if global (outermost) scope
    Map<String, Symbol> symbols = new LinkedHashMap<String, Symbol>();

    public BaseScope(Scope enclosingScope) { this.enclosingScope = enclosingScope;  }

    public Symbol resolve(String name) {
        Symbol s = symbols.get(name);
        if ( s!=null ) return s;
        // if not here, check any enclosing scope
        if ( enclosingScope != null ) return enclosingScope.resolve(name);
        return null; // not found
    }

    // 生成代码用
    // 原有类上增补
    public Symbol cu_resolve(String name) {
        Symbol s = symbols.get(name);
        if ( s!=null ) return s;
        return null;
    }

    public void define(Symbol sym) {
        symbols.put(sym.name, sym);
        sym.scope = this; // track the scope in each symbol
    }

    // 语义分析编译用
    // 原有代码上增补
    public boolean redundant(String name){
        return symbols.get(name) != null;
    }

    public Scope getEnclosingScope() { return enclosingScope; }

    public String toString() { return getScopeName()+":"+symbols.keySet().toString(); }
}
