package androidx.lifecycle;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001AA\u0010\u0000\u001A\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\'\u0010\u0003\u001A#\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004\u00A2\u0006\u0002\b\bH\u0087@\u00A2\u0006\u0002\u0010\t\u001AA\u0010\u0000\u001A\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\n2\'\u0010\u0003\u001A#\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004\u00A2\u0006\u0002\b\bH\u0087@\u00A2\u0006\u0002\u0010\u000B\u001AA\u0010\f\u001A\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\'\u0010\u0003\u001A#\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004\u00A2\u0006\u0002\b\bH\u0087@\u00A2\u0006\u0002\u0010\t\u001AA\u0010\f\u001A\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\n2\'\u0010\u0003\u001A#\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004\u00A2\u0006\u0002\b\bH\u0087@\u00A2\u0006\u0002\u0010\u000B\u001AA\u0010\r\u001A\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\'\u0010\u0003\u001A#\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004\u00A2\u0006\u0002\b\bH\u0087@\u00A2\u0006\u0002\u0010\t\u001AA\u0010\r\u001A\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\n2\'\u0010\u0003\u001A#\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004\u00A2\u0006\u0002\b\bH\u0087@\u00A2\u0006\u0002\u0010\u000B\u001AI\u0010\u000E\u001A\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\u0006\u0010\u000F\u001A\u00020\u00102\'\u0010\u0003\u001A#\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004\u00A2\u0006\u0002\b\bH\u0087@\u00A2\u0006\u0002\u0010\u0011\u00A8\u0006\u0012"}, d2 = {"whenCreated", "T", "Landroidx/lifecycle/Lifecycle;", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Landroidx/lifecycle/Lifecycle;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/lifecycle/LifecycleOwner;", "(Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "whenResumed", "whenStarted", "whenStateAtLeast", "minState", "Landroidx/lifecycle/Lifecycle$State;", "(Landroidx/lifecycle/Lifecycle;Landroidx/lifecycle/Lifecycle$State;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lifecycle-common"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@JvmName(name = "PausingDispatcherKt")
public final class PausingDispatcherKt {
    @Deprecated(message = "whenCreated has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withCreated for non-suspending work that needs to run only once when the Lifecycle changes.")
    @Nullable
    public static final Object whenCreated(@NotNull Lifecycle lifecycle0, @NotNull Function2 function20, @NotNull Continuation continuation0) {
        return PausingDispatcherKt.whenStateAtLeast(lifecycle0, State.CREATED, function20, continuation0);
    }

    @Deprecated(message = "whenCreated has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withCreated for non-suspending work that needs to run only once when the Lifecycle changes.")
    @Nullable
    public static final Object whenCreated(@NotNull LifecycleOwner lifecycleOwner0, @NotNull Function2 function20, @NotNull Continuation continuation0) {
        return PausingDispatcherKt.whenCreated(lifecycleOwner0.getLifecycle(), function20, continuation0);
    }

    @Deprecated(message = "whenResumed has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withResumed for non-suspending work that needs to run only once when the Lifecycle changes.")
    @Nullable
    public static final Object whenResumed(@NotNull Lifecycle lifecycle0, @NotNull Function2 function20, @NotNull Continuation continuation0) {
        return PausingDispatcherKt.whenStateAtLeast(lifecycle0, State.RESUMED, function20, continuation0);
    }

    @Deprecated(message = "whenResumed has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withResumed for non-suspending work that needs to run only once when the Lifecycle changes.")
    @Nullable
    public static final Object whenResumed(@NotNull LifecycleOwner lifecycleOwner0, @NotNull Function2 function20, @NotNull Continuation continuation0) {
        return PausingDispatcherKt.whenResumed(lifecycleOwner0.getLifecycle(), function20, continuation0);
    }

    @Deprecated(message = "whenStarted has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withStarted for non-suspending work that needs to run only once when the Lifecycle changes.")
    @Nullable
    public static final Object whenStarted(@NotNull Lifecycle lifecycle0, @NotNull Function2 function20, @NotNull Continuation continuation0) {
        return PausingDispatcherKt.whenStateAtLeast(lifecycle0, State.STARTED, function20, continuation0);
    }

    @Deprecated(message = "whenStarted has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withStarted for non-suspending work that needs to run only once when the Lifecycle changes.")
    @Nullable
    public static final Object whenStarted(@NotNull LifecycleOwner lifecycleOwner0, @NotNull Function2 function20, @NotNull Continuation continuation0) {
        return PausingDispatcherKt.whenStarted(lifecycleOwner0.getLifecycle(), function20, continuation0);
    }

    @Deprecated(message = "whenStateAtLeast has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withStateAtLeast for non-suspending work that needs to run only once when the Lifecycle changes.")
    @Nullable
    public static final Object whenStateAtLeast(@NotNull Lifecycle lifecycle0, @NotNull State lifecycle$State0, @NotNull Function2 function20, @NotNull Continuation continuation0) {
        return BuildersKt.withContext(Dispatchers.getMain().getImmediate(), new g0(lifecycle0, lifecycle$State0, function20, null), continuation0);
    }
}

