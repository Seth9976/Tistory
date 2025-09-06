package androidx.compose.ui.text;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u001A%\u0010\u0005\u001A\u00020\u00032\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001A\u00020\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001A%\u0010\t\u001A\u00020\u00032\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\b\u001A\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\n\u001A<\u0010\u0012\u001A\u00020\u000E2\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\f\u001A\u00020\u000B2\u0012\u0010\u000F\u001A\u000E\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000E0\rH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001A%\u0010\u0014\u001A\u00020\u00032\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0013\u001A\u00020\u0003H\u0000¢\u0006\u0004\b\u0014\u0010\u0006\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u0015"}, d2 = {"", "Landroidx/compose/ui/text/ParagraphInfo;", "paragraphInfoList", "", "index", "findParagraphByIndex", "(Ljava/util/List;I)I", "", "y", "findParagraphByY", "(Ljava/util/List;F)I", "Landroidx/compose/ui/text/TextRange;", "range", "Lkotlin/Function1;", "", "action", "findParagraphsByRange-Sb-Bc2M", "(Ljava/util/List;JLkotlin/jvm/functions/Function1;)V", "findParagraphsByRange", "lineIndex", "findParagraphByLineIndex", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nMultiParagraph.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiParagraph.kt\nandroidx/compose/ui/text/MultiParagraphKt\n*L\n1#1,1145:1\n1001#1,16:1146\n1001#1,16:1162\n1001#1,16:1178\n*S KotlinDebug\n*F\n+ 1 MultiParagraph.kt\nandroidx/compose/ui/text/MultiParagraphKt\n*L\n936#1:1146,16\n957#1:1162,16\n991#1:1178,16\n*E\n"})
public final class MultiParagraphKt {
    // This method was un-flattened
    public static final int findParagraphByIndex(@NotNull List list0, int v) {
        int v4;
        int v1 = list0.size() - 1;
        int v2 = 0;
        while(v2 <= v1) {
            int v3 = v2 + v1 >>> 1;
            ParagraphInfo paragraphInfo0 = (ParagraphInfo)list0.get(v3);
            if(paragraphInfo0.getStartIndex() > v) {
                v4 = 1;
            }
            else if(paragraphInfo0.getEndIndex() <= v) {
                v4 = -1;
                v2 = v3 + 1;
                continue;
            }
            if(v4 > 0) {
                v1 = v3 - 1;
                continue;
            }
            return v3;
        }
        return -(v2 + 1);
    }

    // This method was un-flattened
    public static final int findParagraphByLineIndex(@NotNull List list0, int v) {
        int v4;
        int v1 = list0.size() - 1;
        int v2 = 0;
        while(v2 <= v1) {
            int v3 = v2 + v1 >>> 1;
            ParagraphInfo paragraphInfo0 = (ParagraphInfo)list0.get(v3);
            if(paragraphInfo0.getStartLineIndex() > v) {
                v4 = 1;
            }
            else if(paragraphInfo0.getEndLineIndex() <= v) {
                v4 = -1;
                v2 = v3 + 1;
                continue;
            }
            if(v4 > 0) {
                v1 = v3 - 1;
                continue;
            }
            return v3;
        }
        return -(v2 + 1);
    }

    // This method was un-flattened
    public static final int findParagraphByY(@NotNull List list0, float f) {
        int v3;
        if(Float.compare(f, 0.0f) <= 0) {
            return 0;
        }
        if(f >= ((ParagraphInfo)CollectionsKt___CollectionsKt.last(list0)).getBottom()) {
            return CollectionsKt__CollectionsKt.getLastIndex(list0);
        }
        int v = list0.size() - 1;
        int v1 = 0;
        while(v1 <= v) {
            int v2 = v1 + v >>> 1;
            ParagraphInfo paragraphInfo0 = (ParagraphInfo)list0.get(v2);
            if(paragraphInfo0.getTop() > f) {
                v3 = 1;
            }
            else if(paragraphInfo0.getBottom() <= f) {
                v3 = -1;
                v1 = v2 + 1;
                continue;
            }
            if(v3 > 0) {
                v = v2 - 1;
                continue;
            }
            return v2;
        }
        return -(v1 + 1);
    }

    public static final void findParagraphsByRange-Sb-Bc2M(@NotNull List list0, long v, @NotNull Function1 function10) {
        int v1 = MultiParagraphKt.findParagraphByIndex(list0, TextRange.getMin-impl(v));
        int v2 = list0.size();
        while(v1 < v2) {
            ParagraphInfo paragraphInfo0 = (ParagraphInfo)list0.get(v1);
            if(paragraphInfo0.getStartIndex() >= TextRange.getMax-impl(v)) {
                break;
            }
            if(paragraphInfo0.getStartIndex() != paragraphInfo0.getEndIndex()) {
                function10.invoke(paragraphInfo0);
            }
            ++v1;
        }
    }
}

