package androidx.compose.ui.text.android.selection;

import android.text.SegmentFinder;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@RequiresApi(34)
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001J\u0013\u0010\u0006\u001A\u00020\u0003*\u00020\u0002H\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/text/android/selection/Api34SegmentFinder;", "", "Landroidx/compose/ui/text/android/selection/SegmentFinder;", "Landroid/text/SegmentFinder;", "toAndroidSegmentFinder$ui_text_release", "(Landroidx/compose/ui/text/android/selection/SegmentFinder;)Landroid/text/SegmentFinder;", "toAndroidSegmentFinder", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class Api34SegmentFinder {
    public static final int $stable;
    @NotNull
    public static final Api34SegmentFinder INSTANCE;

    static {
        Api34SegmentFinder.INSTANCE = new Api34SegmentFinder();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @DoNotInline
    @NotNull
    public final SegmentFinder toAndroidSegmentFinder$ui_text_release(@NotNull androidx.compose.ui.text.android.selection.SegmentFinder segmentFinder0) {
        return new SegmentFinder() {
            @Override  // android.text.SegmentFinder
            public int nextEndBoundary(int v) {
                return this.a.nextEndBoundary(v);
            }

            @Override  // android.text.SegmentFinder
            public int nextStartBoundary(int v) {
                return this.a.nextStartBoundary(v);
            }

            @Override  // android.text.SegmentFinder
            public int previousEndBoundary(int v) {
                return this.a.previousEndBoundary(v);
            }

            @Override  // android.text.SegmentFinder
            public int previousStartBoundary(int v) {
                return this.a.previousStartBoundary(v);
            }
        };
    }
}

