package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class VersionSpecificBehaviorKt {
    public static final boolean isKotlin1Dot4OrLater(@NotNull BinaryVersion binaryVersion0) {
        Intrinsics.checkNotNullParameter(binaryVersion0, "version");
        return binaryVersion0.getMajor() == 1 && binaryVersion0.getMinor() >= 4 || binaryVersion0.getMajor() > 1;
    }

    public static final boolean isVersionRequirementTableWrittenCorrectly(@NotNull BinaryVersion binaryVersion0) {
        Intrinsics.checkNotNullParameter(binaryVersion0, "version");
        return VersionSpecificBehaviorKt.isKotlin1Dot4OrLater(binaryVersion0);
    }
}

