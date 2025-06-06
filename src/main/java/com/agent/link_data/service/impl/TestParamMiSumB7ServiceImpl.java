package com.agent.link_data.service.impl;

import com.agent.link_data.dto.request.TestParamMiSumB7SearchDto;
import com.agent.link_data.dto.response.TestParamMiSumB7Res;
import com.agent.link_data.entity.TestParamMiSumB7;
import com.agent.link_data.repository.TestParamMiSumB7Repository;
import com.agent.link_data.service.TestParamMiSumB7Service;
import com.agent.link_data.service.mapper.TestParamMiSumB7Mapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TestParamMiSumB7ServiceImpl implements TestParamMiSumB7Service {

    private final TestParamMiSumB7Repository testParamMiSumB7Repo;
    private final TestParamMiSumB7Mapper testParamMiSumB7Mapper;

    public TestParamMiSumB7ServiceImpl(TestParamMiSumB7Repository testParamMiSumB7Repo, TestParamMiSumB7Mapper testParamMiSumB7Mapper) {
        this.testParamMiSumB7Repo = testParamMiSumB7Repo;
        this.testParamMiSumB7Mapper = testParamMiSumB7Mapper;
    }

    @Override
    public List<TestParamMiSumB7Res> searchBy(TestParamMiSumB7SearchDto searchDto) {
        List<TestParamMiSumB7> entityList = testParamMiSumB7Repo.findByJudgment(searchDto.getTotalJudgement());

        return entityList.stream()
                .map(this.testParamMiSumB7Mapper:: entityToResponse).collect(Collectors.toList());

    }
}
