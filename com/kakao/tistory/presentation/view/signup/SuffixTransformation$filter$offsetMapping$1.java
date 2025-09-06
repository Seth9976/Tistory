package com.kakao.tistory.presentation.view.signup;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.input.OffsetMapping;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001A\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0006\u001A\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0005¨\u0006\u0007"}, d2 = {"com/kakao/tistory/presentation/view/signup/SuffixTransformation$filter$offsetMapping$1", "Landroidx/compose/ui/text/input/OffsetMapping;", "", "offset", "originalToTransformed", "(I)I", "transformedToOriginal", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class SuffixTransformation.filter.offsetMapping.1 implements OffsetMapping {
    public final AnnotatedString a;

    public SuffixTransformation.filter.offsetMapping.1(AnnotatedString annotatedString0) {
        this.a = annotatedString0;
        super();
    }

    @Override  // androidx.compose.ui.text.input.OffsetMapping
    public int originalToTransformed(int v) {
        return v;
    }

    @Override  // androidx.compose.ui.text.input.OffsetMapping
    public int transformedToOriginal(int v) {
        if(this.a.length() == 0) {
            return 0;
        }
        return v < this.a.length() ? v : this.a.length();
    }
}

