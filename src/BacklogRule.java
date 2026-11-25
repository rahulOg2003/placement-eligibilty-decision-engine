public  class BacklogRule extends EligibilityRule {
    @Override
    public String getRuleName() {
        return "BacklogRule";
    }
    @Override
    public boolean check(Candidate candidate,Job job){
        return  candidate.getBacklogs() <= job.getmaximumBacklogs();
        

    }
    
}
