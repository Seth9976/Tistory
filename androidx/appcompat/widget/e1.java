package androidx.appcompat.widget;

import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.widget.TextView;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;

public abstract class e1 {
    @DoNotInline
    @NonNull
    public static StaticLayout a(@NonNull CharSequence charSequence0, @NonNull Layout.Alignment layout$Alignment0, int v, @NonNull TextView textView0, @NonNull TextPaint textPaint0) {
        return new StaticLayout(charSequence0, textPaint0, v, layout$Alignment0, textView0.getLineSpacingMultiplier(), textView0.getLineSpacingExtra(), textView0.getIncludeFontPadding());
    }

    @DoNotInline
    public static int b(@NonNull TextView textView0) {
        return textView0.getMaxLines();
    }
}

