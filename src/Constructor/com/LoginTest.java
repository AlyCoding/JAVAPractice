package Constructor.com;

public class LoginTest {

    public static void main(String[] args) {

        LoginPage login = new LoginPage("Admin", "admin123", "SignIn Button");
        login.Login();
    }// class can be only default or public
}
