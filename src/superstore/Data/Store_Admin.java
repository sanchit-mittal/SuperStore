/*
 * Name    : - PORVIL
 * Roll No : - 2017304
 */
package superstore.Data;

import java.io.Serializable;

/**
 *
 * @author PD
 */
public class Store_Admin implements Serializable{
    
    private String loginid;
    private String password;

    public String getLoginid() {
        return loginid;
    }

    public String getPassword() {
        return password;
    }
    
}
