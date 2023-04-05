package co.istad.mvcapp.dao;

import co.istad.mvcapp.datasource.StaticDataSource;
import co.istad.mvcapp.dto.CreateProductDto;
import co.istad.mvcapp.dto.ProductDto;
import co.istad.mvcapp.exception.ProductNotFountException;
import co.istad.mvcapp.mapper.CreateProductDtoMapper;
import co.istad.mvcapp.mapper.ProductDtoMapper;
import co.istad.mvcapp.model.Product;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class ProductDaolmpl implements ProductDao{
    private final StaticDataSource staticDataSource;
    private final CreateProductDtoMapper createProductDtoMapper;
    private final ProductDtoMapper productDtoMapper;
    public ProductDaolmpl(){
        staticDataSource = new StaticDataSource();
        createProductDtoMapper = new CreateProductDtoMapper();
        productDtoMapper = new ProductDtoMapper();
    }

    @Override
    public List<ProductDto> select() {
        return staticDataSource.getProducts().stream()
                .map(productDtoMapper::apply)
                .collect(Collectors.toList());
    }

    @Override
    public ProductDto insert(CreateProductDto createProductDto){
        System.out.println(createProductDto);
        Product productForInsert = createProductDtoMapper.apply(createProductDto);
        staticDataSource.getProducts().add(productForInsert);
        return new ProductDto(productForInsert.getUuid(),
                productForInsert.getCode(),
                productForInsert.getName());
    }

    @Override
    public void removeByUUID(UUID uuid) throws ProductNotFountException{

        boolean isNotFuond=true;

        for (Product products : staticDataSource.getProducts()){
            if (products.getUuid().equals(uuid)){
                isNotFuond=false;
                System.out.println("Product is Deteled");
            }
        }
        if (isNotFuond){
            throw new ProductNotFountException("Product is not found");
        }
        /*
        List<Product> newProducts = staticDataSource.getProducts()
                .stream()
                .filter(product -> !product.getUuid().equals(uuid))
//                .filter(new Predicate<Product>() {
//                    @Override
//                    public boolean test(Product product) {
//                        return !product.getUuid().equals(uuid);
//                    }
//                })
                .collect(Collectors.toList());
        staticDataSource.setProducts(newProducts);

         */
    }

    @Override
    public void updateByUUID(UUID uuid) throws ProductNotFountException {
        
    }
}
