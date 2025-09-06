package va;

import androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.lazy.grid.GridCells.Fixed;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.material3.SheetState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import com.kakao.kandinsky.signature.ui.SavedSignatureBottomSheetKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;

public final class j extends Lambda implements Function3 {
    public final Function1 A;
    public final List B;
    public final Function1 C;
    public final Function1 D;
    public final int w;
    public final LazyGridState x;
    public final CoroutineScope y;
    public final SheetState z;

    public j(int v, LazyGridState lazyGridState0, CoroutineScope coroutineScope0, SheetState sheetState0, Function1 function10, List list0, Function1 function11, Function1 function12) {
        this.w = v;
        this.x = lazyGridState0;
        this.y = coroutineScope0;
        this.z = sheetState0;
        this.A = function10;
        this.B = list0;
        this.C = function11;
        this.D = function12;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(((ColumnScope)object0), "$this$ModalBottomSheet");
        if((v & 14) == 0) {
            v |= (((Composer)object1).changed(((ColumnScope)object0)) ? 4 : 2);
        }
        if((v & 91) == 18 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x221977B, v, -1, "com.kakao.kandinsky.signature.ui.SavedSignatureBottomSheet.<anonymous>.<anonymous> (SavedSignatureBottomSheet.kt:81)");
        }
        SavedSignatureBottomSheetKt.access$TopBar(new f(this.y, this.z, this.A, 1), ((Composer)object1), 0, 0);
        Modifier modifier0 = ColumnScope.weight$default(((ColumnScope)object0), PaddingKt.padding-qDBjuR0$default(Modifier.Companion, 20.0f, 0.0f, 20.0f, 20.0f, 2, null), 1.0f, false, 2, null);
        HorizontalOrVertical arrangement$HorizontalOrVertical0 = Arrangement.INSTANCE.spacedBy-0680j_4(8.0f);
        HorizontalOrVertical arrangement$HorizontalOrVertical1 = Arrangement.INSTANCE.spacedBy-0680j_4(8.0f);
        Fixed gridCells$Fixed0 = new Fixed(this.w);
        i i0 = new i(this.B, this.C, this.D, this.y, this.z, this.A);
        LazyGridDslKt.LazyVerticalGrid(gridCells$Fixed0, modifier0, this.x, null, false, arrangement$HorizontalOrVertical0, arrangement$HorizontalOrVertical1, null, false, i0, ((Composer)object1), 0x1B0000, 408);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

