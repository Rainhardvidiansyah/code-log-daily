public class Singleton {

    private static Singleton singleton;

    public static Singleton getSingleton(){
        if(singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }

    private Singleton(){}

    @Override
    public String toString() {
        return "Singleton{}";
    }

    public static void main(String[] args) {

        var s = Singleton.getSingleton();
        System.out.println(s);

        var s2 = Singleton.getSingleton();
        System.out.println(s2);

        boolean testSameness = s.equals(s2);
        System.out.println(testSameness); //TRUE

        var s3 = new Singleton();
        testSameness = s.equals(s3);
        System.out.println(testSameness); //FALSE

        Singleton singleton1 = Singleton.getSingleton();
        Singleton singleton2 = Singleton.getSingleton();
        boolean isSame = singleton1.equals(singleton2);
        System.out.println("Result of is same variable :>> " +isSame);


    }
}
