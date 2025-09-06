package com.google.firebase.installations.local;

public final class a extends Builder {
    public String a;
    public RegistrationStatus b;
    public String c;
    public String d;
    public Long e;
    public Long f;
    public String g;

    @Override  // com.google.firebase.installations.local.PersistedInstallationEntry$Builder
    public final PersistedInstallationEntry build() {
        String s = this.b == null ? " registrationStatus" : "";
        if(this.e == null) {
            s = s + " expiresInSecs";
        }
        if(this.f == null) {
            s = s + " tokenCreationEpochInSecs";
        }
        if(!s.isEmpty()) {
            throw new IllegalStateException("Missing required properties:" + s);
        }
        return new b(this.a, this.b, this.c, this.d, ((long)this.e), ((long)this.f), this.g);
    }

    @Override  // com.google.firebase.installations.local.PersistedInstallationEntry$Builder
    public final Builder setAuthToken(String s) {
        this.c = s;
        return this;
    }

    @Override  // com.google.firebase.installations.local.PersistedInstallationEntry$Builder
    public final Builder setExpiresInSecs(long v) {
        this.e = v;
        return this;
    }

    @Override  // com.google.firebase.installations.local.PersistedInstallationEntry$Builder
    public final Builder setFirebaseInstallationId(String s) {
        this.a = s;
        return this;
    }

    @Override  // com.google.firebase.installations.local.PersistedInstallationEntry$Builder
    public final Builder setFisError(String s) {
        this.g = s;
        return this;
    }

    @Override  // com.google.firebase.installations.local.PersistedInstallationEntry$Builder
    public final Builder setRefreshToken(String s) {
        this.d = s;
        return this;
    }

    @Override  // com.google.firebase.installations.local.PersistedInstallationEntry$Builder
    public final Builder setRegistrationStatus(RegistrationStatus persistedInstallation$RegistrationStatus0) {
        if(persistedInstallation$RegistrationStatus0 == null) {
            throw new NullPointerException("Null registrationStatus");
        }
        this.b = persistedInstallation$RegistrationStatus0;
        return this;
    }

    @Override  // com.google.firebase.installations.local.PersistedInstallationEntry$Builder
    public final Builder setTokenCreationEpochInSecs(long v) {
        this.f = v;
        return this;
    }
}

