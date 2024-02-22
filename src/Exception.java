public class Exception {
    public static void validate(int age) {
        if(age<18) {
            throw new ArithmeticException("Person is not eligible to vote");
        }
        else {
            System.out.println("Person is eligible to vote!!");
        }
    }
    public static void main(String args[]){
        validate(13);
        System.out.println("rest of the code...");
    }
}

//
//import java.io;
//import java.io.FileNotFoundException;
//
//public class TestThrow2{
//    public static void method()throws FileNotFoundException{
//        FileReader file = new FileReader()
//    }
//}


