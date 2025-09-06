package androidx.compose.ui.text;

import android.os.Build.VERSION;
import android.text.Spannable;
import android.text.SpannableString;
import androidx.compose.ui.text.android.TextLayout;
import androidx.compose.ui.text.android.style.IndentationFixSpan;
import androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak.Strategy;
import androidx.compose.ui.text.style.LineBreak.Strictness;
import androidx.compose.ui.text.style.LineBreak.WordBreak;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.TextUnit;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class AndroidParagraph_androidKt {
    public static final CharSequence access$attachIndentationFixSpan(CharSequence charSequence0) {
        if(charSequence0.length() != 0) {
            charSequence0 = charSequence0 instanceof Spannable ? ((Spannable)charSequence0) : new SpannableString(charSequence0);
            SpannableExtensions_androidKt.setSpan(((Spannable)charSequence0), new IndentationFixSpan(), charSequence0.length() - 1, charSequence0.length() - 1);
        }
        return charSequence0;
    }

    public static final int access$numberOfLinesThatFitMaxHeight(TextLayout textLayout0, int v) {
        int v1 = textLayout0.getLineCount();
        int v2 = 0;
        while(v2 < v1) {
            if(textLayout0.getLineBottom(v2) <= ((float)v)) {
                ++v2;
                continue;
            }
            return v2;
        }
        return textLayout0.getLineCount();
    }

    // 去混淆评级： 中等(160)
    public static final boolean access$shouldAttachIndentationFixSpan(TextStyle textStyle0, boolean z) {
        return z && !TextUnit.equals-impl0(textStyle0.getLetterSpacing-XSAIIZE(), 0x100000000L) && !TextUnit.equals-impl0(textStyle0.getLetterSpacing-XSAIIZE(), 0x7FC00000L) && (!TextAlign.equals-impl0(textStyle0.getTextAlign-e0LSkKk(), 0x80000000) && !TextAlign.equals-impl0(textStyle0.getTextAlign-e0LSkKk(), 5) && !TextAlign.equals-impl0(textStyle0.getTextAlign-e0LSkKk(), 4));
    }

    public static final int access$toLayoutAlign-aXe7zB0(int v) {
        if(TextAlign.equals-impl0(v, 1)) {
            return 3;
        }
        if(TextAlign.equals-impl0(v, 2)) {
            return 4;
        }
        if(TextAlign.equals-impl0(v, 3)) {
            return 2;
        }
        if(TextAlign.equals-impl0(v, 5)) {
            return 0;
        }
        return TextAlign.equals-impl0(v, 6) ? 1 : 0;
    }

    // 去混淆评级： 低(20)
    public static final int access$toLayoutBreakStrategy-xImikfE(int v) {
        if(!Strategy.equals-impl0(v, 1)) {
            if(Strategy.equals-impl0(v, 2)) {
                return 1;
            }
            return Strategy.equals-impl0(v, 3) ? 2 : 0;
        }
        return 0;
    }

    public static final int access$toLayoutHyphenationFrequency--3fSNIE(int v) {
        if(Hyphens.equals-impl0(v, 2)) {
            return Build.VERSION.SDK_INT > 0x20 ? 4 : 2;
        }
        return 0;
    }

    public static final int access$toLayoutLineBreakStyle-hpcqdu8(int v) {
        if(!Strictness.equals-impl0(v, 1)) {
            if(Strictness.equals-impl0(v, 2)) {
                return 1;
            }
            if(Strictness.equals-impl0(v, 3)) {
                return 2;
            }
            return Strictness.equals-impl0(v, 4) ? 3 : 0;
        }
        return 0;
    }

    // 去混淆评级： 中等(60)
    public static final int access$toLayoutLineBreakWordStyle-wPN0Rpw(int v) {
        return WordBreak.equals-impl0(v, 1) || !WordBreak.equals-impl0(v, 2) ? 0 : 1;
    }

    // 去混淆评级： 中等(60)
    public static final int access$toLayoutTextGranularity-duNsdkg(int v) {
        return TextGranularity.equals-impl0(v, 0) || !TextGranularity.equals-impl0(v, 1) ? 0 : 1;
    }
}

