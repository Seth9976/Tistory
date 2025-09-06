package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import java.util.ArrayList;
import java.util.Collection;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.RawType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import te.b;

@SourceDebugExtension({"SMAP\nRawType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RawType.kt\norg/jetbrains/kotlin/load/java/lazy/types/RawTypeImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,98:1\n1726#2,3:99\n1549#2:102\n1620#2,3:103\n*S KotlinDebug\n*F\n+ 1 RawType.kt\norg/jetbrains/kotlin/load/java/lazy/types/RawTypeImpl\n*L\n80#1:99,3\n61#1:102\n61#1:103,3\n*E\n"})
public final class RawTypeImpl extends FlexibleType implements RawType {
    public RawTypeImpl(@NotNull SimpleType simpleType0, @NotNull SimpleType simpleType1) {
        Intrinsics.checkNotNullParameter(simpleType0, "lowerBound");
        Intrinsics.checkNotNullParameter(simpleType1, "upperBound");
        super(simpleType0, simpleType1);
        KotlinTypeChecker.DEFAULT.isSubtypeOf(simpleType0, simpleType1);
    }

    public static final ArrayList a(DescriptorRenderer descriptorRenderer0, SimpleType simpleType0) {
        Iterable iterable0 = simpleType0.getArguments();
        ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(iterable0, 10));
        for(Object object0: iterable0) {
            arrayList0.add(descriptorRenderer0.renderTypeProjection(((TypeProjection)object0)));
        }
        return arrayList0;
    }

    public static final String b(String s, String s1) {
        return StringsKt__StringsKt.contains$default(s, '<', false, 2, null) ? StringsKt__StringsKt.substringBefore$default(s, '<', null, 2, null) + '<' + s1 + '>' + StringsKt__StringsKt.substringAfterLast$default(s, '>', null, 2, null) : s;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.FlexibleType
    @NotNull
    public SimpleType getDelegate() {
        return this.getLowerBound();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.FlexibleType
    @NotNull
    public MemberScope getMemberScope() {
        ClassifierDescriptor classifierDescriptor0 = this.getConstructor().getDeclarationDescriptor();
        ClassDescriptor classDescriptor0 = classifierDescriptor0 instanceof ClassDescriptor ? ((ClassDescriptor)classifierDescriptor0) : null;
        if(classDescriptor0 == null) {
            throw new IllegalStateException(("Incorrect classifier: " + this.getConstructor().getDeclarationDescriptor()).toString());
        }
        MemberScope memberScope0 = classDescriptor0.getMemberScope(new RawSubstitution(null, 1, null));
        Intrinsics.checkNotNullExpressionValue(memberScope0, "classDescriptor.getMemberScope(RawSubstitution())");
        return memberScope0;
    }

    @NotNull
    public RawTypeImpl makeNullableAsSpecified(boolean z) {
        return new RawTypeImpl(this.getLowerBound().makeNullableAsSpecified(z), this.getUpperBound().makeNullableAsSpecified(z));
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public UnwrappedType makeNullableAsSpecified(boolean z) {
        return this.makeNullableAsSpecified(z);
    }

    @NotNull
    public FlexibleType refine(@NotNull KotlinTypeRefiner kotlinTypeRefiner0) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner0, "kotlinTypeRefiner");
        KotlinType kotlinType0 = kotlinTypeRefiner0.refineType(this.getLowerBound());
        Intrinsics.checkNotNull(kotlinType0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        KotlinType kotlinType1 = kotlinTypeRefiner0.refineType(this.getUpperBound());
        Intrinsics.checkNotNull(kotlinType1, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new RawTypeImpl(((SimpleType)kotlinType0), ((SimpleType)kotlinType1));  // 初始化器: Lkotlin/reflect/jvm/internal/impl/types/FlexibleType;-><init>(Lkotlin/reflect/jvm/internal/impl/types/SimpleType;Lkotlin/reflect/jvm/internal/impl/types/SimpleType;)V
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public KotlinType refine(KotlinTypeRefiner kotlinTypeRefiner0) {
        return this.refine(kotlinTypeRefiner0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public UnwrappedType refine(KotlinTypeRefiner kotlinTypeRefiner0) {
        return this.refine(kotlinTypeRefiner0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.FlexibleType
    @NotNull
    public String render(@NotNull DescriptorRenderer descriptorRenderer0, @NotNull DescriptorRendererOptions descriptorRendererOptions0) {
        Intrinsics.checkNotNullParameter(descriptorRenderer0, "renderer");
        Intrinsics.checkNotNullParameter(descriptorRendererOptions0, "options");
        String s = descriptorRenderer0.renderType(this.getLowerBound());
        String s1 = descriptorRenderer0.renderType(this.getUpperBound());
        if(descriptorRendererOptions0.getDebugMode()) {
            return "raw (" + s + ".." + s1 + ')';
        }
        if(this.getUpperBound().getArguments().isEmpty()) {
            return descriptorRenderer0.renderFlexibleType(s, s1, TypeUtilsKt.getBuiltIns(this));
        }
        ArrayList arrayList0 = RawTypeImpl.a(descriptorRenderer0, this.getLowerBound());
        ArrayList arrayList1 = RawTypeImpl.a(descriptorRenderer0, this.getUpperBound());
        String s2 = CollectionsKt___CollectionsKt.joinToString$default(arrayList0, ", ", null, null, 0, null, b.w, 30, null);
        Iterable iterable0 = CollectionsKt___CollectionsKt.zip(arrayList0, arrayList1);
        if(!(iterable0 instanceof Collection) || !((Collection)iterable0).isEmpty()) {
            for(Object object0: iterable0) {
                String s3 = (String)((Pair)object0).getSecond();
                if(!Intrinsics.areEqual(((String)((Pair)object0).getFirst()), StringsKt__StringsKt.removePrefix(s3, "out ")) && !Intrinsics.areEqual(s3, "*")) {
                    goto label_20;
                }
            }
        }
        s1 = RawTypeImpl.b(s1, s2);
    label_20:
        String s4 = RawTypeImpl.b(s, s2);
        return Intrinsics.areEqual(s4, s1) ? s4 : descriptorRenderer0.renderFlexibleType(s4, s1, TypeUtilsKt.getBuiltIns(this));
    }

    @NotNull
    public RawTypeImpl replaceAttributes(@NotNull TypeAttributes typeAttributes0) {
        Intrinsics.checkNotNullParameter(typeAttributes0, "newAttributes");
        return new RawTypeImpl(this.getLowerBound().replaceAttributes(typeAttributes0), this.getUpperBound().replaceAttributes(typeAttributes0));
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public UnwrappedType replaceAttributes(TypeAttributes typeAttributes0) {
        return this.replaceAttributes(typeAttributes0);
    }
}

