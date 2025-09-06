package ub;

import com.kakao.sdk.common.util.SdkLog.Companion;
import com.kakao.sdk.common.util.SdkLog;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.CompletableTransformer;
import kotlin.jvm.internal.Intrinsics;

public final class g implements CompletableTransformer {
    public static final g a;

    static {
        g.a = new g();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override  // io.reactivex.CompletableTransformer
    public final CompletableSource apply(Completable completable0) {
        Intrinsics.checkParameterIsNotNull(completable0, "it");
        return completable0.onErrorResumeNext(c.c).doOnError((Object object0) -> switch(this.a) {
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
        }).doOnComplete(f.a);
    }
}

