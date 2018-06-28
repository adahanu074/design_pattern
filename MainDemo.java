package anand;
import java.util.*;
import java.lang.*;
public class Account
{
HashMap<Interger ,Account> hold=new HashMap<Integer,Account>();
int AccNo,AccBal;
String AccName;
ArrayList <String> ar=new ArrayList();
public Account(int no,int bal,String name)
{
this.AccNo=no;
this.AccBal=bal;
this.AccName=name;
hold.put(no,this);
}
ArrayList <String> mini=new ArrayList();
}


class Bank extends Account
{
Scanner sc=new Scanner(System.in);
Date date = new Date(); 
public void credit(int no)
{
	Account dis=hold.get(no);
System.out.println("enter the amount that you want to credit");
int amount=sc.nextInt();
if(amount<0)
{
	System.out.println("insuffcient balaance");
}
else
{
dis.AccBal=dis.AccBal+amount;
arr.add("your current balaance is ::"+dis.AccBal+" this amount have been fetched on "+date.toString());
}
}
public void debit(int no)
{
	Account dis=hold.get(no);
System.out.println("enter the amount that you want to withdraw");
int amount=sc.nextInt();
if(amount>dis.AccBal)
{
	System.out.println("not have suffcient balance");
}
else
{
dis.AccBal=dis.AccBal-amount;
arr.add("your current balaance is ::"+dis.AccBal+" this amount have been fetched on "+date.toString());
}
}
}
class MainDemo extends Bank
{
public static void main(String [] args)
{

public void create()
{
	Random ran=new Random();
	int n=ran.nextInt(50);
	arr.add("the generated account number is::::"+n+" have a happy banking");
}
MainDemo d=new MainDemo();
d.create();
Account acc=new Account(n,1000,"adarsh anand");
Scanner sc=new Scanner(System.in);
System.out.println("choose from the options");
System.out.println("1....CREDIT");
System.out.println("2.....DEBIT");
int x=sc.nextInt();
switch(x)
{
case 1:
credit(acc.AccNo);
arr.get(1);
break;
case 2:
debit(acc.AccNo);
arr.get(1);
break;
default:
System.out.println("enter the valid option plzz");
}

}
}