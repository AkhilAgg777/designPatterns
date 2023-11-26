package creational.prototype;

public class Runner {
    public static void main(String[] args){
        TaskRegistry registry=new TaskRegistry();

        Task epicTemplate=new Task();
        epicTemplate.type=TaskType.EPIC;
        registry.register(TaskType.EPIC,epicTemplate);

        Task bugTemplate=new Task();
        bugTemplate.type=TaskType.BUG;
        registry.register(TaskType.BUG,bugTemplate);

        for(int i=0;i<10000;i++){
            TaskType input=TaskType.BUG;  //Some Input
            Task task= registry.get(input).clone();

            task.getAssignee();

            //  databaseClient.save(task);

        }
    }
}
