package kotlin.reflect.jvm.internal.impl.types;

import androidx.compose.foundation.text.selection.g1;
import androidx.compose.material3.ti;
import ff.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.TypeIntersectionScope;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.model.IntersectionTypeConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pd.c;

@SourceDebugExtension({"SMAP\nIntersectionTypeConstructor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntersectionTypeConstructor.kt\norg/jetbrains/kotlin/types/IntersectionTypeConstructor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 IntersectionTypeConstructor.kt\norg/jetbrains/kotlin/types/IntersectionTypeConstructorKt\n+ 5 IntersectionTypeConstructor.kt\norg/jetbrains/kotlin/types/IntersectionTypeConstructorKt$transformComponents$1\n*L\n1#1,120:1\n1#2:121\n1045#3:122\n1549#3:129\n1620#3,2:130\n1622#3:138\n98#4,6:123\n104#4:132\n105#4,4:134\n112#4,7:139\n99#5:133\n*S KotlinDebug\n*F\n+ 1 IntersectionTypeConstructor.kt\norg/jetbrains/kotlin/types/IntersectionTypeConstructor\n*L\n66#1:122\n89#1:129\n89#1:130,2\n89#1:138\n89#1:123,6\n89#1:132\n89#1:134,4\n89#1:139,7\n89#1:133\n*E\n"})
public final class IntersectionTypeConstructor implements TypeConstructor, IntersectionTypeConstructorMarker {
    public KotlinType a;
    public final LinkedHashSet b;
    public final int c;

    public IntersectionTypeConstructor(@NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(collection0, "typesToIntersect");
        super();
        collection0.isEmpty();
        LinkedHashSet linkedHashSet0 = new LinkedHashSet(collection0);
        this.b = linkedHashSet0;
        this.c = linkedHashSet0.hashCode();
    }

    @NotNull
    public final MemberScope createScopeForKotlinType() {
        return TypeIntersectionScope.Companion.create("member scope for intersection type", this.b);
    }

    @NotNull
    public final SimpleType createType() {
        return KotlinTypeFactory.simpleTypeWithNonTrivialMemberScope(TypeAttributes.Companion.getEmpty(), this, CollectionsKt__CollectionsKt.emptyList(), false, this.createScopeForKotlinType(), new g1(this, 27));
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof IntersectionTypeConstructor ? Intrinsics.areEqual(this.b, ((IntersectionTypeConstructor)object0).b) : false;
    }

    @Nullable
    public final KotlinType getAlternativeType() {
        return this.a;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    public KotlinBuiltIns getBuiltIns() {
        Object object0 = this.b.iterator().next();
        KotlinBuiltIns kotlinBuiltIns0 = ((KotlinType)object0).getConstructor().getBuiltIns();
        Intrinsics.checkNotNullExpressionValue(kotlinBuiltIns0, "intersectedTypes.iterato…xt().constructor.builtIns");
        return kotlinBuiltIns0;
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

    @Override  // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    public Collection getSupertypes() {
        return this.b;
    }

    @Override
    public int hashCode() {
        return this.c;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public boolean isDenotable() {
        return false;
    }

    @NotNull
    public final String makeDebugNameForIntersectionType(@NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "getProperTypeRelatedToStringify");
        kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor.makeDebugNameForIntersectionType..inlined.sortedBy.1 intersectionTypeConstructor$makeDebugNameForIntersectionType$$inlined$sortedBy$10 = new Comparator() {
            @Override
            public final int compare(Object object0, Object object1) {
                Intrinsics.checkNotNullExpressionValue(((KotlinType)object0), "it");
                String s = this.a.invoke(((KotlinType)object0)).toString();
                Intrinsics.checkNotNullExpressionValue(((KotlinType)object1), "it");
                return c.compareValues(s, this.a.invoke(((KotlinType)object1)).toString());
            }
        };
        return CollectionsKt___CollectionsKt.joinToString$default(CollectionsKt___CollectionsKt.sortedWith(this.b, intersectionTypeConstructor$makeDebugNameForIntersectionType$$inlined$sortedBy$10), " & ", "{", "}", 0, null, new ti(function10, 5), 24, null);
    }

    public static String makeDebugNameForIntersectionType$default(IntersectionTypeConstructor intersectionTypeConstructor0, Function1 function10, int v, Object object0) {
        if((v & 1) != 0) {
            function10 = e.w;
        }
        return intersectionTypeConstructor0.makeDebugNameForIntersectionType(function10);
    }

    @NotNull
    public IntersectionTypeConstructor refine(@NotNull KotlinTypeRefiner kotlinTypeRefiner0) {
        IntersectionTypeConstructor intersectionTypeConstructor0;
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner0, "kotlinTypeRefiner");
        Iterable iterable0 = this.getSupertypes();
        ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(iterable0, 10));
        Iterator iterator0 = iterable0.iterator();
        boolean z;
        for(z = false; true; z = true) {
            intersectionTypeConstructor0 = null;
            if(!iterator0.hasNext()) {
                break;
            }
            Object object0 = iterator0.next();
            arrayList0.add(((KotlinType)object0).refine(kotlinTypeRefiner0));
        }
        if(z) {
            KotlinType kotlinType0 = this.getAlternativeType();
            if(kotlinType0 != null) {
                intersectionTypeConstructor0 = kotlinType0.refine(kotlinTypeRefiner0);
            }
            intersectionTypeConstructor0 = new IntersectionTypeConstructor(arrayList0).setAlternative(((KotlinType)intersectionTypeConstructor0));
        }
        return intersectionTypeConstructor0 == null ? this : intersectionTypeConstructor0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public TypeConstructor refine(KotlinTypeRefiner kotlinTypeRefiner0) {
        return this.refine(kotlinTypeRefiner0);
    }

    @NotNull
    public final IntersectionTypeConstructor setAlternative(@Nullable KotlinType kotlinType0) {
        IntersectionTypeConstructor intersectionTypeConstructor0 = new IntersectionTypeConstructor(this.b);
        intersectionTypeConstructor0.a = kotlinType0;
        return intersectionTypeConstructor0;
    }

    @Override
    @NotNull
    public String toString() {
        return IntersectionTypeConstructor.makeDebugNameForIntersectionType$default(this, null, 1, null);
    }
}

