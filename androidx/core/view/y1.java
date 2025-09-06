package androidx.core.view;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.graphics.Insets;
import androidx.core.util.ObjectsCompat;

public class y1 {
    public final WindowInsetsCompat a;
    public static final WindowInsetsCompat b;

    static {
        y1.b = new Builder().build().consumeDisplayCutout().consumeStableInsets().consumeSystemWindowInsets();
    }

    public y1(@NonNull WindowInsetsCompat windowInsetsCompat0) {
        this.a = windowInsetsCompat0;
    }

    @NonNull
    public WindowInsetsCompat a() {
        return this.a;
    }

    @NonNull
    public WindowInsetsCompat b() {
        return this.a;
    }

    @NonNull
    public WindowInsetsCompat c() {
        return this.a;
    }

    public void d(@NonNull View view0) {
    }

    public void e(@NonNull WindowInsetsCompat windowInsetsCompat0) {
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof y1 ? this.p() == ((y1)object0).p() && this.o() == ((y1)object0).o() && ObjectsCompat.equals(this.l(), ((y1)object0).l()) && ObjectsCompat.equals(this.j(), ((y1)object0).j()) && ObjectsCompat.equals(this.f(), ((y1)object0).f()) : false;
    }

    @Nullable
    public DisplayCutoutCompat f() {
        return null;
    }

    @NonNull
    public Insets g(int v) {
        return Insets.NONE;
    }

    @NonNull
    public Insets h(int v) {
        if((v & 8) != 0) {
            throw new IllegalArgumentException("Unable to query the maximum insets for IME");
        }
        return Insets.NONE;
    }

    @Override
    public int hashCode() {
        Insets insets0 = this.l();
        Insets insets1 = this.j();
        return ObjectsCompat.hash(new Object[]{Boolean.valueOf(this.p()), Boolean.valueOf(this.o()), insets0, insets1, this.f()});
    }

    @NonNull
    public Insets i() {
        return this.l();
    }

    @NonNull
    public Insets j() {
        return Insets.NONE;
    }

    @NonNull
    public Insets k() {
        return this.l();
    }

    @NonNull
    public Insets l() {
        return Insets.NONE;
    }

    @NonNull
    public Insets m() {
        return this.l();
    }

    @NonNull
    public WindowInsetsCompat n(int v, int v1, int v2, int v3) {
        return y1.b;
    }

    public boolean o() {
        return false;
    }

    public boolean p() {
        return false;
    }

    public boolean q(int v) {
        return true;
    }

    public void r(Insets[] arr_insets) {
    }

    public void s(@NonNull Insets insets0) {
    }

    public void t(@Nullable WindowInsetsCompat windowInsetsCompat0) {
    }

    public void u(Insets insets0) {
    }
}

