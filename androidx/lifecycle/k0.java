package androidx.lifecycle;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job.DefaultImpls;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.sync.Mutex;

public final class k0 implements LifecycleEventObserver {
    public final Event a;
    public final ObjectRef b;
    public final CoroutineScope c;
    public final Event d;
    public final CancellableContinuationImpl e;
    public final Mutex f;
    public final Function2 g;

    public k0(Event lifecycle$Event0, ObjectRef ref$ObjectRef0, CoroutineScope coroutineScope0, Event lifecycle$Event1, CancellableContinuationImpl cancellableContinuationImpl0, Mutex mutex0, Function2 function20) {
        this.a = lifecycle$Event0;
        this.b = ref$ObjectRef0;
        this.c = coroutineScope0;
        this.d = lifecycle$Event1;
        this.e = cancellableContinuationImpl0;
        this.f = mutex0;
        this.g = function20;
    }

    @Override  // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner0, Event lifecycle$Event0) {
        Intrinsics.checkNotNullParameter(lifecycleOwner0, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(lifecycle$Event0, "event");
        ObjectRef ref$ObjectRef0 = this.b;
        if(lifecycle$Event0 == this.a) {
            j0 j00 = new j0(this.f, this.g, null);
            ref$ObjectRef0.element = BuildersKt.launch$default(this.c, null, null, j00, 3, null);
            return;
        }
        if(lifecycle$Event0 == this.d) {
            Job job0 = (Job)ref$ObjectRef0.element;
            if(job0 != null) {
                DefaultImpls.cancel$default(job0, null, 1, null);
            }
            ref$ObjectRef0.element = null;
        }
        if(lifecycle$Event0 == Event.ON_DESTROY) {
            this.e.resumeWith(Unit.INSTANCE);
        }
    }
}

