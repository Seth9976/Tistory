package i5;

import androidx.window.core.Logger;
import androidx.window.core.SpecificationComputer.VerificationMode;
import androidx.window.core.SpecificationComputer;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class b extends SpecificationComputer {
    public final Object a;
    public final String b;
    public final VerificationMode c;
    public final Logger d;

    public b(Object object0, String s, VerificationMode specificationComputer$VerificationMode0, Logger logger0) {
        Intrinsics.checkNotNullParameter(object0, "value");
        Intrinsics.checkNotNullParameter(s, "tag");
        Intrinsics.checkNotNullParameter(specificationComputer$VerificationMode0, "verificationMode");
        Intrinsics.checkNotNullParameter(logger0, "logger");
        super();
        this.a = object0;
        this.b = s;
        this.c = specificationComputer$VerificationMode0;
        this.d = logger0;
    }

    @Override  // androidx.window.core.SpecificationComputer
    public final Object compute() {
        return this.a;
    }

    @Override  // androidx.window.core.SpecificationComputer
    public final SpecificationComputer require(String s, Function1 function10) {
        Intrinsics.checkNotNullParameter(s, "message");
        Intrinsics.checkNotNullParameter(function10, "condition");
        return ((Boolean)function10.invoke(this.a)).booleanValue() ? this : new a(this.a, this.b, s, this.d, this.c);
    }
}

