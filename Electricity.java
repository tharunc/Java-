//Develop a Java application to generate Electricity bill. Create a class with the following members: Consumer no, Consumer name, previous month reading, current month reading, type of EB connection (i.e domestic or commercial). Compute the bill amount using the following tariff.
//If the type of the EB connection is domestic, calculate the amount to be paid as follows:

//•	First 100 units – Rs. 1 per unit
//•	101-200 units – Rs. 2.50 per unit
//•	201-500 units – Rs. 4 per unit
//•	> 501 units – Rs. 6 per unit
//If the type of the EB connection is commercial, calculate the amount to be paid as follows:

//•	First 100 units – Rs. 2 per unit
//•	101-200 units – Rs. 4.50 per unit
//•	201-500 units – Rs. 6 per unit
//•	> 501 units – Rs. 7 per unit

import java.util.Scanner;
class EB{
    public static void main(String args[]){
        double amt;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Customer No.");
        int cno=sc.nextInt();
        System.out.println("Enter your name");
        String cname=sc.next();
        System.out.println("Enter your previous reading");
        int preading=sc.nextInt();
        System.out.println("Enter your current reading");
        int creading=sc.nextInt();
        System.out.println("Enter your connection type 1.Domestic,2.Commercial");
        int type=sc.nextInt();
        double units=creading-preading;
        double dunits;
        dunits=units-100;
        switch(type)
        {
            case 1: if(units<=100)
                amt=units*1;

            else if(dunits<=200 &&dunits>=100)

                amt=100+dunits*2.50;

            else if(dunits<=500 &&dunits>201) amt=100+dunits*4;
            else

                amt=100+dunits*6;

                System.out.println("Customer No:"+cno+"\ncustomer name: "+cname+" \nUnits:"+units+ "\n Bill Amt:"+amt);
                break;
                case 2:
            if(units<=100) amt=units*2;
            else if(dunits<=200 &&dunits>101) amt=100+dunits*4.50;
            else if(dunits<=500 &&dunits>201) amt=100+dunits*6;
            else amt=dunits*7;
            System.out.println("Customer No:"+cno+"\ncustomer name:"+cname+" \nUnits:"+units+"\nBillAmt:"+amt);
            break;
            default:
            System.out.println("Customer No:"+cno+" customer name:"+cname);

        }

        sc.close();

    }

}
