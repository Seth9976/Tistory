package va;

import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpOffset;
import com.kakao.kandinsky.core.kdphoto.Signature.Text;
import com.kakao.kandinsky.core.kdphoto.TextData;
import com.kakao.kandinsky.decoration.TextKt;
import com.kakao.kandinsky.designsystem.util.DpExtensionKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class l extends Lambda implements Function3 {
    public final Text w;

    public l(Text signature$Text0) {
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
            ComposerKt.traceEventStart(0x7F80130F, v, -1, "com.kakao.kandinsky.signature.ui.TextType.<anonymous> (SavedSignatureBottomSheet.kt:218)");
        }
        Density density0 = (Density)((Composer)object1).consume(CompositionLocalsKt.getLocalDensity());
        long v1 = SizeKt.Size(density0.toPx-0680j_4(((BoxWithConstraintsScope)object0).getMaxWidth-D9Ej5fM()), density0.toPx-0680j_4(((BoxWithConstraintsScope)object0).getMaxHeight-D9Ej5fM()));
        TextData textData0 = this.w.getTextData();
        long v2 = Size.div-7Ah8Wj8(v1, 0.5f);
        TextData textData1 = Size.getWidth-impl(textData0.getBoundsSize-NH-jbRc()) > Size.getWidth-impl(v2) ? TextData.copy-A15cKkk$default(textData0, null, 0L, 0.0f, 0L, 0.0f, SizeKt.Size(Size.getWidth-impl(v2) - Size.getWidth-impl(textData0.getPadding-NH-jbRc()) * 2.0f, Size.getHeight-impl(textData0.getContentSize-NH-jbRc()) * 2.0f), 0L, false, false, false, 0, null, 0.0f, 0.0f, 0x3FDF, null) : textData0;
        ((Composer)object1).startReplaceGroup(0x7F99CBFA);
        long v3 = Size.times-7Ah8Wj8(textData1.getBoundsSize-NH-jbRc(), 0.5f);
        long v4 = DpExtensionKt.toDpOffset-9KIMszo(OffsetKt.Offset((Size.getWidth-impl(v1) - Size.getWidth-impl(v3)) / 2.0f, (Size.getHeight-impl(v1) - Size.getHeight-impl(v3)) / 2.0f), ((Composer)object1), 0);
        ((Composer)object1).endReplaceGroup();
        TextKt.Text(textData1, 0.5f, androidx.compose.foundation.layout.OffsetKt.offset-VpY3zN4(Modifier.Companion, DpOffset.getX-D9Ej5fM(v4), DpOffset.getY-D9Ej5fM(v4)), ((Composer)object1), 0x30, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

