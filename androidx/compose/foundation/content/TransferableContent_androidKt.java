package androidx.compose.foundation.content;

import android.content.ClipData.Item;
import android.content.ClipData;
import android.content.ClipDescription;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.ui.platform.AndroidClipboardManager_androidKt;
import androidx.compose.ui.platform.ClipEntry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\u0018\u0002\n\u0000\u001A\"\u0010\u0000\u001A\u0004\u0018\u00010\u0001*\u00020\u00012\u0012\u0010\u0002\u001A\u000E\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0007\u001A\u0014\u0010\u0006\u001A\u00020\u0005*\u00020\u00012\u0006\u0010\u0007\u001A\u00020\bH\u0007\u001A\u000E\u0010\t\u001A\u0004\u0018\u00010\n*\u00020\u000BH\u0000¨\u0006\f"}, d2 = {"consume", "Landroidx/compose/foundation/content/TransferableContent;", "predicate", "Lkotlin/Function1;", "Landroid/content/ClipData$Item;", "", "hasMediaType", "mediaType", "Landroidx/compose/foundation/content/MediaType;", "readPlainText", "", "Landroidx/compose/ui/platform/ClipEntry;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTransferableContent.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransferableContent.android.kt\nandroidx/compose/foundation/content/TransferableContent_androidKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,139:1\n1#2:140\n*E\n"})
public final class TransferableContent_androidKt {
    @ExperimentalFoundationApi
    @Nullable
    public static final TransferableContent consume(@NotNull TransferableContent transferableContent0, @NotNull Function1 function10) {
        ClipData clipData0 = transferableContent0.getClipEntry().getClipData();
        if(clipData0.getItemCount() == 1) {
            return ((Boolean)function10.invoke(clipData0.getItemAt(0))).booleanValue() ? null : transferableContent0;
        }
        int v2 = clipData0.getItemCount();
        Collection collection0 = null;
        for(int v = 0; v < v2; ++v) {
            ClipData.Item clipData$Item0 = clipData0.getItemAt(v);
            if(!((Boolean)function10.invoke(clipData$Item0)).booleanValue()) {
                if(collection0 == null) {
                    collection0 = new ArrayList();
                }
                ((List)collection0).add(clipData$Item0);
            }
        }
        if(collection0 != null && !collection0.isEmpty()) {
            if(((List)collection0).size() == clipData0.getItemCount()) {
                return transferableContent0;
            }
            ClipDescription clipDescription0 = new ClipDescription(transferableContent0.getClipMetadata().getClipDescription());
            ClipData clipData1 = new ClipData(clipDescription0, ((ClipData.Item)CollectionsKt___CollectionsKt.first(((List)collection0))));
            int v3 = ((List)collection0).size();
            for(int v1 = 1; v1 < v3; ++v1) {
                clipData1.addItem(((ClipData.Item)((List)collection0).get(v1)));
            }
            return new TransferableContent(AndroidClipboardManager_androidKt.toClipEntry(clipData1), AndroidClipboardManager_androidKt.toClipMetadata(clipDescription0), transferableContent0.getSource-kB6V9T0(), transferableContent0.getPlatformTransferableContent(), null);
        }
        return null;
    }

    @ExperimentalFoundationApi
    public static final boolean hasMediaType(@NotNull TransferableContent transferableContent0, @NotNull MediaType mediaType0) {
        return transferableContent0.getClipMetadata().getClipDescription().hasMimeType(mediaType0.getRepresentation());
    }

    @Nullable
    public static final String readPlainText(@NotNull ClipEntry clipEntry0) {
        int v = clipEntry0.getClipData().getItemCount();
        boolean z = false;
        for(int v2 = 0; v2 < v; ++v2) {
            z = z || clipEntry0.getClipData().getItemAt(v2).getText() != null;
        }
        if(z) {
            StringBuilder stringBuilder0 = new StringBuilder();
            int v3 = clipEntry0.getClipData().getItemCount();
            boolean z1 = false;
            for(int v1 = 0; v1 < v3; ++v1) {
                CharSequence charSequence0 = clipEntry0.getClipData().getItemAt(v1).getText();
                if(charSequence0 != null) {
                    if(z1) {
                        stringBuilder0.append("\n");
                    }
                    stringBuilder0.append(charSequence0);
                    z1 = true;
                }
            }
            String s = stringBuilder0.toString();
            Intrinsics.checkNotNullExpressionValue(s, "StringBuilder().apply(builderAction).toString()");
            return s;
        }
        return null;
    }
}

