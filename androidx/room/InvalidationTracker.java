package androidx.room;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import androidx.activity.h;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.arch.core.internal.SafeIterableMap;
import androidx.lifecycle.LiveData;
import androidx.sqlite.db.SimpleSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import jeb.synthetic.FIN;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.e0;
import kotlin.collections.f0;
import kotlin.collections.k;
import kotlin.collections.o;
import kotlin.collections.x;
import kotlin.io.CloseableKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u009A\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u0000 e2\u00020\u0001:\u0005efghiBX\b\u0007\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0012\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u001D\u0010\t\u001A\u0019\u0012\u0004\u0012\u00020\u0005\u0012\u000F\u0012\r\u0012\u0004\u0012\u00020\u00050\u0007\u00A2\u0006\u0002\b\b0\u0004\u0012\u0012\u0010\u000B\u001A\n\u0012\u0006\b\u0001\u0012\u00020\u00050\n\"\u00020\u0005\u00A2\u0006\u0004\b\f\u0010\rB%\b\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0012\u0010\u000B\u001A\n\u0012\u0006\b\u0001\u0012\u00020\u00050\n\"\u00020\u0005\u00A2\u0006\u0004\b\f\u0010\u000EJ\u0017\u0010\u0014\u001A\u00020\u00112\u0006\u0010\u0010\u001A\u00020\u000FH\u0000\u00A2\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0018\u001A\u00020\u00112\u0006\u0010\u0003\u001A\u00020\u0015H\u0000\u00A2\u0006\u0004\b\u0016\u0010\u0017J\'\u0010 \u001A\u00020\u00112\u0006\u0010\u001A\u001A\u00020\u00192\u0006\u0010\u001B\u001A\u00020\u00052\u0006\u0010\u001D\u001A\u00020\u001CH\u0000\u00A2\u0006\u0004\b\u001E\u0010\u001FJ\u000F\u0010#\u001A\u00020\u0011H\u0000\u00A2\u0006\u0004\b!\u0010\"J\u0017\u0010&\u001A\u00020\u00112\u0006\u0010%\u001A\u00020$H\u0017\u00A2\u0006\u0004\b&\u0010\'J\u0017\u0010(\u001A\u00020\u00112\u0006\u0010%\u001A\u00020$H\u0017\u00A2\u0006\u0004\b(\u0010\'J\u0017\u0010)\u001A\u00020\u00112\u0006\u0010%\u001A\u00020$H\u0017\u00A2\u0006\u0004\b)\u0010\'J\u000F\u0010-\u001A\u00020*H\u0000\u00A2\u0006\u0004\b+\u0010,J\u000F\u0010.\u001A\u00020\u0011H\u0016\u00A2\u0006\u0004\b.\u0010\"J\u000F\u0010/\u001A\u00020\u0011H\u0017\u00A2\u0006\u0004\b/\u0010\"J#\u00101\u001A\u00020\u00112\u0012\u00100\u001A\n\u0012\u0006\b\u0001\u0012\u00020\u00050\n\"\u00020\u0005H\u0007\u00A2\u0006\u0004\b1\u00102J\u0017\u00104\u001A\u00020\u00112\u0006\u0010\u0003\u001A\u00020\u0015H\u0000\u00A2\u0006\u0004\b3\u0010\u0017J\u000F\u00104\u001A\u00020\u0011H\u0000\u00A2\u0006\u0004\b3\u0010\"J;\u00109\u001A\b\u0012\u0004\u0012\u00028\u000008\"\u0004\b\u0000\u001052\u000E\u0010\u000B\u001A\n\u0012\u0006\b\u0001\u0012\u00020\u00050\n2\u000E\u00107\u001A\n\u0012\u0006\u0012\u0004\u0018\u00018\u000006H\u0017\u00A2\u0006\u0004\b9\u0010:JC\u00109\u001A\b\u0012\u0004\u0012\u00028\u000008\"\u0004\b\u0000\u001052\u000E\u0010\u000B\u001A\n\u0012\u0006\b\u0001\u0012\u00020\u00050\n2\u0006\u0010;\u001A\u00020*2\u000E\u00107\u001A\n\u0012\u0006\u0012\u0004\u0018\u00018\u000006H\u0017\u00A2\u0006\u0004\b9\u0010<R\u001A\u0010\u0003\u001A\u00020\u00028\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b=\u0010>\u001A\u0004\b?\u0010@R&\u0010F\u001A\u000E\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020A0\u00048\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\bB\u0010C\u001A\u0004\bD\u0010ER\"\u0010K\u001A\n\u0012\u0006\b\u0001\u0012\u00020\u00050\n8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\bG\u0010H\u001A\u0004\bI\u0010JR\u001A\u0010Q\u001A\u00020L8GX\u0087\u0004\u00A2\u0006\f\n\u0004\bM\u0010N\u001A\u0004\bO\u0010PR$\u0010Y\u001A\u0004\u0018\u00010R8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\bS\u0010T\u001A\u0004\bU\u0010V\"\u0004\bW\u0010XR&\u0010`\u001A\u000E\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020[0Z8\u0000X\u0081\u0004\u00A2\u0006\f\n\u0004\b\\\u0010]\u001A\u0004\b^\u0010_R\u001A\u0010b\u001A\u00020a8\u0006X\u0087\u0004\u00A2\u0006\f\n\u0004\bb\u0010c\u0012\u0004\bd\u0010\"\u00A8\u0006j"}, d2 = {"Landroidx/room/InvalidationTracker;", "", "Landroidx/room/RoomDatabase;", "database", "", "", "shadowTablesMap", "", "Lkotlin/jvm/JvmSuppressWildcards;", "viewTables", "", "tableNames", "<init>", "(Landroidx/room/RoomDatabase;Ljava/util/Map;Ljava/util/Map;[Ljava/lang/String;)V", "(Landroidx/room/RoomDatabase;[Ljava/lang/String;)V", "Landroidx/room/AutoCloser;", "autoCloser", "", "setAutoCloser$room_runtime_release", "(Landroidx/room/AutoCloser;)V", "setAutoCloser", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "internalInit$room_runtime_release", "(Landroidx/sqlite/db/SupportSQLiteDatabase;)V", "internalInit", "Landroid/content/Context;", "context", "name", "Landroid/content/Intent;", "serviceIntent", "startMultiInstanceInvalidation$room_runtime_release", "(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;)V", "startMultiInstanceInvalidation", "stopMultiInstanceInvalidation$room_runtime_release", "()V", "stopMultiInstanceInvalidation", "Landroidx/room/InvalidationTracker$Observer;", "observer", "addObserver", "(Landroidx/room/InvalidationTracker$Observer;)V", "addWeakObserver", "removeObserver", "", "ensureInitialization$room_runtime_release", "()Z", "ensureInitialization", "refreshVersionsAsync", "refreshVersionsSync", "tables", "notifyObserversByTableNames", "([Ljava/lang/String;)V", "syncTriggers$room_runtime_release", "syncTriggers", "T", "Ljava/util/concurrent/Callable;", "computeFunction", "Landroidx/lifecycle/LiveData;", "createLiveData", "([Ljava/lang/String;Ljava/util/concurrent/Callable;)Landroidx/lifecycle/LiveData;", "inTransaction", "([Ljava/lang/String;ZLjava/util/concurrent/Callable;)Landroidx/lifecycle/LiveData;", "a", "Landroidx/room/RoomDatabase;", "getDatabase$room_runtime_release", "()Landroidx/room/RoomDatabase;", "", "d", "Ljava/util/Map;", "getTableIdLookup$room_runtime_release", "()Ljava/util/Map;", "tableIdLookup", "e", "[Ljava/lang/String;", "getTablesNames$room_runtime_release", "()[Ljava/lang/String;", "tablesNames", "Ljava/util/concurrent/atomic/AtomicBoolean;", "g", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getPendingRefresh", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "pendingRefresh", "Landroidx/sqlite/db/SupportSQLiteStatement;", "i", "Landroidx/sqlite/db/SupportSQLiteStatement;", "getCleanupStatement$room_runtime_release", "()Landroidx/sqlite/db/SupportSQLiteStatement;", "setCleanupStatement$room_runtime_release", "(Landroidx/sqlite/db/SupportSQLiteStatement;)V", "cleanupStatement", "Landroidx/arch/core/internal/SafeIterableMap;", "Landroidx/room/InvalidationTracker$ObserverWrapper;", "l", "Landroidx/arch/core/internal/SafeIterableMap;", "getObserverMap$room_runtime_release", "()Landroidx/arch/core/internal/SafeIterableMap;", "observerMap", "Ljava/lang/Runnable;", "refreshRunnable", "Ljava/lang/Runnable;", "getRefreshRunnable$annotations", "Companion", "ObservedTableTracker", "Observer", "ObserverWrapper", "WeakObserver", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nInvalidationTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InvalidationTracker.kt\nandroidx/room/InvalidationTracker\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,840:1\n215#2,2:841\n11335#3:843\n11670#3,3:844\n13579#3,2:847\n13579#3,2:849\n13674#3,3:855\n37#4,2:851\n1855#5,2:853\n*S KotlinDebug\n*F\n+ 1 InvalidationTracker.kt\nandroidx/room/InvalidationTracker\n*L\n102#1:841,2\n250#1:843\n250#1:844,3\n271#1:847,2\n287#1:849,2\n491#1:855,3\n294#1:851,2\n467#1:853,2\n*E\n"})
public class InvalidationTracker {
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001J\u001F\u0010\u0007\u001A\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0004\u001A\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\r\u001A\u00020\n2\u0006\u0010\t\u001A\u00020\bH\u0000¢\u0006\u0004\b\u000B\u0010\fR\u001A\u0010\u000E\u001A\u00020\u00028\u0000X\u0081T¢\u0006\f\n\u0004\b\u000E\u0010\u000F\u0012\u0004\b\u0010\u0010\u0011R\u001A\u0010\u0012\u001A\u00020\u00028\u0000X\u0081T¢\u0006\f\n\u0004\b\u0012\u0010\u000F\u0012\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0014\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u000FR\u0014\u0010\u0015\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u000FR\u0014\u0010\u0016\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u000FR\u001A\u0010\u0018\u001A\b\u0012\u0004\u0012\u00020\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001A\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001A\u0010\u000F¨\u0006\u001B"}, d2 = {"Landroidx/room/InvalidationTracker$Companion;", "", "", "tableName", "triggerType", "getTriggerName$room_runtime_release", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "getTriggerName", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "database", "", "beginTransactionInternal$room_runtime_release", "(Landroidx/sqlite/db/SupportSQLiteDatabase;)V", "beginTransactionInternal", "RESET_UPDATED_TABLES_SQL", "Ljava/lang/String;", "getRESET_UPDATED_TABLES_SQL$room_runtime_release$annotations", "()V", "SELECT_UPDATED_TABLES_SQL", "getSELECT_UPDATED_TABLES_SQL$room_runtime_release$annotations", "CREATE_TRACKING_TABLE_SQL", "INVALIDATED_COLUMN_NAME", "TABLE_ID_COLUMN_NAME", "", "TRIGGERS", "[Ljava/lang/String;", "UPDATE_TABLE_NAME", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public final void beginTransactionInternal$room_runtime_release(@NotNull SupportSQLiteDatabase supportSQLiteDatabase0) {
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase0, "database");
            if(supportSQLiteDatabase0.isWriteAheadLoggingEnabled()) {
                supportSQLiteDatabase0.beginTransactionNonExclusive();
                return;
            }
            supportSQLiteDatabase0.beginTransaction();
        }

        @VisibleForTesting
        public static void getRESET_UPDATED_TABLES_SQL$room_runtime_release$annotations() {
        }

        @VisibleForTesting
        public static void getSELECT_UPDATED_TABLES_SQL$room_runtime_release$annotations() {
        }

        @NotNull
        public final String getTriggerName$room_runtime_release(@NotNull String s, @NotNull String s1) {
            Intrinsics.checkNotNullParameter(s, "tableName");
            Intrinsics.checkNotNullParameter(s1, "triggerType");
            return "`room_table_modification_trigger_" + s + '_' + s1 + '`';
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0016\n\u0002\b\u000E\b\u0000\u0018\u0000 \u001E2\u00020\u0001:\u0001\u001EB\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001A\u00020\b2\n\u0010\u0007\u001A\u00020\u0006\"\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000B\u001A\u00020\b2\n\u0010\u0007\u001A\u00020\u0006\"\u00020\u0002¢\u0006\u0004\b\u000B\u0010\nJ\r\u0010\r\u001A\u00020\f¢\u0006\u0004\b\r\u0010\u000EJ\u0011\u0010\u000F\u001A\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u000F\u0010\u0010R\u0017\u0010\u0016\u001A\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001A\u0004\b\u0014\u0010\u0015R\"\u0010\u001D\u001A\u00020\b8\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001A\u0004\b\u0019\u0010\u001A\"\u0004\b\u001B\u0010\u001C¨\u0006\u001F"}, d2 = {"Landroidx/room/InvalidationTracker$ObservedTableTracker;", "", "", "tableCount", "<init>", "(I)V", "", "tableIds", "", "onAdded", "([I)Z", "onRemoved", "", "resetTriggerState", "()V", "getTablesToSync", "()[I", "", "a", "[J", "getTableObservers", "()[J", "tableObservers", "d", "Z", "getNeedsSync", "()Z", "setNeedsSync", "(Z)V", "needsSync", "Companion", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nInvalidationTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InvalidationTracker.kt\nandroidx/room/InvalidationTracker$ObservedTableTracker\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,840:1\n13600#2,2:841\n13600#2,2:843\n13684#2,3:845\n*S KotlinDebug\n*F\n+ 1 InvalidationTracker.kt\nandroidx/room/InvalidationTracker$ObservedTableTracker\n*L\n711#1:841,2\n729#1:843,2\n765#1:845,3\n*E\n"})
    public static final class ObservedTableTracker {
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"Landroidx/room/InvalidationTracker$ObservedTableTracker$Companion;", "", "", "ADD", "I", "NO_OP", "REMOVE", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
        public static final class androidx.room.InvalidationTracker.ObservedTableTracker.Companion {
            public androidx.room.InvalidationTracker.ObservedTableTracker.Companion(DefaultConstructorMarker defaultConstructorMarker0) {
            }
        }

        public static final int ADD = 1;
        @NotNull
        public static final androidx.room.InvalidationTracker.ObservedTableTracker.Companion Companion = null;
        public static final int NO_OP = 0;
        public static final int REMOVE = 2;
        public final long[] a;
        public final boolean[] b;
        public final int[] c;
        public boolean d;

        static {
            ObservedTableTracker.Companion = new androidx.room.InvalidationTracker.ObservedTableTracker.Companion(null);
        }

        public ObservedTableTracker(int v) {
            this.a = new long[v];
            this.b = new boolean[v];
            this.c = new int[v];
        }

        public final boolean getNeedsSync() {
            return this.d;
        }

        @NotNull
        public final long[] getTableObservers() {
            return this.a;
        }

        @VisibleForTesting
        @JvmName(name = "getTablesToSync")
        @Nullable
        public final int[] getTablesToSync() {
            int[] arr_v2;
            __monitor_enter(this);
            try {
                if(this.d) {
                    long[] arr_v = this.a;
                    int v = 0;
                    for(int v1 = 0; true; ++v1) {
                        int v2 = 1;
                        if(v >= arr_v.length) {
                            break;
                        }
                        boolean z = Long.compare(arr_v[v], 0L) > 0;
                        boolean[] arr_z = this.b;
                        if(z == arr_z[v1]) {
                            this.c[v1] = 0;
                        }
                        else {
                            int[] arr_v1 = this.c;
                            if(!z) {
                                v2 = 2;
                            }
                            arr_v1[v1] = v2;
                        }
                        arr_z[v1] = z;
                        ++v;
                    }
                    this.d = false;
                    arr_v2 = (int[])this.c.clone();
                    goto label_26;
                }
                goto label_28;
            }
            catch(Throwable throwable0) {
            }
            __monitor_exit(this);
            throw throwable0;
        label_26:
            __monitor_exit(this);
            return arr_v2;
        label_28:
            __monitor_exit(this);
            return null;
        }

        public final boolean onAdded(@NotNull int[] arr_v) {
            Intrinsics.checkNotNullParameter(arr_v, "tableIds");
            synchronized(this) {
                boolean z = false;
                for(int v1 = 0; v1 < arr_v.length; ++v1) {
                    int v2 = arr_v[v1];
                    long v3 = this.a[v2];
                    this.a[v2] = v3 + 1L;
                    if(v3 == 0L) {
                        this.d = true;
                        z = true;
                    }
                }
                return z;
            }
        }

        public final boolean onRemoved(@NotNull int[] arr_v) {
            Intrinsics.checkNotNullParameter(arr_v, "tableIds");
            synchronized(this) {
                boolean z = false;
                for(int v1 = 0; v1 < arr_v.length; ++v1) {
                    int v2 = arr_v[v1];
                    long v3 = this.a[v2];
                    this.a[v2] = v3 - 1L;
                    if(v3 == 1L) {
                        this.d = true;
                        z = true;
                    }
                }
                return z;
            }
        }

        public final void resetTriggerState() {
            synchronized(this) {
                Arrays.fill(this.b, false);
                this.d = true;
            }
        }

        public final void setNeedsSync(boolean z) {
            this.d = z;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000E\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u000E\u0010\u0004\u001A\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B%\b\u0014\u0012\u0006\u0010\u0007\u001A\u00020\u0003\u0012\u0012\u0010\b\u001A\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003¢\u0006\u0004\b\u0005\u0010\tJ\u001D\u0010\f\u001A\u00020\u000B2\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\nH&¢\u0006\u0004\b\f\u0010\rR\"\u0010\u0004\u001A\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000E\u0010\u000F\u001A\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001A\u00020\u00128PX\u0090\u0004¢\u0006\u0006\u001A\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Landroidx/room/InvalidationTracker$Observer;", "", "", "", "tables", "<init>", "([Ljava/lang/String;)V", "firstTable", "rest", "(Ljava/lang/String;[Ljava/lang/String;)V", "", "", "onInvalidated", "(Ljava/util/Set;)V", "a", "[Ljava/lang/String;", "getTables$room_runtime_release", "()[Ljava/lang/String;", "", "isRemote$room_runtime_release", "()Z", "isRemote", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nInvalidationTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InvalidationTracker.kt\nandroidx/room/InvalidationTracker$Observer\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,840:1\n37#2,2:841\n*S KotlinDebug\n*F\n+ 1 InvalidationTracker.kt\nandroidx/room/InvalidationTracker$Observer\n*L\n670#1:841,2\n*E\n"})
    public static abstract class Observer {
        public final String[] a;

        public Observer(@NotNull String s, @NotNull String[] arr_s) {
            Intrinsics.checkNotNullParameter(s, "firstTable");
            Intrinsics.checkNotNullParameter(arr_s, "rest");
            List list0 = k.createListBuilder();
            o.addAll(list0, arr_s);
            list0.add(s);
            this(((String[])k.build(list0).toArray(new String[0])));
        }

        public Observer(@NotNull String[] arr_s) {
            Intrinsics.checkNotNullParameter(arr_s, "tables");
            super();
            this.a = arr_s;
        }

        @NotNull
        public final String[] getTables$room_runtime_release() {
            return this.a;
        }

        public boolean isRemote$room_runtime_release() {
            return false;
        }

        public abstract void onInvalidated(@NotNull Set arg1);
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u000E\u0010\b\u001A\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u001F\u0010\u0011\u001A\u00020\u000E2\u000E\u0010\r\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000BH\u0000¢\u0006\u0004\b\u000F\u0010\u0010J\u001F\u0010\u0015\u001A\u00020\u000E2\u000E\u0010\u0012\u001A\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006H\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u001A\u0010\u0003\u001A\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001A\u0004\b\u0018\u0010\u0019R\u001A\u0010\u0005\u001A\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001A\u0010\u001B\u001A\u0004\b\u001C\u0010\u001D¨\u0006\u001E"}, d2 = {"Landroidx/room/InvalidationTracker$ObserverWrapper;", "", "Landroidx/room/InvalidationTracker$Observer;", "observer", "", "tableIds", "", "", "tableNames", "<init>", "(Landroidx/room/InvalidationTracker$Observer;[I[Ljava/lang/String;)V", "", "", "invalidatedTablesIds", "", "notifyByTableInvalidStatus$room_runtime_release", "(Ljava/util/Set;)V", "notifyByTableInvalidStatus", "tables", "notifyByTableNames$room_runtime_release", "([Ljava/lang/String;)V", "notifyByTableNames", "a", "Landroidx/room/InvalidationTracker$Observer;", "getObserver$room_runtime_release", "()Landroidx/room/InvalidationTracker$Observer;", "b", "[I", "getTableIds$room_runtime_release", "()[I", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nInvalidationTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InvalidationTracker.kt\nandroidx/room/InvalidationTracker$ObserverWrapper\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,840:1\n13674#2,3:841\n12744#2,2:844\n13579#2:846\n13579#2,2:847\n13580#2:849\n*S KotlinDebug\n*F\n+ 1 InvalidationTracker.kt\nandroidx/room/InvalidationTracker$ObserverWrapper\n*L\n612#1:841,3\n634#1:844,2\n640#1:846\n641#1:847,2\n640#1:849\n*E\n"})
    public static final class ObserverWrapper {
        public final Observer a;
        public final int[] b;
        public final String[] c;
        public final Set d;

        public ObserverWrapper(@NotNull Observer invalidationTracker$Observer0, @NotNull int[] arr_v, @NotNull String[] arr_s) {
            Intrinsics.checkNotNullParameter(invalidationTracker$Observer0, "observer");
            Intrinsics.checkNotNullParameter(arr_v, "tableIds");
            Intrinsics.checkNotNullParameter(arr_s, "tableNames");
            super();
            this.a = invalidationTracker$Observer0;
            this.b = arr_v;
            this.c = arr_s;
            this.d = arr_s.length == 0 ? f0.emptySet() : e0.setOf(arr_s[0]);
            if(arr_v.length != arr_s.length) {
                throw new IllegalStateException("Check failed.");
            }
        }

        @NotNull
        public final Observer getObserver$room_runtime_release() {
            return this.a;
        }

        @NotNull
        public final int[] getTableIds$room_runtime_release() {
            return this.b;
        }

        public final void notifyByTableInvalidStatus$room_runtime_release(@NotNull Set set0) {
            Set set2;
            int v = 0;
            Intrinsics.checkNotNullParameter(set0, "invalidatedTablesIds");
            int[] arr_v = this.b;
            switch(arr_v.length) {
                case 0: {
                    set2 = f0.emptySet();
                    break;
                }
                case 1: {
                    set2 = set0.contains(((int)arr_v[0])) ? this.d : f0.emptySet();
                    break;
                }
                default: {
                    Set set1 = e0.createSetBuilder();
                    for(int v1 = 0; v < arr_v.length; ++v1) {
                        if(set0.contains(((int)arr_v[v]))) {
                            set1.add(this.c[v1]);
                        }
                        ++v;
                    }
                    set2 = e0.build(set1);
                }
            }
            if(!set2.isEmpty()) {
                this.a.onInvalidated(set2);
            }
        }

        public final void notifyByTableNames$room_runtime_release(@NotNull String[] arr_s) {
            Set set1;
            Intrinsics.checkNotNullParameter(arr_s, "tables");
            String[] arr_s1 = this.c;
        alab1:
            switch(arr_s1.length) {
                case 0: {
                    set1 = f0.emptySet();
                    break;
                }
                case 1: {
                    int v2 = 0;
                    while(true) {
                        if(v2 < arr_s.length) {
                            if(p.equals(arr_s[v2], arr_s1[0], true)) {
                                set1 = this.d;
                                break alab1;
                            }
                            ++v2;
                            continue;
                        }
                        set1 = f0.emptySet();
                        break alab1;
                    }
                }
                default: {
                    Set set0 = e0.createSetBuilder();
                    for(int v = 0; v < arr_s.length; ++v) {
                        String s = arr_s[v];
                        for(int v1 = 0; v1 < arr_s1.length; ++v1) {
                            String s1 = arr_s1[v1];
                            if(p.equals(s1, s, true)) {
                                set0.add(s1);
                            }
                        }
                    }
                    set1 = e0.build(set0);
                }
            }
            if(!set1.isEmpty()) {
                this.a.onInvalidated(set1);
            }
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u001D\u0010\u000B\u001A\u00020\n2\f\u0010\t\u001A\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016¢\u0006\u0004\b\u000B\u0010\fR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000E\u001A\u0004\b\u000F\u0010\u0010R\u001D\u0010\u0016\u001A\b\u0012\u0004\u0012\u00020\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001A\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Landroidx/room/InvalidationTracker$WeakObserver;", "Landroidx/room/InvalidationTracker$Observer;", "Landroidx/room/InvalidationTracker;", "tracker", "delegate", "<init>", "(Landroidx/room/InvalidationTracker;Landroidx/room/InvalidationTracker$Observer;)V", "", "", "tables", "", "onInvalidated", "(Ljava/util/Set;)V", "b", "Landroidx/room/InvalidationTracker;", "getTracker", "()Landroidx/room/InvalidationTracker;", "Ljava/lang/ref/WeakReference;", "c", "Ljava/lang/ref/WeakReference;", "getDelegateRef", "()Ljava/lang/ref/WeakReference;", "delegateRef", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class WeakObserver extends Observer {
        public final InvalidationTracker b;
        public final WeakReference c;

        public WeakObserver(@NotNull InvalidationTracker invalidationTracker0, @NotNull Observer invalidationTracker$Observer0) {
            Intrinsics.checkNotNullParameter(invalidationTracker0, "tracker");
            Intrinsics.checkNotNullParameter(invalidationTracker$Observer0, "delegate");
            super(invalidationTracker$Observer0.getTables$room_runtime_release());
            this.b = invalidationTracker0;
            this.c = new WeakReference(invalidationTracker$Observer0);
        }

        @NotNull
        public final WeakReference getDelegateRef() {
            return this.c;
        }

        @NotNull
        public final InvalidationTracker getTracker() {
            return this.b;
        }

        @Override  // androidx.room.InvalidationTracker$Observer
        public void onInvalidated(@NotNull Set set0) {
            Intrinsics.checkNotNullParameter(set0, "tables");
            Observer invalidationTracker$Observer0 = (Observer)this.c.get();
            if(invalidationTracker$Observer0 == null) {
                this.b.removeObserver(this);
                return;
            }
            invalidationTracker$Observer0.onInvalidated(set0);
        }
    }

    @NotNull
    public static final Companion Companion = null;
    @NotNull
    public static final String RESET_UPDATED_TABLES_SQL = "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1";
    @NotNull
    public static final String SELECT_UPDATED_TABLES_SQL = "SELECT * FROM room_table_modification_log WHERE invalidated = 1;";
    public final RoomDatabase a;
    public final Map b;
    public final Map c;
    public final LinkedHashMap d;
    public final String[] e;
    public AutoCloser f;
    public final AtomicBoolean g;
    public volatile boolean h;
    public volatile SupportSQLiteStatement i;
    public final ObservedTableTracker j;
    public final InvalidationLiveDataContainer k;
    public final SafeIterableMap l;
    public MultiInstanceInvalidationClient m;
    public final Object n;
    public final Object o;
    public static final String[] p;
    @RestrictTo({Scope.LIBRARY})
    @JvmField
    @NotNull
    public final Runnable refreshRunnable;

    static {
        InvalidationTracker.Companion = new Companion(null);
        InvalidationTracker.p = new String[]{"UPDATE", "DELETE", "INSERT"};
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public InvalidationTracker(@NotNull RoomDatabase roomDatabase0, @NotNull Map map0, @NotNull Map map1, @NotNull String[] arr_s) {
        Intrinsics.checkNotNullParameter(roomDatabase0, "database");
        Intrinsics.checkNotNullParameter(map0, "shadowTablesMap");
        Intrinsics.checkNotNullParameter(map1, "viewTables");
        Intrinsics.checkNotNullParameter(arr_s, "tableNames");
        super();
        this.a = roomDatabase0;
        this.b = map0;
        this.c = map1;
        this.g = new AtomicBoolean(false);
        this.j = new ObservedTableTracker(arr_s.length);
        this.k = new InvalidationLiveDataContainer(roomDatabase0);
        this.l = new SafeIterableMap();
        this.n = new Object();
        this.o = new Object();
        this.d = new LinkedHashMap();
        String[] arr_s1 = new String[arr_s.length];
        for(int v = 0; v < arr_s.length; ++v) {
            Locale locale0 = Locale.US;
            String s = a.k(locale0, "US", arr_s[v], locale0, "this as java.lang.String).toLowerCase(locale)");
            this.d.put(s, v);
            String s1 = (String)this.b.get(arr_s[v]);
            String s2 = s1 == null ? null : a.k(locale0, "US", s1, locale0, "this as java.lang.String).toLowerCase(locale)");
            if(s2 != null) {
                s = s2;
            }
            arr_s1[v] = s;
        }
        this.e = arr_s1;
        for(Object object0: this.b.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            String s3 = (String)map$Entry0.getValue();
            Locale locale1 = Locale.US;
            String s4 = a.k(locale1, "US", s3, locale1, "this as java.lang.String).toLowerCase(locale)");
            if(this.d.containsKey(s4)) {
                String s5 = a.k(locale1, "US", ((String)map$Entry0.getKey()), locale1, "this as java.lang.String).toLowerCase(locale)");
                Object object1 = x.getValue(this.d, s4);
                this.d.put(s5, object1);
            }
        }
        this.refreshRunnable = new Runnable() {
            public final InvalidationTracker a;

            {
                this.a = invalidationTracker0;
            }

            public final Set a() {
                Set set0 = e0.createSetBuilder();
                InvalidationTracker invalidationTracker0 = this.a;
                Cursor cursor0 = RoomDatabase.query$default(invalidationTracker0.getDatabase$room_runtime_release(), new SimpleSQLiteQuery("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"), null, 2, null);
                while(true) {
                    try {
                        if(!cursor0.moveToNext()) {
                            break;
                        }
                        set0.add(cursor0.getInt(0));
                    }
                    catch(Throwable throwable0) {
                        CloseableKt.closeFinally(cursor0, throwable0);
                        throw throwable0;
                    }
                }
                CloseableKt.closeFinally(cursor0, null);
                Set set1 = e0.build(set0);
                if(!set1.isEmpty()) {
                    if(invalidationTracker0.getCleanupStatement$room_runtime_release() == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    SupportSQLiteStatement supportSQLiteStatement0 = invalidationTracker0.getCleanupStatement$room_runtime_release();
                    if(supportSQLiteStatement0 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    supportSQLiteStatement0.executeUpdateDelete();
                    return set1;
                }
                return set1;
            }

            @Override
            public void run() {
                Set set0;
                Lock lock0 = this.a.getDatabase$room_runtime_release().getCloseLock$room_runtime_release();
                lock0.lock();
                try {
                    try {
                        if(this.a.ensureInitialization$room_runtime_release()) {
                            if(this.a.getPendingRefresh().compareAndSet(true, false)) {
                                if(!this.a.getDatabase$room_runtime_release().inTransaction()) {
                                    SupportSQLiteDatabase supportSQLiteDatabase0 = this.a.getDatabase$room_runtime_release().getOpenHelper().getWritableDatabase();
                                    supportSQLiteDatabase0.beginTransactionNonExclusive();
                                    try {
                                        set0 = this.a();
                                        supportSQLiteDatabase0.setTransactionSuccessful();
                                    }
                                    finally {
                                        supportSQLiteDatabase0.endTransaction();
                                    }
                                    goto label_36;
                                }
                                goto label_53;
                            }
                            goto label_58;
                        }
                        goto label_63;
                    }
                    catch(IllegalStateException illegalStateException0) {
                    }
                    catch(SQLiteException sQLiteException0) {
                        goto label_23;
                    }
                    Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", illegalStateException0);
                    set0 = f0.emptySet();
                }
                catch(Throwable throwable0) {
                    goto label_31;
                }
                lock0.unlock();
                AutoCloser autoCloser0 = this.a.f;
                if(autoCloser0 != null) {
                    autoCloser0.decrementCountAndScheduleClose();
                    goto label_40;
                    try {
                    label_23:
                        Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", sQLiteException0);
                        set0 = f0.emptySet();
                    }
                    catch(Throwable throwable0) {
                        goto label_31;
                    }
                    lock0.unlock();
                    autoCloser0 = this.a.f;
                    if(autoCloser0 != null) {
                        autoCloser0.decrementCountAndScheduleClose();
                        goto label_40;
                    label_31:
                        lock0.unlock();
                        AutoCloser autoCloser1 = this.a.f;
                        if(autoCloser1 != null) {
                            autoCloser1.decrementCountAndScheduleClose();
                        }
                        throw throwable0;
                    label_36:
                        lock0.unlock();
                        autoCloser0 = this.a.f;
                        if(autoCloser0 != null) {
                            autoCloser0.decrementCountAndScheduleClose();
                        }
                    }
                }
            label_40:
                if(!set0.isEmpty()) {
                    synchronized(this.a.getObserverMap$room_runtime_release()) {
                        for(Object object0: this.a.getObserverMap$room_runtime_release()) {
                            ((ObserverWrapper)((Map.Entry)object0).getValue()).notifyByTableInvalidStatus$room_runtime_release(set0);
                        }
                    }
                }
                return;
            label_53:
                lock0.unlock();
                AutoCloser autoCloser2 = this.a.f;
                if(autoCloser2 != null) {
                    autoCloser2.decrementCountAndScheduleClose();
                }
                return;
            label_58:
                lock0.unlock();
                AutoCloser autoCloser3 = this.a.f;
                if(autoCloser3 != null) {
                    autoCloser3.decrementCountAndScheduleClose();
                }
                return;
            label_63:
                lock0.unlock();
                AutoCloser autoCloser4 = this.a.f;
                if(autoCloser4 != null) {
                    autoCloser4.decrementCountAndScheduleClose();
                }
            }
        };
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public InvalidationTracker(@NotNull RoomDatabase roomDatabase0, @NotNull String[] arr_s) {
        Intrinsics.checkNotNullParameter(roomDatabase0, "database");
        Intrinsics.checkNotNullParameter(arr_s, "tableNames");
        this(roomDatabase0, x.emptyMap(), x.emptyMap(), ((String[])Arrays.copyOf(arr_s, arr_s.length)));
    }

    public final String[] a(String[] arr_s) {
        Set set0 = e0.createSetBuilder();
        for(int v = 0; v < arr_s.length; ++v) {
            String s = arr_s[v];
            Locale locale0 = Locale.US;
            String s1 = a.k(locale0, "US", s, locale0, "this as java.lang.String).toLowerCase(locale)");
            Map map0 = this.c;
            if(map0.containsKey(s1)) {
                Object object0 = map0.get(a.k(locale0, "US", s, locale0, "this as java.lang.String).toLowerCase(locale)"));
                Intrinsics.checkNotNull(object0);
                set0.addAll(((Collection)object0));
            }
            else {
                set0.add(s);
            }
        }
        return (String[])e0.build(set0).toArray(new String[0]);
    }

    @SuppressLint({"RestrictedApi"})
    @WorkerThread
    public void addObserver(@NotNull Observer invalidationTracker$Observer0) {
        Intrinsics.checkNotNullParameter(invalidationTracker$Observer0, "observer");
        String[] arr_s = this.a(invalidationTracker$Observer0.getTables$room_runtime_release());
        ArrayList arrayList0 = new ArrayList(arr_s.length);
        for(int v = 0; v < arr_s.length; ++v) {
            String s = arr_s[v];
            String s1 = a.k(Locale.US, "US", s, Locale.US, "this as java.lang.String).toLowerCase(locale)");
            Integer integer0 = (Integer)this.d.get(s1);
            if(integer0 == null) {
                throw new IllegalArgumentException("There is no table with name " + s);
            }
            arrayList0.add(integer0);
        }
        int[] arr_v = CollectionsKt___CollectionsKt.toIntArray(arrayList0);
        ObserverWrapper invalidationTracker$ObserverWrapper0 = new ObserverWrapper(invalidationTracker$Observer0, arr_v, arr_s);
        synchronized(this.l) {
            ObserverWrapper invalidationTracker$ObserverWrapper1 = (ObserverWrapper)this.l.putIfAbsent(invalidationTracker$Observer0, invalidationTracker$ObserverWrapper0);
        }
        if(invalidationTracker$ObserverWrapper1 == null) {
            int[] arr_v1 = Arrays.copyOf(arr_v, arr_v.length);
            if(this.j.onAdded(arr_v1)) {
                this.syncTriggers$room_runtime_release();
            }
        }
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public void addWeakObserver(@NotNull Observer invalidationTracker$Observer0) {
        Intrinsics.checkNotNullParameter(invalidationTracker$Observer0, "observer");
        this.addObserver(new WeakObserver(this, invalidationTracker$Observer0));
    }

    public final void b(SupportSQLiteDatabase supportSQLiteDatabase0, int v) {
        supportSQLiteDatabase0.execSQL("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + v + ", 0)");
        String s = this.e[v];
        String[] arr_s = InvalidationTracker.p;
        for(int v1 = 0; v1 < arr_s.length; ++v1) {
            String s1 = arr_s[v1];
            StringBuilder stringBuilder0 = new StringBuilder("CREATE TEMP TRIGGER IF NOT EXISTS ");
            stringBuilder0.append(InvalidationTracker.Companion.getTriggerName$room_runtime_release(s, s1));
            stringBuilder0.append(" AFTER ");
            a.w(stringBuilder0, s1, " ON `", s, "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = ");
            stringBuilder0.append(v);
            stringBuilder0.append(" AND invalidated = 0; END");
            String s2 = stringBuilder0.toString();
            Intrinsics.checkNotNullExpressionValue(s2, "StringBuilder().apply(builderAction).toString()");
            supportSQLiteDatabase0.execSQL(s2);
        }
    }

    public final void c(SupportSQLiteDatabase supportSQLiteDatabase0, int v) {
        String s = this.e[v];
        String[] arr_s = InvalidationTracker.p;
        for(int v1 = 0; v1 < arr_s.length; ++v1) {
            String s1 = "DROP TRIGGER IF EXISTS " + InvalidationTracker.Companion.getTriggerName$room_runtime_release(s, arr_s[v1]);
            Intrinsics.checkNotNullExpressionValue(s1, "StringBuilder().apply(builderAction).toString()");
            supportSQLiteDatabase0.execSQL(s1);
        }
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated(message = "Use [createLiveData(String[], boolean, Callable)]")
    @NotNull
    public LiveData createLiveData(@NotNull String[] arr_s, @NotNull Callable callable0) {
        Intrinsics.checkNotNullParameter(arr_s, "tableNames");
        Intrinsics.checkNotNullParameter(callable0, "computeFunction");
        return this.createLiveData(arr_s, false, callable0);
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    @NotNull
    public LiveData createLiveData(@NotNull String[] arr_s, boolean z, @NotNull Callable callable0) {
        Intrinsics.checkNotNullParameter(arr_s, "tableNames");
        Intrinsics.checkNotNullParameter(callable0, "computeFunction");
        String[] arr_s1 = this.a(arr_s);
        for(int v = 0; v < arr_s1.length; ++v) {
            String s = arr_s1[v];
            String s1 = a.k(Locale.US, "US", s, Locale.US, "this as java.lang.String).toLowerCase(locale)");
            if(!this.d.containsKey(s1)) {
                throw new IllegalArgumentException(("There is no table with name " + s).toString());
            }
        }
        return this.k.create(arr_s1, z, callable0);
    }

    public final boolean ensureInitialization$room_runtime_release() {
        if(!this.a.isOpenInternal()) {
            return false;
        }
        if(!this.h) {
            this.a.getOpenHelper().getWritableDatabase();
        }
        if(!this.h) {
            Log.e("ROOM", "database is not initialized even though it is open");
            return false;
        }
        return true;
    }

    @Nullable
    public final SupportSQLiteStatement getCleanupStatement$room_runtime_release() {
        return this.i;
    }

    @NotNull
    public final RoomDatabase getDatabase$room_runtime_release() {
        return this.a;
    }

    @NotNull
    public final SafeIterableMap getObserverMap$room_runtime_release() {
        return this.l;
    }

    @RestrictTo({Scope.LIBRARY})
    @NotNull
    public final AtomicBoolean getPendingRefresh() {
        return this.g;
    }

    @VisibleForTesting
    public static void getRefreshRunnable$annotations() {
    }

    @NotNull
    public final Map getTableIdLookup$room_runtime_release() {
        return this.d;
    }

    @NotNull
    public final String[] getTablesNames$room_runtime_release() {
        return this.e;
    }

    public final void internalInit$room_runtime_release(@NotNull SupportSQLiteDatabase supportSQLiteDatabase0) {
        Intrinsics.checkNotNullParameter(supportSQLiteDatabase0, "database");
        synchronized(this.o) {
            if(this.h) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                return;
            }
            supportSQLiteDatabase0.execSQL("PRAGMA temp_store = MEMORY;");
            supportSQLiteDatabase0.execSQL("PRAGMA recursive_triggers=\'ON\';");
            supportSQLiteDatabase0.execSQL("CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            this.syncTriggers$room_runtime_release(supportSQLiteDatabase0);
            this.i = supportSQLiteDatabase0.compileStatement("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1");
            this.h = true;
        }
    }

    @RestrictTo({Scope.LIBRARY})
    public final void notifyObserversByTableNames(@NotNull String[] arr_s) {
        Intrinsics.checkNotNullParameter(arr_s, "tables");
        synchronized(this.l) {
            for(Object object0: this.l) {
                Intrinsics.checkNotNullExpressionValue(((Map.Entry)object0), "(observer, wrapper)");
                Observer invalidationTracker$Observer0 = (Observer)((Map.Entry)object0).getKey();
                ObserverWrapper invalidationTracker$ObserverWrapper0 = (ObserverWrapper)((Map.Entry)object0).getValue();
                if(!invalidationTracker$Observer0.isRemote$room_runtime_release()) {
                    invalidationTracker$ObserverWrapper0.notifyByTableNames$room_runtime_release(arr_s);
                }
            }
        }
    }

    public void refreshVersionsAsync() {
        if(this.g.compareAndSet(false, true)) {
            AutoCloser autoCloser0 = this.f;
            if(autoCloser0 != null) {
                autoCloser0.incrementCountAndEnsureDbIsOpen();
            }
            this.a.getQueryExecutor().execute(this.refreshRunnable);
        }
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    @WorkerThread
    public void refreshVersionsSync() {
        AutoCloser autoCloser0 = this.f;
        if(autoCloser0 != null) {
            autoCloser0.incrementCountAndEnsureDbIsOpen();
        }
        this.syncTriggers$room_runtime_release();
        this.refreshRunnable.run();
    }

    @SuppressLint({"RestrictedApi"})
    @WorkerThread
    public void removeObserver(@NotNull Observer invalidationTracker$Observer0) {
        ObserverWrapper invalidationTracker$ObserverWrapper0;
        Intrinsics.checkNotNullParameter(invalidationTracker$Observer0, "observer");
        synchronized(this.l) {
            invalidationTracker$ObserverWrapper0 = (ObserverWrapper)this.l.remove(invalidationTracker$Observer0);
        }
        if(invalidationTracker$ObserverWrapper0 != null) {
            int[] arr_v = invalidationTracker$ObserverWrapper0.getTableIds$room_runtime_release();
            int[] arr_v1 = Arrays.copyOf(arr_v, arr_v.length);
            if(this.j.onRemoved(arr_v1)) {
                this.syncTriggers$room_runtime_release();
            }
        }
    }

    public final void setAutoCloser$room_runtime_release(@NotNull AutoCloser autoCloser0) {
        Intrinsics.checkNotNullParameter(autoCloser0, "autoCloser");
        this.f = autoCloser0;
        autoCloser0.setAutoCloseCallback(new h(this, 9));
    }

    public final void setCleanupStatement$room_runtime_release(@Nullable SupportSQLiteStatement supportSQLiteStatement0) {
        this.i = supportSQLiteStatement0;
    }

    public final void startMultiInstanceInvalidation$room_runtime_release(@NotNull Context context0, @NotNull String s, @NotNull Intent intent0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(s, "name");
        Intrinsics.checkNotNullParameter(intent0, "serviceIntent");
        this.m = new MultiInstanceInvalidationClient(context0, s, intent0, this, this.a.getQueryExecutor());
    }

    public final void stopMultiInstanceInvalidation$room_runtime_release() {
        MultiInstanceInvalidationClient multiInstanceInvalidationClient0 = this.m;
        if(multiInstanceInvalidationClient0 != null) {
            multiInstanceInvalidationClient0.stop();
        }
        this.m = null;
    }

    public final void syncTriggers$room_runtime_release() {
        RoomDatabase roomDatabase0 = this.a;
        if(!roomDatabase0.isOpenInternal()) {
            return;
        }
        this.syncTriggers$room_runtime_release(roomDatabase0.getOpenHelper().getWritableDatabase());
    }

    public final void syncTriggers$room_runtime_release(@NotNull SupportSQLiteDatabase supportSQLiteDatabase0) {
        int v;
        Lock lock0;
        Intrinsics.checkNotNullParameter(supportSQLiteDatabase0, "database");
        if(supportSQLiteDatabase0.inTransaction()) {
            return;
        }
        try {
            lock0 = this.a.getCloseLock$room_runtime_release();
            lock0.lock();
        }
        catch(IllegalStateException illegalStateException0) {
            goto label_40;
        }
        catch(SQLiteException sQLiteException0) {
            goto label_43;
        }
        try {
            Object object0 = this.n;
            __monitor_enter(object0);
            v = FIN.finallyOpen$NT();
            int[] arr_v = this.j.getTablesToSync();
            if(arr_v != null) {
                InvalidationTracker.Companion.beginTransactionInternal$room_runtime_release(supportSQLiteDatabase0);
                try {
                    int v2 = 0;
                    for(int v3 = 0; v2 < arr_v.length; ++v3) {
                        switch(arr_v[v2]) {
                            case 1: {
                                this.b(supportSQLiteDatabase0, v3);
                                break;
                            }
                            case 2: {
                                this.c(supportSQLiteDatabase0, v3);
                            }
                        }
                        ++v2;
                    }
                    supportSQLiteDatabase0.setTransactionSuccessful();
                }
                finally {
                    supportSQLiteDatabase0.endTransaction();
                }
                FIN.finallyCodeBegin$NT(v);
                __monitor_exit(object0);
                FIN.finallyCodeEnd$NT(v);
                goto label_30;
            }
            goto label_32;
        }
        catch(Throwable throwable0) {
            goto label_35;
        }
        try {
        label_30:
            lock0.unlock();
            return;
        }
        catch(IllegalStateException illegalStateException0) {
            goto label_40;
        }
        catch(SQLiteException sQLiteException0) {
            goto label_43;
        }
        try {
        label_32:
            FIN.finallyExec$NT(v);
            goto label_37;
        }
        catch(Throwable throwable0) {
            try {
            label_35:
                lock0.unlock();
                throw throwable0;
            label_37:
                lock0.unlock();
                return;
            }
            catch(IllegalStateException illegalStateException0) {
            }
            catch(SQLiteException sQLiteException0) {
                goto label_43;
            }
        }
    label_40:
        Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", illegalStateException0);
        return;
    label_43:
        Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", sQLiteException0);
    }
}

