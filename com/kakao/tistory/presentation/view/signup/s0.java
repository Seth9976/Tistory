package com.kakao.tistory.presentation.view.signup;

import androidx.compose.ui.text.AnnotatedString.Builder;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import kotlin.jvm.internal.Intrinsics;

public final class s0 implements VisualTransformation {
    public final String a;
    public final SpanStyle b;

    public s0(String s, SpanStyle spanStyle0) {
        Intrinsics.checkNotNullParameter(spanStyle0, "style");
        super();
        this.a = s;
        this.b = spanStyle0;
    }

    @Override  // androidx.compose.ui.text.input.VisualTransformation
    public final TransformedText filter(AnnotatedString annotatedString0) {
        Intrinsics.checkNotNullParameter(annotatedString0, "text");
        if(this.a == null) {
            return new TransformedText(annotatedString0, OffsetMapping.Companion.getIdentity());
        }
        Builder annotatedString$Builder0 = new Builder(0, 1, null);
        annotatedString$Builder0.append(annotatedString0);
        int v = annotatedString$Builder0.pushStyle(this.b);
        try {
            annotatedString$Builder0.append(this.a);
        }
        finally {
            annotatedString$Builder0.pop(v);
        }
        return new TransformedText(annotatedString$Builder0.toAnnotatedString(), new SuffixTransformation.filter.offsetMapping.1(annotatedString0));
    }
}

