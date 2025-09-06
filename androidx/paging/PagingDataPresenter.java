package androidx.paging;

import androidx.annotation.IntRange;
import androidx.annotation.MainThread;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.k;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o0.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;
import s4.g1;
import s4.h1;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B#\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0003\u0012\u0010\b\u0002\u0010\u0006\u001A\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0005\u00A2\u0006\u0004\b\u0007\u0010\bJ#\u0010\r\u001A\u00070\u000B\u00A2\u0006\u0002\b\f2\f\u0010\n\u001A\b\u0012\u0004\u0012\u00028\u00000\tH\u00A6@\u00A2\u0006\u0004\b\r\u0010\u000EJ#\u0010\u0010\u001A\u00070\u000B\u00A2\u0006\u0002\b\f2\f\u0010\u000F\u001A\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0086@\u00A2\u0006\u0004\b\u0010\u0010\u0011J\u001C\u0010\u0014\u001A\u0004\u0018\u00018\u00002\b\b\u0001\u0010\u0013\u001A\u00020\u0012H\u0087\u0002\u00A2\u0006\u0004\b\u0014\u0010\u0015J\u001B\u0010\u0016\u001A\u0004\u0018\u00018\u00002\b\b\u0001\u0010\u0013\u001A\u00020\u0012H\u0007\u00A2\u0006\u0004\b\u0016\u0010\u0015J\u0013\u0010\u0018\u001A\b\u0012\u0004\u0012\u00028\u00000\u0017\u00A2\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001A\u001A\u00020\u000B\u00A2\u0006\u0004\b\u001A\u0010\u001BJ\r\u0010\u001C\u001A\u00020\u000B\u00A2\u0006\u0004\b\u001C\u0010\u001BJ\u001B\u0010\u001F\u001A\u00020\u000B2\f\u0010\u001E\u001A\b\u0012\u0004\u0012\u00020\u000B0\u001D\u00A2\u0006\u0004\b\u001F\u0010 J\u001B\u0010!\u001A\u00020\u000B2\f\u0010\u001E\u001A\b\u0012\u0004\u0012\u00020\u000B0\u001D\u00A2\u0006\u0004\b!\u0010 J&\u0010$\u001A\u00020\u000B2\u0017\u0010\u001E\u001A\u0013\u0012\t\u0012\u00070#\u00A2\u0006\u0002\b\f\u0012\u0004\u0012\u00020\u000B0\"\u00A2\u0006\u0004\b$\u0010%J&\u0010&\u001A\u00020\u000B2\u0017\u0010\u001E\u001A\u0013\u0012\t\u0012\u00070#\u00A2\u0006\u0002\b\f\u0012\u0004\u0012\u00020\u000B0\"\u00A2\u0006\u0004\b&\u0010%R\u001F\u0010,\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010#0\'8\u0006\u00A2\u0006\f\n\u0004\b(\u0010)\u001A\u0004\b*\u0010+R\u0011\u0010/\u001A\u00020\u00128F\u00A2\u0006\u0006\u001A\u0004\b-\u0010.R\u0017\u00103\u001A\b\u0012\u0004\u0012\u00020\u000B008F\u00A2\u0006\u0006\u001A\u0004\b1\u00102\u00A8\u00064"}, d2 = {"Landroidx/paging/PagingDataPresenter;", "", "T", "Lkotlin/coroutines/CoroutineContext;", "mainContext", "Landroidx/paging/PagingData;", "cachedPagingData", "<init>", "(Lkotlin/coroutines/CoroutineContext;Landroidx/paging/PagingData;)V", "Landroidx/paging/PagingDataEvent;", "event", "", "Lkotlin/jvm/JvmSuppressWildcards;", "presentPagingDataEvent", "(Landroidx/paging/PagingDataEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pagingData", "collectFrom", "(Landroidx/paging/PagingData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "index", "get", "(I)Ljava/lang/Object;", "peek", "Landroidx/paging/ItemSnapshotList;", "snapshot", "()Landroidx/paging/ItemSnapshotList;", "retry", "()V", "refresh", "Lkotlin/Function0;", "listener", "addOnPagesUpdatedListener", "(Lkotlin/jvm/functions/Function0;)V", "removeOnPagesUpdatedListener", "Lkotlin/Function1;", "Landroidx/paging/CombinedLoadStates;", "addLoadStateListener", "(Lkotlin/jvm/functions/Function1;)V", "removeLoadStateListener", "Lkotlinx/coroutines/flow/StateFlow;", "j", "Lkotlinx/coroutines/flow/StateFlow;", "getLoadStateFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "loadStateFlow", "getSize", "()I", "size", "Lkotlinx/coroutines/flow/Flow;", "getOnPagesUpdatedFlow", "()Lkotlinx/coroutines/flow/Flow;", "onPagesUpdatedFlow", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPagingDataPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagingDataPresenter.kt\nandroidx/paging/PagingDataPresenter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 PagingLogger.kt\nandroidx/paging/PagingLoggerKt\n+ 4 LogUtil.kt\nandroidx/paging/internal/LogUtilKt\n*L\n1#1,514:1\n1#2:515\n32#3,10:516\n32#3,10:526\n32#3,10:536\n32#3,8:546\n41#3:559\n27#4,5:554\n*S KotlinDebug\n*F\n+ 1 PagingDataPresenter.kt\nandroidx/paging/PagingDataPresenter\n*L\n264#1:516,10\n299#1:526,10\n320#1:536,10\n472#1:546,8\n472#1:559\n473#1:554,5\n*E\n"})
public abstract class PagingDataPresenter {
    public final CoroutineContext a;
    public HintReceiver b;
    public UiReceiver c;
    public PageStore d;
    public final MutableCombinedLoadStateCollection e;
    public final CopyOnWriteArrayList f;
    public final SingleRunner g;
    public volatile boolean h;
    public volatile int i;
    public final StateFlow j;
    public final MutableSharedFlow k;

    public PagingDataPresenter() {
        this(null, null, 3, null);
    }

    public PagingDataPresenter(@NotNull CoroutineContext coroutineContext0, @Nullable PagingData pagingData0) {
        Intrinsics.checkNotNullParameter(coroutineContext0, "mainContext");
        super();
        this.a = coroutineContext0;
        Insert pageEvent$Insert0 = pagingData0 == null ? null : pagingData0.cachedEvent$paging_common_release();
        this.d = PageStore.Companion.initial$paging_common_release(pageEvent$Insert0);
        MutableCombinedLoadStateCollection mutableCombinedLoadStateCollection0 = new MutableCombinedLoadStateCollection();
        if(pagingData0 != null) {
            Insert pageEvent$Insert1 = pagingData0.cachedEvent$paging_common_release();
            if(pageEvent$Insert1 != null) {
                mutableCombinedLoadStateCollection0.set(pageEvent$Insert1.getSourceLoadStates(), pageEvent$Insert1.getMediatorLoadStates());
            }
        }
        this.e = mutableCombinedLoadStateCollection0;
        this.f = new CopyOnWriteArrayList();
        this.g = new SingleRunner(false, 1, null);
        this.j = mutableCombinedLoadStateCollection0.getStateFlow();
        this.k = SharedFlowKt.MutableSharedFlow(0, 0x40, BufferOverflow.DROP_OLDEST);
        this.addOnPagesUpdatedListener(new e(this, 18));
    }

    public PagingDataPresenter(CoroutineContext coroutineContext0, PagingData pagingData0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            coroutineContext0 = Dispatchers.getMain();
        }
        if((v & 2) != 0) {
            pagingData0 = null;
        }
        this(coroutineContext0, pagingData0);
    }

    public static final CoroutineContext access$getMainContext$p(PagingDataPresenter pagingDataPresenter0) {
        return pagingDataPresenter0.a;
    }

    public static final MutableSharedFlow access$get_onPagesUpdatedFlow$p(PagingDataPresenter pagingDataPresenter0) {
        return pagingDataPresenter0.k;
    }

    public static final Object access$presentNewList(PagingDataPresenter pagingDataPresenter0, List list0, int v, int v1, boolean z, LoadStates loadStates0, LoadStates loadStates1, HintReceiver hintReceiver0, Continuation continuation0) {
        Object object2;
        Object object1;
        PageStore pageStore0;
        h1 h10;
        pagingDataPresenter0.getClass();
        if(continuation0 instanceof h1) {
            h10 = (h1)continuation0;
            int v2 = h10.z;
            if((v2 & 0x80000000) == 0) {
                h10 = new h1(pagingDataPresenter0, continuation0);
            }
            else {
                h10.z = v2 ^ 0x80000000;
            }
        }
        else {
            h10 = new h1(pagingDataPresenter0, continuation0);
        }
        Object object0 = h10.x;
        Unit unit0 = a.getCOROUTINE_SUSPENDED();
        switch(h10.z) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                if(z && loadStates0 == null) {
                    throw new IllegalArgumentException("Cannot dispatch LoadStates in PagingDataPresenter without source LoadStates set.");
                }
                pagingDataPresenter0.h = false;
                pageStore0 = new PageStore(list0, v, v1);
                PageStore pageStore1 = pagingDataPresenter0.d;
                Intrinsics.checkNotNull(pageStore1, "null cannot be cast to non-null type androidx.paging.PlaceholderPaddedList<T of androidx.paging.PagingDataPresenter>");
                pagingDataPresenter0.d = pageStore0;
                pagingDataPresenter0.b = hintReceiver0;
                Refresh pagingDataEvent$Refresh0 = new Refresh(pageStore0, pageStore1);
                h10.o = pagingDataPresenter0;
                h10.p = list0;
                h10.q = loadStates0;
                h10.r = loadStates1;
                h10.s = hintReceiver0;
                h10.t = pageStore0;
                h10.u = v;
                h10.v = v1;
                h10.w = z;
                h10.z = 1;
                if(pagingDataPresenter0.presentPagingDataEvent(pagingDataEvent$Refresh0, h10) == unit0) {
                    return unit0;
                }
                break;
            }
            case 1: {
                z = h10.w;
                v1 = h10.v;
                v = h10.u;
                PageStore pageStore2 = h10.t;
                hintReceiver0 = h10.s;
                loadStates1 = h10.r;
                loadStates0 = h10.q;
                list0 = h10.p;
                PagingDataPresenter pagingDataPresenter1 = h10.o;
                ResultKt.throwOnFailure(object0);
                pageStore0 = pageStore2;
                pagingDataPresenter0 = pagingDataPresenter1;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        PagingLogger pagingLogger0 = PagingLogger.INSTANCE;
        if(pagingLogger0.isLoggable(3)) {
            StringBuilder stringBuilder0 = new StringBuilder("Presenting data (\n                            |   first item: ");
            TransformablePage transformablePage0 = (TransformablePage)CollectionsKt___CollectionsKt.firstOrNull(list0);
            if(transformablePage0 == null) {
                object1 = null;
            }
            else {
                List list1 = transformablePage0.getData();
                object1 = list1 == null ? null : CollectionsKt___CollectionsKt.firstOrNull(list1);
            }
            stringBuilder0.append(object1);
            stringBuilder0.append("\n                            |   last item: ");
            TransformablePage transformablePage1 = (TransformablePage)CollectionsKt___CollectionsKt.lastOrNull(list0);
            if(transformablePage1 == null) {
                object2 = null;
            }
            else {
                List list2 = transformablePage1.getData();
                object2 = list2 == null ? null : CollectionsKt___CollectionsKt.lastOrNull(list2);
            }
            stringBuilder0.append(object2);
            stringBuilder0.append("\n                            |   placeholdersBefore: ");
            stringBuilder0.append(v);
            stringBuilder0.append("\n                            |   placeholdersAfter: ");
            stringBuilder0.append(v1);
            stringBuilder0.append("\n                            |   hintReceiver: ");
            stringBuilder0.append(hintReceiver0);
            stringBuilder0.append("\n                            |   sourceLoadStates: ");
            stringBuilder0.append(loadStates0);
            stringBuilder0.append("\n                        ");
            pagingLogger0.log(3, k.trimMargin$default(((loadStates1 == null ? stringBuilder0.toString() : stringBuilder0.toString() + "|   mediatorLoadStates: " + loadStates1 + '\n') + "|)"), null, 1, null), null);
        }
        if(z) {
            Intrinsics.checkNotNull(loadStates0);
            pagingDataPresenter0.e.set(loadStates0, loadStates1);
        }
        if(pageStore0.getSize() == 0) {
            HintReceiver hintReceiver1 = pagingDataPresenter0.b;
            if(hintReceiver1 != null) {
                hintReceiver1.accessHint(pageStore0.initializeHint());
            }
        }
        return Unit.INSTANCE;
    }

    public final void addLoadStateListener(@NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "listener");
        this.e.addListener(function10);
    }

    public final void addOnPagesUpdatedListener(@NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(function00, "listener");
        this.f.add(function00);
    }

    @Nullable
    public final Object collectFrom(@NotNull PagingData pagingData0, @NotNull Continuation continuation0) {
        g1 g10 = new g1(this, pagingData0, null);
        Object object0 = SingleRunner.runInIsolation$default(this.g, 0, g10, continuation0, 1, null);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    @MainThread
    @Nullable
    public final Object get(@IntRange(from = 0L) int v) {
        this.h = true;
        this.i = v;
        PagingLogger pagingLogger0 = PagingLogger.INSTANCE;
        if(pagingLogger0.isLoggable(2)) {
            pagingLogger0.log(2, "Accessing item index[" + v + ']', null);
        }
        HintReceiver hintReceiver0 = this.b;
        if(hintReceiver0 != null) {
            hintReceiver0.accessHint(this.d.accessHintForPresenterIndex(v));
        }
        return this.d.get(v);
    }

    @NotNull
    public final StateFlow getLoadStateFlow() {
        return this.j;
    }

    @NotNull
    public final Flow getOnPagesUpdatedFlow() {
        return FlowKt.asSharedFlow(this.k);
    }

    public final int getSize() {
        return this.d.getSize();
    }

    @MainThread
    @Nullable
    public final Object peek(@IntRange(from = 0L) int v) {
        return this.d.get(v);
    }

    @Nullable
    public abstract Object presentPagingDataEvent(@NotNull PagingDataEvent arg1, @NotNull Continuation arg2);

    public final void refresh() {
        PagingLogger pagingLogger0 = PagingLogger.INSTANCE;
        if(pagingLogger0.isLoggable(3)) {
            pagingLogger0.log(3, "Refresh signal received", null);
        }
        UiReceiver uiReceiver0 = this.c;
        if(uiReceiver0 != null) {
            uiReceiver0.refresh();
        }
    }

    public final void removeLoadStateListener(@NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "listener");
        this.e.removeListener(function10);
    }

    public final void removeOnPagesUpdatedListener(@NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(function00, "listener");
        this.f.remove(function00);
    }

    public final void retry() {
        PagingLogger pagingLogger0 = PagingLogger.INSTANCE;
        if(pagingLogger0.isLoggable(3)) {
            pagingLogger0.log(3, "Retry signal received", null);
        }
        UiReceiver uiReceiver0 = this.c;
        if(uiReceiver0 != null) {
            uiReceiver0.retry();
        }
    }

    @NotNull
    public final ItemSnapshotList snapshot() {
        return this.d.snapshot();
    }
}

