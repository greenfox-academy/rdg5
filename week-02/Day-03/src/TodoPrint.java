import java.util.ArrayList;

public class TodoPrint {
    public static void main(String... args) {
        String todoText = "- Buy milk\n";
        // Add "My todo:" to the beginning of the todoText
        // Add " - Download games" to the end of the todoText
        // Add " - Diablo" to the end of the todoText but with indention

        // Expected outpt:

        // My todo:
        //  - Buy milk
        //  - Download games
        //      - Diablo

        ArrayList<String> todoTask = new ArrayList<String>();
        String task1 = "- Buy milk\n";
        String task2 = "-  Download games\n";
        String task3 = "-    Diablo";
        todoTask.add(task1 + task2 + task3);
        System.out.println(todoTask);
    }
}