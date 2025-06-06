package com.agent.link_data.dto.request;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


public class TestParamMiSumB7SearchDto {

    private String totalJudgement;

    private int pageIndex;
    private int pageSize;

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
    }

    public String getTotalJudgement() {
        return totalJudgement;
    }

    public void setTotalJudgement(String totalJudgement) {
        this.totalJudgement = totalJudgement;
    }
}
