package xb;

import com.kakao.sdk.user.RxUserApiClient;
import com.kakao.sdk.user.UserApiClient;
import com.kakao.sdk.user.UserApiClientKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class a extends Lambda implements Function0 {
    public final int w;
    public static final a x;
    public static final a y;
    public static final a z;

    static {
        a.x = new a(0, 0);
        a.y = new a(0, 1);
        a.z = new a(0, 2);
    }

    public a(int v, int v1) {
        this.w = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch(this.w) {
            case 0: {
                return UserApiClientKt.getRx(UserApiClient.Companion);
            }
            case 1: {
                return new UserApiClient(null, null, 3, null);
            }
            default: {
                return new RxUserApiClient(null, null, null, 7, null);
            }
        }
    }
}

