package p0;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.material.FloatingActionButtonElevation;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.unit.Dp;
import r0.a;

public final class e3 implements FloatingActionButtonElevation {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public e3(float f, float f1, float f2, float f3) {
        this.a = f;
        this.b = f1;
        this.c = f2;
        this.d = f3;
    }

    @Override  // androidx.compose.material.FloatingActionButtonElevation
    public final State elevation(InteractionSource interactionSource0, Composer composer0, int v) {
        composer0.startReplaceableGroup(0xE37B0BB9);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xE37B0BB9, v, -1, "androidx.compose.material.DefaultFloatingActionButtonElevation.elevation (FloatingActionButton.kt:269)");
        }
        composer0.startReplaceableGroup(0x44FAF204);
        boolean z = composer0.changed(interactionSource0);
        n4 n40 = composer0.rememberedValue();
        if(z || n40 == Composer.Companion.getEmpty()) {
            n40 = new n4(this.a, this.b, this.c, this.d);
            composer0.updateRememberedValue(n40);
        }
        composer0.endReplaceableGroup();
        EffectsKt.LaunchedEffect(this, new a3(n40, this, null), composer0, v >> 3 & 14 | 0x40);
        EffectsKt.LaunchedEffect(interactionSource0, new d3(interactionSource0, n40, null), composer0, v & 14 | 0x40);
        State state0 = n40.e.asState();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
        return state0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof e3)) {
            return false;
        }
        if(!Dp.equals-impl0(this.a, ((e3)object0).a)) {
            return false;
        }
        if(!Dp.equals-impl0(this.b, ((e3)object0).b)) {
            return false;
        }
        return Dp.equals-impl0(this.c, ((e3)object0).c) ? Dp.equals-impl0(this.d, ((e3)object0).d) : false;
    }

    @Override
    public final int hashCode() {
        return Dp.hashCode-impl(this.d) + a.C(this.c, a.C(this.b, Dp.hashCode-impl(this.a) * 0x1F, 0x1F), 0x1F);
    }
}

