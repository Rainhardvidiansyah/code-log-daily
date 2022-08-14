public class DynamicalPolymorph {

    public String printString(){
        System.out.println("FIRST PRINT");
        return "";
    }


    public String printString2(){
        System.out.println("SECOND PRINT");
        return "";
    }

    static class ExtensionFromDynamical extends DynamicalPolymorph{

        String first;
        String second;

        public ExtensionFromDynamical(String first, String second) {
            this.first = first;
            this.second = second;
        }

        public ExtensionFromDynamical(String first){
            this.first = first;
        }

        public ExtensionFromDynamical() {

        }

        @Override
        public String printString() {
            return this.first;
        }

        @Override
        public String printString2() {
            return this.second;
        }
    }

    public static void main(String[] args) {
//        DynamicalPolymorph d = new DynamicalPolymorph();
//        System.out.println(d.printString());
//        System.out.println(d.printString2());
//        ExtensionFromDynamical fromDynamical = new ExtensionFromDynamical("First", "Second");
//        System.out.println(fromDynamical.printString());
//        System.out.println(fromDynamical.printString2());


        System.out.println("======");
        DynamicalPolymorph dynamicalPoly = new DynamicalPolymorph();
        DynamicalPolymorph dynamic = new ExtensionFromDynamical("abc");

        System.out.println(dynamicalPoly.printString());
        System.out.println(dynamic.printString());
        System.out.println(dynamic.printString());

    }
}
