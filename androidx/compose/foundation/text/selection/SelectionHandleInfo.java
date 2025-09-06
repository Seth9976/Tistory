package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u000F\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\u0080\b\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\t\u001A\u00020\b¢\u0006\u0004\b\n\u0010\u000BJ\u0010\u0010\f\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u0010\u001A\u00020\u0004HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u0010\u0010\u0011\u001A\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001A\u00020\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J;\u0010\u0017\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\t\u001A\u00020\bHÆ\u0001ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0019\u001A\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001AJ\u0010\u0010\u001C\u001A\u00020\u001BHÖ\u0001¢\u0006\u0004\b\u001C\u0010\u001DJ\u001A\u0010\u001F\u001A\u00020\b2\b\u0010\u001E\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001F\u0010 R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001A\u0004\b#\u0010\rR\u001D\u0010\u0005\u001A\u00020\u00048\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b$\u0010%\u001A\u0004\b&\u0010\u000FR\u0017\u0010\u0007\u001A\u00020\u00068\u0006¢\u0006\f\n\u0004\b\'\u0010(\u001A\u0004\b)\u0010\u0012R\u0017\u0010\t\u001A\u00020\b8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001A\u0004\b,\u0010\u0014\u0082\u0002\u000B\n\u0002\b!\n\u0005\b¡\u001E0\u0001¨\u0006-"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionHandleInfo;", "", "Landroidx/compose/foundation/text/Handle;", "handle", "Landroidx/compose/ui/geometry/Offset;", "position", "Landroidx/compose/foundation/text/selection/SelectionHandleAnchor;", "anchor", "", "visible", "<init>", "(Landroidx/compose/foundation/text/Handle;JLandroidx/compose/foundation/text/selection/SelectionHandleAnchor;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1", "()Landroidx/compose/foundation/text/Handle;", "component2-F1C5BW0", "()J", "component2", "component3", "()Landroidx/compose/foundation/text/selection/SelectionHandleAnchor;", "component4", "()Z", "copy-ubNVwUQ", "(Landroidx/compose/foundation/text/Handle;JLandroidx/compose/foundation/text/selection/SelectionHandleAnchor;Z)Landroidx/compose/foundation/text/selection/SelectionHandleInfo;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Landroidx/compose/foundation/text/Handle;", "getHandle", "b", "J", "getPosition-F1C5BW0", "c", "Landroidx/compose/foundation/text/selection/SelectionHandleAnchor;", "getAnchor", "d", "Z", "getVisible", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class SelectionHandleInfo {
    public static final int $stable;
    public final Handle a;
    public final long b;
    public final SelectionHandleAnchor c;
    public final boolean d;

    public SelectionHandleInfo(Handle handle0, long v, SelectionHandleAnchor selectionHandleAnchor0, boolean z, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = handle0;
        this.b = v;
        this.c = selectionHandleAnchor0;
        this.d = z;
    }

    @NotNull
    public final Handle component1() {
        return this.a;
    }

    public final long component2-F1C5BW0() {
        return this.b;
    }

    @NotNull
    public final SelectionHandleAnchor component3() {
        return this.c;
    }

    public final boolean component4() {
        return this.d;
    }

    @NotNull
    public final SelectionHandleInfo copy-ubNVwUQ(@NotNull Handle handle0, long v, @NotNull SelectionHandleAnchor selectionHandleAnchor0, boolean z) {
        return new SelectionHandleInfo(handle0, v, selectionHandleAnchor0, z, null);
    }

    public static SelectionHandleInfo copy-ubNVwUQ$default(SelectionHandleInfo selectionHandleInfo0, Handle handle0, long v, SelectionHandleAnchor selectionHandleAnchor0, boolean z, int v1, Object object0) {
        if((v1 & 1) != 0) {
            handle0 = selectionHandleInfo0.a;
        }
        if((v1 & 2) != 0) {
            v = selectionHandleInfo0.b;
        }
        if((v1 & 4) != 0) {
            selectionHandleAnchor0 = selectionHandleInfo0.c;
        }
        if((v1 & 8) != 0) {
            z = selectionHandleInfo0.d;
        }
        return selectionHandleInfo0.copy-ubNVwUQ(handle0, v, selectionHandleAnchor0, z);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof SelectionHandleInfo)) {
            return false;
        }
        if(this.a != ((SelectionHandleInfo)object0).a) {
            return false;
        }
        if(!Offset.equals-impl0(this.b, ((SelectionHandleInfo)object0).b)) {
            return false;
        }
        return this.c == ((SelectionHandleInfo)object0).c ? this.d == ((SelectionHandleInfo)object0).d : false;
    }

    @NotNull
    public final SelectionHandleAnchor getAnchor() {
        return this.c;
    }

    @NotNull
    public final Handle getHandle() {
        return this.a;
    }

    public final long getPosition-F1C5BW0() {
        return this.b;
    }

    public final boolean getVisible() {
        return this.d;
    }

    @Override
    public int hashCode() {
        return Boolean.hashCode(this.d) + (this.c.hashCode() + (Offset.hashCode-impl(this.b) + this.a.hashCode() * 0x1F) * 0x1F) * 0x1F;
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("SelectionHandleInfo(handle=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", position=");
        stringBuilder0.append(Offset.toString-impl(this.b));
        stringBuilder0.append(", anchor=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", visible=");
        return a.p(stringBuilder0, this.d, ')');
    }
}

