public class Matrix {
    public static void main(String[] args){
        //çarpmayı düzelt!!
        System.out.println("----------------------");
        System.out.println("Matrix1");
        System.out.println("----------------------");
        int[][] Matrix1 = new int[4][4];
        for (int a = 0; a < 4; a++) {
            for (int b = 0; b < 4; b++) {
                Matrix1[a][b] = (int) ((Math.random()*30)+1);
                System.out.print(Matrix1[a][b] + " ");

            }
            System.out.println();

        }
        int[][] TMatrix1 = new int[4][4];
        for(int a = 0 ; a < 4 ; a++) {
            for (int b = 0; b < 4; b++) {
                TMatrix1[a][b] = Matrix1[b][a];
            }
        }
        System.out.println("----------------------");
        System.out.println("Transpose of Matrix1");
        System.out.println("----------------------");
        for(int a = 0 ; a < 4 ; a++) {
            for (int b = 0 ; b < 4 ; b++) {
                System.out.print(TMatrix1[a][b] + " ");
            }
            System.out.println();
        }
        System.out.println("----------------------");
        System.out.println("Matrix2");
        System.out.println("----------------------");
        int[][] Matrix2 = new int[4][4];
        for (int a = 0; a < 4; a++) {
            for (int b = 0; b < 4; b++) {
                Matrix2[a][b] = (int) ((Math.random()*30)+1);
                System.out.print(Matrix2[a][b] + " ");
            }

            System.out.println();
        }
        int[][] TMatrix2 = new int[4][4];
        for(int a = 0 ; a < 4 ; a++) {
            for (int b = 0; b < 4; b++) {
                TMatrix2[a][b] = Matrix2[b][a];
            }
        }
        System.out.println("----------------------");
        System.out.println("Transpose of Matrix2");
        System.out.println("----------------------");
        for(int a = 0 ; a < 4 ; a++) {
            for (int b = 0; b < 4; b++) {
                System.out.print(TMatrix2[a][b] + " ");
            }
            System.out.println();
        }
        System.out.println("----------------------");
        System.out.println("Addition of Matrix1 and Matrix2");
        System.out.println("----------------------");
        int[][] Matrixadd =new int[4][4];
        for (int d = 0 ; d < 4 ; d++){
            for (int e = 0 ; e < 4 ; e++){
                Matrixadd [d] [e] =Matrix1 [d] [e] + Matrix2 [d] [e];
                System.out.print(Matrixadd [d] [e] +" ");
            }
            System.out.println();
        }
        System.out.println("----------------------");
        System.out.println("Subtraction of Matrix1 and Matrix2");
        System.out.println("----------------------");
        int[][] Matrixsub =new int[4][4];
        for (int f = 0 ; f < 4 ; f++) {
            for (int g = 0; g < 4; g++) {
                Matrixsub[f][g] = Matrix1[f][g] - Matrix2[f][g];
                System.out.print(Matrixsub[f][g] + " ");
            }
            System.out.println();
        }
        int[][] Matrixmul = new int[4][4];
        for(int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    Matrixmul[i][j] += Matrix1[i][k] * Matrix2[k][j];
                }
            }
        }

        System.out.println("----------------------");
        System.out.println("Multiplication of Matrix1 and Matrix2");
        System.out.println("----------------------");
        for(int[] Sıra : Matrixmul) {
            for (int kolon : Sıra) {
                System.out.print(kolon + "    ");
            }
            System.out.println();





    }
}
}