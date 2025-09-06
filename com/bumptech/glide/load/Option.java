package com.bumptech.glide.load;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.util.Preconditions;
import java.security.MessageDigest;
import r0.a;

public final class Option {
    public interface CacheKeyUpdater {
        void update(@NonNull byte[] arg1, @NonNull Object arg2, @NonNull MessageDigest arg3);
    }

    public final Object a;
    public final CacheKeyUpdater b;
    public final String c;
    public volatile byte[] d;
    public static final b e;

    static {
        Option.e = new b();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public Option(String s, Object object0, CacheKeyUpdater option$CacheKeyUpdater0) {
        this.c = Preconditions.checkNotEmpty(s);
        this.a = object0;
        this.b = (CacheKeyUpdater)Preconditions.checkNotNull(option$CacheKeyUpdater0);
    }

    @NonNull
    public static Option disk(@NonNull String s, @NonNull CacheKeyUpdater option$CacheKeyUpdater0) {
        return new Option(s, null, option$CacheKeyUpdater0);
    }

    @NonNull
    public static Option disk(@NonNull String s, @Nullable Object object0, @NonNull CacheKeyUpdater option$CacheKeyUpdater0) {
        return new Option(s, object0, option$CacheKeyUpdater0);
    }

    // 去混淆评级： 低(20)
    @Override
    public boolean equals(Object object0) {
        return object0 instanceof Option ? this.c.equals(((Option)object0).c) : false;
    }

    @Nullable
    public Object getDefaultValue() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return this.c.hashCode();
    }

    @NonNull
    public static Option memory(@NonNull String s) {
        return new Option(s, null, Option.e);
    }

    @NonNull
    public static Option memory(@NonNull String s, @NonNull Object object0) {
        return new Option(s, object0, Option.e);
    }

    @Override
    public String toString() {
        return a.o(new StringBuilder("Option{key=\'"), this.c, "\'}");
    }

    public void update(@NonNull Object object0, @NonNull MessageDigest messageDigest0) {
        CacheKeyUpdater option$CacheKeyUpdater0 = this.b;
        if(this.d == null) {
            this.d = this.c.getBytes(Key.CHARSET);
        }
        option$CacheKeyUpdater0.update(this.d, object0, messageDigest0);
    }
}

