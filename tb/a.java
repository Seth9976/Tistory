package tb;

import com.kakao.sdk.auth.network.AccessTokenInterceptor;
import com.kakao.sdk.auth.network.RequiredScopesInterceptor;
import com.kakao.sdk.auth.network.RxAccessTokenInterceptor;
import com.kakao.sdk.auth.network.RxAuthOperations;
import com.kakao.sdk.common.network.ApiFactory;
import com.kakao.sdk.common.network.AppKeyInterceptor;
import com.kakao.sdk.common.network.KakaoAgentInterceptor;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import okhttp3.OkHttpClient.Builder;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

public final class a extends Lambda implements Function0 {
    public static final a A;
    public static final a B;
    public final int w;
    public static final a x;
    public static final a y;
    public static final a z;

    static {
        a.x = new a(0, 0);
        a.y = new a(0, 1);
        a.z = new a(0, 2);
        a.A = new a(0, 3);
        a.B = new a(0, 4);
    }

    public a(int v, int v1) {
        this.w = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch(this.w) {
            case 0: {
                Builder okHttpClient$Builder0 = new Builder().addInterceptor(new KakaoAgentInterceptor(null, 1, null)).addInterceptor(new AccessTokenInterceptor(null, null, 3, null)).addInterceptor(new RequiredScopesInterceptor(null, 1, null)).addInterceptor(ApiFactory.INSTANCE.getLoggingInterceptor());
                Intrinsics.checkExpressionValueIsNotNull(okHttpClient$Builder0, "OkHttpClient.Builder()\n …ctory.loggingInterceptor)");
                return ApiFactory.withClientAndAdapter$default(ApiFactory.INSTANCE, "https://kapi.kakao.com", okHttpClient$Builder0, null, 4, null);
            }
            case 1: {
                Builder okHttpClient$Builder1 = new Builder().addInterceptor(new KakaoAgentInterceptor(null, 1, null)).addInterceptor(new AppKeyInterceptor(null, 1, null)).addInterceptor(ApiFactory.INSTANCE.getLoggingInterceptor());
                Intrinsics.checkExpressionValueIsNotNull(okHttpClient$Builder1, "OkHttpClient.Builder()\n …ctory.loggingInterceptor)");
                return ApiFactory.withClientAndAdapter$default(ApiFactory.INSTANCE, "https://kauth.kakao.com", okHttpClient$Builder1, null, 4, null);
            }
            case 2: {
                Builder okHttpClient$Builder2 = new Builder().addInterceptor(new KakaoAgentInterceptor(null, 1, null)).addInterceptor(new RxAccessTokenInterceptor(null, 1, null)).addInterceptor(ApiFactory.INSTANCE.getLoggingInterceptor());
                Intrinsics.checkExpressionValueIsNotNull(okHttpClient$Builder2, "OkHttpClient.Builder()\n …ctory.loggingInterceptor)");
                RxJava2CallAdapterFactory rxJava2CallAdapterFactory0 = RxJava2CallAdapterFactory.create();
                return ApiFactory.INSTANCE.withClientAndAdapter("https://kapi.kakao.com", okHttpClient$Builder2, rxJava2CallAdapterFactory0);
            }
            case 3: {
                Builder okHttpClient$Builder3 = new Builder().addInterceptor(new KakaoAgentInterceptor(null, 1, null)).addInterceptor(new AppKeyInterceptor(null, 1, null)).addInterceptor(ApiFactory.INSTANCE.getLoggingInterceptor());
                Intrinsics.checkExpressionValueIsNotNull(okHttpClient$Builder3, "OkHttpClient.Builder()\n …ctory.loggingInterceptor)");
                RxJava2CallAdapterFactory rxJava2CallAdapterFactory1 = RxJava2CallAdapterFactory.create();
                return ApiFactory.INSTANCE.withClientAndAdapter("https://kauth.kakao.com", okHttpClient$Builder3, rxJava2CallAdapterFactory1);
            }
            default: {
                return new RxAuthOperations(null, null, null, 7, null);
            }
        }
    }
}

