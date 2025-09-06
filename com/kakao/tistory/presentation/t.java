package com.kakao.tistory.presentation;

import com.kakao.keditor.plugin.pluginspec.PluginSpec;
import com.kakao.keditor.plugin.pluginspec.blockquote.BlockQuotePluginSpec;
import com.kakao.keditor.plugin.pluginspec.codeblock.CodeBlockPluginSpec;
import com.kakao.keditor.plugin.pluginspec.emoticon.EmoticonPluginSpec;
import com.kakao.keditor.plugin.pluginspec.file.FilePluginSpec;
import com.kakao.keditor.plugin.pluginspec.grammarcheck.GrammarCheckPluginSpec;
import com.kakao.keditor.plugin.pluginspec.grammarcheck.GrammarChecker;
import com.kakao.keditor.plugin.pluginspec.horizontalrule.HorizontalRulePluginSpec;
import com.kakao.keditor.plugin.pluginspec.image.ImagePluginSpec;
import com.kakao.keditor.plugin.pluginspec.opengraph.OpenGraphPluginSpec;
import com.kakao.keditor.plugin.pluginspec.textlist.TextListPluginSpec;
import com.kakao.tistory.presentation.common.extension.ke.KeFilePluginExtensionKt;
import com.kakao.tistory.presentation.common.extension.ke.KeImagePluginExtensionKt;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class t extends Lambda implements Function0 {
    public final List a;
    public final String b;
    public final GrammarChecker c;

    public t(List list0, String s, GrammarChecker grammarChecker0) {
        this.a = list0;
        this.b = s;
        this.c = grammarChecker0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        BlockQuotePluginSpec blockQuotePluginSpec0 = new BlockQuotePluginSpec();
        EmoticonPluginSpec emoticonPluginSpec0 = new EmoticonPluginSpec();
        List list0 = this.a;
        List list1 = emoticonPluginSpec0.getActiveEmoticons();
        if(list1 == null) {
            list1 = CollectionsKt__CollectionsKt.emptyList();
        }
        emoticonPluginSpec0.setActiveEmoticons(CollectionsKt___CollectionsKt.plus(list1, list0));
        HorizontalRulePluginSpec horizontalRulePluginSpec0 = new HorizontalRulePluginSpec();
        TextListPluginSpec textListPluginSpec0 = new TextListPluginSpec();
        FilePluginSpec filePluginSpec0 = new FilePluginSpec();
        KeFilePluginExtensionKt.setFileConfigs(filePluginSpec0);
        CodeBlockPluginSpec codeBlockPluginSpec0 = new CodeBlockPluginSpec();
        ImagePluginSpec imagePluginSpec0 = new ImagePluginSpec();
        KeImagePluginExtensionKt.setImageConfigs(imagePluginSpec0, this.b);
        OpenGraphPluginSpec openGraphPluginSpec0 = new OpenGraphPluginSpec();
        GrammarCheckPluginSpec grammarCheckPluginSpec0 = new GrammarCheckPluginSpec();
        grammarCheckPluginSpec0.setAddToolbarOverlayMenu(true);
        grammarCheckPluginSpec0.setGrammarChecker(this.c);
        return CollectionsKt__CollectionsKt.listOf(new PluginSpec[]{blockQuotePluginSpec0, emoticonPluginSpec0, horizontalRulePluginSpec0, textListPluginSpec0, filePluginSpec0, codeBlockPluginSpec0, imagePluginSpec0, openGraphPluginSpec0, grammarCheckPluginSpec0});
    }
}

