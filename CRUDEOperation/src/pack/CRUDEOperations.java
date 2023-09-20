package pack;


	import java.io.BufferedReader;
	import java.io.File;
	import java.io.FileReader;
	import java.io.FileWriter;
	import java.io.IOException;
	import java.util.Scanner;

	public class CRUDEOperations {

		public static void main(String[] args) {
			 Scanner scanner = new Scanner(System.in);
		        while (true) {
		            System.out.println("Select operation:");
		            System.out.println("1. Create File");
		            System.out.println("2. Read File");
		            System.out.println("3. Update File");
		            System.out.println("4. Delete File");
		            System.out.println("5. Exit");
		            int choice = scanner.nextInt();

		            switch (choice) {
		                case 1:
		                    createFile();
		                    break;
		                case 2:
		                    readFile();
		                    break;
		                case 3:
		                    updateFile();
		                    break;
		                case 4:
		                    deleteFile();
		                    break;
		                case 5:
		                    scanner.close();
		                    System.exit(0);
		                default:
		                    System.out.println("Invalid choice. Try again.");
		            }
		        }
		    }

		    private static void createFile() {
		        try {
		            Scanner scanner = new Scanner(System.in);
		            System.out.print("Enter the file name: ");
		            String fileName = scanner.nextLine();
		            System.out.print("Enter the content: ");
		            String content = scanner.nextLine();

		            FileWriter fileWriter = new FileWriter(fileName);
		            fileWriter.write(content);
		            fileWriter.close();

		            System.out.println("File created successfully.");
		        } catch (IOException e) {
		            System.out.println("An error occurred while creating the file.");
		        }
		    }

		    private static void readFile() {
		        try {
		            Scanner scanner = new Scanner(System.in);
		            System.out.print("Enter the file name to read: ");
		            String fileName = scanner.nextLine();

		            FileReader fileReader = new FileReader(fileName);
		            BufferedReader bufferedReader = new BufferedReader(fileReader);
		            String line;
		            while ((line = bufferedReader.readLine()) != null) {
		                System.out.println(line);
		            }
		            bufferedReader.close();

		        } catch (IOException e) {
		            System.out.println("An error occurred while reading the file.");
		        }
		    }

		    private static void updateFile() {
		        try {
		            Scanner scanner = new Scanner(System.in);
		            System.out.print("Enter the file name to update: ");
		            String fileName = scanner.nextLine();
		            System.out.print("Enter new content: ");
		            String content = scanner.nextLine();

		            FileWriter fileWriter = new FileWriter(fileName);
		            fileWriter.write(content);
		            fileWriter.close();

		            System.out.println("File updated successfully.");
		        } catch (IOException e) {
		            System.out.println("An error occurred while updating the file.");
		        }
		    }

		    private static void deleteFile() {
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter the file name to delete: ");
		        String fileName = scanner.nextLine();
		        File file = new File(fileName);

		        if (file.delete()) {
		            System.out.println("File deleted successfully.");
		        } else {
		            System.out.println("Unable to delete the file. It may not exist.");
		        }

		}

}
