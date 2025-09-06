package u;

import android.view.KeyEvent;
import androidx.compose.foundation.Clickable_androidKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction.Press;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

public final class b1 extends Lambda implements Function1 {
    public final Function0 A;
    public final MutableInteractionSource B;
    public final boolean w;
    public final Map x;
    public final State y;
    public final CoroutineScope z;

    public b1(boolean z, Map map0, State state0, CoroutineScope coroutineScope0, Function0 function00, MutableInteractionSource mutableInteractionSource0) {
        this.w = z;
        this.x = map0;
        this.y = state0;
        this.z = coroutineScope0;
        this.A = function00;
        this.B = mutableInteractionSource0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        KeyEvent keyEvent0 = ((androidx.compose.ui.input.key.KeyEvent)object0).unbox-impl();
        MutableInteractionSource mutableInteractionSource0 = this.B;
        Map map0 = this.x;
        boolean z = this.w;
        if(z && Clickable_androidKt.isPress-ZmokQxo(keyEvent0)) {
            if(!map0.containsKey(Key.box-impl(KeyEvent_androidKt.getKey-ZmokQxo(keyEvent0)))) {
                Press pressInteraction$Press0 = new Press(((Offset)this.y.getValue()).unbox-impl(), null);
                map0.put(Key.box-impl(KeyEvent_androidKt.getKey-ZmokQxo(keyEvent0)), pressInteraction$Press0);
                z0 z00 = new z0(mutableInteractionSource0, pressInteraction$Press0, null);
                BuildersKt.launch$default(this.z, null, null, z00, 3, null);
                return true;
            }
        }
        else if(z && Clickable_androidKt.isClick-ZmokQxo(keyEvent0)) {
            Press pressInteraction$Press1 = (Press)map0.remove(Key.box-impl(KeyEvent_androidKt.getKey-ZmokQxo(keyEvent0)));
            if(pressInteraction$Press1 != null) {
                a1 a10 = new a1(mutableInteractionSource0, pressInteraction$Press1, null);
                BuildersKt.launch$default(this.z, null, null, a10, 3, null);
            }
            this.A.invoke();
            return true;
        }
        return false;
    }
}

