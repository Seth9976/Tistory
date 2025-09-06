package androidx.constraintlayout.compose;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bf\u0018\u0000 \u00032\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Landroidx/constraintlayout/compose/Dimension;", "", "Coercible", "Companion", "MaxCoercible", "MinCoercible", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public interface Dimension {
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/constraintlayout/compose/Dimension$Coercible;", "Landroidx/constraintlayout/compose/Dimension;", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public interface Coercible extends Dimension {
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000B\b\u0086\u0003\u0018\u00002\u00020\u0001J\u001B\u0010\u0007\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u001B\u0010\u000B\u001A\u00020\b2\u0006\u0010\u0003\u001A\u00020\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001A\u00020\b2\u0006\u0010\r\u001A\u00020\f¢\u0006\u0004\b\r\u0010\u000EJ\u0015\u0010\u0010\u001A\u00020\b2\u0006\u0010\u0010\u001A\u00020\u000F¢\u0006\u0004\b\u0010\u0010\nR\u0011\u0010\u0014\u001A\u00020\u00118F¢\u0006\u0006\u001A\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0017\u001A\u00020\b8F¢\u0006\u0006\u001A\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0019\u001A\u00020\b8F¢\u0006\u0006\u001A\u0004\b\u0018\u0010\u0016R\u0011\u0010\u001B\u001A\u00020\u00118F¢\u0006\u0006\u001A\u0004\b\u001A\u0010\u0013\u0082\u0002\u000B\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001¨\u0006\u001C"}, d2 = {"Landroidx/constraintlayout/compose/Dimension$Companion;", "", "Landroidx/compose/ui/unit/Dp;", "dp", "Landroidx/constraintlayout/compose/Dimension$MinCoercible;", "preferredValue-0680j_4", "(F)Landroidx/constraintlayout/compose/Dimension$MinCoercible;", "preferredValue", "Landroidx/constraintlayout/compose/Dimension;", "value-0680j_4", "(F)Landroidx/constraintlayout/compose/Dimension;", "value", "", "ratio", "(Ljava/lang/String;)Landroidx/constraintlayout/compose/Dimension;", "", "percent", "Landroidx/constraintlayout/compose/Dimension$Coercible;", "getPreferredWrapContent", "()Landroidx/constraintlayout/compose/Dimension$Coercible;", "preferredWrapContent", "getWrapContent", "()Landroidx/constraintlayout/compose/Dimension;", "wrapContent", "getMatchParent", "matchParent", "getFillToConstraints", "fillToConstraints", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class Companion {
        public static final Companion a;

        static {
            Companion.a = new Companion();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        @NotNull
        public final Coercible getFillToConstraints() {
            return new DimensionDescription(v.w);
        }

        @NotNull
        public final Dimension getMatchParent() {
            return new DimensionDescription(w.w);
        }

        @NotNull
        public final Coercible getPreferredWrapContent() {
            return new DimensionDescription(z.w);
        }

        @NotNull
        public final Dimension getWrapContent() {
            return new DimensionDescription(c0.w);
        }

        @NotNull
        public final Dimension percent(float f) {
            return new DimensionDescription(new x(f));
        }

        @NotNull
        public final MinCoercible preferredValue-0680j_4(float f) {
            return new DimensionDescription(new y(f));
        }

        @NotNull
        public final Dimension ratio(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "ratio");
            return new DimensionDescription(new a0(s));
        }

        @NotNull
        public final Dimension value-0680j_4(float f) {
            return new DimensionDescription(new b0(f));
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/constraintlayout/compose/Dimension$MaxCoercible;", "Landroidx/constraintlayout/compose/Dimension;", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public interface MaxCoercible extends Dimension {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/constraintlayout/compose/Dimension$MinCoercible;", "Landroidx/constraintlayout/compose/Dimension;", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public interface MinCoercible extends Dimension {
    }

    @NotNull
    public static final Companion Companion;

    static {
        Dimension.Companion = Companion.a;
    }
}

