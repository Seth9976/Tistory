package com.kakao.tistory.data.repository;

import com.kakao.android.base.model.ErrorModel;
import com.kakao.tistory.data.service.CommentService.DefaultImpls;
import com.kakao.tistory.data.service.CommentService;
import com.kakao.tistory.domain.ErrorStatusKt;
import com.kakao.tistory.domain.entity.PinComment;
import com.kakao.tistory.domain.entity.common.ItemModel;
import com.kakao.tistory.domain.entity.common.Result.Fail;
import com.kakao.tistory.domain.entity.common.Result.Success;
import com.kakao.tistory.domain.repository.CommentRepository;
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

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000B\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u00A2\u0006\u0004\b\u0005\u0010\u0006JJ\u0010\u0012\u001A\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\n\u001A\u00020\t2\b\u0010\u000B\u001A\u0004\u0018\u00010\u00072\u0006\u0010\f\u001A\u00020\u00072\b\u0010\r\u001A\u0004\u0018\u00010\t2\u0006\u0010\u000F\u001A\u00020\u000EH\u0096@\u00A2\u0006\u0004\b\u0012\u0010\u0013J^\u0010\u001B\u001A\b\u0012\u0004\u0012\u00020\u001A0\u00102\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\n\u001A\u00020\t2\b\u0010\u000B\u001A\u0004\u0018\u00010\u00072\u0006\u0010\u0014\u001A\u00020\u00072\b\u0010\u0015\u001A\u0004\u0018\u00010\t2\b\u0010\u0016\u001A\u0004\u0018\u00010\t2\u0006\u0010\u0018\u001A\u00020\u00172\b\u0010\u0019\u001A\u0004\u0018\u00010\u0007H\u0096@\u00A2\u0006\u0004\b\u001B\u0010\u001CJR\u0010\u001D\u001A\b\u0012\u0004\u0012\u00020\u001A0\u00102\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\r\u001A\u00020\t2\u0006\u0010\u0014\u001A\u00020\u00072\b\u0010\u0016\u001A\u0004\u0018\u00010\t2\u0006\u0010\u0018\u001A\u00020\u00172\b\u0010\u0019\u001A\u0004\u0018\u00010\u0007H\u0096@\u00A2\u0006\u0004\b\u001D\u0010\u001EJ8\u0010 \u001A\b\u0012\u0004\u0012\u00020\u001F0\u00102\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\r\u001A\u00020\t2\b\u0010\u0019\u001A\u0004\u0018\u00010\u0007H\u0096@\u00A2\u0006\u0004\b \u0010!J.\u0010#\u001A\b\u0012\u0004\u0012\u00020\"0\u00102\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\r\u001A\u00020\tH\u0096@\u00A2\u0006\u0004\b#\u0010$J@\u0010\'\u001A\b\u0012\u0004\u0012\u00020\u001F0\u00102\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\r\u001A\u00020\t2\u0006\u0010%\u001A\u00020\u00072\b\u0010&\u001A\u0004\u0018\u00010\u0007H\u0096@\u00A2\u0006\u0004\b\'\u0010(J.\u0010)\u001A\b\u0012\u0004\u0012\u00020\u001F0\u00102\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\r\u001A\u00020\tH\u0096@\u00A2\u0006\u0004\b)\u0010$J.\u0010*\u001A\b\u0012\u0004\u0012\u00020\u001F0\u00102\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\r\u001A\u00020\tH\u0096@\u00A2\u0006\u0004\b*\u0010$J(\u0010+\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00102\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\n\u001A\u00020\tH\u0096@\u00A2\u0006\u0004\b+\u0010,\u00A8\u0006-"}, d2 = {"Lcom/kakao/tistory/data/repository/CommentRepositoryImpl;", "Lcom/kakao/tistory/data/repository/BaseRepository;", "Lcom/kakao/tistory/domain/repository/CommentRepository;", "Lcom/kakao/tistory/data/service/CommentService;", "commentService", "<init>", "(Lcom/kakao/tistory/data/service/CommentService;)V", "", "blogName", "", "entryId", "password", "listMode", "commentId", "", "resultSize", "Lcom/kakao/tistory/domain/entity/common/Result;", "Lcom/kakao/tistory/domain/entity/common/CommentItemListModel;", "getComments", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "content", "parentCommentId", "mentionId", "", "secret", "guestPassword", "Lcom/kakao/tistory/domain/entity/CommentItemType$CommentItem;", "postComment", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;ZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "putComment", "(Ljava/lang/String;JJLjava/lang/String;Ljava/lang/Long;ZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "deleteComment", "(Ljava/lang/String;JJLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/kakao/tistory/domain/entity/PinComment;", "getComment", "(Ljava/lang/String;JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reportCode", "reportMessage", "postReportComment", "(Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pinComment", "unpinComment", "getPinComment", "(Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nCommentRepositoryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommentRepositoryImpl.kt\ncom/kakao/tistory/data/repository/CommentRepositoryImpl\n+ 2 BaseRepository.kt\ncom/kakao/tistory/data/repository/BaseRepository\n+ 3 BaseRepository.kt\ncom/kakao/tistory/data/repository/BaseRepository$checkError$2\n*L\n1#1,151:1\n26#2,27:152\n53#2:180\n26#2,27:181\n53#2:209\n35#2:210\n26#2,27:211\n53#2:239\n35#2:240\n26#2,27:241\n53#2:269\n35#2:270\n26#2,27:271\n53#2:299\n35#2:300\n26#2,27:301\n53#2:329\n35#2:330\n26#2,27:331\n53#2:359\n35#2:360\n26#2,27:361\n53#2:389\n35#2:390\n26#2,27:391\n53#2:419\n35#2:420\n39#3:179\n39#3:208\n39#3:238\n39#3:268\n39#3:298\n39#3:328\n39#3:358\n39#3:388\n39#3:418\n*S KotlinDebug\n*F\n+ 1 CommentRepositoryImpl.kt\ncom/kakao/tistory/data/repository/CommentRepositoryImpl\n*L\n26#1:152,27\n26#1:180\n48#1:181,27\n48#1:209\n48#1:210\n71#1:211,27\n71#1:239\n71#1:240\n90#1:241,27\n90#1:269\n90#1:270\n105#1:271,27\n105#1:299\n105#1:300\n121#1:301,27\n121#1:329\n121#1:330\n137#1:331,27\n137#1:359\n137#1:360\n145#1:361,27\n145#1:389\n145#1:390\n149#1:391,27\n149#1:419\n149#1:420\n26#1:179\n48#1:208\n71#1:238\n90#1:268\n105#1:298\n121#1:328\n137#1:358\n145#1:388\n149#1:418\n*E\n"})
public final class CommentRepositoryImpl extends BaseRepository implements CommentRepository {
    public final CommentService a;

    @Inject
    public CommentRepositoryImpl(@NotNull CommentService commentService0) {
        Intrinsics.checkNotNullParameter(commentService0, "commentService");
        super();
        this.a = commentService0;
    }

    @Override  // com.kakao.tistory.domain.repository.CommentRepository
    @Nullable
    public Object deleteComment(@NotNull String s, long v, long v1, @Nullable String s1, @NotNull Continuation continuation0) {
        BaseRepository baseRepository1;
        v v2;
        if(continuation0 instanceof v) {
            v2 = (v)continuation0;
            int v3 = v2.d;
            if((v3 & 0x80000000) == 0) {
                v2 = new v(this, continuation0);
            }
            else {
                v2.d = v3 ^ 0x80000000;
            }
        }
        else {
            v2 = new v(this, continuation0);
        }
        Object object0 = v2.b;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(v2.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    v2.a = this;
                    v2.d = 1;
                    if(this.a.deleteComment(s, v, v1, s1, v2) == object1) {
                        return object1;
                    }
                    baseRepository1 = this;
                    break;
                }
                catch(CancellationException cancellationException0) {
                    baseRepository1 = this;
                    v2.a = baseRepository1;
                    v2.d = 2;
                    return baseRepository1.sendError("coroutine cancel", cancellationException0, v2) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    baseRepository1 = this;
                    goto label_46;
                }
                return object1;
            }
            case 1: {
                baseRepository1 = (BaseRepository)v2.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    v2.a = baseRepository1;
                    v2.d = 2;
                    return baseRepository1.sendError("coroutine cancel", cancellationException0, v2) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    goto label_46;
                }
            }
            case 2: {
                BaseRepository baseRepository0 = (BaseRepository)v2.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(baseRepository0.createCoroutineCancelErrorModel());
            }
            case 3: {
                baseRepository1 = (BaseRepository)v2.a;
                ResultKt.throwOnFailure(object0);
                goto label_51;
            }
            case 4: 
            case 5: {
                ErrorModel errorModel0 = (ErrorModel)v2.a;
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
            v2.a = baseRepository1;
            v2.d = 2;
            return baseRepository1.sendError("coroutine cancel", cancellationException0, v2) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
        }
        catch(Throwable throwable0) {
        }
    label_46:
        v2.a = baseRepository1;
        v2.d = 3;
        object0 = baseRepository1.createErrorModel(throwable0, v2);
        if(object0 == object1) {
            return object1;
        }
    label_51:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository1.getThrowableRepository().getSessionThrowable();
            v2.a = (ErrorModel)object0;
            v2.d = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), v2) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository1.getThrowableRepository().getInspectionThrowable();
            v2.a = (ErrorModel)object0;
            v2.d = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), v2) == object1) {
                return object1;
            }
        }
        return new Fail(((ErrorModel)object0));
    }

    @Override  // com.kakao.tistory.domain.repository.CommentRepository
    @Nullable
    public Object getComment(@NotNull String s, long v, long v1, @NotNull Continuation continuation0) {
        BaseRepository baseRepository1;
        w w0;
        if(continuation0 instanceof w) {
            w0 = (w)continuation0;
            int v2 = w0.d;
            if((v2 & 0x80000000) == 0) {
                w0 = new w(this, continuation0);
            }
            else {
                w0.d = v2 ^ 0x80000000;
            }
        }
        else {
            w0 = new w(this, continuation0);
        }
        Object object0 = w0.b;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(w0.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    w0.a = this;
                    w0.d = 1;
                    object0 = this.a.getComment(s, v, v1, w0);
                }
                catch(CancellationException cancellationException0) {
                    baseRepository1 = this;
                    w0.a = baseRepository1;
                    w0.d = 2;
                    return baseRepository1.sendError("coroutine cancel", cancellationException0, w0) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
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
                baseRepository1 = (BaseRepository)w0.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    w0.a = baseRepository1;
                    w0.d = 2;
                    return baseRepository1.sendError("coroutine cancel", cancellationException0, w0) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    goto label_47;
                }
            }
            case 2: {
                BaseRepository baseRepository0 = (BaseRepository)w0.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(baseRepository0.createCoroutineCancelErrorModel());
            }
            case 3: {
                baseRepository1 = (BaseRepository)w0.a;
                ResultKt.throwOnFailure(object0);
                goto label_52;
            }
            case 4: 
            case 5: {
                ErrorModel errorModel0 = (ErrorModel)w0.a;
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
            w0.a = baseRepository1;
            w0.d = 2;
            return baseRepository1.sendError("coroutine cancel", cancellationException0, w0) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
        }
        catch(Throwable throwable0) {
        }
    label_47:
        w0.a = baseRepository1;
        w0.d = 3;
        object0 = baseRepository1.createErrorModel(throwable0, w0);
        if(object0 == object1) {
            return object1;
        }
    label_52:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository1.getThrowableRepository().getSessionThrowable();
            w0.a = (ErrorModel)object0;
            w0.d = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), w0) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository1.getThrowableRepository().getInspectionThrowable();
            w0.a = (ErrorModel)object0;
            w0.d = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), w0) == object1) {
                return object1;
            }
        }
        return new Fail(((ErrorModel)object0));
    }

    @Override  // com.kakao.tistory.domain.repository.CommentRepository
    @Nullable
    public Object getComments(@NotNull String s, long v, @Nullable String s1, @NotNull String s2, @Nullable Long long0, int v1, @NotNull Continuation continuation0) {
        BaseRepository baseRepository1;
        x x0;
        if(continuation0 instanceof x) {
            x0 = (x)continuation0;
            int v2 = x0.d;
            if((v2 & 0x80000000) == 0) {
                x0 = new x(this, continuation0);
            }
            else {
                x0.d = v2 ^ 0x80000000;
            }
        }
        else {
            x0 = new x(this, continuation0);
        }
        Object object0 = x0.b;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(x0.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    x0.a = this;
                    x0.d = 1;
                }
                catch(CancellationException cancellationException0) {
                    baseRepository1 = this;
                    x0.a = baseRepository1;
                    x0.d = 2;
                    return baseRepository1.sendError("coroutine cancel", cancellationException0, x0) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
                }
                try {
                    object0 = DefaultImpls.getComments$default(this.a, s, v, s1, s2, long0, v1, false, x0, 0x40, null);
                }
                catch(CancellationException cancellationException0) {
                    baseRepository1 = this;
                    x0.a = baseRepository1;
                    x0.d = 2;
                    return baseRepository1.sendError("coroutine cancel", cancellationException0, x0) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
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
                baseRepository1 = (BaseRepository)x0.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    x0.a = baseRepository1;
                    x0.d = 2;
                    return baseRepository1.sendError("coroutine cancel", cancellationException0, x0) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    goto label_47;
                }
            }
            case 2: {
                BaseRepository baseRepository0 = (BaseRepository)x0.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(baseRepository0.createCoroutineCancelErrorModel());
            }
            case 3: {
                baseRepository1 = (BaseRepository)x0.a;
                ResultKt.throwOnFailure(object0);
                goto label_52;
            }
            case 4: 
            case 5: {
                ErrorModel errorModel0 = (ErrorModel)x0.a;
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
            x0.a = baseRepository1;
            x0.d = 2;
            return baseRepository1.sendError("coroutine cancel", cancellationException0, x0) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
        }
        catch(Throwable throwable0) {
        }
    label_47:
        x0.a = baseRepository1;
        x0.d = 3;
        object0 = baseRepository1.createErrorModel(throwable0, x0);
        if(object0 == object1) {
            return object1;
        }
    label_52:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository1.getThrowableRepository().getSessionThrowable();
            x0.a = (ErrorModel)object0;
            x0.d = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), x0) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository1.getThrowableRepository().getInspectionThrowable();
            x0.a = (ErrorModel)object0;
            x0.d = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), x0) == object1) {
                return object1;
            }
        }
        return new Fail(((ErrorModel)object0));
    }

    @Override  // com.kakao.tistory.domain.repository.CommentRepository
    @Nullable
    public Object getPinComment(@NotNull String s, long v, @NotNull Continuation continuation0) {
        BaseRepository baseRepository0;
        y y0;
        if(continuation0 instanceof y) {
            y0 = (y)continuation0;
            int v1 = y0.d;
            if((v1 & 0x80000000) == 0) {
                y0 = new y(this, continuation0);
            }
            else {
                y0.d = v1 ^ 0x80000000;
            }
        }
        else {
            y0 = new y(this, continuation0);
        }
        Object object0 = y0.b;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(y0.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    y0.a = this;
                    y0.d = 1;
                    object0 = this.a.getPinComment(s, v, y0);
                }
                catch(CancellationException cancellationException0) {
                    baseRepository0 = this;
                    y0.a = baseRepository0;
                    y0.d = 2;
                    return baseRepository0.sendError("coroutine cancel", cancellationException0, y0) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
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
                baseRepository0 = (BaseRepository)y0.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    y0.a = baseRepository0;
                    y0.d = 2;
                    return baseRepository0.sendError("coroutine cancel", cancellationException0, y0) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    goto label_47;
                }
            }
            case 2: {
                baseRepository0 = (BaseRepository)y0.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(baseRepository0.createCoroutineCancelErrorModel());
            }
            case 3: {
                baseRepository0 = (BaseRepository)y0.a;
                ResultKt.throwOnFailure(object0);
                goto label_52;
            }
            case 4: 
            case 5: {
                ErrorModel errorModel0 = (ErrorModel)y0.a;
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
            y0.a = baseRepository0;
            y0.d = 2;
            return baseRepository0.sendError("coroutine cancel", cancellationException0, y0) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
        }
        catch(Throwable throwable0) {
        }
    label_47:
        y0.a = baseRepository0;
        y0.d = 3;
        object0 = baseRepository0.createErrorModel(throwable0, y0);
        if(object0 == object1) {
            return object1;
        }
    label_52:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository0.getThrowableRepository().getSessionThrowable();
            y0.a = (ErrorModel)object0;
            y0.d = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), y0) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository0.getThrowableRepository().getInspectionThrowable();
            y0.a = (ErrorModel)object0;
            y0.d = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), y0) == object1) {
                return object1;
            }
        }
        return new Fail(((ErrorModel)object0));
    }

    @Override  // com.kakao.tistory.domain.repository.CommentRepository
    @Nullable
    public Object pinComment(@NotNull String s, long v, long v1, @NotNull Continuation continuation0) {
        BaseRepository baseRepository1;
        z z0;
        if(continuation0 instanceof z) {
            z0 = (z)continuation0;
            int v2 = z0.d;
            if((v2 & 0x80000000) == 0) {
                z0 = new z(this, continuation0);
            }
            else {
                z0.d = v2 ^ 0x80000000;
            }
        }
        else {
            z0 = new z(this, continuation0);
        }
        Object object0 = z0.b;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(z0.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    z0.a = this;
                    z0.d = 1;
                    if(this.a.pinComment(s, v, v1, z0) == object1) {
                        return object1;
                    }
                    baseRepository1 = this;
                    break;
                }
                catch(CancellationException cancellationException0) {
                    baseRepository1 = this;
                    z0.a = baseRepository1;
                    z0.d = 2;
                    return baseRepository1.sendError("coroutine cancel", cancellationException0, z0) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    baseRepository1 = this;
                    goto label_46;
                }
                return object1;
            }
            case 1: {
                baseRepository1 = (BaseRepository)z0.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    z0.a = baseRepository1;
                    z0.d = 2;
                    return baseRepository1.sendError("coroutine cancel", cancellationException0, z0) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    goto label_46;
                }
            }
            case 2: {
                BaseRepository baseRepository0 = (BaseRepository)z0.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(baseRepository0.createCoroutineCancelErrorModel());
            }
            case 3: {
                baseRepository1 = (BaseRepository)z0.a;
                ResultKt.throwOnFailure(object0);
                goto label_51;
            }
            case 4: 
            case 5: {
                ErrorModel errorModel0 = (ErrorModel)z0.a;
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
            z0.a = baseRepository1;
            z0.d = 2;
            return baseRepository1.sendError("coroutine cancel", cancellationException0, z0) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
        }
        catch(Throwable throwable0) {
        }
    label_46:
        z0.a = baseRepository1;
        z0.d = 3;
        object0 = baseRepository1.createErrorModel(throwable0, z0);
        if(object0 == object1) {
            return object1;
        }
    label_51:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository1.getThrowableRepository().getSessionThrowable();
            z0.a = (ErrorModel)object0;
            z0.d = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), z0) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository1.getThrowableRepository().getInspectionThrowable();
            z0.a = (ErrorModel)object0;
            z0.d = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), z0) == object1) {
                return object1;
            }
        }
        return new Fail(((ErrorModel)object0));
    }

    @Override  // com.kakao.tistory.domain.repository.CommentRepository
    @Nullable
    public Object postComment(@NotNull String s, long v, @Nullable String s1, @NotNull String s2, @Nullable Long long0, @Nullable Long long1, boolean z, @Nullable String s3, @NotNull Continuation continuation0) {
        Object object2;
        BaseRepository baseRepository2;
        a0 a00;
        if(continuation0 instanceof a0) {
            a00 = (a0)continuation0;
            int v1 = a00.d;
            if((v1 & 0x80000000) == 0) {
                a00 = new a0(this, continuation0);
            }
            else {
                a00.d = v1 ^ 0x80000000;
            }
        }
        else {
            a00 = new a0(this, continuation0);
        }
        Object object0 = a00.b;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(a00.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                a00.a = this;
                a00.d = 1;
                try {
                    object2 = object1;
                    object0 = DefaultImpls.postComment$default(this.a, s, v, s1, s2, long0, long1, z, s3, false, a00, 0x100, null);
                    object2 = object1;
                }
                catch(CancellationException cancellationException0) {
                    object2 = object1;
                    baseRepository2 = this;
                    a00.a = baseRepository2;
                    a00.d = 2;
                    return baseRepository2.sendError("coroutine cancel", cancellationException0, a00) == object2 ? object2 : new Fail(baseRepository2.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    baseRepository2 = this;
                    goto label_60;
                }
                if(object0 == object2) {
                    return object2;
                }
                baseRepository2 = this;
                break;
            }
            case 1: {
                BaseRepository baseRepository3 = (BaseRepository)a00.a;
                try {
                    baseRepository2 = baseRepository3;
                    object2 = object1;
                    ResultKt.throwOnFailure(object0);
                    baseRepository2 = baseRepository3;
                    object2 = object1;
                    break;
                }
                catch(CancellationException cancellationException0) {
                }
                catch(Throwable throwable0) {
                    goto label_60;
                }
                baseRepository2 = baseRepository3;
                object2 = object1;
                a00.a = baseRepository2;
                a00.d = 2;
                return baseRepository2.sendError("coroutine cancel", cancellationException0, a00) == object2 ? object2 : new Fail(baseRepository2.createCoroutineCancelErrorModel());
            }
            case 2: {
                BaseRepository baseRepository0 = (BaseRepository)a00.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(baseRepository0.createCoroutineCancelErrorModel());
            }
            case 3: {
                BaseRepository baseRepository1 = (BaseRepository)a00.a;
                ResultKt.throwOnFailure(object0);
                baseRepository2 = baseRepository1;
                object2 = object1;
                goto label_65;
            }
            case 4: 
            case 5: {
                ErrorModel errorModel0 = (ErrorModel)a00.a;
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
            a00.a = baseRepository2;
            a00.d = 2;
            return baseRepository2.sendError("coroutine cancel", cancellationException0, a00) == object2 ? object2 : new Fail(baseRepository2.createCoroutineCancelErrorModel());
        }
        catch(Throwable throwable0) {
        }
    label_60:
        a00.a = baseRepository2;
        a00.d = 3;
        object0 = baseRepository2.createErrorModel(throwable0, a00);
        if(object0 == object2) {
            return object2;
        }
    label_65:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository2.getThrowableRepository().getSessionThrowable();
            a00.a = (ErrorModel)object0;
            a00.d = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), a00) == object2) {
                return object2;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository2.getThrowableRepository().getInspectionThrowable();
            a00.a = (ErrorModel)object0;
            a00.d = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), a00) == object2) {
                return object2;
            }
        }
        return new Fail(((ErrorModel)object0));
    }

    @Override  // com.kakao.tistory.domain.repository.CommentRepository
    @Nullable
    public Object postReportComment(@NotNull String s, long v, long v1, @NotNull String s1, @Nullable String s2, @NotNull Continuation continuation0) {
        BaseRepository baseRepository1;
        b0 b00;
        if(continuation0 instanceof b0) {
            b00 = (b0)continuation0;
            int v2 = b00.d;
            if((v2 & 0x80000000) == 0) {
                b00 = new b0(this, continuation0);
            }
            else {
                b00.d = v2 ^ 0x80000000;
            }
        }
        else {
            b00 = new b0(this, continuation0);
        }
        Object object0 = b00.b;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(b00.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    b00.a = this;
                    b00.d = 1;
                    if(this.a.reportComment(s, v, v1, s1, s2, b00) == object1) {
                        return object1;
                    }
                    baseRepository1 = this;
                    break;
                }
                catch(CancellationException cancellationException0) {
                    baseRepository1 = this;
                    b00.a = baseRepository1;
                    b00.d = 2;
                    return baseRepository1.sendError("coroutine cancel", cancellationException0, b00) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    baseRepository1 = this;
                    goto label_46;
                }
                return object1;
            }
            case 1: {
                baseRepository1 = (BaseRepository)b00.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    b00.a = baseRepository1;
                    b00.d = 2;
                    return baseRepository1.sendError("coroutine cancel", cancellationException0, b00) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    goto label_46;
                }
            }
            case 2: {
                BaseRepository baseRepository0 = (BaseRepository)b00.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(baseRepository0.createCoroutineCancelErrorModel());
            }
            case 3: {
                baseRepository1 = (BaseRepository)b00.a;
                ResultKt.throwOnFailure(object0);
                goto label_51;
            }
            case 4: 
            case 5: {
                ErrorModel errorModel0 = (ErrorModel)b00.a;
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
            b00.a = baseRepository1;
            b00.d = 2;
            return baseRepository1.sendError("coroutine cancel", cancellationException0, b00) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
        }
        catch(Throwable throwable0) {
        }
    label_46:
        b00.a = baseRepository1;
        b00.d = 3;
        object0 = baseRepository1.createErrorModel(throwable0, b00);
        if(object0 == object1) {
            return object1;
        }
    label_51:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository1.getThrowableRepository().getSessionThrowable();
            b00.a = (ErrorModel)object0;
            b00.d = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), b00) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository1.getThrowableRepository().getInspectionThrowable();
            b00.a = (ErrorModel)object0;
            b00.d = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), b00) == object1) {
                return object1;
            }
        }
        return new Fail(((ErrorModel)object0));
    }

    @Override  // com.kakao.tistory.domain.repository.CommentRepository
    @Nullable
    public Object putComment(@NotNull String s, long v, long v1, @NotNull String s1, @Nullable Long long0, boolean z, @Nullable String s2, @NotNull Continuation continuation0) {
        Object object2;
        BaseRepository baseRepository2;
        c0 c00;
        if(continuation0 instanceof c0) {
            c00 = (c0)continuation0;
            int v2 = c00.d;
            if((v2 & 0x80000000) == 0) {
                c00 = new c0(this, continuation0);
            }
            else {
                c00.d = v2 ^ 0x80000000;
            }
        }
        else {
            c00 = new c0(this, continuation0);
        }
        Object object0 = c00.b;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(c00.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                c00.a = this;
                c00.d = 1;
                try {
                    object2 = object1;
                    object0 = DefaultImpls.putComment$default(this.a, s, v, v1, s1, long0, z, s2, false, c00, 0x80, null);
                    object2 = object1;
                }
                catch(CancellationException cancellationException0) {
                    object2 = object1;
                    baseRepository2 = this;
                    c00.a = baseRepository2;
                    c00.d = 2;
                    return baseRepository2.sendError("coroutine cancel", cancellationException0, c00) == object2 ? object2 : new Fail(baseRepository2.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    baseRepository2 = this;
                    goto label_60;
                }
                if(object0 == object2) {
                    return object2;
                }
                baseRepository2 = this;
                break;
            }
            case 1: {
                BaseRepository baseRepository3 = (BaseRepository)c00.a;
                try {
                    baseRepository2 = baseRepository3;
                    object2 = object1;
                    ResultKt.throwOnFailure(object0);
                    baseRepository2 = baseRepository3;
                    object2 = object1;
                    break;
                }
                catch(CancellationException cancellationException0) {
                }
                catch(Throwable throwable0) {
                    goto label_60;
                }
                baseRepository2 = baseRepository3;
                object2 = object1;
                c00.a = baseRepository2;
                c00.d = 2;
                return baseRepository2.sendError("coroutine cancel", cancellationException0, c00) == object2 ? object2 : new Fail(baseRepository2.createCoroutineCancelErrorModel());
            }
            case 2: {
                BaseRepository baseRepository0 = (BaseRepository)c00.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(baseRepository0.createCoroutineCancelErrorModel());
            }
            case 3: {
                BaseRepository baseRepository1 = (BaseRepository)c00.a;
                ResultKt.throwOnFailure(object0);
                baseRepository2 = baseRepository1;
                object2 = object1;
                goto label_65;
            }
            case 4: 
            case 5: {
                ErrorModel errorModel0 = (ErrorModel)c00.a;
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
            c00.a = baseRepository2;
            c00.d = 2;
            return baseRepository2.sendError("coroutine cancel", cancellationException0, c00) == object2 ? object2 : new Fail(baseRepository2.createCoroutineCancelErrorModel());
        }
        catch(Throwable throwable0) {
        }
    label_60:
        c00.a = baseRepository2;
        c00.d = 3;
        object0 = baseRepository2.createErrorModel(throwable0, c00);
        if(object0 == object2) {
            return object2;
        }
    label_65:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository2.getThrowableRepository().getSessionThrowable();
            c00.a = (ErrorModel)object0;
            c00.d = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), c00) == object2) {
                return object2;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository2.getThrowableRepository().getInspectionThrowable();
            c00.a = (ErrorModel)object0;
            c00.d = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), c00) == object2) {
                return object2;
            }
        }
        return new Fail(((ErrorModel)object0));
    }

    @Override  // com.kakao.tistory.domain.repository.CommentRepository
    @Nullable
    public Object unpinComment(@NotNull String s, long v, long v1, @NotNull Continuation continuation0) {
        BaseRepository baseRepository1;
        d0 d00;
        if(continuation0 instanceof d0) {
            d00 = (d0)continuation0;
            int v2 = d00.d;
            if((v2 & 0x80000000) == 0) {
                d00 = new d0(this, continuation0);
            }
            else {
                d00.d = v2 ^ 0x80000000;
            }
        }
        else {
            d00 = new d0(this, continuation0);
        }
        Object object0 = d00.b;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(d00.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    d00.a = this;
                    d00.d = 1;
                    if(this.a.unpinComment(s, v, v1, d00) == object1) {
                        return object1;
                    }
                    baseRepository1 = this;
                    break;
                }
                catch(CancellationException cancellationException0) {
                    baseRepository1 = this;
                    d00.a = baseRepository1;
                    d00.d = 2;
                    return baseRepository1.sendError("coroutine cancel", cancellationException0, d00) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    baseRepository1 = this;
                    goto label_46;
                }
                return object1;
            }
            case 1: {
                baseRepository1 = (BaseRepository)d00.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    d00.a = baseRepository1;
                    d00.d = 2;
                    return baseRepository1.sendError("coroutine cancel", cancellationException0, d00) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    goto label_46;
                }
            }
            case 2: {
                BaseRepository baseRepository0 = (BaseRepository)d00.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(baseRepository0.createCoroutineCancelErrorModel());
            }
            case 3: {
                baseRepository1 = (BaseRepository)d00.a;
                ResultKt.throwOnFailure(object0);
                goto label_51;
            }
            case 4: 
            case 5: {
                ErrorModel errorModel0 = (ErrorModel)d00.a;
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
            d00.a = baseRepository1;
            d00.d = 2;
            return baseRepository1.sendError("coroutine cancel", cancellationException0, d00) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
        }
        catch(Throwable throwable0) {
        }
    label_46:
        d00.a = baseRepository1;
        d00.d = 3;
        object0 = baseRepository1.createErrorModel(throwable0, d00);
        if(object0 == object1) {
            return object1;
        }
    label_51:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository1.getThrowableRepository().getSessionThrowable();
            d00.a = (ErrorModel)object0;
            d00.d = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), d00) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository1.getThrowableRepository().getInspectionThrowable();
            d00.a = (ErrorModel)object0;
            d00.d = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), d00) == object1) {
                return object1;
            }
        }
        return new Fail(((ErrorModel)object0));
    }
}

