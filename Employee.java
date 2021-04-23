import java.util.Comparator;

public class Employee implements Comparable<Employee> {

    private int employeeId;
    private int numOfAwards;

    /**
     * Constructor for Employee class.
     *
     * @param id is the id of the employee.
     */
    public Employee(int id) {
        employeeId = id;
        numOfAwards = 0;
    }

    /**
     * Overrides the default toString method.
     *
     * @return the string of the employee id and number of awards.
     */
    public String toString() {
        return employeeId + " " + numOfAwards;
    }

    /**
     * Increments the number of awards counter.
     */
    public void inc() {
        numOfAwards++;
    }

    /**
     * Retrieves the number of awards.
     *
     * @return numOfAwards
     */
    public int getNumOfAwards() {
        return numOfAwards;
    }

    /**
     * Retrieves the number of awards.
     *
     * @return numOfAwards
     */
    public int getEmployeeId() {
        return employeeId;
    }

    /**
     * Overrides the compareTo method.
     *
     * @param o is the other object of type Employee
     * @return an integer based of the test cases.
     */
    @Override
    public int compareTo(Employee o) {
//        int max = 0;

        if(this.getNumOfAwards() < o.getNumOfAwards()) {
            return 1;
        }
        else if (this.getNumOfAwards() > o.getNumOfAwards()) {
            return -1;
        }
        else if(this.getNumOfAwards() == o.getNumOfAwards() && this.getEmployeeId() < o.getEmployeeId()) {
            return -1;
        }
        return 1;
    }

    /**
     * Tests to see if one id equals another.
     *
     * @param o is the other object of type Employee
     * @return a boolean based on the test case.
     */
    public boolean equals(Employee o) {
        return this.employeeId == o.employeeId;
    }

    /**
     * Overrides default hashcode.
     *
     * @return an int that is the object's hash.
     */
    public int hashCode() {
        return employeeId * 50;
    }

}
