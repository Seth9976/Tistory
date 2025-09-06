package androidx.compose.foundation.layout;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ExperimentalLayoutApi
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/ContextualFlowRowOverflow;", "Landroidx/compose/foundation/layout/FlowLayoutOverflow;", "Companion", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class ContextualFlowRowOverflow extends FlowLayoutOverflow {
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000E\b\u0086\u0003\u0018\u00002\u00020\u0001J-\u0010\t\u001A\u00020\b2\u001C\u0010\u0007\u001A\u0018\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005¢\u0006\u0002\b\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJb\u0010\u0012\u001A\u00020\b2\u001C\u0010\t\u001A\u0018\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005¢\u0006\u0002\b\u00062\u001C\u0010\u000B\u001A\u0018\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005¢\u0006\u0002\b\u00062\b\b\u0002\u0010\r\u001A\u00020\f2\b\b\u0002\u0010\u000F\u001A\u00020\u000EH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0013\u001A\u00020\b8GX\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u0012\u0004\b\u0017\u0010\u0018\u001A\u0004\b\u0015\u0010\u0016R \u0010\u0019\u001A\u00020\b8GX\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010\u0014\u0012\u0004\b\u001B\u0010\u0018\u001A\u0004\b\u001A\u0010\u0016\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u001C"}, d2 = {"Landroidx/compose/foundation/layout/ContextualFlowRowOverflow$Companion;", "", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ContextualFlowRowOverflowScope;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "content", "Landroidx/compose/foundation/layout/ContextualFlowRowOverflow;", "expandIndicator", "(Lkotlin/jvm/functions/Function3;)Landroidx/compose/foundation/layout/ContextualFlowRowOverflow;", "collapseIndicator", "", "minRowsToShowCollapse", "Landroidx/compose/ui/unit/Dp;", "minHeightToShowCollapse", "expandOrCollapseIndicator--jt2gSs", "(Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;IFLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/layout/ContextualFlowRowOverflow;", "expandOrCollapseIndicator", "Visible", "Landroidx/compose/foundation/layout/ContextualFlowRowOverflow;", "getVisible", "()Landroidx/compose/foundation/layout/ContextualFlowRowOverflow;", "getVisible$annotations", "()V", "Clip", "getClip", "getClip$annotations", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nFlowLayoutOverflow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowLayoutOverflow.kt\nandroidx/compose/foundation/layout/ContextualFlowRowOverflow$Companion\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,906:1\n148#2:907\n77#3:908\n1223#4,6:909\n*S KotlinDebug\n*F\n+ 1 FlowLayoutOverflow.kt\nandroidx/compose/foundation/layout/ContextualFlowRowOverflow$Companion\n*L\n457#1:907\n459#1:908\n462#1:909,6\n*E\n"})
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @ExperimentalLayoutApi
        @NotNull
        public final ContextualFlowRowOverflow expandIndicator(@NotNull Function3 function30) {
            n0 n00 = new n0(function30);
            return new ContextualFlowRowOverflow(OverflowType.ExpandIndicator, n00, 22);
        }

        @ExperimentalLayoutApi
        @Composable
        @NotNull
        public final ContextualFlowRowOverflow expandOrCollapseIndicator--jt2gSs(@NotNull Function3 function30, @NotNull Function3 function31, int v, float f, @Nullable Composer composer0, int v1, int v2) {
            int v3 = 1;
            int v4 = (v2 & 4) == 0 ? v : 1;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1435293820, v1, -1, "androidx.compose.foundation.layout.ContextualFlowRowOverflow.Companion.expandOrCollapseIndicator (FlowLayoutOverflow.kt:457)");
            }
            int v5 = ((Density)composer0.consume(CompositionLocalsKt.getLocalDensity())).roundToPx-0680j_4(((v2 & 8) == 0 ? f : 0.0f));
            boolean z = (v1 & 0x380 ^ 0x180) > 0x100 && composer0.changed(v4) || (v1 & 0x180) == 0x100;
            boolean z1 = composer0.changed(v5);
            int v6 = ((v1 & 14 ^ 6) <= 4 || !composer0.changed(function30)) && (v1 & 6) != 4 ? 0 : 1;
            if(((v1 & 0x70 ^ 0x30) <= 0x20 || !composer0.changed(function31)) && (v1 & 0x30) != 0x20) {
                v3 = 0;
            }
            ContextualFlowRowOverflow contextualFlowRowOverflow0 = composer0.rememberedValue();
            if((z | z1 | v6 | v3) != 0 || contextualFlowRowOverflow0 == Composer.Companion.getEmpty()) {
                r0 r00 = new r0(function30);
                p0 p00 = new p0(function31);
                contextualFlowRowOverflow0 = new ContextualFlowRowOverflow(OverflowType.ExpandOrCollapseIndicator, v4, v5, r00, p00, null);
                composer0.updateRememberedValue(contextualFlowRowOverflow0);
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return contextualFlowRowOverflow0;
        }

        @ExperimentalLayoutApi
        @NotNull
        public final ContextualFlowRowOverflow getClip() {
            return ContextualFlowRowOverflow.g;
        }

        @ExperimentalLayoutApi
        public static void getClip$annotations() {
        }

        @ExperimentalLayoutApi
        @NotNull
        public final ContextualFlowRowOverflow getVisible() {
            return ContextualFlowRowOverflow.f;
        }

        @ExperimentalLayoutApi
        public static void getVisible$annotations() {
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public static final ContextualFlowRowOverflow f;
    public static final ContextualFlowRowOverflow g;

    static {
        ContextualFlowRowOverflow.Companion = new Companion(null);
        ContextualFlowRowOverflow.f = new ContextualFlowRowOverflow(OverflowType.Visible, null, 30);
        ContextualFlowRowOverflow.g = new ContextualFlowRowOverflow(OverflowType.Clip, null, 30);
    }

    public ContextualFlowRowOverflow(OverflowType flowLayoutOverflow$OverflowType0, int v, int v1, Function1 function10, Function1 function11, DefaultConstructorMarker defaultConstructorMarker0) {
        super(flowLayoutOverflow$OverflowType0, v, v1, function10, function11, null);
    }

    public ContextualFlowRowOverflow(OverflowType flowLayoutOverflow$OverflowType0, n0 n00, int v) {
        if((v & 8) != 0) {
            n00 = null;
        }
        super(flowLayoutOverflow$OverflowType0, 0, 0, n00, null, null);
    }
}

