package androidx.compose.material3;

import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class aa extends Lambda implements Function1 {
    public final String A;
    public final Function0 B;
    public final SoftwareKeyboardController C;
    public final String w;
    public final boolean x;
    public final String y;
    public final String z;

    public aa(String s, boolean z, String s1, String s2, String s3, Function0 function00, SoftwareKeyboardController softwareKeyboardController0) {
        this.w = s;
        this.x = z;
        this.y = s1;
        this.z = s2;
        this.A = s3;
        this.B = function00;
        this.C = softwareKeyboardController0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        String s = this.w;
        if(MenuAnchorType.equals-impl0(s, "SecondaryEditable")) {
            SemanticsPropertiesKt.setRole-kuIjeqM(((SemanticsPropertyReceiver)object0), 0);
            SemanticsPropertiesKt.setStateDescription(((SemanticsPropertyReceiver)object0), (this.x ? this.y : this.z));
            SemanticsPropertiesKt.setContentDescription(((SemanticsPropertyReceiver)object0), this.A);
        }
        else {
            SemanticsPropertiesKt.setRole-kuIjeqM(((SemanticsPropertyReceiver)object0), 6);
        }
        SemanticsPropertiesKt.onClick$default(((SemanticsPropertyReceiver)object0), null, new z9(this.B, s, this.C), 1, null);
        return Unit.INSTANCE;
    }
}

