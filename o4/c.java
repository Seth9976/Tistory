package o4;

import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.compose.DialogHostKt;
import androidx.navigation.compose.DialogNavigator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

public final class c extends SuspendLambda implements Function2 {
    public final State o;
    public final DialogNavigator p;
    public final SnapshotStateList q;

    public c(State state0, DialogNavigator dialogNavigator0, SnapshotStateList snapshotStateList0, Continuation continuation0) {
        this.o = state0;
        this.p = dialogNavigator0;
        this.q = snapshotStateList0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new c(this.o, this.p, this.q, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((c)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        for(Object object1: DialogHostKt.access$DialogHost$lambda$1(this.o)) {
            NavBackStackEntry navBackStackEntry0 = (NavBackStackEntry)object1;
            DialogNavigator dialogNavigator0 = this.p;
            if(!((List)dialogNavigator0.getBackStack$navigation_compose_release().getValue()).contains(navBackStackEntry0) && !this.q.contains(navBackStackEntry0)) {
                dialogNavigator0.onTransitionComplete$navigation_compose_release(navBackStackEntry0);
            }
        }
        return Unit.INSTANCE;
    }
}

