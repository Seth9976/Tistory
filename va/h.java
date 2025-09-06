package va;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.kakao.kandinsky.core.kdphoto.Signature.Image;
import com.kakao.kandinsky.core.kdphoto.Signature.Text;
import com.kakao.kandinsky.core.kdphoto.Signature;
import com.kakao.kandinsky.signature.ui.SavedSignatureBottomSheetKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class h extends Lambda implements Function2 {
    public final Signature w;

    public h(Signature signature0) {
        this.w = signature0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        int v = ((Number)object1).intValue();
        if((v & 11) == 2 && ((Composer)object0).getSkipping()) {
            ((Composer)object0).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x66D41664, v, -1, "com.kakao.kandinsky.signature.ui.SavedSignatureBottomSheet.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SavedSignatureBottomSheet.kt:107)");
        }
        Signature signature0 = this.w;
        if(signature0 instanceof Image) {
            ((Composer)object0).startReplaceGroup(0xC07A5E74);
            SavedSignatureBottomSheetKt.access$ImageType(((Image)signature0), ((Composer)object0), 0);
        }
        else if(signature0 instanceof Text && ((Text)signature0).getWatermark()) {
            ((Composer)object0).startReplaceGroup(0xC07A5EE7);
            SavedSignatureBottomSheetKt.access$WatermarkType(((Text)signature0), ((Composer)object0), 0);
        }
        else if(signature0 instanceof Text) {
            ((Composer)object0).startReplaceGroup(0xC07A5F47);
            SavedSignatureBottomSheetKt.access$TextType(((Text)signature0), ((Composer)object0), 0);
        }
        else {
            ((Composer)object0).startReplaceGroup(0xC07A5F80);
        }
        ((Composer)object0).endReplaceGroup();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

