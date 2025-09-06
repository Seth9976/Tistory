package p0;

import androidx.compose.material.ButtonColors;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import wb.a;

public final class s2 implements ButtonColors {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public s2(long v, long v1, long v2, long v3) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
    }

    @Override  // androidx.compose.material.ButtonColors
    public final State backgroundColor(boolean z, Composer composer0, int v) {
        composer0.startReplaceableGroup(0xD8F19C1D);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xD8F19C1D, v, -1, "androidx.compose.material.DefaultButtonColors.backgroundColor (Button.kt:585)");
        }
        State state0 = SnapshotStateKt.rememberUpdatedState(Color.box-impl((z ? this.a : this.c)), composer0, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
        return state0;
    }

    @Override  // androidx.compose.material.ButtonColors
    public final State contentColor(boolean z, Composer composer0, int v) {
        composer0.startReplaceableGroup(0x80D31F4C);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x80D31F4C, v, -1, "androidx.compose.material.DefaultButtonColors.contentColor (Button.kt:590)");
        }
        State state0 = SnapshotStateKt.rememberUpdatedState(Color.box-impl((z ? this.b : this.d)), composer0, 0);
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
        if(object0 != null) {
            Class class0 = object0.getClass();
            if(s2.class != class0 || !Color.equals-impl0(this.a, ((s2)object0).a)) {
                return false;
            }
            if(!Color.equals-impl0(this.b, ((s2)object0).b)) {
                return false;
            }
            return Color.equals-impl0(this.c, ((s2)object0).c) ? Color.equals-impl0(this.d, ((s2)object0).d) : false;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return Color.hashCode-impl(this.d) + a.a(this.c, a.a(this.b, Color.hashCode-impl(this.a) * 0x1F, 0x1F), 0x1F);
    }
}

