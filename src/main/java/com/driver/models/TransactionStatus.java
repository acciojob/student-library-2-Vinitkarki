package com.driver.models;

import javax.persistence.Table;

@Table(name="TransactionStatus")
public enum TransactionStatus {
    SUCCESSFUL,
    FAILED
}
