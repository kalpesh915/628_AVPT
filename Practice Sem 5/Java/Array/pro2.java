public class pro2 {
    public static void main(String[] args) {
        int ip1[] = new int[5];
        
        ip1[0] = 111;
        ip1[1] = 113;
        ip1[2] = 121;
        ip1[3] = 151;
        ip1[4] = 116;
        
        /*for(int i = 0; i<ip1.length; i++){
            System.out.print(" "+ip1[i]);
        }*/
        
        for(int x : ip1){
            System.out.println(""+x);
        }
    }
}
