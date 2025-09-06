package com.kakao.sdk.user;

import cd.h;
import com.kakao.sdk.auth.TokenManagerProvider;
import com.kakao.sdk.auth.network.RxApiFactoryKt;
import com.kakao.sdk.auth.network.RxAuthOperations;
import com.kakao.sdk.common.network.ApiFactory;
import com.kakao.sdk.common.network.RxOperations;
import io.reactivex.Completable;
import io.reactivex.Single;
import java.util.Date;
import java.util.Map;
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
import xb.a;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 ,2\u00020\u0001:\u0001,B%\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001F\u0010\u000E\u001A\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u000B\u001A\u00020\nH\u0007¢\u0006\u0004\b\u000E\u0010\u000FJ\u0013\u0010\u0011\u001A\b\u0012\u0004\u0012\u00020\u00100\f¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0017\u001A\u00020\u00162\u0012\u0010\u0015\u001A\u000E\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001A\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001AJ\r\u0010\u001B\u001A\u00020\u0016¢\u0006\u0004\b\u001B\u0010\u001AJ-\u0010!\u001A\b\u0012\u0004\u0012\u00020 0\f2\n\b\u0002\u0010\u001D\u001A\u0004\u0018\u00010\u001C2\n\b\u0002\u0010\u001F\u001A\u0004\u0018\u00010\u001EH\u0007¢\u0006\u0004\b!\u0010\"J\u001B\u0010!\u001A\b\u0012\u0004\u0012\u00020 0\f2\u0006\u0010$\u001A\u00020#¢\u0006\u0004\b!\u0010%J\u0013\u0010\'\u001A\b\u0012\u0004\u0012\u00020&0\f¢\u0006\u0004\b\'\u0010\u0012R\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010)\u001A\u0004\b*\u0010+¨\u0006-"}, d2 = {"Lcom/kakao/sdk/user/RxUserApiClient;", "", "Lcom/kakao/sdk/user/RxUserApi;", "userApi", "Lcom/kakao/sdk/auth/network/RxAuthOperations;", "authOperations", "Lcom/kakao/sdk/auth/TokenManagerProvider;", "tokenManagerProvider", "<init>", "(Lcom/kakao/sdk/user/RxUserApi;Lcom/kakao/sdk/auth/network/RxAuthOperations;Lcom/kakao/sdk/auth/TokenManagerProvider;)V", "", "secureReSource", "Lio/reactivex/Single;", "Lcom/kakao/sdk/user/model/User;", "me", "(Z)Lio/reactivex/Single;", "Lcom/kakao/sdk/user/model/AccessTokenInfo;", "accessTokenInfo", "()Lio/reactivex/Single;", "", "", "properties", "Lio/reactivex/Completable;", "updateProfile", "(Ljava/util/Map;)Lio/reactivex/Completable;", "logout", "()Lio/reactivex/Completable;", "unlink", "Ljava/util/Date;", "fromUpdateAt", "", "pageSize", "Lcom/kakao/sdk/user/model/UserShippingAddresses;", "shippingAddresses", "(Ljava/util/Date;Ljava/lang/Integer;)Lio/reactivex/Single;", "", "addressId", "(J)Lio/reactivex/Single;", "Lcom/kakao/sdk/user/model/UserServiceTerms;", "serviceTerms", "b", "Lcom/kakao/sdk/auth/network/RxAuthOperations;", "getAuthOperations", "()Lcom/kakao/sdk/auth/network/RxAuthOperations;", "Companion", "user-rx_release"}, k = 1, mv = {1, 4, 0})
public final class RxUserApiClient {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001R!\u0010\t\u001A\u00020\u00028FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001A\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/kakao/sdk/user/RxUserApiClient$Companion;", "", "Lcom/kakao/sdk/user/RxUserApiClient;", "instance$delegate", "Lkotlin/Lazy;", "getInstance", "()Lcom/kakao/sdk/user/RxUserApiClient;", "instance$annotations", "()V", "instance", "user-rx_release"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        public static final KProperty[] a;

        static {
            Companion.a = new KProperty[]{Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Companion.class), "instance", "getInstance()Lcom/kakao/sdk/user/RxUserApiClient;"))};
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final RxUserApiClient getInstance() {
            Lazy lazy0 = RxUserApiClient.d;
            KProperty kProperty0 = Companion.a[0];
            return (RxUserApiClient)lazy0.getValue();
        }

        @JvmStatic
        public static void instance$annotations() {
        }
    }

    public static final Companion Companion;
    public final RxUserApi a;
    public final RxAuthOperations b;
    public final TokenManagerProvider c;
    public static final Lazy d;

    static {
        RxUserApiClient.Companion = new Companion(null);
        RxUserApiClient.d = c.lazy(a.x);
    }

    public RxUserApiClient() {
        this(null, null, null, 7, null);
    }

    public RxUserApiClient(@NotNull RxUserApi rxUserApi0, @NotNull RxAuthOperations rxAuthOperations0, @NotNull TokenManagerProvider tokenManagerProvider0) {
        Intrinsics.checkParameterIsNotNull(rxUserApi0, "userApi");
        Intrinsics.checkParameterIsNotNull(rxAuthOperations0, "authOperations");
        Intrinsics.checkParameterIsNotNull(tokenManagerProvider0, "tokenManagerProvider");
        super();
        this.a = rxUserApi0;
        this.b = rxAuthOperations0;
        this.c = tokenManagerProvider0;
    }

    public RxUserApiClient(RxUserApi rxUserApi0, RxAuthOperations rxAuthOperations0, TokenManagerProvider tokenManagerProvider0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            Object object0 = RxApiFactoryKt.getRxKapiWithOAuth(ApiFactory.INSTANCE).create(RxUserApi.class);
            Intrinsics.checkExpressionValueIsNotNull(object0, "ApiFactory.rxKapiWithOAu…te(RxUserApi::class.java)");
            rxUserApi0 = (RxUserApi)object0;
        }
        if((v & 2) != 0) {
            rxAuthOperations0 = RxAuthOperations.Companion.getInstance();
        }
        if((v & 4) != 0) {
            tokenManagerProvider0 = TokenManagerProvider.Companion.getInstance();
        }
        this(rxUserApi0, rxAuthOperations0, tokenManagerProvider0);
    }

    public static final TokenManagerProvider access$getTokenManagerProvider$p(RxUserApiClient rxUserApiClient0) {
        return rxUserApiClient0.c;
    }

    @NotNull
    public final Single accessTokenInfo() {
        Single single0 = this.a.accessTokenInfo().compose(RxOperations.INSTANCE.handleApiError()).compose(this.b.handleApiError());
        Intrinsics.checkExpressionValueIsNotNull(single0, "userApi.accessTokenInfo(…rations.handleApiError())");
        return single0;
    }

    @NotNull
    public final RxAuthOperations getAuthOperations() {
        return this.b;
    }

    @NotNull
    public static final RxUserApiClient getInstance() {
        return RxUserApiClient.Companion.getInstance();
    }

    @NotNull
    public final Completable logout() {
        Completable completable0 = this.a.logout().compose(RxOperations.INSTANCE.handleCompletableError()).compose(this.b.handleCompletableError()).doOnEvent(new cd.a(this, 5));
        Intrinsics.checkExpressionValueIsNotNull(completable0, "userApi.logout()\n       …rovider.manager.clear() }");
        return completable0;
    }

    @JvmOverloads
    @NotNull
    public final Single me() {
        return RxUserApiClient.me$default(this, false, 1, null);
    }

    @JvmOverloads
    @NotNull
    public final Single me(boolean z) {
        Single single0 = DefaultImpls.me$default(this.a, z, null, 2, null).compose(RxOperations.INSTANCE.handleApiError()).compose(this.b.handleApiError());
        Intrinsics.checkExpressionValueIsNotNull(single0, "userApi.me(secureReSourc…rations.handleApiError())");
        return single0;
    }

    public static Single me$default(RxUserApiClient rxUserApiClient0, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            z = true;
        }
        return rxUserApiClient0.me(z);
    }

    @NotNull
    public final Single serviceTerms() {
        Single single0 = this.a.serviceTerms().compose(RxOperations.INSTANCE.handleApiError()).compose(this.b.handleApiError());
        Intrinsics.checkExpressionValueIsNotNull(single0, "userApi.serviceTerms()\n …rations.handleApiError())");
        return single0;
    }

    @JvmOverloads
    @NotNull
    public final Single shippingAddresses() {
        return RxUserApiClient.shippingAddresses$default(this, null, null, 3, null);
    }

    @NotNull
    public final Single shippingAddresses(long v) {
        Single single0 = DefaultImpls.shippingAddresses$default(this.a, v, null, null, 6, null).compose(RxOperations.INSTANCE.handleApiError()).compose(this.b.handleApiError());
        Intrinsics.checkExpressionValueIsNotNull(single0, "userApi.shippingAddresse…rations.handleApiError())");
        return single0;
    }

    @JvmOverloads
    @NotNull
    public final Single shippingAddresses(@Nullable Date date0) {
        return RxUserApiClient.shippingAddresses$default(this, date0, null, 2, null);
    }

    @JvmOverloads
    @NotNull
    public final Single shippingAddresses(@Nullable Date date0, @Nullable Integer integer0) {
        Single single0 = DefaultImpls.shippingAddresses$default(this.a, null, date0, integer0, 1, null).compose(RxOperations.INSTANCE.handleApiError()).compose(this.b.handleApiError());
        Intrinsics.checkExpressionValueIsNotNull(single0, "userApi.shippingAddresse…rations.handleApiError())");
        return single0;
    }

    public static Single shippingAddresses$default(RxUserApiClient rxUserApiClient0, Date date0, Integer integer0, int v, Object object0) {
        if((v & 1) != 0) {
            date0 = null;
        }
        if((v & 2) != 0) {
            integer0 = null;
        }
        return rxUserApiClient0.shippingAddresses(date0, integer0);
    }

    @NotNull
    public final Completable unlink() {
        Completable completable0 = this.a.unlink().compose(RxOperations.INSTANCE.handleCompletableError()).compose(this.b.handleCompletableError()).doOnComplete(new h(this, 5));
        Intrinsics.checkExpressionValueIsNotNull(completable0, "userApi.unlink()\n       …rovider.manager.clear() }");
        return completable0;
    }

    @NotNull
    public final Completable updateProfile(@NotNull Map map0) {
        Intrinsics.checkParameterIsNotNull(map0, "properties");
        Completable completable0 = this.a.updateProfile(map0).compose(RxOperations.INSTANCE.handleCompletableError()).compose(this.b.handleCompletableError());
        Intrinsics.checkExpressionValueIsNotNull(completable0, "userApi.updateProfile(pr…handleCompletableError())");
        return completable0;
    }
}

