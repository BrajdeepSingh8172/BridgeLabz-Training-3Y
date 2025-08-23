import java.util.*;
public class MatrixAdvancedOperations {
    public double[][] randomMatrix(int r,int c){ double[][] a=new double[r][c]; for(int i=0;i<r;i++) for(int j=0;j<c;j++) a[i][j]=Math.floor(Math.random()*10); return a; }
    public double[][] transpose(double[][] A){ int r=A.length,c=A[0].length; double[][] T=new double[c][r]; for(int i=0;i<r;i++) for(int j=0;j<c;j++) T[j][i]=A[i][j]; return T; }
    public double det2(double[][] A){ return A[0][0]*A[1][1]-A[0][1]*A[1][0]; }
    public double det3(double[][] a){
        return a[0][0]*(a[1][1]*a[2][2]-a[1][2]*a[2][1])
             - a[0][1]*(a[1][0]*a[2][2]-a[1][2]*a[2][0])
             + a[0][2]*(a[1][0]*a[2][1]-a[1][1]*a[2][0]);
    }
    public double[][] inv2(double[][] A){
        double d=det2(A);
        double[][] I=new double[2][2];
        I[0][0]= A[1][1]/d; I[0][1]=-A[0][1]/d;
        I[1][0]=-A[1][0]/d; I[1][1]= A[0][0]/d;
        return I;
    }
    public double[][] inv3(double[][] a){
        double d=det3(a);
        double[][] cof=new double[3][3];
        cof[0][0]=  (a[1][1]*a[2][2]-a[1][2]*a[2][1]);
        cof[0][1]= -(a[1][0]*a[2][2]-a[1][2]*a[2][0]);
        cof[0][2]=  (a[1][0]*a[2][1]-a[1][1]*a[2][0]);
        cof[1][0]= -(a[0][1]*a[2][2]-a[0][2]*a[2][1]);
        cof[1][1]=  (a[0][0]*a[2][2]-a[0][2]*a[2][0]);
        cof[1][2]= -(a[0][0]*a[2][1]-a[0][1]*a[2][0]);
        cof[2][0]=  (a[0][1]*a[1][2]-a[0][2]*a[1][1]);
        cof[2][1]= -(a[0][0]*a[1][2]-a[0][2]*a[1][0]);
        cof[2][2]=  (a[0][0]*a[1][1]-a[0][1]*a[1][0]);
        double[][] adj=transpose(cof);
        for(int i=0;i<3;i++) for(int j=0;j<3;j++) adj[i][j]/=d;
        return adj;
    }
    public void print(double[][] M){ for(double[] row:M){ for(double v:row) System.out.printf("%8.3f", v); System.out.println(); } }
    public static void main(String[] args){
        MatrixAdvancedOperations m=new MatrixAdvancedOperations();
        double[][] A=m.randomMatrix(3,3);
        System.out.println("Transpose:"); m.print(m.transpose(A));
        System.out.println("det(A) = "+m.det3(A));
        double[][] B={{1,2},{3,4}};
        System.out.println("Inverse 2x2 of [[1,2],[3,4]]:"); m.print(m.inv2(B));
    }
}
