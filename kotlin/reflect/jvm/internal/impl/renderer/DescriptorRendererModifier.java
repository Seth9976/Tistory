package kotlin.reflect.jvm.internal.impl.renderer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.EmptySet;
import kotlin.collections.e0;
import kotlin.collections.f0;
import kotlin.collections.w;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@SourceDebugExtension({"SMAP\nDescriptorRenderer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DescriptorRenderer.kt\norg/jetbrains/kotlin/renderer/DescriptorRendererModifier\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,318:1\n3792#2:319\n4307#2,2:320\n*S KotlinDebug\n*F\n+ 1 DescriptorRenderer.kt\norg/jetbrains/kotlin/renderer/DescriptorRendererModifier\n*L\n312#1:319\n312#1:320,2\n*E\n"})
public enum DescriptorRendererModifier {
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    VISIBILITY(true),
    MODALITY(true),
    OVERRIDE(true),
    ANNOTATIONS(false),
    INNER(true),
    MEMBER_KIND(true),
    DATA(true),
    INLINE(true),
    EXPECT(true),
    ACTUAL(true),
    CONST(true),
    LATEINIT(true),
    FUN(true),
    VALUE(true);

    @JvmField
    @NotNull
    public static final Set ALL;
    @JvmField
    @NotNull
    public static final Set ALL_EXCEPT_ANNOTATIONS;
    @NotNull
    public static final Companion Companion;
    public final boolean a;

    static {
        Set set3;
        Set set2;
        Set set0;
        DescriptorRendererModifier.Companion = new Companion(null);
        DescriptorRendererModifier[] arr_descriptorRendererModifier = (DescriptorRendererModifier[])DescriptorRendererModifier.b.clone();
        ArrayList arrayList0 = new ArrayList();
        for(int v = 0; v < arr_descriptorRendererModifier.length; ++v) {
            DescriptorRendererModifier descriptorRendererModifier0 = arr_descriptorRendererModifier[v];
            if(descriptorRendererModifier0.a) {
                arrayList0.add(descriptorRendererModifier0);
            }
        }
        if(arrayList0 instanceof Collection) {
            switch(arrayList0.size()) {
                case 0: {
                    set0 = EmptySet.INSTANCE;
                    break;
                }
                case 1: {
                    Set set1 = Collections.singleton((arrayList0 instanceof List ? arrayList0.get(0) : arrayList0.iterator().next()));
                    Intrinsics.checkNotNullExpressionValue(set1, "singleton(...)");
                    set0 = set1;
                    break;
                }
                default: {
                    int v1 = arrayList0.size();
                    if(v1 >= 0) {
                        if(v1 < 3) {
                            ++v1;
                        }
                        else {
                            v1 = v1 >= 0x40000000 ? 0x7FFFFFFF : ((int)(((float)v1) / 0.75f + 1.0f));
                        }
                    }
                    set0 = (Set)CollectionsKt___CollectionsKt.toCollection(arrayList0, new LinkedHashSet(v1));
                }
            }
            set2 = set0;
        }
        else {
            Collection collection0 = new LinkedHashSet();
            Intrinsics.checkNotNullParameter(arrayList0, "<this>");
            Intrinsics.checkNotNullParameter(collection0, "destination");
            for(Object object0: arrayList0) {
                collection0.add(object0);
            }
            set2 = f0.optimizeReadOnlySet(((Set)collection0));
        }
        DescriptorRendererModifier.ALL_EXCEPT_ANNOTATIONS = set2;
        Object[] arr_object = (DescriptorRendererModifier[])DescriptorRendererModifier.b.clone();
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        switch(arr_object.length) {
            case 0: {
                set3 = f0.emptySet();
                break;
            }
            case 1: {
                set3 = e0.setOf(arr_object[0]);
                break;
            }
            default: {
                set3 = (Set)ArraysKt___ArraysKt.toCollection(arr_object, new LinkedHashSet(w.mapCapacity(arr_object.length)));
            }
        }
        DescriptorRendererModifier.ALL = set3;
    }

    public DescriptorRendererModifier(boolean z) {
        this.a = z;
    }
}

