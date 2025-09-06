package p0;

import androidx.compose.material.SliderColors;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import wb.a;

public final class h3 implements SliderColors {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;

    public h3(long v, long v1, long v2, long v3, long v4, long v5, long v6, long v7, long v8, long v9) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
        this.e = v4;
        this.f = v5;
        this.g = v6;
        this.h = v7;
        this.i = v8;
        this.j = v9;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            if(h3.class != class0 || !Color.equals-impl0(this.a, ((h3)object0).a)) {
                return false;
            }
            if(!Color.equals-impl0(this.b, ((h3)object0).b)) {
                return false;
            }
            if(!Color.equals-impl0(this.c, ((h3)object0).c)) {
                return false;
            }
            if(!Color.equals-impl0(this.d, ((h3)object0).d)) {
                return false;
            }
            if(!Color.equals-impl0(this.e, ((h3)object0).e)) {
                return false;
            }
            if(!Color.equals-impl0(this.f, ((h3)object0).f)) {
                return false;
            }
            if(!Color.equals-impl0(this.g, ((h3)object0).g)) {
                return false;
            }
            if(!Color.equals-impl0(this.h, ((h3)object0).h)) {
                return false;
            }
            return Color.equals-impl0(this.i, ((h3)object0).i) ? Color.equals-impl0(this.j, ((h3)object0).j) : false;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return Color.hashCode-impl(this.j) + a.a(this.i, a.a(this.h, a.a(this.g, a.a(this.f, a.a(this.e, a.a(this.d, a.a(this.c, a.a(this.b, Color.hashCode-impl(this.a) * 0x1F, 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F);
    }

    @Override  // androidx.compose.material.SliderColors
    public final State thumbColor(boolean z, Composer composer0, int v) {
        composer0.startReplaceableGroup(0x98A860CB);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x98A860CB, v, -1, "androidx.compose.material.DefaultSliderColors.thumbColor (Slider.kt:1090)");
        }
        State state0 = SnapshotStateKt.rememberUpdatedState(Color.box-impl((z ? this.a : this.b)), composer0, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
        return state0;
    }

    @Override  // androidx.compose.material.SliderColors
    public final State tickColor(boolean z, boolean z1, Composer composer0, int v) {
        long v1;
        composer0.startReplaceableGroup(0xA7188B52);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xA7188B52, v, -1, "androidx.compose.material.DefaultSliderColors.tickColor (Slider.kt:1106)");
        }
        if(!z) {
            v1 = z1 ? this.i : this.j;
        }
        else if(z1) {
            v1 = this.g;
        }
        else {
            v1 = this.h;
        }
        State state0 = SnapshotStateKt.rememberUpdatedState(Color.box-impl(v1), composer0, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
        return state0;
    }

    @Override  // androidx.compose.material.SliderColors
    public final State trackColor(boolean z, boolean z1, Composer composer0, int v) {
        long v1;
        composer0.startReplaceableGroup(1575395620);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1575395620, v, -1, "androidx.compose.material.DefaultSliderColors.trackColor (Slider.kt:1095)");
        }
        if(!z) {
            v1 = z1 ? this.e : this.f;
        }
        else if(z1) {
            v1 = this.c;
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

