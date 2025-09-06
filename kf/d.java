package kf;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.sequences.SequenceScope;
import qd.a;

public final class d extends SequenceScope implements Iterator, Continuation, KMappedMarker {
    public int a;
    public Object b;
    public Iterator c;
    public Continuation d;

    public final RuntimeException a() {
        switch(this.a) {
            case 4: {
                return new NoSuchElementException();
            }
            case 5: {
                return new IllegalStateException("Iterator has failed.");
            }
            default: {
                return new IllegalStateException("Unexpected state of the iterator: " + this.a);
            }
        }
    }

    @Override  // kotlin.coroutines.Continuation
    public final CoroutineContext getContext() {
        return EmptyCoroutineContext.INSTANCE;
    }

    @Override
    public final boolean hasNext() {
        while(true) {
            int v = this.a;
            if(v != 0) {
                switch(v) {
                    case 1: {
                        Iterator iterator0 = this.c;
                        Intrinsics.checkNotNull(iterator0);
                        if(iterator0.hasNext()) {
                            this.a = 2;
                            return true;
                        }
                        this.c = null;
                        break;
                    }
                    case 2: 
                    case 3: {
                        return true;
                    }
                    case 4: {
                        return false;
                    }
                    default: {
                        throw this.a();
                    }
                }
            }
            this.a = 5;
            Continuation continuation0 = this.d;
            Intrinsics.checkNotNull(continuation0);
            this.d = null;
            continuation0.resumeWith(Unit.INSTANCE);
        }
    }

    @Override
    public final Object next() {
        switch(this.a) {
            case 0: 
            case 1: {
                if(!this.hasNext()) {
                    throw new NoSuchElementException();
                }
                return this.next();
            }
            case 2: {
                this.a = 1;
                Iterator iterator0 = this.c;
                Intrinsics.checkNotNull(iterator0);
                return iterator0.next();
            }
            case 3: {
                this.a = 0;
                Object object1 = this.b;
                this.b = null;
                return object1;
            }
            default: {
                throw this.a();
            }
        }
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override  // kotlin.coroutines.Continuation
    public final void resumeWith(Object object0) {
        ResultKt.throwOnFailure(object0);
        this.a = 4;
    }

    @Override  // kotlin.sequences.SequenceScope
    public final Object yield(Object object0, Continuation continuation0) {
        this.b = object0;
        this.a = 3;
        this.d = continuation0;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        if(object1 == a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation0);
        }
        return object1 == a.getCOROUTINE_SUSPENDED() ? object1 : Unit.INSTANCE;
    }

    @Override  // kotlin.sequences.SequenceScope
    public final Object yieldAll(Iterator iterator0, Continuation continuation0) {
        if(!iterator0.hasNext()) {
            return Unit.INSTANCE;
        }
        this.c = iterator0;
        this.a = 2;
        this.d = continuation0;
        Object object0 = a.getCOROUTINE_SUSPENDED();
        if(object0 == a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation0);
        }
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }
}

