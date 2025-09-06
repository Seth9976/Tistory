package ub;

import com.kakao.sdk.common.network.ApiFactory.loggingInterceptor.2.interceptor.1;
import com.kakao.sdk.common.network.ApiFactory;
import com.kakao.sdk.common.network.AppKeyInterceptor;
import com.kakao.sdk.common.network.KakaoAgentInterceptor;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import okhttp3.OkHttpClient.Builder;
import okhttp3.logging.HttpLoggingInterceptor.Level;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

public final class a extends Lambda implements Function0 {
    public static final a A;
    public final int w;
    public static final a x;
    public static final a y;
    public static final a z;

    static {
        a.x = new a(0, 0);
        a.y = new a(0, 1);
        a.z = new a(0, 2);
        a.A = new a(0, 3);
    }

    public a(int v, int v1) {
        this.w = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch(this.w) {
            case 0: {
                Builder okHttpClient$Builder1 = new Builder().addInterceptor(new KakaoAgentInterceptor(null, 1, null)).addInterceptor(new AppKeyInterceptor(null, 1, null)).addInterceptor(ApiFactory.INSTANCE.getLoggingInterceptor());
                Intrinsics.checkExpressionValueIsNotNull(okHttpClient$Builder1, "OkHttpClient.Builder()\n …eptor(loggingInterceptor)");
                return ApiFactory.withClientAndAdapter$default(ApiFactory.INSTANCE, "https://kapi.kakao.com", okHttpClient$Builder1, null, 4, null);
            }
            case 1: {
                HttpLoggingInterceptor httpLoggingInterceptor0 = new HttpLoggingInterceptor(new ApiFactory.loggingInterceptor.2.interceptor.1());  // 初始化器: Ljava/lang/Object;-><init>()V
                httpLoggingInterceptor0.setLevel(Level.HEADERS);
                return httpLoggingInterceptor0;
            }
            case 2: {
                HttpLoggingInterceptor httpLoggingInterceptor1 = new HttpLoggingInterceptor(b.b);
                httpLoggingInterceptor1.setLevel(Level.HEADERS);
                return httpLoggingInterceptor1;
            }
            default: {
                Builder okHttpClient$Builder0 = new Builder().addInterceptor(new KakaoAgentInterceptor(null, 1, null)).addInterceptor(new AppKeyInterceptor(null, 1, null)).addInterceptor(ApiFactory.INSTANCE.getLoggingInterceptor());
                Intrinsics.checkExpressionValueIsNotNull(okHttpClient$Builder0, "OkHttpClient.Builder()\n …ctory.loggingInterceptor)");
                RxJava2CallAdapterFactory rxJava2CallAdapterFactory0 = RxJava2CallAdapterFactory.create();
                return ApiFactory.INSTANCE.withClientAndAdapter("https://kapi.kakao.com", okHttpClient$Builder0, rxJava2CallAdapterFactory0);
            }
        }
    }
}

