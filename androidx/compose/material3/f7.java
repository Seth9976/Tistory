package androidx.compose.material3;

import a5.b;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.CoroutineScope;

public final class f7 extends Lambda implements Function4 {
    public final String A;
    public final int B;
    public final int C;
    public final Function1 D;
    public final SelectableDates E;
    public final DatePickerColors F;
    public final IntRange w;
    public final LazyGridState x;
    public final CoroutineScope y;
    public final String z;

    public f7(IntRange intRange0, LazyGridState lazyGridState0, CoroutineScope coroutineScope0, String s, String s1, int v, int v1, Function1 function10, SelectableDates selectableDates0, DatePickerColors datePickerColors0) {
        this.w = intRange0;
        this.x = lazyGridState0;
        this.y = coroutineScope0;
        this.z = s;
        this.A = s1;
        this.B = v;
        this.C = v1;
        this.D = function10;
        this.E = selectableDates0;
        this.F = datePickerColors0;
        super(4);
    }

    @Override  // kotlin.jvm.functions.Function4
    public final Object invoke(Object object0, Object object1, Object object2, Object object3) {
        LazyGridItemScope lazyGridItemScope0 = (LazyGridItemScope)object0;
        int v = ((Number)object1).intValue();
        int v1 = ((Number)object3).intValue();
        if((v1 & 0x30) == 0) {
            v1 |= (((Composer)object2).changed(v) ? 0x20 : 16);
        }
        if((v1 & 0x91) == 0x90 && ((Composer)object2).getSkipping()) {
            ((Composer)object2).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x3E06A802, v1, -1, "androidx.compose.material3.YearPicker.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DatePicker.kt:2014)");
        }
        int v2 = this.w.getFirst() + v;
        String s = CalendarLocale_jvmKt.toLocalString$default(v2, 0, 0, false, 7, null);
        Modifier modifier0 = SizeKt.requiredSize-VpY3zN4(Modifier.Companion, 0.0f, 0.0f);
        boolean z = ((Composer)object2).changed(this.x);
        boolean z1 = ((Composer)object2).changedInstance(this.y);
        boolean z2 = ((Composer)object2).changed(this.z);
        boolean z3 = ((Composer)object2).changed(this.A);
        c7 c70 = ((Composer)object2).rememberedValue();
        if(((v1 & 0x70) == 0x20 | z | z1 | z2 | z3) != 0 || c70 == Composer.Companion.getEmpty()) {
            c70 = new c7(v, 0, this.x, this.y, this.z, this.A);
            ((Composer)object2).updateRememberedValue(c70);
        }
        Modifier modifier1 = SemanticsModifierKt.semantics$default(modifier0, false, c70, 1, null);
        boolean z4 = v2 == this.B;
        boolean z5 = v2 == this.C;
        Function1 function10 = this.D;
        boolean z6 = ((Composer)object2).changed(function10);
        boolean z7 = ((Composer)object2).changed(v2);
        d7 d70 = ((Composer)object2).rememberedValue();
        if(z6 || z7 || d70 == Composer.Companion.getEmpty()) {
            d70 = new d7(v2, 0, function10);
            ((Composer)object2).updateRememberedValue(d70);
        }
        String s1 = b.f(1, Strings_androidKt.getString-2EP1pXo(string.m3c_date_picker_navigate_to_year_description, ((Composer)object2), 0), "format(this, *args)", new Object[]{s});
        ComposableLambda composableLambda0 = ComposableLambdaKt.rememberComposableLambda(0x34952493, true, new e7(s), ((Composer)object2), 54);
        DatePickerKt.access$Year(modifier1, z4, z5, d70, true, s1, this.F, composableLambda0, ((Composer)object2), 0xC00000);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

