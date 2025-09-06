package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ExperimentalPagingApi
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\'\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0002:\u0002\u000F\u0010B\u0005¢\u0006\u0002\u0010\u0004J\u000E\u0010\u0005\u001A\u00020\u0006H\u0096@¢\u0006\u0002\u0010\u0007J*\u0010\b\u001A\u00020\t2\u0006\u0010\n\u001A\u00020\u000B2\u0012\u0010\f\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\rH¦@¢\u0006\u0002\u0010\u000E¨\u0006\u0011"}, d2 = {"Landroidx/paging/RemoteMediator;", "Key", "", "Value", "()V", "initialize", "Landroidx/paging/RemoteMediator$InitializeAction;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "load", "Landroidx/paging/RemoteMediator$MediatorResult;", "loadType", "Landroidx/paging/LoadType;", "state", "Landroidx/paging/PagingState;", "(Landroidx/paging/LoadType;Landroidx/paging/PagingState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "InitializeAction", "MediatorResult", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public abstract class RemoteMediator {
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Landroidx/paging/RemoteMediator$InitializeAction;", "", "LAUNCH_INITIAL_REFRESH", "SKIP_INITIAL_REFRESH", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static enum InitializeAction {
        LAUNCH_INITIAL_REFRESH,
        SKIP_INITIAL_REFRESH;

    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Landroidx/paging/RemoteMediator$MediatorResult;", "", "Error", "Success", "Landroidx/paging/RemoteMediator$MediatorResult$Error;", "Landroidx/paging/RemoteMediator$MediatorResult$Success;", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static abstract class MediatorResult {
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001A\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/paging/RemoteMediator$MediatorResult$Error;", "Landroidx/paging/RemoteMediator$MediatorResult;", "", "throwable", "<init>", "(Ljava/lang/Throwable;)V", "a", "Ljava/lang/Throwable;", "getThrowable", "()Ljava/lang/Throwable;", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
        public static final class Error extends MediatorResult {
            public final Throwable a;

            public Error(@NotNull Throwable throwable0) {
                Intrinsics.checkNotNullParameter(throwable0, "throwable");
                super(null);
                this.a = throwable0;
            }

            @NotNull
            public final Throwable getThrowable() {
                return this.a;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001A\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001A\u0004\b\u0003\u0010\b¨\u0006\t"}, d2 = {"Landroidx/paging/RemoteMediator$MediatorResult$Success;", "Landroidx/paging/RemoteMediator$MediatorResult;", "", "endOfPaginationReached", "<init>", "(Z)V", "a", "Z", "()Z", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
        public static final class Success extends MediatorResult {
            public final boolean a;

            public Success(boolean z) {
                super(null);
                this.a = z;
            }

            @JvmName(name = "endOfPaginationReached")
            public final boolean endOfPaginationReached() {
                return this.a;
            }
        }

        public MediatorResult(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    @Nullable
    public Object initialize(@NotNull Continuation continuation0) {
        return InitializeAction.LAUNCH_INITIAL_REFRESH;
    }

    @Nullable
    public abstract Object load(@NotNull LoadType arg1, @NotNull PagingState arg2, @NotNull Continuation arg3);
}

