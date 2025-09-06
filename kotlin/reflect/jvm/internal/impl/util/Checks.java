package kotlin.reflect.jvm.internal.impl.util;

import java.util.Arrays;
import java.util.Collection;
import jf.a;
import jf.b;
import jf.c;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

public final class Checks {
    public final Name a;
    public final Regex b;
    public final Collection c;
    public final Function1 d;
    public final Check[] e;

    public Checks(@NotNull Collection collection0, @NotNull Check[] arr_check, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(collection0, "nameList");
        Intrinsics.checkNotNullParameter(arr_check, "checks");
        Intrinsics.checkNotNullParameter(function10, "additionalChecks");
        this(null, null, collection0, function10, ((Check[])Arrays.copyOf(arr_check, arr_check.length)));
    }

    public Checks(Collection collection0, Check[] arr_check, Function1 function10, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 4) != 0) {
            function10 = c.w;
        }
        this(collection0, arr_check, function10);
    }

    public Checks(Name name0, Regex regex0, Collection collection0, Function1 function10, Check[] arr_check) {
        this.a = name0;
        this.b = regex0;
        this.c = collection0;
        this.d = function10;
        this.e = arr_check;
    }

    public Checks(@NotNull Name name0, @NotNull Check[] arr_check, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(name0, "name");
        Intrinsics.checkNotNullParameter(arr_check, "checks");
        Intrinsics.checkNotNullParameter(function10, "additionalChecks");
        this(name0, null, null, function10, ((Check[])Arrays.copyOf(arr_check, arr_check.length)));
    }

    public Checks(Name name0, Check[] arr_check, Function1 function10, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 4) != 0) {
            function10 = a.w;
        }
        this(name0, arr_check, function10);
    }

    public Checks(@NotNull Regex regex0, @NotNull Check[] arr_check, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(regex0, "regex");
        Intrinsics.checkNotNullParameter(arr_check, "checks");
        Intrinsics.checkNotNullParameter(function10, "additionalChecks");
        this(null, regex0, null, function10, ((Check[])Arrays.copyOf(arr_check, arr_check.length)));
    }

    public Checks(Regex regex0, Check[] arr_check, Function1 function10, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 4) != 0) {
            function10 = b.w;
        }
        this(regex0, arr_check, function10);
    }

    @NotNull
    public final CheckResult checkAll(@NotNull FunctionDescriptor functionDescriptor0) {
        Intrinsics.checkNotNullParameter(functionDescriptor0, "functionDescriptor");
        Check[] arr_check = this.e;
        for(int v = 0; v < arr_check.length; ++v) {
            String s = arr_check[v].invoke(functionDescriptor0);
            if(s != null) {
                return new IllegalSignature(s);
            }
        }
        String s1 = (String)this.d.invoke(functionDescriptor0);
        return s1 != null ? new IllegalSignature(s1) : SuccessCheck.INSTANCE;
    }

    public final boolean isApplicable(@NotNull FunctionDescriptor functionDescriptor0) {
        Intrinsics.checkNotNullParameter(functionDescriptor0, "functionDescriptor");
        if(this.a != null && !Intrinsics.areEqual(functionDescriptor0.getName(), this.a)) {
            return false;
        }
        Regex regex0 = this.b;
        if(regex0 != null) {
            String s = functionDescriptor0.getName().asString();
            Intrinsics.checkNotNullExpressionValue(s, "functionDescriptor.name.asString()");
            return regex0.matches(s) ? this.c == null || this.c.contains(functionDescriptor0.getName()) : false;
        }
        return this.c == null || this.c.contains(functionDescriptor0.getName());
    }
}

