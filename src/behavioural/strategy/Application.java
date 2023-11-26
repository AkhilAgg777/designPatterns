package behavioural.strategy;

public class Application {

    public static void main(String[] args){
        UserService userService=new UserService(new SimpleEncodePasswordBehaviour());
    }
}
