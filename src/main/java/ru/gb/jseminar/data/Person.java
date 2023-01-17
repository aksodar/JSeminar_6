package ru.gb.jseminar.data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Person {
    String firstName;
    String middleName;
    String lastName;
    String sex;
    String motherName;
    String fatherName;
    String birthDate;

    /**
     * @param firstName Имя
     * @param middleName Отчество
     * @param lastName Фамилия
     * @param sex Пол
     * @param motherName Имя матери
     * @param fatherName Имя отца
     * @param birthDate Дата рождения
     */


    public Person(){
        this.firstName = null;
        this.middleName = null;
        this.lastName = null;
        this.sex = null;
        this.motherName = null;
        this.fatherName = null;
        this.birthDate = null;
    }
    
    public Person(String firstName, String middleName, String lastName, String sex, String motherName, String fatherName, String birthDate){
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.motherName = motherName;
        this.fatherName = fatherName;
        this.birthDate = birthDate;
    }

    public Map<Integer, List<String>> addPerson(Map<Integer,List<String>> mapIn){
        var mapOut = new HashMap<Integer, List<String>>();

        return mapOut;
    }

    @Override
    public String toString(){
        String r = "ФИО: " + this.firstName + " " + this.middleName + " " + this.lastName + "/n" + "Дата рождения: " + this.birthDate;
        return r;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
