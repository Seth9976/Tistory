package androidx.compose.ui.graphics;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001A\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/ui/graphics/AndroidPathEffect;", "Landroidx/compose/ui/graphics/PathEffect;", "Landroid/graphics/PathEffect;", "nativePathEffect", "<init>", "(Landroid/graphics/PathEffect;)V", "a", "Landroid/graphics/PathEffect;", "getNativePathEffect", "()Landroid/graphics/PathEffect;", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class AndroidPathEffect implements PathEffect {
    public final android.graphics.PathEffect a;

    public AndroidPathEffect(@NotNull android.graphics.PathEffect pathEffect0) {
        this.a = pathEffect0;
    }

    @NotNull
    public final android.graphics.PathEffect getNativePathEffect() {
        return this.a;
    }
}

