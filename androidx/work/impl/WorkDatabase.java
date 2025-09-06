package androidx.work.impl;

import android.content.Context;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.app.h;
import androidx.room.AutoMigration;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;
import androidx.room.migration.Migration;
import androidx.work.Clock;
import androidx.work.Data;
import androidx.work.impl.model.Dependency;
import androidx.work.impl.model.DependencyDao;
import androidx.work.impl.model.Preference;
import androidx.work.impl.model.PreferenceDao;
import androidx.work.impl.model.RawWorkInfoDao;
import androidx.work.impl.model.SystemIdInfo;
import androidx.work.impl.model.SystemIdInfoDao;
import androidx.work.impl.model.WorkName;
import androidx.work.impl.model.WorkNameDao;
import androidx.work.impl.model.WorkProgress;
import androidx.work.impl.model.WorkProgressDao;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.model.WorkTag;
import androidx.work.impl.model.WorkTagDao;
import androidx.work.impl.model.WorkTypeConverters;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@RestrictTo({Scope.LIBRARY_GROUP})
@Database(autoMigrations = {@AutoMigration(from = 13, to = 14), @AutoMigration(from = 14, spec = AutoMigration_14_15.class, to = 15), @AutoMigration(from = 16, to = 17), @AutoMigration(from = 17, to = 18), @AutoMigration(from = 18, to = 19), @AutoMigration(from = 19, spec = AutoMigration_19_20.class, to = 20)}, entities = {Dependency.class, WorkSpec.class, WorkTag.class, SystemIdInfo.class, WorkName.class, WorkProgress.class, Preference.class}, version = 20)
@TypeConverters({Data.class, WorkTypeConverters.class})
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001A\u00020\u0004H&J\b\u0010\u0005\u001A\u00020\u0006H&J\b\u0010\u0007\u001A\u00020\bH&J\b\u0010\t\u001A\u00020\nH&J\b\u0010\u000B\u001A\u00020\fH&J\b\u0010\r\u001A\u00020\u000EH&J\b\u0010\u000F\u001A\u00020\u0010H&J\b\u0010\u0011\u001A\u00020\u0012H&¨\u0006\u0014"}, d2 = {"Landroidx/work/impl/WorkDatabase;", "Landroidx/room/RoomDatabase;", "()V", "dependencyDao", "Landroidx/work/impl/model/DependencyDao;", "preferenceDao", "Landroidx/work/impl/model/PreferenceDao;", "rawWorkInfoDao", "Landroidx/work/impl/model/RawWorkInfoDao;", "systemIdInfoDao", "Landroidx/work/impl/model/SystemIdInfoDao;", "workNameDao", "Landroidx/work/impl/model/WorkNameDao;", "workProgressDao", "Landroidx/work/impl/model/WorkProgressDao;", "workSpecDao", "Landroidx/work/impl/model/WorkSpecDao;", "workTagDao", "Landroidx/work/impl/model/WorkTagDao;", "Companion", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public abstract class WorkDatabase extends RoomDatabase {
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J/\u0010\u000B\u001A\u00020\n2\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\bH\u0007¢\u0006\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Landroidx/work/impl/WorkDatabase$Companion;", "", "Landroid/content/Context;", "context", "Ljava/util/concurrent/Executor;", "queryExecutor", "Landroidx/work/Clock;", "clock", "", "useTestDatabase", "Landroidx/work/impl/WorkDatabase;", "create", "(Landroid/content/Context;Ljava/util/concurrent/Executor;Landroidx/work/Clock;Z)Landroidx/work/impl/WorkDatabase;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @JvmStatic
        @NotNull
        public final WorkDatabase create(@NotNull Context context0, @NotNull Executor executor0, @NotNull Clock clock0, boolean z) {
            Intrinsics.checkNotNullParameter(context0, "context");
            Intrinsics.checkNotNullParameter(executor0, "queryExecutor");
            Intrinsics.checkNotNullParameter(clock0, "clock");
            return z ? ((WorkDatabase)Room.inMemoryDatabaseBuilder(context0, WorkDatabase.class).allowMainThreadQueries().setQueryExecutor(executor0).addCallback(new CleanupCallback(clock0)).addMigrations(new Migration[]{Migration_1_2.INSTANCE}).addMigrations(new Migration[]{new RescheduleMigration(context0, 2, 3)}).addMigrations(new Migration[]{Migration_3_4.INSTANCE}).addMigrations(new Migration[]{Migration_4_5.INSTANCE}).addMigrations(new Migration[]{new RescheduleMigration(context0, 5, 6)}).addMigrations(new Migration[]{Migration_6_7.INSTANCE}).addMigrations(new Migration[]{Migration_7_8.INSTANCE}).addMigrations(new Migration[]{Migration_8_9.INSTANCE}).addMigrations(new Migration[]{new WorkMigration9To10(context0)}).addMigrations(new Migration[]{new RescheduleMigration(context0, 10, 11)}).addMigrations(new Migration[]{Migration_11_12.INSTANCE}).addMigrations(new Migration[]{Migration_12_13.INSTANCE}).addMigrations(new Migration[]{Migration_15_16.INSTANCE}).addMigrations(new Migration[]{Migration_16_17.INSTANCE}).fallbackToDestructiveMigration().build()) : ((WorkDatabase)Room.databaseBuilder(context0, WorkDatabase.class, "androidx.work.workdb").openHelperFactory(new h(context0, 2)).setQueryExecutor(executor0).addCallback(new CleanupCallback(clock0)).addMigrations(new Migration[]{Migration_1_2.INSTANCE}).addMigrations(new Migration[]{new RescheduleMigration(context0, 2, 3)}).addMigrations(new Migration[]{Migration_3_4.INSTANCE}).addMigrations(new Migration[]{Migration_4_5.INSTANCE}).addMigrations(new Migration[]{new RescheduleMigration(context0, 5, 6)}).addMigrations(new Migration[]{Migration_6_7.INSTANCE}).addMigrations(new Migration[]{Migration_7_8.INSTANCE}).addMigrations(new Migration[]{Migration_8_9.INSTANCE}).addMigrations(new Migration[]{new WorkMigration9To10(context0)}).addMigrations(new Migration[]{new RescheduleMigration(context0, 10, 11)}).addMigrations(new Migration[]{Migration_11_12.INSTANCE}).addMigrations(new Migration[]{Migration_12_13.INSTANCE}).addMigrations(new Migration[]{Migration_15_16.INSTANCE}).addMigrations(new Migration[]{Migration_16_17.INSTANCE}).fallbackToDestructiveMigration().build());
        }
    }

    @NotNull
    public static final Companion Companion;

    static {
        WorkDatabase.Companion = new Companion(null);
    }

    @JvmStatic
    @NotNull
    public static final WorkDatabase create(@NotNull Context context0, @NotNull Executor executor0, @NotNull Clock clock0, boolean z) {
        return WorkDatabase.Companion.create(context0, executor0, clock0, z);
    }

    @NotNull
    public abstract DependencyDao dependencyDao();

    @NotNull
    public abstract PreferenceDao preferenceDao();

    @NotNull
    public abstract RawWorkInfoDao rawWorkInfoDao();

    @NotNull
    public abstract SystemIdInfoDao systemIdInfoDao();

    @NotNull
    public abstract WorkNameDao workNameDao();

    @NotNull
    public abstract WorkProgressDao workProgressDao();

    @NotNull
    public abstract WorkSpecDao workSpecDao();

    @NotNull
    public abstract WorkTagDao workTagDao();
}

