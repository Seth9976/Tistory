package androidx.compose.foundation.layout;

import android.os.Build.VERSION;
import android.view.View;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001A\u0013\u0010\u0001\u001A\u00020\u0000*\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\u001A\"\u0010\n\u001A\u00020\u00072\u0006\u0010\u0004\u001A\u00020\u00032\u0006\u0010\u0006\u001A\u00020\u0005H\u0001ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u000B"}, d2 = {"Landroidx/compose/ui/Modifier;", "imeNestedScroll", "(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/layout/AndroidWindowInsets;", "windowInsets", "Landroidx/compose/foundation/layout/WindowInsetsSides;", "side", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "rememberWindowInsetsConnection-VRgvIgI", "(Landroidx/compose/foundation/layout/AndroidWindowInsets;ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "rememberWindowInsetsConnection", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nWindowInsetsConnection.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/WindowInsetsConnection_androidKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,725:1\n135#2:726\n77#3:727\n77#3:728\n77#3:729\n1223#4,6:730\n1223#4,6:736\n*S KotlinDebug\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/WindowInsetsConnection_androidKt\n*L\n77#1:726\n113#1:727\n115#1:728\n116#1:729\n117#1:730,6\n120#1:736,6\n*E\n"})
public final class WindowInsetsConnection_androidKt {
    public static final float a;
    public static final double b;
    public static final double c;

    static {
        WindowInsetsConnection_androidKt.a = 0.015f;
        WindowInsetsConnection_androidKt.b = 2.358202;
        WindowInsetsConnection_androidKt.c = 1.358202;
    }

    public static final double access$getDecelMinusOne$p() [...] // 潜在的解密器

    public static final double access$getDecelerationRate$p() [...] // 潜在的解密器

    public static final float access$getPlatformFlingScrollFriction$p() [...] // 潜在的解密器

    // 去混淆评级： 低(30)
    @ExperimentalLayoutApi
    @NotNull
    public static final Modifier imeNestedScroll(@NotNull Modifier modifier0) {
        return Build.VERSION.SDK_INT >= 30 ? ComposedModifierKt.composed(modifier0, InspectableValueKt.getNoInspectorInfo(), c4.w) : modifier0;

        @Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001A\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/InspectorInfo;", "invoke", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1"}, k = 3, mv = {1, 8, 0}, xi = 0x30)
        @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/WindowInsetsConnection_androidKt\n*L\n1#1,178:1\n78#2,2:179\n*E\n"})
        public final class androidx.compose.foundation.layout.WindowInsetsConnection_androidKt.imeNestedScroll..inlined.debugInspectorInfo.1 extends Lambda implements Function1 {
            public androidx.compose.foundation.layout.WindowInsetsConnection_androidKt.imeNestedScroll..inlined.debugInspectorInfo.1() {
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((InspectorInfo)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull InspectorInfo inspectorInfo0) {
                inspectorInfo0.setName("imeNestedScroll");
            }
        }

    }

    @ExperimentalLayoutApi
    @Composable
    @NotNull
    public static final NestedScrollConnection rememberWindowInsetsConnection-VRgvIgI(@NotNull AndroidWindowInsets androidWindowInsets0, int v, @Nullable Composer composer0, int v1) {
        composer0.startReplaceGroup(-1011341039);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1011341039, v1, -1, "androidx.compose.foundation.layout.rememberWindowInsetsConnection (WindowInsetsConnection.android.kt:108)");
        }
        if(Build.VERSION.SDK_INT < 30) {
            NestedScrollConnection nestedScrollConnection0 = e1.a;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer0.endReplaceGroup();
            return nestedScrollConnection0;
        }
        LayoutDirection layoutDirection0 = (LayoutDirection)composer0.consume(CompositionLocalsKt.getLocalLayoutDirection());
        SideCalculator sideCalculator0 = SideCalculator.Companion.chooseCalculator-ni1skBw(v, layoutDirection0);
        View view0 = (View)composer0.consume(AndroidCompositionLocals_androidKt.getLocalView());
        Density density0 = (Density)composer0.consume(CompositionLocalsKt.getLocalDensity());
        boolean z = (v1 & 14 ^ 6) > 4 && composer0.changed(androidWindowInsets0) || (v1 & 6) == 4;
        boolean z1 = composer0.changed(view0);
        boolean z2 = composer0.changed(sideCalculator0);
        boolean z3 = composer0.changed(density0);
        n4 n40 = composer0.rememberedValue();
        if((z | z1 | z2 | z3) != 0 || n40 == Composer.Companion.getEmpty()) {
            n40 = new n4(androidWindowInsets0, view0, sideCalculator0, density0);
            composer0.updateRememberedValue(n40);
        }
        boolean z4 = composer0.changedInstance(n40);
        k4 k40 = composer0.rememberedValue();
        if(z4 || k40 == Composer.Companion.getEmpty()) {
            k40 = new k4(n40, 1);
            composer0.updateRememberedValue(k40);
        }
        EffectsKt.DisposableEffect(n40, k40, composer0, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceGroup();
        return n40;
    }
}

