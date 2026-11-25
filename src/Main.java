import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        double percentage = sc.nextDouble();
        int backlogs = sc.nextInt();
        int graduationYear = sc.nextInt();

        Candidate candidate  = new Candidate(name,percentage,backlogs,graduationYear);

        Job job = new Job(
            "Infosys",
            "Java Developer",
            65.0,
            0,
            2026

        );

        EligibilityChecker  checker = new EligibilityChecker();
        

        

        System.out.println("=============================================");
        System.out.println("Placement Eligibilty Result");
        System.out.println("=============================================");

        System.out.println("Candidate: " + candidate.getName());
        System.out.println("Company: " + job.getCompany());
        System.out.println("Role: " + job.getRole());
        System.out.println();

        boolean eligible = checker.check(candidate,job);

        
        System.out.println();

        if(eligible) {
            System.out.println("Final Result  :  PASS ");
        }else{
            System.out.println("Final Result  :  FAIL ");
        }


        System.out.println("=============================================");

       

        sc.close();

    }
    
}


