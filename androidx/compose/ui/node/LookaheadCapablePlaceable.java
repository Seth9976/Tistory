package androidx.compose.ui.node;

import aa.m;
import androidx.collection.MutableObjectFloatMap;
import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.PlaceableKt;
import androidx.compose.ui.layout.Ruler;
import androidx.compose.ui.layout.RulerScope;
import androidx.compose.ui.layout.VerticalAlignmentLine;
import androidx.compose.ui.layout.VerticalRuler;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.LayoutDirection;
import b2.d;
import b2.q;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u008A\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000B\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b \u0018\u0000 `2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001`B\u0007\u00A2\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00020\u0006H\u0086\u0002\u00A2\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000B\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00020\u0006H&\u00A2\u0006\u0004\b\u000B\u0010\nJ\u000F\u0010\u000E\u001A\u00020\fH \u00A2\u0006\u0004\b\r\u0010\u0005J\u0013\u0010\u0010\u001A\u00020\f*\u00020\u000FH\u0004\u00A2\u0006\u0004\b\u0010\u0010\u0011J\u001D\u0010\u0016\u001A\u00020\u00142\u0006\u0010\u0013\u001A\u00020\u00122\u0006\u0010\u0015\u001A\u00020\u0014\u00A2\u0006\u0004\b\u0016\u0010\u0017Jg\u0010#\u001A\u00020\"2\u0006\u0010\u0018\u001A\u00020\b2\u0006\u0010\u0019\u001A\u00020\b2\u0012\u0010\u001B\u001A\u000E\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u001A2\u0019\u0010\u001F\u001A\u0015\u0012\u0004\u0012\u00020\u001D\u0012\u0004\u0012\u00020\f\u0018\u00010\u001C\u00A2\u0006\u0002\b\u001E2\u0017\u0010!\u001A\u0013\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\f0\u001C\u00A2\u0006\u0002\b\u001EH\u0016\u00A2\u0006\u0004\b#\u0010$J\u0019\u0010(\u001A\u00020\f2\b\u0010%\u001A\u0004\u0018\u00010\"H\u0000\u00A2\u0006\u0004\b&\u0010\'J\u001D\u0010*\u001A\u00020\f2\u0006\u0010\u0013\u001A\u00020\u00122\u0006\u0010)\u001A\u00020\u0014\u00A2\u0006\u0004\b*\u0010+J\u001D\u0010,\u001A\u00020\f2\u0006\u0010\u0013\u001A\u00020\u00122\u0006\u0010)\u001A\u00020\u0014\u00A2\u0006\u0004\b,\u0010+R\"\u00100\u001A\u00020-8\u0016@\u0016X\u0096\u000E\u00A2\u0006\u0012\n\u0004\b.\u0010/\u001A\u0004\b0\u00101\"\u0004\b2\u00103R\"\u00107\u001A\u00020-8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\b4\u0010/\u001A\u0004\b5\u00101\"\u0004\b6\u00103R\"\u0010;\u001A\u00020-8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\b8\u0010/\u001A\u0004\b9\u00101\"\u0004\b:\u00103R\u0017\u0010@\u001A\u00020 8\u0006\u00A2\u0006\f\n\u0004\b<\u0010=\u001A\u0004\b>\u0010?R\u001A\u0010D\u001A\u00020A8&X\u00A6\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0006\u001A\u0004\bB\u0010CR\u0016\u0010G\u001A\u0004\u0018\u00010\u00008&X\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\bE\u0010FR\u0016\u0010I\u001A\u0004\u0018\u00010\u00008&X\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\bH\u0010FR\u0014\u0010K\u001A\u00020-8&X\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\bJ\u00101R\u0014\u0010O\u001A\u00020L8&X\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\bM\u0010NR\u0014\u0010S\u001A\u00020P8&X\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\bQ\u0010RR\u0011\u0010V\u001A\u00020\u001D8F\u00A2\u0006\u0006\u001A\u0004\bT\u0010UR\u0014\u0010Y\u001A\u00020\"8 X\u00A0\u0004\u00A2\u0006\u0006\u001A\u0004\bW\u0010XR\u0014\u0010]\u001A\u00020Z8&X\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b[\u0010\\R\u001A\u0010^\u001A\u00020-8VX\u0096\u0004\u00A2\u0006\f\u0012\u0004\b_\u0010\u0005\u001A\u0004\b^\u00101\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006a"}, d2 = {"Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "Landroidx/compose/ui/layout/Placeable;", "Landroidx/compose/ui/node/MeasureScopeWithLayoutNode;", "Landroidx/compose/ui/node/MotionReferencePlacementDelegate;", "<init>", "()V", "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLine", "", "get", "(Landroidx/compose/ui/layout/AlignmentLine;)I", "calculateAlignmentLine", "", "replace$ui_release", "replace", "Landroidx/compose/ui/node/NodeCoordinator;", "invalidateAlignmentLinesFromPositionChange", "(Landroidx/compose/ui/node/NodeCoordinator;)V", "Landroidx/compose/ui/layout/Ruler;", "ruler", "", "defaultValue", "findRulerValue", "(Landroidx/compose/ui/layout/Ruler;F)F", "width", "height", "", "alignmentLines", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/RulerScope;", "Lkotlin/ExtensionFunctionType;", "rulers", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "placementBlock", "Landroidx/compose/ui/layout/MeasureResult;", "layout", "(IILjava/util/Map;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/layout/MeasureResult;", "result", "captureRulers$ui_release", "(Landroidx/compose/ui/layout/MeasureResult;)V", "captureRulers", "value", "provideRulerValue", "(Landroidx/compose/ui/layout/Ruler;F)V", "provideRelativeRulerValue", "", "f", "Z", "isPlacedUnderMotionFrameOfReference", "()Z", "setPlacedUnderMotionFrameOfReference", "(Z)V", "g", "isShallowPlacing$ui_release", "setShallowPlacing$ui_release", "isShallowPlacing", "h", "isPlacingForAlignment$ui_release", "setPlacingForAlignment$ui_release", "isPlacingForAlignment", "i", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "getPlacementScope", "()Landroidx/compose/ui/layout/Placeable$PlacementScope;", "placementScope", "Landroidx/compose/ui/unit/IntOffset;", "getPosition-nOcc-ac", "()J", "position", "getChild", "()Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "child", "getParent", "parent", "getHasMeasureResult", "hasMeasureResult", "Landroidx/compose/ui/node/LayoutNode;", "getLayoutNode", "()Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "getRulerScope", "()Landroidx/compose/ui/layout/RulerScope;", "rulerScope", "getMeasureResult$ui_release", "()Landroidx/compose/ui/layout/MeasureResult;", "measureResult", "Landroidx/compose/ui/node/AlignmentLinesOwner;", "getAlignmentLinesOwner", "()Landroidx/compose/ui/node/AlignmentLinesOwner;", "alignmentLinesOwner", "isLookingAhead", "isLookingAhead$annotations", "Companion", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLookaheadDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LookaheadDelegate.kt\nandroidx/compose/ui/node/LookaheadCapablePlaceable\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 ScatterSet.kt\nandroidx/collection/MutableScatterSet\n+ 5 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 6 ScatterMap.kt\nandroidx/collection/MutableScatterMap\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 LookaheadDelegate.kt\nandroidx/compose/ui/node/LookaheadDelegateKt\n+ 9 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 10 ObjectFloatMap.kt\nandroidx/collection/ObjectFloatMap\n*L\n1#1,491:1\n418#2,3:492\n363#2,6:495\n373#2,3:502\n376#2,2:506\n422#2:508\n423#2:536\n379#2,6:537\n424#2:543\n363#2,6:545\n373#2,3:552\n376#2,2:556\n379#2,6:562\n418#2,3:580\n363#2,6:583\n373#2,3:590\n376#2,2:594\n422#2,2:596\n379#2,6:598\n424#2:604\n418#2,3:605\n363#2,6:608\n373#2,3:615\n376#2,2:619\n422#2,2:621\n379#2,6:623\n424#2:629\n1810#3:501\n1672#3:505\n1810#3:518\n1672#3:522\n1810#3:551\n1672#3:555\n1810#3:589\n1672#3:593\n1810#3:614\n1672#3:618\n1810#3:641\n1672#3:645\n1810#3:666\n1672#3:670\n1810#3:693\n1672#3:697\n842#4,2:509\n845#4,4:525\n849#4:535\n237#5,7:511\n248#5,3:519\n251#5,2:523\n254#5,6:529\n267#5,4:682\n237#5,7:686\n248#5,3:694\n251#5,2:698\n272#5,2:700\n254#5,6:702\n274#5:708\n1047#6:544\n1049#6,4:558\n1053#6:568\n863#6:569\n1#7:570\n1#7:630\n341#8:571\n342#8:577\n345#8:579\n42#9,5:572\n48#9:578\n401#10,4:631\n373#10,6:635\n383#10,3:642\n386#10,2:646\n406#10,2:648\n389#10,6:650\n408#10:656\n415#10,3:657\n373#10,6:660\n383#10,3:667\n386#10,2:671\n419#10,2:673\n389#10,6:675\n421#10:681\n*S KotlinDebug\n*F\n+ 1 LookaheadDelegate.kt\nandroidx/compose/ui/node/LookaheadCapablePlaceable\n*L\n163#1:492,3\n163#1:495,6\n163#1:502,3\n163#1:506,2\n163#1:508\n163#1:536\n163#1:537,6\n163#1:543\n166#1:545,6\n166#1:552,3\n166#1:556,2\n166#1:562,6\n232#1:580,3\n232#1:583,6\n232#1:590,3\n232#1:594,2\n232#1:596,2\n232#1:598,6\n232#1:604\n247#1:605,3\n247#1:608,6\n247#1:615,3\n247#1:619,2\n247#1:621,2\n247#1:623,6\n247#1:629\n163#1:501\n163#1:505\n164#1:518\n164#1:522\n166#1:551\n166#1:555\n232#1:589\n232#1:593\n247#1:614\n247#1:618\n268#1:641\n268#1:645\n281#1:666\n281#1:670\n291#1:693\n291#1:697\n164#1:509,2\n164#1:525,4\n164#1:535\n164#1:511,7\n164#1:519,3\n164#1:523,2\n164#1:529,6\n291#1:682,4\n291#1:686,7\n291#1:694,3\n291#1:698,2\n291#1:700,2\n291#1:702,6\n291#1:708\n166#1:544\n166#1:558,4\n166#1:568\n171#1:569\n171#1:570\n211#1:571\n211#1:577\n211#1:579\n211#1:572,5\n211#1:578\n268#1:631,4\n268#1:635,6\n268#1:642,3\n268#1:646,2\n268#1:648,2\n268#1:650,6\n268#1:656\n281#1:657,3\n281#1:660,6\n281#1:667,3\n281#1:671,2\n281#1:673,2\n281#1:675,6\n281#1:681\n*E\n"})
public abstract class LookaheadCapablePlaceable extends Placeable implements MeasureScopeWithLayoutNode, MotionReferencePlacementDelegate {
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R \u0010\u0005\u001A\u000E\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/node/LookaheadCapablePlaceable$Companion;", "", "Lkotlin/Function1;", "Lb2/q;", "", "onCommitAffectingRuler", "Lkotlin/jvm/functions/Function1;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public boolean f;
    public boolean g;
    public boolean h;
    public final PlacementScope i;
    public MutableObjectFloatMap j;
    public MutableObjectFloatMap k;
    public MutableScatterMap l;
    public static final d m;

    static {
        LookaheadCapablePlaceable.Companion = new Companion(null);
        LookaheadCapablePlaceable.m = d.z;
    }

    public LookaheadCapablePlaceable() {
        this.i = PlaceableKt.PlacementScope(this);
    }

    public final void c(LayoutNode layoutNode0, Ruler ruler0) {
        boolean z;
        long[] arr_v3;
        Object[] arr_object3;
        int v8;
        Object[] arr_object2;
        long[] arr_v2;
        MutableScatterMap mutableScatterMap2;
        MutableScatterMap mutableScatterMap0 = this.l;
        if(mutableScatterMap0 == null) {
        label_84:
            MutableScatterMap mutableScatterMap1 = this.l;
            if(mutableScatterMap1 == null) {
            label_109:
                mutableScatterMap2 = this.l;
                if(mutableScatterMap2 == null) {
                    mutableScatterMap2 = new MutableScatterMap(0, 1, null);
                    this.l = mutableScatterMap2;
                }
            }
            else {
                long[] arr_v6 = mutableScatterMap1.metadata;
                int v12 = arr_v6.length - 2;
                if(v12 >= 0) {
                    int v13 = 0;
                    while(true) {
                        long v14 = arr_v6[v13];
                        if((~v14 << 7 & v14 & 0x8080808080808080L) == 0x8080808080808080L) {
                            goto label_106;
                        }
                        int v15 = 8 - (~(v13 - v12) >>> 0x1F);
                        for(int v16 = 0; v16 < v15; ++v16) {
                            if((v14 & 0xFFL) < 0x80L) {
                                int v17 = (v13 << 3) + v16;
                                Object object0 = mutableScatterMap1.keys[v17];
                                MutableScatterSet mutableScatterSet1 = (MutableScatterSet)mutableScatterMap1.values[v17];
                                Ruler ruler1 = (Ruler)object0;
                                if(mutableScatterSet1.isEmpty()) {
                                    mutableScatterMap1.removeValueAt(v17);
                                }
                            }
                            v14 >>= 8;
                        }
                        if(v15 == 8) {
                        label_106:
                            if(v13 != v12) {
                                ++v13;
                                continue;
                            }
                        }
                        goto label_109;
                    }
                }
                else {
                    goto label_109;
                }
            }
        }
        else {
            Object[] arr_object = mutableScatterMap0.values;
            long[] arr_v = mutableScatterMap0.metadata;
            int v = arr_v.length - 2;
            if(v >= 0) {
                int v1 = 0;
                while(true) {
                    long v2 = arr_v[v1];
                    if((~v2 << 7 & v2 & 0x8080808080808080L) == 0x8080808080808080L) {
                        goto label_77;
                    }
                    int v3 = 8 - (~(v1 - v) >>> 0x1F);
                    int v4 = 0;
                    while(v4 < v3) {
                        if((v2 & 0xFFL) < 0x80L) {
                            MutableScatterSet mutableScatterSet0 = (MutableScatterSet)arr_object[(v1 << 3) + v4];
                            Object[] arr_object1 = mutableScatterSet0.elements;
                            long[] arr_v1 = mutableScatterSet0.metadata;
                            int v5 = arr_v1.length - 2;
                            arr_v2 = arr_v;
                            if(v5 >= 0) {
                                int v6 = 0;
                                while(true) {
                                    long v7 = arr_v1[v6];
                                    arr_object2 = arr_object;
                                    v8 = v;
                                    if((~v7 << 7 & v7 & 0x8080808080808080L) == 0x8080808080808080L) {
                                        goto label_52;
                                    }
                                    int v9 = 8 - (~(v6 - v5) >>> 0x1F);
                                    int v10 = 0;
                                    while(v10 < v9) {
                                        if((v7 & 0xFFL) < 0x80L) {
                                            int v11 = (v6 << 3) + v10;
                                            LayoutNode layoutNode1 = (LayoutNode)((WeakReference)arr_object1[v11]).get();
                                            arr_object3 = arr_object1;
                                            if(layoutNode1 == null) {
                                                arr_v3 = arr_v1;
                                            }
                                            else {
                                                arr_v3 = arr_v1;
                                                if(layoutNode1.isAttached()) {
                                                    z = true;
                                                    goto label_38;
                                                }
                                            }
                                            z = false;
                                        label_38:
                                            if(!z) {
                                                mutableScatterSet0.removeElementAt(v11);
                                            }
                                        }
                                        else {
                                            arr_object3 = arr_object1;
                                            arr_v3 = arr_v1;
                                        }
                                        v7 >>= 8;
                                        ++v10;
                                        arr_v1 = arr_v3;
                                        arr_object1 = arr_object3;
                                    }
                                    Object[] arr_object4 = arr_object1;
                                    long[] arr_v4 = arr_v1;
                                    if(v9 == 8) {
                                        goto label_54;
                                    label_52:
                                        arr_object4 = arr_object1;
                                        arr_v4 = arr_v1;
                                    label_54:
                                        if(v6 != v5) {
                                            ++v6;
                                            arr_object = arr_object2;
                                            v = v8;
                                            arr_v1 = arr_v4;
                                            arr_object1 = arr_object4;
                                            continue;
                                        }
                                    }
                                    break;
                                }
                            }
                            else {
                                arr_object2 = arr_object;
                                v8 = v;
                            }
                        }
                        else {
                            arr_v2 = arr_v;
                            arr_object2 = arr_object;
                            v8 = v;
                        }
                        v2 >>= 8;
                        ++v4;
                        arr_v = arr_v2;
                        arr_object = arr_object2;
                        v = v8;
                    }
                    long[] arr_v5 = arr_v;
                    Object[] arr_object5 = arr_object;
                    if(v3 == 8) {
                        goto label_79;
                    label_77:
                        arr_v5 = arr_v;
                        arr_object5 = arr_object;
                    label_79:
                        if(v1 != v) {
                            ++v1;
                            arr_v = arr_v5;
                            arr_object = arr_object5;
                            continue;
                        }
                    }
                    goto label_84;
                }
            }
            else {
                goto label_84;
            }
        }
        MutableScatterSet mutableScatterSet2 = mutableScatterMap2.get(ruler0);
        if(mutableScatterSet2 == null) {
            mutableScatterSet2 = new MutableScatterSet(0, 1, null);
            mutableScatterMap2.set(ruler0, mutableScatterSet2);
        }
        mutableScatterSet2.plusAssign(new WeakReference(layoutNode0));
    }

    public abstract int calculateAlignmentLine(@NotNull AlignmentLine arg1);

    public final void captureRulers$ui_release(@Nullable MeasureResult measureResult0) {
        if(measureResult0 != null) {
            this.d(new q(measureResult0, this));
            return;
        }
        MutableScatterMap mutableScatterMap0 = this.l;
        if(mutableScatterMap0 == null) {
        label_24:
            MutableScatterMap mutableScatterMap1 = this.l;
            if(mutableScatterMap1 != null) {
                mutableScatterMap1.clear();
            }
        }
        else {
            Object[] arr_object = mutableScatterMap0.values;
            long[] arr_v = mutableScatterMap0.metadata;
            int v = arr_v.length - 2;
            if(v >= 0) {
                int v1 = 0;
                while(true) {
                    long v2 = arr_v[v1];
                    if((~v2 << 7 & v2 & 0x8080808080808080L) == 0x8080808080808080L) {
                        goto label_21;
                    }
                    int v3 = 8 - (~(v1 - v) >>> 0x1F);
                    for(int v4 = 0; v4 < v3; ++v4) {
                        if((0xFFL & v2) < 0x80L) {
                            this.e(((MutableScatterSet)arr_object[(v1 << 3) + v4]));
                        }
                        v2 >>= 8;
                    }
                    if(v3 == 8) {
                    label_21:
                        if(v1 != v) {
                            ++v1;
                            continue;
                        }
                    }
                    goto label_24;
                }
            }
            else {
                goto label_24;
            }
        }
        MutableObjectFloatMap mutableObjectFloatMap0 = this.j;
        if(mutableObjectFloatMap0 != null) {
            mutableObjectFloatMap0.clear();
        }
    }

    public final void d(q q0) {
        if(this.h) {
            return;
        }
        MutableScatterMap mutableScatterMap0 = this.l;
        if(q0.a.getRulers() != null) {
            MutableObjectFloatMap mutableObjectFloatMap0 = this.k;
            if(mutableObjectFloatMap0 == null) {
                mutableObjectFloatMap0 = new MutableObjectFloatMap(0, 1, null);
                this.k = mutableObjectFloatMap0;
            }
            MutableObjectFloatMap mutableObjectFloatMap1 = this.j;
            if(mutableObjectFloatMap1 == null) {
                mutableObjectFloatMap1 = new MutableObjectFloatMap(0, 1, null);
                this.j = mutableObjectFloatMap1;
            }
            mutableObjectFloatMap0.putAll(mutableObjectFloatMap1);
            mutableObjectFloatMap1.clear();
            Owner owner0 = this.getLayoutNode().getOwner$ui_release();
            if(owner0 != null) {
                OwnerSnapshotObserver ownerSnapshotObserver0 = owner0.getSnapshotObserver();
                if(ownerSnapshotObserver0 != null) {
                    m m0 = new m(13, q0, this);
                    ownerSnapshotObserver0.observeReads$ui_release(q0, LookaheadCapablePlaceable.m, m0);
                }
            }
            if(mutableScatterMap0 == null) {
            label_70:
                Object[] arr_object2 = mutableObjectFloatMap1.keys;
                long[] arr_v2 = mutableObjectFloatMap1.metadata;
                int v11 = arr_v2.length - 2;
                if(v11 >= 0) {
                    for(int v12 = 0; true; ++v12) {
                        long v13 = arr_v2[v12];
                        if((~v13 << 7 & v13 & 0x8080808080808080L) != 0x8080808080808080L) {
                            int v14 = 8 - (~(v12 - v11) >>> 0x1F);
                            for(int v15 = 0; v15 < v14; ++v15) {
                                if((v13 & 0xFFL) < 0x80L) {
                                    Ruler ruler1 = (Ruler)arr_object2[(v12 << 3) + v15];
                                    if(!mutableObjectFloatMap0.contains(ruler1)) {
                                        LookaheadCapablePlaceable lookaheadCapablePlaceable0 = this.getParent();
                                        if(lookaheadCapablePlaceable0 != null) {
                                            LookaheadCapablePlaceable lookaheadCapablePlaceable1;
                                            for(lookaheadCapablePlaceable1 = lookaheadCapablePlaceable0; lookaheadCapablePlaceable1.j == null || !lookaheadCapablePlaceable1.j.contains(ruler1); lookaheadCapablePlaceable1 = lookaheadCapablePlaceable2) {
                                                LookaheadCapablePlaceable lookaheadCapablePlaceable2 = lookaheadCapablePlaceable1.getParent();
                                                if(lookaheadCapablePlaceable2 == null) {
                                                    break;
                                                }
                                            }
                                            MutableScatterSet mutableScatterSet1 = lookaheadCapablePlaceable1.l == null ? null : ((MutableScatterSet)lookaheadCapablePlaceable1.l.remove(ruler1));
                                            if(mutableScatterSet1 != null) {
                                                lookaheadCapablePlaceable0.e(mutableScatterSet1);
                                            }
                                        }
                                    }
                                }
                                v13 >>= 8;
                            }
                            if(v14 != 8) {
                                mutableObjectFloatMap0.clear();
                                return;
                            }
                        }
                        if(v12 == v11) {
                            break;
                        }
                    }
                    mutableObjectFloatMap0.clear();
                    return;
                }
            }
            else {
                Object[] arr_object1 = mutableObjectFloatMap0.keys;
                float[] arr_f = mutableObjectFloatMap0.values;
                long[] arr_v1 = mutableObjectFloatMap0.metadata;
                int v5 = arr_v1.length - 2;
                if(v5 >= 0) {
                    int v6 = 0;
                    while(true) {
                        long v7 = arr_v1[v6];
                        if((~v7 << 7 & v7 & 0x8080808080808080L) == 0x8080808080808080L) {
                            goto label_67;
                        }
                        int v8 = 8 - (~(v6 - v5) >>> 0x1F);
                        for(int v9 = 0; v9 < v8; ++v9) {
                            if((v7 & 0xFFL) < 0x80L) {
                                int v10 = (v6 << 3) + v9;
                                Object object0 = arr_object1[v10];
                                float f = arr_f[v10];
                                Ruler ruler0 = (Ruler)object0;
                                if(mutableObjectFloatMap1.getOrDefault(ruler0, NaNf) != f) {
                                    MutableScatterSet mutableScatterSet0 = (MutableScatterSet)mutableScatterMap0.remove(ruler0);
                                    if(mutableScatterSet0 != null) {
                                        this.e(mutableScatterSet0);
                                    }
                                }
                            }
                            v7 >>= 8;
                        }
                        if(v8 == 8) {
                        label_67:
                            if(v6 != v5) {
                                ++v6;
                                continue;
                            }
                        }
                        goto label_70;
                    }
                }
                else {
                    goto label_70;
                }
            }
            mutableObjectFloatMap0.clear();
        }
        else if(mutableScatterMap0 != null) {
            Object[] arr_object = mutableScatterMap0.values;
            long[] arr_v = mutableScatterMap0.metadata;
            int v = arr_v.length - 2;
            if(v >= 0) {
                int v1 = 0;
                while(true) {
                    long v2 = arr_v[v1];
                    if((~v2 << 7 & v2 & 0x8080808080808080L) != 0x8080808080808080L) {
                        int v3 = 8 - (~(v1 - v) >>> 0x1F);
                        for(int v4 = 0; v4 < v3; ++v4) {
                            if((v2 & 0xFFL) < 0x80L) {
                                this.e(((MutableScatterSet)arr_object[(v1 << 3) + v4]));
                            }
                            v2 >>= 8;
                        }
                        if(v3 == 8) {
                            goto label_21;
                        }
                        break;
                    }
                label_21:
                    if(v1 == v) {
                        break;
                    }
                    ++v1;
                }
            }
            mutableScatterMap0.clear();
        }
    }

    public final void e(MutableScatterSet mutableScatterSet0) {
        Object[] arr_object = mutableScatterSet0.elements;
        long[] arr_v = mutableScatterSet0.metadata;
        int v = arr_v.length - 2;
        if(v >= 0) {
            int v1 = 0;
            while(true) {
                long v2 = arr_v[v1];
                if((~v2 << 7 & v2 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v3 = 8 - (~(v1 - v) >>> 0x1F);
                    for(int v4 = 0; v4 < v3; ++v4) {
                        if((0xFFL & v2) < 0x80L) {
                            LayoutNode layoutNode0 = (LayoutNode)((WeakReference)arr_object[(v1 << 3) + v4]).get();
                            if(layoutNode0 != null) {
                                if(this.isLookingAhead()) {
                                    layoutNode0.requestLookaheadRelayout$ui_release(false);
                                }
                                else {
                                    layoutNode0.requestRelayout$ui_release(false);
                                }
                            }
                        }
                        v2 >>= 8;
                    }
                    if(v3 == 8) {
                        goto label_21;
                    }
                    break;
                }
            label_21:
                if(v1 == v) {
                    break;
                }
                ++v1;
            }
        }
    }

    public final float findRulerValue(@NotNull Ruler ruler0, float f) {
        if(this.h) {
            return f;
        }
        for(LookaheadCapablePlaceable lookaheadCapablePlaceable0 = this; true; lookaheadCapablePlaceable0 = lookaheadCapablePlaceable1) {
            float f1 = lookaheadCapablePlaceable0.j == null ? NaNf : lookaheadCapablePlaceable0.j.getOrDefault(ruler0, NaNf);
            if(!Float.isNaN(f1)) {
                lookaheadCapablePlaceable0.c(this.getLayoutNode(), ruler0);
                return ruler0.calculateCoordinate$ui_release(f1, lookaheadCapablePlaceable0.getCoordinates(), this.getCoordinates());
            }
            LookaheadCapablePlaceable lookaheadCapablePlaceable1 = lookaheadCapablePlaceable0.getParent();
            if(lookaheadCapablePlaceable1 == null) {
                lookaheadCapablePlaceable0.c(this.getLayoutNode(), ruler0);
                return f;
            }
        }
    }

    @Override  // androidx.compose.ui.layout.Measured
    public final int get(@NotNull AlignmentLine alignmentLine0) {
        if(!this.getHasMeasureResult()) {
            return 0x80000000;
        }
        int v = this.calculateAlignmentLine(alignmentLine0);
        if(v == 0x80000000) {
            return 0x80000000;
        }
        return alignmentLine0 instanceof VerticalAlignmentLine ? v + IntOffset.getX-impl(this.getApparentToRealOffset-nOcc-ac()) : v + IntOffset.getY-impl(this.getApparentToRealOffset-nOcc-ac());
    }

    @NotNull
    public abstract AlignmentLinesOwner getAlignmentLinesOwner();

    @Nullable
    public abstract LookaheadCapablePlaceable getChild();

    @NotNull
    public abstract LayoutCoordinates getCoordinates();

    public abstract boolean getHasMeasureResult();

    @Override  // androidx.compose.ui.node.MeasureScopeWithLayoutNode
    @NotNull
    public abstract LayoutNode getLayoutNode();

    @NotNull
    public abstract MeasureResult getMeasureResult$ui_release();

    @Nullable
    public abstract LookaheadCapablePlaceable getParent();

    @NotNull
    public final PlacementScope getPlacementScope() {
        return this.i;
    }

    public abstract long getPosition-nOcc-ac();

    @NotNull
    public final RulerScope getRulerScope() {
        return new RulerScope() {
            public final LookaheadCapablePlaceable a;

            {
                this.a = lookaheadCapablePlaceable0;
            }

            @Override  // androidx.compose.ui.layout.RulerScope
            @NotNull
            public LayoutCoordinates getCoordinates() {
                this.a.getLayoutNode().getLayoutDelegate$ui_release().onCoordinatesUsed();
                return this.a.getCoordinates();
            }

            @Override  // androidx.compose.ui.unit.Density
            public float getDensity() {
                return this.a.getDensity();
            }

            @Override  // androidx.compose.ui.unit.FontScaling
            public float getFontScale() {
                return this.a.getFontScale();
            }

            @Override  // androidx.compose.ui.layout.RulerScope
            public void provides(@NotNull Ruler ruler0, float f) {
                this.a.provideRulerValue(ruler0, f);
            }

            @Override  // androidx.compose.ui.layout.RulerScope
            public void providesRelative(@NotNull VerticalRuler verticalRuler0, float f) {
                this.a.provideRelativeRulerValue(verticalRuler0, f);
            }
        };
    }

    public final void invalidateAlignmentLinesFromPositionChange(@NotNull NodeCoordinator nodeCoordinator0) {
        NodeCoordinator nodeCoordinator1 = nodeCoordinator0.getWrapped$ui_release();
        if(!Intrinsics.areEqual((nodeCoordinator1 == null ? null : nodeCoordinator1.getLayoutNode()), nodeCoordinator0.getLayoutNode())) {
            nodeCoordinator0.getAlignmentLinesOwner().getAlignmentLines().onAlignmentsChanged();
            return;
        }
        AlignmentLinesOwner alignmentLinesOwner0 = nodeCoordinator0.getAlignmentLinesOwner().getParentAlignmentLinesOwner();
        if(alignmentLinesOwner0 != null) {
            AlignmentLines alignmentLines0 = alignmentLinesOwner0.getAlignmentLines();
            if(alignmentLines0 != null) {
                alignmentLines0.onAlignmentsChanged();
            }
        }
    }

    @Override  // androidx.compose.ui.layout.IntrinsicMeasureScope
    public boolean isLookingAhead() {
        return false;
    }

    public static void isLookingAhead$annotations() {
    }

    @Override  // androidx.compose.ui.node.MotionReferencePlacementDelegate
    public boolean isPlacedUnderMotionFrameOfReference() {
        return this.f;
    }

    public final boolean isPlacingForAlignment$ui_release() {
        return this.h;
    }

    public final boolean isShallowPlacing$ui_release() {
        return this.g;
    }

    @Override  // androidx.compose.ui.layout.MeasureScope
    @NotNull
    public MeasureResult layout(int v, int v1, @NotNull Map map0, @Nullable Function1 function10, @NotNull Function1 function11) {
        if((v & 0xFF000000) != 0 || (0xFF000000 & v1) != 0) {
            InlineClassHelperKt.throwIllegalStateException(("Size(" + v + " x " + v1 + ") is out of range. Each dimension must be between 0 and 16777215."));
        }
        return new MeasureResult() {
            public final int a;
            public final int b;
            public final Map c;
            public final Function1 d;
            public final Function1 e;
            public final LookaheadCapablePlaceable f;

            {
                int v = v1;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                int v1 = map0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                Map map0 = function10;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                Function1 function10 = function11;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                Function1 function11 = this;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                this.a = v;
                this.b = v1;
                this.c = map0;
                this.d = function10;
                this.e = function11;
                this.f = lookaheadCapablePlaceable0;
            }

            @Override  // androidx.compose.ui.layout.MeasureResult
            @NotNull
            public Map getAlignmentLines() {
                return this.c;
            }

            @Override  // androidx.compose.ui.layout.MeasureResult
            public int getHeight() {
                return this.b;
            }

            @Override  // androidx.compose.ui.layout.MeasureResult
            @Nullable
            public Function1 getRulers() {
                return this.d;
            }

            @Override  // androidx.compose.ui.layout.MeasureResult
            public int getWidth() {
                return this.a;
            }

            @Override  // androidx.compose.ui.layout.MeasureResult
            public void placeChildren() {
                this.e.invoke(this.f.getPlacementScope());
            }
        };
    }

    public final void provideRelativeRulerValue(@NotNull Ruler ruler0, float f) {
        MutableObjectFloatMap mutableObjectFloatMap0 = this.j;
        if(mutableObjectFloatMap0 == null) {
            mutableObjectFloatMap0 = new MutableObjectFloatMap(0, 1, null);
            this.j = mutableObjectFloatMap0;
        }
        if(this.getLayoutDirection() != LayoutDirection.Ltr) {
            f = ((float)this.getWidth()) - f;
        }
        mutableObjectFloatMap0.set(ruler0, f);
    }

    public final void provideRulerValue(@NotNull Ruler ruler0, float f) {
        MutableObjectFloatMap mutableObjectFloatMap0 = this.j;
        if(mutableObjectFloatMap0 == null) {
            mutableObjectFloatMap0 = new MutableObjectFloatMap(0, 1, null);
            this.j = mutableObjectFloatMap0;
        }
        mutableObjectFloatMap0.set(ruler0, f);
    }

    public abstract void replace$ui_release();

    @Override  // androidx.compose.ui.node.MotionReferencePlacementDelegate
    public void setPlacedUnderMotionFrameOfReference(boolean z) {
        this.f = z;
    }

    public final void setPlacingForAlignment$ui_release(boolean z) {
        this.h = z;
    }

    public final void setShallowPlacing$ui_release(boolean z) {
        this.g = z;
    }
}

