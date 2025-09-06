package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.l;
import kotlin.collections.w;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import org.jetbrains.annotations.NotNull;
import ue.h;

public final class SignatureEnhancementBuilder.ClassEnhancementBuilder {
    @SourceDebugExtension({"SMAP\npredefinedEnhancementInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 predefinedEnhancementInfo.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/SignatureEnhancementBuilder$ClassEnhancementBuilder$FunctionEnhancementBuilder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,254:1\n1208#2,2:255\n1238#2,4:257\n1208#2,2:261\n1238#2,4:263\n1549#2:267\n1620#2,3:268\n1549#2:271\n1620#2,3:272\n*S KotlinDebug\n*F\n+ 1 predefinedEnhancementInfo.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/SignatureEnhancementBuilder$ClassEnhancementBuilder$FunctionEnhancementBuilder\n*L\n226#1:255,2\n226#1:257,4\n237#1:261,2\n237#1:263,4\n245#1:267\n245#1:268,3\n246#1:271\n246#1:272,3\n*E\n"})
    public final class FunctionEnhancementBuilder {
        public final String a;
        public final ArrayList b;
        public Pair c;
        public final SignatureEnhancementBuilder.ClassEnhancementBuilder d;

        public FunctionEnhancementBuilder(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "functionName");
            this.d = signatureEnhancementBuilder$ClassEnhancementBuilder0;
            super();
            this.a = s;
            this.b = new ArrayList();
            this.c = TuplesKt.to("V", null);
        }

        @NotNull
        public final Pair build() {
            SignatureBuildingComponents signatureBuildingComponents0 = SignatureBuildingComponents.INSTANCE;
            String s = this.d.getClassName();
            ArrayList arrayList0 = this.b;
            ArrayList arrayList1 = new ArrayList(l.collectionSizeOrDefault(arrayList0, 10));
            for(Object object0: arrayList0) {
                arrayList1.add(((String)((Pair)object0).getFirst()));
            }
            String s1 = signatureBuildingComponents0.signature(s, signatureBuildingComponents0.jvmDescriptor(this.a, arrayList1, ((String)this.c.getFirst())));
            TypeEnhancementInfo typeEnhancementInfo0 = (TypeEnhancementInfo)this.c.getSecond();
            ArrayList arrayList2 = new ArrayList(l.collectionSizeOrDefault(arrayList0, 10));
            for(Object object1: arrayList0) {
                arrayList2.add(((TypeEnhancementInfo)((Pair)object1).getSecond()));
            }
            return TuplesKt.to(s1, new PredefinedFunctionEnhancementInfo(typeEnhancementInfo0, arrayList2));
        }

        public final void parameter(@NotNull String s, @NotNull JavaTypeQualifiers[] arr_javaTypeQualifiers) {
            TypeEnhancementInfo typeEnhancementInfo0;
            Intrinsics.checkNotNullParameter(s, "type");
            Intrinsics.checkNotNullParameter(arr_javaTypeQualifiers, "qualifiers");
            ArrayList arrayList0 = this.b;
            if(arr_javaTypeQualifiers.length == 0) {
                typeEnhancementInfo0 = null;
            }
            else {
                Iterable iterable0 = ArraysKt___ArraysKt.withIndex(arr_javaTypeQualifiers);
                LinkedHashMap linkedHashMap0 = new LinkedHashMap(c.coerceAtLeast(w.mapCapacity(l.collectionSizeOrDefault(iterable0, 10)), 16));
                for(Object object0: iterable0) {
                    linkedHashMap0.put(((IndexedValue)object0).getIndex(), ((JavaTypeQualifiers)((IndexedValue)object0).getValue()));
                }
                typeEnhancementInfo0 = new TypeEnhancementInfo(linkedHashMap0);
            }
            arrayList0.add(TuplesKt.to(s, typeEnhancementInfo0));
        }

        public final void returns(@NotNull String s, @NotNull JavaTypeQualifiers[] arr_javaTypeQualifiers) {
            Intrinsics.checkNotNullParameter(s, "type");
            Intrinsics.checkNotNullParameter(arr_javaTypeQualifiers, "qualifiers");
            Iterable iterable0 = ArraysKt___ArraysKt.withIndex(arr_javaTypeQualifiers);
            LinkedHashMap linkedHashMap0 = new LinkedHashMap(c.coerceAtLeast(w.mapCapacity(l.collectionSizeOrDefault(iterable0, 10)), 16));
            for(Object object0: iterable0) {
                linkedHashMap0.put(((IndexedValue)object0).getIndex(), ((JavaTypeQualifiers)((IndexedValue)object0).getValue()));
            }
            this.c = TuplesKt.to(s, new TypeEnhancementInfo(linkedHashMap0));
        }

        public final void returns(@NotNull JvmPrimitiveType jvmPrimitiveType0) {
            Intrinsics.checkNotNullParameter(jvmPrimitiveType0, "type");
            String s = jvmPrimitiveType0.getDesc();
            Intrinsics.checkNotNullExpressionValue(s, "type.desc");
            this.c = TuplesKt.to(s, null);
        }
    }

    public final String a;
    public final h b;

    public SignatureEnhancementBuilder.ClassEnhancementBuilder(@NotNull h h0, String s) {
        Intrinsics.checkNotNullParameter(s, "className");
        this.b = h0;
        super();
        this.a = s;
    }

    public final void function(@NotNull String s, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(s, "name");
        Intrinsics.checkNotNullParameter(function10, "block");
        FunctionEnhancementBuilder signatureEnhancementBuilder$ClassEnhancementBuilder$FunctionEnhancementBuilder0 = new FunctionEnhancementBuilder(this, s);
        function10.invoke(signatureEnhancementBuilder$ClassEnhancementBuilder$FunctionEnhancementBuilder0);
        Pair pair0 = signatureEnhancementBuilder$ClassEnhancementBuilder$FunctionEnhancementBuilder0.build();
        this.b.a.put(pair0.getFirst(), pair0.getSecond());
    }

    @NotNull
    public final String getClassName() {
        return this.a;
    }
}

