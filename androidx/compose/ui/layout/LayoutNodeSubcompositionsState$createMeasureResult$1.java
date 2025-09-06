package androidx.compose.ui.layout;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\n\u0018\u00002\u00020\u0001J\u000F\u0010\u0003\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\n\u001A\u000E\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0016X\u0096\u0005¢\u0006\u0006\u001A\u0004\b\b\u0010\tR\u0014\u0010\r\u001A\u00020\u00078\u0016X\u0096\u0005¢\u0006\u0006\u001A\u0004\b\u000B\u0010\fR\'\u0010\u0013\u001A\u0015\u0012\u0004\u0012\u00020\u000F\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000E¢\u0006\u0002\b\u00108VX\u0096\u0005¢\u0006\u0006\u001A\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001A\u00020\u00078\u0016X\u0096\u0005¢\u0006\u0006\u001A\u0004\b\u0014\u0010\f¨\u0006\u0016"}, d2 = {"androidx/compose/ui/layout/LayoutNodeSubcompositionsState$createMeasureResult$1", "Landroidx/compose/ui/layout/MeasureResult;", "", "placeChildren", "()V", "", "Landroidx/compose/ui/layout/AlignmentLine;", "", "getAlignmentLines", "()Ljava/util/Map;", "alignmentLines", "getHeight", "()I", "height", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/RulerScope;", "Lkotlin/ExtensionFunctionType;", "getRulers", "()Lkotlin/jvm/functions/Function1;", "rulers", "getWidth", "width", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSubcomposeLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/LayoutNodeSubcompositionsState$createMeasureResult$1\n*L\n1#1,1013:1\n*E\n"})
public final class LayoutNodeSubcompositionsState.createMeasureResult.1 implements MeasureResult {
    public final MeasureResult a;
    public final Function0 b;

    public LayoutNodeSubcompositionsState.createMeasureResult.1(MeasureResult measureResult0, Function0 function00) {
        this.b = function00;
        super();
        this.a = measureResult0;
    }

    @Override  // androidx.compose.ui.layout.MeasureResult
    @NotNull
    public Map getAlignmentLines() {
        return this.a.getAlignmentLines();
    }

    @Override  // androidx.compose.ui.layout.MeasureResult
    public int getHeight() {
        return this.a.getHeight();
    }

    @Override  // androidx.compose.ui.layout.MeasureResult
    @Nullable
    public Function1 getRulers() {
        return this.a.getRulers();
    }

    @Override  // androidx.compose.ui.layout.MeasureResult
    public int getWidth() {
        return this.a.getWidth();
    }

    @Override  // androidx.compose.ui.layout.MeasureResult
    public void placeChildren() {
        this.b.invoke();
    }
}

