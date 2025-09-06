package androidx.compose.material3;

import a5.b;
import androidx.compose.material3.internal.DateInputFormat;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import kotlin.ranges.c;
import kotlin.text.StringsKt__StringsKt;

public final class s8 implements VisualTransformation {
    public final DateInputFormat a;
    public final int b;
    public final int c;
    public final int d;
    public final DateVisualTransformation.dateOffsetTranslator.1 e;

    public s8(DateInputFormat dateInputFormat0) {
        this.a = dateInputFormat0;
        this.b = StringsKt__StringsKt.indexOf$default(dateInputFormat0.getPatternWithDelimiters(), dateInputFormat0.getDelimiter(), 0, false, 6, null);
        this.c = StringsKt__StringsKt.lastIndexOf$default(dateInputFormat0.getPatternWithDelimiters(), dateInputFormat0.getDelimiter(), 0, false, 6, null);
        this.d = dateInputFormat0.getPatternWithoutDelimiters().length();
        this.e = new DateVisualTransformation.dateOffsetTranslator.1(this);
    }

    @Override  // androidx.compose.ui.text.input.VisualTransformation
    public final TransformedText filter(AnnotatedString annotatedString0) {
        int v = 0;
        String s = annotatedString0.getText().length() <= this.d ? annotatedString0.getText() : StringsKt__StringsKt.substring(annotatedString0.getText(), c.until(0, this.d));
        String s1 = "";
        for(int v1 = 0; v < s.length(); ++v1) {
            String s2 = s1 + s.charAt(v);
            if(v1 + 1 == this.b || v1 + 2 == this.c) {
                StringBuilder stringBuilder0 = b.t(s2);
                stringBuilder0.append(this.a.getDelimiter());
                s1 = stringBuilder0.toString();
            }
            else {
                s1 = s2;
            }
            ++v;
        }
        return new TransformedText(new AnnotatedString(s1, null, null, 6, null), this.e);
    }
}

