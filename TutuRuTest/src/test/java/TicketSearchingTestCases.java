import contants.MainPageLocators;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObjects.MainPage;

public class TicketSearchingTestCases extends BaseTest {
    private MainPage mainPage;

    @DataProvider(name = "checkBusTickets")
    public Object[][] setCity() {
        return new Object[][] {{"Москва", "Санкт-Петербург", "25.09.2020", 1, 2},
                                    {"Санкт-Петербург", "Таллин", "01.10.2020", 3, 0}};
    }

    @BeforeClass
    public void pagesInitialisation() {
        mainPage = new MainPage(MainPageLocators.BUS_BUTTON_XPATH, siteUrl);
    }

    @Test (dataProvider = "checkBusTickets")
    public void findBusTickets(String departureCity, String destinationCity, String date,
                                                 int adultPassengersAmount, int childPassengersAmount) {
        mainPage.openPage();
        mainPage.clickOnBusButton();

        mainPage.setDepartureCity(departureCity);
        mainPage.setDestinationCity(destinationCity);
        mainPage.setDate(date);
        mainPage.addPassengers(adultPassengersAmount, childPassengersAmount);

        mainPage.searchTickets();
    }
}
