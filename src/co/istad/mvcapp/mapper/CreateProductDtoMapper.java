package co.istad.mvcapp.mapper;

import co.istad.mvcapp.dto.CreateProductDto;
import co.istad.mvcapp.model.Product;

import java.util.UUID;
import java.util.function.Function;

public class CreateProductDtoMapper implements Function<CreateProductDto, Product> {


    @Override
    public Product apply(CreateProductDto createProductDto) {
        return new Product(
                UUID.randomUUID(),
                createProductDto.code(),
                createProductDto.name(),
                createProductDto.priceIn()
        );
    }
}
