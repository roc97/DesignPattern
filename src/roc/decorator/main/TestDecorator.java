package roc.decorator.main;

import roc.decorator.pojo.Person;
import roc.decorator.pojo.Sneakers;
import roc.decorator.pojo.TShirts;
import roc.decorator.pojo.Trouser;

/**
 * 装饰模式
 */
public class TestDecorator {

    public static void main(String[] args) {
        Person person=new Person("小明");

        Trouser trouser=new Trouser();
        TShirts tShirts=new TShirts();
        Sneakers sneakers=new Sneakers();

        trouser.Decorate(person);
        tShirts.Decorate(trouser);
        sneakers.Decorate(tShirts);

        sneakers.show();
    }
}
