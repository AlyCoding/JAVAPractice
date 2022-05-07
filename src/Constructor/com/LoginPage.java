package Constructor.com;

public class LoginPage {

    String username;
    String password;
    String signIn;
    public LoginPage(String username, String password, String signIn){

        this.username = username;
        this.password = password;
        this.signIn = signIn;
    }


    public void EnterUser(){

        System.out.println(this.username);

    }

    public void EnterPassword(){

        System.out.println(this.password);
    }

    public void ClickSignIn(){

        System.out.println(this.signIn);
    }

    public void Login(){
        EnterUser();
        EnterPassword();
        ClickSignIn();
    }
}
