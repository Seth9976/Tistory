package com.kakao.keditor;

import a5.b;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.kakao.keditor.databinding.KeActivityCodeBlockEditorBindingImpl;
import com.kakao.keditor.databinding.KeActivityContentSearchBindingImpl;
import com.kakao.keditor.databinding.KeActivityGrammarCheckBindingImpl;
import com.kakao.keditor.databinding.KeActivityHtmlEditorBindingImpl;
import com.kakao.keditor.databinding.KeActivityImageGridEditorBindingImpl;
import com.kakao.keditor.databinding.KeActivityPollCreatorBindingImpl;
import com.kakao.keditor.databinding.KeDialogAlertBindingImpl;
import com.kakao.keditor.databinding.KeItemBlockQuoteBindingImpl;
import com.kakao.keditor.databinding.KeItemCodeBlockBindingImpl;
import com.kakao.keditor.databinding.KeItemCodeBlockEditorLanguageBindingImpl;
import com.kakao.keditor.databinding.KeItemContentSearchBindingImpl;
import com.kakao.keditor.databinding.KeItemContentSearchBookBindingImpl;
import com.kakao.keditor.databinding.KeItemContentSearchExhibitionBindingImpl;
import com.kakao.keditor.databinding.KeItemContentSearchMovieBindingImpl;
import com.kakao.keditor.databinding.KeItemContentSearchMusicBindingImpl;
import com.kakao.keditor.databinding.KeItemContentSearchPersonBindingImpl;
import com.kakao.keditor.databinding.KeItemContentSearchPlayBindingImpl;
import com.kakao.keditor.databinding.KeItemContentSearchTvBindingImpl;
import com.kakao.keditor.databinding.KeItemEmoticonBindingImpl;
import com.kakao.keditor.databinding.KeItemFileBindingImpl;
import com.kakao.keditor.databinding.KeItemHorizontalRuleBindingImpl;
import com.kakao.keditor.databinding.KeItemHtmlBindingImpl;
import com.kakao.keditor.databinding.KeItemImageBindingImpl;
import com.kakao.keditor.databinding.KeItemImageGridBindingImpl;
import com.kakao.keditor.databinding.KeItemImageGridSingleBindingImpl;
import com.kakao.keditor.databinding.KeItemListBindingImpl;
import com.kakao.keditor.databinding.KeItemListContentBindingImpl;
import com.kakao.keditor.databinding.KeItemOpengraphBindingImpl;
import com.kakao.keditor.databinding.KeItemParagraphBindingImpl;
import com.kakao.keditor.databinding.KeItemPollBindingImpl;
import com.kakao.keditor.databinding.KeItemPollSubBindingImpl;
import com.kakao.keditor.databinding.KeItemTableBindingImpl;
import com.kakao.keditor.databinding.KeItemTableCellBindingImpl;
import com.kakao.keditor.databinding.KeItemUnsupportedBindingImpl;
import com.kakao.keditor.databinding.KeItemVideoBindingImpl;
import com.kakao.keditor.databinding.KeToolbarBlockquoteMenuBindingImpl;
import com.kakao.keditor.databinding.KeToolbarCodeBlockMenuBindingImpl;
import com.kakao.keditor.databinding.KeToolbarColorItemBindingImpl;
import com.kakao.keditor.databinding.KeToolbarHorizontalRuleMenuBindingImpl;
import com.kakao.keditor.databinding.KeToolbarHtmlMenuBindingImpl;
import com.kakao.keditor.databinding.KeToolbarImageGridMenuBindingImpl;
import com.kakao.keditor.databinding.KeToolbarImageMenuBindingImpl;
import com.kakao.keditor.databinding.KeToolbarLayoutBindingImpl;
import com.kakao.keditor.databinding.KeToolbarListMenuBindingImpl;
import com.kakao.keditor.databinding.KeToolbarOverlayBindingImpl;
import com.kakao.keditor.databinding.KeToolbarOverlayItemBindingImpl;
import com.kakao.keditor.databinding.KeToolbarPollMenuBindingImpl;
import com.kakao.keditor.databinding.KeToolbarSelectableItemBindingImpl;
import com.kakao.keditor.databinding.KeToolbarSimpleAlignmentMenuBindingImpl;
import com.kakao.keditor.databinding.KeToolbarSimpleDeletionMenuBindingImpl;
import com.kakao.keditor.databinding.KeToolbarTableMenuBindingImpl;
import com.kakao.keditor.databinding.KeToolbarTableStyleItemBindingImpl;
import com.kakao.keditor.databinding.KeToolbarTextEditMenuBindingImpl;
import com.kakao.keditor.databinding.KeToolbarVideoMenuBindingImpl;
import com.kakao.keditor.databinding.KeViewCodeBlockLanguageOverlayBindingImpl;
import com.kakao.keditor.databinding.KeViewGrammarEditBottomAreaBindingImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
    static class InnerBrLookup {
        static final SparseArray sKeys;

        static {
            SparseArray sparseArray0 = new SparseArray(74);
            InnerBrLookup.sKeys = sparseArray0;
            sparseArray0.put(0, "_all");
            sparseArray0.put(1, "activeCategory");
            sparseArray0.put(2, "activeOverlayCategory");
            sparseArray0.put(3, "alignMenuClickListener");
            sparseArray0.put(4, "alignment");
            sparseArray0.put(5, "blockquote");
            sparseArray0.put(6, "cell");
            sparseArray0.put(7, "cellWidth");
            sparseArray0.put(8, "codeBlock");
            sparseArray0.put(9, "codeMenuListener");
            sparseArray0.put(10, "contentItem");
            sparseArray0.put(11, "currentGrammarError");
            sparseArray0.put(12, "currentIndex");
            sparseArray0.put(13, "deleteListener");
            sparseArray0.put(14, "displayMenu");
            sparseArray0.put(15, "dragState");
            sparseArray0.put(16, "extraButtonContentDescriptionSrc");
            sparseArray0.put(17, "extraButtonSrc");
            sparseArray0.put(18, "fileItem");
            sparseArray0.put(19, "flow");
            sparseArray0.put(20, "fontColor");
            sparseArray0.put(21, "fontStyle");
            sparseArray0.put(22, "hasBlockQuoteItemSpec");
            sparseArray0.put(23, "hasFocus");
            sparseArray0.put(24, "hasTextListItemSpec");
            sparseArray0.put(25, "horizontalRule");
            sparseArray0.put(26, "html");
            sparseArray0.put(27, "imageCount");
            sparseArray0.put(28, "imageGrid");
            sparseArray0.put(29, "imageGridItem");
            sparseArray0.put(30, "imageItem");
            sparseArray0.put(0x1F, "imageStyles");
            sparseArray0.put(0x20, "index");
            sparseArray0.put(33, "isActiveBold");
            sparseArray0.put(34, "isActiveItalic");
            sparseArray0.put(35, "isActiveLink");
            sparseArray0.put(36, "isActiveStrike");
            sparseArray0.put(37, "isActiveUnderLine");
            sparseArray0.put(38, "isAttachable");
            sparseArray0.put(39, "isCancelable");
            sparseArray0.put(40, "isEditable");
            sparseArray0.put(41, "isEnableExtra");
            sparseArray0.put(42, "isEnableImageEdit");
            sparseArray0.put(43, "isNowLoading");
            sparseArray0.put(44, "isOverlayOpen");
            sparseArray0.put(45, "isRepresent");
            sparseArray0.put(46, "isSelected");
            sparseArray0.put(0x2F, "isTextSizeParagraphMode");
            sparseArray0.put(0x30, "isTitleOnly");
            sparseArray0.put(49, "item");
            sparseArray0.put(50, "language");
            sparseArray0.put(51, "listItem");
            sparseArray0.put(52, "listener");
            sparseArray0.put(53, "mediaMenuListener");
            sparseArray0.put(54, "paragraphStyle");
            sparseArray0.put(55, "pollItem");
            sparseArray0.put(56, "pollSubItem");
            sparseArray0.put(57, "position");
            sparseArray0.put(58, "representativeImageEnable");
            sparseArray0.put(59, "representativeImageEnabled");
            sparseArray0.put(60, "style");
            sparseArray0.put(61, "tableItem");
            sparseArray0.put(62, "text");
            sparseArray0.put(0x3F, "textBackgroundColor");
            sparseArray0.put(0x40, "textColor");
            sparseArray0.put(65, "textMenuListener");
            sparseArray0.put(66, "textSize");
            sparseArray0.put(67, "tooSmallToShow");
            sparseArray0.put(68, "totalCount");
            sparseArray0.put(69, "type");
            sparseArray0.put(70, "unSupportedItem");
            sparseArray0.put(71, "videoItem");
            sparseArray0.put(72, "videoStyles");
            sparseArray0.put(73, "vm");
        }
    }

    static class InnerLayoutIdLookup {
        static final HashMap sKeys;

        static {
            HashMap hashMap0 = new HashMap(56);
            InnerLayoutIdLookup.sKeys = hashMap0;
            hashMap0.put("layout/ke_activity_code_block_editor_0", layout.ke_activity_code_block_editor);
            hashMap0.put("layout/ke_activity_content_search_0", layout.ke_activity_content_search);
            hashMap0.put("layout/ke_activity_grammar_check_0", layout.ke_activity_grammar_check);
            hashMap0.put("layout/ke_activity_html_editor_0", layout.ke_activity_html_editor);
            hashMap0.put("layout/ke_activity_image_grid_editor_0", layout.ke_activity_image_grid_editor);
            hashMap0.put("layout/ke_activity_poll_creator_0", layout.ke_activity_poll_creator);
            hashMap0.put("layout/ke_dialog_alert_0", layout.ke_dialog_alert);
            hashMap0.put("layout/ke_item_block_quote_0", layout.ke_item_block_quote);
            hashMap0.put("layout/ke_item_code_block_0", layout.ke_item_code_block);
            hashMap0.put("layout/ke_item_code_block_editor_language_0", layout.ke_item_code_block_editor_language);
            hashMap0.put("layout/ke_item_content_search_0", layout.ke_item_content_search);
            hashMap0.put("layout/ke_item_content_search_book_0", layout.ke_item_content_search_book);
            hashMap0.put("layout/ke_item_content_search_exhibition_0", layout.ke_item_content_search_exhibition);
            hashMap0.put("layout/ke_item_content_search_movie_0", layout.ke_item_content_search_movie);
            hashMap0.put("layout/ke_item_content_search_music_0", layout.ke_item_content_search_music);
            hashMap0.put("layout/ke_item_content_search_person_0", layout.ke_item_content_search_person);
            hashMap0.put("layout/ke_item_content_search_play_0", layout.ke_item_content_search_play);
            hashMap0.put("layout/ke_item_content_search_tv_0", layout.ke_item_content_search_tv);
            hashMap0.put("layout/ke_item_emoticon_0", layout.ke_item_emoticon);
            hashMap0.put("layout/ke_item_file_0", layout.ke_item_file);
            hashMap0.put("layout/ke_item_horizontal_rule_0", layout.ke_item_horizontal_rule);
            hashMap0.put("layout/ke_item_html_0", layout.ke_item_html);
            hashMap0.put("layout/ke_item_image_0", layout.ke_item_image);
            hashMap0.put("layout/ke_item_image_grid_0", layout.ke_item_image_grid);
            hashMap0.put("layout/ke_item_image_grid_single_0", layout.ke_item_image_grid_single);
            hashMap0.put("layout/ke_item_list_0", layout.ke_item_list);
            hashMap0.put("layout/ke_item_list_content_0", layout.ke_item_list_content);
            hashMap0.put("layout/ke_item_opengraph_0", layout.ke_item_opengraph);
            hashMap0.put("layout/ke_item_paragraph_0", layout.ke_item_paragraph);
            hashMap0.put("layout/ke_item_poll_0", layout.ke_item_poll);
            hashMap0.put("layout/ke_item_poll_sub_0", layout.ke_item_poll_sub);
            hashMap0.put("layout/ke_item_table_0", layout.ke_item_table);
            hashMap0.put("layout/ke_item_table_cell_0", layout.ke_item_table_cell);
            hashMap0.put("layout/ke_item_unsupported_0", layout.ke_item_unsupported);
            hashMap0.put("layout/ke_item_video_0", layout.ke_item_video);
            hashMap0.put("layout/ke_toolbar_blockquote_menu_0", layout.ke_toolbar_blockquote_menu);
            hashMap0.put("layout/ke_toolbar_code_block_menu_0", layout.ke_toolbar_code_block_menu);
            hashMap0.put("layout/ke_toolbar_color_item_0", layout.ke_toolbar_color_item);
            hashMap0.put("layout/ke_toolbar_horizontal_rule_menu_0", layout.ke_toolbar_horizontal_rule_menu);
            hashMap0.put("layout/ke_toolbar_html_menu_0", layout.ke_toolbar_html_menu);
            hashMap0.put("layout/ke_toolbar_image_grid_menu_0", layout.ke_toolbar_image_grid_menu);
            hashMap0.put("layout/ke_toolbar_image_menu_0", layout.ke_toolbar_image_menu);
            hashMap0.put("layout/ke_toolbar_layout_0", layout.ke_toolbar_layout);
            hashMap0.put("layout/ke_toolbar_list_menu_0", layout.ke_toolbar_list_menu);
            hashMap0.put("layout/ke_toolbar_overlay_0", layout.ke_toolbar_overlay);
            hashMap0.put("layout/ke_toolbar_overlay_item_0", layout.ke_toolbar_overlay_item);
            hashMap0.put("layout/ke_toolbar_poll_menu_0", layout.ke_toolbar_poll_menu);
            hashMap0.put("layout/ke_toolbar_selectable_item_0", layout.ke_toolbar_selectable_item);
            hashMap0.put("layout/ke_toolbar_simple_alignment_menu_0", layout.ke_toolbar_simple_alignment_menu);
            hashMap0.put("layout/ke_toolbar_simple_deletion_menu_0", layout.ke_toolbar_simple_deletion_menu);
            hashMap0.put("layout/ke_toolbar_table_menu_0", layout.ke_toolbar_table_menu);
            hashMap0.put("layout/ke_toolbar_table_style_item_0", layout.ke_toolbar_table_style_item);
            hashMap0.put("layout/ke_toolbar_text_edit_menu_0", layout.ke_toolbar_text_edit_menu);
            hashMap0.put("layout/ke_toolbar_video_menu_0", layout.ke_toolbar_video_menu);
            hashMap0.put("layout/ke_view_code_block_language_overlay_0", layout.ke_view_code_block_language_overlay);
            hashMap0.put("layout/ke_view_grammar_edit_bottom_area_0", layout.ke_view_grammar_edit_bottom_area);
        }
    }

    private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = null;
    private static final int LAYOUT_KEACTIVITYCODEBLOCKEDITOR = 1;
    private static final int LAYOUT_KEACTIVITYCONTENTSEARCH = 2;
    private static final int LAYOUT_KEACTIVITYGRAMMARCHECK = 3;
    private static final int LAYOUT_KEACTIVITYHTMLEDITOR = 4;
    private static final int LAYOUT_KEACTIVITYIMAGEGRIDEDITOR = 5;
    private static final int LAYOUT_KEACTIVITYPOLLCREATOR = 6;
    private static final int LAYOUT_KEDIALOGALERT = 7;
    private static final int LAYOUT_KEITEMBLOCKQUOTE = 8;
    private static final int LAYOUT_KEITEMCODEBLOCK = 9;
    private static final int LAYOUT_KEITEMCODEBLOCKEDITORLANGUAGE = 10;
    private static final int LAYOUT_KEITEMCONTENTSEARCH = 11;
    private static final int LAYOUT_KEITEMCONTENTSEARCHBOOK = 12;
    private static final int LAYOUT_KEITEMCONTENTSEARCHEXHIBITION = 13;
    private static final int LAYOUT_KEITEMCONTENTSEARCHMOVIE = 14;
    private static final int LAYOUT_KEITEMCONTENTSEARCHMUSIC = 15;
    private static final int LAYOUT_KEITEMCONTENTSEARCHPERSON = 16;
    private static final int LAYOUT_KEITEMCONTENTSEARCHPLAY = 17;
    private static final int LAYOUT_KEITEMCONTENTSEARCHTV = 18;
    private static final int LAYOUT_KEITEMEMOTICON = 19;
    private static final int LAYOUT_KEITEMFILE = 20;
    private static final int LAYOUT_KEITEMHORIZONTALRULE = 21;
    private static final int LAYOUT_KEITEMHTML = 22;
    private static final int LAYOUT_KEITEMIMAGE = 23;
    private static final int LAYOUT_KEITEMIMAGEGRID = 24;
    private static final int LAYOUT_KEITEMIMAGEGRIDSINGLE = 25;
    private static final int LAYOUT_KEITEMLIST = 26;
    private static final int LAYOUT_KEITEMLISTCONTENT = 27;
    private static final int LAYOUT_KEITEMOPENGRAPH = 28;
    private static final int LAYOUT_KEITEMPARAGRAPH = 29;
    private static final int LAYOUT_KEITEMPOLL = 30;
    private static final int LAYOUT_KEITEMPOLLSUB = 0x1F;
    private static final int LAYOUT_KEITEMTABLE = 0x20;
    private static final int LAYOUT_KEITEMTABLECELL = 33;
    private static final int LAYOUT_KEITEMUNSUPPORTED = 34;
    private static final int LAYOUT_KEITEMVIDEO = 35;
    private static final int LAYOUT_KETOOLBARBLOCKQUOTEMENU = 36;
    private static final int LAYOUT_KETOOLBARCODEBLOCKMENU = 37;
    private static final int LAYOUT_KETOOLBARCOLORITEM = 38;
    private static final int LAYOUT_KETOOLBARHORIZONTALRULEMENU = 39;
    private static final int LAYOUT_KETOOLBARHTMLMENU = 40;
    private static final int LAYOUT_KETOOLBARIMAGEGRIDMENU = 41;
    private static final int LAYOUT_KETOOLBARIMAGEMENU = 42;
    private static final int LAYOUT_KETOOLBARLAYOUT = 43;
    private static final int LAYOUT_KETOOLBARLISTMENU = 44;
    private static final int LAYOUT_KETOOLBAROVERLAY = 45;
    private static final int LAYOUT_KETOOLBAROVERLAYITEM = 46;
    private static final int LAYOUT_KETOOLBARPOLLMENU = 0x2F;
    private static final int LAYOUT_KETOOLBARSELECTABLEITEM = 0x30;
    private static final int LAYOUT_KETOOLBARSIMPLEALIGNMENTMENU = 49;
    private static final int LAYOUT_KETOOLBARSIMPLEDELETIONMENU = 50;
    private static final int LAYOUT_KETOOLBARTABLEMENU = 51;
    private static final int LAYOUT_KETOOLBARTABLESTYLEITEM = 52;
    private static final int LAYOUT_KETOOLBARTEXTEDITMENU = 53;
    private static final int LAYOUT_KETOOLBARVIDEOMENU = 54;
    private static final int LAYOUT_KEVIEWCODEBLOCKLANGUAGEOVERLAY = 55;
    private static final int LAYOUT_KEVIEWGRAMMAREDITBOTTOMAREA = 56;

    static {
        SparseIntArray sparseIntArray0 = new SparseIntArray(56);
        DataBinderMapperImpl.INTERNAL_LAYOUT_ID_LOOKUP = sparseIntArray0;
        sparseIntArray0.put(layout.ke_activity_code_block_editor, 1);
        sparseIntArray0.put(layout.ke_activity_content_search, 2);
        sparseIntArray0.put(layout.ke_activity_grammar_check, 3);
        sparseIntArray0.put(layout.ke_activity_html_editor, 4);
        sparseIntArray0.put(layout.ke_activity_image_grid_editor, 5);
        sparseIntArray0.put(layout.ke_activity_poll_creator, 6);
        sparseIntArray0.put(layout.ke_dialog_alert, 7);
        sparseIntArray0.put(layout.ke_item_block_quote, 8);
        sparseIntArray0.put(layout.ke_item_code_block, 9);
        sparseIntArray0.put(layout.ke_item_code_block_editor_language, 10);
        sparseIntArray0.put(layout.ke_item_content_search, 11);
        sparseIntArray0.put(layout.ke_item_content_search_book, 12);
        sparseIntArray0.put(layout.ke_item_content_search_exhibition, 13);
        sparseIntArray0.put(layout.ke_item_content_search_movie, 14);
        sparseIntArray0.put(layout.ke_item_content_search_music, 15);
        sparseIntArray0.put(layout.ke_item_content_search_person, 16);
        sparseIntArray0.put(layout.ke_item_content_search_play, 17);
        sparseIntArray0.put(layout.ke_item_content_search_tv, 18);
        sparseIntArray0.put(layout.ke_item_emoticon, 19);
        sparseIntArray0.put(layout.ke_item_file, 20);
        sparseIntArray0.put(layout.ke_item_horizontal_rule, 21);
        sparseIntArray0.put(layout.ke_item_html, 22);
        sparseIntArray0.put(layout.ke_item_image, 23);
        sparseIntArray0.put(layout.ke_item_image_grid, 24);
        sparseIntArray0.put(layout.ke_item_image_grid_single, 25);
        sparseIntArray0.put(layout.ke_item_list, 26);
        sparseIntArray0.put(layout.ke_item_list_content, 27);
        sparseIntArray0.put(layout.ke_item_opengraph, 28);
        sparseIntArray0.put(layout.ke_item_paragraph, 29);
        sparseIntArray0.put(layout.ke_item_poll, 30);
        sparseIntArray0.put(layout.ke_item_poll_sub, 0x1F);
        sparseIntArray0.put(layout.ke_item_table, 0x20);
        sparseIntArray0.put(layout.ke_item_table_cell, 33);
        sparseIntArray0.put(layout.ke_item_unsupported, 34);
        sparseIntArray0.put(layout.ke_item_video, 35);
        sparseIntArray0.put(layout.ke_toolbar_blockquote_menu, 36);
        sparseIntArray0.put(layout.ke_toolbar_code_block_menu, 37);
        sparseIntArray0.put(layout.ke_toolbar_color_item, 38);
        sparseIntArray0.put(layout.ke_toolbar_horizontal_rule_menu, 39);
        sparseIntArray0.put(layout.ke_toolbar_html_menu, 40);
        sparseIntArray0.put(layout.ke_toolbar_image_grid_menu, 41);
        sparseIntArray0.put(layout.ke_toolbar_image_menu, 42);
        sparseIntArray0.put(layout.ke_toolbar_layout, 43);
        sparseIntArray0.put(layout.ke_toolbar_list_menu, 44);
        sparseIntArray0.put(layout.ke_toolbar_overlay, 45);
        sparseIntArray0.put(layout.ke_toolbar_overlay_item, 46);
        sparseIntArray0.put(layout.ke_toolbar_poll_menu, 0x2F);
        sparseIntArray0.put(layout.ke_toolbar_selectable_item, 0x30);
        sparseIntArray0.put(layout.ke_toolbar_simple_alignment_menu, 49);
        sparseIntArray0.put(layout.ke_toolbar_simple_deletion_menu, 50);
        sparseIntArray0.put(layout.ke_toolbar_table_menu, 51);
        sparseIntArray0.put(layout.ke_toolbar_table_style_item, 52);
        sparseIntArray0.put(layout.ke_toolbar_text_edit_menu, 53);
        sparseIntArray0.put(layout.ke_toolbar_video_menu, 54);
        sparseIntArray0.put(layout.ke_view_code_block_language_overlay, 55);
        sparseIntArray0.put(layout.ke_view_grammar_edit_bottom_area, 56);
    }

    @Override  // androidx.databinding.DataBinderMapper
    public List collectDependencies() {
        List list0 = new ArrayList(2);
        ((ArrayList)list0).add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        ((ArrayList)list0).add(new com.kakao.kemoticon.DataBinderMapperImpl());
        return list0;
    }

    @Override  // androidx.databinding.DataBinderMapper
    public String convertBrIdToString(int v) {
        return (String)InnerBrLookup.sKeys.get(v);
    }

    @Override  // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent0, View view0, int v) {
        int v1 = DataBinderMapperImpl.INTERNAL_LAYOUT_ID_LOOKUP.get(v);
        if(v1 > 0) {
            Object object0 = view0.getTag();
            if(object0 != null) {
                switch((v1 - 1) / 50) {
                    case 0: {
                        return this.internalGetViewDataBinding0(dataBindingComponent0, view0, v1, object0);
                    }
                    case 1: {
                        return this.internalGetViewDataBinding1(dataBindingComponent0, view0, v1, object0);
                    }
                    default: {
                        return null;
                    }
                }
            }
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }

    @Override  // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent0, View[] arr_view, int v) {
        if(arr_view != null && arr_view.length != 0 && DataBinderMapperImpl.INTERNAL_LAYOUT_ID_LOOKUP.get(v) > 0 && arr_view[0].getTag() == null) {
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }

    @Override  // androidx.databinding.DataBinderMapper
    public int getLayoutId(String s) {
        if(s == null) {
            return 0;
        }
        Integer integer0 = (Integer)InnerLayoutIdLookup.sKeys.get(s);
        return integer0 == null ? 0 : ((int)integer0);
    }

    private final ViewDataBinding internalGetViewDataBinding0(DataBindingComponent dataBindingComponent0, View view0, int v, Object object0) {
        switch(v) {
            case 1: {
                if(!"layout/ke_activity_code_block_editor_0".equals(object0)) {
                    throw new IllegalArgumentException("The tag for ke_activity_code_block_editor is invalid. Received: " + object0);
                }
                return new KeActivityCodeBlockEditorBindingImpl(dataBindingComponent0, view0);
            }
            case 2: {
                if(!"layout/ke_activity_content_search_0".equals(object0)) {
                    throw new IllegalArgumentException("The tag for ke_activity_content_search is invalid. Received: " + object0);
                }
                return new KeActivityContentSearchBindingImpl(dataBindingComponent0, view0);
            }
            case 3: {
                if(!"layout/ke_activity_grammar_check_0".equals(object0)) {
                    throw new IllegalArgumentException("The tag for ke_activity_grammar_check is invalid. Received: " + object0);
                }
                return new KeActivityGrammarCheckBindingImpl(dataBindingComponent0, view0);
            }
            case 4: {
                if(!"layout/ke_activity_html_editor_0".equals(object0)) {
                    throw new IllegalArgumentException("The tag for ke_activity_html_editor is invalid. Received: " + object0);
                }
                return new KeActivityHtmlEditorBindingImpl(dataBindingComponent0, view0);
            }
            case 5: {
                if(!"layout/ke_activity_image_grid_editor_0".equals(object0)) {
                    throw new IllegalArgumentException("The tag for ke_activity_image_grid_editor is invalid. Received: " + object0);
                }
                return new KeActivityImageGridEditorBindingImpl(dataBindingComponent0, view0);
            }
            case 6: {
                if(!"layout/ke_activity_poll_creator_0".equals(object0)) {
                    throw new IllegalArgumentException("The tag for ke_activity_poll_creator is invalid. Received: " + object0);
                }
                return new KeActivityPollCreatorBindingImpl(dataBindingComponent0, view0);
            }
            case 7: {
                if(!"layout/ke_dialog_alert_0".equals(object0)) {
                    throw new IllegalArgumentException("The tag for ke_dialog_alert is invalid. Received: " + object0);
                }
                return new KeDialogAlertBindingImpl(dataBindingComponent0, view0);
            }
            case 8: {
                if(!"layout/ke_item_block_quote_0".equals(object0)) {
                    throw new IllegalArgumentException("The tag for ke_item_block_quote is invalid. Received: " + object0);
                }
                return new KeItemBlockQuoteBindingImpl(dataBindingComponent0, view0);
            }
            case 9: {
                if(!"layout/ke_item_code_block_0".equals(object0)) {
                    throw new IllegalArgumentException("The tag for ke_item_code_block is invalid. Received: " + object0);
                }
                return new KeItemCodeBlockBindingImpl(dataBindingComponent0, view0);
            }
            case 10: {
                if(!"layout/ke_item_code_block_editor_language_0".equals(object0)) {
                    throw new IllegalArgumentException("The tag for ke_item_code_block_editor_language is invalid. Received: " + object0);
                }
                return new KeItemCodeBlockEditorLanguageBindingImpl(dataBindingComponent0, view0);
            }
            case 11: {
                if(!"layout/ke_item_content_search_0".equals(object0)) {
                    throw new IllegalArgumentException("The tag for ke_item_content_search is invalid. Received: " + object0);
                }
                return new KeItemContentSearchBindingImpl(dataBindingComponent0, view0);
            }
            case 12: {
                if(!"layout/ke_item_content_search_book_0".equals(object0)) {
                    throw new IllegalArgumentException("The tag for ke_item_content_search_book is invalid. Received: " + object0);
                }
                return new KeItemContentSearchBookBindingImpl(dataBindingComponent0, view0);
            }
            case 13: {
                if(!"layout/ke_item_content_search_exhibition_0".equals(object0)) {
                    throw new IllegalArgumentException("The tag for ke_item_content_search_exhibition is invalid. Received: " + object0);
                }
                return new KeItemContentSearchExhibitionBindingImpl(dataBindingComponent0, view0);
            }
            case 14: {
                if(!"layout/ke_item_content_search_movie_0".equals(object0)) {
                    throw new IllegalArgumentException("The tag for ke_item_content_search_movie is invalid. Received: " + object0);
                }
                return new KeItemContentSearchMovieBindingImpl(dataBindingComponent0, view0);
            }
            case 15: {
                if(!"layout/ke_item_content_search_music_0".equals(object0)) {
                    throw new IllegalArgumentException("The tag for ke_item_content_search_music is invalid. Received: " + object0);
                }
                return new KeItemContentSearchMusicBindingImpl(dataBindingComponent0, view0);
            }
            case 16: {
                if(!"layout/ke_item_content_search_person_0".equals(object0)) {
                    throw new IllegalArgumentException("The tag for ke_item_content_search_person is invalid. Received: " + object0);
                }
                return new KeItemContentSearchPersonBindingImpl(dataBindingComponent0, view0);
            }
            case 17: {
                if(!"layout/ke_item_content_search_play_0".equals(object0)) {
                    throw new IllegalArgumentException("The tag for ke_item_content_search_play is invalid. Received: " + object0);
                }
                return new KeItemContentSearchPlayBindingImpl(dataBindingComponent0, view0);
            }
            case 18: {
                if(!"layout/ke_item_content_search_tv_0".equals(object0)) {
                    throw new IllegalArgumentException("The tag for ke_item_content_search_tv is invalid. Received: " + object0);
                }
                return new KeItemContentSearchTvBindingImpl(dataBindingComponent0, view0);
            }
            case 19: {
                if(!"layout/ke_item_emoticon_0".equals(object0)) {
                    throw new IllegalArgumentException("The tag for ke_item_emoticon is invalid. Received: " + object0);
                }
                return new KeItemEmoticonBindingImpl(dataBindingComponent0, view0);
            }
            case 20: {
                if(!"layout/ke_item_file_0".equals(object0)) {
                    throw new IllegalArgumentException("The tag for ke_item_file is invalid. Received: " + object0);
                }
                return new KeItemFileBindingImpl(dataBindingComponent0, view0);
            }
            case 21: {
                if(!"layout/ke_item_horizontal_rule_0".equals(object0)) {
                    throw new IllegalArgumentException("The tag for ke_item_horizontal_rule is invalid. Received: " + object0);
                }
                return new KeItemHorizontalRuleBindingImpl(dataBindingComponent0, view0);
            }
            case 22: {
                if(!"layout/ke_item_html_0".equals(object0)) {
                    throw new IllegalArgumentException("The tag for ke_item_html is invalid. Received: " + object0);
                }
                return new KeItemHtmlBindingImpl(dataBindingComponent0, view0);
            }
            case 23: {
                if(!"layout/ke_item_image_0".equals(object0)) {
                    throw new IllegalArgumentException("The tag for ke_item_image is invalid. Received: " + object0);
                }
                return new KeItemImageBindingImpl(dataBindingComponent0, view0);
            }
            case 24: {
                if(!"layout/ke_item_image_grid_0".equals(object0)) {
                    throw new IllegalArgumentException("The tag for ke_item_image_grid is invalid. Received: " + object0);
                }
                return new KeItemImageGridBindingImpl(dataBindingComponent0, view0);
            }
            case 25: {
                if(!"layout/ke_item_image_grid_single_0".equals(object0)) {
                    throw new IllegalArgumentException("The tag for ke_item_image_grid_single is invalid. Received: " + object0);
                }
                return new KeItemImageGridSingleBindingImpl(dataBindingComponent0, view0);
            }
            case 26: {
                if(!"layout/ke_item_list_0".equals(object0)) {
                    throw new IllegalArgumentException("The tag for ke_item_list is invalid. Received: " + object0);
                }
                return new KeItemListBindingImpl(dataBindingComponent0, view0);
            }
            case 27: {
                if(!"layout/ke_item_list_content_0".equals(object0)) {
                    throw new IllegalArgumentException("The tag for ke_item_list_content is invalid. Received: " + object0);
                }
                return new KeItemListContentBindingImpl(dataBindingComponent0, view0);
            }
            case 28: {
                if(!"layout/ke_item_opengraph_0".equals(object0)) {
                    throw new IllegalArgumentException("The tag for ke_item_opengraph is invalid. Received: " + object0);
                }
                return new KeItemOpengraphBindingImpl(dataBindingComponent0, view0);
            }
            case 29: {
                if(!"layout/ke_item_paragraph_0".equals(object0)) {
                    throw new IllegalArgumentException("The tag for ke_item_paragraph is invalid. Received: " + object0);
                }
                return new KeItemParagraphBindingImpl(dataBindingComponent0, view0);
            }
            case 30: {
                if(!"layout/ke_item_poll_0".equals(object0)) {
                    throw new IllegalArgumentException("The tag for ke_item_poll is invalid. Received: " + object0);
                }
                return new KeItemPollBindingImpl(dataBindingComponent0, view0);
            }
            case 0x1F: {
                if(!"layout/ke_item_poll_sub_0".equals(object0)) {
                    throw new IllegalArgumentException("The tag for ke_item_poll_sub is invalid. Received: " + object0);
                }
                return new KeItemPollSubBindingImpl(dataBindingComponent0, view0);
            }
            case 0x20: {
                if(!"layout/ke_item_table_0".equals(object0)) {
                    throw new IllegalArgumentException("The tag for ke_item_table is invalid. Received: " + object0);
                }
                return new KeItemTableBindingImpl(dataBindingComponent0, view0);
            }
            case 33: {
                if(!"layout/ke_item_table_cell_0".equals(object0)) {
                    throw new IllegalArgumentException("The tag for ke_item_table_cell is invalid. Received: " + object0);
                }
                return new KeItemTableCellBindingImpl(dataBindingComponent0, view0);
            }
            case 34: {
                if(!"layout/ke_item_unsupported_0".equals(object0)) {
                    throw new IllegalArgumentException("The tag for ke_item_unsupported is invalid. Received: " + object0);
                }
                return new KeItemUnsupportedBindingImpl(dataBindingComponent0, view0);
            }
            case 35: {
                if(!"layout/ke_item_video_0".equals(object0)) {
                    throw new IllegalArgumentException("The tag for ke_item_video is invalid. Received: " + object0);
                }
                return new KeItemVideoBindingImpl(dataBindingComponent0, view0);
            }
            case 36: {
                if(!"layout/ke_toolbar_blockquote_menu_0".equals(object0)) {
                    throw new IllegalArgumentException("The tag for ke_toolbar_blockquote_menu is invalid. Received: " + object0);
                }
                return new KeToolbarBlockquoteMenuBindingImpl(dataBindingComponent0, view0);
            }
            case 37: {
                if(!"layout/ke_toolbar_code_block_menu_0".equals(object0)) {
                    throw new IllegalArgumentException("The tag for ke_toolbar_code_block_menu is invalid. Received: " + object0);
                }
                return new KeToolbarCodeBlockMenuBindingImpl(dataBindingComponent0, view0);
            }
            case 38: {
                if(!"layout/ke_toolbar_color_item_0".equals(object0)) {
                    throw new IllegalArgumentException("The tag for ke_toolbar_color_item is invalid. Received: " + object0);
                }
                return new KeToolbarColorItemBindingImpl(dataBindingComponent0, view0);
            }
            case 39: {
                if(!"layout/ke_toolbar_horizontal_rule_menu_0".equals(object0)) {
                    throw new IllegalArgumentException("The tag for ke_toolbar_horizontal_rule_menu is invalid. Received: " + object0);
                }
                return new KeToolbarHorizontalRuleMenuBindingImpl(dataBindingComponent0, view0);
            }
            case 40: {
                if(!"layout/ke_toolbar_html_menu_0".equals(object0)) {
                    throw new IllegalArgumentException("The tag for ke_toolbar_html_menu is invalid. Received: " + object0);
                }
                return new KeToolbarHtmlMenuBindingImpl(dataBindingComponent0, view0);
            }
            case 41: {
                if(!"layout/ke_toolbar_image_grid_menu_0".equals(object0)) {
                    throw new IllegalArgumentException("The tag for ke_toolbar_image_grid_menu is invalid. Received: " + object0);
                }
                return new KeToolbarImageGridMenuBindingImpl(dataBindingComponent0, view0);
            }
            case 42: {
                if(!"layout/ke_toolbar_image_menu_0".equals(object0)) {
                    throw new IllegalArgumentException("The tag for ke_toolbar_image_menu is invalid. Received: " + object0);
                }
                return new KeToolbarImageMenuBindingImpl(dataBindingComponent0, view0);
            }
            case 43: {
                if(!"layout/ke_toolbar_layout_0".equals(object0)) {
                    throw new IllegalArgumentException("The tag for ke_toolbar_layout is invalid. Received: " + object0);
                }
                return new KeToolbarLayoutBindingImpl(dataBindingComponent0, view0);
            }
            case 44: {
                if(!"layout/ke_toolbar_list_menu_0".equals(object0)) {
                    throw new IllegalArgumentException("The tag for ke_toolbar_list_menu is invalid. Received: " + object0);
                }
                return new KeToolbarListMenuBindingImpl(dataBindingComponent0, view0);
            }
            case 45: {
                if(!"layout/ke_toolbar_overlay_0".equals(object0)) {
                    throw new IllegalArgumentException("The tag for ke_toolbar_overlay is invalid. Received: " + object0);
                }
                return new KeToolbarOverlayBindingImpl(dataBindingComponent0, view0);
            }
            case 46: {
                if(!"layout/ke_toolbar_overlay_item_0".equals(object0)) {
                    throw new IllegalArgumentException("The tag for ke_toolbar_overlay_item is invalid. Received: " + object0);
                }
                return new KeToolbarOverlayItemBindingImpl(dataBindingComponent0, view0);
            }
            case 0x2F: {
                if(!"layout/ke_toolbar_poll_menu_0".equals(object0)) {
                    throw new IllegalArgumentException("The tag for ke_toolbar_poll_menu is invalid. Received: " + object0);
                }
                return new KeToolbarPollMenuBindingImpl(dataBindingComponent0, view0);
            }
            case 0x30: {
                if(!"layout/ke_toolbar_selectable_item_0".equals(object0)) {
                    throw new IllegalArgumentException("The tag for ke_toolbar_selectable_item is invalid. Received: " + object0);
                }
                return new KeToolbarSelectableItemBindingImpl(dataBindingComponent0, view0);
            }
            case 49: {
                if(!"layout/ke_toolbar_simple_alignment_menu_0".equals(object0)) {
                    throw new IllegalArgumentException("The tag for ke_toolbar_simple_alignment_menu is invalid. Received: " + object0);
                }
                return new KeToolbarSimpleAlignmentMenuBindingImpl(dataBindingComponent0, view0);
            }
            case 50: {
                if(!"layout/ke_toolbar_simple_deletion_menu_0".equals(object0)) {
                    throw new IllegalArgumentException("The tag for ke_toolbar_simple_deletion_menu is invalid. Received: " + object0);
                }
                return new KeToolbarSimpleDeletionMenuBindingImpl(dataBindingComponent0, view0);
            }
            default: {
                return null;
            }
        }
    }

    private final ViewDataBinding internalGetViewDataBinding1(DataBindingComponent dataBindingComponent0, View view0, int v, Object object0) {
        switch(v) {
            case 51: {
                if(!"layout/ke_toolbar_table_menu_0".equals(object0)) {
                    throw new IllegalArgumentException(b.i(object0, "The tag for ke_toolbar_table_menu is invalid. Received: "));
                }
                return new KeToolbarTableMenuBindingImpl(dataBindingComponent0, view0);
            }
            case 52: {
                if(!"layout/ke_toolbar_table_style_item_0".equals(object0)) {
                    throw new IllegalArgumentException(b.i(object0, "The tag for ke_toolbar_table_style_item is invalid. Received: "));
                }
                return new KeToolbarTableStyleItemBindingImpl(dataBindingComponent0, view0);
            }
            case 53: {
                if(!"layout/ke_toolbar_text_edit_menu_0".equals(object0)) {
                    throw new IllegalArgumentException(b.i(object0, "The tag for ke_toolbar_text_edit_menu is invalid. Received: "));
                }
                return new KeToolbarTextEditMenuBindingImpl(dataBindingComponent0, view0);
            }
            case 54: {
                if(!"layout/ke_toolbar_video_menu_0".equals(object0)) {
                    throw new IllegalArgumentException(b.i(object0, "The tag for ke_toolbar_video_menu is invalid. Received: "));
                }
                return new KeToolbarVideoMenuBindingImpl(dataBindingComponent0, view0);
            }
            case 55: {
                if(!"layout/ke_view_code_block_language_overlay_0".equals(object0)) {
                    throw new IllegalArgumentException(b.i(object0, "The tag for ke_view_code_block_language_overlay is invalid. Received: "));
                }
                return new KeViewCodeBlockLanguageOverlayBindingImpl(dataBindingComponent0, view0);
            }
            case 56: {
                if(!"layout/ke_view_grammar_edit_bottom_area_0".equals(object0)) {
                    throw new IllegalArgumentException(b.i(object0, "The tag for ke_view_grammar_edit_bottom_area is invalid. Received: "));
                }
                return new KeViewGrammarEditBottomAreaBindingImpl(dataBindingComponent0, view0);
            }
            default: {
                return null;
            }
        }
    }
}

