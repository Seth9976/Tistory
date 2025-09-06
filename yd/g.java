package yd;

import java.nio.file.FileSystemLoopException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.io.path.PathTreeWalk;
import kotlin.io.path.PathTreeWalkKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequenceScope;
import qd.a;

public final class g extends RestrictedSuspendLambda implements Function2 {
    public ArrayDeque p;
    public b q;
    public d r;
    public PathTreeWalk s;
    public Path t;
    public int u;
    public Object v;
    public final PathTreeWalk w;

    public g(PathTreeWalk pathTreeWalk0, Continuation continuation0) {
        this.w = pathTreeWalk0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new g(this.w, continuation0);
        continuation1.v = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((g)this.create(((SequenceScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        SequenceScope sequenceScope1;
        ArrayDeque arrayDeque1;
        b b1;
        SequenceScope sequenceScope0;
        ArrayDeque arrayDeque0;
        b b0;
        d d0;
        PathTreeWalk pathTreeWalk1;
        Path path0;
        SequenceScope sequenceScope2;
        ArrayDeque arrayDeque2;
        b b2;
        d d1;
        PathTreeWalk pathTreeWalk2;
        Path path1;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        PathTreeWalk pathTreeWalk0 = this.w;
        switch(this.u) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                sequenceScope1 = (SequenceScope)this.v;
                ArrayDeque arrayDeque3 = new ArrayDeque();
                b1 = new b(PathTreeWalk.access$getFollowLinks(pathTreeWalk0));
                Path path2 = pathTreeWalk0.a;
                d d2 = new d(path2, PathTreeWalkKt.access$keyOf(pathTreeWalk0.a, PathTreeWalk.access$getLinkOptions(pathTreeWalk0)), null);
                LinkOption[] arr_linkOption = PathTreeWalk.access$getLinkOptions(pathTreeWalk0);
                LinkOption[] arr_linkOption1 = (LinkOption[])Arrays.copyOf(arr_linkOption, arr_linkOption.length);
                if(Files.isDirectory(path2, ((LinkOption[])Arrays.copyOf(arr_linkOption1, arr_linkOption1.length)))) {
                    if(PathTreeWalkKt.access$createsCycle(d2)) {
                        throw new FileSystemLoopException(path2.toString());
                    }
                    if(PathTreeWalk.access$getIncludeDirectories(pathTreeWalk0)) {
                        this.v = sequenceScope1;
                        this.p = arrayDeque3;
                        this.q = b1;
                        this.r = d2;
                        this.s = pathTreeWalk0;
                        this.t = path2;
                        this.u = 1;
                        if(sequenceScope1.yield(path2, this) == object1) {
                            return object1;
                        }
                        pathTreeWalk2 = pathTreeWalk0;
                        sequenceScope2 = sequenceScope1;
                        d1 = d2;
                        b2 = b1;
                        path1 = path2;
                        arrayDeque2 = arrayDeque3;
                    label_51:
                        arrayDeque3 = arrayDeque2;
                        path2 = path1;
                        b1 = b2;
                        d2 = d1;
                        sequenceScope1 = sequenceScope2;
                    }
                    else {
                        pathTreeWalk2 = pathTreeWalk0;
                    }
                    LinkOption[] arr_linkOption2 = PathTreeWalk.access$getLinkOptions(pathTreeWalk2);
                    LinkOption[] arr_linkOption3 = (LinkOption[])Arrays.copyOf(arr_linkOption2, arr_linkOption2.length);
                    if(Files.isDirectory(path2, ((LinkOption[])Arrays.copyOf(arr_linkOption3, arr_linkOption3.length)))) {
                        d2.d = b1.a(d2).iterator();
                        arrayDeque3.addLast(d2);
                    }
                }
                else if(Files.exists(path2, ((LinkOption[])Arrays.copyOf(new LinkOption[]{LinkOption.NOFOLLOW_LINKS}, 1)))) {
                    this.v = sequenceScope1;
                    this.p = arrayDeque3;
                    this.q = b1;
                    this.u = 2;
                    if(sequenceScope1.yield(path2, this) == object1) {
                        return object1;
                    }
                }
                arrayDeque1 = arrayDeque3;
                break;
            }
            case 1: {
                path1 = this.t;
                pathTreeWalk2 = this.s;
                d1 = this.r;
                b2 = this.q;
                arrayDeque2 = this.p;
                sequenceScope2 = (SequenceScope)this.v;
                ResultKt.throwOnFailure(object0);
                goto label_51;
            }
            case 3: {
                path0 = this.t;
                pathTreeWalk1 = this.s;
                d0 = this.r;
                b0 = this.q;
                arrayDeque0 = this.p;
                sequenceScope0 = (SequenceScope)this.v;
                ResultKt.throwOnFailure(object0);
                goto label_100;
            }
            case 2: 
            case 4: {
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
            Iterator iterator0 = ((d)arrayDeque1.last()).d;
            Intrinsics.checkNotNull(iterator0);
            if(iterator0.hasNext()) {
                Object object2 = iterator0.next();
                d d3 = (d)object2;
                Path path3 = d3.a;
                LinkOption[] arr_linkOption4 = PathTreeWalk.access$getLinkOptions(pathTreeWalk0);
                LinkOption[] arr_linkOption5 = (LinkOption[])Arrays.copyOf(arr_linkOption4, arr_linkOption4.length);
                if(Files.isDirectory(path3, ((LinkOption[])Arrays.copyOf(arr_linkOption5, arr_linkOption5.length)))) {
                    if(PathTreeWalkKt.access$createsCycle(d3)) {
                        throw new FileSystemLoopException(path3.toString());
                    }
                    if(PathTreeWalk.access$getIncludeDirectories(pathTreeWalk0)) {
                        this.v = sequenceScope1;
                        this.p = arrayDeque1;
                        this.q = b1;
                        this.r = d3;
                        this.s = pathTreeWalk0;
                        this.t = path3;
                        this.u = 3;
                        if(sequenceScope1.yield(path3, this) == object1) {
                            return object1;
                        }
                        arrayDeque0 = arrayDeque1;
                        pathTreeWalk1 = pathTreeWalk0;
                        sequenceScope0 = sequenceScope1;
                        d0 = d3;
                        b0 = b1;
                        path0 = path3;
                    label_100:
                        d3 = d0;
                        sequenceScope1 = sequenceScope0;
                        path3 = path0;
                        b1 = b0;
                    }
                    else {
                        arrayDeque0 = arrayDeque1;
                        pathTreeWalk1 = pathTreeWalk0;
                    }
                    LinkOption[] arr_linkOption6 = PathTreeWalk.access$getLinkOptions(pathTreeWalk1);
                    LinkOption[] arr_linkOption7 = (LinkOption[])Arrays.copyOf(arr_linkOption6, arr_linkOption6.length);
                    if(Files.isDirectory(path3, ((LinkOption[])Arrays.copyOf(arr_linkOption7, arr_linkOption7.length)))) {
                        d3.d = b1.a(d3).iterator();
                        arrayDeque0.addLast(d3);
                    }
                    arrayDeque1 = arrayDeque0;
                    continue;
                }
                else {
                    if(!Files.exists(path3, ((LinkOption[])Arrays.copyOf(new LinkOption[]{LinkOption.NOFOLLOW_LINKS}, 1)))) {
                        continue;
                    }
                    this.v = sequenceScope1;
                    this.p = arrayDeque1;
                    this.q = b1;
                    this.r = null;
                    this.s = null;
                    this.t = null;
                    this.u = 4;
                    if(sequenceScope1.yield(path3, this) != object1) {
                        continue;
                    }
                    return object1;
                }
            }
            arrayDeque1.removeLast();
        }
        return Unit.INSTANCE;
    }
}

