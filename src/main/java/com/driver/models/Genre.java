package com.driver.models;

import javax.persistence.Table;

@Table(name="Genre")
public enum Genre {
    FICTIONAL,
    NON_FICTIONAL,
    GEOGRAPHY,
    HISTORY,
    POLITICAL_SCIENCE,
    BOTANY,
    CHEMISTRY,
    MATHEMATICS,
    PHYSICS
}
