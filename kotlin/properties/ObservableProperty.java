package kotlin.properties;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000E\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00028\u00000\u0002B\u000F\u0012\u0006\u0010\u0004\u001A\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\f\u001A\u00020\u000B2\n\u0010\b\u001A\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\t\u001A\u00028\u00002\u0006\u0010\n\u001A\u00028\u0000H\u0014¢\u0006\u0004\b\f\u0010\rJ+\u0010\u000F\u001A\u00020\u000E2\n\u0010\b\u001A\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\t\u001A\u00028\u00002\u0006\u0010\n\u001A\u00028\u0000H\u0014¢\u0006\u0004\b\u000F\u0010\u0010J&\u0010\u0012\u001A\u00028\u00002\b\u0010\u0011\u001A\u0004\u0018\u00010\u00032\n\u0010\b\u001A\u0006\u0012\u0002\b\u00030\u0007H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J.\u0010\u0015\u001A\u00020\u000E2\b\u0010\u0011\u001A\u0004\u0018\u00010\u00032\n\u0010\b\u001A\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\u0014\u001A\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000F\u0010\u0018\u001A\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001A"}, d2 = {"Lkotlin/properties/ObservableProperty;", "V", "Lkotlin/properties/ReadWriteProperty;", "", "initialValue", "<init>", "(Ljava/lang/Object;)V", "Lkotlin/reflect/KProperty;", "property", "oldValue", "newValue", "", "beforeChange", "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)Z", "", "afterChange", "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)V", "thisRef", "getValue", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "value", "setValue", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public abstract class ObservableProperty implements ReadWriteProperty {
    public Object a;

    public ObservableProperty(Object object0) {
        this.a = object0;
    }

    public void afterChange(@NotNull KProperty kProperty0, Object object0, Object object1) {
        Intrinsics.checkNotNullParameter(kProperty0, "property");
    }

    public boolean beforeChange(@NotNull KProperty kProperty0, Object object0, Object object1) {
        Intrinsics.checkNotNullParameter(kProperty0, "property");
        return true;
    }

    @Override  // kotlin.properties.ReadWriteProperty
    public Object getValue(@Nullable Object object0, @NotNull KProperty kProperty0) {
        Intrinsics.checkNotNullParameter(kProperty0, "property");
        return this.a;
    }

    @Override  // kotlin.properties.ReadWriteProperty
    public void setValue(@Nullable Object object0, @NotNull KProperty kProperty0, Object object1) {
        Intrinsics.checkNotNullParameter(kProperty0, "property");
        Object object2 = this.a;
        if(!this.beforeChange(kProperty0, object2, object1)) {
            return;
        }
        this.a = object1;
        this.afterChange(kProperty0, object2, object1);
    }

    @Override
    @NotNull
    public String toString() {
        return "ObservableProperty(value=" + this.a + ')';
    }
}

