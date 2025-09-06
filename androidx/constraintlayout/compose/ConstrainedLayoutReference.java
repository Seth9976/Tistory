package androidx.constraintlayout.compose;

import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Stable
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0002\u001A\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0002\u001A\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001A\u0004\b\u0007\u0010\bR \u0010\u0010\u001A\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u000B\u0012\u0004\b\u000E\u0010\u000F\u001A\u0004\b\f\u0010\rR \u0010\u0014\u001A\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u000B\u0012\u0004\b\u0013\u0010\u000F\u001A\u0004\b\u0012\u0010\rR \u0010\u001B\u001A\u00020\u00158\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u0012\u0004\b\u001A\u0010\u000F\u001A\u0004\b\u0018\u0010\u0019R \u0010\u001F\u001A\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001C\u0010\u000B\u0012\u0004\b\u001E\u0010\u000F\u001A\u0004\b\u001D\u0010\rR \u0010#\u001A\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b \u0010\u000B\u0012\u0004\b\"\u0010\u000F\u001A\u0004\b!\u0010\rR \u0010\'\u001A\u00020\u00158\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b$\u0010\u0017\u0012\u0004\b&\u0010\u000F\u001A\u0004\b%\u0010\u0019R \u0010.\u001A\u00020(8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b)\u0010*\u0012\u0004\b-\u0010\u000F\u001A\u0004\b+\u0010,¨\u0006/"}, d2 = {"Landroidx/constraintlayout/compose/ConstrainedLayoutReference;", "", "id", "<init>", "(Ljava/lang/Object;)V", "a", "Ljava/lang/Object;", "getId", "()Ljava/lang/Object;", "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;", "b", "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;", "getStart", "()Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;", "getStart$annotations", "()V", "start", "c", "getAbsoluteLeft", "getAbsoluteLeft$annotations", "absoluteLeft", "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;", "d", "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;", "getTop", "()Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;", "getTop$annotations", "top", "e", "getEnd", "getEnd$annotations", "end", "f", "getAbsoluteRight", "getAbsoluteRight$annotations", "absoluteRight", "g", "getBottom", "getBottom$annotations", "bottom", "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$BaselineAnchor;", "h", "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$BaselineAnchor;", "getBaseline", "()Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$BaselineAnchor;", "getBaseline$annotations", "baseline", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class ConstrainedLayoutReference {
    public final Object a;
    public final VerticalAnchor b;
    public final VerticalAnchor c;
    public final HorizontalAnchor d;
    public final VerticalAnchor e;
    public final VerticalAnchor f;
    public final HorizontalAnchor g;
    public final BaselineAnchor h;

    public ConstrainedLayoutReference(@NotNull Object object0) {
        Intrinsics.checkNotNullParameter(object0, "id");
        super();
        this.a = object0;
        this.b = new VerticalAnchor(object0, -2);
        this.c = new VerticalAnchor(object0, 0);
        this.d = new HorizontalAnchor(object0, 0);
        this.e = new VerticalAnchor(object0, -1);
        this.f = new VerticalAnchor(object0, 1);
        this.g = new HorizontalAnchor(object0, 1);
        this.h = new BaselineAnchor(object0);
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
        return this.f;
    }

    @Stable
    public static void getAbsoluteRight$annotations() {
    }

    @NotNull
    public final BaselineAnchor getBaseline() {
        return this.h;
    }

    @Stable
    public static void getBaseline$annotations() {
    }

    @NotNull
    public final HorizontalAnchor getBottom() {
        return this.g;
    }

    @Stable
    public static void getBottom$annotations() {
    }

    @NotNull
    public final VerticalAnchor getEnd() {
        return this.e;
    }

    @Stable
    public static void getEnd$annotations() {
    }

    @NotNull
    public final Object getId() {
        return this.a;
    }

    @NotNull
    public final VerticalAnchor getStart() {
        return this.b;
    }

    @Stable
    public static void getStart$annotations() {
    }

    @NotNull
    public final HorizontalAnchor getTop() {
        return this.d;
    }

    @Stable
    public static void getTop$annotations() {
    }
}

