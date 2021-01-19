package face_main.vo;

public class User {

    private String username = "a";
    private String password = "b";

    public User(String username,String password){
        this.username=username;
        this.password=password;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
