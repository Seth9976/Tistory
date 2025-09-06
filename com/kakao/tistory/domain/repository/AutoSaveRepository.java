package com.kakao.tistory.domain.repository;

import com.kakao.tistory.domain.entity.autosave.EditEntryEntity;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J0\u0010\u0002\u001A\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001A\u00020\u00052\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\u0007H¦@¢\u0006\u0002\u0010\tJ\u0016\u0010\n\u001A\u00020\u000B2\u0006\u0010\u0004\u001A\u00020\u0005H¦@¢\u0006\u0002\u0010\fJ0\u0010\r\u001A\u0004\u0018\u00010\u000E2\u0006\u0010\u0004\u001A\u00020\u00052\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\u0007H¦@¢\u0006\u0002\u0010\tJ\u0016\u0010\u000F\u001A\u00020\u000B2\u0006\u0010\u0010\u001A\u00020\u000EH¦@¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/kakao/tistory/domain/repository/AutoSaveRepository;", "", "checkExistSavedPost", "Lcom/kakao/tistory/domain/entity/autosave/EntryKeyEntity;", "blogName", "", "entryId", "", "draftSequence", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearAll", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAutoSavedPost", "Lcom/kakao/tistory/domain/entity/autosave/EditEntryEntity;", "insertAutoSave", "autoSavePost", "(Lcom/kakao/tistory/domain/entity/autosave/EditEntryEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface AutoSaveRepository {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public static final class DefaultImpls {
        public static Object checkExistSavedPost$default(AutoSaveRepository autoSaveRepository0, String s, Long long0, Long long1, Continuation continuation0, int v, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkExistSavedPost");
            }
            if((v & 2) != 0) {
                long0 = null;
            }
            if((v & 4) != 0) {
                long1 = null;
            }
            return autoSaveRepository0.checkExistSavedPost(s, long0, long1, continuation0);
        }

        public static Object getAutoSavedPost$default(AutoSaveRepository autoSaveRepository0, String s, Long long0, Long long1, Continuation continuation0, int v, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAutoSavedPost");
            }
            if((v & 2) != 0) {
                long0 = null;
            }
            if((v & 4) != 0) {
                long1 = null;
            }
            return autoSaveRepository0.getAutoSavedPost(s, long0, long1, continuation0);
        }
    }

    @Nullable
    Object checkExistSavedPost(@NotNull String arg1, @Nullable Long arg2, @Nullable Long arg3, @NotNull Continuation arg4);

    @Nullable
    Object clearAll(@NotNull String arg1, @NotNull Continuation arg2);

    @Nullable
    Object getAutoSavedPost(@NotNull String arg1, @Nullable Long arg2, @Nullable Long arg3, @NotNull Continuation arg4);

    @Nullable
    Object insertAutoSave(@NotNull EditEntryEntity arg1, @NotNull Continuation arg2);
}

