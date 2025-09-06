package p3;

import android.icu.text.DecimalFormatSymbols;
import android.text.PrecomputedText.Params;
import android.text.PrecomputedText;
import android.widget.TextView;
import androidx.annotation.DoNotInline;

public abstract class o {
    @DoNotInline
    public static CharSequence a(PrecomputedText precomputedText0) {
        return precomputedText0;
    }

    @DoNotInline
    public static String[] b(DecimalFormatSymbols decimalFormatSymbols0) {
        return decimalFormatSymbols0.getDigitStrings();
    }

    @DoNotInline
    public static PrecomputedText.Params c(TextView textView0) {
        return textView0.getTextMetricsParams();
    }

    @DoNotInline
    public static void d(TextView textView0, int v) {
        textView0.setFirstBaselineToTopHeight(v);
    }
}

