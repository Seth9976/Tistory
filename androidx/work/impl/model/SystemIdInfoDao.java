package androidx.work.impl.model;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Dao
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001A\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001A\u00020\u0005H\u0016J\u001A\u0010\u0002\u001A\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001A\u00020\u00072\u0006\u0010\b\u001A\u00020\tH\'J\u000E\u0010\n\u001A\b\u0012\u0004\u0012\u00020\u00070\u000BH\'J\u0010\u0010\f\u001A\u00020\r2\u0006\u0010\u000E\u001A\u00020\u0003H\'J\u0010\u0010\u000F\u001A\u00020\r2\u0006\u0010\u0004\u001A\u00020\u0005H\u0016J\u0010\u0010\u000F\u001A\u00020\r2\u0006\u0010\u0006\u001A\u00020\u0007H\'J\u0018\u0010\u000F\u001A\u00020\r2\u0006\u0010\u0006\u001A\u00020\u00072\u0006\u0010\b\u001A\u00020\tH\'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0003"}, d2 = {"Landroidx/work/impl/model/SystemIdInfoDao;", "", "getSystemIdInfo", "Landroidx/work/impl/model/SystemIdInfo;", "id", "Landroidx/work/impl/model/WorkGenerationalId;", "workSpecId", "", "generation", "", "getWorkSpecIds", "", "insertSystemIdInfo", "", "systemIdInfo", "removeSystemIdInfo", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface SystemIdInfoDao {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public static final class DefaultImpls {
        @Deprecated
        @Nullable
        public static SystemIdInfo getSystemIdInfo(@NotNull SystemIdInfoDao systemIdInfoDao0, @NotNull WorkGenerationalId workGenerationalId0) {
            Intrinsics.checkNotNullParameter(workGenerationalId0, "id");
            return systemIdInfoDao0.super.getSystemIdInfo(workGenerationalId0);
        }

        @Deprecated
        public static void removeSystemIdInfo(@NotNull SystemIdInfoDao systemIdInfoDao0, @NotNull WorkGenerationalId workGenerationalId0) {
            Intrinsics.checkNotNullParameter(workGenerationalId0, "id");
            systemIdInfoDao0.super.removeSystemIdInfo(workGenerationalId0);
        }
    }

    @Nullable
    default SystemIdInfo getSystemIdInfo(@NotNull WorkGenerationalId workGenerationalId0) {
        Intrinsics.checkNotNullParameter(workGenerationalId0, "id");
        return this.getSystemIdInfo(workGenerationalId0.getWorkSpecId(), workGenerationalId0.getGeneration());
    }

    @Query("SELECT * FROM SystemIdInfo WHERE work_spec_id=:workSpecId AND generation=:generation")
    @Nullable
    SystemIdInfo getSystemIdInfo(@NotNull String arg1, int arg2);

    @Query("SELECT DISTINCT work_spec_id FROM SystemIdInfo")
    @NotNull
    List getWorkSpecIds();

    @Insert(onConflict = 1)
    void insertSystemIdInfo(@NotNull SystemIdInfo arg1);

    default void removeSystemIdInfo(@NotNull WorkGenerationalId workGenerationalId0) {
        Intrinsics.checkNotNullParameter(workGenerationalId0, "id");
        this.removeSystemIdInfo(workGenerationalId0.getWorkSpecId(), workGenerationalId0.getGeneration());
    }

    @Query("DELETE FROM SystemIdInfo where work_spec_id=:workSpecId")
    void removeSystemIdInfo(@NotNull String arg1);

    @Query("DELETE FROM SystemIdInfo where work_spec_id=:workSpecId AND generation=:generation")
    void removeSystemIdInfo(@NotNull String arg1, int arg2);
}

