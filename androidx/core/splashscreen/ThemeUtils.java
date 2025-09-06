package androidx.core.splashscreen;

import android.content.res.Resources.Theme;
import android.util.TypedValue;
import android.view.View;
import android.view.WindowInsetsController;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import i3.b;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@RequiresApi(0x1F)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/core/splashscreen/ThemeUtils;", "", "Api31", "core-splashscreen_release"}, k = 1, mv = {1, 6, 0}, xi = 0x30)
public final class ThemeUtils {
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001J-\u0010\n\u001A\u00020\t2\n\u0010\u0004\u001A\u00060\u0002R\u00020\u00032\u0006\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000B¨\u0006\f"}, d2 = {"Landroidx/core/splashscreen/ThemeUtils$Api31;", "", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "theme", "Landroid/view/View;", "decor", "Landroid/util/TypedValue;", "tv", "", "applyThemesSystemBarAppearance", "(Landroid/content/res/Resources$Theme;Landroid/view/View;Landroid/util/TypedValue;)V", "core-splashscreen_release"}, k = 1, mv = {1, 6, 0}, xi = 0x30)
    public static final class Api31 {
        @NotNull
        public static final Api31 INSTANCE;

        static {
            Api31.INSTANCE = new Api31();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        @DoNotInline
        @JvmOverloads
        @JvmStatic
        public static final void applyThemesSystemBarAppearance(@NotNull Resources.Theme resources$Theme0, @NotNull View view0) {
            Intrinsics.checkNotNullParameter(resources$Theme0, "theme");
            Intrinsics.checkNotNullParameter(view0, "decor");
            Api31.applyThemesSystemBarAppearance$default(resources$Theme0, view0, null, 4, null);
        }

        @DoNotInline
        @JvmOverloads
        @JvmStatic
        public static final void applyThemesSystemBarAppearance(@NotNull Resources.Theme resources$Theme0, @NotNull View view0, @NotNull TypedValue typedValue0) {
            Intrinsics.checkNotNullParameter(resources$Theme0, "theme");
            Intrinsics.checkNotNullParameter(view0, "decor");
            Intrinsics.checkNotNullParameter(typedValue0, "tv");
            int v = !resources$Theme0.resolveAttribute(0x10104E0, typedValue0, true) || typedValue0.data == 0 ? 0 : 8;
            if(resources$Theme0.resolveAttribute(0x101056C, typedValue0, true) && typedValue0.data != 0) {
                v |= 16;
            }
            WindowInsetsController windowInsetsController0 = view0.getWindowInsetsController();
            Intrinsics.checkNotNull(windowInsetsController0);
            b.h(windowInsetsController0, v);
        }

        public static void applyThemesSystemBarAppearance$default(Resources.Theme resources$Theme0, View view0, TypedValue typedValue0, int v, Object object0) {
            if((v & 4) != 0) {
                typedValue0 = new TypedValue();
            }
            Api31.applyThemesSystemBarAppearance(resources$Theme0, view0, typedValue0);
        }
    }

    @NotNull
    public static final ThemeUtils INSTANCE;

    static {
        ThemeUtils.INSTANCE = new ThemeUtils();  // 初始化器: Ljava/lang/Object;-><init>()V
    }
}

