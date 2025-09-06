package com.kakao.sdk.auth;

import cd.b;
import cd.o;
import com.kakao.sdk.auth.model.OAuthToken;
import com.kakao.sdk.auth.network.RxApiFactoryKt;
import com.kakao.sdk.common.KakaoSdk;
import com.kakao.sdk.common.model.ApplicationInfo;
import com.kakao.sdk.common.model.ClientError;
import com.kakao.sdk.common.model.ClientErrorCause;
import com.kakao.sdk.common.model.ContextInfo;
import com.kakao.sdk.common.network.ApiFactory;
import io.reactivex.Single;
import io.reactivex.SingleTransformer;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import md.c;
import org.jetbrains.annotations.NotNull;
import sb.a;
import sb.e;
import sb.f;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001C2\u00020\u0001:\u0001\u001CB/\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0006\u0012\b\b\u0002\u0010\t\u001A\u00020\b¢\u0006\u0004\b\n\u0010\u000BJ\u001B\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\u000F0\u000E2\u0006\u0010\r\u001A\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011J\u001F\u0010\u0013\u001A\b\u0012\u0004\u0012\u00020\u000F0\u000E2\b\b\u0002\u0010\u0012\u001A\u00020\u000FH\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u001D\u0010\u0016\u001A\b\u0012\u0004\u0012\u00020\f0\u000E2\b\b\u0002\u0010\u0015\u001A\u00020\f¢\u0006\u0004\b\u0016\u0010\u0011J!\u0010\u001B\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0018\"\u0004\b\u0000\u0010\u0017H\u0000¢\u0006\u0004\b\u0019\u0010\u001A¨\u0006\u001D"}, d2 = {"Lcom/kakao/sdk/auth/RxAuthApiClient;", "", "Lcom/kakao/sdk/auth/RxAuthApi;", "authApi", "Lcom/kakao/sdk/auth/TokenManagerProvider;", "tokenManagerProvider", "Lcom/kakao/sdk/common/model/ApplicationInfo;", "applicationInfo", "Lcom/kakao/sdk/common/model/ContextInfo;", "contextInfo", "<init>", "(Lcom/kakao/sdk/auth/RxAuthApi;Lcom/kakao/sdk/auth/TokenManagerProvider;Lcom/kakao/sdk/common/model/ApplicationInfo;Lcom/kakao/sdk/common/model/ContextInfo;)V", "", "authCode", "Lio/reactivex/Single;", "Lcom/kakao/sdk/auth/model/OAuthToken;", "issueAccessToken", "(Ljava/lang/String;)Lio/reactivex/Single;", "oldToken", "refreshAccessToken", "(Lcom/kakao/sdk/auth/model/OAuthToken;)Lio/reactivex/Single;", "clientId", "agt", "T", "Lio/reactivex/SingleTransformer;", "handleAuthError$auth_rx_release", "()Lio/reactivex/SingleTransformer;", "handleAuthError", "Companion", "auth-rx_release"}, k = 1, mv = {1, 4, 0})
public final class RxAuthApiClient {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001R!\u0010\t\u001A\u00020\u00028FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001A\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/kakao/sdk/auth/RxAuthApiClient$Companion;", "", "Lcom/kakao/sdk/auth/RxAuthApiClient;", "instance$delegate", "Lkotlin/Lazy;", "getInstance", "()Lcom/kakao/sdk/auth/RxAuthApiClient;", "instance$annotations", "()V", "instance", "auth-rx_release"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        public static final KProperty[] a;

        static {
            Companion.a = new KProperty[]{Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Companion.class), "instance", "getInstance()Lcom/kakao/sdk/auth/RxAuthApiClient;"))};
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final RxAuthApiClient getInstance() {
            Lazy lazy0 = RxAuthApiClient.e;
            KProperty kProperty0 = Companion.a[0];
            return (RxAuthApiClient)lazy0.getValue();
        }

        @JvmStatic
        public static void instance$annotations() {
        }
    }

    public static final Companion Companion;
    public final RxAuthApi a;
    public final TokenManagerProvider b;
    public final ApplicationInfo c;
    public final ContextInfo d;
    public static final Lazy e;

    static {
        RxAuthApiClient.Companion = new Companion(null);
        RxAuthApiClient.e = c.lazy(a.D);
    }

    public RxAuthApiClient() {
        this(null, null, null, null, 15, null);
    }

    public RxAuthApiClient(@NotNull RxAuthApi rxAuthApi0, @NotNull TokenManagerProvider tokenManagerProvider0, @NotNull ApplicationInfo applicationInfo0, @NotNull ContextInfo contextInfo0) {
        Intrinsics.checkParameterIsNotNull(rxAuthApi0, "authApi");
        Intrinsics.checkParameterIsNotNull(tokenManagerProvider0, "tokenManagerProvider");
        Intrinsics.checkParameterIsNotNull(applicationInfo0, "applicationInfo");
        Intrinsics.checkParameterIsNotNull(contextInfo0, "contextInfo");
        super();
        this.a = rxAuthApi0;
        this.b = tokenManagerProvider0;
        this.c = applicationInfo0;
        this.d = contextInfo0;
    }

    public RxAuthApiClient(RxAuthApi rxAuthApi0, TokenManagerProvider tokenManagerProvider0, ApplicationInfo applicationInfo0, ContextInfo contextInfo0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            Object object0 = RxApiFactoryKt.getRxKauth(ApiFactory.INSTANCE).create(RxAuthApi.class);
            Intrinsics.checkExpressionValueIsNotNull(object0, "ApiFactory.rxKauth.create(RxAuthApi::class.java)");
            rxAuthApi0 = (RxAuthApi)object0;
        }
        if((v & 2) != 0) {
            tokenManagerProvider0 = TokenManagerProvider.Companion.getInstance();
        }
        if((v & 4) != 0) {
            applicationInfo0 = KakaoSdk.INSTANCE.getApplicationContextInfo();
        }
        if((v & 8) != 0) {
            contextInfo0 = KakaoSdk.INSTANCE.getApplicationContextInfo();
        }
        this(rxAuthApi0, tokenManagerProvider0, applicationInfo0, contextInfo0);
    }

    public static final RxAuthApi access$getAuthApi$p(RxAuthApiClient rxAuthApiClient0) {
        return rxAuthApiClient0.a;
    }

    @NotNull
    public final Single agt(@NotNull String s) {
        Intrinsics.checkParameterIsNotNull(s, "clientId");
        OAuthToken oAuthToken0 = this.b.getManager().getToken();
        Single single0 = Single.just((oAuthToken0 == null ? null : oAuthToken0.getAccessToken())).flatMap(new o(4, this, s)).compose(this.handleAuthError$auth_rx_release()).map(sb.c.b);
        Intrinsics.checkExpressionValueIsNotNull(single0, "Single.just(tokenManager…          .map { it.agt }");
        return single0;
    }

    public static Single agt$default(RxAuthApiClient rxAuthApiClient0, String s, int v, Object object0) {
        if((v & 1) != 0) {
            s = KakaoSdk.INSTANCE.getApplicationContextInfo().getAppKey();
        }
        return rxAuthApiClient0.agt(s);
    }

    @NotNull
    public static final RxAuthApiClient getInstance() {
        return RxAuthApiClient.Companion.getInstance();
    }

    @NotNull
    public final SingleTransformer handleAuthError$auth_rx_release() {
        return e.b;
    }

    @NotNull
    public final Single issueAccessToken(@NotNull String s) {
        Intrinsics.checkParameterIsNotNull(s, "authCode");
        String s1 = this.c.getAppKey();
        String s2 = this.d.getSigningKeyHash();
        Single single0 = DefaultImpls.issueAccessToken$default(this.a, s1, "kakao" + s1 + "://oauth", s2, s, null, null, 0x30, null).compose(this.handleAuthError$auth_rx_release()).map(sb.c.d).doOnSuccess(new f(this, 0));
        Intrinsics.checkExpressionValueIsNotNull(single0, "authApi.issueAccessToken…er.manager.setToken(it) }");
        return single0;
    }

    @JvmOverloads
    @NotNull
    public final Single refreshAccessToken() {
        return RxAuthApiClient.refreshAccessToken$default(this, null, 1, null);
    }

    @JvmOverloads
    @NotNull
    public final Single refreshAccessToken(@NotNull OAuthToken oAuthToken0) {
        Intrinsics.checkParameterIsNotNull(oAuthToken0, "oldToken");
        String s = this.c.getAppKey();
        String s1 = this.d.getSigningKeyHash();
        Single single0 = DefaultImpls.issueAccessToken$default(this.a, s, null, s1, null, oAuthToken0.getRefreshToken(), "refresh_token", 8, null).compose(this.handleAuthError$auth_rx_release()).map(new b(oAuthToken0, 17)).doOnSuccess(new f(this, 1));
        Intrinsics.checkExpressionValueIsNotNull(single0, "authApi.issueAccessToken…er.manager.setToken(it) }");
        return single0;
    }

    public static Single refreshAccessToken$default(RxAuthApiClient rxAuthApiClient0, OAuthToken oAuthToken0, int v, Object object0) {
        if((v & 1) != 0) {
            oAuthToken0 = rxAuthApiClient0.b.getManager().getToken();
            if(oAuthToken0 == null) {
                throw new ClientError(ClientErrorCause.TokenNotFound, null, 2, null);
            }
        }
        return rxAuthApiClient0.refreshAccessToken(oAuthToken0);
    }
}

