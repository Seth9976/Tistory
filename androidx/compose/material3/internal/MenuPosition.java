package androidx.compose.material3.internal;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.AbsoluteAlignment;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Stable
@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\bÁ\u0002\u0018\u00002\u00020\u0001:\u0002\u0012\u0013J\u0017\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001A\u00020\u00042\b\b\u0002\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\t\u001A\u00020\u00042\b\b\u0002\u0010\b\u001A\u00020\u0002¢\u0006\u0004\b\t\u0010\u0006J\u0017\u0010\n\u001A\u00020\u00042\b\b\u0002\u0010\b\u001A\u00020\u0002¢\u0006\u0004\b\n\u0010\u0006J\u0017\u0010\f\u001A\u00020\u000B2\b\b\u0002\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000E\u001A\u00020\u000B2\b\b\u0002\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u000E\u0010\rJ\u0017\u0010\u000F\u001A\u00020\u000B2\b\b\u0002\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u000F\u0010\rJ\u0017\u0010\u0010\u001A\u00020\u000B2\b\b\u0002\u0010\b\u001A\u00020\u0002¢\u0006\u0004\b\u0010\u0010\rJ\u0017\u0010\u0011\u001A\u00020\u000B2\b\b\u0002\u0010\b\u001A\u00020\u0002¢\u0006\u0004\b\u0011\u0010\r¨\u0006\u0014"}, d2 = {"Landroidx/compose/material3/internal/MenuPosition;", "", "", "offset", "Landroidx/compose/material3/internal/MenuPosition$Horizontal;", "startToAnchorStart", "(I)Landroidx/compose/material3/internal/MenuPosition$Horizontal;", "endToAnchorEnd", "margin", "leftToWindowLeft", "rightToWindowRight", "Landroidx/compose/material3/internal/MenuPosition$Vertical;", "topToAnchorBottom", "(I)Landroidx/compose/material3/internal/MenuPosition$Vertical;", "bottomToAnchorTop", "centerToAnchorTop", "topToWindowTop", "bottomToWindowBottom", "Horizontal", "Vertical", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class MenuPosition {
    @Stable
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bç\u0080\u0001\u0018\u00002\u00020\u0001J2\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u00072\u0006\u0010\b\u001A\u00020\u00032\u0006\u0010\t\u001A\u00020\nH&ø\u0001\u0000¢\u0006\u0004\b\u000B\u0010\fø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001E0\u0001\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Landroidx/compose/material3/internal/MenuPosition$Horizontal;", "", "position", "", "anchorBounds", "Landroidx/compose/ui/unit/IntRect;", "windowSize", "Landroidx/compose/ui/unit/IntSize;", "menuWidth", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "position-95KtPRI", "(Landroidx/compose/ui/unit/IntRect;JILandroidx/compose/ui/unit/LayoutDirection;)I", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public interface Horizontal {
        int position-95KtPRI(@NotNull IntRect arg1, long arg2, int arg3, @NotNull LayoutDirection arg4);
    }

    @Stable
    @Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bç\u0080\u0001\u0018\u00002\u00020\u0001J*\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u00072\u0006\u0010\b\u001A\u00020\u0003H&ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001E0\u0001\n\u0004\b!0\u0001¨\u0006\u000BÀ\u0006\u0001"}, d2 = {"Landroidx/compose/material3/internal/MenuPosition$Vertical;", "", "position", "", "anchorBounds", "Landroidx/compose/ui/unit/IntRect;", "windowSize", "Landroidx/compose/ui/unit/IntSize;", "menuHeight", "position-JVtK1S4", "(Landroidx/compose/ui/unit/IntRect;JI)I", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public interface Vertical {
        int position-JVtK1S4(@NotNull IntRect arg1, long arg2, int arg3);
    }

    public static final int $stable;
    @NotNull
    public static final MenuPosition INSTANCE;

    static {
        MenuPosition.INSTANCE = new MenuPosition();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @NotNull
    public final Vertical bottomToAnchorTop(int v) {
        return new androidx.compose.material3.internal.AnchorAlignmentOffsetPosition.Vertical(Alignment.Companion.getBottom(), Alignment.Companion.getTop(), v);
    }

    public static Vertical bottomToAnchorTop$default(MenuPosition menuPosition0, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = 0;
        }
        return menuPosition0.bottomToAnchorTop(v);
    }

    @NotNull
    public final Vertical bottomToWindowBottom(int v) {
        return new androidx.compose.material3.internal.WindowAlignmentMarginPosition.Vertical(Alignment.Companion.getBottom(), v);
    }

    public static Vertical bottomToWindowBottom$default(MenuPosition menuPosition0, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = 0;
        }
        return menuPosition0.bottomToWindowBottom(v);
    }

    @NotNull
    public final Vertical centerToAnchorTop(int v) {
        return new androidx.compose.material3.internal.AnchorAlignmentOffsetPosition.Vertical(Alignment.Companion.getCenterVertically(), Alignment.Companion.getTop(), v);
    }

    public static Vertical centerToAnchorTop$default(MenuPosition menuPosition0, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = 0;
        }
        return menuPosition0.centerToAnchorTop(v);
    }

    @NotNull
    public final Horizontal endToAnchorEnd(int v) {
        return new androidx.compose.material3.internal.AnchorAlignmentOffsetPosition.Horizontal(Alignment.Companion.getEnd(), Alignment.Companion.getEnd(), v);
    }

    public static Horizontal endToAnchorEnd$default(MenuPosition menuPosition0, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = 0;
        }
        return menuPosition0.endToAnchorEnd(v);
    }

    @NotNull
    public final Horizontal leftToWindowLeft(int v) {
        return new androidx.compose.material3.internal.WindowAlignmentMarginPosition.Horizontal(AbsoluteAlignment.INSTANCE.getLeft(), v);
    }

    public static Horizontal leftToWindowLeft$default(MenuPosition menuPosition0, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = 0;
        }
        return menuPosition0.leftToWindowLeft(v);
    }

    @NotNull
    public final Horizontal rightToWindowRight(int v) {
        return new androidx.compose.material3.internal.WindowAlignmentMarginPosition.Horizontal(AbsoluteAlignment.INSTANCE.getRight(), v);
    }

    public static Horizontal rightToWindowRight$default(MenuPosition menuPosition0, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = 0;
        }
        return menuPosition0.rightToWindowRight(v);
    }

    @NotNull
    public final Horizontal startToAnchorStart(int v) {
        return new androidx.compose.material3.internal.AnchorAlignmentOffsetPosition.Horizontal(Alignment.Companion.getStart(), Alignment.Companion.getStart(), v);
    }

    public static Horizontal startToAnchorStart$default(MenuPosition menuPosition0, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = 0;
        }
        return menuPosition0.startToAnchorStart(v);
    }

    @NotNull
    public final Vertical topToAnchorBottom(int v) {
        return new androidx.compose.material3.internal.AnchorAlignmentOffsetPosition.Vertical(Alignment.Companion.getTop(), Alignment.Companion.getBottom(), v);
    }

    public static Vertical topToAnchorBottom$default(MenuPosition menuPosition0, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = 0;
        }
        return menuPosition0.topToAnchorBottom(v);
    }

    @NotNull
    public final Vertical topToWindowTop(int v) {
        return new androidx.compose.material3.internal.WindowAlignmentMarginPosition.Vertical(Alignment.Companion.getTop(), v);
    }

    public static Vertical topToWindowTop$default(MenuPosition menuPosition0, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = 0;
        }
        return menuPosition0.topToWindowTop(v);
    }
}

