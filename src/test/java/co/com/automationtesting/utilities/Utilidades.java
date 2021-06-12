package co.com.automationtesting.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Utilidades {
    public static void typeInField(WebElement field, String value){
        String val = value;
        field.click();
        field.clear();
        for (int i = 0; i < val.length(); i++){
            char c = val.charAt(i);
            String s = new StringBuilder().append(c).toString();
            field.sendKeys(s);
        }
    }

    public static void waitOwn(long time) {
        try{
            Thread.sleep(time);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public static void clickElement(WebDriver driver, String locator, String type){
        switch (type){
            case "id":
                driver.findElement(By.id(locator)).click();
                break;
            case "name":
                driver.findElement(By.name(locator)).click();
                break;
            case "className":
                driver.findElement(By.className(locator)).click();
                break;
            case "xpath":
                driver.findElement(By.xpath(locator)).click();
                break;
            case "linkText":
                driver.findElement(By.linkText(locator)).click();
                break;
            default:
                driver.findElement(By.id(locator)).click();
        }
    }

    public static  void selectRadio(WebDriver driver, List<WebElement> radios, String value) {
        for(int i = 0; i< radios.size(); i++){
            if(radios.get(i).getAttribute("value").equals(value)) {
                radios.get(i).click();
                break;
            }
        }
    }

    public static void selectCheckBox(WebDriver driver, String list, String regex, List<WebElement> locatorList) {
        List<String> userList = new ArrayList<>();
        userList.addAll(Arrays.asList(list.split(regex)));
        for (int i = 0; i< locatorList.size(); i++){
            for(String hobbie: userList){
                if(locatorList.get(i).getText().toLowerCase().equals(hobbie)){
                    driver.findElement(By.xpath("//div[@class=\"col-md-4 col-xs-4 col-sm-4\"]/div["+(i+1)+"]/input")).click();
                    break;
                }
            }
        }
    }

}
