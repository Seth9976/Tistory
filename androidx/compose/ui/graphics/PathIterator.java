package androidx.compose.ui.graphics;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0003\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019J\u0012\u0010\u000F\u001A\u00020\u00102\b\b\u0002\u0010\u0011\u001A\u00020\u0012H&J\t\u0010\u0013\u001A\u00020\u0012H¦\u0002J\t\u0010\u0014\u001A\u00020\u0002H¦\u0002J\u001A\u0010\u0014\u001A\u00020\u00152\u0006\u0010\u0016\u001A\u00020\u00172\b\b\u0002\u0010\u0018\u001A\u00020\u0010H&R\u0012\u0010\u0003\u001A\u00020\u0004X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001A\u00020\bX¦\u0004¢\u0006\u0006\u001A\u0004\b\t\u0010\nR\u0012\u0010\u000B\u001A\u00020\fX¦\u0004¢\u0006\u0006\u001A\u0004\b\r\u0010\u000Eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001AÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/graphics/PathIterator;", "", "Landroidx/compose/ui/graphics/PathSegment;", "conicEvaluation", "Landroidx/compose/ui/graphics/PathIterator$ConicEvaluation;", "getConicEvaluation", "()Landroidx/compose/ui/graphics/PathIterator$ConicEvaluation;", "path", "Landroidx/compose/ui/graphics/Path;", "getPath", "()Landroidx/compose/ui/graphics/Path;", "tolerance", "", "getTolerance", "()F", "calculateSize", "", "includeConvertedConics", "", "hasNext", "next", "Landroidx/compose/ui/graphics/PathSegment$Type;", "outPoints", "", "offset", "ConicEvaluation", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface PathIterator extends Iterator, KMappedMarker {
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/graphics/PathIterator$ConicEvaluation;", "", "AsConic", "AsQuadratics", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static enum ConicEvaluation {
        AsConic,
        AsQuadratics;

    }

    int calculateSize(boolean arg1);

    static int calculateSize$default(PathIterator pathIterator0, boolean z, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: calculateSize");
        }
        if((v & 1) != 0) {
            z = true;
        }
        return pathIterator0.calculateSize(z);
    }

    @NotNull
    ConicEvaluation getConicEvaluation();

    @NotNull
    Path getPath();

    float getTolerance();

    @Override
    boolean hasNext();

    @NotNull
    Type next(@NotNull float[] arg1, int arg2);

    @NotNull
    PathSegment next();

    static Type next$default(PathIterator pathIterator0, float[] arr_f, int v, int v1, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: next");
        }
        if((v1 & 2) != 0) {
            v = 0;
        }
        return pathIterator0.next(arr_f, v);
    }
}

