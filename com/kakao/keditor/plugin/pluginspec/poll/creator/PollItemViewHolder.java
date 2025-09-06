package com.kakao.keditor.plugin.pluginspec.poll.creator;

import android.content.Context;
import android.graphics.Typeface;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import com.google.android.material.datepicker.i;
import com.kakao.common.util.TextCounterKt;
import com.kakao.common.view.SoftInputKt;
import com.kakao.common.widget.CommonViewUtilKt;
import com.kakao.keditor.Keditor;
import com.kakao.keditor.R.drawable;
import com.kakao.keditor.R.id;
import com.kakao.keditor.R.string;
import com.kakao.keditor.delegate.ImageLoader.DefaultImpls;
import com.kakao.keditor.delegate.ImageLoader;
import com.kakao.keditor.plugin.extension.ContentDescriptionKt;
import com.kakao.keditor.plugin.extension.CustomAction;
import com.kakao.keditor.plugin.itemspec.poll.PollSubItem;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001F\u0012\u0006\u0010\u0003\u001A\u00020\u0004\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001A\u00020\b¢\u0006\u0002\u0010\tJ\u0010\u0010\u0015\u001A\u00020\u00162\u0006\u0010\u0017\u001A\u00020\u0002H\u0016J\u0016\u0010\u0018\u001A\u00020\u00162\u0006\u0010\u0019\u001A\u00020\u001A2\u0006\u0010\u001B\u001A\u00020\u0002J\u0010\u0010\u001C\u001A\u00020\u00162\u0006\u0010\u0019\u001A\u00020\u001AH\u0002R\u0011\u0010\n\u001A\u00020\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\fR\u000E\u0010\r\u001A\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000E\u0010\u000E\u001A\u00020\u000FX\u0082\u0004¢\u0006\u0002\n\u0000R\u000E\u0010\u0010\u001A\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0011\u001A\u00020\u0012¢\u0006\b\n\u0000\u001A\u0004\b\u0013\u0010\u0014¨\u0006\u001D"}, d2 = {"Lcom/kakao/keditor/plugin/pluginspec/poll/creator/PollItemViewHolder;", "Lcom/kakao/keditor/plugin/pluginspec/poll/creator/PollViewHolder;", "Lcom/kakao/keditor/plugin/itemspec/poll/PollSubItem;", "view", "Landroid/view/View;", "typeface", "Landroid/graphics/Typeface;", "itemListener", "Lcom/kakao/keditor/plugin/pluginspec/poll/creator/PollItemListener;", "(Landroid/view/View;Landroid/graphics/Typeface;Lcom/kakao/keditor/plugin/pluginspec/poll/creator/PollItemListener;)V", "borderLayout", "getBorderLayout", "()Landroid/view/View;", "emptyImage", "image", "Landroid/widget/ImageView;", "remove", "text", "Landroid/widget/EditText;", "getText", "()Landroid/widget/EditText;", "bind", "", "pollItem", "updateAccessibilityDescriptions", "position", "", "item", "updateAccessibilityText", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPollCreatorAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PollCreatorAdapter.kt\ncom/kakao/keditor/plugin/pluginspec/poll/creator/PollItemViewHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,533:1\n1#2:534\n*E\n"})
public final class PollItemViewHolder extends PollViewHolder {
    @NotNull
    private final View borderLayout;
    @NotNull
    private final View emptyImage;
    @NotNull
    private final ImageView image;
    @NotNull
    private final View remove;
    @NotNull
    private final EditText text;

    public PollItemViewHolder(@NotNull View view0, @Nullable Typeface typeface0, @NotNull PollItemListener pollItemListener0) {
        Intrinsics.checkNotNullParameter(view0, "view");
        Intrinsics.checkNotNullParameter(pollItemListener0, "itemListener");
        super(view0);
        View view1 = view0.findViewById(id.poll_item_border_layout);
        Intrinsics.checkNotNullExpressionValue(view1, "findViewById(...)");
        this.borderLayout = view1;
        View view2 = view0.findViewById(id.poll_item_text);
        Intrinsics.checkNotNullExpressionValue(view2, "findViewById(...)");
        this.text = (EditText)view2;
        View view3 = view0.findViewById(id.poll_item_image);
        Intrinsics.checkNotNullExpressionValue(view3, "findViewById(...)");
        this.image = (ImageView)view3;
        View view4 = view0.findViewById(id.poll_item_image_empty);
        Intrinsics.checkNotNullExpressionValue(view4, "findViewById(...)");
        this.emptyImage = view4;
        View view5 = view0.findViewById(id.poll_item_remove);
        Intrinsics.checkNotNullExpressionValue(view5, "findViewById(...)");
        this.remove = view5;
        view5.setOnClickListener(new e(pollItemListener0, this, 0));
        if(typeface0 != null) {
            ((EditText)view2).setTypeface(typeface0);
        }
        ((EditText)view2).setOnFocusChangeListener(new i(this, 4));
        ((EditText)view2).addTextChangedListener(new TextWatcher() {
            @Override  // android.text.TextWatcher
            public void afterTextChanged(@Nullable Editable editable0) {
            }

            @Override  // android.text.TextWatcher
            public void beforeTextChanged(@Nullable CharSequence charSequence0, int v, int v1, int v2) {
            }

            @Override  // android.text.TextWatcher
            public void onTextChanged(@Nullable CharSequence charSequence0, int v, int v1, int v2) {
                if(TextCounterKt.getGraphemeLength(String.valueOf(charSequence0)) > 40) {
                    int v3 = pollItemListener0.getText().getSelectionStart();
                    String s = TextCounterKt.getBreakIteratorSubstring(String.valueOf(charSequence0), 40);
                    pollItemListener0.getText().setText(s);
                    if(v3 > s.length()) {
                        v3 = s.length();
                    }
                    pollItemListener0.getText().setSelection(v3);
                    return;
                }
                int v4 = pollItemListener0.getAdapterPosition();
                this.$itemListener.updateText(String.valueOf(charSequence0), v4);
            }
        });
        view4.setOnClickListener(new e(pollItemListener0, this, 1));
    }

    private static final void _init_$lambda$0(PollItemListener pollItemListener0, PollItemViewHolder pollItemViewHolder0, View view0) {
        Intrinsics.checkNotNullParameter(pollItemListener0, "$itemListener");
        Intrinsics.checkNotNullParameter(pollItemViewHolder0, "this$0");
        pollItemListener0.remove(pollItemViewHolder0.getAdapterPosition(), pollItemViewHolder0.itemView.getHeight());
    }

    private static final void _init_$lambda$2(PollItemViewHolder pollItemViewHolder0, View view0, boolean z) {
        Intrinsics.checkNotNullParameter(pollItemViewHolder0, "this$0");
        pollItemViewHolder0.updateAccessibilityText(pollItemViewHolder0.getAdapterPosition());
        pollItemViewHolder0.borderLayout.setBackgroundResource((z ? drawable.ke_border_poll_item_focused : drawable.ke_border_poll_radius_3));
    }

    private static final void _init_$lambda$3(PollItemListener pollItemListener0, PollItemViewHolder pollItemViewHolder0, View view0) {
        Intrinsics.checkNotNullParameter(pollItemListener0, "$itemListener");
        Intrinsics.checkNotNullParameter(pollItemViewHolder0, "this$0");
        pollItemListener0.clickImage(pollItemViewHolder0.getAdapterPosition());
    }

    public static void b(PollItemViewHolder pollItemViewHolder0, View view0, boolean z) {
        PollItemViewHolder._init_$lambda$2(pollItemViewHolder0, view0, z);
    }

    public void bind(@NotNull PollSubItem pollSubItem0) {
        Intrinsics.checkNotNullParameter(pollSubItem0, "pollItem");
        this.text.setText(pollSubItem0.getTitle());
        if(pollSubItem0.getImage().length() > 0) {
            ImageLoader imageLoader0 = Keditor.INSTANCE.getImageLoader();
            if(imageLoader0 != null) {
                com.kakao.keditor.plugin.pluginspec.poll.creator.PollItemViewHolder.bind.1 pollItemViewHolder$bind$10 = new Function0() {
                    {
                        PollItemViewHolder.this = pollItemViewHolder0;
                        super(0);
                    }

                    @Override  // kotlin.jvm.functions.Function0
                    public Object invoke() {
                        this.invoke();
                        return Unit.INSTANCE;
                    }

                    public final void invoke() {
                        CommonViewUtilKt.convertRoundedDrawable(PollItemViewHolder.this.image, 2.0f);
                        PollItemViewHolder.this.image.setVisibility(0);
                    }
                };
                DefaultImpls.loadImage$default(imageLoader0, this.image, pollSubItem0.getImage(), "poll", null, null, null, null, pollItemViewHolder$bind$10, false, 376, null);
            }
        }
        else {
            this.image.setVisibility(8);
        }
    }

    @Override  // com.kakao.keditor.plugin.pluginspec.poll.creator.PollViewHolder
    public void bind(Object object0) {
        this.bind(((PollSubItem)object0));
    }

    @NotNull
    public final View getBorderLayout() {
        return this.borderLayout;
    }

    @NotNull
    public final EditText getText() {
        return this.text;
    }

    public final void updateAccessibilityDescriptions(int v, @NotNull PollSubItem pollSubItem0) {
        Intrinsics.checkNotNullParameter(pollSubItem0, "item");
        this.updateAccessibilityText(v);
        Intrinsics.checkNotNullExpressionValue(this.itemView, "itemView");
        KClass kClass0 = Reflection.getOrCreateKotlinClass(Button.class);
        CustomAction customAction0 = new CustomAction(id.accessibility_custom_action_0, string.action_poll_item_edit, new Function0() {
            {
                PollItemViewHolder.this = pollItemViewHolder0;
                super(0);
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                this.invoke();
                return Unit.INSTANCE;
            }

            public final void invoke() {
                PollItemViewHolder.this.getText().requestFocus();
                Context context0 = PollItemViewHolder.this.getText().getContext();
                Intrinsics.checkNotNullExpressionValue(context0, "getContext(...)");
                SoftInputKt.showSoftInput$default(context0, false, 1, null);
            }
        });
        CustomAction customAction1 = new CustomAction(id.accessibility_custom_action_1, string.action_poll_item_remove, new Function0() {
            {
                PollItemViewHolder.this = pollItemViewHolder0;
                super(0);
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                this.invoke();
                return Unit.INSTANCE;
            }

            public final void invoke() {
                PollItemViewHolder.this.remove.callOnClick();
            }
        });
        int v1 = id.accessibility_custom_action_2;
        int v2 = pollSubItem0.getImage().length() == 0 ? string.action_poll_item_add_image : string.action_poll_item_remove_image;
        ContentDescriptionKt.applyAccessibilityInfo$default(this.itemView, kClass0, null, null, CollectionsKt__CollectionsKt.listOf(new CustomAction[]{customAction0, customAction1, new CustomAction(v1, v2, new Function0() {
            {
                PollItemViewHolder.this = pollItemViewHolder0;
                super(0);
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                this.invoke();
                return Unit.INSTANCE;
            }

            public final void invoke() {
                PollItemViewHolder.this.emptyImage.callOnClick();
            }
        })}), null, 22, null);
    }

    private final void updateAccessibilityText(int v) {
        Editable editable0 = this.text.getText();
        Intrinsics.checkNotNullExpressionValue(editable0, "getText(...)");
        if(editable0.length() == 0) {
            Intrinsics.checkNotNullExpressionValue(this.itemView, "itemView");
            ContentDescriptionKt.setContentDescriptionWith(this.itemView, string.cd_poll_edit_item_empty, new Object[]{((int)(v + 1))});
            return;
        }
        Intrinsics.checkNotNullExpressionValue(this.itemView, "itemView");
        int v1 = string.cd_poll_edit_item;
        Object[] arr_object = {this.text.getText().toString(), ((int)(v + 1))};
        ContentDescriptionKt.setContentDescriptionWith(this.itemView, v1, arr_object);
    }
}

