package o.after;

public class Employee extends Staff implements Worker{



    public void setRole() {}


    public void setManager(boolean manager) {
        isManager = manager;
    }

    public void setExecutive(boolean executive) {
        isExecutive = executive;
    }

}

