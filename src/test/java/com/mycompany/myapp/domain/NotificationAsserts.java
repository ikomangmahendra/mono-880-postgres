package com.mycompany.myapp.domain;

import static org.assertj.core.api.Assertions.assertThat;

public class NotificationAsserts {

    /**
     * Asserts that the entity has all properties (fields/relationships) set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertNotificationAllPropertiesEquals(Notification expected, Notification actual) {
        assertNotificationAutoGeneratedPropertiesEquals(expected, actual);
        assertNotificationAllUpdatablePropertiesEquals(expected, actual);
    }

    /**
     * Asserts that the entity has all updatable properties (fields/relationships) set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertNotificationAllUpdatablePropertiesEquals(Notification expected, Notification actual) {
        assertNotificationUpdatableFieldsEquals(expected, actual);
        assertNotificationUpdatableRelationshipsEquals(expected, actual);
    }

    /**
     * Asserts that the entity has all the auto generated properties (fields/relationships) set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertNotificationAutoGeneratedPropertiesEquals(Notification expected, Notification actual) {
        assertThat(expected)
            .as("Verify Notification auto generated properties")
            .satisfies(e -> assertThat(e.getId()).as("check id").isEqualTo(actual.getId()));
    }

    /**
     * Asserts that the entity has all the updatable fields set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertNotificationUpdatableFieldsEquals(Notification expected, Notification actual) {
        assertThat(expected)
            .as("Verify Notification relevant properties")
            .satisfies(e -> assertThat(e.getStartDate()).as("check startDate").isEqualTo(actual.getStartDate()))
            .satisfies(e -> assertThat(e.getEndDate()).as("check endDate").isEqualTo(actual.getEndDate()));
    }

    /**
     * Asserts that the entity has all the updatable relationships set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertNotificationUpdatableRelationshipsEquals(Notification expected, Notification actual) {
        // empty method
    }
}
