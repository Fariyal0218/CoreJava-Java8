package controlflowstatement;

public class ForLoopEx3 {
    public static void main(String[] args) {
        int i,j;
        for (i=1;i<=4;i++){
            for(j=i;j<=4;j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
