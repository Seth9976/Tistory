package androidx.compose.animation.core;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.collection.MutableVector;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.FloatRef;
import kotlinx.coroutines.CoroutineScope;

public final class a extends Lambda implements Function1 {
    public final MutableState w;
    public final InfiniteTransition x;
    public final FloatRef y;
    public final CoroutineScope z;

    public a(MutableState mutableState0, InfiniteTransition infiniteTransition0, FloatRef ref$FloatRef0, CoroutineScope coroutineScope0) {
        this.w = mutableState0;
        this.x = infiniteTransition0;
        this.y = ref$FloatRef0;
        this.z = coroutineScope0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        long v = ((Number)object0).longValue();
        State state0 = (State)this.w.getValue();
        long v1 = state0 == null ? v : ((Number)state0.getValue()).longValue();
        InfiniteTransition infiniteTransition0 = this.x;
        int v2 = 0;
        CoroutineScope coroutineScope0 = this.z;
        FloatRef ref$FloatRef0 = this.y;
        if(Long.compare(infiniteTransition0.d, 0x8000000000000000L) == 0 || ref$FloatRef0.element != SuspendAnimationKt.getDurationScale(coroutineScope0.getCoroutineContext())) {
            infiniteTransition0.d = v;
            MutableVector mutableVector0 = infiniteTransition0.b;
            int v3 = mutableVector0.getSize();
            if(v3 > 0) {
                Object[] arr_object = mutableVector0.getContent();
                int v4 = 0;
                while(true) {
                    ((TransitionAnimationState)arr_object[v4]).reset$animation_core_release();
                    ++v4;
                    if(v4 >= v3) {
                        break;
                    }
                }
            }
            ref$FloatRef0.element = SuspendAnimationKt.getDurationScale(coroutineScope0.getCoroutineContext());
        }
        if(ref$FloatRef0.element == 0.0f) {
            MutableVector mutableVector1 = infiniteTransition0.b;
            int v5 = mutableVector1.getSize();
            if(v5 > 0) {
                Object[] arr_object1 = mutableVector1.getContent();
                do {
                    ((TransitionAnimationState)arr_object1[v2]).skipToEnd$animation_core_release();
                    ++v2;
                }
                while(v2 < v5);
                return Unit.INSTANCE;
            }
        }
        else {
            InfiniteTransition.access$onFrame(infiniteTransition0, ((long)(((float)(v1 - infiniteTransition0.d)) / ref$FloatRef0.element)));
        }
        return Unit.INSTANCE;
    }
}

