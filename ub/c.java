package ub;

import com.kakao.sdk.common.network.ApiCallback;
import io.reactivex.Completable;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import kotlin.jvm.internal.Intrinsics;

public final class c implements Function {
    public final int a;
    public static final c b;
    public static final c c;

    static {
        c.b = new c(0);
        c.c = new c(1);
    }

    public c(int v) {
        this.a = v;
        super();
    }

    @Override  // io.reactivex.functions.Function
    public final Object apply(Object object0) {
        if(this.a != 0) {
            Intrinsics.checkParameterIsNotNull(((Throwable)object0), "it");
            return Completable.error(ApiCallback.Companion.translateError(((Throwable)object0)));
        }
        Intrinsics.checkParameterIsNotNull(((Throwable)object0), "it");
        return Single.error(ApiCallback.Companion.translateError(((Throwable)object0)));
    }
}

