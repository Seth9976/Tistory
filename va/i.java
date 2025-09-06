package va;

import androidx.compose.foundation.lazy.grid.LazyGridScope;
import androidx.compose.material3.SheetState;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.kakao.kandinsky.signature.ui.SavedSignatureBottomSheetKt.SavedSignatureBottomSheet.3.2.invoke..inlined.items.default.1;
import com.kakao.kandinsky.signature.ui.SavedSignatureBottomSheetKt.SavedSignatureBottomSheet.3.2.invoke..inlined.items.default.4;
import com.kakao.kandinsky.signature.ui.SavedSignatureBottomSheetKt.SavedSignatureBottomSheet.3.2.invoke..inlined.items.default.5;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;

public final class i extends Lambda implements Function1 {
    public final SheetState A;
    public final Function1 B;
    public final List w;
    public final Function1 x;
    public final Function1 y;
    public final CoroutineScope z;

    public i(List list0, Function1 function10, Function1 function11, CoroutineScope coroutineScope0, SheetState sheetState0, Function1 function12) {
        this.w = list0;
        this.x = function10;
        this.y = function11;
        this.z = coroutineScope0;
        this.A = sheetState0;
        this.B = function12;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((LazyGridScope)object0), "$this$LazyVerticalGrid");
        SavedSignatureBottomSheetKt.SavedSignatureBottomSheet.3.2.invoke..inlined.items.default.4 savedSignatureBottomSheetKt$SavedSignatureBottomSheet$3$2$invoke$$inlined$items$default$40 = new SavedSignatureBottomSheetKt.SavedSignatureBottomSheet.3.2.invoke..inlined.items.default.4(SavedSignatureBottomSheetKt.SavedSignatureBottomSheet.3.2.invoke..inlined.items.default.1.INSTANCE, this.w);
        ComposableLambda composableLambda0 = ComposableLambdaKt.composableLambdaInstance(0x29B3C0FE, true, new SavedSignatureBottomSheetKt.SavedSignatureBottomSheet.3.2.invoke..inlined.items.default.5(this.w, this.x, this.y, this.z, this.A, this.B));
        ((LazyGridScope)object0).items(this.w.size(), null, null, savedSignatureBottomSheetKt$SavedSignatureBottomSheet$3$2$invoke$$inlined$items$default$40, composableLambda0);
        return Unit.INSTANCE;
    }
}

