import java.util.*;
public class OTPGenerator {
    public int generateOTP(){ return (int)(Math.random()*900000)+100000; }
    public boolean allNotSame(int[] a){ for(int i=1;i<a.length;i++) if(a[i]!=a[0]) return true; return false; }
    public static void main(String[] args){
        OTPGenerator o=new OTPGenerator();
        int[] otps=new int[10];
        for(int i=0;i<10;i++){ otps[i]=o.generateOTP(); System.out.println("OTP "+(i+1)+": "+otps[i]); }
        System.out.println("All not same: "+o.allNotSame(otps));
    }
}
