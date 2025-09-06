package com.kakao.sdk.user;

import com.kakao.sdk.auth.TokenManagerProvider;
import com.kakao.sdk.auth.network.ApiFactoryKt;
import com.kakao.sdk.common.network.ApiCallback;
import com.kakao.sdk.common.network.ApiFactory;
import com.kakao.sdk.user.model.AccessTokenInfo;
import com.kakao.sdk.user.model.User;
import com.kakao.sdk.user.model.UserServiceTerms;
import com.kakao.sdk.user.model.UserShippingAddresses;
import java.util.Date;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import md.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import xb.a;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 02\u00020\u0001:\u00010B\u001B\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004\u00A2\u0006\u0004\b\u0006\u0010\u0007JU\u0010\u0013\u001A\u00020\u00112\b\b\u0002\u0010\t\u001A\u00020\b2:\u0010\u0012\u001A6\u0012\u0015\u0012\u0013\u0018\u00010\u000B\u00A2\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000E\u0012\u0015\u0012\u0013\u0018\u00010\u000F\u00A2\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00110\nH\u0007\u00A2\u0006\u0004\b\u0013\u0010\u0014JI\u0010\u0017\u001A\u00020\u00112:\u0010\u0012\u001A6\u0012\u0015\u0012\u0013\u0018\u00010\u0015\u00A2\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0016\u0012\u0015\u0012\u0013\u0018\u00010\u000F\u00A2\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00110\n\u00A2\u0006\u0004\b\u0017\u0010\u0018JF\u0010\u001D\u001A\u00020\u00112\u0012\u0010\u001B\u001A\u000E\u0012\u0004\u0012\u00020\u001A\u0012\u0004\u0012\u00020\u001A0\u00192#\u0010\u0012\u001A\u001F\u0012\u0015\u0012\u0013\u0018\u00010\u000F\u00A2\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00110\u001C\u00A2\u0006\u0004\b\u001D\u0010\u001EJ2\u0010\u001F\u001A\u00020\u00112#\u0010\u0012\u001A\u001F\u0012\u0015\u0012\u0013\u0018\u00010\u000F\u00A2\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00110\u001C\u00A2\u0006\u0004\b\u001F\u0010 J2\u0010!\u001A\u00020\u00112#\u0010\u0012\u001A\u001F\u0012\u0015\u0012\u0013\u0018\u00010\u000F\u00A2\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00110\u001C\u00A2\u0006\u0004\b!\u0010 Jc\u0010(\u001A\u00020\u00112\n\b\u0002\u0010#\u001A\u0004\u0018\u00010\"2\n\b\u0002\u0010%\u001A\u0004\u0018\u00010$2:\u0010\u0012\u001A6\u0012\u0015\u0012\u0013\u0018\u00010&\u00A2\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\'\u0012\u0015\u0012\u0013\u0018\u00010\u000F\u00A2\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00110\nH\u0007\u00A2\u0006\u0004\b(\u0010)JQ\u0010(\u001A\u00020\u00112\u0006\u0010+\u001A\u00020*2:\u0010\u0012\u001A6\u0012\u0015\u0012\u0013\u0018\u00010&\u00A2\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\'\u0012\u0015\u0012\u0013\u0018\u00010\u000F\u00A2\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00110\n\u00A2\u0006\u0004\b(\u0010,JI\u0010/\u001A\u00020\u00112:\u0010\u0012\u001A6\u0012\u0015\u0012\u0013\u0018\u00010-\u00A2\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(.\u0012\u0015\u0012\u0013\u0018\u00010\u000F\u00A2\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00110\n\u00A2\u0006\u0004\b/\u0010\u0018\u00A8\u00061"}, d2 = {"Lcom/kakao/sdk/user/UserApiClient;", "", "Lcom/kakao/sdk/user/UserApi;", "userApi", "Lcom/kakao/sdk/auth/TokenManagerProvider;", "tokenManagerProvider", "<init>", "(Lcom/kakao/sdk/user/UserApi;Lcom/kakao/sdk/auth/TokenManagerProvider;)V", "", "secureReSource", "Lkotlin/Function2;", "Lcom/kakao/sdk/user/model/User;", "Lkotlin/ParameterName;", "name", "user", "", "error", "", "callback", "me", "(ZLkotlin/jvm/functions/Function2;)V", "Lcom/kakao/sdk/user/model/AccessTokenInfo;", "tokenInfo", "accessTokenInfo", "(Lkotlin/jvm/functions/Function2;)V", "", "", "properties", "Lkotlin/Function1;", "updateProfile", "(Ljava/util/Map;Lkotlin/jvm/functions/Function1;)V", "logout", "(Lkotlin/jvm/functions/Function1;)V", "unlink", "Ljava/util/Date;", "fromUpdateAt", "", "pageSize", "Lcom/kakao/sdk/user/model/UserShippingAddresses;", "userShippingAddresses", "shippingAddresses", "(Ljava/util/Date;Ljava/lang/Integer;Lkotlin/jvm/functions/Function2;)V", "", "addressId", "(JLkotlin/jvm/functions/Function2;)V", "Lcom/kakao/sdk/user/model/UserServiceTerms;", "userServiceTerms", "serviceTerms", "Companion", "user_release"}, k = 1, mv = {1, 4, 0})
public final class UserApiClient {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001R!\u0010\t\u001A\u00020\u00028FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001A\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/kakao/sdk/user/UserApiClient$Companion;", "", "Lcom/kakao/sdk/user/UserApiClient;", "instance$delegate", "Lkotlin/Lazy;", "getInstance", "()Lcom/kakao/sdk/user/UserApiClient;", "instance$annotations", "()V", "instance", "user_release"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        public static final KProperty[] a;

        static {
            Companion.a = new KProperty[]{Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Companion.class), "instance", "getInstance()Lcom/kakao/sdk/user/UserApiClient;"))};
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final UserApiClient getInstance() {
            Lazy lazy0 = UserApiClient.c;
            KProperty kProperty0 = Companion.a[0];
            return (UserApiClient)lazy0.getValue();
        }

        @JvmStatic
        public static void instance$annotations() {
        }
    }

    public static final Companion Companion;
    public final UserApi a;
    public final TokenManagerProvider b;
    public static final Lazy c;

    static {
        UserApiClient.Companion = new Companion(null);
        UserApiClient.c = c.lazy(a.y);
    }

    public UserApiClient() {
        this(null, null, 3, null);
    }

    public UserApiClient(@NotNull UserApi userApi0, @NotNull TokenManagerProvider tokenManagerProvider0) {
        Intrinsics.checkParameterIsNotNull(userApi0, "userApi");
        Intrinsics.checkParameterIsNotNull(tokenManagerProvider0, "tokenManagerProvider");
        super();
        this.a = userApi0;
        this.b = tokenManagerProvider0;
    }

    public UserApiClient(UserApi userApi0, TokenManagerProvider tokenManagerProvider0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            Object object0 = ApiFactoryKt.getKapiWithOAuth(ApiFactory.INSTANCE).create(UserApi.class);
            Intrinsics.checkExpressionValueIsNotNull(object0, "ApiFactory.kapiWithOAuth…eate(UserApi::class.java)");
            userApi0 = (UserApi)object0;
        }
        if((v & 2) != 0) {
            tokenManagerProvider0 = TokenManagerProvider.Companion.getInstance();
        }
        this(userApi0, tokenManagerProvider0);
    }

    public final void accessTokenInfo(@NotNull Function2 function20) {
        Intrinsics.checkParameterIsNotNull(function20, "callback");
        this.a.accessTokenInfo().enqueue(new ApiCallback() {
            public void onComplete(@Nullable AccessTokenInfo accessTokenInfo0, @Nullable Throwable throwable0) {
                this.a.invoke(accessTokenInfo0, throwable0);
            }

            @Override  // com.kakao.sdk.common.network.ApiCallback
            public void onComplete(Object object0, Throwable throwable0) {
                this.onComplete(((AccessTokenInfo)object0), throwable0);
            }
        });
    }

    @NotNull
    public static final UserApiClient getInstance() {
        return UserApiClient.Companion.getInstance();
    }

    public final void logout(@NotNull Function1 function10) {
        Intrinsics.checkParameterIsNotNull(function10, "callback");
        this.a.logout().enqueue(new ApiCallback() {
            @Override  // com.kakao.sdk.common.network.ApiCallback
            public void onComplete(Object object0, Throwable throwable0) {
                this.onComplete(((Unit)object0), throwable0);
            }

            public void onComplete(@Nullable Unit unit0, @Nullable Throwable throwable0) {
                function10.b.getManager().clear();
                this.b.invoke(throwable0);
            }
        });
    }

    @JvmOverloads
    public final void me(@NotNull Function2 function20) {
        UserApiClient.me$default(this, false, function20, 1, null);
    }

    @JvmOverloads
    public final void me(boolean z, @NotNull Function2 function20) {
        Intrinsics.checkParameterIsNotNull(function20, "callback");
        DefaultImpls.me$default(this.a, z, null, 2, null).enqueue(new ApiCallback() {
            public void onComplete(@Nullable User user0, @Nullable Throwable throwable0) {
                this.a.invoke(user0, throwable0);
            }

            @Override  // com.kakao.sdk.common.network.ApiCallback
            public void onComplete(Object object0, Throwable throwable0) {
                this.onComplete(((User)object0), throwable0);
            }
        });
    }

    public static void me$default(UserApiClient userApiClient0, boolean z, Function2 function20, int v, Object object0) {
        if((v & 1) != 0) {
            z = true;
        }
        userApiClient0.me(z, function20);
    }

    public final void serviceTerms(@NotNull Function2 function20) {
        Intrinsics.checkParameterIsNotNull(function20, "callback");
        this.a.serviceTerms().enqueue(new ApiCallback() {
            public void onComplete(@Nullable UserServiceTerms userServiceTerms0, @Nullable Throwable throwable0) {
                this.a.invoke(userServiceTerms0, throwable0);
            }

            @Override  // com.kakao.sdk.common.network.ApiCallback
            public void onComplete(Object object0, Throwable throwable0) {
                this.onComplete(((UserServiceTerms)object0), throwable0);
            }
        });
    }

    public final void shippingAddresses(long v, @NotNull Function2 function20) {
        Intrinsics.checkParameterIsNotNull(function20, "callback");
        DefaultImpls.shippingAddresses$default(this.a, v, null, null, 6, null).enqueue(new ApiCallback() {
            public void onComplete(@Nullable UserShippingAddresses userShippingAddresses0, @Nullable Throwable throwable0) {
                this.a.invoke(userShippingAddresses0, throwable0);
            }

            @Override  // com.kakao.sdk.common.network.ApiCallback
            public void onComplete(Object object0, Throwable throwable0) {
                this.onComplete(((UserShippingAddresses)object0), throwable0);
            }
        });
    }

    @JvmOverloads
    public final void shippingAddresses(@Nullable Date date0, @Nullable Integer integer0, @NotNull Function2 function20) {
        Intrinsics.checkParameterIsNotNull(function20, "callback");
        DefaultImpls.shippingAddresses$default(this.a, null, date0, integer0, 1, null).enqueue(new ApiCallback() {
            public void onComplete(@Nullable UserShippingAddresses userShippingAddresses0, @Nullable Throwable throwable0) {
                this.a.invoke(userShippingAddresses0, throwable0);
            }

            @Override  // com.kakao.sdk.common.network.ApiCallback
            public void onComplete(Object object0, Throwable throwable0) {
                this.onComplete(((UserShippingAddresses)object0), throwable0);
            }
        });
    }

    @JvmOverloads
    public final void shippingAddresses(@Nullable Date date0, @NotNull Function2 function20) {
        UserApiClient.shippingAddresses$default(this, date0, null, function20, 2, null);
    }

    @JvmOverloads
    public final void shippingAddresses(@NotNull Function2 function20) {
        UserApiClient.shippingAddresses$default(this, null, null, function20, 3, null);
    }

    public static void shippingAddresses$default(UserApiClient userApiClient0, Date date0, Integer integer0, Function2 function20, int v, Object object0) {
        if((v & 1) != 0) {
            date0 = null;
        }
        if((v & 2) != 0) {
            integer0 = null;
        }
        userApiClient0.shippingAddresses(date0, integer0, function20);
    }

    public final void unlink(@NotNull Function1 function10) {
        Intrinsics.checkParameterIsNotNull(function10, "callback");
        this.a.unlink().enqueue(new ApiCallback() {
            @Override  // com.kakao.sdk.common.network.ApiCallback
            public void onComplete(Object object0, Throwable throwable0) {
                this.onComplete(((Unit)object0), throwable0);
            }

            public void onComplete(@Nullable Unit unit0, @Nullable Throwable throwable0) {
                if(throwable0 == null) {
                    function10.b.getManager().clear();
                }
                this.b.invoke(throwable0);
            }
        });
    }

    public final void updateProfile(@NotNull Map map0, @NotNull Function1 function10) {
        Intrinsics.checkParameterIsNotNull(map0, "properties");
        Intrinsics.checkParameterIsNotNull(function10, "callback");
        this.a.updateProfile(map0).enqueue(new ApiCallback() {
            @Override  // com.kakao.sdk.common.network.ApiCallback
            public void onComplete(Object object0, Throwable throwable0) {
                this.onComplete(((Unit)object0), throwable0);
            }

            public void onComplete(@Nullable Unit unit0, @Nullable Throwable throwable0) {
                this.a.invoke(throwable0);
            }
        });
    }
}

