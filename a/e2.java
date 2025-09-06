package a;

import b.k;
import com.kakao.kandinsky.b;
import com.kakao.kdtracker.KDTracker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class e2 extends Lambda implements Function0 {
    public final b a;
    public final boolean b;

    public e2(b b0, boolean z) {
        this.a = b0;
        this.b = z;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        KDTracker.clickEvent$default(KDTracker.INSTANCE, "header", "complete", null, null, 12, null);
        k k0 = new k(this.b);
        this.a.sendIntent(k0);
        return Unit.INSTANCE;
    }
}

