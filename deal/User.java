package deal;

/**
 * Created by Василий on 16.02.2018.
 */
public class User {

    private String name;
    private String email;
    private Integer id;
    private String user_role;


    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Integer getId() {
        return id;
    }

    public String getUser_role() {
        return user_role;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUser_role(String user_role) {
        this.user_role = user_role;
    }

    public User() {
    }

    public User(String name, String email, int id, String user_role) {
        super();
        this.name = name;
        this.email = email;
        this.id = id;
        this.user_role = user_role;
    }


}
