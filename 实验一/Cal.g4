grammar Cal;                            // 文法的名字为Calc

// 以下以小写字母开头的文法表示为语法元素
// 由大写字母开头的文法表示为词法元素
// 词法元素的表示类似于正则表示式
// 语法元素的表示类似于BNF

prog : setExpr+ calExpr+ writeExpr* endExpr;
//声明语句
setExpr : 'float' id=ID ';'
    | 'int' id=ID ';'
    ;

//计算语句
calExpr : id=ID '=' expr ';' ;        // 一个赋值语句是由一个ID，后跟着一个等号，再后面跟送一个数字组成

// expr可能由多个产生式
// 在前面的产生式优先于在后面的产生式
// 这样来解决优先级的问题

expr: expr op=(MUL | DIV) expr            // 乘法或除法
    | expr op=(ADD | SUB) expr            // 加法或减法
    | ((sign=SUB)? ) num=NUMBER              // 计算因子可以是一个正数或负数
    | id=ID
    | '(' expr ')'                      // 计算因子可以是括号括起来的表示式
    ;

//输出语句
writeExpr : 'write''(' id=ID ')'';' ;
endExpr : 'write''(' id=ID ')''.' ;

ID : [a-zA-Z]([0-9]|[a-zA-Z])* ;    // 标识符，由字母开头，可含有多个数字和字母
NUMBER : [0-9]+('.'[0-9]+)? ;       // 数字，小数
ADD : '+' ;
SUB : '-' ;
MUL : '*' ;
DIV : '/' ;
WS : [ \t \r \n]+ -> skip ;                // 空白， 后面的->skip表示antlr4在分析语言的文本时，符合这个规则的词法将被无视
