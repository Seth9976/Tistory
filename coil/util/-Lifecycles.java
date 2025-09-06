package coil.util;

import androidx.annotation.MainThread;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle.State;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import z5.a;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001A\u0012\u0010\u0000\u001A\u00020\u0001*\u00020\u0002H\u0081@¢\u0006\u0002\u0010\u0003\u001A\u0014\u0010\u0004\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"awaitStarted", "", "Landroidx/lifecycle/Lifecycle;", "(Landroidx/lifecycle/Lifecycle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeAndAddObserver", "observer", "Landroidx/lifecycle/LifecycleObserver;", "coil-base_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@JvmName(name = "-Lifecycles")
@SourceDebugExtension({"SMAP\nLifecycles.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Lifecycles.kt\ncoil/util/-Lifecycles\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,43:1\n314#2,11:44\n1#3:55\n*S KotlinDebug\n*F\n+ 1 Lifecycles.kt\ncoil/util/-Lifecycles\n*L\n23#1:44,11\n*E\n"})
public final class -Lifecycles {
    @MainThread
    @Nullable
    public static final Object awaitStarted(@NotNull Lifecycle lifecycle0, @NotNull Continuation continuation0) {
        Throwable throwable1;
        ObjectRef ref$ObjectRef1;
        Lifecycle lifecycle1;
        a a0;
        if(continuation0 instanceof a) {
            a0 = (a)continuation0;
            int v = a0.r;
            if((v & 0x80000000) == 0) {
                a0 = new a(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
            }
            else {
                a0.r = v ^ 0x80000000;
            }
        }
        else {
            a0 = new a(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
        }
        Object object0 = a0.q;
        Object object1 = qd.a.getCOROUTINE_SUSPENDED();
        switch(a0.r) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                if(lifecycle0.getCurrentState().isAtLeast(State.STARTED)) {
                    return Unit.INSTANCE;
                }
                ObjectRef ref$ObjectRef0 = new ObjectRef();
                try {
                    a0.o = lifecycle0;
                    a0.p = ref$ObjectRef0;
                    a0.r = 1;
                    CancellableContinuationImpl cancellableContinuationImpl0 = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(a0), 1);
                    cancellableContinuationImpl0.initCancellability();
                    coil.util.-Lifecycles.awaitStarted.2.1 -Lifecycles$awaitStarted$2$10 = new DefaultLifecycleObserver() {
                        public final CancellableContinuationImpl a;

                        {
                            CancellableContinuationImpl cancellableContinuationImpl0 = cancellableContinuationImpl0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                            this.a = cancellableContinuationImpl0;
                        }

                        @Override  // androidx.lifecycle.DefaultLifecycleObserver
                        public void onStart(@NotNull LifecycleOwner lifecycleOwner0) {
                            this.a.resumeWith(Unit.INSTANCE);
                        }
                    };
                    ref$ObjectRef0.element = -Lifecycles$awaitStarted$2$10;
                    Intrinsics.checkNotNull(-Lifecycles$awaitStarted$2$10);
                    lifecycle0.addObserver(-Lifecycles$awaitStarted$2$10);
                    Object object2 = cancellableContinuationImpl0.getResult();
                    if(object2 == qd.a.getCOROUTINE_SUSPENDED()) {
                        DebugProbesKt.probeCoroutineSuspended(a0);
                    }
                }
                catch(Throwable throwable0) {
                    lifecycle1 = lifecycle0;
                    ref$ObjectRef1 = ref$ObjectRef0;
                    throwable1 = throwable0;
                    goto label_45;
                }
                if(object2 == object1) {
                    return object1;
                }
                lifecycle1 = lifecycle0;
                ref$ObjectRef1 = ref$ObjectRef0;
                break;
            }
            case 1: {
                try {
                    ref$ObjectRef1 = a0.p;
                    lifecycle1 = a0.o;
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(Throwable throwable1) {
                }
            label_45:
                LifecycleObserver lifecycleObserver0 = (LifecycleObserver)ref$ObjectRef1.element;
                if(lifecycleObserver0 != null) {
                    lifecycle1.removeObserver(lifecycleObserver0);
                }
                throw throwable1;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        LifecycleObserver lifecycleObserver1 = (LifecycleObserver)ref$ObjectRef1.element;
        if(lifecycleObserver1 != null) {
            lifecycle1.removeObserver(lifecycleObserver1);
        }
        return Unit.INSTANCE;
    }

    @MainThread
    public static final void removeAndAddObserver(@NotNull Lifecycle lifecycle0, @NotNull LifecycleObserver lifecycleObserver0) {
        lifecycle0.removeObserver(lifecycleObserver0);
        lifecycle0.addObserver(lifecycleObserver0);
    }
}

