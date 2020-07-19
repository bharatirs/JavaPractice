import Princess.HelloPrincess;

public class ExamplePrincess {



    public static void main(String[] args) {
        HelloPrincess helloPrincess = new HelloPrincess("Ariel", 17, "Atlantis");
        String name = helloPrincess.getName();
        System.out.println(name);
        helloPrincess.setName("bharati");
        System.out.println(helloPrincess.getName());
        helloPrincess.setName("nera");
        System.out.println(helloPrincess.getName());
        ExamplePrincess examplePrincess = new ExamplePrincess();
        examplePrincess.dummy();
    }

    public void dummy() {
        int a1;
        int a2;
        int a3;
        int a4;
        int a5;
        int a6;
        int a7;
        int a8;
        int a9;
        int a10;

        a1 = 1;
        a2 = 2;
        a3 = 3;
        a4 = 4;
        a5 = 5;
        a6 = 6;
        a7 = 7;
        a8 = 8;
        a9 = 9;
        a10 = 10;
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);
        System.out.println(a5);
        System.out.println(a5);
        System.out.println(a6);
        System.out.println(a7);
        System.out.println(a8);
        System.out.println(a9);
        System.out.println(a10);

    }

    public void dummyArray() {
        int[] intArray = new int[10];
        for (int i = 0; i < 10; i++) {
            intArray[i] = i + 1;
        }


    }

}