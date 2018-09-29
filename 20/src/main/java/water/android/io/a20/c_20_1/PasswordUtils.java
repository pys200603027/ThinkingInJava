package water.android.io.a20.c_20_1;

import java.util.List;

public class PasswordUtils {

    @UseCase(id = 47, description = "Password must contain at least one numeric")
    public boolean validatePassword(String password) {
        return (password.matches("\\w*\\d\\w*"));
    }

    @UseCase(id = 48)
    public String encryPassword(String password) {
        return new StringBuffer(password).reverse().toString();
    }

    @UseCase(id = 49)
    public boolean checkForNewPassword(List<String> prevPassword, String password) {
        return !prevPassword.contains(password);
    }
}
