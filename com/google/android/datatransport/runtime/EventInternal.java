package com.google.android.datatransport.runtime;

import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue.Builder;
import com.google.auto.value.AutoValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@AutoValue
public abstract class EventInternal {
    @AutoValue.Builder
    public static abstract class Builder {
        public final Builder addMetadata(String s, int v) {
            this.getAutoMetadata().put(s, String.valueOf(v));
            return this;
        }

        public final Builder addMetadata(String s, long v) {
            this.getAutoMetadata().put(s, String.valueOf(v));
            return this;
        }

        public final Builder addMetadata(String s, String s1) {
            this.getAutoMetadata().put(s, s1);
            return this;
        }

        public abstract EventInternal build();

        public abstract Map getAutoMetadata();

        public abstract Builder setAutoMetadata(Map arg1);

        public abstract Builder setCode(Integer arg1);

        public abstract Builder setEncodedPayload(EncodedPayload arg1);

        public abstract Builder setEventMillis(long arg1);

        public abstract Builder setTransportName(String arg1);

        public abstract Builder setUptimeMillis(long arg1);
    }

    public static Builder builder() {
        Builder eventInternal$Builder0 = new h();  // 初始化器: Lcom/google/android/datatransport/runtime/EventInternal$Builder;-><init>()V
        eventInternal$Builder0.f = new HashMap();
        return eventInternal$Builder0;
    }

    public final String get(String s) {
        String s1 = (String)this.getAutoMetadata().get(s);
        return s1 == null ? "" : s1;
    }

    public abstract Map getAutoMetadata();

    @Nullable
    public abstract Integer getCode();

    public abstract EncodedPayload getEncodedPayload();

    public abstract long getEventMillis();

    public final int getInteger(String s) {
        String s1 = (String)this.getAutoMetadata().get(s);
        return s1 == null ? 0 : ((int)Integer.valueOf(s1));
    }

    public final long getLong(String s) {
        String s1 = (String)this.getAutoMetadata().get(s);
        return s1 == null ? 0L : ((long)Long.valueOf(s1));
    }

    public final Map getMetadata() {
        return Collections.unmodifiableMap(this.getAutoMetadata());
    }

    public final String getOrDefault(String s, String s1) {
        String s2 = (String)this.getAutoMetadata().get(s);
        return s2 == null ? s1 : s2;
    }

    @Deprecated
    public byte[] getPayload() {
        return this.getEncodedPayload().getBytes();
    }

    public abstract String getTransportName();

    public abstract long getUptimeMillis();

    public Builder toBuilder() {
        Builder eventInternal$Builder0 = new h();  // 初始化器: Lcom/google/android/datatransport/runtime/EventInternal$Builder;-><init>()V
        ((h)eventInternal$Builder0).setTransportName(this.getTransportName());
        eventInternal$Builder0.b = this.getCode();
        ((h)eventInternal$Builder0).setEncodedPayload(this.getEncodedPayload());
        eventInternal$Builder0.setEventMillis(this.getEventMillis());
        eventInternal$Builder0.setUptimeMillis(this.getUptimeMillis());
        eventInternal$Builder0.setAutoMetadata(new HashMap(this.getAutoMetadata()));
        return eventInternal$Builder0;
    }
}

