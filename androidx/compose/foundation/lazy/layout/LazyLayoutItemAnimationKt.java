package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.ui.unit.IntOffset;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class LazyLayoutItemAnimationKt {
    public static final SpringSpec a;

    static {
        LazyLayoutItemAnimationKt.a = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.box-impl(0x100000001L), 1, null);
    }
}

