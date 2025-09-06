package androidx.recyclerview.widget;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class AsyncDifferConfig {
    public static final class Builder {
        public Executor a;
        public Executor b;
        public final ItemCallback c;
        public static final Object d;
        public static ExecutorService e;

        static {
            Builder.d = new Object();
        }

        public Builder(@NonNull ItemCallback diffUtil$ItemCallback0) {
            this.c = diffUtil$ItemCallback0;
        }

        @NonNull
        public AsyncDifferConfig build() {
            if(this.b == null) {
                Object object0 = Builder.d;
                synchronized(object0) {
                    if(Builder.e == null) {
                        Builder.e = Executors.newFixedThreadPool(2);
                    }
                }
                this.b = Builder.e;
            }
            return new AsyncDifferConfig(this.a, this.b, this.c);
        }

        @NonNull
        public Builder setBackgroundThreadExecutor(@Nullable Executor executor0) {
            this.b = executor0;
            return this;
        }

        @NonNull
        @RestrictTo({Scope.LIBRARY})
        public Builder setMainThreadExecutor(@Nullable Executor executor0) {
            this.a = executor0;
            return this;
        }
    }

    public final Executor a;
    public final Executor b;
    public final ItemCallback c;

    public AsyncDifferConfig(Executor executor0, Executor executor1, ItemCallback diffUtil$ItemCallback0) {
        this.a = executor0;
        this.b = executor1;
        this.c = diffUtil$ItemCallback0;
    }

    @NonNull
    public Executor getBackgroundThreadExecutor() {
        return this.b;
    }

    @NonNull
    public ItemCallback getDiffCallback() {
        return this.c;
    }

    @Nullable
    @RestrictTo({Scope.LIBRARY})
    public Executor getMainThreadExecutor() {
        return this.a;
    }
}

