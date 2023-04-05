package co.istad.mvcapp.view;

import co.istad.mvcapp.dto.ProductDto;

import java.util.List;

public class ProductView {
    public static void productListView(List<ProductDto> productDtoList){
        System.out.println("------------------------------");
        System.out.println("My Prodct List");
        System.out.println("-----------------");
        productDtoList.forEach(productDto -> {
            System.out.println("UUID = "+ productDto.uuid());
            System.out.println("Code = "+ productDto.code());
            System.out.println("Name = "+ productDto.name());
            System.out.println("-------------------------");
        });
    }
    public static void single(ProductDto productDto) {
        System.out.println("--------------------------------------------------");
        System.out.println("My Product");
        System.out.println("--------------------------------------------------");
        System.out.println("UUID = " + productDto.uuid());
        System.out.println("Code = " + productDto.code());
        System.out.println("Name = " + productDto.name());
    }

}
