public class Builder {

    private String name;

    private String email;

    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //    public static Builder build(String name, String email, String password){
//        Builder builder = new Builder();
//        builder.name = name;
//        builder.email = email;
//        builder.password = password;
//        return builder;
//    }
//
    public static Builder builder(Users user){
        Builder builder = new Builder();
        builder.name = user.getName();
        builder.email = user.getEmail();
        builder.password = user.getPassword();
        return builder;
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
//        System.out.println(new Builder()
//                .build("new name", "email@gmail.com", "password"));
//
//        new Builder();
//        System.out.println(build("Hoki", "hoki234", "acatalwaysplays"));
//
//        Builder builder = new Builder();
        Users user = new Users("Money", "money@gmail.com", "money");
//        System.out.println(builder.builder(user));
//        System.out.println(user
//                .getEmail());

        new Builder().builder(user);
        System.out.println(builder(user));
        System.out.println(builder(new Users("", "", "")));



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
