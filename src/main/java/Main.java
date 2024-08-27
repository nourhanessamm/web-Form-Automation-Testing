import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
        driver.manage().window().maximize();
        Thread.sleep(3000); //stop the code for 3 secs
       WebElement Web_Form = driver.findElement(By.className("display-6")); // it locates a webElement
       String title_name = Web_Form.getText();
        System.out.println(title_name);
        if (title_name.equals("Web form"))
        {
            System.out.println("Test case passed");
        }
        else
        {
            System.out.println("Test case failed");
        }
      WebElement Text_input =  driver.findElement(By.id("my-text-id"));
        Text_input.sendKeys("Nourhan Essam");
        WebElement Password = driver.findElement(By.name("my-password"));
        Password.sendKeys("1234");
        WebElement Textarea = driver.findElement(By.xpath("//textarea[@name='my-textarea']"));
        Textarea.sendKeys("here is my text area");
        WebElement index = driver.findElement(By.linkText("Return to index"));
        index.click();
        Thread.sleep(3000);
        WebElement blank_html_select = driver.findElement(By.linkText("blank.html"));
        blank_html_select.click();
        Thread.sleep(3000);
        driver.navigate().back(); // to navigate to the index page
        Thread.sleep(3000);
        driver.navigate().back(); // to navigate to the home page
        WebElement DropDown_1 = driver.findElement(By.className("form-select")); //locate dropdown
        Select DropDown_options = new Select(DropDown_1);
        DropDown_options.selectByIndex(1);
        WebElement choose_file = driver.findElement(By.name("my-file"));
        //path1 : desktop :
        //path2 : file name :
        //path3 : Extensions : if there is like .html "file type" but here i donot specify it as its a file folder
        choose_file.sendKeys("C:\\Users\\user\\Desktop\\webform_testing");
        WebElement Check_box = driver.findElement(By.xpath("(//div[@class='form-check'])[1]"));
        driver.manage().timeouts().implicitlyWait((Duration.ofSeconds(3))); //waits until page is loaded
        Check_box.click();
        WebElement Submit_btn = driver.findElement(By.xpath("//button[@type='submit']"));
        Submit_btn.click();
        driver.manage().timeouts().implicitlyWait((Duration.ofSeconds(6)));
        driver.quit(); // to close all the taps


    }


}
