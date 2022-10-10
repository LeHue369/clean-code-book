package use_abstract_class_to_clean;

import use_abstract_class_to_clean.side_classes.EmployeeReCord;
import use_abstract_class_to_clean.side_classes.InvalidEmployeeType;

public interface EmployeeFactory {
    Employee makeEmployee(EmployeeReCord r) throws InvalidEmployeeType;
}
