
class demo {
    public void printer(String students[]) {
        // students[] is known as parameters
        for (String tmp : students) {
            System.out.println("Welcome " + tmp);
        }
    }
}

public class pro8 {
// pass array as method parameter
    public static void main(String[] args) {
       /// String students[] = {"Meet", "Harmeet", "Harsh", "Tirth"};
        demo d = new demo();
        //d.printer(students); /// students[] is arguments
        d.printer(new String[]{"Meet", "Tirth", "Harmeet", "Harsh"});
    }
}
