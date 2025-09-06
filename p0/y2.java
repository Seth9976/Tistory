package p0;

import androidx.compose.material.ChipColors;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import wb.a;

public final class y2 implements ChipColors {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;

    public y2(long v, long v1, long v2, long v3, long v4, long v5) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
        this.e = v4;
        this.f = v5;
    }

    @Override  // androidx.compose.material.ChipColors
    public final State backgroundColor(boolean z, Composer composer0, int v) {
        composer0.startReplaceableGroup(0xA103C5E9);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xA103C5E9, v, -1, "androidx.compose.material.DefaultChipColors.backgroundColor (Chip.kt:599)");
        }
        State state0 = SnapshotStateKt.rememberUpdatedState(Color.box-impl((z ? this.a : this.d)), composer0, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
        return state0;
    }

    @Override  // androidx.compose.material.ChipColors
    public final State contentColor(boolean z, Composer composer0, int v) {
        composer0.startReplaceableGroup(483145880);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(483145880, v, -1, "androidx.compose.material.DefaultChipColors.contentColor (Chip.kt:604)");
        }
        State state0 = SnapshotStateKt.rememberUpdatedState(Color.box-impl((z ? this.b : this.e)), composer0, 0);
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
            if(y2.class != class0 || !Color.equals-impl0(this.a, ((y2)object0).a)) {
                return false;
            }
            if(!Color.equals-impl0(this.b, ((y2)object0).b)) {
                return false;
            }
            if(!Color.equals-impl0(this.c, ((y2)object0).c)) {
                return false;
            }
            if(!Color.equals-impl0(this.d, ((y2)object0).d)) {
                return false;
            }
            return Color.equals-impl0(this.e, ((y2)object0).e) ? Color.equals-impl0(this.f, ((y2)object0).f) : false;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return Color.hashCode-impl(this.f) + a.a(this.e, a.a(this.d, a.a(this.c, a.a(this.b, Color.hashCode-impl(this.a) * 0x1F, 0x1F), 0x1F), 0x1F), 0x1F);
    }

    @Override  // androidx.compose.material.ChipColors
    public final State leadingIconContentColor(boolean z, Composer composer0, int v) {
        composer0.startReplaceableGroup(1955749013);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1955749013, v, -1, "androidx.compose.material.DefaultChipColors.leadingIconContentColor (Chip.kt:609)");
        }
        State state0 = SnapshotStateKt.rememberUpdatedState(Color.box-impl((z ? this.c : this.f)), composer0, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
        return state0;
    }
}

