import java.util.*;
public class MatrixOperations {
    public int[][] randomMatrix(int r,int c){ int[][] a=new int[r][c]; for(int i=0;i<r;i++) for(int j=0;j<c;j++) a[i][j]=(int)(Math.random()*10); return a; }
    public int[][] add(int[][] A,int[][] B){ int r=A.length,c=A[0].length; int[][] C=new int[r][c]; for(int i=0;i<r;i++) for(int j=0;j<c;j++) C[i][j]=A[i][j]+B[i][j]; return C; }
    public int[][] subtract(int[][] A,int[][] B){ int r=A.length,c=A[0].length; int[][] C=new int[r][c]; for(int i=0;i<r;i++) for(int j=0;j<c;j++) C[i][j]=A[i][j]-B[i][j]; return C; }
    public int[][] multiply(int[][] A,int[][] B){ int r=A.length,c=B[0].length,n=A[0].length; int[][] C=new int[r][c]; for(int i=0;i<r;i++) for(int j=0;j<c;j++){ int s=0; for(int k=0;k<n;k++) s+=A[i][k]*B[k][j]; C[i][j]=s; } return C; }
    public void print(int[][] M){ for(int[] row:M){ for(int v:row) System.out.print(v+" "); System.out.println(); } }
    public static void main(String[] args){
        MatrixOperations m=new MatrixOperations();
        int[][] A=m.randomMatrix(2,3);
        int[][] B=m.randomMatrix(2,3);
        int[][] C=m.randomMatrix(3,2);
        System.out.println("A+B:"); m.print(m.add(A,B));
        System.out.println("A-B:"); m.print(m.subtract(A,B));
        System.out.println("A*C:"); m.print(m.multiply(A,C));
    }
}
