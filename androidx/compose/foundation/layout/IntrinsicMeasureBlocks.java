package androidx.compose.foundation.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\bÀ\u0002\u0018\u00002\u00020\u0001J+\u0010\b\u001A\u00020\u00052\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001A\u00020\u00052\u0006\u0010\u0007\u001A\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ+\u0010\n\u001A\u00020\u00052\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001A\u00020\u00052\u0006\u0010\u0007\u001A\u00020\u0005¢\u0006\u0004\b\n\u0010\tJ+\u0010\f\u001A\u00020\u00052\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u000B\u001A\u00020\u00052\u0006\u0010\u0007\u001A\u00020\u0005¢\u0006\u0004\b\f\u0010\tJ+\u0010\r\u001A\u00020\u00052\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u000B\u001A\u00020\u00052\u0006\u0010\u0007\u001A\u00020\u0005¢\u0006\u0004\b\r\u0010\tJ+\u0010\u000E\u001A\u00020\u00052\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001A\u00020\u00052\u0006\u0010\u0007\u001A\u00020\u0005¢\u0006\u0004\b\u000E\u0010\tJ+\u0010\u000F\u001A\u00020\u00052\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001A\u00020\u00052\u0006\u0010\u0007\u001A\u00020\u0005¢\u0006\u0004\b\u000F\u0010\tJ+\u0010\u0010\u001A\u00020\u00052\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u000B\u001A\u00020\u00052\u0006\u0010\u0007\u001A\u00020\u0005¢\u0006\u0004\b\u0010\u0010\tJ+\u0010\u0011\u001A\u00020\u00052\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u000B\u001A\u00020\u00052\u0006\u0010\u0007\u001A\u00020\u0005¢\u0006\u0004\b\u0011\u0010\t¨\u0006\u0012"}, d2 = {"Landroidx/compose/foundation/layout/IntrinsicMeasureBlocks;", "", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "measurables", "", "availableHeight", "mainAxisSpacing", "HorizontalMinWidth", "(Ljava/util/List;II)I", "VerticalMinWidth", "availableWidth", "HorizontalMinHeight", "VerticalMinHeight", "HorizontalMaxWidth", "VerticalMaxWidth", "HorizontalMaxHeight", "VerticalMaxHeight", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nRowColumnImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RowColumnImpl.kt\nandroidx/compose/foundation/layout/IntrinsicMeasureBlocks\n+ 2 RowColumnImpl.kt\nandroidx/compose/foundation/layout/RowColumnImplKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,722:1\n427#2,5:723\n432#2,7:732\n440#2:740\n441#2,2:742\n452#2,5:744\n457#2,17:753\n476#2,6:771\n484#2,17:778\n452#2,5:795\n457#2,17:804\n476#2,6:822\n484#2,17:829\n427#2,5:846\n432#2,7:855\n440#2:863\n441#2,2:865\n427#2,5:867\n432#2,7:876\n440#2:884\n441#2,2:886\n452#2,5:888\n457#2,17:897\n476#2,6:915\n484#2,17:922\n452#2,5:939\n457#2,17:948\n476#2,6:966\n484#2,17:973\n427#2,5:990\n432#2,7:999\n440#2:1007\n441#2,2:1009\n33#3,4:728\n38#3:741\n33#3,4:749\n38#3:770\n33#3,4:800\n38#3:821\n33#3,4:851\n38#3:864\n33#3,4:872\n38#3:885\n33#3,4:893\n38#3:914\n33#3,4:944\n38#3:965\n33#3,4:995\n38#3:1008\n26#4:739\n26#4:777\n26#4:828\n26#4:862\n26#4:883\n26#4:921\n26#4:972\n26#4:1006\n*S KotlinDebug\n*F\n+ 1 RowColumnImpl.kt\nandroidx/compose/foundation/layout/IntrinsicMeasureBlocks\n*L\n324#1:723,5\n324#1:732,7\n324#1:740\n324#1:742,2\n336#1:744,5\n336#1:753,17\n336#1:771,6\n336#1:778,17\n349#1:795,5\n349#1:804,17\n349#1:822,6\n349#1:829,17\n362#1:846,5\n362#1:855,7\n362#1:863\n362#1:865,2\n374#1:867,5\n374#1:876,7\n374#1:884\n374#1:886,2\n386#1:888,5\n386#1:897,17\n386#1:915,6\n386#1:922,17\n399#1:939,5\n399#1:948,17\n399#1:966,6\n399#1:973,17\n412#1:990,5\n412#1:999,7\n412#1:1007\n412#1:1009,2\n324#1:728,4\n324#1:741\n336#1:749,4\n336#1:770\n349#1:800,4\n349#1:821\n362#1:851,4\n362#1:864\n374#1:872,4\n374#1:885\n386#1:893,4\n386#1:914\n399#1:944,4\n399#1:965\n412#1:995,4\n412#1:1008\n324#1:739\n336#1:777\n349#1:828\n362#1:862\n374#1:883\n386#1:921\n399#1:972\n412#1:1006\n*E\n"})
public final class IntrinsicMeasureBlocks {
    public static final int $stable;
    @NotNull
    public static final IntrinsicMeasureBlocks INSTANCE;

    static {
        IntrinsicMeasureBlocks.INSTANCE = new IntrinsicMeasureBlocks();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public final int HorizontalMaxHeight(@NotNull List list0, int v, int v1) {
        int v8;
        if(!list0.isEmpty()) {
            int v3 = Math.min((list0.size() - 1) * v1, v);
            int v4 = list0.size();
            int v6 = 0;
            float f = 0.0f;
            for(int v5 = 0; v5 < v4; ++v5) {
                IntrinsicMeasurable intrinsicMeasurable0 = (IntrinsicMeasurable)list0.get(v5);
                float f1 = RowColumnImplKt.getWeight(RowColumnImplKt.getRowColumnParentData(intrinsicMeasurable0));
                if(f1 == 0.0f) {
                    int v7 = Math.min(intrinsicMeasurable0.maxIntrinsicWidth(0x7FFFFFFF), (v == 0x7FFFFFFF ? 0x7FFFFFFF : v - v3));
                    v3 += v7;
                    v6 = Math.max(v6, intrinsicMeasurable0.maxIntrinsicHeight(v7));
                }
                else if(f1 > 0.0f) {
                    f += f1;
                }
            }
            if(f == 0.0f) {
                v8 = 0;
            }
            else {
                v8 = v == 0x7FFFFFFF ? 0x7FFFFFFF : Math.round(((float)Math.max(v - v3, 0)) / f);
            }
            int v9 = list0.size();
            for(int v2 = 0; v2 < v9; ++v2) {
                IntrinsicMeasurable intrinsicMeasurable1 = (IntrinsicMeasurable)list0.get(v2);
                float f2 = RowColumnImplKt.getWeight(RowColumnImplKt.getRowColumnParentData(intrinsicMeasurable1));
                if(f2 > 0.0f) {
                    v6 = Math.max(v6, intrinsicMeasurable1.maxIntrinsicHeight((v8 == 0x7FFFFFFF ? 0x7FFFFFFF : Math.round(((float)v8) * f2))));
                }
            }
            return v6;
        }
        return 0;
    }

    public final int HorizontalMaxWidth(@NotNull List list0, int v, int v1) {
        if(!list0.isEmpty()) {
            int v3 = list0.size();
            int v4 = 0;
            int v5 = 0;
            float f = 0.0f;
            for(int v2 = 0; v2 < v3; ++v2) {
                IntrinsicMeasurable intrinsicMeasurable0 = (IntrinsicMeasurable)list0.get(v2);
                float f1 = RowColumnImplKt.getWeight(RowColumnImplKt.getRowColumnParentData(intrinsicMeasurable0));
                int v6 = intrinsicMeasurable0.maxIntrinsicWidth(v);
                if(f1 == 0.0f) {
                    v5 += v6;
                }
                else if(f1 > 0.0f) {
                    f += f1;
                    v4 = Math.max(v4, Math.round(((float)v6) / f1));
                }
            }
            return (list0.size() - 1) * v1 + (Math.round(((float)v4) * f) + v5);
        }
        return 0;
    }

    public final int HorizontalMinHeight(@NotNull List list0, int v, int v1) {
        int v8;
        if(!list0.isEmpty()) {
            int v3 = Math.min((list0.size() - 1) * v1, v);
            int v4 = list0.size();
            int v6 = 0;
            float f = 0.0f;
            for(int v5 = 0; v5 < v4; ++v5) {
                IntrinsicMeasurable intrinsicMeasurable0 = (IntrinsicMeasurable)list0.get(v5);
                float f1 = RowColumnImplKt.getWeight(RowColumnImplKt.getRowColumnParentData(intrinsicMeasurable0));
                if(f1 == 0.0f) {
                    int v7 = Math.min(intrinsicMeasurable0.maxIntrinsicWidth(0x7FFFFFFF), (v == 0x7FFFFFFF ? 0x7FFFFFFF : v - v3));
                    v3 += v7;
                    v6 = Math.max(v6, intrinsicMeasurable0.minIntrinsicHeight(v7));
                }
                else if(f1 > 0.0f) {
                    f += f1;
                }
            }
            if(f == 0.0f) {
                v8 = 0;
            }
            else {
                v8 = v == 0x7FFFFFFF ? 0x7FFFFFFF : Math.round(((float)Math.max(v - v3, 0)) / f);
            }
            int v9 = list0.size();
            for(int v2 = 0; v2 < v9; ++v2) {
                IntrinsicMeasurable intrinsicMeasurable1 = (IntrinsicMeasurable)list0.get(v2);
                float f2 = RowColumnImplKt.getWeight(RowColumnImplKt.getRowColumnParentData(intrinsicMeasurable1));
                if(f2 > 0.0f) {
                    v6 = Math.max(v6, intrinsicMeasurable1.minIntrinsicHeight((v8 == 0x7FFFFFFF ? 0x7FFFFFFF : Math.round(((float)v8) * f2))));
                }
            }
            return v6;
        }
        return 0;
    }

    public final int HorizontalMinWidth(@NotNull List list0, int v, int v1) {
        if(!list0.isEmpty()) {
            int v3 = list0.size();
            int v4 = 0;
            int v5 = 0;
            float f = 0.0f;
            for(int v2 = 0; v2 < v3; ++v2) {
                IntrinsicMeasurable intrinsicMeasurable0 = (IntrinsicMeasurable)list0.get(v2);
                float f1 = RowColumnImplKt.getWeight(RowColumnImplKt.getRowColumnParentData(intrinsicMeasurable0));
                int v6 = intrinsicMeasurable0.minIntrinsicWidth(v);
                if(f1 == 0.0f) {
                    v5 += v6;
                }
                else if(f1 > 0.0f) {
                    f += f1;
                    v4 = Math.max(v4, Math.round(((float)v6) / f1));
                }
            }
            return (list0.size() - 1) * v1 + (Math.round(((float)v4) * f) + v5);
        }
        return 0;
    }

    public final int VerticalMaxHeight(@NotNull List list0, int v, int v1) {
        if(!list0.isEmpty()) {
            int v3 = list0.size();
            int v4 = 0;
            int v5 = 0;
            float f = 0.0f;
            for(int v2 = 0; v2 < v3; ++v2) {
                IntrinsicMeasurable intrinsicMeasurable0 = (IntrinsicMeasurable)list0.get(v2);
                float f1 = RowColumnImplKt.getWeight(RowColumnImplKt.getRowColumnParentData(intrinsicMeasurable0));
                int v6 = intrinsicMeasurable0.maxIntrinsicHeight(v);
                if(f1 == 0.0f) {
                    v5 += v6;
                }
                else if(f1 > 0.0f) {
                    f += f1;
                    v4 = Math.max(v4, Math.round(((float)v6) / f1));
                }
            }
            return (list0.size() - 1) * v1 + (Math.round(((float)v4) * f) + v5);
        }
        return 0;
    }

    public final int VerticalMaxWidth(@NotNull List list0, int v, int v1) {
        int v8;
        if(!list0.isEmpty()) {
            int v3 = Math.min((list0.size() - 1) * v1, v);
            int v4 = list0.size();
            int v6 = 0;
            float f = 0.0f;
            for(int v5 = 0; v5 < v4; ++v5) {
                IntrinsicMeasurable intrinsicMeasurable0 = (IntrinsicMeasurable)list0.get(v5);
                float f1 = RowColumnImplKt.getWeight(RowColumnImplKt.getRowColumnParentData(intrinsicMeasurable0));
                if(f1 == 0.0f) {
                    int v7 = Math.min(intrinsicMeasurable0.maxIntrinsicHeight(0x7FFFFFFF), (v == 0x7FFFFFFF ? 0x7FFFFFFF : v - v3));
                    v3 += v7;
                    v6 = Math.max(v6, intrinsicMeasurable0.maxIntrinsicWidth(v7));
                }
                else if(f1 > 0.0f) {
                    f += f1;
                }
            }
            if(f == 0.0f) {
                v8 = 0;
            }
            else {
                v8 = v == 0x7FFFFFFF ? 0x7FFFFFFF : Math.round(((float)Math.max(v - v3, 0)) / f);
            }
            int v9 = list0.size();
            for(int v2 = 0; v2 < v9; ++v2) {
                IntrinsicMeasurable intrinsicMeasurable1 = (IntrinsicMeasurable)list0.get(v2);
                float f2 = RowColumnImplKt.getWeight(RowColumnImplKt.getRowColumnParentData(intrinsicMeasurable1));
                if(f2 > 0.0f) {
                    v6 = Math.max(v6, intrinsicMeasurable1.maxIntrinsicWidth((v8 == 0x7FFFFFFF ? 0x7FFFFFFF : Math.round(((float)v8) * f2))));
                }
            }
            return v6;
        }
        return 0;
    }

    public final int VerticalMinHeight(@NotNull List list0, int v, int v1) {
        if(!list0.isEmpty()) {
            int v3 = list0.size();
            int v4 = 0;
            int v5 = 0;
            float f = 0.0f;
            for(int v2 = 0; v2 < v3; ++v2) {
                IntrinsicMeasurable intrinsicMeasurable0 = (IntrinsicMeasurable)list0.get(v2);
                float f1 = RowColumnImplKt.getWeight(RowColumnImplKt.getRowColumnParentData(intrinsicMeasurable0));
                int v6 = intrinsicMeasurable0.minIntrinsicHeight(v);
                if(f1 == 0.0f) {
                    v5 += v6;
                }
                else if(f1 > 0.0f) {
                    f += f1;
                    v4 = Math.max(v4, Math.round(((float)v6) / f1));
                }
            }
            return (list0.size() - 1) * v1 + (Math.round(((float)v4) * f) + v5);
        }
        return 0;
    }

    public final int VerticalMinWidth(@NotNull List list0, int v, int v1) {
        int v8;
        if(!list0.isEmpty()) {
            int v3 = Math.min((list0.size() - 1) * v1, v);
            int v4 = list0.size();
            int v6 = 0;
            float f = 0.0f;
            for(int v5 = 0; v5 < v4; ++v5) {
                IntrinsicMeasurable intrinsicMeasurable0 = (IntrinsicMeasurable)list0.get(v5);
                float f1 = RowColumnImplKt.getWeight(RowColumnImplKt.getRowColumnParentData(intrinsicMeasurable0));
                if(f1 == 0.0f) {
                    int v7 = Math.min(intrinsicMeasurable0.maxIntrinsicHeight(0x7FFFFFFF), (v == 0x7FFFFFFF ? 0x7FFFFFFF : v - v3));
                    v3 += v7;
                    v6 = Math.max(v6, intrinsicMeasurable0.minIntrinsicWidth(v7));
                }
                else if(f1 > 0.0f) {
                    f += f1;
                }
            }
            if(f == 0.0f) {
                v8 = 0;
            }
            else {
                v8 = v == 0x7FFFFFFF ? 0x7FFFFFFF : Math.round(((float)Math.max(v - v3, 0)) / f);
            }
            int v9 = list0.size();
            for(int v2 = 0; v2 < v9; ++v2) {
                IntrinsicMeasurable intrinsicMeasurable1 = (IntrinsicMeasurable)list0.get(v2);
                float f2 = RowColumnImplKt.getWeight(RowColumnImplKt.getRowColumnParentData(intrinsicMeasurable1));
                if(f2 > 0.0f) {
                    v6 = Math.max(v6, intrinsicMeasurable1.minIntrinsicWidth((v8 == 0x7FFFFFFF ? 0x7FFFFFFF : Math.round(((float)v8) * f2))));
                }
            }
            return v6;
        }
        return 0;
    }
}

