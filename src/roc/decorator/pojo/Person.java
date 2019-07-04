package roc.decorator.pojo;

/**
 * 装饰对象
 */
public class Person {

    private String name;

    public Person(){}

    public Person(String name){
        this.name=name;
    }

    public void show(){

        System.out.println("装扮者"+name);
    }

}
