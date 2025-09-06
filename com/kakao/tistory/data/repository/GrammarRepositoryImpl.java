package com.kakao.tistory.data.repository;

import com.kakao.android.base.model.ErrorModel;
import com.kakao.tistory.data.service.GrammarService;
import com.kakao.tistory.domain.ErrorStatusKt;
import com.kakao.tistory.domain.entity.common.Result.Fail;
import com.kakao.tistory.domain.entity.common.Result.Success;
import com.kakao.tistory.domain.repository.GrammarRepository;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.MutableSharedFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001A\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001E\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\b\u001A\u00020\u0007H\u0096@¢\u0006\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Lcom/kakao/tistory/data/repository/GrammarRepositoryImpl;", "Lcom/kakao/tistory/data/repository/BaseRepository;", "Lcom/kakao/tistory/domain/repository/GrammarRepository;", "Lcom/kakao/tistory/data/service/GrammarService;", "grammarService", "<init>", "(Lcom/kakao/tistory/data/service/GrammarService;)V", "", "query", "Lcom/kakao/tistory/domain/entity/common/Result;", "Lcom/kakao/tistory/domain/entity/GrammarCheck;", "postGrammarCheck", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nGrammarRepositoryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GrammarRepositoryImpl.kt\ncom/kakao/tistory/data/repository/GrammarRepositoryImpl\n+ 2 BaseRepository.kt\ncom/kakao/tistory/data/repository/BaseRepository\n+ 3 BaseRepository.kt\ncom/kakao/tistory/data/repository/BaseRepository$checkError$2\n*L\n1#1,18:1\n26#2,27:19\n53#2:47\n39#3:46\n*S KotlinDebug\n*F\n+ 1 GrammarRepositoryImpl.kt\ncom/kakao/tistory/data/repository/GrammarRepositoryImpl\n*L\n16#1:19,27\n16#1:47\n16#1:46\n*E\n"})
public final class GrammarRepositoryImpl extends BaseRepository implements GrammarRepository {
    public final GrammarService a;

    @Inject
    public GrammarRepositoryImpl(@NotNull GrammarService grammarService0) {
        Intrinsics.checkNotNullParameter(grammarService0, "grammarService");
        super();
        this.a = grammarService0;
    }

    @Override  // com.kakao.tistory.domain.repository.GrammarRepository
    @Nullable
    public Object postGrammarCheck(@NotNull String s, @NotNull Continuation continuation0) {
        BaseRepository baseRepository0;
        q1 q10;
        if(continuation0 instanceof q1) {
            q10 = (q1)continuation0;
            int v = q10.d;
            if((v & 0x80000000) == 0) {
                q10 = new q1(this, continuation0);
            }
            else {
                q10.d = v ^ 0x80000000;
            }
        }
        else {
            q10 = new q1(this, continuation0);
        }
        Object object0 = q10.b;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(q10.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    q10.a = this;
                    q10.d = 1;
                    object0 = this.a.postGrammarErrors(s, q10);
                }
                catch(CancellationException cancellationException0) {
                    baseRepository0 = this;
                    q10.a = baseRepository0;
                    q10.d = 2;
                    return baseRepository0.sendError("coroutine cancel", cancellationException0, q10) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    baseRepository0 = this;
                    goto label_47;
                }
                if(object0 == object1) {
                    return object1;
                }
                baseRepository0 = this;
                break;
            }
            case 1: {
                baseRepository0 = (BaseRepository)q10.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    q10.a = baseRepository0;
                    q10.d = 2;
                    return baseRepository0.sendError("coroutine cancel", cancellationException0, q10) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    goto label_47;
                }
            }
            case 2: {
                baseRepository0 = (BaseRepository)q10.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(baseRepository0.createCoroutineCancelErrorModel());
            }
            case 3: {
                baseRepository0 = (BaseRepository)q10.a;
                ResultKt.throwOnFailure(object0);
                goto label_52;
            }
            case 4: 
            case 5: {
                ErrorModel errorModel0 = (ErrorModel)q10.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(errorModel0);
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            return new Success(object0);
        }
        catch(CancellationException cancellationException0) {
            q10.a = baseRepository0;
            q10.d = 2;
            return baseRepository0.sendError("coroutine cancel", cancellationException0, q10) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
        }
        catch(Throwable throwable0) {
        }
    label_47:
        q10.a = baseRepository0;
        q10.d = 3;
        object0 = baseRepository0.createErrorModel(throwable0, q10);
        if(object0 == object1) {
            return object1;
        }
    label_52:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository0.getThrowableRepository().getSessionThrowable();
            q10.a = (ErrorModel)object0;
            q10.d = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), q10) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository0.getThrowableRepository().getInspectionThrowable();
            q10.a = (ErrorModel)object0;
            q10.d = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), q10) == object1) {
                return object1;
            }
        }
        return new Fail(((ErrorModel)object0));
    }
}

