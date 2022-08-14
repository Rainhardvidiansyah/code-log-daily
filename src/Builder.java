import java.util.Scanner;

public class Builder {

    private String name;

    private String email;

    private String password;

    public Builder(){};

    public Builder(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }


    public static Builder builder(Users users){
        return new Builder(users.getName(), users.getEmail(), users.getPassword());
    }


    @Override
    public String toString() {
        return "Builder{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }



    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        Users user = new Users("Money", "money@gmail.com", "money");
        System.out.println(Builder.builder(user));
        System.out.println("Input: ");
        System.out.println("name: ");
        String name = s.nextLine();
        System.out.println("email: ");
        String email = s.nextLine();
        System.out.println("password: ");
        String password = s.nextLine();
        Users users = new Users(name, email, password);
        System.out.println("Data: " + builder(users));



    }


//    class Instance{
//
//        public void instantiation(){
//            User user = new User();
//            user.setName("Home sweet home");
//            user.setEmail("home@gmail.com");
//            user.setPassword("thisishome");
//            new Builder();
//            builder(user);
//        }
//
//        public Builder builder2(){
//            User user = new User();
//            user.setName("Home sweet home");
//            user.setEmail("home@gmail.com");
//            user.setPassword("thisishome");
//            return Builder.builder(user);
//        }

}
