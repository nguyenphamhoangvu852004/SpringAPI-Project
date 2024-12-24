package com.codenguyenvu.helloworld.database;

import com.codenguyenvu.helloworld.entity.HangHoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HangHoaRepository extends JpaRepository<HangHoa, String> {

}
