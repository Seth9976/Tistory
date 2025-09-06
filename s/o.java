package s;

import androidx.compose.animation.AnimatedVisibilityScopeImpl;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import r0.a;

public final class o implements MeasurePolicy {
    public final AnimatedVisibilityScopeImpl a;
    public boolean b;

    public o(AnimatedVisibilityScopeImpl animatedVisibilityScopeImpl0) {
        this.a = animatedVisibilityScopeImpl0;
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
        Object object1;
        Object object0;
        ArrayList arrayList0 = new ArrayList(list0.size());
        int v1 = list0.size();
        int v2 = 0;
        for(int v3 = 0; true; v3 = a.f(((Measurable)list0.get(v3)), v, arrayList0, v3, 1)) {
            object0 = null;
            if(v3 >= v1) {
                break;
            }
        }
        if(arrayList0.isEmpty()) {
            object1 = null;
        }
        else {
            object1 = arrayList0.get(0);
            int v4 = ((Placeable)object1).getWidth();
            int v5 = CollectionsKt__CollectionsKt.getLastIndex(arrayList0);
            if(1 <= v5) {
                for(int v6 = 1; true; ++v6) {
                    Object object2 = arrayList0.get(v6);
                    int v7 = ((Placeable)object2).getWidth();
                    if(v4 < v7) {
                        object1 = object2;
                        v4 = v7;
                    }
                    if(v6 == v5) {
                        break;
                    }
                }
            }
        }
        int v8 = ((Placeable)object1) == null ? 0 : ((Placeable)object1).getWidth();
        if(!arrayList0.isEmpty()) {
            Object object3 = arrayList0.get(0);
            int v9 = ((Placeable)object3).getHeight();
            int v10 = CollectionsKt__CollectionsKt.getLastIndex(arrayList0);
            if(1 <= v10) {
                for(int v11 = 1; true; ++v11) {
                    Object object4 = arrayList0.get(v11);
                    int v12 = ((Placeable)object4).getHeight();
                    if(v9 < v12) {
                        object3 = object4;
                        v9 = v12;
                    }
                    if(v11 == v10) {
                        break;
                    }
                }
            }
            object0 = object3;
        }
        if(((Placeable)object0) != null) {
            v2 = ((Placeable)object0).getHeight();
        }
        AnimatedVisibilityScopeImpl animatedVisibilityScopeImpl0 = this.a;
        if(measureScope0.isLookingAhead()) {
            this.b = true;
            animatedVisibilityScopeImpl0.getTargetSize$animation_release().setValue(IntSize.box-impl(IntSizeKt.IntSize(v8, v2)));
            return MeasureScope.layout$default(measureScope0, v8, v2, null, new n(arrayList0), 4, null);
        }
        if(!this.b) {
            animatedVisibilityScopeImpl0.getTargetSize$animation_release().setValue(IntSize.box-impl(IntSizeKt.IntSize(v8, v2)));
        }
        return MeasureScope.layout$default(measureScope0, v8, v2, null, new n(arrayList0), 4, null);
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

