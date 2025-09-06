package androidx.compose.ui.text.android.selection;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000BJ\u0017\u0010\f\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\u000BJ\u0017\u0010\r\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000BJ\u0017\u0010\u000E\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\bH\u0016¢\u0006\u0004\b\u000E\u0010\u000B¨\u0006\u000F"}, d2 = {"Landroidx/compose/ui/text/android/selection/WordSegmentFinder;", "Landroidx/compose/ui/text/android/selection/SegmentFinder;", "", "text", "Landroidx/compose/ui/text/android/selection/WordIterator;", "wordIterator", "<init>", "(Ljava/lang/CharSequence;Landroidx/compose/ui/text/android/selection/WordIterator;)V", "", "offset", "previousStartBoundary", "(I)I", "previousEndBoundary", "nextStartBoundary", "nextEndBoundary", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class WordSegmentFinder implements SegmentFinder {
    public static final int $stable = 8;
    public final CharSequence a;
    public final WordIterator b;

    public WordSegmentFinder(@NotNull CharSequence charSequence0, @NotNull WordIterator wordIterator0) {
        this.a = charSequence0;
        this.b = wordIterator0;
    }

    @Override  // androidx.compose.ui.text.android.selection.SegmentFinder
    public int nextEndBoundary(int v) {
        do {
            v = this.b.nextBoundary(v);
            if(v == -1) {
                return -1;
            }
        }
        while(Character.isWhitespace(this.a.charAt(v - 1)));
        return v;
    }

    @Override  // androidx.compose.ui.text.android.selection.SegmentFinder
    public int nextStartBoundary(int v) {
        while(true) {
            v = this.b.nextBoundary(v);
            if(v == -1) {
                break;
            }
            CharSequence charSequence0 = this.a;
            if(v == charSequence0.length()) {
                break;
            }
            if(!Character.isWhitespace(charSequence0.charAt(v))) {
                return v;
            }
        }
        return -1;
    }

    @Override  // androidx.compose.ui.text.android.selection.SegmentFinder
    public int previousEndBoundary(int v) {
        while(true) {
            v = this.b.prevBoundary(v);
            if(v == -1 || v == 0) {
                break;
            }
            if(!Character.isWhitespace(this.a.charAt(v - 1))) {
                return v;
            }
        }
        return -1;
    }

    @Override  // androidx.compose.ui.text.android.selection.SegmentFinder
    public int previousStartBoundary(int v) {
        do {
            v = this.b.prevBoundary(v);
            if(v == -1) {
                return -1;
            }
        }
        while(Character.isWhitespace(this.a.charAt(v)));
        return v;
    }
}

