public class GraduationYearRule extends EligibilityRule{
       @Override
    public String getRuleName() {
        return "GraduationYear Rule";
    }

    @Override
    public boolean check(Candidate candidate, Job job) {
        return candidate.getGraduationYear() == job.getrequiredGraduationYear();

        
}
}