import java.util.ArrayList;
  import java.util.Scanner; 
 class Transaction {  String type; 
 double amount;
  String category;
  String description; 
 Transaction(String type, double amount, String category, String description) {  this.type = type; 
 
this.amount = amount;
  this.category = category;  this.description = description;
  }
  void display() {         System.out.println(type + " | ₹" + amount + " | "  + category + " | " + description);
  } 
 } 
 public class ExpenseTracker {     static ArrayList<Transaction> transactions = new ArrayList<>();
     static Scanner sc = new Scanner(System.in); 
 static void addIncome() {         System.out.print("Enter income amount: ₹"); 
 double amount = sc.nextDouble();
  sc.nextLine();
  System.out.print("Enter description: "); 
 String description = sc.nextLine();
  transactions.add(new Transaction(                 "Income", amount, "Income", description));  
 
      System.out.println("Income added successfully!"); 

 } 
 static void addExpense()
 {    
     System.out.print("Enter expense amount: ₹"); 
 double amount = sc.nextDouble();
  sc.nextLine();
  System.out.print("Enter category: ");
  String category = sc.nextLine();
 System.out.print("Enter description: ");
  String description = sc.nextLine();
  transactions.add(new Transaction(                 "Expense", amount, category, description));
         System.out.println("Expense added successfully!");
  }
  static void viewTransactions()
 { 
 if (transactions.isEmpty()) {             System.out.println("No transactions found.");
  return; 
 }  
       System.out.println("\n--- TRANSACTION HISTORY---");
  for (Transaction t : transactions)
 {
  t.display(); 
 } 
 } 
 static void viewBalance()
 {
 double income = 0; 
 double expense = 0;
  for (Transaction t : transactions)
 { 
 if (t.type.equals("Income"))  income += t.amount;
  else
  expense += t.amount;
  }  
       System.out.println("\n--- BALANCE --- "); 
        System.out.println("Total Income   : ₹" + income); 
        System.out.println("Total Expenses : ₹" + expense); 
        System.out.println("Balance        : ₹" + (income- expense));
  } 
 public static void main(String[] args) {  while (true)
 {
             System.out.println("\n===== EXPENSE TRACKER ====="); 
 System.out.println("1. Add Income"); 
   System.out.println("2. Add Expense");   
   System.out.println("3. View Transactions");      
   System.out.println("4. View Balance"); 
 System.out.println("5. Exit"); 
            System.out.print("Enter your choice: ");
  int choice = sc.nextInt();
  switch (choice) {  case 1:  addIncome();  break;  case 2:  addExpense();
  break;
  case 3:  viewTransactions(); 
 break;
  case 4:  viewBalance();
  break; 
case 5:                     System.out.println("Thank you for using Expense Tracker!");
  System.exit(0);
  default:                    System.out.println("Invalid choice!");  
 
}
  }
  }
   }