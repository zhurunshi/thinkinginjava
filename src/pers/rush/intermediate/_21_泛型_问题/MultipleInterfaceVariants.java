package pers.rush.intermediate._21_泛型_问题;

interface Payable<T> {}

class Employee implements Payable<Employee> {
    
}

/*class Hourly extends Employee implements Payable<Hourly> {
    // 意味着不能实现了相同的接口的两种变体
}*/

public class MultipleInterfaceVariants {

}
