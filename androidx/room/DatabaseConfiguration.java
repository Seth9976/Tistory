package androidx.room;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Factory;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001F\b\u0016\u0018\u00002\u00020\u0001B\u00CF\u0001\b\u0007\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\t\u001A\u00020\b\u0012\u000E\u0010\f\u001A\n\u0012\u0004\u0012\u00020\u000B\u0018\u00010\n\u0012\u0006\u0010\u000E\u001A\u00020\r\u0012\u0006\u0010\u0010\u001A\u00020\u000F\u0012\u0006\u0010\u0012\u001A\u00020\u0011\u0012\u0006\u0010\u0013\u001A\u00020\u0011\u0012\b\u0010\u0015\u001A\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0016\u001A\u00020\r\u0012\u0006\u0010\u0017\u001A\u00020\r\u0012\u000E\u0010\u001A\u001A\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018\u0012\b\u0010\u001B\u001A\u0004\u0018\u00010\u0004\u0012\b\u0010\u001D\u001A\u0004\u0018\u00010\u001C\u0012\u000E\u0010 \u001A\n\u0012\u0004\u0012\u00020\u001F\u0018\u00010\u001E\u0012\b\u0010\"\u001A\u0004\u0018\u00010!\u0012\f\u0010#\u001A\b\u0012\u0004\u0012\u00020\u00010\n\u0012\f\u0010%\u001A\b\u0012\u0004\u0012\u00020$0\n\u00A2\u0006\u0004\b&\u0010\'Bk\b\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\t\u001A\u00020\b\u0012\u000E\u0010\f\u001A\n\u0012\u0004\u0012\u00020\u000B\u0018\u00010\n\u0012\u0006\u0010\u000E\u001A\u00020\r\u0012\u0006\u0010\u0010\u001A\u00020\u000F\u0012\u0006\u0010\u0012\u001A\u00020\u0011\u0012\u0006\u0010\u0016\u001A\u00020\r\u0012\u000E\u0010\u001A\u001A\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018\u00A2\u0006\u0004\b&\u0010(B\u0083\u0001\b\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\t\u001A\u00020\b\u0012\u000E\u0010\f\u001A\n\u0012\u0004\u0012\u00020\u000B\u0018\u00010\n\u0012\u0006\u0010\u000E\u001A\u00020\r\u0012\u0006\u0010\u0010\u001A\u00020\u000F\u0012\u0006\u0010\u0012\u001A\u00020\u0011\u0012\u0006\u0010\u0013\u001A\u00020\u0011\u0012\u0006\u0010)\u001A\u00020\r\u0012\u0006\u0010\u0016\u001A\u00020\r\u0012\u0006\u0010\u0017\u001A\u00020\r\u0012\u000E\u0010\u001A\u001A\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018\u00A2\u0006\u0004\b&\u0010*B\u0097\u0001\b\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\t\u001A\u00020\b\u0012\u000E\u0010\f\u001A\n\u0012\u0004\u0012\u00020\u000B\u0018\u00010\n\u0012\u0006\u0010\u000E\u001A\u00020\r\u0012\u0006\u0010\u0010\u001A\u00020\u000F\u0012\u0006\u0010\u0012\u001A\u00020\u0011\u0012\u0006\u0010\u0013\u001A\u00020\u0011\u0012\u0006\u0010)\u001A\u00020\r\u0012\u0006\u0010\u0016\u001A\u00020\r\u0012\u0006\u0010\u0017\u001A\u00020\r\u0012\u000E\u0010\u001A\u001A\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018\u0012\b\u0010\u001B\u001A\u0004\u0018\u00010\u0004\u0012\b\u0010\u001D\u001A\u0004\u0018\u00010\u001C\u00A2\u0006\u0004\b&\u0010+B\u00A7\u0001\b\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\t\u001A\u00020\b\u0012\u000E\u0010\f\u001A\n\u0012\u0004\u0012\u00020\u000B\u0018\u00010\n\u0012\u0006\u0010\u000E\u001A\u00020\r\u0012\u0006\u0010\u0010\u001A\u00020\u000F\u0012\u0006\u0010\u0012\u001A\u00020\u0011\u0012\u0006\u0010\u0013\u001A\u00020\u0011\u0012\u0006\u0010)\u001A\u00020\r\u0012\u0006\u0010\u0016\u001A\u00020\r\u0012\u0006\u0010\u0017\u001A\u00020\r\u0012\u000E\u0010\u001A\u001A\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018\u0012\b\u0010\u001B\u001A\u0004\u0018\u00010\u0004\u0012\b\u0010\u001D\u001A\u0004\u0018\u00010\u001C\u0012\u000E\u0010 \u001A\n\u0012\u0004\u0012\u00020\u001F\u0018\u00010\u001E\u00A2\u0006\u0004\b&\u0010,B\u00B1\u0001\b\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\t\u001A\u00020\b\u0012\u000E\u0010\f\u001A\n\u0012\u0004\u0012\u00020\u000B\u0018\u00010\n\u0012\u0006\u0010\u000E\u001A\u00020\r\u0012\u0006\u0010\u0010\u001A\u00020\u000F\u0012\u0006\u0010\u0012\u001A\u00020\u0011\u0012\u0006\u0010\u0013\u001A\u00020\u0011\u0012\u0006\u0010)\u001A\u00020\r\u0012\u0006\u0010\u0016\u001A\u00020\r\u0012\u0006\u0010\u0017\u001A\u00020\r\u0012\u000E\u0010\u001A\u001A\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018\u0012\b\u0010\u001B\u001A\u0004\u0018\u00010\u0004\u0012\b\u0010\u001D\u001A\u0004\u0018\u00010\u001C\u0012\u000E\u0010 \u001A\n\u0012\u0004\u0012\u00020\u001F\u0018\u00010\u001E\u0012\b\u0010\"\u001A\u0004\u0018\u00010!\u00A2\u0006\u0004\b&\u0010-B\u00BF\u0001\b\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\t\u001A\u00020\b\u0012\u000E\u0010\f\u001A\n\u0012\u0004\u0012\u00020\u000B\u0018\u00010\n\u0012\u0006\u0010\u000E\u001A\u00020\r\u0012\u0006\u0010\u0010\u001A\u00020\u000F\u0012\u0006\u0010\u0012\u001A\u00020\u0011\u0012\u0006\u0010\u0013\u001A\u00020\u0011\u0012\u0006\u0010)\u001A\u00020\r\u0012\u0006\u0010\u0016\u001A\u00020\r\u0012\u0006\u0010\u0017\u001A\u00020\r\u0012\u000E\u0010\u001A\u001A\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018\u0012\b\u0010\u001B\u001A\u0004\u0018\u00010\u0004\u0012\b\u0010\u001D\u001A\u0004\u0018\u00010\u001C\u0012\u000E\u0010 \u001A\n\u0012\u0004\u0012\u00020\u001F\u0018\u00010\u001E\u0012\b\u0010\"\u001A\u0004\u0018\u00010!\u0012\f\u0010#\u001A\b\u0012\u0004\u0012\u00020\u00010\n\u00A2\u0006\u0004\b&\u0010.B\u00CD\u0001\b\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\t\u001A\u00020\b\u0012\u000E\u0010\f\u001A\n\u0012\u0004\u0012\u00020\u000B\u0018\u00010\n\u0012\u0006\u0010\u000E\u001A\u00020\r\u0012\u0006\u0010\u0010\u001A\u00020\u000F\u0012\u0006\u0010\u0012\u001A\u00020\u0011\u0012\u0006\u0010\u0013\u001A\u00020\u0011\u0012\u0006\u0010)\u001A\u00020\r\u0012\u0006\u0010\u0016\u001A\u00020\r\u0012\u0006\u0010\u0017\u001A\u00020\r\u0012\u000E\u0010\u001A\u001A\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018\u0012\b\u0010\u001B\u001A\u0004\u0018\u00010\u0004\u0012\b\u0010\u001D\u001A\u0004\u0018\u00010\u001C\u0012\u000E\u0010 \u001A\n\u0012\u0004\u0012\u00020\u001F\u0018\u00010\u001E\u0012\b\u0010\"\u001A\u0004\u0018\u00010!\u0012\f\u0010#\u001A\b\u0012\u0004\u0012\u00020\u00010\n\u0012\f\u0010%\u001A\b\u0012\u0004\u0012\u00020$0\n\u00A2\u0006\u0004\b&\u0010/J\u0017\u00101\u001A\u00020\r2\u0006\u00100\u001A\u00020\u0019H\u0017\u00A2\u0006\u0004\b1\u00102J\u001F\u00105\u001A\u00020\r2\u0006\u00103\u001A\u00020\u00192\u0006\u00104\u001A\u00020\u0019H\u0016\u00A2\u0006\u0004\b5\u00106R\u0014\u0010\u0003\u001A\u00020\u00028\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\b\u0003\u00107R\u0016\u0010\u0005\u001A\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\b\u0005\u00108R\u0014\u0010\u0007\u001A\u00020\u00068\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\b\u0007\u00109R\u0014\u0010\t\u001A\u00020\b8\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\b\t\u0010:R\u001C\u0010\f\u001A\n\u0012\u0004\u0012\u00020\u000B\u0018\u00010\n8\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\b\f\u0010;R\u0014\u0010\u000E\u001A\u00020\r8\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\b\u000E\u0010<R\u0014\u0010\u0010\u001A\u00020\u000F8\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\b\u0010\u0010=R\u0014\u0010\u0012\u001A\u00020\u00118\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\b\u0012\u0010>R\u0014\u0010\u0013\u001A\u00020\u00118\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\b\u0013\u0010>R\u0016\u0010\u0015\u001A\u0004\u0018\u00010\u00148\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\b\u0015\u0010?R\u0014\u0010\u0016\u001A\u00020\r8\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\b\u0016\u0010<R\u0014\u0010\u0017\u001A\u00020\r8\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\b\u0017\u0010<R\u0016\u0010\u001B\u001A\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\b\u001B\u00108R\u0016\u0010\u001D\u001A\u0004\u0018\u00010\u001C8\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\b\u001D\u0010@R\u001C\u0010 \u001A\n\u0012\u0004\u0012\u00020\u001F\u0018\u00010\u001E8\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\b \u0010AR\u0016\u0010\"\u001A\u0004\u0018\u00010!8\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\b\"\u0010BR\u001A\u0010#\u001A\b\u0012\u0004\u0012\u00020\u00010\n8\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\b#\u0010;R\u001A\u0010%\u001A\b\u0012\u0004\u0012\u00020$0\n8\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\b%\u0010;R\u0014\u0010)\u001A\u00020\r8\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\b)\u0010<\u00A8\u0006C"}, d2 = {"Landroidx/room/DatabaseConfiguration;", "", "Landroid/content/Context;", "context", "", "name", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$Factory;", "sqliteOpenHelperFactory", "Landroidx/room/RoomDatabase$MigrationContainer;", "migrationContainer", "", "Landroidx/room/RoomDatabase$Callback;", "callbacks", "", "allowMainThreadQueries", "Landroidx/room/RoomDatabase$JournalMode;", "journalMode", "Ljava/util/concurrent/Executor;", "queryExecutor", "transactionExecutor", "Landroid/content/Intent;", "multiInstanceInvalidationServiceIntent", "requireMigration", "allowDestructiveMigrationOnDowngrade", "", "", "migrationNotRequiredFrom", "copyFromAssetPath", "Ljava/io/File;", "copyFromFile", "Ljava/util/concurrent/Callable;", "Ljava/io/InputStream;", "copyFromInputStream", "Landroidx/room/RoomDatabase$PrepackagedDatabaseCallback;", "prepackagedDatabaseCallback", "typeConverters", "Landroidx/room/migration/AutoMigrationSpec;", "autoMigrationSpecs", "<init>", "(Landroid/content/Context;Ljava/lang/String;Landroidx/sqlite/db/SupportSQLiteOpenHelper$Factory;Landroidx/room/RoomDatabase$MigrationContainer;Ljava/util/List;ZLandroidx/room/RoomDatabase$JournalMode;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Landroid/content/Intent;ZZLjava/util/Set;Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;Landroidx/room/RoomDatabase$PrepackagedDatabaseCallback;Ljava/util/List;Ljava/util/List;)V", "(Landroid/content/Context;Ljava/lang/String;Landroidx/sqlite/db/SupportSQLiteOpenHelper$Factory;Landroidx/room/RoomDatabase$MigrationContainer;Ljava/util/List;ZLandroidx/room/RoomDatabase$JournalMode;Ljava/util/concurrent/Executor;ZLjava/util/Set;)V", "multiInstanceInvalidation", "(Landroid/content/Context;Ljava/lang/String;Landroidx/sqlite/db/SupportSQLiteOpenHelper$Factory;Landroidx/room/RoomDatabase$MigrationContainer;Ljava/util/List;ZLandroidx/room/RoomDatabase$JournalMode;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;ZZZLjava/util/Set;)V", "(Landroid/content/Context;Ljava/lang/String;Landroidx/sqlite/db/SupportSQLiteOpenHelper$Factory;Landroidx/room/RoomDatabase$MigrationContainer;Ljava/util/List;ZLandroidx/room/RoomDatabase$JournalMode;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;ZZZLjava/util/Set;Ljava/lang/String;Ljava/io/File;)V", "(Landroid/content/Context;Ljava/lang/String;Landroidx/sqlite/db/SupportSQLiteOpenHelper$Factory;Landroidx/room/RoomDatabase$MigrationContainer;Ljava/util/List;ZLandroidx/room/RoomDatabase$JournalMode;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;ZZZLjava/util/Set;Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;)V", "(Landroid/content/Context;Ljava/lang/String;Landroidx/sqlite/db/SupportSQLiteOpenHelper$Factory;Landroidx/room/RoomDatabase$MigrationContainer;Ljava/util/List;ZLandroidx/room/RoomDatabase$JournalMode;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;ZZZLjava/util/Set;Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;Landroidx/room/RoomDatabase$PrepackagedDatabaseCallback;)V", "(Landroid/content/Context;Ljava/lang/String;Landroidx/sqlite/db/SupportSQLiteOpenHelper$Factory;Landroidx/room/RoomDatabase$MigrationContainer;Ljava/util/List;ZLandroidx/room/RoomDatabase$JournalMode;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;ZZZLjava/util/Set;Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;Landroidx/room/RoomDatabase$PrepackagedDatabaseCallback;Ljava/util/List;)V", "(Landroid/content/Context;Ljava/lang/String;Landroidx/sqlite/db/SupportSQLiteOpenHelper$Factory;Landroidx/room/RoomDatabase$MigrationContainer;Ljava/util/List;ZLandroidx/room/RoomDatabase$JournalMode;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;ZZZLjava/util/Set;Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;Landroidx/room/RoomDatabase$PrepackagedDatabaseCallback;Ljava/util/List;Ljava/util/List;)V", "version", "isMigrationRequiredFrom", "(I)Z", "fromVersion", "toVersion", "isMigrationRequired", "(II)Z", "Landroid/content/Context;", "Ljava/lang/String;", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$Factory;", "Landroidx/room/RoomDatabase$MigrationContainer;", "Ljava/util/List;", "Z", "Landroidx/room/RoomDatabase$JournalMode;", "Ljava/util/concurrent/Executor;", "Landroid/content/Intent;", "Ljava/io/File;", "Ljava/util/concurrent/Callable;", "Landroidx/room/RoomDatabase$PrepackagedDatabaseCallback;", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public class DatabaseConfiguration {
    public final Set a;
    @JvmField
    public final boolean allowDestructiveMigrationOnDowngrade;
    @JvmField
    public final boolean allowMainThreadQueries;
    @JvmField
    @NotNull
    public final List autoMigrationSpecs;
    @JvmField
    @Nullable
    public final List callbacks;
    @JvmField
    @NotNull
    public final Context context;
    @JvmField
    @Nullable
    public final String copyFromAssetPath;
    @JvmField
    @Nullable
    public final File copyFromFile;
    @JvmField
    @Nullable
    public final Callable copyFromInputStream;
    @JvmField
    @NotNull
    public final JournalMode journalMode;
    @JvmField
    @NotNull
    public final MigrationContainer migrationContainer;
    @JvmField
    public final boolean multiInstanceInvalidation;
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    @JvmField
    @Nullable
    public final Intent multiInstanceInvalidationServiceIntent;
    @JvmField
    @Nullable
    public final String name;
    @JvmField
    @Nullable
    public final PrepackagedDatabaseCallback prepackagedDatabaseCallback;
    @JvmField
    @NotNull
    public final Executor queryExecutor;
    @JvmField
    public final boolean requireMigration;
    @JvmField
    @NotNull
    public final Factory sqliteOpenHelperFactory;
    @JvmField
    @NotNull
    public final Executor transactionExecutor;
    @JvmField
    @NotNull
    public final List typeConverters;

    @SuppressLint({"LambdaLast"})
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public DatabaseConfiguration(@NotNull Context context0, @Nullable String s, @NotNull Factory supportSQLiteOpenHelper$Factory0, @NotNull MigrationContainer roomDatabase$MigrationContainer0, @Nullable List list0, boolean z, @NotNull JournalMode roomDatabase$JournalMode0, @NotNull Executor executor0, @NotNull Executor executor1, @Nullable Intent intent0, boolean z1, boolean z2, @Nullable Set set0, @Nullable String s1, @Nullable File file0, @Nullable Callable callable0, @Nullable PrepackagedDatabaseCallback roomDatabase$PrepackagedDatabaseCallback0, @NotNull List list1, @NotNull List list2) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(supportSQLiteOpenHelper$Factory0, "sqliteOpenHelperFactory");
        Intrinsics.checkNotNullParameter(roomDatabase$MigrationContainer0, "migrationContainer");
        Intrinsics.checkNotNullParameter(roomDatabase$JournalMode0, "journalMode");
        Intrinsics.checkNotNullParameter(executor0, "queryExecutor");
        Intrinsics.checkNotNullParameter(executor1, "transactionExecutor");
        Intrinsics.checkNotNullParameter(list1, "typeConverters");
        Intrinsics.checkNotNullParameter(list2, "autoMigrationSpecs");
        super();
        this.context = context0;
        this.name = s;
        this.sqliteOpenHelperFactory = supportSQLiteOpenHelper$Factory0;
        this.migrationContainer = roomDatabase$MigrationContainer0;
        this.callbacks = list0;
        this.allowMainThreadQueries = z;
        this.journalMode = roomDatabase$JournalMode0;
        this.queryExecutor = executor0;
        this.transactionExecutor = executor1;
        this.multiInstanceInvalidationServiceIntent = intent0;
        this.requireMigration = z1;
        this.allowDestructiveMigrationOnDowngrade = z2;
        this.a = set0;
        this.copyFromAssetPath = s1;
        this.copyFromFile = file0;
        this.copyFromInputStream = callable0;
        this.prepackagedDatabaseCallback = roomDatabase$PrepackagedDatabaseCallback0;
        this.typeConverters = list1;
        this.autoMigrationSpecs = list2;
        this.multiInstanceInvalidation = intent0 != null;
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated(message = "This constructor is deprecated.", replaceWith = @ReplaceWith(expression = "DatabaseConfiguration(Context, String, SupportSQLiteOpenHelper.Factory, RoomDatabase.MigrationContainer, List, boolean, RoomDatabase.JournalMode, Executor, Executor, Intent, boolean, boolean, Set, String, File, Callable, RoomDatabase.PrepackagedDatabaseCallback, List, List)", imports = {}))
    public DatabaseConfiguration(@NotNull Context context0, @Nullable String s, @NotNull Factory supportSQLiteOpenHelper$Factory0, @NotNull MigrationContainer roomDatabase$MigrationContainer0, @Nullable List list0, boolean z, @NotNull JournalMode roomDatabase$JournalMode0, @NotNull Executor executor0, @NotNull Executor executor1, boolean z1, boolean z2, boolean z3, @Nullable Set set0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(supportSQLiteOpenHelper$Factory0, "sqliteOpenHelperFactory");
        Intrinsics.checkNotNullParameter(roomDatabase$MigrationContainer0, "migrationContainer");
        Intrinsics.checkNotNullParameter(roomDatabase$JournalMode0, "journalMode");
        Intrinsics.checkNotNullParameter(executor0, "queryExecutor");
        Intrinsics.checkNotNullParameter(executor1, "transactionExecutor");
        this(context0, s, supportSQLiteOpenHelper$Factory0, roomDatabase$MigrationContainer0, list0, z, roomDatabase$JournalMode0, executor0, executor1, (z1 ? new Intent(context0, MultiInstanceInvalidationService.class) : null), z2, z3, set0, null, null, null, null, CollectionsKt__CollectionsKt.emptyList(), CollectionsKt__CollectionsKt.emptyList());
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated(message = "This constructor is deprecated.", replaceWith = @ReplaceWith(expression = "DatabaseConfiguration(Context, String, SupportSQLiteOpenHelper.Factory, RoomDatabase.MigrationContainer, List, boolean, RoomDatabase.JournalMode, Executor, Executor, Intent, boolean, boolean, Set, String, File, Callable, RoomDatabase.PrepackagedDatabaseCallback, List, List)", imports = {}))
    public DatabaseConfiguration(@NotNull Context context0, @Nullable String s, @NotNull Factory supportSQLiteOpenHelper$Factory0, @NotNull MigrationContainer roomDatabase$MigrationContainer0, @Nullable List list0, boolean z, @NotNull JournalMode roomDatabase$JournalMode0, @NotNull Executor executor0, @NotNull Executor executor1, boolean z1, boolean z2, boolean z3, @Nullable Set set0, @Nullable String s1, @Nullable File file0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(supportSQLiteOpenHelper$Factory0, "sqliteOpenHelperFactory");
        Intrinsics.checkNotNullParameter(roomDatabase$MigrationContainer0, "migrationContainer");
        Intrinsics.checkNotNullParameter(roomDatabase$JournalMode0, "journalMode");
        Intrinsics.checkNotNullParameter(executor0, "queryExecutor");
        Intrinsics.checkNotNullParameter(executor1, "transactionExecutor");
        this(context0, s, supportSQLiteOpenHelper$Factory0, roomDatabase$MigrationContainer0, list0, z, roomDatabase$JournalMode0, executor0, executor1, (z1 ? new Intent(context0, MultiInstanceInvalidationService.class) : null), z2, z3, set0, s1, file0, null, null, CollectionsKt__CollectionsKt.emptyList(), CollectionsKt__CollectionsKt.emptyList());
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated(message = "This constructor is deprecated.", replaceWith = @ReplaceWith(expression = "DatabaseConfiguration(Context, String, SupportSQLiteOpenHelper.Factory, RoomDatabase.MigrationContainer, List, boolean, RoomDatabase.JournalMode, Executor, Executor, Intent, boolean, boolean, Set, String, File, Callable, RoomDatabase.PrepackagedDatabaseCallback, List, List)", imports = {}))
    public DatabaseConfiguration(@NotNull Context context0, @Nullable String s, @NotNull Factory supportSQLiteOpenHelper$Factory0, @NotNull MigrationContainer roomDatabase$MigrationContainer0, @Nullable List list0, boolean z, @NotNull JournalMode roomDatabase$JournalMode0, @NotNull Executor executor0, @NotNull Executor executor1, boolean z1, boolean z2, boolean z3, @Nullable Set set0, @Nullable String s1, @Nullable File file0, @Nullable Callable callable0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(supportSQLiteOpenHelper$Factory0, "sqliteOpenHelperFactory");
        Intrinsics.checkNotNullParameter(roomDatabase$MigrationContainer0, "migrationContainer");
        Intrinsics.checkNotNullParameter(roomDatabase$JournalMode0, "journalMode");
        Intrinsics.checkNotNullParameter(executor0, "queryExecutor");
        Intrinsics.checkNotNullParameter(executor1, "transactionExecutor");
        this(context0, s, supportSQLiteOpenHelper$Factory0, roomDatabase$MigrationContainer0, list0, z, roomDatabase$JournalMode0, executor0, executor1, (z1 ? new Intent(context0, MultiInstanceInvalidationService.class) : null), z2, z3, set0, s1, file0, callable0, null, CollectionsKt__CollectionsKt.emptyList(), CollectionsKt__CollectionsKt.emptyList());
    }

    @SuppressLint({"LambdaLast"})
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated(message = "This constructor is deprecated.", replaceWith = @ReplaceWith(expression = "DatabaseConfiguration(Context, String, SupportSQLiteOpenHelper.Factory, RoomDatabase.MigrationContainer, List, boolean, RoomDatabase.JournalMode, Executor, Executor, Intent, boolean, boolean, Set, String, File, Callable, RoomDatabase.PrepackagedDatabaseCallback, List, List)", imports = {}))
    public DatabaseConfiguration(@NotNull Context context0, @Nullable String s, @NotNull Factory supportSQLiteOpenHelper$Factory0, @NotNull MigrationContainer roomDatabase$MigrationContainer0, @Nullable List list0, boolean z, @NotNull JournalMode roomDatabase$JournalMode0, @NotNull Executor executor0, @NotNull Executor executor1, boolean z1, boolean z2, boolean z3, @Nullable Set set0, @Nullable String s1, @Nullable File file0, @Nullable Callable callable0, @Nullable PrepackagedDatabaseCallback roomDatabase$PrepackagedDatabaseCallback0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(supportSQLiteOpenHelper$Factory0, "sqliteOpenHelperFactory");
        Intrinsics.checkNotNullParameter(roomDatabase$MigrationContainer0, "migrationContainer");
        Intrinsics.checkNotNullParameter(roomDatabase$JournalMode0, "journalMode");
        Intrinsics.checkNotNullParameter(executor0, "queryExecutor");
        Intrinsics.checkNotNullParameter(executor1, "transactionExecutor");
        this(context0, s, supportSQLiteOpenHelper$Factory0, roomDatabase$MigrationContainer0, list0, z, roomDatabase$JournalMode0, executor0, executor1, (z1 ? new Intent(context0, MultiInstanceInvalidationService.class) : null), z2, z3, set0, s1, file0, callable0, roomDatabase$PrepackagedDatabaseCallback0, CollectionsKt__CollectionsKt.emptyList(), CollectionsKt__CollectionsKt.emptyList());
    }

    @SuppressLint({"LambdaLast"})
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated(message = "This constructor is deprecated.", replaceWith = @ReplaceWith(expression = "DatabaseConfiguration(Context, String, SupportSQLiteOpenHelper.Factory, RoomDatabase.MigrationContainer, List, boolean, RoomDatabase.JournalMode, Executor, Executor, Intent, boolean, boolean, Set, String, File, Callable, RoomDatabase.PrepackagedDatabaseCallback, List, List)", imports = {}))
    public DatabaseConfiguration(@NotNull Context context0, @Nullable String s, @NotNull Factory supportSQLiteOpenHelper$Factory0, @NotNull MigrationContainer roomDatabase$MigrationContainer0, @Nullable List list0, boolean z, @NotNull JournalMode roomDatabase$JournalMode0, @NotNull Executor executor0, @NotNull Executor executor1, boolean z1, boolean z2, boolean z3, @Nullable Set set0, @Nullable String s1, @Nullable File file0, @Nullable Callable callable0, @Nullable PrepackagedDatabaseCallback roomDatabase$PrepackagedDatabaseCallback0, @NotNull List list1) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(supportSQLiteOpenHelper$Factory0, "sqliteOpenHelperFactory");
        Intrinsics.checkNotNullParameter(roomDatabase$MigrationContainer0, "migrationContainer");
        Intrinsics.checkNotNullParameter(roomDatabase$JournalMode0, "journalMode");
        Intrinsics.checkNotNullParameter(executor0, "queryExecutor");
        Intrinsics.checkNotNullParameter(executor1, "transactionExecutor");
        Intrinsics.checkNotNullParameter(list1, "typeConverters");
        this(context0, s, supportSQLiteOpenHelper$Factory0, roomDatabase$MigrationContainer0, list0, z, roomDatabase$JournalMode0, executor0, executor1, (z1 ? new Intent(context0, MultiInstanceInvalidationService.class) : null), z2, z3, set0, s1, file0, callable0, roomDatabase$PrepackagedDatabaseCallback0, list1, CollectionsKt__CollectionsKt.emptyList());
    }

    @SuppressLint({"LambdaLast"})
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated(message = "This constructor is deprecated.", replaceWith = @ReplaceWith(expression = "DatabaseConfiguration(Context, String, SupportSQLiteOpenHelper.Factory, RoomDatabase.MigrationContainer, List, boolean, RoomDatabase.JournalMode, Executor, Executor, Intent, boolean, boolean, Set, String, File, Callable, RoomDatabase.PrepackagedDatabaseCallback, List, List)", imports = {}))
    public DatabaseConfiguration(@NotNull Context context0, @Nullable String s, @NotNull Factory supportSQLiteOpenHelper$Factory0, @NotNull MigrationContainer roomDatabase$MigrationContainer0, @Nullable List list0, boolean z, @NotNull JournalMode roomDatabase$JournalMode0, @NotNull Executor executor0, @NotNull Executor executor1, boolean z1, boolean z2, boolean z3, @Nullable Set set0, @Nullable String s1, @Nullable File file0, @Nullable Callable callable0, @Nullable PrepackagedDatabaseCallback roomDatabase$PrepackagedDatabaseCallback0, @NotNull List list1, @NotNull List list2) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(supportSQLiteOpenHelper$Factory0, "sqliteOpenHelperFactory");
        Intrinsics.checkNotNullParameter(roomDatabase$MigrationContainer0, "migrationContainer");
        Intrinsics.checkNotNullParameter(roomDatabase$JournalMode0, "journalMode");
        Intrinsics.checkNotNullParameter(executor0, "queryExecutor");
        Intrinsics.checkNotNullParameter(executor1, "transactionExecutor");
        Intrinsics.checkNotNullParameter(list1, "typeConverters");
        Intrinsics.checkNotNullParameter(list2, "autoMigrationSpecs");
        this(context0, s, supportSQLiteOpenHelper$Factory0, roomDatabase$MigrationContainer0, list0, z, roomDatabase$JournalMode0, executor0, executor1, (z1 ? new Intent(context0, MultiInstanceInvalidationService.class) : null), z2, z3, set0, s1, file0, callable0, null, list1, list2);
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated(message = "This constructor is deprecated.", replaceWith = @ReplaceWith(expression = "DatabaseConfiguration(Context, String, SupportSQLiteOpenHelper.Factory, RoomDatabase.MigrationContainer, List, boolean, RoomDatabase.JournalMode, Executor, Executor, Intent, boolean, boolean, Set, String, File, Callable, RoomDatabase.PrepackagedDatabaseCallback, List, List)", imports = {}))
    public DatabaseConfiguration(@NotNull Context context0, @Nullable String s, @NotNull Factory supportSQLiteOpenHelper$Factory0, @NotNull MigrationContainer roomDatabase$MigrationContainer0, @Nullable List list0, boolean z, @NotNull JournalMode roomDatabase$JournalMode0, @NotNull Executor executor0, boolean z1, @Nullable Set set0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(supportSQLiteOpenHelper$Factory0, "sqliteOpenHelperFactory");
        Intrinsics.checkNotNullParameter(roomDatabase$MigrationContainer0, "migrationContainer");
        Intrinsics.checkNotNullParameter(roomDatabase$JournalMode0, "journalMode");
        Intrinsics.checkNotNullParameter(executor0, "queryExecutor");
        this(context0, s, supportSQLiteOpenHelper$Factory0, roomDatabase$MigrationContainer0, list0, z, roomDatabase$JournalMode0, executor0, executor0, null, z1, false, set0, null, null, null, null, CollectionsKt__CollectionsKt.emptyList(), CollectionsKt__CollectionsKt.emptyList());
    }

    // 去混淆评级： 低(40)
    public boolean isMigrationRequired(int v, int v1) {
        return v <= v1 || !this.allowDestructiveMigrationOnDowngrade ? this.requireMigration && (this.a == null || !this.a.contains(v)) : false;
    }

    @Deprecated(message = "Use [isMigrationRequired(int, int)] which takes\n      [allowDestructiveMigrationOnDowngrade] into account.", replaceWith = @ReplaceWith(expression = "isMigrationRequired(version, version + 1)", imports = {}))
    public boolean isMigrationRequiredFrom(int v) {
        return this.isMigrationRequired(v, v + 1);
    }
}

