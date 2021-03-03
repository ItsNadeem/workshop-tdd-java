package workshop;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import workshop.login.nEmptyPasswordThrowable;
import workshop.login.nInvalidCredentialThrowable;
import workshop.login.nLoginManager;

import java.util.HashMap;

public class nLoginManagerTest {
    private nLoginManager loginManager;

    // valid username + valid pw => valid login return true
    // valid username + invalid pw => throw invalid credential exception
    // username + empty pw =>  throw invalid password exception


    @Before
    public void setUp() {
        // Arrange
        HashMap<String, String> userDb = new HashMap<String, String>();
        userDb.put("Blah", "test555");
        this.loginManager = new nLoginManager(userDb);
    }


    @Test
    public void testLoginMethod_CredentialAreValid_ShouldReturnTrue() throws nInvalidCredentialThrowable, nEmptyPasswordThrowable {
        // Arrange
        String username = "Blah";
        String password = "test555";

        // Act
        boolean success =  loginManager.login(username, password);

        // Assert
        Assert.assertTrue(success);
    }
    // Assert
    @Test(expected = nInvalidCredentialThrowable.class)
    public void testLoginMethod_CredentialsAreInvalid_ShouldThrowInvalidCredentialThrowable() throws nInvalidCredentialThrowable, nEmptyPasswordThrowable {
        // Arrange
        String username = "Blah";
        String password = "test55";

        // Act
        loginManager.login(username, password);
    }

    // Assert
    @Test(expected = nEmptyPasswordThrowable.class)
    public void testLoginMethod_EmptyPassword_ShouldThrowEmptyPasswordThrowable() throws nInvalidCredentialThrowable, nEmptyPasswordThrowable {
        // Arrange
        String username = "Blah";
        String password = "";

        // Act
        loginManager.login(username, password);
    }




}
