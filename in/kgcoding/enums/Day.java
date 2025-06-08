package in.kgcoding.enums;

public enum Day {
    MONDAY(true),
    TUSEDAY(true),
    WEDNESDAY(true),
    THURUSDAY(true),
    FRIDAY(true),
    SATURDAY(false),
    SUNDAY(false);
    private final boolean isweekday; 

    Day(boolean isweekday){
        this.isweekday = isweekday;
    }

    public String getType(){
        return  isweekday ? "Weekday" : "Weekend";
    }
}
