package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.JvmActuals_jvmKt;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001C\n\u0002\u0010&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u000B\b\u0007\u0018\u00002\u00020\u00012\u001A\u0012\u0016\u0012\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00030\u0002B\u0007\u00A2\u0006\u0004\b\u0006\u0010\u0007J$\u0010\n\u001A\u00028\u0000\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001A\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0086\u0002\u00A2\u0006\u0004\b\n\u0010\u000BJ/\u0010\u000E\u001A\u00028\u0000\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001A\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\r\u001A\b\u0012\u0004\u0012\u00028\u00000\f\u00A2\u0006\u0004\b\u000E\u0010\u000FJ3\u0010\u0010\u001A\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001A\b\u0012\u0004\u0012\u00028\u00000\u00042\u000E\u0010\r\u001A\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\f\u00A2\u0006\u0004\b\u0010\u0010\u000FJ(\u0010\u0012\u001A\u001A\u0012\u0016\u0012\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00030\u0011H\u0096\u0002\u00A2\u0006\u0004\b\u0012\u0010\u0013J,\u0010\u0016\u001A\u00020\u0015\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001A\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0014\u001A\u00028\u0000H\u0096\u0002\u00A2\u0006\u0004\b\u0016\u0010\u0017J$\u0010\u0019\u001A\u00020\u0018\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001A\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0086\u0002\u00A2\u0006\u0004\b\u0019\u0010\u001AJ\u000F\u0010\u001D\u001A\u00020\u0018H\u0000\u00A2\u0006\u0004\b\u001B\u0010\u001CJ\u0017\u0010!\u001A\u00020\u00152\u0006\u0010\u001E\u001A\u00020\u0000H\u0000\u00A2\u0006\u0004\b\u001F\u0010 J\u0017\u0010$\u001A\u00020\u00152\u0006\u0010\"\u001A\u00020\u0000H\u0000\u00A2\u0006\u0004\b#\u0010 J\r\u0010%\u001A\u00020\u0000\u00A2\u0006\u0004\b%\u0010&J\u001A\u0010(\u001A\u00020\u00182\b\u0010\'\u001A\u0004\u0018\u00010\u0005H\u0096\u0002\u00A2\u0006\u0004\b(\u0010)J\u000F\u0010+\u001A\u00020*H\u0016\u00A2\u0006\u0004\b+\u0010,J\u000F\u0010.\u001A\u00020-H\u0016\u00A2\u0006\u0004\b.\u0010/R\"\u00102\u001A\u00020\u00188\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b0\u00101\u001A\u0004\b2\u0010\u001C\"\u0004\b3\u00104R\"\u00106\u001A\u00020\u00188\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b5\u00101\u001A\u0004\b6\u0010\u001C\"\u0004\b7\u00104\u00A8\u00068"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsConfiguration;", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "", "", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "", "<init>", "()V", "T", "key", "get", "(Landroidx/compose/ui/semantics/SemanticsPropertyKey;)Ljava/lang/Object;", "Lkotlin/Function0;", "defaultValue", "getOrElse", "(Landroidx/compose/ui/semantics/SemanticsPropertyKey;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "getOrElseNullable", "", "iterator", "()Ljava/util/Iterator;", "value", "", "set", "(Landroidx/compose/ui/semantics/SemanticsPropertyKey;Ljava/lang/Object;)V", "", "contains", "(Landroidx/compose/ui/semantics/SemanticsPropertyKey;)Z", "containsImportantForAccessibility$ui_release", "()Z", "containsImportantForAccessibility", "child", "mergeChild$ui_release", "(Landroidx/compose/ui/semantics/SemanticsConfiguration;)V", "mergeChild", "peer", "collapsePeer$ui_release", "collapsePeer", "copy", "()Landroidx/compose/ui/semantics/SemanticsConfiguration;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "b", "Z", "isMergingSemanticsOfDescendants", "setMergingSemanticsOfDescendants", "(Z)V", "c", "isClearingSemantics", "setClearingSemantics", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSemanticsConfiguration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsConfiguration.kt\nandroidx/compose/ui/semantics/SemanticsConfiguration\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,199:1\n1747#2,3:200\n*S KotlinDebug\n*F\n+ 1 SemanticsConfiguration.kt\nandroidx/compose/ui/semantics/SemanticsConfiguration\n*L\n78#1:200,3\n*E\n"})
public final class SemanticsConfiguration implements SemanticsPropertyReceiver, Iterable, KMappedMarker {
    public static final int $stable = 8;
    public final LinkedHashMap a;
    public boolean b;
    public boolean c;

    public SemanticsConfiguration() {
        this.a = new LinkedHashMap();
    }

    public final void collapsePeer$ui_release(@NotNull SemanticsConfiguration semanticsConfiguration0) {
        if(semanticsConfiguration0.b) {
            this.b = true;
        }
        if(semanticsConfiguration0.c) {
            this.c = true;
        }
        for(Object object0: semanticsConfiguration0.a.entrySet()) {
            SemanticsPropertyKey semanticsPropertyKey0 = (SemanticsPropertyKey)((Map.Entry)object0).getKey();
            Object object1 = ((Map.Entry)object0).getValue();
            LinkedHashMap linkedHashMap0 = this.a;
            if(!linkedHashMap0.containsKey(semanticsPropertyKey0)) {
                linkedHashMap0.put(semanticsPropertyKey0, object1);
            }
            else if(object1 instanceof AccessibilityAction) {
                Object object2 = linkedHashMap0.get(semanticsPropertyKey0);
                Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                String s = ((AccessibilityAction)object2).getLabel();
                if(s == null) {
                    s = ((AccessibilityAction)object1).getLabel();
                }
                Function function0 = ((AccessibilityAction)object2).getAction();
                if(function0 == null) {
                    function0 = ((AccessibilityAction)object1).getAction();
                }
                linkedHashMap0.put(semanticsPropertyKey0, new AccessibilityAction(s, function0));
            }
        }
    }

    public final boolean contains(@NotNull SemanticsPropertyKey semanticsPropertyKey0) {
        return this.a.containsKey(semanticsPropertyKey0);
    }

    public final boolean containsImportantForAccessibility$ui_release() {
        Iterable iterable0 = this.a.keySet();
        if(!(iterable0 instanceof Collection) || !((Collection)iterable0).isEmpty()) {
            for(Object object0: iterable0) {
                if(((SemanticsPropertyKey)object0).isImportantForAccessibility$ui_release()) {
                    return true;
                }
                if(false) {
                    break;
                }
            }
        }
        return false;
    }

    @NotNull
    public final SemanticsConfiguration copy() {
        SemanticsConfiguration semanticsConfiguration0 = new SemanticsConfiguration();
        semanticsConfiguration0.b = this.b;
        semanticsConfiguration0.c = this.c;
        semanticsConfiguration0.a.putAll(this.a);
        return semanticsConfiguration0;
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof SemanticsConfiguration)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.a, ((SemanticsConfiguration)object0).a)) {
            return false;
        }
        return this.b == ((SemanticsConfiguration)object0).b ? this.c == ((SemanticsConfiguration)object0).c : false;
    }

    public final Object get(@NotNull SemanticsPropertyKey semanticsPropertyKey0) {
        Object object0 = this.a.get(semanticsPropertyKey0);
        if(object0 == null) {
            throw new IllegalStateException("Key not present: " + semanticsPropertyKey0 + " - consider getOrElse or getOrNull");
        }
        return object0;
    }

    public final Object getOrElse(@NotNull SemanticsPropertyKey semanticsPropertyKey0, @NotNull Function0 function00) {
        Object object0 = this.a.get(semanticsPropertyKey0);
        return object0 == null ? function00.invoke() : object0;
    }

    @Nullable
    public final Object getOrElseNullable(@NotNull SemanticsPropertyKey semanticsPropertyKey0, @NotNull Function0 function00) {
        Object object0 = this.a.get(semanticsPropertyKey0);
        return object0 == null ? function00.invoke() : object0;
    }

    @Override
    public int hashCode() {
        return Boolean.hashCode(this.c) + a.e(this.a.hashCode() * 0x1F, 0x1F, this.b);
    }

    public final boolean isClearingSemantics() {
        return this.c;
    }

    public final boolean isMergingSemanticsOfDescendants() {
        return this.b;
    }

    @Override
    @NotNull
    public Iterator iterator() {
        return this.a.entrySet().iterator();
    }

    public final void mergeChild$ui_release(@NotNull SemanticsConfiguration semanticsConfiguration0) {
        for(Object object0: semanticsConfiguration0.a.entrySet()) {
            SemanticsPropertyKey semanticsPropertyKey0 = (SemanticsPropertyKey)((Map.Entry)object0).getKey();
            Object object1 = ((Map.Entry)object0).getValue();
            LinkedHashMap linkedHashMap0 = this.a;
            Object object2 = linkedHashMap0.get(semanticsPropertyKey0);
            Intrinsics.checkNotNull(semanticsPropertyKey0, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Any?>");
            Object object3 = semanticsPropertyKey0.merge(object2, object1);
            if(object3 != null) {
                linkedHashMap0.put(semanticsPropertyKey0, object3);
            }
        }
    }

    @Override  // androidx.compose.ui.semantics.SemanticsPropertyReceiver
    public void set(@NotNull SemanticsPropertyKey semanticsPropertyKey0, Object object0) {
        LinkedHashMap linkedHashMap0 = this.a;
        if(object0 instanceof AccessibilityAction && this.contains(semanticsPropertyKey0)) {
            Object object1 = linkedHashMap0.get(semanticsPropertyKey0);
            Intrinsics.checkNotNull(object1, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
            String s = ((AccessibilityAction)object0).getLabel();
            if(s == null) {
                s = ((AccessibilityAction)object1).getLabel();
            }
            Function function0 = ((AccessibilityAction)object0).getAction();
            if(function0 == null) {
                function0 = ((AccessibilityAction)object1).getAction();
            }
            linkedHashMap0.put(semanticsPropertyKey0, new AccessibilityAction(s, function0));
            return;
        }
        linkedHashMap0.put(semanticsPropertyKey0, object0);
    }

    public final void setClearingSemantics(boolean z) {
        this.c = z;
    }

    public final void setMergingSemanticsOfDescendants(boolean z) {
        this.b = z;
    }

    @Override
    @NotNull
    public String toString() {
        String s;
        StringBuilder stringBuilder0 = new StringBuilder();
        if(this.b) {
            stringBuilder0.append("mergeDescendants=true");
            s = ", ";
        }
        else {
            s = "";
        }
        if(this.c) {
            stringBuilder0.append(s);
            stringBuilder0.append("isClearingSemantics=true");
            s = ", ";
        }
        for(Object object0: this.a.entrySet()) {
            SemanticsPropertyKey semanticsPropertyKey0 = (SemanticsPropertyKey)((Map.Entry)object0).getKey();
            Object object1 = ((Map.Entry)object0).getValue();
            stringBuilder0.append(s);
            stringBuilder0.append(semanticsPropertyKey0.getName());
            stringBuilder0.append(" : ");
            stringBuilder0.append(object1);
            s = ", ";
        }
        return JvmActuals_jvmKt.simpleIdentityToString(this, null) + "{ " + stringBuilder0 + " }";
    }
}

