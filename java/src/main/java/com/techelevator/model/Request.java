package com.techelevator.model;

import java.util.Objects;

public class Request {

    private Long id;

    private int requestType;

    private int requestApproval;

    public Request(Long id, int requestType, int requestApproval) {
        this.id = id;
        this.requestType = requestType;
        this.requestApproval = requestApproval;
    }

    public Request() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getRequestType() {
        return requestType;
    }

    public void setRequestType(int requestType) {
        this.requestType = requestType;
    }

    public int getRequestApproval() {
        return requestApproval;
    }

    public void setRequestApproval(int requestApproval) {
        this.requestApproval = requestApproval;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Request request = (Request) o;
        return requestType == request.requestType && requestApproval == request.requestApproval && id.equals(request.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, requestType, requestApproval);
    }
}
