
/**
 * Write a description of class Customer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.*;
import java.text.*;
import java.util.regex.*;

public class Customer
{
    // instance variables - replace the example below with your own
    private String name;
    private String email;
    private String username;
    private String password;
    private int id;
    private Calendar birthDate;
    private SimpleDateFormat date = new SimpleDateFormat ("dd MMM yyy");


    /**
     * Constructor for objects of class Customer
     */
    public Customer(String name, String email, String username, 
    String password, int id, Calendar birthDate)
    {
        // initialise instance variables
        this.name = name;
        this.email = email;
        this.username = username;
        this.password = password;
        this.id = id;
        this.birthDate = birthDate;
    }
    
    public Customer(String name, String email, String username,
    String password, int id, int year, int month, int dayOfMonth)
    {
        this.name = name;
        this.email = email;
        this.username = username;
        this.password = password;
        this.id = id;
        this.birthDate = new GregorianCalendar(year, (month-1), 
        dayOfMonth);
    }
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String getName()
    {
        // put your code here
        return name;
    }
    
    public String getEmail()
    {
        // put your code here
        return email;
    }
    
    public String getUsername()
    {
        // put your code here
        return username;
    }
    
    public String getPassword()
    {
        return password;
    }
    
    public int getId()
    {
        return id;
    }
    
    public Calendar getBirthDate()
    {
        
        date.format(birthDate.getTime());
        return birthDate;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setEmail(String email)
    {
        if(Pattern.matches("^[a-zA-Z0-9_+&*-]+(?:\\."+ 
                            "[a-zA-Z0-9_+&*-]+)*@" + 
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
                            "A-Z]{2,7}$", email))
        {
            this.email = email;
        }
        else
        {
            this.email = "";
        }
    }
    
    public void setUsername(String username)
    {
        this.username = username;
    }
    
    public void setPassword(String password)
    {
        if(Pattern.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{6,}$",
        password))
        {
            this.password = password;
        }
        else
        {
            this.password = "";
        }
    }
    
    public void setId(int id)
    {
        this.id = id;
    }
    
    public void setBirthdate(Calendar birthdDate)
    {
        this.birthDate = birthDate;
    }
    
    public void setBirthdate(int year, int month, int dayOfMonth)
    {
        birthDate = new GregorianCalendar(year, (month-1), 
        dayOfMonth);
    }
    
    public String toString()
    {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        System.out.println("ID: " + id);
        System.out.println("Birthdate: " + birthDate);
        return "";
    }
}
