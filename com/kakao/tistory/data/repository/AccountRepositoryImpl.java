package com.kakao.tistory.data.repository;

import android.webkit.CookieManager;
import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import com.google.gson.Gson;
import com.kakao.android.base.model.ErrorModel;
import com.kakao.android.base.tiara.TiaraUtils;
import com.kakao.tistory.data.preference.AppSessionPreference;
import com.kakao.tistory.data.preference.DeviceInfoPreference;
import com.kakao.tistory.data.service.AccountService;
import com.kakao.tistory.domain.ErrorStatusKt;
import com.kakao.tistory.domain.entity.Account;
import com.kakao.tistory.domain.entity.Blog;
import com.kakao.tistory.domain.entity.LoginResult;
import com.kakao.tistory.domain.entity.User;
import com.kakao.tistory.domain.entity.UserKt;
import com.kakao.tistory.domain.entity.common.RegulationErrorModel;
import com.kakao.tistory.domain.entity.common.Result.Fail;
import com.kakao.tistory.domain.entity.common.Result.Success;
import com.kakao.tistory.domain.repository.AccountRepository.DefaultImpls;
import com.kakao.tistory.domain.repository.AccountRepository;
import java.io.File;
import java.util.List;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.p;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import okhttp3.MediaType;
import okhttp3.MultipartBody.Part;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u00012\u00020\u0002B!\b\u0007\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\b\u001A\u00020\u0007\u00A2\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000E\u001A\u00020\r2\u0006\u0010\f\u001A\u00020\u000BH\u0016\u00A2\u0006\u0004\b\u000E\u0010\u000FJ@\u0010\u0018\u001A\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0010\u001A\u00020\u000B2\u0006\u0010\u0012\u001A\u00020\u00112\u0006\u0010\u0013\u001A\u00020\u000B2\u0006\u0010\u0014\u001A\u00020\u00112\b\u0010\u0015\u001A\u0004\u0018\u00010\u000BH\u0096@\u00A2\u0006\u0004\b\u0018\u0010\u0019J\u001E\u0010\u001A\u001A\b\u0012\u0004\u0012\u00020\r0\u00162\u0006\u0010\u0010\u001A\u00020\u000BH\u0096@\u00A2\u0006\u0004\b\u001A\u0010\u001BJ@\u0010\u001D\u001A\b\u0012\u0004\u0012\u00020\u001C0\u00162\u0006\u0010\u0010\u001A\u00020\u000B2\u0006\u0010\u0012\u001A\u00020\u00112\u0006\u0010\u0013\u001A\u00020\u000B2\u0006\u0010\u0014\u001A\u00020\u00112\b\u0010\u0015\u001A\u0004\u0018\u00010\u000BH\u0096@\u00A2\u0006\u0004\b\u001D\u0010\u0019J&\u0010 \u001A\b\u0012\u0004\u0012\u00020\u001C0\u00162\u0006\u0010\u001E\u001A\u00020\u000B2\u0006\u0010\u001F\u001A\u00020\u000BH\u0096@\u00A2\u0006\u0004\b \u0010!J\u0016\u0010#\u001A\b\u0012\u0004\u0012\u00020\"0\u0016H\u0096@\u00A2\u0006\u0004\b#\u0010$J\u0016\u0010%\u001A\b\u0012\u0004\u0012\u00020\u001C0\u0016H\u0096@\u00A2\u0006\u0004\b%\u0010$J\u0017\u0010)\u001A\u00020(2\u0006\u0010\'\u001A\u00020&H\u0016\u00A2\u0006\u0004\b)\u0010*J\u001E\u0010,\u001A\b\u0012\u0004\u0012\u00020&0\u00162\u0006\u0010+\u001A\u00020\u0011H\u0096@\u00A2\u0006\u0004\b,\u0010-J \u00100\u001A\b\u0012\u0004\u0012\u00020/0\u00162\b\u0010.\u001A\u0004\u0018\u00010\u000BH\u0096@\u00A2\u0006\u0004\b0\u0010\u001BJ\u0016\u00101\u001A\b\u0012\u0004\u0012\u00020/0\u0016H\u0096@\u00A2\u0006\u0004\b1\u0010$J\u0017\u00104\u001A\u0002032\u0006\u00102\u001A\u00020\u000BH\u0016\u00A2\u0006\u0004\b4\u00105J\u001E\u00108\u001A\b\u0012\u0004\u0012\u0002070\u00162\u0006\u00106\u001A\u00020\u000BH\u0096@\u00A2\u0006\u0004\b8\u0010\u001BJ\u0016\u00109\u001A\b\u0012\u0004\u0012\u00020(0\u0016H\u0096@\u00A2\u0006\u0004\b9\u0010$J\u0017\u0010:\u001A\u00020(2\u0006\u0010\'\u001A\u00020&H\u0016\u00A2\u0006\u0004\b:\u0010*J\u0017\u0010:\u001A\u00020(2\u0006\u0010;\u001A\u00020\u000BH\u0016\u00A2\u0006\u0004\b:\u0010<J#\u0010>\u001A\u00020(2\b\u0010\'\u001A\u0004\u0018\u00010&2\b\u0010=\u001A\u0004\u0018\u00010\u001CH\u0016\u00A2\u0006\u0004\b>\u0010?J\u0016\u0010@\u001A\b\u0012\u0004\u0012\u00020(0\u0016H\u0096@\u00A2\u0006\u0004\b@\u0010$J\u0016\u0010A\u001A\b\u0012\u0004\u0012\u00020(0\u0016H\u0096@\u00A2\u0006\u0004\bA\u0010$J\u0019\u0010B\u001A\u0004\u0018\u00010&2\u0006\u0010;\u001A\u00020\u000BH\u0016\u00A2\u0006\u0004\bB\u0010CJ\u000F\u0010D\u001A\u00020(H\u0016\u00A2\u0006\u0004\bD\u0010ER.\u0010\u0010\u001A\u0004\u0018\u00010\u000B2\b\u0010F\u001A\u0004\u0018\u00010\u000B8V@VX\u0096\u000E\u00A2\u0006\u0012\n\u0004\bG\u0010H\u001A\u0004\bI\u0010J\"\u0004\bK\u0010<R.\u0010O\u001A\u0004\u0018\u00010\u000B2\b\u0010F\u001A\u0004\u0018\u00010\u000B8V@VX\u0096\u000E\u00A2\u0006\u0012\n\u0004\bL\u0010H\u001A\u0004\bM\u0010J\"\u0004\bN\u0010<R\"\u0010U\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u001C0P8\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\bQ\u0010R\u001A\u0004\bS\u0010TR \u0010X\u001A\b\u0012\u0004\u0012\u00020V0P8\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\bW\u0010R\u001A\u0004\bX\u0010TR\"\u0010^\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010/0Y8\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\bZ\u0010[\u001A\u0004\b\\\u0010]R\"\u0010d\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010/0_8\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b`\u0010a\u001A\u0004\bb\u0010cR\"\u0010g\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010&0P8\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\be\u0010R\u001A\u0004\bf\u0010TR\"\u0010j\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010&0P8\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\bh\u0010R\u001A\u0004\bi\u0010TR\"\u0010m\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u000B0P8\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\bk\u0010R\u001A\u0004\bl\u0010TR\"\u0010p\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010&0_8\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\bn\u0010a\u001A\u0004\bo\u0010c\u00A8\u0006q"}, d2 = {"Lcom/kakao/tistory/data/repository/AccountRepositoryImpl;", "Lcom/kakao/tistory/data/repository/BaseRepository;", "Lcom/kakao/tistory/domain/repository/AccountRepository;", "Lcom/kakao/tistory/data/preference/AppSessionPreference;", "appSessionPreference", "Lcom/kakao/tistory/data/preference/DeviceInfoPreference;", "deviceInfoPreference", "Lcom/kakao/tistory/data/service/AccountService;", "accountService", "<init>", "(Lcom/kakao/tistory/data/preference/AppSessionPreference;Lcom/kakao/tistory/data/preference/DeviceInfoPreference;Lcom/kakao/tistory/data/service/AccountService;)V", "", "errorString", "Lcom/kakao/android/base/model/ErrorModel;", "parseErrorModel", "(Ljava/lang/String;)Lcom/kakao/android/base/model/ErrorModel;", "accessToken", "", "accessTokenExpiresAt", "refreshToken", "refreshTokenExpiresAt", "scope", "Lcom/kakao/tistory/domain/entity/common/Result;", "Lcom/kakao/tistory/domain/entity/common/EmptyModel;", "postTransfer", "(Ljava/lang/String;JLjava/lang/String;JLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postTransferCheck", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/kakao/tistory/domain/entity/Account;", "postLoginByKakao", "loginId", "password", "postLoginByTistory", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/kakao/tistory/domain/entity/LoginResult;", "postLoginByToken", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "syncUserProfile", "Lcom/kakao/tistory/domain/entity/Blog;", "blog", "", "updateBlog", "(Lcom/kakao/tistory/domain/entity/Blog;)V", "blogId", "changeDefaultBlog", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "imageUrl", "Lcom/kakao/tistory/domain/entity/User;", "postProfileImage", "deleteProfileImage", "filePath", "Lokhttp3/MultipartBody$Part;", "createMultipartBody", "(Ljava/lang/String;)Lokhttp3/MultipartBody$Part;", "nickname", "Lcom/kakao/tistory/domain/entity/common/CheckModel;", "postCheckNickname", "postSendingResetPasswordEmail", "switchCurrentBlog", "blogName", "(Ljava/lang/String;)V", "account", "updateAccountAndCurrentBlog", "(Lcom/kakao/tistory/domain/entity/Blog;Lcom/kakao/tistory/domain/entity/Account;)V", "postLogout", "leave", "getMyBlog", "(Ljava/lang/String;)Lcom/kakao/tistory/domain/entity/Blog;", "clearAppSession", "()V", "value", "d", "Ljava/lang/String;", "getAccessToken", "()Ljava/lang/String;", "setAccessToken", "e", "getKakaoAccessToken", "setKakaoAccessToken", "kakaoAccessToken", "Landroidx/lifecycle/MutableLiveData;", "f", "Landroidx/lifecycle/MutableLiveData;", "getOldAccount", "()Landroidx/lifecycle/MutableLiveData;", "oldAccount", "", "g", "isKakaoAccount", "Landroidx/lifecycle/LiveData;", "h", "Landroidx/lifecycle/LiveData;", "getOldUser", "()Landroidx/lifecycle/LiveData;", "oldUser", "Lkotlinx/coroutines/flow/Flow;", "i", "Lkotlinx/coroutines/flow/Flow;", "getOldUserFlow", "()Lkotlinx/coroutines/flow/Flow;", "oldUserFlow", "j", "getOldDefaultBlog", "oldDefaultBlog", "k", "getOldCurrentBlog", "oldCurrentBlog", "l", "getOldCurrentBlogName", "oldCurrentBlogName", "m", "getOldCurrentBlogFlow", "oldCurrentBlogFlow", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAccountRepositoryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountRepositoryImpl.kt\ncom/kakao/tistory/data/repository/AccountRepositoryImpl\n+ 2 BaseRepository.kt\ncom/kakao/tistory/data/repository/BaseRepository\n+ 3 BaseRepository.kt\ncom/kakao/tistory/data/repository/BaseRepository$checkError$2\n+ 4 Result.kt\ncom/kakao/tistory/domain/entity/common/ResultKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 7 Result.kt\ncom/kakao/tistory/domain/entity/common/ResultKt$process$2\n*L\n1#1,309:1\n26#2,27:310\n53#2:338\n26#2,27:339\n53#2:367\n35#2:368\n26#2,27:369\n53#2:397\n35#2:398\n26#2,27:404\n53#2:432\n35#2:433\n26#2,27:439\n53#2:467\n35#2:468\n26#2,27:473\n53#2:501\n35#2:502\n26#2,27:510\n53#2:538\n35#2:539\n26#2,27:545\n53#2:573\n35#2:574\n26#2,27:580\n53#2:608\n35#2:609\n26#2,27:619\n53#2:647\n35#2:648\n26#2,27:649\n53#2:677\n35#2:678\n26#2,27:679\n53#2:707\n35#2:708\n26#2,27:714\n53#2:742\n35#2:743\n39#3:337\n39#3:366\n39#3:396\n39#3:431\n39#3:466\n39#3:500\n39#3:537\n39#3:572\n39#3:607\n39#3:646\n39#3:676\n39#3:706\n39#3:741\n15#4,5:399\n15#4,5:434\n25#4,2:469\n27#4:472\n15#4,5:503\n15#4,5:540\n15#4,5:575\n11#4,7:610\n19#4:618\n15#4,5:709\n15#4,5:744\n1#5:471\n288#6,2:508\n1864#6,3:749\n13#7:617\n*S KotlinDebug\n*F\n+ 1 AccountRepositoryImpl.kt\ncom/kakao/tistory/data/repository/AccountRepositoryImpl\n*L\n73#1:310,27\n73#1:338\n85#1:339,27\n85#1:367\n85#1:368\n95#1:369,27\n95#1:397\n95#1:398\n118#1:404,27\n118#1:432\n118#1:433\n131#1:439,27\n131#1:467\n131#1:468\n152#1:473,27\n152#1:501\n152#1:502\n194#1:510,27\n194#1:538\n194#1:539\n203#1:545,27\n203#1:573\n203#1:574\n215#1:580,27\n215#1:608\n215#1:609\n233#1:619,27\n233#1:647\n233#1:648\n237#1:649,27\n237#1:677\n237#1:678\n268#1:679,27\n268#1:707\n268#1:708\n276#1:714,27\n276#1:742\n276#1:743\n73#1:337\n85#1:366\n95#1:396\n118#1:431\n131#1:466\n152#1:500\n194#1:537\n203#1:572\n215#1:607\n233#1:646\n237#1:676\n268#1:706\n276#1:741\n104#1:399,5\n119#1:434,5\n132#1:469,2\n132#1:472\n153#1:503,5\n195#1:540,5\n204#1:575,5\n216#1:610,7\n216#1:618\n269#1:709,5\n277#1:744,5\n178#1:508,2\n288#1:749,3\n216#1:617\n*E\n"})
public final class AccountRepositoryImpl extends BaseRepository implements AccountRepository {
    public final AppSessionPreference a;
    public final DeviceInfoPreference b;
    public final AccountService c;
    public String d;
    public String e;
    public final MutableLiveData f;
    public final MutableLiveData g;
    public final LiveData h;
    public final Flow i;
    public final MutableLiveData j;
    public final MutableLiveData k;
    public final MutableLiveData l;
    public final Flow m;

    @Inject
    public AccountRepositoryImpl(@NotNull AppSessionPreference appSessionPreference0, @NotNull DeviceInfoPreference deviceInfoPreference0, @NotNull AccountService accountService0) {
        Intrinsics.checkNotNullParameter(appSessionPreference0, "appSessionPreference");
        Intrinsics.checkNotNullParameter(deviceInfoPreference0, "deviceInfoPreference");
        Intrinsics.checkNotNullParameter(accountService0, "accountService");
        super();
        this.a = appSessionPreference0;
        this.b = deviceInfoPreference0;
        this.c = accountService0;
        this.f = new MutableLiveData();
        this.g = new MutableLiveData();
        this.h = Transformations.map(this.getOldAccount(), new e(this));
        this.i = FlowLiveDataConversions.asFlow(this.getOldUser());
        this.j = new MutableLiveData();
        this.k = new MutableLiveData();
        this.l = new MutableLiveData();
        this.m = FlowLiveDataConversions.asFlow(this.getOldCurrentBlog());
    }

    public static Blog a(String s, List list0) {
        if(s != null && !p.isBlank(s) && list0 != null) {
            for(Object object0: list0) {
                if(Intrinsics.areEqual(((Blog)object0).getName(), s)) {
                    return object0;
                }
                if(false) {
                    break;
                }
            }
        }
        return null;
    }

    public static final void a(Boolean boolean0) {
    }

    public final void a(User user0) {
        Blog blog0;
        String s = this.a.getCurrentBlogName();
        String s1 = null;
        if(user0 == null) {
        label_5:
            blog0 = AccountRepositoryImpl.a(s, (user0 == null ? null : user0.getOwnerBlogs()));
            if(blog0 == null) {
                blog0 = AccountRepositoryImpl.a(s, (user0 == null ? null : user0.getJoinedBlogs()));
                if(blog0 == null) {
                    blog0 = user0 == null ? null : user0.getDefaultBlog();
                }
            }
        }
        else {
            blog0 = user0.getCurrentBlog();
            if(blog0 == null) {
                goto label_5;
            }
        }
        this.getOldCurrentBlog().setValue(blog0);
        MutableLiveData mutableLiveData0 = this.getOldCurrentBlogName();
        if(blog0 != null) {
            s1 = blog0.getName();
        }
        mutableLiveData0.setValue(s1);
    }

    @Override  // com.kakao.tistory.domain.repository.AccountRepository
    @Nullable
    public Object changeDefaultBlog(long v, @NotNull Continuation continuation0) {
        Object object2;
        BaseRepository baseRepository0;
        ErrorModel errorModel0;
        BaseRepository baseRepository1;
        b b0;
        if(continuation0 instanceof b) {
            b0 = (b)continuation0;
            int v1 = b0.e;
            if((v1 & 0x80000000) == 0) {
                b0 = new b(this, continuation0);
            }
            else {
                b0.e = v1 ^ 0x80000000;
            }
        }
        else {
            b0 = new b(this, continuation0);
        }
        Object object0 = b0.c;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(b0.e) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    b0.a = this;
                    b0.b = this;
                    b0.e = 1;
                    object0 = this.c.putChangeDefaultBlog(v, b0);
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
                baseRepository1 = (BaseRepository)b0.b;
                baseRepository0 = b0.a;
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
                baseRepository1 = (BaseRepository)b0.b;
                baseRepository0 = b0.a;
                ResultKt.throwOnFailure(object0);
                object2 = new Fail(baseRepository1.createCoroutineCancelErrorModel());
                goto label_82;
            }
            case 3: {
                baseRepository1 = (BaseRepository)b0.b;
                baseRepository0 = b0.a;
                ResultKt.throwOnFailure(object0);
                goto label_66;
            }
            case 4: 
            case 5: {
                errorModel0 = (ErrorModel)b0.b;
                baseRepository0 = b0.a;
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
            b0.a = baseRepository0;
            b0.b = baseRepository1;
            b0.e = 2;
            if(baseRepository1.sendError("coroutine cancel", cancellationException0, b0) == object1) {
                return object1;
            }
            object2 = new Fail(baseRepository1.createCoroutineCancelErrorModel());
            goto label_82;
        }
        catch(Throwable throwable0) {
        }
    label_60:
        b0.a = baseRepository0;
        b0.b = baseRepository1;
        b0.e = 3;
        object0 = baseRepository1.createErrorModel(throwable0, b0);
        if(object0 == object1) {
            return object1;
        }
    label_66:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository1.getThrowableRepository().getSessionThrowable();
            b0.a = baseRepository0;
            b0.b = (ErrorModel)object0;
            b0.e = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), b0) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository1.getThrowableRepository().getInspectionThrowable();
            b0.a = baseRepository0;
            b0.b = (ErrorModel)object0;
            b0.e = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), b0) == object1) {
                return object1;
            }
        }
        errorModel0 = (ErrorModel)object0;
    label_81:
        object2 = new Fail(errorModel0);
    label_82:
        if(object2 instanceof Success) {
            MutableLiveData mutableLiveData0 = ((AccountRepositoryImpl)baseRepository0).getOldAccount();
            Account account0 = (Account)((AccountRepositoryImpl)baseRepository0).getOldAccount().getValue();
            if(account0 == null) {
                account0 = null;
            }
            else {
                User user0 = account0.getUser();
                if(user0 != null) {
                    user0.setDefaultBlog(((Blog)((Success)object2).getData()));
                }
            }
            mutableLiveData0.postValue(account0);
        }
        return object2;
    }

    @Override  // com.kakao.tistory.domain.repository.AccountRepository
    public void clearAppSession() {
        this.a.clearAll();
        this.b.clearAll();
        this.setAccessToken(null);
        this.setKakaoAccessToken(null);
    }

    @Override  // com.kakao.tistory.domain.repository.AccountRepository
    @NotNull
    public Part createMultipartBody(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "filePath");
        File file0 = new File(s);
        MediaType mediaType0 = MediaType.Companion.parse("image/*");
        RequestBody requestBody0 = RequestBody.Companion.create(file0, mediaType0);
        String s1 = file0.getName();
        return Part.Companion.createFormData("profileImage", s1, requestBody0);
    }

    @Override  // com.kakao.tistory.domain.repository.AccountRepository
    @Nullable
    public Object deleteProfileImage(@NotNull Continuation continuation0) {
        Object object2;
        BaseRepository baseRepository0;
        ErrorModel errorModel0;
        BaseRepository baseRepository2;
        BaseRepository baseRepository1;
        BaseRepository baseRepository3;
        BaseRepository baseRepository4;
        c c0;
        if(continuation0 instanceof c) {
            c0 = (c)continuation0;
            int v = c0.e;
            if((v & 0x80000000) == 0) {
                c0 = new c(this, continuation0);
            }
            else {
                c0.e = v ^ 0x80000000;
            }
        }
        else {
            c0 = new c(this, continuation0);
        }
        Object object0 = c0.c;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(c0.e) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    c0.a = this;
                    c0.b = this;
                    c0.e = 1;
                    object0 = this.c.deleteProfileImage(c0);
                }
                catch(CancellationException cancellationException0) {
                    baseRepository1 = this;
                    baseRepository4 = baseRepository1;
                    goto label_50;
                }
                catch(Throwable throwable0) {
                    baseRepository1 = this;
                    baseRepository4 = baseRepository1;
                    goto label_60;
                }
                if(object0 == object1) {
                    return object1;
                }
                baseRepository1 = this;
                baseRepository4 = baseRepository1;
                break;
            }
            case 1: {
                baseRepository1 = (BaseRepository)c0.b;
                baseRepository4 = c0.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    goto label_50;
                }
                catch(Throwable throwable0) {
                    goto label_60;
                }
            }
            case 2: {
                baseRepository3 = (BaseRepository)c0.b;
                baseRepository0 = c0.a;
                ResultKt.throwOnFailure(object0);
                object2 = new Fail(baseRepository3.createCoroutineCancelErrorModel());
                goto label_84;
            }
            case 3: {
                baseRepository1 = (BaseRepository)c0.b;
                baseRepository2 = c0.a;
                ResultKt.throwOnFailure(object0);
                goto label_67;
            }
            case 4: 
            case 5: {
                errorModel0 = (ErrorModel)c0.b;
                baseRepository0 = c0.a;
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
        label_50:
            c0.a = baseRepository4;
            c0.b = baseRepository1;
            c0.e = 2;
            if(baseRepository1.sendError("coroutine cancel", cancellationException0, c0) == object1) {
                return object1;
            }
            baseRepository3 = baseRepository1;
            baseRepository0 = baseRepository4;
            object2 = new Fail(baseRepository3.createCoroutineCancelErrorModel());
            goto label_84;
        }
        catch(Throwable throwable0) {
        }
    label_60:
        c0.a = baseRepository4;
        c0.b = baseRepository1;
        c0.e = 3;
        object0 = baseRepository1.createErrorModel(throwable0, c0);
        if(object0 == object1) {
            return object1;
        }
        baseRepository2 = baseRepository4;
    label_67:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository1.getThrowableRepository().getSessionThrowable();
            c0.a = baseRepository2;
            c0.b = (ErrorModel)object0;
            c0.e = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), c0) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository1.getThrowableRepository().getInspectionThrowable();
            c0.a = baseRepository2;
            c0.b = (ErrorModel)object0;
            c0.e = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), c0) == object1) {
                return object1;
            }
        }
        errorModel0 = (ErrorModel)object0;
        baseRepository0 = baseRepository2;
    label_83:
        object2 = new Fail(errorModel0);
    label_84:
        baseRepository4 = baseRepository0;
    label_85:
        if(object2 instanceof Success) {
            User user0 = (User)((Success)object2).getData();
            MutableLiveData mutableLiveData0 = ((AccountRepositoryImpl)baseRepository4).getOldAccount();
            Account account0 = (Account)((AccountRepositoryImpl)baseRepository4).getOldAccount().getValue();
            if(account0 == null) {
                account0 = null;
            }
            else {
                User user1 = account0.getUser();
                if(user1 != null) {
                    user1.setProfileImageUrl(user0.getProfileImageUrl());
                }
            }
            mutableLiveData0.postValue(account0);
        }
        return object2;
    }

    @Override  // com.kakao.tistory.domain.repository.AccountRepository
    @Nullable
    public String getAccessToken() {
        return this.d == null ? this.a.getAccessToken() : this.d;
    }

    @Override  // com.kakao.tistory.domain.repository.AccountRepository
    @Nullable
    public String getKakaoAccessToken() {
        return this.e == null ? this.a.getKakaoAccessToken() : this.e;
    }

    @Override  // com.kakao.tistory.domain.repository.AccountRepository
    @Nullable
    public Blog getMyBlog(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "blogName");
        User user0 = (User)this.getOldUser().getValue();
        List list0 = null;
        Blog blog0 = AccountRepositoryImpl.a(s, (user0 == null ? null : user0.getOwnerBlogs()));
        if(blog0 == null) {
            if(user0 != null) {
                list0 = user0.getJoinedBlogs();
            }
            return AccountRepositoryImpl.a(s, list0);
        }
        return blog0;
    }

    @Override  // com.kakao.tistory.domain.repository.AccountRepository
    @NotNull
    public MutableLiveData getOldAccount() {
        return this.f;
    }

    @Override  // com.kakao.tistory.domain.repository.AccountRepository
    @NotNull
    public MutableLiveData getOldCurrentBlog() {
        return this.k;
    }

    @Override  // com.kakao.tistory.domain.repository.AccountRepository
    @NotNull
    public Flow getOldCurrentBlogFlow() {
        return this.m;
    }

    @Override  // com.kakao.tistory.domain.repository.AccountRepository
    public LiveData getOldCurrentBlogName() {
        return this.getOldCurrentBlogName();
    }

    @NotNull
    public MutableLiveData getOldCurrentBlogName() {
        return this.l;
    }

    @Override  // com.kakao.tistory.domain.repository.AccountRepository
    public LiveData getOldDefaultBlog() {
        return this.getOldDefaultBlog();
    }

    @NotNull
    public MutableLiveData getOldDefaultBlog() {
        return this.j;
    }

    @Override  // com.kakao.tistory.domain.repository.AccountRepository
    @NotNull
    public LiveData getOldUser() {
        return this.h;
    }

    @Override  // com.kakao.tistory.domain.repository.AccountRepository
    @NotNull
    public Flow getOldUserFlow() {
        return this.i;
    }

    @Override  // com.kakao.tistory.domain.repository.AccountRepository
    public LiveData isKakaoAccount() {
        return this.isKakaoAccount();
    }

    @NotNull
    public MutableLiveData isKakaoAccount() {
        return this.g;
    }

    @Override  // com.kakao.tistory.domain.repository.AccountRepository
    @Nullable
    public Object leave(@NotNull Continuation continuation0) {
        Object object2;
        BaseRepository baseRepository0;
        ErrorModel errorModel0;
        BaseRepository baseRepository2;
        BaseRepository baseRepository1;
        BaseRepository baseRepository3;
        BaseRepository baseRepository4;
        d d0;
        if(continuation0 instanceof d) {
            d0 = (d)continuation0;
            int v = d0.e;
            if((v & 0x80000000) == 0) {
                d0 = new d(this, continuation0);
            }
            else {
                d0.e = v ^ 0x80000000;
            }
        }
        else {
            d0 = new d(this, continuation0);
        }
        Object object0 = d0.c;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(d0.e) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    d0.a = this;
                    d0.b = this;
                    d0.e = 1;
                    if(this.c.leave(d0) == object1) {
                        return object1;
                    }
                    baseRepository1 = this;
                    baseRepository4 = baseRepository1;
                    break;
                }
                catch(CancellationException cancellationException0) {
                    baseRepository1 = this;
                    baseRepository4 = baseRepository1;
                    goto label_49;
                }
                catch(Throwable throwable0) {
                    baseRepository1 = this;
                    baseRepository4 = baseRepository1;
                    goto label_59;
                }
                return object1;
            }
            case 1: {
                baseRepository1 = (BaseRepository)d0.b;
                baseRepository4 = d0.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    goto label_49;
                }
                catch(Throwable throwable0) {
                    goto label_59;
                }
            }
            case 2: {
                baseRepository3 = (BaseRepository)d0.b;
                baseRepository0 = d0.a;
                ResultKt.throwOnFailure(object0);
                object2 = new Fail(baseRepository3.createCoroutineCancelErrorModel());
                goto label_83;
            }
            case 3: {
                baseRepository1 = (BaseRepository)d0.b;
                baseRepository2 = d0.a;
                ResultKt.throwOnFailure(object0);
                goto label_66;
            }
            case 4: 
            case 5: {
                errorModel0 = (ErrorModel)d0.b;
                baseRepository0 = d0.a;
                ResultKt.throwOnFailure(object0);
                goto label_82;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            object2 = new Success(Unit.INSTANCE);
            goto label_84;
        }
        catch(CancellationException cancellationException0) {
        label_49:
            d0.a = baseRepository4;
            d0.b = baseRepository1;
            d0.e = 2;
            if(baseRepository1.sendError("coroutine cancel", cancellationException0, d0) == object1) {
                return object1;
            }
            baseRepository3 = baseRepository1;
            baseRepository0 = baseRepository4;
            object2 = new Fail(baseRepository3.createCoroutineCancelErrorModel());
            goto label_83;
        }
        catch(Throwable throwable0) {
        }
    label_59:
        d0.a = baseRepository4;
        d0.b = baseRepository1;
        d0.e = 3;
        object0 = baseRepository1.createErrorModel(throwable0, d0);
        if(object0 == object1) {
            return object1;
        }
        baseRepository2 = baseRepository4;
    label_66:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository1.getThrowableRepository().getSessionThrowable();
            d0.a = baseRepository2;
            d0.b = (ErrorModel)object0;
            d0.e = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), d0) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository1.getThrowableRepository().getInspectionThrowable();
            d0.a = baseRepository2;
            d0.b = (ErrorModel)object0;
            d0.e = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), d0) == object1) {
                return object1;
            }
        }
        errorModel0 = (ErrorModel)object0;
        baseRepository0 = baseRepository2;
    label_82:
        object2 = new Fail(errorModel0);
    label_83:
        baseRepository4 = baseRepository0;
    label_84:
        if(object2 instanceof Success) {
            ((AccountRepositoryImpl)baseRepository4).clearAppSession();
        }
        return object2;
    }

    @Override  // com.kakao.tistory.data.repository.BaseRepository
    @NotNull
    public ErrorModel parseErrorModel(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "errorString");
        Object object0 = new Gson().fromJson(s, RegulationErrorModel.class);
        Intrinsics.checkNotNullExpressionValue(object0, "fromJson(...)");
        return (ErrorModel)object0;
    }

    @Override  // com.kakao.tistory.domain.repository.AccountRepository
    @Nullable
    public Object postCheckNickname(@NotNull String s, @NotNull Continuation continuation0) {
        BaseRepository baseRepository0;
        f f0;
        if(continuation0 instanceof f) {
            f0 = (f)continuation0;
            int v = f0.d;
            if((v & 0x80000000) == 0) {
                f0 = new f(this, continuation0);
            }
            else {
                f0.d = v ^ 0x80000000;
            }
        }
        else {
            f0 = new f(this, continuation0);
        }
        Object object0 = f0.b;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(f0.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    f0.a = this;
                    f0.d = 1;
                    object0 = this.c.postCheckNickname(s, f0);
                }
                catch(CancellationException cancellationException0) {
                    baseRepository0 = this;
                    f0.a = baseRepository0;
                    f0.d = 2;
                    return baseRepository0.sendError("coroutine cancel", cancellationException0, f0) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
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
                baseRepository0 = (BaseRepository)f0.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    f0.a = baseRepository0;
                    f0.d = 2;
                    return baseRepository0.sendError("coroutine cancel", cancellationException0, f0) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    goto label_47;
                }
            }
            case 2: {
                baseRepository0 = (BaseRepository)f0.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(baseRepository0.createCoroutineCancelErrorModel());
            }
            case 3: {
                baseRepository0 = (BaseRepository)f0.a;
                ResultKt.throwOnFailure(object0);
                goto label_52;
            }
            case 4: 
            case 5: {
                ErrorModel errorModel0 = (ErrorModel)f0.a;
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
            f0.a = baseRepository0;
            f0.d = 2;
            return baseRepository0.sendError("coroutine cancel", cancellationException0, f0) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
        }
        catch(Throwable throwable0) {
        }
    label_47:
        f0.a = baseRepository0;
        f0.d = 3;
        object0 = baseRepository0.createErrorModel(throwable0, f0);
        if(object0 == object1) {
            return object1;
        }
    label_52:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository0.getThrowableRepository().getSessionThrowable();
            f0.a = (ErrorModel)object0;
            f0.d = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), f0) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository0.getThrowableRepository().getInspectionThrowable();
            f0.a = (ErrorModel)object0;
            f0.d = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), f0) == object1) {
                return object1;
            }
        }
        return new Fail(((ErrorModel)object0));
    }

    @Override  // com.kakao.tistory.domain.repository.AccountRepository
    @Nullable
    public Object postLoginByKakao(@NotNull String s, long v, @NotNull String s1, long v1, @Nullable String s2, @NotNull Continuation continuation0) {
        Object object2;
        BaseRepository baseRepository0;
        ErrorModel errorModel0;
        BaseRepository baseRepository2;
        BaseRepository baseRepository1;
        g g0;
        if(continuation0 instanceof g) {
            g0 = (g)continuation0;
            int v2 = g0.e;
            if((v2 & 0x80000000) == 0) {
                g0 = new g(this, continuation0);
            }
            else {
                g0.e = v2 ^ 0x80000000;
            }
        }
        else {
            g0 = new g(this, continuation0);
        }
        Object object0 = g0.c;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(g0.e) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    g0.a = this;
                    g0.b = this;
                    g0.e = 1;
                    object0 = this.c.postLoginByKakao(s, v, s1, v1, s2, g0);
                }
                catch(CancellationException cancellationException0) {
                    baseRepository1 = this;
                    baseRepository2 = baseRepository1;
                    goto label_50;
                }
                catch(Throwable throwable0) {
                    baseRepository1 = this;
                    baseRepository2 = baseRepository1;
                    goto label_59;
                }
                if(object0 == object1) {
                    return object1;
                }
                baseRepository1 = this;
                baseRepository2 = baseRepository1;
                break;
            }
            case 1: {
                baseRepository1 = (BaseRepository)g0.b;
                baseRepository2 = g0.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    goto label_50;
                }
                catch(Throwable throwable0) {
                    goto label_59;
                }
            }
            case 2: {
                baseRepository1 = (BaseRepository)g0.b;
                baseRepository0 = g0.a;
                ResultKt.throwOnFailure(object0);
                object2 = new Fail(baseRepository1.createCoroutineCancelErrorModel());
                goto label_82;
            }
            case 3: {
                baseRepository1 = (BaseRepository)g0.b;
                baseRepository2 = g0.a;
                ResultKt.throwOnFailure(object0);
                goto label_65;
            }
            case 4: 
            case 5: {
                errorModel0 = (ErrorModel)g0.b;
                baseRepository0 = g0.a;
                ResultKt.throwOnFailure(object0);
                goto label_81;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            object2 = new Success(object0);
            goto label_83;
        }
        catch(CancellationException cancellationException0) {
        label_50:
            g0.a = baseRepository2;
            g0.b = baseRepository1;
            g0.e = 2;
            if(baseRepository1.sendError("coroutine cancel", cancellationException0, g0) == object1) {
                return object1;
            }
            baseRepository0 = baseRepository2;
            object2 = new Fail(baseRepository1.createCoroutineCancelErrorModel());
            goto label_82;
        }
        catch(Throwable throwable0) {
        }
    label_59:
        g0.a = baseRepository2;
        g0.b = baseRepository1;
        g0.e = 3;
        object0 = baseRepository1.createErrorModel(throwable0, g0);
        if(object0 == object1) {
            return object1;
        }
    label_65:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository1.getThrowableRepository().getSessionThrowable();
            g0.a = baseRepository2;
            g0.b = (ErrorModel)object0;
            g0.e = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), g0) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository1.getThrowableRepository().getInspectionThrowable();
            g0.a = baseRepository2;
            g0.b = (ErrorModel)object0;
            g0.e = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), g0) == object1) {
                return object1;
            }
        }
        errorModel0 = (ErrorModel)object0;
        baseRepository0 = baseRepository2;
    label_81:
        object2 = new Fail(errorModel0);
    label_82:
        baseRepository2 = baseRepository0;
    label_83:
        if(object2 instanceof Success) {
            ((AccountRepositoryImpl)baseRepository2).setAccessToken(((Account)((Success)object2).getData()).getToken());
            User user0 = ((Account)((Success)object2).getData()).getUser();
            ((AccountRepositoryImpl)baseRepository2).updateAccountAndCurrentBlog((user0 == null ? null : user0.getDefaultBlog()), ((Account)((Success)object2).getData()));
            return object2;
        }
        if(object2 instanceof Fail) {
            ((AccountRepositoryImpl)baseRepository2).clearAppSession();
        }
        return object2;
    }

    @Override  // com.kakao.tistory.domain.repository.AccountRepository
    @Nullable
    public Object postLoginByTistory(@NotNull String s, @NotNull String s1, @NotNull Continuation continuation0) {
        Object object2;
        BaseRepository baseRepository0;
        ErrorModel errorModel0;
        BaseRepository baseRepository1;
        h h0;
        if(continuation0 instanceof h) {
            h0 = (h)continuation0;
            int v = h0.e;
            if((v & 0x80000000) == 0) {
                h0 = new h(this, continuation0);
            }
            else {
                h0.e = v ^ 0x80000000;
            }
        }
        else {
            h0 = new h(this, continuation0);
        }
        Object object0 = h0.c;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(h0.e) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    h0.a = this;
                    h0.b = this;
                    h0.e = 1;
                    object0 = this.c.postLogin(s, s1, h0);
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
                baseRepository1 = (BaseRepository)h0.b;
                baseRepository0 = h0.a;
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
                baseRepository1 = (BaseRepository)h0.b;
                baseRepository0 = h0.a;
                ResultKt.throwOnFailure(object0);
                object2 = new Fail(baseRepository1.createCoroutineCancelErrorModel());
                goto label_82;
            }
            case 3: {
                baseRepository1 = (BaseRepository)h0.b;
                baseRepository0 = h0.a;
                ResultKt.throwOnFailure(object0);
                goto label_66;
            }
            case 4: 
            case 5: {
                errorModel0 = (ErrorModel)h0.b;
                baseRepository0 = h0.a;
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
            h0.a = baseRepository0;
            h0.b = baseRepository1;
            h0.e = 2;
            if(baseRepository1.sendError("coroutine cancel", cancellationException0, h0) == object1) {
                return object1;
            }
            object2 = new Fail(baseRepository1.createCoroutineCancelErrorModel());
            goto label_82;
        }
        catch(Throwable throwable0) {
        }
    label_60:
        h0.a = baseRepository0;
        h0.b = baseRepository1;
        h0.e = 3;
        object0 = baseRepository1.createErrorModel(throwable0, h0);
        if(object0 == object1) {
            return object1;
        }
    label_66:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository1.getThrowableRepository().getSessionThrowable();
            h0.a = baseRepository0;
            h0.b = (ErrorModel)object0;
            h0.e = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), h0) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository1.getThrowableRepository().getInspectionThrowable();
            h0.a = baseRepository0;
            h0.b = (ErrorModel)object0;
            h0.e = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), h0) == object1) {
                return object1;
            }
        }
        errorModel0 = (ErrorModel)object0;
    label_81:
        object2 = new Fail(errorModel0);
    label_82:
        if(object2 instanceof Success) {
            Account account0 = (Account)((Success)object2).getData();
            ((AccountRepositoryImpl)baseRepository0).setAccessToken(account0.getToken());
            User user0 = account0.getUser();
            ((AccountRepositoryImpl)baseRepository0).updateAccountAndCurrentBlog((user0 == null ? null : user0.getDefaultBlog()), account0);
            return object2;
        }
        if(object2 instanceof Fail) {
            ((AccountRepositoryImpl)baseRepository0).clearAppSession();
        }
        return object2;
    }

    @Override  // com.kakao.tistory.domain.repository.AccountRepository
    @Nullable
    public Object postLoginByToken(@NotNull Continuation continuation0) {
        Fail result$Fail0;
        BaseRepository baseRepository0;
        ErrorModel errorModel0;
        BaseRepository baseRepository2;
        BaseRepository baseRepository1;
        BaseRepository baseRepository3;
        BaseRepository baseRepository4;
        i i0;
        if(continuation0 instanceof i) {
            i0 = (i)continuation0;
            int v = i0.e;
            if((v & 0x80000000) == 0) {
                i0 = new i(this, continuation0);
            }
            else {
                i0.e = v ^ 0x80000000;
            }
        }
        else {
            i0 = new i(this, continuation0);
        }
        Object object0 = i0.c;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(i0.e) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    i0.a = this;
                    i0.b = this;
                    i0.e = 1;
                    object0 = this.c.postLoginByToken(i0);
                }
                catch(CancellationException cancellationException0) {
                    baseRepository1 = this;
                    baseRepository4 = baseRepository1;
                    goto label_50;
                }
                catch(Throwable throwable0) {
                    baseRepository1 = this;
                    baseRepository4 = baseRepository1;
                    goto label_60;
                }
                if(object0 == object1) {
                    return object1;
                }
                baseRepository1 = this;
                baseRepository4 = baseRepository1;
                break;
            }
            case 1: {
                baseRepository1 = (BaseRepository)i0.b;
                baseRepository4 = i0.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    goto label_50;
                }
                catch(Throwable throwable0) {
                    goto label_60;
                }
            }
            case 2: {
                baseRepository3 = (BaseRepository)i0.b;
                baseRepository0 = i0.a;
                ResultKt.throwOnFailure(object0);
                result$Fail0 = new Fail(baseRepository3.createCoroutineCancelErrorModel());
                goto label_84;
            }
            case 3: {
                baseRepository1 = (BaseRepository)i0.b;
                baseRepository2 = i0.a;
                ResultKt.throwOnFailure(object0);
                goto label_67;
            }
            case 4: 
            case 5: {
                errorModel0 = (ErrorModel)i0.b;
                baseRepository0 = i0.a;
                ResultKt.throwOnFailure(object0);
                goto label_83;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            result$Fail0 = new Success(object0);
            goto label_85;
        }
        catch(CancellationException cancellationException0) {
        label_50:
            i0.a = baseRepository4;
            i0.b = baseRepository1;
            i0.e = 2;
            if(baseRepository1.sendError("coroutine cancel", cancellationException0, i0) == object1) {
                return object1;
            }
            baseRepository3 = baseRepository1;
            baseRepository0 = baseRepository4;
            result$Fail0 = new Fail(baseRepository3.createCoroutineCancelErrorModel());
            goto label_84;
        }
        catch(Throwable throwable0) {
        }
    label_60:
        i0.a = baseRepository4;
        i0.b = baseRepository1;
        i0.e = 3;
        object0 = baseRepository1.createErrorModel(throwable0, i0);
        if(object0 == object1) {
            return object1;
        }
        baseRepository2 = baseRepository4;
    label_67:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository1.getThrowableRepository().getSessionThrowable();
            i0.a = baseRepository2;
            i0.b = (ErrorModel)object0;
            i0.e = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), i0) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository1.getThrowableRepository().getInspectionThrowable();
            i0.a = baseRepository2;
            i0.b = (ErrorModel)object0;
            i0.e = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), i0) == object1) {
                return object1;
            }
        }
        errorModel0 = (ErrorModel)object0;
        baseRepository0 = baseRepository2;
    label_83:
        result$Fail0 = new Fail(errorModel0);
    label_84:
        baseRepository4 = baseRepository0;
    label_85:
        if(result$Fail0 instanceof Success) {
            Account account0 = (Account)((Success)result$Fail0).getData();
            ((AccountRepositoryImpl)baseRepository4).setAccessToken(account0.getToken());
            ((AccountRepositoryImpl)baseRepository4).setKakaoAccessToken(account0.getKakaoAccessToken());
            String s = ((AccountRepositoryImpl)baseRepository4).getKakaoAccessToken();
            Long long0 = null;
            if(s != null) {
                if(p.isBlank(s)) {
                    s = null;
                }
                if(s != null) {
                    TiaraUtils.INSTANCE.setAccessToken(s);
                }
            }
            ((AccountRepositoryImpl)baseRepository4).getOldAccount().setValue(account0);
            boolean z = UserKt.isTistoryAccount(((Account)((Success)result$Fail0).getData()).getUser());
            User user0 = ((Account)((Success)result$Fail0).getData()).getUser();
            if(user0 != null) {
                long0 = user0.getId();
            }
            return new Success(new LoginResult(z, long0));
        }
        if(!(result$Fail0 instanceof Fail)) {
            throw new NoWhenBranchMatchedException();
        }
        ((AccountRepositoryImpl)baseRepository4).clearAppSession();
        return result$Fail0;
    }

    @Override  // com.kakao.tistory.domain.repository.AccountRepository
    @Nullable
    public Object postLogout(@NotNull Continuation continuation0) {
        Object object2;
        BaseRepository baseRepository0;
        ErrorModel errorModel0;
        BaseRepository baseRepository2;
        BaseRepository baseRepository1;
        BaseRepository baseRepository3;
        BaseRepository baseRepository4;
        j j0;
        if(continuation0 instanceof j) {
            j0 = (j)continuation0;
            int v = j0.e;
            if((v & 0x80000000) == 0) {
                j0 = new j(this, continuation0);
            }
            else {
                j0.e = v ^ 0x80000000;
            }
        }
        else {
            j0 = new j(this, continuation0);
        }
        Object object0 = j0.c;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(j0.e) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    j0.a = this;
                    j0.b = this;
                    j0.e = 1;
                    if(this.c.postLogout(j0) == object1) {
                        return object1;
                    }
                    baseRepository1 = this;
                    baseRepository4 = baseRepository1;
                    break;
                }
                catch(CancellationException cancellationException0) {
                    baseRepository1 = this;
                    baseRepository4 = baseRepository1;
                    goto label_49;
                }
                catch(Throwable throwable0) {
                    baseRepository1 = this;
                    baseRepository4 = baseRepository1;
                    goto label_59;
                }
                return object1;
            }
            case 1: {
                baseRepository1 = (BaseRepository)j0.b;
                baseRepository4 = j0.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    goto label_49;
                }
                catch(Throwable throwable0) {
                    goto label_59;
                }
            }
            case 2: {
                baseRepository3 = (BaseRepository)j0.b;
                baseRepository0 = j0.a;
                ResultKt.throwOnFailure(object0);
                object2 = new Fail(baseRepository3.createCoroutineCancelErrorModel());
                goto label_83;
            }
            case 3: {
                baseRepository1 = (BaseRepository)j0.b;
                baseRepository2 = j0.a;
                ResultKt.throwOnFailure(object0);
                goto label_66;
            }
            case 4: 
            case 5: {
                errorModel0 = (ErrorModel)j0.b;
                baseRepository0 = j0.a;
                ResultKt.throwOnFailure(object0);
                goto label_82;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            object2 = new Success(Unit.INSTANCE);
            goto label_84;
        }
        catch(CancellationException cancellationException0) {
        label_49:
            j0.a = baseRepository4;
            j0.b = baseRepository1;
            j0.e = 2;
            if(baseRepository1.sendError("coroutine cancel", cancellationException0, j0) == object1) {
                return object1;
            }
            baseRepository3 = baseRepository1;
            baseRepository0 = baseRepository4;
            object2 = new Fail(baseRepository3.createCoroutineCancelErrorModel());
            goto label_83;
        }
        catch(Throwable throwable0) {
        }
    label_59:
        j0.a = baseRepository4;
        j0.b = baseRepository1;
        j0.e = 3;
        object0 = baseRepository1.createErrorModel(throwable0, j0);
        if(object0 == object1) {
            return object1;
        }
        baseRepository2 = baseRepository4;
    label_66:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository1.getThrowableRepository().getSessionThrowable();
            j0.a = baseRepository2;
            j0.b = (ErrorModel)object0;
            j0.e = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), j0) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository1.getThrowableRepository().getInspectionThrowable();
            j0.a = baseRepository2;
            j0.b = (ErrorModel)object0;
            j0.e = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), j0) == object1) {
                return object1;
            }
        }
        errorModel0 = (ErrorModel)object0;
        baseRepository0 = baseRepository2;
    label_82:
        object2 = new Fail(errorModel0);
    label_83:
        baseRepository4 = baseRepository0;
    label_84:
        if(object2 instanceof Success) {
            ((AccountRepositoryImpl)baseRepository4).clearAppSession();
        }
        return object2;
    }

    @Override  // com.kakao.tistory.domain.repository.AccountRepository
    @Nullable
    public Object postProfileImage(@Nullable String s, @NotNull Continuation continuation0) {
        Object object2;
        BaseRepository baseRepository0;
        ErrorModel errorModel0;
        BaseRepository baseRepository2;
        BaseRepository baseRepository1;
        k k0;
        if(continuation0 instanceof k) {
            k0 = (k)continuation0;
            int v = k0.e;
            if((v & 0x80000000) == 0) {
                k0 = new k(this, continuation0);
            }
            else {
                k0.e = v ^ 0x80000000;
            }
        }
        else {
            k0 = new k(this, continuation0);
        }
        Object object0 = k0.c;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        Account account0 = null;
        switch(k0.e) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                Part multipartBody$Part0 = s == null ? null : this.createMultipartBody(s);
                try {
                    k0.a = this;
                    k0.b = this;
                    k0.e = 1;
                    object0 = this.c.postProfileImage(multipartBody$Part0, k0);
                }
                catch(CancellationException cancellationException1) {
                    cancellationException0 = cancellationException1;
                    baseRepository1 = this;
                    baseRepository2 = baseRepository1;
                    goto label_54;
                }
                catch(Throwable throwable1) {
                    throwable0 = throwable1;
                    baseRepository1 = this;
                    baseRepository2 = baseRepository1;
                    goto label_63;
                }
                if(object0 == object1) {
                    return object1;
                }
                baseRepository1 = this;
                baseRepository2 = baseRepository1;
                break;
            }
            case 1: {
                baseRepository1 = (BaseRepository)k0.b;
                baseRepository2 = k0.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    goto label_54;
                }
                catch(Throwable throwable0) {
                    goto label_63;
                }
            }
            case 2: {
                baseRepository1 = (BaseRepository)k0.b;
                baseRepository0 = k0.a;
                ResultKt.throwOnFailure(object0);
                object2 = new Fail(baseRepository1.createCoroutineCancelErrorModel());
                goto label_86;
            }
            case 3: {
                baseRepository1 = (BaseRepository)k0.b;
                baseRepository2 = k0.a;
                ResultKt.throwOnFailure(object0);
                goto label_69;
            }
            case 4: 
            case 5: {
                errorModel0 = (ErrorModel)k0.b;
                baseRepository0 = k0.a;
                ResultKt.throwOnFailure(object0);
                goto label_85;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            object2 = new Success(object0);
            goto label_87;
        }
        catch(CancellationException cancellationException0) {
        label_54:
            k0.a = baseRepository2;
            k0.b = baseRepository1;
            k0.e = 2;
            if(baseRepository1.sendError("coroutine cancel", cancellationException0, k0) == object1) {
                return object1;
            }
            baseRepository0 = baseRepository2;
            object2 = new Fail(baseRepository1.createCoroutineCancelErrorModel());
            goto label_86;
        }
        catch(Throwable throwable0) {
        }
    label_63:
        k0.a = baseRepository2;
        k0.b = baseRepository1;
        k0.e = 3;
        object0 = baseRepository1.createErrorModel(throwable0, k0);
        if(object0 == object1) {
            return object1;
        }
    label_69:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository1.getThrowableRepository().getSessionThrowable();
            k0.a = baseRepository2;
            k0.b = (ErrorModel)object0;
            k0.e = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), k0) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository1.getThrowableRepository().getInspectionThrowable();
            k0.a = baseRepository2;
            k0.b = (ErrorModel)object0;
            k0.e = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), k0) == object1) {
                return object1;
            }
        }
        errorModel0 = (ErrorModel)object0;
        baseRepository0 = baseRepository2;
    label_85:
        object2 = new Fail(errorModel0);
    label_86:
        baseRepository2 = baseRepository0;
    label_87:
        if(object2 instanceof Success) {
            User user0 = (User)((Success)object2).getData();
            MutableLiveData mutableLiveData0 = ((AccountRepositoryImpl)baseRepository2).getOldAccount();
            Account account1 = (Account)((AccountRepositoryImpl)baseRepository2).getOldAccount().getValue();
            if(account1 != null) {
                User user1 = account1.getUser();
                if(user1 != null) {
                    user1.setProfileImageUrl(user0.getProfileImageUrl());
                }
                account0 = account1;
            }
            mutableLiveData0.postValue(account0);
        }
        return object2;
    }

    @Override  // com.kakao.tistory.domain.repository.AccountRepository
    @Nullable
    public Object postSendingResetPasswordEmail(@NotNull Continuation continuation0) {
        BaseRepository baseRepository1;
        l l0;
        if(continuation0 instanceof l) {
            l0 = (l)continuation0;
            int v = l0.d;
            if((v & 0x80000000) == 0) {
                l0 = new l(this, continuation0);
            }
            else {
                l0.d = v ^ 0x80000000;
            }
        }
        else {
            l0 = new l(this, continuation0);
        }
        Object object0 = l0.b;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(l0.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    l0.a = this;
                    l0.d = 1;
                    if(this.c.postSendingResetPasswordEmail(l0) == object1) {
                        return object1;
                    }
                    baseRepository1 = this;
                    break;
                }
                catch(CancellationException cancellationException0) {
                    baseRepository1 = this;
                    l0.a = baseRepository1;
                    l0.d = 2;
                    return baseRepository1.sendError("coroutine cancel", cancellationException0, l0) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    baseRepository1 = this;
                    goto label_46;
                }
                return object1;
            }
            case 1: {
                baseRepository1 = (BaseRepository)l0.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    l0.a = baseRepository1;
                    l0.d = 2;
                    return baseRepository1.sendError("coroutine cancel", cancellationException0, l0) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    goto label_46;
                }
            }
            case 2: {
                BaseRepository baseRepository0 = (BaseRepository)l0.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(baseRepository0.createCoroutineCancelErrorModel());
            }
            case 3: {
                baseRepository1 = (BaseRepository)l0.a;
                ResultKt.throwOnFailure(object0);
                goto label_51;
            }
            case 4: 
            case 5: {
                ErrorModel errorModel0 = (ErrorModel)l0.a;
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
            l0.a = baseRepository1;
            l0.d = 2;
            return baseRepository1.sendError("coroutine cancel", cancellationException0, l0) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
        }
        catch(Throwable throwable0) {
        }
    label_46:
        l0.a = baseRepository1;
        l0.d = 3;
        object0 = baseRepository1.createErrorModel(throwable0, l0);
        if(object0 == object1) {
            return object1;
        }
    label_51:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository1.getThrowableRepository().getSessionThrowable();
            l0.a = (ErrorModel)object0;
            l0.d = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), l0) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository1.getThrowableRepository().getInspectionThrowable();
            l0.a = (ErrorModel)object0;
            l0.d = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), l0) == object1) {
                return object1;
            }
        }
        return new Fail(((ErrorModel)object0));
    }

    @Override  // com.kakao.tistory.domain.repository.AccountRepository
    @Nullable
    public Object postTransfer(@NotNull String s, long v, @NotNull String s1, long v1, @Nullable String s2, @NotNull Continuation continuation0) {
        BaseRepository baseRepository1;
        m m0;
        if(continuation0 instanceof m) {
            m0 = (m)continuation0;
            int v2 = m0.d;
            if((v2 & 0x80000000) == 0) {
                m0 = new m(this, continuation0);
            }
            else {
                m0.d = v2 ^ 0x80000000;
            }
        }
        else {
            m0 = new m(this, continuation0);
        }
        Object object0 = m0.b;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(m0.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    m0.a = this;
                    m0.d = 1;
                    object0 = this.c.postTransfer(s, v, s1, v1, s2, m0);
                }
                catch(CancellationException cancellationException0) {
                    baseRepository1 = this;
                    m0.a = baseRepository1;
                    m0.d = 2;
                    return baseRepository1.sendError("coroutine cancel", cancellationException0, m0) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
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
                baseRepository1 = (BaseRepository)m0.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    m0.a = baseRepository1;
                    m0.d = 2;
                    return baseRepository1.sendError("coroutine cancel", cancellationException0, m0) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    goto label_47;
                }
            }
            case 2: {
                BaseRepository baseRepository0 = (BaseRepository)m0.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(baseRepository0.createCoroutineCancelErrorModel());
            }
            case 3: {
                baseRepository1 = (BaseRepository)m0.a;
                ResultKt.throwOnFailure(object0);
                goto label_52;
            }
            case 4: 
            case 5: {
                ErrorModel errorModel0 = (ErrorModel)m0.a;
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
            m0.a = baseRepository1;
            m0.d = 2;
            return baseRepository1.sendError("coroutine cancel", cancellationException0, m0) == object1 ? object1 : new Fail(baseRepository1.createCoroutineCancelErrorModel());
        }
        catch(Throwable throwable0) {
        }
    label_47:
        m0.a = baseRepository1;
        m0.d = 3;
        object0 = baseRepository1.createErrorModel(throwable0, m0);
        if(object0 == object1) {
            return object1;
        }
    label_52:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository1.getThrowableRepository().getSessionThrowable();
            m0.a = (ErrorModel)object0;
            m0.d = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), m0) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository1.getThrowableRepository().getInspectionThrowable();
            m0.a = (ErrorModel)object0;
            m0.d = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), m0) == object1) {
                return object1;
            }
        }
        return new Fail(((ErrorModel)object0));
    }

    @Override  // com.kakao.tistory.domain.repository.AccountRepository
    @Nullable
    public Object postTransferCheck(@NotNull String s, @NotNull Continuation continuation0) {
        BaseRepository baseRepository0;
        n n0;
        if(continuation0 instanceof n) {
            n0 = (n)continuation0;
            int v = n0.d;
            if((v & 0x80000000) == 0) {
                n0 = new n(this, continuation0);
            }
            else {
                n0.d = v ^ 0x80000000;
            }
        }
        else {
            n0 = new n(this, continuation0);
        }
        Object object0 = n0.b;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(n0.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    n0.a = this;
                    n0.d = 1;
                    object0 = this.c.postTransferCheck(s, n0);
                }
                catch(CancellationException cancellationException0) {
                    baseRepository0 = this;
                    n0.a = baseRepository0;
                    n0.d = 2;
                    return baseRepository0.sendError("coroutine cancel", cancellationException0, n0) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
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
                baseRepository0 = (BaseRepository)n0.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    n0.a = baseRepository0;
                    n0.d = 2;
                    return baseRepository0.sendError("coroutine cancel", cancellationException0, n0) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    goto label_47;
                }
            }
            case 2: {
                baseRepository0 = (BaseRepository)n0.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(baseRepository0.createCoroutineCancelErrorModel());
            }
            case 3: {
                baseRepository0 = (BaseRepository)n0.a;
                ResultKt.throwOnFailure(object0);
                goto label_52;
            }
            case 4: 
            case 5: {
                ErrorModel errorModel0 = (ErrorModel)n0.a;
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
            n0.a = baseRepository0;
            n0.d = 2;
            return baseRepository0.sendError("coroutine cancel", cancellationException0, n0) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
        }
        catch(Throwable throwable0) {
        }
    label_47:
        n0.a = baseRepository0;
        n0.d = 3;
        object0 = baseRepository0.createErrorModel(throwable0, n0);
        if(object0 == object1) {
            return object1;
        }
    label_52:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository0.getThrowableRepository().getSessionThrowable();
            n0.a = (ErrorModel)object0;
            n0.d = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), n0) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository0.getThrowableRepository().getInspectionThrowable();
            n0.a = (ErrorModel)object0;
            n0.d = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), n0) == object1) {
                return object1;
            }
        }
        return new Fail(((ErrorModel)object0));
    }

    @Override  // com.kakao.tistory.domain.repository.AccountRepository
    public void setAccessToken(@Nullable String s) {
        this.d = s;
        this.a.setAccessToken(s);
    }

    @Override  // com.kakao.tistory.domain.repository.AccountRepository
    public void setKakaoAccessToken(@Nullable String s) {
        this.e = s;
        this.a.setKakaoAccessToken(s);
    }

    @Override  // com.kakao.tistory.domain.repository.AccountRepository
    public void switchCurrentBlog(@NotNull Blog blog0) {
        Intrinsics.checkNotNullParameter(blog0, "blog");
        DefaultImpls.updateAccountAndCurrentBlog$default(this, blog0, null, 2, null);
    }

    @Override  // com.kakao.tistory.domain.repository.AccountRepository
    public void switchCurrentBlog(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "blogName");
        Blog blog0 = this.getMyBlog(s);
        if(blog0 != null) {
            DefaultImpls.updateAccountAndCurrentBlog$default(this, blog0, null, 2, null);
        }
    }

    @Override  // com.kakao.tistory.domain.repository.AccountRepository
    @Nullable
    public Object syncUserProfile(@NotNull Continuation continuation0) {
        Object object2;
        BaseRepository baseRepository0;
        ErrorModel errorModel0;
        BaseRepository baseRepository2;
        BaseRepository baseRepository1;
        BaseRepository baseRepository3;
        BaseRepository baseRepository4;
        o o0;
        if(continuation0 instanceof o) {
            o0 = (o)continuation0;
            int v = o0.e;
            if((v & 0x80000000) == 0) {
                o0 = new o(this, continuation0);
            }
            else {
                o0.e = v ^ 0x80000000;
            }
        }
        else {
            o0 = new o(this, continuation0);
        }
        Object object0 = o0.c;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(o0.e) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    o0.a = this;
                    o0.b = this;
                    o0.e = 1;
                    object0 = this.c.postLoginByToken(o0);
                }
                catch(CancellationException cancellationException0) {
                    baseRepository1 = this;
                    baseRepository4 = baseRepository1;
                    goto label_50;
                }
                catch(Throwable throwable0) {
                    baseRepository1 = this;
                    baseRepository4 = baseRepository1;
                    goto label_60;
                }
                if(object0 == object1) {
                    return object1;
                }
                baseRepository1 = this;
                baseRepository4 = baseRepository1;
                break;
            }
            case 1: {
                baseRepository1 = (BaseRepository)o0.b;
                baseRepository4 = o0.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    goto label_50;
                }
                catch(Throwable throwable0) {
                    goto label_60;
                }
            }
            case 2: {
                baseRepository3 = (BaseRepository)o0.b;
                baseRepository0 = o0.a;
                ResultKt.throwOnFailure(object0);
                object2 = new Fail(baseRepository3.createCoroutineCancelErrorModel());
                goto label_84;
            }
            case 3: {
                baseRepository1 = (BaseRepository)o0.b;
                baseRepository2 = o0.a;
                ResultKt.throwOnFailure(object0);
                goto label_67;
            }
            case 4: 
            case 5: {
                errorModel0 = (ErrorModel)o0.b;
                baseRepository0 = o0.a;
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
        label_50:
            o0.a = baseRepository4;
            o0.b = baseRepository1;
            o0.e = 2;
            if(baseRepository1.sendError("coroutine cancel", cancellationException0, o0) == object1) {
                return object1;
            }
            baseRepository3 = baseRepository1;
            baseRepository0 = baseRepository4;
            object2 = new Fail(baseRepository3.createCoroutineCancelErrorModel());
            goto label_84;
        }
        catch(Throwable throwable0) {
        }
    label_60:
        o0.a = baseRepository4;
        o0.b = baseRepository1;
        o0.e = 3;
        object0 = baseRepository1.createErrorModel(throwable0, o0);
        if(object0 == object1) {
            return object1;
        }
        baseRepository2 = baseRepository4;
    label_67:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository1.getThrowableRepository().getSessionThrowable();
            o0.a = baseRepository2;
            o0.b = (ErrorModel)object0;
            o0.e = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), o0) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository1.getThrowableRepository().getInspectionThrowable();
            o0.a = baseRepository2;
            o0.b = (ErrorModel)object0;
            o0.e = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), o0) == object1) {
                return object1;
            }
        }
        errorModel0 = (ErrorModel)object0;
        baseRepository0 = baseRepository2;
    label_83:
        object2 = new Fail(errorModel0);
    label_84:
        baseRepository4 = baseRepository0;
    label_85:
        if(object2 instanceof Success) {
            Account account0 = (Account)((Success)object2).getData();
            ((AccountRepositoryImpl)baseRepository4).getOldAccount().setValue(account0);
            ((AccountRepositoryImpl)baseRepository4).a(account0.getUser());
            return object2;
        }
        if(object2 instanceof Fail) {
            baseRepository4.a.clearAll();
        }
        return object2;
    }

    @Override  // com.kakao.tistory.domain.repository.AccountRepository
    public void updateAccountAndCurrentBlog(@Nullable Blog blog0, @Nullable Account account0) {
        CookieManager cookieManager0 = CookieManager.getInstance();
        cookieManager0.removeAllCookies(new rc.b(3));
        cookieManager0.flush();
        this.a.clearWebSession();
        this.a.setCurrentBlogName((blog0 == null ? null : blog0.getName()));
        MutableLiveData mutableLiveData0 = this.getOldAccount();
        if(account0 == null) {
            account0 = (Account)this.getOldAccount().getValue();
            if(account0 == null) {
                account0 = null;
            }
            else {
                User user1 = account0.getUser();
                if(user1 != null) {
                    user1.setCurrentBlog(blog0);
                }
            }
        }
        else {
            User user0 = account0.getUser();
            if(user0 != null) {
                user0.setCurrentBlog(blog0);
            }
        }
        mutableLiveData0.setValue(account0);
    }

    @Override  // com.kakao.tistory.domain.repository.AccountRepository
    public void updateBlog(@NotNull Blog blog0) {
        List list4;
        List list1;
        Intrinsics.checkNotNullParameter(blog0, "blog");
        MutableLiveData mutableLiveData0 = this.getOldAccount();
        Account account0 = (Account)this.getOldAccount().getValue();
        String s = null;
        if(account0 == null) {
            account0 = null;
        }
        else {
            Blog blog1 = (Blog)this.getOldDefaultBlog().getValue();
            if(blog1 != null) {
                s = blog1.getName();
            }
            if(Intrinsics.areEqual(s, blog0.getName())) {
                User user0 = account0.getUser();
                if(user0 != null) {
                    user0.setDefaultBlog(blog0);
                }
            }
            User user1 = account0.getUser();
            if(user1 != null) {
                List list0 = user1.getOwnerBlogs();
                int v = 0;
                if(list0 == null) {
                    list1 = CollectionsKt__CollectionsKt.emptyList();
                }
                else {
                    List list2 = CollectionsKt___CollectionsKt.toMutableList(list0);
                    int v1 = 0;
                    for(Object object0: list0) {
                        if(v1 < 0) {
                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                        }
                        if(Intrinsics.areEqual(((Blog)object0).getName(), blog0.getName())) {
                            list2.set(v1, blog0);
                        }
                        ++v1;
                    }
                    list1 = CollectionsKt___CollectionsKt.toList(list2);
                }
                user1.setOwnerBlogs(list1);
                List list3 = user1.getJoinedBlogs();
                if(list3 == null) {
                    list4 = CollectionsKt__CollectionsKt.emptyList();
                }
                else {
                    List list5 = CollectionsKt___CollectionsKt.toMutableList(list3);
                    for(Object object1: list3) {
                        if(v < 0) {
                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                        }
                        if(Intrinsics.areEqual(((Blog)object1).getName(), blog0.getName())) {
                            list5.set(v, blog0);
                        }
                        ++v;
                    }
                    list4 = CollectionsKt___CollectionsKt.toList(list5);
                }
                user1.setJoinedBlogs(list4);
                user1.setCurrentBlog(blog0);
            }
        }
        mutableLiveData0.setValue(account0);
    }
}

