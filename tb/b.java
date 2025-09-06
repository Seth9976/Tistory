package tb;

import com.kakao.sdk.auth.network.RxAuthOperations;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.SingleTransformer;
import kotlin.jvm.internal.Intrinsics;

public final class b implements SingleTransformer {
    public final RxAuthOperations a;

    public b(RxAuthOperations rxAuthOperations0) {
        this.a = rxAuthOperations0;
    }

    @Override  // io.reactivex.SingleTransformer
    public final SingleSource apply(Single single0) {
        Intrinsics.checkParameterIsNotNull(single0, "it");
        return single0.retryWhen(new cd.b(this, 18));
    }
}

