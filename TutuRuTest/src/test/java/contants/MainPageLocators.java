package contants;

public class MainPageLocators {
    public static String BUS_BUTTON_XPATH = "//div[@data-content='bus']";
    public static String RU_DESTINATION_TEXTBOX_XPATH = "//span//input[@placeholder='Куда']";
    public static String RU_DEPARTURE_TEXTBOX_XPATH = "//span//input[@placeholder='Откуда']";
    public static String FIND_TICKETS_BUTTON_XPATH = "//button[@data-ti='submit-button']";
    public static String DATE_TEXTBOX_XPATH = "//input[@data-ti='date-input']";
    public static String PASSENGERS_AMOUNT_TEXTBOX_XPATH = "//input[@data-ti='passengers-input']";
    public static String PLUS_ADULT_PASSENGER_BUTTON_XPATH = "//div[@data-ti='adult-passengers-counter']//div[contains(text(),'+')]";
    public static String PLUS_CHILD_PASSENGER_BUTTON_XPATH = "//div[@data-ti='child-passengers-counter']//div[contains(text(),'+')]";

    private MainPageLocators() {}
}
