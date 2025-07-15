public enum Day {
    SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;

    private String lower;

    public void display(){
        System.out.println("Today is "+this.name());
    }
}
