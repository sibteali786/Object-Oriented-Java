class Person{
    private String name;
    private int age;

    public void setName(String name){
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class demoEncapsulation1{
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Sibteali");
        p.setAge(23);
        System.out.println(p.getAge());
        System.out.println(p.getName());
    }
}