package vb;

import com.kakao.sdk.common.util.IntentResolveClient;
import com.kakao.sdk.common.util.SdkLog;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class a extends Lambda implements Function0 {
    public static final a A;
    public final int w;
    public static final a x;
    public static final a y;
    public static final a z;

    static {
        a.x = new a(0, 0);
        a.y = new a(0, 1);
        a.z = new a(0, 2);
        a.A = new a(0, 3);
    }

    public a(int v, int v1) {
        this.w = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch(this.w) {
            case 0: {
                return new IntentResolveClient();
            }
            case 1: {
                return new SdkLog(false, 1, null);
            }
            case 2: {
                return new SimpleDateFormat("MM-dd HH:mm:ss.SSS");
            }
            default: {
                return new LinkedList();
            }
        }
    }
}

