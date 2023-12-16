package org.example.uzuminventoryservice.stock;

import org.example.uzuminventoryservice.common.repository.GenericSpecificationRepository;
import org.example.uzuminventoryservice.stock.dto.StockResponseDto;
import org.example.uzuminventoryservice.stock.entity.Stock;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface StockRepository extends GenericSpecificationRepository<Stock, UUID> {

    Optional<Stock> getStockByProductId(String id);


}
