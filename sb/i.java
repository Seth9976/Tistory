package sb;

import android.content.Context;
import com.kakao.sdk.auth.RxAuthCodeClient;
import com.kakao.sdk.auth.RxLoginClient;
import io.reactivex.functions.Function;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class i implements Function {
    public final RxLoginClient a;
    public final Context b;
    public final List c;

    public i(RxLoginClient rxLoginClient0, Context context0, List list0) {
        this.a = rxLoginClient0;
        this.b = context0;
        this.c = list0;
    }

    @Override  // io.reactivex.functions.Function
    public final Object apply(Object object0) {
        Intrinsics.checkParameterIsNotNull(((String)object0), "it");
        return RxAuthCodeClient.authorizeWithKakaoAccount$default(this.a.b, this.b, null, this.c, ((String)object0), null, null, 50, null);
    }
}

