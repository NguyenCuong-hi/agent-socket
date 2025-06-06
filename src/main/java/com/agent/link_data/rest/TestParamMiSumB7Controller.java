package com.agent.link_data.rest;

import com.agent.link_data.dto.request.TestParamMiSumB7SearchDto;
import com.agent.link_data.dto.response.TestParamMiSumB7Res;
import com.agent.link_data.service.TestParamMiSumB7Service;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/test-param-misum-b7")

public class TestParamMiSumB7Controller {

    private final TestParamMiSumB7Service testParamMiSumB7Service;

    public TestParamMiSumB7Controller(final TestParamMiSumB7Service service) {
        this.testParamMiSumB7Service = service;
    }


    @GetMapping({"/page"})
    public List<TestParamMiSumB7Res> searchBy(TestParamMiSumB7SearchDto searchDto) {
        return testParamMiSumB7Service.searchBy(searchDto);
    }

}
