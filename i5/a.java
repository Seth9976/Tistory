package i5;

import androidx.window.core.FailedSpecification.WhenMappings;
import androidx.window.core.Logger;
import androidx.window.core.SpecificationComputer.VerificationMode;
import androidx.window.core.SpecificationComputer;
import androidx.window.core.WindowStrictModeException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class a extends SpecificationComputer {
    public final Object a;
    public final String b;
    public final String c;
    public final Logger d;
    public final VerificationMode e;
    public final WindowStrictModeException f;

    public a(Object object0, String s, String s1, Logger logger0, VerificationMode specificationComputer$VerificationMode0) {
        Intrinsics.checkNotNullParameter(object0, "value");
        Intrinsics.checkNotNullParameter(s, "tag");
        Intrinsics.checkNotNullParameter(s1, "message");
        Intrinsics.checkNotNullParameter(logger0, "logger");
        Intrinsics.checkNotNullParameter(specificationComputer$VerificationMode0, "verificationMode");
        super();
        this.a = object0;
        this.b = s;
        this.c = s1;
        this.d = logger0;
        this.e = specificationComputer$VerificationMode0;
        WindowStrictModeException windowStrictModeException0 = new WindowStrictModeException(this.createMessage(object0, s1));
        StackTraceElement[] arr_stackTraceElement = windowStrictModeException0.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(arr_stackTraceElement, "stackTrace");
        Object[] arr_object = ArraysKt___ArraysKt.drop(arr_stackTraceElement, 2).toArray(new StackTraceElement[0]);
        if(arr_object == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        windowStrictModeException0.setStackTrace(((StackTraceElement[])arr_object));
        this.f = windowStrictModeException0;
    }

    @Override  // androidx.window.core.SpecificationComputer
    public final Object compute() {
        switch(FailedSpecification.WhenMappings.$EnumSwitchMapping$0[this.e.ordinal()]) {
            case 1: {
                throw this.f;
            }
            case 2: {
                String s = this.createMessage(this.a, this.c);
                this.d.debug(this.b, s);
                break;
            }
            case 3: {
                break;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
        return null;
    }

    @Override  // androidx.window.core.SpecificationComputer
    public final SpecificationComputer require(String s, Function1 function10) {
        Intrinsics.checkNotNullParameter(s, "message");
        Intrinsics.checkNotNullParameter(function10, "condition");
        return this;
    }
}

