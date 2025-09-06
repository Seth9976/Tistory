package pa;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import com.kakao.kandinsky.resize.ReSizeScreenKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class t extends Lambda implements Function0 {
    public final int w;
    public final MutableState x;
    public final State y;

    public t(MutableState mutableState0, State state0) {
        this.w = 1;
        this.x = mutableState0;
        this.y = state0;
        super(0);
    }

    public t(State state0, MutableState mutableState0) {
        this.w = 0;
        this.y = state0;
        this.x = mutableState0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if(this.w != 0) {
            return ReSizeScreenKt.access$toIntOrZero(ReSizeScreenKt.access$ResizeScreen$lambda$9$lambda$2(this.x)) < ReSizeScreenKt.access$ResizeScreen$lambda$0(this.y).getMinSize() ? false : true;
        }
        ReSizeScreenKt.access$ResizeScreen$lambda$0(this.y).getOnChangeWidth().invoke(ReSizeScreenKt.access$toIntOrZero(ReSizeScreenKt.access$ResizeScreen$lambda$9$lambda$2(this.x)));
        return Unit.INSTANCE;
    }
}

