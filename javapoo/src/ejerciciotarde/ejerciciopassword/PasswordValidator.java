package ejerciciotarde.ejerciciopassword;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {

    private static PasswordValidator INSTANCE = new PasswordValidator();
    private static String pattern = null;
    private String password;

    private PasswordValidator(){

    }

    public static PasswordValidator builValidator(boolean forceSpecialChar,
                                                  boolean forceCapitalLetter,
                                                  boolean forceNumber,
                                                  int minLength,
                                                  int maxLength)
    {
        StringBuilder patternBuilder = new StringBuilder("((?=.*[a-z])");

        if(forceSpecialChar){
            patternBuilder.append("(?=.*[@#$%])");
        }
        if (forceCapitalLetter){
            patternBuilder.append("(?=.*[A-Z])");
        }
        if(forceNumber) {
            patternBuilder.append("(?=.*d)");
        }
        patternBuilder.append(".{" + minLength + "," + maxLength + "})");
        pattern = patternBuilder.toString();

        return INSTANCE;
    }

    public static boolean setPassword(String password){
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(password);
        return m.matches();
    }

}
