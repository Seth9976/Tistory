package coil.transition;

import androidx.annotation.MainThread;
import coil.request.ImageResult;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001:\u0001\u0004J\b\u0010\u0002\u001A\u00020\u0003H\'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lcoil/transition/Transition;", "", "transition", "", "Factory", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface Transition {
    @Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u0000 \b2\u00020\u0001:\u0001\bJ\u0018\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u0007H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lcoil/transition/Transition$Factory;", "", "create", "Lcoil/transition/Transition;", "target", "Lcoil/transition/TransitionTarget;", "result", "Lcoil/request/ImageResult;", "Companion", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public interface Factory {
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001A\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0001¨\u0006\u0005"}, d2 = {"Lcoil/transition/Transition$Factory$Companion;", "", "Lcoil/transition/Transition$Factory;", "NONE", "Lcoil/transition/Transition$Factory;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        public static final class Companion {
            public static final Companion a;

            static {
                Companion.a = new Companion();  // 初始化器: Ljava/lang/Object;-><init>()V
            }
        }

        @NotNull
        public static final Companion Companion;
        @JvmField
        @NotNull
        public static final Factory NONE;

        static {
            Factory.Companion = Companion.a;
            Factory.NONE = new coil.transition.NoneTransition.Factory();
        }

        @NotNull
        Transition create(@NotNull TransitionTarget arg1, @NotNull ImageResult arg2);
    }

    @MainThread
    void transition();
}

