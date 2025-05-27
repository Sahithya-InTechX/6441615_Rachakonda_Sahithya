import java.util.HashMap;
import java.util.Scanner;

public class StudentMap {
    public static void main(String[] args) {
        HashMap<Integer, String> studentMap = new HashMap<>();
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter number of students: ");
            int count = scanner.nextInt();
            scanner.nextLine(); // consume newline
            
            for (int i = 0; i < count; i++) {
                System.out.print("Enter student ID: ");
                int id = scanner.nextInt();
                scanner.nextLine(); // consume newline
                System.out.print("Enter student name: ");
                String name = scanner.nextLine();
                studentMap.put(id, name);
            }
            
            System.out.print("Enter an ID to fetch name: ");
            int searchId = scanner.nextInt();
            if (studentMap.containsKey(searchId)) {
                System.out.println("Name: " + studentMap.get(searchId));
            } else {
                System.out.println("ID not found.");
            }
        }
    }
}
