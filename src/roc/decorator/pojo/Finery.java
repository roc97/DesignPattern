package roc.decorator.pojo;

/**
 * 装饰类
 */
public class Finery extends Person{

    private Person component;

    public void Decorate(Person component){
        this.component=component;
    }

    public void show(){
        if(component!=null){
            component.show();
        }
    }
}
