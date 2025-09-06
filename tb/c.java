package tb;

import cd.b;
import com.kakao.sdk.auth.network.RxAuthOperations;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.CompletableTransformer;
import kotlin.jvm.internal.Intrinsics;

public final class c implements CompletableTransformer {
    public final RxAuthOperations a;

    public c(RxAuthOperations rxAuthOperations0) {
        this.a = rxAuthOperations0;
    }

    @Override  // io.reactivex.CompletableTransformer
    public final CompletableSource apply(Completable completable0) {
        Intrinsics.checkParameterIsNotNull(completable0, "it");
        return completable0.retryWhen(new b(this, 19));
    }
}

