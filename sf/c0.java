package sf;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequenceScope;
import kotlinx.coroutines.ChildHandleNode;
import kotlinx.coroutines.Incomplete;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.NodeList;
import kotlinx.coroutines.internal.LockFreeLinkedListHead;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import qd.a;

public final class c0 extends RestrictedSuspendLambda implements Function2 {
    public LockFreeLinkedListHead p;
    public ChildHandleNode q;
    public int r;
    public Object s;
    public final JobSupport t;

    public c0(JobSupport jobSupport0, Continuation continuation0) {
        this.t = jobSupport0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new c0(this.t, continuation0);
        continuation1.s = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((c0)this.create(((SequenceScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        LockFreeLinkedListNode lockFreeLinkedListNode0;
        LockFreeLinkedListHead lockFreeLinkedListHead0;
        SequenceScope sequenceScope1;
        Object object1 = a.getCOROUTINE_SUSPENDED();
    alab1:
        switch(this.r) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                SequenceScope sequenceScope0 = (SequenceScope)this.s;
                Object object2 = this.t.getState$kotlinx_coroutines_core();
                if(object2 instanceof ChildHandleNode) {
                    this.r = 1;
                    if(sequenceScope0.yield(((ChildHandleNode)object2).childJob, this) == object1) {
                        return object1;
                    }
                }
                else if(object2 instanceof Incomplete) {
                    NodeList nodeList0 = ((Incomplete)object2).getList();
                    if(nodeList0 != null) {
                        Object object3 = nodeList0.getNext();
                        Intrinsics.checkNotNull(object3, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                        sequenceScope1 = sequenceScope0;
                        lockFreeLinkedListHead0 = nodeList0;
                        lockFreeLinkedListNode0 = (LockFreeLinkedListNode)object3;
                        goto label_26;
                    }
                }
                break;
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                return Unit.INSTANCE;
            }
            case 2: {
                lockFreeLinkedListNode0 = this.q;
                lockFreeLinkedListHead0 = this.p;
                sequenceScope1 = (SequenceScope)this.s;
                ResultKt.throwOnFailure(object0);
                while(true) {
                    while(true) {
                        lockFreeLinkedListNode0 = lockFreeLinkedListNode0.getNextNode();
                    label_26:
                        if(Intrinsics.areEqual(lockFreeLinkedListNode0, lockFreeLinkedListHead0)) {
                            break alab1;
                        }
                        if(!(lockFreeLinkedListNode0 instanceof ChildHandleNode)) {
                            break;
                        }
                        this.s = sequenceScope1;
                        this.p = lockFreeLinkedListHead0;
                        this.q = (ChildHandleNode)lockFreeLinkedListNode0;
                        this.r = 2;
                        if(sequenceScope1.yield(((ChildHandleNode)lockFreeLinkedListNode0).childJob, this) != object1) {
                            break;
                        }
                        return object1;
                    }
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return Unit.INSTANCE;
    }
}

