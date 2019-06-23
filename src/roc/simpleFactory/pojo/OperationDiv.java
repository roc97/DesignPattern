package roc.simpleFactory.pojo;

/**
 * 除法类
 */
public class OperationDiv extends Operation{

    @Override
    public double GetResult() {
        double result=0;
        if(getNumberB()==0) throw new ArithmeticException("除数不能为0。");
        result=getNumberA()/getNumberB();
        return result;
    }
}
