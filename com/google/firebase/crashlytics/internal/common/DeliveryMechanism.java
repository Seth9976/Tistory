package com.google.firebase.crashlytics.internal.common;

public enum DeliveryMechanism {
    DEVELOPER(1),
    USER_SIDELOAD(2),
    TEST_DISTRIBUTION(3),
    APP_STORE(4);

    public final int a;

    public DeliveryMechanism(int v1) {
        this.a = v1;
    }

    public static DeliveryMechanism determineFrom(String s) {
        return s == null ? DeliveryMechanism.DEVELOPER : DeliveryMechanism.APP_STORE;
    }

    public int getId() {
        return this.a;
    }

    @Override
    public String toString() {
        return Integer.toString(this.a);
    }
}

