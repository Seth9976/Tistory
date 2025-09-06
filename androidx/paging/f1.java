package androidx.paging;

import j0.b2;
import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.StateFlow;
import qd.a;
import s4.a1;
import s4.r1;
import s4.s1;
import s4.t1;
import s4.u1;

public final class f1 implements RemoteMediatorAccessor {
    public final CoroutineScope a;
    public final RemoteMediator b;
    public final b c;
    public final SingleRunner d;
    public static final int e;

    static {
    }

    public f1(CoroutineScope coroutineScope0, RemoteMediator remoteMediator0) {
        Intrinsics.checkNotNullParameter(coroutineScope0, "scope");
        Intrinsics.checkNotNullParameter(remoteMediator0, "remoteMediator");
        super();
        this.a = coroutineScope0;
        this.b = remoteMediator0;
        this.c = new b();
        this.d = new SingleRunner(false);
    }

    public final void a(b b0, LoadType loadType0, PagingState pagingState0) {
        if(((Boolean)b0.a(new b2(19, loadType0, pagingState0))).booleanValue()) {
            if(RemoteMediatorAccessImpl.WhenMappings.$EnumSwitchMapping$0[loadType0.ordinal()] == 1) {
                t1 t10 = new t1(this, null);
                BuildersKt.launch$default(this.a, null, null, t10, 3, null);
                return;
            }
            s1 s10 = new s1(this, null);
            BuildersKt.launch$default(this.a, null, null, s10, 3, null);
        }
    }

    @Override  // androidx.paging.RemoteMediatorConnection
    public final void allowRefresh() {
        this.c.a(a1.A);
    }

    @Override  // androidx.paging.RemoteMediatorAccessor
    public final StateFlow getState() {
        return this.c.b;
    }

    @Override  // androidx.paging.RemoteMediatorAccessor
    public final Object initialize(Continuation continuation0) {
        f1 f10;
        r1 r10;
        if(continuation0 instanceof r1) {
            r10 = (r1)continuation0;
            int v = r10.r;
            if((v & 0x80000000) == 0) {
                r10 = new r1(this, continuation0);
            }
            else {
                r10.r = v ^ 0x80000000;
            }
        }
        else {
            r10 = new r1(this, continuation0);
        }
        Object object0 = r10.p;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(r10.r) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                r10.o = this;
                r10.r = 1;
                object0 = this.b.initialize(r10);
                if(object0 == object1) {
                    return object1;
                }
                f10 = this;
                break;
            }
            case 1: {
                f10 = r10.o;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(((InitializeAction)object0) == InitializeAction.LAUNCH_INITIAL_REFRESH) {
            f10.c.a(a1.B);
        }
        return object0;
    }

    @Override  // androidx.paging.RemoteMediatorConnection
    public final void requestLoad(LoadType loadType0, PagingState pagingState0) {
        Intrinsics.checkNotNullParameter(loadType0, "loadType");
        Intrinsics.checkNotNullParameter(pagingState0, "pagingState");
        this.a(this.c, loadType0, pagingState0);
    }

    @Override  // androidx.paging.RemoteMediatorConnection
    public final void requestRefreshIfAllowed(PagingState pagingState0) {
        Intrinsics.checkNotNullParameter(pagingState0, "pagingState");
        b2 b20 = new b2(20, this, pagingState0);
        this.c.a(b20);
    }

    @Override  // androidx.paging.RemoteMediatorConnection
    public final void retryFailed(PagingState pagingState0) {
        Intrinsics.checkNotNullParameter(pagingState0, "pagingState");
        ArrayList arrayList0 = new ArrayList();
        u1 u10 = new u1(arrayList0, 0);
        this.c.a(u10);
        for(Object object0: arrayList0) {
            this.requestLoad(((LoadType)object0), pagingState0);
        }
    }
}

