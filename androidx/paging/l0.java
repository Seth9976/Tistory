package androidx.paging;

import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.sync.Mutex;
import qd.a;
import s4.u0;

public final class l0 implements FlowCollector {
    public final PageFetcherSnapshot a;
    public final CoroutineScope b;

    public l0(PageFetcherSnapshot pageFetcherSnapshot0, CoroutineScope coroutineScope0) {
        this.a = pageFetcherSnapshot0;
        this.b = coroutineScope0;
    }

    public final Object a(Continuation continuation0) {
        ViewportHint viewportHint3;
        Pair pair0;
        PageFetcherSnapshot pageFetcherSnapshot22;
        Mutex mutex11;
        Holder pageFetcherSnapshotState$Holder9;
        PageFetcherSnapshot pageFetcherSnapshot21;
        CoroutineScope coroutineScope14;
        LoadType loadType17;
        LoadType loadType16;
        Mutex mutex9;
        Holder pageFetcherSnapshotState$Holder8;
        ViewportHint viewportHint2;
        PageFetcherSnapshot pageFetcherSnapshot20;
        PageFetcherSnapshot pageFetcherSnapshot19;
        LoadType loadType15;
        LoadType loadType14;
        CoroutineScope coroutineScope11;
        PageFetcherSnapshot pageFetcherSnapshot16;
        Mutex mutex8;
        Holder pageFetcherSnapshotState$Holder7;
        CoroutineScope coroutineScope12;
        PageFetcherSnapshot pageFetcherSnapshot17;
        LoadType loadType12;
        Mutex mutex7;
        Holder pageFetcherSnapshotState$Holder6;
        LoadStates loadStates9;
        CoroutineScope coroutineScope9;
        LoadType loadType11;
        PageFetcherSnapshot pageFetcherSnapshot14;
        LoadType loadType10;
        PageFetcherSnapshot pageFetcherSnapshot13;
        Mutex mutex6;
        Holder pageFetcherSnapshotState$Holder5;
        LoadType loadType9;
        ViewportHint viewportHint1;
        PageFetcherSnapshot pageFetcherSnapshot12;
        CoroutineScope coroutineScope6;
        PageFetcherSnapshot pageFetcherSnapshot9;
        Mutex mutex5;
        LoadStates loadStates6;
        Holder pageFetcherSnapshotState$Holder4;
        CoroutineScope coroutineScope7;
        PageFetcherSnapshot pageFetcherSnapshot10;
        LoadStates loadStates7;
        LoadType loadType7;
        LoadType loadType6;
        Mutex mutex3;
        Holder pageFetcherSnapshotState$Holder3;
        LoadStates loadStates4;
        CoroutineScope coroutineScope4;
        LoadType loadType5;
        PageFetcherSnapshot pageFetcherSnapshot7;
        LoadType loadType4;
        PageFetcherSnapshot pageFetcherSnapshot6;
        Mutex mutex2;
        Holder pageFetcherSnapshotState$Holder2;
        LoadType loadType3;
        ViewportHint viewportHint0;
        PageFetcherSnapshot pageFetcherSnapshot5;
        LoadStates loadStates3;
        PageFetcherSnapshot pageFetcherSnapshot4;
        CoroutineScope coroutineScope3;
        Mutex mutex1;
        CoroutineScope coroutineScope1;
        PageFetcherSnapshot pageFetcherSnapshot2;
        LoadStates loadStates1;
        LoadType loadType1;
        CoroutineScope coroutineScope0;
        PageFetcherSnapshot pageFetcherSnapshot1;
        LoadStates loadStates0;
        l0 l00;
        Mutex mutex0;
        Holder pageFetcherSnapshotState$Holder0;
        PageFetcherSnapshot pageFetcherSnapshot0;
        u0 u00;
        if(continuation0 instanceof u0) {
            u00 = (u0)continuation0;
            int v = u00.y;
            if((v & 0x80000000) == 0) {
                u00 = new u0(this, continuation0);
            }
            else {
                u00.y = v ^ 0x80000000;
            }
        }
        else {
            u00 = new u0(this, continuation0);
        }
        Object object0 = u00.w;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(u00.y) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                pageFetcherSnapshot0 = this.a;
                pageFetcherSnapshotState$Holder0 = pageFetcherSnapshot0.k;
                mutex0 = pageFetcherSnapshotState$Holder0.a;
                u00.o = this;
                u00.p = pageFetcherSnapshotState$Holder0;
                u00.q = pageFetcherSnapshot0;
                u00.r = mutex0;
                u00.y = 1;
                if(mutex0.lock(null, u00) == object1) {
                    return object1;
                }
                l00 = this;
                goto label_31;
            }
            case 1: {
                mutex0 = (Mutex)u00.r;
                pageFetcherSnapshot0 = (PageFetcherSnapshot)u00.q;
                pageFetcherSnapshotState$Holder0 = (Holder)u00.p;
                l00 = (l0)u00.o;
                ResultKt.throwOnFailure(object0);
            label_31:
                try {
                    PageFetcherSnapshotState pageFetcherSnapshotState0 = pageFetcherSnapshotState$Holder0.b;
                    pair0 = TuplesKt.to(pageFetcherSnapshotState0.getSourceLoadStates$paging_common_release().snapshot(), pageFetcherSnapshotState0.currentPagingState$paging_common_release(pageFetcherSnapshot0.h.getLastAccessHint()));
                }
                finally {
                    mutex0.unlock(null);
                }
                loadStates0 = (LoadStates)pair0.component1();
                PagingState pagingState0 = (PagingState)pair0.component2();
                RemoteMediatorConnection remoteMediatorConnection0 = l00.a.getRemoteMediatorConnection();
                if(remoteMediatorConnection0 != null) {
                    remoteMediatorConnection0.retryFailed(pagingState0);
                }
                LoadType loadType0 = LoadType.REFRESH;
                pageFetcherSnapshot1 = l00.a;
                coroutineScope0 = l00.b;
                if(loadStates0.getRefresh() instanceof Error) {
                    loadType1 = loadType0;
                    loadStates1 = loadStates0;
                    pageFetcherSnapshot2 = pageFetcherSnapshot1;
                    coroutineScope1 = coroutineScope0;
                    goto label_86;
                }
                goto label_176;
            }
            case 2: {
                mutex1 = (Mutex)u00.t;
                Holder pageFetcherSnapshotState$Holder1 = (Holder)u00.s;
                LoadType loadType2 = (LoadType)u00.r;
                CoroutineScope coroutineScope2 = (CoroutineScope)u00.q;
                PageFetcherSnapshot pageFetcherSnapshot3 = (PageFetcherSnapshot)u00.p;
                LoadStates loadStates2 = (LoadStates)u00.o;
                ResultKt.throwOnFailure(object0);
                try {
                    u00.o = loadStates2;
                    u00.p = pageFetcherSnapshot3;
                    u00.q = coroutineScope2;
                    u00.r = loadType2;
                    u00.s = mutex1;
                    u00.t = null;
                    u00.y = 3;
                    if(pageFetcherSnapshot3.e(pageFetcherSnapshotState$Holder1.b, loadType2, u00) == object1) {
                        return object1;
                    }
                }
                catch(Throwable throwable0) {
                    mutex1.unlock(null);
                    throw throwable0;
                }
                loadType1 = loadType2;
                coroutineScope3 = coroutineScope2;
                pageFetcherSnapshot4 = pageFetcherSnapshot3;
                loadStates3 = loadStates2;
                goto label_82;
            }
            case 3: {
                mutex1 = (Mutex)u00.s;
                loadType1 = (LoadType)u00.r;
                coroutineScope3 = (CoroutineScope)u00.q;
                pageFetcherSnapshot4 = (PageFetcherSnapshot)u00.p;
                loadStates3 = (LoadStates)u00.o;
                try {
                    ResultKt.throwOnFailure(object0);
                }
                catch(Throwable throwable0) {
                    mutex1.unlock(null);
                    throw throwable0;
                }
            label_82:
                mutex1.unlock(null);
                coroutineScope1 = coroutineScope3;
                pageFetcherSnapshot2 = pageFetcherSnapshot4;
                loadStates1 = loadStates3;
            label_86:
                if(PageFetcherSnapshot.pageEventFlow.1.4.1.WhenMappings.$EnumSwitchMapping$0[loadType1.ordinal()] == 1) {
                    pageFetcherSnapshot5 = pageFetcherSnapshot2;
                    viewportHint0 = null;
                    loadType3 = loadType1;
                }
                else {
                    pageFetcherSnapshotState$Holder2 = pageFetcherSnapshot2.k;
                    mutex2 = pageFetcherSnapshotState$Holder2.a;
                    u00.o = loadStates1;
                    u00.p = pageFetcherSnapshot2;
                    u00.q = coroutineScope1;
                    u00.r = loadType1;
                    u00.s = pageFetcherSnapshotState$Holder2;
                    u00.t = mutex2;
                    u00.u = loadType1;
                    u00.v = pageFetcherSnapshot2;
                    u00.y = 4;
                    if(mutex2.lock(null, u00) == object1) {
                        return object1;
                    }
                    pageFetcherSnapshot6 = pageFetcherSnapshot2;
                    loadType4 = loadType1;
                    goto label_116;
                }
                goto label_125;
            }
            case 4: {
                pageFetcherSnapshot2 = u00.v;
                loadType1 = (LoadType)u00.u;
                mutex2 = (Mutex)u00.t;
                pageFetcherSnapshotState$Holder2 = (Holder)u00.s;
                loadType4 = (LoadType)u00.r;
                coroutineScope1 = (CoroutineScope)u00.q;
                pageFetcherSnapshot6 = (PageFetcherSnapshot)u00.p;
                loadStates1 = (LoadStates)u00.o;
                ResultKt.throwOnFailure(object0);
            label_116:
                try {
                    viewportHint0 = (ViewportHint)pageFetcherSnapshotState$Holder2.b.getFailedHintsByLoadType$paging_common_release().get(loadType4);
                }
                finally {
                    mutex2.unlock(null);
                }
                pageFetcherSnapshot5 = pageFetcherSnapshot2;
                loadType3 = loadType1;
                loadType1 = loadType4;
                pageFetcherSnapshot2 = pageFetcherSnapshot6;
            label_125:
                u00.o = loadStates1;
                u00.p = pageFetcherSnapshot2;
                u00.q = coroutineScope1;
                u00.r = loadType1;
                u00.s = null;
                u00.t = null;
                u00.u = null;
                u00.v = null;
                u00.y = 5;
                if(PageFetcherSnapshot.access$retryLoadError(pageFetcherSnapshot5, loadType3, viewportHint0, u00) == object1) {
                    return object1;
                }
                pageFetcherSnapshot7 = pageFetcherSnapshot2;
                loadType5 = loadType1;
                coroutineScope4 = coroutineScope1;
                loadStates4 = loadStates1;
                goto label_149;
            }
            case 5: {
                loadType5 = (LoadType)u00.r;
                CoroutineScope coroutineScope5 = (CoroutineScope)u00.q;
                PageFetcherSnapshot pageFetcherSnapshot8 = (PageFetcherSnapshot)u00.p;
                LoadStates loadStates5 = (LoadStates)u00.o;
                ResultKt.throwOnFailure(object0);
                loadStates4 = loadStates5;
                pageFetcherSnapshot7 = pageFetcherSnapshot8;
                coroutineScope4 = coroutineScope5;
            label_149:
                if(loadType5 == LoadType.REFRESH) {
                    pageFetcherSnapshotState$Holder3 = pageFetcherSnapshot7.k;
                    mutex3 = pageFetcherSnapshotState$Holder3.a;
                    u00.o = loadStates4;
                    u00.p = pageFetcherSnapshot7;
                    u00.q = coroutineScope4;
                    u00.r = pageFetcherSnapshotState$Holder3;
                    u00.s = mutex3;
                    u00.y = 6;
                    if(mutex3.lock(null, u00) == object1) {
                        return object1;
                    }
                    goto label_166;
                }
                goto label_173;
            }
            case 6: {
                mutex3 = (Mutex)u00.s;
                pageFetcherSnapshotState$Holder3 = (Holder)u00.r;
                coroutineScope4 = (CoroutineScope)u00.q;
                pageFetcherSnapshot7 = (PageFetcherSnapshot)u00.p;
                loadStates4 = (LoadStates)u00.o;
                ResultKt.throwOnFailure(object0);
            label_166:
                try {
                    LoadState loadState0 = pageFetcherSnapshotState$Holder3.b.getSourceLoadStates$paging_common_release().get(LoadType.REFRESH);
                }
                finally {
                    mutex3.unlock(null);
                }
                if(!(loadState0 instanceof Error)) {
                    PageFetcherSnapshot.access$startConsumingHints(pageFetcherSnapshot7, coroutineScope4);
                }
            label_173:
                loadStates0 = loadStates4;
                coroutineScope0 = coroutineScope4;
                pageFetcherSnapshot1 = pageFetcherSnapshot7;
            label_176:
                loadType6 = LoadType.PREPEND;
                if(loadStates0.getPrepend() instanceof Error) {
                    if(loadType6 == LoadType.REFRESH) {
                        loadType7 = loadType6;
                        loadStates7 = loadStates0;
                        pageFetcherSnapshot10 = pageFetcherSnapshot1;
                        coroutineScope7 = coroutineScope0;
                    }
                    else {
                        pageFetcherSnapshotState$Holder4 = pageFetcherSnapshot1.k;
                        Mutex mutex4 = pageFetcherSnapshotState$Holder4.a;
                        u00.o = loadStates0;
                        u00.p = pageFetcherSnapshot1;
                        u00.q = coroutineScope0;
                        u00.r = loadType6;
                        u00.s = pageFetcherSnapshotState$Holder4;
                        u00.t = mutex4;
                        u00.y = 7;
                        if(mutex4.lock(null, u00) == object1) {
                            return object1;
                        }
                        loadStates6 = loadStates0;
                        mutex5 = mutex4;
                        pageFetcherSnapshot9 = pageFetcherSnapshot1;
                        coroutineScope6 = coroutineScope0;
                        goto label_211;
                    }
                    goto label_236;
                }
                goto label_326;
            }
            case 7: {
                mutex5 = (Mutex)u00.t;
                pageFetcherSnapshotState$Holder4 = (Holder)u00.s;
                LoadType loadType8 = (LoadType)u00.r;
                CoroutineScope coroutineScope8 = (CoroutineScope)u00.q;
                PageFetcherSnapshot pageFetcherSnapshot11 = (PageFetcherSnapshot)u00.p;
                LoadStates loadStates8 = (LoadStates)u00.o;
                ResultKt.throwOnFailure(object0);
                loadType6 = loadType8;
                coroutineScope6 = coroutineScope8;
                pageFetcherSnapshot9 = pageFetcherSnapshot11;
                loadStates6 = loadStates8;
                try {
                label_211:
                    u00.o = loadStates6;
                    u00.p = pageFetcherSnapshot9;
                    u00.q = coroutineScope6;
                    u00.r = loadType6;
                    u00.s = mutex5;
                    u00.t = null;
                    u00.y = 8;
                    if(pageFetcherSnapshot9.e(pageFetcherSnapshotState$Holder4.b, loadType6, u00) == object1) {
                        return object1;
                    }
                }
                catch(Throwable throwable1) {
                    mutex5.unlock(null);
                    throw throwable1;
                }
                loadType7 = loadType6;
                goto label_232;
            }
            case 8: {
                mutex5 = (Mutex)u00.s;
                loadType7 = (LoadType)u00.r;
                coroutineScope6 = (CoroutineScope)u00.q;
                pageFetcherSnapshot9 = (PageFetcherSnapshot)u00.p;
                loadStates6 = (LoadStates)u00.o;
                try {
                    ResultKt.throwOnFailure(object0);
                }
                catch(Throwable throwable1) {
                    mutex5.unlock(null);
                    throw throwable1;
                }
            label_232:
                mutex5.unlock(null);
                coroutineScope7 = coroutineScope6;
                pageFetcherSnapshot10 = pageFetcherSnapshot9;
                loadStates7 = loadStates6;
            label_236:
                if(PageFetcherSnapshot.pageEventFlow.1.4.1.WhenMappings.$EnumSwitchMapping$0[loadType7.ordinal()] == 1) {
                    pageFetcherSnapshot12 = pageFetcherSnapshot10;
                    viewportHint1 = null;
                    loadType9 = loadType7;
                }
                else {
                    pageFetcherSnapshotState$Holder5 = pageFetcherSnapshot10.k;
                    mutex6 = pageFetcherSnapshotState$Holder5.a;
                    u00.o = loadStates7;
                    u00.p = pageFetcherSnapshot10;
                    u00.q = coroutineScope7;
                    u00.r = loadType7;
                    u00.s = pageFetcherSnapshotState$Holder5;
                    u00.t = mutex6;
                    u00.u = loadType7;
                    u00.v = pageFetcherSnapshot10;
                    u00.y = 9;
                    if(mutex6.lock(null, u00) == object1) {
                        return object1;
                    }
                    pageFetcherSnapshot13 = pageFetcherSnapshot10;
                    loadType10 = loadType7;
                    goto label_266;
                }
                goto label_275;
            }
            case 9: {
                pageFetcherSnapshot10 = u00.v;
                loadType7 = (LoadType)u00.u;
                mutex6 = (Mutex)u00.t;
                pageFetcherSnapshotState$Holder5 = (Holder)u00.s;
                loadType10 = (LoadType)u00.r;
                coroutineScope7 = (CoroutineScope)u00.q;
                pageFetcherSnapshot13 = (PageFetcherSnapshot)u00.p;
                loadStates7 = (LoadStates)u00.o;
                ResultKt.throwOnFailure(object0);
            label_266:
                try {
                    viewportHint1 = (ViewportHint)pageFetcherSnapshotState$Holder5.b.getFailedHintsByLoadType$paging_common_release().get(loadType10);
                }
                finally {
                    mutex6.unlock(null);
                }
                pageFetcherSnapshot12 = pageFetcherSnapshot10;
                loadType9 = loadType7;
                loadType7 = loadType10;
                pageFetcherSnapshot10 = pageFetcherSnapshot13;
            label_275:
                u00.o = loadStates7;
                u00.p = pageFetcherSnapshot10;
                u00.q = coroutineScope7;
                u00.r = loadType7;
                u00.s = null;
                u00.t = null;
                u00.u = null;
                u00.v = null;
                u00.y = 10;
                if(PageFetcherSnapshot.access$retryLoadError(pageFetcherSnapshot12, loadType9, viewportHint1, u00) == object1) {
                    return object1;
                }
                pageFetcherSnapshot14 = pageFetcherSnapshot10;
                loadType11 = loadType7;
                coroutineScope9 = coroutineScope7;
                loadStates9 = loadStates7;
                goto label_299;
            }
            case 10: {
                loadType11 = (LoadType)u00.r;
                CoroutineScope coroutineScope10 = (CoroutineScope)u00.q;
                PageFetcherSnapshot pageFetcherSnapshot15 = (PageFetcherSnapshot)u00.p;
                LoadStates loadStates10 = (LoadStates)u00.o;
                ResultKt.throwOnFailure(object0);
                loadStates9 = loadStates10;
                pageFetcherSnapshot14 = pageFetcherSnapshot15;
                coroutineScope9 = coroutineScope10;
            label_299:
                if(loadType11 == LoadType.REFRESH) {
                    pageFetcherSnapshotState$Holder6 = pageFetcherSnapshot14.k;
                    mutex7 = pageFetcherSnapshotState$Holder6.a;
                    u00.o = loadStates9;
                    u00.p = pageFetcherSnapshot14;
                    u00.q = coroutineScope9;
                    u00.r = pageFetcherSnapshotState$Holder6;
                    u00.s = mutex7;
                    u00.y = 11;
                    if(mutex7.lock(null, u00) == object1) {
                        return object1;
                    }
                    goto label_316;
                }
                goto label_323;
            }
            case 11: {
                mutex7 = (Mutex)u00.s;
                pageFetcherSnapshotState$Holder6 = (Holder)u00.r;
                coroutineScope9 = (CoroutineScope)u00.q;
                pageFetcherSnapshot14 = (PageFetcherSnapshot)u00.p;
                loadStates9 = (LoadStates)u00.o;
                ResultKt.throwOnFailure(object0);
            label_316:
                try {
                    LoadState loadState1 = pageFetcherSnapshotState$Holder6.b.getSourceLoadStates$paging_common_release().get(LoadType.REFRESH);
                }
                finally {
                    mutex7.unlock(null);
                }
                if(!(loadState1 instanceof Error)) {
                    PageFetcherSnapshot.access$startConsumingHints(pageFetcherSnapshot14, coroutineScope9);
                }
            label_323:
                loadStates0 = loadStates9;
                coroutineScope0 = coroutineScope9;
                pageFetcherSnapshot1 = pageFetcherSnapshot14;
            label_326:
                loadType12 = LoadType.APPEND;
                if(loadStates0.getAppend() instanceof Error) {
                    if(loadType12 == LoadType.REFRESH) {
                        pageFetcherSnapshot17 = pageFetcherSnapshot1;
                        coroutineScope12 = coroutineScope0;
                    }
                    else {
                        pageFetcherSnapshotState$Holder7 = pageFetcherSnapshot1.k;
                        mutex8 = pageFetcherSnapshotState$Holder7.a;
                        u00.o = pageFetcherSnapshot1;
                        u00.p = coroutineScope0;
                        u00.q = loadType12;
                        u00.r = pageFetcherSnapshotState$Holder7;
                        u00.s = mutex8;
                        u00.y = 12;
                        if(mutex8.lock(null, u00) == object1) {
                            return object1;
                        }
                        pageFetcherSnapshot16 = pageFetcherSnapshot1;
                        coroutineScope11 = coroutineScope0;
                        goto label_354;
                    }
                    goto label_377;
                }
                return Unit.INSTANCE;
            }
            case 12: {
                mutex8 = (Mutex)u00.s;
                pageFetcherSnapshotState$Holder7 = (Holder)u00.r;
                LoadType loadType13 = (LoadType)u00.q;
                CoroutineScope coroutineScope13 = (CoroutineScope)u00.p;
                PageFetcherSnapshot pageFetcherSnapshot18 = (PageFetcherSnapshot)u00.o;
                ResultKt.throwOnFailure(object0);
                loadType12 = loadType13;
                coroutineScope11 = coroutineScope13;
                pageFetcherSnapshot16 = pageFetcherSnapshot18;
                try {
                label_354:
                    u00.o = pageFetcherSnapshot16;
                    u00.p = coroutineScope11;
                    u00.q = loadType12;
                    u00.r = mutex8;
                    u00.s = null;
                    u00.y = 13;
                    if(pageFetcherSnapshot16.e(pageFetcherSnapshotState$Holder7.b, loadType12, u00) == object1) {
                        return object1;
                    }
                }
                catch(Throwable throwable2) {
                    mutex8.unlock(null);
                    throw throwable2;
                }
                loadType14 = loadType12;
                goto label_373;
            }
            case 13: {
                mutex8 = (Mutex)u00.r;
                loadType14 = (LoadType)u00.q;
                coroutineScope11 = (CoroutineScope)u00.p;
                pageFetcherSnapshot16 = (PageFetcherSnapshot)u00.o;
                try {
                    ResultKt.throwOnFailure(object0);
                }
                catch(Throwable throwable2) {
                    mutex8.unlock(null);
                    throw throwable2;
                }
            label_373:
                mutex8.unlock(null);
                loadType12 = loadType14;
                coroutineScope12 = coroutineScope11;
                pageFetcherSnapshot17 = pageFetcherSnapshot16;
            label_377:
                if(PageFetcherSnapshot.pageEventFlow.1.4.1.WhenMappings.$EnumSwitchMapping$0[loadType12.ordinal()] == 1) {
                    loadType15 = loadType12;
                    pageFetcherSnapshot19 = pageFetcherSnapshot17;
                    pageFetcherSnapshot20 = pageFetcherSnapshot19;
                    viewportHint2 = null;
                }
                else {
                    pageFetcherSnapshotState$Holder8 = pageFetcherSnapshot17.k;
                    mutex9 = pageFetcherSnapshotState$Holder8.a;
                    u00.o = pageFetcherSnapshot17;
                    u00.p = coroutineScope12;
                    u00.q = loadType12;
                    u00.r = pageFetcherSnapshotState$Holder8;
                    u00.s = mutex9;
                    u00.t = loadType12;
                    u00.u = pageFetcherSnapshot17;
                    u00.y = 14;
                    if(mutex9.lock(null, u00) == object1) {
                        return object1;
                    }
                    loadType16 = loadType12;
                    loadType15 = loadType16;
                    pageFetcherSnapshot20 = pageFetcherSnapshot17;
                    goto label_407;
                }
                goto label_415;
            }
            case 14: {
                pageFetcherSnapshot17 = (PageFetcherSnapshot)u00.u;
                loadType16 = (LoadType)u00.t;
                mutex9 = (Mutex)u00.s;
                pageFetcherSnapshotState$Holder8 = (Holder)u00.r;
                loadType15 = (LoadType)u00.q;
                coroutineScope12 = (CoroutineScope)u00.p;
                pageFetcherSnapshot20 = (PageFetcherSnapshot)u00.o;
                ResultKt.throwOnFailure(object0);
            label_407:
                try {
                    viewportHint3 = (ViewportHint)pageFetcherSnapshotState$Holder8.b.getFailedHintsByLoadType$paging_common_release().get(loadType15);
                }
                finally {
                    mutex9.unlock(null);
                }
                viewportHint2 = viewportHint3;
                loadType12 = loadType16;
                pageFetcherSnapshot19 = pageFetcherSnapshot17;
            label_415:
                u00.o = pageFetcherSnapshot20;
                u00.p = coroutineScope12;
                u00.q = loadType15;
                u00.r = null;
                u00.s = null;
                u00.t = null;
                u00.u = null;
                u00.y = 15;
                if(PageFetcherSnapshot.access$retryLoadError(pageFetcherSnapshot19, loadType12, viewportHint2, u00) == object1) {
                    return object1;
                }
                loadType17 = loadType15;
                coroutineScope14 = coroutineScope12;
                pageFetcherSnapshot21 = pageFetcherSnapshot20;
                goto label_433;
            }
            case 15: {
                loadType17 = (LoadType)u00.q;
                coroutineScope14 = (CoroutineScope)u00.p;
                pageFetcherSnapshot21 = (PageFetcherSnapshot)u00.o;
                ResultKt.throwOnFailure(object0);
            label_433:
                if(loadType17 == LoadType.REFRESH) {
                    pageFetcherSnapshotState$Holder9 = pageFetcherSnapshot21.k;
                    Mutex mutex10 = pageFetcherSnapshotState$Holder9.a;
                    u00.o = pageFetcherSnapshot21;
                    u00.p = coroutineScope14;
                    u00.q = pageFetcherSnapshotState$Holder9;
                    u00.r = mutex10;
                    u00.y = 16;
                    if(mutex10.lock(null, u00) == object1) {
                        return object1;
                    }
                    mutex11 = mutex10;
                    pageFetcherSnapshot22 = pageFetcherSnapshot21;
                    goto label_451;
                }
                return Unit.INSTANCE;
            }
            case 16: {
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        mutex11 = (Mutex)u00.r;
        pageFetcherSnapshotState$Holder9 = (Holder)u00.q;
        coroutineScope14 = (CoroutineScope)u00.p;
        pageFetcherSnapshot22 = (PageFetcherSnapshot)u00.o;
        ResultKt.throwOnFailure(object0);
    label_451:
        try {
            LoadState loadState2 = pageFetcherSnapshotState$Holder9.b.getSourceLoadStates$paging_common_release().get(LoadType.REFRESH);
        }
        finally {
            mutex11.unlock(null);
        }
        if(!(loadState2 instanceof Error)) {
            PageFetcherSnapshot.access$startConsumingHints(pageFetcherSnapshot22, coroutineScope14);
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    @Override  // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object object0, Continuation continuation0) {
        Unit unit0 = (Unit)object0;
        return this.a(continuation0);
    }
}

