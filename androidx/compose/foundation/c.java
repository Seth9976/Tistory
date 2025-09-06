package androidx.compose.foundation;

import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class c extends Lambda implements Function3 {
    public final boolean A;
    public final ScrollState w;
    public final boolean x;
    public final FlingBehavior y;
    public final boolean z;

    public c(ScrollState scrollState0, boolean z, FlingBehavior flingBehavior0, boolean z1, boolean z2) {
        this.w = scrollState0;
        this.x = z;
        this.y = flingBehavior0;
        this.z = z1;
        this.A = z2;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        Modifier modifier0 = (Modifier)object0;
        int v = ((Number)object2).intValue();
        ((Composer)object1).startReplaceGroup(1478351300);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1478351300, v, -1, "androidx.compose.foundation.scroll.<anonymous> (Scroll.kt:276)");
        }
        Modifier modifier1 = ScrollingContainerKt.scrollingContainer(new ScrollSemanticsElement(this.w, this.x, this.y, this.z, this.A), this.w, (this.A ? Orientation.Vertical : Orientation.Horizontal), this.z, this.x, this.y, this.w.getInternalInteractionSource$foundation_release(), null, ((Composer)object1), 0, 0x40).then(new ScrollingLayoutElement(this.w, this.x, this.A));
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ((Composer)object1).endReplaceGroup();
        return modifier1;
    }
}

