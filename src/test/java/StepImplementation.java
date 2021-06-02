import com.thoughtworks.gauge.Step;
import io.appium.java_client.MobileElement;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class StepImplementation extends BaseDriver {

    @Step("Click to Allow button.")
    public void clickAllow() {
        MobileElement el1 = driver.findElementById("com.android.packageinstaller:id/permission_allow_button");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        el1.click();
    }

    @Step("Accept cookies.")
    public void clickCookies() {
        MobileElement el2 = driver.findElementById("com.turkishairlines.mobile:id/frPrivacy_btnAccept");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        el2.click();

    }

    @Step("Click to get ticket button.")
    public void clickGetTicket() {
        MobileElement el3 = driver.findElementById("com.turkishairlines.mobile:id/acMain_btnBooking");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        el3.click();
    }

    @Step("Choose One way flight seleced. ")
    public void clickOneWay() {
        MobileElement el4 = driver.findElementById("com.turkishairlines.mobile:id/frDashboard_tvOneWay");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        el4.click();
    }

    @Step("Going direction is selected.")
    public void goingDirection() {

        MobileElement el6 = driver.findElementById("com.turkishairlines.mobile:id/frDashboard_llFrom");
        el6.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        MobileElement el7 = driver.findElementById("com.turkishairlines.mobile:id/frAirportSelection_etSearch");
        el7.click();
        el7.sendKeys("SAW");
        MobileElement element1 = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.RelativeLayout[2]/android.widget.TextView[2]");
        element1.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Step("Destination is selected.")
    public void destination() {

        MobileElement el8 = driver.findElementById("com.turkishairlines.mobile:id/frDashboard_llTo");
        el8.click();
        MobileElement el9 = driver.findElementById("com.turkishairlines.mobile:id/frAirportSelection_etSearch");
        el9.click();
        el9.sendKeys("ESB");
        MobileElement element2 = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.RelativeLayout[2]/android.widget.TextView[2]");
        element2.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Step("The date information is selected 2 days after the current date.")
    public void currentDateAddSomeDays() {
        MobileElement ele1 = driver.findElementById("com.turkishairlines.mobile:id/frDashboard_rlDeparture");
        ele1.click();

        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_MONTH, 2);
        int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);

        for (int i = 2; i < 7; i++) {
            for (int j = 1; i < 8; j++) {
                MobileElement ele5 = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.view.ViewGroup/android.view.ViewGroup[" + i + "]/android.widget.FrameLayout[" + j + "]/android.widget.TextView");
                String text = ele5.getText();
                if (Integer.parseInt(text) == dayOfMonth) {
                    ele5.click();
                    return;

                }
            }
        }

    }

    @Step("Click done button.")
    public void doneButton(){
        MobileElement el10 = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.Button");
        el10.click();
    }

    @Step("Select number of passengers.")
    public void passengerNum() {
        MobileElement passnum = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout[7]/android.widget.TextView");
        passnum.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Step("Search flights")
    public void searchFlight() {
        MobileElement flight = driver.findElementById("com.turkishairlines.mobile:id/frDashboard_btnSearch");
        flight.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Step("Economy flight is selected.")
    public void ecoFlightSelect() {
        MobileElement eco = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView[2]/android.view.ViewGroup[3]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]");
        eco.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        MobileElement eco1 = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView[2]/android.view.ViewGroup[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup");
        eco1.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    @Step("Click continue button.")
    public void continueButtonAndDone() {
        MobileElement done = (MobileElement) driver.findElementById("com.turkishairlines.mobile:id/frFlightSearch_btnContinue");
        done.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


}





