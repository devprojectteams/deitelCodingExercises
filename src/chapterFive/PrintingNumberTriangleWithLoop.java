package chapterFive;

public class PrintingNumberTriangleWithLoop {
    public static void main(String[] args) {


        for (int rh = 1; rh <= 6; rh++){
            for (int i = 1; i <= rh; i++) {
                System.out.print(i);
            }
            System.out.println();

    }
        System.out.println();


        for (int lh = 6; lh >= 1; lh--){

            for (int i = 1; i <= lh; i++) {
                System.out.print(i);
            }
            System.out.println();
        }
        int blank = 5;
            for(int inverseRh=1; inverseRh <=6; inverseRh++) {
                for (int space = 0; space <= blank; space++) {
                    System.out.print(" ");
                }
                for (int i = 1; i <= inverseRh; i++) {
                    System.out.print(i);
                }
                System.out.println();
                blank--;
            }
        System.out.println();

            blank =1;
                for (int inverseLh=6; inverseLh>=1; inverseLh--){
                    for (int space=0; space <= blank; space++) {
                        System.out.print(" ");
                    }
                    for (int i = 1; i <= inverseLh; i++){
                        System.out.print(i);
                }
                    System.out.println();
                    blank++;
                }
    }
}



















