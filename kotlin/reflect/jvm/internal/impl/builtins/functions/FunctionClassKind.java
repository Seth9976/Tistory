package kotlin.reflect.jvm.internal.impl.builtins.functions;

import a5.b;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.text.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public enum FunctionClassKind {
    @SourceDebugExtension({"SMAP\nFunctionClassKind.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FunctionClassKind.kt\norg/jetbrains/kotlin/builtins/functions/FunctionClassKind$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,59:1\n1282#2,2:60\n*S KotlinDebug\n*F\n+ 1 FunctionClassKind.kt\norg/jetbrains/kotlin/builtins/functions/FunctionClassKind$Companion\n*L\n27#1:60,2\n*E\n"})
    public static final class Companion {
        public static final class KindWithArity {
            public final FunctionClassKind a;
            public final int b;

            public KindWithArity(@NotNull FunctionClassKind functionClassKind0, int v) {
                Intrinsics.checkNotNullParameter(functionClassKind0, "kind");
                super();
                this.a = functionClassKind0;
                this.b = v;
            }

            @NotNull
            public final FunctionClassKind component1() {
                return this.a;
            }

            public final int component2() {
                return this.b;
            }

            @Override
            public boolean equals(@Nullable Object object0) {
                if(this == object0) {
                    return true;
                }
                if(!(object0 instanceof KindWithArity)) {
                    return false;
                }
                return this.a == ((KindWithArity)object0).a ? this.b == ((KindWithArity)object0).b : false;
            }

            @NotNull
            public final FunctionClassKind getKind() {
                return this.a;
            }

            @Override
            public int hashCode() {
                return this.b + this.a.hashCode() * 0x1F;
            }

            @Override
            @NotNull
            public String toString() {
                StringBuilder stringBuilder0 = new StringBuilder("KindWithArity(kind=");
                stringBuilder0.append(this.a);
                stringBuilder0.append(", arity=");
                return b.p(stringBuilder0, this.b, ')');
            }
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @Nullable
        public final FunctionClassKind byClassNamePrefix(@NotNull FqName fqName0, @NotNull String s) {
            Intrinsics.checkNotNullParameter(fqName0, "packageFqName");
            Intrinsics.checkNotNullParameter(s, "className");
            FunctionClassKind[] arr_functionClassKind = FunctionClassKind.values();
            for(int v = 0; v < arr_functionClassKind.length; ++v) {
                FunctionClassKind functionClassKind0 = arr_functionClassKind[v];
                if(Intrinsics.areEqual(functionClassKind0.getPackageFqName(), fqName0) && p.startsWith$default(s, functionClassKind0.getClassNamePrefix(), false, 2, null)) {
                    return functionClassKind0;
                }
            }
            return null;
        }

        @JvmStatic
        @Nullable
        public final FunctionClassKind getFunctionalClassKind(@NotNull String s, @NotNull FqName fqName0) {
            Intrinsics.checkNotNullParameter(s, "className");
            Intrinsics.checkNotNullParameter(fqName0, "packageFqName");
            KindWithArity functionClassKind$Companion$KindWithArity0 = this.parseClassName(s, fqName0);
            return functionClassKind$Companion$KindWithArity0 == null ? null : functionClassKind$Companion$KindWithArity0.getKind();
        }

        @Nullable
        public final KindWithArity parseClassName(@NotNull String s, @NotNull FqName fqName0) {
            Intrinsics.checkNotNullParameter(s, "className");
            Intrinsics.checkNotNullParameter(fqName0, "packageFqName");
            FunctionClassKind functionClassKind0 = this.byClassNamePrefix(fqName0, s);
            if(functionClassKind0 == null) {
                return null;
            }
            String s1 = s.substring(functionClassKind0.getClassNamePrefix().length());
            Intrinsics.checkNotNullExpressionValue(s1, "this as java.lang.String).substring(startIndex)");
            if(s1.length() == 0) {
                throw new NullPointerException();
            }
            int v = s1.length();
            int v2 = 0;
            for(int v1 = 0; v1 < v; ++v1) {
                int v3 = s1.charAt(v1);
                if(v3 - 0x30 < 0 || v3 - 0x30 >= 10) {
                    throw new NullPointerException();
                }
                v2 = v2 * 10 + (v3 - 0x30);
            }
            Integer integer0 = v2;
            return integer0 == null ? null : new KindWithArity(functionClassKind0, ((int)integer0));
        }
    }

    Function(StandardNames.BUILT_INS_PACKAGE_FQ_NAME, "Function"),
    SuspendFunction(StandardNames.COROUTINES_PACKAGE_FQ_NAME, "SuspendFunction"),
    KFunction(StandardNames.KOTLIN_REFLECT_FQ_NAME, "KFunction"),
    KSuspendFunction(StandardNames.KOTLIN_REFLECT_FQ_NAME, "KSuspendFunction");

    @NotNull
    public static final Companion Companion;
    public final FqName a;
    public final String b;

    static {
        FunctionClassKind.Companion = new Companion(null);
    }

    public FunctionClassKind(FqName fqName0, String s1) {
        this.a = fqName0;
        this.b = s1;
    }

    @NotNull
    public final String getClassNamePrefix() {
        return this.b;
    }

    @NotNull
    public final FqName getPackageFqName() {
        return this.a;
    }

    @NotNull
    public final Name numberedClassName(int v) {
        Name name0 = Name.identifier((this.b + v));
        Intrinsics.checkNotNullExpressionValue(name0, "identifier(\"$classNamePrefix$arity\")");
        return name0;
    }
}

