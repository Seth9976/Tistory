package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.internal.LowPriorityInOverloadResolution;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.selects.SelectClause1;
import kotlinx.coroutines.selects.SelectClause2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u0004B-\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\t\u001A\u00020\b\u0012\u0006\u0010\n\u001A\u00020\b\u00A2\u0006\u0004\b\u000B\u0010\fJ\u001A\u0010\u000F\u001A\u00020\b2\b\u0010\u000E\u001A\u0004\u0018\u00010\rH\u0096\u0001\u00A2\u0006\u0004\b\u000F\u0010\u0010J5\u0010\u0015\u001A\u00020\u00032#\u0010\u0014\u001A\u001F\u0012\u0015\u0012\u0013\u0018\u00010\r\u00A2\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u000E\u0012\u0004\u0012\u00020\u00030\u0011H\u0096\u0001\u00A2\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0018\u001A\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0096\u0003\u00A2\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001B\u001A\u00020\b2\u0006\u0010\u001A\u001A\u00028\u0000H\u0097\u0001\u00A2\u0006\u0004\b\u001B\u0010\u001CJ\u0012\u0010\u001D\u001A\u0004\u0018\u00018\u0000H\u0097\u0001\u00A2\u0006\u0004\b\u001D\u0010\u001EJ\u0013\u0010\u001F\u001A\u00028\u0000H\u0096A\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001F\u0010 J\"\u0010#\u001A\b\u0012\u0004\u0012\u00028\u00000!H\u0096A\u00F8\u0001\u0001\u00F8\u0001\u0002\u00F8\u0001\u0000\u00F8\u0001\u0000\u00A2\u0006\u0004\b\"\u0010 J\u0015\u0010$\u001A\u0004\u0018\u00018\u0000H\u0097A\u00F8\u0001\u0000\u00A2\u0006\u0004\b$\u0010 J\u001B\u0010%\u001A\u00020\u00032\u0006\u0010\u001A\u001A\u00028\u0000H\u0096A\u00F8\u0001\u0000\u00A2\u0006\u0004\b%\u0010&J\u001F\u0010(\u001A\b\u0012\u0004\u0012\u00028\u00000!H\u0096\u0001\u00F8\u0001\u0001\u00F8\u0001\u0002\u00F8\u0001\u0000\u00A2\u0006\u0004\b\'\u0010\u001EJ\'\u0010+\u001A\b\u0012\u0004\u0012\u00020\u00030!2\u0006\u0010\u001A\u001A\u00028\u0000H\u0096\u0001\u00F8\u0001\u0001\u00F8\u0001\u0002\u00F8\u0001\u0000\u00A2\u0006\u0004\b)\u0010*J\u000F\u0010,\u001A\u00020\u0003H\u0017\u00A2\u0006\u0004\b,\u0010-J\u0019\u0010,\u001A\u00020\b2\b\u0010\u000E\u001A\u0004\u0018\u00010\rH\u0007\u00A2\u0006\u0004\b,\u0010\u0010J\u001D\u0010,\u001A\u00020\u00032\u000E\u0010\u000E\u001A\n\u0018\u00010.j\u0004\u0018\u0001`/\u00A2\u0006\u0004\b,\u00100J\u0017\u00101\u001A\u00020\u00032\u0006\u0010\u000E\u001A\u00020\rH\u0016\u00A2\u0006\u0004\b1\u00102R \u0010\u0007\u001A\b\u0012\u0004\u0012\u00028\u00000\u00048\u0004X\u0084\u0004\u00A2\u0006\f\n\u0004\b3\u00104\u001A\u0004\b5\u00106R\u0014\u00107\u001A\u00020\b8\u0016X\u0097\u0005\u00A2\u0006\u0006\u001A\u0004\b7\u00108R\u0014\u00109\u001A\u00020\b8\u0016X\u0097\u0005\u00A2\u0006\u0006\u001A\u0004\b9\u00108R\u0014\u0010:\u001A\u00020\b8\u0016X\u0097\u0005\u00A2\u0006\u0006\u001A\u0004\b:\u00108R\u001A\u0010>\u001A\b\u0012\u0004\u0012\u00028\u00000;8\u0016X\u0096\u0005\u00A2\u0006\u0006\u001A\u0004\b<\u0010=R#\u0010@\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000!0;8\u0016X\u0096\u0005\u00F8\u0001\u0000\u00A2\u0006\u0006\u001A\u0004\b?\u0010=R\u001C\u0010B\u001A\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000;8VX\u0097\u0005\u00A2\u0006\u0006\u001A\u0004\bA\u0010=R&\u0010G\u001A\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000D0C8\u0016X\u0096\u0005\u00A2\u0006\u0006\u001A\u0004\bE\u0010FR\u0017\u0010I\u001A\b\u0012\u0004\u0012\u00028\u00000\u00048F\u00A2\u0006\u0006\u001A\u0004\bH\u00106\u0082\u0002\u000F\n\u0002\b\u0019\n\u0002\b!\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006J"}, d2 = {"Lkotlinx/coroutines/channels/ChannelCoroutine;", "E", "Lkotlinx/coroutines/AbstractCoroutine;", "", "Lkotlinx/coroutines/channels/Channel;", "Lkotlin/coroutines/CoroutineContext;", "parentContext", "_channel", "", "initParentJob", "active", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/channels/Channel;ZZ)V", "", "cause", "close", "(Ljava/lang/Throwable;)Z", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "handler", "invokeOnClose", "(Lkotlin/jvm/functions/Function1;)V", "Lkotlinx/coroutines/channels/ChannelIterator;", "iterator", "()Lkotlinx/coroutines/channels/ChannelIterator;", "element", "offer", "(Ljava/lang/Object;)Z", "poll", "()Ljava/lang/Object;", "receive", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/ChannelResult;", "receiveCatching-JP2dKIU", "receiveCatching", "receiveOrNull", "send", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tryReceive-PtdJZtk", "tryReceive", "trySend-JP2dKIU", "(Ljava/lang/Object;)Ljava/lang/Object;", "trySend", "cancel", "()V", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "(Ljava/util/concurrent/CancellationException;)V", "cancelInternal", "(Ljava/lang/Throwable;)V", "d", "Lkotlinx/coroutines/channels/Channel;", "get_channel", "()Lkotlinx/coroutines/channels/Channel;", "isClosedForReceive", "()Z", "isClosedForSend", "isEmpty", "Lkotlinx/coroutines/selects/SelectClause1;", "getOnReceive", "()Lkotlinx/coroutines/selects/SelectClause1;", "onReceive", "getOnReceiveCatching", "onReceiveCatching", "getOnReceiveOrNull", "onReceiveOrNull", "Lkotlinx/coroutines/selects/SelectClause2;", "Lkotlinx/coroutines/channels/SendChannel;", "getOnSend", "()Lkotlinx/coroutines/selects/SelectClause2;", "onSend", "getChannel", "channel", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nChannelCoroutine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChannelCoroutine.kt\nkotlinx/coroutines/channels/ChannelCoroutine\n+ 2 JobSupport.kt\nkotlinx/coroutines/JobSupport\n*L\n1#1,41:1\n706#2,2:42\n706#2,2:44\n706#2,2:46\n*S KotlinDebug\n*F\n+ 1 ChannelCoroutine.kt\nkotlinx/coroutines/channels/ChannelCoroutine\n*L\n21#1:42,2\n26#1:44,2\n32#1:46,2\n*E\n"})
public class ChannelCoroutine extends AbstractCoroutine implements Channel {
    public final Channel d;

    public ChannelCoroutine(@NotNull CoroutineContext coroutineContext0, @NotNull Channel channel0, boolean z, boolean z1) {
        super(coroutineContext0, z, z1);
        this.d = channel0;
    }

    @Override  // kotlinx.coroutines.JobSupport, kotlinx.coroutines.Job, kotlinx.coroutines.channels.ReceiveChannel
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public void cancel() {
        this.cancelInternal(new JobCancellationException(JobSupport.access$cancellationExceptionMessage(this), null, this));
    }

    @Override  // kotlinx.coroutines.JobSupport, kotlinx.coroutines.Job, kotlinx.coroutines.channels.ReceiveChannel
    public final void cancel(@Nullable CancellationException cancellationException0) {
        if(this.isCancelled()) {
            return;
        }
        if(cancellationException0 == null) {
            cancellationException0 = new JobCancellationException(JobSupport.access$cancellationExceptionMessage(this), null, this);
        }
        this.cancelInternal(cancellationException0);
    }

    @Override  // kotlinx.coroutines.JobSupport, kotlinx.coroutines.Job, kotlinx.coroutines.channels.ReceiveChannel
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public final boolean cancel(Throwable throwable0) {
        this.cancelInternal(new JobCancellationException(JobSupport.access$cancellationExceptionMessage(this), null, this));
        return true;
    }

    @Override  // kotlinx.coroutines.JobSupport
    public void cancelInternal(@NotNull Throwable throwable0) {
        CancellationException cancellationException0 = JobSupport.toCancellationException$default(this, throwable0, null, 1, null);
        this.d.cancel(cancellationException0);
        this.cancelCoroutine(cancellationException0);
    }

    @Override  // kotlinx.coroutines.channels.SendChannel
    public boolean close(@Nullable Throwable throwable0) {
        return this.d.close(throwable0);
    }

    @NotNull
    public final Channel getChannel() {
        return this;
    }

    public SendChannel getChannel() {
        return this.getChannel();
    }

    @Override  // kotlinx.coroutines.channels.ReceiveChannel
    @NotNull
    public SelectClause1 getOnReceive() {
        return this.d.getOnReceive();
    }

    @Override  // kotlinx.coroutines.channels.ReceiveChannel
    @NotNull
    public SelectClause1 getOnReceiveCatching() {
        return this.d.getOnReceiveCatching();
    }

    @Override  // kotlinx.coroutines.channels.ReceiveChannel
    @NotNull
    public SelectClause1 getOnReceiveOrNull() {
        return this.d.getOnReceiveOrNull();
    }

    @Override  // kotlinx.coroutines.channels.SendChannel
    @NotNull
    public SelectClause2 getOnSend() {
        return this.d.getOnSend();
    }

    @NotNull
    public final Channel get_channel() {
        return this.d;
    }

    @Override  // kotlinx.coroutines.channels.SendChannel
    public void invokeOnClose(@NotNull Function1 function10) {
        this.d.invokeOnClose(function10);
    }

    @Override  // kotlinx.coroutines.channels.ReceiveChannel
    public boolean isClosedForReceive() {
        return this.d.isClosedForReceive();
    }

    @Override  // kotlinx.coroutines.channels.SendChannel
    public boolean isClosedForSend() {
        return this.d.isClosedForSend();
    }

    @Override  // kotlinx.coroutines.channels.ReceiveChannel
    public boolean isEmpty() {
        return this.d.isEmpty();
    }

    @Override  // kotlinx.coroutines.channels.ReceiveChannel
    @NotNull
    public ChannelIterator iterator() {
        return this.d.iterator();
    }

    @Override  // kotlinx.coroutines.channels.SendChannel
    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of \'trySend\' method", replaceWith = @ReplaceWith(expression = "trySend(element).isSuccess", imports = {}))
    public boolean offer(Object object0) {
        return this.d.offer(object0);
    }

    @Override  // kotlinx.coroutines.channels.ReceiveChannel
    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of \'tryReceive\'. Please note that the provided replacement does not rethrow channel\'s close cause as \'poll\' did, for the precise replacement please refer to the \'poll\' documentation", replaceWith = @ReplaceWith(expression = "tryReceive().getOrNull()", imports = {}))
    @Nullable
    public Object poll() {
        return this.d.poll();
    }

    @Override  // kotlinx.coroutines.channels.ReceiveChannel
    @Nullable
    public Object receive(@NotNull Continuation continuation0) {
        return this.d.receive(continuation0);
    }

    @Override  // kotlinx.coroutines.channels.ReceiveChannel
    @Nullable
    public Object receiveCatching-JP2dKIU(@NotNull Continuation continuation0) {
        return this.d.receiveCatching-JP2dKIU(continuation0);
    }

    @Override  // kotlinx.coroutines.channels.ReceiveChannel
    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated in favor of \'receiveCatching\'. Please note that the provided replacement does not rethrow channel\'s close cause as \'receiveOrNull\' did, for the detailed replacement please refer to the \'receiveOrNull\' documentation", replaceWith = @ReplaceWith(expression = "receiveCatching().getOrNull()", imports = {}))
    @LowPriorityInOverloadResolution
    @Nullable
    public Object receiveOrNull(@NotNull Continuation continuation0) {
        return this.d.receiveOrNull(continuation0);
    }

    @Override  // kotlinx.coroutines.channels.SendChannel
    @Nullable
    public Object send(Object object0, @NotNull Continuation continuation0) {
        return this.d.send(object0, continuation0);
    }

    @Override  // kotlinx.coroutines.channels.ReceiveChannel
    @NotNull
    public Object tryReceive-PtdJZtk() {
        return this.d.tryReceive-PtdJZtk();
    }

    @Override  // kotlinx.coroutines.channels.SendChannel
    @NotNull
    public Object trySend-JP2dKIU(Object object0) {
        return this.d.trySend-JP2dKIU(object0);
    }
}

