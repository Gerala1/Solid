package l.after;

public class Manager extends Employee implements CalculatePerHourRate{

    @Override
    public void calculatePerHourRate(int rank) {
        double baseAmount = 19.75;

        salary = baseAmount + (rank * 4);
    }

}
