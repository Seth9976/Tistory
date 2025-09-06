package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@Immutable
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000E\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\'B!\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001A\u00020\u00002\b\u0010\t\u001A\u0004\u0018\u00010\u0000¢\u0006\u0004\b\n\u0010\u000BJ\u0013\u0010\u000F\u001A\u00020\fø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000EJ\u0010\u0010\u0010\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0013\u001A\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J.\u0010\u0015\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001A\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001B\u001A\u00020\u001AHÖ\u0001¢\u0006\u0004\b\u001B\u0010\u001CJ\u001A\u0010\u001D\u001A\u00020\u00052\b\u0010\t\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001D\u0010\u001ER\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001F\u0010 \u001A\u0004\b!\u0010\u0011R\u0017\u0010\u0004\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010 \u001A\u0004\b#\u0010\u0011R\u0017\u0010\u0006\u001A\u00020\u00058\u0006¢\u0006\f\n\u0004\b$\u0010%\u001A\u0004\b&\u0010\u0014\u0082\u0002\u000B\n\u0002\b!\n\u0005\b¡\u001E0\u0001¨\u0006("}, d2 = {"Landroidx/compose/foundation/text/selection/Selection;", "", "Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;", "start", "end", "", "handlesCrossed", "<init>", "(Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;Z)V", "other", "merge", "(Landroidx/compose/foundation/text/selection/Selection;)Landroidx/compose/foundation/text/selection/Selection;", "Landroidx/compose/ui/text/TextRange;", "toTextRange-d9O1mEE", "()J", "toTextRange", "component1", "()Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;", "component2", "component3", "()Z", "copy", "(Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;Z)Landroidx/compose/foundation/text/selection/Selection;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "equals", "(Ljava/lang/Object;)Z", "a", "Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;", "getStart", "b", "getEnd", "c", "Z", "getHandlesCrossed", "AnchorInfo", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class Selection {
    @Immutable
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000B\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u0001B\u001F\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000BJ\u0010\u0010\f\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000E\u001A\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000E\u0010\u000FJ.\u0010\u0010\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001A\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001A\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\rJ\u001A\u0010\u0018\u001A\u00020\u00172\b\u0010\u0016\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001A\u0010\u001B\u001A\u0004\b\u001C\u0010\u000BR\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001D\u0010\u001E\u001A\u0004\b\u001F\u0010\rR\u0017\u0010\u0007\u001A\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001A\u0004\b\"\u0010\u000F¨\u0006#"}, d2 = {"Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;", "", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "direction", "", "offset", "", "selectableId", "<init>", "(Landroidx/compose/ui/text/style/ResolvedTextDirection;IJ)V", "component1", "()Landroidx/compose/ui/text/style/ResolvedTextDirection;", "component2", "()I", "component3", "()J", "copy", "(Landroidx/compose/ui/text/style/ResolvedTextDirection;IJ)Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "getDirection", "b", "I", "getOffset", "c", "J", "getSelectableId", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class AnchorInfo {
        public static final int $stable;
        public final ResolvedTextDirection a;
        public final int b;
        public final long c;

        public AnchorInfo(@NotNull ResolvedTextDirection resolvedTextDirection0, int v, long v1) {
            this.a = resolvedTextDirection0;
            this.b = v;
            this.c = v1;
        }

        @NotNull
        public final ResolvedTextDirection component1() {
            return this.a;
        }

        public final int component2() {
            return this.b;
        }

        public final long component3() {
            return this.c;
        }

        @NotNull
        public final AnchorInfo copy(@NotNull ResolvedTextDirection resolvedTextDirection0, int v, long v1) {
            return new AnchorInfo(resolvedTextDirection0, v, v1);
        }

        public static AnchorInfo copy$default(AnchorInfo selection$AnchorInfo0, ResolvedTextDirection resolvedTextDirection0, int v, long v1, int v2, Object object0) {
            if((v2 & 1) != 0) {
                resolvedTextDirection0 = selection$AnchorInfo0.a;
            }
            if((v2 & 2) != 0) {
                v = selection$AnchorInfo0.b;
            }
            if((v2 & 4) != 0) {
                v1 = selection$AnchorInfo0.c;
            }
            return selection$AnchorInfo0.copy(resolvedTextDirection0, v, v1);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof AnchorInfo)) {
                return false;
            }
            if(this.a != ((AnchorInfo)object0).a) {
                return false;
            }
            return this.b == ((AnchorInfo)object0).b ? this.c == ((AnchorInfo)object0).c : false;
        }

        @NotNull
        public final ResolvedTextDirection getDirection() {
            return this.a;
        }

        public final int getOffset() {
            return this.b;
        }

        public final long getSelectableId() {
            return this.c;
        }

        @Override
        public int hashCode() {
            return Long.hashCode(this.c) + a.c(this.b, this.a.hashCode() * 0x1F, 0x1F);
        }

        @Override
        @NotNull
        public String toString() {
            return "AnchorInfo(direction=" + this.a + ", offset=" + this.b + ", selectableId=" + this.c + ')';
        }
    }

    public static final int $stable;
    public final AnchorInfo a;
    public final AnchorInfo b;
    public final boolean c;

    public Selection(@NotNull AnchorInfo selection$AnchorInfo0, @NotNull AnchorInfo selection$AnchorInfo1, boolean z) {
        this.a = selection$AnchorInfo0;
        this.b = selection$AnchorInfo1;
        this.c = z;
    }

    public Selection(AnchorInfo selection$AnchorInfo0, AnchorInfo selection$AnchorInfo1, boolean z, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 4) != 0) {
            z = false;
        }
        this(selection$AnchorInfo0, selection$AnchorInfo1, z);
    }

    @NotNull
    public final AnchorInfo component1() {
        return this.a;
    }

    @NotNull
    public final AnchorInfo component2() {
        return this.b;
    }

    public final boolean component3() {
        return this.c;
    }

    @NotNull
    public final Selection copy(@NotNull AnchorInfo selection$AnchorInfo0, @NotNull AnchorInfo selection$AnchorInfo1, boolean z) {
        return new Selection(selection$AnchorInfo0, selection$AnchorInfo1, z);
    }

    public static Selection copy$default(Selection selection0, AnchorInfo selection$AnchorInfo0, AnchorInfo selection$AnchorInfo1, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            selection$AnchorInfo0 = selection0.a;
        }
        if((v & 2) != 0) {
            selection$AnchorInfo1 = selection0.b;
        }
        if((v & 4) != 0) {
            z = selection0.c;
        }
        return selection0.copy(selection$AnchorInfo0, selection$AnchorInfo1, z);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Selection)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.a, ((Selection)object0).a)) {
            return false;
        }
        return Intrinsics.areEqual(this.b, ((Selection)object0).b) ? this.c == ((Selection)object0).c : false;
    }

    @NotNull
    public final AnchorInfo getEnd() {
        return this.b;
    }

    public final boolean getHandlesCrossed() {
        return this.c;
    }

    @NotNull
    public final AnchorInfo getStart() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return Boolean.hashCode(this.c) + (this.b.hashCode() + this.a.hashCode() * 0x1F) * 0x1F;
    }

    @NotNull
    public final Selection merge(@Nullable Selection selection0) {
        if(selection0 == null) {
            return this;
        }
        boolean z = selection0.c;
        boolean z1 = this.c;
        if(!z1 && !z) {
            return Selection.copy$default(this, null, selection0.b, false, 5, null);
        }
        AnchorInfo selection$AnchorInfo0 = z ? selection0.a : selection0.b;
        return z1 ? new Selection(selection$AnchorInfo0, this.b, true) : new Selection(selection$AnchorInfo0, this.a, true);
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("Selection(start=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", end=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", handlesCrossed=");
        return a.p(stringBuilder0, this.c, ')');
    }

    public final long toTextRange-d9O1mEE() {
        return TextRangeKt.TextRange(this.a.getOffset(), this.b.getOffset());
    }
}

