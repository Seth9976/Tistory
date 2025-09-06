package com.kakao.sdk.common.util;

import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u000F\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001A\u00020\u00012\u0006\u0010\u0007\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000B\u001A\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001A\u00020\u00062\b\u0010\n\u001A\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u000B\u0010\fJ\u001F\u0010\u000E\u001A\u00020\r2\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\n\u001A\u00020\rH\u0016¢\u0006\u0004\b\u000E\u0010\u000FJ\u001F\u0010\u0011\u001A\u00020\u00012\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0010\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001F\u0010\u0013\u001A\u00020\u00012\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0010\u001A\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000F\u0010\u0015\u001A\u00020\u0001H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000F\u0010\u0017\u001A\u00020\u0001H\u0016¢\u0006\u0004\b\u0017\u0010\u0016R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001A\u0004\b\u001A\u0010\u001B¨\u0006\u001C"}, d2 = {"Lcom/kakao/sdk/common/util/SharedPrefsWrapper;", "Lcom/kakao/sdk/common/util/PersistentKVStore;", "Landroid/content/SharedPreferences;", "appCache", "<init>", "(Landroid/content/SharedPreferences;)V", "", "key", "remove", "(Ljava/lang/String;)Lcom/kakao/sdk/common/util/PersistentKVStore;", "fallbackValue", "getString", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "", "getLong", "(Ljava/lang/String;J)J", "value", "putString", "(Ljava/lang/String;Ljava/lang/String;)Lcom/kakao/sdk/common/util/PersistentKVStore;", "putLong", "(Ljava/lang/String;J)Lcom/kakao/sdk/common/util/PersistentKVStore;", "commit", "()Lcom/kakao/sdk/common/util/PersistentKVStore;", "apply", "b", "Landroid/content/SharedPreferences;", "getAppCache", "()Landroid/content/SharedPreferences;", "common_release"}, k = 1, mv = {1, 4, 0})
public final class SharedPrefsWrapper implements PersistentKVStore {
    public final SharedPreferences.Editor a;
    public final SharedPreferences b;

    public SharedPrefsWrapper(@NotNull SharedPreferences sharedPreferences0) {
        Intrinsics.checkParameterIsNotNull(sharedPreferences0, "appCache");
        super();
        this.b = sharedPreferences0;
        SharedPreferences.Editor sharedPreferences$Editor0 = sharedPreferences0.edit();
        Intrinsics.checkExpressionValueIsNotNull(sharedPreferences$Editor0, "appCache.edit()");
        this.a = sharedPreferences$Editor0;
    }

    @Override  // com.kakao.sdk.common.util.PersistentKVStore
    @NotNull
    public PersistentKVStore apply() {
        this.a.apply();
        return this;
    }

    @Override  // com.kakao.sdk.common.util.PersistentKVStore
    @NotNull
    public PersistentKVStore commit() {
        this.a.commit();
        return this;
    }

    @NotNull
    public final SharedPreferences getAppCache() {
        return this.b;
    }

    @Override  // com.kakao.sdk.common.util.PersistentKVStore
    public long getLong(@NotNull String s, long v) {
        Intrinsics.checkParameterIsNotNull(s, "key");
        return this.b.getLong(s, v);
    }

    @Override  // com.kakao.sdk.common.util.PersistentKVStore
    @Nullable
    public String getString(@NotNull String s, @Nullable String s1) {
        Intrinsics.checkParameterIsNotNull(s, "key");
        return this.b.getString(s, s1);
    }

    @Override  // com.kakao.sdk.common.util.PersistentKVStore
    @NotNull
    public PersistentKVStore putLong(@NotNull String s, long v) {
        Intrinsics.checkParameterIsNotNull(s, "key");
        this.a.putLong(s, v);
        return this;
    }

    @Override  // com.kakao.sdk.common.util.PersistentKVStore
    @NotNull
    public PersistentKVStore putString(@NotNull String s, @NotNull String s1) {
        Intrinsics.checkParameterIsNotNull(s, "key");
        Intrinsics.checkParameterIsNotNull(s1, "value");
        this.a.putString(s, s1);
        return this;
    }

    @Override  // com.kakao.sdk.common.util.PersistentKVStore
    @NotNull
    public PersistentKVStore remove(@NotNull String s) {
        Intrinsics.checkParameterIsNotNull(s, "key");
        this.a.remove(s);
        return this;
    }
}

