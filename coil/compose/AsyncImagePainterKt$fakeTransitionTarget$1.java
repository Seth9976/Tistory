package coil.compose;

import android.graphics.drawable.Drawable;
import android.view.View;
import coil.transition.TransitionTarget;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0016\u0010\u0002\u001A\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001A\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"coil/compose/AsyncImagePainterKt$fakeTransitionTarget$1", "Lcoil/transition/TransitionTarget;", "drawable", "Landroid/graphics/drawable/Drawable;", "getDrawable", "()Landroid/graphics/drawable/Drawable;", "view", "", "getView", "()Ljava/lang/Void;", "coil-compose-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class AsyncImagePainterKt.fakeTransitionTarget.1 implements TransitionTarget {
    @Override  // coil.transition.TransitionTarget
    @Nullable
    public Drawable getDrawable() {
        return null;
    }

    @Override  // coil.transition.TransitionTarget
    public View getView() {
        return (View)this.getView();
    }

    @NotNull
    public Void getView() {
        throw new UnsupportedOperationException();
    }
}

