package androidx.lifecycle;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@Metadata(d1 = {"\u0000,\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u001A>\u0010\u0000\u001A\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\b2\f\u0010\t\u001A\b\u0012\u0004\u0012\u0002H\u00010\nH\u0081@\u00A2\u0006\u0002\u0010\u000B\u001A(\u0010\f\u001A\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\u000E\b\u0004\u0010\t\u001A\b\u0012\u0004\u0012\u0002H\u00010\nH\u0086H\u00A2\u0006\u0002\u0010\r\u001A(\u0010\f\u001A\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u000E2\u000E\b\u0004\u0010\t\u001A\b\u0012\u0004\u0012\u0002H\u00010\nH\u0086H\u00A2\u0006\u0002\u0010\u000F\u001A(\u0010\u0010\u001A\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\u000E\b\u0004\u0010\t\u001A\b\u0012\u0004\u0012\u0002H\u00010\nH\u0086H\u00A2\u0006\u0002\u0010\r\u001A(\u0010\u0010\u001A\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u000E2\u000E\b\u0004\u0010\t\u001A\b\u0012\u0004\u0012\u0002H\u00010\nH\u0086H\u00A2\u0006\u0002\u0010\u000F\u001A(\u0010\u0011\u001A\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\u000E\b\u0004\u0010\t\u001A\b\u0012\u0004\u0012\u0002H\u00010\nH\u0086H\u00A2\u0006\u0002\u0010\r\u001A(\u0010\u0011\u001A\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u000E2\u000E\b\u0004\u0010\t\u001A\b\u0012\u0004\u0012\u0002H\u00010\nH\u0086H\u00A2\u0006\u0002\u0010\u000F\u001A0\u0010\u0012\u001A\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u00042\u000E\b\u0004\u0010\t\u001A\b\u0012\u0004\u0012\u0002H\u00010\nH\u0086H\u00A2\u0006\u0002\u0010\u0013\u001A0\u0010\u0012\u001A\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u000E2\u0006\u0010\u0003\u001A\u00020\u00042\u000E\b\u0004\u0010\t\u001A\b\u0012\u0004\u0012\u0002H\u00010\nH\u0086H\u00A2\u0006\u0002\u0010\u0014\u001A0\u0010\u0015\u001A\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u00042\u000E\b\u0004\u0010\t\u001A\b\u0012\u0004\u0012\u0002H\u00010\nH\u0081H\u00A2\u0006\u0002\u0010\u0013\u00A8\u0006\u0016"}, d2 = {"suspendWithStateAtLeastUnchecked", "R", "Landroidx/lifecycle/Lifecycle;", "state", "Landroidx/lifecycle/Lifecycle$State;", "dispatchNeeded", "", "lifecycleDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "block", "Lkotlin/Function0;", "(Landroidx/lifecycle/Lifecycle;Landroidx/lifecycle/Lifecycle$State;ZLkotlinx/coroutines/CoroutineDispatcher;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "withCreated", "(Landroidx/lifecycle/Lifecycle;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/lifecycle/LifecycleOwner;", "(Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "withResumed", "withStarted", "withStateAtLeast", "(Landroidx/lifecycle/Lifecycle;Landroidx/lifecycle/Lifecycle$State;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$State;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "withStateAtLeastUnchecked", "lifecycle-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nWithLifecycleState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WithLifecycleState.kt\nandroidx/lifecycle/WithLifecycleStateKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 Runnable.kt\nkotlinx/coroutines/RunnableKt\n*L\n1#1,207:1\n155#1,8:208\n155#1,8:216\n155#1,8:224\n155#1,8:232\n44#1,5:240\n155#1,8:245\n44#1,5:253\n155#1,8:258\n155#1,8:266\n155#1,8:274\n155#1,8:282\n314#2,9:290\n323#2,2:300\n17#3:299\n*S KotlinDebug\n*F\n+ 1 WithLifecycleState.kt\nandroidx/lifecycle/WithLifecycleStateKt\n*L\n48#1:208,8\n59#1:216,8\n72#1:224,8\n85#1:232,8\n99#1:240,5\n99#1:245,8\n99#1:253,5\n99#1:258,8\n112#1:266,8\n125#1:274,8\n138#1:282,8\n178#1:290,9\n178#1:300,2\n194#1:299\n*E\n"})
public final class WithLifecycleStateKt {
    @PublishedApi
    @Nullable
    public static final Object suspendWithStateAtLeastUnchecked(@NotNull Lifecycle lifecycle0, @NotNull State lifecycle$State0, boolean z, @NotNull CoroutineDispatcher coroutineDispatcher0, @NotNull Function0 function00, @NotNull Continuation continuation0) {
        CancellableContinuationImpl cancellableContinuationImpl0 = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation0), 1);
        cancellableContinuationImpl0.initCancellability();
        androidx.lifecycle.WithLifecycleStateKt.suspendWithStateAtLeastUnchecked.2.observer.1 withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$10 = new LifecycleEventObserver() {
            public final State a;
            public final Lifecycle b;
            public final CancellableContinuationImpl c;
            public final Function0 d;

            {
                State lifecycle$State0 = lifecycle$State0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                Lifecycle lifecycle0 = lifecycle0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                CancellableContinuationImpl cancellableContinuationImpl0 = cancellableContinuationImpl0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                Function0 function00 = function00;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                this.a = lifecycle$State0;
                this.b = lifecycle0;
                this.c = cancellableContinuationImpl0;
                this.d = function00;
            }

            @Override  // androidx.lifecycle.LifecycleEventObserver
            public void onStateChanged(@NotNull LifecycleOwner lifecycleOwner0, @NotNull Event lifecycle$Event0) {
                Object object0;
                Intrinsics.checkNotNullParameter(lifecycleOwner0, "source");
                Intrinsics.checkNotNullParameter(lifecycle$Event0, "event");
                Event lifecycle$Event1 = Event.Companion.upTo(this.a);
                CancellableContinuationImpl cancellableContinuationImpl0 = this.c;
                Lifecycle lifecycle0 = this.b;
                if(lifecycle$Event0 == lifecycle$Event1) {
                    lifecycle0.removeObserver(this);
                    try {
                        object0 = Result.constructor-impl(this.d.invoke());
                    }
                    catch(Throwable throwable0) {
                        object0 = Result.constructor-impl(ResultKt.createFailure(throwable0));
                    }
                    cancellableContinuationImpl0.resumeWith(object0);
                    return;
                }
                if(lifecycle$Event0 == Event.ON_DESTROY) {
                    lifecycle0.removeObserver(this);
                    cancellableContinuationImpl0.resumeWith(Result.constructor-impl(ResultKt.createFailure(new LifecycleDestroyedException())));
                }
            }
        };
        if(z) {
            androidx.lifecycle.WithLifecycleStateKt.suspendWithStateAtLeastUnchecked.lambda.2..inlined.Runnable.1 withLifecycleStateKt$suspendWithStateAtLeastUnchecked$lambda$2$$inlined$Runnable$10 = new Runnable() {
                @Override
                public final void run() {
                    lifecycle0.addObserver(withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$10);
                }
            };
            coroutineDispatcher0.dispatch(EmptyCoroutineContext.INSTANCE, withLifecycleStateKt$suspendWithStateAtLeastUnchecked$lambda$2$$inlined$Runnable$10);
        }
        else {
            lifecycle0.addObserver(withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$10);
        }
        cancellableContinuationImpl0.invokeOnCancellation(new u0(coroutineDispatcher0, lifecycle0, withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$10));
        Object object0 = cancellableContinuationImpl0.getResult();
        if(object0 == a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation0);
        }
        return object0;
    }

    @Nullable
    public static final Object withCreated(@NotNull Lifecycle lifecycle0, @NotNull Function0 function00, @NotNull Continuation continuation0) {
        State lifecycle$State0 = State.CREATED;
        MainCoroutineDispatcher mainCoroutineDispatcher0 = Dispatchers.getMain().getImmediate();
        if(!mainCoroutineDispatcher0.isDispatchNeeded(continuation0.getContext())) {
            if(lifecycle0.getCurrentState() == State.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            return lifecycle0.getCurrentState().compareTo(lifecycle$State0) < 0 ? WithLifecycleStateKt.suspendWithStateAtLeastUnchecked(lifecycle0, lifecycle$State0, false, mainCoroutineDispatcher0, new androidx.lifecycle.WithLifecycleStateKt.withStateAtLeastUnchecked.2(function00), continuation0) : function00.invoke();
        }
        return WithLifecycleStateKt.suspendWithStateAtLeastUnchecked(lifecycle0, lifecycle$State0, true, mainCoroutineDispatcher0, new androidx.lifecycle.WithLifecycleStateKt.withStateAtLeastUnchecked.2(function00), continuation0);
    }

    @Nullable
    public static final Object withCreated(@NotNull LifecycleOwner lifecycleOwner0, @NotNull Function0 function00, @NotNull Continuation continuation0) {
        Lifecycle lifecycle0 = lifecycleOwner0.getLifecycle();
        State lifecycle$State0 = State.CREATED;
        MainCoroutineDispatcher mainCoroutineDispatcher0 = Dispatchers.getMain().getImmediate();
        if(!mainCoroutineDispatcher0.isDispatchNeeded(continuation0.getContext())) {
            if(lifecycle0.getCurrentState() == State.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            return lifecycle0.getCurrentState().compareTo(lifecycle$State0) < 0 ? WithLifecycleStateKt.suspendWithStateAtLeastUnchecked(lifecycle0, lifecycle$State0, false, mainCoroutineDispatcher0, new androidx.lifecycle.WithLifecycleStateKt.withStateAtLeastUnchecked.2(function00), continuation0) : function00.invoke();
        }
        return WithLifecycleStateKt.suspendWithStateAtLeastUnchecked(lifecycle0, lifecycle$State0, true, mainCoroutineDispatcher0, new androidx.lifecycle.WithLifecycleStateKt.withStateAtLeastUnchecked.2(function00), continuation0);
    }

    @Nullable
    public static final Object withResumed(@NotNull Lifecycle lifecycle0, @NotNull Function0 function00, @NotNull Continuation continuation0) {
        State lifecycle$State0 = State.RESUMED;
        MainCoroutineDispatcher mainCoroutineDispatcher0 = Dispatchers.getMain().getImmediate();
        if(!mainCoroutineDispatcher0.isDispatchNeeded(continuation0.getContext())) {
            if(lifecycle0.getCurrentState() == State.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            return lifecycle0.getCurrentState().compareTo(lifecycle$State0) < 0 ? WithLifecycleStateKt.suspendWithStateAtLeastUnchecked(lifecycle0, lifecycle$State0, false, mainCoroutineDispatcher0, new androidx.lifecycle.WithLifecycleStateKt.withStateAtLeastUnchecked.2(function00), continuation0) : function00.invoke();
        }
        return WithLifecycleStateKt.suspendWithStateAtLeastUnchecked(lifecycle0, lifecycle$State0, true, mainCoroutineDispatcher0, new androidx.lifecycle.WithLifecycleStateKt.withStateAtLeastUnchecked.2(function00), continuation0);
    }

    @Nullable
    public static final Object withResumed(@NotNull LifecycleOwner lifecycleOwner0, @NotNull Function0 function00, @NotNull Continuation continuation0) {
        Lifecycle lifecycle0 = lifecycleOwner0.getLifecycle();
        State lifecycle$State0 = State.RESUMED;
        MainCoroutineDispatcher mainCoroutineDispatcher0 = Dispatchers.getMain().getImmediate();
        if(!mainCoroutineDispatcher0.isDispatchNeeded(continuation0.getContext())) {
            if(lifecycle0.getCurrentState() == State.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            return lifecycle0.getCurrentState().compareTo(lifecycle$State0) < 0 ? WithLifecycleStateKt.suspendWithStateAtLeastUnchecked(lifecycle0, lifecycle$State0, false, mainCoroutineDispatcher0, new androidx.lifecycle.WithLifecycleStateKt.withStateAtLeastUnchecked.2(function00), continuation0) : function00.invoke();
        }
        return WithLifecycleStateKt.suspendWithStateAtLeastUnchecked(lifecycle0, lifecycle$State0, true, mainCoroutineDispatcher0, new androidx.lifecycle.WithLifecycleStateKt.withStateAtLeastUnchecked.2(function00), continuation0);
    }

    @Nullable
    public static final Object withStarted(@NotNull Lifecycle lifecycle0, @NotNull Function0 function00, @NotNull Continuation continuation0) {
        State lifecycle$State0 = State.STARTED;
        MainCoroutineDispatcher mainCoroutineDispatcher0 = Dispatchers.getMain().getImmediate();
        if(!mainCoroutineDispatcher0.isDispatchNeeded(continuation0.getContext())) {
            if(lifecycle0.getCurrentState() == State.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            return lifecycle0.getCurrentState().compareTo(lifecycle$State0) < 0 ? WithLifecycleStateKt.suspendWithStateAtLeastUnchecked(lifecycle0, lifecycle$State0, false, mainCoroutineDispatcher0, new androidx.lifecycle.WithLifecycleStateKt.withStateAtLeastUnchecked.2(function00), continuation0) : function00.invoke();
        }
        return WithLifecycleStateKt.suspendWithStateAtLeastUnchecked(lifecycle0, lifecycle$State0, true, mainCoroutineDispatcher0, new androidx.lifecycle.WithLifecycleStateKt.withStateAtLeastUnchecked.2(function00), continuation0);
    }

    @Nullable
    public static final Object withStarted(@NotNull LifecycleOwner lifecycleOwner0, @NotNull Function0 function00, @NotNull Continuation continuation0) {
        Lifecycle lifecycle0 = lifecycleOwner0.getLifecycle();
        State lifecycle$State0 = State.STARTED;
        MainCoroutineDispatcher mainCoroutineDispatcher0 = Dispatchers.getMain().getImmediate();
        if(!mainCoroutineDispatcher0.isDispatchNeeded(continuation0.getContext())) {
            if(lifecycle0.getCurrentState() == State.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            return lifecycle0.getCurrentState().compareTo(lifecycle$State0) < 0 ? WithLifecycleStateKt.suspendWithStateAtLeastUnchecked(lifecycle0, lifecycle$State0, false, mainCoroutineDispatcher0, new androidx.lifecycle.WithLifecycleStateKt.withStateAtLeastUnchecked.2(function00), continuation0) : function00.invoke();
        }
        return WithLifecycleStateKt.suspendWithStateAtLeastUnchecked(lifecycle0, lifecycle$State0, true, mainCoroutineDispatcher0, new androidx.lifecycle.WithLifecycleStateKt.withStateAtLeastUnchecked.2(function00), continuation0);
    }

    @Nullable
    public static final Object withStateAtLeast(@NotNull Lifecycle lifecycle0, @NotNull State lifecycle$State0, @NotNull Function0 function00, @NotNull Continuation continuation0) {
        if(lifecycle$State0.compareTo(State.CREATED) < 0) {
            throw new IllegalArgumentException(("target state must be CREATED or greater, found " + lifecycle$State0).toString());
        }
        MainCoroutineDispatcher mainCoroutineDispatcher0 = Dispatchers.getMain().getImmediate();
        if(!mainCoroutineDispatcher0.isDispatchNeeded(continuation0.getContext())) {
            if(lifecycle0.getCurrentState() == State.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            return lifecycle0.getCurrentState().compareTo(lifecycle$State0) < 0 ? WithLifecycleStateKt.suspendWithStateAtLeastUnchecked(lifecycle0, lifecycle$State0, false, mainCoroutineDispatcher0, new androidx.lifecycle.WithLifecycleStateKt.withStateAtLeastUnchecked.2(function00), continuation0) : function00.invoke();
        }
        return WithLifecycleStateKt.suspendWithStateAtLeastUnchecked(lifecycle0, lifecycle$State0, true, mainCoroutineDispatcher0, new androidx.lifecycle.WithLifecycleStateKt.withStateAtLeastUnchecked.2(function00), continuation0);
    }

    @Nullable
    public static final Object withStateAtLeast(@NotNull LifecycleOwner lifecycleOwner0, @NotNull State lifecycle$State0, @NotNull Function0 function00, @NotNull Continuation continuation0) {
        Lifecycle lifecycle0 = lifecycleOwner0.getLifecycle();
        if(lifecycle$State0.compareTo(State.CREATED) < 0) {
            throw new IllegalArgumentException(("target state must be CREATED or greater, found " + lifecycle$State0).toString());
        }
        MainCoroutineDispatcher mainCoroutineDispatcher0 = Dispatchers.getMain().getImmediate();
        if(!mainCoroutineDispatcher0.isDispatchNeeded(continuation0.getContext())) {
            if(lifecycle0.getCurrentState() == State.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            return lifecycle0.getCurrentState().compareTo(lifecycle$State0) < 0 ? WithLifecycleStateKt.suspendWithStateAtLeastUnchecked(lifecycle0, lifecycle$State0, false, mainCoroutineDispatcher0, new androidx.lifecycle.WithLifecycleStateKt.withStateAtLeastUnchecked.2(function00), continuation0) : function00.invoke();
        }
        return WithLifecycleStateKt.suspendWithStateAtLeastUnchecked(lifecycle0, lifecycle$State0, true, mainCoroutineDispatcher0, new androidx.lifecycle.WithLifecycleStateKt.withStateAtLeastUnchecked.2(function00), continuation0);
    }

    @PublishedApi
    @Nullable
    public static final Object withStateAtLeastUnchecked(@NotNull Lifecycle lifecycle0, @NotNull State lifecycle$State0, @NotNull Function0 function00, @NotNull Continuation continuation0) {
        MainCoroutineDispatcher mainCoroutineDispatcher0 = Dispatchers.getMain().getImmediate();
        if(!mainCoroutineDispatcher0.isDispatchNeeded(continuation0.getContext())) {
            if(lifecycle0.getCurrentState() == State.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            return lifecycle0.getCurrentState().compareTo(lifecycle$State0) < 0 ? WithLifecycleStateKt.suspendWithStateAtLeastUnchecked(lifecycle0, lifecycle$State0, false, mainCoroutineDispatcher0, new Function0(function00) {
                public final Function0 w;

                {
                    this.w = function00;
                    super(0);
                }

                @Override  // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return this.w.invoke();
                }
            }, continuation0) : function00.invoke();
        }
        return WithLifecycleStateKt.suspendWithStateAtLeastUnchecked(lifecycle0, lifecycle$State0, true, mainCoroutineDispatcher0, new Function0(function00) {
            public final Function0 w;

            {
                this.w = function00;
                super(0);
            }

            @Override  // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.w.invoke();
            }
        }, continuation0);
    }
}

