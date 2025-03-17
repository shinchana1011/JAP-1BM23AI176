package S1BM23AI176;

import java.util.*;
public class GymMembership {
    String name;
    int age;
    int duration;
    boolean isActive;
    void MembershipFee(){
        double Fee=0;
        int MemFee =0;
        if(duration <= 3){
            MemFee=1200*duration;
        }
        if(duration>3 && duration<=6){
            MemFee=1000*duration;
        }
        if(duration>6){
            MemFee=700*duration;
        }
        System.out.println("MemberShip Fee:"+MemFee);
    };
    void display(){
        System.out.println("Member Details:\n Name: "+name+"\nAge:"+age+"\nDuration:"+duration+"\nMembership Status:"+isActive);
    };
    void UserInput(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter name:");
        name=scanner.nextLine();
        System.out.println("enter age:");
        age=scanner.nextInt();
        System.out.println("enter duration:");
        duration=scanner.nextInt();
        System.out.println("enter status:");
        isActive=scanner.nextBoolean();
    };
    public static void main(String[] args){
        GymMembership m1=new GymMembership();
        m1.UserInput();
        m1.display();
        m1.MembershipFee();
        GymMembership m2=new GymMembership();
        m2.UserInput();
        m2.display();
        m2.MembershipFee();
        GymMembership m3=new GymMembership();
        m2.UserInput();
        m2.display();
        m2.MembershipFee();
    }
}
