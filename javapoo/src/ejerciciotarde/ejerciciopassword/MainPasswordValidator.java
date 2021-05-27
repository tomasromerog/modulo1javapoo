package ejerciciotarde.ejerciciopassword;

public class MainPasswordValidator {
    public static void main(String[] args) {

        PasswordValidator validator = PasswordValidator.builValidator(false,false,false,10,20);
        String tomPass = "Tomasrom1234.";
        boolean val = PasswordValidator.setPassword(tomPass);
        System.out.println(val);
    }
}
