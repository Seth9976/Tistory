package androidx.compose.animation.core;

import androidx.collection.MutableObjectList;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;
import zd.c;

public final class d extends Lambda implements Function1 {
    public final SeekableTransitionState w;

    public d(SeekableTransitionState seekableTransitionState0) {
        this.w = seekableTransitionState0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        long v = ((Number)object0).longValue();
        SeekableTransitionState seekableTransitionState0 = this.w;
        seekableTransitionState0.l = v;
        long v1 = c.roundToLong(((double)(v - seekableTransitionState0.l)) / ((double)seekableTransitionState0.p));
        if(seekableTransitionState0.m.isNotEmpty()) {
            MutableObjectList mutableObjectList0 = seekableTransitionState0.m;
            Object[] arr_object = mutableObjectList0.content;
            int v2 = mutableObjectList0._size;
            int v3 = 0;
            for(int v4 = 0; v4 < v2; ++v4) {
                SeekingAnimationState seekableTransitionState$SeekingAnimationState0 = (SeekingAnimationState)arr_object[v4];
                SeekableTransitionState.access$recalculateAnimationValue(seekableTransitionState0, seekableTransitionState$SeekingAnimationState0, v1);
                seekableTransitionState$SeekingAnimationState0.setComplete(true);
            }
            Transition transition0 = seekableTransitionState0.e;
            if(transition0 != null) {
                transition0.updateInitialValues$animation_core_release();
            }
            MutableObjectList mutableObjectList1 = seekableTransitionState0.m;
            int v5 = mutableObjectList1._size;
            Object[] arr_object1 = mutableObjectList1.content;
            IntRange intRange0 = kotlin.ranges.c.until(0, v5);
            int v6 = intRange0.getFirst();
            int v7 = intRange0.getLast();
            if(v6 <= v7) {
                while(true) {
                    arr_object1[v6 - v3] = arr_object1[v6];
                    if(((SeekingAnimationState)arr_object1[v6]).isComplete()) {
                        ++v3;
                    }
                    if(v6 == v7) {
                        break;
                    }
                    ++v6;
                }
            }
            ArraysKt___ArraysJvmKt.fill(arr_object1, null, v5 - v3, v5);
            mutableObjectList1._size -= v3;
        }
        SeekingAnimationState seekableTransitionState$SeekingAnimationState1 = seekableTransitionState0.n;
        if(seekableTransitionState$SeekingAnimationState1 != null) {
            seekableTransitionState$SeekingAnimationState1.setDurationNanos(seekableTransitionState0.getTotalDurationNanos$animation_core_release());
            SeekableTransitionState.access$recalculateAnimationValue(seekableTransitionState0, seekableTransitionState$SeekingAnimationState1, v1);
            SeekableTransitionState.access$setFraction(seekableTransitionState0, seekableTransitionState$SeekingAnimationState1.getValue());
            if(seekableTransitionState$SeekingAnimationState1.getValue() == 1.0f) {
                seekableTransitionState0.n = null;
            }
            seekableTransitionState0.c();
        }
        return Unit.INSTANCE;
    }
}

