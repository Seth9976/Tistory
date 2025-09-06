package q2;

import androidx.compose.animation.core.Animation;
import androidx.compose.ui.tooling.animation.clock.Utils_androidKt;
import java.util.LinkedHashMap;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class c extends Lambda implements Function0 {
    public final Animation w;
    public final long x;
    public final long y;
    public final Lazy z;

    public c(Animation animation0, long v, long v1, Lazy lazy0) {
        this.w = animation0;
        this.x = v;
        this.y = v1;
        this.z = lazy0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        Long long0 = Utils_androidKt.access$createTransitionInfo$lambda$1(this.z);
        long v = Utils_androidKt.millisToNanos(Utils_androidKt.access$createTransitionInfo$lambda$1(this.z));
        Animation animation0 = this.w;
        linkedHashMap0.put(long0, animation0.getValueFromNanos(v));
        long v1 = this.x;
        linkedHashMap0.put(v1, animation0.getValueFromNanos(v1 * 1000000L));
        for(long v2 = Utils_androidKt.access$createTransitionInfo$lambda$1(this.z); v2 <= v1; v2 += this.y) {
            linkedHashMap0.put(v2, animation0.getValueFromNanos(v2 * 1000000L));
        }
        return linkedHashMap0;
    }
}

