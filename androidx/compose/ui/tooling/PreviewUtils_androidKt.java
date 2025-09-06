package androidx.compose.ui.tooling;

import androidx.compose.ui.tooling.data.Group;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.k;
import kotlin.collections.l;
import kotlin.collections.o;
import kotlin.jvm.JvmInline;
import kotlin.jvm.KotlinReflectionNotSupportedError;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000:\n\u0002\u0010\u000E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\u001A!\u0010\u0003\u001A\u0010\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u0002\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001A5\u0010\n\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0014\u0010\u0005\u001A\u0010\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u0002\u0018\u00010\u00012\u0006\u0010\u0007\u001A\u00020\u0006H\u0000¢\u0006\u0004\b\n\u0010\u000B\u001A)\u0010\u0010\u001A\u0004\u0018\u00010\f*\u00020\f2\u0012\u0010\u000F\u001A\u000E\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000E0\rH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001A-\u0010\u0013\u001A\b\u0012\u0004\u0012\u00020\f0\u0012*\u00020\f2\u0012\u0010\u000F\u001A\u000E\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000E0\rH\u0000¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"", "Ljava/lang/Class;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "asPreviewProviderClass", "(Ljava/lang/String;)Ljava/lang/Class;", "parameterProviderClass", "", "parameterProviderIndex", "", "", "getPreviewProviderParameters", "(Ljava/lang/Class;I)[Ljava/lang/Object;", "Landroidx/compose/ui/tooling/data/Group;", "Lkotlin/Function1;", "", "predicate", "firstOrNull", "(Landroidx/compose/ui/tooling/data/Group;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/tooling/data/Group;", "", "findAll", "(Landroidx/compose/ui/tooling/data/Group;Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "ui-tooling_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPreviewUtils.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreviewUtils.android.kt\nandroidx/compose/ui/tooling/PreviewUtils_androidKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 5 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,169:1\n3133#2,11:170\n12744#2,2:188\n1109#2,2:190\n1549#3:181\n1620#3,3:182\n37#4,2:185\n26#5:187\n1#6:192\n*S KotlinDebug\n*F\n+ 1 PreviewUtils.android.kt\nandroidx/compose/ui/tooling/PreviewUtils_androidKt\n*L\n50#1:170,11\n90#1:188,2\n93#1:190,2\n63#1:181\n63#1:182,3\n64#1:185,2\n76#1:187\n*E\n"})
public final class PreviewUtils_androidKt {
    public static final List a(Group group0, Function1 function10, boolean z) {
        List list0 = new ArrayList();
        List list1 = CollectionsKt__CollectionsKt.mutableListOf(new Group[]{group0});
        while(!list1.isEmpty()) {
            Group group1 = (Group)o.removeLast(list1);
            if(((Boolean)function10.invoke(group1)).booleanValue()) {
                if(z) {
                    return k.listOf(group1);
                }
                list0.add(group1);
            }
            list1.addAll(group1.getChildren());
        }
        return list0;
    }

    @Nullable
    public static final Class asPreviewProviderClass(@NotNull String s) {
        try {
            return Class.forName(s);
        }
        catch(ClassNotFoundException classNotFoundException0) {
            PreviewLogger.Companion.logError$ui_tooling_release("Unable to find PreviewProvider \'" + s + '\'', classNotFoundException0);
            return null;
        }
    }

    public static final Object b(Object object0) {
        if(object0 != null) {
            Annotation[] arr_annotation = object0.getClass().getAnnotations();
            for(int v1 = 0; v1 < arr_annotation.length; ++v1) {
                if(arr_annotation[v1] instanceof JvmInline) {
                    Field[] arr_field = object0.getClass().getDeclaredFields();
                    for(int v = 0; v < arr_field.length; ++v) {
                        Field field0 = arr_field[v];
                        if(field0.getType().isPrimitive()) {
                            String s = field0.getName();
                            Field field1 = object0.getClass().getDeclaredField(s);
                            field1.setAccessible(true);
                            return field1.get(object0);
                        }
                    }
                    throw new NoSuchElementException("Array contains no element matching the predicate.");
                }
            }
        }
        return object0;
    }

    @NotNull
    public static final List findAll(@NotNull Group group0, @NotNull Function1 function10) {
        return PreviewUtils_androidKt.a(group0, function10, false);
    }

    @Nullable
    public static final Group firstOrNull(@NotNull Group group0, @NotNull Function1 function10) {
        return (Group)CollectionsKt___CollectionsKt.firstOrNull(PreviewUtils_androidKt.a(group0, function10, true));
    }

    @NotNull
    public static final Object[] getPreviewProviderParameters(@Nullable Class class0, int v) {
        if(class0 != null) {
            try {
                Constructor[] arr_constructor = class0.getConstructors();
                int v2 = 0;
                boolean z = false;
                Constructor constructor0 = null;
                while(v2 < arr_constructor.length) {
                    Constructor constructor1 = arr_constructor[v2];
                    if(constructor1.getParameterTypes().length == 0) {
                        if(!z) {
                            z = true;
                            constructor0 = constructor1;
                            goto label_15;
                        }
                        constructor0 = null;
                        goto label_19;
                    }
                label_15:
                    ++v2;
                }
                if(!z) {
                    constructor0 = null;
                }
            label_19:
                if(constructor0 == null) {
                    throw new IllegalArgumentException("PreviewParameterProvider constructor can not have parameters");
                }
                constructor0.setAccessible(true);
                Object object0 = constructor0.newInstance(null);
                Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type androidx.compose.ui.tooling.preview.PreviewParameterProvider<*>");
                if(v < 0) {
                    Sequence sequence0 = ((PreviewParameterProvider)object0).getValues();
                    int v3 = ((PreviewParameterProvider)object0).getCount();
                    Iterator iterator0 = sequence0.iterator();
                    Object[] arr_object = new Object[v3];
                    for(int v1 = 0; v1 < v3; ++v1) {
                        Object object1 = iterator0.next();
                        arr_object[v1] = object1;
                    }
                    return arr_object;
                }
                Iterable iterable0 = k.listOf(SequencesKt___SequencesKt.elementAt(((PreviewParameterProvider)object0).getValues(), v));
                ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(iterable0, 10));
                for(Object object2: iterable0) {
                    arrayList0.add(PreviewUtils_androidKt.b(object2));
                }
                return arrayList0.toArray(new Object[0]);
            }
            catch(KotlinReflectionNotSupportedError unused_ex) {
                throw new IllegalStateException("Deploying Compose Previews with PreviewParameterProvider arguments requires adding a dependency to the kotlin-reflect library.\nConsider adding \'debugImplementation \"org.jetbrains.kotlin:kotlin-reflect:$kotlin_version\"\' to the module\'s build.gradle.");
            }
        }
        return new Object[0];
    }
}

