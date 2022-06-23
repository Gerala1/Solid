package o.after;

public class Manager extends TypeOfEmployee implements Worker{

    @Override
    public void setRole() {
        this.isManager = true;
    }
}
