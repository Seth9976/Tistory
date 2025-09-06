package androidx.constraintlayout.compose;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J1\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00072\b\b\u0002\u0010\b\u001A\u00020\u0007H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u000B\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001¨\u0006\u000B"}, d2 = {"Landroidx/constraintlayout/compose/VerticalAnchorable;", "", "linkTo", "", "anchor", "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;", "margin", "Landroidx/compose/ui/unit/Dp;", "goneMargin", "linkTo-VpY3zN4", "(Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;FF)V", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public interface VerticalAnchorable {
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 0x30)
    public static final class DefaultImpls {
        public static void linkTo-VpY3zN4$default(VerticalAnchorable verticalAnchorable0, VerticalAnchor constraintLayoutBaseScope$VerticalAnchor0, float f, float f1, int v, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: linkTo-VpY3zN4");
            }
            if((v & 2) != 0) {
                f = 0.0f;
            }
            if((v & 4) != 0) {
                f1 = 0.0f;
            }
            verticalAnchorable0.linkTo-VpY3zN4(constraintLayoutBaseScope$VerticalAnchor0, f, f1);
        }
    }

    void linkTo-VpY3zN4(@NotNull VerticalAnchor arg1, float arg2, float arg3);
}

