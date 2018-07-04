package MavenHomework;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.server.handler.ClickElement;
import org.testng.Assert;

public class TestSuite extends BaseTest {


    @Test
    public void VerifyUserShouldBeAbleToRegisterSuccessfully() {
        ClickOnElement(By.linkText("Register"));
        ClickOnElement(By.id("gender-female"));
        entertext(By.id("FirstName"), "Meghna");
        entertext(By.id("LastName"), "Doshi");
        selectFromDropDown("DateOfBirthDay", "16");
        selectFromDropDown("DateOfBirthMonth", "October");
        selectFromDropDown("DateOfBirthYear", "1980");
        entertext(By.id("Email"), "generateEmail");
        entertext(By.id("Company"), "Daffodil");
        ClickOnElement(By.id("Newsletter"));
        entertext(By.id("Password"), "rose3454");
        entertext(By.id("ConfirmPassword"), "rose3454");
        ClickOnElement(By.id("register-button"));

        Assert.assertEquals(getTextFromElement(By.linkText("Register")), "Register");
    }

     @Test
     public void VerifyUserShouldBeAbleToCompare2Items(){
        ClickOnElement(By.className("button-2 product-box-add-to-cart-button"));
        ClickOnElement(By.linkText("product comparison"));
        ClickOnElement(By.xpath("//img[@alt=nopCommerce demo store]"));
        ClickOnElement(By.xpath("//*@class='item grid']/div[4]/div/div[2]/div[3]/div[2]/input[2]"));
        Assert.assertEquals(getTextFromElement(By.className("content")), "The product has been added to your product comparison");
        ClickOnElement(By.linkText("product comparison"));


     }
     @Test
     public void VerifyUserShouldbeAbleToClearTheProductList(){
         ClickOnElement(By.linkText("product comparison"));
         ClickOnElement(By.className("clear-list"));
         Assert.assertEquals(getTextFromElement(By.className("no-data")), "You have no items to compare.");

     }
     @Test
     public void VerifyUserShouldBeAbleToSortBooksCategoryByLowToHighAndCompareTheValue(){
         ClickOnElement(By.linkText("Books"));
         selectFromDropDown("products-orderby","0");
         selectFromDropDown("products-pagesize", "3");
         Assert.assertEquals(getTextFromElement(By.className("price actual-price")),"$24.00 $27.00 $51.00");
         Assert.assertEquals(getTextFromElement(By.xpath("//*[contains(text(),$51.00)]")),"$51.00");

    }
     @Test
     public void VerifyUserShouldBEableToSeeAppleICamInShoppingCart(){
        ClickOnElement(By.linkText("Electronics"));
        ClickOnElement(By.linkText("Camera & photo"));
        ClickOnElement(By.linkText("Apple iCam"));
        ClickOnElement(By.id("Add to cart"));
        Assert.assertEquals(getTextFromElement(By.className("Content")), "The product has been added to your shopping cart");
        ClickOnElement(By.linkText("shopping cart"));
        Assert.assertEquals(getTextFromElement(By.className("sku-number")), "APPLE_CAM");


     }


    }











