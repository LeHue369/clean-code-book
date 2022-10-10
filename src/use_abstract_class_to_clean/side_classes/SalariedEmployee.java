package use_abstract_class_to_clean.side_classes;

import use_abstract_class_to_clean.Employee;
import use_abstract_class_to_clean.side_classes.EmployeeReCord;
import use_abstract_class_to_clean.side_classes.Money;

public class SalariedEmployee extends Employee {
    public SalariedEmployee(EmployeeReCord r) {
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
