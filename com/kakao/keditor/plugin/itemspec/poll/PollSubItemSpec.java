package com.kakao.keditor.plugin.itemspec.poll;

import android.content.Context;
import com.kakao.keditor.KeditorItem;
import com.kakao.keditor.cdm.CDM.Item;
import com.kakao.keditor.plugin.KeditorItemType;
import com.kakao.keditor.plugin.attrs.item.Location;
import com.kakao.keditor.plugin.itemspec.ChildItemSpec;
import com.kakao.keditor.plugin.itemspec.ItemValidatorKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.x;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@KeditorItemType(type = "pollItem")
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000E\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u0002H\u0014J,\u0010\u0007\u001A\u00020\u00022\u0006\u0010\b\u001A\u00020\t2\u0006\u0010\u0006\u001A\u00020\u00052\u0012\u0010\n\u001A\u000E\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000BH\u0014¨\u0006\u000E"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/poll/PollSubItemSpec;", "Lcom/kakao/keditor/plugin/itemspec/ChildItemSpec;", "Lcom/kakao/keditor/plugin/itemspec/poll/PollSubItem;", "()V", "toCdmItem", "Lcom/kakao/keditor/cdm/CDM$Item;", "item", "toKeditorItem", "context", "Landroid/content/Context;", "attr", "", "", "", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class PollSubItemSpec extends ChildItemSpec {
    @NotNull
    public static final PollSubItemSpec INSTANCE;

    static {
        PollSubItemSpec.INSTANCE = new PollSubItemSpec();
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ModelConverter
    public Item toCdmItem(KeditorItem keditorItem0) {
        return this.toCdmItem(((PollSubItem)keditorItem0));
    }

    @NotNull
    public Item toCdmItem(@NotNull PollSubItem pollSubItem0) {
        Intrinsics.checkNotNullParameter(pollSubItem0, "item");
        String s = pollSubItem0.getType();
        Map map0 = x.mutableMapOf(new Pair[]{TuplesKt.to("id", pollSubItem0.getId()), TuplesKt.to("title", pollSubItem0.getTitle())});
        if(pollSubItem0.getImage().length() > 0) {
            map0.put("image", pollSubItem0.getImage());
        }
        return new Item(s, map0, null, 4, null);
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ModelConverter
    public KeditorItem toKeditorItem(Context context0, Item cDM$Item0, Map map0) {
        return this.toKeditorItem(context0, cDM$Item0, map0);
    }

    @NotNull
    public PollSubItem toKeditorItem(@NotNull Context context0, @NotNull Item cDM$Item0, @NotNull Map map0) {
        String s2;
        String s1;
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(cDM$Item0, "item");
        Intrinsics.checkNotNullParameter(map0, "attr");
        PollSubItem pollSubItem0 = new PollSubItem();
        Object object0 = ItemValidatorKt.pop$default(map0, "id", false, 2, null);
        String s = "";
        if(object0 == null) {
            s1 = "";
        }
        else {
            s1 = object0.toString();
            if(s1 == null) {
                s1 = "";
            }
        }
        pollSubItem0.setId(s1);
        Object object1 = ItemValidatorKt.pop$default(map0, "title", false, 2, null);
        if(object1 == null) {
            s2 = "";
        }
        else {
            s2 = object1.toString();
            if(s2 == null) {
                s2 = "";
            }
        }
        pollSubItem0.setTitle(s2);
        Object object2 = ItemValidatorKt.pop$default(map0, "image", false, 2, null);
        if(object2 != null) {
            String s3 = object2.toString();
            if(s3 != null) {
                s = s3;
            }
        }
        pollSubItem0.setImage(s);
        pollSubItem0.setLocation(Location.UPLOADED);
        return pollSubItem0;
    }
}

