package androidx.compose.ui.text.android.selection;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b`\u0018\u0000 \b2\u00020\u0001:\u0001\bJ\u0010\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0003H&J\u0010\u0010\u0005\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0003H&J\u0010\u0010\u0006\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0003H&J\u0010\u0010\u0007\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/text/android/selection/SegmentFinder;", "", "nextEndBoundary", "", "offset", "nextStartBoundary", "previousEndBoundary", "previousStartBoundary", "Companion", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface SegmentFinder {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/text/android/selection/SegmentFinder$Companion;", "", "", "DONE", "I", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public static final int DONE = -1;
        public static final Companion a;

        static {
            Companion.a = new Companion();  // 初始化器: Ljava/lang/Object;-><init>()V
        }
    }

    @NotNull
    public static final Companion Companion = null;
    public static final int DONE = -1;

    static {
        SegmentFinder.Companion = Companion.a;
    }

    int nextEndBoundary(int arg1);

    int nextStartBoundary(int arg1);

    int previousEndBoundary(int arg1);

    int previousStartBoundary(int arg1);
}

