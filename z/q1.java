package z;

import androidx.collection.MutableObjectFloatMap;
import androidx.compose.foundation.gestures.AnchoredDraggableKt;
import androidx.compose.foundation.gestures.DraggableAnchors;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class q1 implements DraggableAnchors {
    public final MutableObjectFloatMap a;

    public q1(MutableObjectFloatMap mutableObjectFloatMap0) {
        this.a = mutableObjectFloatMap0;
    }

    @Override  // androidx.compose.foundation.gestures.DraggableAnchors
    public final Object closestAnchor(float f) {
        Object[] arr_object = this.a.keys;
        float[] arr_f = this.a.values;
        long[] arr_v = this.a.metadata;
        int v = arr_v.length - 2;
        Object object0 = null;
        if(v >= 0) {
            float f1 = Infinityf;
            int v1 = 0;
            while(true) {
                long v2 = arr_v[v1];
                if((~v2 << 7 & v2 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v3 = 8 - (~(v1 - v) >>> 0x1F);
                    for(int v4 = 0; v4 < v3; ++v4) {
                        if((0xFFL & v2) < 0x80L) {
                            int v5 = (v1 << 3) + v4;
                            Object object1 = arr_object[v5];
                            float f2 = Math.abs(f - arr_f[v5]);
                            if(f2 <= f1) {
                                f1 = f2;
                                object0 = object1;
                            }
                        }
                        v2 >>= 8;
                    }
                    if(v3 == 8) {
                        goto label_24;
                    }
                    break;
                }
            label_24:
                if(v1 == v) {
                    break;
                }
                ++v1;
            }
        }
        return object0;
    }

    @Override  // androidx.compose.foundation.gestures.DraggableAnchors
    public final Object closestAnchor(float f, boolean z) {
        Object[] arr_object = this.a.keys;
        float[] arr_f = this.a.values;
        long[] arr_v = this.a.metadata;
        int v = arr_v.length - 2;
        Object object0 = null;
        if(v >= 0) {
            float f1 = Infinityf;
            int v1 = 0;
            while(true) {
                long v2 = arr_v[v1];
                if((~v2 << 7 & v2 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v3 = 8 - (~(v1 - v) >>> 0x1F);
                    for(int v4 = 0; v4 < v3; ++v4) {
                        if((0xFFL & v2) < 0x80L) {
                            int v5 = (v1 << 3) + v4;
                            Object object1 = arr_object[v5];
                            float f2 = arr_f[v5];
                            float f3 = z ? f2 - f : f - f2;
                            if(f3 < 0.0f) {
                                f3 = Infinityf;
                            }
                            if(f3 <= f1) {
                                f1 = f3;
                                object0 = object1;
                            }
                        }
                        v2 >>= 8;
                    }
                    if(v3 == 8) {
                        goto label_27;
                    }
                    break;
                }
            label_27:
                if(v1 == v) {
                    break;
                }
                ++v1;
            }
        }
        return object0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof q1 ? Intrinsics.areEqual(this.a, ((q1)object0).a) : false;
    }

    @Override  // androidx.compose.foundation.gestures.DraggableAnchors
    public final void forEach(Function2 function20) {
        Object[] arr_object = this.a.keys;
        float[] arr_f = this.a.values;
        long[] arr_v = this.a.metadata;
        int v = arr_v.length - 2;
        if(v >= 0) {
            int v1 = 0;
            while(true) {
                long v2 = arr_v[v1];
                if((~v2 << 7 & v2 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v3 = 8 - (~(v1 - v) >>> 0x1F);
                    for(int v4 = 0; v4 < v3; ++v4) {
                        if((0xFFL & v2) < 0x80L) {
                            int v5 = (v1 << 3) + v4;
                            function20.invoke(arr_object[v5], ((float)arr_f[v5]));
                        }
                        v2 >>= 8;
                    }
                    if(v3 == 8) {
                        goto label_18;
                    }
                    break;
                }
            label_18:
                if(v1 == v) {
                    break;
                }
                ++v1;
            }
        }
    }

    @Override  // androidx.compose.foundation.gestures.DraggableAnchors
    public final int getSize() {
        return this.a.getSize();
    }

    @Override  // androidx.compose.foundation.gestures.DraggableAnchors
    public final boolean hasAnchorFor(Object object0) {
        return this.a.containsKey(object0);
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() * 0x1F;
    }

    @Override  // androidx.compose.foundation.gestures.DraggableAnchors
    public final float maxAnchor() {
        return AnchoredDraggableKt.access$maxValueOrNaN(this.a);
    }

    @Override  // androidx.compose.foundation.gestures.DraggableAnchors
    public final float minAnchor() {
        return AnchoredDraggableKt.access$minValueOrNaN(this.a);
    }

    @Override  // androidx.compose.foundation.gestures.DraggableAnchors
    public final float positionOf(Object object0) {
        return this.a.getOrDefault(object0, NaNf);
    }

    @Override
    public final String toString() {
        return "MapDraggableAnchors(" + this.a + ')';
    }
}

