package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nNewCapturedType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NewCapturedType.kt\norg/jetbrains/kotlin/types/checker/NewCapturedTypeKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,290:1\n1#2:291\n1#2:310\n1655#3,8:292\n1603#3,9:300\n1855#3:309\n1856#3:311\n1612#3:312\n1726#3,3:313\n1549#3:316\n1620#3,3:317\n1620#3,3:320\n1549#3:323\n1620#3,3:324\n*S KotlinDebug\n*F\n+ 1 NewCapturedType.kt\norg/jetbrains/kotlin/types/checker/NewCapturedTypeKt\n*L\n122#1:310\n117#1:292,8\n122#1:300,9\n122#1:309\n122#1:311\n122#1:312\n154#1:313,3\n156#1:316\n156#1:317,3\n176#1:320,3\n81#1:323\n81#1:324,3\n*E\n"})
public final class NewCapturedTypeKt {
    @Nullable
    public static final SimpleType captureFromArguments(@NotNull SimpleType simpleType0, @NotNull CaptureStatus captureStatus0) {
        Intrinsics.checkNotNullParameter(simpleType0, "type");
        Intrinsics.checkNotNullParameter(captureStatus0, "status");
        if(simpleType0.getArguments().size() == simpleType0.getConstructor().getParameters().size()) {
            List list0 = simpleType0.getArguments();
            if(!(list0 instanceof Collection) || !list0.isEmpty()) {
                for(Object object0: list0) {
                    if(((TypeProjection)object0).getProjectionKind() != Variance.INVARIANT) {
                        List list1 = simpleType0.getConstructor().getParameters();
                        Intrinsics.checkNotNullExpressionValue(list1, "type.constructor.parameters");
                        Iterable iterable0 = CollectionsKt___CollectionsKt.zip(list0, list1);
                        ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(iterable0, 10));
                        for(Object object1: iterable0) {
                            TypeProjection typeProjection0 = (TypeProjection)((Pair)object1).component1();
                            TypeParameterDescriptor typeParameterDescriptor0 = (TypeParameterDescriptor)((Pair)object1).component2();
                            if(typeProjection0.getProjectionKind() != Variance.INVARIANT) {
                                UnwrappedType unwrappedType0 = typeProjection0.isStarProjection() || typeProjection0.getProjectionKind() != Variance.IN_VARIANCE ? null : typeProjection0.getType().unwrap();
                                Intrinsics.checkNotNullExpressionValue(typeParameterDescriptor0, "parameter");
                                typeProjection0 = TypeUtilsKt.asTypeProjection(new NewCapturedType(captureStatus0, unwrappedType0, typeProjection0, typeParameterDescriptor0));
                            }
                            arrayList0.add(typeProjection0);
                        }
                        TypeConstructor typeConstructor0 = simpleType0.getConstructor();
                        TypeSubstitutor typeSubstitutor0 = TypeConstructorSubstitution.Companion.create(typeConstructor0, arrayList0).buildSubstitutor();
                        int v = list0.size();
                        for(int v1 = 0; v1 < v; ++v1) {
                            TypeProjection typeProjection1 = (TypeProjection)list0.get(v1);
                            TypeProjection typeProjection2 = (TypeProjection)arrayList0.get(v1);
                            if(typeProjection1.getProjectionKind() != Variance.INVARIANT) {
                                List list2 = ((TypeParameterDescriptor)simpleType0.getConstructor().getParameters().get(v1)).getUpperBounds();
                                Intrinsics.checkNotNullExpressionValue(list2, "type.constructor.parameters[index].upperBounds");
                                ArrayList arrayList1 = new ArrayList();
                                for(Object object2: list2) {
                                    UnwrappedType unwrappedType1 = typeSubstitutor0.safeSubstitute(((KotlinType)object2), Variance.INVARIANT).unwrap();
                                    arrayList1.add(Default.INSTANCE.prepareType(unwrappedType1));
                                }
                                if(!typeProjection1.isStarProjection() && typeProjection1.getProjectionKind() == Variance.OUT_VARIANCE) {
                                    UnwrappedType unwrappedType2 = typeProjection1.getType().unwrap();
                                    arrayList1.add(Default.INSTANCE.prepareType(unwrappedType2));
                                }
                                KotlinType kotlinType0 = typeProjection2.getType();
                                Intrinsics.checkNotNull(kotlinType0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedType");
                                ((NewCapturedType)kotlinType0).getConstructor().initializeSupertypes(arrayList1);
                            }
                        }
                        return arrayList0 == null ? null : KotlinTypeFactory.simpleType$default(simpleType0.getAttributes(), simpleType0.getConstructor(), arrayList0, simpleType0.isMarkedNullable(), null, 16, null);
                    }
                    if(false) {
                        break;
                    }
                }
            }
        }
        return null;
    }
}

