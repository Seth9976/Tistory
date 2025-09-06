package p0;

import androidx.compose.material.SelectableChipColors;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import wb.a;

public final class g3 implements SelectableChipColors {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;

    public g3(long v, long v1, long v2, long v3, long v4, long v5, long v6, long v7, long v8) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
        this.e = v4;
        this.f = v5;
        this.g = v6;
        this.h = v7;
        this.i = v8;
    }

    @Override  // androidx.compose.material.SelectableChipColors
    public final State backgroundColor(boolean z, boolean z1, Composer composer0, int v) {
        long v1;
        composer0.startReplaceableGroup(0xE7EDF157);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xE7EDF157, v, -1, "androidx.compose.material.DefaultSelectableChipColors.backgroundColor (Chip.kt:661)");
        }
        if(z) {
            v1 = z1 ? this.g : this.a;
        }
        else {
            v1 = this.d;
        }
        State state0 = SnapshotStateKt.rememberUpdatedState(Color.box-impl(v1), composer0, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
        return state0;
    }

    @Override  // androidx.compose.material.SelectableChipColors
    public final State contentColor(boolean z, boolean z1, Composer composer0, int v) {
        long v1;
        composer0.startReplaceableGroup(2025240134);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2025240134, v, -1, "androidx.compose.material.DefaultSelectableChipColors.contentColor (Chip.kt:671)");
        }
        if(z) {
            v1 = z1 ? this.h : this.b;
        }
        else {
            v1 = this.e;
        }
        State state0 = SnapshotStateKt.rememberUpdatedState(Color.box-impl(v1), composer0, 0);
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
            if(g3.class != class0 || !Color.equals-impl0(this.a, ((g3)object0).a)) {
                return false;
            }
            if(!Color.equals-impl0(this.b, ((g3)object0).b)) {
                return false;
            }
            if(!Color.equals-impl0(this.c, ((g3)object0).c)) {
                return false;
            }
            if(!Color.equals-impl0(this.d, ((g3)object0).d)) {
                return false;
            }
            if(!Color.equals-impl0(this.e, ((g3)object0).e)) {
                return false;
            }
            if(!Color.equals-impl0(this.f, ((g3)object0).f)) {
                return false;
            }
            if(!Color.equals-impl0(this.g, ((g3)object0).g)) {
                return false;
            }
            return Color.equals-impl0(this.h, ((g3)object0).h) ? Color.equals-impl0(this.i, ((g3)object0).i) : false;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return Color.hashCode-impl(this.i) + a.a(this.h, a.a(this.g, a.a(this.f, a.a(this.e, a.a(this.d, a.a(this.c, a.a(this.b, Color.hashCode-impl(this.a) * 0x1F, 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F);
    }

    @Override  // androidx.compose.material.SelectableChipColors
    public final State leadingIconColor(boolean z, boolean z1, Composer composer0, int v) {
        long v1;
        composer0.startReplaceableGroup(0xB50B36C);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xB50B36C, v, -1, "androidx.compose.material.DefaultSelectableChipColors.leadingIconColor (Chip.kt:681)");
        }
        if(z) {
            v1 = z1 ? this.i : this.c;
        }
        else {
            v1 = this.f;
        }
        State state0 = SnapshotStateKt.rememberUpdatedState(Color.box-impl(v1), composer0, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
        return state0;
    }
}

