package Princess;

public class HelloPrincess {

    private String name;
    private int age;
    private String kingdom;


    public HelloPrincess(String name, int age, String kingdom) {
        this.name = name;
        this.age = age;
        this.kingdom = kingdom;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name == "bharati") {
            System.out.println("Ye chor!! jpt set garchas");
            return;
        }
        this.name = name;
    }

//    public int getAge(){
//        return this.age;
//    }
//    public void setAge(int fff)
//    {
//        this.age=fff;
//    }
//
//    public String getKingdom() {
//        return this.kingdom;
//    }
}
