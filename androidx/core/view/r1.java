package androidx.core.view;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.graphics.Insets;

public abstract class r1 {
    public final WindowInsetsCompat a;
    public Insets[] b;

    public r1() {
        this(new WindowInsetsCompat(null));
    }

    public r1(@NonNull WindowInsetsCompat windowInsetsCompat0) {
        this.a = windowInsetsCompat0;
    }

    public final void a() {
        Insets[] arr_insets = this.b;
        if(arr_insets != null) {
            Insets insets0 = arr_insets[0];
            Insets insets1 = arr_insets[1];
            WindowInsetsCompat windowInsetsCompat0 = this.a;
            if(insets1 == null) {
                insets1 = windowInsetsCompat0.getInsets(2);
            }
            if(insets0 == null) {
                insets0 = windowInsetsCompat0.getInsets(1);
            }
            this.i(Insets.max(insets0, insets1));
            Insets[] arr_insets1 = this.b;
            Insets insets2 = arr_insets1[Type.a(16)];
            if(insets2 != null) {
                this.h(insets2);
            }
            Insets[] arr_insets2 = this.b;
            Insets insets3 = arr_insets2[Type.a(0x20)];
            if(insets3 != null) {
                this.f(insets3);
            }
            Insets[] arr_insets3 = this.b;
            Insets insets4 = arr_insets3[Type.a(0x40)];
            if(insets4 != null) {
                this.j(insets4);
            }
        }
    }

    @NonNull
    public abstract WindowInsetsCompat b();

    public void c(@Nullable DisplayCutoutCompat displayCutoutCompat0) {
    }

    public void d(int v, @NonNull Insets insets0) {
        if(this.b == null) {
            this.b = new Insets[9];
        }
        for(int v1 = 1; v1 <= 0x100; v1 <<= 1) {
            if((v & v1) != 0) {
                Insets[] arr_insets = this.b;
                arr_insets[Type.a(v1)] = insets0;
            }
        }
    }

    public void e(int v, @NonNull Insets insets0) {
        if(v == 8) {
            throw new IllegalArgumentException("Ignoring visibility inset not available for IME");
        }
    }

    public void f(@NonNull Insets insets0) {
    }

    public abstract void g(@NonNull Insets arg1);

    public void h(@NonNull Insets insets0) {
    }

    public abstract void i(@NonNull Insets arg1);

    public void j(@NonNull Insets insets0) {
    }

    public void k(int v, boolean z) {
    }
}

