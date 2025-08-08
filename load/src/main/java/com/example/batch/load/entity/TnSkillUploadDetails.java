package com.example.batch.load.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tn_skill_upload_details")
public class TnSkillUploadDetails {

    @Id
    private Integer skillUniqueKey;

    @Lob
    private String skillGrouping;

    private Integer skillGroupingUniqueKey;

    @Lob
    private String skillTitle;

    @Lob
    private String skillOverview;

    @Lob
    private String skillContext;

    @Lob
    private String skillElementExample1;

    @Lob
    private String skillPerformanceCriteria11;

    @Lob
    private String skillPerformanceCriteria12;

    @Lob
    private String skillElementExample2;

    @Lob
    private String skillPerformanceCriteria21;

    @Lob
    private String skillPerformanceCriteria22;

    @Lob
    private String skillElementExample3;

    @Lob
    private String skillPerformanceCriteria31;

    @Lob
    private String skillPerformanceCriteria32;

    @Lob
    private String skillElementExample4;

    @Lob
    private String skillPerformanceCriteria41;

    @Lob
    private String skillPerformanceCriteria42;

    @Lob
    private String methodForMeasuringSkill1;

    @Lob
    private String methodForMeasuringSkill2;

    @Lob
    private String methodForMeasuringSkill3;

    @Lob
    private String methodForMeasuringSkill4;

    public Integer getSkillUniqueKey() {
        return skillUniqueKey;
    }

    public void setSkillUniqueKey(Integer skillUniqueKey) {
        this.skillUniqueKey = skillUniqueKey;
    }

    public String getSkillGrouping() {
        return skillGrouping;
    }

    public void setSkillGrouping(String skillGrouping) {
        this.skillGrouping = skillGrouping;
    }

    public Integer getSkillGroupingUniqueKey() {
        return skillGroupingUniqueKey;
    }

    public void setSkillGroupingUniqueKey(Integer skillGroupingUniqueKey) {
        this.skillGroupingUniqueKey = skillGroupingUniqueKey;
    }

    public String getSkillTitle() {
        return skillTitle;
    }

    public void setSkillTitle(String skillTitle) {
        this.skillTitle = skillTitle;
    }

    public String getSkillOverview() {
        return skillOverview;
    }

    public void setSkillOverview(String skillOverview) {
        this.skillOverview = skillOverview;
    }

    public String getSkillContext() {
        return skillContext;
    }

    public void setSkillContext(String skillContext) {
        this.skillContext = skillContext;
    }

    public String getSkillElementExample1() {
        return skillElementExample1;
    }

    public void setSkillElementExample1(String skillElementExample1) {
        this.skillElementExample1 = skillElementExample1;
    }

    public String getSkillPerformanceCriteria11() {
        return skillPerformanceCriteria11;
    }

    public void setSkillPerformanceCriteria11(String skillPerformanceCriteria11) {
        this.skillPerformanceCriteria11 = skillPerformanceCriteria11;
    }

    public String getSkillPerformanceCriteria12() {
        return skillPerformanceCriteria12;
    }

    public void setSkillPerformanceCriteria12(String skillPerformanceCriteria12) {
        this.skillPerformanceCriteria12 = skillPerformanceCriteria12;
    }

    public String getSkillElementExample2() {
        return skillElementExample2;
    }

    public void setSkillElementExample2(String skillElementExample2) {
        this.skillElementExample2 = skillElementExample2;
    }

    public String getSkillPerformanceCriteria21() {
        return skillPerformanceCriteria21;
    }

    public void setSkillPerformanceCriteria21(String skillPerformanceCriteria21) {
        this.skillPerformanceCriteria21 = skillPerformanceCriteria21;
    }

    public String getSkillPerformanceCriteria22() {
        return skillPerformanceCriteria22;
    }

    public void setSkillPerformanceCriteria22(String skillPerformanceCriteria22) {
        this.skillPerformanceCriteria22 = skillPerformanceCriteria22;
    }

    public String getSkillElementExample3() {
        return skillElementExample3;
    }

    public void setSkillElementExample3(String skillElementExample3) {
        this.skillElementExample3 = skillElementExample3;
    }

    public String getSkillPerformanceCriteria31() {
        return skillPerformanceCriteria31;
    }

    public void setSkillPerformanceCriteria31(String skillPerformanceCriteria31) {
        this.skillPerformanceCriteria31 = skillPerformanceCriteria31;
    }

    public String getSkillPerformanceCriteria32() {
        return skillPerformanceCriteria32;
    }

    public void setSkillPerformanceCriteria32(String skillPerformanceCriteria32) {
        this.skillPerformanceCriteria32 = skillPerformanceCriteria32;
    }

    public String getSkillElementExample4() {
        return skillElementExample4;
    }

    public void setSkillElementExample4(String skillElementExample4) {
        this.skillElementExample4 = skillElementExample4;
    }

    public String getSkillPerformanceCriteria41() {
        return skillPerformanceCriteria41;
    }

    public void setSkillPerformanceCriteria41(String skillPerformanceCriteria41) {
        this.skillPerformanceCriteria41 = skillPerformanceCriteria41;
    }

    public String getSkillPerformanceCriteria42() {
        return skillPerformanceCriteria42;
    }

    public void setSkillPerformanceCriteria42(String skillPerformanceCriteria42) {
        this.skillPerformanceCriteria42 = skillPerformanceCriteria42;
    }

    public String getMethodForMeasuringSkill1() {
        return methodForMeasuringSkill1;
    }

    public void setMethodForMeasuringSkill1(String methodForMeasuringSkill1) {
        this.methodForMeasuringSkill1 = methodForMeasuringSkill1;
    }

    public String getMethodForMeasuringSkill2() {
        return methodForMeasuringSkill2;
    }

    public void setMethodForMeasuringSkill2(String methodForMeasuringSkill2) {
        this.methodForMeasuringSkill2 = methodForMeasuringSkill2;
    }

    public String getMethodForMeasuringSkill3() {
        return methodForMeasuringSkill3;
    }

    public void setMethodForMeasuringSkill3(String methodForMeasuringSkill3) {
        this.methodForMeasuringSkill3 = methodForMeasuringSkill3;
    }

    public String getMethodForMeasuringSkill4() {
        return methodForMeasuringSkill4;
    }

    public void setMethodForMeasuringSkill4(String methodForMeasuringSkill4) {
        this.methodForMeasuringSkill4 = methodForMeasuringSkill4;
    }

    @Override
    public String toString() {
        return "TnSkillUploadDetails{" +
                "skillUniqueKey=" + skillUniqueKey +
                ", skillGrouping='" + skillGrouping + '\'' +
                ", skillGroupingUniqueKey=" + skillGroupingUniqueKey +
                ", skillTitle='" + skillTitle + '\'' +
                ", skillOverview='" + skillOverview + '\'' +
                ", skillContext='" + skillContext + '\'' +
                ", skillElementExample1='" + skillElementExample1 + '\'' +
                ", skillPerformanceCriteria11='" + skillPerformanceCriteria11 + '\'' +
                ", skillPerformanceCriteria12='" + skillPerformanceCriteria12 + '\'' +
                ", skillElementExample2='" + skillElementExample2 + '\'' +
                ", skillPerformanceCriteria21='" + skillPerformanceCriteria21 + '\'' +
                ", skillPerformanceCriteria22='" + skillPerformanceCriteria22 + '\'' +
                ", skillElementExample3='" + skillElementExample3 + '\'' +
                ", skillPerformanceCriteria31='" + skillPerformanceCriteria31 + '\'' +
                ", skillPerformanceCriteria32='" + skillPerformanceCriteria32 + '\'' +
                ", skillElementExample4='" + skillElementExample4 + '\'' +
                ", skillPerformanceCriteria41='" + skillPerformanceCriteria41 + '\'' +
                ", skillPerformanceCriteria42='" + skillPerformanceCriteria42 + '\'' +
                ", methodForMeasuringSkill1='" + methodForMeasuringSkill1 + '\'' +
                ", methodForMeasuringSkill2='" + methodForMeasuringSkill2 + '\'' +
                ", methodForMeasuringSkill3='" + methodForMeasuringSkill3 + '\'' +
                ", methodForMeasuringSkill4='" + methodForMeasuringSkill4 + '\'' +
                '}';
    }

}
