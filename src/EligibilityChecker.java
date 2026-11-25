public class EligibilityChecker {

    EligibilityRule rule[] = {
            new PercentageRule(),
            new BacklogRule(),
            new GraduationYearRule()
        };

        public boolean check(Candidate candidate,Job job){
            boolean eligible = true ;

        for(int i = 0;i<rule.length;i++){
            boolean pass = rule[i].check(candidate,job);
            if(pass){
                System.out.println(rule[i].getRuleName() + " : PASS");
            }else{

                System.out.println(rule[i].getRuleName() + " : FAIL");
                eligible = false;

            }
        }
        return eligible;
    }
    
    
}
