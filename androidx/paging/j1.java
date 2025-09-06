package androidx.paging;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.k;
import kotlin.collections.o;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import qd.a;
import s4.v1;
import s4.w1;

public final class j1 {
    public final TerminalSeparatorType a;
    public final w1 b;
    public final ArrayList c;
    public boolean d;
    public boolean e;
    public final MutableLoadStateCollection f;
    public LoadStates g;
    public int h;
    public int i;
    public boolean j;
    public boolean k;

    public j1(TerminalSeparatorType terminalSeparatorType0, w1 w10) {
        Intrinsics.checkNotNullParameter(terminalSeparatorType0, "terminalSeparatorType");
        Intrinsics.checkNotNullParameter(w10, "generator");
        super();
        this.a = terminalSeparatorType0;
        this.b = w10;
        this.c = new ArrayList();
        this.f = new MutableLoadStateCollection();
    }

    public final Object a(PageEvent pageEvent0, ContinuationImpl continuationImpl0) {
        PageEvent pageEvent1;
        j1 j10;
        v1 v10;
        if(continuationImpl0 instanceof v1) {
            v10 = (v1)continuationImpl0;
            int v = v10.r;
            if((v & 0x80000000) == 0) {
                v10 = new v1(this, continuationImpl0);
            }
            else {
                v10.r = v ^ 0x80000000;
            }
        }
        else {
            v10 = new v1(this, continuationImpl0);
        }
        LoadStateUpdate pageEvent$LoadStateUpdate0 = v10.p;
        Object object0 = a.getCOROUTINE_SUSPENDED();
        switch(v10.r) {
            case 0: {
                ResultKt.throwOnFailure(pageEvent$LoadStateUpdate0);
                if(pageEvent0 instanceof Insert) {
                    v10.o = this;
                    v10.r = 1;
                    pageEvent$LoadStateUpdate0 = this.b(((Insert)pageEvent0), v10);
                    if(pageEvent$LoadStateUpdate0 == object0) {
                        return object0;
                    }
                    j10 = this;
                    pageEvent1 = pageEvent$LoadStateUpdate0;
                }
                else {
                    MutableLoadStateCollection mutableLoadStateCollection0 = this.f;
                    if(pageEvent0 instanceof Drop) {
                        pageEvent1 = (Drop)pageEvent0;
                        Intrinsics.checkNotNullParameter(pageEvent1, "event");
                        mutableLoadStateCollection0.set(((Drop)pageEvent1).getLoadType(), NotLoading.Companion.getIncomplete$paging_common_release());
                        LoadType loadType0 = LoadType.PREPEND;
                        if(((Drop)pageEvent1).getLoadType() == loadType0) {
                            this.h = ((Drop)pageEvent1).getPlaceholdersRemaining();
                            this.k = false;
                        }
                        else if(((Drop)pageEvent1).getLoadType() == LoadType.APPEND) {
                            this.i = ((Drop)pageEvent1).getPlaceholdersRemaining();
                            this.j = false;
                        }
                        ArrayList arrayList0 = this.c;
                        if(arrayList0.isEmpty()) {
                            if(((Drop)pageEvent1).getLoadType() == loadType0) {
                                this.e = false;
                            }
                            else {
                                this.d = false;
                            }
                        }
                        o.removeAll(arrayList0, new g1(new IntRange(((Drop)pageEvent1).getMinPageOffset(), ((Drop)pageEvent1).getMaxPageOffset())));
                        j10 = this;
                    }
                    else if(pageEvent0 instanceof LoadStateUpdate) {
                        LoadStateUpdate pageEvent$LoadStateUpdate1 = (LoadStateUpdate)pageEvent0;
                        v10.o = this;
                        v10.r = 2;
                        LoadStates loadStates0 = this.g;
                        if(!Intrinsics.areEqual(mutableLoadStateCollection0.snapshot(), pageEvent$LoadStateUpdate1.getSource()) || !Intrinsics.areEqual(loadStates0, pageEvent$LoadStateUpdate1.getMediator())) {
                            mutableLoadStateCollection0.set(pageEvent$LoadStateUpdate1.getSource());
                            this.g = pageEvent$LoadStateUpdate1.getMediator();
                            LoadState loadState0 = null;
                            if(pageEvent$LoadStateUpdate1.getMediator() != null && pageEvent$LoadStateUpdate1.getMediator().getPrepend().getEndOfPaginationReached() && !Intrinsics.areEqual((loadStates0 == null ? null : loadStates0.getPrepend()), pageEvent$LoadStateUpdate1.getMediator().getPrepend())) {
                                pageEvent$LoadStateUpdate1 = this.b(Insert.Companion.Prepend(CollectionsKt__CollectionsKt.emptyList(), this.h, pageEvent$LoadStateUpdate1.getSource(), pageEvent$LoadStateUpdate1.getMediator()), v10);
                            }
                            else if(pageEvent$LoadStateUpdate1.getMediator() == null || !pageEvent$LoadStateUpdate1.getMediator().getAppend().getEndOfPaginationReached()) {
                                Intrinsics.checkNotNull(pageEvent$LoadStateUpdate1, "null cannot be cast to non-null type androidx.paging.PageEvent<R of androidx.paging.SeparatorState>");
                            }
                            else {
                                if(loadStates0 != null) {
                                    loadState0 = loadStates0.getAppend();
                                }
                                if(Intrinsics.areEqual(loadState0, pageEvent$LoadStateUpdate1.getMediator().getAppend())) {
                                    Intrinsics.checkNotNull(pageEvent$LoadStateUpdate1, "null cannot be cast to non-null type androidx.paging.PageEvent<R of androidx.paging.SeparatorState>");
                                }
                                else {
                                    pageEvent$LoadStateUpdate1 = this.b(Insert.Companion.Append(CollectionsKt__CollectionsKt.emptyList(), this.i, pageEvent$LoadStateUpdate1.getSource(), pageEvent$LoadStateUpdate1.getMediator()), v10);
                                }
                            }
                        }
                        else {
                            Intrinsics.checkNotNull(pageEvent$LoadStateUpdate1, "null cannot be cast to non-null type androidx.paging.PageEvent<R of androidx.paging.SeparatorState>");
                        }
                        if(pageEvent$LoadStateUpdate1 == object0) {
                            return object0;
                        }
                        j10 = this;
                        pageEvent1 = pageEvent$LoadStateUpdate1;
                    }
                    else {
                        if(!(pageEvent0 instanceof StaticList)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        v10.o = this;
                        v10.r = 3;
                        pageEvent$LoadStateUpdate0 = this.c(((StaticList)pageEvent0), v10);
                        if(pageEvent$LoadStateUpdate0 == object0) {
                            return object0;
                        }
                        j10 = this;
                        pageEvent1 = pageEvent$LoadStateUpdate0;
                        break;
                    }
                }
                break;
            }
            case 1: {
                j10 = v10.o;
                ResultKt.throwOnFailure(pageEvent$LoadStateUpdate0);
                pageEvent1 = pageEvent$LoadStateUpdate0;
                break;
            }
            case 2: {
                j10 = v10.o;
                ResultKt.throwOnFailure(pageEvent$LoadStateUpdate0);
                pageEvent1 = pageEvent$LoadStateUpdate0;
                break;
            }
            case 3: {
                j10 = v10.o;
                ResultKt.throwOnFailure(pageEvent$LoadStateUpdate0);
                pageEvent1 = pageEvent$LoadStateUpdate0;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ArrayList arrayList1 = j10.c;
        if(j10.d && !arrayList1.isEmpty()) {
            throw new IllegalStateException("deferred endTerm, page stash should be empty");
        }
        if(j10.e && !arrayList1.isEmpty()) {
            throw new IllegalStateException("deferred startTerm, page stash should be empty");
        }
        return pageEvent1;
    }

    public final Object b(Insert pageEvent$Insert0, ContinuationImpl continuationImpl0) {
        ArrayList arrayList35;
        TransformablePage transformablePage35;
        List list5;
        ArrayList arrayList34;
        Object object21;
        TransformablePage transformablePage34;
        ArrayList arrayList36;
        TransformablePage transformablePage32;
        ArrayList arrayList32;
        int v15;
        j1 j117;
        Insert pageEvent$Insert13;
        boolean z13;
        int v14;
        int v13;
        j1 j115;
        Integer integer15;
        boolean z11;
        Object object18;
        TransformablePage transformablePage30;
        int v11;
        Integer integer13;
        Iterator iterator4;
        TransformablePage transformablePage24;
        j1 j113;
        Insert pageEvent$Insert11;
        ArrayList arrayList28;
        ArrayList arrayList27;
        boolean z10;
        TransformablePage transformablePage22;
        Iterator iterator2;
        TransformablePage transformablePage21;
        ArrayList arrayList24;
        ArrayList arrayList23;
        Insert pageEvent$Insert9;
        j1 j111;
        TransformablePage transformablePage20;
        j1 j110;
        Insert pageEvent$Insert8;
        ArrayList arrayList22;
        ArrayList arrayList17;
        ArrayList arrayList16;
        TransformablePage transformablePage16;
        int v9;
        Object object11;
        j1 j18;
        Insert pageEvent$Insert6;
        boolean z7;
        TransformablePage transformablePage15;
        Integer integer9;
        ArrayList arrayList19;
        TransformablePage transformablePage17;
        Integer integer10;
        ArrayList arrayList18;
        j1 j15;
        Insert pageEvent$Insert4;
        ArrayList arrayList12;
        ArrayList arrayList11;
        h1 h11;
        Integer integer5;
        ArrayList arrayList10;
        int v6;
        j1 j14;
        Insert pageEvent$Insert3;
        Integer integer4;
        ArrayList arrayList9;
        TransformablePage transformablePage10;
        TransformablePage transformablePage9;
        boolean z5;
        int v5;
        Object object6;
        TransformablePage transformablePage5;
        TransformablePage transformablePage4;
        TransformablePage transformablePage3;
        ArrayList arrayList5;
        ArrayList arrayList4;
        ArrayList arrayList3;
        boolean z3;
        int v4;
        Insert pageEvent$Insert2;
        j1 j11;
        TransformablePage transformablePage2;
        TransformablePage transformablePage1;
        Integer integer1;
        TransformablePage transformablePage0;
        Integer integer0;
        ArrayList arrayList2;
        ArrayList arrayList1;
        j1 j10;
        Object object3;
        int v1;
        boolean z2;
        boolean z1;
        boolean z;
        h1 h10;
        Insert pageEvent$Insert1 = pageEvent$Insert0;
        if(continuationImpl0 instanceof h1) {
            h10 = (h1)continuationImpl0;
            int v = h10.E;
            if((v & 0x80000000) == 0) {
                h10 = new h1(this, continuationImpl0);
            }
            else {
                h10.E = v ^ 0x80000000;
            }
        }
        else {
            h10 = new h1(this, continuationImpl0);
        }
        Object object0 = h10.C;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(h10.E) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                Intrinsics.checkNotNullParameter(pageEvent$Insert1, "<this>");
                TerminalSeparatorType terminalSeparatorType0 = this.a;
                Intrinsics.checkNotNullParameter(terminalSeparatorType0, "terminalSeparatorType");
                if(pageEvent$Insert0.getLoadType() == LoadType.APPEND) {
                    z = this.e;
                }
                else {
                    switch(SeparatorState.WhenMappings.$EnumSwitchMapping$0[terminalSeparatorType0.ordinal()]) {
                        case 1: {
                            if(pageEvent$Insert0.getSourceLoadStates().getPrepend().getEndOfPaginationReached()) {
                                LoadStates loadStates0 = pageEvent$Insert0.getMediatorLoadStates();
                                if(loadStates0 == null) {
                                    z = true;
                                }
                                else {
                                    LoadState loadState0 = loadStates0.getPrepend();
                                    z = loadState0 != null && !loadState0.getEndOfPaginationReached() ? false : true;
                                }
                            }
                            else {
                                z = false;
                            }
                            break;
                        }
                        case 2: {
                            z = pageEvent$Insert0.getSourceLoadStates().getPrepend().getEndOfPaginationReached();
                            break;
                        }
                        default: {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                }
                Intrinsics.checkNotNullParameter(pageEvent$Insert1, "<this>");
                Intrinsics.checkNotNullParameter(terminalSeparatorType0, "terminalSeparatorType");
                if(pageEvent$Insert0.getLoadType() == LoadType.PREPEND) {
                    z1 = this.d;
                }
                else {
                    switch(SeparatorState.WhenMappings.$EnumSwitchMapping$0[terminalSeparatorType0.ordinal()]) {
                        case 1: {
                            if(pageEvent$Insert0.getSourceLoadStates().getAppend().getEndOfPaginationReached()) {
                                LoadStates loadStates1 = pageEvent$Insert0.getMediatorLoadStates();
                                if(loadStates1 == null) {
                                    z1 = true;
                                }
                                else {
                                    LoadState loadState1 = loadStates1.getAppend();
                                    z1 = loadState1 != null && !loadState1.getEndOfPaginationReached() ? false : true;
                                }
                            }
                            else {
                                z1 = false;
                            }
                            break;
                        }
                        case 2: {
                            z1 = pageEvent$Insert0.getSourceLoadStates().getAppend().getEndOfPaginationReached();
                            break;
                        }
                        default: {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                }
                z2 = z1;
                v1 = 1;
                Iterable iterable0 = pageEvent$Insert0.getPages();
                if(!(iterable0 instanceof Collection) || !((Collection)iterable0).isEmpty()) {
                    for(Object object2: iterable0) {
                        if(!((TransformablePage)object2).getData().isEmpty()) {
                            v1 = 0;
                            break;
                        }
                    }
                }
                if(this.k && pageEvent$Insert0.getLoadType() == LoadType.PREPEND && v1 == 0) {
                    throw new IllegalArgumentException("Additional prepend event after prepend state is done");
                }
                if(this.j && pageEvent$Insert0.getLoadType() == LoadType.APPEND && v1 == 0) {
                    throw new IllegalArgumentException("Additional append event after append state is done");
                }
                this.f.set(pageEvent$Insert0.getSourceLoadStates());
                this.g = pageEvent$Insert0.getMediatorLoadStates();
                if(pageEvent$Insert0.getLoadType() != LoadType.APPEND) {
                    this.h = pageEvent$Insert0.getPlaceholdersBefore();
                }
                if(pageEvent$Insert0.getLoadType() != LoadType.PREPEND) {
                    this.i = pageEvent$Insert0.getPlaceholdersAfter();
                }
                w1 w10 = this.b;
                ArrayList arrayList0 = this.c;
                if(v1 != 0) {
                    if(!z && !z2) {
                        Intrinsics.checkNotNullParameter(pageEvent$Insert1, "<this>");
                        return pageEvent$Insert1;
                    }
                    if(this.k && this.j) {
                        Intrinsics.checkNotNullParameter(pageEvent$Insert1, "<this>");
                        return pageEvent$Insert1;
                    }
                    if(arrayList0.isEmpty()) {
                        if(z && z2 && !this.k && !this.j) {
                            h10.o = this;
                            h10.p = pageEvent$Insert1;
                            h10.E = 1;
                            object3 = w10.invoke(null, null, h10);
                            if(object3 == object1) {
                                return object1;
                            }
                            j10 = this;
                            goto label_166;
                        }
                        if(z2 && !this.j) {
                            this.d = true;
                        }
                        if(z && !this.k) {
                            this.e = true;
                        }
                        Intrinsics.checkNotNullParameter(pageEvent$Insert1, "<this>");
                        return pageEvent$Insert1;
                    }
                }
                arrayList1 = new ArrayList(pageEvent$Insert0.getPages().size());
                arrayList2 = new ArrayList(pageEvent$Insert0.getPages().size());
                if(v1 == 0) {
                    int v2;
                    for(v2 = 0; v2 < CollectionsKt__CollectionsKt.getLastIndex(pageEvent$Insert0.getPages()) && ((TransformablePage)pageEvent$Insert0.getPages().get(v2)).getData().isEmpty(); ++v2) {
                    }
                    integer0 = Boxing.boxInt(v2);
                    transformablePage0 = (TransformablePage)pageEvent$Insert0.getPages().get(v2);
                    int v3;
                    for(v3 = CollectionsKt__CollectionsKt.getLastIndex(pageEvent$Insert0.getPages()); v3 > 0 && ((TransformablePage)pageEvent$Insert0.getPages().get(v3)).getData().isEmpty(); --v3) {
                    }
                    integer1 = Boxing.boxInt(v3);
                    transformablePage1 = (TransformablePage)pageEvent$Insert0.getPages().get(v3);
                }
                else {
                    transformablePage1 = null;
                    transformablePage0 = null;
                    integer0 = null;
                    integer1 = null;
                }
                if(!z || this.k) {
                    j11 = this;
                    pageEvent$Insert2 = pageEvent$Insert1;
                }
                else {
                    this.k = true;
                    if(v1 == 0) {
                        Intrinsics.checkNotNull(transformablePage0);
                        transformablePage2 = transformablePage0;
                    }
                    else {
                        transformablePage2 = (TransformablePage)CollectionsKt___CollectionsKt.first(arrayList0);
                    }
                    Object object4 = CollectionsKt___CollectionsKt.first(transformablePage2.getData());
                    h10.o = this;
                    h10.p = pageEvent$Insert1;
                    h10.q = arrayList1;
                    h10.r = arrayList2;
                    h10.s = transformablePage0;
                    h10.t = integer0;
                    h10.u = transformablePage1;
                    h10.v = integer1;
                    h10.w = transformablePage2;
                    h10.x = arrayList1;
                    h10.y = z2;
                    h10.z = v1;
                    h10.E = 2;
                    Object object5 = w10.invoke(null, object4, h10);
                    if(object5 == object1) {
                        return object1;
                    }
                    j11 = this;
                    pageEvent$Insert2 = pageEvent$Insert1;
                    v4 = v1;
                    z3 = z2;
                    arrayList3 = arrayList1;
                    arrayList4 = arrayList3;
                    arrayList5 = arrayList2;
                    transformablePage3 = transformablePage0;
                    transformablePage4 = transformablePage1;
                    transformablePage5 = transformablePage2;
                    object6 = object5;
                    goto label_198;
                }
                goto label_206;
            }
            case 1: {
                pageEvent$Insert1 = h10.p;
                j1 j12 = h10.o;
                ResultKt.throwOnFailure(object0);
                j10 = j12;
                object3 = object0;
            label_166:
                j10.d = false;
                j10.e = false;
                j10.k = true;
                j10.j = true;
                if(object3 == null) {
                    Intrinsics.checkNotNullParameter(pageEvent$Insert1, "<this>");
                    return pageEvent$Insert1;
                }
                return new Insert(pageEvent$Insert1.getLoadType(), k.listOf(SeparatorsKt.separatorPage(object3, new int[]{0}, 0, 0)), pageEvent$Insert1.getPlaceholdersBefore(), pageEvent$Insert1.getPlaceholdersAfter(), pageEvent$Insert1.getSourceLoadStates(), pageEvent$Insert1.getMediatorLoadStates(), null);
            }
            case 2: {
                v4 = h10.z;
                boolean z4 = h10.y;
                ArrayList arrayList6 = h10.x;
                TransformablePage transformablePage6 = (TransformablePage)h10.w;
                Integer integer2 = (Integer)h10.v;
                TransformablePage transformablePage7 = (TransformablePage)h10.u;
                Integer integer3 = (Integer)h10.t;
                TransformablePage transformablePage8 = (TransformablePage)h10.s;
                ArrayList arrayList7 = h10.r;
                ArrayList arrayList8 = h10.q;
                pageEvent$Insert2 = h10.p;
                j1 j13 = h10.o;
                ResultKt.throwOnFailure(object0);
                arrayList5 = arrayList7;
                arrayList4 = arrayList8;
                j11 = j13;
                integer1 = integer2;
                integer0 = integer3;
                transformablePage3 = transformablePage8;
                transformablePage5 = transformablePage6;
                transformablePage4 = transformablePage7;
                object6 = object0;
                z3 = z4;
                arrayList3 = arrayList6;
            label_198:
                List list0 = transformablePage5.getHintOriginalIndices();
                SeparatorsKt.addSeparatorPage(arrayList3, object6, null, transformablePage5, transformablePage5.getHintOriginalPageOffset(), (list0 == null ? 0 : ((Number)CollectionsKt___CollectionsKt.first(list0)).intValue()));
                z2 = z3;
                transformablePage1 = transformablePage4;
                transformablePage0 = transformablePage3;
                arrayList2 = arrayList5;
                arrayList1 = arrayList4;
                v1 = v4;
            label_206:
                if(v1 == 0) {
                    Intrinsics.checkNotNull(integer0);
                    v5 = (int)integer0;
                    z5 = z2;
                    transformablePage9 = transformablePage1;
                    transformablePage10 = transformablePage0;
                    arrayList9 = arrayList2;
                    integer4 = integer0;
                    pageEvent$Insert3 = pageEvent$Insert2;
                    j14 = j11;
                    v6 = 0;
                    arrayList10 = arrayList1;
                    integer5 = integer1;
                    goto label_255;
                }
                else {
                    h11 = h10;
                    arrayList11 = arrayList1;
                    arrayList12 = arrayList2;
                    pageEvent$Insert4 = pageEvent$Insert2;
                    j15 = j11;
                }
                goto label_638;
            }
            case 3: {
                int v7 = h10.B;
                v6 = h10.A;
                int v8 = h10.z;
                boolean z6 = h10.y;
                ArrayList arrayList13 = (ArrayList)h10.w;
                Integer integer6 = (Integer)h10.v;
                TransformablePage transformablePage11 = (TransformablePage)h10.u;
                Integer integer7 = (Integer)h10.t;
                TransformablePage transformablePage12 = (TransformablePage)h10.s;
                ArrayList arrayList14 = h10.r;
                ArrayList arrayList15 = h10.q;
                Insert pageEvent$Insert5 = h10.p;
                j1 j16 = h10.o;
                ResultKt.throwOnFailure(object0);
                j1 j17 = j16;
                Integer integer8 = integer6;
                integer4 = integer7;
                arrayList9 = arrayList14;
                pageEvent$Insert3 = pageEvent$Insert5;
                v5 = v7;
                while(true) {
                    arrayList13.add(object0);
                    ++v6;
                    v1 = v8;
                    z5 = z6;
                    transformablePage9 = transformablePage11;
                    transformablePage10 = transformablePage12;
                    arrayList10 = arrayList15;
                    integer5 = integer8;
                    j14 = j17;
                label_255:
                    if(v6 >= v5) {
                        break;
                    }
                    TransformablePage transformablePage13 = (TransformablePage)pageEvent$Insert3.getPages().get(v6);
                    h10.o = j14;
                    h10.p = pageEvent$Insert3;
                    h10.q = arrayList10;
                    h10.r = arrayList9;
                    h10.s = transformablePage10;
                    h10.t = integer4;
                    h10.u = transformablePage9;
                    h10.v = integer5;
                    h10.w = arrayList10;
                    integer8 = integer5;
                    h10.x = null;
                    h10.y = z5;
                    h10.z = v1;
                    h10.A = v6;
                    h10.B = v5;
                    h10.E = 3;
                    Object object7 = SeparatorsKt.insertInternalSeparators(transformablePage13, j14.b, h10);
                    if(object7 == object1) {
                        return object1;
                    }
                    z6 = z5;
                    v8 = v1;
                    object0 = object7;
                    j17 = j14;
                    arrayList15 = arrayList10;
                    transformablePage12 = transformablePage10;
                    transformablePage11 = transformablePage9;
                    arrayList13 = arrayList15;
                }
                if(pageEvent$Insert3.getLoadType() != LoadType.APPEND || j14.c.isEmpty()) {
                    v9 = v1;
                    z2 = z5;
                    arrayList18 = arrayList10;
                    integer10 = integer5;
                    transformablePage17 = transformablePage10;
                    arrayList19 = arrayList9;
                }
                else {
                    TransformablePage transformablePage14 = (TransformablePage)CollectionsKt___CollectionsKt.last(j14.c);
                    Object object8 = CollectionsKt___CollectionsKt.last(transformablePage14.getData());
                    Intrinsics.checkNotNull(transformablePage10);
                    Object object9 = CollectionsKt___CollectionsKt.first(transformablePage10.getData());
                    h10.o = j14;
                    h10.p = pageEvent$Insert3;
                    h10.q = arrayList10;
                    h10.r = arrayList9;
                    h10.s = transformablePage10;
                    h10.t = integer4;
                    h10.u = transformablePage9;
                    integer9 = integer5;
                    h10.v = integer9;
                    h10.w = transformablePage14;
                    h10.x = null;
                    h10.y = z5;
                    h10.z = v1;
                    h10.E = 4;
                    Object object10 = j14.b.invoke(object8, object9, h10);
                    if(object10 == object1) {
                        return object1;
                    }
                    transformablePage15 = transformablePage14;
                    z7 = z5;
                    pageEvent$Insert6 = pageEvent$Insert3;
                    j18 = j14;
                    object11 = object10;
                    v9 = v1;
                    transformablePage16 = transformablePage9;
                    arrayList16 = arrayList9;
                    arrayList17 = arrayList10;
                    goto label_345;
                }
                goto label_355;
            }
            case 4: {
                v9 = h10.z;
                boolean z8 = h10.y;
                TransformablePage transformablePage18 = (TransformablePage)h10.w;
                Integer integer11 = (Integer)h10.v;
                TransformablePage transformablePage19 = (TransformablePage)h10.u;
                integer4 = (Integer)h10.t;
                transformablePage10 = (TransformablePage)h10.s;
                ArrayList arrayList20 = h10.r;
                ArrayList arrayList21 = h10.q;
                Insert pageEvent$Insert7 = h10.p;
                j1 j19 = h10.o;
                ResultKt.throwOnFailure(object0);
                z7 = z8;
                integer9 = integer11;
                pageEvent$Insert6 = pageEvent$Insert7;
                j18 = j19;
                transformablePage15 = transformablePage18;
                arrayList16 = arrayList20;
                arrayList17 = arrayList21;
                object11 = object0;
                transformablePage16 = transformablePage19;
            label_345:
                transformablePage17 = transformablePage10;
                List list1 = transformablePage17.getHintOriginalIndices();
                SeparatorsKt.addSeparatorPage(arrayList17, object11, transformablePage15, transformablePage17, transformablePage17.getHintOriginalPageOffset(), (list1 == null ? 0 : ((Number)CollectionsKt___CollectionsKt.first(list1)).intValue()));
                z2 = z7;
                transformablePage9 = transformablePage16;
                arrayList19 = arrayList16;
                arrayList18 = arrayList17;
                integer10 = integer9;
                pageEvent$Insert3 = pageEvent$Insert6;
                j14 = j18;
            label_355:
                Intrinsics.checkNotNull(transformablePage17);
                j14.getClass();
                arrayList19.add(j1.d(transformablePage17));
                h10.o = j14;
                h10.p = pageEvent$Insert3;
                h10.q = arrayList18;
                h10.r = arrayList19;
                h10.s = integer4;
                h10.t = transformablePage9;
                h10.u = integer10;
                h10.v = arrayList18;
                h10.w = null;
                h10.x = null;
                h10.y = z2;
                h10.z = v9;
                h10.E = 5;
                object0 = SeparatorsKt.insertInternalSeparators(transformablePage17, j14.b, h10);
                if(object0 == object1) {
                    return object1;
                }
                arrayList22 = arrayList18;
                pageEvent$Insert8 = pageEvent$Insert3;
                j110 = j14;
                goto label_389;
            }
            case 5: {
                v9 = h10.z;
                z2 = h10.y;
                arrayList18 = (ArrayList)h10.v;
                integer10 = (Integer)h10.u;
                transformablePage9 = (TransformablePage)h10.t;
                integer4 = (Integer)h10.s;
                arrayList19 = h10.r;
                arrayList22 = h10.q;
                pageEvent$Insert8 = h10.p;
                j110 = h10.o;
                ResultKt.throwOnFailure(object0);
            label_389:
                arrayList18.add(object0);
                Intrinsics.checkNotNull(integer10);
                Iterator iterator1 = pageEvent$Insert8.getPages().subList(((int)integer4), ((int)integer10) + 1).iterator();
                if(!iterator1.hasNext()) {
                    throw new UnsupportedOperationException("Empty collection can\'t be reduced.");
                }
                transformablePage20 = iterator1.next();
                j111 = j110;
                pageEvent$Insert9 = pageEvent$Insert8;
                arrayList23 = arrayList22;
                arrayList24 = arrayList19;
                transformablePage21 = transformablePage9;
                iterator2 = iterator1;
                goto label_445;
            }
            case 6: {
                v9 = h10.z;
                boolean z9 = h10.y;
                transformablePage22 = (TransformablePage)h10.w;
                TransformablePage transformablePage23 = (TransformablePage)h10.v;
                Iterator iterator3 = (Iterator)h10.u;
                Integer integer12 = (Integer)h10.t;
                transformablePage21 = (TransformablePage)h10.s;
                ArrayList arrayList25 = h10.r;
                ArrayList arrayList26 = h10.q;
                Insert pageEvent$Insert10 = h10.p;
                j1 j112 = h10.o;
                ResultKt.throwOnFailure(object0);
                z10 = z9;
                arrayList27 = arrayList25;
                arrayList28 = arrayList26;
                pageEvent$Insert11 = pageEvent$Insert10;
                j113 = j112;
                transformablePage24 = transformablePage23;
                iterator4 = iterator3;
                integer13 = integer12;
                goto label_476;
            }
            case 7: {
                v9 = h10.z;
                z2 = h10.y;
                ArrayList arrayList29 = h10.x;
                TransformablePage transformablePage25 = (TransformablePage)h10.w;
                TransformablePage transformablePage26 = (TransformablePage)h10.v;
                Iterator iterator5 = (Iterator)h10.u;
                Integer integer14 = (Integer)h10.t;
                TransformablePage transformablePage27 = (TransformablePage)h10.s;
                ArrayList arrayList30 = h10.r;
                ArrayList arrayList31 = h10.q;
                Insert pageEvent$Insert12 = h10.p;
                j1 j114 = h10.o;
                ResultKt.throwOnFailure(object0);
                while(true) {
                    arrayList29.add(object0);
                    transformablePage20 = transformablePage26.getData().isEmpty() ? transformablePage25 : transformablePage26;
                    iterator2 = iterator5;
                    integer10 = integer14;
                    transformablePage21 = transformablePage27;
                    arrayList24 = arrayList30;
                    arrayList23 = arrayList31;
                    j111 = j114;
                    pageEvent$Insert9 = pageEvent$Insert12;
                label_445:
                    if(!iterator2.hasNext()) {
                        break;
                    }
                    Object object12 = iterator2.next();
                    TransformablePage transformablePage28 = (TransformablePage)object12;
                    transformablePage22 = transformablePage20;
                    if(transformablePage28.getData().isEmpty()) {
                        pageEvent$Insert12 = pageEvent$Insert9;
                        transformablePage27 = transformablePage21;
                        transformablePage26 = transformablePage28;
                        transformablePage25 = transformablePage22;
                        j114 = j111;
                        arrayList30 = arrayList24;
                        iterator5 = iterator2;
                        integer14 = integer10;
                        arrayList29 = arrayList23;
                    }
                    else {
                        Object object13 = CollectionsKt___CollectionsKt.last(transformablePage22.getData());
                        Object object14 = CollectionsKt___CollectionsKt.first(transformablePage28.getData());
                        h10.o = j111;
                        h10.p = pageEvent$Insert9;
                        h10.q = arrayList23;
                        h10.r = arrayList24;
                        h10.s = transformablePage21;
                        h10.t = integer10;
                        h10.u = iterator2;
                        h10.v = transformablePage28;
                        h10.w = transformablePage22;
                        h10.x = null;
                        h10.y = z2;
                        h10.z = v9;
                        h10.E = 6;
                        object0 = j111.b.invoke(object13, object14, h10);
                        if(object0 == object1) {
                            return object1;
                        }
                        z10 = z2;
                        arrayList27 = arrayList24;
                        arrayList28 = arrayList23;
                        pageEvent$Insert11 = pageEvent$Insert9;
                        j113 = j111;
                        transformablePage24 = transformablePage28;
                        integer13 = integer10;
                        iterator4 = iterator2;
                    label_476:
                        int v10 = pageEvent$Insert11.getLoadType() == LoadType.PREPEND ? transformablePage22.getHintOriginalPageOffset() : transformablePage24.getHintOriginalPageOffset();
                        if(pageEvent$Insert11.getLoadType() == LoadType.PREPEND) {
                            List list2 = transformablePage22.getHintOriginalIndices();
                            v11 = list2 == null ? CollectionsKt__CollectionsKt.getLastIndex(transformablePage22.getData()) : ((Number)CollectionsKt___CollectionsKt.last(list2)).intValue();
                        }
                        else {
                            List list3 = transformablePage24.getHintOriginalIndices();
                            v11 = list3 == null ? 0 : ((Number)CollectionsKt___CollectionsKt.first(list3)).intValue();
                        }
                        SeparatorsKt.addSeparatorPage(arrayList28, object0, transformablePage22, transformablePage24, v10, v11);
                        z2 = z10;
                        transformablePage25 = transformablePage22;
                        transformablePage26 = transformablePage24;
                        iterator5 = iterator4;
                        integer14 = integer13;
                        transformablePage27 = transformablePage21;
                        arrayList30 = arrayList27;
                        arrayList29 = arrayList28;
                        pageEvent$Insert12 = pageEvent$Insert11;
                        j114 = j113;
                    }
                    if(!transformablePage26.getData().isEmpty()) {
                        j114.getClass();
                        arrayList30.add(j1.d(transformablePage26));
                    }
                    h10.o = j114;
                    h10.p = pageEvent$Insert12;
                    h10.q = arrayList29;
                    h10.r = arrayList30;
                    h10.s = transformablePage27;
                    h10.t = integer14;
                    h10.u = iterator5;
                    h10.v = transformablePage26;
                    h10.w = transformablePage25;
                    h10.x = arrayList29;
                    h10.y = z2;
                    h10.z = v9;
                    h10.E = 7;
                    object0 = SeparatorsKt.insertInternalSeparators(transformablePage26, j114.b, h10);
                    if(object0 == object1) {
                        return object1;
                    }
                    arrayList31 = arrayList29;
                }
                if(pageEvent$Insert9.getLoadType() != LoadType.PREPEND || j111.c.isEmpty()) {
                    v1 = v9;
                    transformablePage1 = transformablePage21;
                }
                else {
                    TransformablePage transformablePage29 = (TransformablePage)CollectionsKt___CollectionsKt.first(j111.c);
                    Intrinsics.checkNotNull(transformablePage21);
                    Object object15 = CollectionsKt___CollectionsKt.last(transformablePage21.getData());
                    Object object16 = CollectionsKt___CollectionsKt.first(transformablePage29.getData());
                    h10.o = j111;
                    h10.p = pageEvent$Insert9;
                    h10.q = arrayList23;
                    h10.r = arrayList24;
                    h10.s = transformablePage21;
                    h10.t = integer10;
                    h10.u = transformablePage29;
                    h10.v = null;
                    h10.w = null;
                    h10.x = null;
                    h10.y = z2;
                    h10.z = v9;
                    h10.E = 8;
                    Object object17 = j111.b.invoke(object15, object16, h10);
                    if(object17 == object1) {
                        return object1;
                    }
                    transformablePage30 = transformablePage29;
                    object18 = object17;
                    z11 = z2;
                    integer15 = integer10;
                    j115 = j111;
                    goto label_570;
                }
                goto label_577;
            }
            case 8: {
                v9 = h10.z;
                boolean z12 = h10.y;
                TransformablePage transformablePage31 = (TransformablePage)h10.u;
                Integer integer16 = (Integer)h10.t;
                transformablePage21 = (TransformablePage)h10.s;
                arrayList24 = h10.r;
                arrayList23 = h10.q;
                pageEvent$Insert9 = h10.p;
                j1 j116 = h10.o;
                ResultKt.throwOnFailure(object0);
                object18 = object0;
                z11 = z12;
                integer15 = integer16;
                j115 = j116;
                transformablePage30 = transformablePage31;
            label_570:
                List list4 = transformablePage21.getHintOriginalIndices();
                SeparatorsKt.addSeparatorPage(arrayList23, object18, transformablePage21, transformablePage30, transformablePage21.getHintOriginalPageOffset(), (list4 == null ? CollectionsKt__CollectionsKt.getLastIndex(transformablePage21.getData()) : ((Number)CollectionsKt___CollectionsKt.last(list4)).intValue()));
                z2 = z11;
                integer10 = integer15;
                transformablePage1 = transformablePage21;
                j111 = j115;
                v1 = v9;
            label_577:
                int v12 = (int)integer10;
                v13 = CollectionsKt__CollectionsKt.getLastIndex(pageEvent$Insert9.getPages());
                if(v12 + 1 <= v13) {
                    v14 = v1;
                    z13 = z2;
                    pageEvent$Insert13 = pageEvent$Insert9;
                    j117 = j111;
                    v15 = v12 + 1;
                    arrayList12 = arrayList24;
                    arrayList32 = arrayList23;
                    transformablePage32 = transformablePage1;
                    goto label_610;
                }
                else {
                    h11 = h10;
                    arrayList11 = arrayList23;
                    pageEvent$Insert4 = pageEvent$Insert9;
                    j15 = j111;
                    arrayList12 = arrayList24;
                }
                goto label_638;
            }
            case 9: {
                v13 = h10.B;
                v15 = h10.A;
                v14 = h10.z;
                z13 = h10.y;
                arrayList32 = (ArrayList)h10.t;
                transformablePage32 = (TransformablePage)h10.s;
                arrayList12 = h10.r;
                ArrayList arrayList33 = h10.q;
                pageEvent$Insert13 = h10.p;
                j117 = h10.o;
                ResultKt.throwOnFailure(object0);
                while(true) {
                    arrayList32.add(object0);
                    if(v15 == v13) {
                        break;
                    }
                    ++v15;
                    arrayList32 = arrayList33;
                label_610:
                    TransformablePage transformablePage33 = (TransformablePage)pageEvent$Insert13.getPages().get(v15);
                    h10.o = j117;
                    h10.p = pageEvent$Insert13;
                    h10.q = arrayList32;
                    h10.r = arrayList12;
                    h10.s = transformablePage32;
                    h10.t = arrayList32;
                    h10.u = null;
                    h10.v = null;
                    h10.w = null;
                    h10.x = null;
                    h10.y = z13;
                    h10.z = v14;
                    h10.A = v15;
                    h10.B = v13;
                    h10.E = 9;
                    object0 = SeparatorsKt.insertInternalSeparators(transformablePage33, j117.b, h10);
                    if(object0 == object1) {
                        return object1;
                    }
                    arrayList33 = arrayList32;
                }
                h11 = h10;
                v1 = v14;
                j15 = j117;
                z2 = z13;
                transformablePage1 = transformablePage32;
                arrayList11 = arrayList33;
                pageEvent$Insert4 = pageEvent$Insert13;
            label_638:
                if(!z2 || j15.j) {
                    arrayList36 = arrayList11;
                }
                else {
                    j15.j = true;
                    if(v1 == 0) {
                        Intrinsics.checkNotNull(transformablePage1);
                        transformablePage34 = transformablePage1;
                    }
                    else {
                        transformablePage34 = (TransformablePage)CollectionsKt___CollectionsKt.last(j15.c);
                    }
                    Object object19 = CollectionsKt___CollectionsKt.last(transformablePage34.getData());
                    h11.o = j15;
                    h11.p = pageEvent$Insert4;
                    h11.q = arrayList11;
                    h11.r = arrayList12;
                    h11.s = transformablePage34;
                    h11.t = arrayList11;
                    h11.u = null;
                    h11.v = null;
                    h11.w = null;
                    h11.x = null;
                    h11.E = 10;
                    Object object20 = j15.b.invoke(object19, null, h11);
                    if(object20 == object1) {
                        return object1;
                    }
                    object21 = object20;
                    arrayList34 = arrayList11;
                    list5 = arrayList34;
                    transformablePage35 = transformablePage34;
                    arrayList35 = arrayList12;
                    goto label_678;
                }
                break;
            }
            case 10: {
                List list6 = (List)h10.t;
                TransformablePage transformablePage36 = (TransformablePage)h10.s;
                arrayList35 = h10.r;
                arrayList34 = h10.q;
                pageEvent$Insert4 = h10.p;
                j15 = h10.o;
                ResultKt.throwOnFailure(object0);
                list5 = list6;
                object21 = object0;
                transformablePage35 = transformablePage36;
            label_678:
                List list7 = transformablePage35.getHintOriginalIndices();
                SeparatorsKt.addSeparatorPage(list5, object21, transformablePage35, null, transformablePage35.getHintOriginalPageOffset(), (list7 == null ? CollectionsKt__CollectionsKt.getLastIndex(transformablePage35.getData()) : ((Number)CollectionsKt___CollectionsKt.last(list7)).intValue()));
                arrayList12 = arrayList35;
                arrayList36 = arrayList34;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        j15.d = false;
        j15.e = false;
        ArrayList arrayList37 = j15.c;
        if(pageEvent$Insert4.getLoadType() == LoadType.APPEND) {
            arrayList37.addAll(arrayList12);
            return new Insert(pageEvent$Insert4.getLoadType(), arrayList36, pageEvent$Insert4.getPlaceholdersBefore(), pageEvent$Insert4.getPlaceholdersAfter(), pageEvent$Insert4.getSourceLoadStates(), pageEvent$Insert4.getMediatorLoadStates(), null);
        }
        arrayList37.addAll(0, arrayList12);
        return new Insert(pageEvent$Insert4.getLoadType(), arrayList36, pageEvent$Insert4.getPlaceholdersBefore(), pageEvent$Insert4.getPlaceholdersAfter(), pageEvent$Insert4.getSourceLoadStates(), pageEvent$Insert4.getMediatorLoadStates(), null);
    }

    public final Object c(StaticList pageEvent$StaticList0, ContinuationImpl continuationImpl0) {
        List list1;
        j1 j10;
        int v2;
        int v1;
        List list0;
        i1 i10;
        if(continuationImpl0 instanceof i1) {
            i10 = (i1)continuationImpl0;
            int v = i10.w;
            if((v & 0x80000000) == 0) {
                i10 = new i1(this, continuationImpl0);
            }
            else {
                i10.w = v ^ 0x80000000;
            }
        }
        else {
            i10 = new i1(this, continuationImpl0);
        }
        Object object0 = i10.u;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(i10.w) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                list0 = new ArrayList();
                v1 = pageEvent$StaticList0.getData().size();
                if(v1 >= 0) {
                    v2 = 0;
                    j10 = this;
                    list1 = list0;
                    goto label_38;
                }
                break;
            }
            case 1: {
                int v3 = i10.t;
                int v4 = i10.s;
                Object object2 = i10.r;
                list1 = i10.q;
                StaticList pageEvent$StaticList1 = i10.p;
                j10 = i10.o;
                ResultKt.throwOnFailure(object0);
                int v5 = v3;
                pageEvent$StaticList0 = pageEvent$StaticList1;
                Object object3 = object2;
                while(true) {
                    if(object0 != null) {
                        list1.add(object0);
                    }
                    if(object3 != null) {
                        list1.add(object3);
                    }
                    if(v4 == v5) {
                        break;
                    }
                    v1 = v5;
                    v2 = v4 + 1;
                label_38:
                    Object object4 = CollectionsKt___CollectionsKt.getOrNull(pageEvent$StaticList0.getData(), v2 - 1);
                    object3 = CollectionsKt___CollectionsKt.getOrNull(pageEvent$StaticList0.getData(), v2);
                    i10.o = j10;
                    i10.p = pageEvent$StaticList0;
                    i10.q = list1;
                    i10.r = object3;
                    i10.s = v2;
                    i10.t = v1;
                    i10.w = 1;
                    object0 = j10.b.invoke(object4, object3, i10);
                    if(object0 == object1) {
                        return object1;
                    }
                    v5 = v1;
                    v4 = v2;
                }
                list0 = list1;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return new StaticList(list0, pageEvent$StaticList0.getSourceLoadStates(), pageEvent$StaticList0.getMediatorLoadStates());
    }

    public static TransformablePage d(TransformablePage transformablePage0) {
        int[] arr_v = transformablePage0.getOriginalPageOffsets();
        List list0 = CollectionsKt__CollectionsKt.listOf(new Object[]{CollectionsKt___CollectionsKt.first(transformablePage0.getData()), CollectionsKt___CollectionsKt.last(transformablePage0.getData())});
        int v = transformablePage0.getHintOriginalPageOffset();
        List list1 = transformablePage0.getHintOriginalIndices();
        Integer integer0 = (int)(list1 == null ? 0 : ((Number)CollectionsKt___CollectionsKt.first(list1)).intValue());
        List list2 = transformablePage0.getHintOriginalIndices();
        return list2 == null ? new TransformablePage(arr_v, list0, v, CollectionsKt__CollectionsKt.listOf(new Integer[]{integer0, CollectionsKt__CollectionsKt.getLastIndex(transformablePage0.getData())})) : new TransformablePage(arr_v, list0, v, CollectionsKt__CollectionsKt.listOf(new Integer[]{integer0, ((Number)CollectionsKt___CollectionsKt.last(list2)).intValue()}));
    }
}

