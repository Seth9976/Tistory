package ra;

import androidx.compose.material3.SheetState;
import com.kakao.kandinsky.selector.SelectorBottomSheetKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics.Kotlin;
import kotlinx.coroutines.CoroutineScope;

public final class l extends FunctionReferenceImpl implements Function0 {
    public final CoroutineScope a;
    public final SheetState b;
    public final Function0 c;

    public l(CoroutineScope coroutineScope0, SheetState sheetState0, Function0 function00) {
        this.a = coroutineScope0;
        this.b = sheetState0;
        this.c = function00;
        super(0, Kotlin.class, "dismiss", "SelectorBottomSheet$dismiss(Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/material3/SheetState;Lkotlin/jvm/functions/Function0;)V", 0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        SelectorBottomSheetKt.access$SelectorBottomSheet$dismiss(this.a, this.b, this.c);
        return Unit.INSTANCE;
    }
}

