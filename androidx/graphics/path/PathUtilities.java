package androidx.graphics.path;

import android.graphics.Path;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\u001A\r\u0010\u0000\u001A\u00020\u0001*\u00020\u0002H\u0086\u0002\u001A\u001C\u0010\u0000\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u00042\b\b\u0002\u0010\u0005\u001A\u00020\u0006¨\u0006\u0007"}, d2 = {"iterator", "Landroidx/graphics/path/PathIterator;", "Landroid/graphics/Path;", "conicEvaluation", "Landroidx/graphics/path/PathIterator$ConicEvaluation;", "tolerance", "", "graphics-path_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@JvmName(name = "PathUtilities")
public final class PathUtilities {
    @NotNull
    public static final PathIterator iterator(@NotNull Path path0) {
        Intrinsics.checkNotNullParameter(path0, "<this>");
        return new PathIterator(path0, null, 0.0f, 6, null);
    }

    @NotNull
    public static final PathIterator iterator(@NotNull Path path0, @NotNull ConicEvaluation pathIterator$ConicEvaluation0, float f) {
        Intrinsics.checkNotNullParameter(path0, "<this>");
        Intrinsics.checkNotNullParameter(pathIterator$ConicEvaluation0, "conicEvaluation");
        return new PathIterator(path0, pathIterator$ConicEvaluation0, f);
    }

    public static PathIterator iterator$default(Path path0, ConicEvaluation pathIterator$ConicEvaluation0, float f, int v, Object object0) {
        if((v & 2) != 0) {
            f = 0.25f;
        }
        return PathUtilities.iterator(path0, pathIterator$ConicEvaluation0, f);
    }
}

