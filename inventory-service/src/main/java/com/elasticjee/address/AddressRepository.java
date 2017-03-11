package com.elasticjee.address;

import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.stereotype.Repository;

/**
 * @author chaokunyang
 */
@Repository
public interface AddressRepository extends GraphRepository<Address> {
}
