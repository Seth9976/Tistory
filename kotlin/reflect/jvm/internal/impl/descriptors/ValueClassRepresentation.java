package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;
import org.jetbrains.annotations.NotNull;

@SourceDebugExtension({"SMAP\nValueClassRepresentation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ValueClassRepresentation.kt\norg/jetbrains/kotlin/descriptors/ValueClassRepresentation\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,50:1\n1549#2:51\n1620#2,3:52\n*S KotlinDebug\n*F\n+ 1 ValueClassRepresentation.kt\norg/jetbrains/kotlin/descriptors/ValueClassRepresentation\n*L\n22#1:51\n22#1:52,3\n*E\n"})
public abstract class ValueClassRepresentation {
    public ValueClassRepresentation(DefaultConstructorMarker defaultConstructorMarker0) {
    }

    @NotNull
    public abstract List getUnderlyingPropertyNamesToTypes();

    @NotNull
    public final ValueClassRepresentation mapUnderlyingType(@NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "transform");
        if(this instanceof InlineClassRepresentation) {
            return new InlineClassRepresentation(((InlineClassRepresentation)this).getUnderlyingPropertyName(), ((SimpleTypeMarker)function10.invoke(((InlineClassRepresentation)this).getUnderlyingType())));
        }
        if(!(this instanceof MultiFieldValueClassRepresentation)) {
            throw new NoWhenBranchMatchedException();
        }
        Iterable iterable0 = this.getUnderlyingPropertyNamesToTypes();
        ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(iterable0, 10));
        for(Object object0: iterable0) {
            arrayList0.add(TuplesKt.to(((Name)((Pair)object0).component1()), function10.invoke(((SimpleTypeMarker)((Pair)object0).component2()))));
        }
        return new MultiFieldValueClassRepresentation(arrayList0);
    }
}

