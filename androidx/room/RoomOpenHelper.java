package androidx.room;

import android.database.Cursor;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SimpleSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.io.CloseableKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\b\u0017\u0018\u0000 \u00192\u00020\u0001:\u0003\u0019\u001A\u001BB\'\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\b\u001A\u00020\u0006¢\u0006\u0004\b\t\u0010\nB!\b\u0016\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\b\u001A\u00020\u0006¢\u0006\u0004\b\t\u0010\u000BJ\u0017\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\r\u001A\u00020\fH\u0016¢\u0006\u0004\b\u000F\u0010\u0010J\u0017\u0010\u0011\u001A\u00020\u000E2\u0006\u0010\r\u001A\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\'\u0010\u0015\u001A\u00020\u000E2\u0006\u0010\r\u001A\u00020\f2\u0006\u0010\u0013\u001A\u00020\u00122\u0006\u0010\u0014\u001A\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\'\u0010\u0017\u001A\u00020\u000E2\u0006\u0010\r\u001A\u00020\f2\u0006\u0010\u0013\u001A\u00020\u00122\u0006\u0010\u0014\u001A\u00020\u0012H\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u0017\u0010\u0018\u001A\u00020\u000E2\u0006\u0010\r\u001A\u00020\fH\u0016¢\u0006\u0004\b\u0018\u0010\u0010¨\u0006\u001C"}, d2 = {"Landroidx/room/RoomOpenHelper;", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$Callback;", "Landroidx/room/DatabaseConfiguration;", "configuration", "Landroidx/room/RoomOpenHelper$Delegate;", "delegate", "", "identityHash", "legacyHash", "<init>", "(Landroidx/room/DatabaseConfiguration;Landroidx/room/RoomOpenHelper$Delegate;Ljava/lang/String;Ljava/lang/String;)V", "(Landroidx/room/DatabaseConfiguration;Landroidx/room/RoomOpenHelper$Delegate;Ljava/lang/String;)V", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "db", "", "onConfigure", "(Landroidx/sqlite/db/SupportSQLiteDatabase;)V", "onCreate", "", "oldVersion", "newVersion", "onUpgrade", "(Landroidx/sqlite/db/SupportSQLiteDatabase;II)V", "onDowngrade", "onOpen", "Companion", "Delegate", "ValidationResult", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nRoomOpenHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomOpenHelper.kt\nandroidx/room/RoomOpenHelper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 CursorUtil.kt\nandroidx/room/util/CursorUtil\n*L\n1#1,245:1\n1855#2,2:246\n145#3,7:248\n*S KotlinDebug\n*F\n+ 1 RoomOpenHelper.kt\nandroidx/room/RoomOpenHelper\n*L\n90#1:246,2\n137#1:248,7\n*E\n"})
public class RoomOpenHelper extends Callback {
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0017\u0010\u0007\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0000¢\u0006\u0004\b\b\u0010\u0006¨\u0006\n"}, d2 = {"Landroidx/room/RoomOpenHelper$Companion;", "", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "db", "", "hasRoomMasterTable$room_runtime_release", "(Landroidx/sqlite/db/SupportSQLiteDatabase;)Z", "hasRoomMasterTable", "hasEmptySchema$room_runtime_release", "hasEmptySchema", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nRoomOpenHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomOpenHelper.kt\nandroidx/room/RoomOpenHelper$Companion\n+ 2 CursorUtil.kt\nandroidx/room/util/CursorUtil\n*L\n1#1,245:1\n145#2,7:246\n145#2,7:253\n*S KotlinDebug\n*F\n+ 1 RoomOpenHelper.kt\nandroidx/room/RoomOpenHelper$Companion\n*L\n231#1:246,7\n239#1:253,7\n*E\n"})
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public final boolean hasEmptySchema$room_runtime_release(@NotNull SupportSQLiteDatabase supportSQLiteDatabase0) {
            boolean z = false;
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase0, "db");
            Cursor cursor0 = supportSQLiteDatabase0.query("SELECT count(*) FROM sqlite_master WHERE name != \'android_metadata\'");
            try {
                if(cursor0.moveToFirst() && cursor0.getInt(0) == 0) {
                    z = true;
                }
            }
            catch(Throwable throwable0) {
                CloseableKt.closeFinally(cursor0, throwable0);
                throw throwable0;
            }
            CloseableKt.closeFinally(cursor0, null);
            return z;
        }

        public final boolean hasRoomMasterTable$room_runtime_release(@NotNull SupportSQLiteDatabase supportSQLiteDatabase0) {
            boolean z = false;
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase0, "db");
            Cursor cursor0 = supportSQLiteDatabase0.query("SELECT 1 FROM sqlite_master WHERE type = \'table\' AND name=\'room_master_table\'");
            try {
                if(cursor0.moveToFirst() && cursor0.getInt(0) != 0) {
                    z = true;
                }
            }
            catch(Throwable throwable0) {
                CloseableKt.closeFinally(cursor0, throwable0);
                throw throwable0;
            }
            CloseableKt.closeFinally(cursor0, null);
            return z;
        }
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\bH&J\u0010\u0010\t\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\bH&J\u0010\u0010\n\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\bH&J\u0010\u0010\u000B\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\bH&J\u0010\u0010\f\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\bH\u0016J\u0010\u0010\r\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\bH\u0016J\u0010\u0010\u000E\u001A\u00020\u000F2\u0006\u0010\u0007\u001A\u00020\bH\u0016J\u0010\u0010\u0010\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\bH\u0015R\u0010\u0010\u0002\u001A\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Landroidx/room/RoomOpenHelper$Delegate;", "", "version", "", "(I)V", "createAllTables", "", "db", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "dropAllTables", "onCreate", "onOpen", "onPostMigrate", "onPreMigrate", "onValidateSchema", "Landroidx/room/RoomOpenHelper$ValidationResult;", "validateMigration", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static abstract class Delegate {
        @JvmField
        public final int version;

        public Delegate(int v) {
            this.version = v;
        }

        public abstract void createAllTables(@NotNull SupportSQLiteDatabase arg1);

        public abstract void dropAllTables(@NotNull SupportSQLiteDatabase arg1);

        public abstract void onCreate(@NotNull SupportSQLiteDatabase arg1);

        public abstract void onOpen(@NotNull SupportSQLiteDatabase arg1);

        public void onPostMigrate(@NotNull SupportSQLiteDatabase supportSQLiteDatabase0) {
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase0, "db");
        }

        public void onPreMigrate(@NotNull SupportSQLiteDatabase supportSQLiteDatabase0) {
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase0, "db");
        }

        @NotNull
        public ValidationResult onValidateSchema(@NotNull SupportSQLiteDatabase supportSQLiteDatabase0) {
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase0, "db");
            this.validateMigration(supportSQLiteDatabase0);
            return new ValidationResult(true, null);
        }

        @Deprecated(message = "Use [onValidateSchema(SupportSQLiteDatabase)]")
        public void validateMigration(@NotNull SupportSQLiteDatabase supportSQLiteDatabase0) {
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase0, "db");
            throw new UnsupportedOperationException("validateMigration is deprecated");
        }
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0012\u0010\u0004\u001A\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001A\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Landroidx/room/RoomOpenHelper$ValidationResult;", "", "isValid", "", "expectedFoundMsg", "", "(ZLjava/lang/String;)V", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static class ValidationResult {
        @JvmField
        @Nullable
        public final String expectedFoundMsg;
        @JvmField
        public final boolean isValid;

        public ValidationResult(boolean z, @Nullable String s) {
            this.isValid = z;
            this.expectedFoundMsg = s;
        }
    }

    @NotNull
    public static final Companion Companion;
    public DatabaseConfiguration a;
    public final Delegate b;
    public final String c;
    public final String d;

    static {
        RoomOpenHelper.Companion = new Companion(null);
    }

    public RoomOpenHelper(@NotNull DatabaseConfiguration databaseConfiguration0, @NotNull Delegate roomOpenHelper$Delegate0, @NotNull String s) {
        Intrinsics.checkNotNullParameter(databaseConfiguration0, "configuration");
        Intrinsics.checkNotNullParameter(roomOpenHelper$Delegate0, "delegate");
        Intrinsics.checkNotNullParameter(s, "legacyHash");
        this(databaseConfiguration0, roomOpenHelper$Delegate0, "", s);
    }

    public RoomOpenHelper(@NotNull DatabaseConfiguration databaseConfiguration0, @NotNull Delegate roomOpenHelper$Delegate0, @NotNull String s, @NotNull String s1) {
        Intrinsics.checkNotNullParameter(databaseConfiguration0, "configuration");
        Intrinsics.checkNotNullParameter(roomOpenHelper$Delegate0, "delegate");
        Intrinsics.checkNotNullParameter(s, "identityHash");
        Intrinsics.checkNotNullParameter(s1, "legacyHash");
        super(roomOpenHelper$Delegate0.version);
        this.a = databaseConfiguration0;
        this.b = roomOpenHelper$Delegate0;
        this.c = s;
        this.d = s1;
    }

    @Override  // androidx.sqlite.db.SupportSQLiteOpenHelper$Callback
    public void onConfigure(@NotNull SupportSQLiteDatabase supportSQLiteDatabase0) {
        Intrinsics.checkNotNullParameter(supportSQLiteDatabase0, "db");
        super.onConfigure(supportSQLiteDatabase0);
    }

    @Override  // androidx.sqlite.db.SupportSQLiteOpenHelper$Callback
    public void onCreate(@NotNull SupportSQLiteDatabase supportSQLiteDatabase0) {
        Intrinsics.checkNotNullParameter(supportSQLiteDatabase0, "db");
        boolean z = RoomOpenHelper.Companion.hasEmptySchema$room_runtime_release(supportSQLiteDatabase0);
        Delegate roomOpenHelper$Delegate0 = this.b;
        roomOpenHelper$Delegate0.createAllTables(supportSQLiteDatabase0);
        if(!z) {
            ValidationResult roomOpenHelper$ValidationResult0 = roomOpenHelper$Delegate0.onValidateSchema(supportSQLiteDatabase0);
            if(!roomOpenHelper$ValidationResult0.isValid) {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + roomOpenHelper$ValidationResult0.expectedFoundMsg);
            }
        }
        supportSQLiteDatabase0.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        supportSQLiteDatabase0.execSQL(RoomMasterTable.createInsertQuery(this.c));
        roomOpenHelper$Delegate0.onCreate(supportSQLiteDatabase0);
    }

    @Override  // androidx.sqlite.db.SupportSQLiteOpenHelper$Callback
    public void onDowngrade(@NotNull SupportSQLiteDatabase supportSQLiteDatabase0, int v, int v1) {
        Intrinsics.checkNotNullParameter(supportSQLiteDatabase0, "db");
        this.onUpgrade(supportSQLiteDatabase0, v, v1);
    }

    @Override  // androidx.sqlite.db.SupportSQLiteOpenHelper$Callback
    public void onOpen(@NotNull SupportSQLiteDatabase supportSQLiteDatabase0) {
        String s1;
        Intrinsics.checkNotNullParameter(supportSQLiteDatabase0, "db");
        super.onOpen(supportSQLiteDatabase0);
        boolean z = RoomOpenHelper.Companion.hasRoomMasterTable$room_runtime_release(supportSQLiteDatabase0);
        String s = this.c;
        Delegate roomOpenHelper$Delegate0 = this.b;
        if(z) {
            Cursor cursor0 = supportSQLiteDatabase0.query(new SimpleSQLiteQuery("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
            try {
                s1 = cursor0.moveToFirst() ? cursor0.getString(0) : null;
            }
            catch(Throwable throwable0) {
                CloseableKt.closeFinally(cursor0, throwable0);
                throw throwable0;
            }
            CloseableKt.closeFinally(cursor0, null);
            if(!Intrinsics.areEqual(s, s1) && !Intrinsics.areEqual(this.d, s1)) {
                throw new IllegalStateException("Room cannot verify the data integrity. Looks like you\'ve changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: " + s + ", found: " + s1);
            }
        }
        else {
            ValidationResult roomOpenHelper$ValidationResult0 = roomOpenHelper$Delegate0.onValidateSchema(supportSQLiteDatabase0);
            if(!roomOpenHelper$ValidationResult0.isValid) {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + roomOpenHelper$ValidationResult0.expectedFoundMsg);
            }
            roomOpenHelper$Delegate0.onPostMigrate(supportSQLiteDatabase0);
            supportSQLiteDatabase0.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            supportSQLiteDatabase0.execSQL(RoomMasterTable.createInsertQuery(s));
        }
        roomOpenHelper$Delegate0.onOpen(supportSQLiteDatabase0);
        this.a = null;
    }

    @Override  // androidx.sqlite.db.SupportSQLiteOpenHelper$Callback
    public void onUpgrade(@NotNull SupportSQLiteDatabase supportSQLiteDatabase0, int v, int v1) {
        Intrinsics.checkNotNullParameter(supportSQLiteDatabase0, "db");
        DatabaseConfiguration databaseConfiguration0 = this.a;
        Delegate roomOpenHelper$Delegate0 = this.b;
        if(databaseConfiguration0 != null) {
            List list0 = databaseConfiguration0.migrationContainer.findMigrationPath(v, v1);
            if(list0 != null) {
                roomOpenHelper$Delegate0.onPreMigrate(supportSQLiteDatabase0);
                for(Object object0: list0) {
                    ((Migration)object0).migrate(supportSQLiteDatabase0);
                }
                ValidationResult roomOpenHelper$ValidationResult0 = roomOpenHelper$Delegate0.onValidateSchema(supportSQLiteDatabase0);
                if(!roomOpenHelper$ValidationResult0.isValid) {
                    throw new IllegalStateException("Migration didn\'t properly handle: " + roomOpenHelper$ValidationResult0.expectedFoundMsg);
                }
                roomOpenHelper$Delegate0.onPostMigrate(supportSQLiteDatabase0);
                supportSQLiteDatabase0.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                supportSQLiteDatabase0.execSQL(RoomMasterTable.createInsertQuery(this.c));
                return;
            }
        }
        if(this.a == null || this.a.isMigrationRequired(v, v1)) {
            throw new IllegalStateException("A migration from " + v + " to " + v1 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
        }
        roomOpenHelper$Delegate0.dropAllTables(supportSQLiteDatabase0);
        roomOpenHelper$Delegate0.createAllTables(supportSQLiteDatabase0);
    }
}

