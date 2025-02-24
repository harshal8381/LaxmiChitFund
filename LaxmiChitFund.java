import java.util.*;
class LaxmiChitFund
{
static String username;
static String phone;
static String pin;
static long adhar;
static String pan;
static double bal;
static final String ifsc = "LCF0000001";
static final long accountNo=12345567889l;
static ArrayList<String> tran = new ArrayList<String>();
static Scanner sc=new Scanner (System.in);

static int attempt=3 ;

public static void main(String[]args)
{

for(; ;)
{
System.out.println();
System.out.println("        WELCOME   ");
System.out.println("      ***LAXMI CHEAT FUND  ");
System.out.println();
System.out.println("1.Existing user");
System.out.println("2.Create Account");
System.out.print("Enter as option :");
int opt =sc.nextInt();
switch(opt)
{
case 1:{
login();
break;
}
case 2:{
createAccount();
break;
}
default :{
System.out.println("INVALID OPTION");
break;
}
}
}
}

public static void login()
{
if (username!=null)
{
System.out.println("      *****LOGIN**** ");
System.out.println();
sc.nextLine();
System.out.print("Username/Phone : ");
String cred1 =sc.nextLine();
System.out.print("Password : ");
String cred2 =sc.next();
if((cred1.equals(username)) ||
(cred1.equals(phone)) && (cred2.equals(pin)))
{
homePage();
}
else {
attempt--;
System.out.println();
System.out.print("WRONG CRED ENTERED");
System.out.print("Attempt left "+attempt);
System.out.println();
}

if (attempt == 0)
{
System.exit(0);
}
login();
}
else {
System.out.print("CREATE YOUR ACCOUNT FIRST");
}
}
public static void createAccount()
{
System.out.println("     ***ACCOUNT CREATION**** ");
System.out.println();
System.out.print("Username : ");
sc.nextLine();
username = sc.nextLine();
System.out.print("Pin : ");
pin =sc.next();
System.out.print("Adhar Number : ");
adhar =sc.nextLong();
System.out.print("Pan Number : ");
pan =sc.next();
System.out.print("Amount to be deposite : ");
bal = sc.nextDouble();
tran.add(" Deposite : "+bal+ "rs");

System.out.println();
System.out.println("ACOUNT CREATED SUUCCESFULLY");
System.out.println();
login();
}
public static void homePage()
{
for( ; ;)
{
System.out.println();
System.out.println("     ** HOME PAGE**");
System.out.println();
System.out.println("1.Deposite Amouunt");
System.out.println("2.Withdraw Amount");
System.out.println("3.Check balance");
System.out.println("4.Statements");
System.out.println("5.Edit User");
System.out.println("6.loan");
System.out.println("7.LogOut");
System.out.println();
System.out.print("Enter an option : ");
int opt = sc.nextInt();
System.out.println();
switch(opt)
{
case 1:{
depositAmount();
break;
}
   case 2:{
    withdrawAmount();
    break;

}
   case 3:{
    checkBalance();
    break;
   }
case 4:{
statement();
break;
}
case 5:{
editUser();
break;
}
case 6:{
loan();
break;
}
   case 7:{
    System.out.println("THANK YOU VISIT AGAIN");
System.exit(0);
   }
default :{
System.out.println("WRONG OPTION");
break;
}
}


}
}
public static void depositAmount()
{
System.out.println("  ****DEPOSITE AMOUNT****");
System.out.print("Enter Amount : ");
double depositAmt=sc.nextDouble();
tran.add("Deposite : "+depositAmt+ "rs");
bal += depositAmt;
System.out.println("AMOUNT DEPOSITED SUCCESFULLY");
}

public static void  withdrawAmount()
{
System.out.println("    ****WTIHDRAW AMOUNT**** ");
System.out.print("Amount : ");
double withAmt =sc.nextDouble();
System.out.print("Pin : ");
String userPin=sc.next();
if(userPin.equals(pin))
{
if(withAmt<=bal)
{
bal-=withAmt;
tran.add("withdraw : "+withAmt+ "Rs");
System.out.println("AMOUNT DEBITED SUUCESSFULLY");
}
else
{
System.out.print("INSUFICIENT BALANCE");
}
}else {
System.out.print("INCORECT PIN");
}
}
public static void checkBalance()
{
System.out.println("        ****CHECK BAKANCE***");
System.out.println();
System.out.print("pin :");
String userPin=sc.next();
if (userPin.equals(pin))
{
System.out.println
(username+ " your account balance is  : "+ bal+ "rs");
}
else System.out.println("INCORECT PIN");
}
public static void statement()
{
System.out.println("**STATEMENT**");
System.out.println();
for (String i : tran){
System.out.println(i);
}
}
public static void editUser()
{
System.out.println("    ****UPDATE PROFILE*** ");
System.out.println();
System.out.println("1.Update Username :");
System.out.println("2.Update Phone number :");
System.out.println("3.Update PIN :");
System.out.println();
System.out.print("Enter an option :");
int up=sc.nextInt();

switch(up)
{
case 1:upUser();break;
case 2:upPhone();break;
case 3:upPin();break;
}
}

public static void upUser(){
System.out.println();
System.out.print("Enter PIN :");
String pass1=sc.next();

if(pass1.equals(pin))
{
System.out.print("Enter new NAme :");
username =sc.next();


System.out.println();
System.out.print("USERNAME UPDATED SUCCESFULLY");

}
else {

System.out.print("WRONG PIN");
upUser();

}
}
   public static void upPin()
   {
    System.out.println();
    System.out.print("Enter PIN :");
    String pass2=sc.next();

    if(pass2.equals(pin))
    {
    System.out.print("enter new PIN :");
    pin=sc.next();
    System.out.println();
    System.out.print("**PIN UPDATED SUCCESFULLY**");

    }
    else
    {
    System.out.print("WRONG PIN");
    upPin();
    }
   }
   public static void upPhone()
   {
    System.out.println();
    System.out.print("Enter PIN :");
    String pass3=sc.next();
    if(pass3.equals(pin))
    {
    System.out.print("Enter new Phone number :");
    phone=sc.next();
    System.out.println();
    System.out.print("PHONE NUMBER UPDATED SUCCESFULLY");
    }
   }
/*if(up==1)
{
System.out.println();
System.out.print("enter pin :");
String pass=sc.next();
if(pass.equals(pin))
{
upUser();
}
else {

System.out.print("WRONG PIN");

}
}
else if(up==2)
{
System.out.println();
System.out.print("Enter PIN :");
String pass2=sc.next();
if(pass2.equals(pin))
{
upPhone();
}
else
{
System.out.print("WRONG PIN");
}
}
else if(up==3)
{
System.out.println();
System.out.print("enter pin :");
String pass3=sc.next();
if(pass3.equals(pin))
{
upPin();
}
else
{
System.out.print("WRONG PIN");
}
}


}

public static void upUser(){
System.out.println();

System.out.print("Enter new Name :");
username=sc.next();


System.out.println();
System.out.print("USERNAME UPDATED SUCCESFULLY");




}
public static void upPhone()
{
System.out.print("Enter a  New phone number :");
phone=sc.next();

System.out.println();
System.out.print("****PHONE NUMBER UPDATED SUCCESFULLY***");
}
public static void upPin()
{
    System.out.println();
System.out.print("Enter new PIN :");
pin=sc.next();


System.out.println();
System.out.print("  PIN Updated Succesfully");

}*/
public static void loan()
{
System.out.println("    ****LOAN***");
System.out.println("    comming soon");
}

}
