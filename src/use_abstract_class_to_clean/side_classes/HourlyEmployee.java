package use_abstract_class_to_clean.side_classes;

import use_abstract_class_to_clean.Employee;

public class HourlyEmployee extends Employee {
    public HourlyEmployee(EmployeeReCord r) {
        super();
    }

    @Override
    public boolean isPayDay() {
        return false;
    }

    @Override
    public Money calculatePay() {
        return null;
    }

    @Override
    public void deviverPay(Money pay) {

    }
}
