package Composition;

import java.util.ArrayList;
import java.util.List;

public class Manager {

    public static final String MANAGER_NAME ="somemanager";
    
    public void login(IdentityCard identityCard){
        identityCard.Swipe(this);
    }

    public String  getManagerName(){

        return MANAGER_NAME;
    }

    // Aggregation 
    public List<Worker> workerList = new ArrayList<Worker>();

    public double salary;
    private Project project;
    public Manager(){

        this.project = new Project();
    }

    public void managerPerformance(boolean isWorking){

        if(isWorking){
            project.isSuccess = true;
        }
        else{
            project.isSuccess=false;
        }

    }

}
