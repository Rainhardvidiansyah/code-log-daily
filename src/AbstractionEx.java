import java.util.*;

abstract class User{
    public abstract void writeName(String s);
}

class UserRoom{

    Scanner s = new Scanner(System.in);

    public void chooseUserRoom(){
        System.out.println("Choose your room");
        String strings;
        String[] arrString = new String[]{"1", "10", "90", "7", "44"};
          for (String value : arrString) {
              strings = s.nextLine();
            if (value.equals(strings)) {
                System.out.println("Cannot choose this room");
            } else {
                System.out.println("Good, you got your new Room");
            }
            break;
        }


//        for (int i = 0; i < arrString.length; i++){
//        strings = s.nextLine();
//            if(arrString[i].equals(strings)){
//                System.out.println("Cannot choose this room");
//            }else {
//                System.out.println("Good, you got your new Room");
//            }
//            break;
//        }
    }
}

abstract class Room{
    public abstract String chooseRome(int roomNumbers);
}
public class AbstractionEx extends Users {


//    @Override
//    public void writeName(String s) {
//        String a = s.substring(0, s.length() - 1);
//        System.out.println(a);
//    }


    //main method is starting here
    public static void main(String[] args) {

//        AbstractionEx a = new AbstractionEx();
//        a.writeName("Rainhard");

        UserRoom userRoom = new UserRoom();
        userRoom.chooseUserRoom();


    } //main method closing colon





}
