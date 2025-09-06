package pa;

import android.view.KeyEvent;
import androidx.compose.runtime.State;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import com.kakao.kandinsky.resize.ReSizeScreenKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class s extends Lambda implements Function1 {
    public final State w;

    public s(State state0) {
        this.w = state0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        KeyEvent keyEvent0 = ((androidx.compose.ui.input.key.KeyEvent)object0).unbox-impl();
        Intrinsics.checkNotNullParameter(keyEvent0, "it");
        if(Key.equals-impl0(KeyEvent_androidKt.getKey-ZmokQxo(keyEvent0), 0x400000000L)) {
            ReSizeScreenKt.access$ResizeScreen$lambda$0(this.w).getOnBackPressed().invoke();
            return true;
        }
        return false;
    }
}

