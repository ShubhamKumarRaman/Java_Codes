package com.studentapp.entity;
import jakarta.persistence.*;

@Entity //This tells Hibernate that this class is a database table
@Table(name="students") //Sets table name
public class Student {

    @Id //Mark this field as primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Auto increment
    @Column(name = "student_id")
    private int id;

    @Column(name = "first_name", nullable = false) //Cannot be null
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "email", unique = true, nullable = false)//Email must be unique
    private String email;

    @Column(name = "course")
    private String course;

    //Default constructor is required in Hibernate
    public Student(){

    }

    public Student(String firstName, String lastName, String email, String course){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.course = course;
    }

    //Getter and Setter methods

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getCourse(){
        return course;
    }

    public void setCourse(String course){
        this.course = course;
    }

    @Override
    public String toString(){
        return "Student [id="+id+", name="+firstName+" "+lastName+", email="+email+", course="+course+"]";
    }
}
