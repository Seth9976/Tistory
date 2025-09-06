package androidx.room;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import androidx.annotation.RequiresApi;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.collections.k;
import kotlin.collections.o;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u008A\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000E\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0000\u0018\u00002\u00020\u0001B\u001F\u0012\u0006\u0010\u0002\u001A\u00020\u0001\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u00A2\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001A\u00020\tH\u0096\u0001\u00A2\u0006\u0004\b\n\u0010\u000BJ6\u0010\u0013\u001A\u00020\u00122\u0006\u0010\r\u001A\u00020\f2\b\u0010\u000E\u001A\u0004\u0018\u00010\f2\u0012\u0010\u0011\u001A\u000E\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u000FH\u0096\u0001\u00A2\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001A\u00020\tH\u0097\u0001\u00A2\u0006\u0004\b\u0015\u0010\u000BJ\u0010\u0010\u0017\u001A\u00020\u0016H\u0096\u0001\u00A2\u0006\u0004\b\u0017\u0010\u0018J.\u0010\u001B\u001A\u00020\t2\u0006\u0010\u0019\u001A\u00020\f2\u0014\b\u0001\u0010\u001A\u001A\u000E\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u000FH\u0096\u0001\u00A2\u0006\u0004\b\u001B\u0010\u001CJ\u0010\u0010\u001D\u001A\u00020\u0016H\u0096\u0001\u00A2\u0006\u0004\b\u001D\u0010\u0018J(\u0010\"\u001A\u00020!2\u0006\u0010\r\u001A\u00020\f2\u0006\u0010\u001E\u001A\u00020\u00122\u0006\u0010 \u001A\u00020\u001FH\u0096\u0001\u00A2\u0006\u0004\b\"\u0010#J\u0018\u0010%\u001A\u00020\u00162\u0006\u0010$\u001A\u00020\u0012H\u0096\u0001\u00A2\u0006\u0004\b%\u0010&J\u0018\u0010(\u001A\u00020\t2\u0006\u0010\'\u001A\u00020\u0016H\u0097\u0001\u00A2\u0006\u0004\b(\u0010)J\u0018\u0010,\u001A\u00020\t2\u0006\u0010+\u001A\u00020*H\u0096\u0001\u00A2\u0006\u0004\b,\u0010-J\u0018\u0010/\u001A\u00020\t2\u0006\u0010.\u001A\u00020\u0012H\u0096\u0001\u00A2\u0006\u0004\b/\u00100J\u0018\u00102\u001A\u00020!2\u0006\u00101\u001A\u00020!H\u0096\u0001\u00A2\u0006\u0004\b2\u00103JF\u00104\u001A\u00020\u00122\u0006\u0010\r\u001A\u00020\f2\u0006\u0010\u001E\u001A\u00020\u00122\u0006\u0010 \u001A\u00020\u001F2\b\u0010\u000E\u001A\u0004\u0018\u00010\f2\u0012\u0010\u0011\u001A\u000E\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u000FH\u0096\u0001\u00A2\u0006\u0004\b4\u00105J\u0010\u00106\u001A\u00020\u0016H\u0096\u0001\u00A2\u0006\u0004\b6\u0010\u0018J\u0018\u00106\u001A\u00020\u00162\u0006\u00107\u001A\u00020!H\u0096\u0001\u00A2\u0006\u0004\b6\u00108J\u0017\u0010:\u001A\u0002092\u0006\u0010\u0019\u001A\u00020\fH\u0016\u00A2\u0006\u0004\b:\u0010;J\u000F\u0010<\u001A\u00020\tH\u0016\u00A2\u0006\u0004\b<\u0010\u000BJ\u000F\u0010=\u001A\u00020\tH\u0016\u00A2\u0006\u0004\b=\u0010\u000BJ\u0017\u0010@\u001A\u00020\t2\u0006\u0010?\u001A\u00020>H\u0016\u00A2\u0006\u0004\b@\u0010AJ\u0017\u0010B\u001A\u00020\t2\u0006\u0010?\u001A\u00020>H\u0016\u00A2\u0006\u0004\bB\u0010AJ\u000F\u0010C\u001A\u00020\tH\u0016\u00A2\u0006\u0004\bC\u0010\u000BJ\u000F\u0010D\u001A\u00020\tH\u0016\u00A2\u0006\u0004\bD\u0010\u000BJ\u0017\u0010E\u001A\u00020F2\u0006\u0010E\u001A\u00020\fH\u0016\u00A2\u0006\u0004\bE\u0010GJ)\u0010E\u001A\u00020F2\u0006\u0010E\u001A\u00020\f2\u0010\u0010\u001A\u001A\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00100\u000FH\u0016\u00A2\u0006\u0004\bE\u0010HJ\u0017\u0010E\u001A\u00020F2\u0006\u0010E\u001A\u00020IH\u0016\u00A2\u0006\u0004\bE\u0010JJ!\u0010E\u001A\u00020F2\u0006\u0010E\u001A\u00020I2\b\u0010L\u001A\u0004\u0018\u00010KH\u0016\u00A2\u0006\u0004\bE\u0010MJ\u0017\u0010N\u001A\u00020\t2\u0006\u0010\u0019\u001A\u00020\fH\u0016\u00A2\u0006\u0004\bN\u0010OJ)\u0010N\u001A\u00020\t2\u0006\u0010\u0019\u001A\u00020\f2\u0010\u0010\u001A\u001A\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00100\u000FH\u0016\u00A2\u0006\u0004\bN\u0010\u001CR(\u0010T\u001A\u0016\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0Q\u0018\u00010P8VX\u0096\u0005\u00A2\u0006\u0006\u001A\u0004\bR\u0010SR\u0014\u0010U\u001A\u00020\u00168\u0016X\u0096\u0005\u00A2\u0006\u0006\u001A\u0004\bU\u0010\u0018R\u0014\u0010V\u001A\u00020\u00168\u0016X\u0096\u0005\u00A2\u0006\u0006\u001A\u0004\bV\u0010\u0018R\u0014\u0010W\u001A\u00020\u00168VX\u0096\u0005\u00A2\u0006\u0006\u001A\u0004\bW\u0010\u0018R\u0014\u0010X\u001A\u00020\u00168\u0016X\u0096\u0005\u00A2\u0006\u0006\u001A\u0004\bX\u0010\u0018R\u0014\u0010Y\u001A\u00020\u00168\u0016X\u0096\u0005\u00A2\u0006\u0006\u001A\u0004\bY\u0010\u0018R\u0014\u0010Z\u001A\u00020\u00168WX\u0096\u0005\u00A2\u0006\u0006\u001A\u0004\bZ\u0010\u0018R\u0014\u0010]\u001A\u00020!8\u0016X\u0096\u0005\u00A2\u0006\u0006\u001A\u0004\b[\u0010\\R\u001C\u0010a\u001A\u00020!8\u0016@\u0016X\u0096\u000F\u00A2\u0006\f\u001A\u0004\b^\u0010\\\"\u0004\b_\u0010`R\u0016\u0010d\u001A\u0004\u0018\u00010\f8\u0016X\u0096\u0005\u00A2\u0006\u0006\u001A\u0004\bb\u0010cR\u001C\u0010h\u001A\u00020\u00128\u0016@\u0016X\u0096\u000F\u00A2\u0006\f\u001A\u0004\be\u0010f\"\u0004\bg\u00100\u00A8\u0006i"}, d2 = {"Landroidx/room/QueryInterceptorDatabase;", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "delegate", "Ljava/util/concurrent/Executor;", "queryCallbackExecutor", "Landroidx/room/RoomDatabase$QueryCallback;", "queryCallback", "<init>", "(Landroidx/sqlite/db/SupportSQLiteDatabase;Ljava/util/concurrent/Executor;Landroidx/room/RoomDatabase$QueryCallback;)V", "", "close", "()V", "", "table", "whereClause", "", "", "whereArgs", "", "delete", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I", "disableWriteAheadLogging", "", "enableWriteAheadLogging", "()Z", "sql", "bindArgs", "execPerConnectionSQL", "(Ljava/lang/String;[Ljava/lang/Object;)V", "inTransaction", "conflictAlgorithm", "Landroid/content/ContentValues;", "values", "", "insert", "(Ljava/lang/String;ILandroid/content/ContentValues;)J", "newVersion", "needUpgrade", "(I)Z", "enabled", "setForeignKeyConstraintsEnabled", "(Z)V", "Ljava/util/Locale;", "locale", "setLocale", "(Ljava/util/Locale;)V", "cacheSize", "setMaxSqlCacheSize", "(I)V", "numBytes", "setMaximumSize", "(J)J", "update", "(Ljava/lang/String;ILandroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/Object;)I", "yieldIfContendedSafely", "sleepAfterYieldDelayMillis", "(J)Z", "Landroidx/sqlite/db/SupportSQLiteStatement;", "compileStatement", "(Ljava/lang/String;)Landroidx/sqlite/db/SupportSQLiteStatement;", "beginTransaction", "beginTransactionNonExclusive", "Landroid/database/sqlite/SQLiteTransactionListener;", "transactionListener", "beginTransactionWithListener", "(Landroid/database/sqlite/SQLiteTransactionListener;)V", "beginTransactionWithListenerNonExclusive", "endTransaction", "setTransactionSuccessful", "query", "Landroid/database/Cursor;", "(Ljava/lang/String;)Landroid/database/Cursor;", "(Ljava/lang/String;[Ljava/lang/Object;)Landroid/database/Cursor;", "Landroidx/sqlite/db/SupportSQLiteQuery;", "(Landroidx/sqlite/db/SupportSQLiteQuery;)Landroid/database/Cursor;", "Landroid/os/CancellationSignal;", "cancellationSignal", "(Landroidx/sqlite/db/SupportSQLiteQuery;Landroid/os/CancellationSignal;)Landroid/database/Cursor;", "execSQL", "(Ljava/lang/String;)V", "", "Landroid/util/Pair;", "getAttachedDbs", "()Ljava/util/List;", "attachedDbs", "isDatabaseIntegrityOk", "isDbLockedByCurrentThread", "isExecPerConnectionSQLSupported", "isOpen", "isReadOnly", "isWriteAheadLoggingEnabled", "getMaximumSize", "()J", "maximumSize", "getPageSize", "setPageSize", "(J)V", "pageSize", "getPath", "()Ljava/lang/String;", "path", "getVersion", "()I", "setVersion", "version", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nQueryInterceptorDatabase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QueryInterceptorDatabase.kt\nandroidx/room/QueryInterceptorDatabase\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,146:1\n1#2:147\n37#3,2:148\n*S KotlinDebug\n*F\n+ 1 QueryInterceptorDatabase.kt\nandroidx/room/QueryInterceptorDatabase\n*L\n143#1:148,2\n*E\n"})
public final class QueryInterceptorDatabase implements SupportSQLiteDatabase {
    public final SupportSQLiteDatabase a;
    public final Executor b;
    public final QueryCallback c;

    public QueryInterceptorDatabase(@NotNull SupportSQLiteDatabase supportSQLiteDatabase0, @NotNull Executor executor0, @NotNull QueryCallback roomDatabase$QueryCallback0) {
        Intrinsics.checkNotNullParameter(supportSQLiteDatabase0, "delegate");
        Intrinsics.checkNotNullParameter(executor0, "queryCallbackExecutor");
        Intrinsics.checkNotNullParameter(roomDatabase$QueryCallback0, "queryCallback");
        super();
        this.a = supportSQLiteDatabase0;
        this.b = executor0;
        this.c = roomDatabase$QueryCallback0;
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    public void beginTransaction() {
        u0 u00 = new u0(this, 2);
        this.b.execute(u00);
        this.a.beginTransaction();
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    public void beginTransactionNonExclusive() {
        u0 u00 = new u0(this, 4);
        this.b.execute(u00);
        this.a.beginTransactionNonExclusive();
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    public void beginTransactionWithListener(@NotNull SQLiteTransactionListener sQLiteTransactionListener0) {
        Intrinsics.checkNotNullParameter(sQLiteTransactionListener0, "transactionListener");
        u0 u00 = new u0(this, 5);
        this.b.execute(u00);
        this.a.beginTransactionWithListener(sQLiteTransactionListener0);
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    public void beginTransactionWithListenerNonExclusive(@NotNull SQLiteTransactionListener sQLiteTransactionListener0) {
        Intrinsics.checkNotNullParameter(sQLiteTransactionListener0, "transactionListener");
        u0 u00 = new u0(this, 1);
        this.b.execute(u00);
        this.a.beginTransactionWithListenerNonExclusive(sQLiteTransactionListener0);
    }

    @Override
    public void close() {
        this.a.close();
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    @NotNull
    public SupportSQLiteStatement compileStatement(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "sql");
        return new QueryInterceptorStatement(this.a.compileStatement(s), s, this.b, this.c);
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    public int delete(@NotNull String s, @Nullable String s1, @Nullable Object[] arr_object) {
        Intrinsics.checkNotNullParameter(s, "table");
        return this.a.delete(s, s1, arr_object);
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    @RequiresApi(api = 16)
    public void disableWriteAheadLogging() {
        this.a.disableWriteAheadLogging();
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean enableWriteAheadLogging() {
        return this.a.enableWriteAheadLogging();
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    public void endTransaction() {
        u0 u00 = new u0(this, 0);
        this.b.execute(u00);
        this.a.endTransaction();
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    public void execPerConnectionSQL(@NotNull String s, @SuppressLint({"ArrayReturn"}) @Nullable Object[] arr_object) {
        Intrinsics.checkNotNullParameter(s, "sql");
        this.a.execPerConnectionSQL(s, arr_object);
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    public void execSQL(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "sql");
        v0 v00 = new v0(this, s, 1);
        this.b.execute(v00);
        this.a.execSQL(s);
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    public void execSQL(@NotNull String s, @NotNull Object[] arr_object) {
        Intrinsics.checkNotNullParameter(s, "sql");
        Intrinsics.checkNotNullParameter(arr_object, "bindArgs");
        List list0 = k.createListBuilder();
        o.addAll(list0, arr_object);
        List list1 = k.build(list0);
        androidx.emoji2.text.k k0 = new androidx.emoji2.text.k(this, s, 2, list1);
        this.b.execute(k0);
        Object[] arr_object1 = list1.toArray(new Object[0]);
        this.a.execSQL(s, arr_object1);
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
    public long insert(@NotNull String s, int v, @NotNull ContentValues contentValues0) {
        Intrinsics.checkNotNullParameter(s, "table");
        Intrinsics.checkNotNullParameter(contentValues0, "values");
        return this.a.insert(s, v, contentValues0);
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean isDatabaseIntegrityOk() {
        return this.a.isDatabaseIntegrityOk();
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean isDbLockedByCurrentThread() {
        return this.a.isDbLockedByCurrentThread();
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean isExecPerConnectionSQLSupported() {
        return this.a.isExecPerConnectionSQLSupported();
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
        return this.a.isWriteAheadLoggingEnabled();
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean needUpgrade(int v) {
        return this.a.needUpgrade(v);
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    @NotNull
    public Cursor query(@NotNull SupportSQLiteQuery supportSQLiteQuery0) {
        Intrinsics.checkNotNullParameter(supportSQLiteQuery0, "query");
        QueryInterceptorProgram queryInterceptorProgram0 = new QueryInterceptorProgram();
        supportSQLiteQuery0.bindTo(queryInterceptorProgram0);
        w0 w00 = new w0(this, supportSQLiteQuery0, queryInterceptorProgram0, 0);
        this.b.execute(w00);
        return this.a.query(supportSQLiteQuery0);
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    @NotNull
    public Cursor query(@NotNull SupportSQLiteQuery supportSQLiteQuery0, @Nullable CancellationSignal cancellationSignal0) {
        Intrinsics.checkNotNullParameter(supportSQLiteQuery0, "query");
        QueryInterceptorProgram queryInterceptorProgram0 = new QueryInterceptorProgram();
        supportSQLiteQuery0.bindTo(queryInterceptorProgram0);
        w0 w00 = new w0(this, supportSQLiteQuery0, queryInterceptorProgram0, 1);
        this.b.execute(w00);
        return this.a.query(supportSQLiteQuery0);
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    @NotNull
    public Cursor query(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "query");
        v0 v00 = new v0(this, s, 0);
        this.b.execute(v00);
        return this.a.query(s);
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    @NotNull
    public Cursor query(@NotNull String s, @NotNull Object[] arr_object) {
        Intrinsics.checkNotNullParameter(s, "query");
        Intrinsics.checkNotNullParameter(arr_object, "bindArgs");
        androidx.emoji2.text.k k0 = new androidx.emoji2.text.k(this, s, 1, arr_object);
        this.b.execute(k0);
        return this.a.query(s, arr_object);
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    @RequiresApi(api = 16)
    public void setForeignKeyConstraintsEnabled(boolean z) {
        this.a.setForeignKeyConstraintsEnabled(z);
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
        return this.a.setMaximumSize(v);
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    public void setPageSize(long v) {
        this.a.setPageSize(v);
    }

    @Override  // androidx.sqlite.db.SupportSQLiteDatabase
    public void setTransactionSuccessful() {
        u0 u00 = new u0(this, 3);
        this.b.execute(u00);
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
        return this.a.update(s, v, contentValues0, s1, arr_object);
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

