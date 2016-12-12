package com.easytox.automation.utils;

/**
 * Created by Alexander on 12.12.2016.
 */
public class MyLocatorsAndConstants {

    private MyLocatorsAndConstants(){}

    public static final class Locators{
        public static final String FIRST_NAME_LOCATOR = "firstName";
        public static final String LAST_NAME_LOCATOR = "lastName";
        public static final String DATE_OF_BIRTH_LOCATOR = "dateOfBirth";
        public static final String SELECT_STATUS_LOCATOR = "statusFlag";
        public static final String SELECT_PHYSICIAN_LOCATOR = "physician";
        public static final String CASE_ACC_LOCATOR = "#searchform > div:nth-child(3) > div:nth-child(1) > input";
        public static final String MED_REC_LOCATOR = "#searchform > div:nth-child(3) > div:nth-child(2) > input";
        public static final String SEARCH_BUTTON_LOCATOR = "searchbtn";
        public static final String TABLE_OF_RESULT_LOCATOR = "#searchresults > div > table";
        public static final String ADD_TEST_CODE_BUTTON_LOCATOR = "add";
        public static final String CONTAINER_LOCATOR = "loadingDiv";
        public static final String TITLE_LOCATOR = "exampleModalLabel";
        public static final String TEST_CODE_LOCATOR = "test_code";
        public static final String DESCRIPTION_LOCATOR = "description";
        public static final String COMPOUNDS_LOCATOR = "#compounds1 > span > span.selection > span > ul > li > input";
        public static final String TST_LOCATOR = "li:nth-child(1).select2-results__option.select2-results__option--highlighted";
        public static final String SUBMIT_BUTTON_LOCATOR = "#form > div.modal-footer > button.btn.btn-primary.btn-md";
        public static final String COMPOUND_HELP_BLOCK_LOCATOR = "#form > div.modal-body > div:nth-child(3) > div > small";
        public static final String HELP_BLOCK_ATTRIBUTE_LOCATOR = "data-bv-result";
        public static final String SUBMIT_ATTRIBUTE_LOCATOR = "disabled";
        public static final String CLOSE_BUTTON_LOCATOR = "#form > div.modal-footer > button.btn.btn-default";
        public static final String X_BUTTON_LOCATOR = "#addTestcodediv > div > button > span";
        public static final String TEST_CODE_COLUMN_LOCATOR = "#example > thead > tr > th:nth-child(1)";
        public static final String DESCRIPTION_COLUMN_LOCATOR = "#example > thead > tr > th:nth-child(2)";
        public static final String COMPOUNDS_COLUMN_LOCATOR = "#example > thead > tr > th:nth-child(3)";
        public static final String SORT_ATTRIBUTE_LOCATOR = "aria-sort";
        public static final String SORT_ATTRIBUTE_VALUE = "ascending";
        public static final String EDIT_BUTTON_LOCATOR = "#editbutton > i";
        public static final String COMPOUND_EDIT_LOCATOR = "#compounds1 > span > span.selection > span > ul > li.select2-selection__choice";
        public static final String COMPOUND_X_LOCATOR = "#compounds1 > span > span.selection > span > ul > span";
        public static final String COMPOUND_SELECT_LOCATOR = "li:nth-child(1).select2-results__option.select2-results__option--highlighted";
        public static final String UPDATE_BUTTON_LOCATOR = "#form1 > div.modal-footer > button.btn.btn-primary.btn-md";
        public static final String UPDATE_HELP_BLOCK_LOCATOR = "#maincontentdiv > div.page-body > div.alert.alert-success.fade.in";
        public static final String EDIT_CLOSE_BUTTON_LOCATOR = "#form1 > div.modal-footer > button.btn.btn-default";
        public static final String EDIT_X_BUTTON_LOCATOR = "#editTestcodediv > div > button > span";
        public static final String NEXT_BUTTON_LOCATOR = "#example_paginate > ul > li.next > a";
        public static final String PREVIOUS_BUTTON_LOCATOR = "#example_paginate > ul > li.prev > a";
        public static final String PAGINATE_1_LOCATOR = "//*[@id=\"example_paginate\"]/ul/li[2]";
        public static final String PAGINATE_2_LOCATOR = "//*[@id=\"example_paginate\"]/ul/li[3]";
        public static final String MAXIMIZE_BUTTON_LOCATOR = "#fullscreen-toggler > i";
        public static final String FULL_SCREEN_LOCATOR = "fullscreen-toggler";
        public static final String SIDEBAR_LOCATOR = "#maincontentdiv > div.page-header.position-relative > div.header-buttons > a.sidebar-toggler";
        public static final String SIDEBAR_ACTIVE_LOCATOR = "#maincontentdiv > div.page-header.position-relative > div.header-buttons > a.sidebar-toggler.active";
        public static final String REFRESH_BUTTON_LOCATOR = "#refresh-toggler";
        public static final String SEARCH_INPUT_LOCATOR = "//*[@id=\"example_filter\"]/label/input";
        public static final String MESSAGE_INFO_LOCATOR = "example_info";
        public static final String DROP_DOWN_LOCATOR = "example_length";
        public static final String PAGINATE_LOCATOR = "example_paginate";

        private Locators(){}
    }

    public static final class Value{
        public static final String DATE_OF_BIRTH_VALUE = "12/08/1993";
        public static final String SELECT_STATUS_VALUE = "InProcess";
        public static final String SELECT_PHYSICIAN_VALUE = "Madhukar Narahari";
        public static final String TITLE_VALUE = "Add Test Code";
        public static final String DESCRIPTION_VALUE = "description_data";
        public static final String DESCRIPTION_NEW_VALUE = "newDescription";
        public static final String COMPOUNDS_VALUE = "Tst";
        public static final String COMPOUND_HELP_BLOCK_VALUE = "INVALID";
        public static final String SUBMIT_ATTRIBUTE_VALUE = "true";
        public static final String EDIT_TITLE_VALUE = "Edit Test Code";
        public static final String FULL_SCREEN_VALUE = "fullscreen active";
        public static final String NORMAL_SCREEN_VALUE = "fullscreen";
        public static final String SIDEBAR_ACTIVE_VALUE = "sidebar-toggler active";
        public static final String SIDEBAR_VALUE = "sidebar-toggler";
        public static final String MESSAGE_VALUE = "Showing 0 to 0 of 0 entries";

        private Value(){}


    }
}
