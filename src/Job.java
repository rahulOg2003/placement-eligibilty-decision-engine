public class Job {
    private String company;
    private String role;
    private double minimumPercentage;
    private int maximumBacklogs;
    private int requiredGraduationYear;

    public  Job (String company,String role,double minimumPercentage,int maximumBacklogs,int requiredGraduationYear){
        this.company = company;
        this.role = role;
        this.minimumPercentage = minimumPercentage;
        this.maximumBacklogs = maximumBacklogs;
        this.requiredGraduationYear = requiredGraduationYear;
        

    }

    public String getCompany() {
        return company;
    }

    public String getRole() {
        return role;
    }

    public double getminimumPercentage() {
        return minimumPercentage;
    }

    public int getmaximumBacklogs() {
        return maximumBacklogs;
    }

    public int getrequiredGraduationYear() {
        return requiredGraduationYear;
    }

    



    
    
}
