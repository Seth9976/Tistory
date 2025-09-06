package kotlinx.serialization.descriptors;

import d0.s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.l;
import kotlin.collections.x;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.internal.CachedNames;
import kotlinx.serialization.internal.Platform_commonKt;
import md.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u001B\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0016\n\u0002\u0010\"\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B5\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\b\u001A\u00020\u0007\u0012\f\u0010\n\u001A\b\u0012\u0004\u0012\u00020\u00010\t\u0012\u0006\u0010\f\u001A\u00020\u000B¢\u0006\u0004\b\r\u0010\u000EJ\u0017\u0010\u0010\u001A\u00020\u00032\u0006\u0010\u000F\u001A\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001A\u00020\u00072\u0006\u0010\u0012\u001A\u00020\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001D\u0010\u0016\u001A\b\u0012\u0004\u0012\u00020\u00150\t2\u0006\u0010\u000F\u001A\u00020\u0007H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001A\u00020\u00012\u0006\u0010\u000F\u001A\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001B\u001A\u00020\u001A2\u0006\u0010\u000F\u001A\u00020\u0007H\u0016¢\u0006\u0004\b\u001B\u0010\u001CJ\u001A\u0010\u001F\u001A\u00020\u001A2\b\u0010\u001E\u001A\u0004\u0018\u00010\u001DH\u0096\u0002¢\u0006\u0004\b\u001F\u0010 J\u000F\u0010!\u001A\u00020\u0007H\u0016¢\u0006\u0004\b!\u0010\"J\u000F\u0010#\u001A\u00020\u0003H\u0016¢\u0006\u0004\b#\u0010$R\u001A\u0010\u0004\u001A\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001A\u0004\b\'\u0010$R\u001A\u0010\u0006\u001A\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001A\u0004\b*\u0010+R\u001A\u0010\b\u001A\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001A\u0004\b.\u0010\"R \u00103\u001A\b\u0012\u0004\u0012\u00020\u00150\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001A\u0004\b1\u00102R \u00109\u001A\b\u0012\u0004\u0012\u00020\u0003048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u00106\u001A\u0004\b7\u00108¨\u0006:"}, d2 = {"Lkotlinx/serialization/descriptors/SerialDescriptorImpl;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlinx/serialization/internal/CachedNames;", "", "serialName", "Lkotlinx/serialization/descriptors/SerialKind;", "kind", "", "elementsCount", "", "typeParameters", "Lkotlinx/serialization/descriptors/ClassSerialDescriptorBuilder;", "builder", "<init>", "(Ljava/lang/String;Lkotlinx/serialization/descriptors/SerialKind;ILjava/util/List;Lkotlinx/serialization/descriptors/ClassSerialDescriptorBuilder;)V", "index", "getElementName", "(I)Ljava/lang/String;", "name", "getElementIndex", "(Ljava/lang/String;)I", "", "getElementAnnotations", "(I)Ljava/util/List;", "getElementDescriptor", "(I)Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "isElementOptional", "(I)Z", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getSerialName", "b", "Lkotlinx/serialization/descriptors/SerialKind;", "getKind", "()Lkotlinx/serialization/descriptors/SerialKind;", "c", "I", "getElementsCount", "d", "Ljava/util/List;", "getAnnotations", "()Ljava/util/List;", "annotations", "", "e", "Ljava/util/Set;", "getSerialNames", "()Ljava/util/Set;", "serialNames", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSerialDescriptors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SerialDescriptors.kt\nkotlinx/serialization/descriptors/SerialDescriptorImpl\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Platform.kt\nkotlinx/serialization/internal/PlatformKt\n+ 5 PluginGeneratedSerialDescriptor.kt\nkotlinx/serialization/internal/PluginGeneratedSerialDescriptorKt\n*L\n1#1,348:1\n37#2,2:349\n37#2,2:351\n1549#3:353\n1620#3,3:354\n13#4:357\n13#4:358\n13#4:359\n18#4:360\n111#5,10:361\n*S KotlinDebug\n*F\n+ 1 SerialDescriptors.kt\nkotlinx/serialization/descriptors/SerialDescriptorImpl\n*L\n318#1:349,2\n320#1:351,2\n322#1:353\n322#1:354,3\n326#1:357\n328#1:358\n329#1:359\n330#1:360\n333#1:361,10\n*E\n"})
public final class SerialDescriptorImpl implements SerialDescriptor, CachedNames {
    public final String a;
    public final SerialKind b;
    public final int c;
    public final List d;
    public final HashSet e;
    public final String[] f;
    public final SerialDescriptor[] g;
    public final List[] h;
    public final boolean[] i;
    public final Map j;
    public final SerialDescriptor[] k;
    public final Lazy l;

    public SerialDescriptorImpl(@NotNull String s, @NotNull SerialKind serialKind0, int v, @NotNull List list0, @NotNull ClassSerialDescriptorBuilder classSerialDescriptorBuilder0) {
        Intrinsics.checkNotNullParameter(s, "serialName");
        Intrinsics.checkNotNullParameter(serialKind0, "kind");
        Intrinsics.checkNotNullParameter(list0, "typeParameters");
        Intrinsics.checkNotNullParameter(classSerialDescriptorBuilder0, "builder");
        super();
        this.a = s;
        this.b = serialKind0;
        this.c = v;
        this.d = classSerialDescriptorBuilder0.getAnnotations();
        this.e = CollectionsKt___CollectionsKt.toHashSet(classSerialDescriptorBuilder0.getElementNames$kotlinx_serialization_core());
        String[] arr_s = (String[])classSerialDescriptorBuilder0.getElementNames$kotlinx_serialization_core().toArray(new String[0]);
        this.f = arr_s;
        this.g = Platform_commonKt.compactArray(classSerialDescriptorBuilder0.getElementDescriptors$kotlinx_serialization_core());
        this.h = (List[])classSerialDescriptorBuilder0.getElementAnnotations$kotlinx_serialization_core().toArray(new List[0]);
        this.i = CollectionsKt___CollectionsKt.toBooleanArray(classSerialDescriptorBuilder0.getElementOptionality$kotlinx_serialization_core());
        Iterable iterable0 = ArraysKt___ArraysKt.withIndex(arr_s);
        ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(iterable0, 10));
        for(Object object0: iterable0) {
            arrayList0.add(TuplesKt.to(((IndexedValue)object0).getValue(), ((IndexedValue)object0).getIndex()));
        }
        this.j = x.toMap(arrayList0);
        this.k = Platform_commonKt.compactArray(list0);
        this.l = c.lazy(new s(this, 18));
    }

    public static final SerialDescriptor[] access$getTypeParametersDescriptors$p(SerialDescriptorImpl serialDescriptorImpl0) {
        return serialDescriptorImpl0.k;
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this != object0) {
            if(object0 instanceof SerialDescriptorImpl && (Intrinsics.areEqual(this.getSerialName(), ((SerialDescriptor)object0).getSerialName()) && Arrays.equals(this.k, ((SerialDescriptorImpl)object0).k) && this.getElementsCount() == ((SerialDescriptor)object0).getElementsCount())) {
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
        return this.d;
    }

    @Override  // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public List getElementAnnotations(int v) {
        return this.h[v];
    }

    @Override  // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public SerialDescriptor getElementDescriptor(int v) {
        return this.g[v];
    }

    @Override  // kotlinx.serialization.descriptors.SerialDescriptor
    public int getElementIndex(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "name");
        Integer integer0 = (Integer)this.j.get(s);
        return integer0 == null ? -3 : ((int)integer0);
    }

    @Override  // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public String getElementName(int v) {
        return this.f[v];
    }

    @Override  // kotlinx.serialization.descriptors.SerialDescriptor
    public int getElementsCount() {
        return this.c;
    }

    @Override  // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public SerialKind getKind() {
        return this.b;
    }

    @Override  // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public String getSerialName() {
        return this.a;
    }

    @Override  // kotlinx.serialization.internal.CachedNames
    @NotNull
    public Set getSerialNames() {
        return this.e;
    }

    @Override
    public int hashCode() {
        return ((Number)this.l.getValue()).intValue();
    }

    @Override  // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isElementOptional(int v) {
        return this.i[v];
    }

    @Override  // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isInline() {
        return false;
    }

    @Override  // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isNullable() {
        return false;
    }

    @Override
    @NotNull
    public String toString() {
        return CollectionsKt___CollectionsKt.joinToString$default(kotlin.ranges.c.until(0, this.getElementsCount()), ", ", this.getSerialName() + '(', ")", 0, null, new fg.c(this, 2), 24, null);
    }
}

