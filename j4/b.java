package j4;

import androidx.compose.runtime.saveable.Saver;
import androidx.core.app.h;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.PropertyDelegateProvider;
import kotlin.reflect.KProperty;

public final class b implements PropertyDelegateProvider {
    public final int a;
    public final SavedStateHandle b;
    public final Saver c;
    public final Function0 d;

    public b(SavedStateHandle savedStateHandle0, Saver saver0, Function0 function00, int v) {
        this.a = v;
        this.b = savedStateHandle0;
        this.c = saver0;
        this.d = function00;
        super();
    }

    @Override  // kotlin.properties.PropertyDelegateProvider
    public final Object provideDelegate(Object object0, KProperty kProperty0) {
        if(this.a != 0) {
            Intrinsics.checkNotNullParameter(this.b, "$this_saveable");
            Intrinsics.checkNotNullParameter(this.c, "$stateSaver");
            Intrinsics.checkNotNullParameter(this.d, "$init");
            Intrinsics.checkNotNullParameter(kProperty0, "property");
            StringBuilder stringBuilder0 = a5.b.t((object0 == null ? "" : Reflection.getOrCreateKotlinClass(object0.getClass()).getQualifiedName() + '.'));
            stringBuilder0.append(kProperty0.getName());
            return new androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt.saveable.3.1(SavedStateHandleSaverKt.saveable(this.b, stringBuilder0.toString(), this.c, this.d));
        }
        Intrinsics.checkNotNullParameter(this.b, "$this_saveable");
        Intrinsics.checkNotNullParameter(this.c, "$saver");
        Intrinsics.checkNotNullParameter(this.d, "$init");
        Intrinsics.checkNotNullParameter(kProperty0, "property");
        StringBuilder stringBuilder1 = a5.b.t((object0 == null ? "" : Reflection.getOrCreateKotlinClass(object0.getClass()).getQualifiedName() + '.'));
        stringBuilder1.append(kProperty0.getName());
        return new h(SavedStateHandleSaverKt.saveable(this.b, stringBuilder1.toString(), this.c, this.d), 19);
    }
}

