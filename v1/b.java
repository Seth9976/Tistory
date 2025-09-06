package v1;

import android.view.KeyEvent;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.input.key.KeyInputModifierNode;
import kotlin.jvm.functions.Function1;

public final class b extends Node implements KeyInputModifierNode {
    public Function1 n;
    public Function1 o;

    @Override  // androidx.compose.ui.input.key.KeyInputModifierNode
    public final boolean onKeyEvent-ZmokQxo(KeyEvent keyEvent0) {
        return this.n == null ? false : ((Boolean)this.n.invoke(androidx.compose.ui.input.key.KeyEvent.box-impl(keyEvent0))).booleanValue();
    }

    @Override  // androidx.compose.ui.input.key.KeyInputModifierNode
    public final boolean onPreKeyEvent-ZmokQxo(KeyEvent keyEvent0) {
        return this.o == null ? false : ((Boolean)this.o.invoke(androidx.compose.ui.input.key.KeyEvent.box-impl(keyEvent0))).booleanValue();
    }
}

