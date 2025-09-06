package com.google.firebase;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.StringResourceValueReader;
import com.google.android.gms.common.util.Strings;

public final class FirebaseOptions {
    public static final class Builder {
        public String a;
        public String b;
        public String c;
        public String d;
        public String e;
        public String f;
        public String g;

        public Builder() {
        }

        public Builder(@NonNull FirebaseOptions firebaseOptions0) {
            this.b = firebaseOptions0.b;
            this.a = firebaseOptions0.a;
            this.c = firebaseOptions0.c;
            this.d = firebaseOptions0.d;
            this.e = firebaseOptions0.e;
            this.f = firebaseOptions0.f;
            this.g = firebaseOptions0.g;
        }

        @NonNull
        public FirebaseOptions build() {
            return new FirebaseOptions(this.b, this.a, this.c, this.d, this.e, this.f, this.g);
        }

        @NonNull
        public Builder setApiKey(@NonNull String s) {
            this.a = Preconditions.checkNotEmpty(s, "ApiKey must be set.");
            return this;
        }

        @NonNull
        public Builder setApplicationId(@NonNull String s) {
            this.b = Preconditions.checkNotEmpty(s, "ApplicationId must be set.");
            return this;
        }

        @NonNull
        public Builder setDatabaseUrl(@Nullable String s) {
            this.c = s;
            return this;
        }

        @NonNull
        @KeepForSdk
        public Builder setGaTrackingId(@Nullable String s) {
            this.d = s;
            return this;
        }

        @NonNull
        public Builder setGcmSenderId(@Nullable String s) {
            this.e = s;
            return this;
        }

        @NonNull
        public Builder setProjectId(@Nullable String s) {
            this.g = s;
            return this;
        }

        @NonNull
        public Builder setStorageBucket(@Nullable String s) {
            this.f = s;
            return this;
        }
    }

    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public FirebaseOptions(String s, String s1, String s2, String s3, String s4, String s5, String s6) {
        Preconditions.checkState(!Strings.isEmptyOrWhitespace(s), "ApplicationId must be set.");
        this.b = s;
        this.a = s1;
        this.c = s2;
        this.d = s3;
        this.e = s4;
        this.f = s5;
        this.g = s6;
    }

    // 去混淆评级： 中等(80)
    @Override
    public boolean equals(Object object0) {
        return object0 instanceof FirebaseOptions ? Objects.equal(this.b, ((FirebaseOptions)object0).b) && Objects.equal(this.a, ((FirebaseOptions)object0).a) && Objects.equal(this.c, ((FirebaseOptions)object0).c) && Objects.equal(this.d, ((FirebaseOptions)object0).d) && Objects.equal(this.e, ((FirebaseOptions)object0).e) && Objects.equal(this.f, ((FirebaseOptions)object0).f) && Objects.equal(this.g, ((FirebaseOptions)object0).g) : false;
    }

    @Nullable
    public static FirebaseOptions fromResource(@NonNull Context context0) {
        StringResourceValueReader stringResourceValueReader0 = new StringResourceValueReader(context0);
        String s = stringResourceValueReader0.getString("google_app_id");
        return TextUtils.isEmpty(s) ? null : new FirebaseOptions(s, stringResourceValueReader0.getString("google_api_key"), stringResourceValueReader0.getString("firebase_database_url"), stringResourceValueReader0.getString("ga_trackingId"), stringResourceValueReader0.getString("gcm_defaultSenderId"), stringResourceValueReader0.getString("google_storage_bucket"), stringResourceValueReader0.getString("project_id"));
    }

    @NonNull
    public String getApiKey() {
        return this.a;
    }

    @NonNull
    public String getApplicationId() {
        return this.b;
    }

    @Nullable
    public String getDatabaseUrl() {
        return this.c;
    }

    @Nullable
    @KeepForSdk
    public String getGaTrackingId() {
        return this.d;
    }

    @Nullable
    public String getGcmSenderId() {
        return this.e;
    }

    @Nullable
    public String getProjectId() {
        return this.g;
    }

    @Nullable
    public String getStorageBucket() {
        return this.f;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(new Object[]{this.b, this.a, this.c, this.d, this.e, this.f, this.g});
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this).add("applicationId", this.b).add("apiKey", this.a).add("databaseUrl", this.c).add("gcmSenderId", this.e).add("storageBucket", this.f).add("projectId", this.g).toString();
    }
}

