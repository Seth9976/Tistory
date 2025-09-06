package com.kakao.sdk.auth.network;

import android.content.Context;
import com.kakao.sdk.auth.AuthApiClient;
import com.kakao.sdk.auth.AuthApiClientKt;
import com.kakao.sdk.auth.LoginClient;
import com.kakao.sdk.auth.LoginClientKt;
import com.kakao.sdk.auth.RxAuthApiClient;
import com.kakao.sdk.auth.RxLoginClient;
import com.kakao.sdk.auth.TokenManagerProvider;
import io.reactivex.CompletableTransformer;
import io.reactivex.Flowable;
import io.reactivex.SingleTransformer;
import j0.b2;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import md.c;
import org.jetbrains.annotations.NotNull;
import org.reactivestreams.Publisher;
import tb.a;
import tb.b;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001F2\u00020\u0001:\u0001\u001FB%\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001F\u0010\f\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u000B\"\u0004\b\u0000\u0010\n¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000F\u001A\u00020\u000E¢\u0006\u0004\b\u000F\u0010\u0010JK\u0010\u0018\u001A8\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012(\u0012&\u0012\f\u0012\n \u0017*\u0004\u0018\u00010\u00160\u0016 \u0017*\u0012\u0012\f\u0012\n \u0017*\u0004\u0018\u00010\u00160\u0016\u0018\u00010\u00140\u00140\u00132\u0006\u0010\u0012\u001A\u00020\u0011¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001E\u001A\b\u0012\u0004\u0012\u00020\u00160\u001B2\f\u0010\u001A\u001A\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0000¢\u0006\u0004\b\u001C\u0010\u001D¨\u0006 "}, d2 = {"Lcom/kakao/sdk/auth/network/RxAuthOperations;", "", "Lcom/kakao/sdk/auth/RxAuthApiClient;", "authApiClient", "Lcom/kakao/sdk/auth/RxLoginClient;", "loginClient", "Lcom/kakao/sdk/auth/TokenManagerProvider;", "tokenManagerProvider", "<init>", "(Lcom/kakao/sdk/auth/RxAuthApiClient;Lcom/kakao/sdk/auth/RxLoginClient;Lcom/kakao/sdk/auth/TokenManagerProvider;)V", "T", "Lio/reactivex/SingleTransformer;", "handleApiError", "()Lio/reactivex/SingleTransformer;", "Lio/reactivex/CompletableTransformer;", "handleCompletableError", "()Lio/reactivex/CompletableTransformer;", "Landroid/content/Context;", "context", "Lkotlin/Function1;", "Lio/reactivex/Flowable;", "", "Lcom/kakao/sdk/auth/model/OAuthToken;", "kotlin.jvm.PlatformType", "incrementalAuthorizationRequired", "(Landroid/content/Context;)Lkotlin/jvm/functions/Function1;", "throwableFlowable", "Lorg/reactivestreams/Publisher;", "refreshAccessToken$auth_rx_release", "(Lio/reactivex/Flowable;)Lorg/reactivestreams/Publisher;", "refreshAccessToken", "Companion", "auth-rx_release"}, k = 1, mv = {1, 4, 0})
public final class RxAuthOperations {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001R!\u0010\t\u001A\u00020\u00028FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001A\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/kakao/sdk/auth/network/RxAuthOperations$Companion;", "", "Lcom/kakao/sdk/auth/network/RxAuthOperations;", "instance$delegate", "Lkotlin/Lazy;", "getInstance", "()Lcom/kakao/sdk/auth/network/RxAuthOperations;", "instance$annotations", "()V", "instance", "auth-rx_release"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        public static final KProperty[] a;

        static {
            Companion.a = new KProperty[]{Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Companion.class), "instance", "getInstance()Lcom/kakao/sdk/auth/network/RxAuthOperations;"))};
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final RxAuthOperations getInstance() {
            Lazy lazy0 = RxAuthOperations.d;
            KProperty kProperty0 = Companion.a[0];
            return (RxAuthOperations)lazy0.getValue();
        }

        @JvmStatic
        public static void instance$annotations() {
        }
    }

    public static final Companion Companion;
    public final RxAuthApiClient a;
    public final RxLoginClient b;
    public final TokenManagerProvider c;
    public static final Lazy d;

    static {
        RxAuthOperations.Companion = new Companion(null);
        RxAuthOperations.d = c.lazy(a.B);
    }

    public RxAuthOperations() {
        this(null, null, null, 7, null);
    }

    public RxAuthOperations(@NotNull RxAuthApiClient rxAuthApiClient0, @NotNull RxLoginClient rxLoginClient0, @NotNull TokenManagerProvider tokenManagerProvider0) {
        Intrinsics.checkParameterIsNotNull(rxAuthApiClient0, "authApiClient");
        Intrinsics.checkParameterIsNotNull(rxLoginClient0, "loginClient");
        Intrinsics.checkParameterIsNotNull(tokenManagerProvider0, "tokenManagerProvider");
        super();
        this.a = rxAuthApiClient0;
        this.b = rxLoginClient0;
        this.c = tokenManagerProvider0;
    }

    public RxAuthOperations(RxAuthApiClient rxAuthApiClient0, RxLoginClient rxLoginClient0, TokenManagerProvider tokenManagerProvider0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            rxAuthApiClient0 = AuthApiClientKt.getRx(AuthApiClient.Companion);
        }
        if((v & 2) != 0) {
            rxLoginClient0 = LoginClientKt.getRx(LoginClient.Companion);
        }
        if((v & 4) != 0) {
            tokenManagerProvider0 = TokenManagerProvider.Companion.getInstance();
        }
        this(rxAuthApiClient0, rxLoginClient0, tokenManagerProvider0);
    }

    public static final RxAuthApiClient access$getAuthApiClient$p(RxAuthOperations rxAuthOperations0) {
        return rxAuthOperations0.a;
    }

    public static final RxLoginClient access$getLoginClient$p(RxAuthOperations rxAuthOperations0) {
        return rxAuthOperations0.b;
    }

    public static final TokenManagerProvider access$getTokenManagerProvider$p(RxAuthOperations rxAuthOperations0) {
        return rxAuthOperations0.c;
    }

    @NotNull
    public static final RxAuthOperations getInstance() {
        return RxAuthOperations.Companion.getInstance();
    }

    @NotNull
    public final SingleTransformer handleApiError() {
        return new b(this);
    }

    @NotNull
    public final CompletableTransformer handleCompletableError() {
        return new tb.c(this);
    }

    @NotNull
    public final Function1 incrementalAuthorizationRequired(@NotNull Context context0) {
        Intrinsics.checkParameterIsNotNull(context0, "context");
        return new b2(26, this, context0);
    }

    @NotNull
    public final Publisher refreshAccessToken$auth_rx_release(@NotNull Flowable flowable0) {
        Intrinsics.checkParameterIsNotNull(flowable0, "throwableFlowable");
        Publisher publisher0 = flowable0.take(3L).flatMap(new cd.b(this, 21));
        Intrinsics.checkExpressionValueIsNotNull(publisher0, "throwableFlowable.take(3…n).toFlowable()\n        }");
        return publisher0;
    }
}

