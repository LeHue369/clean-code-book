package use_abstract_class_to_clean.side_classes;

import use_abstract_class_to_clean.Employee;

public class CommissionedEmployee extends Employee {
    public CommissionedEmployee(EmployeeReCord r) {
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
