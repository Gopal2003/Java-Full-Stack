// package Priority Queue;

public class Patient {
    private String name;
    private String condition;
    private int priority;

    public Patient(String name, String condition, int priority) {
        this.name = name;
        this.condition = condition;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public int getPriorty() {
        return priority;
    }

    public void setPriorty(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Patient [name=" + name + ", condition=" + condition + ", priority=" + priority + "]";
    }
}


