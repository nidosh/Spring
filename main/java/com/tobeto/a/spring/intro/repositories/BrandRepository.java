package com.tobeto.a.spring.intro.repositories;

import com.tobeto.a.spring.intro.entities.Brand;
import com.tobeto.a.spring.intro.services.dtos.brand.response.GetListBrandResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BrandRepository extends JpaRepository<Brand,Integer> {
    @Query("Select new com.tobeto.a.spring.intro.services.dtos.brand.response.GetListBrandResponse(b.name) From Brand b Where b.name = :name")
    List<GetListBrandResponse> findByNameStartingWith(@Param("name") String name);
}
