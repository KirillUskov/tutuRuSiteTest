package pageObjects;

import autoTest.BasePage;
import autoTest.webElements.Button;
import autoTest.webElements.TextBox;
import contants.MainPageLocators;

public class MainPage extends BasePage {

    public MainPage(String locator, String siteUrl) {
        super(locator, siteUrl);
    }

    public void clickOnBusButton() {
        Button busButton = new Button(MainPageLocators.BUS_BUTTON_XPATH);
        busButton.clickElement();
    }

    public void setDepartureCity(String city) {
        TextBox departureCityTextBox = new TextBox(MainPageLocators.RU_DEPARTURE_TEXTBOX_XPATH);
        departureCityTextBox.clickElement();
        departureCityTextBox.sendText(city);
    }

    public void setDestinationCity(String city) {
        TextBox destinationCityTextBox = new TextBox(MainPageLocators.RU_DESTINATION_TEXTBOX_XPATH);
        destinationCityTextBox.clickElement();
        destinationCityTextBox.sendText(city);
    }

    public void setDate(String date) {
        TextBox dateTextBox = new TextBox(MainPageLocators.DATE_TEXTBOX_XPATH);
        dateTextBox.clickElement();
        dateTextBox.sendText(date);
    }

    public void addPassengers(int adultPassengersAmount, int childPassengersAmount) {
        if (adultPassengersAmount > 1 || childPassengersAmount > 0) {
            TextBox passengersAmountTextBox = new TextBox(MainPageLocators.PASSENGERS_AMOUNT_TEXTBOX_XPATH);
            passengersAmountTextBox.clickElement();
            checkAdultPassengers(adultPassengersAmount);
            checkChildPassengers(childPassengersAmount);
        }
    }

    private void checkAdultPassengers(int adultPassengersAmount) {
        if (adultPassengersAmount > 1) {
            Button plusAdultPassengerButton = new Button(MainPageLocators.PLUS_ADULT_PASSENGER_BUTTON_XPATH);
            System.out.println("Element text: " + plusAdultPassengerButton.getElementText());

            for (int i = 1; i < adultPassengersAmount; i++) {
                plusAdultPassengerButton.clickElement();
            }
        }
    }

    private void checkChildPassengers(int childPassengersAmount) {
        if (childPassengersAmount > 0) {
            Button plusChildPassengerButton = new Button(MainPageLocators.PLUS_CHILD_PASSENGER_BUTTON_XPATH);
            System.out.println("Element text: " + plusChildPassengerButton.getElementText());

            for (int i = 1; i <= childPassengersAmount; i++) {
                plusChildPassengerButton.clickElement();
            }
        }
    }

    public void searchTickets() {
        Button searchingTicketsButton = new Button(MainPageLocators.FIND_TICKETS_BUTTON_XPATH);
        searchingTicketsButton.clickElement();
    }

}
