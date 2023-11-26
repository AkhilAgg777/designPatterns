package creational.prototype;

public class Task {
    TaskType type;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    private String title;
    private String description;
    private String assignee;
    private int points;

    public Task clone(){
        Task copy=new Task();
        copy.type=this.type;
        copy.assignee=this.assignee;
        copy.points=this.points;

        return copy;
    }
}
