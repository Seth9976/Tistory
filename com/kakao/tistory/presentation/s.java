package com.kakao.tistory.presentation;

import com.kakao.keditor.plugin.itemspec.RootItemSpec;
import com.kakao.keditor.plugin.itemspec.blockquote.BlockQuoteItemSpec;
import com.kakao.keditor.plugin.itemspec.codeblock.CodeBlockItemSpec;
import com.kakao.keditor.plugin.itemspec.emoticon.EmoticonItemSpec;
import com.kakao.keditor.plugin.itemspec.file.FileItemSpec;
import com.kakao.keditor.plugin.itemspec.horizontalrule.HorizontalRuleItemSpec;
import com.kakao.keditor.plugin.itemspec.image.ImageItemSpec;
import com.kakao.keditor.plugin.itemspec.opengraph.OpenGraphItemSpec;
import com.kakao.keditor.plugin.itemspec.opengraph.loader.Loader;
import com.kakao.keditor.plugin.itemspec.table.TableItemSpec;
import com.kakao.keditor.plugin.itemspec.textlist.TextListItemSpec;
import com.kakao.keditor.plugin.itemspec.video.VideoItemSpec;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class s extends Lambda implements Function0 {
    public final Loader a;

    public s(Loader loader0) {
        this.a = loader0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        BlockQuoteItemSpec blockQuoteItemSpec0 = new BlockQuoteItemSpec();
        EmoticonItemSpec emoticonItemSpec0 = new EmoticonItemSpec();
        HorizontalRuleItemSpec horizontalRuleItemSpec0 = new HorizontalRuleItemSpec();
        TextListItemSpec textListItemSpec0 = new TextListItemSpec();
        TableItemSpec tableItemSpec0 = new TableItemSpec();
        FileItemSpec fileItemSpec0 = new FileItemSpec();
        CodeBlockItemSpec codeBlockItemSpec0 = new CodeBlockItemSpec();
        ImageItemSpec imageItemSpec0 = new ImageItemSpec();
        VideoItemSpec videoItemSpec0 = new VideoItemSpec();
        OpenGraphItemSpec openGraphItemSpec0 = new OpenGraphItemSpec();
        openGraphItemSpec0.setDefaultImageResource(drawable.ic_thumb_tistory);
        openGraphItemSpec0.setLoader(this.a);
        return CollectionsKt__CollectionsKt.listOf(new RootItemSpec[]{blockQuoteItemSpec0, emoticonItemSpec0, horizontalRuleItemSpec0, textListItemSpec0, tableItemSpec0, fileItemSpec0, codeBlockItemSpec0, imageItemSpec0, videoItemSpec0, openGraphItemSpec0});
    }
}

