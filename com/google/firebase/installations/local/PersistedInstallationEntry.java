package com.google.firebase.installations.local;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue.Builder;
import com.google.auto.value.AutoValue;

@AutoValue
public abstract class PersistedInstallationEntry {
    @AutoValue.Builder
    public static abstract class Builder {
        @NonNull
        public abstract PersistedInstallationEntry build();

        @NonNull
        public abstract Builder setAuthToken(@Nullable String arg1);

        @NonNull
        public abstract Builder setExpiresInSecs(long arg1);

        @NonNull
        public abstract Builder setFirebaseInstallationId(@NonNull String arg1);

        @NonNull
        public abstract Builder setFisError(@Nullable String arg1);

        @NonNull
        public abstract Builder setRefreshToken(@Nullable String arg1);

        @NonNull
        public abstract Builder setRegistrationStatus(@NonNull RegistrationStatus arg1);

        @NonNull
        public abstract Builder setTokenCreationEpochInSecs(long arg1);
    }

    @NonNull
    public static PersistedInstallationEntry INSTANCE;

    static {
        PersistedInstallationEntry.INSTANCE = PersistedInstallationEntry.builder().build();
    }

    @NonNull
    public static Builder builder() {
        Builder persistedInstallationEntry$Builder0 = new a();  // 初始化器: Lcom/google/firebase/installations/local/PersistedInstallationEntry$Builder;-><init>()V
        persistedInstallationEntry$Builder0.f = 0L;
        ((a)persistedInstallationEntry$Builder0).setRegistrationStatus(RegistrationStatus.ATTEMPT_MIGRATION);
        persistedInstallationEntry$Builder0.setExpiresInSecs(0L);
        return persistedInstallationEntry$Builder0;
    }

    @Nullable
    public abstract String getAuthToken();

    public abstract long getExpiresInSecs();

    @Nullable
    public abstract String getFirebaseInstallationId();

    @Nullable
    public abstract String getFisError();

    @Nullable
    public abstract String getRefreshToken();

    @NonNull
    public abstract RegistrationStatus getRegistrationStatus();

    public abstract long getTokenCreationEpochInSecs();

    public boolean isErrored() {
        return this.getRegistrationStatus() == RegistrationStatus.REGISTER_ERROR;
    }

    public boolean isNotGenerated() {
        return this.getRegistrationStatus() == RegistrationStatus.NOT_GENERATED || this.getRegistrationStatus() == RegistrationStatus.ATTEMPT_MIGRATION;
    }

    public boolean isRegistered() {
        return this.getRegistrationStatus() == RegistrationStatus.REGISTERED;
    }

    public boolean isUnregistered() {
        return this.getRegistrationStatus() == RegistrationStatus.UNREGISTERED;
    }

    public boolean shouldAttemptMigration() {
        return this.getRegistrationStatus() == RegistrationStatus.ATTEMPT_MIGRATION;
    }

    @NonNull
    public abstract Builder toBuilder();

    @NonNull
    public PersistedInstallationEntry withAuthToken(@NonNull String s, long v, long v1) {
        return this.toBuilder().setAuthToken(s).setExpiresInSecs(v).setTokenCreationEpochInSecs(v1).build();
    }

    @NonNull
    public PersistedInstallationEntry withClearedAuthToken() {
        return this.toBuilder().setAuthToken(null).build();
    }

    @NonNull
    public PersistedInstallationEntry withFisError(@NonNull String s) {
        return this.toBuilder().setFisError(s).setRegistrationStatus(RegistrationStatus.REGISTER_ERROR).build();
    }

    @NonNull
    public PersistedInstallationEntry withNoGeneratedFid() {
        return this.toBuilder().setRegistrationStatus(RegistrationStatus.NOT_GENERATED).build();
    }

    @NonNull
    public PersistedInstallationEntry withRegisteredFid(@NonNull String s, @NonNull String s1, long v, @Nullable String s2, long v1) {
        return this.toBuilder().setFirebaseInstallationId(s).setRegistrationStatus(RegistrationStatus.REGISTERED).setAuthToken(s2).setRefreshToken(s1).setExpiresInSecs(v1).setTokenCreationEpochInSecs(v).build();
    }

    @NonNull
    public PersistedInstallationEntry withUnregisteredFid(@NonNull String s) {
        return this.toBuilder().setFirebaseInstallationId(s).setRegistrationStatus(RegistrationStatus.UNREGISTERED).build();
    }
}

