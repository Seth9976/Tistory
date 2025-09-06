package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.TuplesKt;
import kotlin.collections.k;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;
import org.jetbrains.annotations.NotNull;

@SourceDebugExtension({"SMAP\nInlineClassRepresentation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InlineClassRepresentation.kt\norg/jetbrains/kotlin/descriptors/InlineClassRepresentation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,25:1\n1#2:26\n*E\n"})
public final class InlineClassRepresentation extends ValueClassRepresentation {
    public final Name a;
    public final SimpleTypeMarker b;

    public InlineClassRepresentation(@NotNull Name name0, @NotNull SimpleTypeMarker simpleTypeMarker0) {
        Intrinsics.checkNotNullParameter(name0, "underlyingPropertyName");
        Intrinsics.checkNotNullParameter(simpleTypeMarker0, "underlyingType");
        super(null);
        this.a = name0;
        this.b = simpleTypeMarker0;
    }

    @NotNull
    public final Name getUnderlyingPropertyName() {
        return this.a;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation
    @NotNull
    public List getUnderlyingPropertyNamesToTypes() {
        return k.listOf(TuplesKt.to(this.a, this.b));
    }

    @NotNull
    public final SimpleTypeMarker getUnderlyingType() {
        return this.b;
    }

    @Override
    @NotNull
    public String toString() {
        return "InlineClassRepresentation(underlyingPropertyName=" + this.a + ", underlyingType=" + this.b + ')';
    }
}

