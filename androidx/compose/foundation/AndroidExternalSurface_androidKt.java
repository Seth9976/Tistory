package androidx.compose.foundation;

import androidx.compose.material3.jr;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.room.a;
import j0.b2;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u.m;
import u.n;
import u.o;
import u.p;
import u.q;
import u.r;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001A]\u0010\u0010\u001A\u00020\u000B2\b\b\u0002\u0010\u0001\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\b\u001A\u00020\u00022\u0017\u0010\r\u001A\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000B0\t¢\u0006\u0002\b\fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000E\u0010\u000F\u001AU\u0010\u0015\u001A\u00020\u000B2\b\b\u0002\u0010\u0001\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\n\b\u0002\u0010\u0012\u001A\u0004\u0018\u00010\u00112\u0017\u0010\r\u001A\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000B0\t¢\u0006\u0002\b\fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "", "isOpaque", "Landroidx/compose/ui/unit/IntSize;", "surfaceSize", "Landroidx/compose/foundation/AndroidExternalSurfaceZOrder;", "zOrder", "isSecure", "Lkotlin/Function1;", "Landroidx/compose/foundation/AndroidExternalSurfaceScope;", "", "Lkotlin/ExtensionFunctionType;", "onInit", "AndroidExternalSurface-58FFMhA", "(Landroidx/compose/ui/Modifier;ZJIZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "AndroidExternalSurface", "Landroidx/compose/ui/graphics/Matrix;", "transform", "AndroidEmbeddedExternalSurface-sv6N_fY", "(Landroidx/compose/ui/Modifier;ZJ[FLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "AndroidEmbeddedExternalSurface", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAndroidExternalSurface.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidExternalSurface.android.kt\nandroidx/compose/foundation/AndroidExternalSurface_androidKt\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,480:1\n488#2:481\n487#2,4:482\n491#2,2:489\n495#2:495\n488#2:514\n487#2,4:515\n491#2,2:522\n495#2:528\n1223#3,3:486\n1226#3,3:492\n1223#3,6:496\n1223#3,6:502\n1223#3,6:508\n1223#3,3:519\n1226#3,3:525\n1223#3,6:529\n1223#3,6:535\n1223#3,6:541\n487#4:491\n487#4:524\n*S KotlinDebug\n*F\n+ 1 AndroidExternalSurface.android.kt\nandroidx/compose/foundation/AndroidExternalSurface_androidKt\n*L\n191#1:481\n191#1:482,4\n191#1:489,2\n191#1:495\n385#1:514\n385#1:515,4\n385#1:522,2\n385#1:528\n191#1:486,3\n191#1:492,3\n192#1:496,6\n292#1:502,6\n300#1:508,6\n385#1:519,3\n385#1:525,3\n386#1:529,6\n459#1:535,6\n468#1:541,6\n191#1:491\n385#1:524\n*E\n"})
public final class AndroidExternalSurface_androidKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void AndroidEmbeddedExternalSurface-sv6N_fY(@Nullable Modifier modifier0, boolean z, long v, @Nullable float[] arr_f, @NotNull Function1 function10, @Nullable Composer composer0, int v1, int v2) {
        long v5;
        Modifier modifier1;
        float[] arr_f1;
        float[] arr_f2;
        long v8;
        boolean z2;
        int v7;
        long v4;
        boolean z1;
        int v3;
        Composer composer1 = composer0.startRestartGroup(0xCF76AC2);
        if((v2 & 1) == 0) {
            v3 = (v1 & 6) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v1 : v1;
        }
        else {
            v3 = v1 | 6;
        }
        if((v2 & 2) != 0) {
            v3 |= 0x30;
            z1 = z;
        }
        else if((v1 & 0x30) == 0) {
            z1 = z;
            v3 |= (composer1.changed(z1) ? 0x20 : 16);
        }
        else {
            z1 = z;
        }
        if((v1 & 0x180) == 0) {
            v4 = v;
            v3 |= ((v2 & 4) != 0 || !composer1.changed(v4) ? 0x80 : 0x100);
        }
        else {
            v4 = v;
        }
        if((v2 & 8) != 0) {
            v3 |= 0xC00;
        }
        else if((v1 & 0xC00) == 0) {
            v3 |= (composer1.changedInstance((arr_f == null ? null : Matrix.box-impl(arr_f))) ? 0x800 : 0x400);
        }
        if((v2 & 16) != 0) {
            v3 |= 0x6000;
        }
        else if((v1 & 0x6000) == 0) {
            v3 |= (composer1.changedInstance(function10) ? 0x4000 : 0x2000);
        }
        if((v3 & 9363) != 9362 || !composer1.getSkipping()) {
            composer1.startDefaults();
            int v6 = 1;
            if((v1 & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier1 = (v2 & 1) == 0 ? modifier0 : Modifier.Companion;
                if((v2 & 2) != 0) {
                    z1 = true;
                }
                if((v2 & 4) != 0) {
                    v4 = 0L;
                    v3 &= -897;
                }
                if((v2 & 8) == 0) {
                    arr_f2 = arr_f;
                label_60:
                    v7 = v3;
                    z2 = z1;
                    v8 = v4;
                }
                else {
                    v7 = v3;
                    z2 = z1;
                    v8 = v4;
                    arr_f2 = null;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v2 & 4) != 0) {
                    v3 &= -897;
                }
                arr_f2 = arr_f;
                modifier1 = modifier0;
                goto label_60;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xCF76AC2, v7, -1, "androidx.compose.foundation.AndroidEmbeddedExternalSurface (AndroidExternalSurface.android.kt:454)");
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xC0F8CA83, 0, -1, "androidx.compose.foundation.rememberAndroidEmbeddedExternalSurfaceState (AndroidExternalSurface.android.kt:383)");
            }
            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller0 = composer1.rememberedValue();
            Companion composer$Companion0 = Composer.Companion;
            if(compositionScopedCoroutineScopeCanceller0 == composer$Companion0.getEmpty()) {
                compositionScopedCoroutineScopeCanceller0 = a.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer1), composer1);
            }
            CoroutineScope coroutineScope0 = compositionScopedCoroutineScopeCanceller0.getCoroutineScope();
            m m0 = composer1.rememberedValue();
            if(m0 == composer$Companion0.getEmpty()) {
                m0 = new m(coroutineScope0);
                composer1.updateRememberedValue(m0);
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            boolean z3 = composer1.changedInstance(m0);
            int v9 = v7 & 0x380 ^ 0x180;
            boolean z4 = v9 > 0x100 && composer1.changed(v8) || (v7 & 0x180) == 0x100;
            jr jr0 = composer1.rememberedValue();
            if((z4 | z3 | ((0xE000 & v7) == 0x4000 ? 1 : 0)) != 0 || jr0 == composer$Companion0.getEmpty()) {
                jr0 = new jr(m0, v8, function10);
                composer1.updateRememberedValue(jr0);
            }
            boolean z5 = v9 > 0x100 && composer1.changed(v8) || (v7 & 0x180) == 0x100;
            boolean z6 = composer1.changedInstance(m0);
            if((v7 & 0x70) != 0x20) {
                v6 = 0;
            }
            boolean z7 = composer1.changedInstance((arr_f2 == null ? null : Matrix.box-impl(arr_f2)));
            p p0 = composer1.rememberedValue();
            if((z5 | z6 | v6 | z7) != 0 || p0 == composer$Companion0.getEmpty()) {
                p0 = new p(v8, m0, z2, arr_f2);
                composer1.updateRememberedValue(p0);
            }
            AndroidView_androidKt.AndroidView(jr0, modifier1, o.x, null, p0, composer1, v7 << 3 & 0x70 | 0x180, 8);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z1 = z2;
            v5 = v8;
            arr_f1 = arr_f2;
        }
        else {
            composer1.skipToGroupEnd();
            arr_f1 = arr_f;
            modifier1 = modifier0;
            v5 = v4;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new q(modifier1, z1, v5, arr_f1, function10, v1, v2));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void AndroidExternalSurface-58FFMhA(@Nullable Modifier modifier0, boolean z, long v, int v1, boolean z1, @NotNull Function1 function10, @Nullable Composer composer0, int v2, int v3) {
        int v8;
        boolean z3;
        long v7;
        Modifier modifier1;
        boolean z5;
        boolean z4;
        int v6;
        long v5;
        boolean z2;
        int v4;
        Composer composer1 = composer0.startRestartGroup(0x2633308E);
        if((v3 & 1) == 0) {
            v4 = (v2 & 6) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v2 : v2;
        }
        else {
            v4 = v2 | 6;
        }
        if((v3 & 2) != 0) {
            v4 |= 0x30;
            z2 = z;
        }
        else if((v2 & 0x30) == 0) {
            z2 = z;
            v4 |= (composer1.changed(z2) ? 0x20 : 16);
        }
        else {
            z2 = z;
        }
        if((v2 & 0x180) == 0) {
            v5 = v;
            v4 |= ((v3 & 4) != 0 || !composer1.changed(v5) ? 0x80 : 0x100);
        }
        else {
            v5 = v;
        }
        if((v3 & 8) != 0) {
            v4 |= 0xC00;
            v6 = v1;
        }
        else if((v2 & 0xC00) == 0) {
            v6 = v1;
            v4 |= (composer1.changed(v6) ? 0x800 : 0x400);
        }
        else {
            v6 = v1;
        }
        if((v3 & 16) != 0) {
            v4 |= 0x6000;
        }
        else if((v2 & 0x6000) == 0) {
            v4 |= (composer1.changed(z1) ? 0x4000 : 0x2000);
        }
        if((v3 & 0x20) != 0) {
            v4 |= 0x30000;
        }
        else if((v2 & 0x30000) == 0) {
            v4 |= (composer1.changedInstance(function10) ? 0x20000 : 0x10000);
        }
        if((v4 & 74899) != 74898 || !composer1.getSkipping()) {
            composer1.startDefaults();
            int v9 = 0;
            if((v2 & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier1 = (v3 & 1) == 0 ? modifier0 : Modifier.Companion;
                if((v3 & 2) != 0) {
                    z2 = true;
                }
                if((v3 & 4) != 0) {
                    v4 &= -897;
                    v5 = 0L;
                }
                if((v3 & 8) != 0) {
                    v6 = 0;
                }
                z4 = z2;
                z5 = (v3 & 16) == 0 ? z1 : false;
            }
            else {
                composer1.skipToGroupEnd();
                if((v3 & 4) != 0) {
                    v4 &= -897;
                }
                modifier1 = modifier0;
                z4 = z2;
                z5 = z1;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x2633308E, v4, -1, "androidx.compose.foundation.AndroidExternalSurface (AndroidExternalSurface.android.kt:287)");
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xCBEDADC3, 0, -1, "androidx.compose.foundation.rememberAndroidExternalSurfaceState (AndroidExternalSurface.android.kt:189)");
            }
            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller0 = composer1.rememberedValue();
            Companion composer$Companion0 = Composer.Companion;
            if(compositionScopedCoroutineScopeCanceller0 == composer$Companion0.getEmpty()) {
                compositionScopedCoroutineScopeCanceller0 = a.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer1), composer1);
            }
            CoroutineScope coroutineScope0 = compositionScopedCoroutineScopeCanceller0.getCoroutineScope();
            n n0 = composer1.rememberedValue();
            if(n0 == composer$Companion0.getEmpty()) {
                n0 = new n(coroutineScope0);  // 初始化器: Lu/w;-><init>(Lkotlinx/coroutines/CoroutineScope;)V
                n0.f = -1;
                n0.g = -1;
                composer1.updateRememberedValue(n0);
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            boolean z6 = composer1.changedInstance(n0);
            b2 b20 = composer1.rememberedValue();
            if((0x70000 & v4) == 0x20000 || z6 || b20 == composer$Companion0.getEmpty()) {
                b20 = new b2(28, function10, n0);
                composer1.updateRememberedValue(b20);
            }
            int v10 = ((v4 & 0x380 ^ 0x180) <= 0x100 || !composer1.changed(v5)) && (v4 & 0x180) != 0x100 ? 0 : 1;
            if((0xE000 & v4) == 0x4000) {
                v9 = 1;
            }
            androidx.compose.foundation.a a0 = composer1.rememberedValue();
            if((v9 | (v10 | ((v4 & 0x70) == 0x20 ? 1 : 0) | ((v4 & 0x1C00) == 0x800 ? 1 : 0))) != 0 || a0 == composer$Companion0.getEmpty()) {
                a0 = new androidx.compose.foundation.a(v5, z4, v6, z5);
                composer1.updateRememberedValue(a0);
            }
            AndroidView_androidKt.AndroidView(b20, modifier1, o.y, null, a0, composer1, v4 << 3 & 0x70 | 0x180, 8);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z2 = z4;
            v7 = v5;
            v8 = v6;
            z3 = z5;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            v7 = v5;
            z3 = z1;
            v8 = v6;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new r(modifier1, z2, v7, v8, z3, function10, v2, v3));
        }
    }
}

