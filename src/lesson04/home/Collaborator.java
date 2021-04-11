package lesson04.home;

public class Collaborator {
    private static final int CURRENT_YEAR = 2021;

    private String surname;
    private String secondName;
    private String name;
    private String position;
    private String phone;
    private float salary;
    private int birthYear;

    private static int id = 0;

    Collaborator(String name,
             String secondName,
             String surname,
             String position,
             String phone,
             float salary,
             int birthYear) {
        this.birthYear = birthYear;
        this.name = name;
        this.surname = surname;
        this.secondName = secondName;
        this.position = position;
        this.phone = phone;
        this.salary = salary;
    }

    int getAge() {
        return CURRENT_YEAR - birthYear;
    }

    int getSalary() {
        return (int) salary;
    }

    void setSalary(float difference) {
        this.salary = this.salary + difference;
    }

    void setSalary(int salary) {
        this.salary = salary;
    }

    String getSecondName() {
        return secondName;
    }

    String getName() {
        return name;
    }

    String getSurname() {
        return surname;
    }

    String getPosition() {
        return position;
    }

    String getPhone() { return phone; }

    String getFullInfo() {
        return this.name + " " +
                this.secondName + " " +
                this.surname + ", " +
                this.getAge() + " years old, " +
                this.position + ". Phone number: " +
                this.phone + ". Salary is " +
                this.getSalary() + " RU";
    }
}
