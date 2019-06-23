package roc.strategy.main;

import roc.strategy.pojo.ConcreteStrategyA;
import roc.strategy.pojo.ConcreteStrategyB;
import roc.strategy.pojo.Context;

/**
 * 测试类
 */
public class TestStrategy {

    public static void main(String[] args) {
        Context context;

        context=new Context(new ConcreteStrategyA());
        context.ContextInterface();

        context=new Context(new ConcreteStrategyB());
        context.ContextInterface();
    }
}
