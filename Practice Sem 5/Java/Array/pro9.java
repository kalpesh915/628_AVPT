class Demo1{
    public int[] getMarks(){
        int marks[] = {11, 22, 33, 44, 55};
        return marks;
    }
}

public class pro9 {
    public static void main(String[] args) {
        Demo1 d1 = new Demo1();
        
        int data[] = d1.getMarks();
        
        for(int tmp : data){
            System.out.print(" "+tmp);
        }
    }
}
