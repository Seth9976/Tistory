package androidx.sqlite.db;

import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@RestrictTo({Scope.LIBRARY_GROUP})
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Landroidx/sqlite/db/SupportSQLiteCompat;", "", "Api16Impl", "Api19Impl", "Api21Impl", "Api23Impl", "Api29Impl", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class SupportSQLiteCompat {
    @RequiresApi(16)
    @RestrictTo({Scope.LIBRARY_GROUP})
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000F\u0010\u0007\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001A\u00020\u000B2\u0006\u0010\n\u001A\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rJK\u0010\u0018\u001A\u00020\u00172\u0006\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\u0011\u001A\u00020\u00102\u0010\u0010\u0013\u001A\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00100\u00122\b\u0010\u0014\u001A\u0004\u0018\u00010\u00102\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0016\u001A\u00020\u0015H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u001F\u0010\u001B\u001A\u00020\u00042\u0006\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\u001A\u001A\u00020\u000BH\u0007¢\u0006\u0004\b\u001B\u0010\u001CJ\u0017\u0010\u001D\u001A\u00020\u00042\u0006\u0010\u000F\u001A\u00020\u000EH\u0007¢\u0006\u0004\b\u001D\u0010\u001EJ\u0017\u0010\u001F\u001A\u00020\u000B2\u0006\u0010\u000F\u001A\u00020\u000EH\u0007¢\u0006\u0004\b\u001F\u0010 J\u001F\u0010$\u001A\u00020\u00042\u0006\u0010\"\u001A\u00020!2\u0006\u0010#\u001A\u00020\u000BH\u0007¢\u0006\u0004\b$\u0010%¨\u0006&"}, d2 = {"Landroidx/sqlite/db/SupportSQLiteCompat$Api16Impl;", "", "Landroid/os/CancellationSignal;", "cancellationSignal", "", "cancel", "(Landroid/os/CancellationSignal;)V", "createCancellationSignal", "()Landroid/os/CancellationSignal;", "Ljava/io/File;", "file", "", "deleteDatabase", "(Ljava/io/File;)Z", "Landroid/database/sqlite/SQLiteDatabase;", "sQLiteDatabase", "", "sql", "", "selectionArgs", "editTable", "Landroid/database/sqlite/SQLiteDatabase$CursorFactory;", "cursorFactory", "Landroid/database/Cursor;", "rawQueryWithFactory", "(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Landroid/os/CancellationSignal;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;)Landroid/database/Cursor;", "enable", "setForeignKeyConstraintsEnabled", "(Landroid/database/sqlite/SQLiteDatabase;Z)V", "disableWriteAheadLogging", "(Landroid/database/sqlite/SQLiteDatabase;)V", "isWriteAheadLoggingEnabled", "(Landroid/database/sqlite/SQLiteDatabase;)Z", "Landroid/database/sqlite/SQLiteOpenHelper;", "sQLiteOpenHelper", "enabled", "setWriteAheadLoggingEnabled", "(Landroid/database/sqlite/SQLiteOpenHelper;Z)V", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Api16Impl {
        @NotNull
        public static final Api16Impl INSTANCE;

        static {
            Api16Impl.INSTANCE = new Api16Impl();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        @RestrictTo({Scope.LIBRARY_GROUP})
        @JvmStatic
        public static final void cancel(@NotNull CancellationSignal cancellationSignal0) {
            Intrinsics.checkNotNullParameter(cancellationSignal0, "cancellationSignal");
            cancellationSignal0.cancel();
        }

        @RestrictTo({Scope.LIBRARY_GROUP})
        @JvmStatic
        @NotNull
        public static final CancellationSignal createCancellationSignal() {
            return new CancellationSignal();
        }

        @RestrictTo({Scope.LIBRARY_GROUP})
        @JvmStatic
        public static final boolean deleteDatabase(@NotNull File file0) {
            Intrinsics.checkNotNullParameter(file0, "file");
            return SQLiteDatabase.deleteDatabase(file0);
        }

        @RestrictTo({Scope.LIBRARY_GROUP})
        @JvmStatic
        public static final void disableWriteAheadLogging(@NotNull SQLiteDatabase sQLiteDatabase0) {
            Intrinsics.checkNotNullParameter(sQLiteDatabase0, "sQLiteDatabase");
            sQLiteDatabase0.disableWriteAheadLogging();
        }

        @RestrictTo({Scope.LIBRARY_GROUP})
        @JvmStatic
        public static final boolean isWriteAheadLoggingEnabled(@NotNull SQLiteDatabase sQLiteDatabase0) {
            Intrinsics.checkNotNullParameter(sQLiteDatabase0, "sQLiteDatabase");
            return sQLiteDatabase0.isWriteAheadLoggingEnabled();
        }

        @RestrictTo({Scope.LIBRARY_GROUP})
        @JvmStatic
        @NotNull
        public static final Cursor rawQueryWithFactory(@NotNull SQLiteDatabase sQLiteDatabase0, @NotNull String s, @NotNull String[] arr_s, @Nullable String s1, @NotNull CancellationSignal cancellationSignal0, @NotNull SQLiteDatabase.CursorFactory sQLiteDatabase$CursorFactory0) {
            Intrinsics.checkNotNullParameter(sQLiteDatabase0, "sQLiteDatabase");
            Intrinsics.checkNotNullParameter(s, "sql");
            Intrinsics.checkNotNullParameter(arr_s, "selectionArgs");
            Intrinsics.checkNotNullParameter(cancellationSignal0, "cancellationSignal");
            Intrinsics.checkNotNullParameter(sQLiteDatabase$CursorFactory0, "cursorFactory");
            Cursor cursor0 = sQLiteDatabase0.rawQueryWithFactory(sQLiteDatabase$CursorFactory0, s, arr_s, s1, cancellationSignal0);
            Intrinsics.checkNotNullExpressionValue(cursor0, "sQLiteDatabase.rawQueryW…ationSignal\n            )");
            return cursor0;
        }

        @RestrictTo({Scope.LIBRARY_GROUP})
        @JvmStatic
        public static final void setForeignKeyConstraintsEnabled(@NotNull SQLiteDatabase sQLiteDatabase0, boolean z) {
            Intrinsics.checkNotNullParameter(sQLiteDatabase0, "sQLiteDatabase");
            sQLiteDatabase0.setForeignKeyConstraintsEnabled(z);
        }

        @RestrictTo({Scope.LIBRARY_GROUP})
        @JvmStatic
        public static final void setWriteAheadLoggingEnabled(@NotNull SQLiteOpenHelper sQLiteOpenHelper0, boolean z) {
            Intrinsics.checkNotNullParameter(sQLiteOpenHelper0, "sQLiteOpenHelper");
            sQLiteOpenHelper0.setWriteAheadLoggingEnabled(z);
        }
    }

    @RequiresApi(19)
    @RestrictTo({Scope.LIBRARY_GROUP})
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001A\u00020\t2\u0006\u0010\b\u001A\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000B¨\u0006\f"}, d2 = {"Landroidx/sqlite/db/SupportSQLiteCompat$Api19Impl;", "", "Landroid/database/Cursor;", "cursor", "Landroid/net/Uri;", "getNotificationUri", "(Landroid/database/Cursor;)Landroid/net/Uri;", "Landroid/app/ActivityManager;", "activityManager", "", "isLowRamDevice", "(Landroid/app/ActivityManager;)Z", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Api19Impl {
        @NotNull
        public static final Api19Impl INSTANCE;

        static {
            Api19Impl.INSTANCE = new Api19Impl();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        @RestrictTo({Scope.LIBRARY_GROUP})
        @JvmStatic
        @NotNull
        public static final Uri getNotificationUri(@NotNull Cursor cursor0) {
            Intrinsics.checkNotNullParameter(cursor0, "cursor");
            Uri uri0 = cursor0.getNotificationUri();
            Intrinsics.checkNotNullExpressionValue(uri0, "cursor.notificationUri");
            return uri0;
        }

        @RestrictTo({Scope.LIBRARY_GROUP})
        @JvmStatic
        public static final boolean isLowRamDevice(@NotNull ActivityManager activityManager0) {
            Intrinsics.checkNotNullParameter(activityManager0, "activityManager");
            return activityManager0.isLowRamDevice();
        }
    }

    @RequiresApi(21)
    @RestrictTo({Scope.LIBRARY_GROUP})
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/sqlite/db/SupportSQLiteCompat$Api21Impl;", "", "Landroid/content/Context;", "context", "Ljava/io/File;", "getNoBackupFilesDir", "(Landroid/content/Context;)Ljava/io/File;", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Api21Impl {
        @NotNull
        public static final Api21Impl INSTANCE;

        static {
            Api21Impl.INSTANCE = new Api21Impl();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        @RestrictTo({Scope.LIBRARY_GROUP})
        @JvmStatic
        @NotNull
        public static final File getNoBackupFilesDir(@NotNull Context context0) {
            Intrinsics.checkNotNullParameter(context0, "context");
            File file0 = context0.getNoBackupFilesDir();
            Intrinsics.checkNotNullExpressionValue(file0, "context.noBackupFilesDir");
            return file0;
        }
    }

    @RequiresApi(23)
    @RestrictTo({Scope.LIBRARY_GROUP})
    @Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u001F\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/sqlite/db/SupportSQLiteCompat$Api23Impl;", "", "Landroid/database/Cursor;", "cursor", "Landroid/os/Bundle;", "extras", "", "setExtras", "(Landroid/database/Cursor;Landroid/os/Bundle;)V", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Api23Impl {
        @NotNull
        public static final Api23Impl INSTANCE;

        static {
            Api23Impl.INSTANCE = new Api23Impl();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        @RestrictTo({Scope.LIBRARY_GROUP})
        @JvmStatic
        public static final void setExtras(@NotNull Cursor cursor0, @NotNull Bundle bundle0) {
            Intrinsics.checkNotNullParameter(cursor0, "cursor");
            Intrinsics.checkNotNullParameter(bundle0, "extras");
            cursor0.setExtras(bundle0);
        }
    }

    @RequiresApi(29)
    @RestrictTo({Scope.LIBRARY_GROUP})
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001J/\u0010\n\u001A\u00020\t2\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u00042\u000E\u0010\b\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000BJ\u001D\u0010\f\u001A\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000E"}, d2 = {"Landroidx/sqlite/db/SupportSQLiteCompat$Api29Impl;", "", "Landroid/database/Cursor;", "cursor", "Landroid/content/ContentResolver;", "cr", "", "Landroid/net/Uri;", "uris", "", "setNotificationUris", "(Landroid/database/Cursor;Landroid/content/ContentResolver;Ljava/util/List;)V", "getNotificationUris", "(Landroid/database/Cursor;)Ljava/util/List;", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Api29Impl {
        @NotNull
        public static final Api29Impl INSTANCE;

        static {
            Api29Impl.INSTANCE = new Api29Impl();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        @RestrictTo({Scope.LIBRARY_GROUP})
        @JvmStatic
        @NotNull
        public static final List getNotificationUris(@NotNull Cursor cursor0) {
            Intrinsics.checkNotNullParameter(cursor0, "cursor");
            List list0 = cursor0.getNotificationUris();
            Intrinsics.checkNotNull(list0);
            return list0;
        }

        @RestrictTo({Scope.LIBRARY_GROUP})
        @JvmStatic
        public static final void setNotificationUris(@NotNull Cursor cursor0, @NotNull ContentResolver contentResolver0, @NotNull List list0) {
            Intrinsics.checkNotNullParameter(cursor0, "cursor");
            Intrinsics.checkNotNullParameter(contentResolver0, "cr");
            Intrinsics.checkNotNullParameter(list0, "uris");
            cursor0.setNotificationUris(contentResolver0, list0);
        }
    }

}

