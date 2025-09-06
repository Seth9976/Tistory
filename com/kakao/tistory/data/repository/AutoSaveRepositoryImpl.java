package com.kakao.tistory.data.repository;

import com.kakao.tistory.data.database.AutoSaveDatabase;
import com.kakao.tistory.data.database.dao.AutoSaveDao;
import com.kakao.tistory.data.database.entity.AutoSavedModel;
import com.kakao.tistory.data.mapper.AutoSavedMapper;
import com.kakao.tistory.domain.entity.autosave.EditEntryEntity;
import com.kakao.tistory.domain.repository.AutoSaveRepository;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ.\u0010\u0011\u001A\u0004\u0018\u00010\u00102\u0006\u0010\f\u001A\u00020\u000B2\b\u0010\u000E\u001A\u0004\u0018\u00010\r2\b\u0010\u000F\u001A\u0004\u0018\u00010\rH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J.\u0010\u0013\u001A\u0004\u0018\u00010\u00062\u0006\u0010\f\u001A\u00020\u000B2\b\u0010\u000E\u001A\u0004\u0018\u00010\r2\b\u0010\u000F\u001A\u0004\u0018\u00010\rH\u0096@¢\u0006\u0004\b\u0013\u0010\u0012J\u0018\u0010\u0014\u001A\u00020\b2\u0006\u0010\f\u001A\u00020\u000BH\u0096@¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/kakao/tistory/data/repository/AutoSaveRepositoryImpl;", "Lcom/kakao/tistory/domain/repository/AutoSaveRepository;", "Lcom/kakao/tistory/data/mapper/AutoSavedMapper;", "mapper", "<init>", "(Lcom/kakao/tistory/data/mapper/AutoSavedMapper;)V", "Lcom/kakao/tistory/domain/entity/autosave/EditEntryEntity;", "autoSavePost", "", "insertAutoSave", "(Lcom/kakao/tistory/domain/entity/autosave/EditEntryEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "blogName", "", "entryId", "draftSequence", "Lcom/kakao/tistory/domain/entity/autosave/EntryKeyEntity;", "checkExistSavedPost", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAutoSavedPost", "clearAll", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAutoSaveRepositoryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutoSaveRepositoryImpl.kt\ncom/kakao/tistory/data/repository/AutoSaveRepositoryImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,40:1\n1#2:41\n*E\n"})
public final class AutoSaveRepositoryImpl implements AutoSaveRepository {
    public final AutoSavedMapper a;
    public final AutoSaveDao b;

    @Inject
    public AutoSaveRepositoryImpl(@NotNull AutoSavedMapper autoSavedMapper0) {
        Intrinsics.checkNotNullParameter(autoSavedMapper0, "mapper");
        super();
        this.a = autoSavedMapper0;
        this.b = AutoSaveDatabase.Companion.getInstance().getAutoSaveDao();
    }

    @Override  // com.kakao.tistory.domain.repository.AutoSaveRepository
    @Nullable
    public Object checkExistSavedPost(@NotNull String s, @Nullable Long long0, @Nullable Long long1, @NotNull Continuation continuation0) {
        return long0 == null ? this.b.existSavedPost(s, continuation0) : this.b.existSavedPost(s, ((long)long0), continuation0);
    }

    @Override  // com.kakao.tistory.domain.repository.AutoSaveRepository
    @Nullable
    public Object clearAll(@NotNull String s, @NotNull Continuation continuation0) {
        Object object0 = this.b.clearAll(continuation0);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    @Override  // com.kakao.tistory.domain.repository.AutoSaveRepository
    @Nullable
    public Object getAutoSavedPost(@NotNull String s, @Nullable Long long0, @Nullable Long long1, @NotNull Continuation continuation0) {
        AutoSaveRepositoryImpl autoSaveRepositoryImpl0;
        r r0;
        if(continuation0 instanceof r) {
            r0 = (r)continuation0;
            int v = r0.d;
            if((v & 0x80000000) == 0) {
                r0 = new r(this, continuation0);
            }
            else {
                r0.d = v ^ 0x80000000;
            }
        }
        else {
            r0 = new r(this, continuation0);
        }
        Object object0 = r0.b;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(r0.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                r0.a = this;
                r0.d = 1;
                object0 = this.b.getAutoSavedPost(s, (long0 == null ? 0L : ((long)long0)), r0);
                if(object0 == object1) {
                    return object1;
                }
                autoSaveRepositoryImpl0 = this;
                break;
            }
            case 1: {
                autoSaveRepositoryImpl0 = r0.a;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return ((AutoSavedModel)object0) != null ? autoSaveRepositoryImpl0.a.mapToEntity(((AutoSavedModel)object0)) : null;
    }

    @Override  // com.kakao.tistory.domain.repository.AutoSaveRepository
    @Nullable
    public Object insertAutoSave(@NotNull EditEntryEntity editEntryEntity0, @NotNull Continuation continuation0) {
        AutoSavedModel autoSavedModel0 = this.a.mapToModel(editEntryEntity0);
        Object object0 = this.b.insertAutoSavedPost(autoSavedModel0, continuation0);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }
}

