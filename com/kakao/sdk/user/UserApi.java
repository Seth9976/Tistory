package com.kakao.sdk.user;

import com.kakao.sdk.common.json.IntDate;
import java.util.Date;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\bf\u0018\u00002\u00020\u0001J\u000E\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00040\u0003H\'J\u000E\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00060\u0003H\'J$\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\b0\u00032\b\b\u0003\u0010\t\u001A\u00020\n2\n\b\u0003\u0010\u000B\u001A\u0004\u0018\u00010\fH\'J\u000E\u0010\r\u001A\b\u0012\u0004\u0012\u00020\u000E0\u0003H\'J7\u0010\u000F\u001A\b\u0012\u0004\u0012\u00020\u00100\u00032\n\b\u0003\u0010\u0011\u001A\u0004\u0018\u00010\u00122\n\b\u0003\u0010\u0013\u001A\u0004\u0018\u00010\u00142\n\b\u0003\u0010\u0015\u001A\u0004\u0018\u00010\u0016H\'¢\u0006\u0002\u0010\u0017J\u000E\u0010\u0018\u001A\b\u0012\u0004\u0012\u00020\u00060\u0003H\'J$\u0010\u0019\u001A\b\u0012\u0004\u0012\u00020\u00060\u00032\u0014\b\u0001\u0010\u000B\u001A\u000E\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u001AH\'¨\u0006\u001B"}, d2 = {"Lcom/kakao/sdk/user/UserApi;", "", "accessTokenInfo", "Lretrofit2/Call;", "Lcom/kakao/sdk/user/model/AccessTokenInfo;", "logout", "", "me", "Lcom/kakao/sdk/user/model/User;", "secureResource", "", "properties", "", "serviceTerms", "Lcom/kakao/sdk/user/model/UserServiceTerms;", "shippingAddresses", "Lcom/kakao/sdk/user/model/UserShippingAddresses;", "addressId", "", "fromUpdateAt", "Ljava/util/Date;", "pageSize", "", "(Ljava/lang/Long;Ljava/util/Date;Ljava/lang/Integer;)Lretrofit2/Call;", "unlink", "updateProfile", "", "user_release"}, k = 1, mv = {1, 1, 15})
public interface UserApi {
    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
    public static final class DefaultImpls {
        public static Call me$default(UserApi userApi0, boolean z, String s, int v, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: me");
            }
            if((v & 1) != 0) {
                z = true;
            }
            if((v & 2) != 0) {
                s = null;
            }
            return userApi0.me(z, s);
        }

        public static Call shippingAddresses$default(UserApi userApi0, Long long0, Date date0, Integer integer0, int v, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: shippingAddresses");
            }
            if((v & 1) != 0) {
                long0 = null;
            }
            if((v & 2) != 0) {
                date0 = null;
            }
            if((v & 4) != 0) {
                integer0 = null;
            }
            return userApi0.shippingAddresses(long0, date0, integer0);
        }
    }

    @NotNull
    @GET("/v1/user/access_token_info")
    Call accessTokenInfo();

    @NotNull
    @POST("/v1/user/logout")
    Call logout();

    @NotNull
    @GET("/v2/user/me")
    Call me(@Query("secure_resource") boolean arg1, @Nullable @Query("propertyKeys") String arg2);

    @NotNull
    @GET("/v1/user/service/terms")
    Call serviceTerms();

    @NotNull
    @GET("/v1/user/shipping_address")
    Call shippingAddresses(@Nullable @Query("address_id") Long arg1, @IntDate @Nullable @Query("from_updated_at") Date arg2, @Nullable @Query("page_size") Integer arg3);

    @NotNull
    @POST("/v1/user/unlink")
    Call unlink();

    @NotNull
    @FormUrlEncoded
    @POST("/v1/user/update_profile")
    Call updateProfile(@NotNull @Field("properties") Map arg1);
}

