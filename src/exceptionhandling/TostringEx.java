package exceptionhandling;

class StringClass{

    private int age;
    private String name;

    public StringClass(int age, String name){
        this.age = age;
        this.name = name;
    }
    public String getInfo(){
        return age+" , "+name;
    }
    public String toString(){
        return age+" , "+name;
    }

}

public class TostringEx {
    public static void main(String[] args) {
        StringClass obj = new StringClass(12, "akashyadav");
        // obj.getInfo();
        System.out.println(obj.getInfo());
        // obj.toString();
        System.out.println(obj.toString());
        System.out.println("Thank you");
    }
}
