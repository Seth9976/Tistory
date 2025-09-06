package androidx.datastore.core;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001A\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\u008A@"}, d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 0x30)
@DebugMetadata(c = "androidx.datastore.core.MultiProcessCoordinator$withLazyCounter$2", f = "MultiProcessCoordinator.android.kt", i = {}, l = {0xA3}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nMultiProcessCoordinator.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiProcessCoordinator.android.kt\nandroidx/datastore/core/MultiProcessCoordinator$withLazyCounter$2\n*L\n1#1,205:1\n*E\n"})
public final class MultiProcessCoordinator.withLazyCounter.2 extends SuspendLambda implements Function2 {
    public int o;
    public final Function2 p;
    public final MultiProcessCoordinator q;

    public MultiProcessCoordinator.withLazyCounter.2(Function2 function20, MultiProcessCoordinator multiProcessCoordinator0, Continuation continuation0) {
        this.p = function20;
        this.q = multiProcessCoordinator0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation create(@Nullable Object object0, @NotNull Continuation continuation0) {
        return new MultiProcessCoordinator.withLazyCounter.2(this.p, this.q, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public Object invoke(Object object0, Object object1) {
        return this.invoke(((CoroutineScope)object0), ((Continuation)object1));
    }

    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope0, @Nullable Continuation continuation0) {
        return ((MultiProcessCoordinator.withLazyCounter.2)this.create(coroutineScope0, continuation0)).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                SharedCounter sharedCounter0 = MultiProcessCoordinator.access$getSharedCounter(this.q);
                this.o = 1;
                object0 = this.p.invoke(sharedCounter0, this);
                return object0 == object1 ? object1 : object0;
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                return object0;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    @Nullable
    public final Object invokeSuspend$$forInline(@NotNull Object object0) {
        SharedCounter sharedCounter0 = MultiProcessCoordinator.access$getSharedCounter(this.q);
        return this.p.invoke(sharedCounter0, this);
    }
}

