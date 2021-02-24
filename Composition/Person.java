package Composition;

public class Person {

    private Job job;

    public Person(){
        this.job = new Job();
        job.setSalary(1000l);
        job.setRole("Developer");
        job.setId(123);
    }

    public long getSalary(){
      return job.getSalary();
    }
    
    public int getId(){
        return job.getId();
    }

    public String getRole(){
        return job.getRole();
    }
}
