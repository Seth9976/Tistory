package com.kakao.android.base;

import android.app.Application;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Deprecated(message = "don\'t use")
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001C\u0010\u0003\u001A\u00020\u00042\b\u0010\u0005\u001A\u0004\u0018\u00010\u00062\b\u0010\u0007\u001A\u0004\u0018\u00010\bH\u0016J1\u0010\t\u001A\u00020\n2\u0006\u0010\u000B\u001A\u00020\f2\b\u0010\r\u001A\u0004\u0018\u00010\u000E2\u0010\u0010\u000F\u001A\f\u0012\u0006\b\u0001\u0012\u00020\u000E\u0018\u00010\u0010H\u0016¢\u0006\u0002\u0010\u0011J\u0012\u0010\u0012\u001A\u0004\u0018\u00010\u000E2\u0006\u0010\u000B\u001A\u00020\fH\u0016J\u001C\u0010\u0013\u001A\u0004\u0018\u00010\f2\u0006\u0010\u000B\u001A\u00020\f2\b\u0010\u0014\u001A\u0004\u0018\u00010\u0015H\u0016J\b\u0010\u0016\u001A\u00020\u0017H\u0016JO\u0010\u0018\u001A\u0004\u0018\u00010\u00192\u0006\u0010\u000B\u001A\u00020\f2\u0010\u0010\u001A\u001A\f\u0012\u0006\b\u0001\u0012\u00020\u000E\u0018\u00010\u00102\b\u0010\r\u001A\u0004\u0018\u00010\u000E2\u0010\u0010\u000F\u001A\f\u0012\u0006\b\u0001\u0012\u00020\u000E\u0018\u00010\u00102\b\u0010\u001B\u001A\u0004\u0018\u00010\u000EH\u0016¢\u0006\u0002\u0010\u001CJ;\u0010\u001D\u001A\u00020\n2\u0006\u0010\u000B\u001A\u00020\f2\b\u0010\u0014\u001A\u0004\u0018\u00010\u00152\b\u0010\r\u001A\u0004\u0018\u00010\u000E2\u0010\u0010\u000F\u001A\f\u0012\u0006\b\u0001\u0012\u00020\u000E\u0018\u00010\u0010H\u0016¢\u0006\u0002\u0010\u001E¨\u0006\u001F"}, d2 = {"Lcom/kakao/android/base/BaseInitProvider;", "Landroid/content/ContentProvider;", "()V", "attachInfo", "", "context", "Landroid/content/Context;", "info", "Landroid/content/pm/ProviderInfo;", "delete", "", "uri", "Landroid/net/Uri;", "selection", "", "selectionArgs", "", "(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I", "getType", "insert", "values", "Landroid/content/ContentValues;", "onCreate", "", "query", "Landroid/database/Cursor;", "projection", "sortOrder", "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "update", "(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class BaseInitProvider extends ContentProvider {
    @Override  // android.content.ContentProvider
    public void attachInfo(@Nullable Context context0, @Nullable ProviderInfo providerInfo0) {
        super.attachInfo(context0, providerInfo0);
    }

    @Override  // android.content.ContentProvider
    public int delete(@NotNull Uri uri0, @Nullable String s, @Nullable String[] arr_s) {
        Intrinsics.checkNotNullParameter(uri0, "uri");
        return 0;
    }

    @Override  // android.content.ContentProvider
    @Nullable
    public String getType(@NotNull Uri uri0) {
        Intrinsics.checkNotNullParameter(uri0, "uri");
        return null;
    }

    @Override  // android.content.ContentProvider
    @Nullable
    public Uri insert(@NotNull Uri uri0, @Nullable ContentValues contentValues0) {
        Intrinsics.checkNotNullParameter(uri0, "uri");
        return null;
    }

    @Override  // android.content.ContentProvider
    public boolean onCreate() {
        Context context0 = this.getContext();
        Intrinsics.checkNotNull(context0, "null cannot be cast to non-null type android.app.Application");
        BaseKt.setAppContext(((Application)context0));
        return true;
    }

    @Override  // android.content.ContentProvider
    @Nullable
    public Cursor query(@NotNull Uri uri0, @Nullable String[] arr_s, @Nullable String s, @Nullable String[] arr_s1, @Nullable String s1) {
        Intrinsics.checkNotNullParameter(uri0, "uri");
        return null;
    }

    @Override  // android.content.ContentProvider
    public int update(@NotNull Uri uri0, @Nullable ContentValues contentValues0, @Nullable String s, @Nullable String[] arr_s) {
        Intrinsics.checkNotNullParameter(uri0, "uri");
        return 0;
    }
}

