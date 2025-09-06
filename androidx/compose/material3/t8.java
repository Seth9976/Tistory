package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import wb.a;

public final class t8 implements NavigationDrawerItemColors {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;

    public t8(long v, long v1, long v2, long v3, long v4, long v5, long v6, long v7) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
        this.e = v4;
        this.f = v5;
        this.g = v6;
        this.h = v7;
    }

    @Override  // androidx.compose.material3.NavigationDrawerItemColors
    public final State badgeColor(boolean z, Composer composer0, int v) {
        composer0.startReplaceGroup(-561675044);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-561675044, v, -1, "androidx.compose.material3.DefaultDrawerItemsColor.badgeColor (NavigationDrawer.kt:1100)");
        }
        State state0 = SnapshotStateKt.rememberUpdatedState(Color.box-impl((z ? this.g : this.h)), composer0, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceGroup();
        return state0;
    }

    @Override  // androidx.compose.material3.NavigationDrawerItemColors
    public final State containerColor(boolean z, Composer composer0, int v) {
        composer0.startReplaceGroup(-433512770);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-433512770, v, -1, "androidx.compose.material3.DefaultDrawerItemsColor.containerColor (NavigationDrawer.kt:1093)");
        }
        State state0 = SnapshotStateKt.rememberUpdatedState(Color.box-impl((z ? this.e : this.f)), composer0, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceGroup();
        return state0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof t8)) {
            return false;
        }
        if(!Color.equals-impl0(this.a, ((t8)object0).a)) {
            return false;
        }
        if(!Color.equals-impl0(this.b, ((t8)object0).b)) {
            return false;
        }
        if(!Color.equals-impl0(this.c, ((t8)object0).c)) {
            return false;
        }
        if(!Color.equals-impl0(this.d, ((t8)object0).d)) {
            return false;
        }
        if(!Color.equals-impl0(this.e, ((t8)object0).e)) {
            return false;
        }
        if(!Color.equals-impl0(this.f, ((t8)object0).f)) {
            return false;
        }
        return Color.equals-impl0(this.g, ((t8)object0).g) ? Color.equals-impl0(this.h, ((t8)object0).h) : false;
    }

    @Override
    public final int hashCode() {
        return Color.hashCode-impl(this.h) + a.a(this.g, a.a(this.f, a.a(this.e, a.a(this.d, a.a(this.c, a.a(this.b, Color.hashCode-impl(this.a) * 0x1F, 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F);
    }

    @Override  // androidx.compose.material3.NavigationDrawerItemColors
    public final State iconColor(boolean z, Composer composer0, int v) {
        composer0.startReplaceGroup(0x4407AEEA);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x4407AEEA, v, -1, "androidx.compose.material3.DefaultDrawerItemsColor.iconColor (NavigationDrawer.kt:1083)");
        }
        State state0 = SnapshotStateKt.rememberUpdatedState(Color.box-impl((z ? this.a : this.b)), composer0, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceGroup();
        return state0;
    }

    @Override  // androidx.compose.material3.NavigationDrawerItemColors
    public final State textColor(boolean z, Composer composer0, int v) {
        composer0.startReplaceGroup(0x4C00A0B6);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x4C00A0B6, v, -1, "androidx.compose.material3.DefaultDrawerItemsColor.textColor (NavigationDrawer.kt:1088)");
        }
        State state0 = SnapshotStateKt.rememberUpdatedState(Color.box-impl((z ? this.c : this.d)), composer0, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceGroup();
        return state0;
    }
}

