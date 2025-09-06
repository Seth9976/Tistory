package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.ObsoleteCoroutinesApi;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import uf.a;
import uf.j1;

@Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A\u009C\u0001\u0010\u0000\u001A\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00072\b\b\u0002\u0010\b\u001A\u00020\t2-\b\u0002\u0010\n\u001A\'\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\r\u0012\b\b\u000E\u0012\u0004\b\b(\u000F\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000Bj\u0004\u0018\u0001`\u00112-\u0010\u0012\u001A)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0013¢\u0006\u0002\b\u0017H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"actor", "Lkotlinx/coroutines/channels/SendChannel;", "E", "Lkotlinx/coroutines/CoroutineScope;", "context", "Lkotlin/coroutines/CoroutineContext;", "capacity", "", "start", "Lkotlinx/coroutines/CoroutineStart;", "onCompletion", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "cause", "", "Lkotlinx/coroutines/CompletionHandler;", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/channels/ActorScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/channels/SendChannel;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class ActorKt {
    @ObsoleteCoroutinesApi
    @NotNull
    public static final SendChannel actor(@NotNull CoroutineScope coroutineScope0, @NotNull CoroutineContext coroutineContext0, int v, @NotNull CoroutineStart coroutineStart0, @Nullable Function1 function10, @NotNull Function2 function20) {
        SendChannel sendChannel0;
        CoroutineContext coroutineContext1 = CoroutineContextKt.newCoroutineContext(coroutineScope0, coroutineContext0);
        Channel channel0 = ChannelKt.Channel$default(v, null, null, 6, null);
        if(coroutineStart0.isLazy()) {
            sendChannel0 = new j1(coroutineContext1, channel0, false);  // 初始化器: Luf/a;-><init>(Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/channels/Channel;Z)V
            sendChannel0.e = IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted(function20, sendChannel0, ((Continuation)sendChannel0));
        }
        else {
            sendChannel0 = new a(coroutineContext1, channel0, true);
        }
        if(function10 != null) {
            ((JobSupport)sendChannel0).invokeOnCompletion(function10);
        }
        ((AbstractCoroutine)sendChannel0).start(coroutineStart0, sendChannel0, function20);
        return sendChannel0;
    }

    public static SendChannel actor$default(CoroutineScope coroutineScope0, CoroutineContext coroutineContext0, int v, CoroutineStart coroutineStart0, Function1 function10, Function2 function20, int v1, Object object0) {
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
        return ActorKt.actor(coroutineScope0, coroutineContext0, v, coroutineStart0, function10, function20);
    }
}

