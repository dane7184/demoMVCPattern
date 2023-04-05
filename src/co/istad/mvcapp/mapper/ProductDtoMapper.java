package co.istad.mvcapp.mapper;

import co.istad.mvcapp.dto.ProductDto;
import co.istad.mvcapp.model.Product;
import java.util.function.Function;

public class ProductDtoMapper implements Function<Product, ProductDto> {


    @Override
    public ProductDto apply(Product product) {

        return new ProductDto(product.getUuid(),product.getCode(),
                product.getName());
    }
}
