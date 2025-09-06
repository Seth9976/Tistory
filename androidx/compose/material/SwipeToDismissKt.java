package androidx.compose.material;

import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.material3.pi;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Modifier;
import j0.t1;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.n9;
import p0.o9;
import p0.p9;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001A/\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\u0001\u001A\u00020\u00002\u0014\b\u0002\u0010\u0004\u001A\u000E\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001A\u0083\u0001\u0010\u0016\u001A\u00020\u00112\u0006\u0010\b\u001A\u00020\u00052\b\b\u0002\u0010\n\u001A\u00020\t2\u000E\b\u0002\u0010\r\u001A\b\u0012\u0004\u0012\u00020\f0\u000B2\u0014\b\u0002\u0010\u000F\u001A\u000E\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000E0\u00022\u001C\u0010\u0014\u001A\u0018\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u0002¢\u0006\u0002\b\u0012¢\u0006\u0002\b\u00132\u001C\u0010\u0015\u001A\u0018\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u0002¢\u0006\u0002\b\u0012¢\u0006\u0002\b\u0013H\u0007¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Landroidx/compose/material/DismissValue;", "initialValue", "Lkotlin/Function1;", "", "confirmStateChange", "Landroidx/compose/material/DismissState;", "rememberDismissState", "(Landroidx/compose/material/DismissValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/DismissState;", "state", "Landroidx/compose/ui/Modifier;", "modifier", "", "Landroidx/compose/material/DismissDirection;", "directions", "Landroidx/compose/material/ThresholdConfig;", "dismissThresholds", "Landroidx/compose/foundation/layout/RowScope;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "background", "dismissContent", "SwipeToDismiss", "(Landroidx/compose/material/DismissState;Landroidx/compose/ui/Modifier;Ljava/util/Set;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSwipeToDismiss.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwipeToDismiss.kt\nandroidx/compose/material/SwipeToDismissKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,245:1\n1116#2,6:246\n154#3:252\n*S KotlinDebug\n*F\n+ 1 SwipeToDismiss.kt\nandroidx/compose/material/SwipeToDismissKt\n*L\n154#1:246,6\n244#1:252\n*E\n"})
public final class SwipeToDismissKt {
    public static final float a;

    static {
        SwipeToDismissKt.a = 56.0f;
    }

    @ExperimentalMaterialApi
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void SwipeToDismiss(@NotNull DismissState dismissState0, @Nullable Modifier modifier0, @Nullable Set set0, @Nullable Function1 function10, @NotNull Function3 function30, @NotNull Function3 function31, @Nullable Composer composer0, int v, int v1) {
        Function1 function11;
        Modifier modifier1;
        Set set1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0x25CFDF6F);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changed(dismissState0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x70) == 0) {
            v2 |= (composer1.changed(modifier0) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x80;
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0x1C00) == 0) {
            v2 |= (composer1.changedInstance(function10) ? 0x800 : 0x400);
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
        }
        else if((0xE000 & v) == 0) {
            v2 |= (composer1.changedInstance(function30) ? 0x4000 : 0x2000);
        }
        if((v1 & 0x20) != 0) {
            v2 |= 0x30000;
        }
        else if((0x70000 & v) == 0) {
            v2 |= (composer1.changedInstance(function31) ? 0x20000 : 0x10000);
        }
        if((v1 & 4) != 4 || (0x5B6DB & v2) != 74898 || !composer1.getSkipping()) {
            modifier1 = (v1 & 2) == 0 ? modifier0 : Modifier.Companion;
            set1 = (v1 & 4) == 0 ? set0 : f0.setOf(new DismissDirection[]{DismissDirection.EndToStart, DismissDirection.StartToEnd});
            Function1 function12 = (v1 & 8) == 0 ? function10 : n9.w;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x25CFDF6F, v2, -1, "androidx.compose.material.SwipeToDismiss (SwipeToDismiss.kt:182)");
            }
            BoxWithConstraintsKt.BoxWithConstraints(modifier1, null, false, ComposableLambdaKt.composableLambda(composer1, 338007641, true, new o9(set1, function12, dismissState0, function30, function31)), composer1, v2 >> 3 & 14 | 0xC00, 6);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function11 = function12;
        }
        else {
            composer1.skipToGroupEnd();
            set1 = set0;
            modifier1 = modifier0;
            function11 = function10;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new pi(dismissState0, modifier1, set1, function11, function30, function31, v, v1, 3));
        }
    }

    public static final float access$getDISMISS_THRESHOLD$p() [...] // 潜在的解密器

    public static final DismissDirection access$getDismissDirection(DismissValue dismissValue0, DismissValue dismissValue1) {
        if(dismissValue0 != dismissValue1 || dismissValue0 != DismissValue.Default) {
            if(dismissValue0 == dismissValue1 && dismissValue0 == DismissValue.DismissedToEnd) {
                return DismissDirection.StartToEnd;
            }
            if(dismissValue0 == dismissValue1 && dismissValue0 == DismissValue.DismissedToStart) {
                return DismissDirection.EndToStart;
            }
            DismissValue dismissValue2 = DismissValue.Default;
            if(dismissValue0 == dismissValue2 && dismissValue1 == DismissValue.DismissedToEnd) {
                return DismissDirection.StartToEnd;
            }
            if(dismissValue0 == dismissValue2 && dismissValue1 == DismissValue.DismissedToStart) {
                return DismissDirection.EndToStart;
            }
            if(dismissValue0 == DismissValue.DismissedToEnd && dismissValue1 == dismissValue2) {
                return DismissDirection.StartToEnd;
            }
            return dismissValue0 != DismissValue.DismissedToStart || dismissValue1 != dismissValue2 ? null : DismissDirection.EndToStart;
        }
        return null;
    }

    @ExperimentalMaterialApi
    @Composable
    @NotNull
    public static final DismissState rememberDismissState(@Nullable DismissValue dismissValue0, @Nullable Function1 function10, @Nullable Composer composer0, int v, int v1) {
        composer0.startReplaceableGroup(0x977B5DF2);
        if((v1 & 1) != 0) {
            dismissValue0 = DismissValue.Default;
        }
        if((v1 & 2) != 0) {
            function10 = p9.w;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x977B5DF2, v, -1, "androidx.compose.material.rememberDismissState (SwipeToDismiss.kt:152)");
        }
        Saver saver0 = DismissState.Companion.Saver(function10);
        composer0.startReplaceableGroup(0x5C0EBE5);
        boolean z = composer0.changed(dismissValue0);
        boolean z1 = composer0.changedInstance(function10);
        t1 t10 = composer0.rememberedValue();
        if(z || z1 || t10 == Composer.Companion.getEmpty()) {
            t10 = new t1(29, dismissValue0, function10);
            composer0.updateRememberedValue(t10);
        }
        composer0.endReplaceableGroup();
        DismissState dismissState0 = (DismissState)RememberSaveableKt.rememberSaveable(new Object[0], saver0, null, t10, composer0, 72, 4);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
        return dismissState0;
    }
}

