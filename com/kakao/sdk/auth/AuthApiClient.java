package com.kakao.sdk.auth;

import com.kakao.sdk.auth.model.AccessTokenResponse;
import com.kakao.sdk.auth.model.AgtResponse;
import com.kakao.sdk.auth.model.OAuthToken;
import com.kakao.sdk.auth.network.ApiFactoryKt;
import com.kakao.sdk.common.KakaoSdk;
import com.kakao.sdk.common.model.ApplicationInfo;
import com.kakao.sdk.common.model.AuthError;
import com.kakao.sdk.common.model.AuthErrorCause;
import com.kakao.sdk.common.model.AuthErrorResponse;
import com.kakao.sdk.common.model.ClientError;
import com.kakao.sdk.common.model.ClientErrorCause;
import com.kakao.sdk.common.model.ContextInfo;
import com.kakao.sdk.common.network.ApiFactory;
import com.kakao.sdk.common.util.KakaoJson;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import md.c;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.HttpException;
import retrofit2.Response;
import sb.a;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000B\u0018\u0000 \u001F2\u00020\u0001:\u0001\u001FB/\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0006\u0012\b\b\u0002\u0010\t\u001A\u00020\b¢\u0006\u0004\b\n\u0010\u000BJQ\u0010\u0017\u001A\u00020\u00152\u0006\u0010\r\u001A\u00020\f2:\u0010\u0016\u001A6\u0012\u0015\u0012\u0013\u0018\u00010\u000F¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0015\u0012\u0013\u0018\u00010\u0013¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00150\u000E¢\u0006\u0004\b\u0017\u0010\u0018JU\u0010\u001A\u001A\u00020\u00152\b\b\u0002\u0010\u0019\u001A\u00020\u000F2:\u0010\u0016\u001A6\u0012\u0015\u0012\u0013\u0018\u00010\u000F¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0015\u0012\u0013\u0018\u00010\u0013¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00150\u000EH\u0007¢\u0006\u0004\b\u001A\u0010\u001BJI\u0010\u001C\u001A\u00020\u00152:\u0010\u0016\u001A6\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u001C\u0012\u0015\u0012\u0013\u0018\u00010\u0013¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00150\u000E¢\u0006\u0004\b\u001C\u0010\u001DJ\u0017\u0010\u001A\u001A\u00020\u000F2\b\b\u0002\u0010\u0019\u001A\u00020\u000F¢\u0006\u0004\b\u001A\u0010\u001E¨\u0006 "}, d2 = {"Lcom/kakao/sdk/auth/AuthApiClient;", "", "Lcom/kakao/sdk/auth/AuthApi;", "authApi", "Lcom/kakao/sdk/auth/TokenManagerProvider;", "tokenManagerProvider", "Lcom/kakao/sdk/common/model/ApplicationInfo;", "applicationInfo", "Lcom/kakao/sdk/common/model/ContextInfo;", "contextInfo", "<init>", "(Lcom/kakao/sdk/auth/AuthApi;Lcom/kakao/sdk/auth/TokenManagerProvider;Lcom/kakao/sdk/common/model/ApplicationInfo;Lcom/kakao/sdk/common/model/ContextInfo;)V", "", "authCode", "Lkotlin/Function2;", "Lcom/kakao/sdk/auth/model/OAuthToken;", "Lkotlin/ParameterName;", "name", "token", "", "error", "", "callback", "issueAccessToken", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "oldToken", "refreshAccessToken", "(Lcom/kakao/sdk/auth/model/OAuthToken;Lkotlin/jvm/functions/Function2;)V", "agt", "(Lkotlin/jvm/functions/Function2;)V", "(Lcom/kakao/sdk/auth/model/OAuthToken;)Lcom/kakao/sdk/auth/model/OAuthToken;", "Companion", "auth_release"}, k = 1, mv = {1, 4, 0})
public final class AuthApiClient {
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001A\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R!\u0010\r\u001A\u00020\u00068FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u0012\u0004\b\u000B\u0010\f\u001A\u0004\b\t\u0010\n¨\u0006\u000E"}, d2 = {"Lcom/kakao/sdk/auth/AuthApiClient$Companion;", "", "", "t", "translateError", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "Lcom/kakao/sdk/auth/AuthApiClient;", "instance$delegate", "Lkotlin/Lazy;", "getInstance", "()Lcom/kakao/sdk/auth/AuthApiClient;", "instance$annotations", "()V", "instance", "auth_release"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        public static final KProperty[] a;

        static {
            Companion.a = new KProperty[]{Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Companion.class), "instance", "getInstance()Lcom/kakao/sdk/auth/AuthApiClient;"))};
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final AuthApiClient getInstance() {
            Lazy lazy0 = AuthApiClient.e;
            KProperty kProperty0 = Companion.a[0];
            return (AuthApiClient)lazy0.getValue();
        }

        @JvmStatic
        public static void instance$annotations() {
        }

        @NotNull
        public final Throwable translateError(@NotNull Throwable throwable0) {
            AuthErrorCause authErrorCause0;
            AuthErrorResponse authErrorResponse0;
            KakaoJson kakaoJson0;
            String s;
            Intrinsics.checkParameterIsNotNull(throwable0, "t");
            try {
                if(!(throwable0 instanceof HttpException)) {
                    return throwable0;
                }
                Response response0 = ((HttpException)throwable0).response();
                if(response0 == null) {
                    s = null;
                }
                else {
                    ResponseBody responseBody0 = response0.errorBody();
                    s = responseBody0 == null ? null : responseBody0.string();
                }
                kakaoJson0 = KakaoJson.INSTANCE;
                if(s == null) {
                    Intrinsics.throwNpe();
                }
                authErrorResponse0 = (AuthErrorResponse)kakaoJson0.fromJson(s, AuthErrorResponse.class);
            }
            catch(Throwable throwable0) {
                return throwable0;
            }
            try {
                authErrorCause0 = Result.constructor-impl(((AuthErrorCause)kakaoJson0.fromJson(authErrorResponse0.getError(), AuthErrorCause.class)));
                goto label_20;
            }
            catch(Throwable throwable1) {
                try {
                    authErrorCause0 = Result.constructor-impl(ResultKt.createFailure(throwable1));
                label_20:
                    AuthErrorCause authErrorCause1 = AuthErrorCause.Unknown;
                    if(Result.isFailure-impl(authErrorCause0)) {
                        authErrorCause0 = authErrorCause1;
                    }
                    return new AuthError(((HttpException)throwable0).code(), authErrorCause0, authErrorResponse0);
                }
                catch(Throwable throwable0) {
                }
                return throwable0;
            }
        }
    }

    public static final Companion Companion;
    public final AuthApi a;
    public final TokenManagerProvider b;
    public final ApplicationInfo c;
    public final ContextInfo d;
    public static final Lazy e;

    static {
        AuthApiClient.Companion = new Companion(null);
        AuthApiClient.e = c.lazy(a.x);
    }

    public AuthApiClient() {
        this(null, null, null, null, 15, null);
    }

    public AuthApiClient(@NotNull AuthApi authApi0, @NotNull TokenManagerProvider tokenManagerProvider0, @NotNull ApplicationInfo applicationInfo0, @NotNull ContextInfo contextInfo0) {
        Intrinsics.checkParameterIsNotNull(authApi0, "authApi");
        Intrinsics.checkParameterIsNotNull(tokenManagerProvider0, "tokenManagerProvider");
        Intrinsics.checkParameterIsNotNull(applicationInfo0, "applicationInfo");
        Intrinsics.checkParameterIsNotNull(contextInfo0, "contextInfo");
        super();
        this.a = authApi0;
        this.b = tokenManagerProvider0;
        this.c = applicationInfo0;
        this.d = contextInfo0;
    }

    public AuthApiClient(AuthApi authApi0, TokenManagerProvider tokenManagerProvider0, ApplicationInfo applicationInfo0, ContextInfo contextInfo0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            Object object0 = ApiFactoryKt.getKauth(ApiFactory.INSTANCE).create(AuthApi.class);
            Intrinsics.checkExpressionValueIsNotNull(object0, "ApiFactory.kauth.create(AuthApi::class.java)");
            authApi0 = (AuthApi)object0;
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
        this(authApi0, tokenManagerProvider0, applicationInfo0, contextInfo0);
    }

    public final void agt(@NotNull Function2 function20) {
        Intrinsics.checkParameterIsNotNull(function20, "callback");
        String s = this.c.getAppKey();
        OAuthToken oAuthToken0 = this.b.getManager().getToken();
        if(oAuthToken0 != null) {
            String s1 = oAuthToken0.getAccessToken();
            if(s1 != null) {
                this.a.agt(s, s1).enqueue(new Callback() {
                    public final Function2 a;

                    {
                        this.a = function20;
                    }

                    @Override  // retrofit2.Callback
                    public void onFailure(@NotNull Call call0, @NotNull Throwable throwable0) {
                        Intrinsics.checkParameterIsNotNull(call0, "call");
                        Intrinsics.checkParameterIsNotNull(throwable0, "t");
                        this.a.invoke(null, throwable0);
                    }

                    @Override  // retrofit2.Callback
                    public void onResponse(@NotNull Call call0, @NotNull Response response0) {
                        Intrinsics.checkParameterIsNotNull(call0, "call");
                        Intrinsics.checkParameterIsNotNull(response0, "response");
                        AgtResponse agtResponse0 = (AgtResponse)response0.body();
                        Function2 function20 = this.a;
                        if(agtResponse0 != null) {
                            function20.invoke(agtResponse0.getAgt(), null);
                            return;
                        }
                        HttpException httpException0 = new HttpException(response0);
                        function20.invoke(null, AuthApiClient.Companion.translateError(httpException0));
                    }
                });
                return;
            }
        }
        function20.invoke(null, new ClientError(ClientErrorCause.TokenNotFound, "Access token not found."));
    }

    @NotNull
    public static final AuthApiClient getInstance() {
        return AuthApiClient.Companion.getInstance();
    }

    public final void issueAccessToken(@NotNull String s, @NotNull Function2 function20) {
        Intrinsics.checkParameterIsNotNull(s, "authCode");
        Intrinsics.checkParameterIsNotNull(function20, "callback");
        String s1 = this.c.getAppKey();
        String s2 = this.d.getSigningKeyHash();
        DefaultImpls.issueAccessToken$default(this.a, s1, "kakao" + s1 + "://oauth", s2, s, null, null, 0x30, null).enqueue(new Callback() {
            public final AuthApiClient a;
            public final Function2 b;

            {
                AuthApiClient authApiClient0 = function20;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                this.a = authApiClient0;
                this.b = function20;
            }

            @Override  // retrofit2.Callback
            public void onFailure(@NotNull Call call0, @NotNull Throwable throwable0) {
                Intrinsics.checkParameterIsNotNull(call0, "call");
                Intrinsics.checkParameterIsNotNull(throwable0, "t");
                this.b.invoke(null, throwable0);
            }

            @Override  // retrofit2.Callback
            public void onResponse(@NotNull Call call0, @NotNull Response response0) {
                Intrinsics.checkParameterIsNotNull(call0, "call");
                Intrinsics.checkParameterIsNotNull(response0, "response");
                Function2 function20 = this.b;
                if(response0.isSuccessful()) {
                    AccessTokenResponse accessTokenResponse0 = (AccessTokenResponse)response0.body();
                    if(accessTokenResponse0 != null) {
                        Intrinsics.checkExpressionValueIsNotNull(accessTokenResponse0, "it");
                        OAuthToken oAuthToken0 = com.kakao.sdk.auth.model.OAuthToken.Companion.fromResponse$default(OAuthToken.Companion, accessTokenResponse0, null, 2, null);
                        this.a.b.getManager().setToken(oAuthToken0);
                        function20.invoke(oAuthToken0, null);
                        return;
                    }
                    function20.invoke(null, new ClientError(ClientErrorCause.Unknown, "No body"));
                    return;
                }
                HttpException httpException0 = new HttpException(response0);
                function20.invoke(null, AuthApiClient.Companion.translateError(httpException0));
            }
        });
    }

    @NotNull
    public final OAuthToken refreshAccessToken(@NotNull OAuthToken oAuthToken0) {
        Intrinsics.checkParameterIsNotNull(oAuthToken0, "oldToken");
        String s = this.c.getAppKey();
        String s1 = this.d.getSigningKeyHash();
        String s2 = oAuthToken0.getRefreshToken();
        Response response0 = DefaultImpls.issueAccessToken$default(this.a, s, null, s1, null, s2, "refresh_token", 8, null).execute();
        AccessTokenResponse accessTokenResponse0 = (AccessTokenResponse)response0.body();
        if(accessTokenResponse0 != null) {
            Intrinsics.checkExpressionValueIsNotNull(accessTokenResponse0, "it");
            OAuthToken oAuthToken1 = OAuthToken.Companion.fromResponse(accessTokenResponse0, oAuthToken0);
            if(oAuthToken1 != null) {
                this.b.getManager().setToken(oAuthToken1);
                return oAuthToken1;
            }
        }
        HttpException httpException0 = new HttpException(response0);
        throw AuthApiClient.Companion.translateError(httpException0);
    }

    @JvmOverloads
    public final void refreshAccessToken(@NotNull OAuthToken oAuthToken0, @NotNull Function2 function20) {
        Intrinsics.checkParameterIsNotNull(oAuthToken0, "oldToken");
        Intrinsics.checkParameterIsNotNull(function20, "callback");
        String s = this.c.getAppKey();
        String s1 = this.d.getSigningKeyHash();
        DefaultImpls.issueAccessToken$default(this.a, s, null, s1, null, oAuthToken0.getRefreshToken(), "refresh_token", 8, null).enqueue(new Callback() {
            public final AuthApiClient a;
            public final Function2 b;
            public final OAuthToken c;

            {
                AuthApiClient authApiClient0 = function20;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                Function2 function20 = oAuthToken0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                this.a = authApiClient0;
                this.b = function20;
                this.c = oAuthToken0;
            }

            @Override  // retrofit2.Callback
            public void onFailure(@NotNull Call call0, @NotNull Throwable throwable0) {
                Intrinsics.checkParameterIsNotNull(call0, "call");
                Intrinsics.checkParameterIsNotNull(throwable0, "t");
                this.b.invoke(null, throwable0);
            }

            @Override  // retrofit2.Callback
            public void onResponse(@NotNull Call call0, @NotNull Response response0) {
                Intrinsics.checkParameterIsNotNull(call0, "call");
                Intrinsics.checkParameterIsNotNull(response0, "response");
                Function2 function20 = this.b;
                if(response0.isSuccessful()) {
                    AccessTokenResponse accessTokenResponse0 = (AccessTokenResponse)response0.body();
                    if(accessTokenResponse0 != null) {
                        Intrinsics.checkExpressionValueIsNotNull(accessTokenResponse0, "it");
                        OAuthToken oAuthToken0 = OAuthToken.Companion.fromResponse(accessTokenResponse0, this.c);
                        this.a.b.getManager().setToken(oAuthToken0);
                        function20.invoke(oAuthToken0, null);
                        return;
                    }
                    function20.invoke(null, new ClientError(ClientErrorCause.Unknown, "No body"));
                    return;
                }
                HttpException httpException0 = new HttpException(response0);
                function20.invoke(null, AuthApiClient.Companion.translateError(httpException0));
            }
        });
    }

    @JvmOverloads
    public final void refreshAccessToken(@NotNull Function2 function20) {
        AuthApiClient.refreshAccessToken$default(this, null, function20, 1, null);
    }

    public static OAuthToken refreshAccessToken$default(AuthApiClient authApiClient0, OAuthToken oAuthToken0, int v, Object object0) {
        if((v & 1) != 0) {
            oAuthToken0 = authApiClient0.b.getManager().getToken();
            if(oAuthToken0 == null) {
                throw new ClientError(ClientErrorCause.TokenNotFound, null, 2, null);
            }
        }
        return authApiClient0.refreshAccessToken(oAuthToken0);
    }

    public static void refreshAccessToken$default(AuthApiClient authApiClient0, OAuthToken oAuthToken0, Function2 function20, int v, Object object0) {
        if((v & 1) != 0) {
            oAuthToken0 = authApiClient0.b.getManager().getToken();
            if(oAuthToken0 == null) {
                throw new ClientError(ClientErrorCause.TokenNotFound, null, 2, null);
            }
        }
        authApiClient0.refreshAccessToken(oAuthToken0, function20);
    }
}

