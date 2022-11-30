public class StringBuilderSb {
    public static void main(String[] args) {
        String first = "Test";
        StringBuilder sb = new StringBuilder(first);
        firstString(sb);
        System.out.println(sb);

        StringBuilder stringBuilder = new StringBuilder("third");
        thirdString(stringBuilder);
        System.out.println(stringBuilder);


        String handsome = "handsome";
        regularConcat(handsome);
        System.out.println(handsome);

        StringBuilder handsomeBuilder = new StringBuilder("Rainhard");
        fourthString(handsomeBuilder);
        System.out.println(handsomeBuilder);

    }

    static void firstString(StringBuilder s){
        s.append(" First");
    }

    static void secondString(StringBuilder s){
        s.trimToSize();
    }

    static void thirdString(StringBuilder s){
        s.append(" Third");
    }

    static void regularConcat(String s){ //no change, it's totally different if we use String builder. Take a look at the below method!!!
        s = s + " handsome";
    }

    static void fourthString(StringBuilder s){ //I believe this thing looks like pointer in GO.
        s.append(" is handsome");
    }
}
