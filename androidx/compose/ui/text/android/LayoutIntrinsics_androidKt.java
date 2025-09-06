package androidx.compose.ui.text.android;

import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import androidx.compose.ui.text.android.style.LetterSpacingSpanEm;
import androidx.compose.ui.text.android.style.LetterSpacingSpanPx;
import java.text.BreakIterator;
import java.util.PriorityQueue;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u001A\u001F\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0003\u001A\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "text", "Landroid/text/TextPaint;", "paint", "", "minIntrinsicWidth", "(Ljava/lang/CharSequence;Landroid/text/TextPaint;)F", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLayoutIntrinsics.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutIntrinsics.android.kt\nandroidx/compose/ui/text/android/LayoutIntrinsics_androidKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,169:1\n1855#2,2:170\n*S KotlinDebug\n*F\n+ 1 LayoutIntrinsics.android.kt\nandroidx/compose/ui/text/android/LayoutIntrinsics_androidKt\n*L\n139#1:170,2\n*E\n"})
public final class LayoutIntrinsics_androidKt {
    // 去混淆评级： 低(30)
    public static final boolean access$shouldIncreaseMaxIntrinsic(float f, CharSequence charSequence0, TextPaint textPaint0) {
        return f != 0.0f && (charSequence0 instanceof Spanned && (SpannedExtensions_androidKt.hasSpan(((Spanned)charSequence0), LetterSpacingSpanPx.class) || SpannedExtensions_androidKt.hasSpan(((Spanned)charSequence0), LetterSpacingSpanEm.class)) || textPaint0.getLetterSpacing() != 0.0f);
    }

    public static final float minIntrinsicWidth(@NotNull CharSequence charSequence0, @NotNull TextPaint textPaint0) {
        BreakIterator breakIterator0 = BreakIterator.getLineInstance(textPaint0.getTextLocale());
        int v = 0;
        breakIterator0.setText(new CharSequenceCharacterIterator(charSequence0, 0, charSequence0.length()));
        PriorityQueue priorityQueue0 = new PriorityQueue(10, new j(0));
        for(int v1 = breakIterator0.next(); true; v1 = breakIterator0.next()) {
            int v2 = v;
            v = v1;
            int v3 = v2;
            if(v == -1) {
                break;
            }
            if(priorityQueue0.size() < 10) {
                priorityQueue0.add(new Pair(v3, v));
            }
            else {
                Pair pair0 = (Pair)priorityQueue0.peek();
                if(pair0 != null && ((Number)pair0.getSecond()).intValue() - ((Number)pair0.getFirst()).intValue() < v - v3) {
                    priorityQueue0.poll();
                    priorityQueue0.add(new Pair(v3, v));
                }
            }
        }
        float f = 0.0f;
        for(Object object0: priorityQueue0) {
            f = Math.max(f, Layout.getDesiredWidth(charSequence0, ((Number)((Pair)object0).component1()).intValue(), ((Number)((Pair)object0).component2()).intValue(), textPaint0));
        }
        return f;
    }
}

