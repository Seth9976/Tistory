package androidx.compose.foundation.layout;

import a5.b;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Stable
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000E\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001F\u0010\f\u001A\u00020\u00022\u0006\u0010\t\u001A\u00020\b2\u0006\u0010\u000B\u001A\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000E\u001A\u00020\u00022\u0006\u0010\t\u001A\u00020\bH\u0016¢\u0006\u0004\b\u000E\u0010\u000FJ\u001F\u0010\u0010\u001A\u00020\u00022\u0006\u0010\t\u001A\u00020\b2\u0006\u0010\u000B\u001A\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\rJ\u0017\u0010\u0011\u001A\u00020\u00022\u0006\u0010\t\u001A\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u000FJ\u001F\u0010\u0018\u001A\u00020\u00152\u0006\u0010\u0013\u001A\u00020\u00122\u0006\u0010\u0014\u001A\u00020\u0002H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u001A\u0010\u001C\u001A\u00020\u001B2\b\u0010\u001A\u001A\u0004\u0018\u00010\u0019H\u0096\u0002¢\u0006\u0004\b\u001C\u0010\u001DJ\u000F\u0010\u001E\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u001E\u0010\u001FJ\u000F\u0010 \u001A\u00020\u0004H\u0016¢\u0006\u0004\b \u0010!R\u001A\u0010\u0003\u001A\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001A\u0004\b$\u0010\u001FR+\u0010-\u001A\u00020%2\u0006\u0010&\u001A\u00020%8@@@X\u0080\u008E\u0002¢\u0006\u0012\n\u0004\b\'\u0010(\u001A\u0004\b)\u0010*\"\u0004\b+\u0010,R+\u0010/\u001A\u00020\u001B2\u0006\u0010&\u001A\u00020\u001B8F@BX\u0086\u008E\u0002¢\u0006\u0012\n\u0004\b.\u0010(\u001A\u0004\b/\u00100\"\u0004\b1\u00102¨\u00063"}, d2 = {"Landroidx/compose/foundation/layout/AndroidWindowInsets;", "Landroidx/compose/foundation/layout/WindowInsets;", "", "type", "", "name", "<init>", "(ILjava/lang/String;)V", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "getLeft", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;)I", "getTop", "(Landroidx/compose/ui/unit/Density;)I", "getRight", "getBottom", "Landroidx/core/view/WindowInsetsCompat;", "windowInsetsCompat", "typeMask", "", "update$foundation_layout_release", "(Landroidx/core/view/WindowInsetsCompat;I)V", "update", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "I", "getType$foundation_layout_release", "Landroidx/core/graphics/Insets;", "<set-?>", "c", "Landroidx/compose/runtime/MutableState;", "getInsets$foundation_layout_release", "()Landroidx/core/graphics/Insets;", "setInsets$foundation_layout_release", "(Landroidx/core/graphics/Insets;)V", "insets", "d", "isVisible", "()Z", "setVisible", "(Z)V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nWindowInsets.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsets.android.kt\nandroidx/compose/foundation/layout/AndroidWindowInsets\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,785:1\n81#2:786\n107#2,2:787\n81#2:789\n107#2,2:790\n*S KotlinDebug\n*F\n+ 1 WindowInsets.android.kt\nandroidx/compose/foundation/layout/AndroidWindowInsets\n*L\n59#1:786\n59#1:787,2\n65#1:789\n65#1:790,2\n*E\n"})
public final class AndroidWindowInsets implements WindowInsets {
    public static final int $stable;
    public final int a;
    public final String b;
    public final MutableState c;
    public final MutableState d;

    public AndroidWindowInsets(int v, @NotNull String s) {
        this.a = v;
        this.b = s;
        this.c = SnapshotStateKt.mutableStateOf$default(Insets.NONE, null, 2, null);
        this.d = SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof AndroidWindowInsets ? this.a == ((AndroidWindowInsets)object0).a : false;
    }

    @Override  // androidx.compose.foundation.layout.WindowInsets
    public int getBottom(@NotNull Density density0) {
        return this.getInsets$foundation_layout_release().bottom;
    }

    @NotNull
    public final Insets getInsets$foundation_layout_release() {
        return (Insets)this.c.getValue();
    }

    @Override  // androidx.compose.foundation.layout.WindowInsets
    public int getLeft(@NotNull Density density0, @NotNull LayoutDirection layoutDirection0) {
        return this.getInsets$foundation_layout_release().left;
    }

    @Override  // androidx.compose.foundation.layout.WindowInsets
    public int getRight(@NotNull Density density0, @NotNull LayoutDirection layoutDirection0) {
        return this.getInsets$foundation_layout_release().right;
    }

    @Override  // androidx.compose.foundation.layout.WindowInsets
    public int getTop(@NotNull Density density0) {
        return this.getInsets$foundation_layout_release().top;
    }

    public final int getType$foundation_layout_release() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return this.a;
    }

    public final boolean isVisible() {
        return ((Boolean)this.d.getValue()).booleanValue();
    }

    public final void setInsets$foundation_layout_release(@NotNull Insets insets0) {
        this.c.setValue(insets0);
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(this.b);
        stringBuilder0.append('(');
        stringBuilder0.append(this.getInsets$foundation_layout_release().left);
        stringBuilder0.append(", ");
        stringBuilder0.append(this.getInsets$foundation_layout_release().top);
        stringBuilder0.append(", ");
        stringBuilder0.append(this.getInsets$foundation_layout_release().right);
        stringBuilder0.append(", ");
        return b.p(stringBuilder0, this.getInsets$foundation_layout_release().bottom, ')');
    }

    public final void update$foundation_layout_release(@NotNull WindowInsetsCompat windowInsetsCompat0, int v) {
        int v1 = this.a;
        if(v == 0 || (v & v1) != 0) {
            this.setInsets$foundation_layout_release(windowInsetsCompat0.getInsets(v1));
            Boolean boolean0 = Boolean.valueOf(windowInsetsCompat0.isVisible(v1));
            this.d.setValue(boolean0);
        }
    }
}

