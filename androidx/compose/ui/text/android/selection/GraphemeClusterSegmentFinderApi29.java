package androidx.compose.ui.text.android.selection;

import android.text.TextPaint;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.webkit.internal.k;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@RequiresApi(29)
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000BJ\u0017\u0010\f\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\u000B¨\u0006\r"}, d2 = {"Landroidx/compose/ui/text/android/selection/GraphemeClusterSegmentFinderApi29;", "Landroidx/compose/ui/text/android/selection/GraphemeClusterSegmentFinder;", "", "text", "Landroid/text/TextPaint;", "textPaint", "<init>", "(Ljava/lang/CharSequence;Landroid/text/TextPaint;)V", "", "offset", "previous", "(I)I", "next", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class GraphemeClusterSegmentFinderApi29 extends GraphemeClusterSegmentFinder {
    public static final int $stable = 8;
    public final CharSequence a;
    public final TextPaint b;

    public GraphemeClusterSegmentFinderApi29(@NotNull CharSequence charSequence0, @NotNull TextPaint textPaint0) {
        this.a = charSequence0;
        this.b = textPaint0;
    }

    @Override  // androidx.compose.ui.text.android.selection.GraphemeClusterSegmentFinder
    public int next(int v) {
        int v1 = this.a.length();
        return k.z(this.b, this.a, v1, v);
    }

    @Override  // androidx.compose.ui.text.android.selection.GraphemeClusterSegmentFinder
    public int previous(int v) {
        int v1 = this.a.length();
        return k.b(this.b, this.a, v1, v);
    }
}

