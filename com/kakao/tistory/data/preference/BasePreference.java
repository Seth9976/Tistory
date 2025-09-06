package com.kakao.tistory.data.preference;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.gson.Gson;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u00A2\u0006\u0004\b\u0004\u0010\u0005J\u000F\u0010\u0007\u001A\u00020\u0006H&\u00A2\u0006\u0004\b\u0007\u0010\bJ!\u0010\f\u001A\u00020\u00062\u0006\u0010\n\u001A\u00020\t2\b\u0010\u000B\u001A\u0004\u0018\u00010\tH\u0004\u00A2\u0006\u0004\b\f\u0010\rJ%\u0010\u000F\u001A\u0004\u0018\u00010\t2\u0006\u0010\n\u001A\u00020\t2\n\b\u0002\u0010\u000E\u001A\u0004\u0018\u00010\tH\u0004\u00A2\u0006\u0004\b\u000F\u0010\u0010J\u001F\u0010\u0012\u001A\u00020\u00062\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\u000B\u001A\u00020\u0011H\u0004\u00A2\u0006\u0004\b\u0012\u0010\u0013J\u001F\u0010\u0014\u001A\u00020\u00112\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\u000E\u001A\u00020\u0011H\u0004\u00A2\u0006\u0004\b\u0014\u0010\u0015J\u001F\u0010\u0017\u001A\u00020\u00062\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\u000B\u001A\u00020\u0016H\u0004\u00A2\u0006\u0004\b\u0017\u0010\u0018J\u001F\u0010\u0019\u001A\u00020\u00162\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\u000E\u001A\u00020\u0016H\u0004\u00A2\u0006\u0004\b\u0019\u0010\u001AJ\u001F\u0010\u001C\u001A\u00020\u00062\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\u000B\u001A\u00020\u001BH\u0004\u00A2\u0006\u0004\b\u001C\u0010\u001DJ\u001F\u0010\u001E\u001A\u00020\u001B2\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\u000E\u001A\u00020\u001BH\u0004\u00A2\u0006\u0004\b\u001E\u0010\u001FJ%\u0010!\u001A\u00020\u0006\"\u0004\b\u0000\u0010 2\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\u000B\u001A\u00028\u0000H\u0004\u00A2\u0006\u0004\b!\u0010\"J-\u0010%\u001A\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010 2\u0006\u0010\n\u001A\u00020\t2\f\u0010$\u001A\b\u0012\u0004\u0012\u00028\u00000#H\u0004\u00A2\u0006\u0004\b%\u0010&J\u0017\u0010\'\u001A\u00020\u001B2\u0006\u0010\n\u001A\u00020\tH\u0004\u00A2\u0006\u0004\b\'\u0010(R\u0014\u0010+\u001A\u00020\t8$X\u00A4\u0004\u00A2\u0006\u0006\u001A\u0004\b)\u0010*\u00A8\u0006,"}, d2 = {"Lcom/kakao/tistory/data/preference/BasePreference;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "clearAll", "()V", "", "key", "value", "putString", "(Ljava/lang/String;Ljava/lang/String;)V", "defaultValue", "getString", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "", "putInt", "(Ljava/lang/String;I)V", "getInt", "(Ljava/lang/String;I)I", "", "putLong", "(Ljava/lang/String;J)V", "getLong", "(Ljava/lang/String;J)J", "", "putBoolean", "(Ljava/lang/String;Z)V", "getBoolean", "(Ljava/lang/String;Z)Z", "T", "putObject", "(Ljava/lang/String;Ljava/lang/Object;)V", "Ljava/lang/Class;", "clazz", "getObject", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", "remove", "(Ljava/lang/String;)Z", "getPREFERENCE_NAME", "()Ljava/lang/String;", "PREFERENCE_NAME", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public abstract class BasePreference {
    public final Context a;

    public BasePreference(@NotNull Context context0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        super();
        this.a = context0;
    }

    public final SharedPreferences a() {
        String s = this.getPREFERENCE_NAME();
        SharedPreferences sharedPreferences0 = this.a.getSharedPreferences(s, 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences0, "getSharedPreferences(...)");
        return sharedPreferences0;
    }

    public abstract void clearAll();

    public final boolean getBoolean(@NotNull String s, boolean z) {
        Intrinsics.checkNotNullParameter(s, "key");
        return this.a().getBoolean(s, z);
    }

    public final int getInt(@NotNull String s, int v) {
        Intrinsics.checkNotNullParameter(s, "key");
        return this.a().getInt(s, v);
    }

    public final long getLong(@NotNull String s, long v) {
        Intrinsics.checkNotNullParameter(s, "key");
        return this.a().getLong(s, v);
    }

    @Nullable
    public final Object getObject(@NotNull String s, @NotNull Class class0) {
        Intrinsics.checkNotNullParameter(s, "key");
        Intrinsics.checkNotNullParameter(class0, "clazz");
        String s1 = this.getString(s, null);
        return s1 == null ? null : new Gson().fromJson(s1, class0);
    }

    @NotNull
    public abstract String getPREFERENCE_NAME();

    @Nullable
    public final String getString(@NotNull String s, @Nullable String s1) {
        Intrinsics.checkNotNullParameter(s, "key");
        String s2 = this.a().getString(s, s1);
        return s2 == null ? null : s2;
    }

    public static String getString$default(BasePreference basePreference0, String s, String s1, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getString");
        }
        if((v & 2) != 0) {
            s1 = null;
        }
        return basePreference0.getString(s, s1);
    }

    public final void putBoolean(@NotNull String s, boolean z) {
        Intrinsics.checkNotNullParameter(s, "key");
        this.a().edit().putBoolean(s, z).apply();
    }

    public final void putInt(@NotNull String s, int v) {
        Intrinsics.checkNotNullParameter(s, "key");
        this.a().edit().putInt(s, v).apply();
    }

    public final void putLong(@NotNull String s, long v) {
        Intrinsics.checkNotNullParameter(s, "key");
        this.a().edit().putLong(s, v).apply();
    }

    public final void putObject(@NotNull String s, Object object0) {
        Intrinsics.checkNotNullParameter(s, "key");
        this.putString(s, (object0 == null ? null : new Gson().toJson(object0)));
    }

    public final void putString(@NotNull String s, @Nullable String s1) {
        Intrinsics.checkNotNullParameter(s, "key");
        if(s1 == null) {
            s1 = null;
        }
        this.a().edit().putString(s, s1).apply();
    }

    public final boolean remove(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "key");
        return this.a().edit().remove(s).commit();
    }
}

