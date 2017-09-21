package java8.api.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

/**
 * Created by james on 2017. 6. 12..
 */
public class StreamTutorial {

    private List<Employee> employees;

    public double getAvgOldVersion(){
        int sum =0;
        int count =0;

        for(Employee emp : employees){
            if(emp.getSalary() > 150){
                sum += emp.getSalary();
                count++;
            }
        }

        return (double) sum / count;
    }

    public double getAvgUsingStream(){
        return employees.stream()
                .filter(employee -> (employee.getSalary() > 150))
                .mapToInt(Employee::getSalary)
                .average().getAsDouble();
    }


    public void setEmployees(int... values){
        this.employees = new ArrayList<>();
        for (int value : values){
            employees.add(new Employee(value));
        }
    }

}
