package androidx.paging;

import androidx.annotation.IntRange;
import androidx.annotation.MainThread;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.AdapterListUpdateCallback;
import androidx.recyclerview.widget.ConcatAdapter;
import androidx.recyclerview.widget.DiffUtil.ItemCallback;
import androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.AdapterDataObserver;
import j0.b2;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;
import s4.f1;

@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\b\u0012\u0004\u0012\u00028\u00010\u0005B+\b\u0007\u0012\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\b\b\u0002\u0010\t\u001A\u00020\b\u0012\b\b\u0002\u0010\n\u001A\u00020\b\u00A2\u0006\u0004\b\u000B\u0010\fB!\b\u0017\u0012\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\b\b\u0002\u0010\t\u001A\u00020\r\u00A2\u0006\u0004\b\u000B\u0010\u000EB+\b\u0017\u0012\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\b\b\u0002\u0010\t\u001A\u00020\r\u0012\b\b\u0002\u0010\n\u001A\u00020\r\u00A2\u0006\u0004\b\u000B\u0010\u000FJ\u0017\u0010\u0013\u001A\u00020\u00122\u0006\u0010\u0011\u001A\u00020\u0010H\u0016\u00A2\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0018\u001A\u00020\u00172\u0006\u0010\u0016\u001A\u00020\u0015\u00A2\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001C\u001A\u00020\u00122\u0006\u0010\u001B\u001A\u00020\u001A\u00A2\u0006\u0004\b\u001C\u0010\u001DJ\u001E\u0010 \u001A\u00020\u00122\f\u0010\u001F\u001A\b\u0012\u0004\u0012\u00028\u00000\u001EH\u0086@\u00A2\u0006\u0004\b \u0010!J#\u0010 \u001A\u00020\u00122\u0006\u0010#\u001A\u00020\"2\f\u0010\u001F\u001A\b\u0012\u0004\u0012\u00028\u00000\u001E\u00A2\u0006\u0004\b \u0010$J\r\u0010%\u001A\u00020\u0012\u00A2\u0006\u0004\b%\u0010&J\r\u0010\'\u001A\u00020\u0012\u00A2\u0006\u0004\b\'\u0010&J\u001B\u0010(\u001A\u0004\u0018\u00018\u00002\b\b\u0001\u0010\u0016\u001A\u00020\u0015H\u0005\u00A2\u0006\u0004\b(\u0010)J\u001B\u0010+\u001A\u0004\u0018\u00018\u00002\b\b\u0001\u0010*\u001A\u00020\u0015H\u0007\u00A2\u0006\u0004\b+\u0010)J\u0013\u0010-\u001A\b\u0012\u0004\u0012\u00028\u00000,\u00A2\u0006\u0004\b-\u0010.J\u000F\u0010/\u001A\u00020\u0015H\u0016\u00A2\u0006\u0004\b/\u00100J!\u00104\u001A\u00020\u00122\u0012\u00103\u001A\u000E\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\u001201\u00A2\u0006\u0004\b4\u00105J!\u00106\u001A\u00020\u00122\u0012\u00103\u001A\u000E\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\u001201\u00A2\u0006\u0004\b6\u00105J\u001B\u00108\u001A\u00020\u00122\f\u00103\u001A\b\u0012\u0004\u0012\u00020\u001207\u00A2\u0006\u0004\b8\u00109J\u001B\u0010:\u001A\u00020\u00122\f\u00103\u001A\b\u0012\u0004\u0012\u00020\u001207\u00A2\u0006\u0004\b:\u00109J\u0019\u0010>\u001A\u00020=2\n\u0010<\u001A\u0006\u0012\u0002\b\u00030;\u00A2\u0006\u0004\b>\u0010?J\u0019\u0010A\u001A\u00020=2\n\u0010@\u001A\u0006\u0012\u0002\b\u00030;\u00A2\u0006\u0004\bA\u0010?J%\u0010B\u001A\u00020=2\n\u0010<\u001A\u0006\u0012\u0002\b\u00030;2\n\u0010@\u001A\u0006\u0012\u0002\b\u00030;\u00A2\u0006\u0004\bB\u0010CR\u001D\u0010I\u001A\b\u0012\u0004\u0012\u0002020D8\u0006\u00A2\u0006\f\n\u0004\bE\u0010F\u001A\u0004\bG\u0010HR\u001D\u0010L\u001A\b\u0012\u0004\u0012\u00020\u00120D8\u0006\u00A2\u0006\f\n\u0004\bJ\u0010F\u001A\u0004\bK\u0010H\u00A8\u0006M"}, d2 = {"Landroidx/paging/PagingDataAdapter;", "", "T", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "VH", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "diffCallback", "Lkotlin/coroutines/CoroutineContext;", "mainDispatcher", "workerDispatcher", "<init>", "(Landroidx/recyclerview/widget/DiffUtil$ItemCallback;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;)V", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Landroidx/recyclerview/widget/DiffUtil$ItemCallback;Lkotlinx/coroutines/CoroutineDispatcher;)V", "(Landroidx/recyclerview/widget/DiffUtil$ItemCallback;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;)V", "Landroidx/recyclerview/widget/RecyclerView$Adapter$StateRestorationPolicy;", "strategy", "", "setStateRestorationPolicy", "(Landroidx/recyclerview/widget/RecyclerView$Adapter$StateRestorationPolicy;)V", "", "position", "", "getItemId", "(I)J", "", "hasStableIds", "setHasStableIds", "(Z)V", "Landroidx/paging/PagingData;", "pagingData", "submitData", "(Landroidx/paging/PagingData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "(Landroidx/lifecycle/Lifecycle;Landroidx/paging/PagingData;)V", "retry", "()V", "refresh", "getItem", "(I)Ljava/lang/Object;", "index", "peek", "Landroidx/paging/ItemSnapshotList;", "snapshot", "()Landroidx/paging/ItemSnapshotList;", "getItemCount", "()I", "Lkotlin/Function1;", "Landroidx/paging/CombinedLoadStates;", "listener", "addLoadStateListener", "(Lkotlin/jvm/functions/Function1;)V", "removeLoadStateListener", "Lkotlin/Function0;", "addOnPagesUpdatedListener", "(Lkotlin/jvm/functions/Function0;)V", "removeOnPagesUpdatedListener", "Landroidx/paging/LoadStateAdapter;", "header", "Landroidx/recyclerview/widget/ConcatAdapter;", "withLoadStateHeader", "(Landroidx/paging/LoadStateAdapter;)Landroidx/recyclerview/widget/ConcatAdapter;", "footer", "withLoadStateFooter", "withLoadStateHeaderAndFooter", "(Landroidx/paging/LoadStateAdapter;Landroidx/paging/LoadStateAdapter;)Landroidx/recyclerview/widget/ConcatAdapter;", "Lkotlinx/coroutines/flow/Flow;", "i", "Lkotlinx/coroutines/flow/Flow;", "getLoadStateFlow", "()Lkotlinx/coroutines/flow/Flow;", "loadStateFlow", "j", "getOnPagesUpdatedFlow", "onPagesUpdatedFlow", "paging-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public abstract class PagingDataAdapter extends Adapter {
    public boolean g;
    public final AsyncPagingDataDiffer h;
    public final Flow i;
    public final Flow j;

    @JvmOverloads
    public PagingDataAdapter(@NotNull ItemCallback diffUtil$ItemCallback0) {
        Intrinsics.checkNotNullParameter(diffUtil$ItemCallback0, "diffCallback");
        this(diffUtil$ItemCallback0, null, null, 6, null);
    }

    @JvmOverloads
    public PagingDataAdapter(@NotNull ItemCallback diffUtil$ItemCallback0, @NotNull CoroutineContext coroutineContext0) {
        Intrinsics.checkNotNullParameter(diffUtil$ItemCallback0, "diffCallback");
        Intrinsics.checkNotNullParameter(coroutineContext0, "mainDispatcher");
        this(diffUtil$ItemCallback0, coroutineContext0, null, 4, null);
    }

    @JvmOverloads
    public PagingDataAdapter(@NotNull ItemCallback diffUtil$ItemCallback0, @NotNull CoroutineContext coroutineContext0, @NotNull CoroutineContext coroutineContext1) {
        Intrinsics.checkNotNullParameter(diffUtil$ItemCallback0, "diffCallback");
        Intrinsics.checkNotNullParameter(coroutineContext0, "mainDispatcher");
        Intrinsics.checkNotNullParameter(coroutineContext1, "workerDispatcher");
        super();
        AsyncPagingDataDiffer asyncPagingDataDiffer0 = new AsyncPagingDataDiffer(diffUtil$ItemCallback0, new AdapterListUpdateCallback(this), coroutineContext0, coroutineContext1);
        this.h = asyncPagingDataDiffer0;
        super.setStateRestorationPolicy(StateRestorationPolicy.PREVENT);
        this.registerAdapterDataObserver(new AdapterDataObserver() {
            @Override  // androidx.recyclerview.widget.RecyclerView$AdapterDataObserver
            public void onItemRangeInserted(int v, int v1) {
                PagingDataAdapter.access$_init_$considerAllowingStateRestoration(this.a);
                this.a.unregisterAdapterDataObserver(this);
                super.onItemRangeInserted(v, v1);
            }
        });
        this.addLoadStateListener(new Function1() {
            public boolean a;
            public final PagingDataAdapter b;

            {
                this.b = pagingDataAdapter0;
                this.a = true;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((CombinedLoadStates)object0));
                return Unit.INSTANCE;
            }

            public void invoke(@NotNull CombinedLoadStates combinedLoadStates0) {
                Intrinsics.checkNotNullParameter(combinedLoadStates0, "loadStates");
                if(this.a) {
                    this.a = false;
                    return;
                }
                if(combinedLoadStates0.getSource().getRefresh() instanceof NotLoading) {
                    PagingDataAdapter.access$_init_$considerAllowingStateRestoration(this.b);
                    this.b.removeLoadStateListener(this);
                }
            }
        });
        this.i = asyncPagingDataDiffer0.getLoadStateFlow();
        this.j = asyncPagingDataDiffer0.getOnPagesUpdatedFlow();
    }

    public PagingDataAdapter(ItemCallback diffUtil$ItemCallback0, CoroutineContext coroutineContext0, CoroutineContext coroutineContext1, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 2) != 0) {
            coroutineContext0 = Dispatchers.getMain();
        }
        if((v & 4) != 0) {
            coroutineContext1 = Dispatchers.getDefault();
        }
        this(diffUtil$ItemCallback0, coroutineContext0, coroutineContext1);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Superseded by constructors which accept CoroutineContext")
    public PagingDataAdapter(ItemCallback diffUtil$ItemCallback0, CoroutineDispatcher coroutineDispatcher0) {
        Intrinsics.checkNotNullParameter(diffUtil$ItemCallback0, "diffCallback");
        Intrinsics.checkNotNullParameter(coroutineDispatcher0, "mainDispatcher");
        this(diffUtil$ItemCallback0, coroutineDispatcher0, Dispatchers.getDefault());
    }

    public PagingDataAdapter(ItemCallback diffUtil$ItemCallback0, CoroutineDispatcher coroutineDispatcher0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 2) != 0) {
            coroutineDispatcher0 = Dispatchers.getMain();
        }
        this(diffUtil$ItemCallback0, coroutineDispatcher0);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Superseded by constructors which accept CoroutineContext")
    public PagingDataAdapter(ItemCallback diffUtil$ItemCallback0, CoroutineDispatcher coroutineDispatcher0, CoroutineDispatcher coroutineDispatcher1) {
        Intrinsics.checkNotNullParameter(diffUtil$ItemCallback0, "diffCallback");
        Intrinsics.checkNotNullParameter(coroutineDispatcher0, "mainDispatcher");
        Intrinsics.checkNotNullParameter(coroutineDispatcher1, "workerDispatcher");
        this(diffUtil$ItemCallback0, coroutineDispatcher0, coroutineDispatcher1);
    }

    public PagingDataAdapter(ItemCallback diffUtil$ItemCallback0, CoroutineDispatcher coroutineDispatcher0, CoroutineDispatcher coroutineDispatcher1, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 2) != 0) {
            coroutineDispatcher0 = Dispatchers.getMain();
        }
        if((v & 4) != 0) {
            coroutineDispatcher1 = Dispatchers.getDefault();
        }
        this(diffUtil$ItemCallback0, coroutineDispatcher0, coroutineDispatcher1);
    }

    public static final void access$_init_$considerAllowingStateRestoration(PagingDataAdapter pagingDataAdapter0) {
        if(pagingDataAdapter0.getStateRestorationPolicy() == StateRestorationPolicy.PREVENT && !pagingDataAdapter0.g) {
            pagingDataAdapter0.setStateRestorationPolicy(StateRestorationPolicy.ALLOW);
        }
    }

    public final void addLoadStateListener(@NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "listener");
        this.h.addLoadStateListener(function10);
    }

    public final void addOnPagesUpdatedListener(@NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(function00, "listener");
        this.h.addOnPagesUpdatedListener(function00);
    }

    @MainThread
    @Nullable
    public final Object getItem(@IntRange(from = 0L) int v) {
        return this.h.getItem(v);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemCount() {
        return this.h.getItemCount();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public final long getItemId(int v) {
        return super.getItemId(v);
    }

    @NotNull
    public final Flow getLoadStateFlow() {
        return this.i;
    }

    @NotNull
    public final Flow getOnPagesUpdatedFlow() {
        return this.j;
    }

    @MainThread
    @Nullable
    public final Object peek(@IntRange(from = 0L) int v) {
        return this.h.peek(v);
    }

    public final void refresh() {
        this.h.refresh();
    }

    public final void removeLoadStateListener(@NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "listener");
        this.h.removeLoadStateListener(function10);
    }

    public final void removeOnPagesUpdatedListener(@NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(function00, "listener");
        this.h.removeOnPagesUpdatedListener(function00);
    }

    public final void retry() {
        this.h.retry();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public final void setHasStableIds(boolean z) {
        throw new UnsupportedOperationException("Stable ids are unsupported on PagingDataAdapter.");
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void setStateRestorationPolicy(@NotNull StateRestorationPolicy recyclerView$Adapter$StateRestorationPolicy0) {
        Intrinsics.checkNotNullParameter(recyclerView$Adapter$StateRestorationPolicy0, "strategy");
        this.g = true;
        super.setStateRestorationPolicy(recyclerView$Adapter$StateRestorationPolicy0);
    }

    @NotNull
    public final ItemSnapshotList snapshot() {
        return this.h.snapshot();
    }

    @Nullable
    public final Object submitData(@NotNull PagingData pagingData0, @NotNull Continuation continuation0) {
        Object object0 = this.h.submitData(pagingData0, continuation0);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    public final void submitData(@NotNull Lifecycle lifecycle0, @NotNull PagingData pagingData0) {
        Intrinsics.checkNotNullParameter(lifecycle0, "lifecycle");
        Intrinsics.checkNotNullParameter(pagingData0, "pagingData");
        this.h.submitData(lifecycle0, pagingData0);
    }

    @NotNull
    public final ConcatAdapter withLoadStateFooter(@NotNull LoadStateAdapter loadStateAdapter0) {
        Intrinsics.checkNotNullParameter(loadStateAdapter0, "footer");
        this.addLoadStateListener(new f1(loadStateAdapter0, 0));
        return new ConcatAdapter(new Adapter[]{this, loadStateAdapter0});
    }

    @NotNull
    public final ConcatAdapter withLoadStateHeader(@NotNull LoadStateAdapter loadStateAdapter0) {
        Intrinsics.checkNotNullParameter(loadStateAdapter0, "header");
        this.addLoadStateListener(new f1(loadStateAdapter0, 1));
        return new ConcatAdapter(new Adapter[]{loadStateAdapter0, this});
    }

    @NotNull
    public final ConcatAdapter withLoadStateHeaderAndFooter(@NotNull LoadStateAdapter loadStateAdapter0, @NotNull LoadStateAdapter loadStateAdapter1) {
        Intrinsics.checkNotNullParameter(loadStateAdapter0, "header");
        Intrinsics.checkNotNullParameter(loadStateAdapter1, "footer");
        this.addLoadStateListener(new b2(18, loadStateAdapter0, loadStateAdapter1));
        return new ConcatAdapter(new Adapter[]{loadStateAdapter0, this, loadStateAdapter1});
    }
}

