package u0;

import androidx.compose.foundation.interaction.PressInteraction.Press;
import androidx.compose.material.ripple.RippleAlpha;
import androidx.compose.material.ripple.RippleAnimation;
import androidx.compose.material.ripple.RippleAnimationKt;
import androidx.compose.material.ripple.RippleIndicationInstance;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import java.util.Map.Entry;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

public final class c extends RippleIndicationInstance implements RememberObserver {
    public final boolean c;
    public final float d;
    public final State e;
    public final State f;
    public final SnapshotStateMap g;
    public float h;

    public c(boolean z, float f, State state0, State state1) {
        super(z, state1);
        this.c = z;
        this.d = f;
        this.e = state0;
        this.f = state1;
        this.g = SnapshotStateKt.mutableStateMapOf();
        this.h = NaNf;
    }

    @Override  // androidx.compose.material.ripple.RippleIndicationInstance
    public final void addRipple(Press pressInteraction$Press0, CoroutineScope coroutineScope0) {
        SnapshotStateMap snapshotStateMap0 = this.g;
        for(Object object0: snapshotStateMap0.entrySet()) {
            ((RippleAnimation)((Map.Entry)object0).getValue()).finish();
        }
        RippleAnimation rippleAnimation0 = new RippleAnimation((this.c ? Offset.box-impl(pressInteraction$Press0.getPressPosition-F1C5BW0()) : null), this.h, this.c, null);
        snapshotStateMap0.put(pressInteraction$Press0, rippleAnimation0);
        BuildersKt.launch$default(coroutineScope0, null, null, new b(rippleAnimation0, this, pressInteraction$Press0, null), 3, null);
    }

    @Override  // androidx.compose.foundation.IndicationInstance
    public final void drawIndication(ContentDrawScope contentDrawScope0) {
        float f1;
        float f = this.d;
        if(Float.isNaN(f)) {
            long v = contentDrawScope0.getSize-NH-jbRc();
            f1 = RippleAnimationKt.getRippleEndRadius-cSwnlzA(contentDrawScope0, this.c, v);
        }
        else {
            f1 = contentDrawScope0.toPx-0680j_4(f);
        }
        this.h = f1;
        long v1 = ((Color)this.e.getValue()).unbox-impl();
        contentDrawScope0.drawContent();
        this.drawStateLayer-H2RKhps(contentDrawScope0, f, v1);
        for(Object object0: this.g.entrySet()) {
            RippleAnimation rippleAnimation0 = (RippleAnimation)((Map.Entry)object0).getValue();
            float f2 = ((RippleAlpha)this.f.getValue()).getPressedAlpha();
            if(f2 != 0.0f) {
                rippleAnimation0.draw-4WTKRHQ(contentDrawScope0, Color.copy-wmQWz5c$default(v1, f2, 0.0f, 0.0f, 0.0f, 14, null));
            }
        }
    }

    @Override  // androidx.compose.runtime.RememberObserver
    public final void onAbandoned() {
        this.g.clear();
    }

    @Override  // androidx.compose.runtime.RememberObserver
    public final void onForgotten() {
        this.g.clear();
    }

    @Override  // androidx.compose.runtime.RememberObserver
    public final void onRemembered() {
    }

    @Override  // androidx.compose.material.ripple.RippleIndicationInstance
    public final void removeRipple(Press pressInteraction$Press0) {
        RippleAnimation rippleAnimation0 = (RippleAnimation)this.g.get(pressInteraction$Press0);
        if(rippleAnimation0 != null) {
            rippleAnimation0.finish();
        }
    }
}

