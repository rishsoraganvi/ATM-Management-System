import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class OptionMenu extends Account {
    Scanner menuInput = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

    HashMap<Integer, Integer> data = new HashMap<>();

    public void getLogin() throws IOException {
        int x=1;
        do {
            try {
                data.put(12345678, 1234);
                data.put(1234567, 2345);
    
                System.out.println("****** Welcome to the ATM Project! ******");
                System.out.println("Enter your customer Number");
                setCustomerNumber(menuInput.nextInt());
    
                System.out.println("Enter your PIN number: ");
                setPinNumber(menuInput.nextInt());
            } catch (Exception e) {
                System.out.println("\n"+"Invalid Character(s). Only Numbers." + "\n");
                x = 2;
            }
            for(Map.Entry<Integer,Integer> Entry: data.entrySet()){
                if(Entry.getKey()==getCustomerNumber() && Entry.getValue()==getPinNumber()) {
                    getAccountType();
                }
            }
            
            
            System.out.println("\n"+"Wrong Customer Number or Pin Number" + "\n");
        } while (x==1);
    }
    
        public void getAccountType() {
            System.out.println("Select the Account you want to access:");
            System.out.println("ENTER 1 - Checking Account");
            System.out.println("ENTER 2 - Saving Account");
            System.out.println("ENTER 3 - Exit");
            System.out.println("Your Choice: ");
    
            int selection = menuInput.nextInt();
    
            switch (selection) {
                case 1:
                getChecking();
                break;
    
                case 2:
                getSaving();
                break;
        
                case 3:
                System.out.println("Thank You for using this ATM, bye.\n");
                break;
        
                default:
                System.out.println("\n" + "Invalid Choice." + "\n");
                getAccountType();
        }
    }
    
        public void getChecking() {
            System.out.println("Checking Account: ");
            System.out.println(" ENTER 1 - View Balance");
            System.out.println(" ENTER 2 - Withdraw Funds");
            System.out.println(" ENTER 3 - Deposit Funds");
            System.out.println(" ENTER 4 - Exit");
            System.out.println("Your Choice: ");
        
            int selection = menuInput.nextInt();
        
            switch (selection) {
                case 1:
                    System.out.println("Checking Account Balance: " + moneyFormat.format(getCheckingBalance()));
                    getAccountType();
                    break;
        
                    case 2:
                    getCheckingWithdrawInput();
                    getAccountType();
                    break;
                
                    case 3:
                    getCheckingDepositInput();
                    getAccountType();
                    break;
                
                    case 4:
                    System.out.println("Thank You for using this ATM, bye.");
                    break;
                
                    default:
                    System.out.println("\n" + "Invalid Choice." + "\n");
                    getChecking();
            }
        }
          
                public void getSaving() {
                    System.out.println("Saving Account: ");
                    System.out.println(" ENTER 1 - View Balance");
                    System.out.println(" ENTER 2 - Withdraw Funds");
                    System.out.println(" ENTER 3 - Deposit Funds");
                    System.out.println(" ENTER 4 - Exit");
                    System.out.print("Your Choice: ");
                    
                    int selection = menuInput.nextInt();
    
                    switch (selection) {
                        case 1:
                            System.out.println("Saving Account Balance: " + moneyFormat.format(getSavingBalance())+"\n");
                            getAccountType();
                            break;
    
                        case 2:
                            getSavingWithdrawInput();
                            getAccountType();
                            break;
    
                        case 3:
                            getSavingDepositInput();
                            getAccountType();
                            break;
    
                        case 4:
                            System.out.println("Thank You for using this ATM, bye.");
                            break;
    
                        default:
                            System.out.println("\n" + "Invalid Choice." + "\n");
                            getSaving();
                        }
                    }
                }
                                
            
        
        
        
       
      