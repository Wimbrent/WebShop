package Base;

import AccountPages.AccountPage;
import AccountPages.AffiliateAccountPage;
import AccountPages.MyAccount.ChangeYourPasswordPage;
import AccountPages.MyAccount.EditYourAccountInformationPage;
import AccountPages.MyAccount.ModifyYourAddressBookEntriesPage;
import AccountPages.MyAccount.ModifyYourWishListPage;
import AccountPages.MyOrders.*;
import AccountPages.NewsletterPage;
import Authorization.ForgottenPasswordPage;
import Authorization.LoginPage;
import Elements.*;
import Pages.*;
import Authorization.RegisterPage;
import Pages.CheckoutPage;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class BaseTest {

    public static WebDriver driver;

    public Alert alert;
    public HeaderElements headerElements;
    public SectionGoods sectionGoods;
    public CheckoutPage checkOutPage;
    public ViewCartPage viewCartPage;
    public ProductCategoryPage productCategoryPage;
    public ProductPage productPage;
    public ProductComparisonPage productComparisonPage;
    public Cart cart;

    public MyAccountMenu myAccountMenu;
    public RegisterPage registerPage;
    public LoginPage loginPage;
    public ForgottenPasswordPage forgottenPasswordPage;

    public AccountPage accountPage;
    public AffiliateAccountPage affiliateAccountPage;

    public EditYourAccountInformationPage editYourAccountInformationPage;
    public ChangeYourPasswordPage changeYourPasswordPage;
    public ModifyYourAddressBookEntriesPage modifyYourAddressBookEntriesPage;
    public ModifyYourWishListPage modifyYourWishListPage;

    public ViewYourOrderHistoryPage viewYourOrderHistoryPage;
    public OrderInformationPage orderInformationPage;
    public ProductReturnsPage productReturnsPage;
    public DownloadsPage downloadsPage;
    public YourRewardPointsPage yourRewardPointsPage;
    public YourTransactionsPage yourTransactionsPage;
    public ViewYourReturnRequestsPage viewYourReturnRequestsPage;
    public ReturnInformationPage returnInformationPage;
    public RecurringPaymentsPage recurringPaymentsPage;

    public NewsletterPage newsletterPage;

    @BeforeSuite
    public void setDriver() {
        System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver2");
        driver = new FirefoxDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.get("http://tutorialsninja.com/demo/index.php?route=common/home");
        driver.manage().window().fullscreen();
    }

    @BeforeMethod
    public void setMethod() {
        alert = new Alert(driver);
        myAccountMenu = new MyAccountMenu(driver);
        loginPage = new LoginPage(driver);
        registerPage = new RegisterPage(driver);
        accountPage = new AccountPage(driver);

        viewCartPage = new ViewCartPage(driver);
        headerElements = new HeaderElements(driver);
        checkOutPage = new CheckoutPage(driver);
        sectionGoods = new SectionGoods(driver);
        productCategoryPage = new ProductCategoryPage(driver);
        productPage = new ProductPage(driver);
        productComparisonPage = new ProductComparisonPage(driver);
        cart = new Cart(driver);

        editYourAccountInformationPage = new EditYourAccountInformationPage(driver);
        changeYourPasswordPage = new ChangeYourPasswordPage(driver);
        modifyYourAddressBookEntriesPage = new ModifyYourAddressBookEntriesPage(driver);
        modifyYourWishListPage = new ModifyYourWishListPage(driver);

        viewYourOrderHistoryPage = new ViewYourOrderHistoryPage(driver);
        orderInformationPage = new OrderInformationPage(driver);
        productReturnsPage = new ProductReturnsPage(driver);
        downloadsPage = new DownloadsPage(driver);
        yourRewardPointsPage = new YourRewardPointsPage(driver);
        yourTransactionsPage = new YourTransactionsPage(driver);
        viewYourReturnRequestsPage = new ViewYourReturnRequestsPage(driver);
        returnInformationPage = new ReturnInformationPage(driver);
        recurringPaymentsPage = new RecurringPaymentsPage(driver);
        forgottenPasswordPage = new ForgottenPasswordPage(driver);

        newsletterPage = new NewsletterPage(driver);
        affiliateAccountPage = new AffiliateAccountPage(driver);
    }

    @Attachment(type = "image/jpg")
    public void screenshot(String name) {
        Screenshot screenshot = new AShot().shootingStrategy
                (ShootingStrategies.viewportPasting(ShootingStrategies.scaling(2f), 1000)).takeScreenshot(driver);
        try {
            ImageIO.write(screenshot.getImage(),
                    "jpg", new File("/Users/wimbrent/IdeaProjects/Project/src/main/resources/Screens/" + name + ".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @AfterSuite
    public void close() {
        driver.quit();
    }

}