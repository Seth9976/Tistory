package androidx.compose.animation;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.IntIterator;
import r0.a;
import s.h;

public final class b implements MeasurePolicy {
    public final AnimatedContentTransitionScopeImpl a;

    public b(AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl0) {
        this.a = animatedContentTransitionScopeImpl0;
    }

    @Override  // androidx.compose.ui.layout.MeasurePolicy
    public final int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope0, List list0, int v) {
        if(list0.isEmpty()) {
            throw new NullPointerException();
        }
        Integer integer0 = ((IntrinsicMeasurable)list0.get(0)).maxIntrinsicHeight(v);
        int v1 = CollectionsKt__CollectionsKt.getLastIndex(list0);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                Integer integer1 = ((IntrinsicMeasurable)list0.get(v2)).maxIntrinsicHeight(v);
                if(integer1.compareTo(integer0) > 0) {
                    integer0 = integer1;
                }
                if(v2 == v1) {
                    break;
                }
            }
        }
        return integer0 == null ? 0 : ((int)integer0);
    }

    @Override  // androidx.compose.ui.layout.MeasurePolicy
    public final int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope0, List list0, int v) {
        if(list0.isEmpty()) {
            throw new NullPointerException();
        }
        Integer integer0 = ((IntrinsicMeasurable)list0.get(0)).maxIntrinsicWidth(v);
        int v1 = CollectionsKt__CollectionsKt.getLastIndex(list0);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                Integer integer1 = ((IntrinsicMeasurable)list0.get(v2)).maxIntrinsicWidth(v);
                if(integer1.compareTo(integer0) > 0) {
                    integer0 = integer1;
                }
                if(v2 == v1) {
                    break;
                }
            }
        }
        return integer0 == null ? 0 : ((int)integer0);
    }

    @Override  // androidx.compose.ui.layout.MeasurePolicy
    public final MeasureResult measure-3p2s80s(MeasureScope measureScope0, List list0, long v) {
        Placeable placeable1;
        int v8;
        ChildData animatedContentTransitionScopeImpl$ChildData0;
        int v1 = list0.size();
        Placeable[] arr_placeable = new Placeable[v1];
        long v2 = 0L;
        int v3 = list0.size();
        int v4 = 0;
        for(int v5 = 0; true; ++v5) {
            animatedContentTransitionScopeImpl$ChildData0 = null;
            if(v5 >= v3) {
                break;
            }
            Measurable measurable0 = (Measurable)list0.get(v5);
            Object object0 = measurable0.getParentData();
            if(object0 instanceof ChildData) {
                animatedContentTransitionScopeImpl$ChildData0 = (ChildData)object0;
            }
            if(animatedContentTransitionScopeImpl$ChildData0 != null && animatedContentTransitionScopeImpl$ChildData0.isTarget()) {
                Placeable placeable0 = measurable0.measure-BRTryo0(v);
                arr_placeable[v5] = placeable0;
                v2 = IntSizeKt.IntSize(placeable0.getWidth(), placeable0.getHeight());
            }
        }
        int v6 = list0.size();
        for(int v7 = 0; v7 < v6; ++v7) {
            Measurable measurable1 = (Measurable)list0.get(v7);
            if(arr_placeable[v7] == null) {
                arr_placeable[v7] = measurable1.measure-BRTryo0(v);
            }
        }
        if(measureScope0.isLookingAhead()) {
            v8 = IntSize.getWidth-impl(v2);
        }
        else {
            if(v1 == 0) {
                placeable1 = null;
            }
            else {
                placeable1 = arr_placeable[0];
                int v9 = ArraysKt___ArraysKt.getLastIndex(arr_placeable);
                if(v9 != 0) {
                    int v10 = placeable1 == null ? 0 : placeable1.getWidth();
                    IntIterator intIterator0 = a.t(1, v9);
                    while(intIterator0.hasNext()) {
                        Placeable placeable2 = arr_placeable[intIterator0.nextInt()];
                        int v11 = placeable2 == null ? 0 : placeable2.getWidth();
                        if(v10 < v11) {
                            placeable1 = placeable2;
                            v10 = v11;
                        }
                    }
                }
            }
            v8 = placeable1 == null ? 0 : placeable1.getWidth();
        }
        if(measureScope0.isLookingAhead()) {
            v4 = IntSize.getHeight-impl(v2);
        }
        else {
            if(v1 != 0) {
                animatedContentTransitionScopeImpl$ChildData0 = arr_placeable[0];
                int v12 = ArraysKt___ArraysKt.getLastIndex(arr_placeable);
                if(v12 != 0) {
                    int v13 = animatedContentTransitionScopeImpl$ChildData0 == null ? 0 : ((Placeable)animatedContentTransitionScopeImpl$ChildData0).getHeight();
                    IntIterator intIterator1 = a.t(1, v12);
                    while(intIterator1.hasNext()) {
                        Placeable placeable3 = arr_placeable[intIterator1.nextInt()];
                        int v14 = placeable3 == null ? 0 : placeable3.getHeight();
                        if(v13 < v14) {
                            animatedContentTransitionScopeImpl$ChildData0 = placeable3;
                            v13 = v14;
                        }
                    }
                }
            }
            if(animatedContentTransitionScopeImpl$ChildData0 != null) {
                v4 = ((Placeable)animatedContentTransitionScopeImpl$ChildData0).getHeight();
            }
        }
        if(!measureScope0.isLookingAhead()) {
            this.a.setMeasuredSize-ozmzZPI$animation_release(IntSizeKt.IntSize(v8, v4));
        }
        return MeasureScope.layout$default(measureScope0, v8, v4, null, new h(arr_placeable, this, v8, v4), 4, null);
    }

    @Override  // androidx.compose.ui.layout.MeasurePolicy
    public final int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope0, List list0, int v) {
        if(list0.isEmpty()) {
            throw new NullPointerException();
        }
        Integer integer0 = ((IntrinsicMeasurable)list0.get(0)).minIntrinsicHeight(v);
        int v1 = CollectionsKt__CollectionsKt.getLastIndex(list0);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                Integer integer1 = ((IntrinsicMeasurable)list0.get(v2)).minIntrinsicHeight(v);
                if(integer1.compareTo(integer0) > 0) {
                    integer0 = integer1;
                }
                if(v2 == v1) {
                    break;
                }
            }
        }
        return integer0 == null ? 0 : ((int)integer0);
    }

    @Override  // androidx.compose.ui.layout.MeasurePolicy
    public final int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope0, List list0, int v) {
        if(list0.isEmpty()) {
            throw new NullPointerException();
        }
        Integer integer0 = ((IntrinsicMeasurable)list0.get(0)).minIntrinsicWidth(v);
        int v1 = CollectionsKt__CollectionsKt.getLastIndex(list0);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                Integer integer1 = ((IntrinsicMeasurable)list0.get(v2)).minIntrinsicWidth(v);
                if(integer1.compareTo(integer0) > 0) {
                    integer0 = integer1;
                }
                if(v2 == v1) {
                    break;
                }
            }
        }
        return integer0 == null ? 0 : ((int)integer0);
    }
}

