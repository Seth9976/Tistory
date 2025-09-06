package p0;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.material.TextFieldColors;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import wb.a;

public final class k3 implements TextFieldColors {
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
    public final long k;
    public final long l;
    public final long m;
    public final long n;
    public final long o;
    public final long p;
    public final long q;
    public final long r;
    public final long s;
    public final long t;
    public final long u;
    public final long v;

    public k3(long v, long v1, long v2, long v3, long v4, long v5, long v6, long v7, long v8, long v9, long v10, long v11, long v12, long v13, long v14, long v15, long v16, long v17, long v18, long v19, long v20, long v21) {
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
        this.k = v10;
        this.l = v11;
        this.m = v12;
        this.n = v13;
        this.o = v14;
        this.p = v15;
        this.q = v16;
        this.r = v17;
        this.s = v18;
        this.t = v19;
        this.u = v20;
        this.v = v21;
    }

    @Override  // androidx.compose.material.TextFieldColors
    public final State backgroundColor(boolean z, Composer composer0, int v) {
        composer0.startReplaceableGroup(0xB814D8FB);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xB814D8FB, v, -1, "androidx.compose.material.DefaultTextFieldForExposedDropdownMenusColors.backgroundColor (ExposedDropdownMenu.android.kt:645)");
        }
        State state0 = SnapshotStateKt.rememberUpdatedState(Color.box-impl(this.p), composer0, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
        return state0;
    }

    @Override  // androidx.compose.material.TextFieldColors
    public final State cursorColor(boolean z, Composer composer0, int v) {
        composer0.startReplaceableGroup(0x23F430D3);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x23F430D3, v, -1, "androidx.compose.material.DefaultTextFieldForExposedDropdownMenusColors.cursorColor (ExposedDropdownMenu.android.kt:677)");
        }
        State state0 = SnapshotStateKt.rememberUpdatedState(Color.box-impl((z ? this.d : this.c)), composer0, 0);
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
            if(k3.class == class0) {
                k3 k30 = (k3)object0;
                if(!Color.equals-impl0(this.a, k30.a)) {
                    return false;
                }
                if(!Color.equals-impl0(this.b, k30.b)) {
                    return false;
                }
                if(!Color.equals-impl0(this.c, k30.c)) {
                    return false;
                }
                if(!Color.equals-impl0(this.d, k30.d)) {
                    return false;
                }
                if(!Color.equals-impl0(this.e, k30.e)) {
                    return false;
                }
                if(!Color.equals-impl0(this.f, k30.f)) {
                    return false;
                }
                if(!Color.equals-impl0(this.g, k30.g)) {
                    return false;
                }
                if(!Color.equals-impl0(this.h, k30.h)) {
                    return false;
                }
                if(!Color.equals-impl0(this.i, k30.i)) {
                    return false;
                }
                if(!Color.equals-impl0(this.j, k30.j)) {
                    return false;
                }
                if(!Color.equals-impl0(this.k, k30.k)) {
                    return false;
                }
                if(!Color.equals-impl0(this.l, k30.l)) {
                    return false;
                }
                if(!Color.equals-impl0(this.m, k30.m)) {
                    return false;
                }
                if(!Color.equals-impl0(this.n, k30.n)) {
                    return false;
                }
                if(!Color.equals-impl0(this.o, k30.o)) {
                    return false;
                }
                if(!Color.equals-impl0(this.p, k30.p)) {
                    return false;
                }
                if(!Color.equals-impl0(this.q, k30.q)) {
                    return false;
                }
                if(!Color.equals-impl0(this.r, k30.r)) {
                    return false;
                }
                if(!Color.equals-impl0(this.s, k30.s)) {
                    return false;
                }
                if(!Color.equals-impl0(this.t, k30.t)) {
                    return false;
                }
                return Color.equals-impl0(this.u, k30.u) ? Color.equals-impl0(this.v, k30.v) : false;
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return Color.hashCode-impl(this.v) + a.a(this.u, a.a(this.t, a.a(this.s, a.a(this.r, a.a(this.q, a.a(this.p, a.a(this.o, a.a(this.n, a.a(this.m, a.a(this.l, a.a(this.k, a.a(this.j, a.a(this.i, a.a(this.h, a.a(this.g, a.a(this.f, a.a(this.e, a.a(this.d, a.a(this.c, a.a(this.b, Color.hashCode-impl(this.a) * 0x1F, 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F);
    }

    @Override  // androidx.compose.material.TextFieldColors
    public final State indicatorColor(boolean z, boolean z1, InteractionSource interactionSource0, Composer composer0, int v) {
        State state1;
        long v1;
        composer0.startReplaceableGroup(0x8B5E2EF3);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x8B5E2EF3, v, -1, "androidx.compose.material.DefaultTextFieldForExposedDropdownMenusColors.indicatorColor (ExposedDropdownMenu.android.kt:628)");
        }
        State state0 = FocusInteractionKt.collectIsFocusedAsState(interactionSource0, composer0, v >> 6 & 14);
        if(!z) {
            v1 = this.h;
        }
        else if(z1) {
            v1 = this.g;
        }
        else {
            v1 = ((Boolean)state0.getValue()).booleanValue() ? this.e : this.f;
        }
        if(z) {
            composer0.startReplaceableGroup(0xADDE895);
            state1 = SingleValueAnimationKt.animateColorAsState-euL9pac(v1, AnimationSpecKt.tween$default(150, 0, null, 6, null), null, null, composer0, 0x30, 12);
        }
        else {
            composer0.startReplaceableGroup(0xADDE8FE);
            state1 = SnapshotStateKt.rememberUpdatedState(Color.box-impl(v1), composer0, 0);
        }
        composer0.endReplaceableGroup();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
        return state1;
    }

    @Override  // androidx.compose.material.TextFieldColors
    public final State labelColor(boolean z, boolean z1, InteractionSource interactionSource0, Composer composer0, int v) {
        long v1;
        composer0.startReplaceableGroup(-1110039826);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1110039826, v, -1, "androidx.compose.material.DefaultTextFieldForExposedDropdownMenusColors.labelColor (ExposedDropdownMenu.android.kt:659)");
        }
        State state0 = FocusInteractionKt.collectIsFocusedAsState(interactionSource0, composer0, v >> 6 & 14);
        if(!z) {
            v1 = this.s;
        }
        else if(z1) {
            v1 = this.t;
        }
        else {
            v1 = ((Boolean)state0.getValue()).booleanValue() ? this.q : this.r;
        }
        State state1 = SnapshotStateKt.rememberUpdatedState(Color.box-impl(v1), composer0, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
        return state1;
    }

    @Override  // androidx.compose.material.TextFieldColors
    public final State leadingIconColor(boolean z, boolean z1, Composer composer0, int v) {
        long v1;
        composer0.startReplaceableGroup(1834640354);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1834640354, v, -1, "androidx.compose.material.DefaultTextFieldForExposedDropdownMenusColors.leadingIconColor (ExposedDropdownMenu.android.kt:583)");
        }
        if(z) {
            v1 = z1 ? this.k : this.i;
        }
        else {
            v1 = this.j;
        }
        State state0 = SnapshotStateKt.rememberUpdatedState(Color.box-impl(v1), composer0, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
        return state0;
    }

    @Override  // androidx.compose.material.TextFieldColors
    public final State placeholderColor(boolean z, Composer composer0, int v) {
        composer0.startReplaceableGroup(1682014002);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1682014002, v, -1, "androidx.compose.material.DefaultTextFieldForExposedDropdownMenusColors.placeholderColor (ExposedDropdownMenu.android.kt:650)");
        }
        State state0 = SnapshotStateKt.rememberUpdatedState(Color.box-impl((z ? this.u : this.v)), composer0, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
        return state0;
    }

    @Override  // androidx.compose.material.TextFieldColors
    public final State textColor(boolean z, Composer composer0, int v) {
        composer0.startReplaceableGroup(0xCD03D55C);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xCD03D55C, v, -1, "androidx.compose.material.DefaultTextFieldForExposedDropdownMenusColors.textColor (ExposedDropdownMenu.android.kt:672)");
        }
        State state0 = SnapshotStateKt.rememberUpdatedState(Color.box-impl((z ? this.a : this.b)), composer0, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
        return state0;
    }

    @Override  // androidx.compose.material.TextFieldColors
    public final State trailingIconColor(boolean z, boolean z1, InteractionSource interactionSource0, Composer composer0, int v) {
        long v1;
        composer0.startReplaceableGroup(1172839089);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1172839089, v, -1, "androidx.compose.material.DefaultTextFieldForExposedDropdownMenusColors.trailingIconColor (ExposedDropdownMenu.android.kt:610)");
        }
        State state0 = FocusInteractionKt.collectIsFocusedAsState(interactionSource0, composer0, v >> 6 & 14);
        if(!z) {
            v1 = this.n;
        }
        else if(z1) {
            v1 = this.o;
        }
        else {
            v1 = ((Boolean)state0.getValue()).booleanValue() ? this.m : this.l;
        }
        State state1 = SnapshotStateKt.rememberUpdatedState(Color.box-impl(v1), composer0, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
        return state1;
    }

    @Override  // androidx.compose.material.TextFieldColors
    public final State trailingIconColor(boolean z, boolean z1, Composer composer0, int v) {
        long v1;
        composer0.startReplaceableGroup(0x46026730);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x46026730, v, -1, "androidx.compose.material.DefaultTextFieldForExposedDropdownMenusColors.trailingIconColor (ExposedDropdownMenu.android.kt:595)");
        }
        if(z) {
            v1 = z1 ? this.o : this.l;
        }
        else {
            v1 = this.n;
        }
        State state0 = SnapshotStateKt.rememberUpdatedState(Color.box-impl(v1), composer0, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
        return state0;
    }
}

