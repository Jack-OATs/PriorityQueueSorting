import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Driver {

    public static void main(String[] args)throws FileNotFoundException {
        int weeks;
        int employees;
        FileReader fr;
        Comparator<Employee> comp;
        PriorityQueue<Employee> qu;

        if(args.length != 1) {
            System.out.println("Not a valid number of params in args");
        }
        else {
            fr = new FileReader(args[0]);
            weeks = fr.getNumOfWeek();
            employees = fr.getNumOfEmployees();
            qu = new PriorityQueue<Employee>(weeks);
            Employee[] arr = fr.getArr();

            for(int i = 0; i < employees; i++) {
                qu.add(arr[i]);
            }

            for(int i = 0; i < weeks; i++) {

                Employee te = new Employee(arr[i].getEmployeeId());

                Employee[] a = new Employee[qu.size()];
                a = qu.toArray(a);

                for(int j = 0; j < a.length; j++) {
                    if(a[j].equals(te)) {
                        a[j].inc();
                        break;
                    }
                }

                qu.clear();
                for(int k = 0; k < a.length; k++) {
                    qu.add(a[k]);
                }


                System.out.println(qu.peek());
            }

        }



    }

}
