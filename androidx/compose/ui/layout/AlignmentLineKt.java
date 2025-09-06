package androidx.compose.ui.layout;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import z1.a;
import z1.b;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u001A#\u0010\u0004\u001A\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u00012\u0006\u0010\u0003\u001A\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\"\u0017\u0010\u000B\u001A\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001A\u0004\b\t\u0010\n\"\u0017\u0010\u000E\u001A\u00020\u00068\u0006¢\u0006\f\n\u0004\b\f\u0010\b\u001A\u0004\b\r\u0010\n¨\u0006\u000F"}, d2 = {"Landroidx/compose/ui/layout/AlignmentLine;", "", "position1", "position2", "merge", "(Landroidx/compose/ui/layout/AlignmentLine;II)I", "Landroidx/compose/ui/layout/HorizontalAlignmentLine;", "a", "Landroidx/compose/ui/layout/HorizontalAlignmentLine;", "getFirstBaseline", "()Landroidx/compose/ui/layout/HorizontalAlignmentLine;", "FirstBaseline", "b", "getLastBaseline", "LastBaseline", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class AlignmentLineKt {
    public static final HorizontalAlignmentLine a;
    public static final HorizontalAlignmentLine b;

    static {
        AlignmentLineKt.a = new HorizontalAlignmentLine(a.a);
        AlignmentLineKt.b = new HorizontalAlignmentLine(b.a);
    }

    @NotNull
    public static final HorizontalAlignmentLine getFirstBaseline() {
        return AlignmentLineKt.a;
    }

    @NotNull
    public static final HorizontalAlignmentLine getLastBaseline() {
        return AlignmentLineKt.b;
    }

    public static final int merge(@NotNull AlignmentLine alignmentLine0, int v, int v1) {
        return ((Number)alignmentLine0.getMerger$ui_release().invoke(v, v1)).intValue();
    }
}

