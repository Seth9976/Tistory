package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.internal.LowPriorityInOverloadResolution;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.DelicateCoroutinesApi;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.selects.SelectClause1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002J\b\u0010\u0014\u001A\u00020\u0015H\u0017J\u0014\u0010\u0014\u001A\u00020\u00042\n\b\u0002\u0010\u0016\u001A\u0004\u0018\u00010\u0017H\'J\u001A\u0010\u0014\u001A\u00020\u00152\u0010\b\u0002\u0010\u0016\u001A\n\u0018\u00010\u0018j\u0004\u0018\u0001`\u0019H&J\u000F\u0010\u001A\u001A\b\u0012\u0004\u0012\u00028\u00000\u001BH¦\u0002J\u000F\u0010\u001C\u001A\u0004\u0018\u00018\u0000H\u0017¢\u0006\u0002\u0010\u001DJ\u0011\u0010\u001E\u001A\u00028\u0000H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u001FJ\"\u0010 \u001A\b\u0012\u0004\u0012\u00028\u00000\u000FH¦@ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b!\u0010\u001FJ\u0013\u0010\"\u001A\u0004\u0018\u00018\u0000H\u0097@ø\u0001\u0000¢\u0006\u0002\u0010\u001FJ\u001E\u0010#\u001A\b\u0012\u0004\u0012\u00028\u00000\u000FH&ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b$\u0010\u001DR\u001A\u0010\u0003\u001A\u00020\u00048&X§\u0004¢\u0006\f\u0012\u0004\b\u0005\u0010\u0006\u001A\u0004\b\u0003\u0010\u0007R\u001A\u0010\b\u001A\u00020\u00048&X§\u0004¢\u0006\f\u0012\u0004\b\t\u0010\u0006\u001A\u0004\b\b\u0010\u0007R\u0018\u0010\n\u001A\b\u0012\u0004\u0012\u00028\u00000\u000BX¦\u0004¢\u0006\u0006\u001A\u0004\b\f\u0010\rR!\u0010\u000E\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000F0\u000BX¦\u0004ø\u0001\u0000¢\u0006\u0006\u001A\u0004\b\u0010\u0010\rR\"\u0010\u0011\u001A\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000B8VX\u0097\u0004¢\u0006\f\u0012\u0004\b\u0012\u0010\u0006\u001A\u0004\b\u0013\u0010\r\u0082\u0002\u000F\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001E0\u0001¨\u0006%"}, d2 = {"Lkotlinx/coroutines/channels/ReceiveChannel;", "E", "", "isClosedForReceive", "", "isClosedForReceive$annotations", "()V", "()Z", "isEmpty", "isEmpty$annotations", "onReceive", "Lkotlinx/coroutines/selects/SelectClause1;", "getOnReceive", "()Lkotlinx/coroutines/selects/SelectClause1;", "onReceiveCatching", "Lkotlinx/coroutines/channels/ChannelResult;", "getOnReceiveCatching", "onReceiveOrNull", "getOnReceiveOrNull$annotations", "getOnReceiveOrNull", "cancel", "", "cause", "", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "iterator", "Lkotlinx/coroutines/channels/ChannelIterator;", "poll", "()Ljava/lang/Object;", "receive", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "receiveCatching", "receiveCatching-JP2dKIU", "receiveOrNull", "tryReceive", "tryReceive-PtdJZtk", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface ReceiveChannel {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public static final class DefaultImpls {
        @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
        public static void cancel(ReceiveChannel receiveChannel0) {
            receiveChannel0.cancel(null);
        }

        public static void cancel$default(ReceiveChannel receiveChannel0, CancellationException cancellationException0, int v, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if((v & 1) != 0) {
                cancellationException0 = null;
            }
            receiveChannel0.cancel(cancellationException0);
        }

        public static boolean cancel$default(ReceiveChannel receiveChannel0, Throwable throwable0, int v, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if((v & 1) != 0) {
                throwable0 = null;
            }
            return receiveChannel0.cancel(throwable0);
        }

        @NotNull
        public static SelectClause1 getOnReceiveOrNull(@NotNull ReceiveChannel receiveChannel0) {
            Intrinsics.checkNotNull(receiveChannel0, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel<E of kotlinx.coroutines.channels.ReceiveChannel>");
            return ((BufferedChannel)receiveChannel0).getOnReceiveOrNull();
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated in favor of onReceiveCatching extension", replaceWith = @ReplaceWith(expression = "onReceiveCatching", imports = {}))
        public static void getOnReceiveOrNull$annotations() {
        }

        @DelicateCoroutinesApi
        public static void isClosedForReceive$annotations() {
        }

        @ExperimentalCoroutinesApi
        public static void isEmpty$annotations() {
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of \'tryReceive\'. Please note that the provided replacement does not rethrow channel\'s close cause as \'poll\' did, for the precise replacement please refer to the \'poll\' documentation", replaceWith = @ReplaceWith(expression = "tryReceive().getOrNull()", imports = {}))
        @Nullable
        public static Object poll(@NotNull ReceiveChannel receiveChannel0) {
            Object object0 = receiveChannel0.tryReceive-PtdJZtk();
            if(ChannelResult.isSuccess-impl(object0)) {
                return ChannelResult.getOrThrow-impl(object0);
            }
            Throwable throwable0 = ChannelResult.exceptionOrNull-impl(object0);
            if(throwable0 != null) {
                throw throwable0;
            }
            return null;
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated in favor of \'receiveCatching\'. Please note that the provided replacement does not rethrow channel\'s close cause as \'receiveOrNull\' did, for the detailed replacement please refer to the \'receiveOrNull\' documentation", replaceWith = @ReplaceWith(expression = "receiveCatching().getOrNull()", imports = {}))
        @LowPriorityInOverloadResolution
        @Nullable
        public static Object receiveOrNull(@NotNull ReceiveChannel receiveChannel0, @NotNull Continuation continuation0) {
            g g0;
            if(continuation0 instanceof g) {
                g0 = (g)continuation0;
                int v = g0.p;
                if((v & 0x80000000) == 0) {
                    g0 = new g(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
                }
                else {
                    g0.p = v ^ 0x80000000;
                }
            }
            else {
                g0 = new g(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
            }
            Object object0 = g0.o;
            Object object1 = a.getCOROUTINE_SUSPENDED();
            switch(g0.p) {
                case 0: {
                    ResultKt.throwOnFailure(object0);
                    g0.p = 1;
                    Object object2 = receiveChannel0.receiveCatching-JP2dKIU(g0);
                    return object2 == object1 ? object1 : ChannelResult.getOrNull-impl(object2);
                }
                case 1: {
                    ResultKt.throwOnFailure(object0);
                    return ChannelResult.getOrNull-impl(((ChannelResult)object0).unbox-impl());
                }
                default: {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
            }
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    void cancel();

    void cancel(@Nullable CancellationException arg1);

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    boolean cancel(Throwable arg1);

    @NotNull
    SelectClause1 getOnReceive();

    @NotNull
    SelectClause1 getOnReceiveCatching();

    @NotNull
    SelectClause1 getOnReceiveOrNull();

    boolean isClosedForReceive();

    boolean isEmpty();

    @NotNull
    ChannelIterator iterator();

    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of \'tryReceive\'. Please note that the provided replacement does not rethrow channel\'s close cause as \'poll\' did, for the precise replacement please refer to the \'poll\' documentation", replaceWith = @ReplaceWith(expression = "tryReceive().getOrNull()", imports = {}))
    @Nullable
    Object poll();

    @Nullable
    Object receive(@NotNull Continuation arg1);

    @Nullable
    Object receiveCatching-JP2dKIU(@NotNull Continuation arg1);

    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated in favor of \'receiveCatching\'. Please note that the provided replacement does not rethrow channel\'s close cause as \'receiveOrNull\' did, for the detailed replacement please refer to the \'receiveOrNull\' documentation", replaceWith = @ReplaceWith(expression = "receiveCatching().getOrNull()", imports = {}))
    @LowPriorityInOverloadResolution
    @Nullable
    Object receiveOrNull(@NotNull Continuation arg1);

    @NotNull
    Object tryReceive-PtdJZtk();
}

