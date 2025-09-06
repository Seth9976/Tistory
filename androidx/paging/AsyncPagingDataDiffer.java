package androidx.paging;

import android.os.Handler;
import androidx.annotation.IntRange;
import androidx.annotation.MainThread;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleKt;
import androidx.recyclerview.widget.DiffUtil.ItemCallback;
import androidx.recyclerview.widget.ListUpdateCallback;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import md.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;
import s4.d;
import s4.e;
import s4.f;
import s4.g;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B3\b\u0007\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\b\b\u0002\u0010\b\u001A\u00020\u0007\u0012\b\b\u0002\u0010\t\u001A\u00020\u0007\u00A2\u0006\u0004\b\n\u0010\u000BB)\b\u0017\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\b\b\u0002\u0010\b\u001A\u00020\f\u00A2\u0006\u0004\b\n\u0010\rB3\b\u0017\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\b\b\u0002\u0010\b\u001A\u00020\f\u0012\b\b\u0002\u0010\t\u001A\u00020\f\u00A2\u0006\u0004\b\n\u0010\u000EJ\u001E\u0010\u0012\u001A\u00020\u00112\f\u0010\u0010\u001A\b\u0012\u0004\u0012\u00028\u00000\u000FH\u0086@\u00A2\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0012\u001A\u00020\u00112\u0006\u0010\u0015\u001A\u00020\u00142\f\u0010\u0010\u001A\b\u0012\u0004\u0012\u00028\u00000\u000F\u00A2\u0006\u0004\b\u0012\u0010\u0016J\r\u0010\u0017\u001A\u00020\u0011\u00A2\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001A\u00020\u0011\u00A2\u0006\u0004\b\u0019\u0010\u0018J\u001B\u0010\u001C\u001A\u0004\u0018\u00018\u00002\b\b\u0001\u0010\u001B\u001A\u00020\u001AH\u0007\u00A2\u0006\u0004\b\u001C\u0010\u001DJ\u001B\u0010\u001E\u001A\u0004\u0018\u00018\u00002\b\b\u0001\u0010\u001B\u001A\u00020\u001AH\u0007\u00A2\u0006\u0004\b\u001E\u0010\u001DJ\u0013\u0010 \u001A\b\u0012\u0004\u0012\u00028\u00000\u001F\u00A2\u0006\u0004\b \u0010!J\u001B\u0010$\u001A\u00020\u00112\f\u0010#\u001A\b\u0012\u0004\u0012\u00020\u00110\"\u00A2\u0006\u0004\b$\u0010%J\u001B\u0010&\u001A\u00020\u00112\f\u0010#\u001A\b\u0012\u0004\u0012\u00020\u00110\"\u00A2\u0006\u0004\b&\u0010%J!\u0010)\u001A\u00020\u00112\u0012\u0010#\u001A\u000E\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00110\'\u00A2\u0006\u0004\b)\u0010*J!\u0010+\u001A\u00020\u00112\u0012\u0010#\u001A\u000E\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00110\'\u00A2\u0006\u0004\b+\u0010*J#\u0010-\u001A\u00020\u00112\u0012\u0010#\u001A\u000E\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00110\'H\u0000\u00A2\u0006\u0004\b,\u0010*R \u00104\u001A\b\u0012\u0004\u0012\u00020/0.8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b0\u00101\u001A\u0004\b2\u00103R \u0010:\u001A\b\u0012\u0004\u0012\u00028\u0000058\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b6\u00107\u001A\u0004\b8\u00109R\u001D\u0010@\u001A\b\u0012\u0004\u0012\u00020(0;8\u0006\u00A2\u0006\f\n\u0004\b<\u0010=\u001A\u0004\b>\u0010?R\u001D\u0010C\u001A\b\u0012\u0004\u0012\u00020\u00110;8\u0006\u00A2\u0006\f\n\u0004\bA\u0010=\u001A\u0004\bB\u0010?R&\u0010H\u001A\u000E\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00110\'8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\bD\u0010E\u001A\u0004\bF\u0010GR\u0011\u0010K\u001A\u00020\u001A8F\u00A2\u0006\u0006\u001A\u0004\bI\u0010J\u00A8\u0006L"}, d2 = {"Landroidx/paging/AsyncPagingDataDiffer;", "", "T", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "diffCallback", "Landroidx/recyclerview/widget/ListUpdateCallback;", "updateCallback", "Lkotlin/coroutines/CoroutineContext;", "mainDispatcher", "workerDispatcher", "<init>", "(Landroidx/recyclerview/widget/DiffUtil$ItemCallback;Landroidx/recyclerview/widget/ListUpdateCallback;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;)V", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Landroidx/recyclerview/widget/DiffUtil$ItemCallback;Landroidx/recyclerview/widget/ListUpdateCallback;Lkotlinx/coroutines/CoroutineDispatcher;)V", "(Landroidx/recyclerview/widget/DiffUtil$ItemCallback;Landroidx/recyclerview/widget/ListUpdateCallback;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;)V", "Landroidx/paging/PagingData;", "pagingData", "", "submitData", "(Landroidx/paging/PagingData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "(Landroidx/lifecycle/Lifecycle;Landroidx/paging/PagingData;)V", "retry", "()V", "refresh", "", "index", "getItem", "(I)Ljava/lang/Object;", "peek", "Landroidx/paging/ItemSnapshotList;", "snapshot", "()Landroidx/paging/ItemSnapshotList;", "Lkotlin/Function0;", "listener", "addOnPagesUpdatedListener", "(Lkotlin/jvm/functions/Function0;)V", "removeOnPagesUpdatedListener", "Lkotlin/Function1;", "Landroidx/paging/CombinedLoadStates;", "addLoadStateListener", "(Lkotlin/jvm/functions/Function1;)V", "removeLoadStateListener", "addLoadStateListenerInternal$paging_runtime_release", "addLoadStateListenerInternal", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "e", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getInGetItem$paging_runtime_release", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "inGetItem", "Landroidx/paging/PagingDataPresenter;", "f", "Landroidx/paging/PagingDataPresenter;", "getPresenter$paging_runtime_release", "()Landroidx/paging/PagingDataPresenter;", "presenter", "Lkotlinx/coroutines/flow/Flow;", "h", "Lkotlinx/coroutines/flow/Flow;", "getLoadStateFlow", "()Lkotlinx/coroutines/flow/Flow;", "loadStateFlow", "i", "getOnPagesUpdatedFlow", "onPagesUpdatedFlow", "l", "Lkotlin/jvm/functions/Function1;", "getInternalLoadStateListener$paging_runtime_release", "()Lkotlin/jvm/functions/Function1;", "internalLoadStateListener", "getItemCount", "()I", "itemCount", "paging-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAsyncPagingDataDiffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AsyncPagingDataDiffer.kt\nandroidx/paging/AsyncPagingDataDiffer\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,602:1\n39#2,6:603\n230#3,5:609\n230#3,5:614\n1#4:619\n*S KotlinDebug\n*F\n+ 1 AsyncPagingDataDiffer.kt\nandroidx/paging/AsyncPagingDataDiffer\n*L\n461#1:603,6\n415#1:609,5\n418#1:614,5\n*E\n"})
public final class AsyncPagingDataDiffer {
    public final ItemCallback a;
    public final ListUpdateCallback b;
    public final CoroutineContext c;
    public final CoroutineContext d;
    public final MutableStateFlow e;
    public final androidx.paging.AsyncPagingDataDiffer.presenter.1 f;
    public final AtomicInteger g;
    public final Flow h;
    public final Flow i;
    public final AtomicReference j;
    public final CopyOnWriteArrayList k;
    public final d l;
    public final Lazy m;
    public final androidx.paging.AsyncPagingDataDiffer.LoadStateListenerRunnable.1 n;

    @JvmOverloads
    public AsyncPagingDataDiffer(@NotNull ItemCallback diffUtil$ItemCallback0, @NotNull ListUpdateCallback listUpdateCallback0) {
        Intrinsics.checkNotNullParameter(diffUtil$ItemCallback0, "diffCallback");
        Intrinsics.checkNotNullParameter(listUpdateCallback0, "updateCallback");
        this(diffUtil$ItemCallback0, listUpdateCallback0, null, null, 12, null);
    }

    @JvmOverloads
    public AsyncPagingDataDiffer(@NotNull ItemCallback diffUtil$ItemCallback0, @NotNull ListUpdateCallback listUpdateCallback0, @NotNull CoroutineContext coroutineContext0) {
        Intrinsics.checkNotNullParameter(diffUtil$ItemCallback0, "diffCallback");
        Intrinsics.checkNotNullParameter(listUpdateCallback0, "updateCallback");
        Intrinsics.checkNotNullParameter(coroutineContext0, "mainDispatcher");
        this(diffUtil$ItemCallback0, listUpdateCallback0, coroutineContext0, null, 8, null);
    }

    @JvmOverloads
    public AsyncPagingDataDiffer(@NotNull ItemCallback diffUtil$ItemCallback0, @NotNull ListUpdateCallback listUpdateCallback0, @NotNull CoroutineContext coroutineContext0, @NotNull CoroutineContext coroutineContext1) {
        Intrinsics.checkNotNullParameter(diffUtil$ItemCallback0, "diffCallback");
        Intrinsics.checkNotNullParameter(listUpdateCallback0, "updateCallback");
        Intrinsics.checkNotNullParameter(coroutineContext0, "mainDispatcher");
        Intrinsics.checkNotNullParameter(coroutineContext1, "workerDispatcher");
        super();
        this.a = diffUtil$ItemCallback0;
        this.b = listUpdateCallback0;
        this.c = coroutineContext0;
        this.d = coroutineContext1;
        this.e = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        androidx.paging.AsyncPagingDataDiffer.presenter.1 asyncPagingDataDiffer$presenter$10 = new PagingDataPresenter(coroutineContext0) {
            public final AsyncPagingDataDiffer l;

            {
                this.l = asyncPagingDataDiffer0;
                super(coroutineContext0, null, 2, null);
            }

            @Override  // androidx.paging.PagingDataPresenter
            @Nullable
            public Object presentPagingDataEvent(@NotNull PagingDataEvent pagingDataEvent0, @NotNull Continuation continuation0) {
                AsyncPagingDataDiffer asyncPagingDataDiffer1;
                Refresh pagingDataEvent$Refresh0;
                f f0;
                if(continuation0 instanceof f) {
                    f0 = (f)continuation0;
                    int v = f0.s;
                    if((v & 0x80000000) == 0) {
                        f0 = new f(this, continuation0);
                    }
                    else {
                        f0.s = v ^ 0x80000000;
                    }
                }
                else {
                    f0 = new f(this, continuation0);
                }
                Object object0 = f0.q;
                Object object1 = a.getCOROUTINE_SUSPENDED();
                switch(f0.s) {
                    case 0: {
                        ResultKt.throwOnFailure(object0);
                        AsyncPagingDataDiffer asyncPagingDataDiffer0 = this.l;
                        int v1 = 0;
                        if(pagingDataEvent0 instanceof Refresh) {
                            pagingDataEvent$Refresh0 = (Refresh)pagingDataEvent0;
                            if(pagingDataEvent$Refresh0.getPreviousList().getSize() != 0) {
                                if(pagingDataEvent$Refresh0.getNewList().getSize() != 0) {
                                    androidx.paging.f f1 = new androidx.paging.f(pagingDataEvent$Refresh0, asyncPagingDataDiffer0, null);
                                    f0.o = asyncPagingDataDiffer0;
                                    f0.p = pagingDataEvent$Refresh0;
                                    f0.s = 1;
                                    object0 = BuildersKt.withContext(AsyncPagingDataDiffer.access$getWorkerDispatcher$p(asyncPagingDataDiffer0), f1, f0);
                                    if(object0 == object1) {
                                        return object1;
                                    }
                                    asyncPagingDataDiffer1 = asyncPagingDataDiffer0;
                                    break;
                                }
                                else if(pagingDataEvent$Refresh0.getPreviousList().getSize() > 0) {
                                    AsyncPagingDataDiffer.access$getUpdateCallback$p(asyncPagingDataDiffer0).onRemoved(0, pagingDataEvent$Refresh0.getPreviousList().getSize());
                                    return Unit.INSTANCE;
                                }
                            }
                            else if(pagingDataEvent$Refresh0.getNewList().getSize() > 0) {
                                AsyncPagingDataDiffer.access$getUpdateCallback$p(asyncPagingDataDiffer0).onInserted(0, pagingDataEvent$Refresh0.getNewList().getSize());
                                return Unit.INSTANCE;
                            }
                        }
                        else if(pagingDataEvent0 instanceof Prepend) {
                            int v2 = ((Prepend)pagingDataEvent0).getInserted().size();
                            int v3 = Math.min(((Prepend)pagingDataEvent0).getOldPlaceholdersBefore(), v2);
                            int v4 = ((Prepend)pagingDataEvent0).getOldPlaceholdersBefore();
                            int v5 = v2 - v3;
                            if(v3 > 0) {
                                AsyncPagingDataDiffer.access$getUpdateCallback$p(asyncPagingDataDiffer0).onChanged(v4 - v3, v3, null);
                            }
                            if(v5 > 0) {
                                AsyncPagingDataDiffer.access$getUpdateCallback$p(asyncPagingDataDiffer0).onInserted(0, v5);
                            }
                            int v6 = ((Prepend)pagingDataEvent0).getNewPlaceholdersBefore() - ((Prepend)pagingDataEvent0).getOldPlaceholdersBefore() + v3;
                            if(v6 > 0) {
                                AsyncPagingDataDiffer.access$getUpdateCallback$p(asyncPagingDataDiffer0).onInserted(0, v6);
                                return Unit.INSTANCE;
                            }
                            if(v6 < 0) {
                                AsyncPagingDataDiffer.access$getUpdateCallback$p(asyncPagingDataDiffer0).onRemoved(0, -v6);
                                return Unit.INSTANCE;
                            }
                        }
                        else if(pagingDataEvent0 instanceof Append) {
                            int v7 = ((Append)pagingDataEvent0).getInserted().size();
                            int v8 = Math.min(((Append)pagingDataEvent0).getOldPlaceholdersAfter(), v7);
                            int v9 = ((Append)pagingDataEvent0).getStartIndex();
                            int v10 = v7 - v8;
                            if(v8 > 0) {
                                AsyncPagingDataDiffer.access$getUpdateCallback$p(asyncPagingDataDiffer0).onChanged(v9, v8, null);
                            }
                            if(v10 > 0) {
                                AsyncPagingDataDiffer.access$getUpdateCallback$p(asyncPagingDataDiffer0).onInserted(v9 + v8, v10);
                            }
                            int v11 = ((Append)pagingDataEvent0).getNewPlaceholdersAfter() - ((Append)pagingDataEvent0).getOldPlaceholdersAfter() + v8;
                            int v12 = ((Append)pagingDataEvent0).getNewPlaceholdersAfter() + (((Append)pagingDataEvent0).getStartIndex() + v7);
                            if(v11 > 0) {
                                AsyncPagingDataDiffer.access$getUpdateCallback$p(asyncPagingDataDiffer0).onInserted(v12 - v11, v11);
                                return Unit.INSTANCE;
                            }
                            if(v11 < 0) {
                                AsyncPagingDataDiffer.access$getUpdateCallback$p(asyncPagingDataDiffer0).onRemoved(v12, -v11);
                                return Unit.INSTANCE;
                            }
                        }
                        else if(pagingDataEvent0 instanceof DropPrepend) {
                            int v13 = ((DropPrepend)pagingDataEvent0).getNewPlaceholdersBefore() - ((DropPrepend)pagingDataEvent0).getDropCount() - ((DropPrepend)pagingDataEvent0).getOldPlaceholdersBefore();
                            if(v13 > 0) {
                                AsyncPagingDataDiffer.access$getUpdateCallback$p(asyncPagingDataDiffer0).onInserted(0, v13);
                            }
                            else if(v13 < 0) {
                                AsyncPagingDataDiffer.access$getUpdateCallback$p(asyncPagingDataDiffer0).onRemoved(0, -v13);
                            }
                            int v14 = Math.max(0, ((DropPrepend)pagingDataEvent0).getOldPlaceholdersBefore() + v13);
                            int v15 = ((DropPrepend)pagingDataEvent0).getNewPlaceholdersBefore() - v14;
                            if(v15 > 0) {
                                AsyncPagingDataDiffer.access$getUpdateCallback$p(asyncPagingDataDiffer0).onChanged(v14, v15, null);
                                return Unit.INSTANCE;
                            }
                        }
                        else if(pagingDataEvent0 instanceof DropAppend) {
                            int v16 = ((DropAppend)pagingDataEvent0).getNewPlaceholdersAfter() - ((DropAppend)pagingDataEvent0).getDropCount() - ((DropAppend)pagingDataEvent0).getOldPlaceholdersAfter();
                            int v17 = ((DropAppend)pagingDataEvent0).getNewPlaceholdersAfter() + ((DropAppend)pagingDataEvent0).getStartIndex();
                            if(v16 > 0) {
                                AsyncPagingDataDiffer.access$getUpdateCallback$p(asyncPagingDataDiffer0).onInserted(v17 - v16, v16);
                            }
                            else if(v16 < 0) {
                                AsyncPagingDataDiffer.access$getUpdateCallback$p(asyncPagingDataDiffer0).onRemoved(v17, -v16);
                            }
                            if(v16 < 0) {
                                v1 = Math.min(((DropAppend)pagingDataEvent0).getOldPlaceholdersAfter(), -v16);
                            }
                            int v18 = ((DropAppend)pagingDataEvent0).getNewPlaceholdersAfter() - ((DropAppend)pagingDataEvent0).getOldPlaceholdersAfter() + v1;
                            if(v18 > 0) {
                                AsyncPagingDataDiffer.access$getUpdateCallback$p(asyncPagingDataDiffer0).onChanged(((DropAppend)pagingDataEvent0).getStartIndex(), v18, null);
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    case 1: {
                        pagingDataEvent$Refresh0 = f0.p;
                        asyncPagingDataDiffer1 = f0.o;
                        ResultKt.throwOnFailure(object0);
                        break;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                PlaceholderPaddedListDiffHelperKt.dispatchDiff(pagingDataEvent$Refresh0.getPreviousList(), AsyncPagingDataDiffer.access$getUpdateCallback$p(asyncPagingDataDiffer1), pagingDataEvent$Refresh0.getNewList(), ((PlaceholderPaddedDiffResult)object0));
                return Unit.INSTANCE;
            }
        };
        this.f = asyncPagingDataDiffer$presenter$10;
        this.g = new AtomicInteger(0);
        this.h = FlowKt.flowOn(FlowKt.flow(new Function2(null, this) {
            public int o;
            public Object p;
            public final Flow q;
            public final AsyncPagingDataDiffer r;

            {
                this.q = flow0;
                this.r = asyncPagingDataDiffer0;
                super(2, continuation0);
            }

            @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation create(@Nullable Object object0, @NotNull Continuation continuation0) {
                Continuation continuation1 = new androidx.paging.AsyncPagingDataDiffer.special..inlined.transform.1(this.q, continuation0, this.r);
                continuation1.p = object0;
                return continuation1;
            }

            @Override  // kotlin.jvm.functions.Function2
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((FlowCollector)object0), ((Continuation)object1));
            }

            @Nullable
            public final Object invoke(@NotNull FlowCollector flowCollector0, @Nullable Continuation continuation0) {
                return ((androidx.paging.AsyncPagingDataDiffer.special..inlined.transform.1)this.create(flowCollector0, continuation0)).invokeSuspend(Unit.INSTANCE);
            }

            @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object object0) {
                Object object1 = a.getCOROUTINE_SUSPENDED();
                switch(this.o) {
                    case 0: {
                        ResultKt.throwOnFailure(object0);
                        androidx.paging.AsyncPagingDataDiffer.special..inlined.transform.1.1 asyncPagingDataDiffer$special$$inlined$transform$1$10 = new FlowCollector() {
                            @Override  // kotlinx.coroutines.flow.FlowCollector
                            @Nullable
                            public final Object emit(Object object0, @NotNull Continuation continuation0) {
                                FlowCollector flowCollector1;
                                CombinedLoadStates combinedLoadStates1;
                                androidx.paging.AsyncPagingDataDiffer.special..inlined.transform.1.1 asyncPagingDataDiffer$special$$inlined$transform$1$10;
                                FlowCollector flowCollector0;
                                CombinedLoadStates combinedLoadStates0;
                                androidx.paging.AsyncPagingDataDiffer.special..inlined.transform.1.1.1 asyncPagingDataDiffer$special$$inlined$transform$1$1$10;
                                if(continuation0 instanceof androidx.paging.AsyncPagingDataDiffer.special..inlined.transform.1.1.1) {
                                    asyncPagingDataDiffer$special$$inlined$transform$1$1$10 = (androidx.paging.AsyncPagingDataDiffer.special..inlined.transform.1.1.1)continuation0;
                                    int v = asyncPagingDataDiffer$special$$inlined$transform$1$1$10.p;
                                    if((v & 0x80000000) == 0) {
                                        asyncPagingDataDiffer$special$$inlined$transform$1$1$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
                                            public Object o;
                                            public int p;
                                            public Object r;
                                            public Object s;
                                            public FlowCollector t;

                                            @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            @Nullable
                                            public final Object invokeSuspend(@NotNull Object object0) {
                                                this.o = object0;
                                                this.p |= 0x80000000;
                                                return continuation0.emit(null, this);
                                            }
                                        };
                                    }
                                    else {
                                        asyncPagingDataDiffer$special$$inlined$transform$1$1$10.p = v ^ 0x80000000;
                                    }
                                }
                                else {
                                    asyncPagingDataDiffer$special$$inlined$transform$1$1$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
                                        public Object o;
                                        public int p;
                                        public Object r;
                                        public Object s;
                                        public FlowCollector t;

                                        @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                        @Nullable
                                        public final Object invokeSuspend(@NotNull Object object0) {
                                            this.o = object0;
                                            this.p |= 0x80000000;
                                            return continuation0.emit(null, this);
                                        }
                                    };
                                }
                                Object object1 = asyncPagingDataDiffer$special$$inlined$transform$1$1$10.o;
                                Object object2 = a.getCOROUTINE_SUSPENDED();
                                switch(asyncPagingDataDiffer$special$$inlined$transform$1$1$10.p) {
                                    case 0: {
                                        ResultKt.throwOnFailure(object1);
                                        combinedLoadStates0 = (CombinedLoadStates)object0;
                                        boolean z = ((Boolean)this.b.getInGetItem$paging_runtime_release().getValue()).booleanValue();
                                        flowCollector0 = this.r;
                                        if(z) {
                                            asyncPagingDataDiffer$special$$inlined$transform$1$1$10.r = this;
                                            asyncPagingDataDiffer$special$$inlined$transform$1$1$10.s = combinedLoadStates0;
                                            asyncPagingDataDiffer$special$$inlined$transform$1$1$10.t = flowCollector0;
                                            asyncPagingDataDiffer$special$$inlined$transform$1$1$10.p = 1;
                                            if(YieldKt.yield(asyncPagingDataDiffer$special$$inlined$transform$1$1$10) == object2) {
                                                return object2;
                                            }
                                            asyncPagingDataDiffer$special$$inlined$transform$1$10 = this;
                                            combinedLoadStates1 = combinedLoadStates0;
                                            flowCollector1 = flowCollector0;
                                            goto label_34;
                                        }
                                        break;
                                    }
                                    case 1: {
                                        flowCollector1 = asyncPagingDataDiffer$special$$inlined$transform$1$1$10.t;
                                        combinedLoadStates1 = (CombinedLoadStates)asyncPagingDataDiffer$special$$inlined$transform$1$1$10.s;
                                        asyncPagingDataDiffer$special$$inlined$transform$1$10 = (androidx.paging.AsyncPagingDataDiffer.special..inlined.transform.1.1)asyncPagingDataDiffer$special$$inlined$transform$1$1$10.r;
                                        ResultKt.throwOnFailure(object1);
                                    label_34:
                                        e e0 = new e(2, null);  // 初始化器: Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V
                                        asyncPagingDataDiffer$special$$inlined$transform$1$1$10.r = combinedLoadStates1;
                                        asyncPagingDataDiffer$special$$inlined$transform$1$1$10.s = flowCollector1;
                                        asyncPagingDataDiffer$special$$inlined$transform$1$1$10.t = null;
                                        asyncPagingDataDiffer$special$$inlined$transform$1$1$10.p = 2;
                                        if(FlowKt.firstOrNull(asyncPagingDataDiffer$special$$inlined$transform$1$10.b.getInGetItem$paging_runtime_release(), e0, asyncPagingDataDiffer$special$$inlined$transform$1$1$10) == object2) {
                                            return object2;
                                        }
                                        flowCollector0 = flowCollector1;
                                        combinedLoadStates0 = combinedLoadStates1;
                                        break;
                                    }
                                    case 2: {
                                        flowCollector1 = (FlowCollector)asyncPagingDataDiffer$special$$inlined$transform$1$1$10.s;
                                        combinedLoadStates1 = (CombinedLoadStates)asyncPagingDataDiffer$special$$inlined$transform$1$1$10.r;
                                        ResultKt.throwOnFailure(object1);
                                        flowCollector0 = flowCollector1;
                                        combinedLoadStates0 = combinedLoadStates1;
                                        break;
                                    }
                                    case 3: {
                                        ResultKt.throwOnFailure(object1);
                                        return Unit.INSTANCE;
                                    }
                                    default: {
                                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                    }
                                }
                                asyncPagingDataDiffer$special$$inlined$transform$1$1$10.r = null;
                                asyncPagingDataDiffer$special$$inlined$transform$1$1$10.s = null;
                                asyncPagingDataDiffer$special$$inlined$transform$1$1$10.p = 3;
                                return flowCollector0.emit(combinedLoadStates0, asyncPagingDataDiffer$special$$inlined$transform$1$1$10) == object2 ? object2 : Unit.INSTANCE;
                            }
                        };
                        this.o = 1;
                        return this.q.collect(asyncPagingDataDiffer$special$$inlined$transform$1$10, this) == object1 ? object1 : Unit.INSTANCE;
                    }
                    case 1: {
                        ResultKt.throwOnFailure(object0);
                        return Unit.INSTANCE;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        }), Dispatchers.getMain());
        this.i = asyncPagingDataDiffer$presenter$10.getOnPagesUpdatedFlow();
        this.j = new AtomicReference(null);
        this.k = new CopyOnWriteArrayList();
        this.l = new d(this);
        this.m = c.lazy(s4.c.w);
        this.n = new Runnable() {
            public AtomicReference a;
            public final AsyncPagingDataDiffer b;

            {
                this.b = asyncPagingDataDiffer0;
                this.a = new AtomicReference(null);
            }

            @NotNull
            public final AtomicReference getLoadState() {
                return this.a;
            }

            @Override
            public void run() {
                CombinedLoadStates combinedLoadStates0 = (CombinedLoadStates)this.a.get();
                if(combinedLoadStates0 != null) {
                    for(Object object0: AsyncPagingDataDiffer.access$getChildLoadStateListeners$p(this.b)) {
                        ((Function1)object0).invoke(combinedLoadStates0);
                    }
                }
            }

            public final void setLoadState(@NotNull AtomicReference atomicReference0) {
                Intrinsics.checkNotNullParameter(atomicReference0, "<set-?>");
                this.a = atomicReference0;
            }
        };
    }

    public AsyncPagingDataDiffer(ItemCallback diffUtil$ItemCallback0, ListUpdateCallback listUpdateCallback0, CoroutineContext coroutineContext0, CoroutineContext coroutineContext1, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 4) != 0) {
            coroutineContext0 = Dispatchers.getMain();
        }
        if((v & 8) != 0) {
            coroutineContext1 = Dispatchers.getDefault();
        }
        this(diffUtil$ItemCallback0, listUpdateCallback0, coroutineContext0, coroutineContext1);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Superseded by constructors which accept CoroutineContext")
    public AsyncPagingDataDiffer(ItemCallback diffUtil$ItemCallback0, ListUpdateCallback listUpdateCallback0, CoroutineDispatcher coroutineDispatcher0) {
        Intrinsics.checkNotNullParameter(diffUtil$ItemCallback0, "diffCallback");
        Intrinsics.checkNotNullParameter(listUpdateCallback0, "updateCallback");
        Intrinsics.checkNotNullParameter(coroutineDispatcher0, "mainDispatcher");
        this(diffUtil$ItemCallback0, listUpdateCallback0, coroutineDispatcher0, Dispatchers.getDefault());
    }

    public AsyncPagingDataDiffer(ItemCallback diffUtil$ItemCallback0, ListUpdateCallback listUpdateCallback0, CoroutineDispatcher coroutineDispatcher0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 4) != 0) {
            coroutineDispatcher0 = Dispatchers.getMain();
        }
        this(diffUtil$ItemCallback0, listUpdateCallback0, coroutineDispatcher0);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Superseded by constructors which accept CoroutineContext")
    public AsyncPagingDataDiffer(ItemCallback diffUtil$ItemCallback0, ListUpdateCallback listUpdateCallback0, CoroutineDispatcher coroutineDispatcher0, CoroutineDispatcher coroutineDispatcher1) {
        Intrinsics.checkNotNullParameter(diffUtil$ItemCallback0, "diffCallback");
        Intrinsics.checkNotNullParameter(listUpdateCallback0, "updateCallback");
        Intrinsics.checkNotNullParameter(coroutineDispatcher0, "mainDispatcher");
        Intrinsics.checkNotNullParameter(coroutineDispatcher1, "workerDispatcher");
        this(diffUtil$ItemCallback0, listUpdateCallback0, coroutineDispatcher0, coroutineDispatcher1);
    }

    public AsyncPagingDataDiffer(ItemCallback diffUtil$ItemCallback0, ListUpdateCallback listUpdateCallback0, CoroutineDispatcher coroutineDispatcher0, CoroutineDispatcher coroutineDispatcher1, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 4) != 0) {
            coroutineDispatcher0 = Dispatchers.getMain();
        }
        if((v & 8) != 0) {
            coroutineDispatcher1 = Dispatchers.getDefault();
        }
        this(diffUtil$ItemCallback0, listUpdateCallback0, coroutineDispatcher0, coroutineDispatcher1);
    }

    public static final Handler access$getLoadStateListenerHandler(AsyncPagingDataDiffer asyncPagingDataDiffer0) {
        return (Handler)asyncPagingDataDiffer0.m.getValue();
    }

    public static final ListUpdateCallback access$getUpdateCallback$p(AsyncPagingDataDiffer asyncPagingDataDiffer0) {
        return asyncPagingDataDiffer0.b;
    }

    public static final CoroutineContext access$getWorkerDispatcher$p(AsyncPagingDataDiffer asyncPagingDataDiffer0) {
        return asyncPagingDataDiffer0.d;
    }

    public final void addLoadStateListener(@NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "listener");
        if(this.j.get() == null) {
            this.addLoadStateListenerInternal$paging_runtime_release(this.l);
        }
        this.k.add(function10);
    }

    public final void addLoadStateListenerInternal$paging_runtime_release(@NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "listener");
        this.j.set(function10);
        this.f.addLoadStateListener(function10);
    }

    public final void addOnPagesUpdatedListener(@NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(function00, "listener");
        this.f.addOnPagesUpdatedListener(function00);
    }

    @NotNull
    public final MutableStateFlow getInGetItem$paging_runtime_release() {
        return this.e;
    }

    @NotNull
    public final Function1 getInternalLoadStateListener$paging_runtime_release() {
        return this.l;
    }

    @MainThread
    @Nullable
    public final Object getItem(@IntRange(from = 0L) int v) {
        MutableStateFlow mutableStateFlow0 = this.e;
        try {
            do {
                Object object0 = mutableStateFlow0.getValue();
                ((Boolean)object0).getClass();
            }
            while(!mutableStateFlow0.compareAndSet(object0, Boolean.TRUE));
            return this.f.get(v);
        }
        finally {
            do {
                Object object2 = mutableStateFlow0.getValue();
                ((Boolean)object2).getClass();
            }
            while(!mutableStateFlow0.compareAndSet(object2, Boolean.FALSE));
        }
    }

    public final int getItemCount() {
        return this.f.getSize();
    }

    @NotNull
    public final Flow getLoadStateFlow() {
        return this.h;
    }

    @NotNull
    public final Flow getOnPagesUpdatedFlow() {
        return this.i;
    }

    @NotNull
    public final PagingDataPresenter getPresenter$paging_runtime_release() {
        return this.f;
    }

    @MainThread
    @Nullable
    public final Object peek(@IntRange(from = 0L) int v) {
        return this.f.peek(v);
    }

    public final void refresh() {
        this.f.refresh();
    }

    public final void removeLoadStateListener(@NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "listener");
        this.k.remove(function10);
        if(this.k.isEmpty()) {
            Function1 function11 = (Function1)this.j.get();
            if(function11 != null) {
                this.f.removeLoadStateListener(function11);
            }
        }
    }

    public final void removeOnPagesUpdatedListener(@NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(function00, "listener");
        this.f.removeOnPagesUpdatedListener(function00);
    }

    public final void retry() {
        this.f.retry();
    }

    @NotNull
    public final ItemSnapshotList snapshot() {
        return this.f.snapshot();
    }

    @Nullable
    public final Object submitData(@NotNull PagingData pagingData0, @NotNull Continuation continuation0) {
        this.g.incrementAndGet();
        Object object0 = this.f.collectFrom(pagingData0, continuation0);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    public final void submitData(@NotNull Lifecycle lifecycle0, @NotNull PagingData pagingData0) {
        Intrinsics.checkNotNullParameter(lifecycle0, "lifecycle");
        Intrinsics.checkNotNullParameter(pagingData0, "pagingData");
        int v = this.g.incrementAndGet();
        BuildersKt.launch$default(LifecycleKt.getCoroutineScope(lifecycle0), null, null, new g(this, v, pagingData0, null), 3, null);
    }
}

