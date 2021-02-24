package Composition;

public class Organisation {
    
    public static void main(String[] args)
    {
        /*Associaton relationship
        * Manager and Idenity Card and exit independently
        * for SwipCard Method in Manager we need IdentiyCard object
        * Similarly for Idenity Card Swipe we need manager object
        * Hence Objects can be created or exists without each other
        * They are assocaited for certain Operation
        */
        Manager manager = new Manager();
        manager.getManagerName();

        IdentityCard identityCard = new IdentityCard();
        identityCard.makeSwipeCard();

        /*
        * Aggregation Relation ship 
        * they can exist idependently but should be linked to a single entity at time 
        * A list of workers are linked to One Manager
        * public List<Worker> workerList = new ArrayList<Worker>();
        */
        Worker worker = new Worker();
        worker.workerName();

    }
}
  