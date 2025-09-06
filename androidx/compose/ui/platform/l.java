package androidx.compose.ui.platform;

import android.view.KeyEvent;
import android.view.View;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusInteropUtils_androidKt;
import androidx.compose.ui.focus.FocusOwnerImplKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class l extends Lambda implements Function1 {
    public final AndroidComposeView w;

    public l(AndroidComposeView androidComposeView0) {
        this.w = androidComposeView0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        KeyEvent keyEvent0 = ((androidx.compose.ui.input.key.KeyEvent)object0).unbox-impl();
        AndroidComposeView androidComposeView0 = this.w;
        FocusDirection focusDirection0 = androidComposeView0.getFocusDirection-P8AzH3I(keyEvent0);
        if(focusDirection0 != null && KeyEventType.equals-impl0(KeyEvent_androidKt.getType-ZmokQxo(keyEvent0), 2)) {
            Rect rect0 = androidComposeView0.j();
            Boolean boolean0 = androidComposeView0.getFocusOwner().focusSearch-ULY8qGw(focusDirection0.unbox-impl(), rect0, new k(focusDirection0, 1));
            boolean z = true;
            if((boolean0 == null ? true : boolean0.booleanValue())) {
                return true;
            }
            if(!FocusOwnerImplKt.is1dFocusSearch-3ESFkO8(focusDirection0.unbox-impl())) {
                return false;
            }
            Integer integer0 = FocusInteropUtils_androidKt.toAndroidFocusDirection-3ESFkO8(focusDirection0.unbox-impl());
            if(integer0 == null) {
                throw new IllegalStateException("Invalid focus direction");
            }
            int v = integer0.intValue();
            android.graphics.Rect rect1 = rect0 == null ? null : RectHelper_androidKt.toAndroidRect(rect0);
            if(rect1 == null) {
                throw new IllegalStateException("Invalid rect");
            }
            View view0 = AndroidComposeView.access$findNextNonChildView(androidComposeView0, v);
            if(Intrinsics.areEqual(view0, androidComposeView0)) {
                view0 = null;
            }
            if(view0 != null && FocusInteropUtils_androidKt.requestInteropFocus(view0, v, rect1)) {
                return true;
            }
            if(!androidComposeView0.getFocusOwner().clearFocus-I7lrPNg(false, true, false, focusDirection0.unbox-impl())) {
                return true;
            }
            Boolean boolean1 = androidComposeView0.getFocusOwner().focusSearch-ULY8qGw(focusDirection0.unbox-impl(), null, new k(focusDirection0, 0));
            if(boolean1 != null) {
                z = boolean1.booleanValue();
            }
            return Boolean.valueOf(z);
        }
        return false;
    }
}

