package com.agent.link_data.service;

import com.agent.link_data.dto.request.TestParamMiSumB7SearchDto;
import com.agent.link_data.dto.response.TestParamMiSumB7Res;
import org.springframework.data.domain.Page;

import java.util.List;

public interface TestParamMiSumB7Service {

    Page<TestParamMiSumB7Res> searchBy (TestParamMiSumB7SearchDto searchDto);
}
