package problem3.Student;

public class Student {

    private String name;

    private int rollNo;

    public Student(String s, int r) {

        name = s;

        rollNo = r;

    }

    public String getName() {

        return name;

    }

    public void setName(String name) {

        this.name = name;

    }

    public int getRollNo() {

        return rollNo;

    }

    public void setRollNo(int rollNo) {

        this.rollNo = rollNo;

    }

}
