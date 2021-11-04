/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyClasses;

/**
 *
 * @author xxx
 */
public class Author {
    
    private int id;
    private String name;
    private String surname;
    private String fieldOfExpertise;
    private String about;
    
    public Author(int id, String name,String surname,String fieldOfExpertise, String about){
    
        this.id=id;
        this.name=name;
        this.surname=surname;
        this.fieldOfExpertise=fieldOfExpertise;
        this.about=about;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFieldOfExpertise() {
        return fieldOfExpertise;
    }

    public void setFieldOfExpertise(String fieldOfExpertise) {
        this.fieldOfExpertise = fieldOfExpertise;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }
    
}
