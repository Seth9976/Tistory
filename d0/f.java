package d0;

import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope;
import androidx.compose.ui.unit.Density;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref.BooleanRef;
import kotlin.jvm.internal.Ref.FloatRef;
import kotlin.jvm.internal.Ref.IntRef;
import kotlin.jvm.internal.Ref.ObjectRef;
import qd.a;

public final class f extends SuspendLambda implements Function2 {
    public final int A;
    public final int B;
    public BooleanRef o;
    public ObjectRef p;
    public IntRef q;
    public float r;
    public float s;
    public float t;
    public int u;
    public int v;
    public Object w;
    public final int x;
    public final Density y;
    public final LazyLayoutAnimateScrollScope z;

    public f(LazyLayoutAnimateScrollScope lazyLayoutAnimateScrollScope0, int v, int v1, int v2, Density density0, Continuation continuation0) {
        this.x = v;
        this.y = density0;
        this.z = lazyLayoutAnimateScrollScope0;
        this.A = v1;
        this.B = v2;
        super(2, continuation0);
    }

    public static final boolean a(boolean z, LazyLayoutAnimateScrollScope lazyLayoutAnimateScrollScope0, int v, int v1) {
        if(z) {
            return lazyLayoutAnimateScrollScope0.getFirstVisibleItemIndex() <= v ? lazyLayoutAnimateScrollScope0.getFirstVisibleItemIndex() == v && lazyLayoutAnimateScrollScope0.getFirstVisibleItemScrollOffset() > v1 : true;
        }
        return lazyLayoutAnimateScrollScope0.getFirstVisibleItemIndex() < v || lazyLayoutAnimateScrollScope0.getFirstVisibleItemIndex() == v && lazyLayoutAnimateScrollScope0.getFirstVisibleItemScrollOffset() < v1;
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new f(this.z, this.x, this.A, this.B, this.y, continuation0);
        continuation1.w = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((f)this.create(((ScrollScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        FloatRef ref$FloatRef0;
        float f11;
        float f10;
        ScrollScope scrollScope3;
        float f9;
        Object object3;
        ScrollScope scrollScope1;
        c c1;
        IntRef ref$IntRef1;
        BooleanRef ref$BooleanRef1;
        float f5;
        ObjectRef ref$ObjectRef1;
        float f4;
        int v3;
        float f3;
        Object object2;
        ObjectRef ref$ObjectRef0;
        BooleanRef ref$BooleanRef0;
        float f2;
        float f1;
        float f;
        ScrollScope scrollScope0;
        Density density0 = this.y;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        int v = this.A;
        LazyLayoutAnimateScrollScope lazyLayoutAnimateScrollScope0 = this.z;
        int v1 = this.x;
    alab1:
        switch(this.v) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                scrollScope0 = (ScrollScope)this.w;
                if(((float)v1) < 0.0f) {
                    throw new IllegalArgumentException(("Index should be non-negative (" + v1 + ')').toString());
                }
                try {
                    f = density0.toPx-0680j_4(2500.0f);
                    f1 = density0.toPx-0680j_4(1500.0f);
                    f2 = density0.toPx-0680j_4(50.0f);
                    ref$BooleanRef0 = new BooleanRef();
                    ref$BooleanRef0.element = true;
                    ref$ObjectRef0 = new ObjectRef();
                    ref$ObjectRef0.element = AnimationStateKt.AnimationState$default(0.0f, 0.0f, 0L, 0L, false, 30, null);
                    if(!LazyAnimateScrollKt.isItemVisible(lazyLayoutAnimateScrollScope0, v1)) {
                        goto label_22;
                    }
                    object2 = object1;
                    throw new c(zd.c.roundToInt(lazyLayoutAnimateScrollScope0.calculateDistanceTo(v1)), ((AnimationState)ref$ObjectRef0.element));
                }
                catch(c c0) {
                    object2 = object1;
                    c1 = c0;
                    scrollScope1 = scrollScope0;
                    goto label_116;
                }
                try {
                label_22:
                    int v2 = v1 <= lazyLayoutAnimateScrollScope0.getFirstVisibleItemIndex() ? 0 : 1;
                    IntRef ref$IntRef0 = new IntRef();
                    ref$IntRef0.element = 1;
                    f3 = f2;
                    v3 = v2;
                    f4 = f1;
                    ref$ObjectRef1 = ref$ObjectRef0;
                    f5 = f;
                    ref$BooleanRef1 = ref$BooleanRef0;
                    ref$IntRef1 = ref$IntRef0;
                    goto label_67;
                }
                catch(c c0) {
                    object2 = object1;
                    c1 = c0;
                    scrollScope1 = scrollScope0;
                    goto label_116;
                }
                try {
                    object2 = object1;
                    throw new c(zd.c.roundToInt(lazyLayoutAnimateScrollScope0.calculateDistanceTo(v1)), ((AnimationState)ref$ObjectRef0.element));
                }
                catch(c c0) {
                }
                c1 = c0;
                scrollScope1 = scrollScope0;
                goto label_116;
            }
            case 1: {
                v3 = this.u;
                float f6 = this.t;
                float f7 = this.s;
                float f8 = this.r;
                ref$IntRef1 = this.q;
                ObjectRef ref$ObjectRef2 = this.p;
                BooleanRef ref$BooleanRef2 = this.o;
                ScrollScope scrollScope2 = (ScrollScope)this.w;
                try {
                    ResultKt.throwOnFailure(object0);
                    object3 = object1;
                    f3 = f6;
                    scrollScope0 = scrollScope2;
                    f4 = f7;
                    ref$BooleanRef1 = ref$BooleanRef2;
                    f5 = f8;
                    ref$ObjectRef1 = ref$ObjectRef2;
                }
                catch(c c2) {
                    c1 = c2;
                    scrollScope1 = scrollScope2;
                    object2 = object1;
                    goto label_116;
                }
                while(true) {
                    ++ref$IntRef1.element;
                    object1 = object3;
                    try {
                    label_67:
                        if(!ref$BooleanRef1.element || lazyLayoutAnimateScrollScope0.getItemCount() <= 0) {
                            break alab1;
                        }
                        f9 = lazyLayoutAnimateScrollScope0.calculateDistanceTo(v1) + ((float)v);
                    }
                    catch(c c3) {
                        scrollScope3 = scrollScope0;
                        object2 = object1;
                        goto label_114;
                    }
                    if(Math.abs(f9) < f5) {
                        f10 = Math.max(Math.abs(f9), f3);
                        if(v3 == 0) {
                            f10 = -f10;
                        }
                    }
                    else if(v3 == 0) {
                        f10 = -f5;
                    }
                    else {
                        f11 = f5;
                        goto label_83;
                    }
                    f11 = f10;
                    try {
                    label_83:
                        ref$ObjectRef1.element = AnimationStateKt.copy$default(((AnimationState)ref$ObjectRef1.element), 0.0f, 0.0f, 0L, 0L, false, 30, null);
                        ref$FloatRef0 = new FloatRef();
                        AnimationState animationState0 = (AnimationState)ref$ObjectRef1.element;
                        Float float0 = Boxing.boxFloat(f11);
                        boolean z = ((Number)((AnimationState)ref$ObjectRef1.element).getVelocity()).floatValue() != 0.0f;
                        goto label_93;
                    }
                    catch(c c3) {
                        scrollScope3 = scrollScope0;
                    }
                    object2 = object1;
                    goto label_114;
                    try {
                    label_93:
                        scrollScope3 = scrollScope0;
                        d d0 = new d(this.z, this.x, f11, ref$FloatRef0, scrollScope0, ref$BooleanRef1, v3 != 0, f4, ref$IntRef1, this.B, this.A, ref$ObjectRef1);
                        this.w = scrollScope0;
                        this.o = ref$BooleanRef1;
                        this.p = ref$ObjectRef1;
                        this.q = ref$IntRef1;
                        this.r = f5;
                        this.s = f4;
                        this.t = f3;
                        this.u = v3;
                        this.v = 1;
                        scrollScope3 = scrollScope0;
                    }
                    catch(c c3) {
                        object2 = object1;
                        goto label_114;
                    }
                    try {
                        object3 = object1;
                        if(SuspendAnimationKt.animateTo$default(animationState0, float0, null, z, d0, this, 2, null) == object3) {
                            return object3;
                        }
                        goto label_131;
                    }
                    catch(c c3) {
                        object2 = object1;
                    }
                label_114:
                    c1 = c3;
                    scrollScope1 = scrollScope3;
                label_116:
                    AnimationState animationState1 = AnimationStateKt.copy$default(c1.b, 0.0f, 0.0f, 0L, 0L, false, 30, null);
                    float f12 = (float)(c1.a + v);
                    FloatRef ref$FloatRef1 = new FloatRef();
                    int v4 = ((Number)animationState1.getVelocity()).floatValue() == 0.0f ? 1 : 0;
                    e e0 = new e(f12, ref$FloatRef1, scrollScope1);
                    this.w = scrollScope1;
                    this.o = null;
                    this.p = null;
                    this.q = null;
                    this.v = 2;
                    if(SuspendAnimationKt.animateTo$default(animationState1, Boxing.boxFloat(f12), null, ((boolean)(v4 ^ 1)), e0, this, 2, null) == object2) {
                        return object2;
                    }
                    lazyLayoutAnimateScrollScope0.snapToItem(scrollScope1, v1, v);
                    return Unit.INSTANCE;
                label_131:
                    scrollScope0 = scrollScope3;
                }
            }
            case 2: {
                scrollScope1 = (ScrollScope)this.w;
                ResultKt.throwOnFailure(object0);
                lazyLayoutAnimateScrollScope0.snapToItem(scrollScope1, v1, v);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return Unit.INSTANCE;
    }
}

