package com.google.firebase.crashlytics;

import androidx.annotation.NonNull;
import java.util.HashMap;

public class CustomKeysAndValues {
    public static class Builder {
        public final HashMap a;

        public Builder() {
            this.a = new HashMap();
        }

        @NonNull
        public CustomKeysAndValues build() {
            return new CustomKeysAndValues(this);
        }

        @NonNull
        public Builder putBoolean(@NonNull String s, boolean z) {
            this.a.put(s, Boolean.toString(z));
            return this;
        }

        @NonNull
        public Builder putDouble(@NonNull String s, double f) {
            this.a.put(s, Double.toString(f));
            return this;
        }

        @NonNull
        public Builder putFloat(@NonNull String s, float f) {
            this.a.put(s, Float.toString(f));
            return this;
        }

        @NonNull
        public Builder putInt(@NonNull String s, int v) {
            this.a.put(s, Integer.toString(v));
            return this;
        }

        @NonNull
        public Builder putLong(@NonNull String s, long v) {
            this.a.put(s, Long.toString(v));
            return this;
        }

        @NonNull
        public Builder putString(@NonNull String s, @NonNull String s1) {
            this.a.put(s, s1);
            return this;
        }
    }

    public final HashMap a;

    public CustomKeysAndValues(Builder customKeysAndValues$Builder0) {
        this.a = customKeysAndValues$Builder0.a;
    }
}

