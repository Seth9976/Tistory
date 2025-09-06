package androidx.constraintlayout.compose;

import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Stable
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001A\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001A\u0010\u0002\u001A\u00020\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001A\u0004\b\u0007\u0010\bR \u0010\u0010\u001A\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u000B\u0012\u0004\b\u000E\u0010\u000F\u001A\u0004\b\f\u0010\rR \u0010\u0014\u001A\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u000B\u0012\u0004\b\u0013\u0010\u000F\u001A\u0004\b\u0012\u0010\r¨\u0006\u0015"}, d2 = {"Landroidx/constraintlayout/compose/VerticalChainReference;", "", "id", "<init>", "(Ljava/lang/Object;)V", "a", "Ljava/lang/Object;", "getId$compose_release", "()Ljava/lang/Object;", "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;", "b", "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;", "getTop", "()Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;", "getTop$annotations", "()V", "top", "c", "getBottom", "getBottom$annotations", "bottom", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class VerticalChainReference {
    public final Object a;
    public final HorizontalAnchor b;
    public final HorizontalAnchor c;

    public VerticalChainReference(@NotNull Object object0) {
        Intrinsics.checkNotNullParameter(object0, "id");
        super();
        this.a = object0;
        this.b = new HorizontalAnchor(object0, 0);
        this.c = new HorizontalAnchor(object0, 1);
    }

    @NotNull
    public final HorizontalAnchor getBottom() {
        return this.c;
    }

    @Stable
    public static void getBottom$annotations() {
    }

    @NotNull
    public final Object getId$compose_release() {
        return this.a;
    }

    @NotNull
    public final HorizontalAnchor getTop() {
        return this.b;
    }

    @Stable
    public static void getTop$annotations() {
    }
}

