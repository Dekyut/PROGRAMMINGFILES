import java.util.Scanner;

public class Exam2 {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        posineg();
        primecomp();
        sumname();
        larg();
        vowcon();
        VALIDATION();
        letter();
        condition();
        strand();
        email();
    }
       

        // Long exam 2
        // Total points possible (100 pts)
        // Methods and Conditions

        // Part I
        // 1. Create a method.
        // 2. Call the method.
        // 3. Print result of the method.

        // ==============================================================================
        // 1. Create a method that will:
        // print "POSITIVE" if the number is a positive number. 
        // print "NEGATIVE" if the number is a negative number. 
        // print "ZERO" if the number is ZERO. 
        //(10 pts)
        static void posineg() {
        System.out.println("1. Positive, negative, zero");
        System.out.print("Enter a number: ");
        int number = scan.nextInt();

        if (number > 0) System.out.println("positive");
        else if (number == 0) System.out.println("zero");
        else System.out.println("negative");
        }
        // ==============================================================================

        // 2. Create a method that will:
        // print "PRIME" if the last digit of your student number is a prime number
        // print "COMPOSITE" if the last digit of your student number is a composite
        // number.
        // print "NEITHER" if the last digit of your student number is neither a prime
        // or a composite number.
        // (10 pts)
        static void primecomp() {
        System.out.println("2. PRIME or COMPOSITE number");
        System.out.print("Enter the last digit of your student number: ");
        int lastDigit = scan.nextInt();
        if (lastDigit == 0) System.out.println("Niether");
        if (lastDigit == 1) System.out.println("Niether");
        if (lastDigit == 2) System.out.println("Prime");
        if (lastDigit == 3) System.out.println("Prime");
        if (lastDigit == 4) System.out.println("Composite");
        if (lastDigit == 5) System.out.println("Prime");
        if (lastDigit == 6) System.out.println("Composite");
        if (lastDigit == 7) System.out.println("Prime");
        if (lastDigit == 8) System.out.println("Composite");
        if (lastDigit == 9) System.out.println("Composite");
        }
        



        

        // ==============================================================================

        // 3. Create a method that will return the sum of the character length of your
        // firstname and your surname. (10 pts)
        static void sumname() {
        System.out.println("3. Length of your fullname");
        System.out.print("Enter your firstname: ");
        String firstName = scan.next();
        System.out.print("Enter your surname: ");
        String surName = scan.next();
        
        String fname = firstName;
        String sname = surName;

        int fcount = fname.length();
        int scount = sname.length();
        int sumcount; 
        sumcount = fcount + scount;
        System.out.println("The sum of character length is: " + sumcount);
        

                
        }    
            
        

         
    
        

        // ==============================================================================

        // 4. Create a method that will take three whole numbers and print the largest number.
        static void larg() {
   
        System.out.println("4. Largest Number");
        System.out.print("Enter first number: ");
        int firstNumber = scan.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = scan.nextInt();
        System.out.print("Enter third number: ");
        int thirdNumber = scan.nextInt();

        if(firstNumber > secondNumber && firstNumber > thirdNumber)
        {
            System.out.println("Largest number is:"+firstNumber);
        }
        else if(secondNumber > thirdNumber)
        {
            System.out.println("Largest number is:"+secondNumber);
        }
        else
        {
            System.out.println("Largest number is: "+thirdNumber);
        }
 
    }

        
        


        // ==============================================================================

        // 5. Create a method that will print "VOWEL" if your name starts with
        // a vowel and "CONSONANT" if your name starts with a consonant.
        static void vowcon() {
        System.out.println("5. Vowel or Consonant");
        System.out.print("Enter the first character of your first name: ");
        char firstChar = scan.next().charAt(0);

        switch (firstChar) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(firstChar + " is vowel");
                break;
            default:
                System.out.println(firstChar + " is consonant");
        }
    }

        // =========================================================================================================================

        // Part II
        // Print "valid" if the result is true.
        // Print "invalid" if the result is false.

        // ==============================================================================
        // 6. Create a condition to check if the entered student number is your student
        // number. (10 pts)
        static void VALIDATION() {
        System.out.println("6. Student number validation");
        System.out.print("Enter your ten digit student number: ");
        int studentNumber = scan.nextInt();

        if (studentNumber == 2022104573)
        System.out.println("valid");
        else
        System.out.println("invalid");
    }

        // ==============================================================================

        // 7. Create a condition to check if your firstname is in UPPERCASE and your
        // lastname is in lowercase. (10 pts)
        static void letter() {
            System.out.println("7. Case sensitivity check");
            System.out.print("Enter your firstname in UPPERCASE: ");
            String firstName = scan.next();
            System.out.print("Enter your surname in lowercase: ");
            String surName = scan.next();
    
            if (firstName == firstName.toUpperCase() && surName == surName.toLowerCase())
            System.out.println("valid");
            else
            System.out.println("invalid");
        }

        // ==============================================================================

        // 8. Create a nested condition that will ask the specialization of the student
        // is taking
        // depending if the student is a BSIT or BSCS student.

        // Condition 1
        // if the student is BSIT, ask again if the student is taking MWAA or MAA.

        // Condition 2
        // if the student is BSCS, ask again if the student is taking ML or DF.

        static void condition(){
            System.out.println("8. Nested conditions");
            System.out.print("Enter your enrolled course (BSIT or BSCS): ");
            String course = scan.next();

     
            // If BSIT
            switch (course){
                case "BSIT":
            System.out.print("Enter your specialization (MWA or MAA): ");
            String specialization1 = scan.next();
            switch (specialization1){
                case "MWA":
                System.out.print("you are taking BSIT-MWA ");
                break;

                case "MAA":
                System.out.println("You are taking BSIT-MAA");
                break;
            }
            break;

        // If BSCS
        case "BSCS":
            System.out.print("Enter your specialization (DF or ML): ");
            String specialization2 = scan.next();
            switch (specialization2){
                case "ML":
                System.out.println("You are taking BSCS-ML");
                break;

                case "DF":
                System.out.println("You are taking BSCS-DF");
                break;
            
            }
        }
}

        // ==============================================================================

        // 9. Create a condition to check if the answer belongs to one of the possible
        // answers. (10 pts)

        // STEM
        // ICT
        // ABM
        // HUMSS
        // HOME ECONOMICS
        // ARTS AND DESIGN
        // TVL MARITIME

        static void strand(){
            System.out.println("9. Selection");
    
            System.out.println("STEM");
            System.out.println("ICT");
            System.out.println("HUMSS");
            System.out.println("HOME ECONOMICS");
            System.out.println("ARTS AND DESIGN");
            System.out.println("TVL MARITIME");
            System.out.print("Enter your SHS strand: ");
    
            String strand = scan.next();
    
            
            switch (strand) {
               case "STEM":
               System.out.println("valid");
               break;
    
               case "ICT":
               System.out.println("valid");
               break;
    
               case "HUMSS":
               System.out.println("valid");
               break;
    
               case "HOME ECONOMICS":
               System.out.println("valid");
               break;
    
               case "ARTS AND DESIGN":
               System.out.println("valid");
               break;
    
               case "TVL MARITIME":
               System.out.println("valid");
               break;
    
               default:
               System.out.println("invalid");
               break;
            }
            
        }

        // ==============================================================================

        // 10. Create a condition to check if your student email address contains the following pattern:
        // - Your surname
        // - The string "@student.national-u.edu.ph"
        //(10 pts)
        static void email(){
            System.out.println("10. Validate student email address ");
    
            System.out.println("Enter your Email Address:");
            String email = scan.next();
    
            if (email.contains("honrubiadc")) {
            System.out.println("valid");
    
            } else {
            System.out.println("invalid");
            }
            }

        // ==============================================================================
        // Programming competition/Job interview level question (20 points)

        // 11. Think like an ATM.

        // You have an N amount of pesos in your savings account and you have decided
        // that you want to withdraw all of your money in the ATM.

        // The denomination of peso bills that the ATM could dispense are 20, 50, 100,
        // 200, 500, 1000.

        // Create a method that will return the minimum number of peso bills that the
        // ATM will dispense after withdrawing all of your money.

        // Example:
        // Elizer has 150 pesos in his bank account. If elizer withdraws 150 pesos in
        // the ATM, the ATM will dispense two peso bills (100 peso bill and 50 peso
        // bill). (Answer is 2)

        //System.out.println("11. Think like an ATM");
        //System.out.print("Enter the total amount of money in your bank account: ");
        //int amount = scan.nextInt();

        // Close scanner
        //scan.close();
    }
