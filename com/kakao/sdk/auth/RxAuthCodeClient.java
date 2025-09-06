package com.kakao.sdk.auth;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import com.google.android.material.color.i;
import com.kakao.sdk.auth.model.AuthType;
import com.kakao.sdk.common.KakaoSdk;
import com.kakao.sdk.common.model.ApplicationInfo;
import com.kakao.sdk.common.model.AuthError;
import com.kakao.sdk.common.model.AuthErrorCause;
import com.kakao.sdk.common.model.AuthErrorResponse;
import com.kakao.sdk.common.model.ContextInfo;
import com.kakao.sdk.common.model.KakaoSdkError;
import com.kakao.sdk.common.util.IntentResolveClient;
import com.kakao.sdk.common.util.KakaoJson;
import io.reactivex.Single;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleTransformer;
import java.io.Serializable;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TypeCastException;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import md.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sb.a;
import sb.e;
import sb.g;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 :2\u00020\u0001:\u0001:B%\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0006\u00A2\u0006\u0004\b\b\u0010\tJK\u0010\u0013\u001A\b\u0012\u0004\u0012\u00020\u000F0\u00122\u0006\u0010\u000B\u001A\u00020\n2\b\b\u0002\u0010\r\u001A\u00020\f2\u0010\b\u0002\u0010\u0010\u001A\n\u0012\u0004\u0012\u00020\u000F\u0018\u00010\u000E2\u0010\b\u0002\u0010\u0011\u001A\n\u0012\u0004\u0012\u00020\u000F\u0018\u00010\u000EH\u0007\u00A2\u0006\u0004\b\u0013\u0010\u0014Jk\u0010\u0019\u001A\b\u0012\u0004\u0012\u00020\u000F0\u00122\u0006\u0010\u000B\u001A\u00020\n2\n\b\u0002\u0010\u0016\u001A\u0004\u0018\u00010\u00152\u0010\b\u0002\u0010\u0017\u001A\n\u0012\u0004\u0012\u00020\u000F\u0018\u00010\u000E2\n\b\u0002\u0010\u0018\u001A\u0004\u0018\u00010\u000F2\u0010\b\u0002\u0010\u0010\u001A\n\u0012\u0004\u0012\u00020\u000F\u0018\u00010\u000E2\u0010\b\u0002\u0010\u0011\u001A\n\u0012\u0004\u0012\u00020\u000F\u0018\u00010\u000EH\u0007\u00A2\u0006\u0004\b\u0019\u0010\u001AJ/\u0010#\u001A\u00020 2\u0006\u0010\u001B\u001A\u00020\u000F2\u0006\u0010\u001C\u001A\u00020\u000F2\u0006\u0010\u001D\u001A\u00020\u000F2\u0006\u0010\u001F\u001A\u00020\u001EH\u0000\u00A2\u0006\u0004\b!\u0010\"J/\u0010*\u001A\u00020 2\u0006\u0010\u000B\u001A\u00020\n2\u0006\u0010%\u001A\u00020$2\u0006\u0010\u001C\u001A\u00020\u000F2\u0006\u0010\'\u001A\u00020&H\u0000\u00A2\u0006\u0004\b(\u0010)J\u001D\u0010\'\u001A\u00020&2\f\u0010,\u001A\b\u0012\u0004\u0012\u00020\u000F0+H\u0000\u00A2\u0006\u0004\b-\u0010.J/\u00104\u001A\u0002012\u0006\u0010/\u001A\u00020\f2\b\u00100\u001A\u0004\u0018\u00010\u001E2\f\u0010,\u001A\b\u0012\u0004\u0012\u00020\u000F0+H\u0000\u00A2\u0006\u0004\b2\u00103J!\u00109\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000006\"\u0004\b\u0000\u00105H\u0000\u00A2\u0006\u0004\b7\u00108\u00A8\u0006;"}, d2 = {"Lcom/kakao/sdk/auth/RxAuthCodeClient;", "", "Lcom/kakao/sdk/common/util/IntentResolveClient;", "intentResolveClient", "Lcom/kakao/sdk/common/model/ApplicationInfo;", "applicationInfo", "Lcom/kakao/sdk/common/model/ContextInfo;", "contextInfo", "<init>", "(Lcom/kakao/sdk/common/util/IntentResolveClient;Lcom/kakao/sdk/common/model/ApplicationInfo;Lcom/kakao/sdk/common/model/ContextInfo;)V", "Landroid/content/Context;", "context", "", "requestCode", "", "", "channelPublicIds", "serviceTerms", "Lio/reactivex/Single;", "authorizeWithKakaoTalk", "(Landroid/content/Context;ILjava/util/List;Ljava/util/List;)Lio/reactivex/Single;", "Lcom/kakao/sdk/auth/model/AuthType;", "authType", "scopes", "agt", "authorizeWithKakaoAccount", "(Landroid/content/Context;Lcom/kakao/sdk/auth/model/AuthType;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Lio/reactivex/Single;", "clientId", "redirectUri", "kaHeader", "Landroid/os/Bundle;", "extras", "Landroid/content/Intent;", "talkLoginIntent$auth_rx_release", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;", "talkLoginIntent", "Landroid/net/Uri;", "fullUri", "Landroid/os/ResultReceiver;", "resultReceiver", "authCodeIntent$auth_rx_release", "(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;Landroid/os/ResultReceiver;)Landroid/content/Intent;", "authCodeIntent", "Lio/reactivex/SingleEmitter;", "emitter", "resultReceiver$auth_rx_release", "(Lio/reactivex/SingleEmitter;)Landroid/os/ResultReceiver;", "resultCode", "resultData", "", "onReceivedResult$auth_rx_release", "(ILandroid/os/Bundle;Lio/reactivex/SingleEmitter;)V", "onReceivedResult", "T", "Lio/reactivex/SingleTransformer;", "handleAuthCodeError$auth_rx_release", "()Lio/reactivex/SingleTransformer;", "handleAuthCodeError", "Companion", "auth-rx_release"}, k = 1, mv = {1, 4, 0})
public final class RxAuthCodeClient {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001R!\u0010\t\u001A\u00020\u00028FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001A\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/kakao/sdk/auth/RxAuthCodeClient$Companion;", "", "Lcom/kakao/sdk/auth/RxAuthCodeClient;", "instance$delegate", "Lkotlin/Lazy;", "getInstance", "()Lcom/kakao/sdk/auth/RxAuthCodeClient;", "instance$annotations", "()V", "instance", "auth-rx_release"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        public static final KProperty[] a;

        static {
            Companion.a = new KProperty[]{Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Companion.class), "instance", "getInstance()Lcom/kakao/sdk/auth/RxAuthCodeClient;"))};
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final RxAuthCodeClient getInstance() {
            Lazy lazy0 = RxAuthCodeClient.e;
            KProperty kProperty0 = Companion.a[0];
            return (RxAuthCodeClient)lazy0.getValue();
        }

        @JvmStatic
        public static void instance$annotations() {
        }
    }

    public static final Companion Companion;
    public final String a;
    public final IntentResolveClient b;
    public final ApplicationInfo c;
    public final ContextInfo d;
    public static final Lazy e;

    static {
        RxAuthCodeClient.Companion = new Companion(null);
        RxAuthCodeClient.e = c.lazy(a.E);
    }

    public RxAuthCodeClient() {
        this(null, null, null, 7, null);
    }

    public RxAuthCodeClient(@NotNull IntentResolveClient intentResolveClient0, @NotNull ApplicationInfo applicationInfo0, @NotNull ContextInfo contextInfo0) {
        Intrinsics.checkParameterIsNotNull(intentResolveClient0, "intentResolveClient");
        Intrinsics.checkParameterIsNotNull(applicationInfo0, "applicationInfo");
        Intrinsics.checkParameterIsNotNull(contextInfo0, "contextInfo");
        super();
        this.b = intentResolveClient0;
        this.c = applicationInfo0;
        this.d = contextInfo0;
        this.a = "com.kakao.talk.intent.action.CAPRI_LOGGED_IN_ACTIVITY";
    }

    public RxAuthCodeClient(IntentResolveClient intentResolveClient0, ApplicationInfo applicationInfo0, ContextInfo contextInfo0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            intentResolveClient0 = IntentResolveClient.Companion.getInstance();
        }
        if((v & 2) != 0) {
            applicationInfo0 = KakaoSdk.INSTANCE.getApplicationContextInfo();
        }
        if((v & 4) != 0) {
            contextInfo0 = KakaoSdk.INSTANCE.getApplicationContextInfo();
        }
        this(intentResolveClient0, applicationInfo0, contextInfo0);
    }

    public static final IntentResolveClient access$getIntentResolveClient$p(RxAuthCodeClient rxAuthCodeClient0) {
        return rxAuthCodeClient0.b;
    }

    @NotNull
    public final Intent authCodeIntent$auth_rx_release(@NotNull Context context0, @NotNull Uri uri0, @NotNull String s, @NotNull ResultReceiver resultReceiver0) {
        Intrinsics.checkParameterIsNotNull(context0, "context");
        Intrinsics.checkParameterIsNotNull(uri0, "fullUri");
        Intrinsics.checkParameterIsNotNull(s, "redirectUri");
        Intrinsics.checkParameterIsNotNull(resultReceiver0, "resultReceiver");
        Intent intent0 = new Intent(context0, AuthCodeHandlerActivity.class);
        Bundle bundle0 = new Bundle();
        bundle0.putParcelable("key.result.receiver", resultReceiver0);
        bundle0.putParcelable("key.full_authorize_uri", uri0);
        bundle0.putString("key.redirect_uri", s);
        Intent intent1 = intent0.putExtra("key.bundle", bundle0);
        Intrinsics.checkExpressionValueIsNotNull(intent1, "Intent(context, AuthCode…directUri)\n            })");
        return intent1;
    }

    @JvmOverloads
    @NotNull
    public final Single authorizeWithKakaoAccount(@NotNull Context context0) {
        return RxAuthCodeClient.authorizeWithKakaoAccount$default(this, context0, null, null, null, null, null, 62, null);
    }

    @JvmOverloads
    @NotNull
    public final Single authorizeWithKakaoAccount(@NotNull Context context0, @Nullable AuthType authType0) {
        return RxAuthCodeClient.authorizeWithKakaoAccount$default(this, context0, authType0, null, null, null, null, 60, null);
    }

    @JvmOverloads
    @NotNull
    public final Single authorizeWithKakaoAccount(@NotNull Context context0, @Nullable AuthType authType0, @Nullable List list0) {
        return RxAuthCodeClient.authorizeWithKakaoAccount$default(this, context0, authType0, list0, null, null, null, 56, null);
    }

    @JvmOverloads
    @NotNull
    public final Single authorizeWithKakaoAccount(@NotNull Context context0, @Nullable AuthType authType0, @Nullable List list0, @Nullable String s) {
        return RxAuthCodeClient.authorizeWithKakaoAccount$default(this, context0, authType0, list0, s, null, null, 0x30, null);
    }

    @JvmOverloads
    @NotNull
    public final Single authorizeWithKakaoAccount(@NotNull Context context0, @Nullable AuthType authType0, @Nullable List list0, @Nullable String s, @Nullable List list1) {
        return RxAuthCodeClient.authorizeWithKakaoAccount$default(this, context0, authType0, list0, s, list1, null, 0x20, null);
    }

    @JvmOverloads
    @NotNull
    public final Single authorizeWithKakaoAccount(@NotNull Context context0, @Nullable AuthType authType0, @Nullable List list0, @Nullable String s, @Nullable List list1, @Nullable List list2) {
        Intrinsics.checkParameterIsNotNull(context0, "context");
        Single single0 = Single.create(new g(this, s, list0, list1, list2, authType0, context0)).compose(this.handleAuthCodeError$auth_rx_release());
        Intrinsics.checkExpressionValueIsNotNull(single0, "Single.create<String> { …se(handleAuthCodeError())");
        return single0;
    }

    public static Single authorizeWithKakaoAccount$default(RxAuthCodeClient rxAuthCodeClient0, Context context0, AuthType authType0, List list0, String s, List list1, List list2, int v, Object object0) {
        return rxAuthCodeClient0.authorizeWithKakaoAccount(context0, ((v & 2) == 0 ? authType0 : null), ((v & 4) == 0 ? list0 : null), ((v & 8) == 0 ? s : null), ((v & 16) == 0 ? list1 : null), ((v & 0x20) == 0 ? list2 : null));
    }

    @JvmOverloads
    @NotNull
    public final Single authorizeWithKakaoTalk(@NotNull Context context0) {
        return RxAuthCodeClient.authorizeWithKakaoTalk$default(this, context0, 0, null, null, 14, null);
    }

    @JvmOverloads
    @NotNull
    public final Single authorizeWithKakaoTalk(@NotNull Context context0, int v) {
        return RxAuthCodeClient.authorizeWithKakaoTalk$default(this, context0, v, null, null, 12, null);
    }

    @JvmOverloads
    @NotNull
    public final Single authorizeWithKakaoTalk(@NotNull Context context0, int v, @Nullable List list0) {
        return RxAuthCodeClient.authorizeWithKakaoTalk$default(this, context0, v, list0, null, 8, null);
    }

    @JvmOverloads
    @NotNull
    public final Single authorizeWithKakaoTalk(@NotNull Context context0, int v, @Nullable List list0, @Nullable List list1) {
        Intrinsics.checkParameterIsNotNull(context0, "context");
        Single single0 = Single.create(new i(this, list0, list1, context0, v)).compose(this.handleAuthCodeError$auth_rx_release());
        Intrinsics.checkExpressionValueIsNotNull(single0, "Single.create<String> { …se(handleAuthCodeError())");
        return single0;
    }

    public static Single authorizeWithKakaoTalk$default(RxAuthCodeClient rxAuthCodeClient0, Context context0, int v, List list0, List list1, int v1, Object object0) {
        if((v1 & 2) != 0) {
            v = 10012;
        }
        if((v1 & 4) != 0) {
            list0 = null;
        }
        if((v1 & 8) != 0) {
            list1 = null;
        }
        return rxAuthCodeClient0.authorizeWithKakaoTalk(context0, v, list0, list1);
    }

    @NotNull
    public static final RxAuthCodeClient getInstance() {
        return RxAuthCodeClient.Companion.getInstance();
    }

    @NotNull
    public final SingleTransformer handleAuthCodeError$auth_rx_release() {
        return e.c;
    }

    public final void onReceivedResult$auth_rx_release(int v, @Nullable Bundle bundle0, @NotNull SingleEmitter singleEmitter0) {
        AuthErrorCause authErrorCause0;
        Intrinsics.checkParameterIsNotNull(singleEmitter0, "emitter");
        Serializable serializable0 = null;
        switch(v) {
            case -1: {
                Uri uri0 = bundle0 == null ? null : ((Uri)bundle0.getParcelable("key.url"));
                String s = uri0 == null ? null : uri0.getQueryParameter("code");
                if(s != null) {
                    singleEmitter0.onSuccess(s);
                    return;
                }
                if(uri0 != null) {
                    serializable0 = uri0.getQueryParameter("error");
                }
                if(serializable0 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
                }
                String s1 = uri0.getQueryParameter("error_description");
                if(s1 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
                }
                try {
                    authErrorCause0 = Result.constructor-impl(((AuthErrorCause)KakaoJson.INSTANCE.fromJson(((String)serializable0), AuthErrorCause.class)));
                }
                catch(Throwable throwable0) {
                    authErrorCause0 = Result.constructor-impl(ResultKt.createFailure(throwable0));
                }
                AuthErrorCause authErrorCause1 = AuthErrorCause.Unknown;
                if(Result.isFailure-impl(authErrorCause0)) {
                    authErrorCause0 = authErrorCause1;
                }
                singleEmitter0.onError(new AuthError(302, authErrorCause0, new AuthErrorResponse(((String)serializable0), s1)));
                return;
            }
            case 0: {
                if(bundle0 != null) {
                    serializable0 = bundle0.getSerializable("key.exception");
                }
                if(serializable0 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type com.kakao.sdk.common.model.KakaoSdkError");
                }
                singleEmitter0.onError(((KakaoSdkError)serializable0));
                return;
            }
            default: {
                throw new IllegalArgumentException("Unknown resultCode in RxAuthCodeClient#onReceivedResult()");
            }
        }
    }

    @NotNull
    public final ResultReceiver resultReceiver$auth_rx_release(@NotNull SingleEmitter singleEmitter0) {
        Intrinsics.checkParameterIsNotNull(singleEmitter0, "emitter");
        return new ResultReceiver(/*ERROR_MISSING_ARG_2/*) {
            @Override  // android.os.ResultReceiver
            public void onReceiveResult(int v, @Nullable Bundle bundle0) {
                singleEmitter0.onReceivedResult$auth_rx_release(v, bundle0, new Handler(Looper.getMainLooper()));
            }
        };
    }

    @NotNull
    public final Intent talkLoginIntent$auth_rx_release(@NotNull String s, @NotNull String s1, @NotNull String s2, @NotNull Bundle bundle0) {
        Intrinsics.checkParameterIsNotNull(s, "clientId");
        Intrinsics.checkParameterIsNotNull(s1, "redirectUri");
        Intrinsics.checkParameterIsNotNull(s2, "kaHeader");
        Intrinsics.checkParameterIsNotNull(bundle0, "extras");
        Intent intent0 = new Intent().setAction(this.a).addCategory("android.intent.category.DEFAULT");
        Intrinsics.checkExpressionValueIsNotNull(intent0, "Intent().setAction(CAPRI…(Intent.CATEGORY_DEFAULT)");
        Intent intent1 = intent0.putExtra("com.kakao.sdk.talk.appKey", s).putExtra("com.kakao.sdk.talk.redirectUri", s1).putExtra("com.kakao.sdk.talk.kaHeader", s2).putExtra("com.kakao.sdk.talk.extraparams", bundle0);
        Intrinsics.checkExpressionValueIsNotNull(intent1, "baseTalkLoginIntent()\n  …XTRA_EXTRAPARAMS, extras)");
        return intent1;
    }
}

