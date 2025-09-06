package androidx.webkit;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class TracingConfig {
    public static class Builder {
        public int a;
        public final ArrayList b;
        public int c;

        public Builder() {
            this.a = 0;
            this.b = new ArrayList();
            this.c = 1;
        }

        @NonNull
        public Builder addCategories(@NonNull Collection collection0) {
            this.b.addAll(collection0);
            return this;
        }

        @NonNull
        public Builder addCategories(@NonNull int[] arr_v) {
            for(int v = 0; v < arr_v.length; ++v) {
                this.a |= arr_v[v];
            }
            return this;
        }

        @NonNull
        public Builder addCategories(@NonNull String[] arr_s) {
            List list0 = Arrays.asList(arr_s);
            this.b.addAll(list0);
            return this;
        }

        @NonNull
        public TracingConfig build() {
            return new TracingConfig(this.a, this.b, this.c);
        }

        @NonNull
        public Builder setTracingMode(int v) {
            this.c = v;
            return this;
        }
    }

    @RestrictTo({Scope.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    public @interface PredefinedCategories {
    }

    @RestrictTo({Scope.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    public @interface TracingMode {
    }

    public static final int CATEGORIES_ALL = 1;
    public static final int CATEGORIES_ANDROID_WEBVIEW = 2;
    public static final int CATEGORIES_FRAME_VIEWER = 0x40;
    public static final int CATEGORIES_INPUT_LATENCY = 8;
    public static final int CATEGORIES_JAVASCRIPT_AND_RENDERING = 0x20;
    public static final int CATEGORIES_NONE = 0;
    public static final int CATEGORIES_RENDERING = 16;
    public static final int CATEGORIES_WEB_DEVELOPER = 4;
    public static final int RECORD_CONTINUOUSLY = 1;
    public static final int RECORD_UNTIL_FULL;
    public final int a;
    public final ArrayList b;
    public final int c;

    @RestrictTo({Scope.LIBRARY})
    public TracingConfig(int v, @NonNull List list0, int v1) {
        ArrayList arrayList0 = new ArrayList();
        this.b = arrayList0;
        this.a = v;
        arrayList0.addAll(list0);
        this.c = v1;
    }

    @NonNull
    public List getCustomIncludedCategories() {
        return this.b;
    }

    public int getPredefinedCategories() {
        return this.a;
    }

    public int getTracingMode() {
        return this.c;
    }
}

