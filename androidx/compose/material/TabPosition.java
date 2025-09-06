package androidx.compose.material;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u000B\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001A\u0010\t\u001A\u00020\b2\b\u0010\u0007\u001A\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000F\u0010\f\u001A\u00020\u000BH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000F\u0010\u000F\u001A\u00020\u000EH\u0016¢\u0006\u0004\b\u000F\u0010\u0010R\u001D\u0010\u0003\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001A\u0004\b\u0013\u0010\u0014R\u001D\u0010\u0004\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001A\u0004\b\u0016\u0010\u0014R\u0017\u0010\u0018\u001A\u00020\u00028Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\u0017\u0010\u0014\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u0019"}, d2 = {"Landroidx/compose/material/TabPosition;", "", "Landroidx/compose/ui/unit/Dp;", "left", "width", "<init>", "(FFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "F", "getLeft-D9Ej5fM", "()F", "b", "getWidth-D9Ej5fM", "getRight-D9Ej5fM", "right", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabRow.kt\nandroidx/compose/material/TabPosition\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,521:1\n51#2:522\n*S KotlinDebug\n*F\n+ 1 TabRow.kt\nandroidx/compose/material/TabPosition\n*L\n332#1:522\n*E\n"})
public final class TabPosition {
    public static final int $stable;
    public final float a;
    public final float b;

    public TabPosition(float f, float f1, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = f;
        this.b = f1;
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof TabPosition)) {
            return false;
        }
        return Dp.equals-impl0(this.a, ((TabPosition)object0).a) ? Dp.equals-impl0(this.b, ((TabPosition)object0).b) : false;
    }

    public final float getLeft-D9Ej5fM() {
        return this.a;
    }

    public final float getRight-D9Ej5fM() {
        return this.a + this.b;
    }

    public final float getWidth-D9Ej5fM() {
        return this.b;
    }

    @Override
    public int hashCode() {
        return Dp.hashCode-impl(this.b) + Dp.hashCode-impl(this.a) * 0x1F;
    }

    @Override
    @NotNull
    public String toString() {
        return "TabPosition(left=" + Dp.toString-impl(this.a) + ", right=" + Dp.toString-impl(this.getRight-D9Ej5fM()) + ", width=" + Dp.toString-impl(this.b) + ')';
    }
}

