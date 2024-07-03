package entity;

import lombok.Getter;

@Getter
public enum StatusType {
    PENDING("pending"),
    ORDERED("ordered"),
    CANCELED("canceled");

    private final String status;

    StatusType(String status) {
        this.status = status;
    }
}
