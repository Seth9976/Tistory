package kotlin.jvm.internal;

import java.util.List;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.collections.k;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.KVariance;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0014\b\u0007\u0018\u0000 (2\u00020\u0001:\u0001(B)\u0012\b\u0010\u0003\u001A\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\t\u001A\u00020\b¢\u0006\u0004\b\n\u0010\u000BJ\u001B\u0010\u0010\u001A\u00020\u000F2\f\u0010\u000E\u001A\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u0010\u0010\u0011J\u001A\u0010\u0013\u001A\u00020\b2\b\u0010\u0012\u001A\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000F\u0010\u0016\u001A\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000F\u0010\u0018\u001A\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001A\u0010\u0005\u001A\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001A\u0010\u001B\u001A\u0004\b\u001C\u0010\u0019R\u001A\u0010\u0007\u001A\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001D\u0010\u001E\u001A\u0004\b\u001F\u0010 R\u001A\u0010\t\u001A\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001A\u0004\b\t\u0010#R \u0010\u000E\u001A\b\u0012\u0004\u0012\u00020\r0\f8VX\u0096\u0004¢\u0006\f\u0012\u0004\b&\u0010\'\u001A\u0004\b$\u0010%¨\u0006)"}, d2 = {"Lkotlin/jvm/internal/TypeParameterReference;", "Lkotlin/reflect/KTypeParameter;", "", "container", "", "name", "Lkotlin/reflect/KVariance;", "variance", "", "isReified", "<init>", "(Ljava/lang/Object;Ljava/lang/String;Lkotlin/reflect/KVariance;Z)V", "", "Lkotlin/reflect/KType;", "upperBounds", "", "setUpperBounds", "(Ljava/util/List;)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "b", "Ljava/lang/String;", "getName", "c", "Lkotlin/reflect/KVariance;", "getVariance", "()Lkotlin/reflect/KVariance;", "d", "Z", "()Z", "getUpperBounds", "()Ljava/util/List;", "getUpperBounds$annotations", "()V", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SinceKotlin(version = "1.4")
@SourceDebugExtension({"SMAP\nTypeParameterReference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeParameterReference.kt\nkotlin/jvm/internal/TypeParameterReference\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,58:1\n1#2:59\n*E\n"})
public final class TypeParameterReference implements KTypeParameter {
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/jvm/internal/TypeParameterReference$Companion;", "", "Lkotlin/reflect/KTypeParameter;", "typeParameter", "", "toString", "(Lkotlin/reflect/KTypeParameter;)Ljava/lang/String;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
        public final class WhenMappings {
            public static final int[] $EnumSwitchMapping$0;

            static {
                int[] arr_v = new int[KVariance.values().length];
                try {
                    arr_v[KVariance.INVARIANT.ordinal()] = 1;
                }
                catch(NoSuchFieldError unused_ex) {
                }
                try {
                    arr_v[KVariance.IN.ordinal()] = 2;
                }
                catch(NoSuchFieldError unused_ex) {
                }
                try {
                    arr_v[KVariance.OUT.ordinal()] = 3;
                }
                catch(NoSuchFieldError unused_ex) {
                }
                WhenMappings.$EnumSwitchMapping$0 = arr_v;
            }
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final String toString(@NotNull KTypeParameter kTypeParameter0) {
            Intrinsics.checkNotNullParameter(kTypeParameter0, "typeParameter");
            StringBuilder stringBuilder0 = new StringBuilder();
            switch(WhenMappings.$EnumSwitchMapping$0[kTypeParameter0.getVariance().ordinal()]) {
                case 2: {
                    stringBuilder0.append("in ");
                    break;
                }
                case 3: {
                    stringBuilder0.append("out ");
                }
            }
            stringBuilder0.append(kTypeParameter0.getName());
            String s = stringBuilder0.toString();
            Intrinsics.checkNotNullExpressionValue(s, "toString(...)");
            return s;
        }
    }

    @NotNull
    public static final Companion Companion;
    public final Object a;
    public final String b;
    public final KVariance c;
    public final boolean d;
    public volatile List e;

    static {
        TypeParameterReference.Companion = new Companion(null);
    }

    public TypeParameterReference(@Nullable Object object0, @NotNull String s, @NotNull KVariance kVariance0, boolean z) {
        Intrinsics.checkNotNullParameter(s, "name");
        Intrinsics.checkNotNullParameter(kVariance0, "variance");
        super();
        this.a = object0;
        this.b = s;
        this.c = kVariance0;
        this.d = z;
    }

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(@Nullable Object object0) {
        return object0 instanceof TypeParameterReference && Intrinsics.areEqual(this.a, ((TypeParameterReference)object0).a) && Intrinsics.areEqual(this.getName(), ((TypeParameterReference)object0).getName());
    }

    @Override  // kotlin.reflect.KTypeParameter
    @NotNull
    public String getName() {
        return this.b;
    }

    @Override  // kotlin.reflect.KTypeParameter
    @NotNull
    public List getUpperBounds() {
        List list0 = this.e;
        if(list0 == null) {
            list0 = k.listOf(Reflection.nullableTypeOf(Object.class));
            this.e = list0;
        }
        return list0;
    }

    public static void getUpperBounds$annotations() {
    }

    @Override  // kotlin.reflect.KTypeParameter
    @NotNull
    public KVariance getVariance() {
        return this.c;
    }

    @Override
    public int hashCode() {
        return this.a == null ? this.getName().hashCode() : this.getName().hashCode() + this.a.hashCode() * 0x1F;
    }

    @Override  // kotlin.reflect.KTypeParameter
    public boolean isReified() {
        return this.d;
    }

    public final void setUpperBounds(@NotNull List list0) {
        Intrinsics.checkNotNullParameter(list0, "upperBounds");
        if(this.e != null) {
            throw new IllegalStateException(("Upper bounds of type parameter \'" + this + "\' have already been initialized.").toString());
        }
        this.e = list0;
    }

    @Override
    @NotNull
    public String toString() {
        return TypeParameterReference.Companion.toString(this);
    }
}

