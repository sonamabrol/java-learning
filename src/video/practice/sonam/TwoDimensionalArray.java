package video.practice.sonam;

public class TwoDimensionalArray {

    public static void main(String[] args) {
        //4 rows 3 arrays

        int[][] twoDime = new int[4][3];
        // to assign manually
        //twoDime[2][1] = 20;

        // to assign automatically by two for loops

        int temp = 10;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                twoDime[i][j] = temp;
                temp += 10;
                   System.out.print(twoDime[i][j]+" ");
                    //this above statement will print everything together
            }System.out.println(" ");






            }

        }
    }

