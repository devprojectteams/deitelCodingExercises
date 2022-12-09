package chapterFive;

public class pythagorasTriple2 {

    public static  void main(String[] args){
        for (int sideA =1; sideA <= 500; sideA++) {
            for (int sideB =1; sideB <= 500; sideB++){
                a:  for (int sideC =1; sideC <= 500; sideC++){
                    if ((sideA*sideA + sideB*sideB) == sideC*sideC) {
                        System.out.println(sideA + " " + sideB + " " + sideC);
                        break a;
                    }

                }
            }


        }


    }


}
