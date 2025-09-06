package com.kakao.sdk.auth;

import android.content.Context;
import com.kakao.sdk.auth.model.AuthType;
import io.reactivex.Single;
import io.reactivex.schedulers.Schedulers;
import java.util.List;
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
import org.jetbrains.annotations.Nullable;
import sb.a;
import sb.h;
import sb.i;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001B2\u00020\u0001:\u0001\u001BB\u001B\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007JK\u0010\u0012\u001A\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\t\u001A\u00020\b2\b\b\u0002\u0010\u000B\u001A\u00020\n2\u0010\b\u0002\u0010\u000E\u001A\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0010\b\u0002\u0010\u000F\u001A\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013JM\u0010\u0016\u001A\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\t\u001A\u00020\b2\n\b\u0002\u0010\u0015\u001A\u0004\u0018\u00010\u00142\u0010\b\u0002\u0010\u000E\u001A\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0010\b\u0002\u0010\u000F\u001A\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0007¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u0019\u001A\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\t\u001A\u00020\b2\f\u0010\u0018\u001A\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u0019\u0010\u001A¨\u0006\u001C"}, d2 = {"Lcom/kakao/sdk/auth/RxLoginClient;", "", "Lcom/kakao/sdk/auth/RxAuthApiClient;", "authApiClient", "Lcom/kakao/sdk/auth/RxAuthCodeClient;", "authCodeClient", "<init>", "(Lcom/kakao/sdk/auth/RxAuthApiClient;Lcom/kakao/sdk/auth/RxAuthCodeClient;)V", "Landroid/content/Context;", "context", "", "requestCode", "", "", "channelPublicIds", "serviceTerms", "Lio/reactivex/Single;", "Lcom/kakao/sdk/auth/model/OAuthToken;", "loginWithKakaoTalk", "(Landroid/content/Context;ILjava/util/List;Ljava/util/List;)Lio/reactivex/Single;", "Lcom/kakao/sdk/auth/model/AuthType;", "authType", "loginWithKakaoAccount", "(Landroid/content/Context;Lcom/kakao/sdk/auth/model/AuthType;Ljava/util/List;Ljava/util/List;)Lio/reactivex/Single;", "scopes", "loginWithNewScopes", "(Landroid/content/Context;Ljava/util/List;)Lio/reactivex/Single;", "Companion", "auth-rx_release"}, k = 1, mv = {1, 4, 0})
public final class RxLoginClient {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001R!\u0010\t\u001A\u00020\u00028FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001A\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/kakao/sdk/auth/RxLoginClient$Companion;", "", "Lcom/kakao/sdk/auth/RxLoginClient;", "instance$delegate", "Lkotlin/Lazy;", "getInstance", "()Lcom/kakao/sdk/auth/RxLoginClient;", "instance$annotations", "()V", "instance", "auth-rx_release"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        public static final KProperty[] a;

        static {
            Companion.a = new KProperty[]{Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Companion.class), "instance", "getInstance()Lcom/kakao/sdk/auth/RxLoginClient;"))};
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final RxLoginClient getInstance() {
            Lazy lazy0 = RxLoginClient.c;
            KProperty kProperty0 = Companion.a[0];
            return (RxLoginClient)lazy0.getValue();
        }

        @JvmStatic
        public static void instance$annotations() {
        }
    }

    public static final Companion Companion;
    public final RxAuthApiClient a;
    public final RxAuthCodeClient b;
    public static final Lazy c;

    static {
        RxLoginClient.Companion = new Companion(null);
        RxLoginClient.c = c.lazy(a.F);
    }

    public RxLoginClient() {
        this(null, null, 3, null);
    }

    public RxLoginClient(@NotNull RxAuthApiClient rxAuthApiClient0, @NotNull RxAuthCodeClient rxAuthCodeClient0) {
        Intrinsics.checkParameterIsNotNull(rxAuthApiClient0, "authApiClient");
        Intrinsics.checkParameterIsNotNull(rxAuthCodeClient0, "authCodeClient");
        super();
        this.a = rxAuthApiClient0;
        this.b = rxAuthCodeClient0;
    }

    public RxLoginClient(RxAuthApiClient rxAuthApiClient0, RxAuthCodeClient rxAuthCodeClient0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            rxAuthApiClient0 = AuthApiClientKt.getRx(AuthApiClient.Companion);
        }
        if((v & 2) != 0) {
            rxAuthCodeClient0 = AuthCodeClientKt.getRx(AuthCodeClient.Companion);
        }
        this(rxAuthApiClient0, rxAuthCodeClient0);
    }

    @NotNull
    public static final RxLoginClient getInstance() {
        return RxLoginClient.Companion.getInstance();
    }

    @JvmOverloads
    @NotNull
    public final Single loginWithKakaoAccount(@NotNull Context context0) {
        return RxLoginClient.loginWithKakaoAccount$default(this, context0, null, null, null, 14, null);
    }

    @JvmOverloads
    @NotNull
    public final Single loginWithKakaoAccount(@NotNull Context context0, @Nullable AuthType authType0) {
        return RxLoginClient.loginWithKakaoAccount$default(this, context0, authType0, null, null, 12, null);
    }

    @JvmOverloads
    @NotNull
    public final Single loginWithKakaoAccount(@NotNull Context context0, @Nullable AuthType authType0, @Nullable List list0) {
        return RxLoginClient.loginWithKakaoAccount$default(this, context0, authType0, list0, null, 8, null);
    }

    @JvmOverloads
    @NotNull
    public final Single loginWithKakaoAccount(@NotNull Context context0, @Nullable AuthType authType0, @Nullable List list0, @Nullable List list1) {
        Intrinsics.checkParameterIsNotNull(context0, "context");
        Single single0 = RxAuthCodeClient.authorizeWithKakaoAccount$default(this.b, context0, authType0, null, null, list0, list1, 12, null).observeOn(Schedulers.io()).flatMap(new h(this, 0));
        Intrinsics.checkExpressionValueIsNotNull(single0, "authCodeClient.authorize…nt.issueAccessToken(it) }");
        return single0;
    }

    public static Single loginWithKakaoAccount$default(RxLoginClient rxLoginClient0, Context context0, AuthType authType0, List list0, List list1, int v, Object object0) {
        if((v & 2) != 0) {
            authType0 = null;
        }
        if((v & 4) != 0) {
            list0 = null;
        }
        if((v & 8) != 0) {
            list1 = null;
        }
        return rxLoginClient0.loginWithKakaoAccount(context0, authType0, list0, list1);
    }

    @JvmOverloads
    @NotNull
    public final Single loginWithKakaoTalk(@NotNull Context context0) {
        return RxLoginClient.loginWithKakaoTalk$default(this, context0, 0, null, null, 14, null);
    }

    @JvmOverloads
    @NotNull
    public final Single loginWithKakaoTalk(@NotNull Context context0, int v) {
        return RxLoginClient.loginWithKakaoTalk$default(this, context0, v, null, null, 12, null);
    }

    @JvmOverloads
    @NotNull
    public final Single loginWithKakaoTalk(@NotNull Context context0, int v, @Nullable List list0) {
        return RxLoginClient.loginWithKakaoTalk$default(this, context0, v, list0, null, 8, null);
    }

    @JvmOverloads
    @NotNull
    public final Single loginWithKakaoTalk(@NotNull Context context0, int v, @Nullable List list0, @Nullable List list1) {
        Intrinsics.checkParameterIsNotNull(context0, "context");
        Single single0 = this.b.authorizeWithKakaoTalk(context0, v, list0, list1).observeOn(Schedulers.io()).flatMap(new h(this, 1));
        Intrinsics.checkExpressionValueIsNotNull(single0, "authCodeClient.authorize…nt.issueAccessToken(it) }");
        return single0;
    }

    public static Single loginWithKakaoTalk$default(RxLoginClient rxLoginClient0, Context context0, int v, List list0, List list1, int v1, Object object0) {
        if((v1 & 2) != 0) {
            v = 10012;
        }
        if((v1 & 4) != 0) {
            list0 = null;
        }
        if((v1 & 8) != 0) {
            list1 = null;
        }
        return rxLoginClient0.loginWithKakaoTalk(context0, v, list0, list1);
    }

    @NotNull
    public final Single loginWithNewScopes(@NotNull Context context0, @NotNull List list0) {
        Intrinsics.checkParameterIsNotNull(context0, "context");
        Intrinsics.checkParameterIsNotNull(list0, "scopes");
        Single single0 = RxAuthApiClient.agt$default(this.a, null, 1, null).subscribeOn(Schedulers.io()).flatMap(new i(this, context0, list0)).observeOn(Schedulers.io()).flatMap(new h(this, 2));
        Intrinsics.checkExpressionValueIsNotNull(single0, "authApiClient.agt()\n    …nt.issueAccessToken(it) }");
        return single0;
    }
}

