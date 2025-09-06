package j;

import androidx.compose.material.pullrefresh.PullRefreshState;
import com.kakao.kphotopicker.PickerFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class b extends Lambda implements Function0 {
    public final int w;
    public final boolean x;
    public final Object y;

    public b(Object object0, boolean z, int v) {
        this.w = v;
        this.y = object0;
        this.x = z;
        super(0);
    }

    public b(boolean z, Object object0, int v) {
        this.w = v;
        this.x = z;
        this.y = object0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch(this.w) {
            case 0: {
                ((androidx.activity.compose.BackHandlerKt.BackHandler.backCallback.1.1)this.y).setEnabled(this.x);
                return Unit.INSTANCE;
            }
            case 1: {
                PickerFragment.access$renderSelectState(((PickerFragment)this.y), this.x);
                return Unit.INSTANCE;
            }
            case 2: {
                return this.x || ((PullRefreshState)this.y).getPosition$material_release() > 0.5f;
            }
            default: {
                if(this.x) {
                    ((Function0)this.y).invoke();
                }
                return Unit.INSTANCE;
            }
        }
    }
}

