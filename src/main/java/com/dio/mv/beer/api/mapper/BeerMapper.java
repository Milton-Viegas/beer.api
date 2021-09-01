package com.dio.mv.beer.api.mapper;

import com.dio.mv.beer.api.dto.BeerDTO;
import com.dio.mv.beer.api.entity.Beer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BeerMapper {

    BeerMapper INSTANCE = Mappers.getMapper(BeerMapper.class);

    Beer toModel(BeerDTO beerDTO);

    BeerDTO toDTO(Beer beer);
}
