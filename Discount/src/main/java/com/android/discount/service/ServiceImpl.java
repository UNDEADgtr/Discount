package com.android.discount.service;

import com.android.discount.model.Category;
import com.android.discount.model.Company;
import com.android.discount.model.Product;
import com.android.discount.model.User;

import org.springframework.http.converter.json.MappingJacksonHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ServiceImpl implements IService {

    /**
     * **************************************
     * <p/>
     * Company's CRUD
     * <p/>
     * ***************************************
     */

    @Override
    public Company createCompany(Company company) {
        return null;
    }

    @Override
    public List<Company> getCompanies() {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getMessageConverters().add(new MappingJacksonHttpMessageConverter());
        Company[] list = restTemplate.getForObject(RestURL.COMPANIES_URL, Company[].class);
        return new ArrayList<Company>(Arrays.asList(list));
    }

    @Override
    public List<Company> getCompanies(String endID) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getMessageConverters().add(new MappingJacksonHttpMessageConverter());
        Company[] list = restTemplate.getForObject(RestURL.COMPANIES_BY_END_ID_URL, Company[].class, endID);
        return new ArrayList<Company>(Arrays.asList(list));
    }

    @Override
    public List<Company> getCompanies(String startID, String endID) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getMessageConverters().add(new MappingJacksonHttpMessageConverter());
        Company[] list = restTemplate.getForObject(
                RestURL.COMPANIES_BY_START_END_ID_URL, Company[].class, startID, endID);
        return new ArrayList<Company>(Arrays.asList(list));
    }

    @Override
    public Company getCompany(String id) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getMessageConverters().add(new MappingJacksonHttpMessageConverter());
        return restTemplate.getForObject(RestURL.COMPANIES_BY_ID_URL, Company.class, id);
    }

    @Override
    public void updateCompany(Company company) {

    }

    @Override
    public void deleteCompany(String id) {

    }

    @Override
    public void deleteCompany(Company company) {

    }

    /**
     * **************************************
     * <p/>
     * User's CRUD
     * <p/>
     * ***************************************
     */

    @Override
    public User createUser(User user) {
        return null;
    }

    @Override
    public List<User> getUsers() {
        return null;
    }

    @Override
    public User getUser(String id) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getMessageConverters().add(new MappingJacksonHttpMessageConverter());
        return restTemplate.getForObject(RestURL.USERS_BY_ID_URL, User.class, id);
    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public void deleteUser(String id) {

    }

    @Override
    public void deleteUser(User user) {

    }

    /**
     * **************************************
     * <p/>
     * Product's CRUD
     * <p/>
     * ***************************************
     */

    @Override
    public Product createProduct(Product product) {
        return null;
    }

    @Override
    public List<Product> getProducts() {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getMessageConverters().add(new MappingJacksonHttpMessageConverter());

//        ResponseEntity<ProductContainer> responseEntity =
//                restTemplate.exchange(RestURL.PRODUCTS_URL, HttpMethod.GET, getRequestEntity(), ProductContainer.class);

        Product[] custList = restTemplate.getForObject(RestURL.PRODUCTS_URL, Product[].class);

        return new ArrayList<Product>(Arrays.asList(custList));
    }

    @Override
    public List<Product> getProducts(String endID) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getMessageConverters().add(new MappingJacksonHttpMessageConverter());
        Product[] list = restTemplate.getForObject(RestURL.PRODUCTS_BY_END_ID_URL, Product[].class, endID);
        return new ArrayList<Product>(Arrays.asList(list));
    }

    @Override
    public List<Product> getProducts(String startID, String endID) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getMessageConverters().add(new MappingJacksonHttpMessageConverter());
        Product[] list = restTemplate.getForObject(
                RestURL.PRODUCTS_BY_START_END_ID_URL, Product[].class, startID, endID);
        return new ArrayList<Product>(Arrays.asList(list));
    }

//    private HttpEntity<?> getRequestEntity() {
//        HttpHeaders requestHeaders = new HttpHeaders();
//        requestHeaders.setAccept(Collections.singletonList(new MediaType("application", "json")));
//        return new HttpEntity<Object>(requestHeaders);
//    }

    @Override
    public Product getProduct(String id) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getMessageConverters().add(new MappingJacksonHttpMessageConverter());
        return restTemplate.getForObject(RestURL.PRODUCTS_BY_ID_URL, Product.class, id);
    }

    @Override
    public void updateProduct(Product product) {

    }

    @Override
    public void deleteProduct(String id) {

    }

    @Override
    public void deleteProduct(Product product) {

    }

    /**
     * **************************************
     * <p/>
     * Category's CRUD
     * <p/>
     * ***************************************
     */

    @Override
    public Category createCategory(Category category) {
        return null;
    }

    @Override
    public List<Category> getCategories() {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getMessageConverters().add(new MappingJacksonHttpMessageConverter());
        Category[] list = restTemplate.getForObject(RestURL.CATEGORIES_URL, Category[].class);
        return new ArrayList<Category>(Arrays.asList(list));
    }

    @Override
    public Category getCategory(String id) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getMessageConverters().add(new MappingJacksonHttpMessageConverter());
        return restTemplate.getForObject(RestURL.CATEGORIES_BY_ID_URL, Category.class, id);
    }

    @Override
    public void updateCategory(Category category) {

    }

    @Override
    public void deleteCategory(String id) {

    }

    @Override
    public void deleteCategory(Category category) {

    }
}
