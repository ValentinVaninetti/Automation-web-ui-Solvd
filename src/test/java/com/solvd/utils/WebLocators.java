package com.solvd.utils;

import org.openqa.selenium.By;

public class WebLocators {

    //******************* HOME PAGE LOCATORS *********************//

    public static final String BUTTON_FIRST_POST = "//div[1]/div[5]/div[1]/div/div";
    public static final String HEADER_USER_DROPDOWN = "header-user-dropdown";
    public static final String CHAT_BOX_DISPLAYED = "//body/div[5]/div/div";

    //****************** CATEGORY PAGE LOCATORS ****************//

    public static final String NEAR_YOU_CAT = "\"//div[@data-redditstyle='false']/div/div/ul/li[2]/a\"";
    public static final String SPORT_CAT = "//div[@data-redditstyle='false']/div/div/ul/li[3]/a";
    public static final String GAMING_CAT = "//div[@data-redditstyle='false']/div/div/ul/li[4]/a";
    public static final String NEWS_CAT = "//div[@data-redditstyle='false']/div/div/ul/li[5]/a";
    public static final String FIRST_NEAR_YOU = "//div[2]/div/ol/li[1]/a";
    public static final String FIRST_SPORTS = "//div[2]/div/ol/li[1]/a";
    public static final String FIRST_GAMING = "//div[2]/div/ol/li[1]/a";
    public static final String FIRST_NEW = "//div[2]/div/ol/li[1]/a";


    //******************* COINS PAGE LOCATORS **********************//
    public static final String BUTTON_COINS = "//div[2]/div/div/div[1]/div/button";

    //******************* PREMIUM PAGE LOCATORS ********************//
    public static final String BUTTON_PREMIUM = "//div[2]/div[2]/div/div/div[1]/div/div/button[1]";

    //****************** SEARCH PAGE LOCATORS **********************//
    public static final String FIRST_COMMENT_DIV = "//div[2]/div/div/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div[1]/div/div/div";
    public static final String FIRST_COMMUNITIES_DIV = "//div/div/div[2]/div/div[2]";
    public static final String ALL_POSTS_DIVS = "//div[1]/div/div[2]/div[2]/div/div[2]/div/div[2]/div/div/div[2]/div[1]/div[2]/div[1]";

    //***************** TALK PAGE LOCATORS ***********************//
    public static final String BUTTON_TALK_IN_PROGRESS = "//div[2]/div[1]/a/button";

    //**************** NAVBAR COMPONENT LOCATORS *****************//

    public static final String DROPDOWN_USER_MENU = "//div[@role=\"menu\"]";
    public static final String BUTTON_DROPDOWN_USER_SETTINGS = "//div[@role=\"menu\"]/div/button[2]";
    public static final String BUTTON_SETTINGS_DARK_THEME = "//button[@role=\"switch\"]";
    public static final String DROPDOWN_USER_REGISTER_OR_LOGIN = "//div[@role=\"menu\"]/div/button[5]";
    public static final String DROPDOWN_USER_MORE_BUTTON = "//div[@role=\"menu\"]/div/button[3]";
    public static final String DROPDOWN_USER_MORE_IOS = "//a[@href=\"https://reddit.onelink.me/MRHZ/b3d845e\"]";
    public static final String DROPDOWN_USER_MORE_ANDROID = "//a[@href=\"https://reddit.onelink.me/MRHZ/4c212f61\"]";
    public static final String CLICK_COINS_BUTTON = "//a[@href=\"/coins\"]";
    public static final String CLICK_PREMIUM_BUTTON = "//a[@href=\"/premium\"]";
    public static final String CLICK_TALK_BUTTON = "//a[@href=\"/talk\"]";

    //**************** LOGIN COMPONENT LOCATORS *********************//
    public static final String INPUT_USERNAME = "input[id=\"loginUsername\"]";
    public static final String INPUT_PASSWORD = "loginPassword";
    public static final String BUTTON_LOGIN_SESSION = "fieldset:nth-child(8) > button";
    public static final String BUTTON_LOGOUT = "//div[@role=\"menu\"]/div/button[5]";
    public static final String BUTTON_DROPDOWN_USER = "USER_DROPDOWN_ID";
    public static final String CSS_OPEN_LOGIN_BUTTON = "div > a[role=\"button\"]:nth-child(1)";
    public static final String LOGIN_MENU_DISPLAY = "//main";
    public static final String USERNAME_SPAN = "//div/button[@id=\"USER_DROPDOWN_ID\"]/span/span/span/span[1]";

    //***************** POST COMPONENT LOCATORS *******************//
    public static final String SHARE_POST_BUTTON = "/html/body/div[1]/div/div[2]/div[3]/div/div/div/div[2]/div[1]/div[2]/div[1]/div/div[6]/div[1]/div[1]/button";

    //***************** CSS COMPONENT LOCATORS **************//
    public static final String CSS_BACKGROUND = "//body/div/div[1]";
    public static final String CSS_SEARCH = "#header-search-bar";
    public static final String CSS_BUTTON_SEARCH_COMMENTS = " a:nth-child(2) > button";
    public static final String CSS_BUTTON_SEARCH_COMMUNITIES = " a:nth-child(3) > button";
    public static final String CSS_BUTTON_SEARCH_POSTS = " a:nth-child(1) > button";
    public static final String CSS_BUTTON_SEARCH_PEOPLE = " a:nth-child(4) > button";


}
