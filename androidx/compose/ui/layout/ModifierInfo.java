package androidx.compose.ui.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000E\n\u0002\b\u000F\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u000F\u0010\n\u001A\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000BR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001A\u0004\b\u000E\u0010\u000FR\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001A\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0006\u001A\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001A\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/layout/ModifierInfo;", "", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "extra", "<init>", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/LayoutCoordinates;Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "a", "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "b", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "c", "Ljava/lang/Object;", "getExtra", "()Ljava/lang/Object;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class ModifierInfo {
    public static final int $stable = 8;
    public final Modifier a;
    public final LayoutCoordinates b;
    public final Object c;

    public ModifierInfo(@NotNull Modifier modifier0, @NotNull LayoutCoordinates layoutCoordinates0, @Nullable Object object0) {
        this.a = modifier0;
        this.b = layoutCoordinates0;
        this.c = object0;
    }

    public ModifierInfo(Modifier modifier0, LayoutCoordinates layoutCoordinates0, Object object0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 4) != 0) {
            object0 = null;
        }
        this(modifier0, layoutCoordinates0, object0);
    }

    @NotNull
    public final LayoutCoordinates getCoordinates() {
        return this.b;
    }

    @Nullable
    public final Object getExtra() {
        return this.c;
    }

    @NotNull
    public final Modifier getModifier() {
        return this.a;
    }

    @Override
    @NotNull
    public String toString() {
        return "ModifierInfo(" + this.a + ", " + this.b + ", " + this.c + ')';
    }
}

