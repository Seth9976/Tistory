package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.runtime.Recomposer;
import androidx.compose.ui.InternalComposeUiApi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@InternalComposeUiApi
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bç\u0080\u0001\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/platform/WindowRecomposerFactory;", "", "createRecomposer", "Landroidx/compose/runtime/Recomposer;", "windowRootView", "Landroid/view/View;", "Companion", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface WindowRecomposerFactory {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001D\u0010\t\u001A\u00020\u00028\u0006¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001A\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Landroidx/compose/ui/platform/WindowRecomposerFactory$Companion;", "", "Landroidx/compose/ui/platform/WindowRecomposerFactory;", "b", "Landroidx/compose/ui/platform/WindowRecomposerFactory;", "getLifecycleAware", "()Landroidx/compose/ui/platform/WindowRecomposerFactory;", "getLifecycleAware$annotations", "()V", "LifecycleAware", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public static final Companion a;
        public static final z1 b;

        static {
            Companion.a = new Companion();  // 初始化器: Ljava/lang/Object;-><init>()V
            Companion.b = new z1();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        @NotNull
        public final WindowRecomposerFactory getLifecycleAware() {
            return Companion.b;
        }

        public static void getLifecycleAware$annotations() {
        }
    }

    @NotNull
    public static final Companion Companion;

    static {
        WindowRecomposerFactory.Companion = Companion.a;
    }

    @NotNull
    Recomposer createRecomposer(@NotNull View arg1);
}

