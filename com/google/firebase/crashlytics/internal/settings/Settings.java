package com.google.firebase.crashlytics.internal.settings;

public class Settings {
    public static class FeatureFlagData {
        public final boolean collectAnrs;
        public final boolean collectReports;

        public FeatureFlagData(boolean z, boolean z1) {
            this.collectReports = z;
            this.collectAnrs = z1;
        }
    }

    public static class SessionData {
        public final int maxCompleteSessionsCount;
        public final int maxCustomExceptionEvents;

        public SessionData(int v, int v1) {
            this.maxCustomExceptionEvents = v;
            this.maxCompleteSessionsCount = v1;
        }
    }

    public final int cacheDuration;
    public final long expiresAtMillis;
    public final FeatureFlagData featureFlagData;
    public final double onDemandBackoffBase;
    public final int onDemandBackoffStepDurationSeconds;
    public final double onDemandUploadRatePerMinute;
    public final SessionData sessionData;
    public final int settingsVersion;

    public Settings(long v, SessionData settings$SessionData0, FeatureFlagData settings$FeatureFlagData0, int v1, int v2, double f, double f1, int v3) {
        this.expiresAtMillis = v;
        this.sessionData = settings$SessionData0;
        this.featureFlagData = settings$FeatureFlagData0;
        this.settingsVersion = v1;
        this.cacheDuration = v2;
        this.onDemandUploadRatePerMinute = f;
        this.onDemandBackoffBase = f1;
        this.onDemandBackoffStepDurationSeconds = v3;
    }

    public boolean isExpired(long v) {
        return this.expiresAtMillis < v;
    }
}

