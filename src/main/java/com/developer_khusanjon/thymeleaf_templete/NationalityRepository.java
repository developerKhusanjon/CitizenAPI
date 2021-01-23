package com.developer_khusanjon.thymeleaf_templete;

import com.developer_khusanjon.thymeleaf_templete.models.Nationality;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NationalityRepository extends CrudRepository<Nationality,Integer> {
}
