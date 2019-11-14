package NodalList;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * 
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        File iFile = new File("./src/main/Resources/input.txt");
        System.out.println(iFile.getAbsolutePath());
        Scanner reader;
        try {
            reader = new Scanner(iFile);
            while(reader.hasNextInt()) {
                list.add(reader.nextInt());
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File Problem");
            e.printStackTrace();
        }
        Collections.sort(list);
        showMenu(list);

        Boolean bInteract = true;
        while(bInteract) {
            try {
            Scanner input = new Scanner(System.in);  // Create a Scanner object
            System.out.println("What would you like to do? ");
            String iLine = input.nextLine();  // Read user input
            String[] iLineArr = iLine.split(" ");
            String cmd = iLineArr[0].toLowerCase();
            switch (cmd) {
                case "help":
                case "menu":
                    showMenu(list);
                    break;
                case "end":
                case "exit":
                    bInteract = false;
                    break;
                case "add":
                    addNode(list);
                    Collections.sort(list);
                    break;
                case "rem":
                    remNode(list);
                    break;
                case "save":
                    //save("output.txt");
                    break;
                default:
                    System.out.println("Unrecognized command: "+iLine);
            }
            } catch (FileNotFoundException e) {
                System.out.println("File Problem");
                e.printStackTrace();
            }
        }
    }

    public static void showMenu(LinkedList<Integer> list) {
        System.out.println("================================================================================");
        System.out.println("                      Linked List Nodal System                                  ");
        System.out.println("________________________________________________________________________________");
        System.out.println("CURRENT LIST");
        System.out.println("|  ID  |  VALUE  |");
        Integer id = 0;
        for(Integer node : list) {
            System.out.println("|  " + id++ + "  |  " + node + "  |");
        }
        System.out.println("________________________________________________________________________________");
        System.out.println("DIRECTIONS");
        System.out.println("  Add/Remove nodes.");
        System.out.println();
        System.out.println("  Type 'EXIT' to end it, where saves will be changed back to the file.");
        System.out.println("                    ----------------------------------------                    ");
        System.out.println("OPTIONS");
        System.out.println("  ADD - Add a Node by Value");
        System.out.println("  REM - Remove a Node by ID (order in list)");
        System.out.println("  MENU - Re-print this Menu");
        System.out.println("  EXIT - Exit the Program");
        System.out.println("________________________________________________________________________________");
        System.out.println("                        Elijah T. Rose | elirose@uab.edu                        ");
        System.out.println("================================================================================");
    }

    public static void addNode(LinkedList<Integer> list) throws FileNotFoundException {
        Integer node = getResponse("What number would you like to add?");
        if (node == null) {
            System.out.println("Cannot add item.");
        } else {
            list.add(node);
        }
    }
    public static void remNode(LinkedList<Integer> list) throws FileNotFoundException {
        Integer id = getResponse("What number (by ID order in list) would you like to remove?");
        if (node == null) {
            System.out.println("Cannot remove item.");
        } else {
            list.remove(id);
        }
    }

    public static int getResponse(String prompt) throws FileNotFoundException {
        System.out.println(prompt);
        Scanner reader = new Scanner(System.in);
        if (reader.hasNextInt()) {
            return reader.nextInt();
        } else {
            System.out.println("Unrecognized input.");
            return 0;
        }
    }
}
