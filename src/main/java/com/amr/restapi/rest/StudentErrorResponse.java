package com.amr.restapi.rest;

public class StudentErrorResponse {
    private Integer statues;
    private String message;
    private Long timeStamp;

    public StudentErrorResponse() {
    }

    public StudentErrorResponse(Integer statues, String message, Long timeStamp) {
        this.statues = statues;
        this.message = message;
        this.timeStamp = timeStamp;
    }

    public Integer getStatues() {
        return statues;
    }

    public void setStatues(Integer statues) {
        this.statues = statues;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Long timeStamp) {
        this.timeStamp = timeStamp;
    }
}
