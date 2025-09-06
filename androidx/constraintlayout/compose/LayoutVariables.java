package androidx.constraintlayout.compose;

import androidx.constraintlayout.core.parser.CLNumber;
import androidx.constraintlayout.core.parser.CLString;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001D\u0010\t\u001A\u00020\b2\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ%\u0010\t\u001A\u00020\b2\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\r\u001A\u00020\u000B¢\u0006\u0004\b\t\u0010\u000EJ=\u0010\t\u001A\u00020\b2\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u000F\u001A\u00020\u000B2\u0006\u0010\u0010\u001A\u00020\u000B2\u0006\u0010\u0011\u001A\u00020\u000B2\u0006\u0010\u0012\u001A\u00020\u00042\u0006\u0010\u0013\u001A\u00020\u0004¢\u0006\u0004\b\t\u0010\u0014J\u001D\u0010\u0016\u001A\u00020\b2\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0015\u001A\u00020\u000B¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001A\u00020\u000B2\u0006\u0010\u0005\u001A\u00020\u0001¢\u0006\u0004\b\u0018\u0010\u0019J)\u0010\u001C\u001A\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001Aj\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u001B2\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u001C\u0010\u001DJ-\u0010\t\u001A\u00020\b2\u0006\u0010\u0005\u001A\u00020\u00042\u0016\u0010\u001E\u001A\u0012\u0012\u0004\u0012\u00020\u00040\u001Aj\b\u0012\u0004\u0012\u00020\u0004`\u001B¢\u0006\u0004\b\t\u0010\u001F¨\u0006 "}, d2 = {"Landroidx/constraintlayout/compose/LayoutVariables;", "", "<init>", "()V", "", "elementName", "", "element", "", "put", "(Ljava/lang/String;I)V", "", "start", "incrementBy", "(Ljava/lang/String;FF)V", "from", "to", "step", "prefix", "postfix", "(Ljava/lang/String;FFFLjava/lang/String;Ljava/lang/String;)V", "value", "putOverride", "(Ljava/lang/String;F)V", "get", "(Ljava/lang/Object;)F", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getList", "(Ljava/lang/String;)Ljava/util/ArrayList;", "elements", "(Ljava/lang/String;Ljava/util/ArrayList;)V", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class LayoutVariables {
    public final HashMap a;
    public final HashMap b;
    public final HashMap c;

    public LayoutVariables() {
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = new HashMap();
    }

    public final float get(@NotNull Object object0) {
        Intrinsics.checkNotNullParameter(object0, "elementName");
        if(object0 instanceof CLString) {
            String s = ((CLString)object0).content();
            HashMap hashMap0 = this.b;
            if(hashMap0.containsKey(s)) {
                GeneratedValue generatedValue0 = (GeneratedValue)hashMap0.get(s);
                Intrinsics.checkNotNull(generatedValue0);
                return generatedValue0.value();
            }
            HashMap hashMap1 = this.a;
            if(hashMap1.containsKey(s)) {
                Integer integer0 = (Integer)hashMap1.get(s);
                Intrinsics.checkNotNull(integer0);
                return (float)(((int)integer0));
            }
            return 0.0f;
        }
        return object0 instanceof CLNumber ? ((CLNumber)object0).getFloat() : 0.0f;
    }

    @Nullable
    public final ArrayList getList(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "elementName");
        return this.c.containsKey(s) ? ((ArrayList)this.c.get(s)) : null;
    }

    public final void put(@NotNull String s, float f, float f1) {
        Intrinsics.checkNotNullParameter(s, "elementName");
        HashMap hashMap0 = this.b;
        if(hashMap0.containsKey(s) && hashMap0.get(s) instanceof OverrideValue) {
            return;
        }
        hashMap0.put(s, new Generator(f, f1));
    }

    public final void put(@NotNull String s, float f, float f1, float f2, @NotNull String s1, @NotNull String s2) {
        Intrinsics.checkNotNullParameter(s, "elementName");
        Intrinsics.checkNotNullParameter(s1, "prefix");
        Intrinsics.checkNotNullParameter(s2, "postfix");
        HashMap hashMap0 = this.b;
        if(hashMap0.containsKey(s) && hashMap0.get(s) instanceof OverrideValue) {
            return;
        }
        FiniteGenerator finiteGenerator0 = new FiniteGenerator(f, f1, f2, s1, s2);
        hashMap0.put(s, finiteGenerator0);
        ArrayList arrayList0 = finiteGenerator0.array();
        this.c.put(s, arrayList0);
    }

    public final void put(@NotNull String s, int v) {
        Intrinsics.checkNotNullParameter(s, "elementName");
        this.a.put(s, v);
    }

    public final void put(@NotNull String s, @NotNull ArrayList arrayList0) {
        Intrinsics.checkNotNullParameter(s, "elementName");
        Intrinsics.checkNotNullParameter(arrayList0, "elements");
        this.c.put(s, arrayList0);
    }

    public final void putOverride(@NotNull String s, float f) {
        Intrinsics.checkNotNullParameter(s, "elementName");
        OverrideValue overrideValue0 = new OverrideValue(f);
        this.b.put(s, overrideValue0);
    }
}

