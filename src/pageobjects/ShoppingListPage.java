//package pageobjects;
//
//import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.MobileElement;
//import io.appium.java_client.pagefactory.AndroidFindBy;
//import java.util.Arrays;
//import java.util.List;
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//
//
//public class ShoppingListPage extends BasePage {
//
//    public ShoppingListPage(AppiumDriver driver) {
//        super(driver);
//    }
//
//    @AndroidFindBy(accessibility = "Open navigation drawer")
//    private MobileElement mnuOptions;
//
//    @AndroidFindBy( xpath = "//android.widget.TextView[@text=\"New list\"]")
//    private MobileElement btnNewList;
//
//    @AndroidFindBy(accessibility = "Clean up list")
//    private MobileElement btnDelete;
//
//    @AndroidFindBy(id = "org.openintents.shopping:id/button_add_item")
//    private MobileElement btnAdd;
//
//    @AndroidFindBy(id = "org.openintents.shopping:id/autocomplete_add_item")
//    private MobileElement edtItem;
//
//    @FindBy(id = "org.openintents.shopping:id/edittext")
//    private MobileElement edtListNAme;
//
//    @FindBy(id = "android:id/button1")
//    private MobileElement btnOk;
//
//    @FindBy(xpath = "//android.widget.TextView[@text=\"My shopping list\"]")
//    private MobileElement btnMyShoppingList;
//
//    @FindBy(id = "org.openintents.shopping:id/snackbar_text")
//    private MobileElement txtDeleteConfirmMsg;
//
//    public void createNewListName(String listName){
//        mnuOptions.click();
//        btnNewList.click();
//        edtListNAme.clear();
//        edtListNAme.setValue(listName);
//        btnOk.click();
//    }
//
//    public void addItems(List<String> items){
//        for(String item : items) {
//        	edtItem.setValue(item);
//            btnAdd.click();
//        }
//    }
//
//    public void addItem(String item){
//    	edtItem.setValue(item);
//        btnAdd.click();
//    }
//
//
//    public void removeItemFromList(String listName, String item) {
//        openList(listName);
//        findAndRemoveItemFromList(item);
//    }
//
//    public void openList(String listName){
//    	mnuOptions.click();
//        WebElement name = driver.findElement(By.xpath("//android.widget.FrameLayout/android.widget.TextView[@text=\""+listName+"\"]"));
//        name.click();
//    }
//
//    public void findAndRemoveItemFromList(String item){
//        List<WebElement> fullList = driver.findElements(By.className("android.widget.LinearLayout"));
//        for(WebElement temp : fullList){
//            String tempValue = temp.findElement(By.xpath("//android.widget.RelativeLayout[2]/android.widget.TextView")).getText();
//            if(tempValue.equals(item)){
//                temp.findElement(By.xpath("//android.widget.RelativeLayout[1]/android.widget.CheckBox")).click();
//                btnDelete.click();
//                //verifyDeleteConfirmMessage();
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
//
//    public void sortAndVerifyItems(String listName, String[] expectedList){
//    	openList(listName);
//    	btnAdd.click();
//    	List<WebElement> itemsList = driver.findElements(By.xpath("//android.widget.RelativeLayout[2]/android.widget.TextView"));
//    	String[] actual = new String[itemsList.size()];
//    	int i = 0;
//    	for(WebElement item : itemsList) {
//    		actual[i++] = item.getText();
//    	}
//    	Assert.assertTrue(Arrays.equals(actual, expectedList));
//    }
//}
