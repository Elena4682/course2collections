package pro.sky.course2collections;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public interface EmployeeService {
    Employee add(String firstName, String lastName);
    Employee delete(String firstName, String lastName);
    Employee find (String firstName, String lastName);
    Collection<Employee> findAll();
}
