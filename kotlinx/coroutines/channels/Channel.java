package kotlinx.coroutines.channels;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.coroutines.Continuation;
import kotlin.internal.LowPriorityInOverloadResolution;
import kotlinx.coroutines.internal.SystemPropsKt;
import kotlinx.coroutines.selects.SelectClause1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u0004*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/coroutines/channels/Channel;", "E", "Lkotlinx/coroutines/channels/SendChannel;", "Lkotlinx/coroutines/channels/ReceiveChannel;", "Factory", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface Channel extends ReceiveChannel, SendChannel {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public static final class DefaultImpls {
        @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
        public static void cancel(Channel channel0) {
            kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.cancel(channel0);
        }

        @NotNull
        public static SelectClause1 getOnReceiveOrNull(@NotNull Channel channel0) {
            return kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.getOnReceiveOrNull(channel0);
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of \'trySend\' method", replaceWith = @ReplaceWith(expression = "trySend(element).isSuccess", imports = {}))
        public static boolean offer(@NotNull Channel channel0, Object object0) {
            return kotlinx.coroutines.channels.SendChannel.DefaultImpls.offer(channel0, object0);
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of \'tryReceive\'. Please note that the provided replacement does not rethrow channel\'s close cause as \'poll\' did, for the precise replacement please refer to the \'poll\' documentation", replaceWith = @ReplaceWith(expression = "tryReceive().getOrNull()", imports = {}))
        @Nullable
        public static Object poll(@NotNull Channel channel0) {
            return kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.poll(channel0);
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated in favor of \'receiveCatching\'. Please note that the provided replacement does not rethrow channel\'s close cause as \'receiveOrNull\' did, for the detailed replacement please refer to the \'receiveOrNull\' documentation", replaceWith = @ReplaceWith(expression = "receiveCatching().getOrNull()", imports = {}))
        @LowPriorityInOverloadResolution
        @Nullable
        public static Object receiveOrNull(@NotNull Channel channel0, @NotNull Continuation continuation0) {
            return kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.receiveOrNull(channel0, continuation0);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000E\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001A\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\n\u001A\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000BR\u001A\u0010\u000F\u001A\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\u0004\u001A\u0004\b\r\u0010\u000E¨\u0006\u0010"}, d2 = {"Lkotlinx/coroutines/channels/Channel$Factory;", "", "", "UNLIMITED", "I", "RENDEZVOUS", "CONFLATED", "BUFFERED", "OPTIONAL_CHANNEL", "", "DEFAULT_BUFFER_PROPERTY_NAME", "Ljava/lang/String;", "b", "getCHANNEL_DEFAULT_CAPACITY$kotlinx_coroutines_core", "()I", "CHANNEL_DEFAULT_CAPACITY", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Factory {
        public static final int BUFFERED = -2;
        public static final int CONFLATED = -1;
        @NotNull
        public static final String DEFAULT_BUFFER_PROPERTY_NAME = "kotlinx.coroutines.channels.defaultBuffer";
        public static final int OPTIONAL_CHANNEL = -3;
        public static final int RENDEZVOUS = 0;
        public static final int UNLIMITED = 0x7FFFFFFF;
        public static final Factory a;
        public static final int b;

        static {
            Factory.a = new Factory();  // 初始化器: Ljava/lang/Object;-><init>()V
            Factory.b = SystemPropsKt.systemProp("kotlinx.coroutines.channels.defaultBuffer", 0x40, 1, 0x7FFFFFFE);
        }

        public final int getCHANNEL_DEFAULT_CAPACITY$kotlinx_coroutines_core() [...] // 潜在的解密器
    }

    public static final int BUFFERED = -2;
    public static final int CONFLATED = -1;
    @NotNull
    public static final String DEFAULT_BUFFER_PROPERTY_NAME = "kotlinx.coroutines.channels.defaultBuffer";
    @NotNull
    public static final Factory Factory = null;
    public static final int OPTIONAL_CHANNEL = -3;
    public static final int RENDEZVOUS = 0;
    public static final int UNLIMITED = 0x7FFFFFFF;

    static {
        Channel.Factory = Factory.a;
    }
}

