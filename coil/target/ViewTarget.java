package coil.target;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.MainThread;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003R\u0012\u0010\u0004\u001A\u00028\u0000X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lcoil/target/ViewTarget;", "T", "Landroid/view/View;", "Lcoil/target/Target;", "view", "getView", "()Landroid/view/View;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface ViewTarget extends Target {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public static final class DefaultImpls {
        @MainThread
        @Deprecated
        public static void onError(@NotNull ViewTarget viewTarget0, @Nullable Drawable drawable0) {
            viewTarget0.super.onError(drawable0);
        }

        @MainThread
        @Deprecated
        public static void onStart(@NotNull ViewTarget viewTarget0, @Nullable Drawable drawable0) {
            viewTarget0.super.onStart(drawable0);
        }

        @MainThread
        @Deprecated
        public static void onSuccess(@NotNull ViewTarget viewTarget0, @NotNull Drawable drawable0) {
            viewTarget0.super.onSuccess(drawable0);
        }
    }

    @NotNull
    View getView();
}

