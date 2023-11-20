public class Player {
    String name;
    String nationality;
    Short age;
    String club;
    String position;

    void info(){
        System.out.println(name + " has " + age + " years old, and he is " + nationality + " playing for " + club + " as a " + position);
    }
}
