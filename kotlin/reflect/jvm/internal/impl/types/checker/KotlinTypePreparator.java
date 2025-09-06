package kotlin.reflect.jvm.internal.impl.types.checker;

import ef.a;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorImpl;
import kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerValueTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypePreparator;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;

@SourceDebugExtension({"SMAP\nKotlinTypePreparator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KotlinTypePreparator.kt\norg/jetbrains/kotlin/types/checker/KotlinTypePreparator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 IntersectionTypeConstructor.kt\norg/jetbrains/kotlin/types/IntersectionTypeConstructorKt\n+ 5 IntersectionTypeConstructor.kt\norg/jetbrains/kotlin/types/IntersectionTypeConstructorKt$transformComponents$1\n*L\n1#1,76:1\n1#2:77\n1549#3:78\n1620#3,3:79\n1549#3:82\n1620#3,3:83\n1549#3:92\n1620#3,2:93\n1622#3:101\n98#4,6:86\n104#4:95\n105#4,4:97\n112#4,7:102\n99#5:96\n*S KotlinDebug\n*F\n+ 1 KotlinTypePreparator.kt\norg/jetbrains/kotlin/types/checker/KotlinTypePreparator\n*L\n27#1:78\n27#1:79,3\n37#1:82\n37#1:83,3\n48#1:92\n48#1:93,2\n48#1:101\n48#1:86,6\n48#1:95\n48#1:97,4\n48#1:102,7\n48#1:96\n*E\n"})
public abstract class KotlinTypePreparator extends AbstractTypePreparator {
    public static final class Default extends KotlinTypePreparator {
        @NotNull
        public static final Default INSTANCE;

        static {
            Default.INSTANCE = new Default();  // 初始化器: Lkotlin/reflect/jvm/internal/impl/types/checker/KotlinTypePreparator;-><init>()V
        }
    }

    public static SimpleType a(SimpleType simpleType0) {
        boolean z = false;
        TypeConstructor typeConstructor0 = simpleType0.getConstructor();
        KotlinType kotlinType0 = null;
        if(typeConstructor0 instanceof CapturedTypeConstructorImpl) {
            TypeProjection typeProjection0 = ((CapturedTypeConstructorImpl)typeConstructor0).getProjection();
            if(typeProjection0.getProjectionKind() != Variance.IN_VARIANCE) {
                typeProjection0 = null;
            }
            if(typeProjection0 != null) {
                KotlinType kotlinType1 = typeProjection0.getType();
                if(kotlinType1 != null) {
                    kotlinType0 = kotlinType1.unwrap();
                }
            }
            if(((CapturedTypeConstructorImpl)typeConstructor0).getNewTypeConstructor() == null) {
                TypeProjection typeProjection1 = ((CapturedTypeConstructorImpl)typeConstructor0).getProjection();
                Iterable iterable0 = ((CapturedTypeConstructorImpl)typeConstructor0).getSupertypes();
                ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(iterable0, 10));
                for(Object object0: iterable0) {
                    arrayList0.add(((KotlinType)object0).unwrap());
                }
                ((CapturedTypeConstructorImpl)typeConstructor0).setNewTypeConstructor(new NewCapturedTypeConstructor(typeProjection1, arrayList0, null, 4, null));
            }
            NewCapturedTypeConstructor newCapturedTypeConstructor0 = ((CapturedTypeConstructorImpl)typeConstructor0).getNewTypeConstructor();
            Intrinsics.checkNotNull(newCapturedTypeConstructor0);
            TypeAttributes typeAttributes0 = simpleType0.getAttributes();
            boolean z1 = simpleType0.isMarkedNullable();
            return new NewCapturedType(CaptureStatus.FOR_SUBTYPING, newCapturedTypeConstructor0, kotlinType0, typeAttributes0, z1, false, 0x20, null);
        }
        if(typeConstructor0 instanceof IntegerValueTypeConstructor) {
            Iterable iterable1 = ((IntegerValueTypeConstructor)typeConstructor0).getSupertypes();
            ArrayList arrayList1 = new ArrayList(l.collectionSizeOrDefault(iterable1, 10));
            for(Object object1: iterable1) {
                KotlinType kotlinType2 = TypeUtils.makeNullableAsSpecified(((KotlinType)object1), simpleType0.isMarkedNullable());
                Intrinsics.checkNotNullExpressionValue(kotlinType2, "makeNullableAsSpecified(it, type.isMarkedNullable)");
                arrayList1.add(kotlinType2);
            }
            IntersectionTypeConstructor intersectionTypeConstructor0 = new IntersectionTypeConstructor(arrayList1);
            return KotlinTypeFactory.simpleTypeWithNonTrivialMemberScope(simpleType0.getAttributes(), intersectionTypeConstructor0, CollectionsKt__CollectionsKt.emptyList(), false, simpleType0.getMemberScope());
        }
        if(typeConstructor0 instanceof IntersectionTypeConstructor && simpleType0.isMarkedNullable()) {
            IntersectionTypeConstructor intersectionTypeConstructor1 = (IntersectionTypeConstructor)typeConstructor0;
            Iterable iterable2 = intersectionTypeConstructor1.getSupertypes();
            ArrayList arrayList2 = new ArrayList(l.collectionSizeOrDefault(iterable2, 10));
            for(Object object2: iterable2) {
                arrayList2.add(TypeUtilsKt.makeNullable(((KotlinType)object2)));
                z = true;
            }
            if(z) {
                KotlinType kotlinType3 = intersectionTypeConstructor1.getAlternativeType();
                if(kotlinType3 != null) {
                    kotlinType0 = TypeUtilsKt.makeNullable(kotlinType3);
                }
                kotlinType0 = new IntersectionTypeConstructor(arrayList2).setAlternative(kotlinType0);
            }
            if(kotlinType0 != null) {
                intersectionTypeConstructor1 = kotlinType0;
            }
            return intersectionTypeConstructor1.createType();
        }
        return simpleType0;
    }

    @NotNull
    public UnwrappedType prepareType(@NotNull KotlinTypeMarker kotlinTypeMarker0) {
        Intrinsics.checkNotNullParameter(kotlinTypeMarker0, "type");
        if(!(kotlinTypeMarker0 instanceof KotlinType)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        UnwrappedType unwrappedType0 = ((KotlinType)kotlinTypeMarker0).unwrap();
        if(unwrappedType0 instanceof SimpleType) {
            return TypeWithEnhancementKt.inheritEnhancement(KotlinTypePreparator.a(((SimpleType)unwrappedType0)), unwrappedType0, new a(1, this, 1));
        }
        if(!(unwrappedType0 instanceof FlexibleType)) {
            throw new NoWhenBranchMatchedException();
        }
        SimpleType simpleType0 = KotlinTypePreparator.a(((FlexibleType)unwrappedType0).getLowerBound());
        SimpleType simpleType1 = KotlinTypePreparator.a(((FlexibleType)unwrappedType0).getUpperBound());
        return simpleType0 != ((FlexibleType)unwrappedType0).getLowerBound() || simpleType1 != ((FlexibleType)unwrappedType0).getUpperBound() ? TypeWithEnhancementKt.inheritEnhancement(KotlinTypeFactory.flexibleType(simpleType0, simpleType1), unwrappedType0, new a(1, this, 1)) : TypeWithEnhancementKt.inheritEnhancement(unwrappedType0, unwrappedType0, new a(1, this, 1));
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.AbstractTypePreparator
    public KotlinTypeMarker prepareType(KotlinTypeMarker kotlinTypeMarker0) {
        return this.prepareType(kotlinTypeMarker0);
    }
}

