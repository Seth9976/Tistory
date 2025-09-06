package com.kakao.sdk.partner.user;

import com.kakao.sdk.auth.network.ApiFactoryKt;
import com.kakao.sdk.common.network.ApiCallback;
import com.kakao.sdk.common.network.ApiFactory;
import com.kakao.sdk.common.util.KakaoJson;
import com.kakao.sdk.partner.user.model.PartnerUser;
import com.kakao.sdk.user.UserApiClient;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\u001Ad\u0010\u0005\u001A\u00020\u0006*\u00020\u00022\u0010\b\u0002\u0010\u0007\u001A\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\b\b\u0002\u0010\n\u001A\u00020\u000B2:\u0010\f\u001A6\u0012\u0015\u0012\u0013\u0018\u00010\u000E¢\u0006\f\b\u000F\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0015\u0012\u0013\u0018\u00010\u0012¢\u0006\f\b\u000F\u0012\b\b\u0010\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00060\rH\u0007\u001AI\u0010\u0014\u001A\u00020\u0006*\u00020\u00022\u0016\b\u0002\u0010\u0015\u001A\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\u00162#\u0010\f\u001A\u001F\u0012\u0015\u0012\u0013\u0018\u00010\u0012¢\u0006\f\b\u000F\u0012\b\b\u0010\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00060\u0017H\u0007\"\u0015\u0010\u0000\u001A\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001A\u0004\b\u0003\u0010\u0004¨\u0006\u0018"}, d2 = {"partnerApi", "Lcom/kakao/sdk/partner/user/PartnerUserApi;", "Lcom/kakao/sdk/user/UserApiClient;", "getPartnerApi", "(Lcom/kakao/sdk/user/UserApiClient;)Lcom/kakao/sdk/partner/user/PartnerUserApi;", "meForPartner", "", "propertyKeys", "", "", "secureReSource", "", "callback", "Lkotlin/Function2;", "Lcom/kakao/sdk/partner/user/model/PartnerUser;", "Lkotlin/ParameterName;", "name", "user", "", "error", "signup", "properties", "", "Lkotlin/Function1;", "partner-user_release"}, k = 2, mv = {1, 1, 15})
public final class UserApiClientKt {
    @NotNull
    public static final PartnerUserApi getPartnerApi(@NotNull UserApiClient userApiClient0) {
        Intrinsics.checkParameterIsNotNull(userApiClient0, "$this$partnerApi");
        Object object0 = ApiFactoryKt.getKapiWithOAuth(ApiFactory.INSTANCE).create(PartnerUserApi.class);
        Intrinsics.checkExpressionValueIsNotNull(object0, "ApiFactory.kapiWithOAuth…rtnerUserApi::class.java)");
        return (PartnerUserApi)object0;
    }

    @JvmOverloads
    public static final void meForPartner(@NotNull UserApiClient userApiClient0, @Nullable List list0, @NotNull Function2 function20) {
        UserApiClientKt.meForPartner$default(userApiClient0, list0, false, function20, 2, null);
    }

    @JvmOverloads
    public static final void meForPartner(@NotNull UserApiClient userApiClient0, @Nullable List list0, boolean z, @NotNull Function2 function20) {
        Intrinsics.checkParameterIsNotNull(userApiClient0, "$this$meForPartner");
        Intrinsics.checkParameterIsNotNull(function20, "callback");
        UserApiClientKt.getPartnerApi(userApiClient0).me((list0 == null ? null : KakaoJson.INSTANCE.toJson(list0)), z).enqueue(new ApiCallback() {
            public void onComplete(@Nullable PartnerUser partnerUser0, @Nullable Throwable throwable0) {
                function20.invoke(partnerUser0, throwable0);
            }

            @Override  // com.kakao.sdk.common.network.ApiCallback
            public void onComplete(Object object0, Throwable throwable0) {
                this.onComplete(((PartnerUser)object0), throwable0);
            }
        });
    }

    @JvmOverloads
    public static final void meForPartner(@NotNull UserApiClient userApiClient0, @NotNull Function2 function20) {
        UserApiClientKt.meForPartner$default(userApiClient0, null, false, function20, 3, null);
    }

    public static void meForPartner$default(UserApiClient userApiClient0, List list0, boolean z, Function2 function20, int v, Object object0) {
        if((v & 1) != 0) {
            list0 = null;
        }
        if((v & 2) != 0) {
            z = true;
        }
        UserApiClientKt.meForPartner(userApiClient0, list0, z, function20);
    }

    @JvmOverloads
    public static final void signup(@NotNull UserApiClient userApiClient0, @Nullable Map map0, @NotNull Function1 function10) {
        Intrinsics.checkParameterIsNotNull(userApiClient0, "$this$signup");
        Intrinsics.checkParameterIsNotNull(function10, "callback");
        UserApiClientKt.getPartnerApi(userApiClient0).signup(map0).enqueue(new ApiCallback() {
            @Override  // com.kakao.sdk.common.network.ApiCallback
            public void onComplete(Object object0, Throwable throwable0) {
                this.onComplete(((Unit)object0), throwable0);
            }

            public void onComplete(@Nullable Unit unit0, @Nullable Throwable throwable0) {
                function10.invoke(throwable0);
            }
        });
    }

    @JvmOverloads
    public static final void signup(@NotNull UserApiClient userApiClient0, @NotNull Function1 function10) {
        UserApiClientKt.signup$default(userApiClient0, null, function10, 1, null);
    }

    public static void signup$default(UserApiClient userApiClient0, Map map0, Function1 function10, int v, Object object0) {
        if((v & 1) != 0) {
            map0 = null;
        }
        UserApiClientKt.signup(userApiClient0, map0, function10);
    }
}

