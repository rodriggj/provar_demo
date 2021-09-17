package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="propertyTileList"                                
               , summary=""
               , connection="Admin"
               , lightningWebComponent="propertyTileList"
               , namespacePrefix=""
     )             
public class propertyTileList {

	@LinkType()
	@FindBy(xpath = ".//c-property-tile-list//c-property-tile[1]/a")
	public WebElement tileOne;
	
}
