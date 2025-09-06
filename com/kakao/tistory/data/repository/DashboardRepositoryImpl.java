package com.kakao.tistory.data.repository;

import androidx.lifecycle.MutableLiveData;
import com.kakao.android.base.model.ErrorModel;
import com.kakao.tistory.data.model.HomeItem.TopMessage;
import com.kakao.tistory.data.service.DashboardService;
import com.kakao.tistory.data.service.OldBlogService.DefaultImpls;
import com.kakao.tistory.data.service.OldBlogService;
import com.kakao.tistory.domain.ErrorStatus;
import com.kakao.tistory.domain.ErrorStatusKt;
import com.kakao.tistory.domain.entity.common.Result.Fail;
import com.kakao.tistory.domain.entity.common.Result.Success;
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

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u00A2\u0006\u0004\b\u0007\u0010\bJ\u001E\u0010\r\u001A\b\u0012\u0004\u0012\u00020\f0\u000B2\u0006\u0010\n\u001A\u00020\tH\u0096@\u00A2\u0006\u0004\b\r\u0010\u000EJ\u001E\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\u000F0\u000B2\u0006\u0010\n\u001A\u00020\tH\u0096@\u00A2\u0006\u0004\b\u0010\u0010\u000EJ(\u0010\u0013\u001A\b\u0012\u0004\u0012\u00020\u00120\u000B2\u0006\u0010\n\u001A\u00020\t2\b\u0010\u0011\u001A\u0004\u0018\u00010\tH\u0096@\u00A2\u0006\u0004\b\u0013\u0010\u0014J\u001E\u0010\u0016\u001A\b\u0012\u0004\u0012\u00020\u00150\u000B2\u0006\u0010\n\u001A\u00020\tH\u0096@\u00A2\u0006\u0004\b\u0016\u0010\u000EJ(\u0010\u0017\u001A\b\u0012\u0004\u0012\u00020\u00120\u000B2\u0006\u0010\n\u001A\u00020\t2\b\u0010\u0011\u001A\u0004\u0018\u00010\tH\u0096@\u00A2\u0006\u0004\b\u0017\u0010\u0014J\u001E\u0010\u0019\u001A\b\u0012\u0004\u0012\u00020\u00180\u000B2\u0006\u0010\n\u001A\u00020\tH\u0096@\u00A2\u0006\u0004\b\u0019\u0010\u000EJ\u001E\u0010\u001B\u001A\b\u0012\u0004\u0012\u00020\u001A0\u000B2\u0006\u0010\n\u001A\u00020\tH\u0096@\u00A2\u0006\u0004\b\u001B\u0010\u000EJ\u001E\u0010\u001C\u001A\b\u0012\u0004\u0012\u00020\u000F0\u000B2\u0006\u0010\n\u001A\u00020\tH\u0096@\u00A2\u0006\u0004\b\u001C\u0010\u000EJ$\u0010\u001F\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001E0\u001D0\u000B2\u0006\u0010\n\u001A\u00020\tH\u0096@\u00A2\u0006\u0004\b\u001F\u0010\u000ER\"\u0010$\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\f0 8\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b!\u0010\"\u001A\u0004\b\r\u0010#R \u0010&\u001A\b\u0012\u0004\u0012\u00020\u000F0 8\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b%\u0010\"\u001A\u0004\b\u0010\u0010#R \u0010(\u001A\b\u0012\u0004\u0012\u00020\u00120 8\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b\'\u0010\"\u001A\u0004\b\u0017\u0010#\u00A8\u0006)"}, d2 = {"Lcom/kakao/tistory/data/repository/DashboardRepositoryImpl;", "Lcom/kakao/tistory/data/repository/BaseRepository;", "Lcom/kakao/tistory/data/repository/DashboardRepository;", "Lcom/kakao/tistory/data/service/DashboardService;", "dashboardService", "Lcom/kakao/tistory/data/service/OldBlogService;", "oldBlogService", "<init>", "(Lcom/kakao/tistory/data/service/DashboardService;Lcom/kakao/tistory/data/service/OldBlogService;)V", "", "blogName", "Lcom/kakao/tistory/domain/entity/common/Result;", "Lcom/kakao/tistory/data/model/HomeItem$TopMessage;", "getTopMessage", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/kakao/tistory/data/model/HomeItem$TopPost;", "getTopPost", "sortItem", "Lcom/kakao/tistory/data/model/StatisticsItem$RefererLog;", "getRefLog", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/kakao/tistory/data/model/StatisticsItem$Trend;", "getTrend", "getRefererLog", "Lcom/kakao/tistory/data/model/StatisticsItem$RefererKeyword;", "getRefererKeywords", "Lcom/kakao/tistory/data/model/HomeItem$RecentPost;", "getRecentPosts", "getTopPosts", "Lcom/kakao/tistory/domain/entity/common/ItemListModel;", "Lcom/kakao/tistory/domain/entity/User;", "getBlogFollowers", "Landroidx/lifecycle/MutableLiveData;", "c", "Landroidx/lifecycle/MutableLiveData;", "()Landroidx/lifecycle/MutableLiveData;", "topMessage", "d", "topPost", "e", "refererLog", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nDashboardRepositoryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DashboardRepositoryImpl.kt\ncom/kakao/tistory/data/repository/DashboardRepositoryImpl\n+ 2 BaseRepository.kt\ncom/kakao/tistory/data/repository/BaseRepository\n+ 3 BaseRepository.kt\ncom/kakao/tistory/data/repository/BaseRepository$checkError$2\n+ 4 Result.kt\ncom/kakao/tistory/domain/entity/common/ResultKt\n+ 5 Result.kt\ncom/kakao/tistory/domain/entity/common/ResultKt$process$2\n*L\n1#1,77:1\n26#2,27:78\n53#2:106\n26#2,27:112\n53#2:140\n35#2:141\n26#2,27:142\n53#2:170\n35#2:171\n26#2,27:181\n53#2:209\n35#2:210\n26#2,27:211\n53#2:239\n35#2:240\n26#2,27:241\n53#2:269\n35#2:270\n26#2,27:271\n53#2:299\n35#2:300\n26#2,27:301\n53#2:329\n35#2:330\n26#2,27:331\n53#2:359\n35#2:360\n39#3:105\n39#3:139\n39#3:169\n39#3:208\n39#3:238\n39#3:268\n39#3:298\n39#3:328\n39#3:358\n15#4,5:107\n11#4,7:172\n19#4:180\n13#5:179\n*S KotlinDebug\n*F\n+ 1 DashboardRepositoryImpl.kt\ncom/kakao/tistory/data/repository/DashboardRepositoryImpl\n*L\n28#1:78,27\n28#1:106\n42#1:112,27\n42#1:140\n42#1:141\n49#1:142,27\n49#1:170\n49#1:171\n57#1:181,27\n57#1:209\n57#1:210\n59#1:211,27\n59#1:239\n59#1:240\n67#1:241,27\n67#1:269\n67#1:270\n70#1:271,27\n70#1:299\n70#1:300\n73#1:301,27\n73#1:329\n73#1:330\n76#1:331,27\n76#1:359\n76#1:360\n28#1:105\n42#1:139\n49#1:169\n57#1:208\n59#1:238\n67#1:268\n70#1:298\n73#1:328\n76#1:358\n29#1:107,5\n50#1:172,7\n50#1:180\n50#1:179\n*E\n"})
public final class DashboardRepositoryImpl extends BaseRepository implements DashboardRepository {
    public final DashboardService a;
    public final OldBlogService b;
    public final MutableLiveData c;
    public final MutableLiveData d;
    public final MutableLiveData e;

    @Inject
    public DashboardRepositoryImpl(@NotNull DashboardService dashboardService0, @NotNull OldBlogService oldBlogService0) {
        Intrinsics.checkNotNullParameter(dashboardService0, "dashboardService");
        Intrinsics.checkNotNullParameter(oldBlogService0, "oldBlogService");
        super();
        this.a = dashboardService0;
        this.b = oldBlogService0;
        this.c = new MutableLiveData();
        this.d = new MutableLiveData();
        this.e = new MutableLiveData();
    }

    @Override  // com.kakao.tistory.data.repository.DashboardRepository
    @Nullable
    public Object getBlogFollowers(@NotNull String s, @NotNull Continuation continuation0) {
        BaseRepository baseRepository1;
        e0 e00;
        if(continuation0 instanceof e0) {
            e00 = (e0)continuation0;
            int v = e00.d;
            if((v & 0x80000000) == 0) {
                e00 = new e0(this, continuation0);
            }
            else {
                e00.d = v ^ 0x80000000;
            }
        }
        else {
            e00 = new e0(this, continuation0);
        }
        Object object0 = e00.b;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(e00.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    e00.a = this;
                    e00.d = 1;
                    object0 = DefaultImpls.getBlogFollowers$default(this.b, s, 0, null, 0, e00, 14, null);
                }
                catch(CancellationException cancellationException0) {
                    baseRepository1 = this;
                    e00.a = baseRepository1;
                    e00.d = 2;
                    return baseRepository1.sendError("coroutine cancel", cancellationException0, e00) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
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
                baseRepository1 = (BaseRepository)e00.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    e00.a = baseRepository1;
                    e00.d = 2;
                    return baseRepository1.sendError("coroutine cancel", cancellationException0, e00) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    goto label_47;
                }
            }
            case 2: {
                BaseRepository baseRepository0 = (BaseRepository)e00.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(baseRepository0.createCoroutineCancelErrorModel());
            }
            case 3: {
                baseRepository1 = (BaseRepository)e00.a;
                ResultKt.throwOnFailure(object0);
                goto label_52;
            }
            case 4: 
            case 5: {
                ErrorModel errorModel0 = (ErrorModel)e00.a;
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
            e00.a = baseRepository1;
            e00.d = 2;
            return baseRepository1.sendError("coroutine cancel", cancellationException0, e00) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
        }
        catch(Throwable throwable0) {
        }
    label_47:
        e00.a = baseRepository1;
        e00.d = 3;
        object0 = baseRepository1.createErrorModel(throwable0, e00);
        if(object0 == object1) {
            return object1;
        }
    label_52:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository1.getThrowableRepository().getSessionThrowable();
            e00.a = (ErrorModel)object0;
            e00.d = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), e00) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository1.getThrowableRepository().getInspectionThrowable();
            e00.a = (ErrorModel)object0;
            e00.d = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), e00) == object1) {
                return object1;
            }
        }
        return new Fail(((ErrorModel)object0));
    }

    @Override  // com.kakao.tistory.data.repository.DashboardRepository
    @Nullable
    public Object getRecentPosts(@NotNull String s, @NotNull Continuation continuation0) {
        BaseRepository baseRepository0;
        f0 f00;
        if(continuation0 instanceof f0) {
            f00 = (f0)continuation0;
            int v = f00.d;
            if((v & 0x80000000) == 0) {
                f00 = new f0(this, continuation0);
            }
            else {
                f00.d = v ^ 0x80000000;
            }
        }
        else {
            f00 = new f0(this, continuation0);
        }
        Object object0 = f00.b;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(f00.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    f00.a = this;
                    f00.d = 1;
                    object0 = this.a.getRecentPosts(s, f00);
                }
                catch(CancellationException cancellationException0) {
                    baseRepository0 = this;
                    f00.a = baseRepository0;
                    f00.d = 2;
                    return baseRepository0.sendError("coroutine cancel", cancellationException0, f00) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
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
                baseRepository0 = (BaseRepository)f00.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    f00.a = baseRepository0;
                    f00.d = 2;
                    return baseRepository0.sendError("coroutine cancel", cancellationException0, f00) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    goto label_47;
                }
            }
            case 2: {
                baseRepository0 = (BaseRepository)f00.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(baseRepository0.createCoroutineCancelErrorModel());
            }
            case 3: {
                baseRepository0 = (BaseRepository)f00.a;
                ResultKt.throwOnFailure(object0);
                goto label_52;
            }
            case 4: 
            case 5: {
                ErrorModel errorModel0 = (ErrorModel)f00.a;
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
            f00.a = baseRepository0;
            f00.d = 2;
            return baseRepository0.sendError("coroutine cancel", cancellationException0, f00) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
        }
        catch(Throwable throwable0) {
        }
    label_47:
        f00.a = baseRepository0;
        f00.d = 3;
        object0 = baseRepository0.createErrorModel(throwable0, f00);
        if(object0 == object1) {
            return object1;
        }
    label_52:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository0.getThrowableRepository().getSessionThrowable();
            f00.a = (ErrorModel)object0;
            f00.d = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), f00) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository0.getThrowableRepository().getInspectionThrowable();
            f00.a = (ErrorModel)object0;
            f00.d = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), f00) == object1) {
                return object1;
            }
        }
        return new Fail(((ErrorModel)object0));
    }

    @Override  // com.kakao.tistory.data.repository.DashboardRepository
    @Nullable
    public Object getRefLog(@NotNull String s, @Nullable String s1, @NotNull Continuation continuation0) {
        Object object2;
        BaseRepository baseRepository0;
        ErrorModel errorModel0;
        BaseRepository baseRepository1;
        g0 g00;
        if(continuation0 instanceof g0) {
            g00 = (g0)continuation0;
            int v = g00.e;
            if((v & 0x80000000) == 0) {
                g00 = new g0(this, continuation0);
            }
            else {
                g00.e = v ^ 0x80000000;
            }
        }
        else {
            g00 = new g0(this, continuation0);
        }
        Object object0 = g00.c;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(g00.e) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    g00.a = this;
                    g00.b = this;
                    g00.e = 1;
                    object0 = this.a.getRefererLogs(s, s1, g00);
                }
                catch(CancellationException cancellationException1) {
                    cancellationException0 = cancellationException1;
                    baseRepository1 = this;
                    baseRepository0 = baseRepository1;
                    goto label_52;
                }
                catch(Throwable throwable1) {
                    throwable0 = throwable1;
                    baseRepository1 = this;
                    baseRepository0 = baseRepository1;
                    goto label_60;
                }
                if(object0 == object1) {
                    return object1;
                }
                baseRepository1 = this;
                baseRepository0 = baseRepository1;
                break;
            }
            case 1: {
                baseRepository1 = (BaseRepository)g00.b;
                baseRepository0 = g00.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    goto label_52;
                }
                catch(Throwable throwable0) {
                    goto label_60;
                }
            }
            case 2: {
                baseRepository1 = (BaseRepository)g00.b;
                baseRepository0 = g00.a;
                ResultKt.throwOnFailure(object0);
                object2 = new Fail(baseRepository1.createCoroutineCancelErrorModel());
                goto label_82;
            }
            case 3: {
                baseRepository1 = (BaseRepository)g00.b;
                baseRepository0 = g00.a;
                ResultKt.throwOnFailure(object0);
                goto label_66;
            }
            case 4: 
            case 5: {
                errorModel0 = (ErrorModel)g00.b;
                baseRepository0 = g00.a;
                ResultKt.throwOnFailure(object0);
                goto label_81;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            object2 = new Success(object0);
            goto label_82;
        }
        catch(CancellationException cancellationException0) {
        label_52:
            g00.a = baseRepository0;
            g00.b = baseRepository1;
            g00.e = 2;
            if(baseRepository1.sendError("coroutine cancel", cancellationException0, g00) == object1) {
                return object1;
            }
            object2 = new Fail(baseRepository1.createCoroutineCancelErrorModel());
            goto label_82;
        }
        catch(Throwable throwable0) {
        }
    label_60:
        g00.a = baseRepository0;
        g00.b = baseRepository1;
        g00.e = 3;
        object0 = baseRepository1.createErrorModel(throwable0, g00);
        if(object0 == object1) {
            return object1;
        }
    label_66:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository1.getThrowableRepository().getSessionThrowable();
            g00.a = baseRepository0;
            g00.b = (ErrorModel)object0;
            g00.e = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), g00) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository1.getThrowableRepository().getInspectionThrowable();
            g00.a = baseRepository0;
            g00.b = (ErrorModel)object0;
            g00.e = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), g00) == object1) {
                return object1;
            }
        }
        errorModel0 = (ErrorModel)object0;
    label_81:
        object2 = new Fail(errorModel0);
    label_82:
        if(object2 instanceof Success) {
            ((DashboardRepositoryImpl)baseRepository0).getRefererLog().setValue(((Success)object2).getData());
        }
        return object2;
    }

    @Override  // com.kakao.tistory.data.repository.DashboardRepository
    @Nullable
    public Object getRefererKeywords(@NotNull String s, @NotNull Continuation continuation0) {
        BaseRepository baseRepository0;
        h0 h00;
        if(continuation0 instanceof h0) {
            h00 = (h0)continuation0;
            int v = h00.d;
            if((v & 0x80000000) == 0) {
                h00 = new h0(this, continuation0);
            }
            else {
                h00.d = v ^ 0x80000000;
            }
        }
        else {
            h00 = new h0(this, continuation0);
        }
        Object object0 = h00.b;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(h00.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    h00.a = this;
                    h00.d = 1;
                    object0 = this.a.getRefererKeywords(s, h00);
                }
                catch(CancellationException cancellationException0) {
                    baseRepository0 = this;
                    h00.a = baseRepository0;
                    h00.d = 2;
                    return baseRepository0.sendError("coroutine cancel", cancellationException0, h00) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
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
                baseRepository0 = (BaseRepository)h00.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    h00.a = baseRepository0;
                    h00.d = 2;
                    return baseRepository0.sendError("coroutine cancel", cancellationException0, h00) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    goto label_47;
                }
            }
            case 2: {
                baseRepository0 = (BaseRepository)h00.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(baseRepository0.createCoroutineCancelErrorModel());
            }
            case 3: {
                baseRepository0 = (BaseRepository)h00.a;
                ResultKt.throwOnFailure(object0);
                goto label_52;
            }
            case 4: 
            case 5: {
                ErrorModel errorModel0 = (ErrorModel)h00.a;
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
            h00.a = baseRepository0;
            h00.d = 2;
            return baseRepository0.sendError("coroutine cancel", cancellationException0, h00) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
        }
        catch(Throwable throwable0) {
        }
    label_47:
        h00.a = baseRepository0;
        h00.d = 3;
        object0 = baseRepository0.createErrorModel(throwable0, h00);
        if(object0 == object1) {
            return object1;
        }
    label_52:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository0.getThrowableRepository().getSessionThrowable();
            h00.a = (ErrorModel)object0;
            h00.d = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), h00) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository0.getThrowableRepository().getInspectionThrowable();
            h00.a = (ErrorModel)object0;
            h00.d = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), h00) == object1) {
                return object1;
            }
        }
        return new Fail(((ErrorModel)object0));
    }

    @Override  // com.kakao.tistory.data.repository.DashboardRepository
    @NotNull
    public MutableLiveData getRefererLog() {
        return this.e;
    }

    @Override  // com.kakao.tistory.data.repository.DashboardRepository
    @Nullable
    public Object getRefererLog(@NotNull String s, @Nullable String s1, @NotNull Continuation continuation0) {
        BaseRepository baseRepository0;
        i0 i00;
        if(continuation0 instanceof i0) {
            i00 = (i0)continuation0;
            int v = i00.d;
            if((v & 0x80000000) == 0) {
                i00 = new i0(this, continuation0);
            }
            else {
                i00.d = v ^ 0x80000000;
            }
        }
        else {
            i00 = new i0(this, continuation0);
        }
        Object object0 = i00.b;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(i00.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    i00.a = this;
                    i00.d = 1;
                    object0 = this.a.getRefererLogs(s, s1, i00);
                }
                catch(CancellationException cancellationException0) {
                    baseRepository0 = this;
                    i00.a = baseRepository0;
                    i00.d = 2;
                    return baseRepository0.sendError("coroutine cancel", cancellationException0, i00) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
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
                baseRepository0 = (BaseRepository)i00.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    i00.a = baseRepository0;
                    i00.d = 2;
                    return baseRepository0.sendError("coroutine cancel", cancellationException0, i00) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    goto label_47;
                }
            }
            case 2: {
                baseRepository0 = (BaseRepository)i00.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(baseRepository0.createCoroutineCancelErrorModel());
            }
            case 3: {
                baseRepository0 = (BaseRepository)i00.a;
                ResultKt.throwOnFailure(object0);
                goto label_52;
            }
            case 4: 
            case 5: {
                ErrorModel errorModel0 = (ErrorModel)i00.a;
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
            i00.a = baseRepository0;
            i00.d = 2;
            return baseRepository0.sendError("coroutine cancel", cancellationException0, i00) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
        }
        catch(Throwable throwable0) {
        }
    label_47:
        i00.a = baseRepository0;
        i00.d = 3;
        object0 = baseRepository0.createErrorModel(throwable0, i00);
        if(object0 == object1) {
            return object1;
        }
    label_52:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository0.getThrowableRepository().getSessionThrowable();
            i00.a = (ErrorModel)object0;
            i00.d = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), i00) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository0.getThrowableRepository().getInspectionThrowable();
            i00.a = (ErrorModel)object0;
            i00.d = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), i00) == object1) {
                return object1;
            }
        }
        return new Fail(((ErrorModel)object0));
    }

    @Override  // com.kakao.tistory.data.repository.DashboardRepository
    @NotNull
    public MutableLiveData getTopMessage() {
        return this.c;
    }

    @Override  // com.kakao.tistory.data.repository.DashboardRepository
    @Nullable
    public Object getTopMessage(@NotNull String s, @NotNull Continuation continuation0) {
        Object object2;
        BaseRepository baseRepository0;
        ErrorModel errorModel0;
        BaseRepository baseRepository2;
        BaseRepository baseRepository1;
        j0 j00;
        if(continuation0 instanceof j0) {
            j00 = (j0)continuation0;
            int v = j00.e;
            if((v & 0x80000000) == 0) {
                j00 = new j0(this, continuation0);
            }
            else {
                j00.e = v ^ 0x80000000;
            }
        }
        else {
            j00 = new j0(this, continuation0);
        }
        Object object0 = j00.c;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(j00.e) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    j00.a = this;
                    j00.b = this;
                    j00.e = 1;
                    object0 = this.a.getTopMessage(s, j00);
                }
                catch(CancellationException cancellationException1) {
                    cancellationException0 = cancellationException1;
                    baseRepository1 = this;
                    baseRepository2 = baseRepository1;
                    goto label_52;
                }
                catch(Throwable throwable1) {
                    throwable0 = throwable1;
                    baseRepository1 = this;
                    baseRepository2 = baseRepository1;
                    goto label_61;
                }
                if(object0 == object1) {
                    return object1;
                }
                baseRepository1 = this;
                baseRepository2 = baseRepository1;
                break;
            }
            case 1: {
                baseRepository1 = (BaseRepository)j00.b;
                baseRepository2 = j00.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    goto label_52;
                }
                catch(Throwable throwable0) {
                    goto label_61;
                }
            }
            case 2: {
                baseRepository1 = (BaseRepository)j00.b;
                baseRepository0 = j00.a;
                ResultKt.throwOnFailure(object0);
                object2 = new Fail(baseRepository1.createCoroutineCancelErrorModel());
                goto label_84;
            }
            case 3: {
                baseRepository1 = (BaseRepository)j00.b;
                baseRepository2 = j00.a;
                ResultKt.throwOnFailure(object0);
                goto label_67;
            }
            case 4: 
            case 5: {
                errorModel0 = (ErrorModel)j00.b;
                baseRepository0 = j00.a;
                ResultKt.throwOnFailure(object0);
                goto label_83;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            object2 = new Success(object0);
            goto label_85;
        }
        catch(CancellationException cancellationException0) {
        label_52:
            j00.a = baseRepository2;
            j00.b = baseRepository1;
            j00.e = 2;
            if(baseRepository1.sendError("coroutine cancel", cancellationException0, j00) == object1) {
                return object1;
            }
            baseRepository0 = baseRepository2;
            object2 = new Fail(baseRepository1.createCoroutineCancelErrorModel());
            goto label_84;
        }
        catch(Throwable throwable0) {
        }
    label_61:
        j00.a = baseRepository2;
        j00.b = baseRepository1;
        j00.e = 3;
        object0 = baseRepository1.createErrorModel(throwable0, j00);
        if(object0 == object1) {
            return object1;
        }
    label_67:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository1.getThrowableRepository().getSessionThrowable();
            j00.a = baseRepository2;
            j00.b = (ErrorModel)object0;
            j00.e = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), j00) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository1.getThrowableRepository().getInspectionThrowable();
            j00.a = baseRepository2;
            j00.b = (ErrorModel)object0;
            j00.e = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), j00) == object1) {
                return object1;
            }
        }
        errorModel0 = (ErrorModel)object0;
        baseRepository0 = baseRepository2;
    label_83:
        object2 = new Fail(errorModel0);
    label_84:
        baseRepository2 = baseRepository0;
    label_85:
        if(object2 instanceof Success) {
            ((DashboardRepositoryImpl)baseRepository2).getTopMessage().setValue(((TopMessage)((Success)object2).getData()));
            return object2;
        }
        if(object2 instanceof Fail && ((Fail)object2).getErrorModel().getCode() == ErrorStatus.BLOG_MIGRATING.getCode()) {
            ((DashboardRepositoryImpl)baseRepository2).getTopMessage().setValue(new TopMessage(((Fail)object2).getErrorModel().getTitle(), null));
        }
        return object2;
    }

    @Override  // com.kakao.tistory.data.repository.DashboardRepository
    @NotNull
    public MutableLiveData getTopPost() {
        return this.d;
    }

    @Override  // com.kakao.tistory.data.repository.DashboardRepository
    @Nullable
    public Object getTopPost(@NotNull String s, @NotNull Continuation continuation0) {
        BaseRepository baseRepository0;
        k0 k00;
        if(continuation0 instanceof k0) {
            k00 = (k0)continuation0;
            int v = k00.d;
            if((v & 0x80000000) == 0) {
                k00 = new k0(this, continuation0);
            }
            else {
                k00.d = v ^ 0x80000000;
            }
        }
        else {
            k00 = new k0(this, continuation0);
        }
        Object object0 = k00.b;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(k00.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    k00.a = this;
                    k00.d = 1;
                    object0 = this.a.getTopPosts(s, k00);
                }
                catch(CancellationException cancellationException0) {
                    baseRepository0 = this;
                    k00.a = baseRepository0;
                    k00.d = 2;
                    return baseRepository0.sendError("coroutine cancel", cancellationException0, k00) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
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
                baseRepository0 = (BaseRepository)k00.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    k00.a = baseRepository0;
                    k00.d = 2;
                    return baseRepository0.sendError("coroutine cancel", cancellationException0, k00) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    goto label_47;
                }
            }
            case 2: {
                baseRepository0 = (BaseRepository)k00.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(baseRepository0.createCoroutineCancelErrorModel());
            }
            case 3: {
                baseRepository0 = (BaseRepository)k00.a;
                ResultKt.throwOnFailure(object0);
                goto label_52;
            }
            case 4: 
            case 5: {
                ErrorModel errorModel0 = (ErrorModel)k00.a;
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
            k00.a = baseRepository0;
            k00.d = 2;
            return baseRepository0.sendError("coroutine cancel", cancellationException0, k00) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
        }
        catch(Throwable throwable0) {
        }
    label_47:
        k00.a = baseRepository0;
        k00.d = 3;
        object0 = baseRepository0.createErrorModel(throwable0, k00);
        if(object0 == object1) {
            return object1;
        }
    label_52:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository0.getThrowableRepository().getSessionThrowable();
            k00.a = (ErrorModel)object0;
            k00.d = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), k00) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository0.getThrowableRepository().getInspectionThrowable();
            k00.a = (ErrorModel)object0;
            k00.d = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), k00) == object1) {
                return object1;
            }
        }
        return new Fail(((ErrorModel)object0));
    }

    @Override  // com.kakao.tistory.data.repository.DashboardRepository
    @Nullable
    public Object getTopPosts(@NotNull String s, @NotNull Continuation continuation0) {
        BaseRepository baseRepository0;
        l0 l00;
        if(continuation0 instanceof l0) {
            l00 = (l0)continuation0;
            int v = l00.d;
            if((v & 0x80000000) == 0) {
                l00 = new l0(this, continuation0);
            }
            else {
                l00.d = v ^ 0x80000000;
            }
        }
        else {
            l00 = new l0(this, continuation0);
        }
        Object object0 = l00.b;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(l00.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    l00.a = this;
                    l00.d = 1;
                    object0 = this.a.getTopPosts(s, l00);
                }
                catch(CancellationException cancellationException0) {
                    baseRepository0 = this;
                    l00.a = baseRepository0;
                    l00.d = 2;
                    return baseRepository0.sendError("coroutine cancel", cancellationException0, l00) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
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
                baseRepository0 = (BaseRepository)l00.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    l00.a = baseRepository0;
                    l00.d = 2;
                    return baseRepository0.sendError("coroutine cancel", cancellationException0, l00) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    goto label_47;
                }
            }
            case 2: {
                baseRepository0 = (BaseRepository)l00.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(baseRepository0.createCoroutineCancelErrorModel());
            }
            case 3: {
                baseRepository0 = (BaseRepository)l00.a;
                ResultKt.throwOnFailure(object0);
                goto label_52;
            }
            case 4: 
            case 5: {
                ErrorModel errorModel0 = (ErrorModel)l00.a;
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
            l00.a = baseRepository0;
            l00.d = 2;
            return baseRepository0.sendError("coroutine cancel", cancellationException0, l00) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
        }
        catch(Throwable throwable0) {
        }
    label_47:
        l00.a = baseRepository0;
        l00.d = 3;
        object0 = baseRepository0.createErrorModel(throwable0, l00);
        if(object0 == object1) {
            return object1;
        }
    label_52:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository0.getThrowableRepository().getSessionThrowable();
            l00.a = (ErrorModel)object0;
            l00.d = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), l00) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository0.getThrowableRepository().getInspectionThrowable();
            l00.a = (ErrorModel)object0;
            l00.d = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), l00) == object1) {
                return object1;
            }
        }
        return new Fail(((ErrorModel)object0));
    }

    @Override  // com.kakao.tistory.data.repository.DashboardRepository
    @Nullable
    public Object getTrend(@NotNull String s, @NotNull Continuation continuation0) {
        BaseRepository baseRepository0;
        m0 m00;
        if(continuation0 instanceof m0) {
            m00 = (m0)continuation0;
            int v = m00.d;
            if((v & 0x80000000) == 0) {
                m00 = new m0(this, continuation0);
            }
            else {
                m00.d = v ^ 0x80000000;
            }
        }
        else {
            m00 = new m0(this, continuation0);
        }
        Object object0 = m00.b;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(m00.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    m00.a = this;
                    m00.d = 1;
                    object0 = this.a.getTrend(s, m00);
                }
                catch(CancellationException cancellationException0) {
                    baseRepository0 = this;
                    m00.a = baseRepository0;
                    m00.d = 2;
                    return baseRepository0.sendError("coroutine cancel", cancellationException0, m00) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
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
                baseRepository0 = (BaseRepository)m00.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    m00.a = baseRepository0;
                    m00.d = 2;
                    return baseRepository0.sendError("coroutine cancel", cancellationException0, m00) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    goto label_47;
                }
            }
            case 2: {
                baseRepository0 = (BaseRepository)m00.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(baseRepository0.createCoroutineCancelErrorModel());
            }
            case 3: {
                baseRepository0 = (BaseRepository)m00.a;
                ResultKt.throwOnFailure(object0);
                goto label_52;
            }
            case 4: 
            case 5: {
                ErrorModel errorModel0 = (ErrorModel)m00.a;
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
            m00.a = baseRepository0;
            m00.d = 2;
            return baseRepository0.sendError("coroutine cancel", cancellationException0, m00) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
        }
        catch(Throwable throwable0) {
        }
    label_47:
        m00.a = baseRepository0;
        m00.d = 3;
        object0 = baseRepository0.createErrorModel(throwable0, m00);
        if(object0 == object1) {
            return object1;
        }
    label_52:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository0.getThrowableRepository().getSessionThrowable();
            m00.a = (ErrorModel)object0;
            m00.d = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), m00) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository0.getThrowableRepository().getInspectionThrowable();
            m00.a = (ErrorModel)object0;
            m00.d = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), m00) == object1) {
                return object1;
            }
        }
        return new Fail(((ErrorModel)object0));
    }
}

