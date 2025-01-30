public abstract class  Trip
{

    public Trip()
    {}

    protected String location;
    protected int durationInDays;
    protected String vacationType;
    protected int vacationID;

    public Trip(String location, int durationInDays, String vacationType, int vacationID)
    {
        this.location = location;
        this.durationInDays = durationInDays;
        this.vacationType = vacationType;
        this.vacationID = vacationID;
    }


    public String getLocation()
    {
        return location;
    }

    public int getDurationDays(){
        return durationInDays;
    }

    public String getVacationType(){
        return vacationType;
    }

    public int getVacationID()
    {
        return vacationID;
    }

   // public String toString();

}
