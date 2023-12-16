package org.example.uzuminventoryservice.stock;

import lombok.RequiredArgsConstructor;
import org.example.uzuminventoryservice.common.service.GenericDtoMapper;
import org.example.uzuminventoryservice.stock.dto.StockCreateDto;
import org.example.uzuminventoryservice.stock.dto.StockResponseDto;
import org.example.uzuminventoryservice.stock.entity.Stock;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class StockDtoMapper extends GenericDtoMapper<Stock, StockCreateDto, StockCreateDto, StockResponseDto> {

    private final ModelMapper mapper;

    @Override
    public Stock toEntity(StockCreateDto stockCreateDto) {

        return mapper.map(stockCreateDto, Stock.class);
    }

    @Override
    public StockResponseDto toResponseDto(Stock stock) {
        return mapper.map(stock, StockResponseDto.class);
    }

    @Override
    public void update(StockCreateDto stockCreateDto, Stock stock) {
        mapper.map(stockCreateDto, stock);
    }
}
