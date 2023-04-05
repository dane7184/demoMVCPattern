package co.istad.mvcapp.dto;

import java.util.UUID;

public record ProductDto(UUID uuid,
                         Integer code,
                         String name) {

}
