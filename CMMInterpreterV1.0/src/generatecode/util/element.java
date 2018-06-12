package generatecode.util;

/**
 * Created by user on 2016/12/16.
 */
public class element {
    public String type;
    public String operator1;
    public String operator2;
    public String result;

    public element(String string1, String string2, String string3, String string4){
        super();
        this.type = string1;
        this.operator1 = string2;
        this.operator2 = string3;
        this.result = string4;
    }

    public String getType(){
        return type;
    }
    public String getOperator1(){
        return operator1;
    }
    public String getOperator2(){
        return operator2;
    }
    public String getResult(){
        return result;
    }
    public void setResult(String s){this.result = s;}
    public void setOperator1(String s){this.operator1= s;}
    public void setOperator2(String s){this.operator2= s;}


}
