package androidx.compose.ui.text.android;

import android.graphics.RectF;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.m0;
import androidx.compose.ui.text.android.selection.Api34SegmentFinder;
import androidx.compose.ui.text.android.selection.WordSegmentFinder;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@RequiresApi(34)
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001JC\u0010\u000E\u001A\u0004\u0018\u00010\u000B2\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00062\u0018\u0010\n\u001A\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\bH\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u000F"}, d2 = {"Landroidx/compose/ui/text/android/AndroidLayoutApi34;", "", "Landroidx/compose/ui/text/android/TextLayout;", "layout", "Landroid/graphics/RectF;", "rectF", "", "granularity", "Lkotlin/Function2;", "", "inclusionStrategy", "", "getRangeForRect$ui_text_release", "(Landroidx/compose/ui/text/android/TextLayout;Landroid/graphics/RectF;ILkotlin/jvm/functions/Function2;)[I", "getRangeForRect", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class AndroidLayoutApi34 {
    public static final int $stable;
    @NotNull
    public static final AndroidLayoutApi34 INSTANCE;

    static {
        AndroidLayoutApi34.INSTANCE = new AndroidLayoutApi34();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @DoNotInline
    @Nullable
    public final int[] getRangeForRect$ui_text_release(@NotNull TextLayout textLayout0, @NotNull RectF rectF0, int v, @NotNull Function2 function20) {
        if(v == 1) {
            WordSegmentFinder wordSegmentFinder0 = new WordSegmentFinder(textLayout0.getText(), textLayout0.getWordIterator());
            return textLayout0.getLayout().getRangeForRect(rectF0, Api34SegmentFinder.INSTANCE.toAndroidSegmentFinder$ui_text_release(wordSegmentFinder0), new a(function20));
        }
        return textLayout0.getLayout().getRangeForRect(rectF0, m0.e(m0.d(textLayout0.getText(), textLayout0.getTextPaint())), new a(function20));
    }
}

