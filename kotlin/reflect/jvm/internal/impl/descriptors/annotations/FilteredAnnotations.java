package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nAnnotations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Annotations.kt\norg/jetbrains/kotlin/descriptors/annotations/FilteredAnnotations\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,123:1\n766#2:124\n857#2,2:125\n1747#2,3:127\n*S KotlinDebug\n*F\n+ 1 Annotations.kt\norg/jetbrains/kotlin/descriptors/annotations/FilteredAnnotations\n*L\n69#1:124\n69#1:125,2\n72#1:127,3\n*E\n"})
public final class FilteredAnnotations implements Annotations {
    public final Annotations a;
    public final boolean b;
    public final Function1 c;

    public FilteredAnnotations(@NotNull Annotations annotations0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(annotations0, "delegate");
        Intrinsics.checkNotNullParameter(function10, "fqNameFilter");
        this(annotations0, false, function10);
    }

    public FilteredAnnotations(@NotNull Annotations annotations0, boolean z, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(annotations0, "delegate");
        Intrinsics.checkNotNullParameter(function10, "fqNameFilter");
        super();
        this.a = annotations0;
        this.b = z;
        this.c = function10;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    @Nullable
    public AnnotationDescriptor findAnnotation(@NotNull FqName fqName0) {
        Intrinsics.checkNotNullParameter(fqName0, "fqName");
        return ((Boolean)this.c.invoke(fqName0)).booleanValue() ? this.a.findAnnotation(fqName0) : null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public boolean hasAnnotation(@NotNull FqName fqName0) {
        Intrinsics.checkNotNullParameter(fqName0, "fqName");
        return ((Boolean)this.c.invoke(fqName0)).booleanValue() ? this.a.hasAnnotation(fqName0) : false;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public boolean isEmpty() {
        Annotations annotations0 = this.a;
        if(!(annotations0 instanceof Collection) || !((Collection)annotations0).isEmpty()) {
            for(Object object0: annotations0) {
                FqName fqName0 = ((AnnotationDescriptor)object0).getFqName();
                if(fqName0 != null && ((Boolean)this.c.invoke(fqName0)).booleanValue()) {
                    return !this.b;
                }
                if(false) {
                    break;
                }
            }
        }
        return this.b;
    }

    @Override
    @NotNull
    public Iterator iterator() {
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: this.a) {
            FqName fqName0 = ((AnnotationDescriptor)object0).getFqName();
            if(fqName0 != null && ((Boolean)this.c.invoke(fqName0)).booleanValue()) {
                arrayList0.add(object0);
            }
        }
        return arrayList0.iterator();
    }
}

