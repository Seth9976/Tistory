package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement.Horizontal;
import androidx.compose.foundation.layout.Arrangement.Vertical;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import c0.l;
import c0.m;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArrayDeque;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntProgression;
import kotlin.ranges.c;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u008E\u0001\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001A¸\u0002\u00104\u001A\u0002012\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0006\u001A\u00020\u00002\u0006\u0010\u0007\u001A\u00020\u00002\u0006\u0010\b\u001A\u00020\u00002\u0006\u0010\t\u001A\u00020\u00002\u0006\u0010\n\u001A\u00020\u00002\u0006\u0010\u000B\u001A\u00020\u00002\u0006\u0010\r\u001A\u00020\f2\u0006\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\u0011\u001A\u00020\u00102\b\u0010\u0013\u001A\u0004\u0018\u00010\u00122\b\u0010\u0015\u001A\u0004\u0018\u00010\u00142\u0006\u0010\u0016\u001A\u00020\u00102\u0006\u0010\u0018\u001A\u00020\u00172\f\u0010\u001B\u001A\b\u0012\u0004\u0012\u00020\u001A0\u00192\u0006\u0010\u001C\u001A\u00020\u00002\f\u0010\u001E\u001A\b\u0012\u0004\u0012\u00020\u00000\u001D2\u0006\u0010 \u001A\u00020\u001F2\u0006\u0010\"\u001A\u00020!2\u0006\u0010$\u001A\u00020#23\u0010*\u001A/\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b&\u0012\b\b\'\u0012\u0004\b\b((\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000E0)0\u001D0%2/\u00100\u001A+\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0000\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020-0%¢\u0006\u0002\b.\u0012\u0004\u0012\u00020/0+H\u0000ø\u0001\u0000¢\u0006\u0004\b2\u00103\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u00065"}, d2 = {"", "itemsCount", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLineProvider;", "measuredLineProvider", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItemProvider;", "measuredItemProvider", "mainAxisAvailableSize", "beforeContentPadding", "afterContentPadding", "spaceBetweenLines", "firstVisibleLineIndex", "firstVisibleLineScrollOffset", "", "scrollToBeConsumed", "Landroidx/compose/ui/unit/Constraints;", "constraints", "", "isVertical", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "horizontalArrangement", "reverseLayout", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;", "itemAnimator", "slotsPerLine", "", "pinnedItems", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Landroidx/compose/foundation/lazy/layout/ObservableScopeInvalidator;", "placementScopeInvalidator", "Landroidx/compose/ui/graphics/GraphicsContext;", "graphicsContext", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "line", "Lkotlin/Pair;", "prefetchInfoRetriever", "Lkotlin/Function3;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "", "Lkotlin/ExtensionFunctionType;", "Landroidx/compose/ui/layout/MeasureResult;", "layout", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;", "measureLazyGrid-OZKpZRA", "(ILandroidx/compose/foundation/lazy/grid/LazyGridMeasuredLineProvider;Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItemProvider;IIIIIIFJZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ZLandroidx/compose/ui/unit/Density;Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;ILjava/util/List;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/graphics/GraphicsContext;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;)Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;", "measureLazyGrid", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLazyGridMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridMeasure.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasureKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,509:1\n393#1,3:514\n396#1,15:521\n412#1:537\n393#1,3:538\n396#1,15:545\n412#1:561\n1#2:510\n26#3:511\n26#3:512\n26#3:513\n33#4,4:517\n38#4:536\n33#4,4:541\n38#4:560\n33#4,6:562\n235#4,3:568\n33#4,4:571\n238#4,2:575\n38#4:577\n240#4:578\n33#4,6:579\n132#4,3:585\n33#4,4:588\n135#4,2:592\n38#4:594\n137#4:595\n51#4,6:596\n33#4,6:602\n33#4,6:608\n*S KotlinDebug\n*F\n+ 1 LazyGridMeasure.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasureKt\n*L\n263#1:514,3\n263#1:521,15\n263#1:537\n270#1:538,3\n270#1:545,15\n270#1:561\n126#1:511\n248#1:512\n249#1:513\n263#1:517,4\n263#1:536\n270#1:541,4\n270#1:560\n346#1:562,6\n368#1:568,3\n368#1:571,4\n368#1:575,2\n368#1:577\n368#1:578\n395#1:579,6\n439#1:585,3\n439#1:588,4\n439#1:592,2\n439#1:594\n439#1:595\n482#1:596,6\n489#1:602,6\n494#1:608,6\n*E\n"})
public final class LazyGridMeasureKt {
    @NotNull
    public static final LazyGridMeasureResult measureLazyGrid-OZKpZRA(int v, @NotNull LazyGridMeasuredLineProvider lazyGridMeasuredLineProvider0, @NotNull LazyGridMeasuredItemProvider lazyGridMeasuredItemProvider0, int v1, int v2, int v3, int v4, int v5, int v6, float f, long v7, boolean z, @Nullable Vertical arrangement$Vertical0, @Nullable Horizontal arrangement$Horizontal0, boolean z1, @NotNull Density density0, @NotNull LazyLayoutItemAnimator lazyLayoutItemAnimator0, int v8, @NotNull List list0, @NotNull CoroutineScope coroutineScope0, @NotNull MutableState mutableState0, @NotNull GraphicsContext graphicsContext0, @NotNull Function1 function10, @NotNull Function3 function30) {
        float f3;
        int v68;
        int v67;
        int v49;
        LazyGridMeasuredLine lazyGridMeasuredLine6;
        int v48;
        float f2;
        int v42;
        int v38;
        int v37;
        LazyGridMeasuredLine lazyGridMeasuredLine5;
        int v35;
        boolean z5;
        int v34;
        boolean z4;
        int v30;
        int v29;
        int v28;
        if(v2 < 0) {
            throw new IllegalArgumentException("negative beforeContentPadding");
        }
        if(v3 < 0) {
            throw new IllegalArgumentException("negative afterContentPadding");
        }
        if(v <= 0) {
            int v9 = Constraints.getMinWidth-impl(v7);
            int v10 = Constraints.getMinHeight-impl(v7);
            lazyLayoutItemAnimator0.onMeasured(0, v9, v10, new ArrayList(), lazyGridMeasuredItemProvider0.getKeyIndexMap(), lazyGridMeasuredItemProvider0, z, false, v8, false, 0, 0, coroutineScope0, graphicsContext0);
            long v11 = lazyLayoutItemAnimator0.getMinSizeToFitDisappearingItems-YbymL2g();
            if(!IntSize.equals-impl0(v11, 0L)) {
                v9 = ConstraintsKt.constrainWidth-K40F9xA(v7, IntSize.getWidth-impl(v11));
                v10 = ConstraintsKt.constrainHeight-K40F9xA(v7, IntSize.getHeight-impl(v11));
            }
            Object object0 = function30.invoke(v9, v10, l.w);
            List list1 = CollectionsKt__CollectionsKt.emptyList();
            return z ? new LazyGridMeasureResult(null, 0, false, 0.0f, ((MeasureResult)object0), false, coroutineScope0, density0, v8, function10, list1, -v2, v1 + v3, 0, z1, Orientation.Vertical, v3, v4) : new LazyGridMeasureResult(null, 0, false, 0.0f, ((MeasureResult)object0), false, coroutineScope0, density0, v8, function10, list1, -v2, v1 + v3, 0, z1, Orientation.Horizontal, v3, v4);
        }
        int v12 = Math.round(f);
        int v13 = v6 - v12;
        if(v5 == 0 && v13 < 0) {
            v12 += v13;
            v13 = 0;
        }
        ArrayDeque arrayDeque0 = new ArrayDeque();
        int v14 = (v4 >= 0 ? 0 : v4) - v2;
        int v15 = v13 + v14;
        int v16 = v5;
        while(v15 < 0 && v16 > 0) {
            --v16;
            LazyGridMeasuredLine lazyGridMeasuredLine0 = lazyGridMeasuredLineProvider0.getAndMeasure(v16);
            arrayDeque0.add(0, lazyGridMeasuredLine0);
            v15 += lazyGridMeasuredLine0.getMainAxisSizeWithSpacings();
        }
        if(v15 < v14) {
            v12 += v15;
            v15 = v14;
        }
        int v17 = v15 - v14;
        int v18 = v1 + v3;
        int v19 = v16;
        int v20 = c.coerceAtLeast(v18, 0);
        int v21 = -v17;
        int v22 = v19;
        int v23 = v17;
        int v24 = 0;
        boolean z2 = false;
        while(v24 < arrayDeque0.size()) {
            if(v21 >= v20) {
                arrayDeque0.remove(v24);
                z2 = true;
            }
            else {
                ++v22;
                v21 += ((LazyGridMeasuredLine)arrayDeque0.get(v24)).getMainAxisSizeWithSpacings();
                ++v24;
            }
        }
        int v25 = v21;
        boolean z3 = z2;
        int v26 = v22;
        while(v26 < v && (v25 < v20 || v25 <= 0 || arrayDeque0.isEmpty())) {
            LazyGridMeasuredLine lazyGridMeasuredLine1 = lazyGridMeasuredLineProvider0.getAndMeasure(v26);
            if(lazyGridMeasuredLine1.isEmpty()) {
                break;
            }
            int v27 = lazyGridMeasuredLine1.getMainAxisSizeWithSpacings() + v25;
            if(v27 <= v14) {
                v28 = v14;
                v29 = v27;
                if(((LazyGridMeasuredItem)ArraysKt___ArraysKt.last(lazyGridMeasuredLine1.getItems())).getIndex() != v - 1) {
                    v30 = v26 + 1;
                    v23 -= lazyGridMeasuredLine1.getMainAxisSizeWithSpacings();
                    z4 = true;
                    goto label_69;
                }
            }
            else {
                v28 = v14;
                v29 = v27;
            }
            arrayDeque0.add(lazyGridMeasuredLine1);
            z4 = z3;
            v30 = v19;
        label_69:
            ++v26;
            v19 = v30;
            v25 = v29;
            v14 = v28;
            z3 = z4;
        }
        if(v25 < v1) {
            int v31 = v1 - v25;
            int v32 = v25 + v31;
            int v33 = v19;
            v34 = v23 - v31;
            while(v34 < v2 && v33 > 0) {
                LazyGridMeasuredLine lazyGridMeasuredLine2 = lazyGridMeasuredLineProvider0.getAndMeasure(v33 - 1);
                arrayDeque0.add(0, lazyGridMeasuredLine2);
                v34 += lazyGridMeasuredLine2.getMainAxisSizeWithSpacings();
                --v33;
            }
            z5 = z3;
            v12 += v31;
            if(v34 < 0) {
                v12 += v34;
                v35 = v32 + v34;
                v34 = 0;
            }
            else {
                v35 = v32;
            }
        }
        else {
            z5 = z3;
            v35 = v25;
            v34 = v23;
        }
        float f1 = zd.c.getSign(Math.round(f)) != zd.c.getSign(v12) || Math.abs(Math.round(f)) < Math.abs(v12) ? f : ((float)v12);
        if(v34 < 0) {
            throw new IllegalArgumentException("negative initial offset");
        }
        LazyGridMeasuredLine lazyGridMeasuredLine3 = (LazyGridMeasuredLine)arrayDeque0.first();
        LazyGridMeasuredItem lazyGridMeasuredItem0 = (LazyGridMeasuredItem)ArraysKt___ArraysKt.firstOrNull(lazyGridMeasuredLine3.getItems());
        int v36 = lazyGridMeasuredItem0 == null ? 0 : lazyGridMeasuredItem0.getIndex();
        LazyGridMeasuredLine lazyGridMeasuredLine4 = (LazyGridMeasuredLine)arrayDeque0.lastOrNull();
        if(lazyGridMeasuredLine4 == null) {
        label_113:
            lazyGridMeasuredLine5 = lazyGridMeasuredLine3;
            v38 = v34;
            v37 = 0;
        }
        else {
            LazyGridMeasuredItem[] arr_lazyGridMeasuredItem = lazyGridMeasuredLine4.getItems();
            if(arr_lazyGridMeasuredItem != null) {
                LazyGridMeasuredItem lazyGridMeasuredItem1 = (LazyGridMeasuredItem)ArraysKt___ArraysKt.lastOrNull(arr_lazyGridMeasuredItem);
                if(lazyGridMeasuredItem1 != null) {
                    lazyGridMeasuredLine5 = lazyGridMeasuredLine3;
                    v37 = lazyGridMeasuredItem1.getIndex();
                    v38 = v34;
                    goto label_116;
                }
            }
            goto label_113;
        }
    label_116:
        int v39 = list0.size();
        List list2 = null;
        List list3 = null;
        int v40 = 0;
        while(v40 < v39) {
            int v41 = ((Number)list0.get(v40)).intValue();
            if(v41 < 0 || v41 >= v36) {
                f2 = f1;
                v42 = v36;
            }
            else {
                v42 = v36;
                int v43 = lazyGridMeasuredLineProvider0.spanOf(v41);
                f2 = f1;
                LazyGridMeasuredItem lazyGridMeasuredItem2 = lazyGridMeasuredItemProvider0.getAndMeasure--hBUhpc(v41, 0, v43, lazyGridMeasuredLineProvider0.childConstraints-JhjzzOo$foundation_release(0, v43));
                if(list3 == null) {
                    list3 = new ArrayList();
                }
                list3.add(lazyGridMeasuredItem2);
            }
            ++v40;
            v36 = v42;
            f1 = f2;
        }
        if(list3 == null) {
            list3 = CollectionsKt__CollectionsKt.emptyList();
        }
        int v44 = list0.size();
        int v45 = 0;
        while(v45 < v44) {
            int v46 = ((Number)list0.get(v45)).intValue();
            if(v37 + 1 > v46 || v46 >= v) {
                v48 = v44;
            }
            else {
                int v47 = lazyGridMeasuredLineProvider0.spanOf(v46);
                v48 = v44;
                LazyGridMeasuredItem lazyGridMeasuredItem3 = lazyGridMeasuredItemProvider0.getAndMeasure--hBUhpc(v46, 0, v47, lazyGridMeasuredLineProvider0.childConstraints-JhjzzOo$foundation_release(0, v47));
                if(list2 == null) {
                    list2 = new ArrayList();
                }
                list2.add(lazyGridMeasuredItem3);
            }
            ++v45;
            v44 = v48;
        }
        if(list2 == null) {
            list2 = CollectionsKt__CollectionsKt.emptyList();
        }
        if(v2 > 0 || v4 < 0) {
            int v50 = arrayDeque0.size();
            lazyGridMeasuredLine6 = lazyGridMeasuredLine5;
            int v51 = v38;
            int v52 = 0;
            while(v52 < v50) {
                int v53 = ((LazyGridMeasuredLine)arrayDeque0.get(v52)).getMainAxisSizeWithSpacings();
                if(v51 == 0 || v53 > v51 || v52 == CollectionsKt__CollectionsKt.getLastIndex(arrayDeque0)) {
                    break;
                }
                v51 -= v53;
                ++v52;
                lazyGridMeasuredLine6 = (LazyGridMeasuredLine)arrayDeque0.get(v52);
            }
            v49 = v51;
        }
        else {
            lazyGridMeasuredLine6 = lazyGridMeasuredLine5;
            v49 = v38;
        }
        int v54 = z ? Constraints.getMaxWidth-impl(v7) : ConstraintsKt.constrainWidth-K40F9xA(v7, v35);
        int v55 = z ? ConstraintsKt.constrainHeight-K40F9xA(v7, v35) : Constraints.getMaxHeight-impl(v7);
        int v56 = z ? v55 : v54;
        boolean z6 = v35 < Math.min(v56, v1);
        if(z6 && -v34 != 0) {
            throw new IllegalStateException("non-zero firstLineScrollOffset");
        }
        int v57 = arrayDeque0.size();
        int v59 = 0;
        for(int v58 = 0; v58 < v57; ++v58) {
            v59 += ((LazyGridMeasuredLine)arrayDeque0.get(v58)).getItems().length;
        }
        ArrayList arrayList0 = new ArrayList(v59);
        if(z6) {
            if(!list3.isEmpty() || !list2.isEmpty()) {
                throw new IllegalArgumentException("no items");
            }
            int v60 = arrayDeque0.size();
            int[] arr_v = new int[v60];
            for(int v61 = 0; v61 < v60; ++v61) {
                arr_v[v61] = ((LazyGridMeasuredLine)arrayDeque0.get((z1 ? v60 - v61 - 1 : v61))).getMainAxisSize();
            }
            int[] arr_v1 = new int[v60];
            for(int v62 = 0; v62 < v60; ++v62) {
                arr_v1[v62] = 0;
            }
            if(z) {
                if(arrangement$Vertical0 == null) {
                    throw new IllegalArgumentException("null verticalArrangement");
                }
                arrangement$Vertical0.arrange(density0, v56, arr_v, arr_v1);
                goto label_209;
            }
            else {
                if(arrangement$Horizontal0 == null) {
                    throw new IllegalArgumentException("null horizontalArrangement");
                }
                arrangement$Horizontal0.arrange(density0, v56, arr_v, LayoutDirection.Ltr, arr_v1);
            label_209:
                IntProgression intProgression0 = ArraysKt___ArraysKt.getIndices(arr_v1);
                if(z1) {
                    intProgression0 = c.reversed(intProgression0);
                }
                int v63 = intProgression0.getFirst();
                int v64 = intProgression0.getLast();
                int v65 = intProgression0.getStep();
                if(v65 > 0 && v63 <= v64 || v65 < 0 && v64 <= v63) {
                    while(true) {
                        int v66 = arr_v1[v63];
                        if(z1) {
                            v67 = v60;
                            v68 = v60 - v63 - 1;
                        }
                        else {
                            v67 = v60;
                            v68 = v63;
                        }
                        LazyGridMeasuredLine lazyGridMeasuredLine7 = (LazyGridMeasuredLine)arrayDeque0.get(v68);
                        if(z1) {
                            v66 = v56 - v66 - lazyGridMeasuredLine7.getMainAxisSize();
                        }
                        LazyGridMeasuredItem[] arr_lazyGridMeasuredItem1 = lazyGridMeasuredLine7.position(v66, v54, v55);
                        for(int v69 = 0; v69 < arr_lazyGridMeasuredItem1.length; ++v69) {
                            arrayList0.add(arr_lazyGridMeasuredItem1[v69]);
                        }
                        if(v63 == v64) {
                            break;
                        }
                        v63 += v65;
                        v60 = v67;
                    }
                }
                f3 = f1;
            }
        }
        else {
            int v70 = list3.size() - 1;
            if(v70 >= 0) {
                int v71 = -v34;
                while(true) {
                    LazyGridMeasuredItem lazyGridMeasuredItem4 = (LazyGridMeasuredItem)list3.get(v70);
                    v71 -= lazyGridMeasuredItem4.getMainAxisSizeWithSpacings();
                    lazyGridMeasuredItem4.position(v71, 0, v54, v55);
                    arrayList0.add(lazyGridMeasuredItem4);
                    if(v70 - 1 < 0) {
                        break;
                    }
                    --v70;
                }
            }
            int v72 = arrayDeque0.size();
            int v73 = -v34;
            for(int v74 = 0; v74 < v72; ++v74) {
                LazyGridMeasuredLine lazyGridMeasuredLine8 = (LazyGridMeasuredLine)arrayDeque0.get(v74);
                LazyGridMeasuredItem[] arr_lazyGridMeasuredItem2 = lazyGridMeasuredLine8.position(v73, v54, v55);
                for(int v75 = 0; v75 < arr_lazyGridMeasuredItem2.length; ++v75) {
                    arrayList0.add(arr_lazyGridMeasuredItem2[v75]);
                }
                v73 += lazyGridMeasuredLine8.getMainAxisSizeWithSpacings();
            }
            int v76 = list2.size();
            for(int v77 = 0; v77 < v76; ++v77) {
                LazyGridMeasuredItem lazyGridMeasuredItem5 = (LazyGridMeasuredItem)list2.get(v77);
                lazyGridMeasuredItem5.position(v73, 0, v54, v55);
                arrayList0.add(lazyGridMeasuredItem5);
                v73 += lazyGridMeasuredItem5.getMainAxisSizeWithSpacings();
            }
            f3 = f1;
        }
        lazyLayoutItemAnimator0.onMeasured(((int)f3), v54, v55, arrayList0, lazyGridMeasuredItemProvider0.getKeyIndexMap(), lazyGridMeasuredItemProvider0, z, false, v8, false, v49, v35, coroutineScope0, graphicsContext0);
        long v78 = lazyLayoutItemAnimator0.getMinSizeToFitDisappearingItems-YbymL2g();
        if(!IntSize.equals-impl0(v78, 0L)) {
            v54 = ConstraintsKt.constrainWidth-K40F9xA(v7, Math.max(v54, IntSize.getWidth-impl(v78)));
            v55 = ConstraintsKt.constrainHeight-K40F9xA(v7, Math.max(v55, IntSize.getHeight-impl(v78)));
        }
        boolean z7 = v37 != v - 1 || v35 > v1;
        MeasureResult measureResult0 = (MeasureResult)function30.invoke(v54, v55, new m(arrayList0, mutableState0));
        if(list3.isEmpty() && list2.isEmpty()) {
            return z ? new LazyGridMeasureResult(lazyGridMeasuredLine6, v49, z7, f3, measureResult0, z5, coroutineScope0, density0, v8, function10, arrayList0, -v2, v18, v, z1, Orientation.Vertical, v3, v4) : new LazyGridMeasureResult(lazyGridMeasuredLine6, v49, z7, f3, measureResult0, z5, coroutineScope0, density0, v8, function10, arrayList0, -v2, v18, v, z1, Orientation.Horizontal, v3, v4);
        }
        ArrayList arrayList1 = new ArrayList(arrayList0.size());
        int v79 = arrayList0.size();
        for(int v80 = 0; v80 < v79; ++v80) {
            Object object1 = arrayList0.get(v80);
            int v81 = ((LazyGridMeasuredItem)object1).getIndex();
            if(v36 <= v81 && v81 <= v37) {
                arrayList1.add(object1);
            }
        }
        return z ? new LazyGridMeasureResult(lazyGridMeasuredLine6, v49, z7, f3, measureResult0, z5, coroutineScope0, density0, v8, function10, arrayList1, -v2, v18, v, z1, Orientation.Vertical, v3, v4) : new LazyGridMeasureResult(lazyGridMeasuredLine6, v49, z7, f3, measureResult0, z5, coroutineScope0, density0, v8, function10, arrayList1, -v2, v18, v, z1, Orientation.Horizontal, v3, v4);
    }
}

