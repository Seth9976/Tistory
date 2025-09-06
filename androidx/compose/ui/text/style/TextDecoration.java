package androidx.compose.ui.text.style;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.util.ListUtilsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wb.a;

@Immutable
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u000B\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0007\u001A\u00020\u00002\u0006\u0010\u0006\u001A\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000B\u001A\u00020\n2\u0006\u0010\t\u001A\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u000B\u0010\fJ\u000F\u0010\u000E\u001A\u00020\rH\u0016¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0010\u001A\u00020\n2\b\u0010\t\u001A\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000F\u0010\u0012\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001A\u0004\b\u0016\u0010\u0013¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/text/style/TextDecoration;", "", "", "mask", "<init>", "(I)V", "decoration", "plus", "(Landroidx/compose/ui/text/style/TextDecoration;)Landroidx/compose/ui/text/style/TextDecoration;", "other", "", "contains", "(Landroidx/compose/ui/text/style/TextDecoration;)Z", "", "toString", "()Ljava/lang/String;", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "a", "I", "getMask", "Companion", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class TextDecoration {
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0086\u0003\u0018\u00002\u00020\u0001J\u001B\u0010\u0005\u001A\u00020\u00032\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\u0007\u001A\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u0012\u0004\b\u000B\u0010\f\u001A\u0004\b\t\u0010\nR \u0010\r\u001A\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010\b\u0012\u0004\b\u000F\u0010\f\u001A\u0004\b\u000E\u0010\nR \u0010\u0010\u001A\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\b\u0012\u0004\b\u0012\u0010\f\u001A\u0004\b\u0011\u0010\n¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/text/style/TextDecoration$Companion;", "", "", "Landroidx/compose/ui/text/style/TextDecoration;", "decorations", "combine", "(Ljava/util/List;)Landroidx/compose/ui/text/style/TextDecoration;", "None", "Landroidx/compose/ui/text/style/TextDecoration;", "getNone", "()Landroidx/compose/ui/text/style/TextDecoration;", "getNone$annotations", "()V", "Underline", "getUnderline", "getUnderline$annotations", "LineThrough", "getLineThrough", "getLineThrough$annotations", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nTextDecoration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextDecoration.kt\nandroidx/compose/ui/text/style/TextDecoration$Companion\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,111:1\n256#2,3:112\n33#2,4:115\n259#2,2:119\n38#2:121\n261#2:122\n*S KotlinDebug\n*F\n+ 1 TextDecoration.kt\nandroidx/compose/ui/text/style/TextDecoration$Companion\n*L\n57#1:112,3\n57#1:115,4\n57#1:119,2\n57#1:121\n57#1:122\n*E\n"})
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final TextDecoration combine(@NotNull List list0) {
            Integer integer0 = 0;
            int v1 = list0.size();
            for(int v = 0; v < v1; ++v) {
                integer0 = (int)(integer0.intValue() | ((TextDecoration)list0.get(v)).getMask());
            }
            return new TextDecoration(integer0.intValue());
        }

        @NotNull
        public final TextDecoration getLineThrough() {
            return TextDecoration.d;
        }

        @Stable
        public static void getLineThrough$annotations() {
        }

        @NotNull
        public final TextDecoration getNone() {
            return TextDecoration.b;
        }

        @Stable
        public static void getNone$annotations() {
        }

        @NotNull
        public final TextDecoration getUnderline() {
            return TextDecoration.c;
        }

        @Stable
        public static void getUnderline$annotations() {
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final int a;
    public static final TextDecoration b;
    public static final TextDecoration c;
    public static final TextDecoration d;

    static {
        TextDecoration.Companion = new Companion(null);
        TextDecoration.b = new TextDecoration(0);
        TextDecoration.c = new TextDecoration(1);
        TextDecoration.d = new TextDecoration(2);
    }

    public TextDecoration(int v) {
        this.a = v;
    }

    public final boolean contains(@NotNull TextDecoration textDecoration0) {
        return (textDecoration0.a | this.a) == this.a;
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof TextDecoration ? this.a == ((TextDecoration)object0).a : false;
    }

    public final int getMask() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return this.a;
    }

    @NotNull
    public final TextDecoration plus(@NotNull TextDecoration textDecoration0) {
        return new TextDecoration(textDecoration0.a | this.a);
    }

    @Override
    @NotNull
    public String toString() {
        int v = this.a;
        if(v == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList0 = new ArrayList();
        if((TextDecoration.c.a & v) != 0) {
            arrayList0.add("Underline");
        }
        if((v & TextDecoration.d.a) != 0) {
            arrayList0.add("LineThrough");
        }
        if(arrayList0.size() == 1) {
            return "TextDecoration." + ((String)arrayList0.get(0));
        }
        StringBuilder stringBuilder0 = new StringBuilder("TextDecoration[");
        return a.b(']', ListUtilsKt.fastJoinToString$default(arrayList0, ", ", null, null, 0, null, null, 62, null), stringBuilder0);
    }
}

