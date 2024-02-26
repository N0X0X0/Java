package othereg;

public class Generics<T> {
    private T t;
    public T get(){
        return this.t;
    }
    public void set(T t1){
        this.t=t1;
    }

    public void display(){
        System.out.println(t);
    }
    public static <T> boolean isEqual(Generics<T> g1, Generics<T> g2){
        return g1.get().equals(g2.get());
    }

    public static void main(String[] args) {
        Generics<String> t1 =new Generics<>();
        t1.set("Ayush");

        Generics t2 =new Generics<>();
        t2.set("Ayush");
//        t2.set(10);

        boolean isEqual;
        isEqual = Generics.isEqual(t1, t2);
        System.out.println(isEqual);
        t1.display();
        t2.display();
    }
}
