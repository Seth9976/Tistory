package androidx.room;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.sqlite.db.SupportSQLiteProgram;
import androidx.sqlite.db.SupportSQLiteQuery;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\f\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0010\u0013\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0010\b\u0007\u0018\u0000 >2\u00020\u00012\u00020\u0002:\u0002?>J\u001D\u0010\b\u001A\u00020\u00072\u0006\u0010\u0004\u001A\u00020\u00032\u0006\u0010\u0006\u001A\u00020\u0005\u00A2\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001A\u00020\u0007\u00A2\u0006\u0004\b\n\u0010\u000BJ\u0017\u0010\r\u001A\u00020\u00072\u0006\u0010\f\u001A\u00020\u0002H\u0016\u00A2\u0006\u0004\b\r\u0010\u000EJ\u0017\u0010\u0010\u001A\u00020\u00072\u0006\u0010\u000F\u001A\u00020\u0005H\u0016\u00A2\u0006\u0004\b\u0010\u0010\u0011J\u001F\u0010\u0014\u001A\u00020\u00072\u0006\u0010\u000F\u001A\u00020\u00052\u0006\u0010\u0013\u001A\u00020\u0012H\u0016\u00A2\u0006\u0004\b\u0014\u0010\u0015J\u001F\u0010\u0017\u001A\u00020\u00072\u0006\u0010\u000F\u001A\u00020\u00052\u0006\u0010\u0013\u001A\u00020\u0016H\u0016\u00A2\u0006\u0004\b\u0017\u0010\u0018J\u001F\u0010\u0019\u001A\u00020\u00072\u0006\u0010\u000F\u001A\u00020\u00052\u0006\u0010\u0013\u001A\u00020\u0003H\u0016\u00A2\u0006\u0004\b\u0019\u0010\u001AJ\u001F\u0010\u001C\u001A\u00020\u00072\u0006\u0010\u000F\u001A\u00020\u00052\u0006\u0010\u0013\u001A\u00020\u001BH\u0016\u00A2\u0006\u0004\b\u001C\u0010\u001DJ\u000F\u0010\u001E\u001A\u00020\u0007H\u0016\u00A2\u0006\u0004\b\u001E\u0010\u000BJ\u0015\u0010 \u001A\u00020\u00072\u0006\u0010\u001F\u001A\u00020\u0000\u00A2\u0006\u0004\b \u0010!J\u000F\u0010\"\u001A\u00020\u0007H\u0016\u00A2\u0006\u0004\b\"\u0010\u000BR\u001A\u0010\'\u001A\u00020\u00058\u0006X\u0087\u0004\u00A2\u0006\f\n\u0004\b#\u0010$\u001A\u0004\b%\u0010&R\u001A\u0010)\u001A\u00020(8\u0006X\u0087\u0004\u00A2\u0006\f\n\u0004\b)\u0010*\u0012\u0004\b+\u0010\u000BR\u001A\u0010-\u001A\u00020,8\u0006X\u0087\u0004\u00A2\u0006\f\n\u0004\b-\u0010.\u0012\u0004\b/\u0010\u000BR\"\u00101\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u0003008\u0006X\u0087\u0004\u00A2\u0006\f\n\u0004\b1\u00102\u0012\u0004\b3\u0010\u000BR\"\u00104\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u001B008\u0006X\u0087\u0004\u00A2\u0006\f\n\u0004\b4\u00105\u0012\u0004\b6\u0010\u000BR$\u0010:\u001A\u00020\u00052\u0006\u00107\u001A\u00020\u00058\u0016@RX\u0096\u000E\u00A2\u0006\f\n\u0004\b8\u0010$\u001A\u0004\b9\u0010&R\u0014\u0010=\u001A\u00020\u00038VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b;\u0010<\u00A8\u0006@"}, d2 = {"Landroidx/room/RoomSQLiteQuery;", "Landroidx/sqlite/db/SupportSQLiteQuery;", "Landroidx/sqlite/db/SupportSQLiteProgram;", "", "query", "", "initArgCount", "", "init", "(Ljava/lang/String;I)V", "release", "()V", "statement", "bindTo", "(Landroidx/sqlite/db/SupportSQLiteProgram;)V", "index", "bindNull", "(I)V", "", "value", "bindLong", "(IJ)V", "", "bindDouble", "(ID)V", "bindString", "(ILjava/lang/String;)V", "", "bindBlob", "(I[B)V", "close", "other", "copyArgumentsFrom", "(Landroidx/room/RoomSQLiteQuery;)V", "clearBindings", "a", "I", "getCapacity", "()I", "capacity", "", "longBindings", "[J", "getLongBindings$annotations", "", "doubleBindings", "[D", "getDoubleBindings$annotations", "", "stringBindings", "[Ljava/lang/String;", "getStringBindings$annotations", "blobBindings", "[[B", "getBlobBindings$annotations", "<set-?>", "d", "getArgCount", "argCount", "getSql", "()Ljava/lang/String;", "sql", "Companion", "Binding", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class RoomSQLiteQuery implements SupportSQLiteProgram, SupportSQLiteQuery {
    @Retention(RetentionPolicy.SOURCE)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001B\n\u0000\b\u0081\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Landroidx/room/RoomSQLiteQuery$Binding;", "", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface Binding {
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001F\u0010\u000B\u001A\u00020\u00042\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\n\u001A\u00020\tH\u0007¢\u0006\u0004\b\u000B\u0010\fJ\u000F\u0010\u0010\u001A\u00020\rH\u0000¢\u0006\u0004\b\u000E\u0010\u000FR\u001A\u0010\u0011\u001A\u00020\t8\u0006X\u0087T¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u0012\u0004\b\u0013\u0010\u000FR\u001A\u0010\u0014\u001A\u00020\t8\u0006X\u0087T¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u0012\u0004\b\u0015\u0010\u000FR&\u0010\u0017\u001A\u000E\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u0012\u0004\b\u0019\u0010\u000FR\u0014\u0010\u001A\u001A\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001A\u0010\u0012R\u0014\u0010\u001B\u001A\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001B\u0010\u0012R\u0014\u0010\u001C\u001A\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001C\u0010\u0012R\u0014\u0010\u001D\u001A\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001D\u0010\u0012R\u0014\u0010\u001E\u001A\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001E\u0010\u0012¨\u0006\u001F"}, d2 = {"Landroidx/room/RoomSQLiteQuery$Companion;", "", "Landroidx/sqlite/db/SupportSQLiteQuery;", "supportSQLiteQuery", "Landroidx/room/RoomSQLiteQuery;", "copyFrom", "(Landroidx/sqlite/db/SupportSQLiteQuery;)Landroidx/room/RoomSQLiteQuery;", "", "query", "", "argumentCount", "acquire", "(Ljava/lang/String;I)Landroidx/room/RoomSQLiteQuery;", "", "prunePoolLocked$room_runtime_release", "()V", "prunePoolLocked", "POOL_LIMIT", "I", "getPOOL_LIMIT$annotations", "DESIRED_POOL_SIZE", "getDESIRED_POOL_SIZE$annotations", "Ljava/util/TreeMap;", "queryPool", "Ljava/util/TreeMap;", "getQueryPool$annotations", "BLOB", "DOUBLE", "LONG", "NULL", "STRING", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @JvmStatic
        @NotNull
        public final RoomSQLiteQuery acquire(@NotNull String s, int v) {
            Intrinsics.checkNotNullParameter(s, "query");
            TreeMap treeMap0 = RoomSQLiteQuery.queryPool;
            synchronized(treeMap0) {
                Map.Entry map$Entry0 = treeMap0.ceilingEntry(v);
                if(map$Entry0 != null) {
                    treeMap0.remove(map$Entry0.getKey());
                    RoomSQLiteQuery roomSQLiteQuery0 = (RoomSQLiteQuery)map$Entry0.getValue();
                    roomSQLiteQuery0.init(s, v);
                    Intrinsics.checkNotNullExpressionValue(roomSQLiteQuery0, "sqliteQuery");
                    return roomSQLiteQuery0;
                }
            }
            RoomSQLiteQuery roomSQLiteQuery1 = new RoomSQLiteQuery(v, null);
            roomSQLiteQuery1.init(s, v);
            return roomSQLiteQuery1;
        }

        @JvmStatic
        @NotNull
        public final RoomSQLiteQuery copyFrom(@NotNull SupportSQLiteQuery supportSQLiteQuery0) {
            Intrinsics.checkNotNullParameter(supportSQLiteQuery0, "supportSQLiteQuery");
            RoomSQLiteQuery roomSQLiteQuery0 = this.acquire(supportSQLiteQuery0.getSql(), supportSQLiteQuery0.getArgCount());
            supportSQLiteQuery0.bindTo(new SupportSQLiteProgram() {
                public final RoomSQLiteQuery a;

                {
                    this.a = roomSQLiteQuery0;
                }

                @Override  // androidx.sqlite.db.SupportSQLiteProgram
                public void bindBlob(int v, @NotNull byte[] arr_b) {
                    Intrinsics.checkNotNullParameter(arr_b, "value");
                    this.a.bindBlob(v, arr_b);
                }

                @Override  // androidx.sqlite.db.SupportSQLiteProgram
                public void bindDouble(int v, double f) {
                    this.a.bindDouble(v, f);
                }

                @Override  // androidx.sqlite.db.SupportSQLiteProgram
                public void bindLong(int v, long v1) {
                    this.a.bindLong(v, v1);
                }

                @Override  // androidx.sqlite.db.SupportSQLiteProgram
                public void bindNull(int v) {
                    this.a.bindNull(v);
                }

                @Override  // androidx.sqlite.db.SupportSQLiteProgram
                public void bindString(int v, @NotNull String s) {
                    Intrinsics.checkNotNullParameter(s, "value");
                    this.a.bindString(v, s);
                }

                @Override  // androidx.sqlite.db.SupportSQLiteProgram
                public void clearBindings() {
                    this.a.clearBindings();
                }

                @Override
                public void close() {
                }
            });
            return roomSQLiteQuery0;
        }

        @VisibleForTesting
        public static void getDESIRED_POOL_SIZE$annotations() {
        }

        @VisibleForTesting
        public static void getPOOL_LIMIT$annotations() {
        }

        @VisibleForTesting
        public static void getQueryPool$annotations() {
        }

        public final void prunePoolLocked$room_runtime_release() {
            TreeMap treeMap0 = RoomSQLiteQuery.queryPool;
            if(treeMap0.size() > 15) {
                int v = treeMap0.size() - 10;
                Iterator iterator0 = treeMap0.descendingKeySet().iterator();
                Intrinsics.checkNotNullExpressionValue(iterator0, "queryPool.descendingKeySet().iterator()");
                while(v > 0) {
                    iterator0.next();
                    iterator0.remove();
                    --v;
                }
            }
        }
    }

    @NotNull
    public static final Companion Companion = null;
    public static final int DESIRED_POOL_SIZE = 10;
    public static final int POOL_LIMIT = 15;
    public final int a;
    public volatile String b;
    @JvmField
    @NotNull
    public final byte[][] blobBindings;
    public final int[] c;
    public int d;
    @JvmField
    @NotNull
    public final double[] doubleBindings;
    @JvmField
    @NotNull
    public final long[] longBindings;
    @JvmField
    @NotNull
    public static final TreeMap queryPool;
    @JvmField
    @NotNull
    public final String[] stringBindings;

    static {
        RoomSQLiteQuery.Companion = new Companion(null);
        RoomSQLiteQuery.queryPool = new TreeMap();
    }

    public RoomSQLiteQuery(int v, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = v;
        this.c = new int[v + 1];
        this.longBindings = new long[v + 1];
        this.doubleBindings = new double[v + 1];
        this.stringBindings = new String[v + 1];
        this.blobBindings = new byte[v + 1][];
    }

    @JvmStatic
    @NotNull
    public static final RoomSQLiteQuery acquire(@NotNull String s, int v) {
        return RoomSQLiteQuery.Companion.acquire(s, v);
    }

    @Override  // androidx.sqlite.db.SupportSQLiteProgram
    public void bindBlob(int v, @NotNull byte[] arr_b) {
        Intrinsics.checkNotNullParameter(arr_b, "value");
        this.c[v] = 5;
        this.blobBindings[v] = arr_b;
    }

    @Override  // androidx.sqlite.db.SupportSQLiteProgram
    public void bindDouble(int v, double f) {
        this.c[v] = 3;
        this.doubleBindings[v] = f;
    }

    @Override  // androidx.sqlite.db.SupportSQLiteProgram
    public void bindLong(int v, long v1) {
        this.c[v] = 2;
        this.longBindings[v] = v1;
    }

    @Override  // androidx.sqlite.db.SupportSQLiteProgram
    public void bindNull(int v) {
        this.c[v] = 1;
    }

    @Override  // androidx.sqlite.db.SupportSQLiteProgram
    public void bindString(int v, @NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "value");
        this.c[v] = 4;
        this.stringBindings[v] = s;
    }

    @Override  // androidx.sqlite.db.SupportSQLiteQuery
    public void bindTo(@NotNull SupportSQLiteProgram supportSQLiteProgram0) {
        Intrinsics.checkNotNullParameter(supportSQLiteProgram0, "statement");
        int v = this.getArgCount();
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                switch(this.c[v1]) {
                    case 1: {
                        supportSQLiteProgram0.bindNull(v1);
                        break;
                    }
                    case 2: {
                        supportSQLiteProgram0.bindLong(v1, this.longBindings[v1]);
                        break;
                    }
                    case 3: {
                        supportSQLiteProgram0.bindDouble(v1, this.doubleBindings[v1]);
                        break;
                    }
                    case 4: {
                        String s = this.stringBindings[v1];
                        if(s == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        supportSQLiteProgram0.bindString(v1, s);
                        break;
                    }
                    case 5: {
                        byte[] arr_b = this.blobBindings[v1];
                        if(arr_b == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        supportSQLiteProgram0.bindBlob(v1, arr_b);
                        break;
                    }
                }
                if(v1 == v) {
                    break;
                }
            }
        }
    }

    @Override  // androidx.sqlite.db.SupportSQLiteProgram
    public void clearBindings() {
        Arrays.fill(this.c, 1);
        Arrays.fill(this.stringBindings, null);
        Arrays.fill(this.blobBindings, null);
        this.b = null;
    }

    @Override
    public void close() {
    }

    public final void copyArgumentsFrom(@NotNull RoomSQLiteQuery roomSQLiteQuery0) {
        Intrinsics.checkNotNullParameter(roomSQLiteQuery0, "other");
        int v = roomSQLiteQuery0.getArgCount();
        System.arraycopy(roomSQLiteQuery0.c, 0, this.c, 0, v + 1);
        System.arraycopy(roomSQLiteQuery0.longBindings, 0, this.longBindings, 0, v + 1);
        System.arraycopy(roomSQLiteQuery0.stringBindings, 0, this.stringBindings, 0, v + 1);
        System.arraycopy(roomSQLiteQuery0.blobBindings, 0, this.blobBindings, 0, v + 1);
        System.arraycopy(roomSQLiteQuery0.doubleBindings, 0, this.doubleBindings, 0, v + 1);
    }

    @JvmStatic
    @NotNull
    public static final RoomSQLiteQuery copyFrom(@NotNull SupportSQLiteQuery supportSQLiteQuery0) {
        return RoomSQLiteQuery.Companion.copyFrom(supportSQLiteQuery0);
    }

    @Override  // androidx.sqlite.db.SupportSQLiteQuery
    public int getArgCount() {
        return this.d;
    }

    @VisibleForTesting
    public static void getBlobBindings$annotations() {
    }

    public final int getCapacity() {
        return this.a;
    }

    @VisibleForTesting
    public static void getDoubleBindings$annotations() {
    }

    @VisibleForTesting
    public static void getLongBindings$annotations() {
    }

    @Override  // androidx.sqlite.db.SupportSQLiteQuery
    @NotNull
    public String getSql() {
        String s = this.b;
        if(s == null) {
            throw new IllegalStateException("Required value was null.");
        }
        return s;
    }

    @VisibleForTesting
    public static void getStringBindings$annotations() {
    }

    public final void init(@NotNull String s, int v) {
        Intrinsics.checkNotNullParameter(s, "query");
        this.b = s;
        this.d = v;
    }

    public final void release() {
        synchronized(RoomSQLiteQuery.queryPool) {
            RoomSQLiteQuery.queryPool.put(this.a, this);
            RoomSQLiteQuery.Companion.prunePoolLocked$room_runtime_release();
        }
    }
}

