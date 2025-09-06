package androidx.compose.foundation.text;

import java.text.BreakIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000E\n\u0002\u0010\b\n\u0002\b\u0005\u001A\u001B\u0010\u0003\u001A\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001A\u001B\u0010\u0005\u001A\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"", "", "index", "findPrecedingBreak", "(Ljava/lang/String;I)I", "findFollowingBreak", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nStringHelpers.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringHelpers.android.kt\nandroidx/compose/foundation/text/StringHelpers_androidKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,45:1\n1#2:46\n*E\n"})
public final class StringHelpers_androidKt {
    public static final int findFollowingBreak(@NotNull String s, int v) {
        BreakIterator breakIterator0 = BreakIterator.getCharacterInstance();
        breakIterator0.setText(s);
        return breakIterator0.following(v);
    }

    public static final int findPrecedingBreak(@NotNull String s, int v) {
        BreakIterator breakIterator0 = BreakIterator.getCharacterInstance();
        breakIterator0.setText(s);
        return breakIterator0.preceding(v);
    }
}

