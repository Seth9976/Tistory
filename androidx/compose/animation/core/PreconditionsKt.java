package androidx.compose.animation.core;

import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0001\n\u0000\u001A*\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0080\b\u0082\u0002\b\n\u0006\b\u0000\u001A\u0002\u0010\u0001\u001A=\u0010\u0007\u001A\u0002H\b\"\b\b\u0000\u0010\b*\u00020\t2\b\u0010\u0002\u001A\u0004\u0018\u0001H\b2\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0080\b\u0082\u0002\n\n\b\b\u0000\u001A\u0004\b\u0003\u0010\u0001¢\u0006\u0002\u0010\n\u001A*\u0010\u000B\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0080\b\u0082\u0002\b\n\u0006\b\u0000\u001A\u0002\u0010\u0001\u001A\u0010\u0010\f\u001A\u00020\u00012\u0006\u0010\r\u001A\u00020\u0006H\u0000\u001A\u0010\u0010\u000E\u001A\u00020\u00012\u0006\u0010\r\u001A\u00020\u0006H\u0000\u001A\u0010\u0010\u000F\u001A\u00020\u00102\u0006\u0010\r\u001A\u00020\u0006H\u0000¨\u0006\u0011"}, d2 = {"checkPrecondition", "", "value", "", "lazyMessage", "Lkotlin/Function0;", "", "checkPreconditionNotNull", "T", "", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "requirePrecondition", "throwIllegalArgumentException", "message", "throwIllegalStateException", "throwIllegalStateExceptionForNullCheck", "", "animation-core_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class PreconditionsKt {
    public static final void checkPrecondition(boolean z, @NotNull Function0 function00) {
        if(!z) {
            PreconditionsKt.throwIllegalStateException(((String)function00.invoke()));
        }
    }

    @NotNull
    public static final Object checkPreconditionNotNull(@Nullable Object object0, @NotNull Function0 function00) {
        if(object0 != null) {
            return object0;
        }
        PreconditionsKt.throwIllegalStateExceptionForNullCheck(((String)function00.invoke()));
        throw new KotlinNothingValueException();
    }

    public static final void requirePrecondition(boolean z, @NotNull Function0 function00) {
        if(!z) {
            PreconditionsKt.throwIllegalArgumentException(((String)function00.invoke()));
        }
    }

    public static final void throwIllegalArgumentException(@NotNull String s) {
        throw new IllegalArgumentException(s);
    }

    public static final void throwIllegalStateException(@NotNull String s) {
        throw new IllegalStateException(s);
    }

    @NotNull
    public static final Void throwIllegalStateExceptionForNullCheck(@NotNull String s) {
        throw new IllegalStateException(s);
    }
}

