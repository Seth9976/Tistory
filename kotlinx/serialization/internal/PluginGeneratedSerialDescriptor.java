package kotlinx.serialization.internal;

import hg.k;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.x;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.descriptors.StructureKind.CLASS;
import md.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u001B\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\u0004\b\u0011\u0018\u00002\u00020\u00012\u00020\u0002B\'\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u000E\b\u0002\u0010\u0006\u001A\b\u0012\u0002\b\u0003\u0018\u00010\u0005\u0012\u0006\u0010\b\u001A\u00020\u0007\u00A2\u0006\u0004\b\t\u0010\nJ\u001F\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\u000B\u001A\u00020\u00032\b\b\u0002\u0010\r\u001A\u00020\f\u00A2\u0006\u0004\b\u000F\u0010\u0010J\u0015\u0010\u0013\u001A\u00020\u000E2\u0006\u0010\u0012\u001A\u00020\u0011\u00A2\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001A\u00020\u000E2\u0006\u0010\u0015\u001A\u00020\u0011\u00A2\u0006\u0004\b\u0016\u0010\u0014J\u0017\u0010\u0018\u001A\u00020\u00012\u0006\u0010\u0017\u001A\u00020\u0007H\u0016\u00A2\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001A\u001A\u00020\f2\u0006\u0010\u0017\u001A\u00020\u0007H\u0016\u00A2\u0006\u0004\b\u001A\u0010\u001BJ\u001D\u0010\u001D\u001A\b\u0012\u0004\u0012\u00020\u00110\u001C2\u0006\u0010\u0017\u001A\u00020\u0007H\u0016\u00A2\u0006\u0004\b\u001D\u0010\u001EJ\u0017\u0010\u001F\u001A\u00020\u00032\u0006\u0010\u0017\u001A\u00020\u0007H\u0016\u00A2\u0006\u0004\b\u001F\u0010 J\u0017\u0010!\u001A\u00020\u00072\u0006\u0010\u000B\u001A\u00020\u0003H\u0016\u00A2\u0006\u0004\b!\u0010\"J\u001A\u0010%\u001A\u00020\f2\b\u0010$\u001A\u0004\u0018\u00010#H\u0096\u0002\u00A2\u0006\u0004\b%\u0010&J\u000F\u0010\'\u001A\u00020\u0007H\u0016\u00A2\u0006\u0004\b\'\u0010(J\u000F\u0010)\u001A\u00020\u0003H\u0016\u00A2\u0006\u0004\b)\u0010*R\u001A\u0010\u0004\u001A\u00020\u00038\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b\u0015\u0010+\u001A\u0004\b,\u0010*R\u0017\u0010\b\u001A\u00020\u00078\u0006\u00A2\u0006\f\n\u0004\b-\u0010.\u001A\u0004\b/\u0010(R!\u00105\u001A\b\u0012\u0004\u0012\u00020\u0001008@X\u0080\u0084\u0002\u00A2\u0006\f\n\u0004\b1\u00102\u001A\u0004\b3\u00104R\u0014\u00109\u001A\u0002068VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b7\u00108R\u001A\u0010<\u001A\b\u0012\u0004\u0012\u00020\u00110\u001C8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b:\u0010;R\u001A\u0010@\u001A\b\u0012\u0004\u0012\u00020\u00030=8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b>\u0010?\u00A8\u0006A"}, d2 = {"Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlinx/serialization/internal/CachedNames;", "", "serialName", "Lkotlinx/serialization/internal/GeneratedSerializer;", "generatedSerializer", "", "elementsCount", "<init>", "(Ljava/lang/String;Lkotlinx/serialization/internal/GeneratedSerializer;I)V", "name", "", "isOptional", "", "addElement", "(Ljava/lang/String;Z)V", "", "annotation", "pushAnnotation", "(Ljava/lang/annotation/Annotation;)V", "a", "pushClassAnnotation", "index", "getElementDescriptor", "(I)Lkotlinx/serialization/descriptors/SerialDescriptor;", "isElementOptional", "(I)Z", "", "getElementAnnotations", "(I)Ljava/util/List;", "getElementName", "(I)Ljava/lang/String;", "getElementIndex", "(Ljava/lang/String;)I", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getSerialName", "c", "I", "getElementsCount", "", "k", "Lkotlin/Lazy;", "getTypeParameterDescriptors$kotlinx_serialization_core", "()[Lkotlinx/serialization/descriptors/SerialDescriptor;", "typeParameterDescriptors", "Lkotlinx/serialization/descriptors/SerialKind;", "getKind", "()Lkotlinx/serialization/descriptors/SerialKind;", "kind", "getAnnotations", "()Ljava/util/List;", "annotations", "", "getSerialNames", "()Ljava/util/Set;", "serialNames", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@PublishedApi
@SourceDebugExtension({"SMAP\nPluginGeneratedSerialDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PluginGeneratedSerialDescriptor.kt\nkotlinx/serialization/internal/PluginGeneratedSerialDescriptor\n+ 2 Platform.kt\nkotlinx/serialization/internal/PlatformKt\n+ 3 PluginGeneratedSerialDescriptor.kt\nkotlinx/serialization/internal/PluginGeneratedSerialDescriptorKt\n*L\n1#1,134:1\n13#2:135\n18#2:136\n13#2:137\n13#2:138\n111#3,10:139\n*S KotlinDebug\n*F\n+ 1 PluginGeneratedSerialDescriptor.kt\nkotlinx/serialization/internal/PluginGeneratedSerialDescriptor\n*L\n76#1:135\n79#1:136\n81#1:137\n82#1:138\n93#1:139,10\n*E\n"})
public class PluginGeneratedSerialDescriptor implements SerialDescriptor, CachedNames {
    public final String a;
    public final GeneratedSerializer b;
    public final int c;
    public int d;
    public final String[] e;
    public final List[] f;
    public ArrayList g;
    public final boolean[] h;
    public Map i;
    public final Lazy j;
    public final Lazy k;
    public final Lazy l;

    public PluginGeneratedSerialDescriptor(@NotNull String s, @Nullable GeneratedSerializer generatedSerializer0, int v) {
        Intrinsics.checkNotNullParameter(s, "serialName");
        super();
        this.a = s;
        this.b = generatedSerializer0;
        this.c = v;
        this.d = -1;
        String[] arr_s = new String[v];
        for(int v1 = 0; v1 < v; ++v1) {
            arr_s[v1] = "[UNINITIALIZED]";
        }
        this.e = arr_s;
        this.f = new List[this.c];
        this.h = new boolean[this.c];
        this.i = x.emptyMap();
        k k0 = new k(this, 1);
        this.j = c.lazy(LazyThreadSafetyMode.PUBLICATION, k0);
        k k1 = new k(this, 2);
        this.k = c.lazy(LazyThreadSafetyMode.PUBLICATION, k1);
        k k2 = new k(this, 0);
        this.l = c.lazy(LazyThreadSafetyMode.PUBLICATION, k2);
    }

    public PluginGeneratedSerialDescriptor(String s, GeneratedSerializer generatedSerializer0, int v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 2) != 0) {
            generatedSerializer0 = null;
        }
        this(s, generatedSerializer0, v);
    }

    public static final GeneratedSerializer access$getGeneratedSerializer$p(PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor0) {
        return pluginGeneratedSerialDescriptor0.b;
    }

    public final void addElement(@NotNull String s, boolean z) {
        Intrinsics.checkNotNullParameter(s, "name");
        int v = this.d + 1;
        this.d = v;
        String[] arr_s = this.e;
        arr_s[v] = s;
        this.h[v] = z;
        this.f[v] = null;
        if(v == this.c - 1) {
            HashMap hashMap0 = new HashMap();
            for(int v1 = 0; v1 < arr_s.length; ++v1) {
                hashMap0.put(arr_s[v1], v1);
            }
            this.i = hashMap0;
        }
    }

    public static void addElement$default(PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor0, String s, boolean z, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addElement");
        }
        if((v & 2) != 0) {
            z = false;
        }
        pluginGeneratedSerialDescriptor0.addElement(s, z);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this != object0) {
            if(object0 instanceof PluginGeneratedSerialDescriptor && (Intrinsics.areEqual(this.getSerialName(), ((SerialDescriptor)object0).getSerialName()) && Arrays.equals(this.getTypeParameterDescriptors$kotlinx_serialization_core(), ((PluginGeneratedSerialDescriptor)object0).getTypeParameterDescriptors$kotlinx_serialization_core()) && this.getElementsCount() == ((SerialDescriptor)object0).getElementsCount())) {
                int v = this.getElementsCount();
                for(int v1 = 0; v1 < v; ++v1) {
                    if(!Intrinsics.areEqual(this.getElementDescriptor(v1).getSerialName(), ((SerialDescriptor)object0).getElementDescriptor(v1).getSerialName()) || !Intrinsics.areEqual(this.getElementDescriptor(v1).getKind(), ((SerialDescriptor)object0).getElementDescriptor(v1).getKind())) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override  // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public List getAnnotations() {
        return this.g == null ? CollectionsKt__CollectionsKt.emptyList() : this.g;
    }

    @Override  // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public List getElementAnnotations(int v) {
        List list0 = this.f[v];
        return list0 == null ? CollectionsKt__CollectionsKt.emptyList() : list0;
    }

    @Override  // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public SerialDescriptor getElementDescriptor(int v) {
        return ((KSerializer[])this.j.getValue())[v].getDescriptor();
    }

    @Override  // kotlinx.serialization.descriptors.SerialDescriptor
    public int getElementIndex(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "name");
        Integer integer0 = (Integer)this.i.get(s);
        return integer0 == null ? -3 : ((int)integer0);
    }

    @Override  // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public String getElementName(int v) {
        return this.e[v];
    }

    @Override  // kotlinx.serialization.descriptors.SerialDescriptor
    public final int getElementsCount() {
        return this.c;
    }

    @Override  // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public SerialKind getKind() {
        return CLASS.INSTANCE;
    }

    @Override  // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public String getSerialName() {
        return this.a;
    }

    @Override  // kotlinx.serialization.internal.CachedNames
    @NotNull
    public Set getSerialNames() {
        return this.i.keySet();
    }

    @NotNull
    public final SerialDescriptor[] getTypeParameterDescriptors$kotlinx_serialization_core() {
        return (SerialDescriptor[])this.k.getValue();
    }

    @Override
    public int hashCode() {
        return ((Number)this.l.getValue()).intValue();
    }

    @Override  // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isElementOptional(int v) {
        return this.h[v];
    }

    @Override  // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isInline() {
        return false;
    }

    @Override  // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isNullable() {
        return false;
    }

    public final void pushAnnotation(@NotNull Annotation annotation0) {
        Intrinsics.checkNotNullParameter(annotation0, "annotation");
        List[] arr_list = this.f;
        List list0 = arr_list[this.d];
        if(list0 == null) {
            list0 = new ArrayList(1);
            arr_list[this.d] = list0;
        }
        list0.add(annotation0);
    }

    public final void pushClassAnnotation(@NotNull Annotation annotation0) {
        Intrinsics.checkNotNullParameter(annotation0, "a");
        if(this.g == null) {
            this.g = new ArrayList(1);
        }
        ArrayList arrayList0 = this.g;
        Intrinsics.checkNotNull(arrayList0);
        arrayList0.add(annotation0);
    }

    @Override
    @NotNull
    public String toString() {
        return CollectionsKt___CollectionsKt.joinToString$default(kotlin.ranges.c.until(0, this.c), ", ", this.getSerialName() + '(', ")", 0, null, new fg.c(this, 5), 24, null);
    }
}

