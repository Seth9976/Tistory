package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class VersionRequirementTable {
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final VersionRequirementTable create(@NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable protoBuf$VersionRequirementTable0) {
            Intrinsics.checkNotNullParameter(protoBuf$VersionRequirementTable0, "table");
            if(protoBuf$VersionRequirementTable0.getRequirementCount() == 0) {
                return this.getEMPTY();
            }
            List list0 = protoBuf$VersionRequirementTable0.getRequirementList();
            Intrinsics.checkNotNullExpressionValue(list0, "table.requirementList");
            return new VersionRequirementTable(list0, null);
        }

        @NotNull
        public final VersionRequirementTable getEMPTY() {
            return VersionRequirementTable.b;
        }
    }

    @NotNull
    public static final Companion Companion;
    public final List a;
    public static final VersionRequirementTable b;

    static {
        VersionRequirementTable.Companion = new Companion(null);
        VersionRequirementTable.b = new VersionRequirementTable(CollectionsKt__CollectionsKt.emptyList());
    }

    public VersionRequirementTable(List list0) {
        this.a = list0;
    }

    public VersionRequirementTable(List list0, DefaultConstructorMarker defaultConstructorMarker0) {
        this(list0);
    }
}

