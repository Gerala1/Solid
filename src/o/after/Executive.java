package o.after;

public class Executive extends TypeOfEmployee implements Worker{
    @Override
    public void setRole() {
        this.isManager = true;
        this.isExecutive = true;
    }
}
