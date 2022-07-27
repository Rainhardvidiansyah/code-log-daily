public class MakeAMathFunction {

    public int Mod(int a, int b){
        return a % b;
    }

    public void mod(int a, int b){
        System.out.println(a % b);
    }

    public static void main(String[] args) {

        MakeAMathFunction m = new MakeAMathFunction();

        int mod = m.Mod(3, 2);
        System.out.println(mod);

        m.mod(23, 9);
    }
}
