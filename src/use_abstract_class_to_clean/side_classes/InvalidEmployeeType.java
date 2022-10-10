package use_abstract_class_to_clean.side_classes;

public class InvalidEmployeeType extends Exception {
    Type type;
    public InvalidEmployeeType(Type type) {
        this.type = type;
    }
}
