package loanbuddy;

interface IApprovable {
    boolean approveLoan();
    double calculateEMI();
}

abstract class LoanApplication implements IApprovable {
    protected String applicantName;
    protected int creditScore;
    protected double income;
    protected double loanAmount;
    protected int termMonths;
    protected double interestRate;

    public LoanApplication(String applicantName, int creditScore, double income, double loanAmount, int termMonths, double interestRate) {
        this.applicantName=applicantName; this.creditScore=creditScore; this.income=income; this.loanAmount=loanAmount; this.termMonths=termMonths; this.interestRate=interestRate;
    }

    public boolean approveLoan() {
        // simple rule
        return creditScore >= 650 && income >= loanAmount/termMonths * 0.5;
    }

    public double calculateEMI() {
        double monthlyRate = interestRate/(12*100.0);
        double P = loanAmount;
        int N = termMonths;
        if (monthlyRate == 0) return P / N;
        return P * monthlyRate * Math.pow(1+monthlyRate,N) / (Math.pow(1+monthlyRate,N)-1);
    }
}

class HomeLoan extends LoanApplication {
    public HomeLoan(String name,int cs,double inc,double amt,int term,double rate){ super(name,cs,inc,amt,term,rate); }
}

class AutoLoan extends LoanApplication {
    public AutoLoan(String name,int cs,double inc,double amt,int term,double rate){ super(name,cs,inc,amt,term,rate); }
}

public class LoanBuddyDemo {
    public static void main(String[] args) {
        HomeLoan h = new HomeLoan("Vikram",700,100000,5000000,240,7.5);
        System.out.println("Approved? " + h.approveLoan());
        System.out.println("EMI: " + h.calculateEMI());
    }
}
