package by.teachmeskills.novik.lesson11.homework.second;


public class LoginPassword {

    public static void Enter(String login, String password, String comfirmPassword) {
        try {
            testLogin(login);
        } catch (WrongLoginException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        try {
            testPassword(password, comfirmPassword);
        } catch (WrongPasswordException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    private static boolean testLogin(String str) throws WrongLoginException {
        if (str.length() >= 20) throw new WrongLoginException();
        if (str.contains(" ")) throw new WrongLoginException();
        return false;
    }

    private static boolean testLogin() {
        return false;
    }

    private static boolean testPassword(String password, String comfirmPassword) throws WrongPasswordException {
        if (password.length() >= 20) throw new WrongPasswordException();
        if (password.contains(" ")) throw new WrongPasswordException();
        char[] symbols = password.toCharArray();
        int sum = 0;
        for (char symbol : symbols) {
            if (Character.isDigit(symbol)) sum++;
        }
        if (sum == 0) throw new WrongPasswordException();
        if (!password.equals(comfirmPassword)) throw new WrongPasswordException();
        return false;
    }

    private static boolean testPassword() {
        return false;
    }
}
