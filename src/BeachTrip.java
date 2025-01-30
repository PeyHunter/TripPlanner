public class BeachTrip extends Trip
{
    public BeachTrip()
    {
    }

    private Boolean inflatableAnimal;
    private int temp;


    public BeachTrip(String location, int durationIndays, String vacationType, int vacationId, Boolean inflatableAnimal, int temp)
    {
        super(location, durationIndays, vacationType, vacationId);
        this.inflatableAnimal = inflatableAnimal;
        this.temp = temp;
    }

    @Override
    public String toString()
    {

        return "Vacation type: " + vacationType + "\n" +
                "Location: " + location + "\n" +
                "Duration: " + durationInDays + "\n" +
                "selected ID number: " + vacationID + "\n";
    }


}
