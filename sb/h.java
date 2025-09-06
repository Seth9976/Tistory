package sb;

import com.kakao.sdk.auth.RxLoginClient;
import io.reactivex.functions.Function;
import kotlin.jvm.internal.Intrinsics;

public final class h implements Function {
    public final int a;
    public final RxLoginClient b;

    public h(RxLoginClient rxLoginClient0, int v) {
        this.a = v;
        this.b = rxLoginClient0;
        super();
    }

    @Override  // io.reactivex.functions.Function
    public final Object apply(Object object0) {
        switch(this.a) {
            case 0: {
                Intrinsics.checkParameterIsNotNull(((String)object0), "it");
                return this.b.a.issueAccessToken(((String)object0));
            }
            case 1: {
                Intrinsics.checkParameterIsNotNull(((String)object0), "it");
                return this.b.a.issueAccessToken(((String)object0));
            }
            default: {
                Intrinsics.checkParameterIsNotNull(((String)object0), "it");
                return this.b.a.issueAccessToken(((String)object0));
            }
        }
    }
}

