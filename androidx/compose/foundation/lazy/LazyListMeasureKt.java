package androidx.compose.foundation.lazy;

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
import b0.l;
import b0.m;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArrayDeque;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntProgression;
import kotlin.ranges.c;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001A£\u0002\u00102\u001A\u00020/2\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0004\u001A\u00020\u00002\u0006\u0010\u0005\u001A\u00020\u00002\u0006\u0010\u0006\u001A\u00020\u00002\u0006\u0010\u0007\u001A\u00020\u00002\u0006\u0010\b\u001A\u00020\u00002\u0006\u0010\t\u001A\u00020\u00002\u0006\u0010\u000B\u001A\u00020\n2\u0006\u0010\r\u001A\u00020\f2\u0006\u0010\u000F\u001A\u00020\u000E2\f\u0010\u0011\u001A\b\u0012\u0004\u0012\u00020\u00000\u00102\b\u0010\u0013\u001A\u0004\u0018\u00010\u00122\b\u0010\u0015\u001A\u0004\u0018\u00010\u00142\u0006\u0010\u0016\u001A\u00020\u000E2\u0006\u0010\u0018\u001A\u00020\u00172\f\u0010\u001B\u001A\b\u0012\u0004\u0012\u00020\u001A0\u00192\u0006\u0010\u001C\u001A\u00020\u00002\f\u0010\u001D\u001A\b\u0012\u0004\u0012\u00020\u00000\u00102\u0006\u0010\u001E\u001A\u00020\u000E2\u0006\u0010\u001F\u001A\u00020\u000E2\b\u0010!\u001A\u0004\u0018\u00010 2\u0006\u0010#\u001A\u00020\"2\u0006\u0010%\u001A\u00020$2\u0006\u0010\'\u001A\u00020&2/\u0010.\u001A+\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0000\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+0)¢\u0006\u0002\b,\u0012\u0004\u0012\u00020-0(H\u0000ø\u0001\u0000¢\u0006\u0004\b0\u00101\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u00063"}, d2 = {"", "itemsCount", "Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;", "measuredItemProvider", "mainAxisAvailableSize", "beforeContentPadding", "afterContentPadding", "spaceBetweenItems", "firstVisibleItemIndex", "firstVisibleItemScrollOffset", "", "scrollToBeConsumed", "Landroidx/compose/ui/unit/Constraints;", "constraints", "", "isVertical", "", "headerIndexes", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "horizontalArrangement", "reverseLayout", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "Landroidx/compose/foundation/lazy/LazyListMeasuredItem;", "itemAnimator", "beyondBoundsItemCount", "pinnedItems", "hasLookaheadPassOccurred", "isLookingAhead", "Landroidx/compose/foundation/lazy/LazyListLayoutInfo;", "postLookaheadLayoutInfo", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Landroidx/compose/foundation/lazy/layout/ObservableScopeInvalidator;", "placementScopeInvalidator", "Landroidx/compose/ui/graphics/GraphicsContext;", "graphicsContext", "Lkotlin/Function3;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "", "Lkotlin/ExtensionFunctionType;", "Landroidx/compose/ui/layout/MeasureResult;", "layout", "Landroidx/compose/foundation/lazy/LazyListMeasureResult;", "measureLazyList-x0Ok8Vo", "(ILandroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;IIIIIIFJZLjava/util/List;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ZLandroidx/compose/ui/unit/Density;Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;ILjava/util/List;ZZLandroidx/compose/foundation/lazy/LazyListLayoutInfo;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/graphics/GraphicsContext;Lkotlin/jvm/functions/Function3;)Landroidx/compose/foundation/lazy/LazyListMeasureResult;", "measureLazyList", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLazyListMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListMeasure.kt\nandroidx/compose/foundation/lazy/LazyListMeasureKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,650:1\n1#2:651\n26#3:652\n26#3:653\n26#3:654\n33#4,6:655\n33#4,6:661\n33#4,6:667\n235#4,3:673\n33#4,4:676\n238#4,2:680\n38#4:682\n240#4:683\n116#4,2:684\n33#4,6:686\n118#4:692\n116#4,2:693\n33#4,6:695\n118#4:701\n116#4,2:702\n33#4,6:704\n118#4:710\n33#4,6:711\n51#4,6:717\n33#4,6:723\n33#4,6:729\n33#4,6:735\n*S KotlinDebug\n*F\n+ 1 LazyListMeasure.kt\nandroidx/compose/foundation/lazy/LazyListMeasureKt\n*L\n134#1:652\n259#1:653\n260#1:654\n307#1:655,6\n324#1:661,6\n380#1:667,6\n417#1:673,3\n417#1:676,4\n417#1:680,2\n417#1:682\n417#1:683\n478#1:684,2\n478#1:686,6\n478#1:692\n495#1:693,2\n495#1:695,6\n495#1:701\n497#1:702,2\n497#1:704,6\n497#1:710\n518#1:711,6\n545#1:717,6\n629#1:723,6\n636#1:729,6\n642#1:735,6\n*E\n"})
public final class LazyListMeasureKt {
    @NotNull
    public static final LazyListMeasureResult measureLazyList-x0Ok8Vo(int v, @NotNull LazyListMeasuredItemProvider lazyListMeasuredItemProvider0, int v1, int v2, int v3, int v4, int v5, int v6, float f, long v7, boolean z, @NotNull List list0, @Nullable Vertical arrangement$Vertical0, @Nullable Horizontal arrangement$Horizontal0, boolean z1, @NotNull Density density0, @NotNull LazyLayoutItemAnimator lazyLayoutItemAnimator0, int v8, @NotNull List list1, boolean z2, boolean z3, @Nullable LazyListLayoutInfo lazyListLayoutInfo0, @NotNull CoroutineScope coroutineScope0, @NotNull MutableState mutableState0, @NotNull GraphicsContext graphicsContext0, @NotNull Function3 function30) {
        int v99;
        LazyListMeasuredItem lazyListMeasuredItem12;
        ArrayDeque arrayDeque1;
        float f7;
        int v89;
        int v88;
        int v83;
        int v69;
        Object object4;
        LazyListMeasuredItem lazyListMeasuredItem7;
        float f6;
        Object object3;
        LazyListMeasuredItem lazyListMeasuredItem6;
        Object object1;
        int v61;
        List list5;
        LazyListItemInfo lazyListItemInfo0;
        int v55;
        ArrayList arrayList1;
        LazyListMeasuredItem lazyListMeasuredItem4;
        float f4;
        int v42;
        int v40;
        int v39;
        int v38;
        int v37;
        int v34;
        int v31;
        int v30;
        int v13;
        if(v2 < 0) {
            throw new IllegalArgumentException("invalid beforeContentPadding");
        }
        if(v3 < 0) {
            throw new IllegalArgumentException("invalid afterContentPadding");
        }
        if(v <= 0) {
            int v9 = Constraints.getMinWidth-impl(v7);
            int v10 = Constraints.getMinHeight-impl(v7);
            lazyLayoutItemAnimator0.onMeasured(0, v9, v10, new ArrayList(), lazyListMeasuredItemProvider0.getKeyIndexMap(), lazyListMeasuredItemProvider0, z, z3, 1, z2, 0, 0, coroutineScope0, graphicsContext0);
            if(!z3) {
                long v11 = lazyLayoutItemAnimator0.getMinSizeToFitDisappearingItems-YbymL2g();
                if(!IntSize.equals-impl0(v11, 0L)) {
                    v9 = ConstraintsKt.constrainWidth-K40F9xA(v7, IntSize.getWidth-impl(v11));
                    v10 = ConstraintsKt.constrainHeight-K40F9xA(v7, IntSize.getHeight-impl(v11));
                }
            }
            Object object0 = function30.invoke(v9, v10, l.w);
            List list2 = CollectionsKt__CollectionsKt.emptyList();
            return z ? new LazyListMeasureResult(null, 0, false, 0.0f, ((MeasureResult)object0), 0.0f, false, coroutineScope0, density0, lazyListMeasuredItemProvider0.getChildConstraints-msEJaDk(), list2, -v2, v1 + v3, 0, z1, Orientation.Vertical, v3, v4, null) : new LazyListMeasureResult(null, 0, false, 0.0f, ((MeasureResult)object0), 0.0f, false, coroutineScope0, density0, lazyListMeasuredItemProvider0.getChildConstraints-msEJaDk(), list2, -v2, v1 + v3, 0, z1, Orientation.Horizontal, v3, v4, null);
        }
        int v12 = v5;
        if(v12 >= v) {
            v12 = v - 1;
            v13 = 0;
        }
        else {
            v13 = v6;
        }
        int v14 = Math.round(f);
        int v15 = v13 - v14;
        if(v12 == 0 && v15 < 0) {
            v14 += v15;
            v15 = 0;
        }
        ArrayDeque arrayDeque0 = new ArrayDeque();
        int v16 = (v4 >= 0 ? 0 : v4) - v2;
        int v17 = v15 + v16;
        int v18 = 0;
        while(v17 < 0 && v12 > 0) {
            LazyListMeasuredItem lazyListMeasuredItem0 = LazyListMeasuredItemProvider.getAndMeasure-0kLqBqw$default(lazyListMeasuredItemProvider0, v12 - 1, 0L, 2, null);
            arrayDeque0.add(0, lazyListMeasuredItem0);
            v18 = Math.max(v18, lazyListMeasuredItem0.getCrossAxisSize());
            v17 += lazyListMeasuredItem0.getMainAxisSizeWithSpacings();
            --v12;
        }
        if(v17 < v16) {
            v14 += v17;
            v17 = v16;
        }
        int v19 = v17 - v16;
        int v20 = v1 + v3;
        int v21 = v12;
        int v22 = c.coerceAtLeast(v20, 0);
        int v23 = -v19;
        int v24 = v21;
        int v25 = 0;
        boolean z4 = false;
        while(v25 < arrayDeque0.size()) {
            if(v23 >= v22) {
                arrayDeque0.remove(v25);
                z4 = true;
            }
            else {
                ++v24;
                v23 += ((LazyListMeasuredItem)arrayDeque0.get(v25)).getMainAxisSizeWithSpacings();
                ++v25;
            }
        }
        int v26 = v18;
        boolean z5 = z4;
        int v27 = v24;
        int v28 = v19;
        while(v27 < v && (v23 < v22 || v23 <= 0 || arrayDeque0.isEmpty())) {
            LazyListMeasuredItem lazyListMeasuredItem1 = LazyListMeasuredItemProvider.getAndMeasure-0kLqBqw$default(lazyListMeasuredItemProvider0, v27, 0L, 2, null);
            int v29 = lazyListMeasuredItem1.getMainAxisSizeWithSpacings() + v23;
            if(v29 <= v16) {
                v30 = v29;
                if(v27 != v - 1) {
                    v31 = v27 + 1;
                    v28 -= lazyListMeasuredItem1.getMainAxisSizeWithSpacings();
                    z5 = true;
                    goto label_74;
                }
            }
            else {
                v30 = v29;
            }
            arrayDeque0.add(lazyListMeasuredItem1);
            v26 = Math.max(v26, lazyListMeasuredItem1.getCrossAxisSize());
            v31 = v21;
        label_74:
            ++v27;
            v21 = v31;
            v23 = v30;
        }
        if(v23 < v1) {
            int v32 = v1 - v23;
            int v33 = v23 + v32;
            v34 = v26;
            int v35 = v28 - v32;
            int v36;
            for(v36 = v21; v35 < v2 && v36 > 0; --v36) {
                LazyListMeasuredItem lazyListMeasuredItem2 = LazyListMeasuredItemProvider.getAndMeasure-0kLqBqw$default(lazyListMeasuredItemProvider0, v36 - 1, 0L, 2, null);
                arrayDeque0.add(0, lazyListMeasuredItem2);
                v34 = Math.max(v34, lazyListMeasuredItem2.getCrossAxisSize());
                v35 += lazyListMeasuredItem2.getMainAxisSizeWithSpacings();
            }
            v37 = v27;
            v38 = v32 + v14;
            if(v35 < 0) {
                v38 += v35;
                v39 = v33 + v35;
                v40 = 0;
            }
            else {
                v39 = v33;
                v40 = v35;
            }
        }
        else {
            v37 = v27;
            v39 = v23;
            v34 = v26;
            v38 = v14;
            v40 = v28;
            v36 = v21;
        }
        float f1 = zd.c.getSign(Math.round(f)) != zd.c.getSign(v38) || Math.abs(Math.round(f)) < Math.abs(v38) ? f : ((float)v38);
        float f2 = f - f1;
        float f3 = !z3 || v38 <= v14 || f2 > 0.0f ? 0.0f : ((float)(v38 - v14)) + f2;
        if(v40 < 0) {
            throw new IllegalArgumentException("negative currentFirstItemScrollOffset");
        }
        int v41 = -v40;
        LazyListMeasuredItem lazyListMeasuredItem3 = (LazyListMeasuredItem)arrayDeque0.first();
        if(v2 > 0 || v4 < 0) {
            int v43 = arrayDeque0.size();
            LazyListMeasuredItem lazyListMeasuredItem5 = lazyListMeasuredItem3;
            int v44 = 0;
            while(true) {
                if(v44 < v43) {
                    int v45 = ((LazyListMeasuredItem)arrayDeque0.get(v44)).getMainAxisSizeWithSpacings();
                    if(v40 != 0 && v45 <= v40) {
                        f4 = f3;
                        if(v44 == CollectionsKt__CollectionsKt.getLastIndex(arrayDeque0)) {
                            break;
                        }
                        v40 -= v45;
                        ++v44;
                        lazyListMeasuredItem5 = (LazyListMeasuredItem)arrayDeque0.get(v44);
                        f3 = f4;
                        continue;
                    }
                }
                f4 = f3;
                break;
            }
            lazyListMeasuredItem4 = lazyListMeasuredItem5;
            v42 = v40;
        }
        else {
            v42 = v40;
            f4 = f3;
            lazyListMeasuredItem4 = lazyListMeasuredItem3;
        }
        int v46 = Math.max(0, v36 - v8);
        int v47 = v36 - 1;
        List list3 = null;
        if(v46 <= v47) {
            while(true) {
                if(list3 == null) {
                    list3 = new ArrayList();
                }
                list3.add(LazyListMeasuredItemProvider.getAndMeasure-0kLqBqw$default(lazyListMeasuredItemProvider0, v47, 0L, 2, null));
                if(v47 == v46) {
                    break;
                }
                --v47;
            }
        }
        int v48 = list1.size() - 1;
        if(v48 >= 0) {
            while(true) {
                int v49 = ((Number)list1.get(v48)).intValue();
                if(v49 < v46) {
                    if(list3 == null) {
                        list3 = new ArrayList();
                    }
                    list3.add(LazyListMeasuredItemProvider.getAndMeasure-0kLqBqw$default(lazyListMeasuredItemProvider0, v49, 0L, 2, null));
                }
                if(v48 - 1 < 0) {
                    break;
                }
                --v48;
            }
        }
        if(list3 == null) {
            list3 = CollectionsKt__CollectionsKt.emptyList();
        }
        int v50 = list3.size();
        int v51 = v34;
        for(int v52 = 0; v52 < v50; ++v52) {
            v51 = Math.max(v51, ((LazyListMeasuredItem)list3.get(v52)).getCrossAxisSize());
        }
        int v53 = Math.min(((LazyListMeasuredItem)CollectionsKt___CollectionsKt.last(arrayDeque0)).getIndex() + v8, v - 1);
        int v54 = ((LazyListMeasuredItem)CollectionsKt___CollectionsKt.last(arrayDeque0)).getIndex() + 1;
        if(v54 <= v53) {
            for(ArrayList arrayList0 = null; true; arrayList0 = arrayList1) {
                if(arrayList0 == null) {
                    arrayList0 = new ArrayList();
                }
                arrayList1 = arrayList0;
                v55 = v41;
                arrayList1.add(LazyListMeasuredItemProvider.getAndMeasure-0kLqBqw$default(lazyListMeasuredItemProvider0, v54, 0L, 2, null));
                if(v54 == v53) {
                    break;
                }
                ++v54;
                v41 = v55;
            }
        }
        else {
            v55 = v41;
            arrayList1 = null;
        }
        if(!z3 || lazyListLayoutInfo0 == null || lazyListLayoutInfo0.getVisibleItemsInfo().isEmpty()) {
            v61 = v39;
            list5 = arrayList1;
        }
        else {
            List list4 = lazyListLayoutInfo0.getVisibleItemsInfo();
            for(int v56 = list4.size() - 1; true; --v56) {
                lazyListItemInfo0 = null;
                if(-1 >= v56) {
                    break;
                }
                if(((LazyListItemInfo)list4.get(v56)).getIndex() > v53 && (v56 == 0 || ((LazyListItemInfo)list4.get(v56 - 1)).getIndex() <= v53)) {
                    lazyListItemInfo0 = (LazyListItemInfo)list4.get(v56);
                    break;
                }
            }
            LazyListItemInfo lazyListItemInfo1 = (LazyListItemInfo)CollectionsKt___CollectionsKt.last(lazyListLayoutInfo0.getVisibleItemsInfo());
            if(lazyListItemInfo0 == null) {
                v61 = v39;
                list5 = arrayList1;
            }
            else {
                int v57 = lazyListItemInfo0.getIndex();
                int v58 = Math.min(lazyListItemInfo1.getIndex(), v - 1);
                if(v57 <= v58) {
                    int v59 = v57;
                    list5 = arrayList1;
                    while(true) {
                        if(list5 == null) {
                            v61 = v39;
                            lazyListMeasuredItem6 = null;
                        }
                        else {
                            int v60 = list5.size();
                            v61 = v39;
                            int v62 = 0;
                            while(true) {
                                object1 = null;
                                if(v62 < v60) {
                                    Object object2 = list5.get(v62);
                                    if(((LazyListMeasuredItem)object2).getIndex() == v59) {
                                        object1 = object2;
                                    }
                                    else {
                                        ++v62;
                                        continue;
                                    }
                                }
                                break;
                            }
                            lazyListMeasuredItem6 = (LazyListMeasuredItem)object1;
                        }
                        if(lazyListMeasuredItem6 == null) {
                            if(list5 == null) {
                                list5 = new ArrayList();
                            }
                            list5.add(LazyListMeasuredItemProvider.getAndMeasure-0kLqBqw$default(lazyListMeasuredItemProvider0, v59, 0L, 2, null));
                        }
                        if(v59 == v58) {
                            break;
                        }
                        ++v59;
                        v39 = v61;
                    }
                }
                else {
                    v61 = v39;
                    list5 = arrayList1;
                }
            }
            float f5 = ((float)(lazyListLayoutInfo0.getViewportEndOffset() - lazyListItemInfo1.getOffset() - lazyListItemInfo1.getSize())) - f1;
            if(f5 > 0.0f) {
                int v63 = lazyListItemInfo1.getIndex() + 1;
                int v64 = 0;
                while(v63 < v && ((float)v64) < f5) {
                    if(v63 <= v53) {
                        int v65 = arrayDeque0.size();
                        int v66 = 0;
                        while(true) {
                            if(v66 < v65) {
                                object3 = arrayDeque0.get(v66);
                                f6 = f5;
                                if(((LazyListMeasuredItem)object3).getIndex() == v63) {
                                    break;
                                }
                                else {
                                    ++v66;
                                    f5 = f6;
                                    continue;
                                }
                            }
                            f6 = f5;
                            object3 = null;
                            break;
                        }
                        lazyListMeasuredItem7 = (LazyListMeasuredItem)object3;
                    }
                    else {
                        f6 = f5;
                        if(list5 == null) {
                            lazyListMeasuredItem7 = null;
                        }
                        else {
                            int v67 = list5.size();
                            int v68 = 0;
                            while(true) {
                                object4 = null;
                                if(v68 < v67) {
                                    Object object5 = list5.get(v68);
                                    if(((LazyListMeasuredItem)object5).getIndex() == v63) {
                                        object4 = object5;
                                    }
                                    else {
                                        ++v68;
                                        continue;
                                    }
                                }
                                break;
                            }
                            lazyListMeasuredItem7 = (LazyListMeasuredItem)object4;
                        }
                    }
                    if(lazyListMeasuredItem7 == null) {
                        if(list5 == null) {
                            list5 = new ArrayList();
                        }
                        list5.add(LazyListMeasuredItemProvider.getAndMeasure-0kLqBqw$default(lazyListMeasuredItemProvider0, v63, 0L, 2, null));
                        ++v63;
                        v69 = ((LazyListMeasuredItem)CollectionsKt___CollectionsKt.last(list5)).getMainAxisSizeWithSpacings();
                    }
                    else {
                        ++v63;
                        v69 = lazyListMeasuredItem7.getMainAxisSizeWithSpacings();
                    }
                    v64 += v69;
                    f5 = f6;
                }
            }
        }
        if(list5 != null && ((LazyListMeasuredItem)CollectionsKt___CollectionsKt.last(list5)).getIndex() > v53) {
            v53 = ((LazyListMeasuredItem)CollectionsKt___CollectionsKt.last(list5)).getIndex();
        }
        int v70 = list1.size();
        for(int v71 = 0; v71 < v70; ++v71) {
            int v72 = ((Number)list1.get(v71)).intValue();
            if(v72 > v53) {
                if(list5 == null) {
                    list5 = new ArrayList();
                }
                list5.add(LazyListMeasuredItemProvider.getAndMeasure-0kLqBqw$default(lazyListMeasuredItemProvider0, v72, 0L, 2, null));
            }
        }
        if(list5 == null) {
            list5 = CollectionsKt__CollectionsKt.emptyList();
        }
        int v73 = list5.size();
        int v74 = v51;
        for(int v75 = 0; v75 < v73; ++v75) {
            v74 = Math.max(v74, ((LazyListMeasuredItem)list5.get(v75)).getCrossAxisSize());
        }
        int v76 = !Intrinsics.areEqual(lazyListMeasuredItem4, arrayDeque0.first()) || !list3.isEmpty() || !list5.isEmpty() ? 0 : 1;
        int v77 = ConstraintsKt.constrainWidth-K40F9xA(v7, (z ? v74 : v61));
        if(z) {
            v74 = v61;
        }
        int v78 = ConstraintsKt.constrainHeight-K40F9xA(v7, v74);
        int v79 = z ? v78 : v77;
        boolean z6 = v61 < Math.min(v79, v1);
        if(z6 && v55 != 0) {
            throw new IllegalStateException("non-zero itemsScrollOffset");
        }
        ArrayList arrayList2 = new ArrayList(list5.size() + (list3.size() + arrayDeque0.size()));
        if(z6) {
            if(!list3.isEmpty() || !list5.isEmpty()) {
                throw new IllegalArgumentException("no extra items");
            }
            int v80 = arrayDeque0.size();
            int[] arr_v = new int[v80];
            for(int v81 = 0; v81 < v80; ++v81) {
                arr_v[v81] = ((LazyListMeasuredItem)arrayDeque0.get((z1 ? v80 - v81 - 1 : v81))).getSize();
            }
            int[] arr_v1 = new int[v80];
            for(int v82 = 0; v82 < v80; ++v82) {
                arr_v1[v82] = 0;
            }
            if(z) {
                if(arrangement$Vertical0 == null) {
                    throw new IllegalArgumentException("null verticalArrangement when isVertical == true");
                }
                v83 = v76;
                arrangement$Vertical0.arrange(density0, v79, arr_v, arr_v1);
            }
            else {
                v83 = v76;
                if(arrangement$Horizontal0 == null) {
                    throw new IllegalArgumentException("null horizontalArrangement when isVertical == false");
                }
                arrangement$Horizontal0.arrange(density0, v79, arr_v, LayoutDirection.Ltr, arr_v1);
            }
            IntProgression intProgression0 = ArraysKt___ArraysKt.getIndices(arr_v1);
            if(z1) {
                intProgression0 = c.reversed(intProgression0);
            }
            int v84 = intProgression0.getFirst();
            int v85 = intProgression0.getLast();
            int v86 = intProgression0.getStep();
            if(v86 > 0 && v84 <= v85 || v86 < 0 && v85 <= v84) {
                while(true) {
                    int v87 = arr_v1[v84];
                    if(z1) {
                        v88 = v80;
                        v89 = v80 - v84 - 1;
                    }
                    else {
                        v88 = v80;
                        v89 = v84;
                    }
                    LazyListMeasuredItem lazyListMeasuredItem8 = (LazyListMeasuredItem)arrayDeque0.get(v89);
                    if(z1) {
                        v87 = v79 - v87 - lazyListMeasuredItem8.getSize();
                    }
                    lazyListMeasuredItem8.position(v87, v77, v78);
                    arrayList2.add(lazyListMeasuredItem8);
                    if(v84 == v85) {
                        goto label_389;
                    }
                    v84 += v86;
                    v80 = v88;
                }
                throw new IllegalArgumentException("null horizontalArrangement when isVertical == false");
            }
        }
        else {
            v83 = v76;
            int v90 = list3.size();
            int v91 = v55;
            for(int v92 = 0; v92 < v90; ++v92) {
                LazyListMeasuredItem lazyListMeasuredItem9 = (LazyListMeasuredItem)list3.get(v92);
                v91 -= lazyListMeasuredItem9.getMainAxisSizeWithSpacings();
                lazyListMeasuredItem9.position(v91, v77, v78);
                arrayList2.add(lazyListMeasuredItem9);
            }
            int v93 = arrayDeque0.size();
            int v94 = v55;
            for(int v95 = 0; v95 < v93; ++v95) {
                LazyListMeasuredItem lazyListMeasuredItem10 = (LazyListMeasuredItem)arrayDeque0.get(v95);
                lazyListMeasuredItem10.position(v94, v77, v78);
                arrayList2.add(lazyListMeasuredItem10);
                v94 += lazyListMeasuredItem10.getMainAxisSizeWithSpacings();
            }
            int v96 = list5.size();
            for(int v97 = 0; v97 < v96; ++v97) {
                LazyListMeasuredItem lazyListMeasuredItem11 = (LazyListMeasuredItem)list5.get(v97);
                lazyListMeasuredItem11.position(v94, v77, v78);
                arrayList2.add(lazyListMeasuredItem11);
                v94 += lazyListMeasuredItem11.getMainAxisSizeWithSpacings();
            }
        }
    label_389:
        lazyLayoutItemAnimator0.onMeasured(((int)f1), v77, v78, arrayList2, lazyListMeasuredItemProvider0.getKeyIndexMap(), lazyListMeasuredItemProvider0, z, z3, 1, z2, v42, v61, coroutineScope0, graphicsContext0);
        if(z3) {
            arrayDeque1 = arrayDeque0;
            f7 = f1;
        }
        else {
            f7 = f1;
            long v98 = lazyLayoutItemAnimator0.getMinSizeToFitDisappearingItems-YbymL2g();
            arrayDeque1 = arrayDeque0;
            if(!IntSize.equals-impl0(v98, 0L)) {
                v77 = ConstraintsKt.constrainWidth-K40F9xA(v7, Math.max(v77, IntSize.getWidth-impl(v98)));
                v78 = ConstraintsKt.constrainHeight-K40F9xA(v7, Math.max(v78, IntSize.getHeight-impl(v98)));
            }
        }
        if(list0.isEmpty()) {
            v99 = v37;
            lazyListMeasuredItem12 = null;
        }
        else {
            lazyListMeasuredItem12 = LazyListHeadersKt.findOrComposeLazyListHeader(arrayList2, lazyListMeasuredItemProvider0, list0, v2, v77, v78);
            v99 = v37;
        }
        boolean z7 = v99 < v || v61 > v1;
        Object object6 = function30.invoke(v77, v78, new m(arrayList2, lazyListMeasuredItem12, z3, mutableState0));
        if(v83 != 0) {
            return z ? new LazyListMeasureResult(lazyListMeasuredItem4, v42, z7, f7, ((MeasureResult)object6), f4, z5, coroutineScope0, density0, lazyListMeasuredItemProvider0.getChildConstraints-msEJaDk(), arrayList2, -v2, v20, v, z1, Orientation.Vertical, v3, v4, null) : new LazyListMeasureResult(lazyListMeasuredItem4, v42, z7, f7, ((MeasureResult)object6), f4, z5, coroutineScope0, density0, lazyListMeasuredItemProvider0.getChildConstraints-msEJaDk(), arrayList2, -v2, v20, v, z1, Orientation.Horizontal, v3, v4, null);
        }
        ArrayList arrayList3 = new ArrayList(arrayList2.size());
        int v100 = arrayList2.size();
        for(int v101 = 0; v101 < v100; ++v101) {
            Object object7 = arrayList2.get(v101);
            LazyListMeasuredItem lazyListMeasuredItem13 = (LazyListMeasuredItem)object7;
            if(lazyListMeasuredItem13.getIndex() >= ((LazyListMeasuredItem)arrayDeque1.first()).getIndex() && lazyListMeasuredItem13.getIndex() <= ((LazyListMeasuredItem)arrayDeque1.last()).getIndex() || lazyListMeasuredItem13 == lazyListMeasuredItem12) {
                arrayList3.add(object7);
            }
        }
        return z ? new LazyListMeasureResult(lazyListMeasuredItem4, v42, z7, f7, ((MeasureResult)object6), f4, z5, coroutineScope0, density0, lazyListMeasuredItemProvider0.getChildConstraints-msEJaDk(), arrayList3, -v2, v20, v, z1, Orientation.Vertical, v3, v4, null) : new LazyListMeasureResult(lazyListMeasuredItem4, v42, z7, f7, ((MeasureResult)object6), f4, z5, coroutineScope0, density0, lazyListMeasuredItemProvider0.getChildConstraints-msEJaDk(), arrayList3, -v2, v20, v, z1, Orientation.Horizontal, v3, v4, null);
    }
}

