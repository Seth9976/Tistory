package com.kakao.sdk.auth;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import com.kakao.sdk.auth.model.AuthType;
import com.kakao.sdk.common.KakaoSdk;
import com.kakao.sdk.common.model.ApplicationInfo;
import com.kakao.sdk.common.model.AuthError;
import com.kakao.sdk.common.model.AuthErrorCause;
import com.kakao.sdk.common.model.AuthErrorResponse;
import com.kakao.sdk.common.model.ClientError;
import com.kakao.sdk.common.model.ClientErrorCause;
import com.kakao.sdk.common.model.ContextInfo;
import com.kakao.sdk.common.model.KakaoSdkError;
import com.kakao.sdk.common.util.IntentResolveClient;
import com.kakao.sdk.common.util.KakaoJson;
import com.kakao.sdk.common.util.SdkLog;
import java.io.Serializable;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import md.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sb.a;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 :2\u00020\u0001:\u0001:B%\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0006\u00A2\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001A\u00020\f2\u0006\u0010\u000B\u001A\u00020\n\u00A2\u0006\u0004\b\r\u0010\u000EJ\u0081\u0001\u0010\u001D\u001A\u00020\u001B2\u0006\u0010\u000B\u001A\u00020\n2\b\b\u0002\u0010\u0010\u001A\u00020\u000F2\u0010\b\u0002\u0010\u0013\u001A\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\u0010\b\u0002\u0010\u0014\u001A\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112:\u0010\u001C\u001A6\u0012\u0015\u0012\u0013\u0018\u00010\u0012\u00A2\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0015\u0012\u0013\u0018\u00010\u0019\u00A2\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u001A\u0012\u0004\u0012\u00020\u001B0\u0015H\u0007\u00A2\u0006\u0004\b\u001D\u0010\u001EJ\u00A1\u0001\u0010#\u001A\u00020\u001B2\u0006\u0010\u000B\u001A\u00020\n2\n\b\u0002\u0010 \u001A\u0004\u0018\u00010\u001F2\u0010\b\u0002\u0010!\u001A\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\n\b\u0002\u0010\"\u001A\u0004\u0018\u00010\u00122\u0010\b\u0002\u0010\u0013\u001A\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\u0010\b\u0002\u0010\u0014\u001A\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112:\u0010\u001C\u001A6\u0012\u0015\u0012\u0013\u0018\u00010\u0012\u00A2\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0015\u0012\u0013\u0018\u00010\u0019\u00A2\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u001A\u0012\u0004\u0012\u00020\u001B0\u0015H\u0007\u00A2\u0006\u0004\b#\u0010$JK\u0010(\u001A\u00020%2:\u0010\u001C\u001A6\u0012\u0015\u0012\u0013\u0018\u00010\u0012\u00A2\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0015\u0012\u0013\u0018\u00010\u0019\u00A2\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u001A\u0012\u0004\u0012\u00020\u001B0\u0015H\u0000\u00A2\u0006\u0004\b&\u0010\'J\u000F\u0010,\u001A\u00020)H\u0000\u00A2\u0006\u0004\b*\u0010+J/\u00104\u001A\u00020)2\u0006\u0010-\u001A\u00020\u00122\u0006\u0010.\u001A\u00020\u00122\u0006\u0010/\u001A\u00020\u00122\u0006\u00101\u001A\u000200H\u0000\u00A2\u0006\u0004\b2\u00103J/\u00109\u001A\u00020)2\u0006\u0010\u000B\u001A\u00020\n2\u0006\u00106\u001A\u0002052\u0006\u0010.\u001A\u00020\u00122\u0006\u0010(\u001A\u00020%H\u0000\u00A2\u0006\u0004\b7\u00108\u00A8\u0006;"}, d2 = {"Lcom/kakao/sdk/auth/AuthCodeClient;", "", "Lcom/kakao/sdk/common/util/IntentResolveClient;", "intentResolveClient", "Lcom/kakao/sdk/common/model/ApplicationInfo;", "applicationInfo", "Lcom/kakao/sdk/common/model/ContextInfo;", "contextInfo", "<init>", "(Lcom/kakao/sdk/common/util/IntentResolveClient;Lcom/kakao/sdk/common/model/ApplicationInfo;Lcom/kakao/sdk/common/model/ContextInfo;)V", "Landroid/content/Context;", "context", "", "isKakaoTalkLoginAvailable", "(Landroid/content/Context;)Z", "", "requestCode", "", "", "channelPublicIds", "serviceTerms", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "code", "", "error", "", "callback", "authorizeWithKakaoTalk", "(Landroid/content/Context;ILjava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function2;)V", "Lcom/kakao/sdk/auth/model/AuthType;", "authType", "scopes", "agt", "authorizeWithKakaoAccount", "(Landroid/content/Context;Lcom/kakao/sdk/auth/model/AuthType;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function2;)V", "Landroid/os/ResultReceiver;", "resultReceiver$auth_release", "(Lkotlin/jvm/functions/Function2;)Landroid/os/ResultReceiver;", "resultReceiver", "Landroid/content/Intent;", "baseTalkLoginIntent$auth_release", "()Landroid/content/Intent;", "baseTalkLoginIntent", "clientId", "redirectUri", "kaHeader", "Landroid/os/Bundle;", "extras", "talkLoginIntent$auth_release", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;", "talkLoginIntent", "Landroid/net/Uri;", "fullUri", "authCodeIntent$auth_release", "(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;Landroid/os/ResultReceiver;)Landroid/content/Intent;", "authCodeIntent", "Companion", "auth_release"}, k = 1, mv = {1, 4, 0})
public final class AuthCodeClient {
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R!\u0010\t\u001A\u00020\u00028FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001A\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000B\u001A\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Lcom/kakao/sdk/auth/AuthCodeClient$Companion;", "", "Lcom/kakao/sdk/auth/AuthCodeClient;", "instance$delegate", "Lkotlin/Lazy;", "getInstance", "()Lcom/kakao/sdk/auth/AuthCodeClient;", "instance$annotations", "()V", "instance", "", "DEFAULT_REQUEST_CODE", "I", "auth_release"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        public static final KProperty[] a;

        static {
            Companion.a = new KProperty[]{Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Companion.class), "instance", "getInstance()Lcom/kakao/sdk/auth/AuthCodeClient;"))};
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final AuthCodeClient getInstance() {
            Lazy lazy0 = AuthCodeClient.e;
            KProperty kProperty0 = Companion.a[0];
            return (AuthCodeClient)lazy0.getValue();
        }

        @JvmStatic
        public static void instance$annotations() {
        }
    }

    public static final Companion Companion = null;
    public static final int DEFAULT_REQUEST_CODE = 10012;
    public final String a;
    public final IntentResolveClient b;
    public final ApplicationInfo c;
    public final ContextInfo d;
    public static final Lazy e;

    static {
        AuthCodeClient.Companion = new Companion(null);
        AuthCodeClient.e = c.lazy(a.z);
    }

    public AuthCodeClient() {
        this(null, null, null, 7, null);
    }

    public AuthCodeClient(@NotNull IntentResolveClient intentResolveClient0, @NotNull ApplicationInfo applicationInfo0, @NotNull ContextInfo contextInfo0) {
        Intrinsics.checkParameterIsNotNull(intentResolveClient0, "intentResolveClient");
        Intrinsics.checkParameterIsNotNull(applicationInfo0, "applicationInfo");
        Intrinsics.checkParameterIsNotNull(contextInfo0, "contextInfo");
        super();
        this.b = intentResolveClient0;
        this.c = applicationInfo0;
        this.d = contextInfo0;
        this.a = "com.kakao.talk.intent.action.CAPRI_LOGGED_IN_ACTIVITY";
    }

    public AuthCodeClient(IntentResolveClient intentResolveClient0, ApplicationInfo applicationInfo0, ContextInfo contextInfo0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
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

    @NotNull
    public final Intent authCodeIntent$auth_release(@NotNull Context context0, @NotNull Uri uri0, @NotNull String s, @NotNull ResultReceiver resultReceiver0) {
        Intrinsics.checkParameterIsNotNull(context0, "context");
        Intrinsics.checkParameterIsNotNull(uri0, "fullUri");
        Intrinsics.checkParameterIsNotNull(s, "redirectUri");
        Intrinsics.checkParameterIsNotNull(resultReceiver0, "resultReceiver");
        Intent intent0 = new Intent(context0, AuthCodeHandlerActivity.class);
        Bundle bundle0 = new Bundle();
        bundle0.putParcelable("key.result.receiver", resultReceiver0);
        bundle0.putParcelable("key.full_authorize_uri", uri0);
        bundle0.putString("key.redirect_uri", s);
        Intent intent1 = intent0.putExtra("key.bundle", bundle0).addFlags(0x10000000);
        Intrinsics.checkExpressionValueIsNotNull(intent1, "Intent(context, AuthCode…t.FLAG_ACTIVITY_NEW_TASK)");
        return intent1;
    }

    @JvmOverloads
    public final void authorizeWithKakaoAccount(@NotNull Context context0, @Nullable AuthType authType0, @Nullable List list0, @Nullable String s, @Nullable List list1, @Nullable List list2, @NotNull Function2 function20) {
        Intrinsics.checkParameterIsNotNull(context0, "context");
        Intrinsics.checkParameterIsNotNull(function20, "callback");
        String s1 = this.c.getAppKey();
        String s2 = "kakao" + s1 + "://oauth";
        String s3 = this.d.getKaHeader();
        Uri uri0 = new UriUtility(null, 1, null).authorizeUri(s1, s, s2, list0, s3, list1, list2, authType0);
        SdkLog.Companion.i(uri0);
        try {
            context0.startActivity(this.authCodeIntent$auth_release(context0, uri0, s2, this.resultReceiver$auth_release(function20)));
        }
        catch(Throwable throwable0) {
            SdkLog.Companion.e(throwable0);
            function20.invoke(null, throwable0);
        }
    }

    @JvmOverloads
    public final void authorizeWithKakaoAccount(@NotNull Context context0, @Nullable AuthType authType0, @Nullable List list0, @Nullable String s, @Nullable List list1, @NotNull Function2 function20) {
        AuthCodeClient.authorizeWithKakaoAccount$default(this, context0, authType0, list0, s, list1, null, function20, 0x20, null);
    }

    @JvmOverloads
    public final void authorizeWithKakaoAccount(@NotNull Context context0, @Nullable AuthType authType0, @Nullable List list0, @Nullable String s, @NotNull Function2 function20) {
        AuthCodeClient.authorizeWithKakaoAccount$default(this, context0, authType0, list0, s, null, null, function20, 0x30, null);
    }

    @JvmOverloads
    public final void authorizeWithKakaoAccount(@NotNull Context context0, @Nullable AuthType authType0, @Nullable List list0, @NotNull Function2 function20) {
        AuthCodeClient.authorizeWithKakaoAccount$default(this, context0, authType0, list0, null, null, null, function20, 56, null);
    }

    @JvmOverloads
    public final void authorizeWithKakaoAccount(@NotNull Context context0, @Nullable AuthType authType0, @NotNull Function2 function20) {
        AuthCodeClient.authorizeWithKakaoAccount$default(this, context0, authType0, null, null, null, null, function20, 60, null);
    }

    @JvmOverloads
    public final void authorizeWithKakaoAccount(@NotNull Context context0, @NotNull Function2 function20) {
        AuthCodeClient.authorizeWithKakaoAccount$default(this, context0, null, null, null, null, null, function20, 62, null);
    }

    public static void authorizeWithKakaoAccount$default(AuthCodeClient authCodeClient0, Context context0, AuthType authType0, List list0, String s, List list1, List list2, Function2 function20, int v, Object object0) {
        authCodeClient0.authorizeWithKakaoAccount(context0, ((v & 2) == 0 ? authType0 : null), ((v & 4) == 0 ? list0 : null), ((v & 8) == 0 ? s : null), ((v & 16) == 0 ? list1 : null), ((v & 0x20) == 0 ? list2 : null), function20);
    }

    @JvmOverloads
    public final void authorizeWithKakaoTalk(@NotNull Context context0, int v, @Nullable List list0, @Nullable List list1, @NotNull Function2 function20) {
        Intrinsics.checkParameterIsNotNull(context0, "context");
        Intrinsics.checkParameterIsNotNull(function20, "callback");
        String s = this.c.getAppKey();
        String s1 = this.d.getKaHeader();
        Bundle bundle0 = new Bundle();
        if(list0 != null) {
            bundle0.putString("channel_public_id", CollectionsKt___CollectionsKt.joinToString$default(list0, ",", null, null, 0, null, null, 62, null));
        }
        if(list1 != null) {
            bundle0.putString("service_terms", CollectionsKt___CollectionsKt.joinToString$default(list1, ",", null, null, 0, null, null, 62, null));
        }
        Intent intent0 = this.talkLoginIntent$auth_release(s, "kakao" + s + "://oauth", s1, bundle0);
        Intent intent1 = this.b.resolveTalkIntent(context0, intent0);
        if(intent1 == null) {
            function20.invoke(null, new ClientError(ClientErrorCause.NotSupported, "KakaoTalk not installed"));
            return;
        }
        try {
            context0.startActivity(new Intent(context0, TalkAuthCodeActivity.class).putExtra("key.login.intent", intent1).putExtra("key.request.code", v).putExtra("key.result.receiver", this.resultReceiver$auth_release(function20)));
        }
        catch(Throwable throwable0) {
            SdkLog.Companion.e(throwable0);
            function20.invoke(null, throwable0);
        }
    }

    @JvmOverloads
    public final void authorizeWithKakaoTalk(@NotNull Context context0, int v, @Nullable List list0, @NotNull Function2 function20) {
        AuthCodeClient.authorizeWithKakaoTalk$default(this, context0, v, list0, null, function20, 8, null);
    }

    @JvmOverloads
    public final void authorizeWithKakaoTalk(@NotNull Context context0, int v, @NotNull Function2 function20) {
        AuthCodeClient.authorizeWithKakaoTalk$default(this, context0, v, null, null, function20, 12, null);
    }

    @JvmOverloads
    public final void authorizeWithKakaoTalk(@NotNull Context context0, @NotNull Function2 function20) {
        AuthCodeClient.authorizeWithKakaoTalk$default(this, context0, 0, null, null, function20, 14, null);
    }

    public static void authorizeWithKakaoTalk$default(AuthCodeClient authCodeClient0, Context context0, int v, List list0, List list1, Function2 function20, int v1, Object object0) {
        if((v1 & 2) != 0) {
            v = 10012;
        }
        authCodeClient0.authorizeWithKakaoTalk(context0, v, ((v1 & 4) == 0 ? list0 : null), ((v1 & 8) == 0 ? list1 : null), function20);
    }

    @NotNull
    public final Intent baseTalkLoginIntent$auth_release() {
        Intent intent0 = new Intent().setAction(this.a).addCategory("android.intent.category.DEFAULT");
        Intrinsics.checkExpressionValueIsNotNull(intent0, "Intent().setAction(CAPRI…(Intent.CATEGORY_DEFAULT)");
        return intent0;
    }

    @NotNull
    public static final AuthCodeClient getInstance() {
        return AuthCodeClient.Companion.getInstance();
    }

    public final boolean isKakaoTalkLoginAvailable(@NotNull Context context0) {
        Intrinsics.checkParameterIsNotNull(context0, "context");
        Intent intent0 = this.baseTalkLoginIntent$auth_release();
        return this.b.resolveTalkIntent(context0, intent0) != null;
    }

    @NotNull
    public final ResultReceiver resultReceiver$auth_release(@NotNull Function2 function20) {
        Intrinsics.checkParameterIsNotNull(function20, "callback");
        return new ResultReceiver(/*ERROR_MISSING_ARG_1/*) {
            @Override  // android.os.ResultReceiver
            public void onReceiveResult(int v, @Nullable Bundle bundle0) {
                AuthErrorCause authErrorCause0;
                SdkLog.Companion.d("***** AUTH CODE RESULT: " + bundle0);
                Function2 function20 = new Handler(Looper.getMainLooper());
                if(v == -1) {
                    Uri uri0 = bundle0 == null ? null : ((Uri)bundle0.getParcelable("key.url"));
                    String s = uri0 == null ? null : uri0.getQueryParameter("code");
                    if(s != null) {
                        function20.invoke(s, null);
                        return;
                    }
                    String s1 = uri0 == null ? null : uri0.getQueryParameter("error");
                    if(s1 == null) {
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
                    }
                    String s2 = uri0.getQueryParameter("error_description");
                    if(s2 == null) {
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
                    }
                    try {
                        authErrorCause0 = Result.constructor-impl(((AuthErrorCause)KakaoJson.INSTANCE.fromJson(s1, AuthErrorCause.class)));
                    }
                    catch(Throwable throwable0) {
                        authErrorCause0 = Result.constructor-impl(ResultKt.createFailure(throwable0));
                    }
                    AuthErrorCause authErrorCause1 = AuthErrorCause.Unknown;
                    if(Result.isFailure-impl(authErrorCause0)) {
                        authErrorCause0 = authErrorCause1;
                    }
                    function20.invoke(null, new AuthError(302, authErrorCause0, new AuthErrorResponse(s1, s2)));
                    return;
                }
                if(v == 0) {
                    Serializable serializable0 = bundle0 == null ? null : bundle0.getSerializable("key.exception");
                    if(serializable0 == null) {
                        throw new TypeCastException("null cannot be cast to non-null type com.kakao.sdk.common.model.KakaoSdkError");
                    }
                    function20.invoke(null, ((KakaoSdkError)serializable0));
                    return;
                }
                function20.invoke(null, new IllegalArgumentException("Unknown resultCode in RxAuthCodeClient#onReceivedResult()"));
            }
        };
    }

    @NotNull
    public final Intent talkLoginIntent$auth_release(@NotNull String s, @NotNull String s1, @NotNull String s2, @NotNull Bundle bundle0) {
        Intrinsics.checkParameterIsNotNull(s, "clientId");
        Intrinsics.checkParameterIsNotNull(s1, "redirectUri");
        Intrinsics.checkParameterIsNotNull(s2, "kaHeader");
        Intrinsics.checkParameterIsNotNull(bundle0, "extras");
        Intent intent0 = this.baseTalkLoginIntent$auth_release().putExtra("com.kakao.sdk.talk.appKey", s).putExtra("com.kakao.sdk.talk.redirectUri", s1).putExtra("com.kakao.sdk.talk.kaHeader", s2).putExtra("com.kakao.sdk.talk.extraparams", bundle0);
        Intrinsics.checkExpressionValueIsNotNull(intent0, "baseTalkLoginIntent()\n  …XTRA_EXTRAPARAMS, extras)");
        return intent0;
    }
}

