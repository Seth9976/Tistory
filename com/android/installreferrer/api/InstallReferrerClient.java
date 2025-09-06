package com.android.installreferrer.api;

import android.content.Context;
import android.os.RemoteException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public abstract class InstallReferrerClient {
    public static final class Builder {
        public final Context a;

        public Builder(Context context0) {
            this.a = context0;
        }

        public InstallReferrerClient build() {
            Context context0 = this.a;
            if(context0 == null) {
                throw new IllegalArgumentException("Please provide a valid Context.");
            }
            return new b(context0);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface InstallReferrerResponse {
        public static final int DEVELOPER_ERROR = 3;
        public static final int FEATURE_NOT_SUPPORTED = 2;
        public static final int OK = 0;
        public static final int SERVICE_DISCONNECTED = -1;
        public static final int SERVICE_UNAVAILABLE = 1;

    }

    public abstract void endConnection();

    public abstract ReferrerDetails getInstallReferrer() throws RemoteException;

    public abstract boolean isReady();

    public static Builder newBuilder(Context context0) {
        return new Builder(context0);
    }

    public abstract void startConnection(InstallReferrerStateListener arg1);
}

