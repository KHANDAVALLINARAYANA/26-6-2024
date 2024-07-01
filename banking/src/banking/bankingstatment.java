package banking;

public class bankingstatment {

	public static void main(String[] args) {
		String Accountnumber="040159557787" ;
		String Accountholdername="harish";
		double Balance=100875;
		String work ="withdraw";
		int amount=500;
		System.out.println("accountnumber:"+Accountnumber);
		System.out.println("accountholdername:"+Accountholdername);
        switch(work){
        	case "deposit":
        	Balance+=amount;
        	
        	System.out.println("deposit:"+Balance);
        	break;
        	case "withdraw":
        		if(amount<=Balance) {
        			Balance-=amount;
        		System.out.println("withdrawn:"+amount);
        		System.out.println("totalamount:"+Balance);}
        		else {
        			System.out.println("insufficient funds");}
        	break;
        	case "enquarey":
        		System.out.println("Balance"+Balance);
        		break;
        	
        	
        }
	}

}
