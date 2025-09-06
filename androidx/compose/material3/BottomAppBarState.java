package androidx.compose.material3;

import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@ExperimentalMaterial3Api
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000E\bg\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010R\u0012\u0010\u0002\u001A\u00020\u0003X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0004\u0010\u0005R\u0018\u0010\u0006\u001A\u00020\u0003X¦\u000E¢\u0006\f\u001A\u0004\b\u0007\u0010\u0005\"\u0004\b\b\u0010\tR\u0018\u0010\n\u001A\u00020\u0003X¦\u000E¢\u0006\f\u001A\u0004\b\u000B\u0010\u0005\"\u0004\b\f\u0010\tR\u0018\u0010\r\u001A\u00020\u0003X¦\u000E¢\u0006\f\u001A\u0004\b\u000E\u0010\u0005\"\u0004\b\u000F\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, d2 = {"Landroidx/compose/material3/BottomAppBarState;", "", "collapsedFraction", "", "getCollapsedFraction", "()F", "contentOffset", "getContentOffset", "setContentOffset", "(F)V", "heightOffset", "getHeightOffset", "setHeightOffset", "heightOffsetLimit", "getHeightOffsetLimit", "setHeightOffsetLimit", "Companion", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface BottomAppBarState {
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001R!\u0010\b\u001A\f\u0012\u0004\u0012\u00020\u0003\u0012\u0002\b\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001A\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Landroidx/compose/material3/BottomAppBarState$Companion;", "", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material3/BottomAppBarState;", "b", "Landroidx/compose/runtime/saveable/Saver;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;", "Saver", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public static final Companion a;
        public static final Saver b;

        static {
            Companion.a = new Companion();  // 初始化器: Ljava/lang/Object;-><init>()V
            Companion.b = ListSaverKt.listSaver(l1.w, m1.w);
        }

        @NotNull
        public final Saver getSaver() {
            return Companion.b;
        }
    }

    @NotNull
    public static final Companion Companion;

    static {
        BottomAppBarState.Companion = Companion.a;
    }

    float getCollapsedFraction();

    float getContentOffset();

    float getHeightOffset();

    float getHeightOffsetLimit();

    void setContentOffset(float arg1);

    void setHeightOffset(float arg1);

    void setHeightOffsetLimit(float arg1);
}

