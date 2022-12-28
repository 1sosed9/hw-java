package com;

import java.util.Arrays;

public class Group {

    private String groupName;
    private Student[] studens = new Student[10];

    public Group(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Student[] getStudens() {
        return studens;
    }
    
    public void setStudens(Student[] studens) {
        this.studens = studens;
    }

    @Override
    public String toString() {
        return "Group [groupName=" + groupName + ", studens=" + Arrays.toString(studens) + "]";
    }

    public void addStudent(Student student) throws GroupOverflowException {

        for (int i = 0; i < this.studens.length; i++) {
            if (this.studens[i] == null) {
                this.studens[i] = student;
                this.studens[i].setGroupName(this.groupName);
                break;
            } 
        }
        throw new GroupOverflowException();
    }
    
    public Student searchStudentByLastName(String lastName) throws StudentNotFoundException {
        
        for (int i = 0; i < this.studens.length; i++) {
            if (this.studens[i].getLastName().equals(lastName)) {
                return studens[i]; 
            } 
        }
        throw new StudentNotFoundException();
    }

    public boolean removeStudentByID(int id) {

        for (int i = 0; i < this.studens.length; i++) {
            if (this.studens[i].getId() == id) {
                this.studens[i] = null;
                return true;
            }
        }
        return false;
    }
}
