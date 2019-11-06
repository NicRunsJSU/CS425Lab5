
package edu.jsu.mcis;

public class BeanClass {
    
    
    private String firstName;
    private String lastName;
    private String displayName;
    private int SessionID;
    private int regNumber;
    
    

    public BeanClass() {
        displayName = firstName + "" + lastName;
        SessionID = -1;
        regNumber = 0;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public int getSessionID() {
        return SessionID;
    }

    public int getRegNumber() {
        return regNumber;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSessionID(int SessionID) {
        this.SessionID = SessionID;
    }

    
}
