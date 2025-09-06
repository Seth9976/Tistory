package kotlinx.coroutines.channels;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0005\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002J\u0011\u0010\u0003\u001A\u00020\u0004H¦Bø\u0001\u0000¢\u0006\u0002\u0010\u0005J\u000E\u0010\u0006\u001A\u00028\u0000H¦\u0002¢\u0006\u0002\u0010\u0007J\u0013\u0010\b\u001A\u00028\u0000H\u0097@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"Lkotlinx/coroutines/channels/ChannelIterator;", "E", "", "hasNext", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "next", "()Ljava/lang/Object;", "next0", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface ChannelIterator {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public static final class DefaultImpls {
        @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.3.0, binary compatibility with versions <= 1.2.x")
        @JvmName(name = "next")
        public static Object next(ChannelIterator channelIterator0, Continuation continuation0) {
            c c0;
            if(continuation0 instanceof c) {
                c0 = (c)continuation0;
                int v = c0.q;
                if((v & 0x80000000) == 0) {
                    c0 = new c(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
                }
                else {
                    c0.q = v ^ 0x80000000;
                }
            }
            else {
                c0 = new c(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
            }
            Object object0 = c0.p;
            Object object1 = a.getCOROUTINE_SUSPENDED();
            switch(c0.q) {
                case 0: {
                    ResultKt.throwOnFailure(object0);
                    c0.o = channelIterator0;
                    c0.q = 1;
                    object0 = channelIterator0.hasNext(c0);
                    if(object0 == object1) {
                        return object1;
                    }
                    break;
                }
                case 1: {
                    channelIterator0 = c0.o;
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                default: {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
            }
            if(!((Boolean)object0).booleanValue()) {
                throw new ClosedReceiveChannelException("Channel was closed");
            }
            return channelIterator0.next();
        }
    }

    @Nullable
    Object hasNext(@NotNull Continuation arg1);

    Object next();

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.3.0, binary compatibility with versions <= 1.2.x")
    @JvmName(name = "next")
    Object next(Continuation arg1);
}

