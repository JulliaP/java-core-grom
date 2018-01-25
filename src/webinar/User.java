package webinar;

public class User {

    private String sessionId;
    // kogda zahodish na ljuboj sajt, sozdaetsja novaja http-sessija mezdu moim browser i serverom togo sajta kuda
    // zashli, ona sazdaetsja vsegda,
    // i potom moj browser i server ispolzujut etu sessiju dla obshenija mezhdu soboj

    private String ipAddress;
    private UserType userType;

    public User(String sessionId, String ipAddress) {
        this.sessionId = sessionId;
        this.ipAddress = ipAddress;
        this.userType = UserType.USER;
    }

    public String getSessionId() {
        return sessionId;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public UserType getUserType() {
        return userType;
    }

}
