package roc.simpleFactory.pojo;

/**
 * 乘法类
 */
public class OperationMul extends Operation{

    @Override
    public double GetResult() {
        double result=0;
        result=getNumberA()*getNumberB();
        return result;
    }
}
