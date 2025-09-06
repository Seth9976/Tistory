package va;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import com.kakao.kandinsky.core.kdphoto.Signature.Text;
import com.kakao.kandinsky.core.kdphoto.Signature;
import com.kakao.kandinsky.decoration.DecorationStatus;
import com.kakao.kandinsky.designsystem.common.ModifierKt;
import com.kakao.kandinsky.signature.ui.SignatureDecorationKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class r extends Lambda implements Function3 {
    public final DecorationStatus w;
    public final Signature x;
    public final Rect y;

    public r(DecorationStatus decorationStatus0, Signature signature0, Rect rect0) {
        this.w = decorationStatus0;
        this.x = signature0;
        this.y = rect0;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(((BoxScope)object0), "$this$WatermarkContainer");
        if((v & 81) == 16 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(105104830, v, -1, "com.kakao.kandinsky.signature.ui.SignatureDecoration.<anonymous> (SignatureDecoration.kt:31)");
        }
        SignatureDecorationKt.WatermarkSignatureContent(ModifierKt.enabled(Modifier.Companion, this.w != DecorationStatus.Disabled), ((Text)this.x), this.y, ((Composer)object1), 0, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

