package androidx.compose.foundation.text.modifiers;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class b extends Lambda implements Function1 {
    public final TextStringSimpleNode w;

    public b(TextStringSimpleNode textStringSimpleNode0) {
        this.w = textStringSimpleNode0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        boolean z = ((Boolean)object0).booleanValue();
        TextStringSimpleNode textStringSimpleNode0 = this.w;
        if(textStringSimpleNode0.y == null) {
            return false;
        }
        TextSubstitutionValue textStringSimpleNode$TextSubstitutionValue0 = textStringSimpleNode0.y;
        if(textStringSimpleNode$TextSubstitutionValue0 != null) {
            textStringSimpleNode$TextSubstitutionValue0.setShowingSubstitution(z);
        }
        TextStringSimpleNode.access$invalidateForTranslate(textStringSimpleNode0);
        return true;
    }
}

