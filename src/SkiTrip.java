public class SkiTrip extends Trip
{
    public SkiTrip(){}

    private Boolean includesFreeHotChocolate;
    private int liftCardPrice;

    public SkiTrip(String location, int durationInDays, String vacationType, int vacationid, Boolean includesFreeHotChocolate, int liftCardPrice)
    {
        super(location, durationInDays, vacationType, vacationid);
        this.includesFreeHotChocolate = includesFreeHotChocolate;
        this.liftCardPrice = liftCardPrice;
    }

}
