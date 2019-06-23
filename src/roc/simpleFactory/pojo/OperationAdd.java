package roc.simpleFactory.pojo;

/**
 * 加法类
 */
public class OperationAdd extends Operation{

    @Override
    public double GetResult(){
        double result=0;
        result=getNumberA()+getNumberB();
        return result;
    }
}
