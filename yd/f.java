package yd;

import java.nio.file.FileSystemLoopException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.Arrays;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.io.path.PathTreeWalk;
import kotlin.io.path.PathTreeWalkKt;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.SequenceScope;
import qd.a;

public final class f extends RestrictedSuspendLambda implements Function2 {
    public ArrayDeque p;
    public b q;
    public d r;
    public PathTreeWalk s;
    public Path t;
    public int u;
    public Object v;
    public final PathTreeWalk w;

    public f(PathTreeWalk pathTreeWalk0, Continuation continuation0) {
        this.w = pathTreeWalk0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new f(this.w, continuation0);
        continuation1.v = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((f)this.create(((SequenceScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        SequenceScope sequenceScope2;
        ArrayDeque arrayDeque2;
        b b2;
        d d0;
        PathTreeWalk pathTreeWalk1;
        Path path0;
        b b1;
        ArrayDeque arrayDeque1;
        SequenceScope sequenceScope1;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        PathTreeWalk pathTreeWalk0 = this.w;
        switch(this.u) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                SequenceScope sequenceScope0 = (SequenceScope)this.v;
                ArrayDeque arrayDeque0 = new ArrayDeque();
                b b0 = new b(PathTreeWalk.access$getFollowLinks(pathTreeWalk0));
                arrayDeque0.addLast(new d(pathTreeWalk0.a, PathTreeWalkKt.access$keyOf(pathTreeWalk0.a, PathTreeWalk.access$getLinkOptions(pathTreeWalk0)), null));
                sequenceScope1 = sequenceScope0;
                arrayDeque1 = arrayDeque0;
                b1 = b0;
                break;
            }
            case 1: {
                path0 = this.t;
                pathTreeWalk1 = this.s;
                d0 = this.r;
                b2 = this.q;
                arrayDeque2 = this.p;
                sequenceScope2 = (SequenceScope)this.v;
                ResultKt.throwOnFailure(object0);
                goto label_48;
            }
            case 2: {
                b1 = this.q;
                arrayDeque1 = this.p;
                sequenceScope1 = (SequenceScope)this.v;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(!arrayDeque1.isEmpty()) {
            d d1 = (d)arrayDeque1.removeFirst();
            Path path1 = d1.a;
            LinkOption[] arr_linkOption = PathTreeWalk.access$getLinkOptions(pathTreeWalk0);
            LinkOption[] arr_linkOption1 = (LinkOption[])Arrays.copyOf(arr_linkOption, arr_linkOption.length);
            if(Files.isDirectory(path1, ((LinkOption[])Arrays.copyOf(arr_linkOption1, arr_linkOption1.length)))) {
                if(PathTreeWalkKt.access$createsCycle(d1)) {
                    throw new FileSystemLoopException(path1.toString());
                }
                if(PathTreeWalk.access$getIncludeDirectories(pathTreeWalk0)) {
                    this.v = sequenceScope1;
                    this.p = arrayDeque1;
                    this.q = b1;
                    this.r = d1;
                    this.s = pathTreeWalk0;
                    this.t = path1;
                    this.u = 1;
                    if(sequenceScope1.yield(path1, this) == object1) {
                        return object1;
                    }
                    arrayDeque2 = arrayDeque1;
                    sequenceScope2 = sequenceScope1;
                    d0 = d1;
                    pathTreeWalk1 = pathTreeWalk0;
                    b2 = b1;
                    path0 = path1;
                label_48:
                    d1 = d0;
                    sequenceScope1 = sequenceScope2;
                    path1 = path0;
                    b1 = b2;
                }
                else {
                    arrayDeque2 = arrayDeque1;
                    pathTreeWalk1 = pathTreeWalk0;
                }
                LinkOption[] arr_linkOption2 = PathTreeWalk.access$getLinkOptions(pathTreeWalk1);
                LinkOption[] arr_linkOption3 = (LinkOption[])Arrays.copyOf(arr_linkOption2, arr_linkOption2.length);
                if(Files.isDirectory(path1, ((LinkOption[])Arrays.copyOf(arr_linkOption3, arr_linkOption3.length)))) {
                    arrayDeque2.addAll(b1.a(d1));
                }
                arrayDeque1 = arrayDeque2;
                continue;
            }
            if(!Files.exists(path1, ((LinkOption[])Arrays.copyOf(new LinkOption[]{LinkOption.NOFOLLOW_LINKS}, 1)))) {
                continue;
            }
            this.v = sequenceScope1;
            this.p = arrayDeque1;
            this.q = b1;
            this.r = null;
            this.s = null;
            this.t = null;
            this.u = 2;
            if(sequenceScope1.yield(path1, this) != object1) {
                continue;
            }
            return object1;
        }
        return Unit.INSTANCE;
    }
}

