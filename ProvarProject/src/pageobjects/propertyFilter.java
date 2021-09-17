package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="propertyFilter"                                
               , summary=""
               , connection="Admin"
               , lightningWebComponent="propertyFilter"
               , namespacePrefix=""
     )             
public class propertyFilter {

	@TextType()
	@FindBy(xpath = ".//c-property-filter//lightning-input//input[@type='text']")
	public WebElement searchKey;
	@TextType()
	@JavascriptBy(jspath = "return document.querySelector('app_flexipage-lwc-app-flexipage').shadowRoot.querySelector('app_flexipage-lwc-app-flexipage-internal').shadowRoot.querySelector('forcegenerated-adg-rollup_component___force-generated__flexipage_-app-page___-property_-explorer').shadowRoot.querySelector('forcegenerated-flexipage_property_explorer__js').shadowRoot.querySelector('flexipage-aura-template-wrapper').shadowRoot.querySelector('forcegenerated-flexipageregion_property_explorer_left__js').shadowRoot.querySelector('c-property-filter').shadowRoot.querySelector('lightning-slider').shadowRoot.querySelector('input')")
	public WebElement maxPrice;
	@TextType()
	@JavascriptBy(jspath = "return document.querySelector('app_flexipage-lwc-app-flexipage').shadowRoot.querySelector('app_flexipage-lwc-app-flexipage-internal').shadowRoot.querySelector('forcegenerated-adg-rollup_component___force-generated__flexipage_-app-page___-property_-explorer').shadowRoot.querySelector('forcegenerated-flexipage_property_explorer__js').shadowRoot.querySelector('flexipage-aura-template-wrapper').shadowRoot.querySelector('forcegenerated-flexipageregion_property_explorer_left__js').shadowRoot.querySelector('c-property-filter').shadowRoot.querySelectorAll('lightning-slider')[1].shadowRoot.querySelector('input')")
	public WebElement bedrooms;
	@TextType()
	@JavascriptBy(jspath = "return document.querySelector('app_flexipage-lwc-app-flexipage').shadowRoot.querySelector('app_flexipage-lwc-app-flexipage-internal').shadowRoot.querySelector('forcegenerated-adg-rollup_component___force-generated__flexipage_-app-page___-property_-explorer').shadowRoot.querySelector('forcegenerated-flexipage_property_explorer__js').shadowRoot.querySelector('flexipage-aura-template-wrapper').shadowRoot.querySelector('forcegenerated-flexipageregion_property_explorer_left__js').shadowRoot.querySelector('c-property-filter').shadowRoot.querySelectorAll('lightning-slider')[2].shadowRoot.querySelector('input')")
	public WebElement bathrooms;
	@ButtonType()
	@FindBy(xpath = ".//c-property-filter//button[normalize-space(.)='Reset']")
	public WebElement reset;
	
}
