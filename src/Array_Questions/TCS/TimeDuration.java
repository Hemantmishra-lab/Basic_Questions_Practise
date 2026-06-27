package Array_Questions.TCS;

import java.util.Scanner;

public class TimeDuration {
    public static String calcTimeDuration(String startTime,String endTime){
        String start[] = startTime.split(":");
        String end[] = endTime.split(":");
        int startHour = Integer.parseInt(start[0]);
        int StartMin = Integer.parseInt(start[1]);
        int endHour = Integer.parseInt(end[0]);
        int endMin = Integer.parseInt(end[1]);
        int TStartMin = startHour * 60 + StartMin;
        int TEndMin = endHour*60 + endMin;
        if(TEndMin<TStartMin){
            TEndMin += 24*60;
        }
        int diff = TStartMin - TEndMin;
        int finalHour = diff / 60;
        int finalMin = diff % 60;
        return finalHour + ":" + finalMin;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start Time : ");
        String startTime = sc.next();
        System.out.println("Enter the end Time : ");
        String endTime = sc.next();
        System.out.println(calcTimeDuration(startTime,endTime));
    }
}
