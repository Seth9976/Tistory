package retrofit2;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public final class Invocation {
    public final Class a;
    public final Object b;
    public final Method c;
    public final List d;

    public Invocation(Class class0, Object object0, Method method0, ArrayList arrayList0) {
        this.a = class0;
        this.b = object0;
        this.c = method0;
        this.d = Collections.unmodifiableList(arrayList0);
    }

    public List arguments() {
        return this.d;
    }

    @Nullable
    public Object instance() {
        return this.b;
    }

    public Method method() {
        return this.c;
    }

    public static Invocation of(Class class0, Object object0, Method method0, List list0) {
        Objects.requireNonNull(class0, "service == null");
        Objects.requireNonNull(object0, "instance == null");
        Objects.requireNonNull(method0, "method == null");
        Objects.requireNonNull(list0, "arguments == null");
        return new Invocation(class0, object0, method0, new ArrayList(list0));
    }

    @Deprecated
    public static Invocation of(Method method0, List list0) {
        Objects.requireNonNull(method0, "method == null");
        Objects.requireNonNull(list0, "arguments == null");
        return new Invocation(method0.getDeclaringClass(), null, method0, new ArrayList(list0));
    }

    public Class service() {
        return this.a;
    }

    @Override
    public String toString() {
        String s = this.c.getName();
        return String.format("%s.%s() %s", this.a.getName(), s, this.d);
    }
}

