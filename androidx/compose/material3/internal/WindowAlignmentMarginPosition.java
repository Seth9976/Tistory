package androidx.compose.material3.internal;

import a5.b;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/material3/internal/WindowAlignmentMarginPosition;", "", "Horizontal", "Vertical", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class WindowAlignmentMarginPosition {
    @Immutable
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J2\u0010\u0011\u001A\u00020\u00042\u0006\u0010\t\u001A\u00020\b2\u0006\u0010\u000B\u001A\u00020\n2\u0006\u0010\f\u001A\u00020\u00042\u0006\u0010\u000E\u001A\u00020\rH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000F\u0010\u0010J$\u0010\u0012\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001A\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001A\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001A\u0010\u001C\u001A\u00020\u001B2\b\u0010\u001A\u001A\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001C\u0010\u001D\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u001E"}, d2 = {"Landroidx/compose/material3/internal/WindowAlignmentMarginPosition$Horizontal;", "Landroidx/compose/material3/internal/MenuPosition$Horizontal;", "Landroidx/compose/ui/Alignment$Horizontal;", "alignment", "", "margin", "<init>", "(Landroidx/compose/ui/Alignment$Horizontal;I)V", "Landroidx/compose/ui/unit/IntRect;", "anchorBounds", "Landroidx/compose/ui/unit/IntSize;", "windowSize", "menuWidth", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "position-95KtPRI", "(Landroidx/compose/ui/unit/IntRect;JILandroidx/compose/ui/unit/LayoutDirection;)I", "position", "copy", "(Landroidx/compose/ui/Alignment$Horizontal;I)Landroidx/compose/material3/internal/WindowAlignmentMarginPosition$Horizontal;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Horizontal implements androidx.compose.material3.internal.MenuPosition.Horizontal {
        public static final int $stable;
        public final androidx.compose.ui.Alignment.Horizontal a;
        public final int b;

        public Horizontal(@NotNull androidx.compose.ui.Alignment.Horizontal alignment$Horizontal0, int v) {
            this.a = alignment$Horizontal0;
            this.b = v;
        }

        @NotNull
        public final Horizontal copy(@NotNull androidx.compose.ui.Alignment.Horizontal alignment$Horizontal0, int v) {
            return new Horizontal(alignment$Horizontal0, v);
        }

        public static Horizontal copy$default(Horizontal windowAlignmentMarginPosition$Horizontal0, androidx.compose.ui.Alignment.Horizontal alignment$Horizontal0, int v, int v1, Object object0) {
            if((v1 & 1) != 0) {
                alignment$Horizontal0 = windowAlignmentMarginPosition$Horizontal0.a;
            }
            if((v1 & 2) != 0) {
                v = windowAlignmentMarginPosition$Horizontal0.b;
            }
            return windowAlignmentMarginPosition$Horizontal0.copy(alignment$Horizontal0, v);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof Horizontal)) {
                return false;
            }
            return Intrinsics.areEqual(this.a, ((Horizontal)object0).a) ? this.b == ((Horizontal)object0).b : false;
        }

        @Override
        public int hashCode() {
            return this.b + this.a.hashCode() * 0x1F;
        }

        @Override  // androidx.compose.material3.internal.MenuPosition$Horizontal
        public int position-95KtPRI(@NotNull IntRect intRect0, long v, int v1, @NotNull LayoutDirection layoutDirection0) {
            return v1 < IntSize.getWidth-impl(v) - this.b * 2 ? c.coerceIn(this.a.align(v1, IntSize.getWidth-impl(v), layoutDirection0), this.b, IntSize.getWidth-impl(v) - this.b - v1) : Alignment.Companion.getCenterHorizontally().align(v1, IntSize.getWidth-impl(v), layoutDirection0);
        }

        @Override
        @NotNull
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder("Horizontal(alignment=");
            stringBuilder0.append(this.a);
            stringBuilder0.append(", margin=");
            return b.p(stringBuilder0, this.b, ')');
        }
    }

    @Immutable
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\u000F\u001A\u00020\u00042\u0006\u0010\t\u001A\u00020\b2\u0006\u0010\u000B\u001A\u00020\n2\u0006\u0010\f\u001A\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000EJ$\u0010\u0010\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001A\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001A\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001A\u0010\u001A\u001A\u00020\u00192\b\u0010\u0018\u001A\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001A\u0010\u001B\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u001C"}, d2 = {"Landroidx/compose/material3/internal/WindowAlignmentMarginPosition$Vertical;", "Landroidx/compose/material3/internal/MenuPosition$Vertical;", "Landroidx/compose/ui/Alignment$Vertical;", "alignment", "", "margin", "<init>", "(Landroidx/compose/ui/Alignment$Vertical;I)V", "Landroidx/compose/ui/unit/IntRect;", "anchorBounds", "Landroidx/compose/ui/unit/IntSize;", "windowSize", "menuHeight", "position-JVtK1S4", "(Landroidx/compose/ui/unit/IntRect;JI)I", "position", "copy", "(Landroidx/compose/ui/Alignment$Vertical;I)Landroidx/compose/material3/internal/WindowAlignmentMarginPosition$Vertical;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Vertical implements androidx.compose.material3.internal.MenuPosition.Vertical {
        public static final int $stable;
        public final androidx.compose.ui.Alignment.Vertical a;
        public final int b;

        public Vertical(@NotNull androidx.compose.ui.Alignment.Vertical alignment$Vertical0, int v) {
            this.a = alignment$Vertical0;
            this.b = v;
        }

        @NotNull
        public final Vertical copy(@NotNull androidx.compose.ui.Alignment.Vertical alignment$Vertical0, int v) {
            return new Vertical(alignment$Vertical0, v);
        }

        public static Vertical copy$default(Vertical windowAlignmentMarginPosition$Vertical0, androidx.compose.ui.Alignment.Vertical alignment$Vertical0, int v, int v1, Object object0) {
            if((v1 & 1) != 0) {
                alignment$Vertical0 = windowAlignmentMarginPosition$Vertical0.a;
            }
            if((v1 & 2) != 0) {
                v = windowAlignmentMarginPosition$Vertical0.b;
            }
            return windowAlignmentMarginPosition$Vertical0.copy(alignment$Vertical0, v);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof Vertical)) {
                return false;
            }
            return Intrinsics.areEqual(this.a, ((Vertical)object0).a) ? this.b == ((Vertical)object0).b : false;
        }

        @Override
        public int hashCode() {
            return this.b + this.a.hashCode() * 0x1F;
        }

        @Override  // androidx.compose.material3.internal.MenuPosition$Vertical
        public int position-JVtK1S4(@NotNull IntRect intRect0, long v, int v1) {
            return v1 < IntSize.getHeight-impl(v) - this.b * 2 ? c.coerceIn(this.a.align(v1, IntSize.getHeight-impl(v)), this.b, IntSize.getHeight-impl(v) - this.b - v1) : Alignment.Companion.getCenterVertically().align(v1, IntSize.getHeight-impl(v));
        }

        @Override
        @NotNull
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder("Vertical(alignment=");
            stringBuilder0.append(this.a);
            stringBuilder0.append(", margin=");
            return b.p(stringBuilder0, this.b, ')');
        }
    }

    public static final int $stable;
    @NotNull
    public static final WindowAlignmentMarginPosition INSTANCE;

    static {
        WindowAlignmentMarginPosition.INSTANCE = new WindowAlignmentMarginPosition();  // 初始化器: Ljava/lang/Object;-><init>()V
    }
}

