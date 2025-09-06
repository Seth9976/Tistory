package sb;

import androidx.compose.foundation.text.selection.b1;
import com.kakao.sdk.auth.AuthApiClient;
import com.kakao.sdk.auth.LoginClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class b extends Lambda implements Function2 {
    public final int w;
    public final LoginClient x;
    public final Function2 y;

    public b(LoginClient loginClient0, Function2 function20, int v) {
        this.w = v;
        this.x = loginClient0;
        this.y = function20;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        if(this.w != 0) {
            if(((Throwable)object1) != null) {
                this.y.invoke(null, ((Throwable)object1));
                return Unit.INSTANCE;
            }
            AuthApiClient authApiClient0 = this.x.a;
            if(((String)object0) == null) {
                Intrinsics.throwNpe();
            }
            authApiClient0.issueAccessToken(((String)object0), new b1(this, 17));
            return Unit.INSTANCE;
        }
        if(((Throwable)object1) != null) {
            this.y.invoke(null, ((Throwable)object1));
            return Unit.INSTANCE;
        }
        AuthApiClient authApiClient1 = this.x.a;
        if(((String)object0) == null) {
            Intrinsics.throwNpe();
        }
        authApiClient1.issueAccessToken(((String)object0), new b1(this, 16));
        return Unit.INSTANCE;
    }
}

