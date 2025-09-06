package com.kakao.tistory.data.repository;

import androidx.lifecycle.MutableLiveData;
import com.kakao.android.base.model.ErrorModel;
import com.kakao.tistory.data.service.OldBlogService.DefaultImpls;
import com.kakao.tistory.data.service.OldBlogService;
import com.kakao.tistory.domain.ErrorStatusKt;
import com.kakao.tistory.domain.entity.Blog;
import com.kakao.tistory.domain.entity.common.Result.Fail;
import com.kakao.tistory.domain.entity.common.Result.Success;
import com.kakao.tistory.domain.repository.OldBlogRepository;
import java.io.File;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.MutableSharedFlow;
import okhttp3.MediaType;
import okhttp3.MultipartBody.Part;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u00A2\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001A\u00020\t2\u0006\u0010\b\u001A\u00020\u0007H\u0016\u00A2\u0006\u0004\b\n\u0010\u000BJJ\u0010\u0015\u001A\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\f\u001A\u00020\u00072\u0006\u0010\r\u001A\u00020\u00072\b\u0010\u000E\u001A\u0004\u0018\u00010\u00072\u0006\u0010\u000F\u001A\u00020\u00072\b\u0010\u0010\u001A\u0004\u0018\u00010\u00072\u0006\u0010\u0012\u001A\u00020\u0011H\u0096@\u00A2\u0006\u0004\b\u0015\u0010\u0016J$\u0010\u0019\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00132\u0006\u0010\f\u001A\u00020\u0007H\u0096@\u00A2\u0006\u0004\b\u0019\u0010\u001AJ.\u0010\u001E\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00170\u00132\u0006\u0010\u001C\u001A\u00020\u001B2\b\u0010\u001D\u001A\u0004\u0018\u00010\u0007H\u0096@\u00A2\u0006\u0004\b\u001E\u0010\u001FJ6\u0010!\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u00170\u00132\u0006\u0010\f\u001A\u00020\u00072\u0006\u0010\u001C\u001A\u00020\u001B2\b\u0010\u001D\u001A\u0004\u0018\u00010\u0007H\u0096@\u00A2\u0006\u0004\b!\u0010\"J\u001E\u0010$\u001A\b\u0012\u0004\u0012\u00020#0\u00132\u0006\u0010\f\u001A\u00020\u0007H\u0096@\u00A2\u0006\u0004\b$\u0010\u001AJ\u001E\u0010%\u001A\b\u0012\u0004\u0012\u00020#0\u00132\u0006\u0010\f\u001A\u00020\u0007H\u0096@\u00A2\u0006\u0004\b%\u0010\u001AJ\u001E\u0010&\u001A\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\f\u001A\u00020\u0007H\u0096@\u00A2\u0006\u0004\b&\u0010\u001AJ<\u0010+\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0)0\u00132\u0006\u0010\f\u001A\u00020\u00072\u0006\u0010\'\u001A\u00020\u001B2\u0006\u0010\u001C\u001A\u00020\u001B2\u0006\u0010(\u001A\u00020\u001BH\u0096@\u00A2\u0006\u0004\b+\u0010,J4\u0010-\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0)0\u00132\u0006\u0010\f\u001A\u00020\u00072\u0006\u0010\u001C\u001A\u00020\u001B2\u0006\u0010(\u001A\u00020\u001BH\u0096@\u00A2\u0006\u0004\b-\u0010.J\u001E\u00101\u001A\b\u0012\u0004\u0012\u00020#0\u00132\u0006\u00100\u001A\u00020/H\u0096@\u00A2\u0006\u0004\b1\u00102J\u001E\u00103\u001A\b\u0012\u0004\u0012\u00020#0\u00132\u0006\u00100\u001A\u00020/H\u0096@\u00A2\u0006\u0004\b3\u00102J0\u00106\u001A\b\u0012\u0004\u0012\u00020#0\u00132\u0006\u0010\f\u001A\u00020\u00072\u0006\u00104\u001A\u00020\u00072\b\u00105\u001A\u0004\u0018\u00010\u0007H\u0096@\u00A2\u0006\u0004\b6\u00107R \u0010=\u001A\b\u0012\u0004\u0012\u00020\u0011088\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b9\u0010:\u001A\u0004\b;\u0010<\u00A8\u0006>"}, d2 = {"Lcom/kakao/tistory/data/repository/OldBlogRepositoryImpl;", "Lcom/kakao/tistory/data/repository/BaseRepository;", "Lcom/kakao/tistory/domain/repository/OldBlogRepository;", "Lcom/kakao/tistory/data/service/OldBlogService;", "oldBlogService", "<init>", "(Lcom/kakao/tistory/data/service/OldBlogService;)V", "", "filePath", "Lokhttp3/MultipartBody$Part;", "createMultipartBody", "(Ljava/lang/String;)Lokhttp3/MultipartBody$Part;", "blogName", "title", "description", "nickName", "imageUrl", "", "deleteImage", "Lcom/kakao/tistory/domain/entity/common/Result;", "Lcom/kakao/tistory/domain/entity/Blog;", "postBlogInfo", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/kakao/tistory/domain/entity/common/ItemListModel;", "Lcom/kakao/tistory/domain/entity/CategoryItem;", "getCategories", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "nextPage", "sortType", "getBlogFollowings", "(ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/kakao/tistory/domain/entity/User;", "getBlogFollowers", "(Ljava/lang/String;ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "postFollowBlog", "deleteFollowBlog", "getBlog", "category", "resultSize", "Lcom/kakao/tistory/domain/entity/common/EntryItemListModel;", "Lcom/kakao/tistory/domain/entity/entry/EntryItem;", "getPosts", "(Ljava/lang/String;IIILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNotices", "(Ljava/lang/String;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "targetUserId", "postBlockUser", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteBlockUser", "reportCode", "reportMessage", "reportBlog", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/lifecycle/MutableLiveData;", "b", "Landroidx/lifecycle/MutableLiveData;", "getUpdateBlogInfo", "()Landroidx/lifecycle/MutableLiveData;", "updateBlogInfo", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nOldBlogRepositoryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OldBlogRepositoryImpl.kt\ncom/kakao/tistory/data/repository/OldBlogRepositoryImpl\n+ 2 BaseRepository.kt\ncom/kakao/tistory/data/repository/BaseRepository\n+ 3 BaseRepository.kt\ncom/kakao/tistory/data/repository/BaseRepository$checkError$2\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,113:1\n26#2,27:114\n53#2:142\n26#2,2:143\n28#2,25:146\n53#2:172\n35#2:173\n26#2,27:174\n53#2:202\n35#2:203\n26#2,27:204\n53#2:232\n35#2:233\n26#2,27:234\n53#2:262\n35#2:263\n26#2,27:264\n53#2:292\n35#2:293\n26#2,27:294\n53#2:322\n35#2:323\n26#2,27:324\n53#2:352\n35#2:353\n26#2,27:354\n53#2:382\n35#2:383\n26#2,27:384\n53#2:412\n35#2:413\n26#2,27:414\n53#2:442\n35#2:443\n26#2,27:444\n53#2:472\n35#2:473\n26#2,27:474\n53#2:502\n35#2:503\n39#3:141\n39#3:171\n39#3:201\n39#3:231\n39#3:261\n39#3:291\n39#3:321\n39#3:351\n39#3:381\n39#3:411\n39#3:441\n39#3:471\n39#3:501\n1#4:145\n*S KotlinDebug\n*F\n+ 1 OldBlogRepositoryImpl.kt\ncom/kakao/tistory/data/repository/OldBlogRepositoryImpl\n*L\n43#1:114,27\n43#1:142\n45#1:143,2\n45#1:146,25\n45#1:172\n45#1:173\n55#1:174,27\n55#1:202\n55#1:203\n62#1:204,27\n62#1:232\n62#1:233\n70#1:234,27\n70#1:262\n70#1:263\n74#1:264,27\n74#1:292\n74#1:293\n78#1:294,27\n78#1:322\n78#1:323\n82#1:324,27\n82#1:352\n82#1:353\n91#1:354,27\n91#1:382\n91#1:383\n99#1:384,27\n99#1:412\n99#1:413\n103#1:414,27\n103#1:442\n103#1:443\n107#1:444,27\n107#1:472\n107#1:473\n111#1:474,27\n111#1:502\n111#1:503\n43#1:141\n45#1:171\n55#1:201\n62#1:231\n70#1:261\n74#1:291\n78#1:321\n82#1:351\n91#1:381\n99#1:411\n103#1:441\n107#1:471\n111#1:501\n*E\n"})
public final class OldBlogRepositoryImpl extends BaseRepository implements OldBlogRepository {
    public final OldBlogService a;
    public final MutableLiveData b;

    @Inject
    public OldBlogRepositoryImpl(@NotNull OldBlogService oldBlogService0) {
        Intrinsics.checkNotNullParameter(oldBlogService0, "oldBlogService");
        super();
        this.a = oldBlogService0;
        this.b = new MutableLiveData();
    }

    @Override  // com.kakao.tistory.domain.repository.OldBlogRepository
    @NotNull
    public Part createMultipartBody(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "filePath");
        File file0 = new File(s);
        MediaType mediaType0 = MediaType.Companion.parse("image/*");
        RequestBody requestBody0 = RequestBody.Companion.create(file0, mediaType0);
        String s1 = file0.getName();
        return Part.Companion.createFormData("logo", s1, requestBody0);
    }

    @Override  // com.kakao.tistory.domain.repository.OldBlogRepository
    @Nullable
    public Object deleteBlockUser(long v, @NotNull Continuation continuation0) {
        BaseRepository baseRepository0;
        l2 l20;
        if(continuation0 instanceof l2) {
            l20 = (l2)continuation0;
            int v1 = l20.d;
            if((v1 & 0x80000000) == 0) {
                l20 = new l2(this, continuation0);
            }
            else {
                l20.d = v1 ^ 0x80000000;
            }
        }
        else {
            l20 = new l2(this, continuation0);
        }
        Object object0 = l20.b;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(l20.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    l20.a = this;
                    l20.d = 1;
                    if(this.a.deleteBlockUser(v, l20) == object1) {
                        return object1;
                    }
                    baseRepository0 = this;
                    break;
                }
                catch(CancellationException cancellationException0) {
                    baseRepository0 = this;
                    l20.a = baseRepository0;
                    l20.d = 2;
                    return baseRepository0.sendError("coroutine cancel", cancellationException0, l20) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    baseRepository0 = this;
                    goto label_46;
                }
                return object1;
            }
            case 1: {
                baseRepository0 = (BaseRepository)l20.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    l20.a = baseRepository0;
                    l20.d = 2;
                    return baseRepository0.sendError("coroutine cancel", cancellationException0, l20) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    goto label_46;
                }
            }
            case 2: {
                baseRepository0 = (BaseRepository)l20.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(baseRepository0.createCoroutineCancelErrorModel());
            }
            case 3: {
                baseRepository0 = (BaseRepository)l20.a;
                ResultKt.throwOnFailure(object0);
                goto label_51;
            }
            case 4: 
            case 5: {
                ErrorModel errorModel0 = (ErrorModel)l20.a;
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
            l20.a = baseRepository0;
            l20.d = 2;
            return baseRepository0.sendError("coroutine cancel", cancellationException0, l20) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
        }
        catch(Throwable throwable0) {
        }
    label_46:
        l20.a = baseRepository0;
        l20.d = 3;
        object0 = baseRepository0.createErrorModel(throwable0, l20);
        if(object0 == object1) {
            return object1;
        }
    label_51:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository0.getThrowableRepository().getSessionThrowable();
            l20.a = (ErrorModel)object0;
            l20.d = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), l20) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository0.getThrowableRepository().getInspectionThrowable();
            l20.a = (ErrorModel)object0;
            l20.d = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), l20) == object1) {
                return object1;
            }
        }
        return new Fail(((ErrorModel)object0));
    }

    @Override  // com.kakao.tistory.domain.repository.OldBlogRepository
    @Nullable
    public Object deleteFollowBlog(@NotNull String s, @NotNull Continuation continuation0) {
        BaseRepository baseRepository0;
        m2 m20;
        if(continuation0 instanceof m2) {
            m20 = (m2)continuation0;
            int v = m20.d;
            if((v & 0x80000000) == 0) {
                m20 = new m2(this, continuation0);
            }
            else {
                m20.d = v ^ 0x80000000;
            }
        }
        else {
            m20 = new m2(this, continuation0);
        }
        Object object0 = m20.b;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(m20.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    m20.a = this;
                    m20.d = 1;
                    if(this.a.deleteFollowBlog(s, m20) == object1) {
                        return object1;
                    }
                    baseRepository0 = this;
                    break;
                }
                catch(CancellationException cancellationException0) {
                    baseRepository0 = this;
                    m20.a = baseRepository0;
                    m20.d = 2;
                    return baseRepository0.sendError("coroutine cancel", cancellationException0, m20) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    baseRepository0 = this;
                    goto label_46;
                }
                return object1;
            }
            case 1: {
                baseRepository0 = (BaseRepository)m20.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    m20.a = baseRepository0;
                    m20.d = 2;
                    return baseRepository0.sendError("coroutine cancel", cancellationException0, m20) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    goto label_46;
                }
            }
            case 2: {
                baseRepository0 = (BaseRepository)m20.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(baseRepository0.createCoroutineCancelErrorModel());
            }
            case 3: {
                baseRepository0 = (BaseRepository)m20.a;
                ResultKt.throwOnFailure(object0);
                goto label_51;
            }
            case 4: 
            case 5: {
                ErrorModel errorModel0 = (ErrorModel)m20.a;
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
            m20.a = baseRepository0;
            m20.d = 2;
            return baseRepository0.sendError("coroutine cancel", cancellationException0, m20) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
        }
        catch(Throwable throwable0) {
        }
    label_46:
        m20.a = baseRepository0;
        m20.d = 3;
        object0 = baseRepository0.createErrorModel(throwable0, m20);
        if(object0 == object1) {
            return object1;
        }
    label_51:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository0.getThrowableRepository().getSessionThrowable();
            m20.a = (ErrorModel)object0;
            m20.d = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), m20) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository0.getThrowableRepository().getInspectionThrowable();
            m20.a = (ErrorModel)object0;
            m20.d = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), m20) == object1) {
                return object1;
            }
        }
        return new Fail(((ErrorModel)object0));
    }

    @Override  // com.kakao.tistory.domain.repository.OldBlogRepository
    @Nullable
    public Object getBlog(@NotNull String s, @NotNull Continuation continuation0) {
        BaseRepository baseRepository0;
        n2 n20;
        if(continuation0 instanceof n2) {
            n20 = (n2)continuation0;
            int v = n20.d;
            if((v & 0x80000000) == 0) {
                n20 = new n2(this, continuation0);
            }
            else {
                n20.d = v ^ 0x80000000;
            }
        }
        else {
            n20 = new n2(this, continuation0);
        }
        Object object0 = n20.b;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(n20.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    n20.a = this;
                    n20.d = 1;
                    object0 = this.a.getBlog(s, n20);
                }
                catch(CancellationException cancellationException0) {
                    baseRepository0 = this;
                    n20.a = baseRepository0;
                    n20.d = 2;
                    return baseRepository0.sendError("coroutine cancel", cancellationException0, n20) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
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
                baseRepository0 = (BaseRepository)n20.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    n20.a = baseRepository0;
                    n20.d = 2;
                    return baseRepository0.sendError("coroutine cancel", cancellationException0, n20) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    goto label_47;
                }
            }
            case 2: {
                baseRepository0 = (BaseRepository)n20.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(baseRepository0.createCoroutineCancelErrorModel());
            }
            case 3: {
                baseRepository0 = (BaseRepository)n20.a;
                ResultKt.throwOnFailure(object0);
                goto label_52;
            }
            case 4: 
            case 5: {
                ErrorModel errorModel0 = (ErrorModel)n20.a;
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
            n20.a = baseRepository0;
            n20.d = 2;
            return baseRepository0.sendError("coroutine cancel", cancellationException0, n20) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
        }
        catch(Throwable throwable0) {
        }
    label_47:
        n20.a = baseRepository0;
        n20.d = 3;
        object0 = baseRepository0.createErrorModel(throwable0, n20);
        if(object0 == object1) {
            return object1;
        }
    label_52:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository0.getThrowableRepository().getSessionThrowable();
            n20.a = (ErrorModel)object0;
            n20.d = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), n20) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository0.getThrowableRepository().getInspectionThrowable();
            n20.a = (ErrorModel)object0;
            n20.d = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), n20) == object1) {
                return object1;
            }
        }
        return new Fail(((ErrorModel)object0));
    }

    @Override  // com.kakao.tistory.domain.repository.OldBlogRepository
    @Nullable
    public Object getBlogFollowers(@NotNull String s, int v, @Nullable String s1, @NotNull Continuation continuation0) {
        BaseRepository baseRepository1;
        o2 o20;
        if(continuation0 instanceof o2) {
            o20 = (o2)continuation0;
            int v1 = o20.d;
            if((v1 & 0x80000000) == 0) {
                o20 = new o2(this, continuation0);
            }
            else {
                o20.d = v1 ^ 0x80000000;
            }
        }
        else {
            o20 = new o2(this, continuation0);
        }
        Object object0 = o20.b;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(o20.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    o20.a = this;
                    o20.d = 1;
                    object0 = DefaultImpls.getBlogFollowers$default(this.a, s, v, s1, 0, o20, 8, null);
                }
                catch(CancellationException cancellationException0) {
                    baseRepository1 = this;
                    o20.a = baseRepository1;
                    o20.d = 2;
                    return baseRepository1.sendError("coroutine cancel", cancellationException0, o20) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
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
                baseRepository1 = (BaseRepository)o20.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    o20.a = baseRepository1;
                    o20.d = 2;
                    return baseRepository1.sendError("coroutine cancel", cancellationException0, o20) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    goto label_47;
                }
            }
            case 2: {
                BaseRepository baseRepository0 = (BaseRepository)o20.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(baseRepository0.createCoroutineCancelErrorModel());
            }
            case 3: {
                baseRepository1 = (BaseRepository)o20.a;
                ResultKt.throwOnFailure(object0);
                goto label_52;
            }
            case 4: 
            case 5: {
                ErrorModel errorModel0 = (ErrorModel)o20.a;
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
            o20.a = baseRepository1;
            o20.d = 2;
            return baseRepository1.sendError("coroutine cancel", cancellationException0, o20) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
        }
        catch(Throwable throwable0) {
        }
    label_47:
        o20.a = baseRepository1;
        o20.d = 3;
        object0 = baseRepository1.createErrorModel(throwable0, o20);
        if(object0 == object1) {
            return object1;
        }
    label_52:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository1.getThrowableRepository().getSessionThrowable();
            o20.a = (ErrorModel)object0;
            o20.d = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), o20) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository1.getThrowableRepository().getInspectionThrowable();
            o20.a = (ErrorModel)object0;
            o20.d = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), o20) == object1) {
                return object1;
            }
        }
        return new Fail(((ErrorModel)object0));
    }

    @Override  // com.kakao.tistory.domain.repository.OldBlogRepository
    @Nullable
    public Object getBlogFollowings(int v, @Nullable String s, @NotNull Continuation continuation0) {
        BaseRepository baseRepository1;
        p2 p20;
        if(continuation0 instanceof p2) {
            p20 = (p2)continuation0;
            int v1 = p20.d;
            if((v1 & 0x80000000) == 0) {
                p20 = new p2(this, continuation0);
            }
            else {
                p20.d = v1 ^ 0x80000000;
            }
        }
        else {
            p20 = new p2(this, continuation0);
        }
        Object object0 = p20.b;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(p20.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    p20.a = this;
                    p20.d = 1;
                    object0 = DefaultImpls.getBlogFollowings$default(this.a, v, s, 0, p20, 4, null);
                }
                catch(CancellationException cancellationException0) {
                    baseRepository1 = this;
                    p20.a = baseRepository1;
                    p20.d = 2;
                    return baseRepository1.sendError("coroutine cancel", cancellationException0, p20) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
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
                baseRepository1 = (BaseRepository)p20.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    p20.a = baseRepository1;
                    p20.d = 2;
                    return baseRepository1.sendError("coroutine cancel", cancellationException0, p20) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    goto label_47;
                }
            }
            case 2: {
                BaseRepository baseRepository0 = (BaseRepository)p20.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(baseRepository0.createCoroutineCancelErrorModel());
            }
            case 3: {
                baseRepository1 = (BaseRepository)p20.a;
                ResultKt.throwOnFailure(object0);
                goto label_52;
            }
            case 4: 
            case 5: {
                ErrorModel errorModel0 = (ErrorModel)p20.a;
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
            p20.a = baseRepository1;
            p20.d = 2;
            return baseRepository1.sendError("coroutine cancel", cancellationException0, p20) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
        }
        catch(Throwable throwable0) {
        }
    label_47:
        p20.a = baseRepository1;
        p20.d = 3;
        object0 = baseRepository1.createErrorModel(throwable0, p20);
        if(object0 == object1) {
            return object1;
        }
    label_52:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository1.getThrowableRepository().getSessionThrowable();
            p20.a = (ErrorModel)object0;
            p20.d = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), p20) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository1.getThrowableRepository().getInspectionThrowable();
            p20.a = (ErrorModel)object0;
            p20.d = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), p20) == object1) {
                return object1;
            }
        }
        return new Fail(((ErrorModel)object0));
    }

    @Override  // com.kakao.tistory.domain.repository.OldBlogRepository
    @Nullable
    public Object getCategories(@NotNull String s, @NotNull Continuation continuation0) {
        BaseRepository baseRepository0;
        q2 q20;
        if(continuation0 instanceof q2) {
            q20 = (q2)continuation0;
            int v = q20.d;
            if((v & 0x80000000) == 0) {
                q20 = new q2(this, continuation0);
            }
            else {
                q20.d = v ^ 0x80000000;
            }
        }
        else {
            q20 = new q2(this, continuation0);
        }
        Object object0 = q20.b;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(q20.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    q20.a = this;
                    q20.d = 1;
                    object0 = this.a.getCategories(s, q20);
                }
                catch(CancellationException cancellationException0) {
                    baseRepository0 = this;
                    q20.a = baseRepository0;
                    q20.d = 2;
                    return baseRepository0.sendError("coroutine cancel", cancellationException0, q20) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
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
                baseRepository0 = (BaseRepository)q20.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    q20.a = baseRepository0;
                    q20.d = 2;
                    return baseRepository0.sendError("coroutine cancel", cancellationException0, q20) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    goto label_47;
                }
            }
            case 2: {
                baseRepository0 = (BaseRepository)q20.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(baseRepository0.createCoroutineCancelErrorModel());
            }
            case 3: {
                baseRepository0 = (BaseRepository)q20.a;
                ResultKt.throwOnFailure(object0);
                goto label_52;
            }
            case 4: 
            case 5: {
                ErrorModel errorModel0 = (ErrorModel)q20.a;
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
            q20.a = baseRepository0;
            q20.d = 2;
            return baseRepository0.sendError("coroutine cancel", cancellationException0, q20) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
        }
        catch(Throwable throwable0) {
        }
    label_47:
        q20.a = baseRepository0;
        q20.d = 3;
        object0 = baseRepository0.createErrorModel(throwable0, q20);
        if(object0 == object1) {
            return object1;
        }
    label_52:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository0.getThrowableRepository().getSessionThrowable();
            q20.a = (ErrorModel)object0;
            q20.d = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), q20) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository0.getThrowableRepository().getInspectionThrowable();
            q20.a = (ErrorModel)object0;
            q20.d = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), q20) == object1) {
                return object1;
            }
        }
        return new Fail(((ErrorModel)object0));
    }

    @Override  // com.kakao.tistory.domain.repository.OldBlogRepository
    @Nullable
    public Object getNotices(@NotNull String s, int v, int v1, @NotNull Continuation continuation0) {
        BaseRepository baseRepository0;
        r2 r20;
        if(continuation0 instanceof r2) {
            r20 = (r2)continuation0;
            int v2 = r20.d;
            if((v2 & 0x80000000) == 0) {
                r20 = new r2(this, continuation0);
            }
            else {
                r20.d = v2 ^ 0x80000000;
            }
        }
        else {
            r20 = new r2(this, continuation0);
        }
        Object object0 = r20.b;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(r20.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    r20.a = this;
                    r20.d = 1;
                    object0 = this.a.getNotices(s, v, v1, r20);
                }
                catch(CancellationException cancellationException0) {
                    baseRepository0 = this;
                    r20.a = baseRepository0;
                    r20.d = 2;
                    return baseRepository0.sendError("coroutine cancel", cancellationException0, r20) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
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
                baseRepository0 = (BaseRepository)r20.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    r20.a = baseRepository0;
                    r20.d = 2;
                    return baseRepository0.sendError("coroutine cancel", cancellationException0, r20) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    goto label_47;
                }
            }
            case 2: {
                baseRepository0 = (BaseRepository)r20.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(baseRepository0.createCoroutineCancelErrorModel());
            }
            case 3: {
                baseRepository0 = (BaseRepository)r20.a;
                ResultKt.throwOnFailure(object0);
                goto label_52;
            }
            case 4: 
            case 5: {
                ErrorModel errorModel0 = (ErrorModel)r20.a;
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
            r20.a = baseRepository0;
            r20.d = 2;
            return baseRepository0.sendError("coroutine cancel", cancellationException0, r20) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
        }
        catch(Throwable throwable0) {
        }
    label_47:
        r20.a = baseRepository0;
        r20.d = 3;
        object0 = baseRepository0.createErrorModel(throwable0, r20);
        if(object0 == object1) {
            return object1;
        }
    label_52:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository0.getThrowableRepository().getSessionThrowable();
            r20.a = (ErrorModel)object0;
            r20.d = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), r20) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository0.getThrowableRepository().getInspectionThrowable();
            r20.a = (ErrorModel)object0;
            r20.d = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), r20) == object1) {
                return object1;
            }
        }
        return new Fail(((ErrorModel)object0));
    }

    @Override  // com.kakao.tistory.domain.repository.OldBlogRepository
    @Nullable
    public Object getPosts(@NotNull String s, int v, int v1, int v2, @NotNull Continuation continuation0) {
        BaseRepository baseRepository1;
        s2 s20;
        if(continuation0 instanceof s2) {
            s20 = (s2)continuation0;
            int v3 = s20.d;
            if((v3 & 0x80000000) == 0) {
                s20 = new s2(this, continuation0);
            }
            else {
                s20.d = v3 ^ 0x80000000;
            }
        }
        else {
            s20 = new s2(this, continuation0);
        }
        Object object0 = s20.b;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(s20.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    s20.a = this;
                    s20.d = 1;
                    object0 = this.a.getPosts(s, v, v1, v2, s20);
                }
                catch(CancellationException cancellationException0) {
                    baseRepository1 = this;
                    s20.a = baseRepository1;
                    s20.d = 2;
                    return baseRepository1.sendError("coroutine cancel", cancellationException0, s20) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
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
                baseRepository1 = (BaseRepository)s20.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    s20.a = baseRepository1;
                    s20.d = 2;
                    return baseRepository1.sendError("coroutine cancel", cancellationException0, s20) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    goto label_47;
                }
            }
            case 2: {
                BaseRepository baseRepository0 = (BaseRepository)s20.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(baseRepository0.createCoroutineCancelErrorModel());
            }
            case 3: {
                baseRepository1 = (BaseRepository)s20.a;
                ResultKt.throwOnFailure(object0);
                goto label_52;
            }
            case 4: 
            case 5: {
                ErrorModel errorModel0 = (ErrorModel)s20.a;
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
            s20.a = baseRepository1;
            s20.d = 2;
            return baseRepository1.sendError("coroutine cancel", cancellationException0, s20) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
        }
        catch(Throwable throwable0) {
        }
    label_47:
        s20.a = baseRepository1;
        s20.d = 3;
        object0 = baseRepository1.createErrorModel(throwable0, s20);
        if(object0 == object1) {
            return object1;
        }
    label_52:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository1.getThrowableRepository().getSessionThrowable();
            s20.a = (ErrorModel)object0;
            s20.d = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), s20) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository1.getThrowableRepository().getInspectionThrowable();
            s20.a = (ErrorModel)object0;
            s20.d = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), s20) == object1) {
                return object1;
            }
        }
        return new Fail(((ErrorModel)object0));
    }

    @Override  // com.kakao.tistory.domain.repository.OldBlogRepository
    @NotNull
    public MutableLiveData getUpdateBlogInfo() {
        return this.b;
    }

    @Override  // com.kakao.tistory.domain.repository.OldBlogRepository
    @Nullable
    public Object postBlockUser(long v, @NotNull Continuation continuation0) {
        BaseRepository baseRepository0;
        t2 t20;
        if(continuation0 instanceof t2) {
            t20 = (t2)continuation0;
            int v1 = t20.d;
            if((v1 & 0x80000000) == 0) {
                t20 = new t2(this, continuation0);
            }
            else {
                t20.d = v1 ^ 0x80000000;
            }
        }
        else {
            t20 = new t2(this, continuation0);
        }
        Object object0 = t20.b;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(t20.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    t20.a = this;
                    t20.d = 1;
                    if(this.a.postBlockUser(v, t20) == object1) {
                        return object1;
                    }
                    baseRepository0 = this;
                    break;
                }
                catch(CancellationException cancellationException0) {
                    baseRepository0 = this;
                    t20.a = baseRepository0;
                    t20.d = 2;
                    return baseRepository0.sendError("coroutine cancel", cancellationException0, t20) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    baseRepository0 = this;
                    goto label_46;
                }
                return object1;
            }
            case 1: {
                baseRepository0 = (BaseRepository)t20.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    t20.a = baseRepository0;
                    t20.d = 2;
                    return baseRepository0.sendError("coroutine cancel", cancellationException0, t20) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    goto label_46;
                }
            }
            case 2: {
                baseRepository0 = (BaseRepository)t20.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(baseRepository0.createCoroutineCancelErrorModel());
            }
            case 3: {
                baseRepository0 = (BaseRepository)t20.a;
                ResultKt.throwOnFailure(object0);
                goto label_51;
            }
            case 4: 
            case 5: {
                ErrorModel errorModel0 = (ErrorModel)t20.a;
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
            t20.a = baseRepository0;
            t20.d = 2;
            return baseRepository0.sendError("coroutine cancel", cancellationException0, t20) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
        }
        catch(Throwable throwable0) {
        }
    label_46:
        t20.a = baseRepository0;
        t20.d = 3;
        object0 = baseRepository0.createErrorModel(throwable0, t20);
        if(object0 == object1) {
            return object1;
        }
    label_51:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository0.getThrowableRepository().getSessionThrowable();
            t20.a = (ErrorModel)object0;
            t20.d = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), t20) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository0.getThrowableRepository().getInspectionThrowable();
            t20.a = (ErrorModel)object0;
            t20.d = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), t20) == object1) {
                return object1;
            }
        }
        return new Fail(((ErrorModel)object0));
    }

    @Override  // com.kakao.tistory.domain.repository.OldBlogRepository
    @Nullable
    public Object postBlogInfo(@NotNull String s, @NotNull String s1, @Nullable String s2, @NotNull String s3, @Nullable String s4, boolean z, @NotNull Continuation continuation0) {
        BaseRepository baseRepository0;
        BaseRepository baseRepository3;
        String s18;
        String s17;
        String s16;
        ErrorModel errorModel1;
        String s13;
        String s12;
        String s9;
        String s8;
        BaseRepository baseRepository2;
        String s7;
        BaseRepository baseRepository1;
        String s6;
        String s5;
        u2 u20;
        if(continuation0 instanceof u2) {
            u20 = (u2)continuation0;
            int v = u20.j;
            if((v & 0x80000000) == 0) {
                u20 = new u2(this, continuation0);
            }
            else {
                u20.j = v ^ 0x80000000;
            }
        }
        else {
            u20 = new u2(this, continuation0);
        }
        Blog blog0 = u20.h;
        Object object0 = a.getCOROUTINE_SUSPENDED();
        switch(u20.j) {
            case 0: {
                ResultKt.throwOnFailure(blog0);
                if(z) {
                    try {
                        u20.a = this;
                        u20.b = s;
                        u20.c = s1;
                        s5 = s2;
                        u20.d = s5;
                        s6 = s3;
                        u20.e = s6;
                        u20.f = s4;
                        u20.g = this;
                        u20.j = 1;
                        blog0 = this.a.deleteBlogLogoImage(s, u20);
                    }
                    catch(CancellationException cancellationException0) {
                        baseRepository1 = this;
                        s7 = s;
                        baseRepository2 = baseRepository1;
                        s8 = s1;
                        s9 = s4;
                        goto label_82;
                    }
                    catch(Throwable throwable0) {
                        baseRepository1 = this;
                        s7 = s;
                        baseRepository2 = baseRepository1;
                        s8 = s1;
                        s9 = s4;
                        goto label_95;
                    }
                    if(blog0 == object0) {
                        return object0;
                    }
                    baseRepository1 = this;
                    s7 = s;
                    baseRepository2 = baseRepository1;
                    s8 = s1;
                    s9 = s4;
                    goto label_79;
                }
                else {
                    s5 = s2;
                    s6 = s3;
                    baseRepository1 = this;
                    s7 = s;
                    s8 = s1;
                    s9 = s4;
                }
                goto label_166;
            }
            case 1: {
                baseRepository2 = (BaseRepository)u20.g;
                s9 = (String)u20.f;
                String s10 = u20.e;
                String s11 = u20.d;
                s8 = u20.c;
                s7 = u20.b;
                baseRepository1 = (OldBlogRepositoryImpl)u20.a;
                try {
                    s6 = s10;
                    s5 = s11;
                    ResultKt.throwOnFailure(blog0);
                    s6 = s10;
                    s5 = s11;
                    goto label_79;
                }
                catch(CancellationException cancellationException0) {
                    s6 = s10;
                    s5 = s11;
                    goto label_82;
                    try {
                    label_79:
                        new Success(blog0);
                        goto label_166;
                    }
                    catch(CancellationException cancellationException0) {
                    }
                    catch(Throwable throwable0) {
                        goto label_95;
                    }
                label_82:
                    u20.a = baseRepository1;
                    u20.b = s7;
                    u20.c = s8;
                    u20.d = s5;
                    u20.e = s6;
                    u20.f = s9;
                    u20.g = baseRepository2;
                    u20.j = 2;
                    if(baseRepository2.sendError("coroutine cancel", cancellationException0, u20) == object0) {
                        return object0;
                    }
                    new Fail(baseRepository2.createCoroutineCancelErrorModel());
                    goto label_166;
                }
                catch(Throwable throwable0) {
                }
            label_95:
                u20.a = baseRepository1;
                u20.b = s7;
                u20.c = s8;
                u20.d = s5;
                u20.e = s6;
                u20.f = s9;
                u20.g = baseRepository2;
                u20.j = 3;
                blog0 = baseRepository2.createErrorModel(throwable0, u20);
                if(blog0 == object0) {
                    return object0;
                }
                s12 = s5;
                s13 = s6;
                goto label_129;
            }
            case 2: {
                baseRepository2 = (BaseRepository)u20.g;
                s9 = (String)u20.f;
                String s14 = u20.e;
                String s15 = u20.d;
                s8 = u20.c;
                s7 = u20.b;
                baseRepository1 = (OldBlogRepositoryImpl)u20.a;
                ResultKt.throwOnFailure(blog0);
                s6 = s14;
                s5 = s15;
                new Fail(baseRepository2.createCoroutineCancelErrorModel());
                goto label_166;
            }
            case 3: {
                baseRepository2 = (BaseRepository)u20.g;
                s9 = (String)u20.f;
                s13 = u20.e;
                s12 = u20.d;
                s8 = u20.c;
                s7 = u20.b;
                baseRepository1 = (OldBlogRepositoryImpl)u20.a;
                ResultKt.throwOnFailure(blog0);
            label_129:
                if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
                    MutableSharedFlow mutableSharedFlow0 = baseRepository2.getThrowableRepository().getSessionThrowable();
                    u20.a = baseRepository1;
                    u20.b = s7;
                    u20.c = s8;
                    u20.d = s12;
                    u20.e = s13;
                    u20.f = s9;
                    u20.g = (ErrorModel)blog0;
                    u20.j = 4;
                    if(mutableSharedFlow0.emit(((ErrorModel)blog0), u20) == object0) {
                        return object0;
                    }
                }
                else if(ErrorStatusKt.checkInspectionError(((ErrorModel)blog0).getCode())) {
                    MutableSharedFlow mutableSharedFlow1 = baseRepository2.getThrowableRepository().getInspectionThrowable();
                    u20.a = baseRepository1;
                    u20.b = s7;
                    u20.c = s8;
                    u20.d = s12;
                    u20.e = s13;
                    u20.f = s9;
                    u20.g = (ErrorModel)blog0;
                    u20.j = 5;
                    if(mutableSharedFlow1.emit(((ErrorModel)blog0), u20) == object0) {
                        return object0;
                    }
                }
                errorModel1 = (ErrorModel)blog0;
                goto label_163;
            }
            case 4: 
            case 5: {
                errorModel1 = (ErrorModel)u20.g;
                s9 = (String)u20.f;
                s13 = u20.e;
                s12 = u20.d;
                s8 = u20.c;
                s7 = u20.b;
                baseRepository1 = (OldBlogRepositoryImpl)u20.a;
                ResultKt.throwOnFailure(blog0);
            label_163:
                new Fail(errorModel1);
                s6 = s13;
                s5 = s12;
                try {
                label_166:
                    Part multipartBody$Part0 = s9 == null ? null : ((OldBlogRepositoryImpl)baseRepository1).createMultipartBody(s9);
                    if(multipartBody$Part0 == null) {
                        goto label_192;
                    }
                    else {
                        u20.a = baseRepository1;
                        u20.b = s7;
                        u20.c = s8;
                        u20.d = s5;
                        u20.e = s6;
                        u20.f = baseRepository1;
                        u20.g = null;
                        u20.j = 6;
                        blog0 = ((OldBlogRepositoryImpl)baseRepository1).a.postBlog(s7, s8, s5, s6, multipartBody$Part0, u20);
                        goto label_184;
                    }
                    return new Success(blog0);
                }
                catch(CancellationException cancellationException1) {
                }
                catch(Throwable throwable1) {
                    baseRepository0 = baseRepository1;
                    goto label_233;
                }
                try {
                    baseRepository0 = baseRepository1;
                    goto label_221;
                label_184:
                    if(blog0 == object0) {
                        return object0;
                    }
                    s16 = s6;
                    s17 = s8;
                    s18 = s7;
                    baseRepository0 = baseRepository1;
                    baseRepository3 = baseRepository0;
                    goto label_204;
                label_192:
                    s16 = s6;
                    s17 = s8;
                    s18 = s7;
                    baseRepository0 = baseRepository1;
                    goto label_206;
                }
                catch(CancellationException cancellationException1) {
                    goto label_221;
                }
                catch(Throwable throwable1) {
                    goto label_233;
                }
            }
            case 6: {
                baseRepository0 = (BaseRepository)u20.f;
                s16 = u20.e;
                s5 = u20.d;
                s17 = u20.c;
                s18 = u20.b;
                baseRepository3 = (OldBlogRepositoryImpl)u20.a;
                try {
                    ResultKt.throwOnFailure(blog0);
                label_204:
                    if(blog0 == null) {
                        baseRepository1 = baseRepository3;
                    label_206:
                        u20.a = baseRepository0;
                        u20.b = null;
                        u20.c = null;
                        u20.d = null;
                        u20.e = null;
                        u20.f = null;
                        u20.g = null;
                        u20.j = 7;
                        blog0 = ((OldBlogRepositoryImpl)baseRepository1).a.postBlog(s18, s17, s5, s16, u20);
                        if(blog0 == object0) {
                            return object0;
                        }
                    }
                    return new Success(blog0);
                }
                catch(CancellationException cancellationException1) {
                    goto label_221;
                }
                catch(Throwable throwable1) {
                    goto label_233;
                }
            }
            case 7: {
                baseRepository0 = (BaseRepository)u20.a;
                try {
                    ResultKt.throwOnFailure(blog0);
                    return new Success(blog0);
                }
                catch(CancellationException cancellationException1) {
                label_221:
                    u20.a = baseRepository0;
                    u20.b = null;
                    u20.c = null;
                    u20.d = null;
                    u20.e = null;
                    u20.f = null;
                    u20.g = null;
                    u20.j = 8;
                    return baseRepository0.sendError("coroutine cancel", cancellationException1, u20) == object0 ? object0 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable1) {
                }
            label_233:
                u20.a = baseRepository0;
                u20.b = null;
                u20.c = null;
                u20.d = null;
                u20.e = null;
                u20.f = null;
                u20.g = null;
                u20.j = 9;
                blog0 = baseRepository0.createErrorModel(throwable1, u20);
                if(blog0 == object0) {
                    return object0;
                }
                goto label_246;
            }
            case 8: {
                baseRepository0 = (BaseRepository)u20.a;
                ResultKt.throwOnFailure(blog0);
                return new Fail(baseRepository0.createCoroutineCancelErrorModel());
            }
            case 9: {
                break;
            }
            case 10: 
            case 11: {
                ErrorModel errorModel0 = (ErrorModel)u20.a;
                ResultKt.throwOnFailure(blog0);
                return new Fail(errorModel0);
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        baseRepository0 = (BaseRepository)u20.a;
        ResultKt.throwOnFailure(blog0);
    label_246:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow2 = baseRepository0.getThrowableRepository().getSessionThrowable();
            u20.a = (ErrorModel)blog0;
            u20.j = 10;
            if(mutableSharedFlow2.emit(((ErrorModel)blog0), u20) == object0) {
                return object0;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)blog0).getCode())) {
            MutableSharedFlow mutableSharedFlow3 = baseRepository0.getThrowableRepository().getInspectionThrowable();
            u20.a = (ErrorModel)blog0;
            u20.j = 11;
            if(mutableSharedFlow3.emit(((ErrorModel)blog0), u20) == object0) {
                return object0;
            }
        }
        return new Fail(((ErrorModel)blog0));
    }

    @Override  // com.kakao.tistory.domain.repository.OldBlogRepository
    @Nullable
    public Object postFollowBlog(@NotNull String s, @NotNull Continuation continuation0) {
        BaseRepository baseRepository0;
        v2 v20;
        if(continuation0 instanceof v2) {
            v20 = (v2)continuation0;
            int v = v20.d;
            if((v & 0x80000000) == 0) {
                v20 = new v2(this, continuation0);
            }
            else {
                v20.d = v ^ 0x80000000;
            }
        }
        else {
            v20 = new v2(this, continuation0);
        }
        Object object0 = v20.b;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(v20.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    v20.a = this;
                    v20.d = 1;
                    if(this.a.postFollowBlog(s, v20) == object1) {
                        return object1;
                    }
                    baseRepository0 = this;
                    break;
                }
                catch(CancellationException cancellationException0) {
                    baseRepository0 = this;
                    v20.a = baseRepository0;
                    v20.d = 2;
                    return baseRepository0.sendError("coroutine cancel", cancellationException0, v20) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    baseRepository0 = this;
                    goto label_46;
                }
                return object1;
            }
            case 1: {
                baseRepository0 = (BaseRepository)v20.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    v20.a = baseRepository0;
                    v20.d = 2;
                    return baseRepository0.sendError("coroutine cancel", cancellationException0, v20) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    goto label_46;
                }
            }
            case 2: {
                baseRepository0 = (BaseRepository)v20.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(baseRepository0.createCoroutineCancelErrorModel());
            }
            case 3: {
                baseRepository0 = (BaseRepository)v20.a;
                ResultKt.throwOnFailure(object0);
                goto label_51;
            }
            case 4: 
            case 5: {
                ErrorModel errorModel0 = (ErrorModel)v20.a;
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
            v20.a = baseRepository0;
            v20.d = 2;
            return baseRepository0.sendError("coroutine cancel", cancellationException0, v20) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
        }
        catch(Throwable throwable0) {
        }
    label_46:
        v20.a = baseRepository0;
        v20.d = 3;
        object0 = baseRepository0.createErrorModel(throwable0, v20);
        if(object0 == object1) {
            return object1;
        }
    label_51:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository0.getThrowableRepository().getSessionThrowable();
            v20.a = (ErrorModel)object0;
            v20.d = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), v20) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository0.getThrowableRepository().getInspectionThrowable();
            v20.a = (ErrorModel)object0;
            v20.d = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), v20) == object1) {
                return object1;
            }
        }
        return new Fail(((ErrorModel)object0));
    }

    @Override  // com.kakao.tistory.domain.repository.OldBlogRepository
    @Nullable
    public Object reportBlog(@NotNull String s, @NotNull String s1, @Nullable String s2, @NotNull Continuation continuation0) {
        BaseRepository baseRepository0;
        w2 w20;
        if(continuation0 instanceof w2) {
            w20 = (w2)continuation0;
            int v = w20.d;
            if((v & 0x80000000) == 0) {
                w20 = new w2(this, continuation0);
            }
            else {
                w20.d = v ^ 0x80000000;
            }
        }
        else {
            w20 = new w2(this, continuation0);
        }
        Object object0 = w20.b;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(w20.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    w20.a = this;
                    w20.d = 1;
                    if(this.a.postBlogReport(s, s1, s2, w20) == object1) {
                        return object1;
                    }
                    baseRepository0 = this;
                    break;
                }
                catch(CancellationException cancellationException0) {
                    baseRepository0 = this;
                    w20.a = baseRepository0;
                    w20.d = 2;
                    return baseRepository0.sendError("coroutine cancel", cancellationException0, w20) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    baseRepository0 = this;
                    goto label_46;
                }
                return object1;
            }
            case 1: {
                baseRepository0 = (BaseRepository)w20.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    w20.a = baseRepository0;
                    w20.d = 2;
                    return baseRepository0.sendError("coroutine cancel", cancellationException0, w20) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    goto label_46;
                }
            }
            case 2: {
                baseRepository0 = (BaseRepository)w20.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(baseRepository0.createCoroutineCancelErrorModel());
            }
            case 3: {
                baseRepository0 = (BaseRepository)w20.a;
                ResultKt.throwOnFailure(object0);
                goto label_51;
            }
            case 4: 
            case 5: {
                ErrorModel errorModel0 = (ErrorModel)w20.a;
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
            w20.a = baseRepository0;
            w20.d = 2;
            return baseRepository0.sendError("coroutine cancel", cancellationException0, w20) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
        }
        catch(Throwable throwable0) {
        }
    label_46:
        w20.a = baseRepository0;
        w20.d = 3;
        object0 = baseRepository0.createErrorModel(throwable0, w20);
        if(object0 == object1) {
            return object1;
        }
    label_51:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository0.getThrowableRepository().getSessionThrowable();
            w20.a = (ErrorModel)object0;
            w20.d = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), w20) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository0.getThrowableRepository().getInspectionThrowable();
            w20.a = (ErrorModel)object0;
            w20.d = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), w20) == object1) {
                return object1;
            }
        }
        return new Fail(((ErrorModel)object0));
    }
}

