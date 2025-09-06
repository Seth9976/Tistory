package kotlin.jvm.internal;

import fg.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.SinceKotlin;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.KVariance;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000E\n\u0002\b\u0014\n\u0002\u0010\u001B\n\u0002\b\u0005\b\u0007\u0018\u0000 .2\u00020\u0001:\u0001.B1\b\u0007\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0001\u0012\u0006\u0010\t\u001A\u00020\b¢\u0006\u0004\b\n\u0010\u000BB\'\b\u0016\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\r\u001A\u00020\f¢\u0006\u0004\b\n\u0010\u000EJ\u001A\u0010\u0011\u001A\u00020\f2\b\u0010\u0010\u001A\u0004\u0018\u00010\u000FH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000F\u0010\u0013\u001A\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000F\u0010\u0016\u001A\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001A\u0010\u0003\u001A\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001A\u0004\b\u001A\u0010\u001BR \u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00050\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001C\u0010\u001D\u001A\u0004\b\u001E\u0010\u001FR\"\u0010\u0007\u001A\u0004\u0018\u00010\u00018\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b \u0010!\u0012\u0004\b$\u0010%\u001A\u0004\b\"\u0010#R \u0010\t\u001A\u00020\b8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b&\u0010\'\u0012\u0004\b)\u0010%\u001A\u0004\b(\u0010\u0014R\u001A\u0010,\u001A\b\u0012\u0004\u0012\u00020*0\u00048VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b+\u0010\u001FR\u0014\u0010\r\u001A\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\r\u0010-¨\u0006/"}, d2 = {"Lkotlin/jvm/internal/TypeReference;", "Lkotlin/reflect/KType;", "Lkotlin/reflect/KClassifier;", "classifier", "", "Lkotlin/reflect/KTypeProjection;", "arguments", "platformTypeUpperBound", "", "flags", "<init>", "(Lkotlin/reflect/KClassifier;Ljava/util/List;Lkotlin/reflect/KType;I)V", "", "isMarkedNullable", "(Lkotlin/reflect/KClassifier;Ljava/util/List;Z)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Lkotlin/reflect/KClassifier;", "getClassifier", "()Lkotlin/reflect/KClassifier;", "b", "Ljava/util/List;", "getArguments", "()Ljava/util/List;", "c", "Lkotlin/reflect/KType;", "getPlatformTypeUpperBound$kotlin_stdlib", "()Lkotlin/reflect/KType;", "getPlatformTypeUpperBound$kotlin_stdlib$annotations", "()V", "d", "I", "getFlags$kotlin_stdlib", "getFlags$kotlin_stdlib$annotations", "", "getAnnotations", "annotations", "()Z", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SinceKotlin(version = "1.4")
public final class TypeReference implements KType {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001A\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001A\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"Lkotlin/jvm/internal/TypeReference$Companion;", "", "", "IS_MARKED_NULLABLE", "I", "IS_MUTABLE_COLLECTION_TYPE", "IS_NOTHING_TYPE", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

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

    @NotNull
    public static final Companion Companion = null;
    public static final int IS_MARKED_NULLABLE = 1;
    public static final int IS_MUTABLE_COLLECTION_TYPE = 2;
    public static final int IS_NOTHING_TYPE = 4;
    public final KClassifier a;
    public final List b;
    public final KType c;
    public final int d;

    static {
        TypeReference.Companion = new Companion(null);
    }

    @SinceKotlin(version = "1.6")
    public TypeReference(@NotNull KClassifier kClassifier0, @NotNull List list0, @Nullable KType kType0, int v) {
        Intrinsics.checkNotNullParameter(kClassifier0, "classifier");
        Intrinsics.checkNotNullParameter(list0, "arguments");
        super();
        this.a = kClassifier0;
        this.b = list0;
        this.c = kType0;
        this.d = v;
    }

    public TypeReference(@NotNull KClassifier kClassifier0, @NotNull List list0, boolean z) {
        Intrinsics.checkNotNullParameter(kClassifier0, "classifier");
        Intrinsics.checkNotNullParameter(list0, "arguments");
        this(kClassifier0, list0, null, ((int)z));
    }

    public final String a(boolean z) {
        String s;
        KClassifier kClassifier0 = this.getClassifier();
        Class class0 = null;
        KClass kClass0 = kClassifier0 instanceof KClass ? ((KClass)kClassifier0) : null;
        if(kClass0 != null) {
            class0 = JvmClassMappingKt.getJavaClass(kClass0);
        }
        if(class0 == null) {
            s = this.getClassifier().toString();
        }
        else if((this.d & 4) != 0) {
            s = "kotlin.Nothing";
        }
        else if(!class0.isArray()) {
            if(!z || !class0.isPrimitive()) {
                s = class0.getName();
            }
            else {
                KClassifier kClassifier1 = this.getClassifier();
                Intrinsics.checkNotNull(kClassifier1, "null cannot be cast to non-null type kotlin.reflect.KClass<*>");
                s = JvmClassMappingKt.getJavaObjectType(((KClass)kClassifier1)).getName();
            }
        }
        else if(Intrinsics.areEqual(class0, boolean[].class)) {
            s = "kotlin.BooleanArray";
        }
        else if(Intrinsics.areEqual(class0, char[].class)) {
            s = "kotlin.CharArray";
        }
        else if(Intrinsics.areEqual(class0, byte[].class)) {
            s = "kotlin.ByteArray";
        }
        else if(Intrinsics.areEqual(class0, short[].class)) {
            s = "kotlin.ShortArray";
        }
        else if(Intrinsics.areEqual(class0, int[].class)) {
            s = "kotlin.IntArray";
        }
        else if(Intrinsics.areEqual(class0, float[].class)) {
            s = "kotlin.FloatArray";
        }
        else if(Intrinsics.areEqual(class0, long[].class)) {
            s = "kotlin.LongArray";
        }
        else if(Intrinsics.areEqual(class0, double[].class)) {
            s = "kotlin.DoubleArray";
        }
        else {
            s = "kotlin.Array";
        }
        String s1 = "";
        String s2 = this.getArguments().isEmpty() ? "" : CollectionsKt___CollectionsKt.joinToString$default(this.getArguments(), ", ", "<", ">", 0, null, new c(this, 24), 24, null);
        if(this.isMarkedNullable()) {
            s1 = "?";
        }
        String s3 = s + s2 + s1;
        KType kType0 = this.c;
        if(kType0 instanceof TypeReference) {
            String s4 = ((TypeReference)kType0).a(true);
            if(!Intrinsics.areEqual(s4, s3)) {
                return Intrinsics.areEqual(s4, s3 + '?') ? s3 + '!' : "(" + s3 + ".." + s4 + ')';
            }
        }
        return s3;
    }

    public static final String access$asString(TypeReference typeReference0, KTypeProjection kTypeProjection0) {
        String s;
        typeReference0.getClass();
        if(kTypeProjection0.getVariance() == null) {
            return "*";
        }
        KType kType0 = kTypeProjection0.getType();
        TypeReference typeReference1 = kType0 instanceof TypeReference ? ((TypeReference)kType0) : null;
        if(typeReference1 == null) {
            s = String.valueOf(kTypeProjection0.getType());
        }
        else {
            s = typeReference1.a(true);
            if(s == null) {
                s = String.valueOf(kTypeProjection0.getType());
            }
        }
        switch(WhenMappings.$EnumSwitchMapping$0[kTypeProjection0.getVariance().ordinal()]) {
            case 1: {
                return s;
            }
            case 2: {
                return "in " + s;
            }
            case 3: {
                return "out " + s;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    // 去混淆评级： 低(40)
    @Override
    public boolean equals(@Nullable Object object0) {
        return object0 instanceof TypeReference && Intrinsics.areEqual(this.getClassifier(), ((TypeReference)object0).getClassifier()) && Intrinsics.areEqual(this.getArguments(), ((TypeReference)object0).getArguments()) && Intrinsics.areEqual(this.c, ((TypeReference)object0).c) && this.d == ((TypeReference)object0).d;
    }

    @Override  // kotlin.reflect.KAnnotatedElement
    @NotNull
    public List getAnnotations() {
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @Override  // kotlin.reflect.KType
    @NotNull
    public List getArguments() {
        return this.b;
    }

    @Override  // kotlin.reflect.KType
    @NotNull
    public KClassifier getClassifier() {
        return this.a;
    }

    public final int getFlags$kotlin_stdlib() {
        return this.d;
    }

    @SinceKotlin(version = "1.6")
    public static void getFlags$kotlin_stdlib$annotations() {
    }

    @Nullable
    public final KType getPlatformTypeUpperBound$kotlin_stdlib() {
        return this.c;
    }

    @SinceKotlin(version = "1.6")
    public static void getPlatformTypeUpperBound$kotlin_stdlib$annotations() {
    }

    @Override
    public int hashCode() {
        return this.d + (this.getArguments().hashCode() + this.getClassifier().hashCode() * 0x1F) * 0x1F;
    }

    @Override  // kotlin.reflect.KType
    public boolean isMarkedNullable() {
        return (this.d & 1) != 0;
    }

    @Override
    @NotNull
    public String toString() {
        return this.a(false) + " (Kotlin reflection is not available)";
    }
}

