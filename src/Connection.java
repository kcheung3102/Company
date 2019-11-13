public class Connection {

    private long id;
    private long companyID;
    private long peopleID;
    private int yearJoined;
    private String role;

    public Connection(){};

    public Connection(long id, long companyID, long peopleID, int yearJoined, String role) {
        this.id = id;
        this.companyID = companyID;
        this.peopleID = peopleID;
        this.yearJoined = yearJoined;
        this.role = role;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCompanyID() {
        return companyID;
    }

    public void setCompanyID(long companyID) {
        this.companyID = companyID;
    }

    public long getPeopleID() {
        return peopleID;
    }

    public void setPeopleID(long peopleID) {
        this.peopleID = peopleID;
    }

    public int getYearJoined() {
        return yearJoined;
    }

    public void setYearJoined(int yearJoined) {
        this.yearJoined = yearJoined;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
