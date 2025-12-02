package model;

public class Admin {

    private int id;
    private String username;
    private String password;
    private String ques;   // security question
    private String ans;    // security answer

    public Admin(int id, String username, String password, String ques, String ans) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.ques = ques;
        this.ans = ans;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getQues() {
        return ques;   // maps to s_ques
    }

    public String getAns() {
        return ans;    // maps to ans
    }
}
