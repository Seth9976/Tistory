package androidx.compose.ui.autofill;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.geometry.Rect;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@ExperimentalComposeUiApi
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\b\u0007\u0018\u0000 &2\u00020\u0001:\u0001&B9\u0012\u000E\b\u0002\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u0005\u0012\u0014\u0010\n\u001A\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\u0004\b\u000B\u0010\fJ\u001A\u0010\u000F\u001A\u00020\u000E2\b\u0010\r\u001A\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000F\u0010\u0010J\u000F\u0010\u0012\u001A\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001D\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001A\u0004\b\u0016\u0010\u0017R$\u0010\u0006\u001A\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001A\u0004\b\u001A\u0010\u001B\"\u0004\b\u001C\u0010\u001DR%\u0010\n\u001A\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001E\u0010\u001F\u001A\u0004\b \u0010!R\u0017\u0010%\u001A\u00020\u00118\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001A\u0004\b$\u0010\u0013¨\u0006\'"}, d2 = {"Landroidx/compose/ui/autofill/AutofillNode;", "", "", "Landroidx/compose/ui/autofill/AutofillType;", "autofillTypes", "Landroidx/compose/ui/geometry/Rect;", "boundingBox", "Lkotlin/Function1;", "", "", "onFill", "<init>", "(Ljava/util/List;Landroidx/compose/ui/geometry/Rect;Lkotlin/jvm/functions/Function1;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Ljava/util/List;", "getAutofillTypes", "()Ljava/util/List;", "b", "Landroidx/compose/ui/geometry/Rect;", "getBoundingBox", "()Landroidx/compose/ui/geometry/Rect;", "setBoundingBox", "(Landroidx/compose/ui/geometry/Rect;)V", "c", "Lkotlin/jvm/functions/Function1;", "getOnFill", "()Lkotlin/jvm/functions/Function1;", "d", "I", "getId", "id", "Companion", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class AutofillNode {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001R\u0016\u0010\u0003\u001A\u00020\u00028\u0002@\u0002X\u0082\u000E¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/autofill/AutofillNode$Companion;", "", "", "previousId", "I", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nAutofill.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Autofill.kt\nandroidx/compose/ui/autofill/AutofillNode$Companion\n+ 2 JvmActuals.jvm.kt\nandroidx/compose/ui/platform/JvmActuals_jvmKt\n*L\n1#1,105:1\n36#2:106\n*S KotlinDebug\n*F\n+ 1 Autofill.kt\nandroidx/compose/ui/autofill/AutofillNode$Companion\n*L\n82#1:106\n*E\n"})
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public static final int access$generateId(Companion autofillNode$Companion0) {
            synchronized(autofillNode$Companion0) {
                AutofillNode.e = 1;
                return 0;
            }
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final List a;
    public Rect b;
    public final Function1 c;
    public final int d;
    public static int e;

    static {
        AutofillNode.Companion = new Companion(null);
        AutofillNode.$stable = 8;
    }

    public AutofillNode(@NotNull List list0, @Nullable Rect rect0, @Nullable Function1 function10) {
        this.a = list0;
        this.b = rect0;
        this.c = function10;
        this.d = Companion.access$generateId(AutofillNode.Companion);
    }

    public AutofillNode(List list0, Rect rect0, Function1 function10, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            list0 = CollectionsKt__CollectionsKt.emptyList();
        }
        if((v & 2) != 0) {
            rect0 = null;
        }
        this(list0, rect0, function10);
    }

    public static final int access$getPreviousId$cp() [...] // 潜在的解密器

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof AutofillNode)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.a, ((AutofillNode)object0).a)) {
            return false;
        }
        return Intrinsics.areEqual(this.b, ((AutofillNode)object0).b) ? this.c == ((AutofillNode)object0).c : false;
    }

    @NotNull
    public final List getAutofillTypes() {
        return this.a;
    }

    @Nullable
    public final Rect getBoundingBox() {
        return this.b;
    }

    public final int getId() {
        return this.d;
    }

    @Nullable
    public final Function1 getOnFill() {
        return this.c;
    }

    @Override
    public int hashCode() {
        int v = this.a.hashCode();
        int v1 = 0;
        int v2 = this.b == null ? 0 : this.b.hashCode();
        Function1 function10 = this.c;
        if(function10 != null) {
            v1 = function10.hashCode();
        }
        return (v * 0x1F + v2) * 0x1F + v1;
    }

    public final void setBoundingBox(@Nullable Rect rect0) {
        this.b = rect0;
    }
}

