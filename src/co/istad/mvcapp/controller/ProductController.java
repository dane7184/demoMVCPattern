package co.istad.mvcapp.controller;

import co.istad.mvcapp.dao.ProductDaolmpl;
import co.istad.mvcapp.dto.CreateProductDto;
import co.istad.mvcapp.dto.ProductDto;
import co.istad.mvcapp.exception.ProductNotFountException;
import co.istad.mvcapp.model.Product;

import java.util.List;
import java.util.UUID;

public class ProductController {
    private final ProductDaolmpl productDao;

    public ProductController() {
        productDao = new ProductDaolmpl();
    }

    public List<ProductDto> handleProductList(){
        return productDao.select();
    }
    public ProductDto handleCreateNewProduct
            (CreateProductDto createProductDto){
        return productDao.insert(createProductDto);
    }
    public void handleRemoveProductByUUID(UUID uuid){
        try {
            productDao.removeByUUID(uuid);
        } catch (ProductNotFountException e) {
            System.out.println(e.getMessage());
        }
    }

}
