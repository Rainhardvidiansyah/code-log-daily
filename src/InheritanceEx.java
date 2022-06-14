class Parent {
    protected int age;
    public void printAge() {
        System.out.println(age + " is secret");
    }
}

class Person{
    public void printBehaviour(){
        System.out.println("A person is walking");
    }
}


class Robert extends Person{
    public void printBehaviour(){
        System.out.println("Robbert is walking");
    }
}

class Robby extends Person{
    public void printBehaviour(){
        System.out.println("Robby is walking");
    }
}

    public class InheritanceEx extends Parent {
        private String name = "Name";


        public static void main(String[] args) {

//            InheritanceEx sti = new InheritanceEx();
//            sti.printAge();
//            System.out.println(sti.name  + " " + sti.age);
            Person p = new Person();
            p.printBehaviour();
            Person person = new Robert();
            person.printBehaviour();
            Person robby = new Robby();
            robby.printBehaviour();





        }
}
