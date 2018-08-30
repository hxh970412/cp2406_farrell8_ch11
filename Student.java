public abstract class Student {
    private String id;
    private String lastName;
    protected double tuition;
    public Student(String id, String name)
    {
        setId(id);
        setLastName(name);
    }

    public void setId(String idNum) {
        this.id = idNum;
    }

    public void setLastName(String LName) {
        this.lastName = LName;
    }

    public double getTuition() {
        return tuition;
    }

    public String getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }
    public abstract void setTuition();
}
