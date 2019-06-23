package roc.simpleFactory.main;


import roc.simpleFactory.factory.OperationFactory;
import roc.simpleFactory.pojo.Operation;

/**
 * 测试类
 * 案例：要求程序实现输入两个数和运算符号，得到结果。
 */
public class TestSimpleFactory {

    public static void main(String[] args) {
        Operation oper= OperationFactory.createOperate("*");
        oper.setNumberA(2);
        oper.setNumberB(5);
        double result=oper.GetResult();
        System.out.println("运算结果："+result);
    }
}
