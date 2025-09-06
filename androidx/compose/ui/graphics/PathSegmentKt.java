package androidx.compose.ui.graphics;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\t\"\u0017\u0010\u0005\u001A\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001A\u0004\b\u0003\u0010\u0004\"\u0017\u0010\b\u001A\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0002\u001A\u0004\b\u0007\u0010\u0004¨\u0006\t"}, d2 = {"Landroidx/compose/ui/graphics/PathSegment;", "a", "Landroidx/compose/ui/graphics/PathSegment;", "getDoneSegment", "()Landroidx/compose/ui/graphics/PathSegment;", "DoneSegment", "b", "getCloseSegment", "CloseSegment", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class PathSegmentKt {
    public static final PathSegment a;
    public static final PathSegment b;

    static {
        PathSegmentKt.a = new PathSegment(Type.Done, new float[0], 0.0f);
        PathSegmentKt.b = new PathSegment(Type.Close, new float[0], 0.0f);
    }

    @NotNull
    public static final PathSegment getCloseSegment() {
        return PathSegmentKt.b;
    }

    @NotNull
    public static final PathSegment getDoneSegment() {
        return PathSegmentKt.a;
    }
}

