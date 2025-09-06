package va;

import androidx.compose.runtime.Composer;
import com.kakao.kandinsky.core.kdphoto.Signature.Image;
import com.kakao.kandinsky.signature.ui.SavedSignatureBottomSheetKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class e extends Lambda implements Function2 {
    public final Image w;
    public final int x;

    public e(Image signature$Image0, int v) {
        this.w = signature$Image0;
        this.x = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        SavedSignatureBottomSheetKt.access$ImageType(this.w, ((Composer)object0), (this.x | 1) & -920350135 | ((0x24924924 & (this.x | 1)) >> 1 | 306783378 & (this.x | 1)) | (306783378 & (this.x | 1)) << 1 & (0x24924924 & (this.x | 1)));
        return Unit.INSTANCE;
    }
}

