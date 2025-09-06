package androidx.compose.ui.semantics;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.ValueElementSequence;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.l;
import kotlin.collections.w;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001A\u000F\u0010\u0001\u001A\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001A4\u0010\u000B\u001A\u00020\u0003*\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00042\u0017\u0010\n\u001A\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t¢\u0006\u0004\b\u000B\u0010\f\u001A*\u0010\r\u001A\u00020\u0003*\u00020\u00032\u0017\u0010\n\u001A\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t¢\u0006\u0004\b\r\u0010\u000E¨\u0006\u000F"}, d2 = {"", "generateSemanticsId", "()I", "Landroidx/compose/ui/Modifier;", "", "mergeDescendants", "Lkotlin/Function1;", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "", "Lkotlin/ExtensionFunctionType;", "properties", "semantics", "(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;", "clearAndSetSemantics", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSemanticsModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsModifier.kt\nandroidx/compose/ui/semantics/SemanticsModifierKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,209:1\n1179#2,2:210\n1253#2,4:212\n*S KotlinDebug\n*F\n+ 1 SemanticsModifier.kt\nandroidx/compose/ui/semantics/SemanticsModifierKt\n*L\n205#1:210,2\n205#1:212,4\n*E\n"})
public final class SemanticsModifierKt {
    public static final AtomicInteger a;

    static {
        SemanticsModifierKt.a = new AtomicInteger(0);
    }

    public static final void access$addSemanticsPropertiesFrom(InspectorInfo inspectorInfo0, SemanticsConfiguration semanticsConfiguration0) {
        ValueElementSequence valueElementSequence0 = inspectorInfo0.getProperties();
        LinkedHashMap linkedHashMap0 = new LinkedHashMap(c.coerceAtLeast(w.mapCapacity(l.collectionSizeOrDefault(semanticsConfiguration0, 10)), 16));
        for(Object object0: semanticsConfiguration0) {
            Pair pair0 = TuplesKt.to(((SemanticsPropertyKey)((Map.Entry)object0).getKey()).getName(), ((Map.Entry)object0).getValue());
            linkedHashMap0.put(pair0.getFirst(), pair0.getSecond());
        }
        valueElementSequence0.set("properties", linkedHashMap0);
    }

    @NotNull
    public static final Modifier clearAndSetSemantics(@NotNull Modifier modifier0, @NotNull Function1 function10) {
        return modifier0.then(new ClearAndSetSemanticsElement(function10));
    }

    public static final int generateSemanticsId() {
        return SemanticsModifierKt.a.addAndGet(1);
    }

    @NotNull
    public static final Modifier semantics(@NotNull Modifier modifier0, boolean z, @NotNull Function1 function10) {
        return modifier0.then(new AppendedSemanticsElement(z, function10));
    }

    public static Modifier semantics$default(Modifier modifier0, boolean z, Function1 function10, int v, Object object0) {
        if((v & 1) != 0) {
            z = false;
        }
        return SemanticsModifierKt.semantics(modifier0, z, function10);
    }
}

