package com.kakao.tistory.data.repository;

import com.kakao.android.base.model.ErrorModel;
import com.kakao.tistory.data.service.GuestbookService.DefaultImpls;
import com.kakao.tistory.data.service.GuestbookService;
import com.kakao.tistory.domain.ErrorStatusKt;
import com.kakao.tistory.domain.entity.PinComment;
import com.kakao.tistory.domain.entity.common.ItemModel;
import com.kakao.tistory.domain.entity.common.Result.Fail;
import com.kakao.tistory.domain.entity.common.Result.Success;
import com.kakao.tistory.domain.repository.GuestbookRepository;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.MutableSharedFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u00A2\u0006\u0004\b\u0005\u0010\u0006J8\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\u000F0\u000E2\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\t\u001A\u00020\u00072\b\u0010\u000B\u001A\u0004\u0018\u00010\n2\u0006\u0010\r\u001A\u00020\fH\u0096@\u00A2\u0006\u0004\b\u0010\u0010\u0011JB\u0010\u0018\u001A\b\u0012\u0004\u0012\u00020\u00170\u000E2\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\u0012\u001A\u00020\u00072\b\u0010\u0013\u001A\u0004\u0018\u00010\n2\b\u0010\u0014\u001A\u0004\u0018\u00010\n2\u0006\u0010\u0016\u001A\u00020\u0015H\u0096@\u00A2\u0006\u0004\b\u0018\u0010\u0019J@\u0010\u001A\u001A\b\u0012\u0004\u0012\u00020\u00170\u000E2\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\u000B\u001A\u00020\n2\u0006\u0010\u0012\u001A\u00020\u00072\b\u0010\u0014\u001A\u0004\u0018\u00010\n2\u0006\u0010\u0016\u001A\u00020\u0015H\u0096@\u00A2\u0006\u0004\b\u001A\u0010\u001BJ&\u0010\u001D\u001A\b\u0012\u0004\u0012\u00020\u001C0\u000E2\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\u000B\u001A\u00020\nH\u0096@\u00A2\u0006\u0004\b\u001D\u0010\u001EJ8\u0010!\u001A\b\u0012\u0004\u0012\u00020\u001C0\u000E2\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\u001F\u001A\u00020\u00072\b\u0010 \u001A\u0004\u0018\u00010\u00072\u0006\u0010\u000B\u001A\u00020\nH\u0096@\u00A2\u0006\u0004\b!\u0010\"J \u0010$\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u000E2\u0006\u0010\b\u001A\u00020\u0007H\u0096@\u00A2\u0006\u0004\b$\u0010%J&\u0010&\u001A\b\u0012\u0004\u0012\u00020\u001C0\u000E2\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\u000B\u001A\u00020\nH\u0096@\u00A2\u0006\u0004\b&\u0010\u001EJ&\u0010\'\u001A\b\u0012\u0004\u0012\u00020\u001C0\u000E2\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\u000B\u001A\u00020\nH\u0096@\u00A2\u0006\u0004\b\'\u0010\u001EJ \u0010(\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u000E2\u0006\u0010\b\u001A\u00020\u0007H\u0096@\u00A2\u0006\u0004\b(\u0010%\u00A8\u0006)"}, d2 = {"Lcom/kakao/tistory/data/repository/GuestbookRepositoryImpl;", "Lcom/kakao/tistory/data/repository/BaseRepository;", "Lcom/kakao/tistory/domain/repository/GuestbookRepository;", "Lcom/kakao/tistory/data/service/GuestbookService;", "guestbookService", "<init>", "(Lcom/kakao/tistory/data/service/GuestbookService;)V", "", "blogName", "listMode", "", "commentId", "", "resultSize", "Lcom/kakao/tistory/domain/entity/common/Result;", "Lcom/kakao/tistory/domain/entity/common/CommentItemListModel;", "getGuestbookList", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "content", "parentCommentId", "mentionCommentId", "", "secret", "Lcom/kakao/tistory/domain/entity/CommentItemType$CommentItem;", "postGuestbook", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "putGuestbook", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/Long;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "deleteGuestbook", "(Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reasonCode", "reasonMention", "reportGuestbook", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/kakao/tistory/domain/entity/PinComment;", "getPinGuestbook", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pinGuestBookComment", "unpinGuestBookComment", "getGuestBookPinComment", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nGuestbookRepositoryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GuestbookRepositoryImpl.kt\ncom/kakao/tistory/data/repository/GuestbookRepositoryImpl\n+ 2 BaseRepository.kt\ncom/kakao/tistory/data/repository/BaseRepository\n+ 3 BaseRepository.kt\ncom/kakao/tistory/data/repository/BaseRepository$checkError$2\n*L\n1#1,106:1\n26#2,27:107\n53#2:135\n26#2,27:136\n53#2:164\n35#2:165\n26#2,27:166\n53#2:194\n35#2:195\n26#2,27:196\n53#2:224\n35#2:225\n26#2,27:226\n53#2:254\n35#2:255\n26#2,27:256\n53#2:284\n35#2:285\n26#2,27:286\n53#2:314\n35#2:315\n26#2,27:316\n53#2:344\n35#2:345\n26#2,27:346\n53#2:374\n35#2:375\n39#3:134\n39#3:163\n39#3:193\n39#3:223\n39#3:253\n39#3:283\n39#3:313\n39#3:343\n39#3:373\n*S KotlinDebug\n*F\n+ 1 GuestbookRepositoryImpl.kt\ncom/kakao/tistory/data/repository/GuestbookRepositoryImpl\n*L\n24#1:107,27\n24#1:135\n41#1:136,27\n41#1:164\n41#1:165\n59#1:166,27\n59#1:194\n59#1:195\n66#1:196,27\n66#1:224\n66#1:225\n75#1:226,27\n75#1:254\n75#1:255\n86#1:256,27\n86#1:284\n86#1:285\n93#1:286,27\n93#1:314\n93#1:315\n100#1:316,27\n100#1:344\n100#1:345\n104#1:346,27\n104#1:374\n104#1:375\n24#1:134\n41#1:163\n59#1:193\n66#1:223\n75#1:253\n86#1:283\n93#1:313\n100#1:343\n104#1:373\n*E\n"})
public final class GuestbookRepositoryImpl extends BaseRepository implements GuestbookRepository {
    public final GuestbookService a;

    @Inject
    public GuestbookRepositoryImpl(@NotNull GuestbookService guestbookService0) {
        Intrinsics.checkNotNullParameter(guestbookService0, "guestbookService");
        super();
        this.a = guestbookService0;
    }

    @Override  // com.kakao.tistory.domain.repository.GuestbookRepository
    @Nullable
    public Object deleteGuestbook(@NotNull String s, long v, @NotNull Continuation continuation0) {
        BaseRepository baseRepository1;
        r1 r10;
        if(continuation0 instanceof r1) {
            r10 = (r1)continuation0;
            int v1 = r10.d;
            if((v1 & 0x80000000) == 0) {
                r10 = new r1(this, continuation0);
            }
            else {
                r10.d = v1 ^ 0x80000000;
            }
        }
        else {
            r10 = new r1(this, continuation0);
        }
        Object object0 = r10.b;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(r10.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    r10.a = this;
                    r10.d = 1;
                    if(DefaultImpls.deleteGuestbook$default(this.a, s, v, null, r10, 4, null) == object1) {
                        return object1;
                    }
                    baseRepository1 = this;
                    break;
                }
                catch(CancellationException cancellationException0) {
                    baseRepository1 = this;
                    r10.a = baseRepository1;
                    r10.d = 2;
                    return baseRepository1.sendError("coroutine cancel", cancellationException0, r10) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    baseRepository1 = this;
                    goto label_46;
                }
                return object1;
            }
            case 1: {
                baseRepository1 = (BaseRepository)r10.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    r10.a = baseRepository1;
                    r10.d = 2;
                    return baseRepository1.sendError("coroutine cancel", cancellationException0, r10) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    goto label_46;
                }
            }
            case 2: {
                BaseRepository baseRepository0 = (BaseRepository)r10.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(baseRepository0.createCoroutineCancelErrorModel());
            }
            case 3: {
                baseRepository1 = (BaseRepository)r10.a;
                ResultKt.throwOnFailure(object0);
                goto label_51;
            }
            case 4: 
            case 5: {
                ErrorModel errorModel0 = (ErrorModel)r10.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(errorModel0);
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            return new Success(Unit.INSTANCE);
        }
        catch(CancellationException cancellationException0) {
            r10.a = baseRepository1;
            r10.d = 2;
            return baseRepository1.sendError("coroutine cancel", cancellationException0, r10) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
        }
        catch(Throwable throwable0) {
        }
    label_46:
        r10.a = baseRepository1;
        r10.d = 3;
        object0 = baseRepository1.createErrorModel(throwable0, r10);
        if(object0 == object1) {
            return object1;
        }
    label_51:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository1.getThrowableRepository().getSessionThrowable();
            r10.a = (ErrorModel)object0;
            r10.d = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), r10) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository1.getThrowableRepository().getInspectionThrowable();
            r10.a = (ErrorModel)object0;
            r10.d = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), r10) == object1) {
                return object1;
            }
        }
        return new Fail(((ErrorModel)object0));
    }

    @Override  // com.kakao.tistory.domain.repository.GuestbookRepository
    @Nullable
    public Object getGuestBookPinComment(@NotNull String s, @NotNull Continuation continuation0) {
        BaseRepository baseRepository0;
        s1 s10;
        if(continuation0 instanceof s1) {
            s10 = (s1)continuation0;
            int v = s10.d;
            if((v & 0x80000000) == 0) {
                s10 = new s1(this, continuation0);
            }
            else {
                s10.d = v ^ 0x80000000;
            }
        }
        else {
            s10 = new s1(this, continuation0);
        }
        Object object0 = s10.b;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(s10.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    s10.a = this;
                    s10.d = 1;
                    object0 = this.a.getGuestBookPinComment(s, s10);
                }
                catch(CancellationException cancellationException0) {
                    baseRepository0 = this;
                    s10.a = baseRepository0;
                    s10.d = 2;
                    return baseRepository0.sendError("coroutine cancel", cancellationException0, s10) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
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
                baseRepository0 = (BaseRepository)s10.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    s10.a = baseRepository0;
                    s10.d = 2;
                    return baseRepository0.sendError("coroutine cancel", cancellationException0, s10) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    goto label_47;
                }
            }
            case 2: {
                baseRepository0 = (BaseRepository)s10.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(baseRepository0.createCoroutineCancelErrorModel());
            }
            case 3: {
                baseRepository0 = (BaseRepository)s10.a;
                ResultKt.throwOnFailure(object0);
                goto label_52;
            }
            case 4: 
            case 5: {
                ErrorModel errorModel0 = (ErrorModel)s10.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(errorModel0);
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            return new Success((((ItemModel)object0) == null ? null : ((PinComment)((ItemModel)object0).getData())));
        }
        catch(CancellationException cancellationException0) {
            s10.a = baseRepository0;
            s10.d = 2;
            return baseRepository0.sendError("coroutine cancel", cancellationException0, s10) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
        }
        catch(Throwable throwable0) {
        }
    label_47:
        s10.a = baseRepository0;
        s10.d = 3;
        object0 = baseRepository0.createErrorModel(throwable0, s10);
        if(object0 == object1) {
            return object1;
        }
    label_52:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository0.getThrowableRepository().getSessionThrowable();
            s10.a = (ErrorModel)object0;
            s10.d = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), s10) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository0.getThrowableRepository().getInspectionThrowable();
            s10.a = (ErrorModel)object0;
            s10.d = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), s10) == object1) {
                return object1;
            }
        }
        return new Fail(((ErrorModel)object0));
    }

    @Override  // com.kakao.tistory.domain.repository.GuestbookRepository
    @Nullable
    public Object getGuestbookList(@NotNull String s, @NotNull String s1, @Nullable Long long0, int v, @NotNull Continuation continuation0) {
        BaseRepository baseRepository1;
        t1 t10;
        if(continuation0 instanceof t1) {
            t10 = (t1)continuation0;
            int v1 = t10.d;
            if((v1 & 0x80000000) == 0) {
                t10 = new t1(this, continuation0);
            }
            else {
                t10.d = v1 ^ 0x80000000;
            }
        }
        else {
            t10 = new t1(this, continuation0);
        }
        Object object0 = t10.b;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(t10.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    t10.a = this;
                    t10.d = 1;
                    object0 = DefaultImpls.getGuestbookList$default(this.a, s, s1, long0, v, false, t10, 16, null);
                }
                catch(CancellationException cancellationException0) {
                    baseRepository1 = this;
                    t10.a = baseRepository1;
                    t10.d = 2;
                    return baseRepository1.sendError("coroutine cancel", cancellationException0, t10) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    baseRepository1 = this;
                    goto label_47;
                }
                if(object0 == object1) {
                    return object1;
                }
                baseRepository1 = this;
                break;
            }
            case 1: {
                baseRepository1 = (BaseRepository)t10.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    t10.a = baseRepository1;
                    t10.d = 2;
                    return baseRepository1.sendError("coroutine cancel", cancellationException0, t10) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    goto label_47;
                }
            }
            case 2: {
                BaseRepository baseRepository0 = (BaseRepository)t10.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(baseRepository0.createCoroutineCancelErrorModel());
            }
            case 3: {
                baseRepository1 = (BaseRepository)t10.a;
                ResultKt.throwOnFailure(object0);
                goto label_52;
            }
            case 4: 
            case 5: {
                ErrorModel errorModel0 = (ErrorModel)t10.a;
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
            t10.a = baseRepository1;
            t10.d = 2;
            return baseRepository1.sendError("coroutine cancel", cancellationException0, t10) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
        }
        catch(Throwable throwable0) {
        }
    label_47:
        t10.a = baseRepository1;
        t10.d = 3;
        object0 = baseRepository1.createErrorModel(throwable0, t10);
        if(object0 == object1) {
            return object1;
        }
    label_52:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository1.getThrowableRepository().getSessionThrowable();
            t10.a = (ErrorModel)object0;
            t10.d = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), t10) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository1.getThrowableRepository().getInspectionThrowable();
            t10.a = (ErrorModel)object0;
            t10.d = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), t10) == object1) {
                return object1;
            }
        }
        return new Fail(((ErrorModel)object0));
    }

    @Override  // com.kakao.tistory.domain.repository.GuestbookRepository
    @Nullable
    public Object getPinGuestbook(@NotNull String s, @NotNull Continuation continuation0) {
        BaseRepository baseRepository0;
        u1 u10;
        if(continuation0 instanceof u1) {
            u10 = (u1)continuation0;
            int v = u10.d;
            if((v & 0x80000000) == 0) {
                u10 = new u1(this, continuation0);
            }
            else {
                u10.d = v ^ 0x80000000;
            }
        }
        else {
            u10 = new u1(this, continuation0);
        }
        Object object0 = u10.b;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(u10.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    u10.a = this;
                    u10.d = 1;
                    object0 = this.a.getPinGuestbook(s, u10);
                }
                catch(CancellationException cancellationException0) {
                    baseRepository0 = this;
                    u10.a = baseRepository0;
                    u10.d = 2;
                    return baseRepository0.sendError("coroutine cancel", cancellationException0, u10) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
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
                baseRepository0 = (BaseRepository)u10.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    u10.a = baseRepository0;
                    u10.d = 2;
                    return baseRepository0.sendError("coroutine cancel", cancellationException0, u10) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    goto label_47;
                }
            }
            case 2: {
                baseRepository0 = (BaseRepository)u10.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(baseRepository0.createCoroutineCancelErrorModel());
            }
            case 3: {
                baseRepository0 = (BaseRepository)u10.a;
                ResultKt.throwOnFailure(object0);
                goto label_52;
            }
            case 4: 
            case 5: {
                ErrorModel errorModel0 = (ErrorModel)u10.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(errorModel0);
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            return new Success((((ItemModel)object0) == null ? null : ((PinComment)((ItemModel)object0).getData())));
        }
        catch(CancellationException cancellationException0) {
            u10.a = baseRepository0;
            u10.d = 2;
            return baseRepository0.sendError("coroutine cancel", cancellationException0, u10) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
        }
        catch(Throwable throwable0) {
        }
    label_47:
        u10.a = baseRepository0;
        u10.d = 3;
        object0 = baseRepository0.createErrorModel(throwable0, u10);
        if(object0 == object1) {
            return object1;
        }
    label_52:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository0.getThrowableRepository().getSessionThrowable();
            u10.a = (ErrorModel)object0;
            u10.d = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), u10) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository0.getThrowableRepository().getInspectionThrowable();
            u10.a = (ErrorModel)object0;
            u10.d = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), u10) == object1) {
                return object1;
            }
        }
        return new Fail(((ErrorModel)object0));
    }

    @Override  // com.kakao.tistory.domain.repository.GuestbookRepository
    @Nullable
    public Object pinGuestBookComment(@NotNull String s, long v, @NotNull Continuation continuation0) {
        BaseRepository baseRepository0;
        v1 v10;
        if(continuation0 instanceof v1) {
            v10 = (v1)continuation0;
            int v1 = v10.d;
            if((v1 & 0x80000000) == 0) {
                v10 = new v1(this, continuation0);
            }
            else {
                v10.d = v1 ^ 0x80000000;
            }
        }
        else {
            v10 = new v1(this, continuation0);
        }
        Object object0 = v10.b;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(v10.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    v10.a = this;
                    v10.d = 1;
                    if(this.a.pinGuestBookComment(s, v, v10) == object1) {
                        return object1;
                    }
                    baseRepository0 = this;
                    break;
                }
                catch(CancellationException cancellationException0) {
                    baseRepository0 = this;
                    v10.a = baseRepository0;
                    v10.d = 2;
                    return baseRepository0.sendError("coroutine cancel", cancellationException0, v10) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    baseRepository0 = this;
                    goto label_46;
                }
                return object1;
            }
            case 1: {
                baseRepository0 = (BaseRepository)v10.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    v10.a = baseRepository0;
                    v10.d = 2;
                    return baseRepository0.sendError("coroutine cancel", cancellationException0, v10) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    goto label_46;
                }
            }
            case 2: {
                baseRepository0 = (BaseRepository)v10.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(baseRepository0.createCoroutineCancelErrorModel());
            }
            case 3: {
                baseRepository0 = (BaseRepository)v10.a;
                ResultKt.throwOnFailure(object0);
                goto label_51;
            }
            case 4: 
            case 5: {
                ErrorModel errorModel0 = (ErrorModel)v10.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(errorModel0);
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            return new Success(Unit.INSTANCE);
        }
        catch(CancellationException cancellationException0) {
            v10.a = baseRepository0;
            v10.d = 2;
            return baseRepository0.sendError("coroutine cancel", cancellationException0, v10) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
        }
        catch(Throwable throwable0) {
        }
    label_46:
        v10.a = baseRepository0;
        v10.d = 3;
        object0 = baseRepository0.createErrorModel(throwable0, v10);
        if(object0 == object1) {
            return object1;
        }
    label_51:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository0.getThrowableRepository().getSessionThrowable();
            v10.a = (ErrorModel)object0;
            v10.d = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), v10) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository0.getThrowableRepository().getInspectionThrowable();
            v10.a = (ErrorModel)object0;
            v10.d = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), v10) == object1) {
                return object1;
            }
        }
        return new Fail(((ErrorModel)object0));
    }

    @Override  // com.kakao.tistory.domain.repository.GuestbookRepository
    @Nullable
    public Object postGuestbook(@NotNull String s, @NotNull String s1, @Nullable Long long0, @Nullable Long long1, boolean z, @NotNull Continuation continuation0) {
        BaseRepository baseRepository1;
        w1 w10;
        if(continuation0 instanceof w1) {
            w10 = (w1)continuation0;
            int v = w10.d;
            if((v & 0x80000000) == 0) {
                w10 = new w1(this, continuation0);
            }
            else {
                w10.d = v ^ 0x80000000;
            }
        }
        else {
            w10 = new w1(this, continuation0);
        }
        Object object0 = w10.b;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(w10.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    w10.a = this;
                    w10.d = 1;
                }
                catch(CancellationException cancellationException0) {
                    baseRepository1 = this;
                    w10.a = baseRepository1;
                    w10.d = 2;
                    return baseRepository1.sendError("coroutine cancel", cancellationException0, w10) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
                }
                try {
                    object0 = DefaultImpls.postGuestbook$default(this.a, s, s1, long0, long1, z, false, w10, 0x20, null);
                }
                catch(CancellationException cancellationException0) {
                    baseRepository1 = this;
                    w10.a = baseRepository1;
                    w10.d = 2;
                    return baseRepository1.sendError("coroutine cancel", cancellationException0, w10) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    baseRepository1 = this;
                    goto label_47;
                }
                if(object0 == object1) {
                    return object1;
                }
                baseRepository1 = this;
                break;
            }
            case 1: {
                baseRepository1 = (BaseRepository)w10.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    w10.a = baseRepository1;
                    w10.d = 2;
                    return baseRepository1.sendError("coroutine cancel", cancellationException0, w10) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    goto label_47;
                }
            }
            case 2: {
                BaseRepository baseRepository0 = (BaseRepository)w10.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(baseRepository0.createCoroutineCancelErrorModel());
            }
            case 3: {
                baseRepository1 = (BaseRepository)w10.a;
                ResultKt.throwOnFailure(object0);
                goto label_52;
            }
            case 4: 
            case 5: {
                ErrorModel errorModel0 = (ErrorModel)w10.a;
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
            w10.a = baseRepository1;
            w10.d = 2;
            return baseRepository1.sendError("coroutine cancel", cancellationException0, w10) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
        }
        catch(Throwable throwable0) {
        }
    label_47:
        w10.a = baseRepository1;
        w10.d = 3;
        object0 = baseRepository1.createErrorModel(throwable0, w10);
        if(object0 == object1) {
            return object1;
        }
    label_52:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository1.getThrowableRepository().getSessionThrowable();
            w10.a = (ErrorModel)object0;
            w10.d = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), w10) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository1.getThrowableRepository().getInspectionThrowable();
            w10.a = (ErrorModel)object0;
            w10.d = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), w10) == object1) {
                return object1;
            }
        }
        return new Fail(((ErrorModel)object0));
    }

    @Override  // com.kakao.tistory.domain.repository.GuestbookRepository
    @Nullable
    public Object putGuestbook(@NotNull String s, long v, @NotNull String s1, @Nullable Long long0, boolean z, @NotNull Continuation continuation0) {
        BaseRepository baseRepository1;
        x1 x10;
        if(continuation0 instanceof x1) {
            x10 = (x1)continuation0;
            int v1 = x10.d;
            if((v1 & 0x80000000) == 0) {
                x10 = new x1(this, continuation0);
            }
            else {
                x10.d = v1 ^ 0x80000000;
            }
        }
        else {
            x10 = new x1(this, continuation0);
        }
        Object object0 = x10.b;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(x10.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    x10.a = this;
                    x10.d = 1;
                }
                catch(CancellationException cancellationException0) {
                    baseRepository1 = this;
                    x10.a = baseRepository1;
                    x10.d = 2;
                    return baseRepository1.sendError("coroutine cancel", cancellationException0, x10) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
                }
                try {
                    object0 = DefaultImpls.putGuestbook$default(this.a, s, v, s1, long0, z, false, x10, 0x20, null);
                }
                catch(CancellationException cancellationException0) {
                    baseRepository1 = this;
                    x10.a = baseRepository1;
                    x10.d = 2;
                    return baseRepository1.sendError("coroutine cancel", cancellationException0, x10) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    baseRepository1 = this;
                    goto label_47;
                }
                if(object0 == object1) {
                    return object1;
                }
                baseRepository1 = this;
                break;
            }
            case 1: {
                baseRepository1 = (BaseRepository)x10.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    x10.a = baseRepository1;
                    x10.d = 2;
                    return baseRepository1.sendError("coroutine cancel", cancellationException0, x10) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    goto label_47;
                }
            }
            case 2: {
                BaseRepository baseRepository0 = (BaseRepository)x10.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(baseRepository0.createCoroutineCancelErrorModel());
            }
            case 3: {
                baseRepository1 = (BaseRepository)x10.a;
                ResultKt.throwOnFailure(object0);
                goto label_52;
            }
            case 4: 
            case 5: {
                ErrorModel errorModel0 = (ErrorModel)x10.a;
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
            x10.a = baseRepository1;
            x10.d = 2;
            return baseRepository1.sendError("coroutine cancel", cancellationException0, x10) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
        }
        catch(Throwable throwable0) {
        }
    label_47:
        x10.a = baseRepository1;
        x10.d = 3;
        object0 = baseRepository1.createErrorModel(throwable0, x10);
        if(object0 == object1) {
            return object1;
        }
    label_52:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository1.getThrowableRepository().getSessionThrowable();
            x10.a = (ErrorModel)object0;
            x10.d = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), x10) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository1.getThrowableRepository().getInspectionThrowable();
            x10.a = (ErrorModel)object0;
            x10.d = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), x10) == object1) {
                return object1;
            }
        }
        return new Fail(((ErrorModel)object0));
    }

    @Override  // com.kakao.tistory.domain.repository.GuestbookRepository
    @Nullable
    public Object reportGuestbook(@NotNull String s, @NotNull String s1, @Nullable String s2, long v, @NotNull Continuation continuation0) {
        BaseRepository baseRepository1;
        y1 y10;
        if(continuation0 instanceof y1) {
            y10 = (y1)continuation0;
            int v1 = y10.d;
            if((v1 & 0x80000000) == 0) {
                y10 = new y1(this, continuation0);
            }
            else {
                y10.d = v1 ^ 0x80000000;
            }
        }
        else {
            y10 = new y1(this, continuation0);
        }
        Object object0 = y10.b;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(y10.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    y10.a = this;
                    y10.d = 1;
                    if(this.a.reportGuestbook(s, s1, s2, v, y10) == object1) {
                        return object1;
                    }
                    baseRepository1 = this;
                    break;
                }
                catch(CancellationException cancellationException0) {
                    baseRepository1 = this;
                    y10.a = baseRepository1;
                    y10.d = 2;
                    return baseRepository1.sendError("coroutine cancel", cancellationException0, y10) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    baseRepository1 = this;
                    goto label_46;
                }
                return object1;
            }
            case 1: {
                baseRepository1 = (BaseRepository)y10.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    y10.a = baseRepository1;
                    y10.d = 2;
                    return baseRepository1.sendError("coroutine cancel", cancellationException0, y10) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    goto label_46;
                }
            }
            case 2: {
                BaseRepository baseRepository0 = (BaseRepository)y10.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(baseRepository0.createCoroutineCancelErrorModel());
            }
            case 3: {
                baseRepository1 = (BaseRepository)y10.a;
                ResultKt.throwOnFailure(object0);
                goto label_51;
            }
            case 4: 
            case 5: {
                ErrorModel errorModel0 = (ErrorModel)y10.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(errorModel0);
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            return new Success(Unit.INSTANCE);
        }
        catch(CancellationException cancellationException0) {
            y10.a = baseRepository1;
            y10.d = 2;
            return baseRepository1.sendError("coroutine cancel", cancellationException0, y10) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
        }
        catch(Throwable throwable0) {
        }
    label_46:
        y10.a = baseRepository1;
        y10.d = 3;
        object0 = baseRepository1.createErrorModel(throwable0, y10);
        if(object0 == object1) {
            return object1;
        }
    label_51:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository1.getThrowableRepository().getSessionThrowable();
            y10.a = (ErrorModel)object0;
            y10.d = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), y10) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository1.getThrowableRepository().getInspectionThrowable();
            y10.a = (ErrorModel)object0;
            y10.d = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), y10) == object1) {
                return object1;
            }
        }
        return new Fail(((ErrorModel)object0));
    }

    @Override  // com.kakao.tistory.domain.repository.GuestbookRepository
    @Nullable
    public Object unpinGuestBookComment(@NotNull String s, long v, @NotNull Continuation continuation0) {
        BaseRepository baseRepository0;
        z1 z10;
        if(continuation0 instanceof z1) {
            z10 = (z1)continuation0;
            int v1 = z10.d;
            if((v1 & 0x80000000) == 0) {
                z10 = new z1(this, continuation0);
            }
            else {
                z10.d = v1 ^ 0x80000000;
            }
        }
        else {
            z10 = new z1(this, continuation0);
        }
        Object object0 = z10.b;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(z10.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    z10.a = this;
                    z10.d = 1;
                    if(this.a.unpinGuestBookComment(s, v, z10) == object1) {
                        return object1;
                    }
                    baseRepository0 = this;
                    break;
                }
                catch(CancellationException cancellationException0) {
                    baseRepository0 = this;
                    z10.a = baseRepository0;
                    z10.d = 2;
                    return baseRepository0.sendError("coroutine cancel", cancellationException0, z10) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    baseRepository0 = this;
                    goto label_46;
                }
                return object1;
            }
            case 1: {
                baseRepository0 = (BaseRepository)z10.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    z10.a = baseRepository0;
                    z10.d = 2;
                    return baseRepository0.sendError("coroutine cancel", cancellationException0, z10) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    goto label_46;
                }
            }
            case 2: {
                baseRepository0 = (BaseRepository)z10.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(baseRepository0.createCoroutineCancelErrorModel());
            }
            case 3: {
                baseRepository0 = (BaseRepository)z10.a;
                ResultKt.throwOnFailure(object0);
                goto label_51;
            }
            case 4: 
            case 5: {
                ErrorModel errorModel0 = (ErrorModel)z10.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(errorModel0);
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            return new Success(Unit.INSTANCE);
        }
        catch(CancellationException cancellationException0) {
            z10.a = baseRepository0;
            z10.d = 2;
            return baseRepository0.sendError("coroutine cancel", cancellationException0, z10) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
        }
        catch(Throwable throwable0) {
        }
    label_46:
        z10.a = baseRepository0;
        z10.d = 3;
        object0 = baseRepository0.createErrorModel(throwable0, z10);
        if(object0 == object1) {
            return object1;
        }
    label_51:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository0.getThrowableRepository().getSessionThrowable();
            z10.a = (ErrorModel)object0;
            z10.d = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), z10) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository0.getThrowableRepository().getInspectionThrowable();
            z10.a = (ErrorModel)object0;
            z10.d = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), z10) == object1) {
                return object1;
            }
        }
        return new Fail(((ErrorModel)object0));
    }
}

