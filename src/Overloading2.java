import java.lang.reflect.Type;

class TypeConverter{
    public String convert(int a){
        return Integer.toString(a);
    }
    public int convert(String a){
        return Integer.parseInt(a);
    }
}

class DemoOverloading2{
    public static void main(String[] args) {
        TypeConverter tc = new TypeConverter();
        System.out.println(tc.convert(2));
        System.out.println(tc.convert("12"));
    }
}