package androidx.room;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.CallSuper;
import androidx.annotation.IntRange;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.WorkerThread;
import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SimpleSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteCompat.Api19Impl;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Factory;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import androidx.sqlite.db.framework.FrameworkSQLiteOpenHelperFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.f0;
import kotlin.collections.x;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmSuppressWildcards;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u00C0\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0006\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0016\b&\u0018\u0000 s2\u00020\u0001:\u0007tusvwxyB\u0007\u00A2\u0006\u0004\b\u0002\u0010\u0003J\u000F\u0010\u0007\u001A\u00020\u0004H\u0000\u00A2\u0006\u0004\b\u0005\u0010\u0006J%\u0010\u000B\u001A\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\b2\f\u0010\n\u001A\b\u0012\u0004\u0012\u00028\u00000\tH\u0016\u00A2\u0006\u0004\b\u000B\u0010\fJ\u0017\u0010\u0010\u001A\u00020\u000F2\u0006\u0010\u000E\u001A\u00020\rH\u0017\u00A2\u0006\u0004\b\u0010\u0010\u0011J1\u0010\u0017\u001A\b\u0012\u0004\u0012\u00020\u00160\u00152\u001A\u0010\u0014\u001A\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00130\t\u0012\u0004\u0012\u00020\u00130\u0012H\u0017\u00A2\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001B\u001A\u00020\u001A2\u0006\u0010\u0019\u001A\u00020\rH$\u00A2\u0006\u0004\b\u001B\u0010\u001CJ\u000F\u0010\u001E\u001A\u00020\u001DH$\u00A2\u0006\u0004\b\u001E\u0010\u001FJ)\u0010 \u001A\u001C\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u000E\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\u00150\u0012H\u0015\u00A2\u0006\u0004\b \u0010!J\u001D\u0010#\u001A\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00130\t0\"H\u0017\u00A2\u0006\u0004\b#\u0010$J\u000F\u0010%\u001A\u00020\u000FH\'\u00A2\u0006\u0004\b%\u0010\u0003J\u000F\u0010&\u001A\u00020\u000FH\u0016\u00A2\u0006\u0004\b&\u0010\u0003J\u000F\u0010\'\u001A\u00020\u000FH\u0017\u00A2\u0006\u0004\b\'\u0010\u0003J\u000F\u0010(\u001A\u00020\u000FH\u0017\u00A2\u0006\u0004\b(\u0010\u0003J+\u0010*\u001A\u00020-2\u0006\u0010*\u001A\u00020)2\u0012\u0010,\u001A\u000E\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0001\u0018\u00010+H\u0016\u00A2\u0006\u0004\b*\u0010.J#\u0010*\u001A\u00020-2\u0006\u0010*\u001A\u00020/2\n\b\u0002\u00101\u001A\u0004\u0018\u000100H\u0017\u00A2\u0006\u0004\b*\u00102J\u0017\u00105\u001A\u0002042\u0006\u00103\u001A\u00020)H\u0016\u00A2\u0006\u0004\b5\u00106J\u000F\u00107\u001A\u00020\u000FH\u0017\u00A2\u0006\u0004\b7\u0010\u0003J\u000F\u00108\u001A\u00020\u000FH\u0017\u00A2\u0006\u0004\b8\u0010\u0003J\u000F\u00109\u001A\u00020\u000FH\u0017\u00A2\u0006\u0004\b9\u0010\u0003J\u0017\u0010<\u001A\u00020\u000F2\u0006\u0010;\u001A\u00020:H\u0016\u00A2\u0006\u0004\b<\u0010=J#\u0010<\u001A\u00028\u0000\"\u0004\b\u0000\u0010>2\f\u0010;\u001A\b\u0012\u0004\u0012\u00028\u00000?H\u0016\u00A2\u0006\u0004\b<\u0010@J\u0017\u0010C\u001A\u00020\u000F2\u0006\u0010B\u001A\u00020AH\u0014\u00A2\u0006\u0004\bC\u0010DJ\u000F\u0010F\u001A\u00020EH\u0016\u00A2\u0006\u0004\bF\u0010GR\u001E\u0010H\u001A\u0004\u0018\u00010A8\u0004@\u0004X\u0085\u000E\u00A2\u0006\f\n\u0004\bH\u0010I\u0012\u0004\bJ\u0010\u0003R\u001A\u0010N\u001A\u00020\u001D8\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\bK\u0010L\u001A\u0004\bM\u0010\u001FR$\u0010P\u001A\n\u0012\u0004\u0012\u00020O\u0018\u00010\u00158\u0004@\u0004X\u0085\u000E\u00A2\u0006\f\n\u0004\bP\u0010Q\u0012\u0004\bR\u0010\u0003RR\u0010\u0014\u001A\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00130\t\u0012\u0004\u0012\u00020\u00130S2\u001A\u0010T\u001A\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00130\t\u0012\u0004\u0012\u00020\u00130S8E@EX\u0084\u000E\u00A2\u0006\u0012\n\u0004\bU\u0010V\u001A\u0004\bW\u0010!\"\u0004\bX\u0010YR\u001D\u0010`\u001A\b\u0012\u0004\u0012\u00020[0Z8G\u00A2\u0006\f\n\u0004\b\\\u0010]\u001A\u0004\b^\u0010_R#\u0010c\u001A\u000E\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00010S8G\u00A2\u0006\f\n\u0004\ba\u0010V\u001A\u0004\bb\u0010!R\u0014\u0010g\u001A\u00020d8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\be\u0010fR\u0014\u0010i\u001A\u00020d8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bh\u0010fR\u0014\u0010l\u001A\u00020\u001A8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bj\u0010kR\u001A\u0010m\u001A\u00020E8VX\u0096\u0004\u00A2\u0006\f\u0012\u0004\bn\u0010\u0003\u001A\u0004\bm\u0010GR\u0017\u0010o\u001A\u00020E8G\u00A2\u0006\f\u0012\u0004\bp\u0010\u0003\u001A\u0004\bo\u0010GR\u0014\u0010r\u001A\u00020E8@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\bq\u0010G\u00A8\u0006z"}, d2 = {"Landroidx/room/RoomDatabase;", "", "<init>", "()V", "Ljava/util/concurrent/locks/Lock;", "getCloseLock$room_runtime_release", "()Ljava/util/concurrent/locks/Lock;", "getCloseLock", "T", "Ljava/lang/Class;", "klass", "getTypeConverter", "(Ljava/lang/Class;)Ljava/lang/Object;", "Landroidx/room/DatabaseConfiguration;", "configuration", "", "init", "(Landroidx/room/DatabaseConfiguration;)V", "", "Landroidx/room/migration/AutoMigrationSpec;", "autoMigrationSpecs", "", "Landroidx/room/migration/Migration;", "getAutoMigrations", "(Ljava/util/Map;)Ljava/util/List;", "config", "Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "createOpenHelper", "(Landroidx/room/DatabaseConfiguration;)Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "Landroidx/room/InvalidationTracker;", "createInvalidationTracker", "()Landroidx/room/InvalidationTracker;", "getRequiredTypeConverters", "()Ljava/util/Map;", "", "getRequiredAutoMigrationSpecs", "()Ljava/util/Set;", "clearAllTables", "close", "assertNotMainThread", "assertNotSuspendingTransaction", "", "query", "", "args", "Landroid/database/Cursor;", "(Ljava/lang/String;[Ljava/lang/Object;)Landroid/database/Cursor;", "Landroidx/sqlite/db/SupportSQLiteQuery;", "Landroid/os/CancellationSignal;", "signal", "(Landroidx/sqlite/db/SupportSQLiteQuery;Landroid/os/CancellationSignal;)Landroid/database/Cursor;", "sql", "Landroidx/sqlite/db/SupportSQLiteStatement;", "compileStatement", "(Ljava/lang/String;)Landroidx/sqlite/db/SupportSQLiteStatement;", "beginTransaction", "endTransaction", "setTransactionSuccessful", "Ljava/lang/Runnable;", "body", "runInTransaction", "(Ljava/lang/Runnable;)V", "V", "Ljava/util/concurrent/Callable;", "(Ljava/util/concurrent/Callable;)Ljava/lang/Object;", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "db", "internalInitInvalidationTracker", "(Landroidx/sqlite/db/SupportSQLiteDatabase;)V", "", "inTransaction", "()Z", "mDatabase", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "getMDatabase$annotations", "f", "Landroidx/room/InvalidationTracker;", "getInvalidationTracker", "invalidationTracker", "Landroidx/room/RoomDatabase$Callback;", "mCallbacks", "Ljava/util/List;", "getMCallbacks$annotations", "", "<set-?>", "h", "Ljava/util/Map;", "getAutoMigrationSpecs", "setAutoMigrationSpecs", "(Ljava/util/Map;)V", "Ljava/lang/ThreadLocal;", "", "k", "Ljava/lang/ThreadLocal;", "getSuspendingTransactionId", "()Ljava/lang/ThreadLocal;", "suspendingTransactionId", "l", "getBackingFieldMap", "backingFieldMap", "Ljava/util/concurrent/Executor;", "getQueryExecutor", "()Ljava/util/concurrent/Executor;", "queryExecutor", "getTransactionExecutor", "transactionExecutor", "getOpenHelper", "()Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "openHelper", "isOpen", "isOpen$annotations", "isOpenInternal", "isOpenInternal$annotations", "isMainThread$room_runtime_release", "isMainThread", "Companion", "Builder", "Callback", "JournalMode", "MigrationContainer", "PrepackagedDatabaseCallback", "QueryCallback", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nRoomDatabase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomDatabase.kt\nandroidx/room/RoomDatabase\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,1548:1\n215#2,2:1549\n*S KotlinDebug\n*F\n+ 1 RoomDatabase.kt\nandroidx/room/RoomDatabase\n*L\n261#1:1549,2\n*E\n"})
public abstract class RoomDatabase {
    @Metadata(d1 = {"\u0000\u009C\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B)\b\u0000\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\b\u0010\t\u001A\u0004\u0018\u00010\b\u00A2\u0006\u0004\b\n\u0010\u000BJ\u001D\u0010\r\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\f\u001A\u00020\bH\u0016\u00A2\u0006\u0004\b\r\u0010\u000EJ%\u0010\r\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\f\u001A\u00020\b2\u0006\u0010\u0010\u001A\u00020\u000FH\u0017\u00A2\u0006\u0004\b\r\u0010\u0011J\u001D\u0010\u0014\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0013\u001A\u00020\u0012H\u0016\u00A2\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0014\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0013\u001A\u00020\u00122\u0006\u0010\u0010\u001A\u00020\u000FH\u0017\u00A2\u0006\u0004\b\u0014\u0010\u0016J#\u0010\u001A\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010\u0019\u001A\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0017\u00A2\u0006\u0004\b\u001A\u0010\u001BJ+\u0010\u001A\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010\u0019\u001A\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0010\u001A\u00020\u000FH\u0017\u00A2\u0006\u0004\b\u001A\u0010\u001CJ\u001F\u0010\u001F\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0010\u001E\u001A\u0004\u0018\u00010\u001DH\u0016\u00A2\u0006\u0004\b\u001F\u0010 J)\u0010$\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\u0012\u0010#\u001A\n\u0012\u0006\b\u0001\u0012\u00020\"0!\"\u00020\"H\u0016\u00A2\u0006\u0004\b$\u0010%J\u001D\u0010(\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\'\u001A\u00020&H\u0016\u00A2\u0006\u0004\b(\u0010)J\u0015\u0010*\u001A\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0016\u00A2\u0006\u0004\b*\u0010+J\u001D\u0010.\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010-\u001A\u00020,H\u0016\u00A2\u0006\u0004\b.\u0010/J\u001D\u00102\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u00101\u001A\u000200H\u0016\u00A2\u0006\u0004\b2\u00103J\u001D\u00104\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u00101\u001A\u000200H\u0016\u00A2\u0006\u0004\b4\u00103J\u0015\u00105\u001A\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0016\u00A2\u0006\u0004\b5\u0010+J\u001D\u00108\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u00107\u001A\u000206H\u0017\u00A2\u0006\u0004\b8\u00109J\u0015\u0010:\u001A\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0016\u00A2\u0006\u0004\b:\u0010+J\u0015\u0010;\u001A\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0016\u00A2\u0006\u0004\b;\u0010+J!\u0010?\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\n\u0010>\u001A\u00020<\"\u00020=H\u0016\u00A2\u0006\u0004\b?\u0010@J\u001D\u0010B\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0010\u001A\u00020AH\u0016\u00A2\u0006\u0004\bB\u0010CJ%\u0010F\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010E\u001A\u00020D2\u0006\u00101\u001A\u000200H\u0016\u00A2\u0006\u0004\bF\u0010GJ\u001D\u0010I\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010H\u001A\u00020\u0003H\u0016\u00A2\u0006\u0004\bI\u0010JJ\'\u0010O\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0001\u0010L\u001A\u00020K2\u0006\u0010N\u001A\u00020MH\u0017\u00A2\u0006\u0004\bO\u0010PJ\u000F\u0010Q\u001A\u00028\u0000H\u0016\u00A2\u0006\u0004\bQ\u0010R\u00A8\u0006S"}, d2 = {"Landroidx/room/RoomDatabase$Builder;", "Landroidx/room/RoomDatabase;", "T", "", "Landroid/content/Context;", "context", "Ljava/lang/Class;", "klass", "", "name", "<init>", "(Landroid/content/Context;Ljava/lang/Class;Ljava/lang/String;)V", "databaseFilePath", "createFromAsset", "(Ljava/lang/String;)Landroidx/room/RoomDatabase$Builder;", "Landroidx/room/RoomDatabase$PrepackagedDatabaseCallback;", "callback", "(Ljava/lang/String;Landroidx/room/RoomDatabase$PrepackagedDatabaseCallback;)Landroidx/room/RoomDatabase$Builder;", "Ljava/io/File;", "databaseFile", "createFromFile", "(Ljava/io/File;)Landroidx/room/RoomDatabase$Builder;", "(Ljava/io/File;Landroidx/room/RoomDatabase$PrepackagedDatabaseCallback;)Landroidx/room/RoomDatabase$Builder;", "Ljava/util/concurrent/Callable;", "Ljava/io/InputStream;", "inputStreamCallable", "createFromInputStream", "(Ljava/util/concurrent/Callable;)Landroidx/room/RoomDatabase$Builder;", "(Ljava/util/concurrent/Callable;Landroidx/room/RoomDatabase$PrepackagedDatabaseCallback;)Landroidx/room/RoomDatabase$Builder;", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$Factory;", "factory", "openHelperFactory", "(Landroidx/sqlite/db/SupportSQLiteOpenHelper$Factory;)Landroidx/room/RoomDatabase$Builder;", "", "Landroidx/room/migration/Migration;", "migrations", "addMigrations", "([Landroidx/room/migration/Migration;)Landroidx/room/RoomDatabase$Builder;", "Landroidx/room/migration/AutoMigrationSpec;", "autoMigrationSpec", "addAutoMigrationSpec", "(Landroidx/room/migration/AutoMigrationSpec;)Landroidx/room/RoomDatabase$Builder;", "allowMainThreadQueries", "()Landroidx/room/RoomDatabase$Builder;", "Landroidx/room/RoomDatabase$JournalMode;", "journalMode", "setJournalMode", "(Landroidx/room/RoomDatabase$JournalMode;)Landroidx/room/RoomDatabase$Builder;", "Ljava/util/concurrent/Executor;", "executor", "setQueryExecutor", "(Ljava/util/concurrent/Executor;)Landroidx/room/RoomDatabase$Builder;", "setTransactionExecutor", "enableMultiInstanceInvalidation", "Landroid/content/Intent;", "invalidationServiceIntent", "setMultiInstanceInvalidationServiceIntent", "(Landroid/content/Intent;)Landroidx/room/RoomDatabase$Builder;", "fallbackToDestructiveMigration", "fallbackToDestructiveMigrationOnDowngrade", "", "", "startVersions", "fallbackToDestructiveMigrationFrom", "([I)Landroidx/room/RoomDatabase$Builder;", "Landroidx/room/RoomDatabase$Callback;", "addCallback", "(Landroidx/room/RoomDatabase$Callback;)Landroidx/room/RoomDatabase$Builder;", "Landroidx/room/RoomDatabase$QueryCallback;", "queryCallback", "setQueryCallback", "(Landroidx/room/RoomDatabase$QueryCallback;Ljava/util/concurrent/Executor;)Landroidx/room/RoomDatabase$Builder;", "typeConverter", "addTypeConverter", "(Ljava/lang/Object;)Landroidx/room/RoomDatabase$Builder;", "", "autoCloseTimeout", "Ljava/util/concurrent/TimeUnit;", "autoCloseTimeUnit", "setAutoCloseTimeout", "(JLjava/util/concurrent/TimeUnit;)Landroidx/room/RoomDatabase$Builder;", "build", "()Landroidx/room/RoomDatabase;", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nRoomDatabase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomDatabase.kt\nandroidx/room/RoomDatabase$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1548:1\n1#2:1549\n*E\n"})
    public static class Builder {
        public final Context a;
        public final Class b;
        public final String c;
        public final ArrayList d;
        public PrepackagedDatabaseCallback e;
        public QueryCallback f;
        public Executor g;
        public final ArrayList h;
        public final ArrayList i;
        public Executor j;
        public Executor k;
        public Factory l;
        public boolean m;
        public JournalMode n;
        public Intent o;
        public boolean p;
        public boolean q;
        public long r;
        public TimeUnit s;
        public final MigrationContainer t;
        public final LinkedHashSet u;
        public HashSet v;
        public String w;
        public File x;
        public Callable y;

        public Builder(@NotNull Context context0, @NotNull Class class0, @Nullable String s) {
            Intrinsics.checkNotNullParameter(context0, "context");
            Intrinsics.checkNotNullParameter(class0, "klass");
            super();
            this.a = context0;
            this.b = class0;
            this.c = s;
            this.d = new ArrayList();
            this.h = new ArrayList();
            this.i = new ArrayList();
            this.n = JournalMode.AUTOMATIC;
            this.p = true;
            this.r = -1L;
            this.t = new MigrationContainer();
            this.u = new LinkedHashSet();
        }

        @NotNull
        public Builder addAutoMigrationSpec(@NotNull AutoMigrationSpec autoMigrationSpec0) {
            Intrinsics.checkNotNullParameter(autoMigrationSpec0, "autoMigrationSpec");
            this.i.add(autoMigrationSpec0);
            return this;
        }

        @NotNull
        public Builder addCallback(@NotNull Callback roomDatabase$Callback0) {
            Intrinsics.checkNotNullParameter(roomDatabase$Callback0, "callback");
            this.d.add(roomDatabase$Callback0);
            return this;
        }

        @NotNull
        public Builder addMigrations(@NotNull Migration[] arr_migration) {
            Intrinsics.checkNotNullParameter(arr_migration, "migrations");
            if(this.v == null) {
                this.v = new HashSet();
            }
            for(int v = 0; v < arr_migration.length; ++v) {
                Migration migration0 = arr_migration[v];
                HashSet hashSet0 = this.v;
                Intrinsics.checkNotNull(hashSet0);
                hashSet0.add(migration0.startVersion);
                HashSet hashSet1 = this.v;
                Intrinsics.checkNotNull(hashSet1);
                hashSet1.add(migration0.endVersion);
            }
            Migration[] arr_migration1 = (Migration[])Arrays.copyOf(arr_migration, arr_migration.length);
            this.t.addMigrations(arr_migration1);
            return this;
        }

        @NotNull
        public Builder addTypeConverter(@NotNull Object object0) {
            Intrinsics.checkNotNullParameter(object0, "typeConverter");
            this.h.add(object0);
            return this;
        }

        @NotNull
        public Builder allowMainThreadQueries() {
            this.m = true;
            return this;
        }

        @NotNull
        public RoomDatabase build() {
            Factory supportSQLiteOpenHelper$Factory1;
            Executor executor0 = this.j;
            if(executor0 == null && this.k == null) {
                Executor executor1 = ArchTaskExecutor.getIOThreadExecutor();
                this.k = executor1;
                this.j = executor1;
            }
            else if(executor0 != null && this.k == null) {
                this.k = executor0;
            }
            else if(executor0 == null) {
                this.j = this.k;
            }
            HashSet hashSet0 = this.v;
            LinkedHashSet linkedHashSet0 = this.u;
            if(hashSet0 != null) {
                Intrinsics.checkNotNull(hashSet0);
                for(Object object0: hashSet0) {
                    int v = ((Number)object0).intValue();
                    if(linkedHashSet0.contains(v)) {
                        throw new IllegalArgumentException(("Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: " + v).toString());
                    }
                    if(false) {
                        break;
                    }
                }
            }
            Factory supportSQLiteOpenHelper$Factory0 = this.l;
            if(supportSQLiteOpenHelper$Factory0 == null) {
                supportSQLiteOpenHelper$Factory0 = new FrameworkSQLiteOpenHelperFactory();
            }
            String s = this.c;
            if(Long.compare(this.r, 0L) > 0) {
                if(s == null) {
                    throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.");
                }
                long v1 = this.r;
                TimeUnit timeUnit0 = this.s;
                if(timeUnit0 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                Executor executor2 = this.j;
                if(executor2 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                supportSQLiteOpenHelper$Factory0 = new AutoClosingRoomOpenHelperFactory(supportSQLiteOpenHelper$Factory0, new AutoCloser(v1, timeUnit0, executor2));
            }
            int v2 = 0;
            String s1 = this.w;
            if(s1 != null || this.x != null || this.y != null) {
                if(s == null) {
                    throw new IllegalArgumentException("Cannot create from asset or file for an in-memory database.");
                }
                File file0 = this.x;
                Callable callable0 = this.y;
                if(callable0 != null) {
                    v2 = 1;
                }
                if((s1 == null ? 0 : 1) + (file0 == null ? 0 : 1) + v2 != 1) {
                    throw new IllegalArgumentException("More than one of createFromAsset(), createFromInputStream(), and createFromFile() were called on this Builder, but the database can only be created using one of the three configurations.");
                }
                supportSQLiteOpenHelper$Factory0 = new SQLiteCopyOpenHelperFactory(s1, file0, callable0, supportSQLiteOpenHelper$Factory0);
            }
            QueryCallback roomDatabase$QueryCallback0 = this.f;
            if(roomDatabase$QueryCallback0 == null) {
                supportSQLiteOpenHelper$Factory1 = supportSQLiteOpenHelper$Factory0;
            }
            else {
                Executor executor3 = this.g;
                if(executor3 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                supportSQLiteOpenHelper$Factory1 = new QueryInterceptorOpenHelperFactory(supportSQLiteOpenHelper$Factory0, executor3, roomDatabase$QueryCallback0);
            }
            ArrayList arrayList0 = this.d;
            boolean z = this.m;
            Context context0 = this.a;
            JournalMode roomDatabase$JournalMode0 = this.n.resolve$room_runtime_release(context0);
            Executor executor4 = this.j;
            if(executor4 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Executor executor5 = this.k;
            if(executor5 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            DatabaseConfiguration databaseConfiguration0 = new DatabaseConfiguration(context0, this.c, supportSQLiteOpenHelper$Factory1, this.t, arrayList0, z, roomDatabase$JournalMode0, executor4, executor5, this.o, this.p, this.q, linkedHashSet0, this.w, this.x, this.y, this.e, this.h, this.i);
            RoomDatabase roomDatabase0 = (RoomDatabase)Room.getGeneratedImplementation(this.b, "_Impl");
            roomDatabase0.init(databaseConfiguration0);
            return roomDatabase0;
        }

        @NotNull
        public Builder createFromAsset(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "databaseFilePath");
            this.w = s;
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        @NotNull
        public Builder createFromAsset(@NotNull String s, @NotNull PrepackagedDatabaseCallback roomDatabase$PrepackagedDatabaseCallback0) {
            Intrinsics.checkNotNullParameter(s, "databaseFilePath");
            Intrinsics.checkNotNullParameter(roomDatabase$PrepackagedDatabaseCallback0, "callback");
            this.e = roomDatabase$PrepackagedDatabaseCallback0;
            this.w = s;
            return this;
        }

        @NotNull
        public Builder createFromFile(@NotNull File file0) {
            Intrinsics.checkNotNullParameter(file0, "databaseFile");
            this.x = file0;
            return this;
        }

        @SuppressLint({"BuilderSetStyle", "StreamFiles"})
        @NotNull
        public Builder createFromFile(@NotNull File file0, @NotNull PrepackagedDatabaseCallback roomDatabase$PrepackagedDatabaseCallback0) {
            Intrinsics.checkNotNullParameter(file0, "databaseFile");
            Intrinsics.checkNotNullParameter(roomDatabase$PrepackagedDatabaseCallback0, "callback");
            this.e = roomDatabase$PrepackagedDatabaseCallback0;
            this.x = file0;
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        @NotNull
        public Builder createFromInputStream(@NotNull Callable callable0) {
            Intrinsics.checkNotNullParameter(callable0, "inputStreamCallable");
            this.y = callable0;
            return this;
        }

        @SuppressLint({"BuilderSetStyle", "LambdaLast"})
        @NotNull
        public Builder createFromInputStream(@NotNull Callable callable0, @NotNull PrepackagedDatabaseCallback roomDatabase$PrepackagedDatabaseCallback0) {
            Intrinsics.checkNotNullParameter(callable0, "inputStreamCallable");
            Intrinsics.checkNotNullParameter(roomDatabase$PrepackagedDatabaseCallback0, "callback");
            this.e = roomDatabase$PrepackagedDatabaseCallback0;
            this.y = callable0;
            return this;
        }

        @NotNull
        public Builder enableMultiInstanceInvalidation() {
            this.o = this.c == null ? null : new Intent(this.a, MultiInstanceInvalidationService.class);
            return this;
        }

        @NotNull
        public Builder fallbackToDestructiveMigration() {
            this.p = false;
            this.q = true;
            return this;
        }

        @NotNull
        public Builder fallbackToDestructiveMigrationFrom(@NotNull int[] arr_v) {
            Intrinsics.checkNotNullParameter(arr_v, "startVersions");
            for(int v = 0; v < arr_v.length; ++v) {
                this.u.add(((int)arr_v[v]));
            }
            return this;
        }

        @NotNull
        public Builder fallbackToDestructiveMigrationOnDowngrade() {
            this.p = true;
            this.q = true;
            return this;
        }

        @NotNull
        public Builder openHelperFactory(@Nullable Factory supportSQLiteOpenHelper$Factory0) {
            this.l = supportSQLiteOpenHelper$Factory0;
            return this;
        }

        @ExperimentalRoomApi
        @NotNull
        public Builder setAutoCloseTimeout(@IntRange(from = 0L) long v, @NotNull TimeUnit timeUnit0) {
            Intrinsics.checkNotNullParameter(timeUnit0, "autoCloseTimeUnit");
            if(v < 0L) {
                throw new IllegalArgumentException("autoCloseTimeout must be >= 0");
            }
            this.r = v;
            this.s = timeUnit0;
            return this;
        }

        @NotNull
        public Builder setJournalMode(@NotNull JournalMode roomDatabase$JournalMode0) {
            Intrinsics.checkNotNullParameter(roomDatabase$JournalMode0, "journalMode");
            this.n = roomDatabase$JournalMode0;
            return this;
        }

        @ExperimentalRoomApi
        @NotNull
        public Builder setMultiInstanceInvalidationServiceIntent(@NotNull Intent intent0) {
            Intrinsics.checkNotNullParameter(intent0, "invalidationServiceIntent");
            if(this.c == null) {
                intent0 = null;
            }
            this.o = intent0;
            return this;
        }

        @NotNull
        public Builder setQueryCallback(@NotNull QueryCallback roomDatabase$QueryCallback0, @NotNull Executor executor0) {
            Intrinsics.checkNotNullParameter(roomDatabase$QueryCallback0, "queryCallback");
            Intrinsics.checkNotNullParameter(executor0, "executor");
            this.f = roomDatabase$QueryCallback0;
            this.g = executor0;
            return this;
        }

        @NotNull
        public Builder setQueryExecutor(@NotNull Executor executor0) {
            Intrinsics.checkNotNullParameter(executor0, "executor");
            this.j = executor0;
            return this;
        }

        @NotNull
        public Builder setTransactionExecutor(@NotNull Executor executor0) {
            Intrinsics.checkNotNullParameter(executor0, "executor");
            this.k = executor0;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u0006H\u0016J\u0010\u0010\u0007\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u0006H\u0016J\u0010\u0010\b\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u0006H\u0016¨\u0006\t"}, d2 = {"Landroidx/room/RoomDatabase$Callback;", "", "()V", "onCreate", "", "db", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "onDestructiveMigration", "onOpen", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static abstract class Callback {
        public void onCreate(@NotNull SupportSQLiteDatabase supportSQLiteDatabase0) {
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase0, "db");
        }

        public void onDestructiveMigration(@NotNull SupportSQLiteDatabase supportSQLiteDatabase0) {
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase0, "db");
        }

        public void onOpen(@NotNull SupportSQLiteDatabase supportSQLiteDatabase0) {
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase0, "db");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/room/RoomDatabase$Companion;", "", "", "MAX_BIND_PARAMETER_CNT", "I", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001J\u0017\u0010\u0006\u001A\u00020\u00002\u0006\u0010\u0003\u001A\u00020\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Landroidx/room/RoomDatabase$JournalMode;", "", "Landroid/content/Context;", "context", "resolve$room_runtime_release", "(Landroid/content/Context;)Landroidx/room/RoomDatabase$JournalMode;", "resolve", "AUTOMATIC", "TRUNCATE", "WRITE_AHEAD_LOGGING", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static enum JournalMode {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        @NotNull
        public final JournalMode resolve$room_runtime_release(@NotNull Context context0) {
            Intrinsics.checkNotNullParameter(context0, "context");
            if(this != JournalMode.AUTOMATIC) {
                return this;
            }
            Object object0 = context0.getSystemService("activity");
            ActivityManager activityManager0 = object0 instanceof ActivityManager ? ((ActivityManager)object0) : null;
            return activityManager0 == null || Api19Impl.isLowRamDevice(activityManager0) ? JournalMode.TRUNCATE : JournalMode.WRITE_AHEAD_LOGGING;
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000B\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001A\u00020\u00072\u0012\u0010\u0006\u001A\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001D\u0010\b\u001A\u00020\u00072\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00050\nH\u0016¢\u0006\u0004\b\b\u0010\u000BJ\'\u0010\u000E\u001A\u001A\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\f0\fH\u0016¢\u0006\u0004\b\u000E\u0010\u000FJ\'\u0010\u0012\u001A\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\n2\u0006\u0010\u0010\u001A\u00020\r2\u0006\u0010\u0011\u001A\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001D\u0010\u0017\u001A\u00020\u00162\u0006\u0010\u0014\u001A\u00020\r2\u0006\u0010\u0015\u001A\u00020\r¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Landroidx/room/RoomDatabase$MigrationContainer;", "", "<init>", "()V", "", "Landroidx/room/migration/Migration;", "migrations", "", "addMigrations", "([Landroidx/room/migration/Migration;)V", "", "(Ljava/util/List;)V", "", "", "getMigrations", "()Ljava/util/Map;", "start", "end", "findMigrationPath", "(II)Ljava/util/List;", "startVersion", "endVersion", "", "contains", "(II)Z", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nRoomDatabase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomDatabase.kt\nandroidx/room/RoomDatabase$MigrationContainer\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,1548:1\n13579#2,2:1549\n1855#3,2:1551\n361#4,7:1553\n*S KotlinDebug\n*F\n+ 1 RoomDatabase.kt\nandroidx/room/RoomDatabase$MigrationContainer\n*L\n1371#1:1549,2\n1381#1:1551,2\n1387#1:1553,7\n*E\n"})
    public static class MigrationContainer {
        public final LinkedHashMap a;

        public MigrationContainer() {
            this.a = new LinkedHashMap();
        }

        public final void a(Migration migration0) {
            int v = migration0.endVersion;
            LinkedHashMap linkedHashMap0 = this.a;
            Integer integer0 = migration0.startVersion;
            TreeMap treeMap0 = linkedHashMap0.get(integer0);
            if(treeMap0 == null) {
                treeMap0 = new TreeMap();
                linkedHashMap0.put(integer0, treeMap0);
            }
            if(treeMap0.containsKey(v)) {
                Log.w("ROOM", "Overriding migration " + treeMap0.get(v) + " with " + migration0);
            }
            treeMap0.put(v, migration0);
        }

        public void addMigrations(@NotNull List list0) {
            Intrinsics.checkNotNullParameter(list0, "migrations");
            for(Object object0: list0) {
                this.a(((Migration)object0));
            }
        }

        public void addMigrations(@NotNull Migration[] arr_migration) {
            Intrinsics.checkNotNullParameter(arr_migration, "migrations");
            for(int v = 0; v < arr_migration.length; ++v) {
                this.a(arr_migration[v]);
            }
        }

        public final boolean contains(int v, int v1) {
            Map map0 = this.getMigrations();
            if(map0.containsKey(v)) {
                Map map1 = (Map)map0.get(v);
                if(map1 == null) {
                    map1 = x.emptyMap();
                }
                return map1.containsKey(v1);
            }
            return false;
        }

        // This method was un-flattened
        @Nullable
        public List findMigrationPath(int v, int v1) {
            if(v == v1) {
                return CollectionsKt__CollectionsKt.emptyList();
            }
            boolean z = v1 > v;
            List list0 = new ArrayList();
            while(true) {
                if(!z) {
                    if(v > v1) {
                        goto label_8;
                    }
                    return list0;
                }
                else if(v >= v1) {
                    return list0;
                }
            label_8:
                TreeMap treeMap0 = (TreeMap)this.a.get(v);
                if(treeMap0 == null) {
                    return null;
                }
                Set set0 = z ? treeMap0.descendingKeySet() : treeMap0.keySet();
                Iterator iterator0 = set0.iterator();
            label_16:
                if(!iterator0.hasNext()) {
                    return null;
                }
                Object object0 = iterator0.next();
                Integer integer0 = (Integer)object0;
                if(z) {
                    Intrinsics.checkNotNullExpressionValue(integer0, "targetVersion");
                    int v2 = (int)integer0;
                    if(v + 1 > v2 || v2 > v1) {
                        break;
                    }
                }
                else {
                    Intrinsics.checkNotNullExpressionValue(integer0, "targetVersion");
                    int v3 = (int)integer0;
                    if(v1 <= v3 && v3 < v) {
                        goto label_27;
                    }
                    break;
                }
            label_27:
                Object object1 = treeMap0.get(integer0);
                Intrinsics.checkNotNull(object1);
                ((ArrayList)list0).add(object1);
                v = (int)integer0;
            }
            goto label_16;
        }

        @NotNull
        public Map getMigrations() {
            return this.a;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Landroidx/room/RoomDatabase$PrepackagedDatabaseCallback;", "", "()V", "onOpenPrepackagedDatabase", "", "db", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static abstract class PrepackagedDatabaseCallback {
        public void onOpenPrepackagedDatabase(@NotNull SupportSQLiteDatabase supportSQLiteDatabase0) {
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase0, "db");
        }
    }

    @Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010 \n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J \u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\u000E\u0010\u0006\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Landroidx/room/RoomDatabase$QueryCallback;", "", "onQuery", "", "sqlQuery", "", "bindArgs", "", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public interface QueryCallback {
        void onQuery(@NotNull String arg1, @NotNull List arg2);
    }

    @NotNull
    public static final Companion Companion = null;
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public static final int MAX_BIND_PARAMETER_CNT = 999;
    public Executor c;
    public TransactionExecutor d;
    public SupportSQLiteOpenHelper e;
    public final InvalidationTracker f;
    public boolean g;
    public Map h;
    public final ReentrantReadWriteLock i;
    public AutoCloser j;
    public final ThreadLocal k;
    public final Map l;
    public final LinkedHashMap m;
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    @JvmField
    @Nullable
    protected List mCallbacks;
    @JvmField
    @Nullable
    protected volatile SupportSQLiteDatabase mDatabase;

    static {
        RoomDatabase.Companion = new Companion(null);
    }

    public RoomDatabase() {
        this.f = this.createInvalidationTracker();
        this.h = new LinkedHashMap();
        this.i = new ReentrantReadWriteLock();
        this.k = new ThreadLocal();
        Map map0 = Collections.synchronizedMap(new LinkedHashMap());
        Intrinsics.checkNotNullExpressionValue(map0, "synchronizedMap(mutableMapOf())");
        this.l = map0;
        this.m = new LinkedHashMap();
    }

    public static Object a(Class class0, SupportSQLiteOpenHelper supportSQLiteOpenHelper0) {
        if(class0.isInstance(supportSQLiteOpenHelper0)) {
            return supportSQLiteOpenHelper0;
        }
        return supportSQLiteOpenHelper0 instanceof DelegatingOpenHelper ? RoomDatabase.a(class0, ((DelegatingOpenHelper)supportSQLiteOpenHelper0).getDelegate()) : null;
    }

    public static final void access$internalBeginTransaction(RoomDatabase roomDatabase0) {
        roomDatabase0.assertNotMainThread();
        SupportSQLiteDatabase supportSQLiteDatabase0 = roomDatabase0.getOpenHelper().getWritableDatabase();
        roomDatabase0.getInvalidationTracker().syncTriggers$room_runtime_release(supportSQLiteDatabase0);
        if(supportSQLiteDatabase0.isWriteAheadLoggingEnabled()) {
            supportSQLiteDatabase0.beginTransactionNonExclusive();
            return;
        }
        supportSQLiteDatabase0.beginTransaction();
    }

    public static final void access$internalEndTransaction(RoomDatabase roomDatabase0) {
        roomDatabase0.getOpenHelper().getWritableDatabase().endTransaction();
        if(!roomDatabase0.inTransaction()) {
            roomDatabase0.getInvalidationTracker().refreshVersionsAsync();
        }
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public void assertNotMainThread() {
        if(this.g) {
            return;
        }
        if(this.isMainThread$room_runtime_release()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public void assertNotSuspendingTransaction() {
        if(!this.inTransaction() && this.k.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    @Deprecated(message = "beginTransaction() is deprecated", replaceWith = @ReplaceWith(expression = "runInTransaction(Runnable)", imports = {}))
    public void beginTransaction() {
        this.assertNotMainThread();
        AutoCloser autoCloser0 = this.j;
        if(autoCloser0 == null) {
            this.assertNotMainThread();
            SupportSQLiteDatabase supportSQLiteDatabase0 = this.getOpenHelper().getWritableDatabase();
            this.getInvalidationTracker().syncTriggers$room_runtime_release(supportSQLiteDatabase0);
            if(supportSQLiteDatabase0.isWriteAheadLoggingEnabled()) {
                supportSQLiteDatabase0.beginTransactionNonExclusive();
                return;
            }
            supportSQLiteDatabase0.beginTransaction();
            return;
        }
        autoCloser0.executeRefCountingFunction(new y0(this, 0));
    }

    @WorkerThread
    public abstract void clearAllTables();

    public void close() {
        if(this.isOpen()) {
            ReentrantReadWriteLock.WriteLock reentrantReadWriteLock$WriteLock0 = this.i.writeLock();
            Intrinsics.checkNotNullExpressionValue(reentrantReadWriteLock$WriteLock0, "readWriteLock.writeLock()");
            reentrantReadWriteLock$WriteLock0.lock();
            try {
                this.getInvalidationTracker().stopMultiInstanceInvalidation$room_runtime_release();
                this.getOpenHelper().close();
            }
            finally {
                reentrantReadWriteLock$WriteLock0.unlock();
            }
        }
    }

    @NotNull
    public SupportSQLiteStatement compileStatement(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "sql");
        this.assertNotMainThread();
        this.assertNotSuspendingTransaction();
        return this.getOpenHelper().getWritableDatabase().compileStatement(s);
    }

    @NotNull
    public abstract InvalidationTracker createInvalidationTracker();

    @NotNull
    public abstract SupportSQLiteOpenHelper createOpenHelper(@NotNull DatabaseConfiguration arg1);

    @Deprecated(message = "endTransaction() is deprecated", replaceWith = @ReplaceWith(expression = "runInTransaction(Runnable)", imports = {}))
    public void endTransaction() {
        AutoCloser autoCloser0 = this.j;
        if(autoCloser0 == null) {
            this.getOpenHelper().getWritableDatabase().endTransaction();
            if(!this.inTransaction()) {
                this.getInvalidationTracker().refreshVersionsAsync();
            }
        }
        else {
            autoCloser0.executeRefCountingFunction(new y0(this, 1));
        }
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    @NotNull
    public final Map getAutoMigrationSpecs() {
        return this.h;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    @JvmSuppressWildcards
    @NotNull
    public List getAutoMigrations(@NotNull Map map0) {
        Intrinsics.checkNotNullParameter(map0, "autoMigrationSpecs");
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    @NotNull
    public final Map getBackingFieldMap() {
        return this.l;
    }

    @NotNull
    public final Lock getCloseLock$room_runtime_release() {
        Lock lock0 = this.i.readLock();
        Intrinsics.checkNotNullExpressionValue(lock0, "readWriteLock.readLock()");
        return lock0;
    }

    @NotNull
    public InvalidationTracker getInvalidationTracker() {
        return this.f;
    }

    @Deprecated(message = "Will be hidden in a future release.")
    public static void getMCallbacks$annotations() {
    }

    @Deprecated(message = "Will be hidden in the next release.")
    public static void getMDatabase$annotations() {
    }

    @NotNull
    public SupportSQLiteOpenHelper getOpenHelper() {
        SupportSQLiteOpenHelper supportSQLiteOpenHelper0 = this.e;
        if(supportSQLiteOpenHelper0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("internalOpenHelper");
            return null;
        }
        return supportSQLiteOpenHelper0;
    }

    @NotNull
    public Executor getQueryExecutor() {
        Executor executor0 = this.c;
        if(executor0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("internalQueryExecutor");
            return null;
        }
        return executor0;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    @NotNull
    public Set getRequiredAutoMigrationSpecs() {
        return f0.emptySet();
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    @NotNull
    public Map getRequiredTypeConverters() {
        return x.emptyMap();
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    @NotNull
    public final ThreadLocal getSuspendingTransactionId() {
        return this.k;
    }

    @NotNull
    public Executor getTransactionExecutor() {
        Executor executor0 = this.d;
        if(executor0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("internalTransactionExecutor");
            return null;
        }
        return executor0;
    }

    @Nullable
    public Object getTypeConverter(@NotNull Class class0) {
        Intrinsics.checkNotNullParameter(class0, "klass");
        return this.m.get(class0);
    }

    public boolean inTransaction() {
        return this.getOpenHelper().getWritableDatabase().inTransaction();
    }

    @CallSuper
    public void init(@NotNull DatabaseConfiguration databaseConfiguration0) {
        Intrinsics.checkNotNullParameter(databaseConfiguration0, "configuration");
        this.e = this.createOpenHelper(databaseConfiguration0);
        Set set0 = this.getRequiredAutoMigrationSpecs();
        BitSet bitSet0 = new BitSet();
        Iterator iterator0 = set0.iterator();
        while(true) {
            int v = -1;
            if(!iterator0.hasNext()) {
                break;
            }
            Object object0 = iterator0.next();
            Class class0 = (Class)object0;
            int v1 = databaseConfiguration0.autoMigrationSpecs.size() - 1;
            if(v1 >= 0) {
                while(true) {
                    if(class0.isAssignableFrom(databaseConfiguration0.autoMigrationSpecs.get(v1).getClass())) {
                        bitSet0.set(v1);
                        v = v1;
                        break;
                    }
                    if(v1 - 1 < 0) {
                        break;
                    }
                    --v1;
                }
            }
            if(v < 0) {
                throw new IllegalArgumentException(("A required auto migration spec (" + class0.getCanonicalName() + ") is missing in the database configuration.").toString());
            }
            this.h.put(class0, databaseConfiguration0.autoMigrationSpecs.get(v));
        }
        int v2 = databaseConfiguration0.autoMigrationSpecs.size() - 1;
        if(v2 >= 0) {
            while(bitSet0.get(v2)) {
                if(v2 - 1 < 0) {
                    goto label_29;
                }
                --v2;
            }
            throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
        }
    label_29:
        for(Object object1: this.getAutoMigrations(this.h)) {
            Migration migration0 = (Migration)object1;
            if(!databaseConfiguration0.migrationContainer.contains(migration0.startVersion, migration0.endVersion)) {
                databaseConfiguration0.migrationContainer.addMigrations(new Migration[]{migration0});
            }
        }
        SupportSQLiteOpenHelper supportSQLiteOpenHelper0 = this.getOpenHelper();
        SQLiteCopyOpenHelper sQLiteCopyOpenHelper0 = (SQLiteCopyOpenHelper)RoomDatabase.a(SQLiteCopyOpenHelper.class, supportSQLiteOpenHelper0);
        if(sQLiteCopyOpenHelper0 != null) {
            sQLiteCopyOpenHelper0.setDatabaseConfiguration(databaseConfiguration0);
        }
        SupportSQLiteOpenHelper supportSQLiteOpenHelper1 = this.getOpenHelper();
        AutoClosingRoomOpenHelper autoClosingRoomOpenHelper0 = (AutoClosingRoomOpenHelper)RoomDatabase.a(AutoClosingRoomOpenHelper.class, supportSQLiteOpenHelper1);
        if(autoClosingRoomOpenHelper0 != null) {
            this.j = autoClosingRoomOpenHelper0.autoCloser;
            this.getInvalidationTracker().setAutoCloser$room_runtime_release(autoClosingRoomOpenHelper0.autoCloser);
        }
        this.getOpenHelper().setWriteAheadLoggingEnabled(databaseConfiguration0.journalMode == JournalMode.WRITE_AHEAD_LOGGING);
        this.mCallbacks = databaseConfiguration0.callbacks;
        this.c = databaseConfiguration0.queryExecutor;
        this.d = new TransactionExecutor(databaseConfiguration0.transactionExecutor);
        this.g = databaseConfiguration0.allowMainThreadQueries;
        if(databaseConfiguration0.multiInstanceInvalidationServiceIntent != null) {
            if(databaseConfiguration0.name == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            this.getInvalidationTracker().startMultiInstanceInvalidation$room_runtime_release(databaseConfiguration0.context, databaseConfiguration0.name, databaseConfiguration0.multiInstanceInvalidationServiceIntent);
        }
        Map map0 = this.getRequiredTypeConverters();
        BitSet bitSet1 = new BitSet();
        for(Object object2: map0.entrySet()) {
            Class class1 = (Class)((Map.Entry)object2).getKey();
            for(Object object3: ((List)((Map.Entry)object2).getValue())) {
                Class class2 = (Class)object3;
                int v3 = databaseConfiguration0.typeConverters.size() - 1;
                if(v3 >= 0) {
                    while(true) {
                        if(class2.isAssignableFrom(databaseConfiguration0.typeConverters.get(v3).getClass())) {
                            bitSet1.set(v3);
                            goto label_74;
                        }
                        if(v3 - 1 < 0) {
                            break;
                        }
                        --v3;
                    }
                }
                v3 = -1;
            label_74:
                if(v3 < 0) {
                    throw new IllegalArgumentException(("A required type converter (" + class2 + ") for " + class1.getCanonicalName() + " is missing in the database configuration.").toString());
                }
                Object object4 = databaseConfiguration0.typeConverters.get(v3);
                this.m.put(class2, object4);
            }
        }
        int v4 = databaseConfiguration0.typeConverters.size() - 1;
        if(v4 >= 0) {
            while(bitSet1.get(v4)) {
                if(v4 - 1 < 0) {
                    return;
                }
                --v4;
            }
            throw new IllegalArgumentException("Unexpected type converter " + databaseConfiguration0.typeConverters.get(v4) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
        }
    }

    public void internalInitInvalidationTracker(@NotNull SupportSQLiteDatabase supportSQLiteDatabase0) {
        Intrinsics.checkNotNullParameter(supportSQLiteDatabase0, "db");
        this.getInvalidationTracker().internalInit$room_runtime_release(supportSQLiteDatabase0);
    }

    public final boolean isMainThread$room_runtime_release() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public boolean isOpen() {
        AutoCloser autoCloser0 = this.j;
        if(autoCloser0 != null) {
            return Intrinsics.areEqual(Boolean.valueOf(autoCloser0.isActive()), Boolean.TRUE);
        }
        SupportSQLiteDatabase supportSQLiteDatabase0 = this.mDatabase;
        return supportSQLiteDatabase0 == null ? Intrinsics.areEqual(null, Boolean.TRUE) : Intrinsics.areEqual(Boolean.valueOf(supportSQLiteDatabase0.isOpen()), Boolean.TRUE);
    }

    public static void isOpen$annotations() {
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public final boolean isOpenInternal() {
        return this.mDatabase != null && this.mDatabase.isOpen();
    }

    public static void isOpenInternal$annotations() {
    }

    @JvmOverloads
    @NotNull
    public final Cursor query(@NotNull SupportSQLiteQuery supportSQLiteQuery0) {
        Intrinsics.checkNotNullParameter(supportSQLiteQuery0, "query");
        return RoomDatabase.query$default(this, supportSQLiteQuery0, null, 2, null);
    }

    @JvmOverloads
    @NotNull
    public Cursor query(@NotNull SupportSQLiteQuery supportSQLiteQuery0, @Nullable CancellationSignal cancellationSignal0) {
        Intrinsics.checkNotNullParameter(supportSQLiteQuery0, "query");
        this.assertNotMainThread();
        this.assertNotSuspendingTransaction();
        return cancellationSignal0 == null ? this.getOpenHelper().getWritableDatabase().query(supportSQLiteQuery0) : this.getOpenHelper().getWritableDatabase().query(supportSQLiteQuery0, cancellationSignal0);
    }

    @NotNull
    public Cursor query(@NotNull String s, @Nullable Object[] arr_object) {
        Intrinsics.checkNotNullParameter(s, "query");
        return this.getOpenHelper().getWritableDatabase().query(new SimpleSQLiteQuery(s, arr_object));
    }

    public static Cursor query$default(RoomDatabase roomDatabase0, SupportSQLiteQuery supportSQLiteQuery0, CancellationSignal cancellationSignal0, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: query");
        }
        if((v & 2) != 0) {
            cancellationSignal0 = null;
        }
        return roomDatabase0.query(supportSQLiteQuery0, cancellationSignal0);
    }

    public Object runInTransaction(@NotNull Callable callable0) {
        Intrinsics.checkNotNullParameter(callable0, "body");
        this.beginTransaction();
        try {
            Object object0 = callable0.call();
            this.setTransactionSuccessful();
            return object0;
        }
        finally {
            this.endTransaction();
        }
    }

    public void runInTransaction(@NotNull Runnable runnable0) {
        Intrinsics.checkNotNullParameter(runnable0, "body");
        this.beginTransaction();
        try {
            runnable0.run();
            this.setTransactionSuccessful();
        }
        finally {
            this.endTransaction();
        }
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public final void setAutoMigrationSpecs(@NotNull Map map0) {
        Intrinsics.checkNotNullParameter(map0, "<set-?>");
        this.h = map0;
    }

    @Deprecated(message = "setTransactionSuccessful() is deprecated", replaceWith = @ReplaceWith(expression = "runInTransaction(Runnable)", imports = {}))
    public void setTransactionSuccessful() {
        this.getOpenHelper().getWritableDatabase().setTransactionSuccessful();
    }
}

