package creational.prototype;

import java.util.HashMap;

public class TaskRegistry {
    Map<TaskType,Task> tasks=new HashMap<TaskType,Task>();
    void register(TaskType type,Task task){
    tasks.put(type,task);
    }

    Task get(TaskType type){
    return tasks.get(type);
    }
}
