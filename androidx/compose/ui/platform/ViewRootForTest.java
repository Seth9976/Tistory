package androidx.compose.ui.platform;

import android.view.View;
import androidx.annotation.VisibleForTesting;
import androidx.compose.ui.node.RootForTest;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@VisibleForTesting
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u0000 \r2\u00020\u0001:\u0001\rJ\b\u0010\u000B\u001A\u00020\fH&R\u0012\u0010\u0002\u001A\u00020\u0003X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001A\u00020\u0003X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0006\u0010\u0005R\u0012\u0010\u0007\u001A\u00020\bX¦\u0004¢\u0006\u0006\u001A\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000EÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/platform/ViewRootForTest;", "Landroidx/compose/ui/node/RootForTest;", "hasPendingMeasureOrLayout", "", "getHasPendingMeasureOrLayout", "()Z", "isLifecycleInResumedState", "view", "Landroid/view/View;", "getView", "()Landroid/view/View;", "invalidateDescendants", "", "Companion", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface ViewRootForTest extends RootForTest {
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001R6\u0010\r\u001A\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000E¢\u0006\u0018\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\u000B\u0010\f\u001A\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000E"}, d2 = {"Landroidx/compose/ui/platform/ViewRootForTest$Companion;", "", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/ViewRootForTest;", "", "b", "Lkotlin/jvm/functions/Function1;", "getOnViewCreatedCallback", "()Lkotlin/jvm/functions/Function1;", "setOnViewCreatedCallback", "(Lkotlin/jvm/functions/Function1;)V", "getOnViewCreatedCallback$annotations", "()V", "onViewCreatedCallback", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public static final Companion a;
        public static Function1 b;

        static {
            Companion.a = new Companion();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        @Nullable
        public final Function1 getOnViewCreatedCallback() {
            return Companion.b;
        }

        @VisibleForTesting
        public static void getOnViewCreatedCallback$annotations() {
        }

        public final void setOnViewCreatedCallback(@Nullable Function1 function10) {
            Companion.b = function10;
        }
    }

    @NotNull
    public static final Companion Companion;

    static {
        ViewRootForTest.Companion = Companion.a;
    }

    boolean getHasPendingMeasureOrLayout();

    @NotNull
    View getView();

    void invalidateDescendants();

    boolean isLifecycleInResumedState();
}

