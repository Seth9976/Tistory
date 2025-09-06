package ac;

import com.kakao.tistory.data.utils.AESUtils;
import com.kakao.tistory.domain.entity.AdInfo;
import com.kakao.tistory.presentation.common.utils.DeviceUtilsKt;
import javax.inject.Provider;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor.Chain;
import okhttp3.Interceptor;
import okhttp3.Request.Builder;
import okhttp3.Response;

public final class c implements Interceptor {
    public final Provider a;
    public final Provider b;

    public c(Provider provider0, Provider provider1) {
        this.a = provider0;
        this.b = provider1;
    }

    @Override  // okhttp3.Interceptor
    public final Response intercept(Chain interceptor$Chain0) {
        Provider provider0 = this.a;
        Intrinsics.checkNotNullParameter(provider0, "$accessToken");
        Provider provider1 = this.b;
        Intrinsics.checkNotNullParameter(provider1, "$adInfo");
        Intrinsics.checkNotNullParameter(interceptor$Chain0, "chain");
        Builder request$Builder0 = interceptor$Chain0.request().newBuilder();
        request$Builder0.addHeader("User-Agent", "Tistory/3.0.8_3080;Android/Dalvik/2.1.0 (Linux; U; Android 13; Pixel 4a Build/TQ2A.230405.003)");
        request$Builder0.addHeader("Accept-Language", DeviceUtilsKt.getLanguage());
        String s = new AESUtils("TISTORY_APP_2019TISTORY_APP_2019", null, null, 6, null).encrypt("1757117457990");
        if(s != null) {
            request$Builder0.addHeader("Tistory-AppKey", s);
        }
        request$Builder0.addHeader("Tistory-Version", "3.0.8_3080");
        String s1 = (String)provider0.get();
        if(s1 != null) {
            request$Builder0.addHeader("Tistory-Token", s1);
        }
        AdInfo adInfo0 = (AdInfo)provider1.get();
        if(adInfo0 != null) {
            request$Builder0.addHeader("Tistory-ADID", adInfo0.getId());
            request$Builder0.addHeader("Tistory-ADID-Enabled", String.valueOf(!adInfo0.isLimitAdTrackingEnabled()));
        }
        request$Builder0.addHeader("Tistory-TZOffset", "28800000");
        return interceptor$Chain0.proceed(request$Builder0.build());
    }
}

