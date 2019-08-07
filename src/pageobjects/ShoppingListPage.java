package pageobjects;


import com.factory.Driver;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ShoppingListPage extends BasePage {

    public ShoppingListPage(AppiumDriver driver) {
        super(driver);
//        PageFactory.initElements(new AppiumFieldDecorator(Driver.driver), this);
        System.out.println("-----Test------");
    }


    @AndroidFindBy(accessibility = "Open navigation drawer")
    private MobileElement mnuOptions;

    @AndroidFindBy( xpath = "//android.widget.TextView[@text=\"New list\"]")
    private MobileElement btnNewList;

    @AndroidFindBy(accessibility = "Clean up list")
    private MobileElement btnDelete;

    @FindBy(id = "org.openintents.shopping:id/button_add_item")
    private MobileElement btnAdd;

    @AndroidFindBy(id = "org.openintents.shopping:id/autocomplete_add_item")
    private MobileElement edtItem;

    @FindBy(id = "org.openintents.shopping:id/edittext")
    private MobileElement edtListNAme;

    @FindBy(id = "android:id/button1")
    private MobileElement btnOk;

    @FindBy(xpath = "//android.widget.TextView[@text=\"My shopping list\"]")
    private MobileElement btnMyShoppingList;

    @FindBy(id = "org.openintents.shopping:id/snackbar_text")
    private MobileElement txtDeleteConfirmMsg;


//    public void createNewList(String listName){
//        createNewListName(listName);
////        for(String item : items){
////            addItem(item);
////        }
////        click(btnAdd);
//    }


    public void createNewListName(String listName){

//        click(mnuOptions);
//        click(btnNewList);
//        clearText(edtListNAme);
//        writeText(edtListNAme, listName);
//        click(btnOk);

        mnuOptions.click();
        btnNewList.click();
        edtListNAme.clear();
        edtListNAme.setValue(listName);
        btnOk.click();
    }
//
//    public void addItems(List<String> items){
//        for(String item : items) {
//            writeText(edtItem, item);
//            click(btnAdd);
//        }
//    }

//    public void removeItemFromList(String listName, String item) {
//        openList(listName);
//        findAndSelectItemFromList(item);
//    }
//
//    public void openList(String listName){
//        click(mnuOptions);
//        WebElement name = driver.findElement(By.xpath("//android.widget.TextView[@text=\""+listName+"\"]"));
//        name.click();
//    }
//
//    public void findAndSelectItemFromList(String item){
//        List<WebElement> fullList = driver.findElements(By.className("android.widget.LinearLayout"));
//        for(WebElement temp : fullList){
//            String tempValue = temp.findElement(By.xpath("//android.widget.RelativeLayout[2]/android.widget.TextView")).getText();
//            if(tempValue.equals(item)){
//                temp.findElement(By.xpath("//android.widget.RelativeLayout[1]/android.widget.CheckBox")).click();
//                btnDelete.click();
//                verifyDeleteConfirmMessage();
//                break;
//            }
//        }
//    }
//
//    public void verifyDeleteConfirmMessage(){
//        String expected = "Removed 1 item. Use \"Pick Items\" to reuse some later.";
//        String actual = txtDeleteConfirmMsg.getText();
//        Assert.assertEquals(actual, expected);
//    }
//
//    public void itemsSortAndVerify(){
//
//    }
}
