package androidx.compose.material3;

import androidx.compose.ui.text.input.OffsetMapping;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001A\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0006\u001A\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0005¨\u0006\u0007"}, d2 = {"androidx/compose/material3/DateVisualTransformation$dateOffsetTranslator$1", "Landroidx/compose/ui/text/input/OffsetMapping;", "", "offset", "originalToTransformed", "(I)I", "transformedToOriginal", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class DateVisualTransformation.dateOffsetTranslator.1 implements OffsetMapping {
    public final s8 a;

    public DateVisualTransformation.dateOffsetTranslator.1(s8 s80) {
        this.a = s80;
    }

    @Override  // androidx.compose.ui.text.input.OffsetMapping
    public int originalToTransformed(int v) {
        s8 s80 = this.a;
        if(v >= s80.b) {
            if(v < s80.c) {
                return v + 1;
            }
            return v > s80.d ? s80.d + 2 : v + 2;
        }
        return v;
    }

    @Override  // androidx.compose.ui.text.input.OffsetMapping
    public int transformedToOriginal(int v) {
        s8 s80 = this.a;
        if(v > s80.b - 1) {
            if(v <= s80.c - 1) {
                return v - 1;
            }
            return v > s80.d + 1 ? s80.d : v - 2;
        }
        return v;
    }
}

