import java.util.*;
public class HandshakeCalculator {
    public long calculateHandshakes(long students){ return students*(students-1)/2; }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long h=new HandshakeCalculator().calculateHandshakes(n);
        System.out.println("Maximum handshakes for "+n+" students = "+h);
    }
}
