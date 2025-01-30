import java.util.ArrayList;

public class TripList
{
    public TripList()
    {
    }

    private ArrayList<Trip> trips = new ArrayList<>();


    public TripList(ArrayList<Trip> trips)
    {
        this.trips = trips;
    }


    public void addTripToList(String location, String type, int duration, int id)
    {
        if (type.equalsIgnoreCase("Skiing"))
        {
            trips.add(new SkiTrip(location, duration, type, id, true, 000));
        }
        else if (type.equalsIgnoreCase("Beaching"))
        {
            trips.add(new BeachTrip(location, duration, type, id, true, 000));
        }
        else
        {
            System.out.print("Unknown vacation type");
        }
    }



    public void tripList()
    {
        trips.add(new SkiTrip("Bordue, France", 14, "Skiing", 1, true, 300));
        trips.add(new SkiTrip("Lucca, Italy", 7, "Skiing", 2, false, 500));
        trips.add(new SkiTrip("Prage, Hungary", 12, "Skiing", 3, true, 150));
        trips.add(new SkiTrip("Bergen, Norway", 5, "Skiing", 4, true, 1000));
        trips.add(new SkiTrip("Wein, Austria", 10, "Skiing", 5, false, 600));

        trips.add(new BeachTrip("Panama City, Panama", 10, "Beaching", 6, false, 35));
        trips.add(new BeachTrip("Majorca, Spanien", 7, "Beaching", 7, true, 29));
        trips.add(new BeachTrip("Bali, Indonesien", 14, "Beaching", 8, true, 32));
        trips.add(new BeachTrip("Puerto Escondido, Mexico", 22, "Beaching", 9, true, 28));
        trips.add(new BeachTrip("Blue Island, Maldiverne", 20, "Beaching", 10, false, 37));
    }


    public ArrayList<Trip> getTrips()
    {
        return trips;
    }

    ;


    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < trips.size(); i++)
        {
            Trip trip = trips.get(i);
            builder.append("Vacation Nr: ").append(trip.getVacationID()).append(" : ");
            builder.append("Type: ").append(trip.getVacationType()).append("\n");
            builder.append("Location: ").append(trip.getLocation()).append("\n");
            builder.append("Duration: ").append(trip.getDurationDays()).append(" days \n\n");
        }
        return builder.toString();
    }

}
