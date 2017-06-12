package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

/**
 * Created by james on 2017. 6. 12..
 */
public class StreamTutorial {

    List<Employee> employees;

    public double getAvgOldVersion(){

        setEmployees();

        int sum =0;
        int count =0;

        for(Employee emp : employees){
            if(emp.getSalary() > 150){
                sum += emp.getSalary();
                count++;
            }
        }

        double avg = (double) sum / count;

        return avg;
    }

    public double getAvgUsingStream(){
        setEmployees();
        OptionalDouble average = employees.stream().
                filter(x -> x.getSalary() > 150).
                mapToInt(x -> x.getSalary()).average();

        return average.getAsDouble();
    }

    private void setEmployees(){
        this.employees = new ArrayList<>();
        employees.add(new Employee(100));
        employees.add(new Employee(200));
        employees.add(new Employee(300));
    }

}
