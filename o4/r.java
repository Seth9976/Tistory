package o4;

import androidx.compose.foundation.text.selection.y0;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.compose.ComposeNavigator;
import androidx.navigation.compose.NavHostKt;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import qd.a;

public final class r extends SuspendLambda implements Function2 {
    public int o;
    public Object p;
    public final ComposeNavigator q;
    public final MutableFloatState r;
    public final State s;
    public final MutableState t;

    public r(ComposeNavigator composeNavigator0, MutableFloatState mutableFloatState0, State state0, MutableState mutableState0, Continuation continuation0) {
        this.q = composeNavigator0;
        this.r = mutableFloatState0;
        this.s = state0;
        this.t = mutableState0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new r(this.q, this.r, this.s, this.t, continuation0);
        continuation1.p = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((r)this.create(((Flow)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        NavBackStackEntry navBackStackEntry1;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        ComposeNavigator composeNavigator0 = this.q;
        MutableState mutableState0 = this.t;
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                Flow flow0 = (Flow)this.p;
                NavHostKt.access$NavHost$lambda$9(this.r, 0.0f);
                NavBackStackEntry navBackStackEntry0 = (NavBackStackEntry)CollectionsKt___CollectionsKt.lastOrNull(NavHostKt.access$NavHost$lambda$6(this.s));
                Intrinsics.checkNotNull(navBackStackEntry0);
                composeNavigator0.prepareForTransition(navBackStackEntry0);
                composeNavigator0.prepareForTransition(((NavBackStackEntry)NavHostKt.access$NavHost$lambda$6(this.s).get(NavHostKt.access$NavHost$lambda$6(this.s).size() - 2)));
                try {
                    y0 y00 = new y0(3, mutableState0, this.r);
                    this.p = navBackStackEntry0;
                    this.o = 1;
                    if(flow0.collect(y00, this) == object1) {
                        return object1;
                    }
                    navBackStackEntry1 = navBackStackEntry0;
                    goto label_21;
                }
                catch(CancellationException unused_ex) {
                    break;
                }
            }
            case 1: {
                navBackStackEntry1 = (NavBackStackEntry)this.p;
                try {
                    ResultKt.throwOnFailure(object0);
                label_21:
                    NavHostKt.access$NavHost$lambda$12(mutableState0, false);
                    composeNavigator0.popBackStack(navBackStackEntry1, false);
                    return Unit.INSTANCE;
                }
                catch(CancellationException unused_ex) {
                    break;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        NavHostKt.access$NavHost$lambda$12(mutableState0, false);
        return Unit.INSTANCE;
    }
}

