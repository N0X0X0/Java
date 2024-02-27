package lamdas;

import java.util.function.Function;
import java.util.function.Predicate;

public class LamdaDemo {

    public static int someMethod(String str){
        System.out.println("hi"+ str);
        return  28;
    }


    public static void main(String[] args) {
        //life  before lamdas
        SayableImpl sayable = new SayableImpl();
        sayable.say();

        //life after lamdas
        Sayable s1 = () -> {System.out.println("you're saying something");};
        s1.say();

        Printable  pr = (pmsg) -> {
            System.out.println("the message is"+pmsg);
        };
        pr.printMsg("my message");

        //predefined sam's
        Predicate<Integer> pr1 = (tInt) ->  (tInt >18);
        System.out.println( pr1.test(19));

        Function<String,Integer> salution = (name) -> {
            System.out.println("how are you "+name);
            return  20;
        };
        int val =   salution.apply("abdul");
        System.out.println("the value is "+val);

        Function<String,Integer> sal =  LamdaDemo::someMethod;
        int val1 = sal.apply("ansari");
    }
}
