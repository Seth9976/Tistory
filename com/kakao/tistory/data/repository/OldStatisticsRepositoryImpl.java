package com.kakao.tistory.data.repository;

import com.kakao.android.base.model.ErrorModel;
import com.kakao.tistory.data.service.OldBlogStatisticsService;
import com.kakao.tistory.data.service.OldEntryStatisticsService;
import com.kakao.tistory.domain.ErrorStatusKt;
import com.kakao.tistory.domain.entity.common.ItemModel;
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

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u00A2\u0006\u0004\b\u0007\u0010\bJ<\u0010\u0011\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000F0\u000E2\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\u000B\u001A\u00020\t2\u0006\u0010\f\u001A\u00020\t2\u0006\u0010\r\u001A\u00020\tH\u0096@\u00A2\u0006\u0004\b\u0011\u0010\u0012J<\u0010\u0015\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000F0\u000E2\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\u0014\u001A\u00020\u00132\u0006\u0010\u000B\u001A\u00020\t2\u0006\u0010\f\u001A\u00020\tH\u0096@\u00A2\u0006\u0004\b\u0015\u0010\u0016J.\u0010\u0019\u001A\b\u0012\u0004\u0012\u00020\u00180\u000E2\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\u0014\u001A\u00020\u00132\u0006\u0010\u0017\u001A\u00020\tH\u0096@\u00A2\u0006\u0004\b\u0019\u0010\u001AJ6\u0010\u001C\u001A\b\u0012\u0004\u0012\u00020\u001B0\u000E2\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\u0014\u001A\u00020\u00132\u0006\u0010\u000B\u001A\u00020\t2\u0006\u0010\f\u001A\u00020\tH\u0096@\u00A2\u0006\u0004\b\u001C\u0010\u0016J6\u0010\u001E\u001A\b\u0012\u0004\u0012\u00020\u001D0\u000E2\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\u0014\u001A\u00020\u00132\u0006\u0010\u000B\u001A\u00020\t2\u0006\u0010\f\u001A\u00020\tH\u0096@\u00A2\u0006\u0004\b\u001E\u0010\u0016J<\u0010 \u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001F0\u000F0\u000E2\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\u0014\u001A\u00020\u00132\u0006\u0010\u000B\u001A\u00020\t2\u0006\u0010\f\u001A\u00020\tH\u0096@\u00A2\u0006\u0004\b \u0010\u0016J<\u0010!\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u000F0\u000E2\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\u0014\u001A\u00020\u00132\u0006\u0010\u000B\u001A\u00020\t2\u0006\u0010\f\u001A\u00020\tH\u0096@\u00A2\u0006\u0004\b!\u0010\u0016J6\u0010\"\u001A\b\u0012\u0004\u0012\u00020\u001B0\u000E2\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\u000B\u001A\u00020\t2\u0006\u0010\f\u001A\u00020\t2\u0006\u0010\r\u001A\u00020\tH\u0096@\u00A2\u0006\u0004\b\"\u0010\u0012J4\u0010$\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u000F0\u000E2\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\u000B\u001A\u00020\t2\u0006\u0010\f\u001A\u00020\tH\u0096@\u00A2\u0006\u0004\b$\u0010%J6\u0010&\u001A\b\u0012\u0004\u0012\u00020\u001D0\u000E2\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\u000B\u001A\u00020\t2\u0006\u0010\f\u001A\u00020\t2\u0006\u0010\r\u001A\u00020\tH\u0096@\u00A2\u0006\u0004\b&\u0010\u0012J<\u0010\'\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001F0\u000F0\u000E2\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\u000B\u001A\u00020\t2\u0006\u0010\f\u001A\u00020\t2\u0006\u0010\r\u001A\u00020\tH\u0096@\u00A2\u0006\u0004\b\'\u0010\u0012J<\u0010(\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u000F0\u000E2\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\u000B\u001A\u00020\t2\u0006\u0010\f\u001A\u00020\t2\u0006\u0010\r\u001A\u00020\tH\u0096@\u00A2\u0006\u0004\b(\u0010\u0012\u00A8\u0006)"}, d2 = {"Lcom/kakao/tistory/data/repository/OldStatisticsRepositoryImpl;", "Lcom/kakao/tistory/data/repository/BaseRepository;", "Lcom/kakao/tistory/data/repository/OldStatisticsRepository;", "Lcom/kakao/tistory/data/service/OldBlogStatisticsService;", "blogStatisticsService", "Lcom/kakao/tistory/data/service/OldEntryStatisticsService;", "entryStatisticsService", "<init>", "(Lcom/kakao/tistory/data/service/OldBlogStatisticsService;Lcom/kakao/tistory/data/service/OldEntryStatisticsService;)V", "", "blogName", "date", "granularity", "metric", "Lcom/kakao/tistory/domain/entity/common/Result;", "Lcom/kakao/tistory/domain/entity/common/ItemListModel;", "Lcom/kakao/tistory/data/model/RefererEtcItem;", "getBlogRefererEtc", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "entryId", "getEntryRefererEtc", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "keyword", "Lcom/kakao/tistory/data/model/StatisticsItem$RefererKeywordItem;", "getKeywordInfo", "(Ljava/lang/String;JLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/kakao/tistory/data/model/StatisticsItem$Trend;", "getEntryTrendMore", "Lcom/kakao/tistory/data/model/StatisticsItem$RefererChannel;", "getEntryRefererChannels", "Lcom/kakao/tistory/data/model/StatisticsItem$RefererRankItem;", "getEntryRefererRanks", "getEntryRefererKeywords", "getBlogTrendMore", "Lcom/kakao/tistory/data/model/StatisticsItem$TopPostItem;", "getBlogTopPosts", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBlogRefererChannels", "getBlogRefererRanks", "getBlogRefererKeywords", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nOldStatisticsRepositoryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OldStatisticsRepositoryImpl.kt\ncom/kakao/tistory/data/repository/OldStatisticsRepositoryImpl\n+ 2 BaseRepository.kt\ncom/kakao/tistory/data/repository/BaseRepository\n+ 3 BaseRepository.kt\ncom/kakao/tistory/data/repository/BaseRepository$checkError$2\n*L\n1#1,151:1\n26#2,27:152\n53#2:180\n26#2,27:181\n53#2:209\n35#2:210\n26#2,27:211\n53#2:239\n35#2:240\n26#2,27:241\n53#2:269\n35#2:270\n26#2,27:271\n53#2:299\n35#2:300\n26#2,27:301\n53#2:329\n35#2:330\n26#2,27:331\n53#2:359\n35#2:360\n26#2,27:361\n53#2:389\n35#2:390\n26#2,27:391\n53#2:419\n35#2:420\n26#2,27:421\n53#2:449\n35#2:450\n26#2,27:451\n53#2:479\n35#2:480\n26#2,27:481\n53#2:509\n35#2:510\n39#3:179\n39#3:208\n39#3:238\n39#3:268\n39#3:298\n39#3:328\n39#3:358\n39#3:388\n39#3:418\n39#3:448\n39#3:478\n39#3:508\n*S KotlinDebug\n*F\n+ 1 OldStatisticsRepositoryImpl.kt\ncom/kakao/tistory/data/repository/OldStatisticsRepositoryImpl\n*L\n25#1:152,27\n25#1:180\n34#1:181,27\n34#1:209\n34#1:210\n49#1:211,27\n49#1:239\n49#1:240\n64#1:241,27\n64#1:269\n64#1:270\n73#1:271,27\n73#1:299\n73#1:300\n89#1:301,27\n89#1:329\n89#1:330\n105#1:331,27\n105#1:359\n105#1:360\n114#1:361,27\n114#1:389\n114#1:390\n122#1:391,27\n122#1:419\n122#1:420\n131#1:421,27\n131#1:449\n131#1:450\n140#1:451,27\n140#1:479\n140#1:480\n149#1:481,27\n149#1:509\n149#1:510\n25#1:179\n34#1:208\n49#1:238\n64#1:268\n73#1:298\n89#1:328\n105#1:358\n114#1:388\n122#1:418\n131#1:448\n140#1:478\n149#1:508\n*E\n"})
public final class OldStatisticsRepositoryImpl extends BaseRepository implements OldStatisticsRepository {
    public final OldBlogStatisticsService a;
    public final OldEntryStatisticsService b;

    @Inject
    public OldStatisticsRepositoryImpl(@NotNull OldBlogStatisticsService oldBlogStatisticsService0, @NotNull OldEntryStatisticsService oldEntryStatisticsService0) {
        Intrinsics.checkNotNullParameter(oldBlogStatisticsService0, "blogStatisticsService");
        Intrinsics.checkNotNullParameter(oldEntryStatisticsService0, "entryStatisticsService");
        super();
        this.a = oldBlogStatisticsService0;
        this.b = oldEntryStatisticsService0;
    }

    @Override  // com.kakao.tistory.data.repository.OldStatisticsRepository
    @Nullable
    public Object getBlogRefererChannels(@NotNull String s, @NotNull String s1, @NotNull String s2, @NotNull String s3, @NotNull Continuation continuation0) {
        BaseRepository baseRepository1;
        x2 x20;
        if(continuation0 instanceof x2) {
            x20 = (x2)continuation0;
            int v = x20.d;
            if((v & 0x80000000) == 0) {
                x20 = new x2(this, continuation0);
            }
            else {
                x20.d = v ^ 0x80000000;
            }
        }
        else {
            x20 = new x2(this, continuation0);
        }
        Object object0 = x20.b;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(x20.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    x20.a = this;
                    x20.d = 1;
                    object0 = this.a.getRefererChannels(s, s1, s2, s3, x20);
                }
                catch(CancellationException cancellationException0) {
                    baseRepository1 = this;
                    x20.a = baseRepository1;
                    x20.d = 2;
                    return baseRepository1.sendError("coroutine cancel", cancellationException0, x20) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
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
                baseRepository1 = (BaseRepository)x20.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    x20.a = baseRepository1;
                    x20.d = 2;
                    return baseRepository1.sendError("coroutine cancel", cancellationException0, x20) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    goto label_47;
                }
            }
            case 2: {
                BaseRepository baseRepository0 = (BaseRepository)x20.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(baseRepository0.createCoroutineCancelErrorModel());
            }
            case 3: {
                baseRepository1 = (BaseRepository)x20.a;
                ResultKt.throwOnFailure(object0);
                goto label_52;
            }
            case 4: 
            case 5: {
                ErrorModel errorModel0 = (ErrorModel)x20.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(errorModel0);
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            return new Success(((ItemModel)object0).getData());
        }
        catch(CancellationException cancellationException0) {
            x20.a = baseRepository1;
            x20.d = 2;
            return baseRepository1.sendError("coroutine cancel", cancellationException0, x20) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
        }
        catch(Throwable throwable0) {
        }
    label_47:
        x20.a = baseRepository1;
        x20.d = 3;
        object0 = baseRepository1.createErrorModel(throwable0, x20);
        if(object0 == object1) {
            return object1;
        }
    label_52:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository1.getThrowableRepository().getSessionThrowable();
            x20.a = (ErrorModel)object0;
            x20.d = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), x20) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository1.getThrowableRepository().getInspectionThrowable();
            x20.a = (ErrorModel)object0;
            x20.d = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), x20) == object1) {
                return object1;
            }
        }
        return new Fail(((ErrorModel)object0));
    }

    @Override  // com.kakao.tistory.data.repository.OldStatisticsRepository
    @Nullable
    public Object getBlogRefererEtc(@NotNull String s, @NotNull String s1, @NotNull String s2, @NotNull String s3, @NotNull Continuation continuation0) {
        BaseRepository baseRepository1;
        y2 y20;
        if(continuation0 instanceof y2) {
            y20 = (y2)continuation0;
            int v = y20.d;
            if((v & 0x80000000) == 0) {
                y20 = new y2(this, continuation0);
            }
            else {
                y20.d = v ^ 0x80000000;
            }
        }
        else {
            y20 = new y2(this, continuation0);
        }
        Object object0 = y20.b;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(y20.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    y20.a = this;
                    y20.d = 1;
                    object0 = this.a.getRefererEtc(s, s1, s2, s3, y20);
                }
                catch(CancellationException cancellationException0) {
                    baseRepository1 = this;
                    y20.a = baseRepository1;
                    y20.d = 2;
                    return baseRepository1.sendError("coroutine cancel", cancellationException0, y20) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
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
                baseRepository1 = (BaseRepository)y20.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    y20.a = baseRepository1;
                    y20.d = 2;
                    return baseRepository1.sendError("coroutine cancel", cancellationException0, y20) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    goto label_47;
                }
            }
            case 2: {
                BaseRepository baseRepository0 = (BaseRepository)y20.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(baseRepository0.createCoroutineCancelErrorModel());
            }
            case 3: {
                baseRepository1 = (BaseRepository)y20.a;
                ResultKt.throwOnFailure(object0);
                goto label_52;
            }
            case 4: 
            case 5: {
                ErrorModel errorModel0 = (ErrorModel)y20.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(errorModel0);
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            return new Success(((ItemModel)object0).getData());
        }
        catch(CancellationException cancellationException0) {
            y20.a = baseRepository1;
            y20.d = 2;
            return baseRepository1.sendError("coroutine cancel", cancellationException0, y20) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
        }
        catch(Throwable throwable0) {
        }
    label_47:
        y20.a = baseRepository1;
        y20.d = 3;
        object0 = baseRepository1.createErrorModel(throwable0, y20);
        if(object0 == object1) {
            return object1;
        }
    label_52:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository1.getThrowableRepository().getSessionThrowable();
            y20.a = (ErrorModel)object0;
            y20.d = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), y20) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository1.getThrowableRepository().getInspectionThrowable();
            y20.a = (ErrorModel)object0;
            y20.d = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), y20) == object1) {
                return object1;
            }
        }
        return new Fail(((ErrorModel)object0));
    }

    @Override  // com.kakao.tistory.data.repository.OldStatisticsRepository
    @Nullable
    public Object getBlogRefererKeywords(@NotNull String s, @NotNull String s1, @NotNull String s2, @NotNull String s3, @NotNull Continuation continuation0) {
        BaseRepository baseRepository1;
        z2 z20;
        if(continuation0 instanceof z2) {
            z20 = (z2)continuation0;
            int v = z20.d;
            if((v & 0x80000000) == 0) {
                z20 = new z2(this, continuation0);
            }
            else {
                z20.d = v ^ 0x80000000;
            }
        }
        else {
            z20 = new z2(this, continuation0);
        }
        Object object0 = z20.b;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(z20.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    z20.a = this;
                    z20.d = 1;
                    object0 = this.a.getRefererKeywords(s, s1, s2, s3, z20);
                }
                catch(CancellationException cancellationException0) {
                    baseRepository1 = this;
                    z20.a = baseRepository1;
                    z20.d = 2;
                    return baseRepository1.sendError("coroutine cancel", cancellationException0, z20) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
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
                baseRepository1 = (BaseRepository)z20.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    z20.a = baseRepository1;
                    z20.d = 2;
                    return baseRepository1.sendError("coroutine cancel", cancellationException0, z20) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    goto label_47;
                }
            }
            case 2: {
                BaseRepository baseRepository0 = (BaseRepository)z20.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(baseRepository0.createCoroutineCancelErrorModel());
            }
            case 3: {
                baseRepository1 = (BaseRepository)z20.a;
                ResultKt.throwOnFailure(object0);
                goto label_52;
            }
            case 4: 
            case 5: {
                ErrorModel errorModel0 = (ErrorModel)z20.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(errorModel0);
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            return new Success(((ItemModel)object0).getData());
        }
        catch(CancellationException cancellationException0) {
            z20.a = baseRepository1;
            z20.d = 2;
            return baseRepository1.sendError("coroutine cancel", cancellationException0, z20) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
        }
        catch(Throwable throwable0) {
        }
    label_47:
        z20.a = baseRepository1;
        z20.d = 3;
        object0 = baseRepository1.createErrorModel(throwable0, z20);
        if(object0 == object1) {
            return object1;
        }
    label_52:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository1.getThrowableRepository().getSessionThrowable();
            z20.a = (ErrorModel)object0;
            z20.d = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), z20) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository1.getThrowableRepository().getInspectionThrowable();
            z20.a = (ErrorModel)object0;
            z20.d = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), z20) == object1) {
                return object1;
            }
        }
        return new Fail(((ErrorModel)object0));
    }

    @Override  // com.kakao.tistory.data.repository.OldStatisticsRepository
    @Nullable
    public Object getBlogRefererRanks(@NotNull String s, @NotNull String s1, @NotNull String s2, @NotNull String s3, @NotNull Continuation continuation0) {
        BaseRepository baseRepository1;
        a3 a30;
        if(continuation0 instanceof a3) {
            a30 = (a3)continuation0;
            int v = a30.d;
            if((v & 0x80000000) == 0) {
                a30 = new a3(this, continuation0);
            }
            else {
                a30.d = v ^ 0x80000000;
            }
        }
        else {
            a30 = new a3(this, continuation0);
        }
        Object object0 = a30.b;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(a30.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    a30.a = this;
                    a30.d = 1;
                    object0 = this.a.getRefererRanks(s, s1, s2, s3, a30);
                }
                catch(CancellationException cancellationException0) {
                    baseRepository1 = this;
                    a30.a = baseRepository1;
                    a30.d = 2;
                    return baseRepository1.sendError("coroutine cancel", cancellationException0, a30) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
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
                baseRepository1 = (BaseRepository)a30.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    a30.a = baseRepository1;
                    a30.d = 2;
                    return baseRepository1.sendError("coroutine cancel", cancellationException0, a30) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    goto label_47;
                }
            }
            case 2: {
                BaseRepository baseRepository0 = (BaseRepository)a30.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(baseRepository0.createCoroutineCancelErrorModel());
            }
            case 3: {
                baseRepository1 = (BaseRepository)a30.a;
                ResultKt.throwOnFailure(object0);
                goto label_52;
            }
            case 4: 
            case 5: {
                ErrorModel errorModel0 = (ErrorModel)a30.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(errorModel0);
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            return new Success(((ItemModel)object0).getData());
        }
        catch(CancellationException cancellationException0) {
            a30.a = baseRepository1;
            a30.d = 2;
            return baseRepository1.sendError("coroutine cancel", cancellationException0, a30) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
        }
        catch(Throwable throwable0) {
        }
    label_47:
        a30.a = baseRepository1;
        a30.d = 3;
        object0 = baseRepository1.createErrorModel(throwable0, a30);
        if(object0 == object1) {
            return object1;
        }
    label_52:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository1.getThrowableRepository().getSessionThrowable();
            a30.a = (ErrorModel)object0;
            a30.d = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), a30) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository1.getThrowableRepository().getInspectionThrowable();
            a30.a = (ErrorModel)object0;
            a30.d = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), a30) == object1) {
                return object1;
            }
        }
        return new Fail(((ErrorModel)object0));
    }

    @Override  // com.kakao.tistory.data.repository.OldStatisticsRepository
    @Nullable
    public Object getBlogTopPosts(@NotNull String s, @NotNull String s1, @NotNull String s2, @NotNull Continuation continuation0) {
        BaseRepository baseRepository0;
        b3 b30;
        if(continuation0 instanceof b3) {
            b30 = (b3)continuation0;
            int v = b30.d;
            if((v & 0x80000000) == 0) {
                b30 = new b3(this, continuation0);
            }
            else {
                b30.d = v ^ 0x80000000;
            }
        }
        else {
            b30 = new b3(this, continuation0);
        }
        Object object0 = b30.b;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(b30.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    b30.a = this;
                    b30.d = 1;
                    object0 = this.a.getTopPosts(s, s1, s2, b30);
                }
                catch(CancellationException cancellationException0) {
                    baseRepository0 = this;
                    b30.a = baseRepository0;
                    b30.d = 2;
                    return baseRepository0.sendError("coroutine cancel", cancellationException0, b30) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
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
                baseRepository0 = (BaseRepository)b30.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    b30.a = baseRepository0;
                    b30.d = 2;
                    return baseRepository0.sendError("coroutine cancel", cancellationException0, b30) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    goto label_47;
                }
            }
            case 2: {
                baseRepository0 = (BaseRepository)b30.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(baseRepository0.createCoroutineCancelErrorModel());
            }
            case 3: {
                baseRepository0 = (BaseRepository)b30.a;
                ResultKt.throwOnFailure(object0);
                goto label_52;
            }
            case 4: 
            case 5: {
                ErrorModel errorModel0 = (ErrorModel)b30.a;
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
            b30.a = baseRepository0;
            b30.d = 2;
            return baseRepository0.sendError("coroutine cancel", cancellationException0, b30) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
        }
        catch(Throwable throwable0) {
        }
    label_47:
        b30.a = baseRepository0;
        b30.d = 3;
        object0 = baseRepository0.createErrorModel(throwable0, b30);
        if(object0 == object1) {
            return object1;
        }
    label_52:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository0.getThrowableRepository().getSessionThrowable();
            b30.a = (ErrorModel)object0;
            b30.d = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), b30) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository0.getThrowableRepository().getInspectionThrowable();
            b30.a = (ErrorModel)object0;
            b30.d = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), b30) == object1) {
                return object1;
            }
        }
        return new Fail(((ErrorModel)object0));
    }

    @Override  // com.kakao.tistory.data.repository.OldStatisticsRepository
    @Nullable
    public Object getBlogTrendMore(@NotNull String s, @NotNull String s1, @NotNull String s2, @NotNull String s3, @NotNull Continuation continuation0) {
        BaseRepository baseRepository1;
        c3 c30;
        if(continuation0 instanceof c3) {
            c30 = (c3)continuation0;
            int v = c30.d;
            if((v & 0x80000000) == 0) {
                c30 = new c3(this, continuation0);
            }
            else {
                c30.d = v ^ 0x80000000;
            }
        }
        else {
            c30 = new c3(this, continuation0);
        }
        Object object0 = c30.b;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(c30.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    c30.a = this;
                    c30.d = 1;
                    object0 = this.a.getTrends(s, s1, s2, s3, c30);
                }
                catch(CancellationException cancellationException0) {
                    baseRepository1 = this;
                    c30.a = baseRepository1;
                    c30.d = 2;
                    return baseRepository1.sendError("coroutine cancel", cancellationException0, c30) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
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
                baseRepository1 = (BaseRepository)c30.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    c30.a = baseRepository1;
                    c30.d = 2;
                    return baseRepository1.sendError("coroutine cancel", cancellationException0, c30) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    goto label_47;
                }
            }
            case 2: {
                BaseRepository baseRepository0 = (BaseRepository)c30.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(baseRepository0.createCoroutineCancelErrorModel());
            }
            case 3: {
                baseRepository1 = (BaseRepository)c30.a;
                ResultKt.throwOnFailure(object0);
                goto label_52;
            }
            case 4: 
            case 5: {
                ErrorModel errorModel0 = (ErrorModel)c30.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(errorModel0);
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            return new Success(((ItemModel)object0).getData());
        }
        catch(CancellationException cancellationException0) {
            c30.a = baseRepository1;
            c30.d = 2;
            return baseRepository1.sendError("coroutine cancel", cancellationException0, c30) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
        }
        catch(Throwable throwable0) {
        }
    label_47:
        c30.a = baseRepository1;
        c30.d = 3;
        object0 = baseRepository1.createErrorModel(throwable0, c30);
        if(object0 == object1) {
            return object1;
        }
    label_52:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository1.getThrowableRepository().getSessionThrowable();
            c30.a = (ErrorModel)object0;
            c30.d = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), c30) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository1.getThrowableRepository().getInspectionThrowable();
            c30.a = (ErrorModel)object0;
            c30.d = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), c30) == object1) {
                return object1;
            }
        }
        return new Fail(((ErrorModel)object0));
    }

    @Override  // com.kakao.tistory.data.repository.OldStatisticsRepository
    @Nullable
    public Object getEntryRefererChannels(@NotNull String s, long v, @NotNull String s1, @NotNull String s2, @NotNull Continuation continuation0) {
        BaseRepository baseRepository1;
        d3 d30;
        if(continuation0 instanceof d3) {
            d30 = (d3)continuation0;
            int v1 = d30.d;
            if((v1 & 0x80000000) == 0) {
                d30 = new d3(this, continuation0);
            }
            else {
                d30.d = v1 ^ 0x80000000;
            }
        }
        else {
            d30 = new d3(this, continuation0);
        }
        Object object0 = d30.b;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(d30.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    d30.a = this;
                    d30.d = 1;
                    object0 = this.b.getRefererChannels(s, v, s1, s2, d30);
                }
                catch(CancellationException cancellationException0) {
                    baseRepository1 = this;
                    d30.a = baseRepository1;
                    d30.d = 2;
                    return baseRepository1.sendError("coroutine cancel", cancellationException0, d30) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
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
                baseRepository1 = (BaseRepository)d30.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    d30.a = baseRepository1;
                    d30.d = 2;
                    return baseRepository1.sendError("coroutine cancel", cancellationException0, d30) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    goto label_47;
                }
            }
            case 2: {
                BaseRepository baseRepository0 = (BaseRepository)d30.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(baseRepository0.createCoroutineCancelErrorModel());
            }
            case 3: {
                baseRepository1 = (BaseRepository)d30.a;
                ResultKt.throwOnFailure(object0);
                goto label_52;
            }
            case 4: 
            case 5: {
                ErrorModel errorModel0 = (ErrorModel)d30.a;
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
            d30.a = baseRepository1;
            d30.d = 2;
            return baseRepository1.sendError("coroutine cancel", cancellationException0, d30) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
        }
        catch(Throwable throwable0) {
        }
    label_47:
        d30.a = baseRepository1;
        d30.d = 3;
        object0 = baseRepository1.createErrorModel(throwable0, d30);
        if(object0 == object1) {
            return object1;
        }
    label_52:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository1.getThrowableRepository().getSessionThrowable();
            d30.a = (ErrorModel)object0;
            d30.d = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), d30) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository1.getThrowableRepository().getInspectionThrowable();
            d30.a = (ErrorModel)object0;
            d30.d = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), d30) == object1) {
                return object1;
            }
        }
        return new Fail(((ErrorModel)object0));
    }

    @Override  // com.kakao.tistory.data.repository.OldStatisticsRepository
    @Nullable
    public Object getEntryRefererEtc(@NotNull String s, long v, @NotNull String s1, @NotNull String s2, @NotNull Continuation continuation0) {
        BaseRepository baseRepository1;
        e3 e30;
        if(continuation0 instanceof e3) {
            e30 = (e3)continuation0;
            int v1 = e30.d;
            if((v1 & 0x80000000) == 0) {
                e30 = new e3(this, continuation0);
            }
            else {
                e30.d = v1 ^ 0x80000000;
            }
        }
        else {
            e30 = new e3(this, continuation0);
        }
        Object object0 = e30.b;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(e30.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    e30.a = this;
                    e30.d = 1;
                    object0 = this.b.getRefererEtc(s, v, s1, s2, e30);
                }
                catch(CancellationException cancellationException0) {
                    baseRepository1 = this;
                    e30.a = baseRepository1;
                    e30.d = 2;
                    return baseRepository1.sendError("coroutine cancel", cancellationException0, e30) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
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
                baseRepository1 = (BaseRepository)e30.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    e30.a = baseRepository1;
                    e30.d = 2;
                    return baseRepository1.sendError("coroutine cancel", cancellationException0, e30) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    goto label_47;
                }
            }
            case 2: {
                BaseRepository baseRepository0 = (BaseRepository)e30.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(baseRepository0.createCoroutineCancelErrorModel());
            }
            case 3: {
                baseRepository1 = (BaseRepository)e30.a;
                ResultKt.throwOnFailure(object0);
                goto label_52;
            }
            case 4: 
            case 5: {
                ErrorModel errorModel0 = (ErrorModel)e30.a;
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
            e30.a = baseRepository1;
            e30.d = 2;
            return baseRepository1.sendError("coroutine cancel", cancellationException0, e30) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
        }
        catch(Throwable throwable0) {
        }
    label_47:
        e30.a = baseRepository1;
        e30.d = 3;
        object0 = baseRepository1.createErrorModel(throwable0, e30);
        if(object0 == object1) {
            return object1;
        }
    label_52:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository1.getThrowableRepository().getSessionThrowable();
            e30.a = (ErrorModel)object0;
            e30.d = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), e30) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository1.getThrowableRepository().getInspectionThrowable();
            e30.a = (ErrorModel)object0;
            e30.d = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), e30) == object1) {
                return object1;
            }
        }
        return new Fail(((ErrorModel)object0));
    }

    @Override  // com.kakao.tistory.data.repository.OldStatisticsRepository
    @Nullable
    public Object getEntryRefererKeywords(@NotNull String s, long v, @NotNull String s1, @NotNull String s2, @NotNull Continuation continuation0) {
        BaseRepository baseRepository0;
        f3 f30;
        if(continuation0 instanceof f3) {
            f30 = (f3)continuation0;
            int v1 = f30.d;
            if((v1 & 0x80000000) == 0) {
                f30 = new f3(this, continuation0);
            }
            else {
                f30.d = v1 ^ 0x80000000;
            }
        }
        else {
            f30 = new f3(this, continuation0);
        }
        Object object0 = f30.b;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(f30.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    f30.a = this;
                    f30.d = 1;
                    object0 = this.b.getRefererKeywords(s, v, f30);
                }
                catch(CancellationException cancellationException0) {
                    baseRepository0 = this;
                    f30.a = baseRepository0;
                    f30.d = 2;
                    return baseRepository0.sendError("coroutine cancel", cancellationException0, f30) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
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
                baseRepository0 = (BaseRepository)f30.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    f30.a = baseRepository0;
                    f30.d = 2;
                    return baseRepository0.sendError("coroutine cancel", cancellationException0, f30) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    goto label_47;
                }
            }
            case 2: {
                baseRepository0 = (BaseRepository)f30.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(baseRepository0.createCoroutineCancelErrorModel());
            }
            case 3: {
                baseRepository0 = (BaseRepository)f30.a;
                ResultKt.throwOnFailure(object0);
                goto label_52;
            }
            case 4: 
            case 5: {
                ErrorModel errorModel0 = (ErrorModel)f30.a;
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
            f30.a = baseRepository0;
            f30.d = 2;
            return baseRepository0.sendError("coroutine cancel", cancellationException0, f30) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
        }
        catch(Throwable throwable0) {
        }
    label_47:
        f30.a = baseRepository0;
        f30.d = 3;
        object0 = baseRepository0.createErrorModel(throwable0, f30);
        if(object0 == object1) {
            return object1;
        }
    label_52:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository0.getThrowableRepository().getSessionThrowable();
            f30.a = (ErrorModel)object0;
            f30.d = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), f30) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository0.getThrowableRepository().getInspectionThrowable();
            f30.a = (ErrorModel)object0;
            f30.d = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), f30) == object1) {
                return object1;
            }
        }
        return new Fail(((ErrorModel)object0));
    }

    @Override  // com.kakao.tistory.data.repository.OldStatisticsRepository
    @Nullable
    public Object getEntryRefererRanks(@NotNull String s, long v, @NotNull String s1, @NotNull String s2, @NotNull Continuation continuation0) {
        BaseRepository baseRepository1;
        g3 g30;
        if(continuation0 instanceof g3) {
            g30 = (g3)continuation0;
            int v1 = g30.d;
            if((v1 & 0x80000000) == 0) {
                g30 = new g3(this, continuation0);
            }
            else {
                g30.d = v1 ^ 0x80000000;
            }
        }
        else {
            g30 = new g3(this, continuation0);
        }
        Object object0 = g30.b;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(g30.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    g30.a = this;
                    g30.d = 1;
                    object0 = this.b.getRefererRanks(s, v, s1, s2, g30);
                }
                catch(CancellationException cancellationException0) {
                    baseRepository1 = this;
                    g30.a = baseRepository1;
                    g30.d = 2;
                    return baseRepository1.sendError("coroutine cancel", cancellationException0, g30) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
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
                baseRepository1 = (BaseRepository)g30.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    g30.a = baseRepository1;
                    g30.d = 2;
                    return baseRepository1.sendError("coroutine cancel", cancellationException0, g30) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    goto label_47;
                }
            }
            case 2: {
                BaseRepository baseRepository0 = (BaseRepository)g30.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(baseRepository0.createCoroutineCancelErrorModel());
            }
            case 3: {
                baseRepository1 = (BaseRepository)g30.a;
                ResultKt.throwOnFailure(object0);
                goto label_52;
            }
            case 4: 
            case 5: {
                ErrorModel errorModel0 = (ErrorModel)g30.a;
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
            g30.a = baseRepository1;
            g30.d = 2;
            return baseRepository1.sendError("coroutine cancel", cancellationException0, g30) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
        }
        catch(Throwable throwable0) {
        }
    label_47:
        g30.a = baseRepository1;
        g30.d = 3;
        object0 = baseRepository1.createErrorModel(throwable0, g30);
        if(object0 == object1) {
            return object1;
        }
    label_52:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository1.getThrowableRepository().getSessionThrowable();
            g30.a = (ErrorModel)object0;
            g30.d = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), g30) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository1.getThrowableRepository().getInspectionThrowable();
            g30.a = (ErrorModel)object0;
            g30.d = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), g30) == object1) {
                return object1;
            }
        }
        return new Fail(((ErrorModel)object0));
    }

    @Override  // com.kakao.tistory.data.repository.OldStatisticsRepository
    @Nullable
    public Object getEntryTrendMore(@NotNull String s, long v, @NotNull String s1, @NotNull String s2, @NotNull Continuation continuation0) {
        BaseRepository baseRepository1;
        h3 h30;
        if(continuation0 instanceof h3) {
            h30 = (h3)continuation0;
            int v1 = h30.d;
            if((v1 & 0x80000000) == 0) {
                h30 = new h3(this, continuation0);
            }
            else {
                h30.d = v1 ^ 0x80000000;
            }
        }
        else {
            h30 = new h3(this, continuation0);
        }
        Object object0 = h30.b;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(h30.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    h30.a = this;
                    h30.d = 1;
                    object0 = this.b.getTrends(s, v, s1, s2, h30);
                }
                catch(CancellationException cancellationException0) {
                    baseRepository1 = this;
                    h30.a = baseRepository1;
                    h30.d = 2;
                    return baseRepository1.sendError("coroutine cancel", cancellationException0, h30) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
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
                baseRepository1 = (BaseRepository)h30.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    h30.a = baseRepository1;
                    h30.d = 2;
                    return baseRepository1.sendError("coroutine cancel", cancellationException0, h30) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    goto label_47;
                }
            }
            case 2: {
                BaseRepository baseRepository0 = (BaseRepository)h30.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(baseRepository0.createCoroutineCancelErrorModel());
            }
            case 3: {
                baseRepository1 = (BaseRepository)h30.a;
                ResultKt.throwOnFailure(object0);
                goto label_52;
            }
            case 4: 
            case 5: {
                ErrorModel errorModel0 = (ErrorModel)h30.a;
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
            h30.a = baseRepository1;
            h30.d = 2;
            return baseRepository1.sendError("coroutine cancel", cancellationException0, h30) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
        }
        catch(Throwable throwable0) {
        }
    label_47:
        h30.a = baseRepository1;
        h30.d = 3;
        object0 = baseRepository1.createErrorModel(throwable0, h30);
        if(object0 == object1) {
            return object1;
        }
    label_52:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository1.getThrowableRepository().getSessionThrowable();
            h30.a = (ErrorModel)object0;
            h30.d = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), h30) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository1.getThrowableRepository().getInspectionThrowable();
            h30.a = (ErrorModel)object0;
            h30.d = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), h30) == object1) {
                return object1;
            }
        }
        return new Fail(((ErrorModel)object0));
    }

    @Override  // com.kakao.tistory.data.repository.OldStatisticsRepository
    @Nullable
    public Object getKeywordInfo(@NotNull String s, long v, @NotNull String s1, @NotNull Continuation continuation0) {
        BaseRepository baseRepository1;
        i3 i30;
        if(continuation0 instanceof i3) {
            i30 = (i3)continuation0;
            int v1 = i30.d;
            if((v1 & 0x80000000) == 0) {
                i30 = new i3(this, continuation0);
            }
            else {
                i30.d = v1 ^ 0x80000000;
            }
        }
        else {
            i30 = new i3(this, continuation0);
        }
        Object object0 = i30.b;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(i30.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    i30.a = this;
                    i30.d = 1;
                    object0 = this.b.getRefererKeywordInfo(s, v, s1, i30);
                }
                catch(CancellationException cancellationException0) {
                    baseRepository1 = this;
                    i30.a = baseRepository1;
                    i30.d = 2;
                    return baseRepository1.sendError("coroutine cancel", cancellationException0, i30) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
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
                baseRepository1 = (BaseRepository)i30.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    i30.a = baseRepository1;
                    i30.d = 2;
                    return baseRepository1.sendError("coroutine cancel", cancellationException0, i30) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    goto label_47;
                }
            }
            case 2: {
                BaseRepository baseRepository0 = (BaseRepository)i30.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(baseRepository0.createCoroutineCancelErrorModel());
            }
            case 3: {
                baseRepository1 = (BaseRepository)i30.a;
                ResultKt.throwOnFailure(object0);
                goto label_52;
            }
            case 4: 
            case 5: {
                ErrorModel errorModel0 = (ErrorModel)i30.a;
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
            i30.a = baseRepository1;
            i30.d = 2;
            return baseRepository1.sendError("coroutine cancel", cancellationException0, i30) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
        }
        catch(Throwable throwable0) {
        }
    label_47:
        i30.a = baseRepository1;
        i30.d = 3;
        object0 = baseRepository1.createErrorModel(throwable0, i30);
        if(object0 == object1) {
            return object1;
        }
    label_52:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository1.getThrowableRepository().getSessionThrowable();
            i30.a = (ErrorModel)object0;
            i30.d = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), i30) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository1.getThrowableRepository().getInspectionThrowable();
            i30.a = (ErrorModel)object0;
            i30.d = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), i30) == object1) {
                return object1;
            }
        }
        return new Fail(((ErrorModel)object0));
    }
}

