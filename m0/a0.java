package m0;

import androidx.compose.foundation.text.input.internal.CodepointTransformation;

public final class a0 implements CodepointTransformation {
    public final char a;

    public a0(char c) {
        this.a = c;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof a0 ? this.a == ((a0)object0).a : false;
    }

    @Override
    public final int hashCode() {
        return Character.hashCode(this.a);
    }

    @Override
    public final String toString() {
        return "MaskCodepointTransformation(character=" + this.a + ')';
    }

    @Override  // androidx.compose.foundation.text.input.internal.CodepointTransformation
    public final int transform(int v, int v1) {
        return this.a;
    }
}

