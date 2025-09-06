package sb;

import com.kakao.sdk.auth.RxAuthApiClient;
import com.kakao.sdk.auth.TokenManageable;
import com.kakao.sdk.auth.model.OAuthToken;
import io.reactivex.functions.Consumer;
import kotlin.jvm.internal.Intrinsics;

public final class f implements Consumer {
    public final int a;
    public final RxAuthApiClient b;

    public f(RxAuthApiClient rxAuthApiClient0, int v) {
        this.a = v;
        this.b = rxAuthApiClient0;
        super();
    }

    @Override  // io.reactivex.functions.Consumer
    public final void accept(Object object0) {
        if(this.a != 0) {
            TokenManageable tokenManageable0 = this.b.b.getManager();
            Intrinsics.checkExpressionValueIsNotNull(((OAuthToken)object0), "it");
            tokenManageable0.setToken(((OAuthToken)object0));
            return;
        }
        TokenManageable tokenManageable1 = this.b.b.getManager();
        Intrinsics.checkExpressionValueIsNotNull(((OAuthToken)object0), "it");
        tokenManageable1.setToken(((OAuthToken)object0));
    }
}

