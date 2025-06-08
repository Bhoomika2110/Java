public class StudentToString {
    String name;
    int age;
    String rollnumber;
    String house;

    public StudentToString(String name, int age, String rollnumber, String house) {
        this.name = name;
        this.age = age;
        this.rollnumber = rollnumber;
        this.house = house;
    }

     @Override
    public String toString() {
        return "Student Detail: {name=" + name +
                ", age=" + age +
                ", rollnumber=" + rollnumber +
                ", house=" + house +
                "}";
    }

    public static void main(String[] args) {
        StudentToString stu = new StudentToString("Prasant", 12, "001", "Shivani");
        System.out.println(stu);
    }
}
