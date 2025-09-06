package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.ObsoleteCoroutinesApi;
import kotlinx.coroutines.selects.SelectClause2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Deprecated(level = DeprecationLevel.WARNING, message = "ConflatedBroadcastChannel is deprecated in the favour of SharedFlow and is no longer supported")
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\t\b\u0016\u00A2\u0006\u0004\b\u0003\u0010\u0004B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001A\u00028\u0000\u00A2\u0006\u0004\b\u0003\u0010\u0006J\u001C\u0010\n\u001A\u00020\t2\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\u0007H\u0097\u0001\u00A2\u0006\u0004\b\n\u0010\u000BJ\"\u0010\n\u001A\u00020\u000E2\u0010\b\u0002\u0010\b\u001A\n\u0018\u00010\fj\u0004\u0018\u0001`\rH\u0096\u0001\u00A2\u0006\u0004\b\n\u0010\u000FJ\u001A\u0010\u0010\u001A\u00020\t2\b\u0010\b\u001A\u0004\u0018\u00010\u0007H\u0096\u0001\u00A2\u0006\u0004\b\u0010\u0010\u000BJ5\u0010\u0015\u001A\u00020\u000E2#\u0010\u0014\u001A\u001F\u0012\u0015\u0012\u0013\u0018\u00010\u0007\u00A2\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u000E0\u0011H\u0096\u0001\u00A2\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0018\u001A\u00020\t2\u0006\u0010\u0017\u001A\u00028\u0000H\u0097\u0001\u00A2\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001B\u001A\b\u0012\u0004\u0012\u00028\u00000\u001AH\u0096\u0001\u00A2\u0006\u0004\b\u001B\u0010\u001CJ\u001B\u0010\u001D\u001A\u00020\u000E2\u0006\u0010\u0017\u001A\u00028\u0000H\u0096A\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001D\u0010\u001EJ\'\u0010\"\u001A\b\u0012\u0004\u0012\u00020\u000E0\u001F2\u0006\u0010\u0017\u001A\u00028\u0000H\u0096\u0001\u00F8\u0001\u0001\u00F8\u0001\u0002\u00F8\u0001\u0000\u00A2\u0006\u0004\b \u0010!R\u0014\u0010#\u001A\u00020\t8\u0016X\u0097\u0005\u00A2\u0006\u0006\u001A\u0004\b#\u0010$R&\u0010)\u001A\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000&0%8\u0016X\u0096\u0005\u00A2\u0006\u0006\u001A\u0004\b\'\u0010(R\u0011\u0010\u0005\u001A\u00028\u00008F\u00A2\u0006\u0006\u001A\u0004\b*\u0010+R\u0013\u0010-\u001A\u0004\u0018\u00018\u00008F\u00A2\u0006\u0006\u001A\u0004\b,\u0010+\u0082\u0002\u000F\n\u0002\b\u0019\n\u0002\b!\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006."}, d2 = {"Lkotlinx/coroutines/channels/ConflatedBroadcastChannel;", "E", "Lkotlinx/coroutines/channels/BroadcastChannel;", "<init>", "()V", "value", "(Ljava/lang/Object;)V", "", "cause", "", "cancel", "(Ljava/lang/Throwable;)Z", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "", "(Ljava/util/concurrent/CancellationException;)V", "close", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "handler", "invokeOnClose", "(Lkotlin/jvm/functions/Function1;)V", "element", "offer", "(Ljava/lang/Object;)Z", "Lkotlinx/coroutines/channels/ReceiveChannel;", "openSubscription", "()Lkotlinx/coroutines/channels/ReceiveChannel;", "send", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/ChannelResult;", "trySend-JP2dKIU", "(Ljava/lang/Object;)Ljava/lang/Object;", "trySend", "isClosedForSend", "()Z", "Lkotlinx/coroutines/selects/SelectClause2;", "Lkotlinx/coroutines/channels/SendChannel;", "getOnSend", "()Lkotlinx/coroutines/selects/SelectClause2;", "onSend", "getValue", "()Ljava/lang/Object;", "getValueOrNull", "valueOrNull", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@ObsoleteCoroutinesApi
public final class ConflatedBroadcastChannel implements BroadcastChannel {
    public final BroadcastChannelImpl a;

    public ConflatedBroadcastChannel() {
        BroadcastChannelImpl broadcastChannelImpl0 = new BroadcastChannelImpl(-1);
        super();
        this.a = broadcastChannelImpl0;
    }

    public ConflatedBroadcastChannel(Object object0) {
        this.trySend-JP2dKIU(object0);
    }

    @Override  // kotlinx.coroutines.channels.BroadcastChannel
    public void cancel(@Nullable CancellationException cancellationException0) {
        this.a.cancel(cancellationException0);
    }

    @Override  // kotlinx.coroutines.channels.BroadcastChannel
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility only")
    public boolean cancel(Throwable throwable0) {
        return this.a.cancel(throwable0);
    }

    @Override  // kotlinx.coroutines.channels.SendChannel
    public boolean close(@Nullable Throwable throwable0) {
        return this.a.close(throwable0);
    }

    @Override  // kotlinx.coroutines.channels.SendChannel
    @NotNull
    public SelectClause2 getOnSend() {
        return this.a.getOnSend();
    }

    public final Object getValue() {
        return this.a.getValue();
    }

    @Nullable
    public final Object getValueOrNull() {
        return this.a.getValueOrNull();
    }

    @Override  // kotlinx.coroutines.channels.SendChannel
    public void invokeOnClose(@NotNull Function1 function10) {
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

    @Override  // kotlinx.coroutines.channels.BroadcastChannel
    @NotNull
    public ReceiveChannel openSubscription() {
        return this.a.openSubscription();
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

