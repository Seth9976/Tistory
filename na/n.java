package na;

import androidx.compose.animation.core.AnimationVector3D;
import kotlin.Triple;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class n extends Lambda implements Function1 {
    public final int w;
    public static final n x;
    public static final n y;

    static {
        n.x = new n(1, 0);
        n.y = new n(1, 1);
    }

    public n(int v, int v1) {
        this.w = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(this.w != 0) {
            Intrinsics.checkNotNullParameter(((AnimationVector3D)object0), "it");
            return new Triple(((AnimationVector3D)object0).getV1(), ((AnimationVector3D)object0).getV2(), ((AnimationVector3D)object0).getV3());
        }
        Intrinsics.checkNotNullParameter(((Triple)object0), "it");
        return new AnimationVector3D(((Number)((Triple)object0).getFirst()).floatValue(), ((Number)((Triple)object0).getSecond()).floatValue(), ((Number)((Triple)object0).getThird()).floatValue());
    }
}

