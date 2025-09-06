package androidx.datastore.core;

import aa.r;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.ChannelResult.Closed;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import org.jetbrains.annotations.NotNull;
import w3.k0;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002Be\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0014\u0010\b\u001A\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u001A\u0010\n\u001A\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\t\u0012\"\u0010\f\u001A\u001E\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000B\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t¢\u0006\u0004\b\r\u0010\u000EJ\u0015\u0010\u0010\u001A\u00020\u00072\u0006\u0010\u000F\u001A\u00028\u0000¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/datastore/core/SimpleActor;", "T", "", "Lkotlinx/coroutines/CoroutineScope;", "scope", "Lkotlin/Function1;", "", "", "onComplete", "Lkotlin/Function2;", "onUndeliveredElement", "Lkotlin/coroutines/Continuation;", "consumeMessage", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V", "msg", "offer", "(Ljava/lang/Object;)V", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSimpleActor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SimpleActor.kt\nandroidx/datastore/core/SimpleActor\n+ 2 Channel.kt\nkotlinx/coroutines/channels/ChannelKt\n*L\n1#1,127:1\n548#2,5:128\n*S KotlinDebug\n*F\n+ 1 SimpleActor.kt\nandroidx/datastore/core/SimpleActor\n*L\n104#1:128,5\n*E\n"})
public final class SimpleActor {
    public final CoroutineScope a;
    public final Function2 b;
    public final Channel c;
    public final AtomicInt d;

    public SimpleActor(@NotNull CoroutineScope coroutineScope0, @NotNull Function1 function10, @NotNull Function2 function20, @NotNull Function2 function21) {
        Intrinsics.checkNotNullParameter(coroutineScope0, "scope");
        Intrinsics.checkNotNullParameter(function10, "onComplete");
        Intrinsics.checkNotNullParameter(function20, "onUndeliveredElement");
        Intrinsics.checkNotNullParameter(function21, "consumeMessage");
        super();
        this.a = coroutineScope0;
        this.b = function21;
        this.c = ChannelKt.Channel$default(0x7FFFFFFF, null, null, 6, null);
        this.d = new AtomicInt(0);
        Job job0 = (Job)coroutineScope0.getCoroutineContext().get(Job.Key);
        if(job0 != null) {
            job0.invokeOnCompletion(new r(function10, this, 28, function20));
        }
    }

    public final void offer(Object object0) {
        Object object1 = this.c.trySend-JP2dKIU(object0);
        if(object1 instanceof Closed) {
            Throwable throwable0 = ChannelResult.exceptionOrNull-impl(object1);
            if(throwable0 == null) {
                throwable0 = new ClosedSendChannelException("Channel was closed normally");
            }
            throw throwable0;
        }
        if(!ChannelResult.isSuccess-impl(object1)) {
            throw new IllegalStateException("Check failed.");
        }
        if(this.d.getAndIncrement() == 0) {
            k0 k00 = new k0(this, null);
            BuildersKt.launch$default(this.a, null, null, k00, 3, null);
        }
    }
}

