package a;

import b.b0;
import com.kakao.kdtracker.KDTracker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class x0 extends Lambda implements Function0 {
    public final b0 a;

    public x0(b0 b00) {
        this.a = b00;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        KDTracker.clickEvent$default(KDTracker.INSTANCE, "header", "cancel", null, null, 12, null);
        this.a.n.invoke();
        return Unit.INSTANCE;
    }
}

