package a;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.geometry.Rect;
import com.kakao.kandinsky.KandinskyActivity;
import com.kakao.kandinsky.border.BorderDecorationKt;
import com.kakao.kandinsky.core.kdphoto.Border;
import com.kakao.kandinsky.core.kdphoto.Decoration.Relative;
import com.kakao.kandinsky.core.kdphoto.Signature;
import com.kakao.kandinsky.decoration.DecorationStatus;
import com.kakao.kandinsky.signature.SignatureVieModel;
import com.kakao.kandinsky.signature.ui.SignatureDecorationKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class q extends Lambda implements Function5 {
    public final KandinskyActivity a;

    public q(KandinskyActivity kandinskyActivity0) {
        this.a = kandinskyActivity0;
        super(5);
    }

    @Override  // kotlin.jvm.functions.Function5
    public final Object invoke(Object object0, Object object1, Object object2, Object object3, Object object4) {
        int v = ((Number)object4).intValue();
        Intrinsics.checkNotNullParameter(((DecorationStatus)object0), "status");
        Intrinsics.checkNotNullParameter(((Relative)object1), "decoration");
        Intrinsics.checkNotNullParameter(((Rect)object2), "displayRect");
        int v1 = (v & 14) == 0 ? (((Composer)object3).changed(((DecorationStatus)object0)) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (((Composer)object3).changed(((Relative)object1)) ? 0x20 : 16);
        }
        if((v & 0x380) == 0) {
            v1 |= (((Composer)object3).changed(((Rect)object2)) ? 0x100 : 0x80);
        }
        if((v1 & 5851) == 1170 && ((Composer)object3).getSkipping()) {
            ((Composer)object3).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x35F23C0C, v1, -1, "com.kakao.kandinsky.KandinskyActivity.ImagePreview.<anonymous> (KandinskyActivity.kt:373)");
        }
        if(((Relative)object1) instanceof Border) {
            ((Composer)object3).startReplaceGroup(-1976474400);
            BorderDecorationKt.BorderDecoration(((Border)(((Relative)object1))), ((Rect)object2), ((DecorationStatus)object0) != DecorationStatus.Disabled, ((Composer)object3), v1 >> 3 & 0x70);
        }
        else if(((Relative)object1) instanceof Signature) {
            ((Composer)object3).startReplaceGroup(0x8A3165D3);
            SignatureVieModel signatureVieModel0 = this.a.f;
            if(signatureVieModel0 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("signatureViewModel");
                signatureVieModel0 = null;
            }
            SignatureDecorationKt.SignatureDecoration(((DecorationStatus)object0), ((Rect)object2), ((Signature)(((Relative)object1))), signatureVieModel0.getController(), ((Composer)object3), v1 & 14 | v1 >> 3 & 0x70);
        }
        else {
            ((Composer)object3).startReplaceGroup(0x8A3166F4);
        }
        ((Composer)object3).endReplaceGroup();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

