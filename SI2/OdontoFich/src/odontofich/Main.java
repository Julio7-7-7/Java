package odontofich;

import Interfaces.FLogin;

public class Main {
    public static void main(String[] args) {
    try {
        FLogin formlogin = new FLogin();
        formlogin.setVisible(true);
    } catch (Exception e) {
        e.printStackTrace();
    }
    
}

}


