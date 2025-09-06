package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import java.util.Map;
import kotlin.collections.x;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@SourceDebugExtension({"SMAP\nMultiFieldValueClassRepresentation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiFieldValueClassRepresentation.kt\norg/jetbrains/kotlin/descriptors/MultiFieldValueClassRepresentation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,24:1\n1#2:25\n*E\n"})
public final class MultiFieldValueClassRepresentation extends ValueClassRepresentation {
    public final List a;
    public final Map b;

    public MultiFieldValueClassRepresentation(@NotNull List list0) {
        Intrinsics.checkNotNullParameter(list0, "underlyingPropertyNamesToTypes");
        super(null);
        this.a = list0;
        Map map0 = x.toMap(this.getUnderlyingPropertyNamesToTypes());
        if(map0.size() != this.getUnderlyingPropertyNamesToTypes().size()) {
            throw new IllegalArgumentException("Some properties have the same names");
        }
        this.b = map0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation
    @NotNull
    public List getUnderlyingPropertyNamesToTypes() {
        return this.a;
    }

    @Override
    @NotNull
    public String toString() {
        return "MultiFieldValueClassRepresentation(underlyingPropertyNamesToTypes=" + this.getUnderlyingPropertyNamesToTypes() + ')';
    }
}

