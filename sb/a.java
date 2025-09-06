package sb;

import com.kakao.sdk.auth.AuthApiClient;
import com.kakao.sdk.auth.AuthApiClientKt;
import com.kakao.sdk.auth.AuthCodeClient;
import com.kakao.sdk.auth.AuthCodeClientKt;
import com.kakao.sdk.auth.LoginClient;
import com.kakao.sdk.auth.LoginClientKt;
import com.kakao.sdk.auth.RxAuthApiClient;
import com.kakao.sdk.auth.RxAuthCodeClient;
import com.kakao.sdk.auth.RxLoginClient;
import com.kakao.sdk.auth.TokenManager;
import com.kakao.sdk.auth.TokenManagerProvider;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class a extends Lambda implements Function0 {
    public static final a A;
    public static final a B;
    public static final a C;
    public static final a D;
    public static final a E;
    public static final a F;
    public static final a G;
    public static final a H;
    public final int w;
    public static final a x;
    public static final a y;
    public static final a z;

    static {
        a.x = new a(0, 0);
        a.y = new a(0, 1);
        a.z = new a(0, 2);
        a.A = new a(0, 3);
        a.B = new a(0, 4);
        a.C = new a(0, 5);
        a.D = new a(0, 6);
        a.E = new a(0, 7);
        a.F = new a(0, 8);
        a.G = new a(0, 9);
        a.H = new a(0, 10);
    }

    public a(int v, int v1) {
        this.w = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch(this.w) {
            case 0: {
                return new AuthApiClient(null, null, null, null, 15, null);
            }
            case 1: {
                return new RxAuthApiClient(null, null, null, null, 15, null);
            }
            case 2: {
                return new AuthCodeClient(null, null, null, 7, null);
            }
            case 3: {
                return new RxAuthCodeClient(null, null, null, 7, null);
            }
            case 4: {
                return new LoginClient(null, null, 3, null);
            }
            case 5: {
                return new RxLoginClient(null, null, 3, null);
            }
            case 6: {
                return AuthApiClientKt.getRx(AuthApiClient.Companion);
            }
            case 7: {
                return AuthCodeClientKt.getRx(AuthCodeClient.Companion);
            }
            case 8: {
                return LoginClientKt.getRx(LoginClient.Companion);
            }
            case 9: {
                return new TokenManager(null, null, 3, null);
            }
            default: {
                return new TokenManagerProvider(null, 1, null);
            }
        }
    }
}

