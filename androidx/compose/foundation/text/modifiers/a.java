package androidx.compose.foundation.text.modifiers;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class a extends Lambda implements Function1 {
    public final TextAnnotatedStringNode w;

    public a(TextAnnotatedStringNode textAnnotatedStringNode0) {
        this.w = textAnnotatedStringNode0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        boolean z = ((Boolean)object0).booleanValue();
        TextAnnotatedStringNode textAnnotatedStringNode0 = this.w;
        if(textAnnotatedStringNode0.getTextSubstitution$foundation_release() == null) {
            return false;
        }
        Function1 function10 = textAnnotatedStringNode0.z;
        if(function10 != null) {
            TextSubstitutionValue textAnnotatedStringNode$TextSubstitutionValue0 = textAnnotatedStringNode0.getTextSubstitution$foundation_release();
            Intrinsics.checkNotNull(textAnnotatedStringNode$TextSubstitutionValue0);
            function10.invoke(textAnnotatedStringNode$TextSubstitutionValue0);
        }
        TextSubstitutionValue textAnnotatedStringNode$TextSubstitutionValue1 = textAnnotatedStringNode0.getTextSubstitution$foundation_release();
        if(textAnnotatedStringNode$TextSubstitutionValue1 != null) {
            textAnnotatedStringNode$TextSubstitutionValue1.setShowingSubstitution(z);
        }
        TextAnnotatedStringNode.access$invalidateForTranslate(textAnnotatedStringNode0);
        return true;
    }
}

