package behavioural.strategy;

public class UserService {
    EncodePasswordBehaviour encodePasswordBehaviour;

    UserService(EncodePasswordBehaviour encodePasswordBehaviour){
    this.encodePasswordBehaviour=encodePasswordBehaviour;
    }
    void registerUser(String email,String password,String username){

    String encodedPassword=encodePasswordBehaviour.encode(password);
    }
}
