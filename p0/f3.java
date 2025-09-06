package p0;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.material.RadioButtonColors;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import wb.a;

public final class f3 implements RadioButtonColors {
    public final long a;
    public final long b;
    public final long c;

    public f3(long v, long v1, long v2) {
        this.a = v;
        this.b = v1;
        this.c = v2;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            if(f3.class != class0 || !Color.equals-impl0(this.a, ((f3)object0).a)) {
                return false;
            }
            return Color.equals-impl0(this.b, ((f3)object0).b) ? Color.equals-impl0(this.c, ((f3)object0).c) : false;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return Color.hashCode-impl(this.c) + a.a(this.b, Color.hashCode-impl(this.a) * 0x1F, 0x1F);
    }

    @Override  // androidx.compose.material.RadioButtonColors
    public final State radioColor(boolean z, boolean z1, Composer composer0, int v) {
        State state0;
        long v1;
        composer0.startReplaceableGroup(0x4A1D1C8A);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x4A1D1C8A, v, -1, "androidx.compose.material.DefaultRadioButtonColors.radioColor (RadioButton.kt:187)");
        }
        if(z) {
            v1 = z1 ? this.a : this.b;
        }
        else {
            v1 = this.c;
        }
        if(z) {
            composer0.startReplaceableGroup(0xC13F8F7D);
            state0 = SingleValueAnimationKt.animateColorAsState-euL9pac(v1, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composer0, 0x30, 12);
        }
        else {
            composer0.startReplaceableGroup(-1052799002);
            state0 = SnapshotStateKt.rememberUpdatedState(Color.box-impl(v1), composer0, 0);
        }
        composer0.endReplaceableGroup();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
        return state0;
    }
}

