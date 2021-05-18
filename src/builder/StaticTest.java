package builder;

import java.io.*;

public class StaticTest {

    private static int c;

    public static synchronized void main(String[] args) {
        c = 1;
        c = 2;
        System.out.println(c);
        TestingShit testingShit = new TestingShit();

        try (FileOutputStream fileOutputStream = new FileOutputStream("Test.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(new TestingShit());
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }


}

class TestingShit implements Serializable {
    public static int number1 = 1;
    public int number2 = 2;
}