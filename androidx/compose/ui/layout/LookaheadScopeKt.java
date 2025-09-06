package androidx.compose.ui.layout;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.UiComposable;
import androidx.compose.ui.geometry.Offset;
import d0.g0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import z1.g;
import z1.i;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u001A2\u0010\u0007\u001A\u00020\u00022!\u0010\u0006\u001A\u001D\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003¢\u0006\u0002\b\u0004¢\u0006\u0002\b\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001A§\u0001\u0010\u001D\u001A\u00020\t*\u00020\t2!\u0010\u000F\u001A\u001D\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000B\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000E0\u00002.\b\u0002\u0010\u0014\u001A(\u0012\u0004\u0012\u00020\u0011\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u000B\u0012\b\b\f\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u000E0\u0010¢\u0006\u0002\b\u00052A\u0010\u001C\u001A=\u0012\u0004\u0012\u00020\u0016\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u000B\u0012\b\b\f\u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b\u000B\u0012\b\b\f\u0012\u0004\b\b(\u001A\u0012\u0004\u0012\u00020\u001B0\u0015¢\u0006\u0002\b\u0005¢\u0006\u0004\b\u001D\u0010\u001E\u001A6\u0010&\u001A\u00020!*\u00020\u00012\u0006\u0010\u001F\u001A\u00020\u00122\u0006\u0010 \u001A\u00020\u00122\u0006\u0010\"\u001A\u00020!2\u0006\u0010#\u001A\u00020\u000EH\u0000ø\u0001\u0000¢\u0006\u0004\b$\u0010%\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\'"}, d2 = {"Lkotlin/Function1;", "Landroidx/compose/ui/layout/LookaheadScope;", "", "Landroidx/compose/runtime/Composable;", "Landroidx/compose/ui/UiComposable;", "Lkotlin/ExtensionFunctionType;", "content", "LookaheadScope", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/unit/IntSize;", "Lkotlin/ParameterName;", "name", "lookaheadSize", "", "isMeasurementApproachInProgress", "Lkotlin/Function2;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "lookaheadCoordinates", "isPlacementApproachInProgress", "Lkotlin/Function3;", "Landroidx/compose/ui/layout/ApproachMeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "approachMeasure", "approachLayout", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;)Landroidx/compose/ui/Modifier;", "coordinates", "sourceCoordinates", "Landroidx/compose/ui/geometry/Offset;", "relativeToSource", "includeMotionFrameOfReference", "localLookaheadPositionOf-Fgt4K4Q", "(Landroidx/compose/ui/layout/LookaheadScope;Landroidx/compose/ui/layout/LayoutCoordinates;Landroidx/compose/ui/layout/LayoutCoordinates;JZ)J", "localLookaheadPositionOf", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLookaheadScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LookaheadScope.kt\nandroidx/compose/ui/layout/LookaheadScopeKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,284:1\n1223#2,6:285\n368#3,12:291\n*S KotlinDebug\n*F\n+ 1 LookaheadScope.kt\nandroidx/compose/ui/layout/LookaheadScopeKt\n*L\n52#1:285,6\n53#1:291,12\n*E\n"})
public final class LookaheadScopeKt {
    public static final h a;

    static {
        LookaheadScopeKt.a = h.w;
    }

    @Composable
    @UiComposable
    public static final void LookaheadScope(@NotNull Function3 function30, @Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xBFBE02CC);
        int v1 = (v & 6) == 0 ? (composer1.changedInstance(function30) ? 4 : 2) | v : v;
        if((v1 & 3) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xBFBE02CC, v1, -1, "androidx.compose.ui.layout.LookaheadScope (LookaheadScope.kt:50)");
            }
            LookaheadScopeImpl lookaheadScopeImpl0 = composer1.rememberedValue();
            if(lookaheadScopeImpl0 == Composer.Companion.getEmpty()) {
                lookaheadScopeImpl0 = new LookaheadScopeImpl(null, 1, null);
                composer1.updateRememberedValue(lookaheadScopeImpl0);
            }
            if(composer1.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer1.startReusableNode();
            if(composer1.getInserting()) {
                composer1.createNode(g.y);
            }
            else {
                composer1.useNode();
            }
            Updater.init-impl(composer1, i.y);
            Updater.set-impl(composer1, lookaheadScopeImpl0, z1.h.y);
            function30.invoke(lookaheadScopeImpl0, composer1, ((int)(v1 << 3 & 0x70)));
            composer1.endNode();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new g0(function30, v, 2));
        }
    }

    public static final Function2 access$getDefaultPlacementApproachInProgress$p() {
        return LookaheadScopeKt.a;
    }

    @NotNull
    public static final Modifier approachLayout(@NotNull Modifier modifier0, @NotNull Function1 function10, @NotNull Function2 function20, @NotNull Function3 function30) {
        return modifier0.then(new ApproachLayoutElement(function30, function10, function20));
    }

    public static Modifier approachLayout$default(Modifier modifier0, Function1 function10, Function2 function20, Function3 function30, int v, Object object0) {
        if((v & 2) != 0) {
            function20 = LookaheadScopeKt.a;
        }
        return LookaheadScopeKt.approachLayout(modifier0, function10, function20, function30);
    }

    public static final long localLookaheadPositionOf-Fgt4K4Q(@NotNull LookaheadScope lookaheadScope0, @NotNull LayoutCoordinates layoutCoordinates0, @NotNull LayoutCoordinates layoutCoordinates1, long v, boolean z) {
        LayoutCoordinates layoutCoordinates2 = lookaheadScope0.toLookaheadCoordinates(layoutCoordinates0);
        LayoutCoordinates layoutCoordinates3 = lookaheadScope0.toLookaheadCoordinates(layoutCoordinates1);
        if(layoutCoordinates2 instanceof LookaheadLayoutCoordinates) {
            return layoutCoordinates2.localPositionOf-S_NoaFU(layoutCoordinates3, v, z);
        }
        return layoutCoordinates3 instanceof LookaheadLayoutCoordinates ? Offset.unaryMinus-F1C5BW0(layoutCoordinates3.localPositionOf-S_NoaFU(layoutCoordinates2, v, z)) : layoutCoordinates2.localPositionOf-S_NoaFU(layoutCoordinates2, v, z);
    }
}

