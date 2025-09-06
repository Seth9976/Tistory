package p0;

import androidx.compose.material.SwitchColors;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import wb.a;

public final class i3 implements SwitchColors {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;

    public i3(long v, long v1, long v2, long v3, long v4, long v5, long v6, long v7) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
        this.e = v4;
        this.f = v5;
        this.g = v6;
        this.h = v7;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            if(i3.class != class0 || !Color.equals-impl0(this.a, ((i3)object0).a)) {
                return false;
            }
            if(!Color.equals-impl0(this.b, ((i3)object0).b)) {
                return false;
            }
            if(!Color.equals-impl0(this.c, ((i3)object0).c)) {
                return false;
            }
            if(!Color.equals-impl0(this.d, ((i3)object0).d)) {
                return false;
            }
            if(!Color.equals-impl0(this.e, ((i3)object0).e)) {
                return false;
            }
            if(!Color.equals-impl0(this.f, ((i3)object0).f)) {
                return false;
            }
            return Color.equals-impl0(this.g, ((i3)object0).g) ? Color.equals-impl0(this.h, ((i3)object0).h) : false;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return Color.hashCode-impl(this.h) + a.a(this.g, a.a(this.f, a.a(this.e, a.a(this.d, a.a(this.c, a.a(this.b, Color.hashCode-impl(this.a) * 0x1F, 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F);
    }

    @Override  // androidx.compose.material.SwitchColors
    public final State thumbColor(boolean z, boolean z1, Composer composer0, int v) {
        long v1;
        composer0.startReplaceableGroup(0xFC0A7289);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xFC0A7289, v, -1, "androidx.compose.material.DefaultSwitchColors.thumbColor (Switch.kt:367)");
        }
        if(!z) {
            v1 = z1 ? this.e : this.g;
        }
        else if(z1) {
            v1 = this.a;
        }
        else {
            v1 = this.c;
        }
        State state0 = SnapshotStateKt.rememberUpdatedState(Color.box-impl(v1), composer0, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
        return state0;
    }

    @Override  // androidx.compose.material.SwitchColors
    public final State trackColor(boolean z, boolean z1, Composer composer0, int v) {
        long v1;
        composer0.startReplaceableGroup(0xB9E26CBE);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xB9E26CBE, v, -1, "androidx.compose.material.DefaultSwitchColors.trackColor (Switch.kt:378)");
        }
        if(!z) {
            v1 = z1 ? this.f : this.h;
        }
        else if(z1) {
            v1 = this.b;
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
}

