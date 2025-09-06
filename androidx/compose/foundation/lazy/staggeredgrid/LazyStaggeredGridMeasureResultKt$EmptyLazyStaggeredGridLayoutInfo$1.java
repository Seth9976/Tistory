package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.ui.layout.MeasureResult;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.x;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\r*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000F\u0010\u0003\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R,\u0010\r\u001A\u000E\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b\b\u0010\t\u0012\u0004\b\f\u0010\u0004\u001A\u0004\b\n\u0010\u000BR\u001A\u0010\u000E\u001A\u00020\u00078\u0016X\u0096D¢\u0006\f\n\u0004\b\u000E\u0010\u000F\u001A\u0004\b\u0010\u0010\u0011R\u001A\u0010\u0012\u001A\u00020\u00078\u0016X\u0096D¢\u0006\f\n\u0004\b\u0012\u0010\u000F\u001A\u0004\b\u0013\u0010\u0011¨\u0006\u0014"}, d2 = {"androidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResultKt$EmptyLazyStaggeredGridLayoutInfo$1", "Landroidx/compose/ui/layout/MeasureResult;", "", "placeChildren", "()V", "", "Landroidx/compose/ui/layout/AlignmentLine;", "", "a", "Ljava/util/Map;", "getAlignmentLines", "()Ljava/util/Map;", "getAlignmentLines$annotations", "alignmentLines", "width", "I", "getWidth", "()I", "height", "getHeight", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class LazyStaggeredGridMeasureResultKt.EmptyLazyStaggeredGridLayoutInfo.1 implements MeasureResult {
    public final Map a;

    public LazyStaggeredGridMeasureResultKt.EmptyLazyStaggeredGridLayoutInfo.1() {
        this.a = x.emptyMap();
    }

    @Override  // androidx.compose.ui.layout.MeasureResult
    @NotNull
    public Map getAlignmentLines() {
        return this.a;
    }

    public static void getAlignmentLines$annotations() {
    }

    @Override  // androidx.compose.ui.layout.MeasureResult
    public int getHeight() {
        return 0;
    }

    @Override  // androidx.compose.ui.layout.MeasureResult
    public int getWidth() {
        return 0;
    }

    @Override  // androidx.compose.ui.layout.MeasureResult
    public void placeChildren() {
    }
}

