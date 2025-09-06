package wg;

import java.util.Iterator;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.SequenceScope;
import okio.FileSystem;
import okio.Path;
import okio.internal.-FileSystem;
import qd.a;

public final class c extends RestrictedSuspendLambda implements Function2 {
    public ArrayDeque p;
    public Iterator q;
    public int r;
    public Object s;
    public final Path t;
    public final FileSystem u;
    public final boolean v;

    public c(Path path0, FileSystem fileSystem0, boolean z, Continuation continuation0) {
        this.t = path0;
        this.u = fileSystem0;
        this.v = z;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new c(this.t, this.u, this.v, continuation0);
        continuation1.s = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((c)this.create(((SequenceScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Iterator iterator0;
        ArrayDeque arrayDeque1;
        SequenceScope sequenceScope1;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.r) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                SequenceScope sequenceScope0 = (SequenceScope)this.s;
                ArrayDeque arrayDeque0 = new ArrayDeque();
                arrayDeque0.addLast(this.t);
                sequenceScope1 = sequenceScope0;
                arrayDeque1 = arrayDeque0;
                iterator0 = this.u.list(this.t).iterator();
                break;
            }
            case 1: {
                iterator0 = this.q;
                ArrayDeque arrayDeque2 = this.p;
                SequenceScope sequenceScope2 = (SequenceScope)this.s;
                ResultKt.throwOnFailure(object0);
                arrayDeque1 = arrayDeque2;
                sequenceScope1 = sequenceScope2;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(iterator0.hasNext()) {
            Object object2 = iterator0.next();
            this.s = sequenceScope1;
            this.p = arrayDeque1;
            this.q = iterator0;
            this.r = 1;
            if(-FileSystem.collectRecursively(sequenceScope1, this.u, arrayDeque1, ((Path)object2), this.v, false, this) == object1) {
                return object1;
            }
            if(false) {
                break;
            }
        }
        return Unit.INSTANCE;
    }
}

