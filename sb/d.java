package sb;

import com.kakao.sdk.common.util.SdkLog.Companion;
import com.kakao.sdk.common.util.SdkLog;
import io.reactivex.functions.Consumer;
import kotlin.jvm.internal.Intrinsics;

public final class d implements Consumer {
    public final int a;
    public static final d b;
    public static final d c;
    public static final d d;
    public static final d e;

    static {
        d.b = new d(0);
        d.c = new d(1);
        d.d = new d(2);
        d.e = new d(3);
    }

    public d(int v) {
        this.a = v;
        super();
    }

    @Override  // io.reactivex.functions.Consumer
    public final void accept(Object object0) {
        switch(this.a) {
            case 0: {
                Intrinsics.checkExpressionValueIsNotNull(((Throwable)object0), "it");
                SdkLog.Companion.e(((Throwable)object0));
                return;
            }
            case 1: {
                Companion sdkLog$Companion1 = SdkLog.Companion;
                if(object0 == null) {
                    Intrinsics.throwNpe();
                }
                sdkLog$Companion1.i(object0);
                return;
            }
            case 2: {
                Intrinsics.checkExpressionValueIsNotNull(((Throwable)object0), "it");
                SdkLog.Companion.e(((Throwable)object0));
                return;
            }
            default: {
                Companion sdkLog$Companion0 = SdkLog.Companion;
                if(object0 == null) {
                    Intrinsics.throwNpe();
                }
                sdkLog$Companion0.i(object0);
            }
        }
    }
}

