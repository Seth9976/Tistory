package com.kakao.sdk.partner.user;

import com.kakao.sdk.auth.network.RxApiFactoryKt;
import com.kakao.sdk.common.network.ApiFactory;
import com.kakao.sdk.common.network.RxOperations;
import com.kakao.sdk.common.util.KakaoJson;
import com.kakao.sdk.user.RxUserApiClient;
import io.reactivex.Completable;
import io.reactivex.Single;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\u001A.\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00070\u0006*\u00020\u00022\u0010\b\u0002\u0010\b\u001A\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\b\b\u0002\u0010\u000B\u001A\u00020\fH\u0007\u001A$\u0010\r\u001A\u00020\u000E*\u00020\u00022\u0016\b\u0002\u0010\u000F\u001A\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0010H\u0007\"\u0015\u0010\u0000\u001A\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001A\u0004\b\u0003\u0010\u0004¨\u0006\u0011"}, d2 = {"partnerApi", "Lcom/kakao/sdk/partner/user/RxPartnerUserApi;", "Lcom/kakao/sdk/user/RxUserApiClient;", "getPartnerApi", "(Lcom/kakao/sdk/user/RxUserApiClient;)Lcom/kakao/sdk/partner/user/RxPartnerUserApi;", "meForPartner", "Lio/reactivex/Single;", "Lcom/kakao/sdk/partner/user/model/PartnerUser;", "propertyKeys", "", "", "secureReSource", "", "signup", "Lio/reactivex/Completable;", "properties", "", "partner-user-rx_release"}, k = 2, mv = {1, 1, 15})
public final class RxUserApiClientKt {
    @NotNull
    public static final RxPartnerUserApi getPartnerApi(@NotNull RxUserApiClient rxUserApiClient0) {
        Intrinsics.checkParameterIsNotNull(rxUserApiClient0, "$this$partnerApi");
        Object object0 = RxApiFactoryKt.getRxKapiWithOAuth(ApiFactory.INSTANCE).create(RxPartnerUserApi.class);
        Intrinsics.checkExpressionValueIsNotNull(object0, "ApiFactory.rxKapiWithOAu…rtnerUserApi::class.java)");
        return (RxPartnerUserApi)object0;
    }

    @JvmOverloads
    @NotNull
    public static final Single meForPartner(@NotNull RxUserApiClient rxUserApiClient0) {
        return RxUserApiClientKt.meForPartner$default(rxUserApiClient0, null, false, 3, null);
    }

    @JvmOverloads
    @NotNull
    public static final Single meForPartner(@NotNull RxUserApiClient rxUserApiClient0, @Nullable List list0) {
        return RxUserApiClientKt.meForPartner$default(rxUserApiClient0, list0, false, 2, null);
    }

    @JvmOverloads
    @NotNull
    public static final Single meForPartner(@NotNull RxUserApiClient rxUserApiClient0, @Nullable List list0, boolean z) {
        Intrinsics.checkParameterIsNotNull(rxUserApiClient0, "$this$meForPartner");
        Single single0 = RxUserApiClientKt.getPartnerApi(rxUserApiClient0).me((list0 == null ? null : KakaoJson.INSTANCE.toJson(list0)), z).compose(RxOperations.INSTANCE.handleApiError()).compose(rxUserApiClient0.getAuthOperations().handleApiError());
        Intrinsics.checkExpressionValueIsNotNull(single0, "partnerApi.me(\n        i…rations.handleApiError())");
        return single0;
    }

    public static Single meForPartner$default(RxUserApiClient rxUserApiClient0, List list0, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            list0 = null;
        }
        if((v & 2) != 0) {
            z = true;
        }
        return RxUserApiClientKt.meForPartner(rxUserApiClient0, list0, z);
    }

    @JvmOverloads
    @NotNull
    public static final Completable signup(@NotNull RxUserApiClient rxUserApiClient0) {
        return RxUserApiClientKt.signup$default(rxUserApiClient0, null, 1, null);
    }

    @JvmOverloads
    @NotNull
    public static final Completable signup(@NotNull RxUserApiClient rxUserApiClient0, @Nullable Map map0) {
        Intrinsics.checkParameterIsNotNull(rxUserApiClient0, "$this$signup");
        Completable completable0 = RxUserApiClientKt.getPartnerApi(rxUserApiClient0).signup(map0).compose(RxOperations.INSTANCE.handleCompletableError()).compose(rxUserApiClient0.getAuthOperations().handleCompletableError());
        Intrinsics.checkExpressionValueIsNotNull(completable0, "partnerApi.signup(proper…handleCompletableError())");
        return completable0;
    }

    public static Completable signup$default(RxUserApiClient rxUserApiClient0, Map map0, int v, Object object0) {
        if((v & 1) != 0) {
            map0 = null;
        }
        return RxUserApiClientKt.signup(rxUserApiClient0, map0);
    }
}

