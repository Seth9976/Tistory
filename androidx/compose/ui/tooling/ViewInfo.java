package androidx.compose.ui.tooling;

import a5.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.data.SourceLocation;
import androidx.compose.ui.unit.IntRect;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.o;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b)\b\u0080\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\b\u0010\t\u001A\u0004\u0018\u00010\b\u0012\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\u00000\n\u0012\b\u0010\f\u001A\u0004\u0018\u00010\u0001\u00A2\u0006\u0004\b\r\u0010\u000EJ\r\u0010\u0010\u001A\u00020\u000F\u00A2\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001A\b\u0012\u0004\u0012\u00020\u00000\n\u00A2\u0006\u0004\b\u0012\u0010\u0013J\u000F\u0010\u0014\u001A\u00020\u0002H\u0016\u00A2\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0016\u0010\u0015J\u0010\u0010\u0017\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001A\u00020\u0006H\u00C6\u0003\u00A2\u0006\u0004\b\u0019\u0010\u001AJ\u0012\u0010\u001B\u001A\u0004\u0018\u00010\bH\u00C6\u0003\u00A2\u0006\u0004\b\u001B\u0010\u001CJ\u0016\u0010\u001D\u001A\b\u0012\u0004\u0012\u00020\u00000\nH\u00C6\u0003\u00A2\u0006\u0004\b\u001D\u0010\u0013J\u0012\u0010\u001E\u001A\u0004\u0018\u00010\u0001H\u00C6\u0003\u00A2\u0006\u0004\b\u001E\u0010\u001FJV\u0010 \u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00062\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\b2\u000E\b\u0002\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\u00000\n2\n\b\u0002\u0010\f\u001A\u0004\u0018\u00010\u0001H\u00C6\u0001\u00A2\u0006\u0004\b \u0010!J\u0010\u0010\"\u001A\u00020\u0004H\u00D6\u0001\u00A2\u0006\u0004\b\"\u0010\u0018J\u001A\u0010$\u001A\u00020\u000F2\b\u0010#\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003\u00A2\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b&\u0010\'\u001A\u0004\b(\u0010\u0015R\u0017\u0010\u0005\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b)\u0010*\u001A\u0004\b+\u0010\u0018R\u0017\u0010\u0007\u001A\u00020\u00068\u0006\u00A2\u0006\f\n\u0004\b,\u0010-\u001A\u0004\b.\u0010\u001AR\u0019\u0010\t\u001A\u0004\u0018\u00010\b8\u0006\u00A2\u0006\f\n\u0004\b/\u00100\u001A\u0004\b1\u0010\u001CR\u001D\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\u00000\n8\u0006\u00A2\u0006\f\n\u0004\b2\u00103\u001A\u0004\b4\u0010\u0013R\u0019\u0010\f\u001A\u0004\u0018\u00010\u00018\u0006\u00A2\u0006\f\n\u0004\b5\u00106\u001A\u0004\b7\u0010\u001F\u00A8\u00068"}, d2 = {"Landroidx/compose/ui/tooling/ViewInfo;", "", "", "fileName", "", "lineNumber", "Landroidx/compose/ui/unit/IntRect;", "bounds", "Landroidx/compose/ui/tooling/data/SourceLocation;", "location", "", "children", "layoutInfo", "<init>", "(Ljava/lang/String;ILandroidx/compose/ui/unit/IntRect;Landroidx/compose/ui/tooling/data/SourceLocation;Ljava/util/List;Ljava/lang/Object;)V", "", "hasBounds", "()Z", "allChildren", "()Ljava/util/List;", "toString", "()Ljava/lang/String;", "component1", "component2", "()I", "component3", "()Landroidx/compose/ui/unit/IntRect;", "component4", "()Landroidx/compose/ui/tooling/data/SourceLocation;", "component5", "component6", "()Ljava/lang/Object;", "copy", "(Ljava/lang/String;ILandroidx/compose/ui/unit/IntRect;Landroidx/compose/ui/tooling/data/SourceLocation;Ljava/util/List;Ljava/lang/Object;)Landroidx/compose/ui/tooling/ViewInfo;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getFileName", "b", "I", "getLineNumber", "c", "Landroidx/compose/ui/unit/IntRect;", "getBounds", "d", "Landroidx/compose/ui/tooling/data/SourceLocation;", "getLocation", "e", "Ljava/util/List;", "getChildren", "f", "Ljava/lang/Object;", "getLayoutInfo", "ui-tooling_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nComposeViewAdapter.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposeViewAdapter.android.kt\nandroidx/compose/ui/tooling/ViewInfo\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,668:1\n1360#2:669\n1446#2,5:670\n1#3:675\n*S KotlinDebug\n*F\n+ 1 ComposeViewAdapter.android.kt\nandroidx/compose/ui/tooling/ViewInfo\n*L\n98#1:669\n98#1:670,5\n*E\n"})
public final class ViewInfo {
    public static final int $stable = 8;
    public final String a;
    public final int b;
    public final IntRect c;
    public final SourceLocation d;
    public final List e;
    public final Object f;

    public ViewInfo(@NotNull String s, int v, @NotNull IntRect intRect0, @Nullable SourceLocation sourceLocation0, @NotNull List list0, @Nullable Object object0) {
        this.a = s;
        this.b = v;
        this.c = intRect0;
        this.d = sourceLocation0;
        this.e = list0;
        this.f = object0;
    }

    @NotNull
    public final List allChildren() {
        Collection collection0 = this.e;
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: this.e) {
            o.addAll(arrayList0, ((ViewInfo)object0).allChildren());
        }
        return CollectionsKt___CollectionsKt.plus(collection0, arrayList0);
    }

    @NotNull
    public final String component1() {
        return this.a;
    }

    public final int component2() {
        return this.b;
    }

    @NotNull
    public final IntRect component3() {
        return this.c;
    }

    @Nullable
    public final SourceLocation component4() {
        return this.d;
    }

    @NotNull
    public final List component5() {
        return this.e;
    }

    @Nullable
    public final Object component6() {
        return this.f;
    }

    @NotNull
    public final ViewInfo copy(@NotNull String s, int v, @NotNull IntRect intRect0, @Nullable SourceLocation sourceLocation0, @NotNull List list0, @Nullable Object object0) {
        return new ViewInfo(s, v, intRect0, sourceLocation0, list0, object0);
    }

    public static ViewInfo copy$default(ViewInfo viewInfo0, String s, int v, IntRect intRect0, SourceLocation sourceLocation0, List list0, Object object0, int v1, Object object1) {
        if((v1 & 1) != 0) {
            s = viewInfo0.a;
        }
        if((v1 & 2) != 0) {
            v = viewInfo0.b;
        }
        if((v1 & 4) != 0) {
            intRect0 = viewInfo0.c;
        }
        if((v1 & 8) != 0) {
            sourceLocation0 = viewInfo0.d;
        }
        if((v1 & 16) != 0) {
            list0 = viewInfo0.e;
        }
        if((v1 & 0x20) != 0) {
            object0 = viewInfo0.f;
        }
        return viewInfo0.copy(s, v, intRect0, sourceLocation0, list0, object0);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ViewInfo)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.a, ((ViewInfo)object0).a)) {
            return false;
        }
        if(this.b != ((ViewInfo)object0).b) {
            return false;
        }
        if(!Intrinsics.areEqual(this.c, ((ViewInfo)object0).c)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.d, ((ViewInfo)object0).d)) {
            return false;
        }
        return Intrinsics.areEqual(this.e, ((ViewInfo)object0).e) ? Intrinsics.areEqual(this.f, ((ViewInfo)object0).f) : false;
    }

    @NotNull
    public final IntRect getBounds() {
        return this.c;
    }

    @NotNull
    public final List getChildren() {
        return this.e;
    }

    @NotNull
    public final String getFileName() {
        return this.a;
    }

    @Nullable
    public final Object getLayoutInfo() {
        return this.f;
    }

    public final int getLineNumber() {
        return this.b;
    }

    @Nullable
    public final SourceLocation getLocation() {
        return this.d;
    }

    public final boolean hasBounds() {
        return this.c.getBottom() != 0 && this.c.getRight() != 0;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = b.c(this.e, ((this.c.hashCode() + a.c(this.b, this.a.hashCode() * 0x1F, 0x1F)) * 0x1F + (this.d == null ? 0 : this.d.hashCode())) * 0x1F, 0x1F);
        Object object0 = this.f;
        if(object0 != null) {
            v = object0.hashCode();
        }
        return v1 + v;
    }

    @Override
    @NotNull
    public String toString() {
        String s;
        StringBuilder stringBuilder0 = new StringBuilder("(");
        stringBuilder0.append(this.a);
        stringBuilder0.append(':');
        stringBuilder0.append(this.b);
        stringBuilder0.append(",\n            |bounds=(top=");
        IntRect intRect0 = this.c;
        stringBuilder0.append(intRect0.getTop());
        stringBuilder0.append(", left=");
        stringBuilder0.append(intRect0.getLeft());
        stringBuilder0.append(",\n            |location=");
        SourceLocation sourceLocation0 = this.d;
        if(sourceLocation0 == null) {
            s = "<none>";
        }
        else {
            s = "(" + sourceLocation0.getOffset() + 'L' + sourceLocation0.getLength();
            if(s == null) {
                s = "<none>";
            }
        }
        stringBuilder0.append(s);
        stringBuilder0.append("\n            |bottom=");
        stringBuilder0.append(intRect0.getBottom());
        stringBuilder0.append(", right=");
        stringBuilder0.append(intRect0.getRight());
        stringBuilder0.append("),\n            |childrenCount=");
        stringBuilder0.append(this.e.size());
        stringBuilder0.append(')');
        return k.trimMargin$default(stringBuilder0.toString(), null, 1, null);
    }
}

