package roc.strategy.pojo;

/**
 * 上下文
 */
public class Context {

    Strategy strategy;
    public Context(Strategy strategy){
        this.strategy=strategy;
    }

    //上下文接口
    public void ContextInterface(){
        strategy.AlgorithmInterface();
    }
}
