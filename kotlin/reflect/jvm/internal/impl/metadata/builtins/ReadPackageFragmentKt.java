package kotlin.reflect.jvm.internal.impl.metadata.builtins;

import java.io.InputStream;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment;
import kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;
import org.jetbrains.annotations.NotNull;

@SourceDebugExtension({"SMAP\nreadPackageFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 readPackageFragment.kt\norg/jetbrains/kotlin/metadata/builtins/ReadPackageFragmentKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,23:1\n1#2:24\n*E\n"})
public final class ReadPackageFragmentKt {
    @NotNull
    public static final Pair readBuiltinsPackageFragment(@NotNull InputStream inputStream0) {
        Pair pair0;
        PackageFragment protoBuf$PackageFragment0;
        Intrinsics.checkNotNullParameter(inputStream0, "<this>");
        try {
            BuiltInsBinaryVersion builtInsBinaryVersion0 = BuiltInsBinaryVersion.Companion.readFrom(inputStream0);
            if(builtInsBinaryVersion0.isCompatibleWithCurrentCompilerVersion()) {
                ExtensionRegistryLite extensionRegistryLite0 = ExtensionRegistryLite.newInstance();
                BuiltInsProtoBuf.registerAllExtensions(extensionRegistryLite0);
                protoBuf$PackageFragment0 = PackageFragment.parseFrom(inputStream0, extensionRegistryLite0);
            }
            else {
                protoBuf$PackageFragment0 = null;
            }
            pair0 = TuplesKt.to(protoBuf$PackageFragment0, builtInsBinaryVersion0);
            goto label_15;
        }
        catch(Throwable throwable0) {
        }
        try {
            throw throwable0;
        }
        catch(Throwable throwable1) {
            CloseableKt.closeFinally(inputStream0, throwable0);
            throw throwable1;
        }
    label_15:
        CloseableKt.closeFinally(inputStream0, null);
        return pair0;
    }
}

