package androidx.compose.material.pullrefresh;

import androidx.compose.material.ExperimentalMaterialApi;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.room.a;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref.FloatRef;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.q;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import t0.l;

@Metadata(d1 = {"\u0000 \n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001A<\u0010\u000B\u001A\u00020\b2\u0006\u0010\u0001\u001A\u00020\u00002\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\u0007\u001A\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\f"}, d2 = {"", "refreshing", "Lkotlin/Function0;", "", "onRefresh", "Landroidx/compose/ui/unit/Dp;", "refreshThreshold", "refreshingOffset", "Landroidx/compose/material/pullrefresh/PullRefreshState;", "rememberPullRefreshState-UuyPYSY", "(ZLkotlin/jvm/functions/Function0;FFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/pullrefresh/PullRefreshState;", "rememberPullRefreshState", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPullRefreshState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PullRefreshState.kt\nandroidx/compose/material/pullrefresh/PullRefreshStateKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 8 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,234:1\n154#2:235\n1#3:236\n487#4,4:237\n491#4,2:245\n495#4:251\n25#5:241\n36#5:253\n1116#6,3:242\n1119#6,3:248\n1116#6,6:254\n487#7:247\n74#8:252\n*S KotlinDebug\n*F\n+ 1 PullRefreshState.kt\nandroidx/compose/material/pullrefresh/PullRefreshStateKt\n*L\n63#1:235\n65#1:237,4\n65#1:245,2\n65#1:251\n65#1:241\n75#1:253\n65#1:242,3\n65#1:248,3\n75#1:254,6\n65#1:247\n70#1:252\n*E\n"})
public final class PullRefreshStateKt {
    @ExperimentalMaterialApi
    @Composable
    @NotNull
    public static final PullRefreshState rememberPullRefreshState-UuyPYSY(boolean z, @NotNull Function0 function00, float f, float f1, @Nullable Composer composer0, int v, int v1) {
        composer0.startReplaceableGroup(0xF5920E18);
        if((v1 & 4) != 0) {
            f = 80.0f;
        }
        if((v1 & 8) != 0) {
            f1 = 56.0f;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xF5920E18, v, -1, "androidx.compose.material.pullrefresh.rememberPullRefreshState (PullRefreshState.kt:61)");
        }
        if(Dp.compareTo-0680j_4(f, 0.0f) <= 0) {
            throw new IllegalArgumentException("The refresh trigger must be greater than zero!");
        }
        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller0 = q.h(0x2E20B340, composer0, 0xE2A708A4);
        Companion composer$Companion0 = Composer.Companion;
        if(compositionScopedCoroutineScopeCanceller0 == composer$Companion0.getEmpty()) {
            compositionScopedCoroutineScopeCanceller0 = a.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer0), composer0);
        }
        composer0.endReplaceableGroup();
        CoroutineScope coroutineScope0 = compositionScopedCoroutineScopeCanceller0.getCoroutineScope();
        composer0.endReplaceableGroup();
        State state0 = SnapshotStateKt.rememberUpdatedState(function00, composer0, v >> 3 & 14);
        FloatRef ref$FloatRef0 = new FloatRef();
        FloatRef ref$FloatRef1 = new FloatRef();
        Density density0 = (Density)composer0.consume(CompositionLocalsKt.getLocalDensity());
        ref$FloatRef0.element = density0.toPx-0680j_4(f);
        ref$FloatRef1.element = density0.toPx-0680j_4(f1);
        composer0.startReplaceableGroup(0x44FAF204);
        boolean z1 = composer0.changed(coroutineScope0);
        PullRefreshState pullRefreshState0 = composer0.rememberedValue();
        if(z1 || pullRefreshState0 == composer$Companion0.getEmpty()) {
            pullRefreshState0 = new PullRefreshState(coroutineScope0, state0, ref$FloatRef1.element, ref$FloatRef0.element);
            composer0.updateRememberedValue(pullRefreshState0);
        }
        composer0.endReplaceableGroup();
        EffectsKt.SideEffect(new l(pullRefreshState0, z, ref$FloatRef0, ref$FloatRef1), composer0, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
        return pullRefreshState0;
    }
}

