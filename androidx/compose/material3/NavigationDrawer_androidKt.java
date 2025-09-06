package androidx.compose.material3;

import aa.d;
import androidx.activity.compose.PredictiveBackHandlerKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.room.a;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref.FloatRef;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u001A0\u0010\u0007\u001A\u00020\u00042\u0006\u0010\u0001\u001A\u00020\u00002\u0017\u0010\u0006\u001A\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005H\u0001¢\u0006\u0004\b\u0007\u0010\b\"\u001A\u0010\u000E\u001A\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u000B\u001A\u0004\b\f\u0010\r\"\u001A\u0010\u0011\u001A\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000F\u0010\u000B\u001A\u0004\b\u0010\u0010\r\"\u001A\u0010\u0014\u001A\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000B\u001A\u0004\b\u0013\u0010\r¨\u0006\u0015"}, d2 = {"Landroidx/compose/material3/DrawerState;", "drawerState", "Lkotlin/Function1;", "Landroidx/compose/material3/DrawerPredictiveBackState;", "", "Landroidx/compose/runtime/Composable;", "content", "DrawerPredictiveBackHandler", "(Landroidx/compose/material3/DrawerState;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/unit/Dp;", "a", "F", "getPredictiveBackDrawerMaxScaleXDistanceGrow", "()F", "PredictiveBackDrawerMaxScaleXDistanceGrow", "b", "getPredictiveBackDrawerMaxScaleXDistanceShrink", "PredictiveBackDrawerMaxScaleXDistanceShrink", "c", "getPredictiveBackDrawerMaxScaleYDistance", "PredictiveBackDrawerMaxScaleYDistance", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nNavigationDrawer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationDrawer.android.kt\nandroidx/compose/material3/NavigationDrawer_androidKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,102:1\n1223#2,6:103\n1223#2,3:114\n1226#2,3:120\n1223#2,6:126\n1223#2,6:132\n488#3:109\n487#3,4:110\n491#3,2:117\n495#3:123\n487#4:119\n77#5:124\n77#5:125\n148#6:138\n148#6:139\n148#6:140\n*S KotlinDebug\n*F\n+ 1 NavigationDrawer.android.kt\nandroidx/compose/material3/NavigationDrawer_androidKt\n*L\n46#1:103,6\n47#1:114,3\n47#1:120,3\n58#1:126,6\n90#1:132,6\n47#1:109\n47#1:110,4\n47#1:117,2\n47#1:123\n47#1:119\n48#1:124\n52#1:125\n99#1:138\n100#1:139\n101#1:140\n*E\n"})
public final class NavigationDrawer_androidKt {
    public static final float a;
    public static final float b;
    public static final float c;

    static {
        NavigationDrawer_androidKt.a = 12.0f;
        NavigationDrawer_androidKt.b = 24.0f;
        NavigationDrawer_androidKt.c = 48.0f;
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void DrawerPredictiveBackHandler(@NotNull DrawerState drawerState0, @NotNull Function3 function30, @Nullable Composer composer0, int v) {
        DrawerPredictiveBackState drawerPredictiveBackState2;
        DrawerPredictiveBackState drawerPredictiveBackState1;
        int v2;
        boolean z8;
        Composer composer1 = composer0.startRestartGroup(1444817207);
        int v1 = (v & 6) == 0 ? (composer1.changed(drawerState0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (composer1.changedInstance(function30) ? 0x20 : 16);
        }
        if((v1 & 19) != 18 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1444817207, v1, -1, "androidx.compose.material3.DrawerPredictiveBackHandler (NavigationDrawer.android.kt:44)");
            }
            DrawerPredictiveBackState drawerPredictiveBackState0 = composer1.rememberedValue();
            Companion composer$Companion0 = Composer.Companion;
            if(drawerPredictiveBackState0 == composer$Companion0.getEmpty()) {
                drawerPredictiveBackState0 = new DrawerPredictiveBackState();
                composer1.updateRememberedValue(drawerPredictiveBackState0);
            }
            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller0 = composer1.rememberedValue();
            if(compositionScopedCoroutineScopeCanceller0 == composer$Companion0.getEmpty()) {
                compositionScopedCoroutineScopeCanceller0 = a.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer1), composer1);
            }
            CoroutineScope coroutineScope0 = compositionScopedCoroutineScopeCanceller0.getCoroutineScope();
            boolean z = true;
            boolean z1 = composer1.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl;
            FloatRef ref$FloatRef0 = new FloatRef();
            FloatRef ref$FloatRef1 = new FloatRef();
            FloatRef ref$FloatRef2 = new FloatRef();
            Density density0 = (Density)composer1.consume(CompositionLocalsKt.getLocalDensity());
            ref$FloatRef0.element = density0.toPx-0680j_4(NavigationDrawer_androidKt.a);
            ref$FloatRef1.element = density0.toPx-0680j_4(NavigationDrawer_androidKt.b);
            ref$FloatRef2.element = density0.toPx-0680j_4(NavigationDrawer_androidKt.c);
            boolean z2 = drawerState0.isOpen();
            boolean z3 = composer1.changed(z1);
            boolean z4 = composer1.changed(ref$FloatRef0.element);
            boolean z5 = composer1.changed(ref$FloatRef1.element);
            boolean z6 = composer1.changed(ref$FloatRef2.element);
            boolean z7 = composer1.changedInstance(coroutineScope0);
            zf zf0 = composer1.rememberedValue();
            if((z3 | z4 | z5 | z6 | z7 | ((v1 & 14) == 4 ? 1 : 0)) != 0 || zf0 == composer$Companion0.getEmpty()) {
                z8 = z2;
                v2 = v1 & 14;
                drawerPredictiveBackState1 = drawerPredictiveBackState0;
                zf0 = new zf(drawerPredictiveBackState0, coroutineScope0, drawerState0, z1, ref$FloatRef0, ref$FloatRef1, ref$FloatRef2, null);
                composer1.updateRememberedValue(zf0);
            }
            else {
                z8 = z2;
                v2 = v1 & 14;
                drawerPredictiveBackState1 = drawerPredictiveBackState0;
            }
            PredictiveBackHandlerKt.PredictiveBackHandler(z8, zf0, composer1, 0, 0);
            Boolean boolean0 = Boolean.valueOf(drawerState0.isClosed());
            if(v2 != 4) {
                z = false;
            }
            ag ag0 = composer1.rememberedValue();
            if(z || ag0 == composer$Companion0.getEmpty()) {
                drawerPredictiveBackState2 = drawerPredictiveBackState1;
                ag0 = new ag(drawerState0, drawerPredictiveBackState2, null);
                composer1.updateRememberedValue(ag0);
            }
            else {
                drawerPredictiveBackState2 = drawerPredictiveBackState1;
            }
            EffectsKt.LaunchedEffect(boolean0, ag0, composer1, 0);
            function30.invoke(drawerPredictiveBackState2, composer1, ((int)(v1 & 0x70 | 6)));
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new d(drawerState0, function30, v, 3));
        }
    }

    public static final float getPredictiveBackDrawerMaxScaleXDistanceGrow() {
        return NavigationDrawer_androidKt.a;
    }

    public static final float getPredictiveBackDrawerMaxScaleXDistanceShrink() {
        return NavigationDrawer_androidKt.b;
    }

    public static final float getPredictiveBackDrawerMaxScaleYDistance() {
        return NavigationDrawer_androidKt.c;
    }
}

