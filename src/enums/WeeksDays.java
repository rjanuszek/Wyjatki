package enums;

public enum WeeksDays {

    PONIEDZIALEK("Poniedziałek"),
    WTOREK("Wtorek"),
    SRODA("Środa"),
    CZWARTEK("Czwartek"),
    PIATEK("Piątek"),
    SOBOTA("Sobota"),
    NIEDZIELA("Niedziela");

    private String name;

    WeeksDays(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
