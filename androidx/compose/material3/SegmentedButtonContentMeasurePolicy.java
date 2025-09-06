package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.MultiContentMeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J2\u0010\u000F\u001A\u00020\f*\u00020\u00062\u0012\u0010\t\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00072\u0006\u0010\u000B\u001A\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000ER\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001A\u0004\b\u0012\u0010\u0013R0\u0010\u001D\u001A\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00148\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001A\u0004\b\u0019\u0010\u001A\"\u0004\b\u001B\u0010\u001C\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u001E"}, d2 = {"Landroidx/compose/material3/SegmentedButtonContentMeasurePolicy;", "Landroidx/compose/ui/layout/MultiContentMeasurePolicy;", "Lkotlinx/coroutines/CoroutineScope;", "scope", "<init>", "(Lkotlinx/coroutines/CoroutineScope;)V", "Landroidx/compose/ui/layout/MeasureScope;", "", "Landroidx/compose/ui/layout/Measurable;", "measurables", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "a", "Lkotlinx/coroutines/CoroutineScope;", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", "Landroidx/compose/animation/core/Animatable;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "b", "Landroidx/compose/animation/core/Animatable;", "getAnimatable", "()Landroidx/compose/animation/core/Animatable;", "setAnimatable", "(Landroidx/compose/animation/core/Animatable;)V", "animatable", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSegmentedButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SegmentedButton.kt\nandroidx/compose/material3/SegmentedButtonContentMeasurePolicy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,774:1\n151#2,3:775\n33#2,4:778\n154#2,2:782\n38#2:784\n156#2:785\n171#2,13:786\n151#2,3:799\n33#2,4:802\n154#2,2:806\n38#2:808\n156#2:809\n171#2,13:810\n171#2,13:823\n1#3:836\n*S KotlinDebug\n*F\n+ 1 SegmentedButton.kt\nandroidx/compose/material3/SegmentedButtonContentMeasurePolicy\n*L\n354#1:775,3\n354#1:778,4\n354#1:782,2\n354#1:784\n354#1:785\n355#1:786,13\n356#1:799,3\n356#1:802,4\n356#1:806,2\n356#1:808\n356#1:809\n357#1:810,13\n358#1:823,13\n*E\n"})
public final class SegmentedButtonContentMeasurePolicy implements MultiContentMeasurePolicy {
    public static final int $stable;
    public final CoroutineScope a;
    public Animatable b;
    public Integer c;

    public SegmentedButtonContentMeasurePolicy(@NotNull CoroutineScope coroutineScope0) {
        this.a = coroutineScope0;
    }

    @Nullable
    public final Animatable getAnimatable() {
        return this.b;
    }

    @NotNull
    public final CoroutineScope getScope() {
        return this.a;
    }

    @Override  // androidx.compose.ui.layout.MultiContentMeasurePolicy
    @NotNull
    public MeasureResult measure-3p2s80s(@NotNull MeasureScope measureScope0, @NotNull List list0, long v) {
        int v23;
        Object object4;
        Object object2;
        Object object0;
        List list1 = (List)list0.get(0);
        List list2 = (List)list0.get(1);
        ArrayList arrayList0 = new ArrayList(list1.size());
        int v2 = list1.size();
        for(int v3 = 0; v3 < v2; v3 = a.f(((Measurable)list1.get(v3)), v, arrayList0, v3, 1)) {
        }
        if(arrayList0.isEmpty()) {
            object0 = null;
        }
        else {
            object0 = arrayList0.get(0);
            int v4 = ((Placeable)object0).getWidth();
            int v5 = CollectionsKt__CollectionsKt.getLastIndex(arrayList0);
            if(1 <= v5) {
                for(int v6 = 1; true; ++v6) {
                    Object object1 = arrayList0.get(v6);
                    int v7 = ((Placeable)object1).getWidth();
                    if(v4 < v7) {
                        object0 = object1;
                        v4 = v7;
                    }
                    if(v6 == v5) {
                        break;
                    }
                }
            }
        }
        int v8 = ((Placeable)object0) == null ? 0 : ((Placeable)object0).getWidth();
        ArrayList arrayList1 = new ArrayList(list2.size());
        int v9 = list2.size();
        for(int v10 = 0; v10 < v9; v10 = a.f(((Measurable)list2.get(v10)), v, arrayList1, v10, 1)) {
        }
        if(arrayList1.isEmpty()) {
            object2 = null;
        }
        else {
            object2 = arrayList1.get(0);
            int v11 = ((Placeable)object2).getWidth();
            int v12 = CollectionsKt__CollectionsKt.getLastIndex(arrayList1);
            if(1 <= v12) {
                for(int v13 = 1; true; ++v13) {
                    Object object3 = arrayList1.get(v13);
                    int v14 = ((Placeable)object3).getWidth();
                    if(v11 < v14) {
                        object2 = object3;
                        v11 = v14;
                    }
                    if(v13 == v12) {
                        break;
                    }
                }
            }
        }
        Integer integer0 = ((Placeable)object2) == null ? null : ((Placeable)object2).getWidth();
        if(arrayList1.isEmpty()) {
            object4 = null;
        }
        else {
            object4 = arrayList1.get(0);
            int v15 = ((Placeable)object4).getHeight();
            int v16 = CollectionsKt__CollectionsKt.getLastIndex(arrayList1);
            if(1 <= v16) {
                for(int v1 = 1; true; ++v1) {
                    Object object5 = arrayList1.get(v1);
                    int v17 = ((Placeable)object5).getHeight();
                    if(v15 < v17) {
                        object4 = object5;
                        v15 = v17;
                    }
                    if(v1 == v16) {
                        break;
                    }
                }
            }
        }
        int v18 = ((Placeable)object4) == null ? 0 : ((Placeable)object4).getHeight();
        int v19 = Math.max(measureScope0.roundToPx-0680j_4(0.0f), v8);
        int v20 = measureScope0.roundToPx-0680j_4(8.0f);
        int v21 = integer0 == null ? 0 : ((int)integer0);
        if(v8 == 0) {
            int v22 = measureScope0.roundToPx-0680j_4(0.0f);
            v23 = -(measureScope0.roundToPx-0680j_4(8.0f) + v22) / 2;
        }
        else {
            v23 = 0;
        }
        Integer integer1 = this.c;
        if(integer1 == null) {
            this.c = v23;
            return MeasureScope.layout$default(measureScope0, v20 + v19 + v21, v18, null, new tj(arrayList0, measureScope0, this, v23, arrayList1, v18), 4, null);
        }
        Animatable animatable0 = this.b;
        if(animatable0 == null) {
            Intrinsics.checkNotNull(integer1);
            animatable0 = new Animatable(integer1, VectorConvertersKt.getVectorConverter(IntCompanionObject.INSTANCE), null, null, 12, null);
            this.b = animatable0;
        }
        if(((Number)animatable0.getTargetValue()).intValue() != v23) {
            sj sj0 = new sj(animatable0, v23, null);
            BuildersKt.launch$default(this.a, null, null, sj0, 3, null);
        }
        return MeasureScope.layout$default(measureScope0, v20 + v19 + v21, v18, null, new tj(arrayList0, measureScope0, this, v23, arrayList1, v18), 4, null);
    }

    public final void setAnimatable(@Nullable Animatable animatable0) {
        this.b = animatable0;
    }
}

