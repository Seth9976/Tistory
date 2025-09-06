package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u000E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001A\u00020\u0002\u00A2\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000B\u001A\u00020\n2\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\t\u001A\u00020\u0002\u00A2\u0006\u0004\b\u000B\u0010\bJ\u0015\u0010\f\u001A\u00020\n2\u0006\u0010\t\u001A\u00020\u0002\u00A2\u0006\u0004\b\f\u0010\rJ\u001D\u0010\u0011\u001A\u00020\n2\u0006\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\u0010\u001A\u00020\u0002\u00A2\u0006\u0004\b\u0011\u0010\u0012J\u001D\u0010\u0011\u001A\u00020\n2\u0006\u0010\u0014\u001A\u00020\u00132\u0006\u0010\u0010\u001A\u00020\u0002\u00A2\u0006\u0004\b\u0011\u0010\u0015J%\u0010\u0017\u001A\u00020\n2\u0006\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\u0016\u001A\u00020\u00022\u0006\u0010\u0010\u001A\u00020\u0002\u00A2\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001A\u00020\n2\u0006\u0010\t\u001A\u00020\u0002\u00A2\u0006\u0004\b\u0019\u0010\rJ\u0015\u0010\u001D\u001A\u00020\u001C2\u0006\u0010\u001B\u001A\u00020\u001A\u00A2\u0006\u0004\b\u001D\u0010\u001ER\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\u001F\u0010 \u001A\u0004\b!\u0010\"R$\u0010\u0005\u001A\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b#\u0010$\u001A\u0004\b%\u0010&\"\u0004\b\'\u0010(R\u0017\u0010\u0006\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b)\u0010 \u001A\u0004\b*\u0010\"R6\u00103\u001A\u0016\u0012\u0004\u0012\u00020\u0001\u0018\u00010+j\n\u0012\u0004\u0012\u00020\u0001\u0018\u0001`,8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b-\u0010.\u001A\u0004\b/\u00100\"\u0004\b1\u00102R\"\u0010:\u001A\u00020\u001C8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b4\u00105\u001A\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010>\u001A\u00020\u00028\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b;\u0010 \u001A\u0004\b<\u0010\"\"\u0004\b=\u0010\r\u00A8\u0006?"}, d2 = {"Landroidx/compose/runtime/GroupSourceInformation;", "", "", "key", "", "sourceInformation", "dataStartOffset", "<init>", "(ILjava/lang/String;I)V", "dataOffset", "", "startGrouplessCall", "endGrouplessCall", "(I)V", "Landroidx/compose/runtime/SlotWriter;", "writer", "group", "reportGroup", "(Landroidx/compose/runtime/SlotWriter;I)V", "Landroidx/compose/runtime/SlotTable;", "table", "(Landroidx/compose/runtime/SlotTable;I)V", "predecessor", "addGroupAfter", "(Landroidx/compose/runtime/SlotWriter;II)V", "close", "Landroidx/compose/runtime/Anchor;", "anchor", "", "removeAnchor", "(Landroidx/compose/runtime/Anchor;)Z", "a", "I", "getKey", "()I", "b", "Ljava/lang/String;", "getSourceInformation", "()Ljava/lang/String;", "setSourceInformation", "(Ljava/lang/String;)V", "c", "getDataStartOffset", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "d", "Ljava/util/ArrayList;", "getGroups", "()Ljava/util/ArrayList;", "setGroups", "(Ljava/util/ArrayList;)V", "groups", "e", "Z", "getClosed", "()Z", "setClosed", "(Z)V", "closed", "f", "getDataEndOffset", "setDataEndOffset", "dataEndOffset", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/GroupSourceInformation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SlotTable.kt\nandroidx/compose/runtime/SlotTableKt\n+ 4 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,4151:1\n1#2:4152\n831#3,8:4153\n821#3,7:4161\n93#4,2:4168\n33#4,4:4170\n95#4,2:4174\n38#4:4176\n97#4:4177\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/GroupSourceInformation\n*L\n766#1:4153,8\n783#1:4161,7\n793#1:4168,2\n793#1:4170,4\n793#1:4174,2\n793#1:4176\n793#1:4177\n*E\n"})
public final class GroupSourceInformation {
    public static final int $stable = 8;
    public final int a;
    public String b;
    public final int c;
    public ArrayList d;
    public boolean e;
    public int f;

    public GroupSourceInformation(int v, @Nullable String s, int v1) {
        this.a = v;
        this.b = s;
        this.c = v1;
    }

    public final boolean a(Anchor anchor0) {
        ArrayList arrayList0 = this.d;
        if(arrayList0 != null) {
            int v = arrayList0.size();
            int v1 = 0;
            while(v1 < v) {
                Object object0 = arrayList0.get(v1);
                if(!Intrinsics.areEqual(object0, anchor0) && (!(object0 instanceof GroupSourceInformation) || !((GroupSourceInformation)object0).a(anchor0))) {
                    ++v1;
                    continue;
                }
                return true;
            }
        }
        return false;
    }

    public final void addGroupAfter(@NotNull SlotWriter slotWriter0, int v, int v1) {
        ArrayList arrayList0 = this.d;
        if(arrayList0 == null) {
            arrayList0 = new ArrayList();
            this.d = arrayList0;
        }
        int v2 = 0;
        if(v >= 0) {
            Anchor anchor0 = slotWriter0.tryAnchor$runtime_release(v);
            if(anchor0 != null) {
                int v3 = arrayList0.size();
                while(true) {
                    if(v2 >= v3) {
                        v2 = -1;
                        break;
                    }
                    Object object0 = arrayList0.get(v2);
                    if(Intrinsics.areEqual(object0, anchor0) || object0 instanceof GroupSourceInformation && ((GroupSourceInformation)object0).a(anchor0)) {
                        break;
                    }
                    ++v2;
                }
            }
        }
        arrayList0.add(v2, slotWriter0.anchor(v1));
    }

    public final GroupSourceInformation b() {
        Object object0 = null;
        ArrayList arrayList0 = this.d;
        GroupSourceInformation groupSourceInformation0 = null;
        if(arrayList0 != null) {
            for(int v = arrayList0.size() - 1; v >= 0; --v) {
                Object object1 = arrayList0.get(v);
                if(object1 instanceof GroupSourceInformation && !((GroupSourceInformation)object1).e) {
                    object0 = object1;
                    break;
                }
            }
        }
        if(object0 instanceof GroupSourceInformation) {
            groupSourceInformation0 = (GroupSourceInformation)object0;
        }
        if(groupSourceInformation0 != null) {
            GroupSourceInformation groupSourceInformation1 = groupSourceInformation0.b();
            return groupSourceInformation1 == null ? this : groupSourceInformation1;
        }
        return this;
    }

    public final void close(int v) {
        this.e = true;
        this.f = v;
    }

    public final void endGrouplessCall(int v) {
        this.b().close(v);
    }

    public final boolean getClosed() {
        return this.e;
    }

    public final int getDataEndOffset() {
        return this.f;
    }

    public final int getDataStartOffset() {
        return this.c;
    }

    @Nullable
    public final ArrayList getGroups() {
        return this.d;
    }

    public final int getKey() {
        return this.a;
    }

    @Nullable
    public final String getSourceInformation() {
        return this.b;
    }

    public final boolean removeAnchor(@NotNull Anchor anchor0) {
        ArrayList arrayList0 = this.d;
        if(arrayList0 != null) {
            for(int v = arrayList0.size() - 1; v >= 0; --v) {
                Object object0 = arrayList0.get(v);
                if(!(object0 instanceof Anchor)) {
                    if(object0 instanceof GroupSourceInformation && !((GroupSourceInformation)object0).removeAnchor(anchor0)) {
                        arrayList0.remove(v);
                    }
                }
                else if(Intrinsics.areEqual(object0, anchor0)) {
                    arrayList0.remove(v);
                }
            }
            if(arrayList0.isEmpty()) {
                this.d = null;
                return false;
            }
        }
        return true;
    }

    public final void reportGroup(@NotNull SlotTable slotTable0, int v) {
        GroupSourceInformation groupSourceInformation0 = this.b();
        Anchor anchor0 = slotTable0.anchor(v);
        ArrayList arrayList0 = groupSourceInformation0.d == null ? new ArrayList() : groupSourceInformation0.d;
        groupSourceInformation0.d = arrayList0;
        arrayList0.add(anchor0);
    }

    public final void reportGroup(@NotNull SlotWriter slotWriter0, int v) {
        GroupSourceInformation groupSourceInformation0 = this.b();
        Anchor anchor0 = slotWriter0.anchor(v);
        ArrayList arrayList0 = groupSourceInformation0.d == null ? new ArrayList() : groupSourceInformation0.d;
        groupSourceInformation0.d = arrayList0;
        arrayList0.add(anchor0);
    }

    public final void setClosed(boolean z) {
        this.e = z;
    }

    public final void setDataEndOffset(int v) {
        this.f = v;
    }

    public final void setGroups(@Nullable ArrayList arrayList0) {
        this.d = arrayList0;
    }

    public final void setSourceInformation(@Nullable String s) {
        this.b = s;
    }

    public final void startGrouplessCall(int v, @NotNull String s, int v1) {
        GroupSourceInformation groupSourceInformation0 = this.b();
        GroupSourceInformation groupSourceInformation1 = new GroupSourceInformation(v, s, v1);
        ArrayList arrayList0 = groupSourceInformation0.d == null ? new ArrayList() : groupSourceInformation0.d;
        groupSourceInformation0.d = arrayList0;
        arrayList0.add(groupSourceInformation1);
    }
}

