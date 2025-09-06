package com.kakao.sdk.partner.user;

import io.reactivex.Completable;
import io.reactivex.Single;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0000\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0003\u0010\u0005\u001A\u0004\u0018\u00010\u00062\b\b\u0003\u0010\u0007\u001A\u00020\bH\'J \u0010\t\u001A\u00020\n2\u0016\b\u0003\u0010\u0005\u001A\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000BH\'¨\u0006\f"}, d2 = {"Lcom/kakao/sdk/partner/user/RxPartnerUserApi;", "", "me", "Lio/reactivex/Single;", "Lcom/kakao/sdk/partner/user/model/PartnerUser;", "properties", "", "secureResource", "", "signup", "Lio/reactivex/Completable;", "", "partner-user-rx_release"}, k = 1, mv = {1, 1, 15})
public interface RxPartnerUserApi {
    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
    public static final class DefaultImpls {
        public static Single me$default(RxPartnerUserApi rxPartnerUserApi0, String s, boolean z, int v, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: me");
            }
            if((v & 1) != 0) {
                s = null;
            }
            if((v & 2) != 0) {
                z = true;
            }
            return rxPartnerUserApi0.me(s, z);
        }

        public static Completable signup$default(RxPartnerUserApi rxPartnerUserApi0, Map map0, int v, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: signup");
            }
            if((v & 1) != 0) {
                map0 = null;
            }
            return rxPartnerUserApi0.signup(map0);
        }
    }

    @NotNull
    @GET("/v2/user/me")
    Single me(@Nullable @Query("propertyKeys") String arg1, @Query("secure_resource") boolean arg2);

    @NotNull
    @FormUrlEncoded
    @POST("/v1/user/signup")
    Completable signup(@Nullable @Field("properties") Map arg1);
}

