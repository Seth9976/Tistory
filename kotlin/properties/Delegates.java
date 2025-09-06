package kotlin.properties;

import ae.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001J%\u0010\u0004\u001A\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00028\u00000\u0003\"\b\b\u0000\u0010\u0002*\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0082\u0001\u0010\u0010\u001A\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0006\u001A\u00028\u00002Q\b\u0004\u0010\u000F\u001AK\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000B\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000E0\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0082\u0001\u0010\u0013\u001A\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0006\u001A\u00028\u00002Q\b\u0004\u0010\u000F\u001AK\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000B\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00120\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0011\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lkotlin/properties/Delegates;", "", "T", "Lkotlin/properties/ReadWriteProperty;", "notNull", "()Lkotlin/properties/ReadWriteProperty;", "initialValue", "Lkotlin/Function3;", "Lkotlin/reflect/KProperty;", "Lkotlin/ParameterName;", "name", "property", "oldValue", "newValue", "", "onChange", "observable", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Lkotlin/properties/ReadWriteProperty;", "", "vetoable", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Delegates {
    @NotNull
    public static final Delegates INSTANCE;

    static {
        Delegates.INSTANCE = new Delegates();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @NotNull
    public final ReadWriteProperty notNull() {
        return new a();
    }

    @NotNull
    public final ReadWriteProperty observable(Object object0, @NotNull Function3 function30) {
        Intrinsics.checkNotNullParameter(function30, "onChange");
        return new ObservableProperty(function30) {
            @Override  // kotlin.properties.ObservableProperty
            public void afterChange(@NotNull KProperty kProperty0, Object object0, Object object1) {
                Intrinsics.checkNotNullParameter(kProperty0, "property");
                this.b.invoke(kProperty0, object0, object1);
            }
        };
    }

    @NotNull
    public final ReadWriteProperty vetoable(Object object0, @NotNull Function3 function30) {
        Intrinsics.checkNotNullParameter(function30, "onChange");
        return new ObservableProperty(function30) {
            @Override  // kotlin.properties.ObservableProperty
            public boolean beforeChange(@NotNull KProperty kProperty0, Object object0, Object object1) {
                Intrinsics.checkNotNullParameter(kProperty0, "property");
                return ((Boolean)this.b.invoke(kProperty0, object0, object1)).booleanValue();
            }
        };
    }
}

