package kotlin.reflect.jvm.internal.impl.metadata.builtins;

import java.io.DataInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.l;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import org.jetbrains.annotations.NotNull;

public final class BuiltInsBinaryVersion extends BinaryVersion {
    @SourceDebugExtension({"SMAP\nBuiltInsBinaryVersion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BuiltInsBinaryVersion.kt\norg/jetbrains/kotlin/metadata/builtins/BuiltInsBinaryVersion$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,33:1\n1549#2:34\n1620#2,3:35\n*S KotlinDebug\n*F\n+ 1 BuiltInsBinaryVersion.kt\norg/jetbrains/kotlin/metadata/builtins/BuiltInsBinaryVersion$Companion\n*L\n29#1:34\n29#1:35,3\n*E\n"})
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final BuiltInsBinaryVersion readFrom(@NotNull InputStream inputStream0) {
            Intrinsics.checkNotNullParameter(inputStream0, "stream");
            DataInputStream dataInputStream0 = new DataInputStream(inputStream0);
            IntRange intRange0 = new IntRange(1, dataInputStream0.readInt());
            ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(intRange0, 10));
            Iterator iterator0 = intRange0.iterator();
            while(iterator0.hasNext()) {
                ((IntIterator)iterator0).nextInt();
                arrayList0.add(dataInputStream0.readInt());
            }
            int[] arr_v = CollectionsKt___CollectionsKt.toIntArray(arrayList0);
            return new BuiltInsBinaryVersion(Arrays.copyOf(arr_v, arr_v.length));
        }
    }

    @NotNull
    public static final Companion Companion;
    @JvmField
    @NotNull
    public static final BuiltInsBinaryVersion INSTANCE;
    @JvmField
    @NotNull
    public static final BuiltInsBinaryVersion INVALID_VERSION;

    static {
        BuiltInsBinaryVersion.Companion = new Companion(null);
        BuiltInsBinaryVersion.INSTANCE = new BuiltInsBinaryVersion(new int[]{1, 0, 7});
        BuiltInsBinaryVersion.INVALID_VERSION = new BuiltInsBinaryVersion(new int[0]);
    }

    public BuiltInsBinaryVersion(@NotNull int[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "numbers");
        super(Arrays.copyOf(arr_v, arr_v.length));
    }

    public boolean isCompatibleWithCurrentCompilerVersion() {
        return this.isCompatibleTo(BuiltInsBinaryVersion.INSTANCE);
    }
}

