package androidx.compose.ui.modifier;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u001A\u0006\u0010\u0000\u001A\u00020\u0001\u001A?\u0010\u0000\u001A\u00020\u00012\n\u0010\u0002\u001A\u0006\u0012\u0002\b\u00030\u00032\n\u0010\u0004\u001A\u0006\u0012\u0002\b\u00030\u00032\u001A\u0010\u0005\u001A\u000E\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00030\u0006\"\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0002\u0010\u0007\u001A\u001A\u0010\u0000\u001A\u00020\u0001\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001A\b\u0012\u0004\u0012\u0002H\b0\u0003\u001A)\u0010\u0000\u001A\u00020\u00012\u001A\u0010\u0005\u001A\u000E\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00030\u0006\"\u0006\u0012\u0002\b\u00030\u0003H\u0007¢\u0006\u0002\u0010\n\u001AA\u0010\u0000\u001A\u00020\u000122\u0010\u000B\u001A\u001A\u0012\u0016\b\u0001\u0012\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\r0\f0\u0006\"\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\r0\fH\u0007¢\u0006\u0002\u0010\u000E\u001Ao\u0010\u0000\u001A\u00020\u00012\u0016\u0010\u000F\u001A\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\r0\f2\u0016\u0010\u0010\u001A\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\r0\f22\u0010\u000B\u001A\u001A\u0012\u0016\b\u0001\u0012\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\r0\f0\u0006\"\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\u0010\u0011\u001A&\u0010\u0000\u001A\u00020\u0001\"\u0004\b\u0000\u0010\b2\u0018\u0010\u0012\u001A\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\u0003\u0012\u0004\u0012\u0002H\b0\f¨\u0006\u0013"}, d2 = {"modifierLocalMapOf", "Landroidx/compose/ui/modifier/ModifierLocalMap;", "key1", "Landroidx/compose/ui/modifier/ModifierLocal;", "key2", "keys", "", "(Landroidx/compose/ui/modifier/ModifierLocal;Landroidx/compose/ui/modifier/ModifierLocal;[Landroidx/compose/ui/modifier/ModifierLocal;)Landroidx/compose/ui/modifier/ModifierLocalMap;", "T", "key", "([Landroidx/compose/ui/modifier/ModifierLocal;)Landroidx/compose/ui/modifier/ModifierLocalMap;", "entries", "Lkotlin/Pair;", "", "([Lkotlin/Pair;)Landroidx/compose/ui/modifier/ModifierLocalMap;", "entry1", "entry2", "(Lkotlin/Pair;Lkotlin/Pair;[Lkotlin/Pair;)Landroidx/compose/ui/modifier/ModifierLocalMap;", "entry", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nModifierLocalModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModifierLocalModifierNode.kt\nandroidx/compose/ui/modifier/ModifierLocalModifierNodeKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,253:1\n1#2:254\n11335#3:255\n11670#3,3:256\n37#4,2:259\n37#4,2:272\n37#4,2:274\n151#5,3:261\n33#5,4:264\n154#5,2:268\n38#5:270\n156#5:271\n*S KotlinDebug\n*F\n+ 1 ModifierLocalModifierNode.kt\nandroidx/compose/ui/modifier/ModifierLocalModifierNodeKt\n*L\n211#1:255\n211#1:256,3\n211#1:259,2\n237#1:272,2\n251#1:274,2\n237#1:261,3\n237#1:264,4\n237#1:268,2\n237#1:270\n237#1:271\n*E\n"})
public final class ModifierLocalModifierNodeKt {
    @NotNull
    public static final ModifierLocalMap modifierLocalMapOf() {
        return EmptyMap.INSTANCE;
    }

    @NotNull
    public static final ModifierLocalMap modifierLocalMapOf(@NotNull ModifierLocal modifierLocal0) {
        return new SingleLocalMap(modifierLocal0);
    }

    @NotNull
    public static final ModifierLocalMap modifierLocalMapOf(@NotNull ModifierLocal modifierLocal0, @NotNull ModifierLocal modifierLocal1, @NotNull ModifierLocal[] arr_modifierLocal) {
        Pair pair0 = TuplesKt.to(modifierLocal0, null);
        SpreadBuilder spreadBuilder0 = new SpreadBuilder(2);
        spreadBuilder0.add(TuplesKt.to(modifierLocal1, null));
        ArrayList arrayList0 = new ArrayList(arr_modifierLocal.length);
        for(int v = 0; v < arr_modifierLocal.length; ++v) {
            arrayList0.add(TuplesKt.to(arr_modifierLocal[v], null));
        }
        spreadBuilder0.addSpread(arrayList0.toArray(new Pair[0]));
        return new MultiLocalMap(pair0, ((Pair[])spreadBuilder0.toArray(new Pair[spreadBuilder0.size()])));
    }

    @NotNull
    public static final ModifierLocalMap modifierLocalMapOf(@NotNull Pair pair0) {
        ModifierLocalMap modifierLocalMap0 = new SingleLocalMap(((ModifierLocal)pair0.getFirst()));
        ((SingleLocalMap)modifierLocalMap0).set$ui_release(((ModifierLocal)pair0.getFirst()), pair0.getSecond());
        return modifierLocalMap0;
    }

    @NotNull
    public static final ModifierLocalMap modifierLocalMapOf(@NotNull Pair pair0, @NotNull Pair pair1, @NotNull Pair[] arr_pair) {
        SpreadBuilder spreadBuilder0 = new SpreadBuilder(2);
        spreadBuilder0.add(pair1);
        spreadBuilder0.addSpread(arr_pair);
        return new MultiLocalMap(pair0, ((Pair[])spreadBuilder0.toArray(new Pair[spreadBuilder0.size()])));
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use a different overloaded version of this function")
    public static final ModifierLocalMap modifierLocalMapOf(ModifierLocal[] arr_modifierLocal) {
        switch(arr_modifierLocal.length) {
            case 0: {
                return EmptyMap.INSTANCE;
            }
            case 1: {
                return new SingleLocalMap(((ModifierLocal)ArraysKt___ArraysKt.first(arr_modifierLocal)));
            }
            default: {
                Pair pair0 = TuplesKt.to(ArraysKt___ArraysKt.first(arr_modifierLocal), null);
                List list0 = ArraysKt___ArraysKt.drop(arr_modifierLocal, 1);
                ArrayList arrayList0 = new ArrayList(list0.size());
                int v = list0.size();
                for(int v1 = 0; v1 < v; ++v1) {
                    arrayList0.add(TuplesKt.to(((ModifierLocal)list0.get(v1)), null));
                }
                Pair[] arr_pair = (Pair[])arrayList0.toArray(new Pair[0]);
                return new MultiLocalMap(pair0, ((Pair[])Arrays.copyOf(arr_pair, arr_pair.length)));
            }
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use a different overloaded version of this function")
    public static final ModifierLocalMap modifierLocalMapOf(Pair[] arr_pair) {
        switch(arr_pair.length) {
            case 0: {
                return EmptyMap.INSTANCE;
            }
            case 1: {
                return new MultiLocalMap(((Pair)ArraysKt___ArraysKt.first(arr_pair)), new Pair[0]);
            }
            default: {
                Pair pair0 = (Pair)ArraysKt___ArraysKt.first(arr_pair);
                Pair[] arr_pair1 = (Pair[])ArraysKt___ArraysKt.drop(arr_pair, 1).toArray(new Pair[0]);
                return new MultiLocalMap(pair0, ((Pair[])Arrays.copyOf(arr_pair1, arr_pair1.length)));
            }
        }
    }
}

