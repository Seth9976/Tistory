package m0;

import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.internal.OffsetMappingCalculator;
import kotlin.jvm.internal.Intrinsics;

public final class g1 {
    public final TextFieldCharSequence a;
    public final OffsetMappingCalculator b;

    public g1(TextFieldCharSequence textFieldCharSequence0, OffsetMappingCalculator offsetMappingCalculator0) {
        this.a = textFieldCharSequence0;
        this.b = offsetMappingCalculator0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof g1)) {
            return false;
        }
        return Intrinsics.areEqual(this.a, ((g1)object0).a) ? Intrinsics.areEqual(this.b, ((g1)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 0x1F;
    }

    @Override
    public final String toString() {
        return "TransformedText(text=" + this.a + ", offsetMapping=" + this.b + ')';
    }
}

