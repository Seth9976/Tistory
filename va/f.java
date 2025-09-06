package va;

import androidx.compose.material3.SheetState;
import com.kakao.kandinsky.signature.ui.SavedSignatureBottomSheetKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;

public final class f extends Lambda implements Function0 {
    public final int w;
    public final CoroutineScope x;
    public final SheetState y;
    public final Function1 z;

    public f(CoroutineScope coroutineScope0, SheetState sheetState0, Function1 function10, int v) {
        this.w = v;
        this.x = coroutineScope0;
        this.y = sheetState0;
        this.z = function10;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if(this.w != 0) {
            SavedSignatureBottomSheetKt.access$SavedSignatureBottomSheet$dismiss(this.x, this.y, this.z, true);
            return Unit.INSTANCE;
        }
        SavedSignatureBottomSheetKt.access$SavedSignatureBottomSheet$dismiss(this.x, this.y, this.z, true);
        return Unit.INSTANCE;
    }
}

