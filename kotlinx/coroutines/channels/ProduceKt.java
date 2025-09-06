package kotlinx.coroutines.channels;

import kotlin.BuilderInference;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.InternalCoroutinesApi;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;
import s4.d2;
import uf.l1;
import uf.m1;

@Metadata(d1 = {"\u0000b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A)\u0010\u0000\u001A\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00022\u000E\b\u0002\u0010\u0003\u001A\b\u0012\u0004\u0012\u00020\u00010\u0004H\u0086@\u00F8\u0001\u0000\u00A2\u0006\u0002\u0010\u0005\u001A\u009E\u0001\u0010\u0006\u001A\b\u0012\u0004\u0012\u0002H\b0\u0007\"\u0004\b\u0000\u0010\b*\u00020\t2\b\b\u0002\u0010\n\u001A\u00020\u000B2\b\b\u0002\u0010\f\u001A\u00020\r2\b\b\u0002\u0010\u000E\u001A\u00020\u000F2-\b\u0002\u0010\u0010\u001A\'\u0012\u0015\u0012\u0013\u0018\u00010\u0012\u00A2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0011j\u0004\u0018\u0001`\u00162/\b\u0001\u0010\u0003\u001A)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0017\u00A2\u0006\u0002\b\u001AH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0002\u0010\u001B\u001A\u00A8\u0001\u0010\u0006\u001A\b\u0012\u0004\u0012\u0002H\b0\u0007\"\u0004\b\u0000\u0010\b*\u00020\t2\b\b\u0002\u0010\n\u001A\u00020\u000B2\b\b\u0002\u0010\f\u001A\u00020\r2\b\b\u0002\u0010\u001C\u001A\u00020\u001D2\b\b\u0002\u0010\u000E\u001A\u00020\u000F2-\b\u0002\u0010\u0010\u001A\'\u0012\u0015\u0012\u0013\u0018\u00010\u0012\u00A2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0011j\u0004\u0018\u0001`\u00162/\b\u0001\u0010\u0003\u001A)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0017\u00A2\u0006\u0002\b\u001AH\u0000\u00F8\u0001\u0000\u00A2\u0006\u0002\u0010\u001E\u001Ae\u0010\u0006\u001A\b\u0012\u0004\u0012\u0002H\b0\u0007\"\u0004\b\u0000\u0010\b*\u00020\t2\b\b\u0002\u0010\n\u001A\u00020\u000B2\b\b\u0002\u0010\f\u001A\u00020\r2/\b\u0001\u0010\u0003\u001A)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0017\u00A2\u0006\u0002\b\u001AH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0002\u0010\u001F\u0082\u0002\u0004\n\u0002\b\u0019\u00A8\u0006 "}, d2 = {"awaitClose", "", "Lkotlinx/coroutines/channels/ProducerScope;", "block", "Lkotlin/Function0;", "(Lkotlinx/coroutines/channels/ProducerScope;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "produce", "Lkotlinx/coroutines/channels/ReceiveChannel;", "E", "Lkotlinx/coroutines/CoroutineScope;", "context", "Lkotlin/coroutines/CoroutineContext;", "capacity", "", "start", "Lkotlinx/coroutines/CoroutineStart;", "onCompletion", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "cause", "Lkotlinx/coroutines/CompletionHandler;", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/channels/ReceiveChannel;", "onBufferOverflow", "Lkotlinx/coroutines/channels/BufferOverflow;", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/channels/ReceiveChannel;", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;ILkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/channels/ReceiveChannel;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nProduce.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Produce.kt\nkotlinx/coroutines/channels/ProduceKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,151:1\n1#2:152\n314#3,11:153\n*S KotlinDebug\n*F\n+ 1 Produce.kt\nkotlinx/coroutines/channels/ProduceKt\n*L\n48#1:153,11\n*E\n"})
public final class ProduceKt {
    @Nullable
    public static final Object awaitClose(@NotNull ProducerScope producerScope0, @NotNull Function0 function00, @NotNull Continuation continuation0) {
        l1 l10;
        if(continuation0 instanceof l1) {
            l10 = (l1)continuation0;
            int v = l10.r;
            if((v & 0x80000000) == 0) {
                l10 = new l1(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
            }
            else {
                l10.r = v ^ 0x80000000;
            }
        }
        else {
            l10 = new l1(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
        }
        Object object0 = l10.q;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(l10.r) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                if(l10.getContext().get(Job.Key) != producerScope0) {
                    throw new IllegalStateException("awaitClose() can only be invoked from the producer context");
                }
                try {
                    l10.o = producerScope0;
                    l10.p = function00;
                    l10.r = 1;
                    CancellableContinuationImpl cancellableContinuationImpl0 = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(l10), 1);
                    cancellableContinuationImpl0.initCancellability();
                    producerScope0.invokeOnClose(new d2(cancellableContinuationImpl0, 1));
                    Object object2 = cancellableContinuationImpl0.getResult();
                    if(object2 == a.getCOROUTINE_SUSPENDED()) {
                        DebugProbesKt.probeCoroutineSuspended(l10);
                    }
                }
                catch(Throwable throwable0) {
                    function00.invoke();
                    throw throwable0;
                }
                if(object2 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                try {
                    function00 = l10.p;
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(Throwable throwable0) {
                    function00.invoke();
                    throw throwable0;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        function00.invoke();
        return Unit.INSTANCE;
    }

    public static Object awaitClose$default(ProducerScope producerScope0, Function0 function00, Continuation continuation0, int v, Object object0) {
        if((v & 1) != 0) {
            function00 = m1.w;
        }
        return ProduceKt.awaitClose(producerScope0, function00, continuation0);
    }

    @ExperimentalCoroutinesApi
    @NotNull
    public static final ReceiveChannel produce(@NotNull CoroutineScope coroutineScope0, @NotNull CoroutineContext coroutineContext0, int v, @BuilderInference @NotNull Function2 function20) {
        return ProduceKt.produce(coroutineScope0, coroutineContext0, v, BufferOverflow.SUSPEND, CoroutineStart.DEFAULT, null, function20);
    }

    @InternalCoroutinesApi
    @NotNull
    public static final ReceiveChannel produce(@NotNull CoroutineScope coroutineScope0, @NotNull CoroutineContext coroutineContext0, int v, @NotNull CoroutineStart coroutineStart0, @Nullable Function1 function10, @BuilderInference @NotNull Function2 function20) {
        return ProduceKt.produce(coroutineScope0, coroutineContext0, v, BufferOverflow.SUSPEND, coroutineStart0, function10, function20);
    }

    @NotNull
    public static final ReceiveChannel produce(@NotNull CoroutineScope coroutineScope0, @NotNull CoroutineContext coroutineContext0, int v, @NotNull BufferOverflow bufferOverflow0, @NotNull CoroutineStart coroutineStart0, @Nullable Function1 function10, @BuilderInference @NotNull Function2 function20) {
        Channel channel0 = ChannelKt.Channel$default(v, bufferOverflow0, null, 4, null);
        ReceiveChannel receiveChannel0 = new f(CoroutineContextKt.newCoroutineContext(coroutineScope0, coroutineContext0), channel0, true, true);  // 初始化器: Lkotlinx/coroutines/channels/ChannelCoroutine;-><init>(Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/channels/Channel;ZZ)V
        if(function10 != null) {
            ((JobSupport)receiveChannel0).invokeOnCompletion(function10);
        }
        ((AbstractCoroutine)receiveChannel0).start(coroutineStart0, receiveChannel0, function20);
        return receiveChannel0;
    }

    public static ReceiveChannel produce$default(CoroutineScope coroutineScope0, CoroutineContext coroutineContext0, int v, Function2 function20, int v1, Object object0) {
        if((v1 & 1) != 0) {
            coroutineContext0 = EmptyCoroutineContext.INSTANCE;
        }
        if((v1 & 2) != 0) {
            v = 0;
        }
        return ProduceKt.produce(coroutineScope0, coroutineContext0, v, function20);
    }

    public static ReceiveChannel produce$default(CoroutineScope coroutineScope0, CoroutineContext coroutineContext0, int v, CoroutineStart coroutineStart0, Function1 function10, Function2 function20, int v1, Object object0) {
        if((v1 & 1) != 0) {
            coroutineContext0 = EmptyCoroutineContext.INSTANCE;
        }
        if((v1 & 2) != 0) {
            v = 0;
        }
        if((v1 & 4) != 0) {
            coroutineStart0 = CoroutineStart.DEFAULT;
        }
        if((v1 & 8) != 0) {
            function10 = null;
        }
        return ProduceKt.produce(coroutineScope0, coroutineContext0, v, coroutineStart0, function10, function20);
    }

    public static ReceiveChannel produce$default(CoroutineScope coroutineScope0, CoroutineContext coroutineContext0, int v, BufferOverflow bufferOverflow0, CoroutineStart coroutineStart0, Function1 function10, Function2 function20, int v1, Object object0) {
        if((v1 & 1) != 0) {
            coroutineContext0 = EmptyCoroutineContext.INSTANCE;
        }
        if((v1 & 2) != 0) {
            v = 0;
        }
        if((v1 & 4) != 0) {
            bufferOverflow0 = BufferOverflow.SUSPEND;
        }
        if((v1 & 8) != 0) {
            coroutineStart0 = CoroutineStart.DEFAULT;
        }
        if((v1 & 16) != 0) {
            function10 = null;
        }
        return ProduceKt.produce(coroutineScope0, coroutineContext0, v, bufferOverflow0, coroutineStart0, function10, function20);
    }
}

