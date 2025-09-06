package va;

import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import com.kakao.kandinsky.core.kdphoto.Signature.Text;
import com.kakao.kandinsky.signature.ui.SignatureDecorationKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class o extends Lambda implements Function3 {
    public final Text w;

    public o(Text signature$Text0) {
        this.w = signature$Text0;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(((BoxWithConstraintsScope)object0), "$this$BoxWithConstraints");
        if((v & 14) == 0) {
            v |= (((Composer)object1).changed(((BoxWithConstraintsScope)object0)) ? 4 : 2);
        }
        if((v & 91) == 18 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-988625304, v, -1, "com.kakao.kandinsky.signature.ui.WatermarkType.<anonymous> (SavedSignatureBottomSheet.kt:247)");
        }
        Density density0 = (Density)((Composer)object1).consume(CompositionLocalsKt.getLocalDensity());
        Rect rect0 = new Rect(0.0f, 0.0f, density0.toPx-0680j_4(((BoxWithConstraintsScope)object0).getMaxWidth-D9Ej5fM()), density0.toPx-0680j_4(((BoxWithConstraintsScope)object0).getMaxHeight-D9Ej5fM()) * 2.0f);
        SignatureDecorationKt.WatermarkSignatureContent(null, this.w, rect0, ((Composer)object1), 0, 1);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

