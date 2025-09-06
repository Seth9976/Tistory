package androidx.compose.foundation.layout;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Stable
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0012\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001F\u0010\r\u001A\u00020\f2\u0006\u0010\t\u001A\u00020\b2\u0006\u0010\u000B\u001A\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000EJ\u0017\u0010\u000F\u001A\u00020\f2\u0006\u0010\t\u001A\u00020\bH\u0016¢\u0006\u0004\b\u000F\u0010\u0010J\u001F\u0010\u0011\u001A\u00020\f2\u0006\u0010\t\u001A\u00020\b2\u0006\u0010\u000B\u001A\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u000EJ\u0017\u0010\u0012\u001A\u00020\f2\u0006\u0010\t\u001A\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0010J\u001A\u0010\u0016\u001A\u00020\u00152\b\u0010\u0014\u001A\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000F\u0010\u0018\u001A\u00020\fH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000F\u0010\u001A\u001A\u00020\u0004H\u0016¢\u0006\u0004\b\u001A\u0010\u001BR\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001C\u0010\u001D\u001A\u0004\b\u001E\u0010\u001BR+\u0010&\u001A\u00020\u00022\u0006\u0010\u001F\u001A\u00020\u00028@@@X\u0080\u008E\u0002¢\u0006\u0012\n\u0004\b \u0010!\u001A\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006\'"}, d2 = {"Landroidx/compose/foundation/layout/ValueInsets;", "Landroidx/compose/foundation/layout/WindowInsets;", "Landroidx/compose/foundation/layout/InsetsValues;", "insets", "", "name", "<init>", "(Landroidx/compose/foundation/layout/InsetsValues;Ljava/lang/String;)V", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "", "getLeft", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;)I", "getTop", "(Landroidx/compose/ui/unit/Density;)I", "getRight", "getBottom", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getName", "<set-?>", "b", "Landroidx/compose/runtime/MutableState;", "getValue$foundation_layout_release", "()Landroidx/compose/foundation/layout/InsetsValues;", "setValue$foundation_layout_release", "(Landroidx/compose/foundation/layout/InsetsValues;)V", "value", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nWindowInsets.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsets.kt\nandroidx/compose/foundation/layout/ValueInsets\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,748:1\n81#2:749\n107#2,2:750\n*S KotlinDebug\n*F\n+ 1 WindowInsets.kt\nandroidx/compose/foundation/layout/ValueInsets\n*L\n367#1:749\n367#1:750,2\n*E\n"})
public final class ValueInsets implements WindowInsets {
    public static final int $stable;
    public final String a;
    public final MutableState b;

    public ValueInsets(@NotNull InsetsValues insetsValues0, @NotNull String s) {
        this.a = s;
        this.b = SnapshotStateKt.mutableStateOf$default(insetsValues0, null, 2, null);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(object0 == this) {
            return true;
        }
        return object0 instanceof ValueInsets ? Intrinsics.areEqual(this.getValue$foundation_layout_release(), ((ValueInsets)object0).getValue$foundation_layout_release()) : false;
    }

    @Override  // androidx.compose.foundation.layout.WindowInsets
    public int getBottom(@NotNull Density density0) {
        return this.getValue$foundation_layout_release().getBottom();
    }

    @Override  // androidx.compose.foundation.layout.WindowInsets
    public int getLeft(@NotNull Density density0, @NotNull LayoutDirection layoutDirection0) {
        return this.getValue$foundation_layout_release().getLeft();
    }

    @NotNull
    public final String getName() {
        return this.a;
    }

    @Override  // androidx.compose.foundation.layout.WindowInsets
    public int getRight(@NotNull Density density0, @NotNull LayoutDirection layoutDirection0) {
        return this.getValue$foundation_layout_release().getRight();
    }

    @Override  // androidx.compose.foundation.layout.WindowInsets
    public int getTop(@NotNull Density density0) {
        return this.getValue$foundation_layout_release().getTop();
    }

    @NotNull
    public final InsetsValues getValue$foundation_layout_release() {
        return (InsetsValues)this.b.getValue();
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
    }

    public final void setValue$foundation_layout_release(@NotNull InsetsValues insetsValues0) {
        this.b.setValue(insetsValues0);
    }

    @Override
    @NotNull
    public String toString() {
        return this.a + "(left=" + this.getValue$foundation_layout_release().getLeft() + ", top=" + this.getValue$foundation_layout_release().getTop() + ", right=" + this.getValue$foundation_layout_release().getRight() + ", bottom=" + this.getValue$foundation_layout_release().getBottom() + ')';
    }
}

