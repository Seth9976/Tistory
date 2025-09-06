package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

public final class NullabilityQualifierWithMigrationStatus {
    public final NullabilityQualifier a;
    public final boolean b;

    public NullabilityQualifierWithMigrationStatus(@NotNull NullabilityQualifier nullabilityQualifier0, boolean z) {
        Intrinsics.checkNotNullParameter(nullabilityQualifier0, "qualifier");
        super();
        this.a = nullabilityQualifier0;
        this.b = z;
    }

    public NullabilityQualifierWithMigrationStatus(NullabilityQualifier nullabilityQualifier0, boolean z, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 2) != 0) {
            z = false;
        }
        this(nullabilityQualifier0, z);
    }

    @NotNull
    public final NullabilityQualifierWithMigrationStatus copy(@NotNull NullabilityQualifier nullabilityQualifier0, boolean z) {
        Intrinsics.checkNotNullParameter(nullabilityQualifier0, "qualifier");
        return new NullabilityQualifierWithMigrationStatus(nullabilityQualifier0, z);
    }

    public static NullabilityQualifierWithMigrationStatus copy$default(NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus0, NullabilityQualifier nullabilityQualifier0, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            nullabilityQualifier0 = nullabilityQualifierWithMigrationStatus0.a;
        }
        if((v & 2) != 0) {
            z = nullabilityQualifierWithMigrationStatus0.b;
        }
        return nullabilityQualifierWithMigrationStatus0.copy(nullabilityQualifier0, z);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof NullabilityQualifierWithMigrationStatus)) {
            return false;
        }
        return this.a == ((NullabilityQualifierWithMigrationStatus)object0).a ? this.b == ((NullabilityQualifierWithMigrationStatus)object0).b : false;
    }

    @NotNull
    public final NullabilityQualifier getQualifier() {
        return this.a;
    }

    @Override
    public int hashCode() {
        int v = this.a.hashCode();
        int v1 = this.b;
        if(v1) {
            v1 = 1;
        }
        return v * 0x1F + v1;
    }

    public final boolean isForWarningOnly() {
        return this.b;
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("NullabilityQualifierWithMigrationStatus(qualifier=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", isForWarningOnly=");
        return a.p(stringBuilder0, this.b, ')');
    }
}

