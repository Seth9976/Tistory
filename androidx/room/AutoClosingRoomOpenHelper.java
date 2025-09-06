package androidx.room;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import androidx.annotation.RequiresApi;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u001E\u001F B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0001\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000B\u001A\u00020\n2\u0006\u0010\t\u001A\u00020\bH\u0097\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u000F\u0010\r\u001A\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000ER\u001A\u0010\u0003\u001A\u00020\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000F\u0010\u0010\u001A\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001A\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0016\u0010\u0017\u001A\u0004\u0018\u00010\u00148\u0016X\u0096\u0005¢\u0006\u0006\u001A\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001B\u001A\u00020\u00188WX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0019\u0010\u001AR\u0014\u0010\u001D\u001A\u00020\u00188WX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u001C\u0010\u001A¨\u0006!"}, d2 = {"Landroidx/room/AutoClosingRoomOpenHelper;", "Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "Landroidx/room/DelegatingOpenHelper;", "delegate", "Landroidx/room/AutoCloser;", "autoCloser", "<init>", "(Landroidx/sqlite/db/SupportSQLiteOpenHelper;Landroidx/room/AutoCloser;)V", "", "enabled", "", "setWriteAheadLoggingEnabled", "(Z)V", "close", "()V", "a", "Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "getDelegate", "()Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "Landroidx/room/AutoCloser;", "", "getDatabaseName", "()Ljava/lang/String;", "databaseName", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "getWritableDatabase", "()Landroidx/sqlite/db/SupportSQLiteDatabase;", "writableDatabase", "getReadableDatabase", "readableDatabase", "AutoClosingSupportSQLiteDatabase", "androidx/room/j0", "androidx/room/k0", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class AutoClosingRoomOpenHelper implements DelegatingOpenHelper, SupportSQLiteOpenHelper {
    @Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000F\n\u0002\u0018\u0002\n\u0002\b\u001E\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u00A2\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001A\u00020\u000B2\u0006\u0010\n\u001A\u00020\tH\u0016\u00A2\u0006\u0004\b\f\u0010\rJ\u000F\u0010\u000E\u001A\u00020\u0006H\u0016\u00A2\u0006\u0004\b\u000E\u0010\bJ\u000F\u0010\u000F\u001A\u00020\u0006H\u0016\u00A2\u0006\u0004\b\u000F\u0010\bJ\u0017\u0010\u0012\u001A\u00020\u00062\u0006\u0010\u0011\u001A\u00020\u0010H\u0016\u00A2\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001A\u00020\u00062\u0006\u0010\u0011\u001A\u00020\u0010H\u0016\u00A2\u0006\u0004\b\u0014\u0010\u0013J\u000F\u0010\u0015\u001A\u00020\u0006H\u0016\u00A2\u0006\u0004\b\u0015\u0010\bJ\u000F\u0010\u0016\u001A\u00020\u0006H\u0016\u00A2\u0006\u0004\b\u0016\u0010\bJ\u000F\u0010\u0018\u001A\u00020\u0017H\u0016\u00A2\u0006\u0004\b\u0018\u0010\u0019J\u000F\u0010\u001A\u001A\u00020\u0017H\u0016\u00A2\u0006\u0004\b\u001A\u0010\u0019J\u0017\u0010\u001A\u001A\u00020\u00172\u0006\u0010\u001C\u001A\u00020\u001BH\u0016\u00A2\u0006\u0004\b\u001A\u0010\u001DJ\u0017\u0010\u001F\u001A\u00020\u001B2\u0006\u0010\u001E\u001A\u00020\u001BH\u0016\u00A2\u0006\u0004\b\u001F\u0010 J\u0017\u0010!\u001A\u00020\"2\u0006\u0010!\u001A\u00020\tH\u0016\u00A2\u0006\u0004\b!\u0010#J)\u0010!\u001A\u00020\"2\u0006\u0010!\u001A\u00020\t2\u0010\u0010&\u001A\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010%0$H\u0016\u00A2\u0006\u0004\b!\u0010\'J\u0017\u0010!\u001A\u00020\"2\u0006\u0010!\u001A\u00020(H\u0016\u00A2\u0006\u0004\b!\u0010)J!\u0010!\u001A\u00020\"2\u0006\u0010!\u001A\u00020(2\b\u0010+\u001A\u0004\u0018\u00010*H\u0017\u00A2\u0006\u0004\b!\u0010,J\'\u00102\u001A\u00020\u001B2\u0006\u0010-\u001A\u00020\t2\u0006\u0010/\u001A\u00020.2\u0006\u00101\u001A\u000200H\u0016\u00A2\u0006\u0004\b2\u00103J5\u00106\u001A\u00020.2\u0006\u0010-\u001A\u00020\t2\b\u00104\u001A\u0004\u0018\u00010\t2\u0012\u00105\u001A\u000E\u0012\b\b\u0001\u0012\u0004\u0018\u00010%\u0018\u00010$H\u0016\u00A2\u0006\u0004\b6\u00107JE\u00108\u001A\u00020.2\u0006\u0010-\u001A\u00020\t2\u0006\u0010/\u001A\u00020.2\u0006\u00101\u001A\u0002002\b\u00104\u001A\u0004\u0018\u00010\t2\u0012\u00105\u001A\u000E\u0012\b\b\u0001\u0012\u0004\u0018\u00010%\u0018\u00010$H\u0016\u00A2\u0006\u0004\b8\u00109J\u0017\u0010:\u001A\u00020\u00062\u0006\u0010\n\u001A\u00020\tH\u0016\u00A2\u0006\u0004\b:\u0010;J)\u0010:\u001A\u00020\u00062\u0006\u0010\n\u001A\u00020\t2\u0010\u0010&\u001A\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010%0$H\u0016\u00A2\u0006\u0004\b:\u0010<J\u0017\u0010>\u001A\u00020\u00172\u0006\u0010=\u001A\u00020.H\u0016\u00A2\u0006\u0004\b>\u0010?J\u0017\u0010B\u001A\u00020\u00062\u0006\u0010A\u001A\u00020@H\u0016\u00A2\u0006\u0004\bB\u0010CJ\u0017\u0010E\u001A\u00020\u00062\u0006\u0010D\u001A\u00020.H\u0016\u00A2\u0006\u0004\bE\u0010FJ\u0017\u0010H\u001A\u00020\u00062\u0006\u0010G\u001A\u00020\u0017H\u0017\u00A2\u0006\u0004\bH\u0010IJ\u000F\u0010J\u001A\u00020\u0017H\u0016\u00A2\u0006\u0004\bJ\u0010\u0019J\u000F\u0010K\u001A\u00020\u0006H\u0016\u00A2\u0006\u0004\bK\u0010\bJ\u000F\u0010L\u001A\u00020\u0006H\u0016\u00A2\u0006\u0004\bL\u0010\bR\u0014\u0010M\u001A\u00020\u00178VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bM\u0010\u0019R$\u0010N\u001A\u00020.2\u0006\u0010N\u001A\u00020.8V@VX\u0096\u000E\u00A2\u0006\f\u001A\u0004\bO\u0010P\"\u0004\bQ\u0010FR\u0014\u0010T\u001A\u00020\u001B8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bR\u0010SR$\u0010X\u001A\u00020\u001B2\u0006\u0010\u001E\u001A\u00020\u001B8V@VX\u0096\u000E\u00A2\u0006\f\u001A\u0004\bU\u0010S\"\u0004\bV\u0010WR\u0014\u0010Y\u001A\u00020\u00178VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bY\u0010\u0019R\u0014\u0010Z\u001A\u00020\u00178VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bZ\u0010\u0019R\u0016\u0010]\u001A\u0004\u0018\u00010\t8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b[\u0010\\R\u0014\u0010^\u001A\u00020\u00178WX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b^\u0010\u0019R(\u0010c\u001A\u0016\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0`\u0018\u00010_8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\ba\u0010bR\u0014\u0010d\u001A\u00020\u00178VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bd\u0010\u0019\u00A8\u0006e"}, d2 = {"Landroidx/room/AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase;", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "Landroidx/room/AutoCloser;", "autoCloser", "<init>", "(Landroidx/room/AutoCloser;)V", "", "pokeOpen", "()V", "", "sql", "Landroidx/sqlite/db/SupportSQLiteStatement;", "compileStatement", "(Ljava/lang/String;)Landroidx/sqlite/db/SupportSQLiteStatement;", "beginTransaction", "beginTransactionNonExclusive", "Landroid/database/sqlite/SQLiteTransactionListener;", "transactionListener", "beginTransactionWithListener", "(Landroid/database/sqlite/SQLiteTransactionListener;)V", "beginTransactionWithListenerNonExclusive", "endTransaction", "setTransactionSuccessful", "", "inTransaction", "()Z", "yieldIfContendedSafely", "", "sleepAfterYieldDelayMillis", "(J)Z", "numBytes", "setMaximumSize", "(J)J", "query", "Landroid/database/Cursor;", "(Ljava/lang/String;)Landroid/database/Cursor;", "", "", "bindArgs", "(Ljava/lang/String;[Ljava/lang/Object;)Landroid/database/Cursor;", "Landroidx/sqlite/db/SupportSQLiteQuery;", "(Landroidx/sqlite/db/SupportSQLiteQuery;)Landroid/database/Cursor;", "Landroid/os/CancellationSignal;", "cancellationSignal", "(Landroidx/sqlite/db/SupportSQLiteQuery;Landroid/os/CancellationSignal;)Landroid/database/Cursor;", "table", "", "conflictAlgorithm", "Landroid/content/ContentValues;", "values", "insert", "(Ljava/lang/String;ILandroid/content/ContentValues;)J", "whereClause", "whereArgs", "delete", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I", "update", "(Ljava/lang/String;ILandroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/Object;)I", "execSQL", "(Ljava/lang/String;)V", "(Ljava/lang/String;[Ljava/lang/Object;)V", "newVersion", "needUpgrade", "(I)Z", "Ljava/util/Locale;", "locale", "setLocale", "(Ljava/util/Locale;)V", "cacheSize", "setMaxSqlCacheSize", "(I)V", "enabled", "setForeignKeyConstraintsEnabled", "(Z)V", "enableWriteAheadLogging", "disableWriteAheadLogging", "close", "isDbLockedByCurrentThread", "version", "getVersion", "()I", "setVersion", "getMaximumSize", "()J", "maximumSize", "getPageSize", "setPageSize", "(J)V", "pageSize", "isReadOnly", "isOpen", "getPath", "()Ljava/lang/String;", "path", "isWriteAheadLoggingEnabled", "", "Landroid/util/Pair;", "getAttachedDbs", "()Ljava/util/List;", "attachedDbs", "isDatabaseIntegrityOk", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class AutoClosingSupportSQLiteDatabase implements SupportSQLiteDatabase {
        public final AutoCloser a;

        public AutoClosingSupportSQLiteDatabase(@NotNull AutoCloser autoCloser0) {
            Intrinsics.checkNotNullParameter(autoCloser0, "autoCloser");
            super();
            this.a = autoCloser0;
        }

        @Override  // androidx.sqlite.db.SupportSQLiteDatabase
        public void beginTransaction() {
            AutoCloser autoCloser0 = this.a;
            SupportSQLiteDatabase supportSQLiteDatabase0 = autoCloser0.incrementCountAndEnsureDbIsOpen();
            try {
                supportSQLiteDatabase0.beginTransaction();
            }
            catch(Throwable throwable0) {
                autoCloser0.decrementCountAndScheduleClose();
                throw throwable0;
            }
        }

        @Override  // androidx.sqlite.db.SupportSQLiteDatabase
        public void beginTransactionNonExclusive() {
            AutoCloser autoCloser0 = this.a;
            SupportSQLiteDatabase supportSQLiteDatabase0 = autoCloser0.incrementCountAndEnsureDbIsOpen();
            try {
                supportSQLiteDatabase0.beginTransactionNonExclusive();
            }
            catch(Throwable throwable0) {
                autoCloser0.decrementCountAndScheduleClose();
                throw throwable0;
            }
        }

        @Override  // androidx.sqlite.db.SupportSQLiteDatabase
        public void beginTransactionWithListener(@NotNull SQLiteTransactionListener sQLiteTransactionListener0) {
            Intrinsics.checkNotNullParameter(sQLiteTransactionListener0, "transactionListener");
            AutoCloser autoCloser0 = this.a;
            SupportSQLiteDatabase supportSQLiteDatabase0 = autoCloser0.incrementCountAndEnsureDbIsOpen();
            try {
                supportSQLiteDatabase0.beginTransactionWithListener(sQLiteTransactionListener0);
            }
            catch(Throwable throwable0) {
                autoCloser0.decrementCountAndScheduleClose();
                throw throwable0;
            }
        }

        @Override  // androidx.sqlite.db.SupportSQLiteDatabase
        public void beginTransactionWithListenerNonExclusive(@NotNull SQLiteTransactionListener sQLiteTransactionListener0) {
            Intrinsics.checkNotNullParameter(sQLiteTransactionListener0, "transactionListener");
            AutoCloser autoCloser0 = this.a;
            SupportSQLiteDatabase supportSQLiteDatabase0 = autoCloser0.incrementCountAndEnsureDbIsOpen();
            try {
                supportSQLiteDatabase0.beginTransactionWithListenerNonExclusive(sQLiteTransactionListener0);
            }
            catch(Throwable throwable0) {
                autoCloser0.decrementCountAndScheduleClose();
                throw throwable0;
            }
        }

        @Override
        public void close() throws IOException {
            this.a.closeDatabaseIfOpen();
        }

        @Override  // androidx.sqlite.db.SupportSQLiteDatabase
        @NotNull
        public SupportSQLiteStatement compileStatement(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "sql");
            return new j0(s, this.a);
        }

        @Override  // androidx.sqlite.db.SupportSQLiteDatabase
        public int delete(@NotNull String s, @Nullable String s1, @Nullable Object[] arr_object) {
            Intrinsics.checkNotNullParameter(s, "table");
            j j0 = new j(s, s1, arr_object);
            return ((Number)this.a.executeRefCountingFunction(j0)).intValue();
        }

        @Override  // androidx.sqlite.db.SupportSQLiteDatabase
        public void disableWriteAheadLogging() {
            throw new UnsupportedOperationException("Enable/disable write ahead logging on the OpenHelper instead of on the database directly.");
        }

        @Override  // androidx.sqlite.db.SupportSQLiteDatabase
        public boolean enableWriteAheadLogging() {
            throw new UnsupportedOperationException("Enable/disable write ahead logging on the OpenHelper instead of on the database directly.");
        }

        @Override  // androidx.sqlite.db.SupportSQLiteDatabase
        public void endTransaction() {
            AutoCloser autoCloser0 = this.a;
            if(autoCloser0.getDelegateDatabase$room_runtime_release() == null) {
                throw new IllegalStateException("End transaction called but delegateDb is null");
            }
            try {
                SupportSQLiteDatabase supportSQLiteDatabase0 = autoCloser0.getDelegateDatabase$room_runtime_release();
                Intrinsics.checkNotNull(supportSQLiteDatabase0);
                supportSQLiteDatabase0.endTransaction();
            }
            finally {
                autoCloser0.decrementCountAndScheduleClose();
            }
        }

        @Override  // androidx.sqlite.db.SupportSQLiteDatabase
        public void execSQL(@NotNull String s) throws SQLException {
            Intrinsics.checkNotNullParameter(s, "sql");
            k k0 = new k(s);
            this.a.executeRefCountingFunction(k0);
        }

        @Override  // androidx.sqlite.db.SupportSQLiteDatabase
        public void execSQL(@NotNull String s, @NotNull Object[] arr_object) throws SQLException {
            Intrinsics.checkNotNullParameter(s, "sql");
            Intrinsics.checkNotNullParameter(arr_object, "bindArgs");
            l l0 = new l(s, arr_object);
            this.a.executeRefCountingFunction(l0);
        }

        @Override  // androidx.sqlite.db.SupportSQLiteDatabase
        @Nullable
        public List getAttachedDbs() {
            return (List)this.a.executeRefCountingFunction(i.w);
        }

        @Override  // androidx.sqlite.db.SupportSQLiteDatabase
        public long getMaximumSize() {
            return ((Number)this.a.executeRefCountingFunction(t.b)).longValue();
        }

        @Override  // androidx.sqlite.db.SupportSQLiteDatabase
        public long getPageSize() {
            return ((Number)this.a.executeRefCountingFunction(v.b)).longValue();
        }

        @Override  // androidx.sqlite.db.SupportSQLiteDatabase
        @Nullable
        public String getPath() {
            return (String)this.a.executeRefCountingFunction(x.w);
        }

        @Override  // androidx.sqlite.db.SupportSQLiteDatabase
        public int getVersion() {
            return ((Number)this.a.executeRefCountingFunction(e0.b)).intValue();
        }

        @Override  // androidx.sqlite.db.SupportSQLiteDatabase
        public boolean inTransaction() {
            return this.a.getDelegateDatabase$room_runtime_release() == null ? false : ((Boolean)this.a.executeRefCountingFunction(m.a)).booleanValue();
        }

        @Override  // androidx.sqlite.db.SupportSQLiteDatabase
        public long insert(@NotNull String s, int v, @NotNull ContentValues contentValues0) throws SQLException {
            Intrinsics.checkNotNullParameter(s, "table");
            Intrinsics.checkNotNullParameter(contentValues0, "values");
            n n0 = new n(s, v, contentValues0);
            return ((Number)this.a.executeRefCountingFunction(n0)).longValue();
        }

        @Override  // androidx.sqlite.db.SupportSQLiteDatabase
        public boolean isDatabaseIntegrityOk() {
            return ((Boolean)this.a.executeRefCountingFunction(o.w)).booleanValue();
        }

        @Override  // androidx.sqlite.db.SupportSQLiteDatabase
        public boolean isDbLockedByCurrentThread() {
            return this.a.getDelegateDatabase$room_runtime_release() == null ? false : ((Boolean)this.a.executeRefCountingFunction(p.b)).booleanValue();
        }

        @Override  // androidx.sqlite.db.SupportSQLiteDatabase
        public boolean isOpen() {
            SupportSQLiteDatabase supportSQLiteDatabase0 = this.a.getDelegateDatabase$room_runtime_release();
            return supportSQLiteDatabase0 == null ? false : supportSQLiteDatabase0.isOpen();
        }

        @Override  // androidx.sqlite.db.SupportSQLiteDatabase
        public boolean isReadOnly() {
            return ((Boolean)this.a.executeRefCountingFunction(q.w)).booleanValue();
        }

        @Override  // androidx.sqlite.db.SupportSQLiteDatabase
        @RequiresApi(api = 16)
        public boolean isWriteAheadLoggingEnabled() {
            return ((Boolean)this.a.executeRefCountingFunction(s.w)).booleanValue();
        }

        @Override  // androidx.sqlite.db.SupportSQLiteDatabase
        public boolean needUpgrade(int v) {
            u u0 = new u(v);
            return ((Boolean)this.a.executeRefCountingFunction(u0)).booleanValue();
        }

        public final void pokeOpen() {
            this.a.executeRefCountingFunction(y.w);
        }

        @Override  // androidx.sqlite.db.SupportSQLiteDatabase
        @NotNull
        public Cursor query(@NotNull SupportSQLiteQuery supportSQLiteQuery0) {
            AutoCloser autoCloser0 = this.a;
            Intrinsics.checkNotNullParameter(supportSQLiteQuery0, "query");
            try {
                return new k0(autoCloser0.incrementCountAndEnsureDbIsOpen().query(supportSQLiteQuery0), autoCloser0);
            }
            catch(Throwable throwable0) {
                autoCloser0.decrementCountAndScheduleClose();
                throw throwable0;
            }
        }

        @Override  // androidx.sqlite.db.SupportSQLiteDatabase
        @RequiresApi(api = 24)
        @NotNull
        public Cursor query(@NotNull SupportSQLiteQuery supportSQLiteQuery0, @Nullable CancellationSignal cancellationSignal0) {
            AutoCloser autoCloser0 = this.a;
            Intrinsics.checkNotNullParameter(supportSQLiteQuery0, "query");
            try {
                return new k0(autoCloser0.incrementCountAndEnsureDbIsOpen().query(supportSQLiteQuery0, cancellationSignal0), autoCloser0);
            }
            catch(Throwable throwable0) {
                autoCloser0.decrementCountAndScheduleClose();
                throw throwable0;
            }
        }

        @Override  // androidx.sqlite.db.SupportSQLiteDatabase
        @NotNull
        public Cursor query(@NotNull String s) {
            AutoCloser autoCloser0 = this.a;
            Intrinsics.checkNotNullParameter(s, "query");
            try {
                return new k0(autoCloser0.incrementCountAndEnsureDbIsOpen().query(s), autoCloser0);
            }
            catch(Throwable throwable0) {
                autoCloser0.decrementCountAndScheduleClose();
                throw throwable0;
            }
        }

        @Override  // androidx.sqlite.db.SupportSQLiteDatabase
        @NotNull
        public Cursor query(@NotNull String s, @NotNull Object[] arr_object) {
            AutoCloser autoCloser0 = this.a;
            Intrinsics.checkNotNullParameter(s, "query");
            Intrinsics.checkNotNullParameter(arr_object, "bindArgs");
            try {
                return new k0(autoCloser0.incrementCountAndEnsureDbIsOpen().query(s, arr_object), autoCloser0);
            }
            catch(Throwable throwable0) {
                autoCloser0.decrementCountAndScheduleClose();
                throw throwable0;
            }
        }

        @Override  // androidx.sqlite.db.SupportSQLiteDatabase
        @RequiresApi(api = 16)
        public void setForeignKeyConstraintsEnabled(boolean z) {
            z z1 = new z(z);
            this.a.executeRefCountingFunction(z1);
        }

        @Override  // androidx.sqlite.db.SupportSQLiteDatabase
        public void setLocale(@NotNull Locale locale0) {
            Intrinsics.checkNotNullParameter(locale0, "locale");
            a0 a00 = new a0(locale0);
            this.a.executeRefCountingFunction(a00);
        }

        @Override  // androidx.sqlite.db.SupportSQLiteDatabase
        public void setMaxSqlCacheSize(int v) {
            b0 b00 = new b0(v);
            this.a.executeRefCountingFunction(b00);
        }

        @Override  // androidx.sqlite.db.SupportSQLiteDatabase
        public long setMaximumSize(long v) {
            c0 c00 = new c0(v);
            return ((Number)this.a.executeRefCountingFunction(c00)).longValue();
        }

        @Override  // androidx.sqlite.db.SupportSQLiteDatabase
        public void setPageSize(long v) {
            w w0 = new w(v);
            this.a.executeRefCountingFunction(w0);
        }

        @Override  // androidx.sqlite.db.SupportSQLiteDatabase
        public void setTransactionSuccessful() {
            Unit unit0;
            SupportSQLiteDatabase supportSQLiteDatabase0 = this.a.getDelegateDatabase$room_runtime_release();
            if(supportSQLiteDatabase0 == null) {
                unit0 = null;
            }
            else {
                supportSQLiteDatabase0.setTransactionSuccessful();
                unit0 = Unit.INSTANCE;
            }
            if(unit0 == null) {
                throw new IllegalStateException("setTransactionSuccessful called but delegateDb is null");
            }
        }

        @Override  // androidx.sqlite.db.SupportSQLiteDatabase
        public void setVersion(int v) {
            f0 f00 = new f0(v);
            this.a.executeRefCountingFunction(f00);
        }

        @Override  // androidx.sqlite.db.SupportSQLiteDatabase
        public int update(@NotNull String s, int v, @NotNull ContentValues contentValues0, @Nullable String s1, @Nullable Object[] arr_object) {
            Intrinsics.checkNotNullParameter(s, "table");
            Intrinsics.checkNotNullParameter(contentValues0, "values");
            d0 d00 = new d0(s, v, contentValues0, s1, arr_object);
            return ((Number)this.a.executeRefCountingFunction(d00)).intValue();
        }

        @Override  // androidx.sqlite.db.SupportSQLiteDatabase
        public boolean yieldIfContendedSafely() {
            return ((Boolean)this.a.executeRefCountingFunction(g0.a)).booleanValue();
        }

        @Override  // androidx.sqlite.db.SupportSQLiteDatabase
        public boolean yieldIfContendedSafely(long v) {
            return ((Boolean)this.a.executeRefCountingFunction(h0.a)).booleanValue();
        }
    }

    public final SupportSQLiteOpenHelper a;
    @JvmField
    @NotNull
    public final AutoCloser autoCloser;
    public final AutoClosingSupportSQLiteDatabase b;

    public AutoClosingRoomOpenHelper(@NotNull SupportSQLiteOpenHelper supportSQLiteOpenHelper0, @NotNull AutoCloser autoCloser0) {
        Intrinsics.checkNotNullParameter(supportSQLiteOpenHelper0, "delegate");
        Intrinsics.checkNotNullParameter(autoCloser0, "autoCloser");
        super();
        this.a = supportSQLiteOpenHelper0;
        this.autoCloser = autoCloser0;
        autoCloser0.init(this.getDelegate());
        this.b = new AutoClosingSupportSQLiteDatabase(autoCloser0);
    }

    @Override  // androidx.sqlite.db.SupportSQLiteOpenHelper
    public void close() {
        this.b.close();
    }

    @Override  // androidx.sqlite.db.SupportSQLiteOpenHelper
    @Nullable
    public String getDatabaseName() {
        return this.a.getDatabaseName();
    }

    @Override  // androidx.room.DelegatingOpenHelper
    @NotNull
    public SupportSQLiteOpenHelper getDelegate() {
        return this.a;
    }

    @Override  // androidx.sqlite.db.SupportSQLiteOpenHelper
    @RequiresApi(api = 24)
    @NotNull
    public SupportSQLiteDatabase getReadableDatabase() {
        this.b.pokeOpen();
        return this.b;
    }

    @Override  // androidx.sqlite.db.SupportSQLiteOpenHelper
    @RequiresApi(api = 24)
    @NotNull
    public SupportSQLiteDatabase getWritableDatabase() {
        this.b.pokeOpen();
        return this.b;
    }

    @Override  // androidx.sqlite.db.SupportSQLiteOpenHelper
    @RequiresApi(api = 16)
    public void setWriteAheadLoggingEnabled(boolean z) {
        this.a.setWriteAheadLoggingEnabled(z);
    }
}

