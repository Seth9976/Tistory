package androidx.sqlite.db;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.RequiresApi;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0011\u0012\u0013J\b\u0010\f\u001A\u00020\rH&J\u0010\u0010\u000E\u001A\u00020\r2\u0006\u0010\u000F\u001A\u00020\u0010H\'R\u0014\u0010\u0002\u001A\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001A\u00020\u0007X¦\u0004¢\u0006\u0006\u001A\u0004\b\b\u0010\tR\u0012\u0010\n\u001A\u00020\u0007X¦\u0004¢\u0006\u0006\u001A\u0004\b\u000B\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0001"}, d2 = {"Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "Ljava/io/Closeable;", "databaseName", "", "getDatabaseName", "()Ljava/lang/String;", "readableDatabase", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "getReadableDatabase", "()Landroidx/sqlite/db/SupportSQLiteDatabase;", "writableDatabase", "getWritableDatabase", "close", "", "setWriteAheadLoggingEnabled", "enabled", "", "Callback", "Configuration", "Factory", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface SupportSQLiteOpenHelper extends Closeable {
    @Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\b&\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000B\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00020\u0006H&¢\u0006\u0004\b\u000B\u0010\nJ\'\u0010\u000E\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\f\u001A\u00020\u00022\u0006\u0010\r\u001A\u00020\u0002H&¢\u0006\u0004\b\u000E\u0010\u000FJ\'\u0010\u0010\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\f\u001A\u00020\u00022\u0006\u0010\r\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u000FJ\u0017\u0010\u0011\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\nJ\u0017\u0010\u0012\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\nR\u0014\u0010\u0003\u001A\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013¨\u0006\u0015"}, d2 = {"Landroidx/sqlite/db/SupportSQLiteOpenHelper$Callback;", "", "", "version", "<init>", "(I)V", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "db", "", "onConfigure", "(Landroidx/sqlite/db/SupportSQLiteDatabase;)V", "onCreate", "oldVersion", "newVersion", "onUpgrade", "(Landroidx/sqlite/db/SupportSQLiteDatabase;II)V", "onDowngrade", "onOpen", "onCorruption", "I", "Companion", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nSupportSQLiteOpenHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SupportSQLiteOpenHelper.kt\nandroidx/sqlite/db/SupportSQLiteOpenHelper$Callback\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Strings.kt\nkotlin/text/StringsKt__StringsKt\n*L\n1#1,426:1\n1#2:427\n1855#3,2:428\n107#4:430\n79#4,22:431\n*S KotlinDebug\n*F\n+ 1 SupportSQLiteOpenHelper.kt\nandroidx/sqlite/db/SupportSQLiteOpenHelper$Callback\n*L\n243#1:428,2\n251#1:430\n251#1:431,22\n*E\n"})
    public static abstract class Callback {
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/sqlite/db/SupportSQLiteOpenHelper$Callback$Companion;", "", "", "TAG", "Ljava/lang/String;", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
        public static final class Companion {
            public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
            }
        }

        @NotNull
        public static final Companion Companion;
        @JvmField
        public final int version;

        static {
            Callback.Companion = new Companion(null);
        }

        public Callback(int v) {
            this.version = v;
        }

        public static void a(String s) {
            if(!p.equals(s, ":memory:", true)) {
                int v = s.length() - 1;
                int v1 = 0;
                boolean z = false;
                while(v1 <= v) {
                    boolean z1 = Intrinsics.compare(s.charAt((z ? v : v1)), 0x20) <= 0;
                    if(z) {
                        if(!z1) {
                            break;
                        }
                        --v;
                    }
                    else if(z1) {
                        ++v1;
                    }
                    else {
                        z = true;
                    }
                }
                if(s.subSequence(v1, v + 1).toString().length() != 0) {
                    Log.w("SupportSQLite", "deleting the database file: " + s);
                    try {
                        Api16Impl.deleteDatabase(new File(s));
                    }
                    catch(Exception exception0) {
                        Log.w("SupportSQLite", "delete failed: ", exception0);
                    }
                }
            }
        }

        public void onConfigure(@NotNull SupportSQLiteDatabase supportSQLiteDatabase0) {
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase0, "db");
        }

        public void onCorruption(@NotNull SupportSQLiteDatabase supportSQLiteDatabase0) {
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase0, "db");
            Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + supportSQLiteDatabase0 + ".path");
            if(!supportSQLiteDatabase0.isOpen()) {
                String s = supportSQLiteDatabase0.getPath();
                if(s != null) {
                    Callback.a(s);
                }
                return;
            }
            try {
                List list0 = null;
                list0 = supportSQLiteDatabase0.getAttachedDbs();
            }
            catch(SQLiteException unused_ex) {
            }
            finally {
                if(list0 == null) {
                    String s1 = supportSQLiteDatabase0.getPath();
                    if(s1 != null) {
                        Callback.a(s1);
                    }
                }
                else {
                    for(Object object0: list0) {
                        Object object1 = ((Pair)object0).second;
                        Intrinsics.checkNotNullExpressionValue(object1, "p.second");
                        Callback.a(((String)object1));
                    }
                }
            }
            try {
                supportSQLiteDatabase0.close();
            }
            catch(IOException unused_ex) {
            }
        }

        public abstract void onCreate(@NotNull SupportSQLiteDatabase arg1);

        public void onDowngrade(@NotNull SupportSQLiteDatabase supportSQLiteDatabase0, int v, int v1) {
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase0, "db");
            throw new SQLiteException("Can\'t downgrade database from version " + v + " to " + v1);
        }

        public void onOpen(@NotNull SupportSQLiteDatabase supportSQLiteDatabase0) {
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase0, "db");
        }

        public abstract void onUpgrade(@NotNull SupportSQLiteDatabase arg1, int arg2, int arg3);
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0005\u0018\u0000 \r2\u00020\u0001:\u0002\f\rB3\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001A\u00020\u0007\u0012\b\b\u0002\u0010\b\u001A\u00020\t\u0012\b\b\u0002\u0010\n\u001A\u00020\t¢\u0006\u0002\u0010\u000BR\u0010\u0010\n\u001A\u00020\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001A\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001A\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001A\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001A\u00020\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u000E"}, d2 = {"Landroidx/sqlite/db/SupportSQLiteOpenHelper$Configuration;", "", "context", "Landroid/content/Context;", "name", "", "callback", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$Callback;", "useNoBackupDirectory", "", "allowDataLossOnRecovery", "(Landroid/content/Context;Ljava/lang/String;Landroidx/sqlite/db/SupportSQLiteOpenHelper$Callback;ZZ)V", "Builder", "Companion", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Configuration {
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000F\u0010\u0007\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001A\u00020\u00002\b\u0010\n\u001A\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\n\u0010\u000BJ\u0017\u0010\r\u001A\u00020\u00002\u0006\u0010\r\u001A\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000EJ\u0017\u0010\u0011\u001A\u00020\u00002\u0006\u0010\u0010\u001A\u00020\u000FH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001A\u00020\u00002\u0006\u0010\u0013\u001A\u00020\u000FH\u0016¢\u0006\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, d2 = {"Landroidx/sqlite/db/SupportSQLiteOpenHelper$Configuration$Builder;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$Configuration;", "build", "()Landroidx/sqlite/db/SupportSQLiteOpenHelper$Configuration;", "", "name", "(Ljava/lang/String;)Landroidx/sqlite/db/SupportSQLiteOpenHelper$Configuration$Builder;", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$Callback;", "callback", "(Landroidx/sqlite/db/SupportSQLiteOpenHelper$Callback;)Landroidx/sqlite/db/SupportSQLiteOpenHelper$Configuration$Builder;", "", "useNoBackupDirectory", "noBackupDirectory", "(Z)Landroidx/sqlite/db/SupportSQLiteOpenHelper$Configuration$Builder;", "allowDataLossOnRecovery", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
        public static class Builder {
            public final Context a;
            public String b;
            public Callback c;
            public boolean d;
            public boolean e;

            public Builder(@NotNull Context context0) {
                Intrinsics.checkNotNullParameter(context0, "context");
                super();
                this.a = context0;
            }

            @NotNull
            public Builder allowDataLossOnRecovery(boolean z) {
                this.e = z;
                return this;
            }

            @NotNull
            public Configuration build() {
                Callback supportSQLiteOpenHelper$Callback0 = this.c;
                if(supportSQLiteOpenHelper$Callback0 == null) {
                    throw new IllegalArgumentException("Must set a callback to create the configuration.");
                }
                if(this.d && (this.b == null || this.b.length() == 0)) {
                    throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
                }
                return new Configuration(this.a, this.b, supportSQLiteOpenHelper$Callback0, this.d, this.e);
            }

            @NotNull
            public Builder callback(@NotNull Callback supportSQLiteOpenHelper$Callback0) {
                Intrinsics.checkNotNullParameter(supportSQLiteOpenHelper$Callback0, "callback");
                this.c = supportSQLiteOpenHelper$Callback0;
                return this;
            }

            @NotNull
            public Builder name(@Nullable String s) {
                this.b = s;
                return this;
            }

            @NotNull
            public Builder noBackupDirectory(boolean z) {
                this.d = z;
                return this;
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/sqlite/db/SupportSQLiteOpenHelper$Configuration$Companion;", "", "Landroid/content/Context;", "context", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$Configuration$Builder;", "builder", "(Landroid/content/Context;)Landroidx/sqlite/db/SupportSQLiteOpenHelper$Configuration$Builder;", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
        public static final class androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration.Companion {
            public androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration.Companion(DefaultConstructorMarker defaultConstructorMarker0) {
            }

            @JvmStatic
            @NotNull
            public final Builder builder(@NotNull Context context0) {
                Intrinsics.checkNotNullParameter(context0, "context");
                return new Builder(context0);
            }
        }

        @NotNull
        public static final androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration.Companion Companion;
        @JvmField
        public final boolean allowDataLossOnRecovery;
        @JvmField
        @NotNull
        public final Callback callback;
        @JvmField
        @NotNull
        public final Context context;
        @JvmField
        @Nullable
        public final String name;
        @JvmField
        public final boolean useNoBackupDirectory;

        static {
            Configuration.Companion = new androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration.Companion(null);
        }

        public Configuration(@NotNull Context context0, @Nullable String s, @NotNull Callback supportSQLiteOpenHelper$Callback0, boolean z, boolean z1) {
            Intrinsics.checkNotNullParameter(context0, "context");
            Intrinsics.checkNotNullParameter(supportSQLiteOpenHelper$Callback0, "callback");
            super();
            this.context = context0;
            this.name = s;
            this.callback = supportSQLiteOpenHelper$Callback0;
            this.useNoBackupDirectory = z;
            this.allowDataLossOnRecovery = z1;
        }

        public Configuration(Context context0, String s, Callback supportSQLiteOpenHelper$Callback0, boolean z, boolean z1, int v, DefaultConstructorMarker defaultConstructorMarker0) {
            this(context0, s, supportSQLiteOpenHelper$Callback0, ((v & 8) == 0 ? z : false), ((v & 16) == 0 ? z1 : false));
        }

        @JvmStatic
        @NotNull
        public static final Builder builder(@NotNull Context context0) {
            return Configuration.Companion.builder(context0);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Landroidx/sqlite/db/SupportSQLiteOpenHelper$Factory;", "", "create", "Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "configuration", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$Configuration;", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public interface Factory {
        @NotNull
        SupportSQLiteOpenHelper create(@NotNull Configuration arg1);
    }

    @Override
    void close();

    @Nullable
    String getDatabaseName();

    @NotNull
    SupportSQLiteDatabase getReadableDatabase();

    @NotNull
    SupportSQLiteDatabase getWritableDatabase();

    @RequiresApi(api = 16)
    void setWriteAheadLoggingEnabled(boolean arg1);
}

