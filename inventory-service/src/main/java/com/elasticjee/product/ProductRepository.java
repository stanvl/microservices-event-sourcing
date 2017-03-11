package com.elasticjee.product;

import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * @author chaokunyang
 */
@Repository
public interface ProductRepository extends GraphRepository<Product> {
    Product getProductByProductId(@Param("productId") String productId);
}
