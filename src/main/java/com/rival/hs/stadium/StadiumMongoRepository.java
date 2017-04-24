package com.rival.hs.stadium;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Minwoo on 2017. 4. 1..
 */
public interface StadiumMongoRepository extends MongoRepository<StadiumDo, String> {


    Page<StadiumDo> findAll(Pageable pageable);

    Page<StadiumDo> findAllByLocation_name(String location_name, Pageable pageable);

    StadiumDo findById(String id);

}
