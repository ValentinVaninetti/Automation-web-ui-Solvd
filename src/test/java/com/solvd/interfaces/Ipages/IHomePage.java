package com.solvd.interfaces.Ipages;

import com.solvd.pages.SearchPage;
import com.solvd.pages.components.LoginComponent;
import com.solvd.pages.components.NavbarComponent;
import com.solvd.pages.components.PostComponent;

public interface IHomePage {
    LoginComponent clickOnLogin();

    NavbarComponent clickOnUserDropdown();

    String getBodyBackgroundColor();

    boolean isRegisterOrLoginMenuDisplayed();

    void clickOnSearch();

    SearchPage setSearch(String SEARCH);

    void navigateToHome();

    PostComponent clickFirstPost();

    boolean isChatBoxDisplayed();

    boolean isLoginComponentDisplayed();

    void clickLoginDiv();

    boolean isLoginButtonDisplayed();
}
