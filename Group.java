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
        int num = 0;
        for (int i = 0; i < this.studens.length; i++) {
            if (this.studens[i] == null) {
                this.studens[i] = student;
                this.studens[i].setGroupName(this.groupName);
                num += 1;
                break;
            } 
        }
        if (num == 0) {
            throw new GroupOverflowException();
        }
    }
    
    public Student searchStudentByLastName(String lastName) throws StudentNotFoundException {
        
        int num = 0;
        for (int i = 0; i < this.studens.length; i++) {
            if (this.studens[i].getLastName().equals(lastName)) {
                return studens[i]; 
            } else {
               num += 1;
            }
        }
        if (num == this.studens.length) {
            throw new StudentNotFoundException();
        }
        return null;
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
