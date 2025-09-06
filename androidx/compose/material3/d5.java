package androidx.compose.material3;

import androidx.compose.material3.internal.CalendarDate;
import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.material3.internal.DateInputFormat;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.text.input.TextFieldValue;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;

public final class d5 extends Lambda implements Function1 {
    public final DateInputValidator A;
    public final int B;
    public final Locale C;
    public final MutableState D;
    public final DateInputFormat w;
    public final MutableState x;
    public final Function1 y;
    public final CalendarModel z;

    public d5(DateInputFormat dateInputFormat0, MutableState mutableState0, Function1 function10, CalendarModel calendarModel0, DateInputValidator dateInputValidator0, int v, Locale locale0, MutableState mutableState1) {
        this.w = dateInputFormat0;
        this.x = mutableState0;
        this.y = function10;
        this.z = calendarModel0;
        this.A = dateInputValidator0;
        this.B = v;
        this.C = locale0;
        this.D = mutableState1;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        DateInputFormat dateInputFormat0 = this.w;
        if(((TextFieldValue)object0).getText().length() <= dateInputFormat0.getPatternWithoutDelimiters().length()) {
            String s = ((TextFieldValue)object0).getText();
            for(int v = 0; true; ++v) {
                if(v >= s.length()) {
                    DateInputKt.access$DateInputTextField_tQNruF0$lambda$5(this.D, ((TextFieldValue)object0));
                    String s1 = StringsKt__StringsKt.trim(((TextFieldValue)object0).getText()).toString();
                    Function1 function10 = this.y;
                    Long long0 = null;
                    MutableState mutableState0 = this.x;
                    if(s1.length() == 0 || s1.length() < dateInputFormat0.getPatternWithoutDelimiters().length()) {
                        mutableState0.setValue("");
                        function10.invoke(null);
                        return Unit.INSTANCE;
                    }
                    CalendarDate calendarDate0 = this.z.parse(s1, dateInputFormat0.getPatternWithoutDelimiters());
                    mutableState0.setValue(this.A.validate-XivgLIo(calendarDate0, this.B, this.C));
                    if(((CharSequence)mutableState0.getValue()).length() == 0 && calendarDate0 != null) {
                        long0 = calendarDate0.getUtcTimeMillis();
                    }
                    function10.invoke(long0);
                    break;
                }
                if(!Character.isDigit(s.charAt(v))) {
                    break;
                }
            }
        }
        return Unit.INSTANCE;
    }
}

