package ub;

import com.kakao.sdk.common.util.KakaoJson;
import com.kakao.sdk.common.util.SdkLog;
import com.kakao.sdk.common.util.Utility;
import java.util.Date;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.logging.HttpLoggingInterceptor.Logger;
import retrofit2.Converter;

public final class b implements Logger, Converter {
    public final int a;
    public static final b b;
    public static final b c;
    public static final b d;
    public static final b e;
    public static final b f;

    static {
        b.b = new b(0);
        b.c = new b(1);
        b.d = new b(2);
        b.e = new b(3);
        b.f = new b(4);
    }

    public b(int v) {
        this.a = v;
        super();
    }

    @Override  // retrofit2.Converter
    public Object convert(Object object0) {
        switch(this.a) {
            case 1: {
                Intrinsics.checkParameterIsNotNull(((Enum)object0), "enum");
                String s = KakaoJson.INSTANCE.toJson(((Enum)object0));
                String s1 = s.substring(1, s.length() - 1);
                Intrinsics.checkExpressionValueIsNotNull(s1, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                return s1;
            }
            case 2: {
                Intrinsics.checkParameterIsNotNull(((Date)object0), "value");
                return String.valueOf(((Date)object0).getTime() / 1000L);
            }
            case 3: {
                Intrinsics.checkParameterIsNotNull(((Map)object0), "map");
                return Utility.INSTANCE.buildQuery(((Map)object0));
            }
            default: {
                Intrinsics.checkParameterIsNotNull(object0, "value");
                return KakaoJson.INSTANCE.toJson(object0);
            }
        }
    }

    @Override  // okhttp3.logging.HttpLoggingInterceptor$Logger
    public void log(String s) {
        Intrinsics.checkExpressionValueIsNotNull(s, "it");
        SdkLog.Companion.i(s);
    }
}

