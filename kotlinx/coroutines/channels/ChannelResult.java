package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.InternalCoroutinesApi;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0012\b\u0087@\u0018\u0000 &*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0003\'&(B\u0016\b\u0001\u0012\b\u0010\u0003\u001A\u0004\u0018\u00010\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u000F\u0010\u0007\u001A\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0006\u0010\u0005J\r\u0010\t\u001A\u00028\u0000¢\u0006\u0004\b\b\u0010\u0005J\u000F\u0010\r\u001A\u0004\u0018\u00010\n¢\u0006\u0004\b\u000B\u0010\fJ\u000F\u0010\u0011\u001A\u00020\u000EH\u0016¢\u0006\u0004\b\u000F\u0010\u0010J\u0010\u0010\u0015\u001A\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001A\u0010\u001A\u001A\u00020\u00172\b\u0010\u0016\u001A\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001C\u0010\u0003\u001A\u0004\u0018\u00010\u00028\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u001B\u0010\u001C\u0012\u0004\b\u001D\u0010\u001ER\u0011\u0010!\u001A\u00020\u00178F¢\u0006\u0006\u001A\u0004\b\u001F\u0010 R\u0011\u0010#\u001A\u00020\u00178F¢\u0006\u0006\u001A\u0004\b\"\u0010 R\u0011\u0010%\u001A\u00020\u00178F¢\u0006\u0006\u001A\u0004\b$\u0010 \u0088\u0001\u0003\u0092\u0001\u0004\u0018\u00010\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006)"}, d2 = {"Lkotlinx/coroutines/channels/ChannelResult;", "T", "", "holder", "constructor-impl", "(Ljava/lang/Object;)Ljava/lang/Object;", "getOrNull-impl", "getOrNull", "getOrThrow-impl", "getOrThrow", "", "exceptionOrNull-impl", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "exceptionOrNull", "", "toString-impl", "(Ljava/lang/Object;)Ljava/lang/String;", "toString", "", "hashCode-impl", "(Ljava/lang/Object;)I", "hashCode", "other", "", "equals-impl", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "equals", "a", "Ljava/lang/Object;", "getHolder$annotations", "()V", "isSuccess-impl", "(Ljava/lang/Object;)Z", "isSuccess", "isFailure-impl", "isFailure", "isClosed-impl", "isClosed", "Companion", "Closed", "Failed", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@JvmInline
public final class ChannelResult {
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000F\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0005\u001A\u00020\u00062\b\u0010\u0007\u001A\u0004\u0018\u00010\bH\u0096\u0002J\b\u0010\t\u001A\u00020\nH\u0016J\b\u0010\u000B\u001A\u00020\fH\u0016R\u0012\u0010\u0002\u001A\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/channels/ChannelResult$Closed;", "Lkotlinx/coroutines/channels/ChannelResult$Failed;", "cause", "", "(Ljava/lang/Throwable;)V", "equals", "", "other", "", "hashCode", "", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Closed extends Failed {
        @JvmField
        @Nullable
        public final Throwable cause;

        public Closed(@Nullable Throwable throwable0) {
            this.cause = throwable0;
        }

        // 去混淆评级： 低(20)
        @Override
        public boolean equals(@Nullable Object object0) {
            return object0 instanceof Closed && Intrinsics.areEqual(this.cause, ((Closed)object0).cause);
        }

        @Override
        public int hashCode() {
            return this.cause == null ? 0 : this.cause.hashCode();
        }

        @Override  // kotlinx.coroutines.channels.ChannelResult$Failed
        @NotNull
        public String toString() {
            return "Closed(" + this.cause + ')';
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001J,\u0010\u0007\u001A\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0001\u0010\u00022\u0006\u0010\u0003\u001A\u00028\u0001H\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\n\u001A\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0001\u0010\u0002H\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\b\u0010\tJ.\u0010\u000F\u001A\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0001\u0010\u00022\b\u0010\f\u001A\u0004\u0018\u00010\u000BH\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\r\u0010\u000ER\u0014\u0010\u0011\u001A\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\u0082\u0002\u000F\n\u0002\b!\n\u0005\b¡\u001E0\u0001\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lkotlinx/coroutines/channels/ChannelResult$Companion;", "", "E", "value", "Lkotlinx/coroutines/channels/ChannelResult;", "success-JP2dKIU", "(Ljava/lang/Object;)Ljava/lang/Object;", "success", "failure-PtdJZtk", "()Ljava/lang/Object;", "failure", "", "cause", "closed-JP2dKIU", "(Ljava/lang/Throwable;)Ljava/lang/Object;", "closed", "Lkotlinx/coroutines/channels/ChannelResult$Failed;", "failed", "Lkotlinx/coroutines/channels/ChannelResult$Failed;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @InternalCoroutinesApi
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @InternalCoroutinesApi
        @NotNull
        public final Object closed-JP2dKIU(@Nullable Throwable throwable0) {
            return ChannelResult.constructor-impl(new Closed(throwable0));
        }

        @InternalCoroutinesApi
        @NotNull
        public final Object failure-PtdJZtk() {
            return ChannelResult.b;
        }

        @InternalCoroutinesApi
        @NotNull
        public final Object success-JP2dKIU(Object object0) {
            return object0;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0000\b\u0010\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001A\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lkotlinx/coroutines/channels/ChannelResult$Failed;", "", "()V", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static class Failed {
        @Override
        @NotNull
        public String toString() {
            return "Failed";
        }
    }

    @NotNull
    public static final Companion Companion;
    public final Object a;
    public static final Failed b;

    static {
        ChannelResult.Companion = new Companion(null);
        ChannelResult.b = new Failed();
    }

    public ChannelResult(Object object0) {
        this.a = object0;
    }

    public static final ChannelResult box-impl(Object object0) {
        return new ChannelResult(object0);
    }

    @PublishedApi
    @NotNull
    public static Object constructor-impl(@Nullable Object object0) [...] // Inlined contents

    @Override
    public boolean equals(Object object0) {
        return ChannelResult.equals-impl(this.a, object0);
    }

    // 去混淆评级： 低(20)
    public static boolean equals-impl(Object object0, Object object1) {
        return object1 instanceof ChannelResult ? Intrinsics.areEqual(object0, ((ChannelResult)object1).unbox-impl()) : false;
    }

    public static final boolean equals-impl0(Object object0, Object object1) {
        return Intrinsics.areEqual(object0, object1);
    }

    @Nullable
    public static final Throwable exceptionOrNull-impl(Object object0) {
        Closed channelResult$Closed0 = object0 instanceof Closed ? ((Closed)object0) : null;
        return channelResult$Closed0 == null ? null : channelResult$Closed0.cause;
    }

    @PublishedApi
    public static void getHolder$annotations() {
    }

    // 去混淆评级： 低(20)
    @Nullable
    public static final Object getOrNull-impl(Object object0) {
        return object0 instanceof Failed ? null : object0;
    }

    public static final Object getOrThrow-impl(Object object0) {
        if(!(object0 instanceof Failed)) {
            return object0;
        }
        if(object0 instanceof Closed) {
            Throwable throwable0 = ((Closed)object0).cause;
            if(throwable0 != null) {
                throw throwable0;
            }
        }
        throw new IllegalStateException(("Trying to call \'getOrThrow\' on a failed channel result: " + object0).toString());
    }

    @Override
    public int hashCode() {
        return ChannelResult.hashCode-impl(this.a);
    }

    public static int hashCode-impl(Object object0) {
        return object0 == null ? 0 : object0.hashCode();
    }

    public static final boolean isClosed-impl(Object object0) {
        return object0 instanceof Closed;
    }

    public static final boolean isFailure-impl(Object object0) {
        return object0 instanceof Failed;
    }

    public static final boolean isSuccess-impl(Object object0) {
        return !(object0 instanceof Failed);
    }

    @Override
    @NotNull
    public String toString() {
        return ChannelResult.toString-impl(this.a);
    }

    // 去混淆评级： 低(20)
    @NotNull
    public static String toString-impl(Object object0) {
        return object0 instanceof Closed ? ((Closed)object0).toString() : "Value(" + object0 + ')';
    }

    public final Object unbox-impl() {
        return this.a;
    }
}

