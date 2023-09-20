public class Person {
    private String name;
    private Job job;  // en ny klass

    public Person(String name, Job job) {
        this.name = name;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public void setSalary(double salary) {   //genväg till att ändra lön
        this.job.setSalary(salary);
    }
    public String toString() {
        return "name: " + name + " company: " + job.getCompany() + " salary: " + job.getSalary();
    }

}
