package com.google.android.play.core.appupdate;

import androidx.annotation.NonNull;
import com.google.android.play.core.install.model.AppUpdateType;

public abstract class AppUpdateOptions {
    public static abstract class Builder {
        @NonNull
        public abstract AppUpdateOptions build();

        @NonNull
        public abstract Builder setAllowAssetPackDeletion(boolean arg1);

        @NonNull
        public abstract Builder setAppUpdateType(@AppUpdateType int arg1);
    }

    public abstract boolean allowAssetPackDeletion();

    @AppUpdateType
    public abstract int appUpdateType();

    @NonNull
    public static AppUpdateOptions defaultOptions(@AppUpdateType int v) {
        return AppUpdateOptions.newBuilder(v).build();
    }

    @NonNull
    public static Builder newBuilder(@AppUpdateType int v) {
        Builder appUpdateOptions$Builder0 = new a();  // 初始化器: Lcom/google/android/play/core/appupdate/AppUpdateOptions$Builder;-><init>()V
        ((a)appUpdateOptions$Builder0).setAppUpdateType(v);
        ((a)appUpdateOptions$Builder0).setAllowAssetPackDeletion(false);
        return appUpdateOptions$Builder0;
    }
}

