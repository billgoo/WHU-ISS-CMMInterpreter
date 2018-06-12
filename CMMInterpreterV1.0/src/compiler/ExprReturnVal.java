package compiler;

import scope.Symbol;

/**
 * Created by BG on 2016/12/13.
 * 表达式返回值
 */
public class ExprReturnVal {

    private Symbol.Type type; // int or double
    private Object value;

    public ExprReturnVal() {
    }

    public ExprReturnVal(Symbol.Type type, Object value) {
        this.type = type;
        this.value = value;
    }

    public Symbol.Type getType() {
        return type;
    }

    public void setType(Symbol.Type type) {
        this.type = type;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
