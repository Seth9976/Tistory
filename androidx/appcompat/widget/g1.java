package androidx.appcompat.widget;

import android.text.Layout.Alignment;
import android.text.StaticLayout.Builder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.Log;
import android.widget.TextView;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;

public abstract class g1 {
    @DoNotInline
    @NonNull
    public static StaticLayout a(@NonNull CharSequence charSequence0, @NonNull Layout.Alignment layout$Alignment0, int v, int v1, @NonNull TextView textView0, @NonNull TextPaint textPaint0, @NonNull j1 j10) {
        StaticLayout.Builder staticLayout$Builder0 = StaticLayout.Builder.obtain(charSequence0, 0, charSequence0.length(), textPaint0, v);
        StaticLayout.Builder staticLayout$Builder1 = staticLayout$Builder0.setAlignment(layout$Alignment0).setLineSpacing(textView0.getLineSpacingExtra(), textView0.getLineSpacingMultiplier()).setIncludePad(textView0.getIncludeFontPadding()).setBreakStrategy(textView0.getBreakStrategy()).setHyphenationFrequency(textView0.getHyphenationFrequency());
        if(v1 == -1) {
            v1 = 0x7FFFFFFF;
        }
        staticLayout$Builder1.setMaxLines(v1);
        try {
            j10.a(staticLayout$Builder0, textView0);
            return staticLayout$Builder0.build();
        }
        catch(ClassCastException unused_ex) {
            Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
            return staticLayout$Builder0.build();
        }
    }
}

