package com.kakao.tistory.data.database.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.kakao.tistory.data.database.entity.AutoSavedModel;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Dao
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u000E\u0010\u0002\u001A\u00020\u0003H§@¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001A\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001A\u00020\bH§@¢\u0006\u0002\u0010\tJ\"\u0010\u0005\u001A\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001A\u00020\b2\b\b\u0002\u0010\n\u001A\u00020\u000BH§@¢\u0006\u0002\u0010\fJ\"\u0010\r\u001A\u0004\u0018\u00010\u000E2\u0006\u0010\u0007\u001A\u00020\b2\b\b\u0002\u0010\n\u001A\u00020\u000BH§@¢\u0006\u0002\u0010\fJ\u0016\u0010\u000F\u001A\u00020\u00032\u0006\u0010\u0010\u001A\u00020\u000EH§@¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/kakao/tistory/data/database/dao/AutoSaveDao;", "", "clearAll", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "existSavedPost", "Lcom/kakao/tistory/domain/entity/autosave/EntryKeyEntity;", "blogName", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "entryId", "", "(Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAutoSavedPost", "Lcom/kakao/tistory/data/database/entity/AutoSavedModel;", "insertAutoSavedPost", "post", "(Lcom/kakao/tistory/data/database/entity/AutoSavedModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface AutoSaveDao {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public static final class DefaultImpls {
        public static Object existSavedPost$default(AutoSaveDao autoSaveDao0, String s, long v, Continuation continuation0, int v1, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: existSavedPost");
            }
            if((v1 & 2) != 0) {
                v = 0L;
            }
            return autoSaveDao0.existSavedPost(s, v, continuation0);
        }

        public static Object getAutoSavedPost$default(AutoSaveDao autoSaveDao0, String s, long v, Continuation continuation0, int v1, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAutoSavedPost");
            }
            if((v1 & 2) != 0) {
                v = 0L;
            }
            return autoSaveDao0.getAutoSavedPost(s, v, continuation0);
        }
    }

    @Query("DELETE FROM auto_save_table")
    @Nullable
    Object clearAll(@NotNull Continuation arg1);

    @Query("SELECT blogName, entryId, draftSequence FROM auto_save_table WHERE blogName = :blogName AND entryId =:entryId LIMIT 1")
    @Nullable
    Object existSavedPost(@NotNull String arg1, long arg2, @NotNull Continuation arg3);

    @Query("SELECT blogName, entryId, draftSequence FROM auto_save_table WHERE blogName = :blogName LIMIT 1")
    @Nullable
    Object existSavedPost(@NotNull String arg1, @NotNull Continuation arg2);

    @Query("SELECT * FROM auto_save_table WHERE blogName = :blogName AND entryId =:entryId LIMIT 1")
    @Nullable
    Object getAutoSavedPost(@NotNull String arg1, long arg2, @NotNull Continuation arg3);

    @Insert(onConflict = 1)
    @Nullable
    Object insertAutoSavedPost(@NotNull AutoSavedModel arg1, @NotNull Continuation arg2);
}

