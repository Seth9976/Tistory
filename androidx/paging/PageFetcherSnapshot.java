package androidx.paging;

import androidx.compose.foundation.text.selection.y0;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref.BooleanRef;
import kotlin.jvm.internal.Ref.IntRef;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.k;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job.DefaultImpls;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.sync.Mutex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;
import s4.p0;
import s4.q0;
import s4.x0;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001B{\u0012\b\u0010\u0004\u001A\u0004\u0018\u00018\u0000\u0012\u0012\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0006\u0010\b\u001A\u00020\u0007\u0012\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0016\b\u0002\u0010\r\u001A\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\f\u0012\u0016\b\u0002\u0010\u000F\u001A\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000E\u0012\u000E\b\u0002\u0010\u0011\u001A\b\u0012\u0004\u0012\u00020\n0\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001A\u00020\n2\u0006\u0010\u0015\u001A\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001A\u00020\n¢\u0006\u0004\b\u0018\u0010\u0019J\u001C\u0010\u001A\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000EH\u0086@¢\u0006\u0004\b\u001A\u0010\u001BR\u001C\u0010\u0004\u001A\u0004\u0018\u00018\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001C\u0010\u001D\u001A\u0004\b\u001E\u0010\u001FR&\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010!\u001A\u0004\b\"\u0010#R%\u0010\r\u001A\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001A\u0004\b&\u0010\'R#\u0010-\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010(0\t8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001A\u0004\b+\u0010,¨\u0006."}, d2 = {"Landroidx/paging/PageFetcherSnapshot;", "", "Key", "Value", "initialKey", "Landroidx/paging/PagingSource;", "pagingSource", "Landroidx/paging/PagingConfig;", "config", "Lkotlinx/coroutines/flow/Flow;", "", "retryFlow", "Landroidx/paging/RemoteMediatorConnection;", "remoteMediatorConnection", "Landroidx/paging/PagingState;", "previousPagingState", "Lkotlin/Function0;", "jumpCallback", "<init>", "(Ljava/lang/Object;Landroidx/paging/PagingSource;Landroidx/paging/PagingConfig;Lkotlinx/coroutines/flow/Flow;Landroidx/paging/RemoteMediatorConnection;Landroidx/paging/PagingState;Lkotlin/jvm/functions/Function0;)V", "Landroidx/paging/ViewportHint;", "viewportHint", "accessHint", "(Landroidx/paging/ViewportHint;)V", "close", "()V", "currentPagingState", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Ljava/lang/Object;", "getInitialKey$paging_common_release", "()Ljava/lang/Object;", "b", "Landroidx/paging/PagingSource;", "getPagingSource$paging_common_release", "()Landroidx/paging/PagingSource;", "e", "Landroidx/paging/RemoteMediatorConnection;", "getRemoteMediatorConnection", "()Landroidx/paging/RemoteMediatorConnection;", "Landroidx/paging/PageEvent;", "m", "Lkotlinx/coroutines/flow/Flow;", "getPageEventFlow", "()Lkotlinx/coroutines/flow/Flow;", "pageEventFlow", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPageFetcherSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PageFetcherSnapshot.kt\nandroidx/paging/PageFetcherSnapshot\n+ 2 PageFetcherSnapshotState.kt\nandroidx/paging/PageFetcherSnapshotState$Holder\n+ 3 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 4 FlowExt.kt\nandroidx/paging/FlowExtKt\n+ 5 PagingLogger.kt\nandroidx/paging/PagingLoggerKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,639:1\n390#2:640\n391#2:649\n390#2:652\n391#2:661\n390#2:673\n391#2:682\n390#2:694\n391#2:703\n390#2:715\n391#2:724\n390#2:736\n391#2:745\n390#2:758\n391#2:767\n390#2:769\n391#2:778\n390#2:790\n391#2:799\n390#2:831\n391#2:840\n390#2:852\n391#2:861\n390#2:863\n391#2:872\n120#3,8:641\n129#3:650\n120#3,8:653\n129#3:662\n120#3,8:674\n129#3:683\n120#3,8:695\n129#3:704\n120#3,8:716\n129#3:725\n120#3,8:737\n129#3:746\n120#3,8:759\n129#3:768\n120#3,8:770\n129#3:779\n120#3,8:791\n129#3:800\n120#3,8:832\n129#3:841\n120#3,8:853\n129#3:862\n120#3,8:864\n129#3:873\n98#4:651\n32#5,10:663\n32#5,10:684\n32#5,10:705\n32#5,10:726\n32#5,10:747\n32#5,10:780\n32#5,10:801\n32#5,10:811\n32#5,10:821\n32#5,10:842\n1#6:757\n*S KotlinDebug\n*F\n+ 1 PageFetcherSnapshot.kt\nandroidx/paging/PageFetcherSnapshot\n*L\n210#1:640\n210#1:649\n284#1:652\n284#1:661\n294#1:673\n294#1:682\n324#1:694\n324#1:703\n336#1:715\n336#1:724\n352#1:736\n352#1:745\n374#1:758\n374#1:767\n410#1:769\n410#1:778\n446#1:790\n446#1:799\n470#1:831\n470#1:840\n492#1:852\n492#1:861\n527#1:863\n527#1:872\n210#1:641,8\n210#1:650\n284#1:653,8\n284#1:662\n294#1:674,8\n294#1:683\n324#1:695,8\n324#1:704\n336#1:716,8\n336#1:725\n352#1:737,8\n352#1:746\n374#1:759,8\n374#1:768\n410#1:770,8\n410#1:779\n446#1:791,8\n446#1:800\n470#1:832,8\n470#1:841\n492#1:853,8\n492#1:862\n527#1:864,8\n527#1:873\n251#1:651\n288#1:663,10\n322#1:684,10\n330#1:705,10\n351#1:726,10\n358#1:747,10\n423#1:780,10\n452#1:801,10\n456#1:811,10\n469#1:821,10\n481#1:842,10\n*E\n"})
public final class PageFetcherSnapshot {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[LoadType.values().length];
            try {
                arr_v[LoadType.REFRESH.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[LoadType.PREPEND.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[LoadType.APPEND.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    public final Object a;
    public final PagingSource b;
    public final PagingConfig c;
    public final Flow d;
    public final RemoteMediatorConnection e;
    public final PagingState f;
    public final Function0 g;
    public final HintHandler h;
    public final AtomicBoolean i;
    public final Channel j;
    public final Holder k;
    public final CompletableJob l;
    public final Flow m;

    public PageFetcherSnapshot(@Nullable Object object0, @NotNull PagingSource pagingSource0, @NotNull PagingConfig pagingConfig0, @NotNull Flow flow0, @Nullable RemoteMediatorConnection remoteMediatorConnection0, @Nullable PagingState pagingState0, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(pagingSource0, "pagingSource");
        Intrinsics.checkNotNullParameter(pagingConfig0, "config");
        Intrinsics.checkNotNullParameter(flow0, "retryFlow");
        Intrinsics.checkNotNullParameter(function00, "jumpCallback");
        super();
        this.a = object0;
        this.b = pagingSource0;
        this.c = pagingConfig0;
        this.d = flow0;
        this.e = remoteMediatorConnection0;
        this.f = pagingState0;
        this.g = function00;
        if(pagingConfig0.jumpThreshold != 0x80000000 && !pagingSource0.getJumpingSupported()) {
            throw new IllegalArgumentException("PagingConfig.jumpThreshold was set, but the associated PagingSource has not marked support for jumps by overriding PagingSource.jumpingSupported to true.");
        }
        this.h = new HintHandler();
        this.i = new AtomicBoolean(false);
        this.j = ChannelKt.Channel$default(-2, null, null, 6, null);
        this.k = new Holder(pagingConfig0);
        CompletableJob completableJob0 = JobKt.Job$default(null, 1, null);
        this.l = completableJob0;
        this.m = FlowKt.onStart(CancelableChannelFlowKt.cancelableChannelFlow(completableJob0, new m0(this, null)), new n0(this, null));
    }

    public PageFetcherSnapshot(Object object0, PagingSource pagingSource0, PagingConfig pagingConfig0, Flow flow0, RemoteMediatorConnection remoteMediatorConnection0, PagingState pagingState0, Function0 function00, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        Function0 function01 = (v & 0x40) == 0 ? function00 : s4.m0.x;
        this(object0, pagingSource0, pagingConfig0, flow0, ((v & 16) == 0 ? remoteMediatorConnection0 : null), ((v & 0x20) == 0 ? pagingState0 : null), function01);
    }

    public final Object a(Continuation continuation0) {
        PagingState pagingState0;
        LoadType loadType0;
        Mutex mutex9;
        PageFetcherSnapshot pageFetcherSnapshot6;
        Mutex mutex8;
        Holder pageFetcherSnapshotState$Holder5;
        PageFetcherSnapshot pageFetcherSnapshot5;
        LoadResult pagingSource$LoadResult3;
        PageFetcherSnapshot pageFetcherSnapshot4;
        LoadResult pagingSource$LoadResult2;
        Mutex mutex6;
        Holder pageFetcherSnapshotState$Holder4;
        LoadResult pagingSource$LoadResult1;
        Mutex mutex4;
        Holder pageFetcherSnapshotState$Holder3;
        LoadResult pagingSource$LoadResult0;
        Mutex mutex3;
        Holder pageFetcherSnapshotState$Holder2;
        PageFetcherSnapshot pageFetcherSnapshot3;
        PageFetcherSnapshot pageFetcherSnapshot1;
        Mutex mutex1;
        PageFetcherSnapshot pageFetcherSnapshot0;
        Holder pageFetcherSnapshotState$Holder0;
        p0 p00;
        if(continuation0 instanceof p0) {
            p00 = (p0)continuation0;
            int v = p00.u;
            if((v & 0x80000000) == 0) {
                p00 = new p0(this, continuation0);
            }
            else {
                p00.u = v ^ 0x80000000;
            }
        }
        else {
            p00 = new p0(this, continuation0);
        }
        Object object0 = p00.s;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(p00.u) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                pageFetcherSnapshotState$Holder0 = this.k;
                Mutex mutex0 = Holder.access$getLock$p(pageFetcherSnapshotState$Holder0);
                p00.o = this;
                p00.p = pageFetcherSnapshotState$Holder0;
                p00.q = mutex0;
                p00.u = 1;
                if(mutex0.lock(null, p00) == object1) {
                    return object1;
                }
                pageFetcherSnapshot0 = this;
                mutex1 = mutex0;
                goto label_29;
            }
            case 1: {
                mutex1 = (Mutex)p00.q;
                pageFetcherSnapshotState$Holder0 = (Holder)p00.p;
                pageFetcherSnapshot0 = (PageFetcherSnapshot)p00.o;
                ResultKt.throwOnFailure(object0);
                try {
                label_29:
                    p00.o = pageFetcherSnapshot0;
                    p00.p = mutex1;
                    p00.q = null;
                    p00.u = 2;
                    if(pageFetcherSnapshot0.e(Holder.access$getState$p(pageFetcherSnapshotState$Holder0), LoadType.REFRESH, p00) == object1) {
                        return object1;
                    }
                }
                catch(Throwable throwable0) {
                    mutex1.unlock(null);
                    throw throwable0;
                }
                pageFetcherSnapshot1 = pageFetcherSnapshot0;
                goto label_44;
            }
            case 2: {
                mutex1 = (Mutex)p00.p;
                pageFetcherSnapshot1 = (PageFetcherSnapshot)p00.o;
                try {
                    ResultKt.throwOnFailure(object0);
                }
                catch(Throwable throwable0) {
                    mutex1.unlock(null);
                    throw throwable0;
                }
            label_44:
                mutex1.unlock(null);
                LoadParams pagingSource$LoadParams0 = LoadParams.Companion.create(LoadType.REFRESH, pageFetcherSnapshot1.a, pageFetcherSnapshot1.c.initialLoadSize, pageFetcherSnapshot1.c.enablePlaceholders);
                PagingLogger pagingLogger0 = PagingLogger.INSTANCE;
                boolean z = pagingLogger0.isLoggable(3);
                PagingSource pagingSource0 = pageFetcherSnapshot1.b;
                if(z) {
                    pagingLogger0.log(3, "Start REFRESH with loadKey " + pageFetcherSnapshot1.a + " on " + pagingSource0, null);
                }
                p00.o = pageFetcherSnapshot1;
                p00.p = null;
                p00.u = 3;
                object0 = pagingSource0.load(pagingSource$LoadParams0, p00);
                if(object0 == object1) {
                    return object1;
                }
                goto label_60;
            }
            case 3: {
                PageFetcherSnapshot pageFetcherSnapshot2 = (PageFetcherSnapshot)p00.o;
                ResultKt.throwOnFailure(object0);
                pageFetcherSnapshot1 = pageFetcherSnapshot2;
            label_60:
                if(((LoadResult)object0) instanceof Page) {
                    Holder pageFetcherSnapshotState$Holder1 = pageFetcherSnapshot1.k;
                    Mutex mutex2 = Holder.access$getLock$p(pageFetcherSnapshotState$Holder1);
                    p00.o = pageFetcherSnapshot1;
                    p00.p = (LoadResult)object0;
                    p00.q = pageFetcherSnapshotState$Holder1;
                    p00.r = mutex2;
                    p00.u = 4;
                    if(mutex2.lock(null, p00) == object1) {
                        return object1;
                    }
                    pageFetcherSnapshot3 = pageFetcherSnapshot1;
                    pageFetcherSnapshotState$Holder2 = pageFetcherSnapshotState$Holder1;
                    mutex3 = mutex2;
                    pagingSource$LoadResult0 = (LoadResult)object0;
                    goto label_102;
                }
                else {
                    if(((LoadResult)object0) instanceof Error) {
                        PagingLogger pagingLogger1 = PagingLogger.INSTANCE;
                        if(pagingLogger1.isLoggable(2)) {
                            pagingLogger1.log(2, PageFetcherSnapshot.b(LoadType.REFRESH, pageFetcherSnapshot1.a, ((LoadResult)object0)), null);
                        }
                        pageFetcherSnapshotState$Holder3 = pageFetcherSnapshot1.k;
                        mutex4 = Holder.access$getLock$p(pageFetcherSnapshotState$Holder3);
                        p00.o = pageFetcherSnapshot1;
                        p00.p = (LoadResult)object0;
                        p00.q = pageFetcherSnapshotState$Holder3;
                        p00.r = mutex4;
                        p00.u = 8;
                        if(mutex4.lock(null, p00) == object1) {
                            return object1;
                        }
                        pagingSource$LoadResult1 = (LoadResult)object0;
                        goto label_201;
                    }
                    if(((LoadResult)object0) instanceof Invalid) {
                        PagingLogger pagingLogger2 = PagingLogger.INSTANCE;
                        if(pagingLogger2.isLoggable(2)) {
                            pagingLogger2.log(2, PageFetcherSnapshot.b(LoadType.REFRESH, pageFetcherSnapshot1.a, ((LoadResult)object0)), null);
                        }
                        pageFetcherSnapshot1.close();
                        pageFetcherSnapshot1.b.invalidate();
                        return Unit.INSTANCE;
                    }
                }
                return Unit.INSTANCE;
            }
            case 4: {
                mutex3 = p00.r;
                pageFetcherSnapshotState$Holder2 = (Holder)p00.q;
                pagingSource$LoadResult0 = (LoadResult)p00.p;
                pageFetcherSnapshot3 = (PageFetcherSnapshot)p00.o;
                ResultKt.throwOnFailure(object0);
            label_102:
                try {
                    PageFetcherSnapshotState pageFetcherSnapshotState0 = Holder.access$getState$p(pageFetcherSnapshotState$Holder2);
                    loadType0 = LoadType.REFRESH;
                    boolean z1 = pageFetcherSnapshotState0.insert(0, loadType0, ((Page)pagingSource$LoadResult0));
                    Companion loadState$NotLoading$Companion0 = NotLoading.Companion;
                    pageFetcherSnapshotState0.getSourceLoadStates$paging_common_release().set(loadType0, loadState$NotLoading$Companion0.getIncomplete$paging_common_release());
                    if(((Page)pagingSource$LoadResult0).getPrevKey() == null) {
                        NotLoading loadState$NotLoading0 = loadState$NotLoading$Companion0.getComplete$paging_common_release();
                        pageFetcherSnapshotState0.getSourceLoadStates$paging_common_release().set(LoadType.PREPEND, loadState$NotLoading0);
                    }
                    if(((Page)pagingSource$LoadResult0).getNextKey() == null) {
                        NotLoading loadState$NotLoading1 = loadState$NotLoading$Companion0.getComplete$paging_common_release();
                        pageFetcherSnapshotState0.getSourceLoadStates$paging_common_release().set(LoadType.APPEND, loadState$NotLoading1);
                    }
                }
                finally {
                    mutex3.unlock(null);
                }
                if(z1) {
                    PagingLogger pagingLogger3 = PagingLogger.INSTANCE;
                    if(pagingLogger3.isLoggable(3)) {
                        pagingLogger3.log(3, PageFetcherSnapshot.b(loadType0, pageFetcherSnapshot3.a, pagingSource$LoadResult0), null);
                    }
                    pageFetcherSnapshotState$Holder4 = pageFetcherSnapshot3.k;
                    Mutex mutex5 = Holder.access$getLock$p(pageFetcherSnapshotState$Holder4);
                    p00.o = pageFetcherSnapshot3;
                    p00.p = pagingSource$LoadResult0;
                    p00.q = pageFetcherSnapshotState$Holder4;
                    p00.r = mutex5;
                    p00.u = 5;
                    if(mutex5.lock(null, p00) == object1) {
                        return object1;
                    }
                    mutex6 = mutex5;
                    pagingSource$LoadResult2 = pagingSource$LoadResult0;
                    pageFetcherSnapshot4 = pageFetcherSnapshot3;
                    goto label_145;
                }
                else {
                    PagingLogger pagingLogger4 = PagingLogger.INSTANCE;
                    if(pagingLogger4.isLoggable(2)) {
                        pagingLogger4.log(2, PageFetcherSnapshot.b(loadType0, pageFetcherSnapshot3.a, null), null);
                    }
                    pagingSource$LoadResult3 = pagingSource$LoadResult0;
                    pageFetcherSnapshot5 = pageFetcherSnapshot3;
                }
                goto label_166;
            }
            case 5: {
                mutex6 = p00.r;
                pageFetcherSnapshotState$Holder4 = (Holder)p00.q;
                pagingSource$LoadResult2 = (LoadResult)p00.p;
                pageFetcherSnapshot4 = (PageFetcherSnapshot)p00.o;
                ResultKt.throwOnFailure(object0);
                try {
                label_145:
                    PageEvent pageEvent0 = Holder.access$getState$p(pageFetcherSnapshotState$Holder4).toPageEvent$paging_common_release(((Page)pagingSource$LoadResult2), LoadType.REFRESH);
                    p00.o = pageFetcherSnapshot4;
                    p00.p = pagingSource$LoadResult2;
                    p00.q = mutex6;
                    p00.r = null;
                    p00.u = 6;
                    if(pageFetcherSnapshot4.j.send(pageEvent0, p00) == object1) {
                        return object1;
                    }
                }
                catch(Throwable throwable1) {
                    mutex6.unlock(null);
                    throw throwable1;
                }
                pagingSource$LoadResult3 = pagingSource$LoadResult2;
                pageFetcherSnapshot5 = pageFetcherSnapshot4;
                mutex6.unlock(null);
                goto label_166;
            }
            case 6: {
                mutex6 = (Mutex)p00.q;
                pagingSource$LoadResult3 = (LoadResult)p00.p;
                pageFetcherSnapshot5 = (PageFetcherSnapshot)p00.o;
                try {
                    ResultKt.throwOnFailure(object0);
                }
                catch(Throwable throwable1) {
                    mutex6.unlock(null);
                    throw throwable1;
                }
                mutex6.unlock(null);
            label_166:
                if(pageFetcherSnapshot5.e != null && (((Page)pagingSource$LoadResult3).getPrevKey() == null || ((Page)pagingSource$LoadResult3).getNextKey() == null)) {
                    pageFetcherSnapshotState$Holder5 = pageFetcherSnapshot5.k;
                    Mutex mutex7 = Holder.access$getLock$p(pageFetcherSnapshotState$Holder5);
                    p00.o = pageFetcherSnapshot5;
                    p00.p = pagingSource$LoadResult3;
                    p00.q = pageFetcherSnapshotState$Holder5;
                    p00.r = mutex7;
                    p00.u = 7;
                    if(mutex7.lock(null, p00) == object1) {
                        return object1;
                    }
                    mutex8 = mutex7;
                    pageFetcherSnapshot6 = pageFetcherSnapshot5;
                    goto label_184;
                }
                return Unit.INSTANCE;
            }
            case 7: {
                mutex8 = p00.r;
                pageFetcherSnapshotState$Holder5 = (Holder)p00.q;
                pagingSource$LoadResult3 = (LoadResult)p00.p;
                pageFetcherSnapshot6 = (PageFetcherSnapshot)p00.o;
                ResultKt.throwOnFailure(object0);
            label_184:
                try {
                    pagingState0 = Holder.access$getState$p(pageFetcherSnapshotState$Holder5).currentPagingState$paging_common_release(pageFetcherSnapshot6.h.getLastAccessHint());
                }
                finally {
                    mutex8.unlock(null);
                }
                RemoteMediatorConnection remoteMediatorConnection0 = pageFetcherSnapshot6.e;
                if(((Page)pagingSource$LoadResult3).getPrevKey() == null) {
                    remoteMediatorConnection0.requestLoad(LoadType.PREPEND, pagingState0);
                }
                if(((Page)pagingSource$LoadResult3).getNextKey() == null) {
                    remoteMediatorConnection0.requestLoad(LoadType.APPEND, pagingState0);
                    return Unit.INSTANCE;
                }
                return Unit.INSTANCE;
            }
            case 8: {
                mutex4 = p00.r;
                pageFetcherSnapshotState$Holder3 = (Holder)p00.q;
                pagingSource$LoadResult1 = (LoadResult)p00.p;
                pageFetcherSnapshot1 = (PageFetcherSnapshot)p00.o;
                ResultKt.throwOnFailure(object0);
                try {
                label_201:
                    androidx.paging.LoadState.Error loadState$Error0 = new androidx.paging.LoadState.Error(((Error)pagingSource$LoadResult1).getThrowable());
                    p00.o = mutex4;
                    p00.p = null;
                    p00.q = null;
                    p00.r = null;
                    p00.u = 9;
                    if(pageFetcherSnapshot1.d(Holder.access$getState$p(pageFetcherSnapshotState$Holder3), LoadType.REFRESH, loadState$Error0, p00) == object1) {
                        return object1;
                    }
                }
                catch(Throwable throwable2) {
                    mutex9 = mutex4;
                    mutex9.unlock(null);
                    throw throwable2;
                }
                mutex9 = mutex4;
                break;
            }
            case 9: {
                mutex9 = (Mutex)p00.o;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(Throwable throwable2) {
                }
                mutex9.unlock(null);
                throw throwable2;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        mutex9.unlock(null);
        return Unit.INSTANCE;
    }

    public static final Object access$collectAsGenerationalViewportHints(PageFetcherSnapshot pageFetcherSnapshot0, Flow flow0, LoadType loadType0, Continuation continuation0) {
        pageFetcherSnapshot0.getClass();
        Unit unit0 = FlowKt.conflate(FlowExtKt.simpleRunningReduce(FlowExtKt.simpleTransformLatest(flow0, new PageFetcherSnapshot.collectAsGenerationalViewportHints..inlined.simpleFlatMapLatest.1(null, pageFetcherSnapshot0, loadType0)), new s4.n0(loadType0, null))).collect(new y0(5, pageFetcherSnapshot0, loadType0), continuation0);
        return unit0 == a.getCOROUTINE_SUSPENDED() ? unit0 : Unit.INSTANCE;
    }

    public static final Object access$doLoad(PageFetcherSnapshot pageFetcherSnapshot0, LoadType loadType0, GenerationalViewportHint generationalViewportHint0, Continuation continuation0) {
        PagingState pagingState0;
        PageFetcherSnapshotState pageFetcherSnapshotState4;
        Object object5;
        PageFetcherSnapshot pageFetcherSnapshot9;
        LoadParams pagingSource$LoadParams4;
        LoadResult pagingSource$LoadResult3;
        LoadParams pagingSource$LoadParams3;
        LoadResult pagingSource$LoadResult2;
        Mutex mutex13;
        PageFetcherSnapshotState pageFetcherSnapshotState3;
        PageFetcherSnapshot pageFetcherSnapshot8;
        LoadType loadType10;
        GenerationalViewportHint generationalViewportHint8;
        IntRef ref$IntRef6;
        Mutex mutex12;
        LoadResult pagingSource$LoadResult1;
        LoadType loadType8;
        Holder pageFetcherSnapshotState$Holder6;
        GenerationalViewportHint generationalViewportHint6;
        Mutex mutex10;
        PageFetcherSnapshotState pageFetcherSnapshotState2;
        LoadType loadType7;
        q0 q01;
        Mutex mutex9;
        Holder pageFetcherSnapshotState$Holder5;
        Mutex mutex7;
        PageFetcherSnapshot pageFetcherSnapshot6;
        LoadParams pagingSource$LoadParams1;
        LoadResult pagingSource$LoadResult0;
        Holder pageFetcherSnapshotState$Holder4;
        PageFetcherSnapshot pageFetcherSnapshot5;
        IntRef ref$IntRef4;
        ObjectRef ref$ObjectRef4;
        BooleanRef ref$BooleanRef2;
        LoadType loadType5;
        GenerationalViewportHint generationalViewportHint4;
        LoadParams pagingSource$LoadParams0;
        BooleanRef ref$BooleanRef0;
        Object object2;
        Mutex mutex5;
        Object object3;
        ObjectRef ref$ObjectRef2;
        GenerationalViewportHint generationalViewportHint2;
        Mutex mutex4;
        ObjectRef ref$ObjectRef1;
        LoadType loadType3;
        PageFetcherSnapshot pageFetcherSnapshot3;
        Holder pageFetcherSnapshotState$Holder3;
        IntRef ref$IntRef1;
        GenerationalViewportHint generationalViewportHint1;
        Mutex mutex1;
        Holder pageFetcherSnapshotState$Holder1;
        q0 q00;
        PageFetcherSnapshot pageFetcherSnapshot1 = pageFetcherSnapshot0;
        LoadType loadType1 = loadType0;
        pageFetcherSnapshot0.getClass();
        if(continuation0 instanceof q0) {
            q00 = (q0)continuation0;
            int v = q00.D;
            if((v & 0x80000000) == 0) {
                q00 = new q0(pageFetcherSnapshot1, continuation0);
            }
            else {
                q00.D = v ^ 0x80000000;
            }
        }
        else {
            q00 = new q0(pageFetcherSnapshot1, continuation0);
        }
        Object object0 = q00.B;
        Unit unit0 = a.getCOROUTINE_SUSPENDED();
    alab1:
        switch(q00.D) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                if(loadType1 == LoadType.REFRESH) {
                    throw new IllegalArgumentException("Use doInitialLoad for LoadType == REFRESH");
                }
                IntRef ref$IntRef0 = new IntRef();
                Holder pageFetcherSnapshotState$Holder0 = pageFetcherSnapshot1.k;
                Mutex mutex0 = pageFetcherSnapshotState$Holder0.a;
                q00.o = pageFetcherSnapshot1;
                q00.p = loadType1;
                q00.q = generationalViewportHint0;
                q00.r = ref$IntRef0;
                q00.s = pageFetcherSnapshotState$Holder0;
                q00.t = mutex0;
                q00.D = 1;
                if(mutex0.lock(null, q00) != unit0) {
                    pageFetcherSnapshotState$Holder1 = pageFetcherSnapshotState$Holder0;
                    mutex1 = mutex0;
                    generationalViewportHint1 = generationalViewportHint0;
                    ref$IntRef1 = ref$IntRef0;
                    goto label_47;
                }
                break;
            }
            case 1: {
                Mutex mutex2 = (Mutex)q00.t;
                Holder pageFetcherSnapshotState$Holder2 = (Holder)q00.s;
                IntRef ref$IntRef2 = (IntRef)q00.r;
                generationalViewportHint1 = (GenerationalViewportHint)q00.q;
                LoadType loadType2 = (LoadType)q00.p;
                PageFetcherSnapshot pageFetcherSnapshot2 = (PageFetcherSnapshot)q00.o;
                ResultKt.throwOnFailure(object0);
                mutex1 = mutex2;
                pageFetcherSnapshot1 = pageFetcherSnapshot2;
                pageFetcherSnapshotState$Holder1 = pageFetcherSnapshotState$Holder2;
                loadType1 = loadType2;
                ref$IntRef1 = ref$IntRef2;
            label_47:
                try {
                    PageFetcherSnapshotState pageFetcherSnapshotState0 = pageFetcherSnapshotState$Holder1.b;
                    switch(WhenMappings.$EnumSwitchMapping$0[loadType1.ordinal()]) {
                        case 1: {
                            throw new IllegalStateException("Use doInitialLoad for LoadType == REFRESH");
                        }
                        case 2: {
                            int v2 = pageFetcherSnapshotState0.getInitialPageIndex$paging_common_release() + generationalViewportHint1.getHint().getOriginalPageOffsetFirst() - 1;
                            if(v2 > CollectionsKt__CollectionsKt.getLastIndex(pageFetcherSnapshotState0.getPages$paging_common_release())) {
                                int v3 = ref$IntRef1.element;
                                ref$IntRef1.element = (v2 - CollectionsKt__CollectionsKt.getLastIndex(pageFetcherSnapshotState0.getPages$paging_common_release())) * pageFetcherSnapshot1.c.pageSize + v3;
                                v2 = CollectionsKt__CollectionsKt.getLastIndex(pageFetcherSnapshotState0.getPages$paging_common_release());
                            }
                            if(v2 >= 0) {
                                for(int v4 = 0; true; ++v4) {
                                    ref$IntRef1.element += ((Page)pageFetcherSnapshotState0.getPages$paging_common_release().get(v4)).getData().size();
                                    if(v4 == v2) {
                                        break;
                                    }
                                }
                            }
                            break;
                        }
                        case 3: {
                            int v5 = pageFetcherSnapshotState0.getInitialPageIndex$paging_common_release() + generationalViewportHint1.getHint().getOriginalPageOffsetLast() + 1;
                            if(v5 < 0) {
                                ref$IntRef1.element = pageFetcherSnapshot1.c.pageSize * -v5 + ref$IntRef1.element;
                                v5 = 0;
                            }
                            int v6 = CollectionsKt__CollectionsKt.getLastIndex(pageFetcherSnapshotState0.getPages$paging_common_release());
                            if(v5 <= v6) {
                                while(true) {
                                    ref$IntRef1.element += ((Page)pageFetcherSnapshotState0.getPages$paging_common_release().get(v5)).getData().size();
                                    if(v5 == v6) {
                                        break;
                                    }
                                    ++v5;
                                }
                            }
                        }
                    }
                }
                finally {
                    mutex1.unlock(null);
                }
                ObjectRef ref$ObjectRef0 = new ObjectRef();
                pageFetcherSnapshotState$Holder3 = pageFetcherSnapshot1.k;
                Mutex mutex3 = pageFetcherSnapshotState$Holder3.a;
                q00.o = pageFetcherSnapshot1;
                q00.p = loadType1;
                q00.q = generationalViewportHint1;
                q00.r = ref$IntRef1;
                q00.s = ref$ObjectRef0;
                q00.t = pageFetcherSnapshotState$Holder3;
                q00.u = mutex3;
                q00.v = ref$ObjectRef0;
                q00.D = 2;
                if(mutex3.lock(null, q00) != unit0) {
                    pageFetcherSnapshot3 = pageFetcherSnapshot1;
                    loadType3 = loadType1;
                    ref$ObjectRef1 = ref$ObjectRef0;
                    mutex4 = mutex3;
                    generationalViewportHint2 = generationalViewportHint1;
                    ref$ObjectRef2 = ref$ObjectRef1;
                    goto label_106;
                }
                break;
            }
            case 2: {
                ref$ObjectRef1 = (ObjectRef)q00.v;
                mutex4 = (Mutex)q00.u;
                pageFetcherSnapshotState$Holder3 = (Holder)q00.t;
                ref$ObjectRef2 = (ObjectRef)q00.s;
                ref$IntRef1 = (IntRef)q00.r;
                generationalViewportHint2 = (GenerationalViewportHint)q00.q;
                loadType3 = (LoadType)q00.p;
                pageFetcherSnapshot3 = (PageFetcherSnapshot)q00.o;
                ResultKt.throwOnFailure(object0);
                try {
                label_106:
                    PageFetcherSnapshotState pageFetcherSnapshotState1 = pageFetcherSnapshotState$Holder3.b;
                    Object object1 = pageFetcherSnapshot3.c(pageFetcherSnapshotState1, loadType3, generationalViewportHint2.getGenerationId(), generationalViewportHint2.getHint().presentedItemsBeyondAnchor$paging_common_release(loadType3) + ref$IntRef1.element);
                    if(object1 == null) {
                        object3 = null;
                        goto label_142;
                    }
                    else {
                        q00.o = pageFetcherSnapshot3;
                        q00.p = loadType3;
                        q00.q = generationalViewportHint2;
                        q00.r = ref$IntRef1;
                        q00.s = ref$ObjectRef2;
                        q00.t = mutex4;
                        q00.u = object1;
                        q00.v = ref$ObjectRef1;
                        q00.D = 3;
                        if(pageFetcherSnapshot3.e(pageFetcherSnapshotState1, loadType3, q00) != unit0) {
                            mutex5 = mutex4;
                            object2 = object1;
                            goto label_140;
                        }
                    }
                    break;
                }
                catch(Throwable throwable0) {
                    mutex5 = mutex4;
                    mutex5.unlock(null);
                    throw throwable0;
                }
            }
            case 3: {
                ref$ObjectRef1 = (ObjectRef)q00.v;
                object2 = q00.u;
                mutex5 = (Mutex)q00.t;
                ref$ObjectRef2 = (ObjectRef)q00.s;
                ref$IntRef1 = (IntRef)q00.r;
                generationalViewportHint2 = (GenerationalViewportHint)q00.q;
                loadType3 = (LoadType)q00.p;
                pageFetcherSnapshot3 = (PageFetcherSnapshot)q00.o;
                try {
                    ResultKt.throwOnFailure(object0);
                }
                catch(Throwable throwable0) {
                    mutex5.unlock(null);
                    throw throwable0;
                }
            label_140:
                object3 = object2;
                mutex4 = mutex5;
            label_142:
                mutex4.unlock(null);
                ref$ObjectRef1.element = object3;
                ref$BooleanRef0 = new BooleanRef();
                goto label_271;
            }
            case 4: {
                pagingSource$LoadParams0 = (LoadParams)q00.u;
                BooleanRef ref$BooleanRef1 = (BooleanRef)q00.t;
                ObjectRef ref$ObjectRef3 = (ObjectRef)q00.s;
                IntRef ref$IntRef3 = (IntRef)q00.r;
                GenerationalViewportHint generationalViewportHint3 = (GenerationalViewportHint)q00.q;
                LoadType loadType4 = (LoadType)q00.p;
                PageFetcherSnapshot pageFetcherSnapshot4 = (PageFetcherSnapshot)q00.o;
                ResultKt.throwOnFailure(object0);
                generationalViewportHint4 = generationalViewportHint3;
                loadType5 = loadType4;
                ref$BooleanRef2 = ref$BooleanRef1;
                ref$ObjectRef4 = ref$ObjectRef3;
                ref$IntRef4 = ref$IntRef3;
                pageFetcherSnapshot5 = pageFetcherSnapshot4;
                goto label_299;
            }
            case 5: {
                Mutex mutex6 = (Mutex)q00.x;
                pageFetcherSnapshotState$Holder4 = (Holder)q00.w;
                pagingSource$LoadResult0 = (LoadResult)q00.v;
                pagingSource$LoadParams1 = (LoadParams)q00.u;
                ref$BooleanRef2 = (BooleanRef)q00.t;
                ref$ObjectRef4 = (ObjectRef)q00.s;
                ref$IntRef4 = (IntRef)q00.r;
                generationalViewportHint4 = (GenerationalViewportHint)q00.q;
                loadType5 = (LoadType)q00.p;
                pageFetcherSnapshot6 = (PageFetcherSnapshot)q00.o;
                ResultKt.throwOnFailure(object0);
                mutex7 = mutex6;
                goto label_324;
            }
            case 6: {
                Mutex mutex8 = (Mutex)q00.t;
                pageFetcherSnapshotState$Holder5 = (Holder)q00.s;
                pagingSource$LoadResult0 = (LoadResult)q00.r;
                GenerationalViewportHint generationalViewportHint5 = (GenerationalViewportHint)q00.q;
                LoadType loadType6 = (LoadType)q00.p;
                pageFetcherSnapshot5 = (PageFetcherSnapshot)q00.o;
                ResultKt.throwOnFailure(object0);
                mutex9 = mutex8;
                q01 = q00;
                generationalViewportHint4 = generationalViewportHint5;
                loadType7 = loadType6;
                goto label_367;
            }
            case 7: {
                pageFetcherSnapshotState2 = (PageFetcherSnapshotState)q00.r;
                mutex10 = (Mutex)q00.q;
                generationalViewportHint6 = (GenerationalViewportHint)q00.p;
                loadType7 = (LoadType)q00.o;
                try {
                    ResultKt.throwOnFailure(object0);
                    goto label_384;
                }
                catch(Throwable throwable1) {
                    mutex10.unlock(null);
                    throw throwable1;
                }
            }
            case 8: {
                Mutex mutex11 = q00.y;
                pageFetcherSnapshotState$Holder6 = (Holder)q00.x;
                loadType8 = (LoadType)q00.w;
                pagingSource$LoadResult1 = (LoadResult)q00.v;
                LoadParams pagingSource$LoadParams2 = (LoadParams)q00.u;
                BooleanRef ref$BooleanRef3 = (BooleanRef)q00.t;
                ObjectRef ref$ObjectRef5 = (ObjectRef)q00.s;
                IntRef ref$IntRef5 = (IntRef)q00.r;
                GenerationalViewportHint generationalViewportHint7 = (GenerationalViewportHint)q00.q;
                LoadType loadType9 = (LoadType)q00.p;
                PageFetcherSnapshot pageFetcherSnapshot7 = (PageFetcherSnapshot)q00.o;
                ResultKt.throwOnFailure(object0);
                mutex12 = mutex11;
                pagingSource$LoadParams0 = pagingSource$LoadParams2;
                ref$BooleanRef2 = ref$BooleanRef3;
                ref$ObjectRef4 = ref$ObjectRef5;
                ref$IntRef6 = ref$IntRef5;
                generationalViewportHint8 = generationalViewportHint7;
                loadType10 = loadType9;
                pageFetcherSnapshot8 = pageFetcherSnapshot7;
                goto label_423;
            }
            case 9: {
                pageFetcherSnapshotState3 = (PageFetcherSnapshotState)q00.x;
                mutex13 = (Mutex)q00.w;
                pagingSource$LoadResult2 = (LoadResult)q00.v;
                pagingSource$LoadParams3 = (LoadParams)q00.u;
                ref$BooleanRef2 = (BooleanRef)q00.t;
                ref$ObjectRef4 = (ObjectRef)q00.s;
                ref$IntRef6 = (IntRef)q00.r;
                generationalViewportHint8 = (GenerationalViewportHint)q00.q;
                loadType10 = (LoadType)q00.p;
                pageFetcherSnapshot8 = (PageFetcherSnapshot)q00.o;
                try {
                    ResultKt.throwOnFailure(object0);
                    goto label_444;
                }
                catch(Throwable throwable2) {
                    mutex13.unlock(null);
                    throw throwable2;
                }
            }
            case 10: {
                mutex13 = (Mutex)q00.w;
                pagingSource$LoadResult3 = (LoadResult)q00.v;
                pagingSource$LoadParams4 = (LoadParams)q00.u;
                BooleanRef ref$BooleanRef4 = (BooleanRef)q00.t;
                ObjectRef ref$ObjectRef6 = (ObjectRef)q00.s;
                IntRef ref$IntRef7 = (IntRef)q00.r;
                GenerationalViewportHint generationalViewportHint9 = (GenerationalViewportHint)q00.q;
                LoadType loadType11 = (LoadType)q00.p;
                pageFetcherSnapshot9 = (PageFetcherSnapshot)q00.o;
                try {
                    ResultKt.throwOnFailure(object0);
                    loadType3 = loadType11;
                    generationalViewportHint8 = generationalViewportHint9;
                    ref$IntRef6 = ref$IntRef7;
                    ref$ObjectRef4 = ref$ObjectRef6;
                    ref$BooleanRef2 = ref$BooleanRef4;
                    goto label_472;
                }
                catch(Throwable throwable2) {
                    mutex13.unlock(null);
                    throw throwable2;
                }
            }
            case 11: {
                int v7 = q00.A;
                int v8 = q00.z;
                Mutex mutex14 = (Mutex)q00.v;
                Holder pageFetcherSnapshotState$Holder7 = (Holder)q00.u;
                BooleanRef ref$BooleanRef5 = (BooleanRef)q00.t;
                ObjectRef ref$ObjectRef7 = (ObjectRef)q00.s;
                IntRef ref$IntRef8 = (IntRef)q00.r;
                GenerationalViewportHint generationalViewportHint10 = (GenerationalViewportHint)q00.q;
                LoadType loadType12 = (LoadType)q00.p;
                PageFetcherSnapshot pageFetcherSnapshot10 = (PageFetcherSnapshot)q00.o;
                ResultKt.throwOnFailure(object0);
                loadType3 = loadType12;
                ref$IntRef1 = ref$IntRef8;
                generationalViewportHint2 = generationalViewportHint10;
                ref$ObjectRef2 = ref$ObjectRef7;
                pageFetcherSnapshot9 = pageFetcherSnapshot10;
                while(true) {
                    try {
                        pagingState0 = pageFetcherSnapshotState$Holder7.b.currentPagingState$paging_common_release(pageFetcherSnapshot9.h.getLastAccessHint());
                    }
                    finally {
                        mutex14.unlock(null);
                    }
                    RemoteMediatorConnection remoteMediatorConnection0 = pageFetcherSnapshot9.e;
                    if(v8 != 0) {
                        remoteMediatorConnection0.requestLoad(LoadType.PREPEND, pagingState0);
                    }
                    if(v7 != 0) {
                        remoteMediatorConnection0.requestLoad(LoadType.APPEND, pagingState0);
                    }
                    ref$BooleanRef0 = ref$BooleanRef5;
                    while(true) {
                        pageFetcherSnapshot3 = pageFetcherSnapshot9;
                    label_271:
                        Object object4 = ref$ObjectRef2.element;
                        if(object4 == null) {
                            return Unit.INSTANCE;
                        }
                        pageFetcherSnapshot3.getClass();
                        LoadParams pagingSource$LoadParams5 = LoadParams.Companion.create(loadType3, object4, (loadType3 == LoadType.REFRESH ? pageFetcherSnapshot3.c.initialLoadSize : pageFetcherSnapshot3.c.pageSize), pageFetcherSnapshot3.c.enablePlaceholders);
                        PagingLogger pagingLogger0 = PagingLogger.INSTANCE;
                        boolean z = pagingLogger0.isLoggable(3);
                        PagingSource pagingSource0 = pageFetcherSnapshot3.b;
                        if(z) {
                            pagingLogger0.log(3, "Start " + loadType3 + " with loadKey " + ref$ObjectRef2.element + " on " + pagingSource0, null);
                        }
                        q00.o = pageFetcherSnapshot3;
                        q00.p = loadType3;
                        q00.q = generationalViewportHint2;
                        q00.r = ref$IntRef1;
                        q00.s = ref$ObjectRef2;
                        q00.t = ref$BooleanRef0;
                        q00.u = pagingSource$LoadParams5;
                        q00.v = null;
                        q00.w = null;
                        q00.D = 4;
                        object0 = pagingSource0.load(pagingSource$LoadParams5, q00);
                        if(object0 == unit0) {
                            break alab1;
                        }
                        loadType5 = loadType3;
                        ref$IntRef4 = ref$IntRef1;
                        ref$BooleanRef2 = ref$BooleanRef0;
                        pagingSource$LoadParams0 = pagingSource$LoadParams5;
                        ref$ObjectRef4 = ref$ObjectRef2;
                        pageFetcherSnapshot5 = pageFetcherSnapshot3;
                        generationalViewportHint4 = generationalViewportHint2;
                    label_299:
                        pagingSource$LoadResult0 = (LoadResult)object0;
                        if(pagingSource$LoadResult0 instanceof Page) {
                            switch(WhenMappings.$EnumSwitchMapping$0[loadType5.ordinal()]) {
                                case 2: {
                                    object5 = ((Page)pagingSource$LoadResult0).getPrevKey();
                                    break;
                                }
                                case 3: {
                                    object5 = ((Page)pagingSource$LoadResult0).getNextKey();
                                    break;
                                }
                                default: {
                                    throw new IllegalArgumentException("Use doInitialLoad for LoadType == REFRESH");
                                }
                            }
                            if(Intrinsics.areEqual(object5, ref$ObjectRef4.element)) {
                                throw new IllegalStateException(k.trimMargin$default(("The same value, " + ref$ObjectRef4.element + ", was passed as the " + (loadType5 == LoadType.PREPEND ? "prevKey" : "nextKey") + " in two\n                            | sequential Pages loaded from a PagingSource. Re-using load keys in\n                            | PagingSource is often an error, and must be explicitly enabled by\n                            | overriding PagingSource.keyReuseSupported.\n                            "), null, 1, null).toString());
                            }
                            pageFetcherSnapshotState$Holder4 = pageFetcherSnapshot5.k;
                            mutex7 = pageFetcherSnapshotState$Holder4.a;
                            q00.o = pageFetcherSnapshot5;
                            q00.p = loadType5;
                            q00.q = generationalViewportHint4;
                            q00.r = ref$IntRef4;
                            q00.s = ref$ObjectRef4;
                            q00.t = ref$BooleanRef2;
                            q00.u = pagingSource$LoadParams0;
                            q00.v = pagingSource$LoadResult0;
                            q00.w = pageFetcherSnapshotState$Holder4;
                            q00.x = mutex7;
                            q00.D = 5;
                            if(mutex7.lock(null, q00) == unit0) {
                                break alab1;
                            }
                            pageFetcherSnapshot6 = pageFetcherSnapshot5;
                            pagingSource$LoadParams1 = pagingSource$LoadParams0;
                        label_324:
                            try {
                                boolean z1 = pageFetcherSnapshotState$Holder4.b.insert(generationalViewportHint4.getGenerationId(), loadType5, ((Page)pagingSource$LoadResult0));
                            }
                            finally {
                                mutex7.unlock(null);
                            }
                            if(!z1) {
                                PagingLogger pagingLogger1 = PagingLogger.INSTANCE;
                                if(!pagingLogger1.isLoggable(2)) {
                                    return Unit.INSTANCE;
                                }
                                Object object6 = ref$ObjectRef4.element;
                                pageFetcherSnapshot6.getClass();
                                pagingLogger1.log(2, PageFetcherSnapshot.b(loadType5, object6, null), null);
                                return Unit.INSTANCE;
                            }
                            PagingLogger pagingLogger2 = PagingLogger.INSTANCE;
                            if(pagingLogger2.isLoggable(3)) {
                                Object object7 = ref$ObjectRef4.element;
                                pageFetcherSnapshot6.getClass();
                                pagingLogger2.log(3, PageFetcherSnapshot.b(loadType5, object7, pagingSource$LoadResult0), null);
                            }
                            ref$IntRef4.element = ((Page)pagingSource$LoadResult0).getData().size() + ref$IntRef4.element;
                            if(loadType5 == LoadType.PREPEND && ((Page)pagingSource$LoadResult0).getPrevKey() == null || loadType5 == LoadType.APPEND && ((Page)pagingSource$LoadResult0).getNextKey() == null) {
                                ref$BooleanRef2.element = true;
                            }
                            pagingSource$LoadParams0 = pagingSource$LoadParams1;
                            pageFetcherSnapshot5 = pageFetcherSnapshot6;
                        }
                        else {
                            if(pagingSource$LoadResult0 instanceof Error) {
                                PagingLogger pagingLogger3 = PagingLogger.INSTANCE;
                                if(pagingLogger3.isLoggable(2)) {
                                    Object object8 = ref$ObjectRef4.element;
                                    pageFetcherSnapshot5.getClass();
                                    pagingLogger3.log(2, PageFetcherSnapshot.b(loadType5, object8, pagingSource$LoadResult0), null);
                                }
                                Holder pageFetcherSnapshotState$Holder8 = pageFetcherSnapshot5.k;
                                mutex9 = pageFetcherSnapshotState$Holder8.a;
                                q00.o = pageFetcherSnapshot5;
                                q00.p = loadType5;
                                q00.q = generationalViewportHint4;
                                q00.r = pagingSource$LoadResult0;
                                q00.s = pageFetcherSnapshotState$Holder8;
                                q00.t = mutex9;
                                q00.u = null;
                                q00.D = 6;
                                if(mutex9.lock(null, q00) == unit0) {
                                    break alab1;
                                }
                                pageFetcherSnapshotState$Holder5 = pageFetcherSnapshotState$Holder8;
                                q01 = q00;
                                loadType7 = loadType5;
                                try {
                                label_367:
                                    pageFetcherSnapshotState4 = pageFetcherSnapshotState$Holder5.b;
                                    androidx.paging.LoadState.Error loadState$Error0 = new androidx.paging.LoadState.Error(((Error)pagingSource$LoadResult0).getThrowable());
                                    q01.o = loadType7;
                                    q01.p = generationalViewportHint4;
                                    q01.q = mutex9;
                                    q01.r = pageFetcherSnapshotState4;
                                    q01.s = null;
                                    q01.t = null;
                                    q01.D = 7;
                                    if(pageFetcherSnapshot5.d(pageFetcherSnapshotState4, loadType7, loadState$Error0, q01) == unit0) {
                                        break alab1;
                                    }
                                }
                                catch(Throwable throwable1) {
                                    mutex10 = mutex9;
                                    mutex10.unlock(null);
                                    throw throwable1;
                                }
                                pageFetcherSnapshotState2 = pageFetcherSnapshotState4;
                                mutex10 = mutex9;
                                generationalViewportHint6 = generationalViewportHint4;
                                try {
                                label_384:
                                    pageFetcherSnapshotState2.getFailedHintsByLoadType$paging_common_release().put(loadType7, generationalViewportHint6.getHint());
                                }
                                catch(Throwable throwable1) {
                                    mutex10.unlock(null);
                                    throw throwable1;
                                }
                                mutex10.unlock(null);
                                return Unit.INSTANCE;
                            }
                            if(pagingSource$LoadResult0 instanceof Invalid) {
                                PagingLogger pagingLogger4 = PagingLogger.INSTANCE;
                                if(pagingLogger4.isLoggable(2)) {
                                    Object object9 = ref$ObjectRef4.element;
                                    pageFetcherSnapshot5.getClass();
                                    pagingLogger4.log(2, PageFetcherSnapshot.b(loadType5, object9, pagingSource$LoadResult0), null);
                                }
                                pageFetcherSnapshot5.close();
                                pageFetcherSnapshot5.b.invalidate();
                                return Unit.INSTANCE;
                            }
                        }
                        LoadType loadType13 = WhenMappings.$EnumSwitchMapping$0[loadType5.ordinal()] == 2 ? LoadType.APPEND : LoadType.PREPEND;
                        Holder pageFetcherSnapshotState$Holder9 = pageFetcherSnapshot5.k;
                        mutex12 = pageFetcherSnapshotState$Holder9.a;
                        q00.o = pageFetcherSnapshot5;
                        q00.p = loadType5;
                        q00.q = generationalViewportHint4;
                        q00.r = ref$IntRef4;
                        q00.s = ref$ObjectRef4;
                        q00.t = ref$BooleanRef2;
                        q00.u = pagingSource$LoadParams0;
                        q00.v = pagingSource$LoadResult0;
                        q00.w = loadType13;
                        q00.x = pageFetcherSnapshotState$Holder9;
                        q00.y = mutex12;
                        q00.D = 8;
                        if(mutex12.lock(null, q00) == unit0) {
                            break alab1;
                        }
                        pageFetcherSnapshot8 = pageFetcherSnapshot5;
                        pagingSource$LoadResult1 = pagingSource$LoadResult0;
                        loadType8 = loadType13;
                        pageFetcherSnapshotState$Holder6 = pageFetcherSnapshotState$Holder9;
                        loadType10 = loadType5;
                        generationalViewportHint8 = generationalViewportHint4;
                        ref$IntRef6 = ref$IntRef4;
                        try {
                        label_423:
                            PageFetcherSnapshotState pageFetcherSnapshotState5 = pageFetcherSnapshotState$Holder6.b;
                            Drop pageEvent$Drop0 = pageFetcherSnapshotState5.dropEventOrNull(loadType8, generationalViewportHint8.getHint());
                            if(pageEvent$Drop0 == null) {
                                pagingSource$LoadParams4 = pagingSource$LoadParams0;
                                pagingSource$LoadResult3 = pagingSource$LoadResult1;
                            }
                            else {
                                pageFetcherSnapshotState5.drop(pageEvent$Drop0);
                                q00.o = pageFetcherSnapshot8;
                                q00.p = loadType10;
                                q00.q = generationalViewportHint8;
                                q00.r = ref$IntRef6;
                                q00.s = ref$ObjectRef4;
                                q00.t = ref$BooleanRef2;
                                q00.u = pagingSource$LoadParams0;
                                q00.v = pagingSource$LoadResult1;
                                q00.w = mutex12;
                                q00.x = pageFetcherSnapshotState5;
                                q00.y = null;
                                q00.D = 9;
                                if(pageFetcherSnapshot8.j.send(pageEvent$Drop0, q00) == unit0) {
                                    break alab1;
                                }
                                pagingSource$LoadResult2 = pagingSource$LoadResult1;
                                pagingSource$LoadParams3 = pagingSource$LoadParams0;
                                pageFetcherSnapshotState3 = pageFetcherSnapshotState5;
                                mutex13 = mutex12;
                            label_444:
                                mutex12 = mutex13;
                                pageFetcherSnapshotState5 = pageFetcherSnapshotState3;
                                pagingSource$LoadResult3 = pagingSource$LoadResult2;
                                pagingSource$LoadParams4 = pagingSource$LoadParams3;
                            }
                            Object object10 = pageFetcherSnapshot8.c(pageFetcherSnapshotState5, loadType10, generationalViewportHint8.getGenerationId(), generationalViewportHint8.getHint().presentedItemsBeyondAnchor$paging_common_release(loadType10) + ref$IntRef6.element);
                            ref$ObjectRef4.element = object10;
                            if(object10 == null && !(pageFetcherSnapshotState5.getSourceLoadStates$paging_common_release().get(loadType10) instanceof androidx.paging.LoadState.Error)) {
                                pageFetcherSnapshotState5.getSourceLoadStates$paging_common_release().set(loadType10, (ref$BooleanRef2.element ? NotLoading.Companion.getComplete$paging_common_release() : NotLoading.Companion.getIncomplete$paging_common_release()));
                            }
                            PageEvent pageEvent0 = pageFetcherSnapshotState5.toPageEvent$paging_common_release(((Page)pagingSource$LoadResult3), loadType10);
                            q00.o = pageFetcherSnapshot8;
                            q00.p = loadType10;
                            q00.q = generationalViewportHint8;
                            q00.r = ref$IntRef6;
                            q00.s = ref$ObjectRef4;
                            q00.t = ref$BooleanRef2;
                            q00.u = pagingSource$LoadParams4;
                            q00.v = pagingSource$LoadResult3;
                            q00.w = mutex12;
                            q00.x = null;
                            q00.y = null;
                            q00.D = 10;
                            if(pageFetcherSnapshot8.j.send(pageEvent0, q00) != unit0) {
                                goto label_469;
                            }
                            break alab1;
                        }
                        catch(Throwable throwable2) {
                            mutex13 = mutex12;
                            mutex13.unlock(null);
                            throw throwable2;
                        }
                    label_469:
                        mutex13 = mutex12;
                        loadType3 = loadType10;
                        pageFetcherSnapshot9 = pageFetcherSnapshot8;
                    label_472:
                        mutex13.unlock(null);
                        v8 = !(pagingSource$LoadParams4 instanceof Prepend) || ((Page)pagingSource$LoadResult3).getPrevKey() != null ? 0 : 1;
                        v7 = !(pagingSource$LoadParams4 instanceof Append) || ((Page)pagingSource$LoadResult3).getNextKey() != null ? 0 : 1;
                        if(pageFetcherSnapshot9.e != null && (v8 != 0 || v7 != 0)) {
                            break;
                        }
                        ref$BooleanRef0 = ref$BooleanRef2;
                        ref$ObjectRef2 = ref$ObjectRef4;
                        ref$IntRef1 = ref$IntRef6;
                        generationalViewportHint2 = generationalViewportHint8;
                    }
                    Holder pageFetcherSnapshotState$Holder10 = pageFetcherSnapshot9.k;
                    mutex14 = pageFetcherSnapshotState$Holder10.a;
                    q00.o = pageFetcherSnapshot9;
                    q00.p = loadType3;
                    q00.q = generationalViewportHint8;
                    q00.r = ref$IntRef6;
                    q00.s = ref$ObjectRef4;
                    q00.t = ref$BooleanRef2;
                    q00.u = pageFetcherSnapshotState$Holder10;
                    q00.v = mutex14;
                    q00.w = null;
                    q00.z = v8;
                    q00.A = v7;
                    q00.D = 11;
                    if(mutex14.lock(null, q00) == unit0) {
                        break alab1;
                    }
                    ref$ObjectRef2 = ref$ObjectRef4;
                    generationalViewportHint2 = generationalViewportHint8;
                    ref$BooleanRef5 = ref$BooleanRef2;
                    ref$IntRef1 = ref$IntRef6;
                    pageFetcherSnapshotState$Holder7 = pageFetcherSnapshotState$Holder10;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            return unit0;
        }
        catch(Throwable throwable2) {
            mutex13 = mutex12;
        }
        mutex13.unlock(null);
        throw throwable2;
    }

    public static final Object access$retryLoadError(PageFetcherSnapshot pageFetcherSnapshot0, LoadType loadType0, ViewportHint viewportHint0, Continuation continuation0) {
        pageFetcherSnapshot0.getClass();
        if(WhenMappings.$EnumSwitchMapping$0[loadType0.ordinal()] == 1) {
            Unit unit0 = pageFetcherSnapshot0.a(continuation0);
            return unit0 == a.getCOROUTINE_SUSPENDED() ? unit0 : Unit.INSTANCE;
        }
        if(viewportHint0 == null) {
            throw new IllegalStateException("Cannot retry APPEND / PREPEND load on PagingSource without ViewportHint");
        }
        pageFetcherSnapshot0.h.forceSetHint(loadType0, viewportHint0);
        return Unit.INSTANCE;
    }

    public static final Object access$setError(PageFetcherSnapshot pageFetcherSnapshot0, PageFetcherSnapshotState pageFetcherSnapshotState0, LoadType loadType0, androidx.paging.LoadState.Error loadState$Error0, Continuation continuation0) {
        return pageFetcherSnapshot0.d(pageFetcherSnapshotState0, loadType0, loadState$Error0, continuation0);
    }

    public static final void access$startConsumingHints(PageFetcherSnapshot pageFetcherSnapshot0, CoroutineScope coroutineScope0) {
        if(pageFetcherSnapshot0.c.jumpThreshold != 0x80000000) {
            BuildersKt.launch$default(coroutineScope0, null, null, new x0(pageFetcherSnapshot0, null), 3, null);
        }
        BuildersKt.launch$default(coroutineScope0, null, null, new o0(pageFetcherSnapshot0, null), 3, null);
        BuildersKt.launch$default(coroutineScope0, null, null, new androidx.paging.p0(pageFetcherSnapshot0, null), 3, null);
    }

    public final void accessHint(@NotNull ViewportHint viewportHint0) {
        Intrinsics.checkNotNullParameter(viewportHint0, "viewportHint");
        this.h.processHint(viewportHint0);
    }

    public static String b(LoadType loadType0, Object object0, LoadResult pagingSource$LoadResult0) {
        return pagingSource$LoadResult0 == null ? "End " + loadType0 + " with loadkey " + object0 + ". Load CANCELLED." : "End " + loadType0 + " with loadKey " + object0 + ". Returned " + pagingSource$LoadResult0;
    }

    public final Object c(PageFetcherSnapshotState pageFetcherSnapshotState0, LoadType loadType0, int v, int v1) {
        if(v != pageFetcherSnapshotState0.generationId$paging_common_release(loadType0)) {
            return null;
        }
        if(pageFetcherSnapshotState0.getSourceLoadStates$paging_common_release().get(loadType0) instanceof androidx.paging.LoadState.Error) {
            return null;
        }
        if(v1 >= this.c.prefetchDistance) {
            return null;
        }
        return loadType0 == LoadType.PREPEND ? ((Page)CollectionsKt___CollectionsKt.first(pageFetcherSnapshotState0.getPages$paging_common_release())).getPrevKey() : ((Page)CollectionsKt___CollectionsKt.last(pageFetcherSnapshotState0.getPages$paging_common_release())).getNextKey();
    }

    public final void close() {
        DefaultImpls.cancel$default(this.l, null, 1, null);
    }

    @Nullable
    public final Object currentPagingState(@NotNull Continuation continuation0) {
        Mutex mutex1;
        PageFetcherSnapshot pageFetcherSnapshot0;
        Holder pageFetcherSnapshotState$Holder0;
        s4.o0 o00;
        if(continuation0 instanceof s4.o0) {
            o00 = (s4.o0)continuation0;
            int v = o00.t;
            if((v & 0x80000000) == 0) {
                o00 = new s4.o0(this, continuation0);
            }
            else {
                o00.t = v ^ 0x80000000;
            }
        }
        else {
            o00 = new s4.o0(this, continuation0);
        }
        Object object0 = o00.r;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(o00.t) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                pageFetcherSnapshotState$Holder0 = this.k;
                Mutex mutex0 = Holder.access$getLock$p(pageFetcherSnapshotState$Holder0);
                o00.o = this;
                o00.p = pageFetcherSnapshotState$Holder0;
                o00.q = mutex0;
                o00.t = 1;
                if(mutex0.lock(null, o00) == object1) {
                    return object1;
                }
                pageFetcherSnapshot0 = this;
                mutex1 = mutex0;
                break;
            }
            case 1: {
                mutex1 = o00.q;
                pageFetcherSnapshotState$Holder0 = o00.p;
                pageFetcherSnapshot0 = o00.o;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            return Holder.access$getState$p(pageFetcherSnapshotState$Holder0).currentPagingState$paging_common_release(pageFetcherSnapshot0.h.getLastAccessHint());
        }
        finally {
            mutex1.unlock(null);
        }
    }

    public final Object d(PageFetcherSnapshotState pageFetcherSnapshotState0, LoadType loadType0, androidx.paging.LoadState.Error loadState$Error0, Continuation continuation0) {
        if(!Intrinsics.areEqual(pageFetcherSnapshotState0.getSourceLoadStates$paging_common_release().get(loadType0), loadState$Error0)) {
            pageFetcherSnapshotState0.getSourceLoadStates$paging_common_release().set(loadType0, loadState$Error0);
            LoadStateUpdate pageEvent$LoadStateUpdate0 = new LoadStateUpdate(pageFetcherSnapshotState0.getSourceLoadStates$paging_common_release().snapshot(), null);
            Object object0 = this.j.send(pageEvent$LoadStateUpdate0, continuation0);
            return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    public final Object e(PageFetcherSnapshotState pageFetcherSnapshotState0, LoadType loadType0, Continuation continuation0) {
        LoadState loadState0 = pageFetcherSnapshotState0.getSourceLoadStates$paging_common_release().get(loadType0);
        Loading loadState$Loading0 = Loading.INSTANCE;
        if(!Intrinsics.areEqual(loadState0, loadState$Loading0)) {
            pageFetcherSnapshotState0.getSourceLoadStates$paging_common_release().set(loadType0, loadState$Loading0);
            LoadStateUpdate pageEvent$LoadStateUpdate0 = new LoadStateUpdate(pageFetcherSnapshotState0.getSourceLoadStates$paging_common_release().snapshot(), null);
            Object object0 = this.j.send(pageEvent$LoadStateUpdate0, continuation0);
            return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    @Nullable
    public final Object getInitialKey$paging_common_release() {
        return this.a;
    }

    @NotNull
    public final Flow getPageEventFlow() {
        return this.m;
    }

    @NotNull
    public final PagingSource getPagingSource$paging_common_release() {
        return this.b;
    }

    @Nullable
    public final RemoteMediatorConnection getRemoteMediatorConnection() {
        return this.e;
    }
}

