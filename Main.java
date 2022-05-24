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
        Student<Boolean> studentStatus = new Student<String>();
        Student<Character> studentGrade = new Student<String>();
    
        studentAge.add(new Integer(21));
        studentName.add(new String("David Beckham"));
        studentStatus.add(new Boolean(true));
        studentGrade.add(new Character('A'));
        
        System.out.printf("Student Name    : %s\n\n", studentName.get());
        System.out.printf("Student Age     : %d\n", studentAge.get());
        System.out.printf("Student Status  : %s\n\n", studentStatus.get());
        System.out.printf("Student Grade   : %c\n", studentGrade.get());
    }
}
