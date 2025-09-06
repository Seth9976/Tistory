package coil.target;

import android.graphics.drawable.Drawable;
import androidx.annotation.MainThread;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001A\u00020\u00032\b\u0010\u0004\u001A\u0004\u0018\u00010\u0005H\u0017J\u0012\u0010\u0006\u001A\u00020\u00032\b\u0010\u0007\u001A\u0004\u0018\u00010\u0005H\u0017J\u0010\u0010\b\u001A\u00020\u00032\u0006\u0010\t\u001A\u00020\u0005H\u0017ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcoil/target/Target;", "", "onError", "", "error", "Landroid/graphics/drawable/Drawable;", "onStart", "placeholder", "onSuccess", "result", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface Target {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public static final class DefaultImpls {
        @MainThread
        @Deprecated
        public static void onError(@NotNull Target target0, @Nullable Drawable drawable0) {
            target0.super.onError(drawable0);
        }

        @MainThread
        @Deprecated
        public static void onStart(@NotNull Target target0, @Nullable Drawable drawable0) {
            target0.super.onStart(drawable0);
        }

        @MainThread
        @Deprecated
        public static void onSuccess(@NotNull Target target0, @NotNull Drawable drawable0) {
            target0.super.onSuccess(drawable0);
        }
    }

    @MainThread
    default void onError(@Nullable Drawable drawable0) {
    }

    @MainThread
    default void onStart(@Nullable Drawable drawable0) {
    }

    @MainThread
    default void onSuccess(@NotNull Drawable drawable0) {
    }
}

