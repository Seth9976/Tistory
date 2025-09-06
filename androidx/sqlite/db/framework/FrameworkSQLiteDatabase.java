package androidx.sqlite.db.framework;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.Build.VERSION;
import android.os.CancellationSignal;
import android.text.TextUtils;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.foundation.text.selection.a1;
import androidx.sqlite.db.SimpleSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteCompat.Api16Impl;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import b5.a;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000E\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 j2\u00020\u0001:\u0002kjB\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u00A2\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00020\u0006H\u0016\u00A2\u0006\u0004\b\t\u0010\nJ\u000F\u0010\f\u001A\u00020\u000BH\u0016\u00A2\u0006\u0004\b\f\u0010\rJ\u000F\u0010\u000E\u001A\u00020\u000BH\u0016\u00A2\u0006\u0004\b\u000E\u0010\rJ\u0017\u0010\u0011\u001A\u00020\u000B2\u0006\u0010\u0010\u001A\u00020\u000FH\u0016\u00A2\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001A\u00020\u000B2\u0006\u0010\u0010\u001A\u00020\u000FH\u0016\u00A2\u0006\u0004\b\u0013\u0010\u0012J\u000F\u0010\u0014\u001A\u00020\u000BH\u0016\u00A2\u0006\u0004\b\u0014\u0010\rJ\u000F\u0010\u0015\u001A\u00020\u000BH\u0016\u00A2\u0006\u0004\b\u0015\u0010\rJ\u000F\u0010\u0017\u001A\u00020\u0016H\u0016\u00A2\u0006\u0004\b\u0017\u0010\u0018J\u000F\u0010\u0019\u001A\u00020\u0016H\u0016\u00A2\u0006\u0004\b\u0019\u0010\u0018J\u0017\u0010\u0019\u001A\u00020\u00162\u0006\u0010\u001B\u001A\u00020\u001AH\u0016\u00A2\u0006\u0004\b\u0019\u0010\u001CJ\u0017\u0010\u001E\u001A\u00020\u001A2\u0006\u0010\u001D\u001A\u00020\u001AH\u0016\u00A2\u0006\u0004\b\u001E\u0010\u001FJ+\u0010#\u001A\u00020\u000B2\u0006\u0010\u0007\u001A\u00020\u00062\u0012\u0010\"\u001A\u000E\u0012\b\b\u0001\u0012\u0004\u0018\u00010!\u0018\u00010 H\u0016\u00A2\u0006\u0004\b#\u0010$J\u0017\u0010%\u001A\u00020&2\u0006\u0010%\u001A\u00020\u0006H\u0016\u00A2\u0006\u0004\b%\u0010\'J)\u0010%\u001A\u00020&2\u0006\u0010%\u001A\u00020\u00062\u0010\u0010\"\u001A\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010!0 H\u0016\u00A2\u0006\u0004\b%\u0010(J\u0017\u0010%\u001A\u00020&2\u0006\u0010%\u001A\u00020)H\u0016\u00A2\u0006\u0004\b%\u0010*J!\u0010%\u001A\u00020&2\u0006\u0010%\u001A\u00020)2\b\u0010,\u001A\u0004\u0018\u00010+H\u0017\u00A2\u0006\u0004\b%\u0010-J\'\u00103\u001A\u00020\u001A2\u0006\u0010.\u001A\u00020\u00062\u0006\u00100\u001A\u00020/2\u0006\u00102\u001A\u000201H\u0016\u00A2\u0006\u0004\b3\u00104J5\u00107\u001A\u00020/2\u0006\u0010.\u001A\u00020\u00062\b\u00105\u001A\u0004\u0018\u00010\u00062\u0012\u00106\u001A\u000E\u0012\b\b\u0001\u0012\u0004\u0018\u00010!\u0018\u00010 H\u0016\u00A2\u0006\u0004\b7\u00108JE\u00109\u001A\u00020/2\u0006\u0010.\u001A\u00020\u00062\u0006\u00100\u001A\u00020/2\u0006\u00102\u001A\u0002012\b\u00105\u001A\u0004\u0018\u00010\u00062\u0012\u00106\u001A\u000E\u0012\b\b\u0001\u0012\u0004\u0018\u00010!\u0018\u00010 H\u0016\u00A2\u0006\u0004\b9\u0010:J\u0017\u0010;\u001A\u00020\u000B2\u0006\u0010\u0007\u001A\u00020\u0006H\u0016\u00A2\u0006\u0004\b;\u0010<J)\u0010;\u001A\u00020\u000B2\u0006\u0010\u0007\u001A\u00020\u00062\u0010\u0010\"\u001A\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010!0 H\u0016\u00A2\u0006\u0004\b;\u0010$J\u0017\u0010>\u001A\u00020\u00162\u0006\u0010=\u001A\u00020/H\u0016\u00A2\u0006\u0004\b>\u0010?J\u0017\u0010B\u001A\u00020\u000B2\u0006\u0010A\u001A\u00020@H\u0016\u00A2\u0006\u0004\bB\u0010CJ\u0017\u0010E\u001A\u00020\u000B2\u0006\u0010D\u001A\u00020/H\u0016\u00A2\u0006\u0004\bE\u0010FJ\u0017\u0010H\u001A\u00020\u000B2\u0006\u0010G\u001A\u00020\u0016H\u0017\u00A2\u0006\u0004\bH\u0010IJ\u000F\u0010J\u001A\u00020\u0016H\u0016\u00A2\u0006\u0004\bJ\u0010\u0018J\u000F\u0010K\u001A\u00020\u000BH\u0017\u00A2\u0006\u0004\bK\u0010\rJ\u000F\u0010L\u001A\u00020\u000BH\u0016\u00A2\u0006\u0004\bL\u0010\rJ\u0015\u0010N\u001A\u00020\u00162\u0006\u0010M\u001A\u00020\u0002\u00A2\u0006\u0004\bN\u0010OR\u0014\u0010P\u001A\u00020\u00168VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bP\u0010\u0018R$\u0010U\u001A\u00020/2\u0006\u0010Q\u001A\u00020/8V@VX\u0096\u000E\u00A2\u0006\f\u001A\u0004\bR\u0010S\"\u0004\bT\u0010FR$\u0010Y\u001A\u00020\u001A2\u0006\u0010\u001D\u001A\u00020\u001A8V@VX\u0096\u000E\u00A2\u0006\f\u001A\u0004\bV\u0010W\"\u0004\b\u001E\u0010XR\u0014\u0010Z\u001A\u00020\u00168VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bZ\u0010\u0018R$\u0010]\u001A\u00020\u001A2\u0006\u0010\u001D\u001A\u00020\u001A8V@VX\u0096\u000E\u00A2\u0006\f\u001A\u0004\b[\u0010W\"\u0004\b\\\u0010XR\u0014\u0010^\u001A\u00020\u00168VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b^\u0010\u0018R\u0014\u0010_\u001A\u00020\u00168VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b_\u0010\u0018R\u0016\u0010b\u001A\u0004\u0018\u00010\u00068VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b`\u0010aR\u0014\u0010c\u001A\u00020\u00168WX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bc\u0010\u0018R(\u0010h\u001A\u0016\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060e\u0018\u00010d8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bf\u0010gR\u0014\u0010i\u001A\u00020\u00168VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bi\u0010\u0018\u00A8\u0006l"}, d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteDatabase;", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "Landroid/database/sqlite/SQLiteDatabase;", "delegate", "<init>", "(Landroid/database/sqlite/SQLiteDatabase;)V", "", "sql", "Landroidx/sqlite/db/SupportSQLiteStatement;", "compileStatement", "(Ljava/lang/String;)Landroidx/sqlite/db/SupportSQLiteStatement;", "", "beginTransaction", "()V", "beginTransactionNonExclusive", "Landroid/database/sqlite/SQLiteTransactionListener;", "transactionListener", "beginTransactionWithListener", "(Landroid/database/sqlite/SQLiteTransactionListener;)V", "beginTransactionWithListenerNonExclusive", "endTransaction", "setTransactionSuccessful", "", "inTransaction", "()Z", "yieldIfContendedSafely", "", "sleepAfterYieldDelayMillis", "(J)Z", "numBytes", "setMaximumSize", "(J)J", "", "", "bindArgs", "execPerConnectionSQL", "(Ljava/lang/String;[Ljava/lang/Object;)V", "query", "Landroid/database/Cursor;", "(Ljava/lang/String;)Landroid/database/Cursor;", "(Ljava/lang/String;[Ljava/lang/Object;)Landroid/database/Cursor;", "Landroidx/sqlite/db/SupportSQLiteQuery;", "(Landroidx/sqlite/db/SupportSQLiteQuery;)Landroid/database/Cursor;", "Landroid/os/CancellationSignal;", "cancellationSignal", "(Landroidx/sqlite/db/SupportSQLiteQuery;Landroid/os/CancellationSignal;)Landroid/database/Cursor;", "table", "", "conflictAlgorithm", "Landroid/content/ContentValues;", "values", "insert", "(Ljava/lang/String;ILandroid/content/ContentValues;)J", "whereClause", "whereArgs", "delete", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I", "update", "(Ljava/lang/String;ILandroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/Object;)I", "execSQL", "(Ljava/lang/String;)V", "newVersion", "needUpgrade", "(I)Z", "Ljava/util/Locale;", "locale", "setLocale", "(Ljava/util/Locale;)V", "cacheSize", "setMaxSqlCacheSize", "(I)V", "enabled", "setForeignKeyConstraintsEnabled", "(Z)V", "enableWriteAheadLogging", "disableWriteAheadLogging", "close", "sqLiteDatabase", "isDelegate", "(Landroid/database/sqlite/SQLiteDatabase;)Z", "isDbLockedByCurrentThread", "value", "getVersion", "()I", "setVersion", "version", "getMaximumSize", "()J", "(J)V", "maximumSize", "isExecPerConnectionSQLSupported", "getPageSize", "setPageSize", "pageSize", "isReadOnly", "isOpen", "getPath", "()Ljava/lang/String;", "path", "isWriteAheadLoggingEnabled", "", "Landroid/util/Pair;", "getAttachedDbs", "()Ljava/util/List;", "attachedDbs", "isDatabaseIntegrityOk", "Companion", "Api30Impl", "sqlite-framework_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nFrameworkSQLiteDatabase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FrameworkSQLiteDatabase.kt\nandroidx/sqlite/db/framework/FrameworkSQLiteDatabase\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,336:1\n1#2:337\n*E\n"})
public final class FrameworkSQLiteDatabase implements SupportSQLiteDatabase {
    @RequiresApi(30)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001J3\u0010\t\u001A\u00020\b2\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u00042\u0012\u0010\u0007\u001A\u000E\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000B"}, d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteDatabase$Api30Impl;", "", "Landroid/database/sqlite/SQLiteDatabase;", "sQLiteDatabase", "", "sql", "", "bindArgs", "", "execPerConnectionSQL", "(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;[Ljava/lang/Object;)V", "sqlite-framework_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Api30Impl {
        @NotNull
        public static final Api30Impl INSTANCE;

        static {
            Api30Impl.INSTANCE = new Api30Impl();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        @DoNotInline
        public final void execPerConnectionSQL(@NotNull SQLiteDatabase sQLiteDatabase0, @NotNull String s, @Nullable Object[] arr_object) {
            Intrinsics.checkNotNullParameter(sQLiteDatabase0, "sQLiteDatabase");
            Intrinsics.checkNotNullParameter(s, "sql");
            sQLiteDatabase0.execPerConnectionSQL(s, arr_object);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000E\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001A\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001C\u0010\u0006\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005¨\u0006\u0007"}, d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteDatabase$Companion;", "", "", "", "CONFLICT_VALUES", "[Ljava/lang/String;", "EMPTY_STRING_ARRAY", "sqlite-framework_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    @NotNull
    public static final Companion Companion;
    public final SQLiteDatabase a;
    public static final String[] b;
    public static final String[] c;

    static {
        FrameworkSQLiteDatabase.Companion = new Companion(null);
        FrameworkSQLiteDatabase.b = new String[]{"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
        FrameworkSQLiteDatabase.c = new String[0];
    }

    public FrameworkSQLiteDatabase(@NotNull SQLiteDatabase sQLiteDatabase0) {
        Intrinsics.checkNotNullParameter(sQLiteDatabase0, "delegate");
        super();
        this.a = sQLiteDatabase0;
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    public void beginTransaction() {
        this.a.beginTransaction();
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    public void beginTransactionNonExclusive() {
        this.a.beginTransactionNonExclusive();
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    public void beginTransactionWithListener(@NotNull SQLiteTransactionListener sQLiteTransactionListener0) {
        Intrinsics.checkNotNullParameter(sQLiteTransactionListener0, "transactionListener");
        this.a.beginTransactionWithListener(sQLiteTransactionListener0);
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    public void beginTransactionWithListenerNonExclusive(@NotNull SQLiteTransactionListener sQLiteTransactionListener0) {
        Intrinsics.checkNotNullParameter(sQLiteTransactionListener0, "transactionListener");
        this.a.beginTransactionWithListenerNonExclusive(sQLiteTransactionListener0);
    }

    @Override
    public void close() throws IOException {
        this.a.close();
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    @NotNull
    public SupportSQLiteStatement compileStatement(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "sql");
        SQLiteStatement sQLiteStatement0 = this.a.compileStatement(s);
        Intrinsics.checkNotNullExpressionValue(sQLiteStatement0, "delegate.compileStatement(sql)");
        return new FrameworkSQLiteStatement(sQLiteStatement0);
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    public int delete(@NotNull String s, @Nullable String s1, @Nullable Object[] arr_object) {
        Intrinsics.checkNotNullParameter(s, "table");
        StringBuilder stringBuilder0 = new StringBuilder("DELETE FROM ");
        stringBuilder0.append(s);
        if(s1 != null && s1.length() != 0) {
            stringBuilder0.append(" WHERE ");
            stringBuilder0.append(s1);
        }
        String s2 = stringBuilder0.toString();
        Intrinsics.checkNotNullExpressionValue(s2, "StringBuilder().apply(builderAction).toString()");
        SupportSQLiteStatement supportSQLiteStatement0 = this.compileStatement(s2);
        SimpleSQLiteQuery.Companion.bind(supportSQLiteStatement0, arr_object);
        return supportSQLiteStatement0.executeUpdateDelete();
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    @RequiresApi(api = 16)
    public void disableWriteAheadLogging() {
        Api16Impl.disableWriteAheadLogging(this.a);
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean enableWriteAheadLogging() {
        return this.a.enableWriteAheadLogging();
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    public void endTransaction() {
        this.a.endTransaction();
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    public void execPerConnectionSQL(@NotNull String s, @Nullable Object[] arr_object) {
        Intrinsics.checkNotNullParameter(s, "sql");
        int v = Build.VERSION.SDK_INT;
        if(v < 30) {
            throw new UnsupportedOperationException("execPerConnectionSQL is not supported on a SDK version lower than 30, current version is: " + v);
        }
        Api30Impl.INSTANCE.execPerConnectionSQL(this.a, s, arr_object);
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    public void execSQL(@NotNull String s) throws SQLException {
        Intrinsics.checkNotNullParameter(s, "sql");
        this.a.execSQL(s);
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    public void execSQL(@NotNull String s, @NotNull Object[] arr_object) throws SQLException {
        Intrinsics.checkNotNullParameter(s, "sql");
        Intrinsics.checkNotNullParameter(arr_object, "bindArgs");
        this.a.execSQL(s, arr_object);
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    @Nullable
    public List getAttachedDbs() {
        return this.a.getAttachedDbs();
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    public long getMaximumSize() {
        return this.a.getMaximumSize();
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    public long getPageSize() {
        return this.a.getPageSize();
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    @Nullable
    public String getPath() {
        return this.a.getPath();
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    public int getVersion() {
        return this.a.getVersion();
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean inTransaction() {
        return this.a.inTransaction();
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    public long insert(@NotNull String s, int v, @NotNull ContentValues contentValues0) throws SQLException {
        Intrinsics.checkNotNullParameter(s, "table");
        Intrinsics.checkNotNullParameter(contentValues0, "values");
        return this.a.insertWithOnConflict(s, null, contentValues0, v);
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean isDatabaseIntegrityOk() {
        return this.a.isDatabaseIntegrityOk();
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean isDbLockedByCurrentThread() {
        return this.a.isDbLockedByCurrentThread();
    }

    public final boolean isDelegate(@NotNull SQLiteDatabase sQLiteDatabase0) {
        Intrinsics.checkNotNullParameter(sQLiteDatabase0, "sqLiteDatabase");
        return Intrinsics.areEqual(this.a, sQLiteDatabase0);
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean isExecPerConnectionSQLSupported() {
        return Build.VERSION.SDK_INT >= 30;
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean isOpen() {
        return this.a.isOpen();
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean isReadOnly() {
        return this.a.isReadOnly();
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    @RequiresApi(api = 16)
    public boolean isWriteAheadLoggingEnabled() {
        return Api16Impl.isWriteAheadLoggingEnabled(this.a);
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean needUpgrade(int v) {
        return this.a.needUpgrade(v);
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    @NotNull
    public Cursor query(@NotNull SupportSQLiteQuery supportSQLiteQuery0) {
        Intrinsics.checkNotNullParameter(supportSQLiteQuery0, "query");
        a a0 = new a(new a1(supportSQLiteQuery0, 1), 1);
        String s = supportSQLiteQuery0.getSql();
        Cursor cursor0 = this.a.rawQueryWithFactory(a0, s, FrameworkSQLiteDatabase.c, null);
        Intrinsics.checkNotNullExpressionValue(cursor0, "delegate.rawQueryWithFac…EMPTY_STRING_ARRAY, null)");
        return cursor0;
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    @RequiresApi(16)
    @NotNull
    public Cursor query(@NotNull SupportSQLiteQuery supportSQLiteQuery0, @Nullable CancellationSignal cancellationSignal0) {
        Intrinsics.checkNotNullParameter(supportSQLiteQuery0, "query");
        String s = supportSQLiteQuery0.getSql();
        Intrinsics.checkNotNull(cancellationSignal0);
        a a0 = new a(supportSQLiteQuery0, 0);
        return Api16Impl.rawQueryWithFactory(this.a, s, FrameworkSQLiteDatabase.c, null, cancellationSignal0, a0);
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    @NotNull
    public Cursor query(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "query");
        return this.query(new SimpleSQLiteQuery(s));
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    @NotNull
    public Cursor query(@NotNull String s, @NotNull Object[] arr_object) {
        Intrinsics.checkNotNullParameter(s, "query");
        Intrinsics.checkNotNullParameter(arr_object, "bindArgs");
        return this.query(new SimpleSQLiteQuery(s, arr_object));
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    @RequiresApi(api = 16)
    public void setForeignKeyConstraintsEnabled(boolean z) {
        Api16Impl.setForeignKeyConstraintsEnabled(this.a, z);
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    public void setLocale(@NotNull Locale locale0) {
        Intrinsics.checkNotNullParameter(locale0, "locale");
        this.a.setLocale(locale0);
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    public void setMaxSqlCacheSize(int v) {
        this.a.setMaxSqlCacheSize(v);
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    public long setMaximumSize(long v) {
        this.a.setMaximumSize(v);
        return this.a.getMaximumSize();
    }

    public void setMaximumSize(long v) {
        this.a.setMaximumSize(v);
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    public void setPageSize(long v) {
        this.a.setPageSize(v);
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    public void setTransactionSuccessful() {
        this.a.setTransactionSuccessful();
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    public void setVersion(int v) {
        this.a.setVersion(v);
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    public int update(@NotNull String s, int v, @NotNull ContentValues contentValues0, @Nullable String s1, @Nullable Object[] arr_object) {
        Intrinsics.checkNotNullParameter(s, "table");
        Intrinsics.checkNotNullParameter(contentValues0, "values");
        if(contentValues0.size() == 0) {
            throw new IllegalArgumentException("Empty values");
        }
        int v1 = contentValues0.size();
        int v2 = arr_object == null ? v1 : arr_object.length + v1;
        Object[] arr_object1 = new Object[v2];
        StringBuilder stringBuilder0 = new StringBuilder("UPDATE ");
        stringBuilder0.append(FrameworkSQLiteDatabase.b[v]);
        stringBuilder0.append(s);
        stringBuilder0.append(" SET ");
        int v3 = 0;
        for(Object object0: contentValues0.keySet()) {
            stringBuilder0.append((v3 <= 0 ? "" : ","));
            stringBuilder0.append(((String)object0));
            arr_object1[v3] = contentValues0.get(((String)object0));
            stringBuilder0.append("=?");
            ++v3;
        }
        if(arr_object != null) {
            for(int v4 = v1; v4 < v2; ++v4) {
                arr_object1[v4] = arr_object[v4 - v1];
            }
        }
        if(!TextUtils.isEmpty(s1)) {
            stringBuilder0.append(" WHERE ");
            stringBuilder0.append(s1);
        }
        String s2 = stringBuilder0.toString();
        Intrinsics.checkNotNullExpressionValue(s2, "StringBuilder().apply(builderAction).toString()");
        SupportSQLiteStatement supportSQLiteStatement0 = this.compileStatement(s2);
        SimpleSQLiteQuery.Companion.bind(supportSQLiteStatement0, arr_object1);
        return supportSQLiteStatement0.executeUpdateDelete();
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean yieldIfContendedSafely() {
        return this.a.yieldIfContendedSafely();
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean yieldIfContendedSafely(long v) {
        return this.a.yieldIfContendedSafely(v);
    }
}

