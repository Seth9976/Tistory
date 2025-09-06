package kotlin.collections.builders;

import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.e0;
import kotlin.collections.k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001E\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u001B\u0012\n\u0010\u0003\u001A\u0006\u0012\u0002\b\u00030\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bJ\u0017\u0010\f\u001A\u00020\u000B2\u0006\u0010\n\u001A\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001A\u00020\u000B2\u0006\u0010\u000F\u001A\u00020\u000EH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lkotlin/collections/builders/SerializedCollection;", "Ljava/io/Externalizable;", "", "collection", "", "tag", "<init>", "(Ljava/util/Collection;I)V", "()V", "Ljava/io/ObjectOutput;", "output", "", "writeExternal", "(Ljava/io/ObjectOutput;)V", "Ljava/io/ObjectInput;", "input", "readExternal", "(Ljava/io/ObjectInput;)V", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nListBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListBuilder.kt\nkotlin/collections/builders/SerializedCollection\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,487:1\n1#2:488\n*E\n"})
public final class SerializedCollection implements Externalizable {
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001A\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001A\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lkotlin/collections/builders/SerializedCollection$Companion;", "", "", "serialVersionUID", "J", "", "tagList", "I", "tagSet", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    @NotNull
    public static final Companion Companion = null;
    public Collection a;
    public final int b;
    public static final int tagList = 0;
    public static final int tagSet = 1;

    static {
        SerializedCollection.Companion = new Companion(null);
    }

    public SerializedCollection() {
        this(CollectionsKt__CollectionsKt.emptyList(), 0);
    }

    public SerializedCollection(@NotNull Collection collection0, int v) {
        Intrinsics.checkNotNullParameter(collection0, "collection");
        super();
        this.a = collection0;
        this.b = v;
    }

    @Override
    public void readExternal(@NotNull ObjectInput objectInput0) {
        Collection collection0;
        Intrinsics.checkNotNullParameter(objectInput0, "input");
        int v = objectInput0.readByte();
        if((v & -2) != 0) {
            throw new InvalidObjectException("Unsupported flags value: " + v + '.');
        }
        int v1 = 0;
        int v2 = objectInput0.readInt();
        if(v2 < 0) {
            throw new InvalidObjectException("Illegal size value: " + v2 + '.');
        }
        switch(v & 1) {
            case 0: {
                List list0 = k.createListBuilder(v2);
                while(v1 < v2) {
                    list0.add(objectInput0.readObject());
                    ++v1;
                }
                collection0 = k.build(list0);
                break;
            }
            case 1: {
                Set set0 = e0.createSetBuilder(v2);
                while(v1 < v2) {
                    set0.add(objectInput0.readObject());
                    ++v1;
                }
                collection0 = e0.build(set0);
                break;
            }
            default: {
                throw new InvalidObjectException("Unsupported collection type tag: " + (v & 1) + '.');
            }
        }
        this.a = collection0;
    }

    @Override
    public void writeExternal(@NotNull ObjectOutput objectOutput0) {
        Intrinsics.checkNotNullParameter(objectOutput0, "output");
        objectOutput0.writeByte(this.b);
        objectOutput0.writeInt(this.a.size());
        for(Object object0: this.a) {
            objectOutput0.writeObject(object0);
        }
    }
}

