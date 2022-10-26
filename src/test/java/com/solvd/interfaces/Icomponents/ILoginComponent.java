package com.solvd.interfaces.Icomponents;

import org.openqa.selenium.By;

public interface ILoginComponent {
    void setUsername(String username);

    void setPassword(String password);

    By getCSS_OPEN_LOGIN_BUTTON();

    String getUsername();
}
