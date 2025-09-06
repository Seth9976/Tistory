package androidx.work.impl.model;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Dao
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0005H\'J\u0016\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\u0004\u001A\u00020\u0005H\'J\u0016\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\t\u001A\u00020\u0005H\'J\u0010\u0010\n\u001A\u00020\u00032\u0006\u0010\u000B\u001A\u00020\fH\'J\u001E\u0010\r\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\f\u0010\u000E\u001A\b\u0012\u0004\u0012\u00020\u00050\u000FH\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0003"}, d2 = {"Landroidx/work/impl/model/WorkTagDao;", "", "deleteByWorkSpecId", "", "id", "", "getTagsForWorkSpecId", "", "getWorkSpecIdsWithTag", "tag", "insert", "workTag", "Landroidx/work/impl/model/WorkTag;", "insertTags", "tags", "", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nWorkTagDao.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkTagDao.kt\nandroidx/work/impl/model/WorkTagDao\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,67:1\n1855#2,2:68\n*S KotlinDebug\n*F\n+ 1 WorkTagDao.kt\nandroidx/work/impl/model/WorkTagDao\n*L\n64#1:68,2\n*E\n"})
public interface WorkTagDao {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public static final class DefaultImpls {
        @Deprecated
        public static void insertTags(@NotNull WorkTagDao workTagDao0, @NotNull String s, @NotNull Set set0) {
            Intrinsics.checkNotNullParameter(s, "id");
            Intrinsics.checkNotNullParameter(set0, "tags");
            workTagDao0.super.insertTags(s, set0);
        }
    }

    @Query("DELETE FROM worktag WHERE work_spec_id=:id")
    void deleteByWorkSpecId(@NotNull String arg1);

    @Query("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=:id")
    @NotNull
    List getTagsForWorkSpecId(@NotNull String arg1);

    @Query("SELECT work_spec_id FROM worktag WHERE tag=:tag")
    @NotNull
    List getWorkSpecIdsWithTag(@NotNull String arg1);

    @Insert(onConflict = 5)
    void insert(@NotNull WorkTag arg1);

    default void insertTags(@NotNull String s, @NotNull Set set0) {
        Intrinsics.checkNotNullParameter(s, "id");
        Intrinsics.checkNotNullParameter(set0, "tags");
        for(Object object0: set0) {
            this.insert(new WorkTag(((String)object0), s));
        }
    }
}

