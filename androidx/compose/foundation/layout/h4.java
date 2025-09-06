package androidx.compose.foundation.layout;

import android.graphics.Insets;
import android.view.WindowInsetsAnimationController;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.FloatRef;
import kotlinx.coroutines.Job;

public final class h4 extends Lambda implements Function2 {
    public final WindowInsetsAnimationController A;
    public final boolean B;
    public final int w;
    public final int x;
    public final n4 y;
    public final FloatRef z;

    public h4(int v, int v1, n4 n40, FloatRef ref$FloatRef0, WindowInsetsAnimationController windowInsetsAnimationController0, boolean z) {
        this.w = v;
        this.x = v1;
        this.y = n40;
        this.z = ref$FloatRef0;
        this.A = windowInsetsAnimationController0;
        this.B = z;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        float f = ((Number)object0).floatValue();
        float f1 = ((Number)object1).floatValue();
        n4 n40 = this.y;
        if(Float.compare(f, this.x) > 0 || ((float)this.w) > f) {
            this.z.element = f1;
            this.A.finish(this.B);
            n40.e = null;
            Job job0 = n40.i;
            if(job0 != null) {
                job0.cancel(new b4(0));
            }
        }
        else {
            WindowInsetsAnimationController windowInsetsAnimationController0 = n40.e;
            if(windowInsetsAnimationController0 != null) {
                Insets insets0 = windowInsetsAnimationController0.getCurrentInsets();
                e4.p(windowInsetsAnimationController0, n40.c.adjustInsets(insets0, Math.round(f)));
                return Unit.INSTANCE;
            }
        }
        return Unit.INSTANCE;
    }
}

