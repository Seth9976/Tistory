package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.SnapPosition;
import androidx.compose.foundation.gestures.snapping.SnapPositionKt;
import androidx.compose.foundation.layout.Arrangement.Absolute;
import androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Alignment.Horizontal;
import androidx.compose.ui.Alignment.Vertical;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.LayoutDirection;
import f0.u;
import f0.v;
import f0.w;
import f0.x;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArrayDeque;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntProgression;
import kotlin.ranges.c;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\u001Añ\u0001\u0010+\u001A\u00020(*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u00012\u0006\u0010\u0004\u001A\u00020\u00032\u0006\u0010\u0005\u001A\u00020\u00012\u0006\u0010\u0006\u001A\u00020\u00012\u0006\u0010\u0007\u001A\u00020\u00012\u0006\u0010\b\u001A\u00020\u00012\u0006\u0010\t\u001A\u00020\u00012\u0006\u0010\n\u001A\u00020\u00012\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\u000E\u001A\u00020\r2\b\u0010\u0010\u001A\u0004\u0018\u00010\u000F2\b\u0010\u0012\u001A\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001A\u00020\u00132\u0006\u0010\u0016\u001A\u00020\u00152\u0006\u0010\u0017\u001A\u00020\u00012\u0006\u0010\u0018\u001A\u00020\u00012\f\u0010\u001A\u001A\b\u0012\u0004\u0012\u00020\u00010\u00192\u0006\u0010\u001C\u001A\u00020\u001B2\u0006\u0010\u001E\u001A\u00020\u001D2\u0006\u0010 \u001A\u00020\u001F2/\u0010\'\u001A+\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\"¢\u0006\u0002\b%\u0012\u0004\u0012\u00020&0!H\u0000ø\u0001\u0000¢\u0006\u0004\b)\u0010*\"\u0014\u0010-\u001A\u00020,8\u0000X\u0080T¢\u0006\u0006\n\u0004\b-\u0010.\"\u0014\u0010/\u001A\u00020,8\u0000X\u0080T¢\u0006\u0006\n\u0004\b/\u0010.\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u00060"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "", "pageCount", "Landroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;", "pagerItemProvider", "mainAxisAvailableSize", "beforeContentPadding", "afterContentPadding", "spaceBetweenPages", "currentPage", "currentPageOffset", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "Landroidx/compose/ui/Alignment$Vertical;", "verticalAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "horizontalAlignment", "", "reverseLayout", "Landroidx/compose/ui/unit/IntOffset;", "visualPageOffset", "pageAvailableSize", "beyondViewportPageCount", "", "pinnedPages", "Landroidx/compose/foundation/gestures/snapping/SnapPosition;", "snapPosition", "Landroidx/compose/foundation/lazy/layout/ObservableScopeInvalidator;", "placementScopeInvalidator", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Lkotlin/Function3;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "", "Lkotlin/ExtensionFunctionType;", "Landroidx/compose/ui/layout/MeasureResult;", "layout", "Landroidx/compose/foundation/pager/PagerMeasureResult;", "measurePager-bmk8ZPk", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;ILandroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;IIIIIIJLandroidx/compose/foundation/gestures/Orientation;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/ui/Alignment$Horizontal;ZJIILjava/util/List;Landroidx/compose/foundation/gestures/snapping/SnapPosition;Landroidx/compose/runtime/MutableState;Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function3;)Landroidx/compose/foundation/pager/PagerMeasureResult;", "measurePager", "", "MinPageOffset", "F", "MaxPageOffset", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPagerMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerMeasure.kt\nandroidx/compose/foundation/pager/PagerMeasureKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,681:1\n677#1,4:683\n677#1,4:687\n677#1,4:691\n677#1,4:695\n677#1,4:699\n677#1,4:703\n677#1,4:752\n1#2:682\n33#3,6:707\n33#3,6:713\n235#3,3:719\n33#3,4:722\n238#3,2:726\n38#3:728\n240#3:729\n235#3,3:730\n33#3,4:733\n238#3,2:737\n38#3:739\n240#3:740\n235#3,3:741\n33#3,4:744\n238#3,2:748\n38#3:750\n240#3:751\n33#3,6:756\n33#3,6:762\n171#3,13:768\n33#3,6:781\n33#3,6:787\n33#3,6:793\n*S KotlinDebug\n*F\n+ 1 PagerMeasure.kt\nandroidx/compose/foundation/pager/PagerMeasureKt\n*L\n69#1:683,4\n134#1:687,4\n155#1:691,4\n175#1:695,4\n214#1:699,4\n236#1:703,4\n445#1:752,4\n335#1:707,6\n361#1:713,6\n401#1:719,3\n401#1:722,4\n401#1:726,2\n401#1:728\n401#1:729\n406#1:730,3\n406#1:733,4\n406#1:737,2\n406#1:739\n406#1:740\n411#1:741,3\n411#1:744,4\n411#1:748,2\n411#1:750\n411#1:751\n499#1:756,6\n524#1:762,6\n543#1:768,13\n651#1:781,6\n658#1:787,6\n664#1:793,6\n*E\n"})
public final class PagerMeasureKt {
    public static final float MaxPageOffset = 0.5f;
    public static final float MinPageOffset = -0.5f;

    public static final MeasuredPage a(LazyLayoutMeasureScope lazyLayoutMeasureScope0, int v, long v1, PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider0, long v2, Orientation orientation0, Horizontal alignment$Horizontal0, Vertical alignment$Vertical0, LayoutDirection layoutDirection0, boolean z, int v3) {
        Object object0 = pagerLazyLayoutItemProvider0.getKey(v);
        return new MeasuredPage(v, v3, lazyLayoutMeasureScope0.measure-0kLqBqw(v, v1), v2, object0, orientation0, alignment$Horizontal0, alignment$Vertical0, layoutDirection0, z, null);
    }

    @NotNull
    public static final PagerMeasureResult measurePager-bmk8ZPk(@NotNull LazyLayoutMeasureScope lazyLayoutMeasureScope0, int v, @NotNull PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider0, int v1, int v2, int v3, int v4, int v5, int v6, long v7, @NotNull Orientation orientation0, @Nullable Vertical alignment$Vertical0, @Nullable Horizontal alignment$Horizontal0, boolean z, long v8, int v9, int v10, @NotNull List list0, @NotNull SnapPosition snapPosition0, @NotNull MutableState mutableState0, @NotNull CoroutineScope coroutineScope0, @NotNull Function3 function30) {
        int v105;
        int v104;
        ArrayList arrayList4;
        List list5;
        List list4;
        ArrayList arrayList2;
        List list3;
        int v82;
        int v81;
        int[] arr_v2;
        ArrayList arrayList1;
        int v80;
        int v79;
        MeasuredPage measuredPage5;
        int v71;
        long v70;
        int v49;
        MeasuredPage measuredPage4;
        int v48;
        int v47;
        int v46;
        int v45;
        int v44;
        ArrayDeque arrayDeque4;
        ArrayDeque arrayDeque3;
        int v39;
        int v38;
        ArrayDeque arrayDeque2;
        int v37;
        int v36;
        int v35;
        int v34;
        if(v2 < 0) {
            throw new IllegalArgumentException("negative beforeContentPadding");
        }
        if(v3 < 0) {
            throw new IllegalArgumentException("negative afterContentPadding");
        }
        int v11 = v9 + v4;
        int v12 = c.coerceAtLeast(v11, 0);
        if(v <= 0) {
            return new PagerMeasureResult(CollectionsKt__CollectionsKt.emptyList(), v9, v4, v3, orientation0, -v2, v1 + v3, false, v10, null, null, 0.0f, 0, false, snapPosition0, ((MeasureResult)function30.invoke(Constraints.getMinWidth-impl(v7), Constraints.getMinHeight-impl(v7), v.w)), false, null, null, coroutineScope0, 0x60000, null);
        }
        long v13 = ConstraintsKt.Constraints$default(0, (orientation0 == Orientation.Vertical ? Constraints.getMaxWidth-impl(v7) : v9), 0, (orientation0 == Orientation.Vertical ? v9 : Constraints.getMaxHeight-impl(v7)), 5, null);
        int v14 = v5;
        int v15;
        for(v15 = v6; v14 > 0 && v15 > 0; v15 -= v12) {
            --v14;
        }
        int v16 = -v15;
        if(v14 >= v) {
            v14 = v - 1;
            v16 = 0;
        }
        ArrayDeque arrayDeque0 = new ArrayDeque();
        int v17 = (v4 >= 0 ? 0 : v4) - v2;
        int v18 = v16 + v17;
        int v19 = 0;
        while(v18 < 0 && v14 > 0) {
            MeasuredPage measuredPage0 = PagerMeasureKt.a(lazyLayoutMeasureScope0, v14 - 1, v13, pagerLazyLayoutItemProvider0, v8, orientation0, alignment$Horizontal0, alignment$Vertical0, lazyLayoutMeasureScope0.getLayoutDirection(), z, v9);
            arrayDeque0.add(0, measuredPage0);
            v19 = Math.max(v19, measuredPage0.getCrossAxisSize());
            v18 += v12;
            --v14;
        }
        int v20 = v12;
        ArrayDeque arrayDeque1 = arrayDeque0;
        int v21 = (v18 >= v17 ? v18 : v17) - v17;
        int v22 = v1 + v3;
        int v23 = c.coerceAtLeast(v22, 0);
        int v24 = -v21;
        int v25 = v14;
        int v26 = 0;
        int v27 = 0;
        while(v26 < arrayDeque1.size()) {
            if(v24 >= v23) {
                arrayDeque1.remove(v26);
                v27 = 1;
            }
            else {
                ++v25;
                v24 += v20;
                ++v26;
            }
        }
        int v28 = v21;
        int v29 = v24;
        int v30 = v27;
        int v31 = v25;
        int v32 = v19;
        int v33 = v14;
        while(true) {
            if(v31 >= v) {
                v34 = v32;
                v35 = v29;
                v36 = v22;
                v37 = v33;
                arrayDeque2 = arrayDeque1;
                v38 = v31;
                break;
            }
            if(v29 >= v23 && v29 > 0 && !arrayDeque1.isEmpty()) {
                v34 = v32;
                v35 = v29;
                v36 = v22;
                v37 = v33;
                arrayDeque2 = arrayDeque1;
                v38 = v31;
                break;
            }
            MeasuredPage measuredPage1 = PagerMeasureKt.a(lazyLayoutMeasureScope0, v31, v13, pagerLazyLayoutItemProvider0, v8, orientation0, alignment$Horizontal0, alignment$Vertical0, lazyLayoutMeasureScope0.getLayoutDirection(), z, v9);
            v29 += (v31 == v - 1 ? v9 : v20);
            if(v29 > v17 || v31 == v - 1) {
                arrayDeque3 = arrayDeque1;
                arrayDeque3.add(measuredPage1);
                v39 = v33;
                v32 = Math.max(v32, measuredPage1.getCrossAxisSize());
            }
            else {
                v39 = v31 + 1;
                v28 -= v20;
                arrayDeque3 = arrayDeque1;
                v30 = 1;
            }
            v33 = v39;
            ++v31;
            arrayDeque1 = arrayDeque3;
        }
        if(v35 < v1) {
            int v40 = v1 - v35;
            v35 += v40;
            int v41 = v37;
            int v42 = v34;
            int v43 = v28 - v40;
            while(v43 < v2 && v41 > 0) {
                MeasuredPage measuredPage2 = PagerMeasureKt.a(lazyLayoutMeasureScope0, v41 - 1, v13, pagerLazyLayoutItemProvider0, v8, orientation0, alignment$Horizontal0, alignment$Vertical0, lazyLayoutMeasureScope0.getLayoutDirection(), z, v9);
                arrayDeque2.add(0, measuredPage2);
                v42 = Math.max(v42, measuredPage2.getCrossAxisSize());
                v43 += v20;
                --v41;
            }
            arrayDeque4 = arrayDeque2;
            v44 = v38;
            v45 = v42;
            if(v43 < 0) {
                v46 = v41;
                v35 += v43;
                v47 = 0;
            }
            else {
                v46 = v41;
                v47 = v43;
            }
        }
        else {
            arrayDeque4 = arrayDeque2;
            v44 = v38;
            v46 = v37;
            v45 = v34;
            v47 = v28;
        }
        if(v47 < 0) {
            throw new IllegalArgumentException("invalid currentFirstPageScrollOffset");
        }
        MeasuredPage measuredPage3 = (MeasuredPage)arrayDeque4.first();
        if(v2 > 0 || v4 < 0) {
            int v50 = arrayDeque4.size();
            int v51 = v47;
            int v52 = 0;
            while(true) {
                if(v52 >= v50 || v51 == 0) {
                    v48 = v20;
                    break;
                }
                v48 = v20;
                if(v48 > v51 || v52 == CollectionsKt__CollectionsKt.getLastIndex(arrayDeque4)) {
                    break;
                }
                v51 -= v48;
                ++v52;
                measuredPage3 = (MeasuredPage)arrayDeque4.get(v52);
                v20 = v48;
            }
            measuredPage4 = measuredPage3;
            v49 = v51;
        }
        else {
            v48 = v20;
            measuredPage4 = measuredPage3;
            v49 = v47;
        }
        x x0 = new x(lazyLayoutMeasureScope0, v13, pagerLazyLayoutItemProvider0, v8, orientation0, alignment$Horizontal0, alignment$Vertical0, z, v9);
        int v53 = Math.max(0, v46 - v10);
        int v54 = v46 - 1;
        Object object0 = null;
        List list1 = null;
        if(v53 <= v54) {
            while(true) {
                if(list1 == null) {
                    list1 = new ArrayList();
                }
                list1.add(x0.invoke(v54));
                if(v54 == v53) {
                    break;
                }
                --v54;
            }
        }
        int v55 = list0.size();
        for(int v56 = 0; v56 < v55; ++v56) {
            int v57 = ((Number)list0.get(v56)).intValue();
            if(v57 < v53) {
                if(list1 == null) {
                    list1 = new ArrayList();
                }
                list1.add(x0.invoke(v57));
            }
        }
        if(list1 == null) {
            list1 = CollectionsKt__CollectionsKt.emptyList();
        }
        int v58 = list1.size();
        int v59 = v45;
        for(int v60 = 0; v60 < v58; ++v60) {
            v59 = Math.max(v59, ((MeasuredPage)list1.get(v60)).getCrossAxisSize());
        }
        int v61 = ((MeasuredPage)arrayDeque4.last()).getIndex();
        w w0 = new w(lazyLayoutMeasureScope0, v13, pagerLazyLayoutItemProvider0, v8, orientation0, alignment$Horizontal0, alignment$Vertical0, z, v9);
        int v62 = Math.min(v61 + v10, v - 1);
        int v63 = v61 + 1;
        List list2 = null;
        if(v63 <= v62) {
            while(true) {
                if(list2 == null) {
                    list2 = new ArrayList();
                }
                list2.add(w0.invoke(v63));
                if(v63 == v62) {
                    break;
                }
                ++v63;
            }
        }
        int v64 = list0.size();
        for(int v65 = 0; v65 < v64; ++v65) {
            int v66 = ((Number)list0.get(v65)).intValue();
            if(v62 + 1 <= v66 && v66 < v) {
                if(list2 == null) {
                    list2 = new ArrayList();
                }
                list2.add(w0.invoke(v66));
            }
        }
        if(list2 == null) {
            list2 = CollectionsKt__CollectionsKt.emptyList();
        }
        int v67 = list2.size();
        int v68 = v59;
        for(int v69 = 0; v69 < v67; ++v69) {
            v68 = Math.max(v68, ((MeasuredPage)list2.get(v69)).getCrossAxisSize());
        }
        boolean z1 = Intrinsics.areEqual(measuredPage4, arrayDeque4.first()) && list1.isEmpty() && list2.isEmpty();
        Orientation orientation1 = Orientation.Vertical;
        if(orientation0 == orientation1) {
            v70 = v7;
            v71 = v68;
        }
        else {
            v70 = v7;
            v71 = v35;
        }
        int v72 = ConstraintsKt.constrainWidth-K40F9xA(v70, v71);
        if(orientation0 == orientation1) {
            v68 = v35;
        }
        int v73 = ConstraintsKt.constrainHeight-K40F9xA(v70, v68);
        int v74 = orientation0 == orientation1 ? v73 : v72;
        boolean z2 = v35 < Math.min(v74, v1);
        int v75 = -v47;
        if(z2 && v75 != 0) {
            throw new IllegalStateException(("non-zero pagesScrollOffset=" + v75).toString());
        }
        ArrayList arrayList0 = new ArrayList(list2.size() + (list1.size() + arrayDeque4.size()));
        if(z2) {
            if(!list1.isEmpty() || !list2.isEmpty()) {
                throw new IllegalArgumentException("No extra pages");
            }
            int v76 = arrayDeque4.size();
            int[] arr_v = new int[v76];
            for(int v77 = 0; v77 < v76; ++v77) {
                arr_v[v77] = v9;
            }
            int[] arr_v1 = new int[v76];
            for(int v78 = 0; v78 < v76; ++v78) {
                arr_v1[v78] = 0;
            }
            measuredPage5 = measuredPage4;
            v79 = -v2;
            float f = lazyLayoutMeasureScope0.toDp-u2uoSUM(v4);
            HorizontalOrVertical arrangement$HorizontalOrVertical0 = Absolute.INSTANCE.spacedBy-0680j_4(f);
            if(orientation0 == Orientation.Vertical) {
                arrangement$HorizontalOrVertical0.arrange(lazyLayoutMeasureScope0, v74, arr_v, arr_v1);
                v80 = v76;
                arrayList1 = arrayList0;
                arr_v2 = arr_v1;
                v81 = v35;
                v82 = v74;
            }
            else {
                arr_v2 = arr_v1;
                v80 = v76;
                arrayList1 = arrayList0;
                v81 = v35;
                v82 = v74;
                arrangement$HorizontalOrVertical0.arrange(lazyLayoutMeasureScope0, v74, arr_v, LayoutDirection.Ltr, arr_v2);
            }
            IntProgression intProgression0 = ArraysKt___ArraysKt.getIndices(arr_v2);
            if(z) {
                intProgression0 = c.reversed(intProgression0);
            }
            int v83 = intProgression0.getFirst();
            int v84 = intProgression0.getLast();
            int v85 = intProgression0.getStep();
            if(v85 > 0 && v83 <= v84 || v85 < 0 && v84 <= v83) {
                while(true) {
                    int v86 = arr_v2[v83];
                    MeasuredPage measuredPage6 = (MeasuredPage)arrayDeque4.get((z ? v80 - v83 - 1 : v83));
                    if(z) {
                        v86 = v82 - v86 - measuredPage6.getSize();
                    }
                    measuredPage6.position(v86, v72, v73);
                    arrayList1.add(measuredPage6);
                    if(v83 == v84) {
                        break;
                    }
                    v83 += v85;
                }
            }
            list3 = list1;
        }
        else {
            v81 = v35;
            measuredPage5 = measuredPage4;
            v79 = -v2;
            arrayList1 = arrayList0;
            int v87 = list1.size();
            int v88 = v75;
            for(int v89 = 0; v89 < v87; ++v89) {
                MeasuredPage measuredPage7 = (MeasuredPage)list1.get(v89);
                v88 -= v11;
                measuredPage7.position(v88, v72, v73);
                arrayList1.add(measuredPage7);
            }
            list3 = list1;
            int v90 = arrayDeque4.size();
            for(int v91 = 0; v91 < v90; ++v91) {
                MeasuredPage measuredPage8 = (MeasuredPage)arrayDeque4.get(v91);
                measuredPage8.position(v75, v72, v73);
                arrayList1.add(measuredPage8);
                v75 += v11;
            }
            int v92 = list2.size();
            for(int v93 = 0; v93 < v92; ++v93) {
                MeasuredPage measuredPage9 = (MeasuredPage)list2.get(v93);
                measuredPage9.position(v75, v72, v73);
                arrayList1.add(measuredPage9);
                v75 += v11;
            }
        }
        if(z1) {
            arrayList2 = arrayList1;
        }
        else {
            ArrayList arrayList3 = new ArrayList(arrayList1.size());
            int v94 = arrayList1.size();
            for(int v95 = 0; v95 < v94; ++v95) {
                Object object1 = arrayList1.get(v95);
                if(((MeasuredPage)object1).getIndex() >= ((MeasuredPage)arrayDeque4.first()).getIndex() && ((MeasuredPage)object1).getIndex() <= ((MeasuredPage)arrayDeque4.last()).getIndex()) {
                    arrayList3.add(object1);
                }
            }
            arrayList2 = arrayList3;
        }
        if(list3.isEmpty()) {
            list4 = CollectionsKt__CollectionsKt.emptyList();
        }
        else {
            list4 = new ArrayList(arrayList1.size());
            int v96 = arrayList1.size();
            for(int v97 = 0; v97 < v96; ++v97) {
                Object object2 = arrayList1.get(v97);
                if(((MeasuredPage)object2).getIndex() < ((MeasuredPage)arrayDeque4.first()).getIndex()) {
                    ((ArrayList)list4).add(object2);
                }
            }
        }
        if(list2.isEmpty()) {
            list5 = CollectionsKt__CollectionsKt.emptyList();
        }
        else {
            list5 = new ArrayList(arrayList1.size());
            int v98 = arrayList1.size();
            for(int v99 = 0; v99 < v98; ++v99) {
                Object object3 = arrayList1.get(v99);
                if(((MeasuredPage)object3).getIndex() > ((MeasuredPage)arrayDeque4.last()).getIndex()) {
                    ((ArrayList)list5).add(object3);
                }
            }
        }
        int v100 = orientation0 == Orientation.Vertical ? v73 : v72;
        if(arrayList2.isEmpty()) {
            arrayList4 = arrayList2;
        }
        else {
            Object object4 = arrayList2.get(0);
            float f1 = Math.abs(SnapPositionKt.calculateDistanceToDesiredSnapPosition(v100, v2, v3, v48, ((MeasuredPage)object4).getOffset(), ((MeasuredPage)object4).getIndex(), snapPosition0, v));
            int v101 = CollectionsKt__CollectionsKt.getLastIndex(arrayList2);
            if(1 <= v101) {
                float f2 = -f1;
                int v102 = 1;
                while(true) {
                    Object object5 = arrayList2.get(v102);
                    arrayList4 = arrayList2;
                    float f3 = -Math.abs(SnapPositionKt.calculateDistanceToDesiredSnapPosition(v100, v2, v3, v48, ((MeasuredPage)object5).getOffset(), ((MeasuredPage)object5).getIndex(), snapPosition0, v));
                    if(Float.compare(f2, f3) < 0) {
                        f2 = f3;
                        object4 = object5;
                    }
                    if(v102 == v101) {
                        break;
                    }
                    ++v102;
                    arrayList2 = arrayList4;
                }
            }
            else {
                arrayList4 = arrayList2;
            }
            object0 = object4;
        }
        int v103 = snapPosition0.position(v1, v9, v2, v3, (((MeasuredPage)object0) == null ? 0 : ((MeasuredPage)object0).getIndex()), v);
        if(((MeasuredPage)object0) == null) {
            v105 = v48;
            v104 = 0;
        }
        else {
            v104 = ((MeasuredPage)object0).getOffset();
            v105 = v48;
        }
        float f4 = v105 == 0 ? 0.0f : c.coerceIn(((float)(v103 - v104)) / ((float)v105), -0.5f, 0.5f);
        Object object6 = function30.invoke(v72, v73, new u(arrayList1, mutableState0));
        return v44 < v || v81 > v1 ? new PagerMeasureResult(arrayList4, v9, v4, v3, orientation0, v79, v36, z, v10, measuredPage5, ((MeasuredPage)object0), f4, v49, true, snapPosition0, ((MeasureResult)object6), ((boolean)v30), list4, list5, coroutineScope0) : new PagerMeasureResult(arrayList4, v9, v4, v3, orientation0, v79, v36, z, v10, measuredPage5, ((MeasuredPage)object0), f4, v49, false, snapPosition0, ((MeasureResult)object6), ((boolean)v30), list4, list5, coroutineScope0);
    }
}

