package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@Immutable
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001A\u0010\t\u001A\u00020\b2\b\u0010\u0007\u001A\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000F\u0010\f\u001A\u00020\u000BH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000F\u0010\u000F\u001A\u00020\u000EH\u0016¢\u0006\u0004\b\u000F\u0010\u0010R\u001D\u0010\u0003\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001A\u0004\b\u0013\u0010\u0014R\u001D\u0010\u0004\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001A\u0004\b\u0016\u0010\u0014\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"Landroidx/compose/foundation/text/selection/TextSelectionColors;", "", "Landroidx/compose/ui/graphics/Color;", "handleColor", "backgroundColor", "<init>", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "J", "getHandleColor-0d7_KjU", "()J", "b", "getBackgroundColor-0d7_KjU", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class TextSelectionColors {
    public static final int $stable;
    public final long a;
    public final long b;

    public TextSelectionColors(long v, long v1, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = v;
        this.b = v1;
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof TextSelectionColors)) {
            return false;
        }
        return Color.equals-impl0(this.a, ((TextSelectionColors)object0).a) ? Color.equals-impl0(this.b, ((TextSelectionColors)object0).b) : false;
    }

    public final long getBackgroundColor-0d7_KjU() {
        return this.b;
    }

    public final long getHandleColor-0d7_KjU() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return Color.hashCode-impl(this.b) + Color.hashCode-impl(this.a) * 0x1F;
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("SelectionColors(selectionHandleColor=");
        a.x(this.a, ", selectionBackgroundColor=", stringBuilder0);
        stringBuilder0.append(Color.toString-impl(this.b));
        stringBuilder0.append(')');
        return stringBuilder0.toString();
    }
}

