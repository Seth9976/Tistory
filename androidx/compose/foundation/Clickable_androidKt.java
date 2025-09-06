package androidx.compose.foundation;

import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.Key_androidKt;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNode_androidKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u001A\u0013\u0010\u0002\u001A\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u001A\u0010\t\u001A\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001A\u0004\b\u0007\u0010\b\"\u0018\u0010\r\u001A\u00020\u0001*\u00020\n8@X\u0080\u0004¢\u0006\u0006\u001A\u0004\b\u000B\u0010\f\"\u0018\u0010\u000F\u001A\u00020\u0001*\u00020\n8@X\u0080\u0004¢\u0006\u0006\u001A\u0004\b\u000E\u0010\f¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/node/DelegatableNode;", "", "isComposeRootInScrollableContainer", "(Landroidx/compose/ui/node/DelegatableNode;)Z", "", "a", "J", "getTapIndicationDelay", "()J", "TapIndicationDelay", "Landroidx/compose/ui/input/key/KeyEvent;", "isPress-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "isPress", "isClick-ZmokQxo", "isClick", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class Clickable_androidKt {
    public static final long a;

    static {
        Clickable_androidKt.a = 100L;
    }

    public static final long getTapIndicationDelay() [...] // 潜在的解密器

    public static final boolean isClick-ZmokQxo(@NotNull KeyEvent keyEvent0) {
        if(KeyEventType.equals-impl0(KeyEvent_androidKt.getType-ZmokQxo(keyEvent0), 1)) {
            switch(Key_androidKt.getNativeKeyCode-YVgTNJs(KeyEvent_androidKt.getKey-ZmokQxo(keyEvent0))) {
                case 23: 
                case 66: 
                case 0xA0: {
                    return true;
                }
                default: {
                    return false;
                }
            }
        }
        return false;
    }

    public static final boolean isComposeRootInScrollableContainer(@NotNull DelegatableNode delegatableNode0) {
        for(ViewParent viewParent0 = DelegatableNode_androidKt.requireView(delegatableNode0).getParent(); viewParent0 != null && viewParent0 instanceof ViewGroup; viewParent0 = ((ViewGroup)viewParent0).getParent()) {
            if(((ViewGroup)viewParent0).shouldDelayChildPressedState()) {
                return true;
            }
        }
        return false;
    }

    public static final boolean isPress-ZmokQxo(@NotNull KeyEvent keyEvent0) {
        if(KeyEventType.equals-impl0(KeyEvent_androidKt.getType-ZmokQxo(keyEvent0), 2)) {
            switch(Key_androidKt.getNativeKeyCode-YVgTNJs(KeyEvent_androidKt.getKey-ZmokQxo(keyEvent0))) {
                case 23: 
                case 66: 
                case 0xA0: {
                    return true;
                }
                default: {
                    return false;
                }
            }
        }
        return false;
    }
}

