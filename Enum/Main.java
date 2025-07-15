public class Main {
    public static void main(String[] args) {
        /*Day d = Day.FRIDAY;
        int ordinal = d.ordinal();
        System.out.println(ordinal);
        String name = d.name();
        System.out.println(name);
        System.out.println(d);*/

        Day monday = Day.FRIDAY;
        switch (monday){
            case MONDAY -> {
                System.out.println("this is Monday");
            }
            case TUESDAY -> {
                System.out.println("this is Tuesday");
            }
            default -> System.out.println("this is not a day");
        }

    }
}
