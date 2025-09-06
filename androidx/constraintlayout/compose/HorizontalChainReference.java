package androidx.constraintlayout.compose;

import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Stable
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001A\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001A\u0010\u0002\u001A\u00020\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001A\u0004\b\u0007\u0010\bR \u0010\u0010\u001A\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u000B\u0012\u0004\b\u000E\u0010\u000F\u001A\u0004\b\f\u0010\rR \u0010\u0014\u001A\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u000B\u0012\u0004\b\u0013\u0010\u000F\u001A\u0004\b\u0012\u0010\rR \u0010\u0018\u001A\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\u000B\u0012\u0004\b\u0017\u0010\u000F\u001A\u0004\b\u0016\u0010\rR \u0010\u001C\u001A\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010\u000B\u0012\u0004\b\u001B\u0010\u000F\u001A\u0004\b\u001A\u0010\r¨\u0006\u001D"}, d2 = {"Landroidx/constraintlayout/compose/HorizontalChainReference;", "", "id", "<init>", "(Ljava/lang/Object;)V", "a", "Ljava/lang/Object;", "getId$compose_release", "()Ljava/lang/Object;", "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;", "b", "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;", "getStart", "()Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;", "getStart$annotations", "()V", "start", "c", "getAbsoluteLeft", "getAbsoluteLeft$annotations", "absoluteLeft", "d", "getEnd", "getEnd$annotations", "end", "e", "getAbsoluteRight", "getAbsoluteRight$annotations", "absoluteRight", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class HorizontalChainReference {
    public final Object a;
    public final VerticalAnchor b;
    public final VerticalAnchor c;
    public final VerticalAnchor d;
    public final VerticalAnchor e;

    public HorizontalChainReference(@NotNull Object object0) {
        Intrinsics.checkNotNullParameter(object0, "id");
        super();
        this.a = object0;
        this.b = new VerticalAnchor(object0, -2);
        this.c = new VerticalAnchor(object0, 0);
        this.d = new VerticalAnchor(object0, -1);
        this.e = new VerticalAnchor(object0, 1);
    }

    @NotNull
    public final VerticalAnchor getAbsoluteLeft() {
        return this.c;
    }

    @Stable
    public static void getAbsoluteLeft$annotations() {
    }

    @NotNull
    public final VerticalAnchor getAbsoluteRight() {
        return this.e;
    }

    @Stable
    public static void getAbsoluteRight$annotations() {
    }

    @NotNull
    public final VerticalAnchor getEnd() {
        return this.d;
    }

    @Stable
    public static void getEnd$annotations() {
    }

    @NotNull
    public final Object getId$compose_release() {
        return this.a;
    }

    @NotNull
    public final VerticalAnchor getStart() {
        return this.b;
    }

    @Stable
    public static void getStart$annotations() {
    }
}

