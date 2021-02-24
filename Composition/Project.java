package Composition;

public class Project {

    public boolean isSuccess =false;
    private Manager manager;

    public Project(){
         this.manager = new Manager();
         manager.salary++;

    }
    
}
