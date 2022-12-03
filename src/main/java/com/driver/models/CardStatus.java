package com.driver.models;

import javax.persistence.Table;

@Table(name="CradStatus")
public enum CardStatus {
    ACTIVATED,
    DEACTIVATED
}
