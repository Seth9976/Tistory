package androidx.compose.ui.graphics;

import androidx.annotation.FloatRange;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A\u001F\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0001\u001A\u00020\u00002\b\b\u0003\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/graphics/Path;", "path", "", "tolerance", "Landroidx/compose/ui/graphics/PathHitTester;", "PathHitTester", "(Landroidx/compose/ui/graphics/Path;F)Landroidx/compose/ui/graphics/PathHitTester;", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class PathHitTesterKt {
    public static final Path a;

    static {
        PathHitTesterKt.a = AndroidPath_androidKt.Path();
    }

    @NotNull
    public static final PathHitTester PathHitTester(@NotNull Path path0, @FloatRange(from = 0.0) float f) {
        PathHitTester pathHitTester0 = new PathHitTester();
        pathHitTester0.updatePath(path0, f);
        return pathHitTester0;
    }

    public static PathHitTester PathHitTester$default(Path path0, float f, int v, Object object0) {
        if((v & 2) != 0) {
            f = 0.5f;
        }
        return PathHitTesterKt.PathHitTester(path0, f);
    }

    public static final Path access$getEmptyPath$p() {
        return PathHitTesterKt.a;
    }
}

