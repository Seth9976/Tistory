package androidx.compose.foundation.layout;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment.Horizontal;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.room.a;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u001AL\u0010\f\u001A\u00020\b2\b\b\u0002\u0010\u0001\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\u001C\u0010\u000B\u001A\u0018\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t¢\u0006\u0002\b\nH\u0087\b¢\u0006\u0004\b\f\u0010\r\u001A\u001F\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u0004H\u0001¢\u0006\u0004\b\u000F\u0010\u0010\u001A7\u0010\u0019\u001A\u00020\u00182\u0006\u0010\u0012\u001A\u00020\u00112\u0006\u0010\u0014\u001A\u00020\u00132\u0006\u0010\u0015\u001A\u00020\u00132\u0006\u0010\u0016\u001A\u00020\u00132\u0006\u0010\u0017\u001A\u00020\u0013H\u0000¢\u0006\u0004\b\u0019\u0010\u001A\" \u0010!\u001A\u00020\u000E8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u001B\u0010\u001C\u0012\u0004\b\u001F\u0010 \u001A\u0004\b\u001D\u0010\u001E¨\u0006\""}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "verticalArrangement", "Landroidx/compose/ui/Alignment$Horizontal;", "horizontalAlignment", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "content", "Column", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/layout/MeasurePolicy;", "columnMeasurePolicy", "(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;", "", "isPrioritizing", "", "mainAxisMin", "crossAxisMin", "mainAxisMax", "crossAxisMax", "Landroidx/compose/ui/unit/Constraints;", "createColumnConstraints", "(ZIIII)J", "a", "Landroidx/compose/ui/layout/MeasurePolicy;", "getDefaultColumnMeasurePolicy", "()Landroidx/compose/ui/layout/MeasurePolicy;", "getDefaultColumnMeasurePolicy$annotations", "()V", "DefaultColumnMeasurePolicy", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nColumn.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 2 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/Updater\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,397:1\n78#2,6:398\n85#2,4:413\n89#2,2:423\n93#2:428\n368#3,9:404\n377#3,3:425\n4032#4,6:417\n1223#5,6:429\n*S KotlinDebug\n*F\n+ 1 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n*L\n87#1:398,6\n87#1:413,4\n87#1:423,2\n87#1:428\n87#1:404,9\n87#1:425,3\n87#1:417,6\n109#1:429,6\n*E\n"})
public final class ColumnKt {
    public static final ColumnMeasurePolicy a;

    static {
        ColumnKt.a = new ColumnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart());
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void Column(@Nullable Modifier modifier0, @Nullable Vertical arrangement$Vertical0, @Nullable Horizontal alignment$Horizontal0, @NotNull Function3 function30, @Nullable Composer composer0, int v, int v1) {
        if((v1 & 1) != 0) {
            modifier0 = Modifier.Companion;
        }
        if((v1 & 2) != 0) {
            arrangement$Vertical0 = Arrangement.INSTANCE.getTop();
        }
        if((v1 & 4) != 0) {
            alignment$Horizontal0 = Alignment.Companion.getStart();
        }
        MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(arrangement$Vertical0, alignment$Horizontal0, composer0, v >> 3 & 0x7E);
        int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer0, 0);
        CompositionLocalMap compositionLocalMap0 = composer0.getCurrentCompositionLocalMap();
        Modifier modifier1 = ComposedModifierKt.materializeModifier(composer0, modifier0);
        Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
        Function0 function00 = composeUiNode$Companion0.getConstructor();
        if(composer0.getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        composer0.startReusableNode();
        if(composer0.getInserting()) {
            composer0.createNode(function00);
        }
        else {
            composer0.useNode();
        }
        Function2 function20 = a.r(composeUiNode$Companion0, composer0, measurePolicy0, composer0, compositionLocalMap0);
        if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v2)) {
            a.t(v2, composer0, v2, function20);
        }
        Updater.set-impl(composer0, modifier1, composeUiNode$Companion0.getSetModifier());
        function30.invoke(ColumnScopeInstance.INSTANCE, composer0, ((int)(v >> 6 & 0x70 | 6)));
        composer0.endNode();
    }

    @Composable
    @PublishedApi
    @NotNull
    public static final MeasurePolicy columnMeasurePolicy(@NotNull Vertical arrangement$Vertical0, @NotNull Horizontal alignment$Horizontal0, @Nullable Composer composer0, int v) {
        MeasurePolicy measurePolicy0;
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x40F63170, v, -1, "androidx.compose.foundation.layout.columnMeasurePolicy (Column.kt:105)");
        }
        if(!Intrinsics.areEqual(arrangement$Vertical0, Arrangement.INSTANCE.getTop()) || !Intrinsics.areEqual(alignment$Horizontal0, Alignment.Companion.getStart())) {
            composer0.startReplaceGroup(0x149E981F);
            int v1 = 0;
            int v2 = ((v & 14 ^ 6) <= 4 || !composer0.changed(arrangement$Vertical0)) && (v & 6) != 4 ? 0 : 1;
            if((v & 0x70 ^ 0x30) > 0x20 && composer0.changed(alignment$Horizontal0) || (v & 0x30) == 0x20) {
                v1 = 1;
            }
            ColumnMeasurePolicy columnMeasurePolicy0 = composer0.rememberedValue();
            if((v2 | v1) != 0 || columnMeasurePolicy0 == Composer.Companion.getEmpty()) {
                columnMeasurePolicy0 = new ColumnMeasurePolicy(arrangement$Vertical0, alignment$Horizontal0);
                composer0.updateRememberedValue(columnMeasurePolicy0);
            }
            measurePolicy0 = columnMeasurePolicy0;
            composer0.endReplaceGroup();
        }
        else {
            composer0.startReplaceGroup(345884104);
            composer0.endReplaceGroup();
            measurePolicy0 = ColumnKt.a;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return measurePolicy0;
    }

    public static final long createColumnConstraints(boolean z, int v, int v1, int v2, int v3) {
        return z ? Constraints.Companion.fitPrioritizingHeight-Zbe2FdA(v1, v3, v, v2) : ConstraintsKt.Constraints(v1, v3, v, v2);
    }

    @NotNull
    public static final MeasurePolicy getDefaultColumnMeasurePolicy() {
        return ColumnKt.a;
    }

    @PublishedApi
    public static void getDefaultColumnMeasurePolicy$annotations() {
    }
}

