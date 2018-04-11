public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }


    public String getName(){
        return this.name;
    }
    public void setName(String input) {
      this.name =  input;
    }

    public void sayHello() {
        System.out.println("Hello from " + this.name);
    }



    public static void main(String[] args) {

        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());

    }





}
