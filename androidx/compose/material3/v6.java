package androidx.compose.material3;

import a5.b;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.focus.FocusTransactionsKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import c0.o;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class v6 extends Lambda implements Function1 {
    public final int w;
    public final int x;

    public v6(int v, int v1) {
        this.w = v1;
        this.x = v;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        switch(this.w) {
            case 0: {
                ((Number)object0).intValue();
                return this.x;
            }
            case 1: {
                ((Number)object0).intValue();
                return this.x;
            }
            case 2: {
                SemanticsPropertiesKt.setTraversalIndex(((SemanticsPropertyReceiver)object0), ((float)this.x));
                return Unit.INSTANCE;
            }
            case 3: {
                SemanticsPropertiesKt.setTraversalIndex(((SemanticsPropertyReceiver)object0), 12.0f + ((float)this.x));
                return Unit.INSTANCE;
            }
            case 4: {
                Boolean boolean1 = FocusTransactionsKt.requestFocus-Mxy_nc0(((FocusTargetNode)object0), this.x);
                return boolean1 == null ? false : Boolean.valueOf(boolean1.booleanValue());
            }
            case 5: {
                return (int)(((o)object0).a - this.x);
            }
            case 6: {
                return (int)(((LazyStaggeredGridItemInfo)object0).getIndex() - this.x);
            }
            case 7: {
                ((Number)object0).intValue();
                throw new IndexOutOfBoundsException(b.p(new StringBuilder("Sequence doesn\'t contain element at index "), this.x, '.'));
            }
            case 8: {
                ((Number)object0).intValue();
                throw new IndexOutOfBoundsException(b.p(new StringBuilder("Collection doesn\'t contain element at index "), this.x, '.'));
            }
            default: {
                Boolean boolean0 = FocusTransactionsKt.requestFocus-Mxy_nc0(((FocusTargetNode)object0), this.x);
                return boolean0 == null ? false : Boolean.valueOf(boolean0.booleanValue());
            }
        }
    }
}

