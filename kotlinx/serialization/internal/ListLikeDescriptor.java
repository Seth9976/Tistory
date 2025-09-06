package kotlinx.serialization.internal;

import a5.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.o;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.descriptors.SerialDescriptor.DefaultImpls;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.descriptors.StructureKind.LIST;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u001B\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001A\u00020\u00022\u0006\u0010\u0007\u001A\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000B\u001A\u00020\n2\u0006\u0010\u0003\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u000B\u0010\fJ\u001D\u0010\u000F\u001A\b\u0012\u0004\u0012\u00020\u000E0\r2\u0006\u0010\u0003\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u000F\u0010\u0010J\u0017\u0010\u0011\u001A\u00020\u00012\u0006\u0010\u0003\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001A\u0010\u0015\u001A\u00020\n2\b\u0010\u0014\u001A\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000F\u0010\u0017\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000F\u0010\u0019\u001A\u00020\u0004H\u0016¢\u0006\u0004\b\u0019\u0010\u001AR\u0017\u0010\u001E\u001A\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u001B\u0010\u001C\u001A\u0004\b\u0011\u0010\u001DR\u0014\u0010\"\u001A\u00020\u001F8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b \u0010!R\u001A\u0010#\u001A\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b#\u0010$\u001A\u0004\b%\u0010\u0018\u0082\u0001\u0005&\'()*¨\u0006+"}, d2 = {"Lkotlinx/serialization/internal/ListLikeDescriptor;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "index", "", "getElementName", "(I)Ljava/lang/String;", "name", "getElementIndex", "(Ljava/lang/String;)I", "", "isElementOptional", "(I)Z", "", "", "getElementAnnotations", "(I)Ljava/util/List;", "getElementDescriptor", "(I)Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "elementDescriptor", "Lkotlinx/serialization/descriptors/SerialKind;", "getKind", "()Lkotlinx/serialization/descriptors/SerialKind;", "kind", "elementsCount", "I", "getElementsCount", "Lkotlinx/serialization/internal/ArrayClassDesc;", "Lkotlinx/serialization/internal/ArrayListClassDesc;", "Lkotlinx/serialization/internal/HashSetClassDesc;", "Lkotlinx/serialization/internal/LinkedHashSetClassDesc;", "Lkotlinx/serialization/internal/PrimitiveArrayDescriptor;", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nCollectionDescriptors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectionDescriptors.kt\nkotlinx/serialization/internal/ListLikeDescriptor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,138:1\n1#2:139\n*E\n"})
@ExperimentalSerializationApi
public abstract class ListLikeDescriptor implements SerialDescriptor {
    public final SerialDescriptor a;

    public ListLikeDescriptor(SerialDescriptor serialDescriptor0, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = serialDescriptor0;
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof ListLikeDescriptor ? Intrinsics.areEqual(this.a, ((ListLikeDescriptor)object0).a) && Intrinsics.areEqual(this.getSerialName(), ((ListLikeDescriptor)object0).getSerialName()) : false;
    }

    @Override  // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public List getAnnotations() {
        return DefaultImpls.getAnnotations(this);
    }

    @Override  // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public List getElementAnnotations(int v) {
        if(v >= 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        StringBuilder stringBuilder0 = b.s(v, "Illegal index ", ", ");
        stringBuilder0.append(this.getSerialName());
        stringBuilder0.append(" expects only non-negative indices");
        throw new IllegalArgumentException(stringBuilder0.toString().toString());
    }

    @NotNull
    public final SerialDescriptor getElementDescriptor() {
        return this.a;
    }

    @Override  // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public SerialDescriptor getElementDescriptor(int v) {
        if(v >= 0) {
            return this.a;
        }
        StringBuilder stringBuilder0 = b.s(v, "Illegal index ", ", ");
        stringBuilder0.append(this.getSerialName());
        stringBuilder0.append(" expects only non-negative indices");
        throw new IllegalArgumentException(stringBuilder0.toString().toString());
    }

    @Override  // kotlinx.serialization.descriptors.SerialDescriptor
    public int getElementIndex(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "name");
        Integer integer0 = o.toIntOrNull(s);
        if(integer0 == null) {
            throw new IllegalArgumentException(s + " is not a valid list index");
        }
        return (int)integer0;
    }

    @Override  // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public String getElementName(int v) {
        return String.valueOf(v);
    }

    @Override  // kotlinx.serialization.descriptors.SerialDescriptor
    public int getElementsCount() {
        return 1;
    }

    @Override  // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public SerialKind getKind() {
        return LIST.INSTANCE;
    }

    @Override
    public int hashCode() {
        return this.getSerialName().hashCode() + this.a.hashCode() * 0x1F;
    }

    @Override  // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isElementOptional(int v) {
        if(v >= 0) {
            return false;
        }
        StringBuilder stringBuilder0 = b.s(v, "Illegal index ", ", ");
        stringBuilder0.append(this.getSerialName());
        stringBuilder0.append(" expects only non-negative indices");
        throw new IllegalArgumentException(stringBuilder0.toString().toString());
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
        return this.getSerialName() + '(' + this.a + ')';
    }
}

