package com.example.exodusent_voteproject.exception;

import org.springframework.http.HttpStatus;

public enum ErrorCode {
    INVALID_CHOICE(HttpStatus.BAD_REQUEST, "유효하지 않은 선택입니다.");

    private final HttpStatus status;
    private final String message;

    ErrorCode(HttpStatus status, String message) {
        this.status = status;
        this.message = message;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }
}
