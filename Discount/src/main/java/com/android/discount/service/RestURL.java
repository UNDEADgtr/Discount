package com.android.discount.service;


public class RestURL {

    public static final String TAG = RestURL.class.getSimpleName();

    private static final String BASE_URL = "http://192.168.1.2:8080";

    public static final String PRODUCTS_URL = BASE_URL + "/products";

    public static final String PRODUCTS_BY_ID_URL = PRODUCTS_URL + "/{id}";

    public static final String PRODUCTS_BY_END_ID_URL = PRODUCTS_URL + "?endId={endId}";

    public static final String PRODUCTS_BY_START_END_ID_URL = PRODUCTS_URL + "?startId={startId}&endId={endId}";

    public static final String CATEGORIES_URL = BASE_URL + "/categories";

    public static final String CATEGORIES_BY_ID_URL = CATEGORIES_URL + "/{id}";

    public static final String USERS_URL = BASE_URL + "/users";

    public static final String USERS_BY_ID_URL = USERS_URL + "/{id}";

    public static final String COMPANIES_URL = BASE_URL + "/companies";

    public static final String COMPANIES_BY_ID_URL = COMPANIES_URL + "/{id}";

    public static final String COMPANIES_BY_END_ID_URL = COMPANIES_URL + "?endId={endId}";

    public static final String COMPANIES_BY_START_END_ID_URL = COMPANIES_URL + "?startId={startId}&endId={endId}";
}

