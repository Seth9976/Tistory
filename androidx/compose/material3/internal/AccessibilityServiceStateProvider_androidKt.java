package androidx.compose.material3.internal;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w0.a1;
import w0.a;
import w0.b;
import w0.c;
import w0.d;
import w0.e;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A)\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00000\u00032\b\b\u0002\u0010\u0001\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u0000H\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "listenToTouchExplorationState", "listenToSwitchAccessState", "Landroidx/compose/runtime/State;", "rememberAccessibilityServiceState", "(ZZLandroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAccessibilityServiceStateProvider.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccessibilityServiceStateProvider.android.kt\nandroidx/compose/material3/internal/AccessibilityServiceStateProvider_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,183:1\n77#2:184\n77#2:191\n1223#3,6:185\n1223#3,6:192\n1223#3,6:198\n1223#3,6:204\n*S KotlinDebug\n*F\n+ 1 AccessibilityServiceStateProvider.android.kt\nandroidx/compose/material3/internal/AccessibilityServiceStateProvider_androidKt\n*L\n48#1:184\n58#1:191\n53#1:185,6\n59#1:192,6\n64#1:198,6\n76#1:204,6\n*E\n"})
public final class AccessibilityServiceStateProvider_androidKt {
    public static final void a(LifecycleOwner lifecycleOwner0, Function1 function10, Function0 function00, Composer composer0, int v, int v1) {
        int v2;
        Composer composer1 = composer0.startRestartGroup(0x90A396B3);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (composer1.changedInstance(lifecycleOwner0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x30) == 0) {
            v2 |= (composer1.changedInstance(function10) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x180) == 0) {
            v2 |= (composer1.changedInstance(function00) ? 0x100 : 0x80);
        }
        if((v2 & 0x93) != 0x92 || !composer1.getSkipping()) {
            if((v1 & 2) != 0) {
                function10 = a.w;
            }
            if((v1 & 4) != 0) {
                function00 = b.w;
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x90A396B3, v2, -1, "androidx.compose.material3.internal.ObserveState (AccessibilityServiceStateProvider.android.kt:74)");
            }
            int v3 = 0;
            boolean z = composer1.changedInstance(lifecycleOwner0);
            if((v2 & 0x380) == 0x100) {
                v3 = 1;
            }
            c c0 = composer1.rememberedValue();
            if(((v2 & 0x70) == 0x20 | z | v3) != 0 || c0 == Composer.Companion.getEmpty()) {
                c0 = new c(lifecycleOwner0, function10, function00);
                composer1.updateRememberedValue(c0);
            }
            EffectsKt.DisposableEffect(lifecycleOwner0, c0, composer1, v2 & 14);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new d(lifecycleOwner0, function10, function00, v, v1));
        }
    }

    @Composable
    @NotNull
    public static final State rememberAccessibilityServiceState(boolean z, boolean z1, @Nullable Composer composer0, int v, int v1) {
        int v2 = 1;
        if((v1 & 1) != 0) {
            z = true;
        }
        if((v1 & 2) != 0) {
            z1 = true;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x9665ECC0, v, -1, "androidx.compose.material3.internal.rememberAccessibilityServiceState (AccessibilityServiceStateProvider.android.kt:46)");
        }
        Object object0 = ((Context)composer0.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getSystemService("accessibility");
        Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        int v3 = ((v & 14 ^ 6) <= 4 || !composer0.changed(z)) && (v & 6) != 4 ? 0 : 1;
        if(((v & 0x70 ^ 0x30) <= 0x20 || !composer0.changed(z1)) && (v & 0x30) != 0x20) {
            v2 = 0;
        }
        a1 a10 = composer0.rememberedValue();
        if((v3 | v2) != 0 || a10 == Composer.Companion.getEmpty()) {
            a10 = new a1(z, z1);
            composer0.updateRememberedValue(a10);
        }
        Object object1 = composer0.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
        boolean z2 = composer0.changed(a10);
        boolean z3 = composer0.changedInstance(((AccessibilityManager)object0));
        e e0 = composer0.rememberedValue();
        if(z2 || z3 || e0 == Composer.Companion.getEmpty()) {
            e0 = new e(a10, ((AccessibilityManager)object0));
            composer0.updateRememberedValue(e0);
        }
        boolean z4 = composer0.changed(a10);
        boolean z5 = composer0.changedInstance(((AccessibilityManager)object0));
        p9.a a0 = composer0.rememberedValue();
        if(z4 || z5 || a0 == Composer.Companion.getEmpty()) {
            a0 = new p9.a(11, a10, ((AccessibilityManager)object0));
            composer0.updateRememberedValue(a0);
        }
        AccessibilityServiceStateProvider_androidKt.a(((LifecycleOwner)object1), e0, a0, composer0, 0, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return a10;
    }
}

