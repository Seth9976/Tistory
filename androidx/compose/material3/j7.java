package androidx.compose.material3;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.icons.Icons.Filled;
import androidx.compose.material.icons.filled.ArrowDropDownKt;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.RotateKt;
import androidx.compose.ui.graphics.vector.ImageVector;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class j7 extends Lambda implements Function3 {
    public final Function2 w;
    public final boolean x;

    public j7(boolean z, Function2 function20) {
        this.w = function20;
        this.x = z;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        String s;
        RowScope rowScope0 = (RowScope)object0;
        int v = ((Number)object2).intValue();
        if((v & 17) == 16 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x71309FB5, v, -1, "androidx.compose.material3.YearPickerMenuButton.<anonymous> (DatePicker.kt:2196)");
        }
        this.w.invoke(((Composer)object1), 0);
        Companion modifier$Companion0 = Modifier.Companion;
        SpacerKt.Spacer(SizeKt.size-3ABfNKs(modifier$Companion0, 0.0f), ((Composer)object1), 6);
        ImageVector imageVector0 = ArrowDropDownKt.getArrowDropDown(Filled.INSTANCE);
        boolean z = this.x;
        if(z) {
            ((Composer)object1).startReplaceGroup(-1360891317);
            s = Strings_androidKt.getString-2EP1pXo(string.m3c_date_picker_switch_to_day_selection, ((Composer)object1), 0);
        }
        else {
            ((Composer)object1).startReplaceGroup(-1360797046);
            s = Strings_androidKt.getString-2EP1pXo(string.m3c_date_picker_switch_to_year_selection, ((Composer)object1), 0);
        }
        ((Composer)object1).endReplaceGroup();
        IconKt.Icon-ww6aTOc(imageVector0, s, RotateKt.rotate(modifier$Companion0, (z ? 180.0f : 0.0f)), 0L, ((Composer)object1), 0, 8);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

