public class SpringSeason {
    public boolean isSpring(int month,int day){
        if(month<1||month>12||day<1||day>31) return false;
        return (month==3 && day>=20) || (month==4) || (month==5) || (month==6 && day<=20);
    }
    public static void main(String[] args){
        int month=Integer.parseInt(args[0]);
        int day=Integer.parseInt(args[1]);
        System.out.println(new SpringSeason().isSpring(month,day) ? "Its a Spring Season" : "Not a Spring Season");
    }
}
