public class Job {
    private String company;
    private double salary;

    // public, vem som helst kan använda, private kan bara komma åt inifrån objektet själv
    public Job(String company, double salary) {
        this.company = company;
        this.salary = salary;
    }

    // metod för att komma åt en variabel kallas för getter
    // metod för att förändra en variabel kallas för setter

    public String getCompany() {
        return this.company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
    // snabbkommando för att göra getter/ setter command n
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}