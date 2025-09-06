package kotlinx.coroutines.channels;

import kotlin.BuilderInference;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.ObsoleteCoroutinesApi;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import uf.f;
import uf.g;
import uf.k1;

@Metadata(d1 = {"\u0000V\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001A\u009E\u0001\u0010\u0000\u001A\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00072\b\b\u0002\u0010\b\u001A\u00020\t2-\b\u0002\u0010\n\u001A\'\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\r\u0012\b\b\u000E\u0012\u0004\b\b(\u000F\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000Bj\u0004\u0018\u0001`\u00112/\b\u0001\u0010\u0012\u001A)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0013¢\u0006\u0002\b\u0017H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0018\u001A2\u0010\u0000\u001A\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00192\b\b\u0002\u0010\u0006\u001A\u00020\u00072\b\b\u0002\u0010\b\u001A\u00020\tH\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001A"}, d2 = {"broadcast", "Lkotlinx/coroutines/channels/BroadcastChannel;", "E", "Lkotlinx/coroutines/CoroutineScope;", "context", "Lkotlin/coroutines/CoroutineContext;", "capacity", "", "start", "Lkotlinx/coroutines/CoroutineStart;", "onCompletion", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "cause", "", "Lkotlinx/coroutines/CompletionHandler;", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/channels/ProducerScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/channels/BroadcastChannel;", "Lkotlinx/coroutines/channels/ReceiveChannel;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nBroadcast.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Broadcast.kt\nkotlinx/coroutines/channels/BroadcastKt\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,202:1\n48#2,4:203\n*S KotlinDebug\n*F\n+ 1 Broadcast.kt\nkotlinx/coroutines/channels/BroadcastKt\n*L\n51#1:203,4\n*E\n"})
public final class BroadcastKt {
    @Deprecated(level = DeprecationLevel.WARNING, message = "BroadcastChannel is deprecated in the favour of SharedFlow and is no longer supported")
    @ObsoleteCoroutinesApi
    @NotNull
    public static final BroadcastChannel broadcast(@NotNull CoroutineScope coroutineScope0, @NotNull CoroutineContext coroutineContext0, int v, @NotNull CoroutineStart coroutineStart0, @Nullable Function1 function10, @BuilderInference @NotNull Function2 function20) {
        CoroutineContext coroutineContext1 = CoroutineContextKt.newCoroutineContext(coroutineScope0, coroutineContext0);
        BroadcastChannel broadcastChannel0 = BroadcastChannelKt.BroadcastChannel(v);
        BroadcastChannel broadcastChannel1 = coroutineStart0.isLazy() ? new k1(coroutineContext1, broadcastChannel0, function20) : new a(coroutineContext1, broadcastChannel0, true);
        if(function10 != null) {
            ((JobSupport)broadcastChannel1).invokeOnCompletion(function10);
        }
        ((AbstractCoroutine)broadcastChannel1).start(coroutineStart0, broadcastChannel1, function20);
        return broadcastChannel1;
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "BroadcastChannel is deprecated in the favour of SharedFlow and is no longer supported")
    @ObsoleteCoroutinesApi
    @NotNull
    public static final BroadcastChannel broadcast(@NotNull ReceiveChannel receiveChannel0, int v, @NotNull CoroutineStart coroutineStart0) {
        CoroutineDispatcher coroutineDispatcher0 = Dispatchers.getUnconfined();
        return BroadcastKt.broadcast$default(CoroutineScopeKt.plus(CoroutineScopeKt.plus(() -> EmptyCoroutineContext.INSTANCE, coroutineDispatcher0), new CoroutineExceptionHandler(CoroutineExceptionHandler.Key) {
            @Override  // kotlinx.coroutines.CoroutineExceptionHandler
            public void handleException(@NotNull CoroutineContext coroutineContext0, @NotNull Throwable throwable0) {
            }
        }), null, v, coroutineStart0, new f(receiveChannel0, 0), new g(receiveChannel0, null), 1, null);
    }

    public static BroadcastChannel broadcast$default(CoroutineScope coroutineScope0, CoroutineContext coroutineContext0, int v, CoroutineStart coroutineStart0, Function1 function10, Function2 function20, int v1, Object object0) {
        if((v1 & 1) != 0) {
            coroutineContext0 = EmptyCoroutineContext.INSTANCE;
        }
        if((v1 & 2) != 0) {
            v = 1;
        }
        if((v1 & 4) != 0) {
            coroutineStart0 = CoroutineStart.LAZY;
        }
        if((v1 & 8) != 0) {
            function10 = null;
        }
        return BroadcastKt.broadcast(coroutineScope0, coroutineContext0, v, coroutineStart0, function10, function20);
    }

    public static BroadcastChannel broadcast$default(ReceiveChannel receiveChannel0, int v, CoroutineStart coroutineStart0, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = 1;
        }
        if((v1 & 2) != 0) {
            coroutineStart0 = CoroutineStart.LAZY;
        }
        return BroadcastKt.broadcast(receiveChannel0, v, coroutineStart0);
    }
}

