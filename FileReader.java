import java.io.File;
import java.io.FileNotFoundException;
import java.util.PriorityQueue;
import java.util.Scanner;

public class FileReader {

    private Scanner fIn;
    private int numOfWeeks;
    private int numOfEmployees;
    private PriorityQueue<Integer> qu;
    private Employee[] arr;

    /**
     * Constructor for FileReader.
     *
     * @param fPath is the path to the file.
     * @throws FileNotFoundException if the file is not found.
     */
    public FileReader(String fPath)throws FileNotFoundException {
        fIn = new Scanner(new File(fPath));

        numOfWeeks = fIn.nextInt();
        numOfEmployees = fIn.nextInt();
        arr = new Employee[numOfWeeks];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = new Employee(fIn.nextInt());
        }
    }

    /**
     * Retrieves the arr.
     *
     * @return arr
     */
    public Employee[] getArr () { return arr; }

    /**
     * Retrieves the number of total weeks.
     *
     * @return numOfWeeks
     */
    public int getNumOfWeek() {return numOfWeeks;}

    /**
     * Retrieves the number of total employees.
     *
     * @return numOfEmployees
     */
    public int getNumOfEmployees() {return numOfEmployees;}
}
