package androidx.compose.material3;

import androidx.activity.BackEventCompat;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.material.SwipeableKt;
import androidx.compose.material.SwipeableState;
import androidx.compose.material3.internal.PredictiveBack;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProduceStateScope;
import androidx.compose.runtime.State;
import androidx.navigation.NavBackStackEntry;
import com.google.accompanist.navigation.material.SheetContentHostKt;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.internal.ChannelFlowKt;
import kotlinx.coroutines.flow.internal.d0;
import kotlinx.coroutines.internal.ThreadContextKt;
import p0.z9;
import qd.a;

public final class fj implements FlowCollector {
    public final int a;
    public final Object b;
    public final Object c;
    public final Object d;

    public fj(Object object0, Object object1, int v, Object object2) {
        this.a = v;
        this.b = object0;
        this.c = object1;
        this.d = object2;
        super();
    }

    public fj(FlowCollector flowCollector0, CoroutineContext coroutineContext0) {
        this.a = 1;
        super();
        this.b = coroutineContext0;
        this.c = ThreadContextKt.threadContextElements(coroutineContext0);
        this.d = new d0(flowCollector0, null);
    }

    public Object a(Map map0, Continuation continuation0) {
        fj fj0;
        z9 z90;
        if(continuation0 instanceof z9) {
            z90 = (z9)continuation0;
            int v = z90.s;
            if((v & 0x80000000) == 0) {
                z90 = new z9(this, continuation0);
            }
            else {
                z90.s = v ^ 0x80000000;
            }
        }
        else {
            z90 = new z9(this, continuation0);
        }
        Object object0 = z90.q;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(z90.s) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    Float float0 = SwipeableKt.access$getOffset(map0, this.b);
                    if(float0 == null) {
                        throw new IllegalArgumentException("The target value must have an associated anchor.");
                    }
                    z90.o = this;
                    z90.p = map0;
                    z90.s = 1;
                    if(SwipeableState.access$animateInternalToOffset(((SwipeableState)this.c), ((float)float0), ((AnimationSpec)this.d), z90) == object1) {
                        return object1;
                    }
                }
                catch(Throwable throwable0) {
                    fj0 = this;
                    goto label_33;
                }
                fj0 = this;
                break;
            }
            case 1: {
                try {
                    map0 = z90.p;
                    fj0 = z90.o;
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(Throwable throwable0) {
                }
            label_33:
                float f = ((SwipeableState)fj0.c).g.getFloatValue();
                LinkedHashMap linkedHashMap0 = new LinkedHashMap();
                for(Object object2: map0.entrySet()) {
                    Map.Entry map$Entry0 = (Map.Entry)object2;
                    if(Math.abs(((Number)map$Entry0.getKey()).floatValue() - f) < 0.5f) {
                        linkedHashMap0.put(map$Entry0.getKey(), map$Entry0.getValue());
                    }
                }
                Object object3 = CollectionsKt___CollectionsKt.firstOrNull(linkedHashMap0.values());
                SwipeableState swipeableState0 = (SwipeableState)fj0.c;
                if(object3 == null) {
                    object3 = swipeableState0.getCurrentValue();
                }
                SwipeableState.access$setCurrentValue(swipeableState0, object3);
                throw throwable0;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        float f1 = ((SwipeableState)fj0.c).g.getFloatValue();
        LinkedHashMap linkedHashMap1 = new LinkedHashMap();
        for(Object object4: map0.entrySet()) {
            Map.Entry map$Entry1 = (Map.Entry)object4;
            if(Math.abs(((Number)map$Entry1.getKey()).floatValue() - f1) < 0.5f) {
                linkedHashMap1.put(map$Entry1.getKey(), map$Entry1.getValue());
            }
        }
        Object object5 = CollectionsKt___CollectionsKt.firstOrNull(linkedHashMap1.values());
        SwipeableState swipeableState1 = (SwipeableState)fj0.c;
        if(object5 == null) {
            object5 = swipeableState1.getCurrentValue();
        }
        SwipeableState.access$setCurrentValue(swipeableState1, object5);
        return Unit.INSTANCE;
    }

    @Override  // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object object0, Continuation continuation0) {
        switch(this.a) {
            case 0: {
                MutableState mutableState0 = (MutableState)this.b;
                if(mutableState0.getValue() == null) {
                    mutableState0.setValue(((BackEventCompat)object0));
                }
                ((MutableState)this.c).setValue(((BackEventCompat)object0));
                float f = ((BackEventCompat)object0).getProgress();
                Float float0 = Boxing.boxFloat(1.0f - PredictiveBack.INSTANCE.transform$material3_release(f));
                Unit unit0 = ((Animatable)this.d).snapTo(float0, continuation0);
                return unit0 == a.getCOROUTINE_SUSPENDED() ? unit0 : Unit.INSTANCE;
            }
            case 1: {
                Unit unit1 = ChannelFlowKt.withContextUndispatched(((CoroutineContext)this.b), object0, this.c, ((d0)this.d), continuation0);
                return unit1 == a.getCOROUTINE_SUSPENDED() ? unit1 : Unit.INSTANCE;
            }
            case 2: {
                NavBackStackEntry navBackStackEntry0 = (NavBackStackEntry)this.b;
                if(((Boolean)object0).booleanValue()) {
                    SheetContentHostKt.access$SheetContentHost$lambda$0(((State)this.c)).invoke(navBackStackEntry0);
                    return Unit.INSTANCE;
                }
                SheetContentHostKt.access$SheetContentHost$lambda$1(((State)this.d)).invoke(navBackStackEntry0);
                return Unit.INSTANCE;
            }
            case 3: {
                return this.a(((Map)object0), continuation0);
            }
            default: {
                boolean z = ((Boolean)object0).booleanValue() ? ((Boolean)AnimatedVisibilityKt.access$AnimatedEnterExitImpl$lambda$2(((State)this.d)).invoke(((Transition)this.c).getCurrentState(), ((Transition)this.c).getTargetState())).booleanValue() : false;
                ((ProduceStateScope)this.b).setValue(Boxing.boxBoolean(z));
                return Unit.INSTANCE;
            }
        }
    }
}

