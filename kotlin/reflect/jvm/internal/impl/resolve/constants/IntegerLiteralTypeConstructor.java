package kotlin.reflect.jvm.internal.impl.resolve.constants;

import a2.b;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import l1.a;
import md.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nIntegerLiteralTypeConstructor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntegerLiteralTypeConstructor.kt\norg/jetbrains/kotlin/resolve/constants/IntegerLiteralTypeConstructor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,181:1\n1726#2,3:182\n1747#2,3:185\n*S KotlinDebug\n*F\n+ 1 IntegerLiteralTypeConstructor.kt\norg/jetbrains/kotlin/resolve/constants/IntegerLiteralTypeConstructor\n*L\n132#1:182,3\n176#1:185,3\n*E\n"})
public final class IntegerLiteralTypeConstructor implements TypeConstructor {
    @SourceDebugExtension({"SMAP\nIntegerLiteralTypeConstructor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntegerLiteralTypeConstructor.kt\norg/jetbrains/kotlin/resolve/constants/IntegerLiteralTypeConstructor$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,181:1\n2661#2,7:182\n*S KotlinDebug\n*F\n+ 1 IntegerLiteralTypeConstructor.kt\norg/jetbrains/kotlin/resolve/constants/IntegerLiteralTypeConstructor$Companion\n*L\n40#1:182,7\n*E\n"})
    public static final class Companion {
        public final class WhenMappings {
            public static final int[] $EnumSwitchMapping$0;

            static {
                int[] arr_v = new int[a.d(2).length];
                try {
                    arr_v[0] = 1;
                }
                catch(NoSuchFieldError unused_ex) {
                }
                try {
                    arr_v[1] = 2;
                }
                catch(NoSuchFieldError unused_ex) {
                }
                WhenMappings.$EnumSwitchMapping$0 = arr_v;
            }
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @Nullable
        public final SimpleType findIntersectionType(@NotNull Collection collection0) {
            Intrinsics.checkNotNullParameter(collection0, "types");
            if(!collection0.isEmpty()) {
                Iterator iterator0 = collection0.iterator();
                if(!iterator0.hasNext()) {
                    throw new UnsupportedOperationException("Empty collection can\'t be reduced.");
                }
                SimpleType simpleType0 = iterator0.next();
                while(iterator0.hasNext()) {
                    Object object0 = iterator0.next();
                    SimpleType simpleType1 = (SimpleType)object0;
                    IntegerLiteralTypeConstructor.Companion.getClass();
                    if(simpleType0 != null && simpleType1 != null) {
                        TypeConstructor typeConstructor0 = simpleType0.getConstructor();
                        TypeConstructor typeConstructor1 = simpleType1.getConstructor();
                        boolean z = typeConstructor0 instanceof IntegerLiteralTypeConstructor;
                        if(z && typeConstructor1 instanceof IntegerLiteralTypeConstructor) {
                            IntegerLiteralTypeConstructor integerLiteralTypeConstructor0 = new IntegerLiteralTypeConstructor(((IntegerLiteralTypeConstructor)typeConstructor0).a, ((IntegerLiteralTypeConstructor)typeConstructor0).b, CollectionsKt___CollectionsKt.union(((IntegerLiteralTypeConstructor)typeConstructor0).getPossibleTypes(), ((IntegerLiteralTypeConstructor)typeConstructor1).getPossibleTypes()), null);
                            simpleType0 = KotlinTypeFactory.integerLiteralType(TypeAttributes.Companion.getEmpty(), integerLiteralTypeConstructor0, false);
                        }
                        else if(z) {
                            if(!((IntegerLiteralTypeConstructor)typeConstructor0).getPossibleTypes().contains(simpleType1)) {
                                simpleType1 = null;
                            }
                            simpleType0 = simpleType1;
                        }
                        else if(!(typeConstructor1 instanceof IntegerLiteralTypeConstructor) || !((IntegerLiteralTypeConstructor)typeConstructor1).getPossibleTypes().contains(simpleType0)) {
                            simpleType0 = null;
                        }
                    }
                    else {
                        simpleType0 = null;
                    }
                }
                return simpleType0;
            }
            return null;
        }
    }

    @NotNull
    public static final Companion Companion;
    public final long a;
    public final ModuleDescriptor b;
    public final Set c;
    public final SimpleType d;
    public final Lazy e;

    static {
        IntegerLiteralTypeConstructor.Companion = new Companion(null);
    }

    public IntegerLiteralTypeConstructor(long v, ModuleDescriptor moduleDescriptor0, Set set0, DefaultConstructorMarker defaultConstructorMarker0) {
        this.d = KotlinTypeFactory.integerLiteralType(TypeAttributes.Companion.getEmpty(), this, false);
        this.e = c.lazy(new b(this, 25));
        this.a = v;
        this.b = moduleDescriptor0;
        this.c = set0;
    }

    public static final boolean access$isContainsOnlyUnsignedTypes(IntegerLiteralTypeConstructor integerLiteralTypeConstructor0) {
        Iterable iterable0 = PrimitiveTypeUtilKt.getAllSignedLiteralTypes(integerLiteralTypeConstructor0.b);
        if(!(iterable0 instanceof Collection) || !((Collection)iterable0).isEmpty()) {
            for(Object object0: iterable0) {
                if(integerLiteralTypeConstructor0.c.contains(((KotlinType)object0))) {
                    return false;
                }
                if(false) {
                    break;
                }
            }
        }
        return true;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    public KotlinBuiltIns getBuiltIns() {
        return this.b.getBuiltIns();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @Nullable
    public ClassifierDescriptor getDeclarationDescriptor() {
        return null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    public List getParameters() {
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @NotNull
    public final Set getPossibleTypes() {
        return this.c;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    public Collection getSupertypes() {
        return (List)this.e.getValue();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public boolean isDenotable() {
        return false;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    public TypeConstructor refine(@NotNull KotlinTypeRefiner kotlinTypeRefiner0) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner0, "kotlinTypeRefiner");
        return this;
    }

    @Override
    @NotNull
    public String toString() {
        return "IntegerLiteralType" + ("[" + CollectionsKt___CollectionsKt.joinToString$default(this.c, ",", null, null, 0, null, bf.a.w, 30, null) + ']');
    }
}

