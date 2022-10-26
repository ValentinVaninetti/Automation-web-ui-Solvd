package com.solvd.interfaces.Icomponents;

import com.solvd.pages.CoinsPage;
import com.solvd.pages.PremiumPage;
import com.solvd.pages.TalkPage;

public interface INavbarComponent {
    boolean isNavbarDisplayed();

    void clickSettingsButton();

    void clickDarkThemeButton();

    void scrollDownNavbarMenu();

    void clickRegisterOrLoginButton();

    CoinsPage clickCoinsButton();

    PremiumPage clickPremiumButton();

    TalkPage clickTalkButton();
}
