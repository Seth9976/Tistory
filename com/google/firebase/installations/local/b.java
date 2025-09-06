package com.google.firebase.installations.local;

public final class b extends PersistedInstallationEntry {
    public final String a;
    public final RegistrationStatus b;
    public final String c;
    public final String d;
    public final long e;
    public final long f;
    public final String g;

    public b(String s, RegistrationStatus persistedInstallation$RegistrationStatus0, String s1, String s2, long v, long v1, String s3) {
        this.a = s;
        this.b = persistedInstallation$RegistrationStatus0;
        this.c = s1;
        this.d = s2;
        this.e = v;
        this.f = v1;
        this.g = s3;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof PersistedInstallationEntry) {
            String s = this.a;
            if(s != null) {
                if(s.equals(((PersistedInstallationEntry)object0).getFirebaseInstallationId())) {
                label_8:
                    RegistrationStatus persistedInstallation$RegistrationStatus0 = ((PersistedInstallationEntry)object0).getRegistrationStatus();
                    if(this.b.equals(persistedInstallation$RegistrationStatus0)) {
                        String s1 = this.c;
                        if(s1 != null) {
                            if(s1.equals(((PersistedInstallationEntry)object0).getAuthToken())) {
                            label_15:
                                String s2 = this.d;
                                if(s2 != null) {
                                    if(s2.equals(((PersistedInstallationEntry)object0).getRefreshToken())) {
                                    label_20:
                                        long v = ((PersistedInstallationEntry)object0).getExpiresInSecs();
                                        if(this.e == v) {
                                            long v1 = ((PersistedInstallationEntry)object0).getTokenCreationEpochInSecs();
                                            if(this.f == v1) {
                                                return this.g == null ? ((PersistedInstallationEntry)object0).getFisError() == null : this.g.equals(((PersistedInstallationEntry)object0).getFisError());
                                            }
                                        }
                                    }
                                }
                                else if(((PersistedInstallationEntry)object0).getRefreshToken() == null) {
                                    goto label_20;
                                }
                            }
                        }
                        else if(((PersistedInstallationEntry)object0).getAuthToken() == null) {
                            goto label_15;
                        }
                    }
                }
            }
            else if(((PersistedInstallationEntry)object0).getFirebaseInstallationId() == null) {
                goto label_8;
            }
            return false;
        }
        return false;
    }

    @Override  // com.google.firebase.installations.local.PersistedInstallationEntry
    public final String getAuthToken() {
        return this.c;
    }

    @Override  // com.google.firebase.installations.local.PersistedInstallationEntry
    public final long getExpiresInSecs() {
        return this.e;
    }

    @Override  // com.google.firebase.installations.local.PersistedInstallationEntry
    public final String getFirebaseInstallationId() {
        return this.a;
    }

    @Override  // com.google.firebase.installations.local.PersistedInstallationEntry
    public final String getFisError() {
        return this.g;
    }

    @Override  // com.google.firebase.installations.local.PersistedInstallationEntry
    public final String getRefreshToken() {
        return this.d;
    }

    @Override  // com.google.firebase.installations.local.PersistedInstallationEntry
    public final RegistrationStatus getRegistrationStatus() {
        return this.b;
    }

    @Override  // com.google.firebase.installations.local.PersistedInstallationEntry
    public final long getTokenCreationEpochInSecs() {
        return this.f;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = (((((((this.a == null ? 0 : this.a.hashCode()) ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003 ^ (this.c == null ? 0 : this.c.hashCode())) * 1000003 ^ (this.d == null ? 0 : this.d.hashCode())) * 1000003 ^ ((int)(this.e ^ this.e >>> 0x20))) * 1000003 ^ ((int)(this.f ^ this.f >>> 0x20))) * 1000003;
        String s = this.g;
        if(s != null) {
            v = s.hashCode();
        }
        return v ^ v1;
    }

    @Override  // com.google.firebase.installations.local.PersistedInstallationEntry
    public final Builder toBuilder() {
        Builder persistedInstallationEntry$Builder0 = new a();  // 初始化器: Lcom/google/firebase/installations/local/PersistedInstallationEntry$Builder;-><init>()V
        persistedInstallationEntry$Builder0.a = this.getFirebaseInstallationId();
        persistedInstallationEntry$Builder0.b = this.getRegistrationStatus();
        persistedInstallationEntry$Builder0.c = this.getAuthToken();
        persistedInstallationEntry$Builder0.d = this.getRefreshToken();
        persistedInstallationEntry$Builder0.e = this.getExpiresInSecs();
        persistedInstallationEntry$Builder0.f = this.getTokenCreationEpochInSecs();
        persistedInstallationEntry$Builder0.g = this.getFisError();
        return persistedInstallationEntry$Builder0;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", registrationStatus=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", authToken=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", refreshToken=");
        stringBuilder0.append(this.d);
        stringBuilder0.append(", expiresInSecs=");
        stringBuilder0.append(this.e);
        stringBuilder0.append(", tokenCreationEpochInSecs=");
        stringBuilder0.append(this.f);
        stringBuilder0.append(", fisError=");
        return r0.a.o(stringBuilder0, this.g, "}");
    }
}

