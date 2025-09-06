package androidx.work.impl.model;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.work.Data;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@RestrictTo({Scope.LIBRARY_GROUP})
@Dao
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0005H\'J\b\u0010\u0006\u001A\u00020\u0003H\'J\u0012\u0010\u0007\u001A\u0004\u0018\u00010\b2\u0006\u0010\u0004\u001A\u00020\u0005H\'J\u0010\u0010\t\u001A\u00020\u00032\u0006\u0010\n\u001A\u00020\u000BH\'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Landroidx/work/impl/model/WorkProgressDao;", "", "delete", "", "workSpecId", "", "deleteAll", "getProgressForWorkSpecId", "Landroidx/work/Data;", "insert", "progress", "Landroidx/work/impl/model/WorkProgress;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface WorkProgressDao {
    @Query("DELETE from WorkProgress where work_spec_id=:workSpecId")
    void delete(@NotNull String arg1);

    @Query("DELETE FROM WorkProgress")
    void deleteAll();

    @Query("SELECT progress FROM WorkProgress WHERE work_spec_id=:workSpecId")
    @Nullable
    Data getProgressForWorkSpecId(@NotNull String arg1);

    @Insert(onConflict = 1)
    void insert(@NotNull WorkProgress arg1);
}

