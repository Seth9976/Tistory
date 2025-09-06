package androidx.compose.material3.internal;

import a5.b;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/material3/internal/AnchorAlignmentOffsetPosition;", "", "Horizontal", "Vertical", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class AnchorAlignmentOffsetPosition {
    @Immutable
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u001F\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ2\u0010\u0012\u001A\u00020\u00052\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\r\u001A\u00020\u00052\u0006\u0010\u000F\u001A\u00020\u000EH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J.\u0010\u0013\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001A\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001A\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001A\u0010\u001D\u001A\u00020\u001C2\b\u0010\u001B\u001A\u0004\u0018\u00010\u001AHÖ\u0003¢\u0006\u0004\b\u001D\u0010\u001E\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u001F"}, d2 = {"Landroidx/compose/material3/internal/AnchorAlignmentOffsetPosition$Horizontal;", "Landroidx/compose/material3/internal/MenuPosition$Horizontal;", "Landroidx/compose/ui/Alignment$Horizontal;", "menuAlignment", "anchorAlignment", "", "offset", "<init>", "(Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Horizontal;I)V", "Landroidx/compose/ui/unit/IntRect;", "anchorBounds", "Landroidx/compose/ui/unit/IntSize;", "windowSize", "menuWidth", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "position-95KtPRI", "(Landroidx/compose/ui/unit/IntRect;JILandroidx/compose/ui/unit/LayoutDirection;)I", "position", "copy", "(Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Horizontal;I)Landroidx/compose/material3/internal/AnchorAlignmentOffsetPosition$Horizontal;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Horizontal implements androidx.compose.material3.internal.MenuPosition.Horizontal {
        public static final int $stable;
        public final androidx.compose.ui.Alignment.Horizontal a;
        public final androidx.compose.ui.Alignment.Horizontal b;
        public final int c;

        public Horizontal(@NotNull androidx.compose.ui.Alignment.Horizontal alignment$Horizontal0, @NotNull androidx.compose.ui.Alignment.Horizontal alignment$Horizontal1, int v) {
            this.a = alignment$Horizontal0;
            this.b = alignment$Horizontal1;
            this.c = v;
        }

        @NotNull
        public final Horizontal copy(@NotNull androidx.compose.ui.Alignment.Horizontal alignment$Horizontal0, @NotNull androidx.compose.ui.Alignment.Horizontal alignment$Horizontal1, int v) {
            return new Horizontal(alignment$Horizontal0, alignment$Horizontal1, v);
        }

        public static Horizontal copy$default(Horizontal anchorAlignmentOffsetPosition$Horizontal0, androidx.compose.ui.Alignment.Horizontal alignment$Horizontal0, androidx.compose.ui.Alignment.Horizontal alignment$Horizontal1, int v, int v1, Object object0) {
            if((v1 & 1) != 0) {
                alignment$Horizontal0 = anchorAlignmentOffsetPosition$Horizontal0.a;
            }
            if((v1 & 2) != 0) {
                alignment$Horizontal1 = anchorAlignmentOffsetPosition$Horizontal0.b;
            }
            if((v1 & 4) != 0) {
                v = anchorAlignmentOffsetPosition$Horizontal0.c;
            }
            return anchorAlignmentOffsetPosition$Horizontal0.copy(alignment$Horizontal0, alignment$Horizontal1, v);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof Horizontal)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.a, ((Horizontal)object0).a)) {
                return false;
            }
            return Intrinsics.areEqual(this.b, ((Horizontal)object0).b) ? this.c == ((Horizontal)object0).c : false;
        }

        @Override
        public int hashCode() {
            return this.c + (this.b.hashCode() + this.a.hashCode() * 0x1F) * 0x1F;
        }

        @Override  // androidx.compose.material3.internal.MenuPosition$Horizontal
        public int position-95KtPRI(@NotNull IntRect intRect0, long v, int v1, @NotNull LayoutDirection layoutDirection0) {
            return intRect0.getLeft() + this.b.align(0, intRect0.getWidth(), layoutDirection0) - this.a.align(0, v1, layoutDirection0) + (layoutDirection0 == LayoutDirection.Ltr ? this.c : -this.c);
        }

        @Override
        @NotNull
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder("Horizontal(menuAlignment=");
            stringBuilder0.append(this.a);
            stringBuilder0.append(", anchorAlignment=");
            stringBuilder0.append(this.b);
            stringBuilder0.append(", offset=");
            return b.p(stringBuilder0, this.c, ')');
        }
    }

    @Immutable
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u001F\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\u0010\u001A\u00020\u00052\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\r\u001A\u00020\u0005H\u0016ø\u0001\u0000¢\u0006\u0004\b\u000E\u0010\u000FJ.\u0010\u0011\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001A\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001A\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001A\u0010\u001B\u001A\u00020\u001A2\b\u0010\u0019\u001A\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001B\u0010\u001C\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u001D"}, d2 = {"Landroidx/compose/material3/internal/AnchorAlignmentOffsetPosition$Vertical;", "Landroidx/compose/material3/internal/MenuPosition$Vertical;", "Landroidx/compose/ui/Alignment$Vertical;", "menuAlignment", "anchorAlignment", "", "offset", "<init>", "(Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/ui/Alignment$Vertical;I)V", "Landroidx/compose/ui/unit/IntRect;", "anchorBounds", "Landroidx/compose/ui/unit/IntSize;", "windowSize", "menuHeight", "position-JVtK1S4", "(Landroidx/compose/ui/unit/IntRect;JI)I", "position", "copy", "(Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/ui/Alignment$Vertical;I)Landroidx/compose/material3/internal/AnchorAlignmentOffsetPosition$Vertical;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Vertical implements androidx.compose.material3.internal.MenuPosition.Vertical {
        public static final int $stable;
        public final androidx.compose.ui.Alignment.Vertical a;
        public final androidx.compose.ui.Alignment.Vertical b;
        public final int c;

        public Vertical(@NotNull androidx.compose.ui.Alignment.Vertical alignment$Vertical0, @NotNull androidx.compose.ui.Alignment.Vertical alignment$Vertical1, int v) {
            this.a = alignment$Vertical0;
            this.b = alignment$Vertical1;
            this.c = v;
        }

        @NotNull
        public final Vertical copy(@NotNull androidx.compose.ui.Alignment.Vertical alignment$Vertical0, @NotNull androidx.compose.ui.Alignment.Vertical alignment$Vertical1, int v) {
            return new Vertical(alignment$Vertical0, alignment$Vertical1, v);
        }

        public static Vertical copy$default(Vertical anchorAlignmentOffsetPosition$Vertical0, androidx.compose.ui.Alignment.Vertical alignment$Vertical0, androidx.compose.ui.Alignment.Vertical alignment$Vertical1, int v, int v1, Object object0) {
            if((v1 & 1) != 0) {
                alignment$Vertical0 = anchorAlignmentOffsetPosition$Vertical0.a;
            }
            if((v1 & 2) != 0) {
                alignment$Vertical1 = anchorAlignmentOffsetPosition$Vertical0.b;
            }
            if((v1 & 4) != 0) {
                v = anchorAlignmentOffsetPosition$Vertical0.c;
            }
            return anchorAlignmentOffsetPosition$Vertical0.copy(alignment$Vertical0, alignment$Vertical1, v);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof Vertical)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.a, ((Vertical)object0).a)) {
                return false;
            }
            return Intrinsics.areEqual(this.b, ((Vertical)object0).b) ? this.c == ((Vertical)object0).c : false;
        }

        @Override
        public int hashCode() {
            return this.c + (this.b.hashCode() + this.a.hashCode() * 0x1F) * 0x1F;
        }

        @Override  // androidx.compose.material3.internal.MenuPosition$Vertical
        public int position-JVtK1S4(@NotNull IntRect intRect0, long v, int v1) {
            return intRect0.getTop() + this.b.align(0, intRect0.getHeight()) - this.a.align(0, v1) + this.c;
        }

        @Override
        @NotNull
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder("Vertical(menuAlignment=");
            stringBuilder0.append(this.a);
            stringBuilder0.append(", anchorAlignment=");
            stringBuilder0.append(this.b);
            stringBuilder0.append(", offset=");
            return b.p(stringBuilder0, this.c, ')');
        }
    }

    public static final int $stable;
    @NotNull
    public static final AnchorAlignmentOffsetPosition INSTANCE;

    static {
        AnchorAlignmentOffsetPosition.INSTANCE = new AnchorAlignmentOffsetPosition();  // 初始化器: Ljava/lang/Object;-><init>()V
    }
}

