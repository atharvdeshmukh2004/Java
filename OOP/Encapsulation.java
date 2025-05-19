   
class Human {
    private String name;
    private int age;
 
    Human() {
    }
 
    public void setAge(int var1) {
       age = var1;
    }
 
    public int getAge() {
       return age;
    }
 
    public void setName(String var1) {
       name = var1;
    }
 
    public String getName() {
       return name;
    }
 }
 

public class Encapsulation {
    public static void main(String[] args) {
        Human obj = new Human();
        obj.setAge(21);
        obj.setName("Atharv");
        System.out.println(obj.getName() + ":"+obj.getAge());
    }
}
