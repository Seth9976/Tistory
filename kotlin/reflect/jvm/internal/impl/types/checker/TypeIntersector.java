package kotlin.reflect.jvm.internal.impl.types.checker;

import d0.s;
import gf.f;
import gf.g;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.SpecialTypesKt;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import org.jetbrains.annotations.NotNull;

@SourceDebugExtension({"SMAP\nIntersectionType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntersectionType.kt\norg/jetbrains/kotlin/types/checker/TypeIntersector\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,183:1\n1549#2:184\n1620#2,2:185\n1622#2:188\n1789#2,3:189\n1620#2,3:192\n1549#2:195\n1620#2,3:196\n2661#2,7:199\n1747#2,3:206\n1#3:187\n*S KotlinDebug\n*F\n+ 1 IntersectionType.kt\norg/jetbrains/kotlin/types/checker/TypeIntersector\n*L\n80#1:184\n80#1:185,2\n80#1:188\n87#1:189,3\n98#1:192,3\n104#1:195\n104#1:196,3\n104#1:199,7\n137#1:206,3\n*E\n"})
public final class TypeIntersector {
    @NotNull
    public static final TypeIntersector INSTANCE;

    static {
        TypeIntersector.INSTANCE = new TypeIntersector();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public static ArrayList a(AbstractCollection abstractCollection0, Function2 function20) {
        ArrayList arrayList0 = new ArrayList(abstractCollection0);
        Iterator iterator0 = arrayList0.iterator();
        Intrinsics.checkNotNullExpressionValue(iterator0, "filteredTypes.iterator()");
    label_3:
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            SimpleType simpleType0 = (SimpleType)object0;
            if(!arrayList0.isEmpty()) {
                Iterator iterator1 = arrayList0.iterator();
                while(true) {
                    if(!iterator1.hasNext()) {
                        continue label_3;
                    }
                    Object object1 = iterator1.next();
                    SimpleType simpleType1 = (SimpleType)object1;
                    if(simpleType1 != simpleType0) {
                        Intrinsics.checkNotNullExpressionValue(simpleType1, "lower");
                        Intrinsics.checkNotNullExpressionValue(simpleType0, "upper");
                        if(((Boolean)function20.invoke(simpleType1, simpleType0)).booleanValue()) {
                            break;
                        }
                    }
                }
                iterator0.remove();
            }
        }
        return arrayList0;
    }

    public static final boolean access$isStrictSupertype(TypeIntersector typeIntersector0, KotlinType kotlinType0, KotlinType kotlinType1) {
        typeIntersector0.getClass();
        NewKotlinTypeCheckerImpl newKotlinTypeCheckerImpl0 = NewKotlinTypeChecker.Companion.getDefault();
        return newKotlinTypeCheckerImpl0.isSubtypeOf(kotlinType0, kotlinType1) && !newKotlinTypeCheckerImpl0.isSubtypeOf(kotlinType1, kotlinType0);
    }

    @NotNull
    public final SimpleType intersectTypes$descriptors(@NotNull List list0) {
        Intrinsics.checkNotNullParameter(list0, "types");
        list0.size();
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: list0) {
            SimpleType simpleType0 = (SimpleType)object0;
            if(simpleType0.getConstructor() instanceof IntersectionTypeConstructor) {
                Collection collection0 = simpleType0.getConstructor().getSupertypes();
                Intrinsics.checkNotNullExpressionValue(collection0, "type.constructor.supertypes");
                ArrayList arrayList1 = new ArrayList(l.collectionSizeOrDefault(collection0, 10));
                for(Object object1: collection0) {
                    Intrinsics.checkNotNullExpressionValue(((KotlinType)object1), "it");
                    SimpleType simpleType1 = FlexibleTypesKt.upperIfFlexible(((KotlinType)object1));
                    if(simpleType0.isMarkedNullable()) {
                        simpleType1 = simpleType1.makeNullableAsSpecified(true);
                    }
                    arrayList1.add(simpleType1);
                }
                arrayList0.addAll(arrayList1);
            }
            else {
                arrayList0.add(simpleType0);
            }
        }
        f f0 = f.a;
        for(Object object2: arrayList0) {
            f0 = f0.a(((UnwrappedType)object2));
        }
        LinkedHashSet linkedHashSet0 = new LinkedHashSet();
        for(Object object3: arrayList0) {
            SimpleType simpleType2 = (SimpleType)object3;
            if(f0 == f.d) {
                if(simpleType2 instanceof NewCapturedType) {
                    simpleType2 = SpecialTypesKt.withNotNullProjection(((NewCapturedType)simpleType2));
                }
                simpleType2 = SpecialTypesKt.makeSimpleTypeDefinitelyNotNullOrNotNull$default(simpleType2, false, 1, null);
            }
            linkedHashSet0.add(simpleType2);
        }
        ArrayList arrayList2 = new ArrayList(l.collectionSizeOrDefault(list0, 10));
        for(Object object4: list0) {
            arrayList2.add(((SimpleType)object4).getAttributes());
        }
        Iterator iterator5 = arrayList2.iterator();
        if(!iterator5.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can\'t be reduced.");
        }
        TypeAttributes typeAttributes0;
        for(typeAttributes0 = iterator5.next(); iterator5.hasNext(); typeAttributes0 = typeAttributes0.intersect(((TypeAttributes)object5))) {
            Object object5 = iterator5.next();
        }
        if(linkedHashSet0.size() == 1) {
            return ((SimpleType)CollectionsKt___CollectionsKt.single(linkedHashSet0)).replaceAttributes(typeAttributes0);
        }
        new s(linkedHashSet0, 17);
        ArrayList arrayList3 = TypeIntersector.a(linkedHashSet0, new g(2, this, 0));
        arrayList3.isEmpty();
        SimpleType simpleType3 = IntegerLiteralTypeConstructor.Companion.findIntersectionType(arrayList3);
        if(simpleType3 != null) {
            return simpleType3.replaceAttributes(typeAttributes0);
        }
        ArrayList arrayList4 = TypeIntersector.a(arrayList3, new g(2, NewKotlinTypeChecker.Companion.getDefault(), 1));
        arrayList4.isEmpty();
        return arrayList4.size() >= 2 ? new IntersectionTypeConstructor(linkedHashSet0).createType().replaceAttributes(typeAttributes0) : ((SimpleType)CollectionsKt___CollectionsKt.single(arrayList4)).replaceAttributes(typeAttributes0);
    }
}

