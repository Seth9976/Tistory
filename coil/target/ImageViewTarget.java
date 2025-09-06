package coil.target;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001A\u0010\t\u001A\u00020\b2\b\u0010\u0007\u001A\u0004\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000F\u0010\f\u001A\u00020\u000BH\u0016¢\u0006\u0004\b\f\u0010\rR\u001A\u0010\u0003\u001A\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000E\u0010\u000F\u001A\u0004\b\u0010\u0010\u0011R(\u0010\u0018\u001A\u0004\u0018\u00010\u00122\b\u0010\u0013\u001A\u0004\u0018\u00010\u00128V@VX\u0096\u000E¢\u0006\f\u001A\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcoil/target/ImageViewTarget;", "Lcoil/target/GenericViewTarget;", "Landroid/widget/ImageView;", "view", "<init>", "(Landroid/widget/ImageView;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "b", "Landroid/widget/ImageView;", "getView", "()Landroid/widget/ImageView;", "Landroid/graphics/drawable/Drawable;", "value", "getDrawable", "()Landroid/graphics/drawable/Drawable;", "setDrawable", "(Landroid/graphics/drawable/Drawable;)V", "drawable", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public class ImageViewTarget extends GenericViewTarget {
    public final ImageView b;

    public ImageViewTarget(@NotNull ImageView imageView0) {
        this.b = imageView0;
    }

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(@Nullable Object object0) {
        return this == object0 ? true : object0 instanceof ImageViewTarget && Intrinsics.areEqual(this.getView(), ((ImageViewTarget)object0).getView());
    }

    @Override  // coil.target.GenericViewTarget
    @Nullable
    public Drawable getDrawable() {
        return this.getView().getDrawable();
    }

    @Override  // coil.target.ViewTarget, coil.transition.TransitionTarget
    public View getView() {
        return this.getView();
    }

    @NotNull
    public ImageView getView() {
        return this.b;
    }

    @Override
    public int hashCode() {
        return this.getView().hashCode();
    }

    @Override  // coil.target.GenericViewTarget
    public void setDrawable(@Nullable Drawable drawable0) {
        this.getView().setImageDrawable(drawable0);
    }
}

