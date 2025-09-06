package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class a0 extends Lambda implements Function1 {
    public final int w;
    public final SelectionManager x;

    public a0(SelectionManager selectionManager0, int v) {
        this.w = v;
        this.x = selectionManager0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        switch(this.w) {
            case 0: {
                DisposableEffectScope disposableEffectScope0 = (DisposableEffectScope)object0;
                return new SelectionContainerKt.SelectionContainer.4.1.invoke..inlined.onDispose.1(this.x);
            }
            case 1: {
                SelectionManager selectionManager0 = this.x;
                if(selectionManager0.a.getSubselections().contains(((Number)object0).longValue())) {
                    selectionManager0.a();
                    selectionManager0.b();
                }
                return Unit.INSTANCE;
            }
            case 2: {
                SelectionManager selectionManager1 = this.x;
                if(selectionManager1.a.getSubselections().contains(((Number)object0).longValue())) {
                    selectionManager1.onRelease();
                    selectionManager1.setSelection(null);
                }
                return Unit.INSTANCE;
            }
            case 3: {
                this.x.setContainerLayoutCoordinates(((LayoutCoordinates)object0));
                return Unit.INSTANCE;
            }
            case 4: {
                boolean z = ((FocusState)object0).isFocused();
                SelectionManager selectionManager2 = this.x;
                if(!z && selectionManager2.getHasFocus()) {
                    selectionManager2.onRelease();
                }
                selectionManager2.setHasFocus(((FocusState)object0).isFocused());
                return Unit.INSTANCE;
            }
            case 5: {
                this.x.setInTouchMode(((Boolean)object0).booleanValue());
                return Unit.INSTANCE;
            }
            case 6: {
                if(SelectionManager_androidKt.isCopyKeyEvent-ZmokQxo(((KeyEvent)object0).unbox-impl())) {
                    this.x.copy$foundation_release();
                    return true;
                }
                return false;
            }
            default: {
                this.x.setSelection(((Selection)object0));
                return Unit.INSTANCE;
            }
        }
    }
}

