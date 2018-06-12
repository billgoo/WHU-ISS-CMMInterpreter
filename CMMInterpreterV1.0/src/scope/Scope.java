package scope;

/***
 * Excerpted from "The Definitive ANTLR 4 Reference",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpantlr2 for more book information.
 * 作用域接口
 */
public interface Scope {
    public String getScopeName();

    /** Where to look next for symbols */
    public Scope getEnclosingScope();

    /** Define a symbol in the current scope */
    public void define(Symbol sym);

    /** Determine redundant definition in same scope
     * compiler 阶段用 */
    boolean redundant(String name);

    /** Look up name in this scope or in enclosing scope if not here */
    public Symbol resolve(String name);

    /** Look up name in the current scope */
    public Symbol cu_resolve(String name);
}
