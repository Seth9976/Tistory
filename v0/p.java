package v0;

import androidx.compose.material3.carousel.Arrangement;
import androidx.compose.material3.carousel.KeylineListScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class p extends Lambda implements Function1 {
    public final float w;
    public final Arrangement x;
    public final float y;

    public p(float f, Arrangement arrangement0, float f1) {
        this.w = f;
        this.x = arrangement0;
        this.y = f1;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        ((KeylineListScope)object0).add(this.w, true);
        Arrangement arrangement0 = this.x;
        int v = arrangement0.getLargeCount();
        for(int v1 = 0; v1 < v; ++v1) {
            KeylineListScope.add$default(((KeylineListScope)object0), arrangement0.getLargeSize(), false, 2, null);
        }
        int v2 = arrangement0.getMediumCount();
        for(int v3 = 0; v3 < v2; ++v3) {
            KeylineListScope.add$default(((KeylineListScope)object0), arrangement0.getMediumSize(), false, 2, null);
        }
        int v4 = arrangement0.getSmallCount();
        for(int v5 = 0; v5 < v4; ++v5) {
            KeylineListScope.add$default(((KeylineListScope)object0), arrangement0.getSmallSize(), false, 2, null);
        }
        ((KeylineListScope)object0).add(this.y, true);
        return Unit.INSTANCE;
    }
}

