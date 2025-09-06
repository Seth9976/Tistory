package androidx.compose.ui.text;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001A\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\u001A\u001C\u0010\u0006\u001A\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u0001ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001A\u001D\u0010\n\u001A\u00020\u00012\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\t\u001A\u00020\u0007¢\u0006\u0004\b\n\u0010\u000B\u001A\u0015\u0010\n\u001A\u00020\u00012\u0006\u0010\f\u001A\u00020\u0007¢\u0006\u0004\b\n\u0010\r\u001A$\u0010\u0012\u001A\u00020\u0001*\u00020\u00012\u0006\u0010\u000E\u001A\u00020\u00072\u0006\u0010\u000F\u001A\u00020\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u0013"}, d2 = {"", "Landroidx/compose/ui/text/TextRange;", "range", "", "substring-FDrldGo", "(Ljava/lang/CharSequence;J)Ljava/lang/String;", "substring", "", "start", "end", "TextRange", "(II)J", "index", "(I)J", "minimumValue", "maximumValue", "coerceIn-8ffj60Q", "(JII)J", "coerceIn", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTextRange.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextRange.kt\nandroidx/compose/ui/text/TextRangeKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,129:1\n100#2:130\n*S KotlinDebug\n*F\n+ 1 TextRange.kt\nandroidx/compose/ui/text/TextRangeKt\n*L\n127#1:130\n*E\n"})
public final class TextRangeKt {
    public static final long TextRange(int v) {
        return TextRangeKt.TextRange(v, v);
    }

    public static final long TextRange(int v, int v1) {
        if(v < 0) {
            throw new IllegalArgumentException(("start cannot be negative. [start: " + v + ", end: " + v1 + ']').toString());
        }
        if(v1 < 0) {
            throw new IllegalArgumentException(("end cannot be negative. [start: " + v + ", end: " + v1 + ']').toString());
        }
        return ((long)v1) & 0xFFFFFFFFL | ((long)v) << 0x20;
    }

    public static final long coerceIn-8ffj60Q(long v, int v1, int v2) {
        int v3 = c.coerceIn(TextRange.getStart-impl(v), v1, v2);
        int v4 = c.coerceIn(TextRange.getEnd-impl(v), v1, v2);
        return v3 != TextRange.getStart-impl(v) || v4 != TextRange.getEnd-impl(v) ? TextRangeKt.TextRange(v3, v4) : v;
    }

    @NotNull
    public static final String substring-FDrldGo(@NotNull CharSequence charSequence0, long v) {
        return charSequence0.subSequence(TextRange.getMin-impl(v), TextRange.getMax-impl(v)).toString();
    }
}

