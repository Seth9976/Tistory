package androidx.work.impl.model;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Dao
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001A\u00020\u0004H\'J\u0016\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001A\u00020\u0004H\'J\u0010\u0010\u0007\u001A\u00020\b2\u0006\u0010\u0005\u001A\u00020\u0004H\'J\u0010\u0010\t\u001A\u00020\b2\u0006\u0010\u0005\u001A\u00020\u0004H\'J\u0010\u0010\n\u001A\u00020\u000B2\u0006\u0010\f\u001A\u00020\rH\'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000EÀ\u0006\u0001"}, d2 = {"Landroidx/work/impl/model/DependencyDao;", "", "getDependentWorkIds", "", "", "id", "getPrerequisites", "hasCompletedAllPrerequisites", "", "hasDependents", "insertDependency", "", "dependency", "Landroidx/work/impl/model/Dependency;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface DependencyDao {
    @Query("SELECT work_spec_id FROM dependency WHERE prerequisite_id=:id")
    @NotNull
    List getDependentWorkIds(@NotNull String arg1);

    @Query("SELECT prerequisite_id FROM dependency WHERE work_spec_id=:id")
    @NotNull
    List getPrerequisites(@NotNull String arg1);

    @Query("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=:id AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)")
    boolean hasCompletedAllPrerequisites(@NotNull String arg1);

    @Query("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=:id")
    boolean hasDependents(@NotNull String arg1);

    @Insert(onConflict = 5)
    void insertDependency(@NotNull Dependency arg1);
}

