package androidx.paging;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext.Element;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.selects.SelectClause2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;
import s4.c2;
import s4.d2;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004B\u001D\u0012\u0006\u0010\u0005\u001A\u00020\u0003\u0012\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001C\u0010\f\u001A\u00020\u000B2\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\tH\u0096\u0001¢\u0006\u0004\b\f\u0010\rJ5\u0010\u0013\u001A\u00020\u00112#\u0010\u0012\u001A\u001F\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b\u000F\u0012\b\b\u0010\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00110\u000EH\u0096\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0016\u001A\u00020\u000B2\u0006\u0010\u0015\u001A\u00028\u0000H\u0097\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0018\u001A\u00020\u00112\u0006\u0010\u0015\u001A\u00028\u0000H\u0096A¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001D\u001A\b\u0012\u0004\u0012\u00020\u00110\u001A2\u0006\u0010\u0015\u001A\u00028\u0000H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001B\u0010\u001CJ\u001E\u0010 \u001A\u00020\u00112\f\u0010\u001F\u001A\b\u0012\u0004\u0012\u00020\u00110\u001EH\u0096@¢\u0006\u0004\b \u0010!R \u0010\u0006\u001A\b\u0012\u0004\u0012\u00028\u00000\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001A\u0004\b$\u0010%R\u0014\u0010)\u001A\u00020&8\u0016X\u0096\u0005¢\u0006\u0006\u001A\u0004\b\'\u0010(R\u0014\u0010*\u001A\u00020\u000B8\u0016X\u0097\u0005¢\u0006\u0006\u001A\u0004\b*\u0010+R&\u0010/\u001A\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040,8\u0016X\u0096\u0005¢\u0006\u0006\u001A\u0004\b-\u0010.\u0082\u0002\u000B\n\u0002\b!\n\u0005\b¡\u001E0\u0001¨\u00060"}, d2 = {"Landroidx/paging/SimpleProducerScopeImpl;", "T", "Landroidx/paging/SimpleProducerScope;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlinx/coroutines/channels/SendChannel;", "scope", "channel", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Lkotlinx/coroutines/channels/SendChannel;)V", "", "cause", "", "close", "(Ljava/lang/Throwable;)Z", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "", "handler", "invokeOnClose", "(Lkotlin/jvm/functions/Function1;)V", "element", "offer", "(Ljava/lang/Object;)Z", "send", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/ChannelResult;", "trySend-JP2dKIU", "(Ljava/lang/Object;)Ljava/lang/Object;", "trySend", "Lkotlin/Function0;", "block", "awaitClose", "(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Lkotlinx/coroutines/channels/SendChannel;", "getChannel", "()Lkotlinx/coroutines/channels/SendChannel;", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "isClosedForSend", "()Z", "Lkotlinx/coroutines/selects/SelectClause2;", "getOnSend", "()Lkotlinx/coroutines/selects/SelectClause2;", "onSend", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSimpleChannelFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SimpleChannelFlow.kt\nandroidx/paging/SimpleProducerScopeImpl\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,100:1\n314#2,11:101\n*S KotlinDebug\n*F\n+ 1 SimpleChannelFlow.kt\nandroidx/paging/SimpleProducerScopeImpl\n*L\n90#1:101,11\n*E\n"})
public final class SimpleProducerScopeImpl implements SimpleProducerScope, CoroutineScope, SendChannel {
    public final SendChannel a;
    public final CoroutineScope b;

    public SimpleProducerScopeImpl(@NotNull CoroutineScope coroutineScope0, @NotNull SendChannel sendChannel0) {
        Intrinsics.checkNotNullParameter(coroutineScope0, "scope");
        Intrinsics.checkNotNullParameter(sendChannel0, "channel");
        super();
        this.a = sendChannel0;
        this.b = coroutineScope0;
    }

    @Override  // androidx.paging.SimpleProducerScope
    @Nullable
    public Object awaitClose(@NotNull Function0 function00, @NotNull Continuation continuation0) {
        c2 c20;
        if(continuation0 instanceof c2) {
            c20 = (c2)continuation0;
            int v = c20.s;
            if((v & 0x80000000) == 0) {
                c20 = new c2(this, continuation0);
            }
            else {
                c20.s = v ^ 0x80000000;
            }
        }
        else {
            c20 = new c2(this, continuation0);
        }
        Object object0 = c20.q;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(c20.s) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    Element coroutineContext$Element0 = this.getCoroutineContext().get(Job.Key);
                    if(coroutineContext$Element0 == null) {
                        throw new IllegalStateException("Internal error, context should have a job.");
                    }
                    c20.o = function00;
                    c20.p = (Job)coroutineContext$Element0;
                    c20.s = 1;
                    CancellableContinuationImpl cancellableContinuationImpl0 = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(c20), 1);
                    cancellableContinuationImpl0.initCancellability();
                    ((Job)coroutineContext$Element0).invokeOnCompletion(new d2(cancellableContinuationImpl0, 0));
                    Object object2 = cancellableContinuationImpl0.getResult();
                    if(object2 == a.getCOROUTINE_SUSPENDED()) {
                        DebugProbesKt.probeCoroutineSuspended(c20);
                    }
                    if(object2 == object1) {
                        return object1;
                    label_28:
                        function00 = c20.o;
                        ResultKt.throwOnFailure(object0);
                    }
                    break;
                }
                catch(Throwable throwable0) {
                    function00.invoke();
                    throw throwable0;
                }
            }
            case 1: {
                goto label_28;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        function00.invoke();
        return Unit.INSTANCE;
    }

    @Override  // kotlinx.coroutines.channels.SendChannel
    public boolean close(@Nullable Throwable throwable0) {
        return this.a.close(throwable0);
    }

    @Override  // androidx.paging.SimpleProducerScope
    @NotNull
    public SendChannel getChannel() {
        return this.a;
    }

    @Override  // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.b.getCoroutineContext();
    }

    @Override  // kotlinx.coroutines.channels.SendChannel
    @NotNull
    public SelectClause2 getOnSend() {
        return this.a.getOnSend();
    }

    @Override  // kotlinx.coroutines.channels.SendChannel
    public void invokeOnClose(@NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "handler");
        this.a.invokeOnClose(function10);
    }

    @Override  // kotlinx.coroutines.channels.SendChannel
    public boolean isClosedForSend() {
        return this.a.isClosedForSend();
    }

    @Override  // kotlinx.coroutines.channels.SendChannel
    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of \'trySend\' method", replaceWith = @ReplaceWith(expression = "trySend(element).isSuccess", imports = {}))
    public boolean offer(Object object0) {
        return this.a.offer(object0);
    }

    @Override  // kotlinx.coroutines.channels.SendChannel
    @Nullable
    public Object send(Object object0, @NotNull Continuation continuation0) {
        return this.a.send(object0, continuation0);
    }

    @Override  // kotlinx.coroutines.channels.SendChannel
    @NotNull
    public Object trySend-JP2dKIU(Object object0) {
        return this.a.trySend-JP2dKIU(object0);
    }
}

