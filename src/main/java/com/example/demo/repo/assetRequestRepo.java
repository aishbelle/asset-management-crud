package com.example.demo.repo;

import com.example.demo.model.asset_request;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;
import java.util.Map;

public interface assetRequestRepo extends JpaRepository<asset_request,Integer> {

    @Query("select ar from asset_request as ar where ar.user_id = ?1 and ar.status !='CheckedOut'" )
    List<asset_request> findByUser_id(Integer userId);

    @Query(nativeQuery = true, value  = "select a.asset_id,a.asset_name,a.quantity " +
            " from assets as a WHERE a.quantity > 0 ")
    List<Map<String, Object>> findByDate();


//    asset_request findByUser_idAndAsset
}
