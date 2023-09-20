public class Main {
    public static void main(String[] args) {

        Job job1 = new Job("intel", 100.0);
        // job1.salary = 2000.0;   // kommer inte åt den eftersom den är private

        Person p1 = new Person("Peter", job1);
        Person p2 = new Person("David", new Job("apple", 1400) );

        Double salary = p1.getJob().getSalary();
        System.out.println(salary);
        p1.setName("Pär");
        System.out.println("Namnet: " +p1.getName());

        p2.getJob().setSalary(2000.0);

        p1.setSalary(1100);


        System.out.println(p1);
        System.out.println(p2);
    }
}