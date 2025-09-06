package androidx.compose.material3;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@Immutable
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\n\u001A\u00020\t2\b\u0010\b\u001A\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000BJ\u000F\u0010\r\u001A\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000EJ\u000F\u0010\u0010\u001A\u00020\u000FH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001D\u0010\u0003\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001A\u0004\b\u0014\u0010\u0015R\u001D\u0010\u0004\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001A\u0004\b\u0017\u0010\u0015R\u001D\u0010\u0005\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001A\u0004\b\u0019\u0010\u0015R\u0017\u0010\u001B\u001A\u00020\u00028Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\u001A\u0010\u0015\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u001C"}, d2 = {"Landroidx/compose/material3/TabPosition;", "", "Landroidx/compose/ui/unit/Dp;", "left", "width", "contentWidth", "<init>", "(FFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "F", "getLeft-D9Ej5fM", "()F", "b", "getWidth-D9Ej5fM", "c", "getContentWidth-D9Ej5fM", "getRight-D9Ej5fM", "right", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabPosition\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,1355:1\n50#2:1356\n*S KotlinDebug\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabPosition\n*L\n1124#1:1356\n*E\n"})
public final class TabPosition {
    public static final int $stable;
    public final float a;
    public final float b;
    public final float c;

    public TabPosition(float f, float f1, float f2, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = f;
        this.b = f1;
        this.c = f2;
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof TabPosition)) {
            return false;
        }
        if(!Dp.equals-impl0(this.a, ((TabPosition)object0).a)) {
            return false;
        }
        return Dp.equals-impl0(this.b, ((TabPosition)object0).b) ? Dp.equals-impl0(this.c, ((TabPosition)object0).c) : false;
    }

    public final float getContentWidth-D9Ej5fM() {
        return this.c;
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
        return Dp.hashCode-impl(this.c) + a.C(this.b, Dp.hashCode-impl(this.a) * 0x1F, 0x1F);
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("TabPosition(left=");
        stringBuilder0.append(Dp.toString-impl(this.a));
        stringBuilder0.append(", right=");
        stringBuilder0.append(Dp.toString-impl(this.getRight-D9Ej5fM()));
        stringBuilder0.append(", width=");
        a.u(this.b, ", contentWidth=", stringBuilder0);
        stringBuilder0.append(Dp.toString-impl(this.c));
        stringBuilder0.append(')');
        return stringBuilder0.toString();
    }
}

