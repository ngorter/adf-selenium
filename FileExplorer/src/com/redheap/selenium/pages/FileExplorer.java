package com.redheap.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileExplorer extends PageObject {

    // TODO: AdfFinder for ADF component ID lookups with knowledge how NamingContainers and pseudo-elements work
    private By contentViewTabs = By.id("fe:contentViews:contentViewTab");
    private By treeTableTab = By.id("fe:contentViews:contentsTreeTable::ti");

    public FileExplorer(WebDriver driver) {
        super(driver);
        String pageTitle = driver.getTitle();
        if (!"File Explorer".equals(pageTitle)) {
            throw new IllegalStateException("Not on FileExplorer page: " + pageTitle);
        }
    }

    public FileExplorer clickTreeTableTab() {
        System.out.println("Clicking TreeTable tab in content view panelTabbed");
        driver.findElement(treeTableTab).findElement(By.tagName("a")).click();
        waitForPpr();
        return this;
    }

}