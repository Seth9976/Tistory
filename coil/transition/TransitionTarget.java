package coil.transition;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.MainThread;
import coil.target.Target;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001A\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001A\u00020\u0007X¦\u0004¢\u0006\u0006\u001A\u0004\b\b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcoil/transition/TransitionTarget;", "Lcoil/target/Target;", "drawable", "Landroid/graphics/drawable/Drawable;", "getDrawable", "()Landroid/graphics/drawable/Drawable;", "view", "Landroid/view/View;", "getView", "()Landroid/view/View;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface TransitionTarget extends Target {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public static final class DefaultImpls {
        @MainThread
        @Deprecated
        public static void onError(@NotNull TransitionTarget transitionTarget0, @Nullable Drawable drawable0) {
            transitionTarget0.super.onError(drawable0);
        }

        @MainThread
        @Deprecated
        public static void onStart(@NotNull TransitionTarget transitionTarget0, @Nullable Drawable drawable0) {
            transitionTarget0.super.onStart(drawable0);
        }

        @MainThread
        @Deprecated
        public static void onSuccess(@NotNull TransitionTarget transitionTarget0, @NotNull Drawable drawable0) {
            transitionTarget0.super.onSuccess(drawable0);
        }
    }

    @Nullable
    Drawable getDrawable();

    @NotNull
    View getView();
}

