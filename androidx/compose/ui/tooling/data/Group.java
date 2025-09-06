package androidx.compose.ui.tooling.data;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.IntRect;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@UiToolingDataApi
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000E\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001E\n\u0002\b\b\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001R\u0019\u0010\u0006\u001A\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001A\u0004\b\u0004\u0010\u0005R\u0019\u0010\f\u001A\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001A\u0004\b\n\u0010\u000BR\u0019\u0010\u0012\u001A\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000E\u0010\u000F\u001A\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0015\u001A\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0003\u001A\u0004\b\u0014\u0010\u0005R\u0017\u0010\u001B\u001A\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001A\u0004\b\u0019\u0010\u001AR\u001F\u0010!\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001C8\u0006¢\u0006\f\n\u0004\b\u001D\u0010\u001E\u001A\u0004\b\u001F\u0010 R\u001D\u0010$\u001A\b\u0012\u0004\u0012\u00020\u00000\u001C8\u0006¢\u0006\f\n\u0004\b\"\u0010\u001E\u001A\u0004\b#\u0010 R\u0017\u0010(\u001A\u00020%8\u0006¢\u0006\f\n\u0004\b&\u0010\'\u001A\u0004\b(\u0010)R\u001A\u0010.\u001A\b\u0012\u0004\u0012\u00020+0*8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b,\u0010-R\u001A\u00101\u001A\b\u0012\u0004\u0012\u00020/0*8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b0\u0010-\u0082\u0001\u0003234¨\u00065"}, d2 = {"Landroidx/compose/ui/tooling/data/Group;", "", "a", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "key", "", "b", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "Landroidx/compose/ui/tooling/data/SourceLocation;", "c", "Landroidx/compose/ui/tooling/data/SourceLocation;", "getLocation", "()Landroidx/compose/ui/tooling/data/SourceLocation;", "location", "d", "getIdentity", "identity", "Landroidx/compose/ui/unit/IntRect;", "e", "Landroidx/compose/ui/unit/IntRect;", "getBox", "()Landroidx/compose/ui/unit/IntRect;", "box", "", "f", "Ljava/util/Collection;", "getData", "()Ljava/util/Collection;", "data", "g", "getChildren", "children", "", "h", "Z", "isInline", "()Z", "", "Landroidx/compose/ui/layout/ModifierInfo;", "getModifierInfo", "()Ljava/util/List;", "modifierInfo", "Landroidx/compose/ui/tooling/data/ParameterInformation;", "getParameters", "parameters", "Landroidx/compose/ui/tooling/data/CallGroup;", "Lr2/b;", "Landroidx/compose/ui/tooling/data/NodeGroup;", "ui-tooling-data_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public abstract class Group {
    public static final int $stable = 8;
    public final Object a;
    public final String b;
    public final SourceLocation c;
    public final Object d;
    public final IntRect e;
    public final Collection f;
    public final Collection g;
    public final boolean h;

    public Group(Object object0, String s, SourceLocation sourceLocation0, Object object1, IntRect intRect0, Collection collection0, Collection collection1, boolean z, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = object0;
        this.b = s;
        this.c = sourceLocation0;
        this.d = object1;
        this.e = intRect0;
        this.f = collection0;
        this.g = collection1;
        this.h = z;
    }

    @NotNull
    public final IntRect getBox() {
        return this.e;
    }

    @NotNull
    public final Collection getChildren() {
        return this.g;
    }

    @NotNull
    public final Collection getData() {
        return this.f;
    }

    @Nullable
    public final Object getIdentity() {
        return this.d;
    }

    @Nullable
    public final Object getKey() {
        return this.a;
    }

    @Nullable
    public final SourceLocation getLocation() {
        return this.c;
    }

    @NotNull
    public List getModifierInfo() {
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @Nullable
    public final String getName() {
        return this.b;
    }

    @NotNull
    public List getParameters() {
        return CollectionsKt__CollectionsKt.emptyList();
    }

    public final boolean isInline() {
        return this.h;
    }
}

