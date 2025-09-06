package ub;

import com.kakao.sdk.common.util.SdkLog.Companion;
import com.kakao.sdk.common.util.SdkLog;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.SingleTransformer;
import kotlin.jvm.internal.Intrinsics;

public final class e implements SingleTransformer {
    public static final e a;

    static {
        e.a = new e();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override  // io.reactivex.SingleTransformer
    public final SingleSource apply(Single single0) {
        Intrinsics.checkParameterIsNotNull(single0, "it");
        return single0.onErrorResumeNext(c.b).doOnError((Object object0) -> switch(this.a) {
            case 0: {
                Intrinsics.checkExpressionValueIsNotNull(((Throwable)object0), "it");
                SdkLog.Companion.e(((Throwable)object0));
                return;
            }
            case 1: {
                Companion sdkLog$Companion0 = SdkLog.Companion;
                if(object0 == null) {
                    Intrinsics.throwNpe();
                }
                sdkLog$Companion0.i(object0);
                return;
            }
            default: {
                Intrinsics.checkExpressionValueIsNotNull(((Throwable)object0), "it");
                SdkLog.Companion.e(((Throwable)object0));
            }
        }).doOnSuccess((Object object0) -> switch(this.a) {
            case 0: {
                Intrinsics.checkExpressionValueIsNotNull(((Throwable)object0), "it");
                SdkLog.Companion.e(((Throwable)object0));
                return;
            }
            case 1: {
                Companion sdkLog$Companion0 = SdkLog.Companion;
                if(object0 == null) {
                    Intrinsics.throwNpe();
                }
                sdkLog$Companion0.i(object0);
                return;
            }
            default: {
                Intrinsics.checkExpressionValueIsNotNull(((Throwable)object0), "it");
                SdkLog.Companion.e(((Throwable)object0));
            }
        });
    }
}

