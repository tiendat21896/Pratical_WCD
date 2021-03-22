package model;

import da.ProductDataAccess;
import entity.Product;
import entity.User;

import java.sql.SQLException;
import java.util.List;

public class ProductBean {
    public List<Product> getProducts() throws SQLException, ClassNotFoundException {
        return new ProductDataAccess().selectProduct();
    }
    public boolean getUserByName(String name,String password) throws SQLException, ClassNotFoundException {
        return new ProductDataAccess().getUser(name,password);
    }
}
