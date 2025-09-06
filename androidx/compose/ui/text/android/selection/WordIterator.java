package androidx.compose.ui.text.android.selection;

import a5.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.android.CharSequenceCharacterIterator;
import java.text.BreakIterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0010\u000B\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B)\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0006\u001A\u00020\u0004\u0012\b\u0010\b\u001A\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001A\u00020\u00042\u0006\u0010\u000B\u001A\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000E\u001A\u00020\u00042\u0006\u0010\u000B\u001A\u00020\u0004¢\u0006\u0004\b\u000E\u0010\rJ\u0015\u0010\u000F\u001A\u00020\u00042\u0006\u0010\u000B\u001A\u00020\u0004¢\u0006\u0004\b\u000F\u0010\rJ\u0015\u0010\u0010\u001A\u00020\u00042\u0006\u0010\u000B\u001A\u00020\u0004¢\u0006\u0004\b\u0010\u0010\rJ\u0015\u0010\u0011\u001A\u00020\u00042\u0006\u0010\u000B\u001A\u00020\u0004¢\u0006\u0004\b\u0011\u0010\rJ\u0015\u0010\u0012\u001A\u00020\u00042\u0006\u0010\u000B\u001A\u00020\u0004¢\u0006\u0004\b\u0012\u0010\rJ\u0015\u0010\u0014\u001A\u00020\u00132\u0006\u0010\u000B\u001A\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001A\u00020\u00132\u0006\u0010\u000B\u001A\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0015¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/text/android/selection/WordIterator;", "", "", "charSequence", "", "start", "end", "Ljava/util/Locale;", "locale", "<init>", "(Ljava/lang/CharSequence;IILjava/util/Locale;)V", "offset", "nextBoundary", "(I)I", "prevBoundary", "getPrevWordBeginningOnTwoWordsBoundary", "getNextWordEndOnTwoWordBoundary", "getPunctuationBeginning", "getPunctuationEnd", "", "isAfterPunctuation", "(I)Z", "isOnPunctuation", "Companion", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class WordIterator {
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0017\u0010\u0007\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/ui/text/android/selection/WordIterator$Companion;", "", "", "cp", "", "isPunctuation$ui_text_release", "(I)Z", "isPunctuation", "WINDOW_WIDTH", "I", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public final boolean isPunctuation$ui_text_release(int v) {
            switch(Character.getType(v)) {
                case 20: 
                case 21: 
                case 22: 
                case 23: 
                case 24: 
                case 29: 
                case 30: {
                    return true;
                }
                default: {
                    return false;
                }
            }
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final CharSequence a;
    public final int b;
    public final int c;
    public final BreakIterator d;

    static {
        WordIterator.Companion = new Companion(null);
        WordIterator.$stable = 8;
    }

    public WordIterator(@NotNull CharSequence charSequence0, int v, int v1, @Nullable Locale locale0) {
        this.a = charSequence0;
        if(v < 0 || v > charSequence0.length()) {
            throw new IllegalArgumentException("input start index is outside the CharSequence");
        }
        if(v1 < 0 || v1 > charSequence0.length()) {
            throw new IllegalArgumentException("input end index is outside the CharSequence");
        }
        BreakIterator breakIterator0 = BreakIterator.getWordInstance(locale0);
        this.d = breakIterator0;
        this.b = Math.max(0, v - 50);
        this.c = Math.min(charSequence0.length(), v1 + 50);
        breakIterator0.setText(new CharSequenceCharacterIterator(charSequence0, v, v1));
    }

    public final void a(int v) {
        int v1 = this.b;
        int v2 = this.c;
        if(v > v2 || v1 > v) {
            throw new IllegalArgumentException(b.p(q.u("Invalid offset: ", v, ". Valid range is [", v1, " , "), v2, ']').toString());
        }
    }

    public final boolean b(int v) {
        return v <= this.c && this.b + 1 <= v && Character.isLetterOrDigit(Character.codePointBefore(this.a, v));
    }

    public final boolean c(int v) {
        return v < this.c && this.b <= v && Character.isLetterOrDigit(Character.codePointAt(this.a, v));
    }

    public final int getNextWordEndOnTwoWordBoundary(int v) {
        this.a(v);
        BreakIterator breakIterator0 = this.d;
        if(this.b(v)) {
            return breakIterator0.isBoundary(v) && !this.c(v) ? v : breakIterator0.following(v);
        }
        return this.c(v) ? breakIterator0.following(v) : -1;
    }

    public final int getPrevWordBeginningOnTwoWordsBoundary(int v) {
        this.a(v);
        BreakIterator breakIterator0 = this.d;
        if(this.c(v)) {
            return breakIterator0.isBoundary(v) && !this.b(v) ? v : breakIterator0.preceding(v);
        }
        return this.b(v) ? breakIterator0.preceding(v) : -1;
    }

    public final int getPunctuationBeginning(int v) {
        this.a(v);
        while(v != -1 && (!this.isOnPunctuation(v) || this.isAfterPunctuation(v))) {
            v = this.prevBoundary(v);
        }
        return v;
    }

    public final int getPunctuationEnd(int v) {
        this.a(v);
        while(v != -1 && (this.isOnPunctuation(v) || !this.isAfterPunctuation(v))) {
            v = this.nextBoundary(v);
        }
        return v;
    }

    public final boolean isAfterPunctuation(int v) {
        return v > this.c || this.b + 1 > v ? false : WordIterator.Companion.isPunctuation$ui_text_release(Character.codePointBefore(this.a, v));
    }

    public final boolean isOnPunctuation(int v) {
        return v >= this.c || this.b > v ? false : WordIterator.Companion.isPunctuation$ui_text_release(Character.codePointAt(this.a, v));
    }

    public final int nextBoundary(int v) {
        this.a(v);
        return this.d.following(v);
    }

    public final int prevBoundary(int v) {
        this.a(v);
        return this.d.preceding(v);
    }
}

