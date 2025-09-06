package com.kakao.tistory.domain.usecase;

import com.kakao.android.base.model.ErrorModel;
import com.kakao.tistory.domain.entity.autosave.EditEntryEntity;
import com.kakao.tistory.domain.entity.common.Result.Fail;
import com.kakao.tistory.domain.entity.common.Result.Success;
import com.kakao.tistory.domain.entity.common.Result;
import com.kakao.tistory.domain.repository.AutoSaveRepository.DefaultImpls;
import com.kakao.tistory.domain.repository.AutoSaveRepository;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sd.a;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0010B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\u000E\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\f2\u0006\u0010\t\u001A\u00020\b2\u0006\u0010\u000B\u001A\u00020\nH\u0086B¢\u0006\u0004\b\u000E\u0010\u000F¨\u0006\u0011"}, d2 = {"Lcom/kakao/tistory/domain/usecase/GetLatestEditEntryUseCase;", "", "Lcom/kakao/tistory/domain/usecase/CheckLatestEditEntryUseCase;", "checkLatestEditEntryUseCase", "Lcom/kakao/tistory/domain/repository/AutoSaveRepository;", "autoSaveRepository", "<init>", "(Lcom/kakao/tistory/domain/usecase/CheckLatestEditEntryUseCase;Lcom/kakao/tistory/domain/repository/AutoSaveRepository;)V", "", "blogName", "Lcom/kakao/tistory/domain/usecase/GetLatestEditEntryUseCase$EditType;", "editType", "Lcom/kakao/tistory/domain/entity/common/Result;", "Lcom/kakao/tistory/domain/entity/autosave/EditEntryEntity;", "invoke", "(Ljava/lang/String;Lcom/kakao/tistory/domain/usecase/GetLatestEditEntryUseCase$EditType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "EditType", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class GetLatestEditEntryUseCase {
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/kakao/tistory/domain/usecase/GetLatestEditEntryUseCase$EditType;", "", "ALL", "MODIFY", "NEW", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static enum EditType {
        ALL,
        MODIFY,
        NEW;

        public static final EditType[] a;
        public static final EnumEntries b;

        static {
            EditType.a = arr_getLatestEditEntryUseCase$EditType;
            Intrinsics.checkNotNullParameter(arr_getLatestEditEntryUseCase$EditType, "entries");
            EditType.b = new a(arr_getLatestEditEntryUseCase$EditType);
        }

        @NotNull
        public static EnumEntries getEntries() {
            return EditType.b;
        }
    }

    public final CheckLatestEditEntryUseCase a;
    public final AutoSaveRepository b;

    @Inject
    public GetLatestEditEntryUseCase(@NotNull CheckLatestEditEntryUseCase checkLatestEditEntryUseCase0, @NotNull AutoSaveRepository autoSaveRepository0) {
        Intrinsics.checkNotNullParameter(checkLatestEditEntryUseCase0, "checkLatestEditEntryUseCase");
        Intrinsics.checkNotNullParameter(autoSaveRepository0, "autoSaveRepository");
        super();
        this.a = checkLatestEditEntryUseCase0;
        this.b = autoSaveRepository0;
    }

    public static final Object access$getLocalEntry(GetLatestEditEntryUseCase getLatestEditEntryUseCase0, String s, long v, Continuation continuation0) {
        return DefaultImpls.getAutoSavedPost$default(getLatestEditEntryUseCase0.b, s, Boxing.boxLong(v), null, continuation0, 4, null);
    }

    @Nullable
    public final Object invoke(@NotNull String s, @NotNull EditType getLatestEditEntryUseCase$EditType0, @NotNull Continuation continuation0) {
        GetLatestEditEntryUseCase getLatestEditEntryUseCase0;
        h h0;
        if(continuation0 instanceof h) {
            h0 = (h)continuation0;
            int v = h0.f;
            if((v & 0x80000000) == 0) {
                h0 = new h(this, continuation0);
            }
            else {
                h0.f = v ^ 0x80000000;
            }
        }
        else {
            h0 = new h(this, continuation0);
        }
        Object object0 = h0.d;
        Object object1 = qd.a.getCOROUTINE_SUSPENDED();
        switch(h0.f) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                h0.a = this;
                h0.b = s;
                h0.c = getLatestEditEntryUseCase$EditType0;
                h0.f = 1;
                object0 = this.a.invoke(s, h0);
                if(object0 == object1) {
                    return object1;
                }
                getLatestEditEntryUseCase0 = this;
                goto label_27;
            }
            case 1: {
                getLatestEditEntryUseCase$EditType0 = h0.c;
                s = h0.b;
                getLatestEditEntryUseCase0 = h0.a;
                ResultKt.throwOnFailure(object0);
            label_27:
                if(!(((Result)object0) instanceof Success)) {
                    return ((Result)object0) instanceof Fail ? new Fail(new ErrorModel()) : new Fail(new ErrorModel());
                }
                long v1 = ((Number)((Success)(((Result)object0))).getData()).longValue();
                if((getLatestEditEntryUseCase$EditType0 == EditType.NEW || getLatestEditEntryUseCase$EditType0 == EditType.ALL) && v1 == 0L) {
                    long v2 = ((Number)((Success)(((Result)object0))).getData()).longValue();
                    h0.a = null;
                    h0.b = null;
                    h0.c = null;
                    h0.f = 2;
                    object0 = DefaultImpls.getAutoSavedPost$default(getLatestEditEntryUseCase0.b, s, Boxing.boxLong(v2), null, h0, 4, null);
                    if(object0 != object1) {
                        goto label_50;
                    }
                    return object1;
                }
                if(getLatestEditEntryUseCase$EditType0 != EditType.MODIFY && getLatestEditEntryUseCase$EditType0 != EditType.ALL || v1 == 0L) {
                    return new Fail(new ErrorModel());
                }
                long v3 = ((Number)((Success)(((Result)object0))).getData()).longValue();
                h0.a = null;
                h0.b = null;
                h0.c = null;
                h0.f = 3;
                object0 = DefaultImpls.getAutoSavedPost$default(getLatestEditEntryUseCase0.b, s, Boxing.boxLong(v3), null, h0, 4, null);
                if(object0 == object1) {
                    return object1;
                }
                goto label_55;
            }
            case 2: {
                ResultKt.throwOnFailure(object0);
            label_50:
                if(((EditEntryEntity)object0) == null) {
                    return new Fail(new ErrorModel());
                }
                ((EditEntryEntity)object0).setFromLocal(true);
                return new Success(((EditEntryEntity)object0));
            }
            case 3: {
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ResultKt.throwOnFailure(object0);
    label_55:
        if(((EditEntryEntity)object0) == null) {
            return new Fail(new ErrorModel());
        }
        ((EditEntryEntity)object0).setFromLocal(true);
        return new Success(((EditEntryEntity)object0));
    }
}

