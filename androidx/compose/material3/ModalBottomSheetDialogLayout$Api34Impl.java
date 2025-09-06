package androidx.compose.material3;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import androidx.annotation.DoNotInline;
import androidx.compose.animation.core.Animatable;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

public abstract class ModalBottomSheetDialogLayout.Api34Impl {
    @DoNotInline
    @JvmStatic
    @NotNull
    public static final OnBackAnimationCallback a(@NotNull Function0 function00, @NotNull Animatable animatable0, @NotNull CoroutineScope coroutineScope0) {
        return new OnBackAnimationCallback() {
            public final CoroutineScope a;
            public final Animatable b;
            public final Function0 c;

            {
                Function0 function00 = function00;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                Animatable animatable0 = animatable0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                CoroutineScope coroutineScope0 = coroutineScope0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                this.a = coroutineScope0;
                this.b = animatable0;
                this.c = function00;
            }

            @Override  // android.window.OnBackAnimationCallback
            public void onBackCancelled() {
                dd dd0 = new dd(this.b, null);
                BuildersKt.launch$default(this.a, null, null, dd0, 3, null);
            }

            @Override  // android.window.OnBackInvokedCallback
            public void onBackInvoked() {
                this.c.invoke();
            }

            @Override  // android.window.OnBackAnimationCallback
            public void onBackProgressed(@NotNull BackEvent backEvent0) {
                ed ed0 = new ed(this.b, backEvent0, null);
                BuildersKt.launch$default(this.a, null, null, ed0, 3, null);
            }

            @Override  // android.window.OnBackAnimationCallback
            public void onBackStarted(@NotNull BackEvent backEvent0) {
                fd fd0 = new fd(this.b, backEvent0, null);
                BuildersKt.launch$default(this.a, null, null, fd0, 3, null);
            }
        };
    }
}

