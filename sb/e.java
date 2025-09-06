package sb;

import com.kakao.sdk.auth.AuthApiClient;
import com.kakao.sdk.auth.model.AccessTokenResponse;
import com.kakao.sdk.auth.model.AgtResponse;
import com.kakao.sdk.auth.model.OAuthToken.Companion;
import com.kakao.sdk.auth.model.OAuthToken;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.SingleTransformer;
import kotlin.jvm.internal.Intrinsics;

public final class e implements SingleTransformer {
    public final int a;
    public static final e b;
    public static final e c;

    static {
        e.b = new e(0);
        e.c = new e(1);
    }

    public e(int v) {
        this.a = v;
        super();
    }

    @Override  // io.reactivex.SingleTransformer
    public final SingleSource apply(Single single0) {
        if(this.a != 0) {
            Intrinsics.checkParameterIsNotNull(single0, "it");
            return single0.doOnError(d.d).doOnSuccess(d.e);
        }
        Intrinsics.checkParameterIsNotNull(single0, "it");
        return single0.onErrorResumeNext((Object object0) -> switch(this.a) {
            case 0: {
                Intrinsics.checkParameterIsNotNull(((AgtResponse)object0), "it");
                return ((AgtResponse)object0).getAgt();
            }
            case 1: {
                Intrinsics.checkParameterIsNotNull(((Throwable)object0), "it");
                return Single.error(AuthApiClient.Companion.translateError(((Throwable)object0)));
            }
            default: {
                Intrinsics.checkParameterIsNotNull(((AccessTokenResponse)object0), "it");
                return Companion.fromResponse$default(OAuthToken.Companion, ((AccessTokenResponse)object0), null, 2, null);
            }
        }).doOnError(d.b).doOnSuccess(d.c);
    }
}

