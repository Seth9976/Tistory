package kotlinx.serialization.descriptors;

import a5.b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.ExperimentalSerializationApi;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u001B\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0015\n\u0002\u0010!\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J7\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\u0006\u001A\u00020\u00022\u0006\u0010\b\u001A\u00020\u00072\u000E\b\u0002\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\r\u001A\u00020\f¢\u0006\u0004\b\u000F\u0010\u0010R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001A\u0004\b\u0013\u0010\u0014R(\u0010\u0017\u001A\u00020\f8\u0006@\u0006X\u0087\u000E¢\u0006\u0018\n\u0004\b\u0015\u0010\u0016\u0012\u0004\b\u001B\u0010\u001C\u001A\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001AR.\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\n0\t8\u0006@\u0006X\u0087\u000E¢\u0006\u0018\n\u0004\b\u001D\u0010\u001E\u0012\u0004\b#\u0010\u001C\u001A\u0004\b\u001F\u0010 \"\u0004\b!\u0010\"R \u0010\'\u001A\b\u0012\u0004\u0012\u00020\u00020$8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b%\u0010\u001E\u001A\u0004\b&\u0010 R \u0010*\u001A\b\u0012\u0004\u0012\u00020\u00070$8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b(\u0010\u001E\u001A\u0004\b)\u0010 R&\u0010-\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0$8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b+\u0010\u001E\u001A\u0004\b,\u0010 R \u00100\u001A\b\u0012\u0004\u0012\u00020\f0$8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b.\u0010\u001E\u001A\u0004\b/\u0010 ¨\u00061"}, d2 = {"Lkotlinx/serialization/descriptors/ClassSerialDescriptorBuilder;", "", "", "serialName", "<init>", "(Ljava/lang/String;)V", "elementName", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "", "", "annotations", "", "isOptional", "", "element", "(Ljava/lang/String;Lkotlinx/serialization/descriptors/SerialDescriptor;Ljava/util/List;Z)V", "a", "Ljava/lang/String;", "getSerialName", "()Ljava/lang/String;", "b", "Z", "isNullable", "()Z", "setNullable", "(Z)V", "isNullable$annotations", "()V", "c", "Ljava/util/List;", "getAnnotations", "()Ljava/util/List;", "setAnnotations", "(Ljava/util/List;)V", "getAnnotations$annotations", "", "d", "getElementNames$kotlinx_serialization_core", "elementNames", "f", "getElementDescriptors$kotlinx_serialization_core", "elementDescriptors", "g", "getElementAnnotations$kotlinx_serialization_core", "elementAnnotations", "h", "getElementOptionality$kotlinx_serialization_core", "elementOptionality", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSerialDescriptors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SerialDescriptors.kt\nkotlinx/serialization/descriptors/ClassSerialDescriptorBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,348:1\n1#2:349\n*E\n"})
public final class ClassSerialDescriptorBuilder {
    public final String a;
    public boolean b;
    public List c;
    public final ArrayList d;
    public final HashSet e;
    public final ArrayList f;
    public final ArrayList g;
    public final ArrayList h;

    public ClassSerialDescriptorBuilder(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "serialName");
        super();
        this.a = s;
        this.c = CollectionsKt__CollectionsKt.emptyList();
        this.d = new ArrayList();
        this.e = new HashSet();
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = new ArrayList();
    }

    public final void element(@NotNull String s, @NotNull SerialDescriptor serialDescriptor0, @NotNull List list0, boolean z) {
        Intrinsics.checkNotNullParameter(s, "elementName");
        Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
        Intrinsics.checkNotNullParameter(list0, "annotations");
        if(this.e.add(s)) {
            this.d.add(s);
            this.f.add(serialDescriptor0);
            this.g.add(list0);
            this.h.add(Boolean.valueOf(z));
            return;
        }
        StringBuilder stringBuilder0 = b.v("Element with name \'", s, "\' is already registered in ");
        stringBuilder0.append(this.a);
        throw new IllegalArgumentException(stringBuilder0.toString().toString());
    }

    public static void element$default(ClassSerialDescriptorBuilder classSerialDescriptorBuilder0, String s, SerialDescriptor serialDescriptor0, List list0, boolean z, int v, Object object0) {
        if((v & 4) != 0) {
            list0 = CollectionsKt__CollectionsKt.emptyList();
        }
        if((v & 8) != 0) {
            z = false;
        }
        classSerialDescriptorBuilder0.element(s, serialDescriptor0, list0, z);
    }

    @NotNull
    public final List getAnnotations() {
        return this.c;
    }

    @ExperimentalSerializationApi
    public static void getAnnotations$annotations() {
    }

    @NotNull
    public final List getElementAnnotations$kotlinx_serialization_core() {
        return this.g;
    }

    @NotNull
    public final List getElementDescriptors$kotlinx_serialization_core() {
        return this.f;
    }

    @NotNull
    public final List getElementNames$kotlinx_serialization_core() {
        return this.d;
    }

    @NotNull
    public final List getElementOptionality$kotlinx_serialization_core() {
        return this.h;
    }

    @NotNull
    public final String getSerialName() {
        return this.a;
    }

    public final boolean isNullable() {
        return this.b;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "isNullable inside buildSerialDescriptor is deprecated. Please use SerialDescriptor.nullable extension on a builder result.")
    @ExperimentalSerializationApi
    public static void isNullable$annotations() {
    }

    public final void setAnnotations(@NotNull List list0) {
        Intrinsics.checkNotNullParameter(list0, "<set-?>");
        this.c = list0;
    }

    public final void setNullable(boolean z) {
        this.b = z;
    }
}

