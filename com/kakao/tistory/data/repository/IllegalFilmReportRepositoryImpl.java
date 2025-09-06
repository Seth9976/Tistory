package com.kakao.tistory.data.repository;

import com.kakao.android.base.model.ErrorModel;
import com.kakao.tistory.data.model.IllegalFilmReportContent;
import com.kakao.tistory.data.model.IllegalFilmReportContentList;
import com.kakao.tistory.data.service.IllegalFilmReportService;
import com.kakao.tistory.domain.ErrorStatusKt;
import com.kakao.tistory.domain.entity.common.Result.Fail;
import com.kakao.tistory.domain.entity.common.Result.Success;
import com.kakao.tistory.domain.repository.IllegalFilmReportRepository;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.k;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.MutableSharedFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001A\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u008A\u0001\u0010\u0018\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00162\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\t\u001A\u00020\u00072\u0006\u0010\u000B\u001A\u00020\n2\b\u0010\f\u001A\u0004\u0018\u00010\n2\b\u0010\r\u001A\u0004\u0018\u00010\n2\b\u0010\u000E\u001A\u0004\u0018\u00010\u00072\b\u0010\u000F\u001A\u0004\u0018\u00010\u00072\b\u0010\u0010\u001A\u0004\u0018\u00010\u00072\b\u0010\u0011\u001A\u0004\u0018\u00010\u00072\b\u0010\u0012\u001A\u0004\u0018\u00010\u00072\b\u0010\u0013\u001A\u0004\u0018\u00010\u00072\b\u0010\u0015\u001A\u0004\u0018\u00010\u0014H\u0096@¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001A"}, d2 = {"Lcom/kakao/tistory/data/repository/IllegalFilmReportRepositoryImpl;", "Lcom/kakao/tistory/data/repository/BaseRepository;", "Lcom/kakao/tistory/domain/repository/IllegalFilmReportRepository;", "Lcom/kakao/tistory/data/service/IllegalFilmReportService;", "illegalFilmReportService", "<init>", "(Lcom/kakao/tistory/data/service/IllegalFilmReportService;)V", "", "baseUrl", "contentType", "", "blogId", "entryId", "commentId", "userKey", "userName", "nickname", "description", "imageUrl", "viewUrl", "", "isFlash", "Lcom/kakao/tistory/domain/entity/common/Result;", "Lcom/kakao/tistory/domain/entity/IllegalFilmReportUrl;", "getIllegalFilmReportUrl", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nIllegalFilmReportRepositoryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IllegalFilmReportRepositoryImpl.kt\ncom/kakao/tistory/data/repository/IllegalFilmReportRepositoryImpl\n+ 2 BaseRepository.kt\ncom/kakao/tistory/data/repository/BaseRepository\n+ 3 BaseRepository.kt\ncom/kakao/tistory/data/repository/BaseRepository$checkError$2\n*L\n1#1,52:1\n26#2,27:53\n53#2:81\n39#3:80\n*S KotlinDebug\n*F\n+ 1 IllegalFilmReportRepositoryImpl.kt\ncom/kakao/tistory/data/repository/IllegalFilmReportRepositoryImpl\n*L\n29#1:53,27\n29#1:81\n29#1:80\n*E\n"})
public final class IllegalFilmReportRepositoryImpl extends BaseRepository implements IllegalFilmReportRepository {
    public final IllegalFilmReportService a;

    @Inject
    public IllegalFilmReportRepositoryImpl(@NotNull IllegalFilmReportService illegalFilmReportService0) {
        Intrinsics.checkNotNullParameter(illegalFilmReportService0, "illegalFilmReportService");
        super();
        this.a = illegalFilmReportService0;
    }

    @Override  // com.kakao.tistory.domain.repository.IllegalFilmReportRepository
    @Nullable
    public Object getIllegalFilmReportUrl(@NotNull String s, @NotNull String s1, long v, @Nullable Long long0, @Nullable Long long1, @Nullable String s2, @Nullable String s3, @Nullable String s4, @Nullable String s5, @Nullable String s6, @Nullable String s7, @Nullable Boolean boolean0, @NotNull Continuation continuation0) {
        BaseRepository baseRepository1;
        a2 a20;
        if(continuation0 instanceof a2) {
            a20 = (a2)continuation0;
            int v1 = a20.d;
            if((v1 & 0x80000000) == 0) {
                a20 = new a2(this, continuation0);
            }
            else {
                a20.d = v1 ^ 0x80000000;
            }
        }
        else {
            a20 = new a2(this, continuation0);
        }
        Object object0 = a20.b;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(a20.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    IllegalFilmReportContentList illegalFilmReportContentList0 = new IllegalFilmReportContentList(k.listOf(new IllegalFilmReportContent(null, 0, null, s1, v, long0, long1, null, s2, s3, s4, s5, s6, s7, boolean0, 0x87, null)));
                    a20.a = this;
                    a20.d = 1;
                    object0 = this.a.getIllegalFilmReportUrl(s, illegalFilmReportContentList0, a20);
                }
                catch(CancellationException cancellationException0) {
                    baseRepository1 = this;
                    a20.a = baseRepository1;
                    a20.d = 2;
                    return baseRepository1.sendError("coroutine cancel", cancellationException0, a20) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    baseRepository1 = this;
                    goto label_48;
                }
                if(object0 == object1) {
                    return object1;
                }
                baseRepository1 = this;
                break;
            }
            case 1: {
                baseRepository1 = (BaseRepository)a20.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    a20.a = baseRepository1;
                    a20.d = 2;
                    return baseRepository1.sendError("coroutine cancel", cancellationException0, a20) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    goto label_48;
                }
            }
            case 2: {
                BaseRepository baseRepository0 = (BaseRepository)a20.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(baseRepository0.createCoroutineCancelErrorModel());
            }
            case 3: {
                baseRepository1 = (BaseRepository)a20.a;
                ResultKt.throwOnFailure(object0);
                goto label_53;
            }
            case 4: 
            case 5: {
                ErrorModel errorModel0 = (ErrorModel)a20.a;
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
            a20.a = baseRepository1;
            a20.d = 2;
            return baseRepository1.sendError("coroutine cancel", cancellationException0, a20) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
        }
        catch(Throwable throwable0) {
        }
    label_48:
        a20.a = baseRepository1;
        a20.d = 3;
        object0 = baseRepository1.createErrorModel(throwable0, a20);
        if(object0 == object1) {
            return object1;
        }
    label_53:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository1.getThrowableRepository().getSessionThrowable();
            a20.a = (ErrorModel)object0;
            a20.d = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), a20) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository1.getThrowableRepository().getInspectionThrowable();
            a20.a = (ErrorModel)object0;
            a20.d = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), a20) == object1) {
                return object1;
            }
        }
        return new Fail(((ErrorModel)object0));
    }
}

