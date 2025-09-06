package sb;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.ResultReceiver;
import com.kakao.sdk.auth.RxAuthCodeClient;
import com.kakao.sdk.auth.UriUtility;
import com.kakao.sdk.auth.model.AuthType;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class g implements SingleOnSubscribe {
    public final RxAuthCodeClient a;
    public final String b;
    public final List c;
    public final List d;
    public final List e;
    public final AuthType f;
    public final Context g;

    public g(RxAuthCodeClient rxAuthCodeClient0, String s, List list0, List list1, List list2, AuthType authType0, Context context0) {
        this.a = rxAuthCodeClient0;
        this.b = s;
        this.c = list0;
        this.d = list1;
        this.e = list2;
        this.f = authType0;
        this.g = context0;
    }

    @Override  // io.reactivex.SingleOnSubscribe
    public final void subscribe(SingleEmitter singleEmitter0) {
        Intrinsics.checkParameterIsNotNull(singleEmitter0, "emitter");
        String s = this.a.c.getAppKey();
        String s1 = "kakao" + s + "://oauth";
        String s2 = this.a.d.getKaHeader();
        Uri uri0 = new UriUtility(null, 1, null).authorizeUri(s, this.b, s1, this.c, s2, this.d, this.e, this.f);
        try {
            ResultReceiver resultReceiver0 = this.a.resultReceiver$auth_rx_release(singleEmitter0);
            Intent intent0 = this.a.authCodeIntent$auth_rx_release(this.g, uri0, s1, resultReceiver0);
            this.g.startActivity(intent0);
        }
        catch(Throwable throwable0) {
            singleEmitter0.onError(throwable0);
        }
    }
}

