package androidx.core.text;

import android.text.Spannable;
import android.text.SpannableString;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\u001A\r\u0010\u0000\u001A\u00020\u0001*\u00020\u0002H\u0086\b\u001A%\u0010\u0003\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u00052\u0006\u0010\u0007\u001A\u00020\bH\u0086\n\u001A\u001D\u0010\u0003\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\t\u001A\u00020\n2\u0006\u0010\u0007\u001A\u00020\bH\u0086\n\u001A\r\u0010\u000B\u001A\u00020\u0002*\u00020\fH\u0086\b¨\u0006\r"}, d2 = {"clearSpans", "", "Landroid/text/Spannable;", "set", "start", "", "end", "span", "", "range", "Lkotlin/ranges/IntRange;", "toSpannable", "", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSpannableString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpannableString.kt\nandroidx/core/text/SpannableStringKt\n+ 2 SpannedString.kt\nandroidx/core/text/SpannedStringKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,66:1\n31#2,4:67\n13579#3,2:71\n*S KotlinDebug\n*F\n+ 1 SpannableString.kt\nandroidx/core/text/SpannableStringKt\n*L\n32#1:67,4\n32#1:71,2\n*E\n"})
public final class SpannableStringKt {
    public static final void clearSpans(@NotNull Spannable spannable0) {
        Object[] arr_object = spannable0.getSpans(0, spannable0.length(), Object.class);
        for(int v = 0; v < arr_object.length; ++v) {
            spannable0.removeSpan(arr_object[v]);
        }
    }

    public static final void set(@NotNull Spannable spannable0, int v, int v1, @NotNull Object object0) {
        spannable0.setSpan(object0, v, v1, 17);
    }

    public static final void set(@NotNull Spannable spannable0, @NotNull IntRange intRange0, @NotNull Object object0) {
        spannable0.setSpan(object0, ((int)intRange0.getStart()), ((int)intRange0.getEndInclusive()), 17);
    }

    @NotNull
    public static final Spannable toSpannable(@NotNull CharSequence charSequence0) {
        return SpannableString.valueOf(charSequence0);
    }
}

