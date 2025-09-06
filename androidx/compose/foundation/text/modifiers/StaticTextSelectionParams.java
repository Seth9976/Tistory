package androidx.compose.foundation.text.modifiers;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.style.TextOverflow;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000B\n\u0002\b\u0005\b\u0010\u0018\u0000 \u001C2\u00020\u0001:\u0001\u001CB\u001B\u0012\b\u0010\u0003\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\f\u001A\u0004\u0018\u00010\u000B2\u0006\u0010\t\u001A\u00020\b2\u0006\u0010\n\u001A\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rJ%\u0010\u000E\u001A\u00020\u00002\n\b\u0002\u0010\u0003\u001A\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000E\u0010\u000FR\u0019\u0010\u0003\u001A\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001A\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0005\u001A\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001A\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001B\u001A\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0019\u0010\u001A¨\u0006\u001D"}, d2 = {"Landroidx/compose/foundation/text/modifiers/StaticTextSelectionParams;", "", "Landroidx/compose/ui/layout/LayoutCoordinates;", "layoutCoordinates", "Landroidx/compose/ui/text/TextLayoutResult;", "textLayoutResult", "<init>", "(Landroidx/compose/ui/layout/LayoutCoordinates;Landroidx/compose/ui/text/TextLayoutResult;)V", "", "start", "end", "Landroidx/compose/ui/graphics/Path;", "getPathForRange", "(II)Landroidx/compose/ui/graphics/Path;", "copy", "(Landroidx/compose/ui/layout/LayoutCoordinates;Landroidx/compose/ui/text/TextLayoutResult;)Landroidx/compose/foundation/text/modifiers/StaticTextSelectionParams;", "a", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getLayoutCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "b", "Landroidx/compose/ui/text/TextLayoutResult;", "getTextLayoutResult", "()Landroidx/compose/ui/text/TextLayoutResult;", "", "getShouldClip", "()Z", "shouldClip", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public class StaticTextSelectionParams {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/text/modifiers/StaticTextSelectionParams$Companion;", "", "Landroidx/compose/foundation/text/modifiers/StaticTextSelectionParams;", "Empty", "Landroidx/compose/foundation/text/modifiers/StaticTextSelectionParams;", "getEmpty", "()Landroidx/compose/foundation/text/modifiers/StaticTextSelectionParams;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final StaticTextSelectionParams getEmpty() {
            return StaticTextSelectionParams.c;
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final LayoutCoordinates a;
    public final TextLayoutResult b;
    public static final StaticTextSelectionParams c;

    static {
        StaticTextSelectionParams.Companion = new Companion(null);
        StaticTextSelectionParams.$stable = 8;
        StaticTextSelectionParams.c = new StaticTextSelectionParams(null, null);
    }

    public StaticTextSelectionParams(@Nullable LayoutCoordinates layoutCoordinates0, @Nullable TextLayoutResult textLayoutResult0) {
        this.a = layoutCoordinates0;
        this.b = textLayoutResult0;
    }

    @NotNull
    public final StaticTextSelectionParams copy(@Nullable LayoutCoordinates layoutCoordinates0, @Nullable TextLayoutResult textLayoutResult0) {
        return new StaticTextSelectionParams(layoutCoordinates0, textLayoutResult0);
    }

    public static StaticTextSelectionParams copy$default(StaticTextSelectionParams staticTextSelectionParams0, LayoutCoordinates layoutCoordinates0, TextLayoutResult textLayoutResult0, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copy");
        }
        if((v & 1) != 0) {
            layoutCoordinates0 = staticTextSelectionParams0.a;
        }
        if((v & 2) != 0) {
            textLayoutResult0 = staticTextSelectionParams0.b;
        }
        return staticTextSelectionParams0.copy(layoutCoordinates0, textLayoutResult0);
    }

    @Nullable
    public final LayoutCoordinates getLayoutCoordinates() {
        return this.a;
    }

    @Nullable
    public Path getPathForRange(int v, int v1) {
        return this.b == null ? null : this.b.getPathForRange(v, v1);
    }

    // 去混淆评级： 低(40)
    public boolean getShouldClip() {
        return this.b != null && !TextOverflow.equals-impl0(this.b.getLayoutInput().getOverflow-gIe3tQ8(), 3) && this.b.getHasVisualOverflow();
    }

    @Nullable
    public final TextLayoutResult getTextLayoutResult() {
        return this.b;
    }
}

