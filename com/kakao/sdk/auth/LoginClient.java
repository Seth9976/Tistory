package com.kakao.sdk.auth;

import android.content.Context;
import androidx.compose.foundation.text.selection.z;
import com.kakao.sdk.auth.model.AuthType;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
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
import sb.b;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 %2\u00020\u0001:\u0001%B\u001B\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004\u00A2\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000B\u001A\u00020\n2\u0006\u0010\t\u001A\u00020\b\u00A2\u0006\u0004\b\u000B\u0010\fJ\u0081\u0001\u0010\u001C\u001A\u00020\u001A2\u0006\u0010\t\u001A\u00020\b2\b\b\u0002\u0010\u000E\u001A\u00020\r2\u0010\b\u0002\u0010\u0011\u001A\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000F2\u0010\b\u0002\u0010\u0012\u001A\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000F2:\u0010\u001B\u001A6\u0012\u0015\u0012\u0013\u0018\u00010\u0014\u00A2\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0015\u0012\u0013\u0018\u00010\u0018\u00A2\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u001A0\u0013H\u0007\u00A2\u0006\u0004\b\u001C\u0010\u001DJ\u0083\u0001\u0010 \u001A\u00020\u001A2\u0006\u0010\t\u001A\u00020\b2\n\b\u0002\u0010\u001F\u001A\u0004\u0018\u00010\u001E2\u0010\b\u0002\u0010\u0011\u001A\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000F2\u0010\b\u0002\u0010\u0012\u001A\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000F2:\u0010\u001B\u001A6\u0012\u0015\u0012\u0013\u0018\u00010\u0014\u00A2\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0015\u0012\u0013\u0018\u00010\u0018\u00A2\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u001A0\u0013H\u0007\u00A2\u0006\u0004\b \u0010!J_\u0010#\u001A\u00020\u001A2\u0006\u0010\t\u001A\u00020\b2\f\u0010\"\u001A\b\u0012\u0004\u0012\u00020\u00100\u000F2:\u0010\u001B\u001A6\u0012\u0015\u0012\u0013\u0018\u00010\u0014\u00A2\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0015\u0012\u0013\u0018\u00010\u0018\u00A2\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u001A0\u0013\u00A2\u0006\u0004\b#\u0010$\u00A8\u0006&"}, d2 = {"Lcom/kakao/sdk/auth/LoginClient;", "", "Lcom/kakao/sdk/auth/AuthApiClient;", "authApiClient", "Lcom/kakao/sdk/auth/AuthCodeClient;", "authCodeClient", "<init>", "(Lcom/kakao/sdk/auth/AuthApiClient;Lcom/kakao/sdk/auth/AuthCodeClient;)V", "Landroid/content/Context;", "context", "", "isKakaoTalkLoginAvailable", "(Landroid/content/Context;)Z", "", "requestCode", "", "", "channelPublicIds", "serviceTerms", "Lkotlin/Function2;", "Lcom/kakao/sdk/auth/model/OAuthToken;", "Lkotlin/ParameterName;", "name", "token", "", "error", "", "callback", "loginWithKakaoTalk", "(Landroid/content/Context;ILjava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function2;)V", "Lcom/kakao/sdk/auth/model/AuthType;", "authType", "loginWithKakaoAccount", "(Landroid/content/Context;Lcom/kakao/sdk/auth/model/AuthType;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function2;)V", "scopes", "loginWithNewScopes", "(Landroid/content/Context;Ljava/util/List;Lkotlin/jvm/functions/Function2;)V", "Companion", "auth_release"}, k = 1, mv = {1, 4, 0})
public final class LoginClient {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001R!\u0010\t\u001A\u00020\u00028FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001A\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/kakao/sdk/auth/LoginClient$Companion;", "", "Lcom/kakao/sdk/auth/LoginClient;", "instance$delegate", "Lkotlin/Lazy;", "getInstance", "()Lcom/kakao/sdk/auth/LoginClient;", "instance$annotations", "()V", "instance", "auth_release"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        public static final KProperty[] a;

        static {
            Companion.a = new KProperty[]{Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Companion.class), "instance", "getInstance()Lcom/kakao/sdk/auth/LoginClient;"))};
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final LoginClient getInstance() {
            Lazy lazy0 = LoginClient.c;
            KProperty kProperty0 = Companion.a[0];
            return (LoginClient)lazy0.getValue();
        }

        @JvmStatic
        public static void instance$annotations() {
        }
    }

    public static final Companion Companion;
    public final AuthApiClient a;
    public final AuthCodeClient b;
    public static final Lazy c;

    static {
        LoginClient.Companion = new Companion(null);
        LoginClient.c = c.lazy(a.B);
    }

    public LoginClient() {
        this(null, null, 3, null);
    }

    public LoginClient(@NotNull AuthApiClient authApiClient0, @NotNull AuthCodeClient authCodeClient0) {
        Intrinsics.checkParameterIsNotNull(authApiClient0, "authApiClient");
        Intrinsics.checkParameterIsNotNull(authCodeClient0, "authCodeClient");
        super();
        this.a = authApiClient0;
        this.b = authCodeClient0;
    }

    public LoginClient(AuthApiClient authApiClient0, AuthCodeClient authCodeClient0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            authApiClient0 = AuthApiClient.Companion.getInstance();
        }
        if((v & 2) != 0) {
            authCodeClient0 = AuthCodeClient.Companion.getInstance();
        }
        this(authApiClient0, authCodeClient0);
    }

    public static final AuthCodeClient access$getAuthCodeClient$p(LoginClient loginClient0) {
        return loginClient0.b;
    }

    @NotNull
    public static final LoginClient getInstance() {
        return LoginClient.Companion.getInstance();
    }

    public final boolean isKakaoTalkLoginAvailable(@NotNull Context context0) {
        Intrinsics.checkParameterIsNotNull(context0, "context");
        return this.b.isKakaoTalkLoginAvailable(context0);
    }

    @JvmOverloads
    public final void loginWithKakaoAccount(@NotNull Context context0, @Nullable AuthType authType0, @Nullable List list0, @Nullable List list1, @NotNull Function2 function20) {
        Intrinsics.checkParameterIsNotNull(context0, "context");
        Intrinsics.checkParameterIsNotNull(function20, "callback");
        b b0 = new b(this, function20, 0);
        AuthCodeClient.authorizeWithKakaoAccount$default(this.b, context0, authType0, null, null, list0, list1, b0, 12, null);
    }

    @JvmOverloads
    public final void loginWithKakaoAccount(@NotNull Context context0, @Nullable AuthType authType0, @Nullable List list0, @NotNull Function2 function20) {
        LoginClient.loginWithKakaoAccount$default(this, context0, authType0, list0, null, function20, 8, null);
    }

    @JvmOverloads
    public final void loginWithKakaoAccount(@NotNull Context context0, @Nullable AuthType authType0, @NotNull Function2 function20) {
        LoginClient.loginWithKakaoAccount$default(this, context0, authType0, null, null, function20, 12, null);
    }

    @JvmOverloads
    public final void loginWithKakaoAccount(@NotNull Context context0, @NotNull Function2 function20) {
        LoginClient.loginWithKakaoAccount$default(this, context0, null, null, null, function20, 14, null);
    }

    public static void loginWithKakaoAccount$default(LoginClient loginClient0, Context context0, AuthType authType0, List list0, List list1, Function2 function20, int v, Object object0) {
        loginClient0.loginWithKakaoAccount(context0, ((v & 2) == 0 ? authType0 : null), ((v & 4) == 0 ? list0 : null), ((v & 8) == 0 ? list1 : null), function20);
    }

    @JvmOverloads
    public final void loginWithKakaoTalk(@NotNull Context context0, int v, @Nullable List list0, @Nullable List list1, @NotNull Function2 function20) {
        Intrinsics.checkParameterIsNotNull(context0, "context");
        Intrinsics.checkParameterIsNotNull(function20, "callback");
        b b0 = new b(this, function20, 1);
        this.b.authorizeWithKakaoTalk(context0, v, list0, list1, b0);
    }

    @JvmOverloads
    public final void loginWithKakaoTalk(@NotNull Context context0, int v, @Nullable List list0, @NotNull Function2 function20) {
        LoginClient.loginWithKakaoTalk$default(this, context0, v, list0, null, function20, 8, null);
    }

    @JvmOverloads
    public final void loginWithKakaoTalk(@NotNull Context context0, int v, @NotNull Function2 function20) {
        LoginClient.loginWithKakaoTalk$default(this, context0, v, null, null, function20, 12, null);
    }

    @JvmOverloads
    public final void loginWithKakaoTalk(@NotNull Context context0, @NotNull Function2 function20) {
        LoginClient.loginWithKakaoTalk$default(this, context0, 0, null, null, function20, 14, null);
    }

    public static void loginWithKakaoTalk$default(LoginClient loginClient0, Context context0, int v, List list0, List list1, Function2 function20, int v1, Object object0) {
        if((v1 & 2) != 0) {
            v = 10012;
        }
        loginClient0.loginWithKakaoTalk(context0, v, ((v1 & 4) == 0 ? list0 : null), ((v1 & 8) == 0 ? list1 : null), function20);
    }

    public final void loginWithNewScopes(@NotNull Context context0, @NotNull List list0, @NotNull Function2 function20) {
        Intrinsics.checkParameterIsNotNull(context0, "context");
        Intrinsics.checkParameterIsNotNull(list0, "scopes");
        Intrinsics.checkParameterIsNotNull(function20, "callback");
        z z0 = new z(this, function20, context0, list0);
        this.a.agt(z0);
    }
}

