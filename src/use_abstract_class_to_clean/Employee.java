package use_abstract_class_to_clean;

import use_abstract_class_to_clean.side_classes.Money;

public abstract class Employee {
    public abstract boolean isPayDay();
    public abstract Money calculatePay();
    public abstract void deviverPay(Money pay);
}
