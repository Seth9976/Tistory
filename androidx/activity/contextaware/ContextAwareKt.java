package androidx.activity.contextaware;

import android.content.Context;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@Metadata(d1 = {"\u0000\u001A\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A=\u0010\u0000\u001A\u0007H\u0001¢\u0006\u0002\b\u0002\"\u0004\b\u0000\u0010\u0001*\u00020\u00032\u001E\b\u0004\u0010\u0004\u001A\u0018\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u0002\u0012\t\u0012\u0007H\u0001¢\u0006\u0002\b\u00020\u0005H\u0086H¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"withContextAvailable", "R", "Lkotlin/jvm/JvmSuppressWildcards;", "Landroidx/activity/contextaware/ContextAware;", "onContextAvailable", "Lkotlin/Function1;", "Landroid/content/Context;", "(Landroidx/activity/contextaware/ContextAware;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "activity_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nContextAware.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextAware.kt\nandroidx/activity/contextaware/ContextAwareKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,94:1\n314#2,11:95\n*S KotlinDebug\n*F\n+ 1 ContextAware.kt\nandroidx/activity/contextaware/ContextAwareKt\n*L\n81#1:95,11\n*E\n"})
public final class ContextAwareKt {
    @Nullable
    public static final Object withContextAvailable(@NotNull ContextAware contextAware0, @NotNull Function1 function10, @NotNull Continuation continuation0) {
        Context context0 = contextAware0.peekAvailableContext();
        if(context0 != null) {
            return function10.invoke(context0);
        }
        CancellableContinuationImpl cancellableContinuationImpl0 = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation0), 1);
        cancellableContinuationImpl0.initCancellability();
        androidx.activity.contextaware.ContextAwareKt.withContextAvailable.2.listener.1 contextAwareKt$withContextAvailable$2$listener$10 = new OnContextAvailableListener() {
            @Override  // androidx.activity.contextaware.OnContextAvailableListener
            public void onContextAvailable(@NotNull Context context0) {
                Object object0;
                Intrinsics.checkNotNullParameter(context0, "context");
                try {
                    object0 = Result.constructor-impl(function10.invoke(context0));
                }
                catch(Throwable throwable0) {
                    object0 = Result.constructor-impl(ResultKt.createFailure(throwable0));
                }
                cancellableContinuationImpl0.resumeWith(object0);
            }
        };
        contextAware0.addOnContextAvailableListener(contextAwareKt$withContextAvailable$2$listener$10);
        cancellableContinuationImpl0.invokeOnCancellation(new Function1(contextAware0, contextAwareKt$withContextAvailable$2$listener$10) {
            public final ContextAware w;
            public final androidx.activity.contextaware.ContextAwareKt.withContextAvailable.2.listener.1 x;

            {
                this.w = contextAware0;
                this.x = contextAwareKt$withContextAvailable$2$listener$10;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((Throwable)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Throwable throwable0) {
                this.w.removeOnContextAvailableListener(this.x);
            }
        });
        Object object0 = cancellableContinuationImpl0.getResult();
        if(object0 == a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation0);
        }
        return object0;
    }
}

