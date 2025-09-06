package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0003\u001A\u0085\u0001\u0010\u0000\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0006\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00042\u0006\u0010\b\u001A\u00020\u00042\u0006\u0010\t\u001A\u00020\n2\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\r0\f2\u000E\u0010\u000E\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000F2\u0006\u0010\u0011\u001A\u00020\u00042\u0006\u0010\u0012\u001A\u00020\u00042\n\b\u0002\u0010\u0013\u001A\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001A\u00020\u0004H\u0000¢\u0006\u0002\u0010\u0016¨\u0006\u0017"}, d2 = {"measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/foundation/layout/RowColumnMeasurePolicy;", "mainAxisMin", "", "crossAxisMin", "mainAxisMax", "crossAxisMax", "arrangementSpacingInt", "measureScope", "Landroidx/compose/ui/layout/MeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/Measurable;", "placeables", "", "Landroidx/compose/ui/layout/Placeable;", "startIndex", "endIndex", "crossAxisOffset", "", "currentLineIndex", "(Landroidx/compose/foundation/layout/RowColumnMeasurePolicy;IIIIILandroidx/compose/ui/layout/MeasureScope;Ljava/util/List;[Landroidx/compose/ui/layout/Placeable;II[II)Landroidx/compose/ui/layout/MeasureResult;", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nRowColumnMeasurePolicy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RowColumnMeasurePolicy.kt\nandroidx/compose/foundation/layout/RowColumnMeasurePolicyKt\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,321:1\n26#2:322\n26#2:323\n26#2:324\n26#2:326\n1#3:325\n*S KotlinDebug\n*F\n+ 1 RowColumnMeasurePolicy.kt\nandroidx/compose/foundation/layout/RowColumnMeasurePolicyKt\n*L\n116#1:322\n168#1:323\n199#1:324\n210#1:326\n*E\n"})
public final class RowColumnMeasurePolicyKt {
    @NotNull
    public static final MeasureResult measure(@NotNull RowColumnMeasurePolicy rowColumnMeasurePolicy0, int v, int v1, int v2, int v3, int v4, @NotNull MeasureScope measureScope0, @NotNull List list0, @NotNull Placeable[] arr_placeable, int v5, int v6, @Nullable int[] arr_v, int v7) {
        int v63;
        int v60;
        int v57;
        float f11;
        long v56;
        float f10;
        long v53;
        long v52;
        float f9;
        int v51;
        int v50;
        long v49;
        float f8;
        float f7;
        int v48;
        Integer integer2;
        int v47;
        int v46;
        int v45;
        int v44;
        int v43;
        float f6;
        int v42;
        Integer integer1;
        int v30;
        int v29;
        int[] arr_v4;
        int v28;
        int v22;
        int[] arr_v3;
        int v21;
        int v20;
        int v19;
        float f2;
        int[] arr_v2;
        long v17;
        int v16;
        int v8 = v6 - v5;
        int[] arr_v1 = new int[v8];
        int v9 = v5;
        long v10 = (long)v4;
        float f = 0.0f;
        int v11 = 0;
        int v12 = 0;
        int v13 = 0;
        int v14 = 0;
        boolean z = false;
        while(true) {
            Integer integer0 = null;
            if(v9 >= v6) {
                break;
            }
            int v15 = v14;
            Measurable measurable0 = (Measurable)list0.get(v9);
            RowColumnParentData rowColumnParentData0 = RowColumnImplKt.getRowColumnParentData(measurable0);
            float f1 = RowColumnImplKt.getWeight(rowColumnParentData0);
            z = z || RowColumnImplKt.isRelative(rowColumnParentData0);
            if(f1 > 0.0f) {
                ++v13;
                v16 = v9;
                v17 = v10;
                arr_v2 = arr_v1;
                f2 = f + f1;
            }
            else {
                if(v3 != 0x7FFFFFFF && rowColumnParentData0 != null) {
                    FlowLayoutData flowLayoutData0 = rowColumnParentData0.getFlowLayoutData();
                    if(flowLayoutData0 != null) {
                        integer0 = Math.round(flowLayoutData0.getFillCrossAxisFraction() * ((float)v3));
                    }
                }
                int v18 = v2 - v12;
                Placeable placeable0 = arr_placeable[v9];
                if(placeable0 == null) {
                    v19 = v12;
                    v20 = v13;
                    v16 = v9;
                    v21 = v18;
                    arr_v3 = arr_v1;
                    v17 = v10;
                    v22 = v15;
                    f2 = f;
                    placeable0 = measurable0.measure-BRTryo0(RowColumnMeasurePolicy.createConstraints-xF2OJ5Q$default(rowColumnMeasurePolicy0, 0, (integer0 == null ? 0 : ((int)integer0)), (v2 == 0x7FFFFFFF ? 0x7FFFFFFF : c.coerceAtLeast(v18, 0)), (integer0 == null ? v3 : ((int)integer0)), false, 16, null));
                }
                else {
                    v19 = v12;
                    v20 = v13;
                    v16 = v9;
                    v21 = v18;
                    v17 = v10;
                    arr_v3 = arr_v1;
                    v22 = v15;
                    f2 = f;
                }
                int v23 = rowColumnMeasurePolicy0.mainAxisSize(placeable0);
                int v24 = rowColumnMeasurePolicy0.crossAxisSize(placeable0);
                arr_v2 = arr_v3;
                arr_v2[v16 - v5] = v23;
                int v25 = Math.min(v4, c.coerceAtLeast(v21 - v23, 0));
                v12 = v23 + v25 + v19;
                arr_placeable[v16] = placeable0;
                v15 = Math.max(v22, v24);
                v11 = v25;
                v13 = v20;
            }
            v9 = v16 + 1;
            arr_v1 = arr_v2;
            f = f2;
            v14 = v15;
            v10 = v17;
        }
        int v26 = v12;
        int v27 = v13;
        if(v27 == 0) {
            v28 = v26 - v11;
            arr_v4 = arr_v1;
            v29 = 0;
            v30 = v14;
        }
        else {
            int v31 = v2 == 0x7FFFFFFF ? v : v2;
            arr_v4 = arr_v1;
            long v32 = v10 * ((long)(v27 - 1));
            long v33 = c.coerceAtLeast(((long)(v31 - v26)) - v32, 0L);
            float f3 = ((float)v33) / f;
            int v34 = v5;
            long v35 = v33;
            while(v34 < v6) {
                v35 -= (long)Math.round(f3 * RowColumnImplKt.getWeight(RowColumnImplKt.getRowColumnParentData(((Measurable)list0.get(v34)))));
                ++v34;
            }
            float f4 = f;
            long v36 = v33;
            long v37 = v32;
            long v38 = v10;
            int v39 = v14;
            int v40 = 0;
            int v41 = v5;
            while(v41 < v6) {
                if(arr_placeable[v41] == null) {
                    Object object0 = list0.get(v41);
                    RowColumnParentData rowColumnParentData1 = RowColumnImplKt.getRowColumnParentData(((Measurable)object0));
                    float f5 = RowColumnImplKt.getWeight(rowColumnParentData1);
                    if(v3 == 0x7FFFFFFF || rowColumnParentData1 == null) {
                        integer1 = null;
                    }
                    else {
                        FlowLayoutData flowLayoutData1 = rowColumnParentData1.getFlowLayoutData();
                        if(flowLayoutData1 != null) {
                            integer1 = Math.round(flowLayoutData1.getFillCrossAxisFraction() * ((float)v3));
                        }
                    }
                    if(f5 <= 0.0f) {
                        throw new IllegalStateException("All weights <= 0 should have placeables");
                    }
                    try {
                        v42 = zd.c.getSign(v35);
                        v35 -= (long)v42;
                        f6 = f3 * f5;
                        v43 = Math.max(0, Math.round(f6) + v42);
                        v44 = !RowColumnImplKt.getFill(rowColumnParentData1) || v43 == 0x7FFFFFFF ? 0 : v43;
                        v45 = integer1 == null ? 0 : ((int)integer1);
                        v46 = integer1 == null ? v3 : ((int)integer1);
                    }
                    catch(IllegalArgumentException illegalArgumentException0) {
                        v47 = v42;
                        integer2 = integer1;
                        v48 = v43;
                        f7 = f6;
                        f8 = f5;
                        v49 = v37;
                        v50 = v26;
                        v51 = v27;
                        f9 = f3;
                        v52 = v38;
                        goto label_139;
                    }
                    try {
                        f9 = f3;
                        v47 = v42;
                        v49 = v37;
                        integer2 = integer1;
                        v48 = v43;
                        v51 = v27;
                        f7 = f6;
                        v50 = v26;
                        f8 = f5;
                        v52 = v38;
                        v53 = rowColumnMeasurePolicy0.createConstraints-xF2OJ5Q(v44, v45, v43, v46, true);
                        goto label_166;
                    }
                    catch(IllegalArgumentException illegalArgumentException0) {
                    }
                label_139:
                    StringBuilder stringBuilder0 = q.u("This log indicates a hard-to-reproduce Compose issue, modified with additional debugging details. Please help us by adding your experiences to the bug link provided. Thank you for helping us improve Compose. https://issuetracker.google.com/issues/300280216 mainAxisMax ", v2, "mainAxisMin ", v, "targetSpace ");
                    stringBuilder0.append(v31);
                    stringBuilder0.append("arrangementSpacingPx ");
                    stringBuilder0.append(v52);
                    stringBuilder0.append("weightChildrenCount ");
                    stringBuilder0.append(v51);
                    stringBuilder0.append("fixedSpace ");
                    stringBuilder0.append(v50);
                    stringBuilder0.append("arrangementSpacingTotal ");
                    stringBuilder0.append(v49);
                    stringBuilder0.append("remainingToTarget ");
                    stringBuilder0.append(v36);
                    stringBuilder0.append("totalWeight ");
                    stringBuilder0.append(f4);
                    stringBuilder0.append("weightUnitSpace ");
                    stringBuilder0.append(f9);
                    stringBuilder0.append("weight ");
                    stringBuilder0.append(f8);
                    stringBuilder0.append("weightedSize ");
                    stringBuilder0.append(f7);
                    stringBuilder0.append("crossAxisDesiredSize ");
                    stringBuilder0.append(integer2);
                    stringBuilder0.append("remainderUnit ");
                    stringBuilder0.append(v47);
                    stringBuilder0.append("childMainAxisSize ");
                    stringBuilder0.append(v48);
                    throw new IllegalArgumentException(stringBuilder0.toString()).initCause(illegalArgumentException0);
                label_166:
                    Placeable placeable1 = ((Measurable)object0).measure-BRTryo0(v53);
                    int v54 = rowColumnMeasurePolicy0.mainAxisSize(placeable1);
                    int v55 = rowColumnMeasurePolicy0.crossAxisSize(placeable1);
                    arr_v4[v41 - v5] = v54;
                    v40 += v54;
                    arr_placeable[v41] = placeable1;
                    v39 = Math.max(v39, v55);
                    f10 = f4;
                    v56 = v36;
                    f11 = f9;
                    v37 = v49;
                    v57 = v51;
                }
                else {
                    f11 = f3;
                    f10 = f4;
                    v56 = v36;
                    v50 = v26;
                    v57 = v27;
                    v52 = v38;
                }
                ++v41;
                f4 = f10;
                v27 = v57;
                v26 = v50;
                f3 = f11;
                v36 = v56;
                v38 = v52;
            }
            v28 = v26;
            v29 = c.coerceIn(((int)(((long)v40) + v37)), 0, v2 - v28);
            v30 = v39;
        }
        if(z) {
            int v58 = v5;
            int v59 = 0;
            v60 = 0;
            while(v58 < v6) {
                Placeable placeable2 = arr_placeable[v58];
                Intrinsics.checkNotNull(placeable2);
                CrossAxisAlignment crossAxisAlignment0 = RowColumnImplKt.getCrossAxisAlignment(RowColumnImplKt.getRowColumnParentData(placeable2));
                Integer integer3 = crossAxisAlignment0 == null ? null : crossAxisAlignment0.calculateAlignmentLinePosition$foundation_layout_release(placeable2);
                if(integer3 != null) {
                    int v61 = integer3.intValue();
                    int v62 = rowColumnMeasurePolicy0.crossAxisSize(placeable2);
                    v59 = Math.max(v59, (v61 == 0x80000000 ? 0 : ((int)integer3)));
                    if(v61 == 0x80000000) {
                        v61 = v62;
                    }
                    v60 = Math.max(v60, v62 - v61);
                }
                ++v58;
            }
            v63 = v59;
        }
        else {
            v60 = 0;
            v63 = 0;
        }
        int v64 = Math.max(c.coerceAtLeast(v28 + v29, 0), v);
        int v65 = Math.max(v30, Math.max(v1, v60 + v63));
        int[] arr_v5 = new int[v8];
        for(int v66 = 0; v66 < v8; ++v66) {
            arr_v5[v66] = 0;
        }
        rowColumnMeasurePolicy0.populateMainAxisPositions(v64, arr_v4, arr_v5, measureScope0);
        return rowColumnMeasurePolicy0.placeHelper(arr_placeable, measureScope0, v63, arr_v5, v64, v65, arr_v, v7, v5, v6);
    }

    public static MeasureResult measure$default(RowColumnMeasurePolicy rowColumnMeasurePolicy0, int v, int v1, int v2, int v3, int v4, MeasureScope measureScope0, List list0, Placeable[] arr_placeable, int v5, int v6, int[] arr_v, int v7, int v8, Object object0) {
        int[] arr_v1 = (v8 & 0x400) == 0 ? arr_v : null;
        return (v8 & 0x800) == 0 ? RowColumnMeasurePolicyKt.measure(rowColumnMeasurePolicy0, v, v1, v2, v3, v4, measureScope0, list0, arr_placeable, v5, v6, arr_v1, v7) : RowColumnMeasurePolicyKt.measure(rowColumnMeasurePolicy0, v, v1, v2, v3, v4, measureScope0, list0, arr_placeable, v5, v6, arr_v1, 0);
    }
}

