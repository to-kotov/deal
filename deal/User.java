package deal;
import deal.Deal_by.*;

//import static deal.Deal_by.inputText;
//import static deal.Deal_by.users;
import static deal.Deal_by.*;


/**
 * Created by Василий on 16.02.2018.
 */
public class User {

    private String name;
    private String email;
    private Integer id;
    private String user_role;
    /*
    public static void in_user() {
        String name = inputText("Name");
        String email = inputText("email");
        int id = Integer.valueOf(inputText("id"));
        String user_role = inputText("user_role");
        users.put(users.size()+1, new User(name, email, id, user_role));
        flag1 = true;
    }
*/
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
