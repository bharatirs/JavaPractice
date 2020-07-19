import com.bharati.learning.practice.HelloWorld;

public class Example {

    public static void main(String[] args) {
        HelloWorld helloWorld1 = new HelloWorld(1560, 2076, 2020);

        HelloWorld helloWorld2 = new HelloWorld( 1700, 3070, 2040);


        System.out.println(String.format("Hello World 1 Nepali Year - %d", helloWorld1.getNepaliYear()));
        System.out.println(String.format("Hello World 2 Nepali Year - %d", helloWorld2.getNepaliYear()));



    }
}
