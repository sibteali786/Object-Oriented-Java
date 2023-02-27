class VariableArguments {
    public int sum(int... numbers){
        int total = 0;
        for(int n:numbers){
            total += n;
        }
        return total;
    }
}
class DemoOverloadingVarargs {
    public static void main(String[] args) {
        VariableArguments va = new VariableArguments();

        System.out.println(va.sum(1, 2, 3));        // Output: 6
        System.out.println(va.sum(4, 5));           // Output: 9
        System.out.println(va.sum(6, 7, 8, 9));     // Output: 30
        System.out.println(va.sum(10));             // Output: 10
        System.out.println(va.sum());               // Output: 0
    }
}