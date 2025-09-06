package androidx.compose.ui;

import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext.Element;
import kotlin.coroutines.CoroutineContext.Key;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Stable
@Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\bg\u0018\u0000 \n2\u00020\u0001:\u0001\nR\u0018\u0010\u0002\u001A\u0006\u0012\u0002\b\u00030\u00038VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001A\u00020\u0007X¦\u0004¢\u0006\u0006\u001A\u0004\b\b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000BÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/MotionDurationScale;", "Lkotlin/coroutines/CoroutineContext$Element;", "key", "Lkotlin/coroutines/CoroutineContext$Key;", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", "scaleFactor", "", "getScaleFactor", "()F", "Key", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface MotionDurationScale extends Element {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public static final class DefaultImpls {
        public static Object fold(@NotNull MotionDurationScale motionDurationScale0, Object object0, @NotNull Function2 function20) {
            return kotlin.coroutines.CoroutineContext.Element.DefaultImpls.fold(motionDurationScale0, object0, function20);
        }

        @Nullable
        public static Element get(@NotNull MotionDurationScale motionDurationScale0, @NotNull Key coroutineContext$Key0) {
            return kotlin.coroutines.CoroutineContext.Element.DefaultImpls.get(motionDurationScale0, coroutineContext$Key0);
        }

        @NotNull
        public static CoroutineContext minusKey(@NotNull MotionDurationScale motionDurationScale0, @NotNull Key coroutineContext$Key0) {
            return kotlin.coroutines.CoroutineContext.Element.DefaultImpls.minusKey(motionDurationScale0, coroutineContext$Key0);
        }

        @NotNull
        public static CoroutineContext plus(@NotNull MotionDurationScale motionDurationScale0, @NotNull CoroutineContext coroutineContext0) {
            return kotlin.coroutines.CoroutineContext.Element.DefaultImpls.plus(motionDurationScale0, coroutineContext0);
        }
    }

    @Metadata(d1 = {"\u0000\u000E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/MotionDurationScale$Key;", "Lkotlin/coroutines/CoroutineContext$Key;", "Landroidx/compose/ui/MotionDurationScale;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class androidx.compose.ui.MotionDurationScale.Key implements Key {
        public static final androidx.compose.ui.MotionDurationScale.Key a;

        static {
            androidx.compose.ui.MotionDurationScale.Key.a = new androidx.compose.ui.MotionDurationScale.Key();  // 初始化器: Ljava/lang/Object;-><init>()V
        }
    }

    @NotNull
    public static final androidx.compose.ui.MotionDurationScale.Key Key;

    static {
        MotionDurationScale.Key = androidx.compose.ui.MotionDurationScale.Key.a;
    }

    @Override  // kotlin.coroutines.CoroutineContext$Element
    @NotNull
    default Key getKey() {
        return MotionDurationScale.Key;
    }

    float getScaleFactor();
}

