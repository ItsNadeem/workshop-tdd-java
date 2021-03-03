package workshop;

import java.util.HashMap;

public class nLoginManager {

    private final HashMap<String, String> userRepo;

    nLoginManager(HashMap<String, String> userDb){
        this.userRepo = userDb;
    }

    public  boolean login(String username, String password) throws nEmptyPasswordThrowable, nInvalidCredentialThrowable {
        if (userRepo.containsKey(username) && userRepo.get(username).equals(password)) {
            return true;
        };

        if (password.isEmpty()) {
            throw new nEmptyPasswordThrowable();
        }




        if (!userRepo.get(username).equals(password)) {
            throw new nInvalidCredentialThrowable();
        }

        return false;
    }
}
