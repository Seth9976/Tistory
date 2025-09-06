package androidx.compose.ui.layout;

import androidx.compose.ui.node.LookaheadDelegate;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\n\u0018\u00002\u00020\u0001J\u000F\u0010\u0003\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001A\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001A\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\t\u0010\u0007R \u0010\u000F\u001A\u000E\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u000B8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\r\u0010\u000ER\'\u0010\u0015\u001A\u0015\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0010¢\u0006\u0002\b\u00128VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"androidx/compose/ui/layout/LayoutNodeSubcompositionsState$Scope$layout$1", "Landroidx/compose/ui/layout/MeasureResult;", "", "placeChildren", "()V", "", "getWidth", "()I", "width", "getHeight", "height", "", "Landroidx/compose/ui/layout/AlignmentLine;", "getAlignmentLines", "()Ljava/util/Map;", "alignmentLines", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/RulerScope;", "Lkotlin/ExtensionFunctionType;", "getRulers", "()Lkotlin/jvm/functions/Function1;", "rulers", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class LayoutNodeSubcompositionsState.Scope.layout.1 implements MeasureResult {
    public final int a;
    public final int b;
    public final Map c;
    public final Function1 d;
    public final e e;
    public final LayoutNodeSubcompositionsState f;
    public final Function1 g;

    public LayoutNodeSubcompositionsState.Scope.layout.1(int v, int v1, Map map0, Function1 function10, e e0, LayoutNodeSubcompositionsState layoutNodeSubcompositionsState0, Function1 function11) {
        this.a = v;
        this.b = v1;
        this.c = map0;
        this.d = function10;
        this.e = e0;
        this.f = layoutNodeSubcompositionsState0;
        this.g = function11;
    }

    @Override  // androidx.compose.ui.layout.MeasureResult
    @NotNull
    public Map getAlignmentLines() {
        return this.c;
    }

    @Override  // androidx.compose.ui.layout.MeasureResult
    public int getHeight() {
        return this.b;
    }

    @Override  // androidx.compose.ui.layout.MeasureResult
    @Nullable
    public Function1 getRulers() {
        return this.d;
    }

    @Override  // androidx.compose.ui.layout.MeasureResult
    public int getWidth() {
        return this.a;
    }

    @Override  // androidx.compose.ui.layout.MeasureResult
    public void placeChildren() {
        Function1 function10 = this.g;
        LayoutNodeSubcompositionsState layoutNodeSubcompositionsState0 = this.f;
        if(this.e.isLookingAhead()) {
            LookaheadDelegate lookaheadDelegate0 = LayoutNodeSubcompositionsState.access$getRoot$p(layoutNodeSubcompositionsState0).getInnerCoordinator$ui_release().getLookaheadDelegate();
            if(lookaheadDelegate0 != null) {
                function10.invoke(lookaheadDelegate0.getPlacementScope());
                return;
            }
        }
        function10.invoke(LayoutNodeSubcompositionsState.access$getRoot$p(layoutNodeSubcompositionsState0).getInnerCoordinator$ui_release().getPlacementScope());
    }
}

