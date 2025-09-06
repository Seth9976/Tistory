package o4;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.State;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.compose.ComposeNavigator;
import androidx.navigation.compose.NavHostKt;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

public final class x extends SuspendLambda implements Function2 {
    public final Transition o;
    public final Map p;
    public final State q;
    public final ComposeNavigator r;

    public x(Transition transition0, Map map0, State state0, ComposeNavigator composeNavigator0, Continuation continuation0) {
        this.o = transition0;
        this.p = map0;
        this.q = state0;
        this.r = composeNavigator0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new x(this.o, this.p, this.q, this.r, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((x)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        Transition transition0 = this.o;
        if(Intrinsics.areEqual(transition0.getCurrentState(), transition0.getTargetState())) {
            for(Object object1: NavHostKt.access$NavHost$lambda$17(this.q)) {
                this.r.onTransitionComplete(((NavBackStackEntry)object1));
            }
            LinkedHashMap linkedHashMap0 = new LinkedHashMap();
            Map map0 = this.p;
            for(Object object2: map0.entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object2;
                if(!Intrinsics.areEqual(map$Entry0.getKey(), ((NavBackStackEntry)transition0.getTargetState()).getId())) {
                    linkedHashMap0.put(map$Entry0.getKey(), map$Entry0.getValue());
                }
            }
            for(Object object3: linkedHashMap0.entrySet()) {
                map0.remove(((Map.Entry)object3).getKey());
            }
        }
        return Unit.INSTANCE;
    }
}

