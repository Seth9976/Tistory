package ae;

import com.bumptech.glide.load.data.DataRewinder;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.functions.ObjectHelper;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;

public final class a implements DataRewinder, Predicate, ReadWriteProperty {
    public final int a;
    public Object b;

    public a() {
        this.a = 0;
        super();
    }

    public a(Object object0, int v) {
        this.a = v;
        this.b = object0;
        super();
    }

    @Override  // com.bumptech.glide.load.data.DataRewinder
    public void cleanup() {
    }

    @Override  // kotlin.properties.ReadWriteProperty
    public Object getValue(Object object0, KProperty kProperty0) {
        Intrinsics.checkNotNullParameter(kProperty0, "property");
        Object object1 = this.b;
        if(object1 == null) {
            throw new IllegalStateException("Property " + kProperty0.getName() + " should be initialized before get.");
        }
        return object1;
    }

    @Override  // com.bumptech.glide.load.data.DataRewinder
    public Object rewindAndGet() {
        return this.b;
    }

    @Override  // kotlin.properties.ReadWriteProperty
    public void setValue(Object object0, KProperty kProperty0, Object object1) {
        Intrinsics.checkNotNullParameter(kProperty0, "property");
        Intrinsics.checkNotNullParameter(object1, "value");
        this.b = object1;
    }

    @Override  // io.reactivex.functions.Predicate
    public boolean test(Object object0) {
        return ObjectHelper.equals(object0, this.b);
    }

    @Override
    public String toString() {
        if(this.a != 0) {
            return super.toString();
        }
        StringBuilder stringBuilder0 = new StringBuilder("NotNullProperty(");
        return this.b == null ? "NotNullProperty(value not initialized yet)" : wb.a.b(')', "value=" + this.b, stringBuilder0);
    }
}

