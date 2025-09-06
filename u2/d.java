package u2;

import android.view.MotionEvent;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class d extends Lambda implements Function1 {
    public final int w;
    public final AndroidViewHolder x;

    public d(AndroidViewHolder androidViewHolder0, int v) {
        this.w = v;
        this.x = androidViewHolder0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(this.w != 0) {
            int v = ((MotionEvent)object0).getActionMasked();
            AndroidViewHolder androidViewHolder0 = this.x;
            switch(v) {
                case 0: 
                case 1: 
                case 2: 
                case 3: 
                case 4: 
                case 5: 
                case 6: {
                    return Boolean.valueOf(androidViewHolder0.dispatchTouchEvent(((MotionEvent)object0)));
                }
                default: {
                    return Boolean.valueOf(androidViewHolder0.dispatchGenericMotionEvent(((MotionEvent)object0)));
                }
            }
        }
        AndroidComposeView androidComposeView0 = ((Owner)object0) instanceof AndroidComposeView ? ((AndroidComposeView)(((Owner)object0))) : null;
        AndroidViewHolder androidViewHolder1 = this.x;
        if(androidComposeView0 != null) {
            androidComposeView0.removeAndroidView(androidViewHolder1);
        }
        androidViewHolder1.removeAllViewsInLayout();
        return Unit.INSTANCE;
    }
}

