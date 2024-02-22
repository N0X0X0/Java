import java.io.*;
class TextExceptionClass {
    void m() throws IOException {
        int c = 10 + 20;
        throw new java.io.IOException("device error");
    }

    void n() throws IOException {
        m();
    }

    void p() {
        try {
            n();
        } catch (IOException e) {
            System.out.println("exception handled");
        }
    }
}

public class TextException{
    public static void main(String[] args){
        TextExceptionClass obj = new TextExceptionClass();
        obj.p();
        System.out.println("normal flow");
    }
}
