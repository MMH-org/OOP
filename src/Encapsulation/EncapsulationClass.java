package src.Encapsulation;

class EncapsulationClass {
    // Encapsulating the name and age
    // only approachable and used
    // methods defined
    private String name;
    private int age;
    // encapsulation does not get and set data directly
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
