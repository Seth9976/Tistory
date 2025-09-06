package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Collection;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

public final class JavaDefaultQualifiers {
    public final NullabilityQualifierWithMigrationStatus a;
    public final Collection b;
    public final boolean c;

    public JavaDefaultQualifiers(@NotNull NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus0, @NotNull Collection collection0, boolean z) {
        Intrinsics.checkNotNullParameter(nullabilityQualifierWithMigrationStatus0, "nullabilityQualifier");
        Intrinsics.checkNotNullParameter(collection0, "qualifierApplicabilityTypes");
        super();
        this.a = nullabilityQualifierWithMigrationStatus0;
        this.b = collection0;
        this.c = z;
    }

    public JavaDefaultQualifiers(NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus0, Collection collection0, boolean z, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 4) != 0) {
            z = nullabilityQualifierWithMigrationStatus0.getQualifier() == NullabilityQualifier.NOT_NULL;
        }
        this(nullabilityQualifierWithMigrationStatus0, collection0, z);
    }

    @NotNull
    public final JavaDefaultQualifiers copy(@NotNull NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus0, @NotNull Collection collection0, boolean z) {
        Intrinsics.checkNotNullParameter(nullabilityQualifierWithMigrationStatus0, "nullabilityQualifier");
        Intrinsics.checkNotNullParameter(collection0, "qualifierApplicabilityTypes");
        return new JavaDefaultQualifiers(nullabilityQualifierWithMigrationStatus0, collection0, z);
    }

    public static JavaDefaultQualifiers copy$default(JavaDefaultQualifiers javaDefaultQualifiers0, NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus0, Collection collection0, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            nullabilityQualifierWithMigrationStatus0 = javaDefaultQualifiers0.a;
        }
        if((v & 2) != 0) {
            collection0 = javaDefaultQualifiers0.b;
        }
        if((v & 4) != 0) {
            z = javaDefaultQualifiers0.c;
        }
        return javaDefaultQualifiers0.copy(nullabilityQualifierWithMigrationStatus0, collection0, z);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof JavaDefaultQualifiers)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.a, ((JavaDefaultQualifiers)object0).a)) {
            return false;
        }
        return Intrinsics.areEqual(this.b, ((JavaDefaultQualifiers)object0).b) ? this.c == ((JavaDefaultQualifiers)object0).c : false;
    }

    public final boolean getDefinitelyNotNull() {
        return this.c;
    }

    @NotNull
    public final NullabilityQualifierWithMigrationStatus getNullabilityQualifier() {
        return this.a;
    }

    @NotNull
    public final Collection getQualifierApplicabilityTypes() {
        return this.b;
    }

    @Override
    public int hashCode() {
        int v = this.a.hashCode();
        int v1 = this.b.hashCode();
        int v2 = this.c;
        if(v2) {
            v2 = 1;
        }
        return (v1 + v * 0x1F) * 0x1F + v2;
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("JavaDefaultQualifiers(nullabilityQualifier=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", qualifierApplicabilityTypes=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", definitelyNotNull=");
        return a.p(stringBuilder0, this.c, ')');
    }
}

