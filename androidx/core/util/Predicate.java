package androidx.core.util;

import android.annotation.SuppressLint;
import androidx.core.content.o;
import androidx.core.content.p;
import java.util.Objects;
import m3.d;

@SuppressLint({"UnknownNullness"})
public interface Predicate {
    default boolean a(Object object0) {
        return !this.test(object0);
    }

    @SuppressLint({"MissingNullability"})
    default Predicate and(@SuppressLint({"MissingNullability"}) Predicate predicate0) {
        Objects.requireNonNull(predicate0);
        return new d(this, predicate0, 1);
    }

    // 去混淆评级： 低(20)
    default boolean b(Predicate predicate0, Object object0) {
        return this.test(object0) || predicate0.test(object0);
    }

    // 去混淆评级： 低(20)
    default boolean c(Predicate predicate0, Object object0) {
        return this.test(object0) && predicate0.test(object0);
    }

    @SuppressLint({"MissingNullability"})
    static Predicate isEqual(@SuppressLint({"MissingNullability"}) Object object0) {
        return object0 == null ? new p(7) : new o(object0, 3);
    }

    @SuppressLint({"MissingNullability"})
    default Predicate negate() {
        return new o(this, 4);
    }

    @SuppressLint({"MissingNullability"})
    static Predicate not(@SuppressLint({"MissingNullability"}) Predicate predicate0) {
        Objects.requireNonNull(predicate0);
        return predicate0.negate();
    }

    @SuppressLint({"MissingNullability"})
    default Predicate or(@SuppressLint({"MissingNullability"}) Predicate predicate0) {
        Objects.requireNonNull(predicate0);
        return new d(this, predicate0, 0);
    }

    boolean test(Object arg1);
}

