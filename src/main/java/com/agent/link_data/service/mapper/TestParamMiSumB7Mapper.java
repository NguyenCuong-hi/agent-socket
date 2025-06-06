package com.agent.link_data.service.mapper;

import com.agent.link_data.dto.response.TestParamMiSumB7Res;
import com.agent.link_data.entity.TestParamMiSumB7;
import org.mapstruct.Mapper;

@Mapper(
        componentModel = "spring"
)

public interface TestParamMiSumB7Mapper {

    TestParamMiSumB7Res entityToResponse (TestParamMiSumB7 entity);
}
