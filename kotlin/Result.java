package kotlin;

import java.io.Serializable;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u000F\b\u0087@\u0018\u0000 \"*\u0006\b\u0000\u0010\u0001 \u00012\u00060\u0002j\u0002`\u0003:\u0002\"#B\u0013\b\u0001\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000F\u0010\u000B\u001A\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000F\u0010\u000F\u001A\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000EJ\u0010\u0010\u0013\u001A\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001A\u0010\u0018\u001A\u00020\u00152\b\u0010\u0014\u001A\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001C\u0010\u0005\u001A\u0004\u0018\u00010\u00048\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001A\u0012\u0004\b\u001B\u0010\u001CR\u0011\u0010\u001F\u001A\u00020\u00158F¢\u0006\u0006\u001A\u0004\b\u001D\u0010\u001ER\u0011\u0010!\u001A\u00020\u00158F¢\u0006\u0006\u001A\u0004\b \u0010\u001E\u0088\u0001\u0005\u0092\u0001\u0004\u0018\u00010\u0004¨\u0006$"}, d2 = {"Lkotlin/Result;", "T", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "value", "constructor-impl", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "exceptionOrNull-impl", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "exceptionOrNull", "", "toString-impl", "(Ljava/lang/Object;)Ljava/lang/String;", "toString", "", "hashCode-impl", "(Ljava/lang/Object;)I", "hashCode", "other", "", "equals-impl", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "equals", "a", "Ljava/lang/Object;", "getValue$annotations", "()V", "isSuccess-impl", "(Ljava/lang/Object;)Z", "isSuccess", "isFailure-impl", "isFailure", "Companion", "Failure", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SinceKotlin(version = "1.3")
@JvmInline
public final class Result implements Serializable {
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/Result$Companion;", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001A\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0013\u0010\u0006\u001A\u00020\u00072\b\u0010\b\u001A\u0004\u0018\u00010\tH\u0096\u0002J\b\u0010\n\u001A\u00020\u000BH\u0016J\b\u0010\f\u001A\u00020\rH\u0016R\u0010\u0010\u0003\u001A\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u000E"}, d2 = {"Lkotlin/Result$Failure;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "exception", "", "(Ljava/lang/Throwable;)V", "equals", "", "other", "", "hashCode", "", "toString", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Failure implements Serializable {
        @JvmField
        @NotNull
        public final Throwable exception;

        public Failure(@NotNull Throwable throwable0) {
            Intrinsics.checkNotNullParameter(throwable0, "exception");
            super();
            this.exception = throwable0;
        }

        // 去混淆评级： 低(20)
        @Override
        public boolean equals(@Nullable Object object0) {
            return object0 instanceof Failure && Intrinsics.areEqual(this.exception, ((Failure)object0).exception);
        }

        @Override
        public int hashCode() {
            return this.exception.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "Failure(" + this.exception + ')';
        }
    }

    @NotNull
    public static final Companion Companion;
    public final Object a;

    static {
        Result.Companion = new Companion(null);
    }

    public Result(Object object0) {
        this.a = object0;
    }

    public static final Result box-impl(Object object0) {
        return new Result(object0);
    }

    @PublishedApi
    @NotNull
    public static Object constructor-impl(@Nullable Object object0) [...] // Inlined contents

    @Override
    public boolean equals(Object object0) {
        return Result.equals-impl(this.a, object0);
    }

    // 去混淆评级： 低(20)
    public static boolean equals-impl(Object object0, Object object1) {
        return object1 instanceof Result ? Intrinsics.areEqual(object0, ((Result)object1).unbox-impl()) : false;
    }

    public static final boolean equals-impl0(Object object0, Object object1) {
        return Intrinsics.areEqual(object0, object1);
    }

    // 去混淆评级： 低(20)
    @Nullable
    public static final Throwable exceptionOrNull-impl(Object object0) {
        return object0 instanceof Failure ? ((Failure)object0).exception : null;
    }

    @PublishedApi
    public static void getValue$annotations() {
    }

    @Override
    public int hashCode() {
        return Result.hashCode-impl(this.a);
    }

    public static int hashCode-impl(Object object0) {
        return object0 == null ? 0 : object0.hashCode();
    }

    public static final boolean isFailure-impl(Object object0) {
        return object0 instanceof Failure;
    }

    public static final boolean isSuccess-impl(Object object0) {
        return !(object0 instanceof Failure);
    }

    @Override
    @NotNull
    public String toString() {
        return Result.toString-impl(this.a);
    }

    // 去混淆评级： 低(20)
    @NotNull
    public static String toString-impl(Object object0) {
        return object0 instanceof Failure ? ((Failure)object0).toString() : "Success(" + object0 + ')';
    }

    public final Object unbox-impl() {
        return this.a;
    }
}

