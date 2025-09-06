package ef;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInsResourceLoader;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypePreparator;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;

public final class a extends FunctionReference implements Function1 {
    public final int a;

    public a(int v, Object object0, int v1) {
        this.a = v1;
        super(v, object0);
    }

    @Override  // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
    public final String getName() {
        switch(this.a) {
            case 0: {
                return "loadResource";
            }
            case 1: {
                return "prepareType";
            }
            case 2: {
                return "getValueClassPropertyType";
            }
            case 3: {
                return "searchMethodsByNameWithoutBuiltinMagic";
            }
            default: {
                return "searchMethodsInSupertypesWithoutBuiltinMagic";
            }
        }
    }

    @Override  // kotlin.jvm.internal.CallableReference
    public final KDeclarationContainer getOwner() {
        switch(this.a) {
            case 0: {
                return Reflection.getOrCreateKotlinClass(BuiltInsResourceLoader.class);
            }
            case 1: {
                return Reflection.getOrCreateKotlinClass(KotlinTypePreparator.class);
            }
            case 2: {
                return Reflection.getOrCreateKotlinClass(DeserializedClassDescriptor.class);
            }
            case 3: {
                return Reflection.getOrCreateKotlinClass(LazyJavaClassMemberScope.class);
            }
            default: {
                return Reflection.getOrCreateKotlinClass(LazyJavaClassMemberScope.class);
            }
        }
    }

    @Override  // kotlin.jvm.internal.CallableReference
    public final String getSignature() {
        switch(this.a) {
            case 0: {
                return "loadResource(Ljava/lang/String;)Ljava/io/InputStream;";
            }
            case 1: {
                return "prepareType(Lorg/jetbrains/kotlin/types/model/KotlinTypeMarker;)Lorg/jetbrains/kotlin/types/UnwrappedType;";
            }
            case 2: {
                return "getValueClassPropertyType(Lorg/jetbrains/kotlin/name/Name;)Lorg/jetbrains/kotlin/types/SimpleType;";
            }
            case 3: {
                return "searchMethodsByNameWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;";
            }
            default: {
                return "searchMethodsInSupertypesWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;";
            }
        }
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        switch(this.a) {
            case 0: {
                Intrinsics.checkNotNullParameter(((String)object0), "p0");
                return ((BuiltInsResourceLoader)this.receiver).loadResource(((String)object0));
            }
            case 1: {
                Intrinsics.checkNotNullParameter(((KotlinTypeMarker)object0), "p0");
                return ((KotlinTypePreparator)this.receiver).prepareType(((KotlinTypeMarker)object0));
            }
            case 2: {
                Intrinsics.checkNotNullParameter(((Name)object0), "p0");
                return DeserializedClassDescriptor.access$getValueClassPropertyType(((DeserializedClassDescriptor)this.receiver), ((Name)object0));
            }
            case 3: {
                Intrinsics.checkNotNullParameter(((Name)object0), "p0");
                return LazyJavaClassMemberScope.access$searchMethodsByNameWithoutBuiltinMagic(((LazyJavaClassMemberScope)this.receiver), ((Name)object0));
            }
            default: {
                Intrinsics.checkNotNullParameter(((Name)object0), "p0");
                return LazyJavaClassMemberScope.access$searchMethodsInSupertypesWithoutBuiltinMagic(((LazyJavaClassMemberScope)this.receiver), ((Name)object0));
            }
        }
    }
}

