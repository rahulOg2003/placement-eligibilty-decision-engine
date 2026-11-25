public class PercentageRule extends EligibilityRule{
       @Override
    public String getRuleName() {
        return "Percentage Rule";
    }

    @Override
    public boolean check(Candidate candidate, Job job) {
        // TODO: compare candidate's percentage with job's minimum
        return candidate.getPercentage() >= job.getminimumPercentage();
        
}
}