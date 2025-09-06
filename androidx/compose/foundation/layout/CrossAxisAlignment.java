package androidx.compose.foundation.layout;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.Alignment.Horizontal;
import androidx.compose.ui.Alignment.Vertical;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000B\n\u0002\b\u000B\b1\u0018\u0000 \u00132\u00020\u0001:\u0007\u0014\u0015\u0013\u0016\u0017\u0018\u0019J/\u0010\u000B\u001A\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\b\u001A\u00020\u0002H ¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000E\u001A\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001A\u00020\u0006H\u0010¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001A\u00020\u000F8PX\u0090\u0004¢\u0006\u0006\u001A\u0004\b\u0010\u0010\u0011\u0082\u0001\u0006\u0014\u0015\u0016\u0017\u0018\u0019¨\u0006\u001A"}, d2 = {"Landroidx/compose/foundation/layout/CrossAxisAlignment;", "", "", "size", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/layout/Placeable;", "placeable", "beforeCrossAxisAlignmentLine", "align$foundation_layout_release", "(ILandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/layout/Placeable;I)I", "align", "calculateAlignmentLinePosition$foundation_layout_release", "(Landroidx/compose/ui/layout/Placeable;)Ljava/lang/Integer;", "calculateAlignmentLinePosition", "", "isRelative$foundation_layout_release", "()Z", "isRelative", "Companion", "androidx/compose/foundation/layout/s0", "androidx/compose/foundation/layout/t0", "androidx/compose/foundation/layout/u0", "androidx/compose/foundation/layout/v0", "androidx/compose/foundation/layout/w0", "androidx/compose/foundation/layout/x0", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public abstract class CrossAxisAlignment {
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u000B\u001A\u00020\u00042\u0006\u0010\b\u001A\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001A\u00020\u00042\u0006\u0010\r\u001A\u00020\fH\u0000¢\u0006\u0004\b\u000E\u0010\u000FJ\u0017\u0010\u0011\u001A\u00020\u00042\u0006\u0010\u0011\u001A\u00020\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013R \u0010\u0014\u001A\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u0012\u0004\b\u0018\u0010\u0019\u001A\u0004\b\u0016\u0010\u0017R \u0010\u001A\u001A\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001A\u0010\u0015\u0012\u0004\b\u001C\u0010\u0019\u001A\u0004\b\u001B\u0010\u0017R \u0010\u001D\u001A\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001D\u0010\u0015\u0012\u0004\b\u001F\u0010\u0019\u001A\u0004\b\u001E\u0010\u0017¨\u0006 "}, d2 = {"Landroidx/compose/foundation/layout/CrossAxisAlignment$Companion;", "", "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLine", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "AlignmentLine", "(Landroidx/compose/ui/layout/AlignmentLine;)Landroidx/compose/foundation/layout/CrossAxisAlignment;", "Landroidx/compose/foundation/layout/AlignmentLineProvider;", "alignmentLineProvider", "Relative$foundation_layout_release", "(Landroidx/compose/foundation/layout/AlignmentLineProvider;)Landroidx/compose/foundation/layout/CrossAxisAlignment;", "Relative", "Landroidx/compose/ui/Alignment$Vertical;", "vertical", "vertical$foundation_layout_release", "(Landroidx/compose/ui/Alignment$Vertical;)Landroidx/compose/foundation/layout/CrossAxisAlignment;", "Landroidx/compose/ui/Alignment$Horizontal;", "horizontal", "horizontal$foundation_layout_release", "(Landroidx/compose/ui/Alignment$Horizontal;)Landroidx/compose/foundation/layout/CrossAxisAlignment;", "Center", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "getCenter", "()Landroidx/compose/foundation/layout/CrossAxisAlignment;", "getCenter$annotations", "()V", "Start", "getStart", "getStart$annotations", "End", "getEnd", "getEnd$annotations", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final CrossAxisAlignment AlignmentLine(@NotNull AlignmentLine alignmentLine0) {
            return new s0(new Value(alignmentLine0));
        }

        @NotNull
        public final CrossAxisAlignment Relative$foundation_layout_release(@NotNull AlignmentLineProvider alignmentLineProvider0) {
            return new s0(alignmentLineProvider0);
        }

        @NotNull
        public final CrossAxisAlignment getCenter() {
            return CrossAxisAlignment.a;
        }

        @Stable
        public static void getCenter$annotations() {
        }

        @NotNull
        public final CrossAxisAlignment getEnd() {
            return CrossAxisAlignment.c;
        }

        @Stable
        public static void getEnd$annotations() {
        }

        @NotNull
        public final CrossAxisAlignment getStart() {
            return CrossAxisAlignment.b;
        }

        @Stable
        public static void getStart$annotations() {
        }

        @NotNull
        public final CrossAxisAlignment horizontal$foundation_layout_release(@NotNull Horizontal alignment$Horizontal0) {
            return new v0(alignment$Horizontal0);
        }

        @NotNull
        public final CrossAxisAlignment vertical$foundation_layout_release(@NotNull Vertical alignment$Vertical0) {
            return new x0(alignment$Vertical0);
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public static final t0 a;
    public static final w0 b;
    public static final u0 c;

    static {
        CrossAxisAlignment.Companion = new Companion(null);
        CrossAxisAlignment.a = t0.d;
        CrossAxisAlignment.b = w0.d;
        CrossAxisAlignment.c = u0.d;
    }

    public CrossAxisAlignment(DefaultConstructorMarker defaultConstructorMarker0) {
    }

    public abstract int align$foundation_layout_release(int arg1, @NotNull LayoutDirection arg2, @NotNull Placeable arg3, int arg4);

    @Nullable
    public Integer calculateAlignmentLinePosition$foundation_layout_release(@NotNull Placeable placeable0) {
        return null;
    }

    public boolean isRelative$foundation_layout_release() {
        return false;
    }
}

