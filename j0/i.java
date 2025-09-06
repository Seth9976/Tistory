package j0;

import androidx.compose.foundation.text.SecureTextFieldController;
import androidx.compose.foundation.text.input.internal.CodepointTransformation;
import androidx.compose.runtime.State;

public final class i implements CodepointTransformation {
    public final int a;
    public final Object b;

    public i(Object object0, int v) {
        this.a = v;
        this.b = object0;
        super();
    }

    @Override  // androidx.compose.foundation.text.input.internal.CodepointTransformation
    public final int transform(int v, int v1) {
        if(this.a != 0) {
            SecureTextFieldController secureTextFieldController0 = (SecureTextFieldController)this.b;
            return v == secureTextFieldController0.b.getRevealCodepointIndex$foundation_release() ? v1 : ((Character)secureTextFieldController0.a.getValue()).charValue();
        }
        return ((Character)((State)this.b).getValue()).charValue();
    }
}

