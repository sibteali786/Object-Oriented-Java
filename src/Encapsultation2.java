class Person2{
    private String SSN;
    private String name;

    public String getSSN() {
        return SSN;
    }

    private int age;

    public void setName(String name){
        if(SSN == null){
            throw new Error("SSN is not set");
        }else{
            this.name = name;
        }

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

class demoEncapsulation{
    public static void main(String[] args) {
        Person2 p = new Person2();
        p.setName("Sibteali");
        p.setAge(23);
        System.out.println(p.getAge());
        System.out.println(p.getName());
    }
}