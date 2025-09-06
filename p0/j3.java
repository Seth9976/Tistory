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

public final class j3 implements TextFieldColors {
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

    public j3(long v, long v1, long v2, long v3, long v4, long v5, long v6, long v7, long v8, long v9, long v10, long v11, long v12, long v13, long v14, long v15, long v16, long v17, long v18, long v19, long v20) {
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
    }

    @Override  // androidx.compose.material.TextFieldColors
    public final State backgroundColor(boolean z, Composer composer0, int v) {
        composer0.startReplaceableGroup(0xAB206B03);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xAB206B03, v, -1, "androidx.compose.material.DefaultTextFieldColors.backgroundColor (TextFieldDefaults.kt:791)");
        }
        State state0 = SnapshotStateKt.rememberUpdatedState(Color.box-impl(this.o), composer0, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
        return state0;
    }

    @Override  // androidx.compose.material.TextFieldColors
    public final State cursorColor(boolean z, Composer composer0, int v) {
        composer0.startReplaceableGroup(0xA9C9582B);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xA9C9582B, v, -1, "androidx.compose.material.DefaultTextFieldColors.cursorColor (TextFieldDefaults.kt:823)");
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
            if(j3.class == class0) {
                j3 j30 = (j3)object0;
                if(!Color.equals-impl0(this.a, j30.a)) {
                    return false;
                }
                if(!Color.equals-impl0(this.b, j30.b)) {
                    return false;
                }
                if(!Color.equals-impl0(this.c, j30.c)) {
                    return false;
                }
                if(!Color.equals-impl0(this.d, j30.d)) {
                    return false;
                }
                if(!Color.equals-impl0(this.e, j30.e)) {
                    return false;
                }
                if(!Color.equals-impl0(this.f, j30.f)) {
                    return false;
                }
                if(!Color.equals-impl0(this.g, j30.g)) {
                    return false;
                }
                if(!Color.equals-impl0(this.h, j30.h)) {
                    return false;
                }
                if(!Color.equals-impl0(this.i, j30.i)) {
                    return false;
                }
                if(!Color.equals-impl0(this.j, j30.j)) {
                    return false;
                }
                if(!Color.equals-impl0(this.k, j30.k)) {
                    return false;
                }
                if(!Color.equals-impl0(this.l, j30.l)) {
                    return false;
                }
                if(!Color.equals-impl0(this.m, j30.m)) {
                    return false;
                }
                if(!Color.equals-impl0(this.n, j30.n)) {
                    return false;
                }
                if(!Color.equals-impl0(this.o, j30.o)) {
                    return false;
                }
                if(!Color.equals-impl0(this.p, j30.p)) {
                    return false;
                }
                if(!Color.equals-impl0(this.q, j30.q)) {
                    return false;
                }
                if(!Color.equals-impl0(this.r, j30.r)) {
                    return false;
                }
                if(!Color.equals-impl0(this.s, j30.s)) {
                    return false;
                }
                return Color.equals-impl0(this.t, j30.t) ? Color.equals-impl0(this.u, j30.u) : false;
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return Color.hashCode-impl(this.u) + a.a(this.t, a.a(this.s, a.a(this.r, a.a(this.q, a.a(this.p, a.a(this.o, a.a(this.n, a.a(this.m, a.a(this.l, a.a(this.k, a.a(this.j, a.a(this.i, a.a(this.h, a.a(this.g, a.a(this.f, a.a(this.e, a.a(this.d, a.a(this.c, a.a(this.b, Color.hashCode-impl(this.a) * 0x1F, 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F);
    }

    @Override  // androidx.compose.material.TextFieldColors
    public final State indicatorColor(boolean z, boolean z1, InteractionSource interactionSource0, Composer composer0, int v) {
        State state1;
        long v1;
        composer0.startReplaceableGroup(0x3B86960B);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x3B86960B, v, -1, "androidx.compose.material.DefaultTextFieldColors.indicatorColor (TextFieldDefaults.kt:774)");
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
            composer0.startReplaceableGroup(0x858F90D7);
            state1 = SingleValueAnimationKt.animateColorAsState-euL9pac(v1, AnimationSpecKt.tween$default(150, 0, null, 6, null), null, null, composer0, 0x30, 12);
        }
        else {
            composer0.startReplaceableGroup(0x858F9140);
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
        composer0.startReplaceableGroup(0x2B568AB0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x2B568AB0, v, -1, "androidx.compose.material.DefaultTextFieldColors.labelColor (TextFieldDefaults.kt:805)");
        }
        State state0 = FocusInteractionKt.collectIsFocusedAsState(interactionSource0, composer0, v >> 6 & 14);
        if(!z) {
            v1 = this.r;
        }
        else if(z1) {
            v1 = this.s;
        }
        else {
            v1 = ((Boolean)state0.getValue()).booleanValue() ? this.p : this.q;
        }
        State state1 = SnapshotStateKt.rememberUpdatedState(Color.box-impl(v1), composer0, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
        return state1;
    }

    @Override  // androidx.compose.material.TextFieldColors
    public final State leadingIconColor(boolean z, boolean z1, InteractionSource interactionSource0, Composer composer0, int v) {
        long v1;
        composer0.startReplaceableGroup(-1519634405);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1519634405, v, -1, "androidx.compose.material.DefaultTextFieldColors.leadingIconColor (TextFieldDefaults.kt:732)");
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
    public final State leadingIconColor(boolean z, boolean z1, Composer composer0, int v) {
        long v1;
        composer0.startReplaceableGroup(1016171324);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1016171324, v, -1, "androidx.compose.material.DefaultTextFieldColors.leadingIconColor (TextFieldDefaults.kt:717)");
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
        composer0.startReplaceableGroup(0xFC885EC);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xFC885EC, v, -1, "androidx.compose.material.DefaultTextFieldColors.placeholderColor (TextFieldDefaults.kt:796)");
        }
        State state0 = SnapshotStateKt.rememberUpdatedState(Color.box-impl((z ? this.t : this.u)), composer0, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
        return state0;
    }

    @Override  // androidx.compose.material.TextFieldColors
    public final State textColor(boolean z, Composer composer0, int v) {
        composer0.startReplaceableGroup(9804418);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(9804418, v, -1, "androidx.compose.material.DefaultTextFieldColors.textColor (TextFieldDefaults.kt:818)");
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
        composer0.startReplaceableGroup(0x5273C28D);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x5273C28D, v, -1, "androidx.compose.material.DefaultTextFieldColors.trailingIconColor (TextFieldDefaults.kt:759)");
        }
        if(z) {
            v1 = z1 ? this.n : this.l;
        }
        else {
            v1 = this.m;
        }
        State state0 = SnapshotStateKt.rememberUpdatedState(Color.box-impl(v1), composer0, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
        return state0;
    }

    @Override  // androidx.compose.material.TextFieldColors
    public final State trailingIconColor(boolean z, boolean z1, Composer composer0, int v) {
        long v1;
        composer0.startReplaceableGroup(225259054);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(225259054, v, -1, "androidx.compose.material.DefaultTextFieldColors.trailingIconColor (TextFieldDefaults.kt:744)");
        }
        if(z) {
            v1 = z1 ? this.n : this.l;
        }
        else {
            v1 = this.m;
        }
        State state0 = SnapshotStateKt.rememberUpdatedState(Color.box-impl(v1), composer0, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
        return state0;
    }
}

