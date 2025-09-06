package com.google.firebase.analytics.connector;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Size;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.annotations.DeferredApi;
import java.util.List;
import java.util.Map;
import java.util.Set;

public interface AnalyticsConnector {
    @KeepForSdk
    public interface AnalyticsConnectorHandle {
        @KeepForSdk
        void registerEventNames(@NonNull Set arg1);

        @KeepForSdk
        void unregister();

        @KeepForSdk
        void unregisterEventNames();
    }

    @KeepForSdk
    public interface AnalyticsConnectorListener {
        @KeepForSdk
        void onMessageTriggered(int arg1, @Nullable Bundle arg2);
    }

    @KeepForSdk
    public static class ConditionalUserProperty {
        @KeepForSdk
        public boolean active;
        @KeepForSdk
        public long creationTimestamp;
        @Nullable
        @KeepForSdk
        public String expiredEventName;
        @Nullable
        @KeepForSdk
        public Bundle expiredEventParams;
        @NonNull
        @KeepForSdk
        public String name;
        @NonNull
        @KeepForSdk
        public String origin;
        @KeepForSdk
        public long timeToLive;
        @Nullable
        @KeepForSdk
        public String timedOutEventName;
        @Nullable
        @KeepForSdk
        public Bundle timedOutEventParams;
        @Nullable
        @KeepForSdk
        public String triggerEventName;
        @KeepForSdk
        public long triggerTimeout;
        @Nullable
        @KeepForSdk
        public String triggeredEventName;
        @Nullable
        @KeepForSdk
        public Bundle triggeredEventParams;
        @KeepForSdk
        public long triggeredTimestamp;
        @Nullable
        @KeepForSdk
        public Object value;

    }

    @KeepForSdk
    void clearConditionalUserProperty(@NonNull @Size(max = 24L, min = 1L) String arg1, @Nullable String arg2, @Nullable Bundle arg3);

    @NonNull
    @WorkerThread
    @KeepForSdk
    List getConditionalUserProperties(@NonNull String arg1, @Nullable @Size(max = 23L, min = 1L) String arg2);

    @WorkerThread
    @KeepForSdk
    int getMaxUserProperties(@NonNull @Size(min = 1L) String arg1);

    @NonNull
    @WorkerThread
    @KeepForSdk
    Map getUserProperties(boolean arg1);

    @KeepForSdk
    void logEvent(@NonNull String arg1, @NonNull String arg2, @Nullable Bundle arg3);

    @Nullable
    @KeepForSdk
    @DeferredApi
    AnalyticsConnectorHandle registerAnalyticsConnectorListener(@NonNull String arg1, @NonNull AnalyticsConnectorListener arg2);

    @KeepForSdk
    void setConditionalUserProperty(@NonNull ConditionalUserProperty arg1);

    @KeepForSdk
    void setUserProperty(@NonNull String arg1, @NonNull String arg2, @NonNull Object arg3);
}

