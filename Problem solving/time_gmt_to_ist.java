import java.util.*;
public class time_gmt_to_ist{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Entre day : ");
        int day =sc.nextInt();
        System.out.println("Entre Hour : ");
        int hour = sc.nextInt();
        System.out.println("Entre Minute : ");
        int minute = sc.nextInt();
        hour+= 5;
        minute += 30;
        if(hour >= 24){
            day++;
            hour-= 24;
        }
        if(minute >=60){
            hour++;
            minute -= 60;
        }
        System.out.println(day + "DD:" + hour+ "HH:" + minute + "MM");
}
}