//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        TripList tripList = new TripList();
        tripList.tripList();
        boolean running = true;

        while (running)
        {
            System.out.println("Menu");
            System.out.println("1. Create a trip");
            System.out.println("2. List avalible Trips");
            System.out.println("Exit");

            int choice = scanner.nextInt();

            switch (choice)
            {
                 case 1:
                     System.out.print("Enter vacation type");
                     String type = scanner.nextLine();

                     scanner.nextLine();

                     System.out.print("Enter trip location ");
                     String location = scanner.nextLine();


                     System.out.print("Enter trip duration in days: ");
                     int duration  = scanner.nextInt();

                     System.out.print("Enter ID nr: ");
                     int id  = scanner.nextInt();

                     scanner.nextLine();

                     //add to tripList:

                     tripList.addTripToList(location, type, duration, id);


                     System.out.println("\nTrip added succesfully");

                     Trip createdTrip = tripList.getTrips().get(tripList.getTrips().size() - 1);
                     System.out.print("\n You have ordered this trip");
                     System.out.println(createdTrip);

                     saveTripToFile(createdTrip);
                     break;


                case 2:
                    // List all trips
                    System.out.println("\nList of trips:");
                    System.out.println(tripList);
                    break;

                case 3:
                    // Exit the program
                    System.out.println("Exiting...");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid option. Please try again.\n");
                    break;





            }


        }
scanner.close();



    }
        private static void saveTripToFile (Trip trip)
        {
            File file = new File("trips.txt");

            try (FileWriter fileWriter = new FileWriter(file, true))
            {
                fileWriter.write(trip.toString());
                fileWriter.write("\n");
            } catch (Exception e)
            {
                e.printStackTrace();
            }
        }
}
