package com.agent.link_data.repository;

import com.agent.link_data.entity.TestParamMiSumB7;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestParamMiSumB7Repository extends JpaRepository<TestParamMiSumB7, Long> {

    @Query(value = "SELECT * FROM ITM_TEST_PARA_HST_MISUM_B7 WHERE TOTAL_JUDGMENT LIKE :totalJudgement FETCH FIRST 200 ROWS ONLY ", nativeQuery = true)
    List<TestParamMiSumB7> findByJudgment(@Param("totalJudgement") String totalJudgement);

}
