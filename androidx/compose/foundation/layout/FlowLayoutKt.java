package androidx.compose.foundation.layout;

import androidx.collection.IntIntPair;
import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntList;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.MultiContentMeasurePolicy;
import androidx.compose.ui.layout.MultiContentMeasurePolicyKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Constraints;
import androidx.room.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u00B8\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\u001Ai\u0010\u0011\u001A\u00020\r2\b\b\u0002\u0010\u0001\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\b\u001A\u00020\u00062\b\b\u0002\u0010\n\u001A\u00020\t2\u001C\u0010\u0010\u001A\u0018\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000B\u00A2\u0006\u0002\b\u000E\u00A2\u0006\u0002\b\u000FH\u0007\u00A2\u0006\u0004\b\u0011\u0010\u0012\u001Ai\u0010\u0016\u001A\u00020\r2\b\b\u0002\u0010\u0001\u001A\u00020\u00002\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0013\u001A\u00020\u00062\b\b\u0002\u0010\b\u001A\u00020\u00062\b\b\u0002\u0010\n\u001A\u00020\u00142\u001C\u0010\u0010\u001A\u0018\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\r0\u000B\u00A2\u0006\u0002\b\u000E\u00A2\u0006\u0002\b\u000FH\u0007\u00A2\u0006\u0004\b\u0016\u0010\u0017\u001A\'\u0010\u001A\u001A\u00020\u00192\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0018\u001A\u00020\u0006H\u0001\u00A2\u0006\u0004\b\u001A\u0010\u001B\u001A7\u0010\u001F\u001A\u00020\u001E2\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0018\u001A\u00020\u00062\u0006\u0010\b\u001A\u00020\u00062\u0006\u0010\u001D\u001A\u00020\u001CH\u0001\u00A2\u0006\u0004\b\u001F\u0010 \u001A\'\u0010!\u001A\u00020\u00192\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0018\u001A\u00020\u0006H\u0001\u00A2\u0006\u0004\b!\u0010\"\u001A7\u0010#\u001A\u00020\u001E2\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0018\u001A\u00020\u00062\u0006\u0010\b\u001A\u00020\u00062\u0006\u0010\u001D\u001A\u00020\u001CH\u0001\u00A2\u0006\u0004\b#\u0010$\u001A\\\u00103\u001A\u000200*\u00020%2\u0006\u0010\'\u001A\u00020&2\f\u0010*\u001A\b\u0012\u0004\u0012\u00020)0(2\u0006\u0010,\u001A\u00020+2\u0006\u0010-\u001A\u00020+2\u0006\u0010/\u001A\u00020.2\u0006\u0010\u0018\u001A\u00020\u00062\u0006\u0010\b\u001A\u00020\u00062\u0006\u0010\n\u001A\u00020\u001CH\u0000\u00F8\u0001\u0000\u00A2\u0006\u0004\b1\u00102\u001A#\u00108\u001A\u00020\u0006*\u0002042\u0006\u00106\u001A\u0002052\u0006\u00107\u001A\u00020\u0006H\u0000\u00A2\u0006\u0004\b8\u00109\u001A#\u0010;\u001A\u00020\u0006*\u0002042\u0006\u00106\u001A\u0002052\u0006\u0010:\u001A\u00020\u0006H\u0000\u00A2\u0006\u0004\b;\u00109\u001A<\u0010B\u001A\u00020?*\u00020)2\u0006\u0010\'\u001A\u00020&2\u0006\u0010/\u001A\u00020<2\u0014\u0010>\u001A\u0010\u0012\u0006\u0012\u0004\u0018\u00010=\u0012\u0004\u0012\u00020\r0\u000BH\u0000\u00F8\u0001\u0000\u00A2\u0006\u0004\b@\u0010A\u001AT\u0010M\u001A\u000200*\u00020%2\u0006\u0010/\u001A\u00020.2\u0006\u0010C\u001A\u00020\u00062\u0006\u0010D\u001A\u00020\u00062\u0006\u0010F\u001A\u00020E2\f\u0010H\u001A\b\u0012\u0004\u0012\u0002000G2\u0006\u0010I\u001A\u00020&2\u0006\u0010J\u001A\u00020EH\u0000\u00F8\u0001\u0000\u00A2\u0006\u0004\bK\u0010L\"\u001A\u0010S\u001A\u00020N8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\bO\u0010P\u001A\u0004\bQ\u0010R\"\u001A\u0010V\u001A\u00020N8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\bT\u0010P\u001A\u0004\bU\u0010R\u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006W"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "verticalArrangement", "", "maxItemsInEachRow", "maxLines", "Landroidx/compose/foundation/layout/FlowRowOverflow;", "overflow", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/FlowRowScope;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "content", "FlowRow", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;IILandroidx/compose/foundation/layout/FlowRowOverflow;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "maxItemsInEachColumn", "Landroidx/compose/foundation/layout/FlowColumnOverflow;", "Landroidx/compose/foundation/layout/FlowColumnScope;", "FlowColumn", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;IILandroidx/compose/foundation/layout/FlowColumnOverflow;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "maxItemsInMainAxis", "Landroidx/compose/ui/layout/MeasurePolicy;", "rowMeasurementHelper", "(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;", "Landroidx/compose/foundation/layout/FlowLayoutOverflowState;", "overflowState", "Landroidx/compose/ui/layout/MultiContentMeasurePolicy;", "rowMeasurementMultiContentHelper", "(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;IILandroidx/compose/foundation/layout/FlowLayoutOverflowState;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MultiContentMeasurePolicy;", "columnMeasurementHelper", "(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;", "columnMeasurementMultiContentHelper", "(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;IILandroidx/compose/foundation/layout/FlowLayoutOverflowState;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MultiContentMeasurePolicy;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;", "measurePolicy", "", "Landroidx/compose/ui/layout/Measurable;", "measurablesIterator", "Landroidx/compose/ui/unit/Dp;", "mainAxisSpacingDp", "crossAxisSpacingDp", "Landroidx/compose/foundation/layout/OrientationIndependentConstraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "breakDownItems-di9J0FM", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;Ljava/util/Iterator;FFJIILandroidx/compose/foundation/layout/FlowLayoutOverflowState;)Landroidx/compose/ui/layout/MeasureResult;", "breakDownItems", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "", "isHorizontal", "crossAxisSize", "mainAxisMin", "(Landroidx/compose/ui/layout/IntrinsicMeasurable;ZI)I", "mainAxisSize", "crossAxisMin", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/Placeable;", "storePlaceable", "Landroidx/collection/IntIntPair;", "measureAndCache-rqJ1uqs", "(Landroidx/compose/ui/layout/Measurable;Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;JLkotlin/jvm/functions/Function1;)J", "measureAndCache", "mainAxisTotalSize", "crossAxisTotalSize", "", "crossAxisSizes", "Landroidx/compose/runtime/collection/MutableVector;", "items", "measureHelper", "outPosition", "placeHelper-BmaY500", "(Landroidx/compose/ui/layout/MeasureScope;JII[ILandroidx/compose/runtime/collection/MutableVector;Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;[I)Landroidx/compose/ui/layout/MeasureResult;", "placeHelper", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "a", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "getCROSS_AXIS_ALIGNMENT_TOP", "()Landroidx/compose/foundation/layout/CrossAxisAlignment;", "CROSS_AXIS_ALIGNMENT_TOP", "b", "getCROSS_AXIS_ALIGNMENT_START", "CROSS_AXIS_ALIGNMENT_START", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nFlowLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowLayout.kt\nandroidx/compose/foundation/layout/FlowLayoutKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 9 RowColumnImpl.kt\nandroidx/compose/foundation/layout/OrientationIndependentConstraints\n+ 10 IntList.kt\nandroidx/collection/IntListKt\n+ 11 IntList.kt\nandroidx/collection/IntList\n*L\n1#1,1544:1\n1223#2,6:1545\n1223#2,6:1551\n1223#2,6:1562\n1223#2,6:1600\n1223#2,6:1606\n1223#2,6:1617\n1223#2,6:1655\n1223#2,6:1661\n1223#2,6:1667\n1223#2,6:1673\n170#3,5:1557\n78#3,6:1568\n85#3,4:1583\n89#3,2:1593\n93#3:1598\n176#3:1599\n170#3,5:1612\n78#3,6:1623\n85#3,4:1638\n89#3,2:1648\n93#3:1653\n176#3:1654\n368#4,9:1574\n377#4,3:1595\n368#4,9:1629\n377#4,3:1650\n4032#5,6:1587\n4032#5,6:1642\n69#6,6:1679\n1#7:1685\n1208#8:1686\n1187#8,2:1687\n229#9:1689\n228#9:1690\n231#9:1691\n230#9:1699\n229#9:1700\n230#9:1702\n231#9:1703\n230#9:1704\n231#9:1705\n228#9:1706\n229#9:1707\n931#10:1692\n931#10:1693\n70#11:1694\n266#11,4:1695\n271#11:1701\n*S KotlinDebug\n*F\n+ 1 FlowLayout.kt\nandroidx/compose/foundation/layout/FlowLayoutKt\n*L\n94#1:1545,6\n104#1:1551,6\n111#1:1562,6\n158#1:1600,6\n168#1:1606,6\n174#1:1617,6\n381#1:1655,6\n415#1:1661,6\n444#1:1667,6\n476#1:1673,6\n111#1:1557,5\n111#1:1568,6\n111#1:1583,4\n111#1:1593,2\n111#1:1598\n111#1:1599\n174#1:1612,5\n174#1:1623,6\n174#1:1638,4\n174#1:1648,2\n174#1:1653\n174#1:1654\n111#1:1574,9\n111#1:1595,3\n174#1:1629,9\n174#1:1650,3\n111#1:1587,6\n174#1:1642,6\n905#1:1679,6\n1175#1:1686\n1175#1:1687,2\n1176#1:1689\n1177#1:1690\n1178#1:1691\n1375#1:1699\n1376#1:1700\n1497#1:1702\n1498#1:1703\n1511#1:1704\n1512#1:1705\n1524#1:1706\n1525#1:1707\n1227#1:1692\n1228#1:1693\n1351#1:1694\n1371#1:1695,4\n1371#1:1701\n*E\n"})
public final class FlowLayoutKt {
    public static final CrossAxisAlignment a;
    public static final CrossAxisAlignment b;

    static {
        FlowLayoutKt.a = CrossAxisAlignment.Companion.vertical$foundation_layout_release(Alignment.Companion.getTop());
        FlowLayoutKt.b = CrossAxisAlignment.Companion.horizontal$foundation_layout_release(Alignment.Companion.getStart());
    }

    @ExperimentalLayoutApi
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void FlowColumn(@Nullable Modifier modifier0, @Nullable Vertical arrangement$Vertical0, @Nullable Horizontal arrangement$Horizontal0, int v, int v1, @Nullable FlowColumnOverflow flowColumnOverflow0, @NotNull Function3 function30, @Nullable Composer composer0, int v2, int v3) {
        int v6;
        int v5;
        Horizontal arrangement$Horizontal1;
        FlowColumnOverflow flowColumnOverflow1;
        Modifier modifier1;
        Vertical arrangement$Vertical1;
        int v4;
        Composer composer1 = composer0.startRestartGroup(0x9A620FF8);
        if((v3 & 1) == 0) {
            v4 = (v2 & 6) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v2 : v2;
        }
        else {
            v4 = v2 | 6;
        }
        if((v3 & 2) != 0) {
            v4 |= 0x30;
            arrangement$Vertical1 = arrangement$Vertical0;
        }
        else if((v2 & 0x30) == 0) {
            arrangement$Vertical1 = arrangement$Vertical0;
            v4 |= (composer1.changed(arrangement$Vertical1) ? 0x20 : 16);
        }
        else {
            arrangement$Vertical1 = arrangement$Vertical0;
        }
        if((v3 & 4) != 0) {
            v4 |= 0x180;
        }
        else if((v2 & 0x180) == 0) {
            v4 |= (composer1.changed(arrangement$Horizontal0) ? 0x100 : 0x80);
        }
        if((v3 & 8) != 0) {
            v4 |= 0xC00;
        }
        else if((v2 & 0xC00) == 0) {
            v4 |= (composer1.changed(v) ? 0x800 : 0x400);
        }
        if((v3 & 16) != 0) {
            v4 |= 0x6000;
        }
        else if((v2 & 0x6000) == 0) {
            v4 |= (composer1.changed(v1) ? 0x4000 : 0x2000);
        }
        if((v3 & 0x20) != 0) {
            v4 |= 0x30000;
        }
        else if((v2 & 0x30000) == 0) {
            v4 |= (composer1.changed(flowColumnOverflow0) ? 0x20000 : 0x10000);
        }
        if((v3 & 0x40) != 0) {
            v4 |= 0x180000;
        }
        else if((v2 & 0x180000) == 0) {
            v4 |= (composer1.changedInstance(function30) ? 0x100000 : 0x80000);
        }
        if((v4 & 0x92493) != 0x92492 || !composer1.getSkipping()) {
            Modifier modifier2 = (v3 & 1) == 0 ? modifier0 : Modifier.Companion;
            if((v3 & 2) != 0) {
                arrangement$Vertical1 = Arrangement.INSTANCE.getTop();
            }
            Horizontal arrangement$Horizontal2 = (v3 & 4) == 0 ? arrangement$Horizontal0 : Arrangement.INSTANCE.getStart();
            int v7 = 0x7FFFFFFF;
            int v8 = (v3 & 8) == 0 ? v : 0x7FFFFFFF;
            if((v3 & 16) == 0) {
                v7 = v1;
            }
            FlowColumnOverflow flowColumnOverflow2 = (v3 & 0x20) == 0 ? flowColumnOverflow0 : FlowColumnOverflow.Companion.getClip();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x9A620FF8, v4, -1, "androidx.compose.foundation.layout.FlowColumn (FlowLayout.kt:156)");
            }
            FlowLayoutOverflowState flowLayoutOverflowState0 = composer1.rememberedValue();
            if((v4 & 0x70000) == 0x20000 || flowLayoutOverflowState0 == Composer.Companion.getEmpty()) {
                flowLayoutOverflowState0 = flowColumnOverflow2.createOverflowState$foundation_layout_release();
                composer1.updateRememberedValue(flowLayoutOverflowState0);
            }
            MultiContentMeasurePolicy multiContentMeasurePolicy0 = FlowLayoutKt.columnMeasurementMultiContentHelper(arrangement$Vertical1, arrangement$Horizontal2, v8, v7, flowLayoutOverflowState0, composer1, v4 >> 3 & 0x1FFE);
            ArrayList arrayList0 = composer1.rememberedValue();
            if((((0x380000 & v4) == 0x100000 ? 1 : 0) | ((v4 & 0x70000) == 0x20000 ? 1 : 0)) != 0 || arrayList0 == Composer.Companion.getEmpty()) {
                arrayList0 = new ArrayList();
                arrayList0.add(ComposableLambdaKt.composableLambdaInstance(0x3AC36FC9, true, new r1(function30)));
                flowColumnOverflow2.addOverflowComposables$foundation_layout_release(flowLayoutOverflowState0, arrayList0);
                composer1.updateRememberedValue(arrayList0);
            }
            Function2 function20 = LayoutKt.combineAsVirtualLayouts(arrayList0);
            boolean z = composer1.changed(multiContentMeasurePolicy0);
            MeasurePolicy measurePolicy0 = composer1.rememberedValue();
            if(z || measurePolicy0 == Composer.Companion.getEmpty()) {
                measurePolicy0 = MultiContentMeasurePolicyKt.createMeasurePolicy(multiContentMeasurePolicy0);
                composer1.updateRememberedValue(measurePolicy0);
            }
            int v9 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier3 = ComposedModifierKt.materializeModifier(composer1, modifier2);
            Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
            Function0 function00 = composeUiNode$Companion0.getConstructor();
            if(composer1.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer1.startReusableNode();
            if(composer1.getInserting()) {
                composer1.createNode(function00);
            }
            else {
                composer1.useNode();
            }
            Function2 function21 = a.r(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v9)) {
                a.t(v9, composer1, v9, function21);
            }
            if(r0.a.B(function20, composer1, r0.a.l(composeUiNode$Companion0, composer1, modifier3, 0))) {
                ComposerKt.traceEventEnd();
            }
            modifier1 = modifier2;
            flowColumnOverflow1 = flowColumnOverflow2;
            v5 = v8;
            arrangement$Horizontal1 = arrangement$Horizontal2;
            v6 = v7;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            flowColumnOverflow1 = flowColumnOverflow0;
            arrangement$Horizontal1 = arrangement$Horizontal0;
            v5 = v;
            v6 = v1;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new q1(modifier1, arrangement$Vertical1, arrangement$Horizontal1, v5, v6, flowColumnOverflow1, function30, v2, v3));
        }
    }

    @ExperimentalLayoutApi
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void FlowRow(@Nullable Modifier modifier0, @Nullable Horizontal arrangement$Horizontal0, @Nullable Vertical arrangement$Vertical0, int v, int v1, @Nullable FlowRowOverflow flowRowOverflow0, @NotNull Function3 function30, @Nullable Composer composer0, int v2, int v3) {
        int v6;
        int v5;
        Vertical arrangement$Vertical1;
        FlowRowOverflow flowRowOverflow1;
        Modifier modifier1;
        Horizontal arrangement$Horizontal1;
        int v4;
        Composer composer1 = composer0.startRestartGroup(437853230);
        if((v3 & 1) == 0) {
            v4 = (v2 & 6) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v2 : v2;
        }
        else {
            v4 = v2 | 6;
        }
        if((v3 & 2) != 0) {
            v4 |= 0x30;
            arrangement$Horizontal1 = arrangement$Horizontal0;
        }
        else if((v2 & 0x30) == 0) {
            arrangement$Horizontal1 = arrangement$Horizontal0;
            v4 |= (composer1.changed(arrangement$Horizontal1) ? 0x20 : 16);
        }
        else {
            arrangement$Horizontal1 = arrangement$Horizontal0;
        }
        if((v3 & 4) != 0) {
            v4 |= 0x180;
        }
        else if((v2 & 0x180) == 0) {
            v4 |= (composer1.changed(arrangement$Vertical0) ? 0x100 : 0x80);
        }
        if((v3 & 8) != 0) {
            v4 |= 0xC00;
        }
        else if((v2 & 0xC00) == 0) {
            v4 |= (composer1.changed(v) ? 0x800 : 0x400);
        }
        if((v3 & 16) != 0) {
            v4 |= 0x6000;
        }
        else if((v2 & 0x6000) == 0) {
            v4 |= (composer1.changed(v1) ? 0x4000 : 0x2000);
        }
        if((v3 & 0x20) != 0) {
            v4 |= 0x30000;
        }
        else if((v2 & 0x30000) == 0) {
            v4 |= (composer1.changed(flowRowOverflow0) ? 0x20000 : 0x10000);
        }
        if((v3 & 0x40) != 0) {
            v4 |= 0x180000;
        }
        else if((v2 & 0x180000) == 0) {
            v4 |= (composer1.changedInstance(function30) ? 0x100000 : 0x80000);
        }
        if((v4 & 0x92493) != 0x92492 || !composer1.getSkipping()) {
            Modifier modifier2 = (v3 & 1) == 0 ? modifier0 : Modifier.Companion;
            if((v3 & 2) != 0) {
                arrangement$Horizontal1 = Arrangement.INSTANCE.getStart();
            }
            Vertical arrangement$Vertical2 = (v3 & 4) == 0 ? arrangement$Vertical0 : Arrangement.INSTANCE.getTop();
            int v7 = 0x7FFFFFFF;
            int v8 = (v3 & 8) == 0 ? v : 0x7FFFFFFF;
            if((v3 & 16) == 0) {
                v7 = v1;
            }
            FlowRowOverflow flowRowOverflow2 = (v3 & 0x20) == 0 ? flowRowOverflow0 : FlowRowOverflow.Companion.getClip();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(437853230, v4, -1, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:92)");
            }
            FlowLayoutOverflowState flowLayoutOverflowState0 = composer1.rememberedValue();
            if((v4 & 0x70000) == 0x20000 || flowLayoutOverflowState0 == Composer.Companion.getEmpty()) {
                flowLayoutOverflowState0 = flowRowOverflow2.createOverflowState$foundation_layout_release();
                composer1.updateRememberedValue(flowLayoutOverflowState0);
            }
            MultiContentMeasurePolicy multiContentMeasurePolicy0 = FlowLayoutKt.rowMeasurementMultiContentHelper(arrangement$Horizontal1, arrangement$Vertical2, v8, v7, flowLayoutOverflowState0, composer1, v4 >> 3 & 0x1FFE);
            ArrayList arrayList0 = composer1.rememberedValue();
            if((((0x380000 & v4) == 0x100000 ? 1 : 0) | ((v4 & 0x70000) == 0x20000 ? 1 : 0)) != 0 || arrayList0 == Composer.Companion.getEmpty()) {
                arrayList0 = new ArrayList();
                arrayList0.add(ComposableLambdaKt.composableLambdaInstance(-139531073, true, new t1(function30)));
                flowRowOverflow2.addOverflowComposables$foundation_layout_release(flowLayoutOverflowState0, arrayList0);
                composer1.updateRememberedValue(arrayList0);
            }
            Function2 function20 = LayoutKt.combineAsVirtualLayouts(arrayList0);
            boolean z = composer1.changed(multiContentMeasurePolicy0);
            MeasurePolicy measurePolicy0 = composer1.rememberedValue();
            if(z || measurePolicy0 == Composer.Companion.getEmpty()) {
                measurePolicy0 = MultiContentMeasurePolicyKt.createMeasurePolicy(multiContentMeasurePolicy0);
                composer1.updateRememberedValue(measurePolicy0);
            }
            int v9 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier3 = ComposedModifierKt.materializeModifier(composer1, modifier2);
            Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
            Function0 function00 = composeUiNode$Companion0.getConstructor();
            if(composer1.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer1.startReusableNode();
            if(composer1.getInserting()) {
                composer1.createNode(function00);
            }
            else {
                composer1.useNode();
            }
            Function2 function21 = a.r(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v9)) {
                a.t(v9, composer1, v9, function21);
            }
            if(r0.a.B(function20, composer1, r0.a.l(composeUiNode$Companion0, composer1, modifier3, 0))) {
                ComposerKt.traceEventEnd();
            }
            modifier1 = modifier2;
            flowRowOverflow1 = flowRowOverflow2;
            v5 = v8;
            arrangement$Vertical1 = arrangement$Vertical2;
            v6 = v7;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            flowRowOverflow1 = flowRowOverflow0;
            arrangement$Vertical1 = arrangement$Vertical0;
            v5 = v;
            v6 = v1;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new s1(modifier1, arrangement$Horizontal1, arrangement$Vertical1, v5, v6, flowRowOverflow1, function30, v2, v3));
        }
    }

    public static final long a(List list0, Function3 function30, Function3 function31, int v, int v1, int v2, int v3, int v4, FlowLayoutOverflowState flowLayoutOverflowState0) {
        int v22;
        if(list0.isEmpty()) {
            return 0L;
        }
        FlowLayoutBuildingBlocks flowLayoutBuildingBlocks0 = new FlowLayoutBuildingBlocks(v3, flowLayoutOverflowState0, OrientationIndependentConstraints.constructor-impl(0, v, 0, 0x7FFFFFFF), v4, v1, v2, null);
        IntrinsicMeasurable intrinsicMeasurable0 = (IntrinsicMeasurable)CollectionsKt___CollectionsKt.getOrNull(list0, 0);
        int v5 = intrinsicMeasurable0 == null ? 0 : ((Number)function31.invoke(intrinsicMeasurable0, 0, v)).intValue();
        int v6 = intrinsicMeasurable0 == null ? 0 : ((Number)function30.invoke(intrinsicMeasurable0, 0, v5)).intValue();
        boolean z = true;
        int v7 = 0;
        int v8 = 0;
        int v9 = 0;
        if(flowLayoutBuildingBlocks0.getWrapInfo-OpUlnko(list0.size() > 1, 0, IntIntPair.constructor-impl(v, 0x7FFFFFFF), (intrinsicMeasurable0 == null ? null : IntIntPair.box-impl(IntIntPair.constructor-impl(v6, v5))), 0, 0, 0, false, false).isLastItemInContainer()) {
            if(intrinsicMeasurable0 == null) {
                z = false;
            }
            IntIntPair intIntPair0 = flowLayoutOverflowState0.ellipsisSize-F35zm-w$foundation_layout_release(z, 0, 0);
            return intIntPair0 == null ? 0L : IntIntPair.constructor-impl(IntIntPair.getSecond-impl(intIntPair0.unbox-impl()), 0);
        }
        int v10 = list0.size();
        int v11 = v;
        int v12 = 0;
        int v13 = 0;
        int v14 = 0;
        while(v12 < v10) {
            int v15 = v11 - v6;
            int v16 = Math.max(v9, v5);
            IntrinsicMeasurable intrinsicMeasurable1 = (IntrinsicMeasurable)CollectionsKt___CollectionsKt.getOrNull(list0, v12 + 1);
            int v17 = intrinsicMeasurable1 == null ? 0 : ((Number)function31.invoke(intrinsicMeasurable1, ((int)(v12 + 1)), v)).intValue();
            int v18 = intrinsicMeasurable1 == null ? 0 : ((Number)function30.invoke(intrinsicMeasurable1, ((int)(v12 + 1)), v17)).intValue() + v1;
            int v19 = v12 + 1 - v14;
            WrapInfo flowLayoutBuildingBlocks$WrapInfo0 = flowLayoutBuildingBlocks0.getWrapInfo-OpUlnko(v12 + 2 < list0.size(), v19, IntIntPair.constructor-impl(v15, 0x7FFFFFFF), (intrinsicMeasurable1 == null ? null : IntIntPair.box-impl(IntIntPair.constructor-impl(v18, v17))), v7, v8, v16, false, false);
            if(flowLayoutBuildingBlocks$WrapInfo0.isLastItemInLine()) {
                int v20 = v16 + v2 + v8;
                WrapEllipsisInfo flowLayoutBuildingBlocks$WrapEllipsisInfo0 = flowLayoutBuildingBlocks0.getWrapEllipsisInfo(flowLayoutBuildingBlocks$WrapInfo0, intrinsicMeasurable1 != null, v7, v20, v15, v19);
                ++v7;
                if(flowLayoutBuildingBlocks$WrapInfo0.isLastItemInContainer()) {
                    if(flowLayoutBuildingBlocks$WrapEllipsisInfo0 != null) {
                        long v21 = flowLayoutBuildingBlocks$WrapEllipsisInfo0.getEllipsisSize-OO21N7I();
                        if(!flowLayoutBuildingBlocks$WrapEllipsisInfo0.getPlaceEllipsisOnLastContentLine()) {
                            v20 += IntIntPair.getSecond-impl(v21) + v2;
                        }
                    }
                    return IntIntPair.constructor-impl(v20 - v2, v12 + 1);
                }
                v8 = v20;
                v6 = v18 - v1;
                v14 = v12 + 1;
                v9 = 0;
                v22 = v;
            }
            else {
                v9 = v16;
                v22 = v15;
                v6 = v18;
            }
            ++v12;
            v13 = v12;
            v11 = v22;
            v5 = v17;
        }
        return IntIntPair.constructor-impl(v8 - v2, v13);
    }

    public static final int access$maxIntrinsicMainAxisSize(List list0, Function3 function30, int v, int v1, int v2) {
        int v3 = list0.size();
        int v5 = 0;
        int v6 = 0;
        int v7 = 0;
        for(int v4 = 0; v4 < v3; ++v4) {
            int v8 = ((Number)function30.invoke(((IntrinsicMeasurable)list0.get(v4)), v4, v)).intValue() + v1;
            if(v4 + 1 - v6 == v2 || v4 + 1 == list0.size()) {
                v5 = Math.max(v5, v7 + v8 - v1);
                v7 = 0;
                v6 = v4;
            }
            else {
                v7 += v8;
            }
        }
        return v5;
    }

    public static final int access$minIntrinsicMainAxisSize(List list0, Function3 function30, Function3 function31, int v, int v1, int v2, int v3, int v4, FlowLayoutOverflowState flowLayoutOverflowState0) {
        int v13;
        int v11;
        if(!list0.isEmpty()) {
            int v5 = list0.size();
            int[] arr_v = new int[v5];
            for(int v6 = 0; v6 < v5; ++v6) {
                arr_v[v6] = 0;
            }
            int v7 = list0.size();
            int[] arr_v1 = new int[v7];
            for(int v8 = 0; v8 < v7; ++v8) {
                arr_v1[v8] = 0;
            }
            int v9 = list0.size();
            for(int v10 = 0; true; ++v10) {
                v11 = 0x7FFFFFFF;
                if(v10 >= v9) {
                    break;
                }
                IntrinsicMeasurable intrinsicMeasurable0 = (IntrinsicMeasurable)list0.get(v10);
                int v12 = ((Number)function30.invoke(intrinsicMeasurable0, v10, v)).intValue();
                arr_v[v10] = v12;
                arr_v1[v10] = ((Number)function31.invoke(intrinsicMeasurable0, v10, v12)).intValue();
            }
            if(v4 != 0x7FFFFFFF && v3 != 0x7FFFFFFF) {
                v11 = v3 * v4;
            }
            if(v11 < list0.size() && (flowLayoutOverflowState0.getType$foundation_layout_release() == OverflowType.ExpandIndicator || flowLayoutOverflowState0.getType$foundation_layout_release() == OverflowType.ExpandOrCollapseIndicator)) {
                v13 = 1;
            }
            else if(v11 < list0.size() || v4 < flowLayoutOverflowState0.getMinLinesToShowCollapse$foundation_layout_release() || flowLayoutOverflowState0.getType$foundation_layout_release() != OverflowType.ExpandOrCollapseIndicator) {
                v13 = 0;
            }
            else {
                v13 = 1;
            }
            int v14 = Math.min(v11 - v13, list0.size());
            int v15 = ArraysKt___ArraysKt.sum(arr_v);
            int v16 = list0.size();
            if(v7 == 0) {
                throw new NoSuchElementException();
            }
            int v17 = arr_v1[0];
            IntIterator intIterator0 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_v1)).iterator();
            while(intIterator0.hasNext()) {
                int v18 = arr_v1[intIterator0.nextInt()];
                if(v17 < v18) {
                    v17 = v18;
                }
            }
            if(v5 == 0) {
                throw new NoSuchElementException();
            }
            int v19 = arr_v[0];
            IntIterator intIterator1 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(arr_v)).iterator();
            while(intIterator1.hasNext()) {
                int v20 = arr_v[intIterator1.nextInt()];
                if(v19 < v20) {
                    v19 = v20;
                }
            }
            int v21 = v19;
            int v22 = (v16 - 1) * v1 + v15;
            int v23 = v22;
            while(v21 <= v23 && v17 != v) {
                int v24 = (v21 + v23) / 2;
                long v25 = FlowLayoutKt.a(list0, new x1(0, arr_v), new x1(1, arr_v1), v24, v1, v2, v3, v4, flowLayoutOverflowState0);
                v17 = IntIntPair.getFirst-impl(v25);
                if(v17 <= v && IntIntPair.getSecond-impl(v25) >= v14) {
                    if(v17 < v) {
                        v23 = v24 - 1;
                        v22 = v24;
                        continue;
                    }
                    return v24;
                }
                v21 = v24 + 1;
                if(v21 > v23) {
                    return v21;
                }
                v22 = v24;
            }
            return v22;
        }
        return 0;
    }

    public static final Measurable b(Iterator iterator0, FlowLineInfo flowLineInfo0) {
        try {
            if(iterator0 instanceof ContextualFlowItemIterator) {
                Intrinsics.checkNotNull(flowLineInfo0);
                return ((ContextualFlowItemIterator)iterator0).getNext$foundation_layout_release(flowLineInfo0);
            }
            return iterator0.next();
        }
        catch(ArrayIndexOutOfBoundsException unused_ex) {
            return null;
        }
    }

    @NotNull
    public static final MeasureResult breakDownItems-di9J0FM(@NotNull MeasureScope measureScope0, @NotNull FlowLineMeasurePolicy flowLineMeasurePolicy0, @NotNull Iterator iterator0, float f, float f1, long v, int v1, int v2, @NotNull FlowLayoutOverflowState flowLayoutOverflowState0) {
        int v52;
        int v51;
        MutableIntObjectMap mutableIntObjectMap2;
        ArrayList arrayList3;
        int v37;
        int v36;
        MutableIntList mutableIntList5;
        int v35;
        int v34;
        WrapInfo flowLayoutBuildingBlocks$WrapInfo2;
        MutableIntList mutableIntList4;
        WrapEllipsisInfo flowLayoutBuildingBlocks$WrapEllipsisInfo2;
        IntIntPair intIntPair2;
        IntIntPair intIntPair1;
        long v31;
        int v30;
        int v29;
        int v28;
        int v27;
        ArrayList arrayList2;
        MutableIntObjectMap mutableIntObjectMap1;
        int v26;
        int v25;
        WrapEllipsisInfo flowLayoutBuildingBlocks$WrapEllipsisInfo0;
        MutableIntList mutableIntList3;
        ArrayList arrayList1;
        MutableIntList mutableIntList2;
        long v11;
        MutableVector mutableVector0 = new MutableVector(new MeasureResult[16], 0);
        int v3 = Constraints.getMaxWidth-impl(v);
        int v4 = Constraints.getMinWidth-impl(v);
        int v5 = Constraints.getMaxHeight-impl(v);
        MutableIntObjectMap mutableIntObjectMap0 = IntObjectMapKt.mutableIntObjectMapOf();
        ArrayList arrayList0 = new ArrayList();
        int v6 = (int)(((float)Math.ceil(measureScope0.toPx-0680j_4(f))));
        int v7 = (int)(((float)Math.ceil(measureScope0.toPx-0680j_4(f1))));
        long v8 = OrientationIndependentConstraints.constructor-impl(0, v3, 0, v5);
        long v9 = OrientationIndependentConstraints.toBoxConstraints-OenEA2s(OrientationIndependentConstraints.copy-yUG9Ft0$default(v8, 0, 0, 0, 0, 14, null), (flowLineMeasurePolicy0.isHorizontal() ? LayoutOrientation.Horizontal : LayoutOrientation.Vertical));
        ObjectRef ref$ObjectRef0 = new ObjectRef();
        int v10 = 0;
        FlowLineInfo flowLineInfo0 = iterator0 instanceof ContextualFlowItemIterator ? new FlowLineInfo(0, 0, measureScope0.toDp-u2uoSUM(v3), measureScope0.toDp-u2uoSUM(v5), null) : null;
        Measurable measurable0 = iterator0.hasNext() ? FlowLayoutKt.b(iterator0, flowLineInfo0) : null;
        IntIntPair intIntPair0 = measurable0 == null ? null : IntIntPair.box-impl(FlowLayoutKt.measureAndCache-rqJ1uqs(measurable0, flowLineMeasurePolicy0, v9, new v1(ref$ObjectRef0)));
        Integer integer0 = intIntPair0 == null ? null : IntIntPair.getFirst-impl(intIntPair0.unbox-impl());
        Integer integer1 = intIntPair0 == null ? null : IntIntPair.getSecond-impl(intIntPair0.unbox-impl());
        MutableIntList mutableIntList0 = new MutableIntList(0, 1, null);
        MutableIntList mutableIntList1 = new MutableIntList(0, 1, null);
        FlowLayoutBuildingBlocks flowLayoutBuildingBlocks0 = new FlowLayoutBuildingBlocks(v1, flowLayoutOverflowState0, v, v2, v6, v7, null);
        WrapInfo flowLayoutBuildingBlocks$WrapInfo0 = flowLayoutBuildingBlocks0.getWrapInfo-OpUlnko(iterator0.hasNext(), 0, IntIntPair.constructor-impl(v3, v5), intIntPair0, 0, 0, 0, false, false);
        if(flowLayoutBuildingBlocks$WrapInfo0.isLastItemInContainer()) {
            v11 = v9;
            mutableIntList2 = mutableIntList0;
            arrayList1 = arrayList0;
            mutableIntList3 = mutableIntList1;
            flowLayoutBuildingBlocks$WrapEllipsisInfo0 = flowLayoutBuildingBlocks0.getWrapEllipsisInfo(flowLayoutBuildingBlocks$WrapInfo0, intIntPair0 != null, -1, 0, v3, 0);
        }
        else {
            mutableIntList2 = mutableIntList0;
            v11 = v9;
            arrayList1 = arrayList0;
            mutableIntList3 = mutableIntList1;
            flowLayoutBuildingBlocks$WrapEllipsisInfo0 = null;
        }
        WrapEllipsisInfo flowLayoutBuildingBlocks$WrapEllipsisInfo1 = flowLayoutBuildingBlocks$WrapEllipsisInfo0;
        Measurable measurable1 = measurable0;
        int v12 = v5;
        int v13 = v4;
        int v14 = 0;
        int v15 = 0;
        int v16 = 0;
        int v17 = 0;
        int v18 = 0;
        int v19 = v3;
        while(!flowLayoutBuildingBlocks$WrapInfo0.isLastItemInContainer() && measurable1 != null) {
            Intrinsics.checkNotNull(integer0);
            int v20 = (int)integer0;
            Intrinsics.checkNotNull(integer1);
            int v21 = v16 + v20;
            int v22 = Math.max(v17, ((int)integer1));
            int v23 = v19 - v20;
            flowLayoutOverflowState0.setItemShown$foundation_layout_release(v18 + 1);
            arrayList1.add(measurable1);
            mutableIntObjectMap0.set(v18, ref$ObjectRef0.element);
            int v24 = v18 + 1 - v15;
            boolean z = v24 < v1;
            if(flowLineInfo0 == null) {
                v28 = v18 + 1;
                v25 = v15;
                mutableIntObjectMap1 = mutableIntObjectMap0;
                arrayList2 = arrayList1;
            }
            else {
                if(z) {
                    v25 = v15;
                    v26 = v10;
                }
                else {
                    v25 = v15;
                    v26 = v10 + 1;
                }
                if(z) {
                    mutableIntObjectMap1 = mutableIntObjectMap0;
                    arrayList2 = arrayList1;
                    v27 = c.coerceAtLeast(v23 - v6, 0);
                }
                else {
                    mutableIntObjectMap1 = mutableIntObjectMap0;
                    arrayList2 = arrayList1;
                    v27 = v3;
                }
                float f2 = measureScope0.toDp-u2uoSUM(v27);
                if(z) {
                    v28 = v18 + 1;
                    v29 = v12;
                }
                else {
                    v28 = v18 + 1;
                    v29 = c.coerceAtLeast(v12 - v22 - v7, 0);
                }
                flowLineInfo0.update-4j6BHR0$foundation_layout_release(v26, (z ? v24 : 0), f2, measureScope0.toDp-u2uoSUM(v29));
            }
            Measurable measurable2 = iterator0.hasNext() ? FlowLayoutKt.b(iterator0, flowLineInfo0) : null;
            ref$ObjectRef0.element = null;
            if(measurable2 == null) {
                v30 = v24;
                v31 = v11;
                intIntPair1 = null;
            }
            else {
                v30 = v24;
                v31 = v11;
                intIntPair1 = IntIntPair.box-impl(FlowLayoutKt.measureAndCache-rqJ1uqs(measurable2, flowLineMeasurePolicy0, v31, new u1(ref$ObjectRef0)));
            }
            Integer integer2 = intIntPair1 == null ? null : ((int)(IntIntPair.getFirst-impl(intIntPair1.unbox-impl()) + v6));
            Integer integer3 = intIntPair1 == null ? null : IntIntPair.getSecond-impl(intIntPair1.unbox-impl());
            boolean z1 = iterator0.hasNext();
            long v32 = IntIntPair.constructor-impl(v23, v12);
            if(intIntPair1 == null) {
                intIntPair2 = null;
            }
            else {
                Intrinsics.checkNotNull(integer2);
                Intrinsics.checkNotNull(integer3);
                intIntPair2 = IntIntPair.box-impl(IntIntPair.constructor-impl(((int)integer2), ((int)integer3)));
            }
            WrapInfo flowLayoutBuildingBlocks$WrapInfo1 = flowLayoutBuildingBlocks0.getWrapInfo-OpUlnko(z1, v30, v32, intIntPair2, v10, v14, v22, false, false);
            if(flowLayoutBuildingBlocks$WrapInfo1.isLastItemInLine()) {
                int v33 = v14 + v22;
                flowLayoutBuildingBlocks$WrapEllipsisInfo2 = flowLayoutBuildingBlocks0.getWrapEllipsisInfo(flowLayoutBuildingBlocks$WrapInfo1, intIntPair1 != null, v10, v33, v23, v30);
                mutableIntList4 = mutableIntList3;
                mutableIntList4.add(v22);
                flowLayoutBuildingBlocks$WrapInfo2 = flowLayoutBuildingBlocks$WrapInfo1;
                mutableIntList2.add(v28);
                ++v10;
                v14 = v33 + v7;
                v19 = v3;
                integer0 = integer2 == null ? null : ((int)(((int)integer2) - v6));
                v34 = 0;
                v35 = v28;
                mutableIntList5 = mutableIntList2;
                v36 = Math.min(Math.max(v13, v21), v3);
                v12 = v5 - v33 - v7;
                v37 = 0;
            }
            else {
                flowLayoutBuildingBlocks$WrapInfo2 = flowLayoutBuildingBlocks$WrapInfo1;
                v36 = v13;
                mutableIntList4 = mutableIntList3;
                mutableIntList5 = mutableIntList2;
                v19 = v23;
                integer0 = integer2;
                flowLayoutBuildingBlocks$WrapEllipsisInfo2 = flowLayoutBuildingBlocks$WrapEllipsisInfo1;
                v34 = v22;
                v37 = v21;
                v35 = v25;
            }
            mutableIntList2 = mutableIntList5;
            flowLayoutBuildingBlocks$WrapEllipsisInfo1 = flowLayoutBuildingBlocks$WrapEllipsisInfo2;
            mutableIntList3 = mutableIntList4;
            mutableIntObjectMap0 = mutableIntObjectMap1;
            integer1 = integer3;
            v11 = v31;
            v15 = v35;
            v16 = v37;
            v13 = v36;
            v17 = v34;
            arrayList1 = arrayList2;
            v18 = v28;
            measurable1 = measurable2;
            flowLayoutBuildingBlocks$WrapInfo0 = flowLayoutBuildingBlocks$WrapInfo2;
        }
        if(flowLayoutBuildingBlocks$WrapEllipsisInfo1 == null) {
            mutableIntObjectMap2 = mutableIntObjectMap0;
            arrayList3 = arrayList1;
        }
        else {
            arrayList3 = arrayList1;
            arrayList3.add(flowLayoutBuildingBlocks$WrapEllipsisInfo1.getEllipsis());
            mutableIntObjectMap2 = mutableIntObjectMap0;
            mutableIntObjectMap2.set(arrayList3.size() - 1, flowLayoutBuildingBlocks$WrapEllipsisInfo1.getPlaceable());
            int v38 = mutableIntList2._size - 1;
            if(flowLayoutBuildingBlocks$WrapEllipsisInfo1.getPlaceEllipsisOnLastContentLine()) {
                mutableIntList3.set(v38, Math.max(mutableIntList3.get(v38), IntIntPair.getSecond-impl(flowLayoutBuildingBlocks$WrapEllipsisInfo1.getEllipsisSize-OO21N7I())));
                mutableIntList2.set(mutableIntList2.getSize() - 1, mutableIntList2.last() + 1);
            }
            else {
                mutableIntList3.add(IntIntPair.getSecond-impl(flowLayoutBuildingBlocks$WrapEllipsisInfo1.getEllipsisSize-OO21N7I()));
                mutableIntList2.add(mutableIntList2.last() + 1);
            }
        }
        int v39 = arrayList3.size();
        Placeable[] arr_placeable = new Placeable[v39];
        for(int v40 = 0; v40 < v39; ++v40) {
            arr_placeable[v40] = mutableIntObjectMap2.get(v40);
        }
        int v41 = mutableIntList2.getSize();
        int[] arr_v = new int[v41];
        for(int v42 = 0; v42 < v41; ++v42) {
            arr_v[v42] = 0;
        }
        int v43 = mutableIntList2.getSize();
        int[] arr_v1 = new int[v43];
        for(int v44 = 0; v44 < v43; ++v44) {
            arr_v1[v44] = 0;
        }
        int[] arr_v2 = mutableIntList2.content;
        int v45 = mutableIntList2._size;
        int v46 = v13;
        int v47 = 0;
        int v48 = 0;
        for(int v49 = 0; v47 < v45; v49 = v50) {
            int v50 = arr_v2[v47];
            MeasureResult measureResult0 = RowColumnMeasurePolicyKt.measure(flowLineMeasurePolicy0, v46, Constraints.getMinHeight-impl(v8), Constraints.getMaxWidth-impl(v8), mutableIntList3.get(v47), v6, measureScope0, arrayList3, arr_placeable, v49, v50, arr_v, v47);
            if(flowLineMeasurePolicy0.isHorizontal()) {
                v51 = measureResult0.getWidth();
                v52 = measureResult0.getHeight();
            }
            else {
                v51 = measureResult0.getHeight();
                v52 = measureResult0.getWidth();
            }
            arr_v1[v47] = v52;
            v48 += v52;
            v46 = Math.max(v46, v51);
            mutableVector0.add(measureResult0);
            ++v47;
        }
        return mutableVector0.isEmpty() ? FlowLayoutKt.placeHelper-BmaY500(measureScope0, v, 0, 0, arr_v1, mutableVector0, flowLineMeasurePolicy0, arr_v) : FlowLayoutKt.placeHelper-BmaY500(measureScope0, v, v46, v48, arr_v1, mutableVector0, flowLineMeasurePolicy0, arr_v);
    }

    @Composable
    @PublishedApi
    @NotNull
    public static final MeasurePolicy columnMeasurementHelper(@NotNull Vertical arrangement$Vertical0, @NotNull Horizontal arrangement$Horizontal0, int v, @Nullable Composer composer0, int v1) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2013098357, v1, -1, "androidx.compose.foundation.layout.columnMeasurementHelper (FlowLayout.kt:442)");
        }
        int v2 = 0;
        int v3 = ((v1 & 14 ^ 6) <= 4 || !composer0.changed(arrangement$Vertical0)) && (v1 & 6) != 4 ? 0 : 1;
        int v4 = ((v1 & 0x70 ^ 0x30) <= 0x20 || !composer0.changed(arrangement$Horizontal0)) && (v1 & 0x30) != 0x20 ? 0 : 1;
        if((v1 & 0x380 ^ 0x180) > 0x100 && composer0.changed(v) || (v1 & 0x180) == 0x100) {
            v2 = 1;
        }
        w1 w10 = composer0.rememberedValue();
        if((v3 | v4 | v2) != 0 || w10 == Composer.Companion.getEmpty()) {
            FlowLayoutOverflowState flowLayoutOverflowState0 = FlowRowOverflow.Companion.getVisible().createOverflowState$foundation_layout_release();
            w10 = new w1(new p2(false, arrangement$Horizontal0, arrangement$Vertical0, arrangement$Vertical0.getSpacing-D9Ej5fM(), FlowLayoutKt.b, arrangement$Horizontal0.getSpacing-D9Ej5fM(), v, 0x7FFFFFFF, flowLayoutOverflowState0));
            composer0.updateRememberedValue(w10);
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return w10;
    }

    @Composable
    @NotNull
    public static final MultiContentMeasurePolicy columnMeasurementMultiContentHelper(@NotNull Vertical arrangement$Vertical0, @NotNull Horizontal arrangement$Horizontal0, int v, int v1, @NotNull FlowLayoutOverflowState flowLayoutOverflowState0, @Nullable Composer composer0, int v2) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x2CA16DF9, v2, -1, "androidx.compose.foundation.layout.columnMeasurementMultiContentHelper (FlowLayout.kt:474)");
        }
        int v3 = 0;
        int v4 = ((v2 & 14 ^ 6) <= 4 || !composer0.changed(arrangement$Vertical0)) && (v2 & 6) != 4 ? 0 : 1;
        int v5 = ((v2 & 0x70 ^ 0x30) <= 0x20 || !composer0.changed(arrangement$Horizontal0)) && (v2 & 0x30) != 0x20 ? 0 : 1;
        int v6 = ((v2 & 0x380 ^ 0x180) <= 0x100 || !composer0.changed(v)) && (v2 & 0x180) != 0x100 ? 0 : 1;
        if((v2 & 0x1C00 ^ 0xC00) > 0x800 && composer0.changed(v1) || (v2 & 0xC00) == 0x800) {
            v3 = 1;
        }
        boolean z = composer0.changed(flowLayoutOverflowState0);
        p2 p20 = composer0.rememberedValue();
        if((v4 | v5 | v6 | v3 | z) != 0 || p20 == Composer.Companion.getEmpty()) {
            p20 = new p2(false, arrangement$Horizontal0, arrangement$Vertical0, arrangement$Vertical0.getSpacing-D9Ej5fM(), FlowLayoutKt.b, arrangement$Horizontal0.getSpacing-D9Ej5fM(), v, v1, flowLayoutOverflowState0);
            composer0.updateRememberedValue(p20);
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return p20;
    }

    // 去混淆评级： 低(20)
    public static final int crossAxisMin(@NotNull IntrinsicMeasurable intrinsicMeasurable0, boolean z, int v) {
        return z ? intrinsicMeasurable0.minIntrinsicHeight(v) : intrinsicMeasurable0.minIntrinsicWidth(v);
    }

    @NotNull
    public static final CrossAxisAlignment getCROSS_AXIS_ALIGNMENT_START() {
        return FlowLayoutKt.b;
    }

    @NotNull
    public static final CrossAxisAlignment getCROSS_AXIS_ALIGNMENT_TOP() {
        return FlowLayoutKt.a;
    }

    // 去混淆评级： 低(20)
    public static final int mainAxisMin(@NotNull IntrinsicMeasurable intrinsicMeasurable0, boolean z, int v) {
        return z ? intrinsicMeasurable0.minIntrinsicWidth(v) : intrinsicMeasurable0.minIntrinsicHeight(v);
    }

    public static final long measureAndCache-rqJ1uqs(@NotNull Measurable measurable0, @NotNull FlowLineMeasurePolicy flowLineMeasurePolicy0, long v, @NotNull Function1 function10) {
        Float float0;
        if(RowColumnImplKt.getWeight(RowColumnImplKt.getRowColumnParentData(measurable0)) == 0.0f) {
            RowColumnParentData rowColumnParentData0 = RowColumnImplKt.getRowColumnParentData(measurable0);
            if(rowColumnParentData0 == null) {
                float0 = null;
            }
            else {
                FlowLayoutData flowLayoutData0 = rowColumnParentData0.getFlowLayoutData();
                float0 = flowLayoutData0 == null ? null : flowLayoutData0.getFillCrossAxisFraction();
            }
            if(float0 == null) {
                Placeable placeable0 = measurable0.measure-BRTryo0(v);
                function10.invoke(placeable0);
                return IntIntPair.constructor-impl(flowLineMeasurePolicy0.mainAxisSize(placeable0), flowLineMeasurePolicy0.crossAxisSize(placeable0));
            }
        }
        int v1 = FlowLayoutKt.mainAxisMin(measurable0, flowLineMeasurePolicy0.isHorizontal(), 0x7FFFFFFF);
        return IntIntPair.constructor-impl(v1, FlowLayoutKt.crossAxisMin(measurable0, flowLineMeasurePolicy0.isHorizontal(), v1));
    }

    @NotNull
    public static final MeasureResult placeHelper-BmaY500(@NotNull MeasureScope measureScope0, long v, int v1, int v2, @NotNull int[] arr_v, @NotNull MutableVector mutableVector0, @NotNull FlowLineMeasurePolicy flowLineMeasurePolicy0, @NotNull int[] arr_v1) {
        int v3;
        boolean z = flowLineMeasurePolicy0.isHorizontal();
        Vertical arrangement$Vertical0 = flowLineMeasurePolicy0.getVerticalArrangement();
        Horizontal arrangement$Horizontal0 = flowLineMeasurePolicy0.getHorizontalArrangement();
        if(z) {
            if(arrangement$Vertical0 == null) {
                throw new IllegalArgumentException("null verticalArrangement");
            }
            v3 = c.coerceIn((mutableVector0.getSize() - 1) * measureScope0.roundToPx-0680j_4(arrangement$Vertical0.getSpacing-D9Ej5fM()) + v2, Constraints.getMinHeight-impl(v), Constraints.getMaxHeight-impl(v));
            arrangement$Vertical0.arrange(measureScope0, v3, arr_v, arr_v1);
        }
        else {
            if(arrangement$Horizontal0 == null) {
                throw new IllegalArgumentException("null horizontalArrangement");
            }
            int v4 = c.coerceIn((mutableVector0.getSize() - 1) * measureScope0.roundToPx-0680j_4(arrangement$Horizontal0.getSpacing-D9Ej5fM()) + v2, Constraints.getMinHeight-impl(v), Constraints.getMaxHeight-impl(v));
            arrangement$Horizontal0.arrange(measureScope0, v4, arr_v, measureScope0.getLayoutDirection(), arr_v1);
            v3 = v4;
        }
        int v5 = c.coerceIn(v1, Constraints.getMinWidth-impl(v), Constraints.getMaxWidth-impl(v));
        if(!z) {
            int v6 = v3;
            v3 = v5;
            v5 = v6;
        }
        return MeasureScope.layout$default(measureScope0, v5, v3, null, new y1(mutableVector0), 4, null);
    }

    @Composable
    @PublishedApi
    @NotNull
    public static final MeasurePolicy rowMeasurementHelper(@NotNull Horizontal arrangement$Horizontal0, @NotNull Vertical arrangement$Vertical0, int v, @Nullable Composer composer0, int v1) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x582BA447, v1, -1, "androidx.compose.foundation.layout.rowMeasurementHelper (FlowLayout.kt:379)");
        }
        int v2 = 0;
        int v3 = ((v1 & 14 ^ 6) <= 4 || !composer0.changed(arrangement$Horizontal0)) && (v1 & 6) != 4 ? 0 : 1;
        int v4 = ((v1 & 0x70 ^ 0x30) <= 0x20 || !composer0.changed(arrangement$Vertical0)) && (v1 & 0x30) != 0x20 ? 0 : 1;
        if((v1 & 0x380 ^ 0x180) > 0x100 && composer0.changed(v) || (v1 & 0x180) == 0x100) {
            v2 = 1;
        }
        z1 z10 = composer0.rememberedValue();
        if((v3 | v4 | v2) != 0 || z10 == Composer.Companion.getEmpty()) {
            FlowLayoutOverflowState flowLayoutOverflowState0 = FlowRowOverflow.Companion.getVisible().createOverflowState$foundation_layout_release();
            z10 = new z1(new p2(true, arrangement$Horizontal0, arrangement$Vertical0, arrangement$Horizontal0.getSpacing-D9Ej5fM(), FlowLayoutKt.a, arrangement$Vertical0.getSpacing-D9Ej5fM(), v, 0x7FFFFFFF, flowLayoutOverflowState0));
            composer0.updateRememberedValue(z10);
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return z10;
    }

    @Composable
    @NotNull
    public static final MultiContentMeasurePolicy rowMeasurementMultiContentHelper(@NotNull Horizontal arrangement$Horizontal0, @NotNull Vertical arrangement$Vertical0, int v, int v1, @NotNull FlowLayoutOverflowState flowLayoutOverflowState0, @Nullable Composer composer0, int v2) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x80C613B5, v2, -1, "androidx.compose.foundation.layout.rowMeasurementMultiContentHelper (FlowLayout.kt:413)");
        }
        int v3 = 0;
        int v4 = ((v2 & 14 ^ 6) <= 4 || !composer0.changed(arrangement$Horizontal0)) && (v2 & 6) != 4 ? 0 : 1;
        int v5 = ((v2 & 0x70 ^ 0x30) <= 0x20 || !composer0.changed(arrangement$Vertical0)) && (v2 & 0x30) != 0x20 ? 0 : 1;
        int v6 = ((v2 & 0x380 ^ 0x180) <= 0x100 || !composer0.changed(v)) && (v2 & 0x180) != 0x100 ? 0 : 1;
        if((v2 & 0x1C00 ^ 0xC00) > 0x800 && composer0.changed(v1) || (v2 & 0xC00) == 0x800) {
            v3 = 1;
        }
        boolean z = composer0.changed(flowLayoutOverflowState0);
        p2 p20 = composer0.rememberedValue();
        if((v4 | v5 | v6 | v3 | z) != 0 || p20 == Composer.Companion.getEmpty()) {
            p20 = new p2(true, arrangement$Horizontal0, arrangement$Vertical0, arrangement$Horizontal0.getSpacing-D9Ej5fM(), FlowLayoutKt.a, arrangement$Vertical0.getSpacing-D9Ej5fM(), v, v1, flowLayoutOverflowState0);
            composer0.updateRememberedValue(p20);
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return p20;
    }
}

