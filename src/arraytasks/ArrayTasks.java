package arraytasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayTasks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Task 1
       String[] Grades = new String[4];
       Grades[0] = "A";
       Grades[1] = "B";
       Grades[2] = "D";
       Grades[3] = "F";
       
       System.out.println(Arrays.toString(Grades));
   
       List<String> list = new ArrayList<>();
       list.addAll(Arrays.asList(Grades));
       list.add(2, "C");
       
       Grades = list.toArray(new String[list.size()]);
       System.out.println(Arrays.toString(Grades));
       
       //Task 2
       String[] Subjects = new String[3];
       Subjects[0] = "English";
       Subjects[1] = "Math";
       Subjects[2] = "Science";
       
       System.out.println(Arrays.toString(Subjects));
       
       List<String> list2 = new ArrayList<>();
       list2.addAll(Arrays.asList(Subjects));
       list2.add(3, "P.E");
       list2.add(4, "DT");
       
       Subjects = list2.toArray(new String[list2.size()]);
       System.out.println(Arrays.toString(Subjects));
    }
    
}
