package com.kakao.keditor.plugin.pluginspec.poll.creator;

import android.app.DatePickerDialog.OnDateSetListener;
import android.app.DatePickerDialog;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.kakao.keditor.Keditor;
import com.kakao.keditor.R.layout;
import com.kakao.keditor.plugin.attrs.item.Location;
import com.kakao.keditor.plugin.itemspec.poll.PollSubItem;
import com.kakao.keditor.plugin.pluginspec.poll.PollFooterItem;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BB\u0012\u0006\u0010\u0003\u001A\u00020\u0004\u0012!\u0010\u0005\u001A\u001D\u0012\u0013\u0012\u00110\u0007\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000B0\u0006\u0012\u0010\b\u0002\u0010\f\u001A\n\u0012\u0004\u0012\u00020\u000B\u0018\u00010\r\u00A2\u0006\u0002\u0010\u000EJ\b\u0010E\u001A\u00020!H\u0002J\u0006\u0010F\u001A\u00020\u0007J\b\u0010G\u001A\u00020\u0007H\u0016J\u0010\u0010H\u001A\u00020\u00072\u0006\u0010I\u001A\u00020\u0007H\u0016J\f\u0010J\u001A\b\u0012\u0004\u0012\u00020$0KJ\u0006\u0010L\u001A\u00020MJ\u0018\u0010N\u001A\u00020\u000B2\u0006\u0010O\u001A\u00020\u00022\u0006\u0010I\u001A\u00020\u0007H\u0016J\u0018\u0010P\u001A\u00020\u00022\u0006\u0010Q\u001A\u00020R2\u0006\u0010S\u001A\u00020\u0007H\u0016J\u0016\u0010T\u001A\u00020\u000B2\u0006\u0010U\u001A\u00020\u00072\u0006\u0010V\u001A\u00020\u0007J\u0010\u0010W\u001A\u00020\u000B2\u0006\u0010\n\u001A\u00020\u0007H\u0002J0\u0010X\u001A\u00020\u000B2\u0006\u0010\u0003\u001A\u00020Y2\u0006\u0010Z\u001A\u00020[2\u0006\u0010\\\u001A\u00020\u001B2\u0006\u0010]\u001A\u00020\u001B2\u0006\u0010^\u001A\u00020\u001BH\u0002J\u0014\u0010_\u001A\u00020\u000B2\f\u0010`\u001A\b\u0012\u0004\u0012\u00020$0KJ\u000E\u0010a\u001A\u00020\u000B2\u0006\u0010b\u001A\u00020\u0015R\u0011\u0010\u0003\u001A\u00020\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\u0010R\u000E\u0010\u0011\u001A\u00020\u0007X\u0082D\u00A2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001A\u0004\u0018\u00010\u0013X\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u001C\u0010\u0014\u001A\u0004\u0018\u00010\u0015X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001A\u0010\u001A\u001A\u00020\u001BX\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u001C\u0010\u001D\"\u0004\b\u001E\u0010\u001FR\u000E\u0010 \u001A\u00020!X\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u0017\u0010\"\u001A\b\u0012\u0004\u0012\u00020$0#\u00A2\u0006\b\n\u0000\u001A\u0004\b%\u0010&R(\u0010\'\u001A\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000B\u0018\u00010\u0006X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b(\u0010)\"\u0004\b*\u0010+R,\u0010\u0005\u001A\u001D\u0012\u0013\u0012\u00110\u0007\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000B0\u0006\u00A2\u0006\b\n\u0000\u001A\u0004\b,\u0010)R\u0016\u0010\f\u001A\n\u0012\u0004\u0012\u00020\u000B\u0018\u00010\rX\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u001A\u0010-\u001A\u00020\u0007X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b.\u0010/\"\u0004\b0\u00101R\u0016\u00102\u001A\n 3*\u0004\u0018\u00010\u001B0\u001BX\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u001C\u00104\u001A\u0004\u0018\u000105X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b6\u00107\"\u0004\b8\u00109R\u001A\u0010:\u001A\u00020\u0015X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b;\u0010\u0017\"\u0004\b<\u0010\u0019R\u000E\u0010=\u001A\u00020\u0007X\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u001C\u0010>\u001A\u0004\u0018\u00010\u0015X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b?\u0010\u0017\"\u0004\b@\u0010\u0019R\u0011\u0010A\u001A\u00020\u001B\u00A2\u0006\b\n\u0000\u001A\u0004\bB\u0010\u001DR\u0016\u0010C\u001A\n 3*\u0004\u0018\u00010\u001B0\u001BX\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u000E\u0010D\u001A\u00020\u0007X\u0082D\u00A2\u0006\u0002\n\u0000\u00A8\u0006c"}, d2 = {"Lcom/kakao/keditor/plugin/pluginspec/poll/creator/PollCreatorAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "activity", "Lcom/kakao/keditor/plugin/pluginspec/poll/creator/PollCreatorActivity;", "onRemovePollImageClicked", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "index", "", "onRequestAddPollImage", "Lkotlin/Function0;", "(Lcom/kakao/keditor/plugin/pluginspec/poll/creator/PollCreatorActivity;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "getActivity", "()Lcom/kakao/keditor/plugin/pluginspec/poll/creator/PollCreatorActivity;", "defaultItemCount", "defaultTypeFace", "Landroid/graphics/Typeface;", "endDate", "", "getEndDate", "()Ljava/lang/String;", "setEndDate", "(Ljava/lang/String;)V", "endSelectedDate", "Ljava/util/Calendar;", "getEndSelectedDate", "()Ljava/util/Calendar;", "setEndSelectedDate", "(Ljava/util/Calendar;)V", "itemListener", "Lcom/kakao/keditor/plugin/pluginspec/poll/creator/PollItemListener;", "items", "", "Lcom/kakao/keditor/plugin/itemspec/poll/PollSubItem;", "getItems", "()Ljava/util/List;", "onItemCountChangedListener", "getOnItemCountChangedListener", "()Lkotlin/jvm/functions/Function1;", "setOnItemCountChangedListener", "(Lkotlin/jvm/functions/Function1;)V", "getOnRemovePollImageClicked", "pickCount", "getPickCount", "()I", "setPickCount", "(I)V", "pickerMaxDate", "kotlin.jvm.PlatformType", "pollDataUpdateListener", "Lcom/kakao/keditor/plugin/pluginspec/poll/creator/PollDataUpdateListener;", "getPollDataUpdateListener", "()Lcom/kakao/keditor/plugin/pluginspec/poll/creator/PollDataUpdateListener;", "setPollDataUpdateListener", "(Lcom/kakao/keditor/plugin/pluginspec/poll/creator/PollDataUpdateListener;)V", "pollId", "getPollId", "setPollId", "requestImageIndex", "startDate", "getStartDate", "setStartDate", "startSelectedDate", "getStartSelectedDate", "today", "validItemLimit", "createPollItemListener", "getDataSize", "getItemCount", "getItemViewType", "position", "getValidItems", "", "isInvalidItems", "", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onItemMove", "from", "to", "requestPollImage", "selectDatePicker", "Landroidx/appcompat/app/AppCompatActivity;", "dateChangeListener", "Landroid/app/DatePickerDialog$OnDateSetListener;", "showDate", "minimumDate", "maximumDate", "setItems", "children", "setPollImage", "path", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPollCreatorAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PollCreatorAdapter.kt\ncom/kakao/keditor/plugin/pluginspec/poll/creator/PollCreatorAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,533:1\n766#2:534\n857#2,2:535\n*S KotlinDebug\n*F\n+ 1 PollCreatorAdapter.kt\ncom/kakao/keditor/plugin/pluginspec/poll/creator/PollCreatorAdapter\n*L\n302#1:534\n302#1:535,2\n*E\n"})
public final class PollCreatorAdapter extends Adapter {
    @NotNull
    private final PollCreatorActivity activity;
    private final int defaultItemCount;
    @Nullable
    private final Typeface defaultTypeFace;
    @Nullable
    private String endDate;
    @NotNull
    private Calendar endSelectedDate;
    @NotNull
    private final PollItemListener itemListener;
    @NotNull
    private final List items;
    @Nullable
    private Function1 onItemCountChangedListener;
    @NotNull
    private final Function1 onRemovePollImageClicked;
    @Nullable
    private final Function0 onRequestAddPollImage;
    private int pickCount;
    private final Calendar pickerMaxDate;
    @Nullable
    private PollDataUpdateListener pollDataUpdateListener;
    @NotNull
    private String pollId;
    private int requestImageIndex;
    @Nullable
    private String startDate;
    @NotNull
    private final Calendar startSelectedDate;
    private final Calendar today;
    private final int validItemLimit;

    public PollCreatorAdapter(@NotNull PollCreatorActivity pollCreatorActivity0, @NotNull Function1 function10, @Nullable Function0 function00) {
        Intrinsics.checkNotNullParameter(pollCreatorActivity0, "activity");
        Intrinsics.checkNotNullParameter(function10, "onRemovePollImageClicked");
        super();
        this.activity = pollCreatorActivity0;
        this.onRemovePollImageClicked = function10;
        this.onRequestAddPollImage = function00;
        this.items = new ArrayList();
        this.pollId = "";
        this.validItemLimit = 2;
        this.defaultItemCount = 3;
        this.itemListener = this.createPollItemListener();
        this.pickCount = 1;
        this.defaultTypeFace = Keditor.INSTANCE.getCustomFont();
        Calendar calendar0 = Calendar.getInstance();
        this.today = calendar0;
        Calendar calendar1 = Calendar.getInstance();
        calendar1.set(calendar0.get(1) + 4, 11, 0x1F);
        this.pickerMaxDate = calendar1;
        Object object0 = calendar0.clone();
        Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type java.util.Calendar");
        this.startSelectedDate = (Calendar)object0;
        Object object1 = ((Calendar)object0).clone();
        Intrinsics.checkNotNull(object1, "null cannot be cast to non-null type java.util.Calendar");
        ((Calendar)object1).add(5, 6);
        this.endSelectedDate = (Calendar)object1;
        this.startDate = PollCreatorConstKt.getCalendarDateDisplayFormat().format(((Calendar)object0).getTime());
        this.endDate = PollCreatorConstKt.getCalendarDateDisplayFormat().format(this.endSelectedDate.getTime());
        this.requestImageIndex = -1;
        for(int v = 0; v < 3; ++v) {
            PollSubItem pollSubItem0 = new PollSubItem();
            this.items.add(pollSubItem0);
        }
    }

    public PollCreatorAdapter(PollCreatorActivity pollCreatorActivity0, Function1 function10, Function0 function00, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 4) != 0) {
            function00 = null;
        }
        this(pollCreatorActivity0, function10, function00);
    }

    private final PollItemListener createPollItemListener() {
        return new PollItemListener() {
            @Override  // com.kakao.keditor.plugin.pluginspec.poll.creator.PollItemListener
            public void add(int v) {
                PollCreatorAdapter.this.getItems().add(new PollSubItem());
                if(PollCreatorAdapter.this.getItems().size() < 20) {
                    PollCreatorAdapter.this.notifyItemInserted(PollCreatorAdapter.this.getItems().size() - 1);
                }
                else if(PollCreatorAdapter.this.getItems().size() == 20) {
                    int v1 = PollCreatorAdapter.this.getItemCount();
                    PollCreatorAdapter.this.notifyItemRangeChanged(PollCreatorAdapter.this.getItems().size() - 1, v1 - 1);
                }
                Function1 function10 = PollCreatorAdapter.this.getOnItemCountChangedListener();
                if(function10 != null) {
                    function10.invoke(v);
                }
                Keditor.clickEvent$default(Keditor.INSTANCE, "kPoll", "addItem", null, 4, null);
            }

            @Override  // com.kakao.keditor.plugin.pluginspec.poll.creator.PollItemListener
            public void clickEndDate() {
                c c0 = new c(PollCreatorAdapter.this, 0);
                PollCreatorActivity pollCreatorActivity0 = PollCreatorAdapter.this.getActivity();
                Calendar calendar0 = PollCreatorAdapter.this.pickerMaxDate;
                Intrinsics.checkNotNullExpressionValue(calendar0, "access$getPickerMaxDate$p(...)");
                PollCreatorAdapter.this.selectDatePicker(pollCreatorActivity0, c0, PollCreatorAdapter.this.getEndSelectedDate(), PollCreatorAdapter.this.getStartSelectedDate(), calendar0);
                Keditor.INSTANCE.clickEvent("kPoll", "calendar", "endDate");
            }

            private static final void clickEndDate$lambda$3(PollCreatorAdapter pollCreatorAdapter0, DatePicker datePicker0, int v, int v1, int v2) {
                Intrinsics.checkNotNullParameter(pollCreatorAdapter0, "this$0");
                Calendar calendar0 = Calendar.getInstance();
                calendar0.set(v, v1, v2);
                Intrinsics.checkNotNullExpressionValue(calendar0, "apply(...)");
                pollCreatorAdapter0.setEndSelectedDate(calendar0);
                pollCreatorAdapter0.setEndDate(PollCreatorConstKt.getCalendarDateDisplayFormat().format(pollCreatorAdapter0.getEndSelectedDate().getTime()));
                pollCreatorAdapter0.notifyItemChanged(pollCreatorAdapter0.getItemCount() - 1);
            }

            @Override  // com.kakao.keditor.plugin.pluginspec.poll.creator.PollItemListener
            public void clickImage(int v) {
                String s = ((PollSubItem)PollCreatorAdapter.this.getItems().get(v)).getImage();
                if(s != null && s.length() != 0) {
                    PollCreatorAdapter.this.getOnRemovePollImageClicked().invoke(v);
                    Keditor.clickEvent$default(Keditor.INSTANCE, "kPoll", "removeImage", null, 4, null);
                    return;
                }
                PollCreatorAdapter.this.requestPollImage(v);
                Keditor.clickEvent$default(Keditor.INSTANCE, "kPoll", "addImage", null, 4, null);
            }

            @Override  // com.kakao.keditor.plugin.pluginspec.poll.creator.PollItemListener
            public void clickStartDate() {
                c c0 = new c(PollCreatorAdapter.this, 1);
                Calendar calendar0 = PollCreatorAdapter.this.today;
                Intrinsics.checkNotNullExpressionValue(calendar0, "access$getToday$p(...)");
                PollCreatorAdapter.this.selectDatePicker(PollCreatorAdapter.this.getActivity(), c0, PollCreatorAdapter.this.getStartSelectedDate(), calendar0, PollCreatorAdapter.this.getEndSelectedDate());
                Keditor.INSTANCE.clickEvent("kPoll", "calendar", "startDate");
            }

            private static final void clickStartDate$lambda$1(PollCreatorAdapter pollCreatorAdapter0, DatePicker datePicker0, int v, int v1, int v2) {
                Intrinsics.checkNotNullParameter(pollCreatorAdapter0, "this$0");
                pollCreatorAdapter0.getStartSelectedDate().set(v, v1, v2);
                pollCreatorAdapter0.setStartDate(PollCreatorConstKt.getCalendarDateDisplayFormat().format(pollCreatorAdapter0.getStartSelectedDate().getTime()));
                pollCreatorAdapter0.notifyItemChanged(pollCreatorAdapter0.getItemCount() - 1);
            }

            @Override  // com.kakao.keditor.plugin.pluginspec.poll.creator.PollItemListener
            public void countDown() {
                if(PollCreatorAdapter.this.getPickCount() > 1) {
                    PollCreatorAdapter.this.setPickCount(PollCreatorAdapter.this.getPickCount() - 1);
                }
                else {
                    PollCreatorAdapter.this.setPickCount(1);
                }
                PollCreatorAdapter.this.notifyDataSetChanged();
                Keditor.clickEvent$default(Keditor.INSTANCE, "kPoll", "decreaseCount", null, 4, null);
            }

            @Override  // com.kakao.keditor.plugin.pluginspec.poll.creator.PollItemListener
            public void countUp() {
                int v = PollCreatorAdapter.this.getDataSize();
                if(PollCreatorAdapter.this.getPickCount() < v) {
                    PollCreatorAdapter.this.setPickCount(PollCreatorAdapter.this.getPickCount() + 1);
                }
                else {
                    int v1 = PollCreatorAdapter.this.getDataSize();
                    PollCreatorAdapter.this.setPickCount(v1);
                }
                PollCreatorAdapter.this.notifyDataSetChanged();
                Keditor.clickEvent$default(Keditor.INSTANCE, "kPoll", "increaseCount", null, 4, null);
            }

            @Override  // com.kakao.keditor.plugin.pluginspec.poll.creator.PollItemListener
            public void remove(int v, int v1) {
                if(v >= 0 && v <= PollCreatorAdapter.this.getItems().size() - 1) {
                    if(PollCreatorAdapter.this.getItems().size() > PollCreatorAdapter.this.validItemLimit) {
                        PollCreatorAdapter.this.getItems().remove(v);
                        int v2 = PollCreatorAdapter.this.getDataSize();
                        if(PollCreatorAdapter.this.getPickCount() > v2) {
                            int v3 = PollCreatorAdapter.this.getDataSize();
                            PollCreatorAdapter.this.setPickCount(v3);
                        }
                        if(PollCreatorAdapter.this.getItems().size() == 19) {
                            int v4 = PollCreatorAdapter.this.getItemCount();
                            PollCreatorAdapter.this.notifyItemChanged(v4 - 1);
                        }
                        else {
                            PollCreatorAdapter.this.notifyItemRemoved(v);
                            int v5 = PollCreatorAdapter.this.getItemCount();
                            PollCreatorAdapter.this.notifyItemRangeChanged(v, v5);
                        }
                    }
                    else {
                        PollSubItem pollSubItem0 = (PollSubItem)PollCreatorAdapter.this.getItems().get(v);
                        pollSubItem0.setTitle("");
                        pollSubItem0.setImage("");
                        PollCreatorAdapter.this.notifyItemChanged(v);
                    }
                    PollDataUpdateListener pollDataUpdateListener0 = PollCreatorAdapter.this.getPollDataUpdateListener();
                    if(pollDataUpdateListener0 != null) {
                        pollDataUpdateListener0.notifyItemRemoved();
                    }
                    Function1 function10 = PollCreatorAdapter.this.getOnItemCountChangedListener();
                    if(function10 != null) {
                        function10.invoke(((int)(-v1)));
                    }
                    Keditor.clickEvent$default(Keditor.INSTANCE, "kPoll", "removeItem", null, 4, null);
                }
            }

            @Override  // com.kakao.keditor.plugin.pluginspec.poll.creator.PollItemListener
            public void updateText(@NotNull String s, int v) {
                Intrinsics.checkNotNullParameter(s, "text");
                ((PollSubItem)PollCreatorAdapter.this.getItems().get(v)).setTitle(s);
            }
        };
    }

    @NotNull
    public final PollCreatorActivity getActivity() {
        return this.activity;
    }

    public final int getDataSize() {
        return this.items.size();
    }

    @Nullable
    public final String getEndDate() {
        return this.endDate;
    }

    @NotNull
    public final Calendar getEndSelectedDate() {
        return this.endSelectedDate;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemCount() {
        int v = this.items.size();
        return v >= 20 ? v + 1 : v + 2;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemViewType(int v) {
        if(this.items.size() < 20) {
            if(v < this.items.size()) {
                return 0;
            }
            return v == this.items.size() ? 1 : 2;
        }
        return v < this.items.size() ? 0 : 2;
    }

    @NotNull
    public final List getItems() {
        return this.items;
    }

    @Nullable
    public final Function1 getOnItemCountChangedListener() {
        return this.onItemCountChangedListener;
    }

    @NotNull
    public final Function1 getOnRemovePollImageClicked() {
        return this.onRemovePollImageClicked;
    }

    public final int getPickCount() {
        return this.pickCount;
    }

    @Nullable
    public final PollDataUpdateListener getPollDataUpdateListener() {
        return this.pollDataUpdateListener;
    }

    @NotNull
    public final String getPollId() {
        return this.pollId;
    }

    @Nullable
    public final String getStartDate() {
        return this.startDate;
    }

    @NotNull
    public final Calendar getStartSelectedDate() {
        return this.startSelectedDate;
    }

    @NotNull
    public final List getValidItems() {
        List list0 = new ArrayList();
        for(Object object0: this.items) {
            if(((PollSubItem)object0).getTitle().length() > 0) {
                list0.add(object0);
            }
        }
        return list0;
    }

    public final boolean isInvalidItems() {
        return this.getValidItems().size() < this.validItemLimit;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onBindViewHolder(@NotNull ViewHolder recyclerView$ViewHolder0, int v) {
        Intrinsics.checkNotNullParameter(recyclerView$ViewHolder0, "holder");
        if(recyclerView$ViewHolder0 instanceof PollItemViewHolder) {
            ((PollItemViewHolder)recyclerView$ViewHolder0).bind(((PollSubItem)this.items.get(v)));
            ((PollItemViewHolder)recyclerView$ViewHolder0).updateAccessibilityDescriptions(v, ((PollSubItem)this.items.get(v)));
            return;
        }
        if(recyclerView$ViewHolder0 instanceof PollFooterViewHolder) {
            ((PollFooterViewHolder)recyclerView$ViewHolder0).bind(new PollFooterItem(this.startDate, this.endDate, this.pickCount, this.getDataSize()));
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup viewGroup0, int v) {
        Intrinsics.checkNotNullParameter(viewGroup0, "parent");
        LayoutInflater layoutInflater0 = LayoutInflater.from(viewGroup0.getContext());
        switch(v) {
            case 0: {
                View view1 = layoutInflater0.inflate(layout.ke_item_poll_create_sub, viewGroup0, false);
                Intrinsics.checkNotNullExpressionValue(view1, "inflate(...)");
                return new PollItemViewHolder(view1, this.defaultTypeFace, this.itemListener);
            }
            case 1: {
                View view2 = layoutInflater0.inflate(layout.ke_item_poll_create_sub_add, viewGroup0, false);
                Intrinsics.checkNotNullExpressionValue(view2, "inflate(...)");
                return new PollAddItemViewHolder(view2, this.defaultTypeFace, this.itemListener);
            }
            default: {
                View view0 = layoutInflater0.inflate(layout.ke_item_poll_create_footer, viewGroup0, false);
                Intrinsics.checkNotNullExpressionValue(view0, "inflate(...)");
                return new PollFooterViewHolder(view0, this.defaultTypeFace, this.itemListener);
            }
        }
    }

    public final void onItemMove(int v, int v1) {
        if(v < v1) {
            for(int v2 = v; v2 < v1; ++v2) {
                Collections.swap(this.items, v2, v2 + 1);
            }
        }
        else if(v1 + 1 <= v) {
            for(int v3 = v; true; --v3) {
                Collections.swap(this.items, v3, v3 - 1);
                if(v3 == v1 + 1) {
                    break;
                }
            }
        }
        this.notifyItemMoved(v, v1);
    }

    private final void requestPollImage(int v) {
        this.requestImageIndex = v;
        Function0 function00 = this.onRequestAddPollImage;
        if(function00 != null) {
            function00.invoke();
        }
    }

    private final void selectDatePicker(AppCompatActivity appCompatActivity0, DatePickerDialog.OnDateSetListener datePickerDialog$OnDateSetListener0, Calendar calendar0, Calendar calendar1, Calendar calendar2) {
        DatePickerDialog datePickerDialog0 = new DatePickerDialog(appCompatActivity0, 0, datePickerDialog$OnDateSetListener0, calendar0.get(1), calendar0.get(2), calendar0.get(5));
        DatePicker datePicker0 = datePickerDialog0.getDatePicker();
        datePicker0.setMinDate(calendar1.getTimeInMillis());
        datePicker0.setMaxDate(calendar2.getTimeInMillis());
        datePickerDialog0.show();
    }

    public final void setEndDate(@Nullable String s) {
        this.endDate = s;
    }

    public final void setEndSelectedDate(@NotNull Calendar calendar0) {
        Intrinsics.checkNotNullParameter(calendar0, "<set-?>");
        this.endSelectedDate = calendar0;
    }

    public final void setItems(@NotNull List list0) {
        Intrinsics.checkNotNullParameter(list0, "children");
        this.items.clear();
        this.items.addAll(list0);
    }

    public final void setOnItemCountChangedListener(@Nullable Function1 function10) {
        this.onItemCountChangedListener = function10;
    }

    public final void setPickCount(int v) {
        this.pickCount = v;
    }

    public final void setPollDataUpdateListener(@Nullable PollDataUpdateListener pollDataUpdateListener0) {
        this.pollDataUpdateListener = pollDataUpdateListener0;
    }

    public final void setPollId(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "<set-?>");
        this.pollId = s;
    }

    public final void setPollImage(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "path");
        int v = this.requestImageIndex;
        if(v > -1) {
            PollSubItem pollSubItem0 = (PollSubItem)this.items.get(v);
            pollSubItem0.setImage(s);
            pollSubItem0.setLocation(Location.LOCAL);
            this.notifyItemChanged(this.requestImageIndex);
            this.requestImageIndex = -1;
        }
    }

    public final void setStartDate(@Nullable String s) {
        this.startDate = s;
    }
}

