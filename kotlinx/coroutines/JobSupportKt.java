package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlinx.coroutines.internal.Symbol;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sf.s;
import sf.t;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A\u0017\u0010\u0001\u001A\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001A\u0017\u0010\u0003\u001A\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0002\"\u0014\u0010\u0005\u001A\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "boxIncomplete", "(Ljava/lang/Object;)Ljava/lang/Object;", "unboxState", "Lkotlinx/coroutines/internal/Symbol;", "COMPLETING_WAITING_CHILDREN", "Lkotlinx/coroutines/internal/Symbol;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class JobSupportKt {
    @JvmField
    @NotNull
    public static final Symbol COMPLETING_WAITING_CHILDREN;
    public static final Symbol a;
    public static final Symbol b;
    public static final Symbol c;
    public static final Symbol d;
    public static final s e;
    public static final s f;

    static {
        JobSupportKt.a = new Symbol("COMPLETING_ALREADY");
        JobSupportKt.COMPLETING_WAITING_CHILDREN = new Symbol("COMPLETING_WAITING_CHILDREN");
        JobSupportKt.b = new Symbol("COMPLETING_RETRY");
        JobSupportKt.c = new Symbol("TOO_LATE_TO_CANCEL");
        JobSupportKt.d = new Symbol("SEALED");
        JobSupportKt.e = new s(false);
        JobSupportKt.f = new s(true);
    }

    public static final Symbol access$getCOMPLETING_ALREADY$p() {
        return JobSupportKt.a;
    }

    public static final Symbol access$getCOMPLETING_RETRY$p() {
        return JobSupportKt.b;
    }

    public static final s access$getEMPTY_ACTIVE$p() {
        return JobSupportKt.f;
    }

    public static final s access$getEMPTY_NEW$p() {
        return JobSupportKt.e;
    }

    public static final Symbol access$getTOO_LATE_TO_CANCEL$p() {
        return JobSupportKt.c;
    }

    @Nullable
    public static final Object boxIncomplete(@Nullable Object object0) {
        return object0 instanceof Incomplete ? new t(((Incomplete)object0)) : object0;
    }

    @Nullable
    public static final Object unboxState(@Nullable Object object0) {
        t t0 = object0 instanceof t ? ((t)object0) : null;
        if(t0 != null) {
            Incomplete incomplete0 = t0.a;
            if(incomplete0 != null) {
                return incomplete0;
            }
        }
        return object0;
    }
}

