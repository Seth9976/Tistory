package j0;

import androidx.compose.foundation.text.TextFieldScrollerPosition;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.unit.Constraints;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import r0.a;

public final class g2 implements LayoutModifier {
    public final TextFieldScrollerPosition a;
    public final int b;
    public final TransformedText c;
    public final Function0 d;

    public g2(TextFieldScrollerPosition textFieldScrollerPosition0, int v, TransformedText transformedText0, Function0 function00) {
        this.a = textFieldScrollerPosition0;
        this.b = v;
        this.c = transformedText0;
        this.d = function00;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof g2)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.a, ((g2)object0).a)) {
            return false;
        }
        if(this.b != ((g2)object0).b) {
            return false;
        }
        return Intrinsics.areEqual(this.c, ((g2)object0).c) ? Intrinsics.areEqual(this.d, ((g2)object0).d) : false;
    }

    @Override
    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() + a.c(this.b, this.a.hashCode() * 0x1F, 0x1F)) * 0x1F;
    }

    @Override  // androidx.compose.ui.layout.LayoutModifier
    public final MeasureResult measure-3p2s80s(MeasureScope measureScope0, Measurable measurable0, long v) {
        Placeable placeable0 = measurable0.measure-BRTryo0((measurable0.maxIntrinsicWidth(Constraints.getMaxHeight-impl(v)) >= Constraints.getMaxWidth-impl(v) ? Constraints.copy-Zbe2FdA$default(v, 0, 0x7FFFFFFF, 0, 0, 13, null) : v));
        int v1 = Math.min(placeable0.getWidth(), Constraints.getMaxWidth-impl(v));
        return MeasureScope.layout$default(measureScope0, v1, placeable0.getHeight(), null, new f2(measureScope0, this, placeable0, v1), 4, null);
    }

    @Override
    public final String toString() {
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.a + ", cursorOffset=" + this.b + ", transformedText=" + this.c + ", textLayoutResultProvider=" + this.d + ')';
    }
}

