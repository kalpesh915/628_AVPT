public class pro11 {
    public static void main(String[] args) {
        int ip[][] = {
            {11, 22}, 
            {44, 55, 66, 45}, 
            {77, 88, 99, 111, 234}
        };
        
        
        for(int x[] : ip){
            for(int tmp : x){
                System.out.print(" "+tmp);
            }
            System.out.println("");
        }
    }
}
