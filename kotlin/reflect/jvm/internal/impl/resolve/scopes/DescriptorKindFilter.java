package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import a5.b;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nMemberScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MemberScope.kt\norg/jetbrains/kotlin/resolve/scopes/DescriptorKindFilter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 MemberScope.kt\norg/jetbrains/kotlin/resolve/scopes/DescriptorKindFilter$Companion\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,261:1\n1855#2,2:262\n1726#2,3:264\n288#2,2:267\n1603#2,9:269\n1855#2:278\n1856#2:280\n1612#2:281\n1603#2,9:286\n1855#2:295\n1856#2:297\n1612#2:298\n766#2:303\n857#2,2:304\n1603#2,9:306\n1855#2:315\n1856#2:317\n1612#2:318\n1#3:279\n1#3:296\n1#3:316\n210#4:282\n210#4:299\n3792#5:283\n4307#5,2:284\n3792#5:300\n4307#5,2:301\n*S KotlinDebug\n*F\n+ 1 MemberScope.kt\norg/jetbrains/kotlin/resolve/scopes/DescriptorKindFilter\n*L\n98#1:262,2\n103#1:264,3\n129#1:267,2\n131#1:269,9\n131#1:278\n131#1:280\n131#1:281\n197#1:286,9\n197#1:295\n197#1:297\n197#1:298\n203#1:303\n203#1:304,2\n204#1:306,9\n204#1:315\n204#1:317\n204#1:318\n131#1:279\n197#1:296\n204#1:316\n196#1:282\n202#1:299\n196#1:283\n196#1:284,2\n202#1:300\n202#1:301,2\n*E\n"})
public final class DescriptorKindFilter {
    @SourceDebugExtension({"SMAP\nMemberScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MemberScope.kt\norg/jetbrains/kotlin/resolve/scopes/DescriptorKindFilter$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,261:1\n1#2:262\n3792#3:263\n4307#3,2:264\n*S KotlinDebug\n*F\n+ 1 MemberScope.kt\norg/jetbrains/kotlin/resolve/scopes/DescriptorKindFilter$Companion\n*L\n210#1:263\n210#1:264,2\n*E\n"})
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public static final int access$nextMask(Companion descriptorKindFilter$Companion0) {
            descriptorKindFilter$Companion0.getClass();
            DescriptorKindFilter.c = 0x100;
            return 0x80;
        }

        public final int getALL_KINDS_MASK() [...] // 潜在的解密器

        public final int getCLASSIFIERS_MASK() [...] // 潜在的解密器

        public final int getFUNCTIONS_MASK() [...] // 潜在的解密器

        public final int getNON_SINGLETON_CLASSIFIERS_MASK() [...] // 潜在的解密器

        public final int getPACKAGES_MASK() {
            return DescriptorKindFilter.g;
        }

        public final int getSINGLETON_CLASSIFIERS_MASK() [...] // 潜在的解密器

        public final int getTYPE_ALIASES_MASK() [...] // 潜在的解密器

        public final int getVARIABLES_MASK() [...] // 潜在的解密器
    }

    @JvmField
    @NotNull
    public static final DescriptorKindFilter ALL;
    @JvmField
    @NotNull
    public static final DescriptorKindFilter CALLABLES;
    @JvmField
    @NotNull
    public static final DescriptorKindFilter CLASSIFIERS;
    @NotNull
    public static final Companion Companion;
    @JvmField
    @NotNull
    public static final DescriptorKindFilter FUNCTIONS;
    @JvmField
    @NotNull
    public static final DescriptorKindFilter NON_SINGLETON_CLASSIFIERS;
    @JvmField
    @NotNull
    public static final DescriptorKindFilter PACKAGES;
    @JvmField
    @NotNull
    public static final DescriptorKindFilter SINGLETON_CLASSIFIERS;
    @JvmField
    @NotNull
    public static final DescriptorKindFilter TYPE_ALIASES;
    @JvmField
    @NotNull
    public static final DescriptorKindFilter VALUES;
    @JvmField
    @NotNull
    public static final DescriptorKindFilter VARIABLES;
    public final List a;
    public final int b;
    public static int c;
    public static final int d;
    public static final int e;
    public static final int f;
    public static final int g;
    public static final int h;
    public static final int i;
    public static final int j;
    public static final int k;
    public static final ArrayList l;
    public static final ArrayList m;

    static {
        a a1;
        a a0;
        Companion descriptorKindFilter$Companion0 = new Companion(null);
        DescriptorKindFilter.Companion = descriptorKindFilter$Companion0;
        DescriptorKindFilter.c = 1;
        int v = Companion.access$nextMask(descriptorKindFilter$Companion0);
        DescriptorKindFilter.d = v;
        int v1 = Companion.access$nextMask(descriptorKindFilter$Companion0);
        DescriptorKindFilter.e = v1;
        int v2 = Companion.access$nextMask(descriptorKindFilter$Companion0);
        DescriptorKindFilter.f = v2;
        int v3 = Companion.access$nextMask(descriptorKindFilter$Companion0);
        DescriptorKindFilter.g = v3;
        int v4 = Companion.access$nextMask(descriptorKindFilter$Companion0);
        DescriptorKindFilter.h = v4;
        int v5 = Companion.access$nextMask(descriptorKindFilter$Companion0);
        DescriptorKindFilter.i = v5;
        int v6 = Companion.access$nextMask(descriptorKindFilter$Companion0);
        DescriptorKindFilter.j = v6 - 1;
        int v7 = v | v1 | v2;
        DescriptorKindFilter.k = v7;
        DescriptorKindFilter.ALL = new DescriptorKindFilter(v6 - 1, null, 2, null);
        DescriptorKindFilter.CALLABLES = new DescriptorKindFilter(v4 | v5, null, 2, null);
        DescriptorKindFilter.NON_SINGLETON_CLASSIFIERS = new DescriptorKindFilter(v, null, 2, null);
        DescriptorKindFilter.SINGLETON_CLASSIFIERS = new DescriptorKindFilter(v1, null, 2, null);
        DescriptorKindFilter.TYPE_ALIASES = new DescriptorKindFilter(v2, null, 2, null);
        DescriptorKindFilter.CLASSIFIERS = new DescriptorKindFilter(v7, null, 2, null);
        DescriptorKindFilter.PACKAGES = new DescriptorKindFilter(v3, null, 2, null);
        DescriptorKindFilter.FUNCTIONS = new DescriptorKindFilter(v4, null, 2, null);
        DescriptorKindFilter.VARIABLES = new DescriptorKindFilter(v5, null, 2, null);
        DescriptorKindFilter.VALUES = new DescriptorKindFilter(v1 | v4 | v5, null, 2, null);
        Class class0 = DescriptorKindFilter.class;
        Field[] arr_field = class0.getFields();
        Intrinsics.checkNotNullExpressionValue(arr_field, "T::class.java.fields");
        ArrayList arrayList0 = new ArrayList();
        for(int v9 = 0; v9 < arr_field.length; ++v9) {
            Field field0 = arr_field[v9];
            if(Modifier.isStatic(field0.getModifiers())) {
                arrayList0.add(field0);
            }
        }
        ArrayList arrayList1 = new ArrayList();
        for(Object object0: arrayList0) {
            Field field1 = (Field)object0;
            Object object1 = field1.get(null);
            DescriptorKindFilter descriptorKindFilter0 = object1 instanceof DescriptorKindFilter ? ((DescriptorKindFilter)object1) : null;
            if(descriptorKindFilter0 == null) {
                a0 = null;
            }
            else {
                String s = field1.getName();
                Intrinsics.checkNotNullExpressionValue(s, "field.name");
                a0 = new a(descriptorKindFilter0.b, s);
            }
            if(a0 != null) {
                arrayList1.add(a0);
            }
        }
        DescriptorKindFilter.l = arrayList1;
        Field[] arr_field1 = class0.getFields();
        Intrinsics.checkNotNullExpressionValue(arr_field1, "T::class.java.fields");
        ArrayList arrayList2 = new ArrayList();
        for(int v8 = 0; v8 < arr_field1.length; ++v8) {
            Field field2 = arr_field1[v8];
            if(Modifier.isStatic(field2.getModifiers())) {
                arrayList2.add(field2);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for(Object object2: arrayList2) {
            if(Intrinsics.areEqual(((Field)object2).getType(), Integer.TYPE)) {
                arrayList3.add(object2);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for(Object object3: arrayList3) {
            Field field3 = (Field)object3;
            Object object4 = field3.get(null);
            Intrinsics.checkNotNull(object4, "null cannot be cast to non-null type kotlin.Int");
            int v10 = (int)(((Integer)object4));
            if(v10 == (-v10 & v10)) {
                String s1 = field3.getName();
                Intrinsics.checkNotNullExpressionValue(s1, "field.name");
                a1 = new a(v10, s1);
            }
            else {
                a1 = null;
            }
            if(a1 != null) {
                arrayList4.add(a1);
            }
        }
        DescriptorKindFilter.m = arrayList4;
    }

    public DescriptorKindFilter(int v, @NotNull List list0) {
        Intrinsics.checkNotNullParameter(list0, "excludes");
        super();
        this.a = list0;
        for(Object object0: list0) {
            v &= ~((DescriptorKindExclude)object0).getFullyExcludedDescriptorKinds();
        }
        this.b = v;
    }

    public DescriptorKindFilter(int v, List list0, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 2) != 0) {
            list0 = CollectionsKt__CollectionsKt.emptyList();
        }
        this(v, list0);
    }

    public final boolean acceptsKinds(int v) {
        return (v & this.b) != 0;
    }

    public static final int access$getNextMaskValue$cp() [...] // 潜在的解密器

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        Class class0 = object0 == null ? null : object0.getClass();
        if(!Intrinsics.areEqual(DescriptorKindFilter.class, class0)) {
            return false;
        }
        Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter");
        return Intrinsics.areEqual(this.a, ((DescriptorKindFilter)object0).a) ? this.b == ((DescriptorKindFilter)object0).b : false;
    }

    @NotNull
    public final List getExcludes() {
        return this.a;
    }

    public final int getKindMask() {
        return this.b;
    }

    @Override
    public int hashCode() {
        return this.a.hashCode() * 0x1F + this.b;
    }

    @Nullable
    public final DescriptorKindFilter restrictedToKindsOrNull(int v) {
        int v1 = v & this.b;
        return v1 == 0 ? null : new DescriptorKindFilter(v1, this.a);
    }

    @Override
    @NotNull
    public String toString() {
        Object object0 = null;
        for(Object object1: DescriptorKindFilter.l) {
            if(((a)object1).a == this.b) {
                object0 = object1;
                break;
            }
        }
        String s = ((a)object0) == null ? null : ((a)object0).b;
        if(s == null) {
            ArrayList arrayList0 = new ArrayList();
            for(Object object2: DescriptorKindFilter.m) {
                a a0 = (a)object2;
                String s1 = this.acceptsKinds(a0.a) ? a0.b : null;
                if(s1 != null) {
                    arrayList0.add(s1);
                }
            }
            s = CollectionsKt___CollectionsKt.joinToString$default(arrayList0, " | ", null, null, 0, null, null, 62, null);
        }
        StringBuilder stringBuilder0 = b.v("DescriptorKindFilter(", s, ", ");
        stringBuilder0.append(this.a);
        stringBuilder0.append(')');
        return stringBuilder0.toString();
    }
}

