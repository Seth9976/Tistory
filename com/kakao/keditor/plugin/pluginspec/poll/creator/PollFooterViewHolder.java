package com.kakao.keditor.plugin.pluginspec.poll.creator;

import android.graphics.Typeface;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.kakao.keditor.R.id;
import com.kakao.keditor.R.string;
import com.kakao.keditor.plugin.extension.ContentDescriptionKt;
import com.kakao.keditor.plugin.pluginspec.poll.PollFooterItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001F\u0012\u0006\u0010\u0003\u001A\u00020\u0004\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001A\u00020\b¢\u0006\u0002\u0010\tJ\u0010\u0010\u0013\u001A\u00020\u00142\u0006\u0010\u0015\u001A\u00020\u0002H\u0016J\u0018\u0010\u0016\u001A\u00020\u00142\u0006\u0010\u0017\u001A\u00020\u00182\u0006\u0010\u0019\u001A\u00020\u0018H\u0002R\u000E\u0010\n\u001A\u00020\u000BX\u0082\u0004¢\u0006\u0002\n\u0000R\u000E\u0010\f\u001A\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000E\u0010\r\u001A\u00020\u000BX\u0082\u0004¢\u0006\u0002\n\u0000R\u000E\u0010\u000E\u001A\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000E\u0010\u000F\u001A\u00020\u000BX\u0082\u0004¢\u0006\u0002\n\u0000R\u000E\u0010\u0010\u001A\u00020\u000BX\u0082\u0004¢\u0006\u0002\n\u0000R\u000E\u0010\u0011\u001A\u00020\u000BX\u0082\u0004¢\u0006\u0002\n\u0000R\u000E\u0010\u0012\u001A\u00020\u000BX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001A"}, d2 = {"Lcom/kakao/keditor/plugin/pluginspec/poll/creator/PollFooterViewHolder;", "Lcom/kakao/keditor/plugin/pluginspec/poll/creator/PollViewHolder;", "Lcom/kakao/keditor/plugin/pluginspec/poll/PollFooterItem;", "view", "Landroid/view/View;", "typeface", "Landroid/graphics/Typeface;", "itemListener", "Lcom/kakao/keditor/plugin/pluginspec/poll/creator/PollItemListener;", "(Landroid/view/View;Landroid/graphics/Typeface;Lcom/kakao/keditor/plugin/pluginspec/poll/creator/PollItemListener;)V", "endDate", "Landroid/widget/TextView;", "pickCountDown", "pickCountText", "pickCountUp", "startDate", "titleEndDate", "titlePickCount", "titleStartDate", "bind", "", "item", "pickCountButtonDimmed", "pickCount", "", "pickCountMax", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class PollFooterViewHolder extends PollViewHolder {
    @NotNull
    private final TextView endDate;
    @NotNull
    private final View pickCountDown;
    @NotNull
    private final TextView pickCountText;
    @NotNull
    private final View pickCountUp;
    @NotNull
    private final TextView startDate;
    @NotNull
    private final TextView titleEndDate;
    @NotNull
    private final TextView titlePickCount;
    @NotNull
    private final TextView titleStartDate;

    public PollFooterViewHolder(@NotNull View view0, @Nullable Typeface typeface0, @NotNull PollItemListener pollItemListener0) {
        Intrinsics.checkNotNullParameter(view0, "view");
        Intrinsics.checkNotNullParameter(pollItemListener0, "itemListener");
        super(view0);
        View view1 = view0.findViewById(id.title_start_date);
        Intrinsics.checkNotNullExpressionValue(view1, "findViewById(...)");
        this.titleStartDate = (TextView)view1;
        View view2 = view0.findViewById(id.title_end_date);
        Intrinsics.checkNotNullExpressionValue(view2, "findViewById(...)");
        this.titleEndDate = (TextView)view2;
        View view3 = view0.findViewById(id.title_pick_count);
        Intrinsics.checkNotNullExpressionValue(view3, "findViewById(...)");
        this.titlePickCount = (TextView)view3;
        View view4 = view0.findViewById(id.selected_start_date);
        Intrinsics.checkNotNullExpressionValue(view4, "findViewById(...)");
        this.startDate = (TextView)view4;
        View view5 = view0.findViewById(id.selected_end_date);
        Intrinsics.checkNotNullExpressionValue(view5, "findViewById(...)");
        this.endDate = (TextView)view5;
        View view6 = view0.findViewById(id.image_pick_count_down);
        Intrinsics.checkNotNullExpressionValue(view6, "findViewById(...)");
        this.pickCountDown = view6;
        View view7 = view0.findViewById(id.image_pick_count_up);
        Intrinsics.checkNotNullExpressionValue(view7, "findViewById(...)");
        this.pickCountUp = view7;
        View view8 = view0.findViewById(id.text_pick_count);
        Intrinsics.checkNotNullExpressionValue(view8, "findViewById(...)");
        this.pickCountText = (TextView)view8;
        view6.setOnClickListener(new d(pollItemListener0, 0));
        view7.setOnClickListener(new d(pollItemListener0, 1));
        ((TextView)view4).setOnClickListener(new d(pollItemListener0, 2));
        ((TextView)view5).setOnClickListener(new d(pollItemListener0, 3));
        if(typeface0 != null) {
            ((TextView)view4).setTypeface(typeface0);
            ((TextView)view5).setTypeface(typeface0);
            ((TextView)view1).setTypeface(typeface0);
            ((TextView)view2).setTypeface(typeface0);
            ((TextView)view3).setTypeface(typeface0);
            ((TextView)view8).setTypeface(typeface0);
        }
        ContentDescriptionKt.applyAccessibilityInfo$default(((TextView)view4), Reflection.getOrCreateKotlinClass(Button.class), null, null, null, null, 30, null);
        ContentDescriptionKt.applyAccessibilityInfo$default(((TextView)view5), Reflection.getOrCreateKotlinClass(Button.class), null, null, null, null, 30, null);
    }

    private static final void _init_$lambda$2(PollItemListener pollItemListener0, View view0) {
        Intrinsics.checkNotNullParameter(pollItemListener0, "$itemListener");
        pollItemListener0.countDown();
    }

    private static final void _init_$lambda$3(PollItemListener pollItemListener0, View view0) {
        Intrinsics.checkNotNullParameter(pollItemListener0, "$itemListener");
        pollItemListener0.countUp();
    }

    private static final void _init_$lambda$4(PollItemListener pollItemListener0, View view0) {
        Intrinsics.checkNotNullParameter(pollItemListener0, "$itemListener");
        pollItemListener0.clickStartDate();
    }

    private static final void _init_$lambda$5(PollItemListener pollItemListener0, View view0) {
        Intrinsics.checkNotNullParameter(pollItemListener0, "$itemListener");
        pollItemListener0.clickEndDate();
    }

    public void bind(@NotNull PollFooterItem pollFooterItem0) {
        Intrinsics.checkNotNullParameter(pollFooterItem0, "item");
        this.pickCountText.setText(String.valueOf(pollFooterItem0.getPickCount()));
        this.pickCountButtonDimmed(pollFooterItem0.getPickCount(), pollFooterItem0.getPickCountMax());
        String s = pollFooterItem0.getStartDate();
        if(s != null) {
            this.startDate.setText(s);
        }
        String s1 = pollFooterItem0.getEndDate();
        if(s1 != null) {
            this.endDate.setText(s1);
        }
        String s2 = this.startDate.getContext().getString(string.cd_poll_edit_start_date);
        Intrinsics.checkNotNullExpressionValue(s2, "getString(...)");
        ContentDescriptionKt.setContentDescriptionWith(this.startDate, s2, new Object[]{pollFooterItem0.getStartDate()});
        String s3 = this.startDate.getContext().getString(string.cd_poll_edit_end_date);
        Intrinsics.checkNotNullExpressionValue(s3, "getString(...)");
        ContentDescriptionKt.setContentDescriptionWith(this.endDate, s3, new Object[]{pollFooterItem0.getEndDate()});
        String s4 = this.titlePickCount.getContext().getString(string.cd_poll_max_select);
        Intrinsics.checkNotNullExpressionValue(s4, "getString(...)");
        ContentDescriptionKt.setContentDescriptionWith(this.titlePickCount, s4, new Object[]{pollFooterItem0.getPickCount()});
    }

    @Override  // com.kakao.keditor.plugin.pluginspec.poll.creator.PollViewHolder
    public void bind(Object object0) {
        this.bind(((PollFooterItem)object0));
    }

    private final void pickCountButtonDimmed(int v, int v1) {
        boolean z = false;
        this.pickCountDown.setEnabled(v != 1);
        float f = 1.0f;
        this.pickCountDown.setAlpha((v == 1 ? 0.4f : 1.0f));
        View view0 = this.pickCountUp;
        if(v != v1) {
            z = true;
        }
        view0.setEnabled(z);
        View view1 = this.pickCountUp;
        if(v == v1) {
            f = 0.4f;
        }
        view1.setAlpha(f);
    }
}

