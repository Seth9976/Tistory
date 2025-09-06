package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import e0.h;
import e0.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArrayDeque;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0004\u001A\u008C\u0001\u0010\u001C\u001A\u00020\u0019*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u00012\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\b2\u0006\u0010\u000B\u001A\u00020\n2\u0006\u0010\r\u001A\u00020\f2\u0006\u0010\u000E\u001A\u00020\f2\u0006\u0010\u0010\u001A\u00020\u000F2\u0006\u0010\u0011\u001A\u00020\u00042\u0006\u0010\u0012\u001A\u00020\u00042\u0006\u0010\u0013\u001A\u00020\u00042\u0006\u0010\u0014\u001A\u00020\u00042\u0006\u0010\u0016\u001A\u00020\u00152\u0006\u0010\u0018\u001A\u00020\u0017H\u0001ø\u0001\u0000¢\u0006\u0004\b\u001A\u0010\u001B\u001A\u001D\u0010\u001F\u001A\u00020\u0004*\u00020\u001D2\b\b\u0002\u0010\u001E\u001A\u00020\u0004H\u0000¢\u0006\u0004\b\u001F\u0010 \u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006!"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "state", "", "", "pinnedItems", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;", "itemProvider", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;", "resolvedSlots", "Landroidx/compose/ui/unit/Constraints;", "constraints", "", "isVertical", "reverseLayout", "Landroidx/compose/ui/unit/IntOffset;", "contentOffset", "mainAxisAvailableSize", "mainAxisSpacing", "beforeContentPadding", "afterContentPadding", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Landroidx/compose/ui/graphics/GraphicsContext;", "graphicsContext", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "measureStaggeredGrid-XtK8cYQ", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Ljava/util/List;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;JZZJIIIILkotlinx/coroutines/CoroutineScope;Landroidx/compose/ui/graphics/GraphicsContext;)Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "measureStaggeredGrid", "", "minBound", "indexOfMinValue", "([II)I", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLazyStaggeredGridMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 3 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext\n+ 4 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/SpanRange\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 6 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 7 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 8 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1334:1\n55#1,9:1336\n77#1,4:1345\n1013#1:1362\n1014#1,3:1367\n77#1,4:1370\n77#1,4:1374\n77#1,4:1378\n1013#1:1389\n1014#1,3:1394\n77#1,4:1405\n77#1,4:1409\n1013#1:1430\n1014#1,3:1435\n77#1,4:1440\n77#1,4:1446\n77#1,4:1450\n1013#1:1471\n1014#1,3:1476\n77#1,4:1479\n77#1,4:1483\n1073#1,4:1489\n77#1,4:1493\n77#1,4:1497\n982#1,3:1501\n1000#1:1504\n985#1:1509\n986#1,9:1512\n1001#1:1528\n996#1:1529\n982#1,3:1530\n1000#1:1533\n985#1:1538\n986#1,9:1541\n1001#1:1557\n996#1:1558\n77#1,4:1559\n65#1:1573\n1046#1,11:1577\n1013#1:1588\n1014#1,3:1593\n1000#1:1596\n1001#1:1609\n1013#1:1638\n1014#1,3:1643\n26#2:1335\n26#2:1487\n26#2:1488\n246#3:1349\n243#3:1350\n243#3:1356\n246#3:1382\n243#3:1383\n243#3:1399\n246#3:1417\n243#3:1418\n243#3:1424\n246#3:1458\n243#3:1459\n243#3:1465\n1009#4:1351\n1008#4:1352\n1007#4:1354\n1009#4:1357\n1008#4:1358\n1007#4:1360\n1007#4:1363\n1008#4:1365\n1009#4:1384\n1008#4:1385\n1007#4:1387\n1007#4:1390\n1008#4:1392\n1007#4:1397\n1009#4:1400\n1008#4:1401\n1007#4:1403\n1009#4:1419\n1008#4:1420\n1007#4:1422\n1009#4:1425\n1008#4:1426\n1007#4:1428\n1007#4:1431\n1008#4:1433\n1007#4:1438\n1009#4:1460\n1008#4:1461\n1007#4:1463\n1009#4:1466\n1008#4:1467\n1007#4:1469\n1007#4:1472\n1008#4:1474\n1007#4:1589\n1008#4:1591\n1007#4:1634\n1008#4:1636\n1007#4:1639\n1008#4:1641\n114#5:1353\n107#5:1355\n114#5:1359\n107#5:1361\n107#5:1364\n114#5:1366\n114#5:1386\n107#5:1388\n107#5:1391\n114#5:1393\n107#5:1398\n114#5:1402\n107#5:1404\n114#5:1421\n107#5:1423\n114#5:1427\n107#5:1429\n107#5:1432\n114#5:1434\n107#5:1439\n114#5:1462\n107#5:1464\n114#5:1468\n107#5:1470\n107#5:1473\n114#5:1475\n107#5:1590\n114#5:1592\n107#5:1635\n114#5:1637\n107#5:1640\n114#5:1642\n12774#6,2:1413\n12541#6,2:1415\n12774#6,2:1444\n12583#6,2:1454\n12774#6,2:1456\n12583#6,2:1510\n12583#6,2:1539\n12774#6,2:1569\n12583#6,2:1571\n12744#6,2:1575\n51#7,4:1505\n56#7:1521\n33#7,6:1522\n51#7,4:1534\n56#7:1550\n33#7,6:1551\n33#7,6:1563\n51#7,6:1597\n33#7,6:1603\n51#7,6:1610\n33#7,6:1616\n51#7,6:1622\n33#7,6:1628\n1#8:1574\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt\n*L\n256#1:1336,9\n346#1:1345,4\n391#1:1362\n391#1:1367,3\n403#1:1370,4\n445#1:1374,4\n484#1:1378,4\n512#1:1389\n512#1:1394,3\n536#1:1405,4\n539#1:1409,4\n572#1:1430\n572#1:1435,3\n593#1:1440,4\n616#1:1446,4\n619#1:1450,4\n691#1:1471\n691#1:1476,3\n729#1:1479,4\n732#1:1483,4\n749#1:1489,4\n753#1:1493,4\n776#1:1497,4\n806#1:1501,3\n806#1:1504\n806#1:1509\n806#1:1512,9\n806#1:1528\n806#1:1529\n836#1:1530,3\n836#1:1533\n836#1:1538\n836#1:1541,9\n836#1:1557\n836#1:1558\n867#1:1559,4\n256#1:1573\n950#1:1577,11\n969#1:1588\n969#1:1593,3\n984#1:1596\n984#1:1609\n1026#1:1638\n1026#1:1643,3\n173#1:1335\n741#1:1487\n742#1:1488\n383#1:1349\n383#1:1350\n390#1:1356\n510#1:1382\n510#1:1383\n529#1:1399\n563#1:1417\n563#1:1418\n567#1:1424\n683#1:1458\n683#1:1459\n690#1:1465\n383#1:1351\n383#1:1352\n383#1:1354\n390#1:1357\n390#1:1358\n390#1:1360\n391#1:1363\n391#1:1365\n510#1:1384\n510#1:1385\n510#1:1387\n512#1:1390\n512#1:1392\n520#1:1397\n529#1:1400\n529#1:1401\n529#1:1403\n563#1:1419\n563#1:1420\n563#1:1422\n567#1:1425\n567#1:1426\n567#1:1428\n572#1:1431\n572#1:1433\n584#1:1438\n683#1:1460\n683#1:1461\n683#1:1463\n690#1:1466\n690#1:1467\n690#1:1469\n691#1:1472\n691#1:1474\n969#1:1589\n969#1:1591\n1013#1:1634\n1013#1:1636\n1026#1:1639\n1026#1:1641\n383#1:1353\n383#1:1355\n390#1:1359\n390#1:1361\n391#1:1364\n391#1:1366\n510#1:1386\n510#1:1388\n512#1:1391\n512#1:1393\n520#1:1398\n529#1:1402\n529#1:1404\n563#1:1421\n563#1:1423\n567#1:1427\n567#1:1429\n572#1:1432\n572#1:1434\n584#1:1439\n683#1:1462\n683#1:1464\n690#1:1468\n690#1:1470\n691#1:1473\n691#1:1475\n969#1:1590\n969#1:1592\n1013#1:1635\n1013#1:1637\n1026#1:1640\n1026#1:1642\n548#1:1413,2\n551#1:1415,2\n612#1:1444,2\n626#1:1454,2\n634#1:1456,2\n819#1:1510,2\n852#1:1539,2\n906#1:1569,2\n907#1:1571,2\n948#1:1575,2\n806#1:1505,4\n806#1:1521\n806#1:1522,6\n836#1:1534,4\n836#1:1550\n836#1:1551,6\n897#1:1563,6\n984#1:1597,6\n984#1:1603,6\n1000#1:1610,6\n1000#1:1616,6\n1000#1:1622,6\n1000#1:1628,6\n*E\n"})
public final class LazyStaggeredGridMeasureKt {
    public static final int a(int[] arr_v) {
        int v = -1;
        int v1 = 0x80000000;
        for(int v2 = 0; v2 < arr_v.length; ++v2) {
            int v3 = arr_v[v2];
            if(v1 < v3) {
                v = v2;
                v1 = v3;
            }
        }
        return v;
    }

    public static final int b(int[] arr_v, long v) {
        int v1 = (int)(v >> 0x20);
        int v2 = 0x80000000;
        while(v1 < ((int)(v & 0xFFFFFFFFL))) {
            v2 = Math.max(v2, arr_v[v1]);
            ++v1;
        }
        return v2;
    }

    // This method was un-flattened
    public static final LazyStaggeredGridMeasureResult c(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext0, int v, int[] arr_v, int[] arr_v1, boolean z) {
        int v115;
        int v111;
        int v105;
        List list4;
        int[] arr_v22;
        int v99;
        int v98;
        LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem9;
        int v94;
        int v92;
        int[] arr_v21;
        int v86;
        List list1;
        int[] arr_v18;
        int v68;
        LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem5;
        int v66;
        int[] arr_v17;
        int v64;
        int v61;
        int[] arr_v14;
        int v55;
        int v54;
        int v53;
        int[] arr_v13;
        int v52;
        int[] arr_v12;
        int[] arr_v10;
        int v47;
        LazyStaggeredGridLaneInfo lazyStaggeredGridLaneInfo1;
        int v41;
        int v40;
        int v38;
        int[] arr_v4;
        int v17;
        LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem0;
        int v15;
        int v13;
        int v12;
        int v7;
        LazyLayoutMeasureScope lazyLayoutMeasureScope0 = lazyStaggeredGridMeasureContext0.getMeasureScope();
        int v1 = lazyStaggeredGridMeasureContext0.getItemProvider().getItemCount();
        if(v1 > 0 && lazyStaggeredGridMeasureContext0.getLaneCount() != 0) {
            int[] arr_v2 = Arrays.copyOf(arr_v, arr_v.length);
            Intrinsics.checkNotNullExpressionValue(arr_v2, "copyOf(this, size)");
            int[] arr_v3 = Arrays.copyOf(arr_v1, arr_v1.length);
            Intrinsics.checkNotNullExpressionValue(arr_v3, "copyOf(this, size)");
            int v2 = arr_v2.length - 1;
            if(v2 >= 0) {
                while(true) {
                    if(arr_v2[v2] >= v1 || !lazyStaggeredGridMeasureContext0.getLaneInfo().assignedToLane(arr_v2[v2], v2)) {
                        arr_v2[v2] = lazyStaggeredGridMeasureContext0.getLaneInfo().findPreviousItemIndex(arr_v2[v2], v2);
                    }
                    else {
                        if(arr_v2[v2] >= 0 && !lazyStaggeredGridMeasureContext0.isFullSpan(lazyStaggeredGridMeasureContext0.getItemProvider(), arr_v2[v2])) {
                            lazyStaggeredGridMeasureContext0.getLaneInfo().setLane(arr_v2[v2], v2);
                        }
                        if(v2 - 1 < 0) {
                            break;
                        }
                        --v2;
                    }
                }
            }
            LazyStaggeredGridMeasureKt.e(-v, arr_v3);
            int v3 = lazyStaggeredGridMeasureContext0.getLaneCount();
            ArrayDeque[] arr_arrayDeque = new ArrayDeque[v3];
            for(int v4 = 0; v4 < v3; ++v4) {
                arr_arrayDeque[v4] = new ArrayDeque(16);
            }
            LazyStaggeredGridMeasureKt.e(-lazyStaggeredGridMeasureContext0.getBeforeContentPadding(), arr_v3);
            boolean z1 = false;
        alab1:
            while(true) {
                int v5 = arr_v2.length;
                int v6 = 0;
                while(true) {
                    if(v6 >= v5) {
                        goto label_63;
                    }
                    if(arr_v3[v6] >= Math.max(-lazyStaggeredGridMeasureContext0.getMainAxisSpacing(), 0) || arr_v2[v6] <= 0) {
                        ++v6;
                        continue;
                    }
                    v7 = LazyStaggeredGridMeasureKt.a(arr_v2);
                    int v8 = arr_v2[v7];
                    for(int v9 = 0; v9 < arr_v3.length; ++v9) {
                        if(arr_v2[v9] != arr_v2[v7]) {
                            int v10 = arr_v3[v9];
                            int v11 = arr_v3[v7];
                            if(v10 < v11) {
                                arr_v3[v9] = v11;
                            }
                        }
                    }
                    v12 = lazyStaggeredGridMeasureContext0.getLaneInfo().findPreviousItemIndex(v8, v7);
                    if(v12 < 0) {
                        v13 = v1;
                    }
                    else {
                        long v14 = lazyStaggeredGridMeasureContext0.getSpanRange-lOCCd4c(lazyStaggeredGridMeasureContext0.getItemProvider(), v12, v7);
                        v15 = (int)(v14 >> 0x20);
                        int v16 = ((int)(v14 & 0xFFFFFFFFL)) - v15;
                        lazyStaggeredGridMeasureContext0.getLaneInfo().setLane(v12, (v16 == 1 ? v15 : -2));
                        lazyStaggeredGridMeasuredItem0 = lazyStaggeredGridMeasureContext0.getMeasuredItemProvider().getAndMeasure-jy6DScQ(v12, v14);
                        v17 = LazyStaggeredGridMeasureKt.b(arr_v3, v14);
                        arr_v4 = v16 == 1 ? null : lazyStaggeredGridMeasureContext0.getLaneInfo().getGaps(v12);
                    label_55:
                        if(v15 >= ((int)(v14 & 0xFFFFFFFFL))) {
                            break;
                        }
                        break alab1;
                    }
                    goto label_65;
                }
            }
            arr_v2[v15] = v12;
            int v18 = lazyStaggeredGridMeasuredItem0.getMainAxisSizeWithSpacings() + v17 + (arr_v4 == null ? 0 : arr_v4[v15]);
            arr_v3[v15] = v18;
            if(lazyStaggeredGridMeasureContext0.getMainAxisAvailableSize() + v18 <= 0) {
                z1 = true;
            }
            ++v15;
            goto label_55;
        label_63:
            v13 = v1;
            v7 = -1;
        label_65:
            int v19 = -lazyStaggeredGridMeasureContext0.getBeforeContentPadding();
            int v20 = arr_v3[0];
            if(v20 < v19) {
                v += v20;
                LazyStaggeredGridMeasureKt.e(v19 - v20, arr_v3);
            }
            LazyStaggeredGridMeasureKt.e(lazyStaggeredGridMeasureContext0.getBeforeContentPadding(), arr_v3);
            if(v7 == -1) {
                v7 = ArraysKt___ArraysKt.indexOf(arr_v2, 0);
            }
            if(v7 != -1 && LazyStaggeredGridMeasureKt.d(arr_v2, lazyStaggeredGridMeasureContext0, arr_v3, v7) && z) {
                lazyStaggeredGridMeasureContext0.getLaneInfo().reset();
                int[] arr_v5 = new int[arr_v2.length];
                for(int v21 = 0; v21 < arr_v2.length; ++v21) {
                    arr_v5[v21] = -1;
                }
                int[] arr_v6 = new int[arr_v3.length];
                for(int v22 = 0; v22 < arr_v3.length; ++v22) {
                    arr_v6[v22] = arr_v3[v7];
                }
                return LazyStaggeredGridMeasureKt.c(lazyStaggeredGridMeasureContext0, v, arr_v5, arr_v6, false);
            }
            int[] arr_v7 = Arrays.copyOf(arr_v2, arr_v2.length);
            Intrinsics.checkNotNullExpressionValue(arr_v7, "copyOf(this, size)");
            int[] arr_v8 = new int[arr_v3.length];
            for(int v23 = 0; v23 < arr_v3.length; ++v23) {
                arr_v8[v23] = -arr_v3[v23];
            }
            int v24 = lazyStaggeredGridMeasureContext0.getMainAxisSpacing() + v19;
            int v25 = c.coerceAtLeast(lazyStaggeredGridMeasureContext0.getAfterContentPadding() + lazyStaggeredGridMeasureContext0.getMainAxisAvailableSize(), 0);
            int v26 = LazyStaggeredGridMeasureKt.indexOfMinValue$default(arr_v7, 0, 1, null);
            int v27 = 0;
            boolean z2 = z1;
            while(v26 != -1 && v27 < lazyStaggeredGridMeasureContext0.getLaneCount()) {
                int v28 = arr_v7[v26];
                int v29 = LazyStaggeredGridMeasureKt.indexOfMinValue(arr_v7, v28);
                ++v27;
                int v30 = v27;
                if(v28 >= 0) {
                    long v31 = lazyStaggeredGridMeasureContext0.getSpanRange-lOCCd4c(lazyStaggeredGridMeasureContext0.getItemProvider(), v28, v26);
                    LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem1 = lazyStaggeredGridMeasureContext0.getMeasuredItemProvider().getAndMeasure-jy6DScQ(v28, v31);
                    int v32 = ((int)(v31 & 0xFFFFFFFFL)) - ((int)(v31 >> 0x20));
                    lazyStaggeredGridMeasureContext0.getLaneInfo().setLane(v28, (v32 == 1 ? ((int)(v31 >> 0x20)) : -2));
                    int v33 = LazyStaggeredGridMeasureKt.b(arr_v8, v31);
                    for(int v34 = (int)(v31 >> 0x20); v34 < ((int)(v31 & 0xFFFFFFFFL)); ++v34) {
                        arr_v8[v34] = lazyStaggeredGridMeasuredItem1.getMainAxisSizeWithSpacings() + v33;
                        arr_v7[v34] = v28;
                        arr_arrayDeque[v34].addLast(lazyStaggeredGridMeasuredItem1);
                    }
                    if(v33 < v24 && arr_v8[((int)(v31 >> 0x20))] <= v24) {
                        lazyStaggeredGridMeasuredItem1.setVisible(false);
                        z2 = true;
                    }
                    v27 = v32 == 1 ? v30 : lazyStaggeredGridMeasureContext0.getLaneCount();
                }
                v26 = v29;
            }
            int v35 = v25;
        alab2:
            while(true) {
                int v36 = 0;
                while(v36 < arr_v3.length) {
                    int v37 = arr_v8[v36];
                    v38 = v35;
                    if(v37 < v38 || v37 <= 0) {
                        goto label_143;
                    }
                    ++v36;
                    v35 = v38;
                }
                v38 = v35;
                for(int v39 = 0; v39 < v3; ++v39) {
                    if(!arr_arrayDeque[v39].isEmpty()) {
                        v40 = v13;
                        v41 = 0;
                        break alab2;
                    }
                }
            label_143:
                int v42 = LazyStaggeredGridMeasureKt.indexOfMinValue$default(arr_v8, 0, 1, null);
                int v43 = ArraysKt___ArraysKt.maxOrThrow(arr_v7) + 1;
                v40 = v13;
                if(v43 < v40) {
                    long v44 = lazyStaggeredGridMeasureContext0.getSpanRange-lOCCd4c(lazyStaggeredGridMeasureContext0.getItemProvider(), v43, v42);
                    LazyStaggeredGridLaneInfo lazyStaggeredGridLaneInfo0 = lazyStaggeredGridMeasureContext0.getLaneInfo();
                    int v45 = (int)(v44 >> 0x20);
                    int v46 = ((int)(v44 & 0xFFFFFFFFL)) - v45;
                    if(v46 == 1) {
                        lazyStaggeredGridLaneInfo1 = lazyStaggeredGridLaneInfo0;
                        v47 = v45;
                    }
                    else {
                        lazyStaggeredGridLaneInfo1 = lazyStaggeredGridLaneInfo0;
                        v47 = -2;
                    }
                    lazyStaggeredGridLaneInfo1.setLane(v43, v47);
                    LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem2 = lazyStaggeredGridMeasureContext0.getMeasuredItemProvider().getAndMeasure-jy6DScQ(v43, v44);
                    int v48 = LazyStaggeredGridMeasureKt.b(arr_v8, v44);
                    if(v46 == 1) {
                        arr_v10 = null;
                    }
                    else {
                        int[] arr_v9 = lazyStaggeredGridMeasureContext0.getLaneInfo().getGaps(v43);
                        arr_v10 = arr_v9 == null ? new int[lazyStaggeredGridMeasureContext0.getLaneCount()] : arr_v9;
                    }
                    for(int v49 = v45; v49 < ((int)(v44 & 0xFFFFFFFFL)); ++v49) {
                        if(arr_v10 != null) {
                            arr_v10[v49] = v48 - arr_v8[v49];
                        }
                        arr_v7[v49] = v43;
                        arr_v8[v49] = lazyStaggeredGridMeasuredItem2.getMainAxisSizeWithSpacings() + v48;
                        arr_arrayDeque[v49].addLast(lazyStaggeredGridMeasuredItem2);
                    }
                    lazyStaggeredGridMeasureContext0.getLaneInfo().setGaps(v43, arr_v10);
                    if(v48 < v24 && arr_v8[v45] <= v24) {
                        lazyStaggeredGridMeasuredItem2.setVisible(false);
                    }
                    v35 = v38;
                    v13 = v40;
                    continue;
                }
                else {
                    v41 = 0;
                }
                break;
            }
            while(v41 < v3) {
                ArrayDeque arrayDeque0 = arr_arrayDeque[v41];
                while(arrayDeque0.size() > 1 && !((LazyStaggeredGridMeasuredItem)arrayDeque0.first()).isVisible()) {
                    LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem3 = (LazyStaggeredGridMeasuredItem)arrayDeque0.removeFirst();
                    int[] arr_v11 = lazyStaggeredGridMeasuredItem3.getSpan() == 1 ? null : lazyStaggeredGridMeasureContext0.getLaneInfo().getGaps(lazyStaggeredGridMeasuredItem3.getIndex());
                    arr_v3[v41] -= lazyStaggeredGridMeasuredItem3.getMainAxisSizeWithSpacings() + (arr_v11 == null ? 0 : arr_v11[v41]);
                }
                LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem4 = (LazyStaggeredGridMeasuredItem)arrayDeque0.firstOrNull();
                arr_v2[v41] = lazyStaggeredGridMeasuredItem4 == null ? -1 : lazyStaggeredGridMeasuredItem4.getIndex();
                ++v41;
            }
            for(int v50 = 0; v50 < arr_v7.length; ++v50) {
                if(arr_v7[v50] == v40 - 1) {
                    LazyStaggeredGridMeasureKt.e(-lazyStaggeredGridMeasureContext0.getMainAxisSpacing(), arr_v8);
                    break;
                }
            }
            int v51 = 0;
            while(v51 < arr_v3.length) {
                if(arr_v8[v51] < lazyStaggeredGridMeasureContext0.getMainAxisAvailableSize()) {
                    ++v51;
                    continue;
                }
                arr_v12 = arr_v7;
                v52 = arr_v3.length;
                arr_v13 = arr_v8;
                v53 = v38;
                v54 = v40;
                v55 = v;
                arr_v14 = arr_v3;
                goto label_292;
            }
            int v56 = lazyStaggeredGridMeasureContext0.getMainAxisAvailableSize() - arr_v8[LazyStaggeredGridMeasureKt.a(arr_v8)];
            arr_v14 = arr_v3;
            LazyStaggeredGridMeasureKt.e(-v56, arr_v14);
            LazyStaggeredGridMeasureKt.e(v56, arr_v8);
            boolean z3 = false;
        alab3:
            while(true) {
                int v57 = 0;
                while(true) {
                    if(v57 >= arr_v14.length) {
                        goto label_274;
                    }
                    if(arr_v14[v57] >= lazyStaggeredGridMeasureContext0.getBeforeContentPadding()) {
                        ++v57;
                        continue;
                    }
                    int v58 = LazyStaggeredGridMeasureKt.indexOfMinValue$default(arr_v14, 0, 1, null);
                    int v59 = LazyStaggeredGridMeasureKt.a(arr_v2);
                    if(v58 != v59) {
                        if(arr_v14[v58] == arr_v14[v59]) {
                            v58 = v59;
                        }
                        else {
                            z3 = true;
                        }
                    }
                    int v60 = arr_v2[v58];
                    if(v60 == -1) {
                        v60 = v40;
                    }
                    v61 = lazyStaggeredGridMeasureContext0.getLaneInfo().findPreviousItemIndex(v60, v58);
                    if(v61 < 0) {
                        if((z3 || LazyStaggeredGridMeasureKt.d(arr_v2, lazyStaggeredGridMeasureContext0, arr_v14, v58)) && z) {
                            lazyStaggeredGridMeasureContext0.getLaneInfo().reset();
                            int[] arr_v15 = new int[arr_v2.length];
                            for(int v62 = 0; v62 < arr_v2.length; ++v62) {
                                arr_v15[v62] = -1;
                            }
                            int[] arr_v16 = new int[arr_v14.length];
                            for(int v63 = 0; v63 < arr_v14.length; ++v63) {
                                arr_v16[v63] = arr_v14[v58];
                            }
                            return LazyStaggeredGridMeasureKt.c(lazyStaggeredGridMeasureContext0, v, arr_v15, arr_v16, false);
                        }
                        v64 = v;
                        arr_v12 = arr_v7;
                        v52 = arr_v3.length;
                        arr_v17 = arr_v8;
                        v53 = v38;
                        v54 = v40;
                    }
                    else {
                        long v65 = lazyStaggeredGridMeasureContext0.getSpanRange-lOCCd4c(lazyStaggeredGridMeasureContext0.getItemProvider(), v61, v58);
                        v66 = (int)(v65 >> 0x20);
                        int v67 = ((int)(v65 & 0xFFFFFFFFL)) - v66;
                        lazyStaggeredGridMeasureContext0.getLaneInfo().setLane(v61, (v67 == 1 ? v66 : -2));
                        lazyStaggeredGridMeasuredItem5 = lazyStaggeredGridMeasureContext0.getMeasuredItemProvider().getAndMeasure-jy6DScQ(v61, v65);
                        v68 = LazyStaggeredGridMeasureKt.b(arr_v14, v65);
                        arr_v18 = v67 == 1 ? null : lazyStaggeredGridMeasureContext0.getLaneInfo().getGaps(v61);
                    label_266:
                        if(v66 >= ((int)(v65 & 0xFFFFFFFFL))) {
                            break;
                        }
                        break alab3;
                    }
                    goto label_280;
                }
            }
            if(arr_v14[v66] != v68) {
                z3 = true;
            }
            arr_arrayDeque[v66].addFirst(lazyStaggeredGridMeasuredItem5);
            arr_v2[v66] = v61;
            arr_v14[v66] = lazyStaggeredGridMeasuredItem5.getMainAxisSizeWithSpacings() + v68 + (arr_v18 == null ? 0 : arr_v18[v66]);
            ++v66;
            goto label_266;
        label_274:
            arr_v12 = arr_v7;
            v52 = arr_v3.length;
            v53 = v38;
            v54 = v40;
            v64 = v;
            arr_v17 = arr_v8;
        label_280:
            if(z3 && z) {
                lazyStaggeredGridMeasureContext0.getLaneInfo().reset();
                return LazyStaggeredGridMeasureKt.c(lazyStaggeredGridMeasureContext0, v64, arr_v2, arr_v14, false);
            }
            v55 = v56 + v64;
            int v69 = arr_v14[LazyStaggeredGridMeasureKt.indexOfMinValue$default(arr_v14, 0, 1, null)];
            if(v69 < 0) {
                v55 += v69;
                arr_v13 = arr_v17;
                LazyStaggeredGridMeasureKt.e(v69, arr_v13);
                LazyStaggeredGridMeasureKt.e(-v69, arr_v14);
            }
            else {
                arr_v13 = arr_v17;
            }
        label_292:
            float f = zd.c.getSign(Math.round(lazyStaggeredGridMeasureContext0.getState().getScrollToBeConsumed$foundation_release())) != zd.c.getSign(v55) || Math.abs(Math.round(lazyStaggeredGridMeasureContext0.getState().getScrollToBeConsumed$foundation_release())) < Math.abs(v55) ? lazyStaggeredGridMeasureContext0.getState().getScrollToBeConsumed$foundation_release() : ((float)v55);
            int[] arr_v19 = Arrays.copyOf(arr_v14, arr_v14.length);
            Intrinsics.checkNotNullExpressionValue(arr_v19, "copyOf(this, size)");
            for(int v70 = 0; v70 < arr_v19.length; ++v70) {
                arr_v19[v70] = -arr_v19[v70];
            }
            if(lazyStaggeredGridMeasureContext0.getBeforeContentPadding() > lazyStaggeredGridMeasureContext0.getMainAxisSpacing()) {
                for(int v71 = 0; v71 < v3; ++v71) {
                    ArrayDeque arrayDeque1 = arr_arrayDeque[v71];
                    int v72 = arrayDeque1.size();
                    int v73 = 0;
                    while(v73 < v72) {
                        LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem6 = (LazyStaggeredGridMeasuredItem)arrayDeque1.get(v73);
                        int[] arr_v20 = lazyStaggeredGridMeasureContext0.getLaneInfo().getGaps(lazyStaggeredGridMeasuredItem6.getIndex());
                        int v74 = lazyStaggeredGridMeasuredItem6.getMainAxisSizeWithSpacings() + (arr_v20 == null ? 0 : arr_v20[v71]);
                        if(v73 == CollectionsKt__CollectionsKt.getLastIndex(arrayDeque1)) {
                            break;
                        }
                        int v75 = arr_v14[v71];
                        if(v75 == 0 || v75 < v74) {
                            break;
                        }
                        arr_v14[v71] = v75 - v74;
                        ++v73;
                        arr_v2[v71] = ((LazyStaggeredGridMeasuredItem)arrayDeque1.get(v73)).getIndex();
                    }
                }
            }
            int v76 = lazyStaggeredGridMeasureContext0.getAfterContentPadding() + lazyStaggeredGridMeasureContext0.getBeforeContentPadding();
            int v77 = lazyStaggeredGridMeasureContext0.isVertical() ? Constraints.getMaxWidth-impl(lazyStaggeredGridMeasureContext0.getConstraints-msEJaDk()) : ConstraintsKt.constrainWidth-K40F9xA(lazyStaggeredGridMeasureContext0.getConstraints-msEJaDk(), ArraysKt___ArraysKt.maxOrThrow(arr_v13) + v76);
            int v78 = lazyStaggeredGridMeasureContext0.isVertical() ? ConstraintsKt.constrainHeight-K40F9xA(lazyStaggeredGridMeasureContext0.getConstraints-msEJaDk(), ArraysKt___ArraysKt.maxOrThrow(arr_v13) + v76) : Constraints.getMaxHeight-impl(lazyStaggeredGridMeasureContext0.getConstraints-msEJaDk());
            int v79 = lazyStaggeredGridMeasureContext0.getAfterContentPadding() + (Math.min((lazyStaggeredGridMeasureContext0.isVertical() ? v78 : v77), lazyStaggeredGridMeasureContext0.getMainAxisAvailableSize()) - lazyStaggeredGridMeasureContext0.getBeforeContentPadding());
            int v80 = arr_v19[0];
            List list0 = lazyStaggeredGridMeasureContext0.getPinnedItems();
            int v81 = list0.size();
            if(v81 - 1 >= 0) {
                list1 = null;
                int v82 = v81 - 1;
                int v83 = v80;
                while(true) {
                    int v84 = ((Number)list0.get(v82)).intValue();
                    int v85 = lazyStaggeredGridMeasureContext0.getLaneInfo().getLane(v84);
                    v86 = v78;
                    if(v85 == -2 || v85 == -1) {
                        int v87 = arr_v2.length;
                        int v88 = 0;
                        while(v88 < v87) {
                            if(arr_v2[v88] > v84) {
                                ++v88;
                                continue;
                            }
                            arr_v21 = arr_v2;
                            goto label_354;
                        }
                    }
                    else if(arr_v2[v85] <= v84) {
                        arr_v21 = arr_v2;
                        goto label_354;
                    }
                    arr_v21 = arr_v2;
                    long v89 = lazyStaggeredGridMeasureContext0.getSpanRange-lOCCd4c(lazyStaggeredGridMeasureContext0.getItemProvider(), v84, 0);
                    if(list1 == null) {
                        list1 = new ArrayList();
                    }
                    LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem7 = lazyStaggeredGridMeasureContext0.getMeasuredItemProvider().getAndMeasure-jy6DScQ(v84, v89);
                    v83 -= lazyStaggeredGridMeasuredItem7.getMainAxisSizeWithSpacings();
                    lazyStaggeredGridMeasuredItem7.position(v83, 0, v79);
                    list1.add(lazyStaggeredGridMeasuredItem7);
                label_354:
                    if(v82 - 1 < 0) {
                        break;
                    }
                    --v82;
                    v78 = v86;
                    arr_v2 = arr_v21;
                }
            }
            else {
                arr_v21 = arr_v2;
                v86 = v78;
                list1 = null;
            }
            if(list1 == null) {
                list1 = CollectionsKt__CollectionsKt.emptyList();
            }
            int v91 = 0;
            for(int v90 = 0; v90 < v3; ++v90) {
                v91 += arr_arrayDeque[v90].size();
            }
            ArrayList arrayList0 = new ArrayList(v91);
            do {
                do {
                    v92 = 0;
                label_372:
                    if(v92 >= v3) {
                        goto label_398;
                    }
                    if(arr_arrayDeque[v92].isEmpty()) {
                        ++v92;
                        goto label_372;
                    }
                    v94 = -1;
                    int v95 = 0x7FFFFFFF;
                    for(int v93 = 0; v93 < v3; ++v93) {
                        LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem8 = (LazyStaggeredGridMeasuredItem)arr_arrayDeque[v93].firstOrNull();
                        int v96 = lazyStaggeredGridMeasuredItem8 == null ? 0x7FFFFFFF : lazyStaggeredGridMeasuredItem8.getIndex();
                        if(v95 > v96) {
                            v95 = v96;
                            v94 = v93;
                        }
                    }
                    lazyStaggeredGridMeasuredItem9 = (LazyStaggeredGridMeasuredItem)arr_arrayDeque[v94].removeFirst();
                }
                while(lazyStaggeredGridMeasuredItem9.getLane() != v94);
                long v97 = ((long)(lazyStaggeredGridMeasuredItem9.getSpan() + lazyStaggeredGridMeasuredItem9.getLane())) & 0xFFFFFFFFL | ((long)lazyStaggeredGridMeasuredItem9.getLane()) << 0x20;
                v98 = LazyStaggeredGridMeasureKt.b(arr_v19, v97);
                lazyStaggeredGridMeasuredItem9.position(v98, lazyStaggeredGridMeasureContext0.getResolvedSlots().getPositions()[v94], v79);
                arrayList0.add(lazyStaggeredGridMeasuredItem9);
                v99 = (int)(v97 >> 0x20);
            label_392:
            }
            while(v99 >= ((int)(v97 & 0xFFFFFFFFL)));
            arr_v19[v99] = lazyStaggeredGridMeasuredItem9.getMainAxisSizeWithSpacings() + v98;
            ++v99;
            goto label_392;
        label_398:
            int v100 = arr_v19[0];
            List list2 = lazyStaggeredGridMeasureContext0.getPinnedItems();
            int v101 = list2.size();
            int v102 = 0;
            List list3 = null;
            while(v102 < v101) {
                int v103 = ((Number)list2.get(v102)).intValue();
                if(v103 < v54) {
                    int v104 = lazyStaggeredGridMeasureContext0.getLaneInfo().getLane(v103);
                    if(v104 == -2 || v104 == -1) {
                        arr_v22 = arr_v12;
                        int v106 = arr_v22.length;
                        list4 = list2;
                        int v107 = 0;
                        while(v107 < v106) {
                            v105 = v101;
                            if(arr_v22[v107] >= v103) {
                                goto label_435;
                            }
                            ++v107;
                            v101 = v105;
                        }
                        v105 = v101;
                    label_424:
                        long v108 = lazyStaggeredGridMeasureContext0.getSpanRange-lOCCd4c(lazyStaggeredGridMeasureContext0.getItemProvider(), v103, 0);
                        if(list3 == null) {
                            list3 = new ArrayList();
                        }
                        LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem10 = lazyStaggeredGridMeasureContext0.getMeasuredItemProvider().getAndMeasure-jy6DScQ(v103, v108);
                        lazyStaggeredGridMeasuredItem10.position(v100, 0, v79);
                        list3.add(lazyStaggeredGridMeasuredItem10);
                        v100 = lazyStaggeredGridMeasuredItem10.getMainAxisSizeWithSpacings() + v100;
                    }
                    else if(arr_v12[v104] < v103) {
                        arr_v22 = arr_v12;
                        list4 = list2;
                        v105 = v101;
                        goto label_424;
                    }
                }
                else {
                    arr_v22 = arr_v12;
                    list4 = list2;
                    v105 = v101;
                }
            label_435:
                ++v102;
                list2 = list4;
                arr_v12 = arr_v22;
                v101 = v105;
            }
            if(list3 == null) {
                list3 = CollectionsKt__CollectionsKt.emptyList();
            }
            ArrayList arrayList1 = new ArrayList();
            arrayList1.addAll(list1);
            arrayList1.addAll(arrayList0);
            arrayList1.addAll(list3);
            lazyStaggeredGridMeasureContext0.getState().getItemAnimator$foundation_release().onMeasured(((int)f), v77, v86, arrayList1, lazyStaggeredGridMeasureContext0.getMeasuredItemProvider().getKeyIndexMap(), lazyStaggeredGridMeasureContext0.getMeasuredItemProvider(), lazyStaggeredGridMeasureContext0.isVertical(), false, lazyStaggeredGridMeasureContext0.getLaneCount(), false, ArraysKt___ArraysKt.minOrThrow(arr_v14), ArraysKt___ArraysKt.maxOrThrow(arr_v13) + v76, lazyStaggeredGridMeasureContext0.getCoroutineScope(), lazyStaggeredGridMeasureContext0.getGraphicsContext());
            long v109 = lazyStaggeredGridMeasureContext0.getState().getItemAnimator$foundation_release().getMinSizeToFitDisappearingItems-YbymL2g();
            if(IntSize.equals-impl0(v109, 0L)) {
                v115 = v77;
                v111 = v86;
            }
            else {
                int v110 = ConstraintsKt.constrainWidth-K40F9xA(lazyStaggeredGridMeasureContext0.getConstraints-msEJaDk(), Math.max(v77, IntSize.getWidth-impl(v109)));
                v111 = ConstraintsKt.constrainHeight-K40F9xA(lazyStaggeredGridMeasureContext0.getConstraints-msEJaDk(), Math.max(v86, IntSize.getHeight-impl(v109)));
                int v112 = lazyStaggeredGridMeasureContext0.isVertical() ? v111 : v110;
                if(v112 != (lazyStaggeredGridMeasureContext0.isVertical() ? v86 : v77)) {
                    int v113 = arrayList1.size();
                    for(int v114 = 0; v114 < v113; ++v114) {
                        ((LazyStaggeredGridMeasuredItem)arrayList1.get(v114)).updateMainAxisLayoutSize(v112);
                    }
                }
                v115 = v110;
            }
            for(int v116 = 0; true; ++v116) {
                boolean z4 = false;
                if(v116 >= v52) {
                    break;
                }
                if(arr_v13[v116] > lazyStaggeredGridMeasureContext0.getMainAxisAvailableSize()) {
                    z4 = true;
                    break;
                }
            }
            if(!z4) {
                for(int v117 = 0; v117 < arr_v12.length; ++v117) {
                    if(arr_v12[v117] >= v54 - 1) {
                        return new LazyStaggeredGridMeasureResult(arr_v21, arr_v14, f, MeasureScope.layout$default(lazyLayoutMeasureScope0, v115, v111, null, new i(arrayList1, lazyStaggeredGridMeasureContext0), 4, null), false, lazyStaggeredGridMeasureContext0.isVertical(), z2, lazyStaggeredGridMeasureContext0.getResolvedSlots(), lazyStaggeredGridMeasureContext0.getItemProvider().getSpanProvider(), lazyLayoutMeasureScope0, v54, arrayList0, IntSizeKt.IntSize(v115, v111), v19, v53, lazyStaggeredGridMeasureContext0.getBeforeContentPadding(), lazyStaggeredGridMeasureContext0.getAfterContentPadding(), lazyStaggeredGridMeasureContext0.getMainAxisSpacing(), lazyStaggeredGridMeasureContext0.getCoroutineScope(), null);
                    }
                }
                return new LazyStaggeredGridMeasureResult(arr_v21, arr_v14, f, MeasureScope.layout$default(lazyLayoutMeasureScope0, v115, v111, null, new i(arrayList1, lazyStaggeredGridMeasureContext0), 4, null), true, lazyStaggeredGridMeasureContext0.isVertical(), z2, lazyStaggeredGridMeasureContext0.getResolvedSlots(), lazyStaggeredGridMeasureContext0.getItemProvider().getSpanProvider(), lazyLayoutMeasureScope0, v54, arrayList0, IntSizeKt.IntSize(v115, v111), v19, v53, lazyStaggeredGridMeasureContext0.getBeforeContentPadding(), lazyStaggeredGridMeasureContext0.getAfterContentPadding(), lazyStaggeredGridMeasureContext0.getMainAxisSpacing(), lazyStaggeredGridMeasureContext0.getCoroutineScope(), null);
            }
            return new LazyStaggeredGridMeasureResult(arr_v21, arr_v14, f, MeasureScope.layout$default(lazyLayoutMeasureScope0, v115, v111, null, new i(arrayList1, lazyStaggeredGridMeasureContext0), 4, null), true, lazyStaggeredGridMeasureContext0.isVertical(), z2, lazyStaggeredGridMeasureContext0.getResolvedSlots(), lazyStaggeredGridMeasureContext0.getItemProvider().getSpanProvider(), lazyLayoutMeasureScope0, v54, arrayList0, IntSizeKt.IntSize(v115, v111), v19, v53, lazyStaggeredGridMeasureContext0.getBeforeContentPadding(), lazyStaggeredGridMeasureContext0.getAfterContentPadding(), lazyStaggeredGridMeasureContext0.getMainAxisSpacing(), lazyStaggeredGridMeasureContext0.getCoroutineScope(), null);
        }
        int v118 = Constraints.getMinWidth-impl(lazyStaggeredGridMeasureContext0.getConstraints-msEJaDk());
        int v119 = Constraints.getMinHeight-impl(lazyStaggeredGridMeasureContext0.getConstraints-msEJaDk());
        lazyStaggeredGridMeasureContext0.getState().getItemAnimator$foundation_release().onMeasured(0, v118, v119, new ArrayList(), lazyStaggeredGridMeasureContext0.getMeasuredItemProvider().getKeyIndexMap(), lazyStaggeredGridMeasureContext0.getMeasuredItemProvider(), lazyStaggeredGridMeasureContext0.isVertical(), false, lazyStaggeredGridMeasureContext0.getLaneCount(), false, 0, 0, lazyStaggeredGridMeasureContext0.getCoroutineScope(), lazyStaggeredGridMeasureContext0.getGraphicsContext());
        long v120 = lazyStaggeredGridMeasureContext0.getState().getItemAnimator$foundation_release().getMinSizeToFitDisappearingItems-YbymL2g();
        if(!IntSize.equals-impl0(v120, 0L)) {
            v118 = ConstraintsKt.constrainWidth-K40F9xA(lazyStaggeredGridMeasureContext0.getConstraints-msEJaDk(), IntSize.getWidth-impl(v120));
            v119 = ConstraintsKt.constrainHeight-K40F9xA(lazyStaggeredGridMeasureContext0.getConstraints-msEJaDk(), IntSize.getHeight-impl(v120));
        }
        return new LazyStaggeredGridMeasureResult(arr_v, arr_v1, 0.0f, MeasureScope.layout$default(lazyLayoutMeasureScope0, v118, v119, null, h.w, 4, null), false, lazyStaggeredGridMeasureContext0.isVertical(), false, lazyStaggeredGridMeasureContext0.getResolvedSlots(), lazyStaggeredGridMeasureContext0.getItemProvider().getSpanProvider(), lazyLayoutMeasureScope0, v1, CollectionsKt__CollectionsKt.emptyList(), IntSizeKt.IntSize(Constraints.getMinWidth-impl(lazyStaggeredGridMeasureContext0.getConstraints-msEJaDk()), Constraints.getMinHeight-impl(lazyStaggeredGridMeasureContext0.getConstraints-msEJaDk())), -lazyStaggeredGridMeasureContext0.getBeforeContentPadding(), lazyStaggeredGridMeasureContext0.getAfterContentPadding() + lazyStaggeredGridMeasureContext0.getMainAxisAvailableSize(), lazyStaggeredGridMeasureContext0.getBeforeContentPadding(), lazyStaggeredGridMeasureContext0.getAfterContentPadding(), lazyStaggeredGridMeasureContext0.getMainAxisSpacing(), lazyStaggeredGridMeasureContext0.getCoroutineScope(), null);
    }

    public static final boolean d(int[] arr_v, LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext0, int[] arr_v1, int v) {
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            if(lazyStaggeredGridMeasureContext0.getLaneInfo().findPreviousItemIndex(arr_v[v1], v1) == -1 && arr_v1[v1] != arr_v1[v]) {
                return true;
            }
        }
        for(int v2 = 0; v2 < arr_v.length; ++v2) {
            if(lazyStaggeredGridMeasureContext0.getLaneInfo().findPreviousItemIndex(arr_v[v2], v2) != -1 && arr_v1[v2] >= arr_v1[v]) {
                return true;
            }
        }
        int v3 = lazyStaggeredGridMeasureContext0.getLaneInfo().getLane(0);
        return v3 != -1 && v3 != 0 && v3 != -2;
    }

    public static final void e(int v, int[] arr_v) {
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            arr_v[v1] += v;
        }
    }

    public static final int indexOfMinValue(@NotNull int[] arr_v, int v) {
        int v1 = -1;
        int v2 = 0x7FFFFFFF;
        for(int v3 = 0; v3 < arr_v.length; ++v3) {
            int v4 = arr_v[v3];
            if(v + 1 <= v4 && v4 < v2) {
                v1 = v3;
                v2 = v4;
            }
        }
        return v1;
    }

    public static int indexOfMinValue$default(int[] arr_v, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = 0x80000000;
        }
        return LazyStaggeredGridMeasureKt.indexOfMinValue(arr_v, v);
    }

    @ExperimentalFoundationApi
    @NotNull
    public static final LazyStaggeredGridMeasureResult measureStaggeredGrid-XtK8cYQ(@NotNull LazyLayoutMeasureScope lazyLayoutMeasureScope0, @NotNull LazyStaggeredGridState lazyStaggeredGridState0, @NotNull List list0, @NotNull LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider0, @NotNull LazyStaggeredGridSlots lazyStaggeredGridSlots0, long v, boolean z, boolean z1, long v1, int v2, int v3, int v4, int v5, @NotNull CoroutineScope coroutineScope0, @NotNull GraphicsContext graphicsContext0) {
        int v12;
        int v9;
        LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext0 = new LazyStaggeredGridMeasureContext(lazyStaggeredGridState0, list0, lazyStaggeredGridItemProvider0, lazyStaggeredGridSlots0, v, z, lazyLayoutMeasureScope0, v2, v1, v4, v5, z1, v3, coroutineScope0, graphicsContext0, null);
        int[] arr_v = lazyStaggeredGridState0.updateScrollPositionIfTheFirstItemWasMoved$foundation_release(lazyStaggeredGridItemProvider0, lazyStaggeredGridState0.getScrollPosition$foundation_release().getIndices());
        int[] arr_v1 = lazyStaggeredGridState0.getScrollPosition$foundation_release().getScrollOffsets();
        if(arr_v.length != lazyStaggeredGridMeasureContext0.getLaneCount()) {
            lazyStaggeredGridMeasureContext0.getLaneInfo().reset();
            int v6 = lazyStaggeredGridMeasureContext0.getLaneCount();
            int[] arr_v2 = new int[v6];
            for(int v7 = 0; v7 < v6; ++v7) {
                if(v7 < arr_v.length) {
                    int v8 = arr_v[v7];
                    if(v8 != -1) {
                        v9 = v8;
                    }
                }
                else {
                    v9 = v7 == 0 ? 0 : LazyStaggeredGridMeasureKt.b(arr_v2, ((long)v7) & 0xFFFFFFFFL) + 1;
                }
                arr_v2[v7] = v9;
                lazyStaggeredGridMeasureContext0.getLaneInfo().setLane(arr_v2[v7], v7);
            }
            arr_v = arr_v2;
        }
        if(arr_v1.length != lazyStaggeredGridMeasureContext0.getLaneCount()) {
            int v10 = lazyStaggeredGridMeasureContext0.getLaneCount();
            int[] arr_v3 = new int[v10];
            for(int v11 = 0; v11 < v10; ++v11) {
                if(v11 < arr_v1.length) {
                    v12 = arr_v1[v11];
                }
                else {
                    v12 = v11 == 0 ? 0 : arr_v3[v11 - 1];
                }
                arr_v3[v11] = v12;
            }
            arr_v1 = arr_v3;
        }
        return LazyStaggeredGridMeasureKt.c(lazyStaggeredGridMeasureContext0, Math.round(lazyStaggeredGridState0.getScrollToBeConsumed$foundation_release()), arr_v, arr_v1, true);
    }
}

