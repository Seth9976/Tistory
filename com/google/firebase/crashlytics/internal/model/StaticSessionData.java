package com.google.firebase.crashlytics.internal.model;

import com.google.auto.value.AutoValue;
import com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider;

@AutoValue
public abstract class StaticSessionData {
    @AutoValue
    public static abstract class AppData {
        public abstract String appIdentifier();

        public static AppData create(String s, String s1, String s2, String s3, int v, DevelopmentPlatformProvider developmentPlatformProvider0) {
            return new m1(s, s1, s2, s3, v, developmentPlatformProvider0);
        }

        public abstract int deliveryMechanism();

        public abstract DevelopmentPlatformProvider developmentPlatformProvider();

        public abstract String installUuid();

        public abstract String versionCode();

        public abstract String versionName();
    }

    @AutoValue
    public static abstract class DeviceData {
        public abstract int arch();

        public abstract int availableProcessors();

        public static DeviceData create(int v, String s, int v1, long v2, long v3, boolean z, int v4, String s1, String s2) {
            return new n1(v, s, v1, v2, v3, z, v4, s1, s2);
        }

        public abstract long diskSpace();

        public abstract boolean isEmulator();

        public abstract String manufacturer();

        public abstract String model();

        public abstract String modelClass();

        public abstract int state();

        public abstract long totalRam();
    }

    @AutoValue
    public static abstract class OsData {
        public static OsData create(String s, String s1, boolean z) {
            return new o1(s, s1, z);
        }

        public abstract boolean isRooted();

        public abstract String osCodeName();

        public abstract String osRelease();
    }

    public abstract AppData appData();

    public static StaticSessionData create(AppData staticSessionData$AppData0, OsData staticSessionData$OsData0, DeviceData staticSessionData$DeviceData0) {
        return new l1(staticSessionData$AppData0, staticSessionData$OsData0, staticSessionData$DeviceData0);
    }

    public abstract DeviceData deviceData();

    public abstract OsData osData();
}

