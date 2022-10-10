package use_abstract_class_to_clean;

import use_abstract_class_to_clean.side_classes.*;

public class EmployeeFactoryImpl implements EmployeeFactory{
    @Override
    public Employee makeEmployee(EmployeeReCord r) throws InvalidEmployeeType {
        switch (r.type){
            case COMMISSIONED:
                return new CommissionedEmployee(r);
            case HOURLY:
                return new HourlyEmployee(r);
            case SALARIED:
                return new SalariedEmployee(r);
            default:
                throw new InvalidEmployeeType(r.type);
        }
    }
}
