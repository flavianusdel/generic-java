public class Student<T> {
    private T student;

    public void add(T student) {
        this.student = student;
    }

    public T get() {
        return student;
    }

    public static void main(String[] args) {
        Student<Integer> studentAge = new Student<Integer>();
        Student<String> studentName = new Student<String>();
        Student<Boolean> studentStatus = new Student<Boolean>();
        Student<Character> studentGrade = new Student<Character>();
    
        studentAge.add(21);
        studentName.add("David Beckham");
        studentStatus.add(true);
        studentGrade.add('A');
        
        System.out.printf("Student Name    : %s\n", studentName.get());
        System.out.printf("Student Age     : %d\n", studentAge.get());
        System.out.printf("Student Status  : %s\n", studentStatus.get());
        System.out.printf("Student Grade   : %c\n", studentGrade.get());
    }
}
