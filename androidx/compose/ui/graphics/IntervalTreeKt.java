package androidx.compose.ui.graphics;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\"\"\u0010\u0006\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001A\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/graphics/Interval;", "", "a", "Landroidx/compose/ui/graphics/Interval;", "getEmptyInterval", "()Landroidx/compose/ui/graphics/Interval;", "EmptyInterval", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class IntervalTreeKt {
    public static final Interval a;

    static {
        IntervalTreeKt.a = new Interval(3.402823E+38f, 1.401298E-45f, null);
    }

    @NotNull
    public static final Interval getEmptyInterval() {
        return IntervalTreeKt.a;
    }
}

