package com.kakao.keditor.plugin.pluginspec.poll.creator;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Toast;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView.OnScrollListener;
import androidx.recyclerview.widget.RecyclerView;
import com.kakao.common.view.SoftInputKt;
import com.kakao.common.widget.KeditorAlertDialog.Companion;
import com.kakao.common.widget.KeditorAlertDialog;
import com.kakao.keditor.Keditor;
import com.kakao.keditor.R.id;
import com.kakao.keditor.R.layout;
import com.kakao.keditor.R.string;
import com.kakao.keditor.databinding.KeActivityPollCreatorBinding;
import com.kakao.keditor.plugin.itemspec.poll.PollItem;
import com.kakao.keditor.plugin.itemspec.poll.PollSubItem;
import com.kakao.keditor.plugin.pluginspec.PluginSpecRequester;
import com.kakao.keditor.plugin.pluginspec.poll.OnPollImagePickerResult;
import com.kakao.keditor.plugin.pluginspec.poll.OpenPollImagePicker;
import com.kakao.keditor.standard.EditTextStandardKt;
import com.kakao.keditor.standard.TextStandardKt;
import com.kakao.keditor.util.eventbus.PluginSpecRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import md.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000B\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00A2\u0006\u0002\u0010\u0002J\b\u0010\'\u001A\u00020(H\u0002J\b\u0010)\u001A\u00020(H\u0002J\b\u0010*\u001A\u00020+H\u0002J\b\u0010,\u001A\u00020\u0012H\u0002J\"\u0010-\u001A\u00020+2\u0006\u0010.\u001A\u00020\u00042\u0006\u0010/\u001A\u00020\u00042\b\u00100\u001A\u0004\u0018\u00010\u001AH\u0014J\b\u00101\u001A\u00020+H\u0002J\u000E\u00102\u001A\u00020+2\u0006\u00103\u001A\u000204J\u0012\u00105\u001A\u00020+2\b\u00106\u001A\u0004\u0018\u000107H\u0014J\u0010\u00108\u001A\u00020+2\u0006\u00109\u001A\u00020\u0004H\u0002J\b\u0010:\u001A\u00020+H\u0002J\u0010\u0010;\u001A\u00020+2\u0006\u0010<\u001A\u000207H\u0014J\b\u0010=\u001A\u00020+H\u0002J\u0010\u0010>\u001A\u00020+2\u0006\u0010?\u001A\u00020@H\u0002J\u0012\u0010A\u001A\u00020+2\b\u0010B\u001A\u0004\u0018\u00010(H\u0002R\u000E\u0010\u0003\u001A\u00020\u0004X\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u000E\u0010\u0005\u001A\u00020\u0004X\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u001A\u0010\u0006\u001A\u00020\u0007X\u0086.\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000BR\u001B\u0010\f\u001A\u00020\u00048BX\u0082\u0084\u0002\u00A2\u0006\f\n\u0004\b\u000F\u0010\u0010\u001A\u0004\b\r\u0010\u000ER\u000E\u0010\u0011\u001A\u00020\u0012X\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u001B\u0010\u0013\u001A\u00020\u00048BX\u0082\u0084\u0002\u00A2\u0006\f\n\u0004\b\u0015\u0010\u0010\u001A\u0004\b\u0014\u0010\u000ER\u0014\u0010\u0016\u001A\u00020\u00048BX\u0082\u0004\u00A2\u0006\u0006\u001A\u0004\b\u0017\u0010\u000ER\u0016\u0010\u0018\u001A\n\u0012\u0004\u0012\u00020\u001A\u0018\u00010\u0019X\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u001B\u0010\u001B\u001A\u00020\u001C8BX\u0082\u0084\u0002\u00A2\u0006\f\n\u0004\b\u001F\u0010\u0010\u001A\u0004\b\u001D\u0010\u001ER\u0010\u0010 \u001A\u0004\u0018\u00010!X\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u001B\u0010\"\u001A\u00020#8BX\u0082\u0084\u0002\u00A2\u0006\f\n\u0004\b&\u0010\u0010\u001A\u0004\b$\u0010%\u00A8\u0006C"}, d2 = {"Lcom/kakao/keditor/plugin/pluginspec/poll/creator/PollCreatorActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "attachedOtherImageUploadableCount", "", "attachedPollImageCount", "binding", "Lcom/kakao/keditor/databinding/KeActivityPollCreatorBinding;", "getBinding", "()Lcom/kakao/keditor/databinding/KeActivityPollCreatorBinding;", "setBinding", "(Lcom/kakao/keditor/databinding/KeActivityPollCreatorBinding;)V", "editorId", "getEditorId", "()I", "editorId$delegate", "Lkotlin/Lazy;", "isPickerIntentLauncher", "", "keditorItemIndex", "getKeditorItemIndex", "keditorItemIndex$delegate", "pickerRequestCode", "getPickerRequestCode", "pickerResultLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "pollAdapter", "Lcom/kakao/keditor/plugin/pluginspec/poll/creator/PollCreatorAdapter;", "getPollAdapter", "()Lcom/kakao/keditor/plugin/pluginspec/poll/creator/PollCreatorAdapter;", "pollAdapter$delegate", "toast", "Landroid/widget/Toast;", "viewModel", "Lcom/kakao/keditor/plugin/pluginspec/poll/creator/PollCreatorViewModel;", "getViewModel", "()Lcom/kakao/keditor/plugin/pluginspec/poll/creator/PollCreatorViewModel;", "viewModel$delegate", "createTempSaveItem", "Lcom/kakao/keditor/plugin/itemspec/poll/PollItem;", "export", "initViewModel", "", "isValidate", "onActivityResult", "requestCode", "resultCode", "data", "onAttachPoll", "onClick", "view", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onRemovePollImageClicked", "index", "onRequestAddPollImage", "onSaveInstanceState", "outState", "saveCurrentState", "sendRequestToPollPlugin", "request", "Lcom/kakao/keditor/util/eventbus/PluginSpecRequest;", "setData", "pollModel", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPollCreatorActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PollCreatorActivity.kt\ncom/kakao/keditor/plugin/pluginspec/poll/creator/PollCreatorActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,242:1\n75#2,13:243\n65#3,16:256\n93#3,3:272\n766#4:275\n857#4,2:276\n*S KotlinDebug\n*F\n+ 1 PollCreatorActivity.kt\ncom/kakao/keditor/plugin/pluginspec/poll/creator/PollCreatorActivity\n*L\n44#1:243,13\n76#1:256,16\n76#1:272,3\n223#1:275\n223#1:276,2\n*E\n"})
public final class PollCreatorActivity extends AppCompatActivity {
    private int attachedOtherImageUploadableCount;
    private int attachedPollImageCount;
    public KeActivityPollCreatorBinding binding;
    @NotNull
    private final Lazy editorId$delegate;
    private boolean isPickerIntentLauncher;
    @NotNull
    private final Lazy keditorItemIndex$delegate;
    @Nullable
    private ActivityResultLauncher pickerResultLauncher;
    @NotNull
    private final Lazy pollAdapter$delegate;
    @Nullable
    private Toast toast;
    @NotNull
    private final Lazy viewModel$delegate;

    public PollCreatorActivity() {
        com.kakao.keditor.plugin.pluginspec.poll.creator.PollCreatorActivity.special..inlined.viewModels.default.1 pollCreatorActivity$special$$inlined$viewModels$default$10 = new Function0() {
            final ComponentActivity $this_viewModels;

            {
                this.$this_viewModels = componentActivity0;
                super(0);
            }

            @NotNull
            public final Factory invoke() {
                return this.$this_viewModels.getDefaultViewModelProviderFactory();
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                return this.invoke();
            }
        };
        this.viewModel$delegate = new ViewModelLazy(Reflection.getOrCreateKotlinClass(PollCreatorViewModel.class), new Function0() {
            final ComponentActivity $this_viewModels;

            {
                this.$this_viewModels = componentActivity0;
                super(0);
            }

            @NotNull
            public final ViewModelStore invoke() {
                return this.$this_viewModels.getViewModelStore();
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                return this.invoke();
            }
        }, pollCreatorActivity$special$$inlined$viewModels$default$10, new Function0(this) {
            final Function0 $extrasProducer;
            final ComponentActivity $this_viewModels;

            {
                this.$extrasProducer = function00;
                this.$this_viewModels = componentActivity0;
                super(0);
            }

            @NotNull
            public final CreationExtras invoke() {
                Function0 function00 = this.$extrasProducer;
                if(function00 != null) {
                    CreationExtras creationExtras0 = (CreationExtras)function00.invoke();
                    return creationExtras0 == null ? this.$this_viewModels.getDefaultViewModelCreationExtras() : creationExtras0;
                }
                return this.$this_viewModels.getDefaultViewModelCreationExtras();
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                return this.invoke();
            }
        });
        this.pollAdapter$delegate = c.lazy(new Function0() {
            {
                PollCreatorActivity.this = pollCreatorActivity0;
                super(0);
            }

            @NotNull
            public final PollCreatorAdapter invoke() {
                com.kakao.keditor.plugin.pluginspec.poll.creator.PollCreatorActivity.pollAdapter.2.1 pollCreatorActivity$pollAdapter$2$10 = new Function1() {
                    {
                        super(1, object0, PollCreatorActivity.class, "onRemovePollImageClicked", "onRemovePollImageClicked(I)V", 0);
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.invoke(((Number)object0).intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(int v) {
                        PollCreatorActivity.access$onRemovePollImageClicked(((PollCreatorActivity)this.receiver), v);
                    }
                };
                com.kakao.keditor.plugin.pluginspec.poll.creator.PollCreatorActivity.pollAdapter.2.2 pollCreatorActivity$pollAdapter$2$20 = new Function0() {
                    {
                        super(0, object0, PollCreatorActivity.class, "onRequestAddPollImage", "onRequestAddPollImage()V", 0);
                    }

                    @Override  // kotlin.jvm.functions.Function0
                    public Object invoke() {
                        this.invoke();
                        return Unit.INSTANCE;
                    }

                    public final void invoke() {
                        PollCreatorActivity.access$onRequestAddPollImage(((PollCreatorActivity)this.receiver));
                    }
                };
                return new PollCreatorAdapter(PollCreatorActivity.this, pollCreatorActivity$pollAdapter$2$10, pollCreatorActivity$pollAdapter$2$20);
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                return this.invoke();
            }
        });
        this.editorId$delegate = c.lazy(new Function0() {
            {
                PollCreatorActivity.this = pollCreatorActivity0;
                super(0);
            }

            @NotNull
            public final Integer invoke() {
                return PollCreatorActivity.this.getIntent().getIntExtra("editor_id", -1);
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                return this.invoke();
            }
        });
        this.keditorItemIndex$delegate = c.lazy(new Function0() {
            {
                PollCreatorActivity.this = pollCreatorActivity0;
                super(0);
            }

            @NotNull
            public final Integer invoke() {
                return PollCreatorActivity.this.getIntent().getIntExtra("keditor_item_index", -1);
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                return this.invoke();
            }
        });
    }

    public static final void access$onRemovePollImageClicked(PollCreatorActivity pollCreatorActivity0, int v) {
        pollCreatorActivity0.onRemovePollImageClicked(v);
    }

    public static final void access$onRequestAddPollImage(PollCreatorActivity pollCreatorActivity0) {
        pollCreatorActivity0.onRequestAddPollImage();
    }

    private final PollItem createTempSaveItem() {
        PollItem pollItem0 = new PollItem();
        pollItem0.setId(this.getPollAdapter().getPollId());
        pollItem0.setTitle(this.getBinding().titleInput.getText().toString());
        String s = PollCreatorConstKt.getCalendarDateFormat().format(this.getPollAdapter().getStartSelectedDate().getTime());
        Intrinsics.checkNotNullExpressionValue(s, "format(...)");
        pollItem0.setStartDate(s);
        String s1 = PollCreatorConstKt.getCalendarDateFormat().format(this.getPollAdapter().getEndSelectedDate().getTime());
        Intrinsics.checkNotNullExpressionValue(s1, "format(...)");
        pollItem0.setEndDate(s1);
        List list0 = this.getPollAdapter().getItems();
        pollItem0.getSubItems().addAll(list0);
        pollItem0.setSelectCount((this.getPollAdapter().getPickCount() > list0.size() ? list0.size() : this.getPollAdapter().getPickCount()));
        return pollItem0;
    }

    private final PollItem export() {
        PollItem pollItem0 = new PollItem();
        pollItem0.setId(this.getPollAdapter().getPollId());
        pollItem0.setTitle(this.getBinding().titleInput.getText().toString());
        String s = PollCreatorConstKt.getCalendarDateFormat().format(this.getPollAdapter().getStartSelectedDate().getTime());
        Intrinsics.checkNotNullExpressionValue(s, "format(...)");
        pollItem0.setStartDate(s);
        String s1 = PollCreatorConstKt.getCalendarDateFormat().format(this.getPollAdapter().getEndSelectedDate().getTime());
        Intrinsics.checkNotNullExpressionValue(s1, "format(...)");
        pollItem0.setEndDate(s1);
        List list0 = this.getPollAdapter().getValidItems();
        pollItem0.getSubItems().addAll(list0);
        pollItem0.setSelectCount((this.getPollAdapter().getPickCount() > list0.size() ? list0.size() : this.getPollAdapter().getPickCount()));
        return pollItem0;
    }

    @NotNull
    public final KeActivityPollCreatorBinding getBinding() {
        KeActivityPollCreatorBinding keActivityPollCreatorBinding0 = this.binding;
        if(keActivityPollCreatorBinding0 != null) {
            return keActivityPollCreatorBinding0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    private final int getEditorId() {
        return ((Number)this.editorId$delegate.getValue()).intValue();
    }

    private final int getKeditorItemIndex() {
        return ((Number)this.keditorItemIndex$delegate.getValue()).intValue();
    }

    private final int getPickerRequestCode() {
        return this.getIntent().getIntExtra("request_code", -1);
    }

    private final PollCreatorAdapter getPollAdapter() {
        return (PollCreatorAdapter)this.pollAdapter$delegate.getValue();
    }

    private final PollCreatorViewModel getViewModel() {
        return (PollCreatorViewModel)this.viewModel$delegate.getValue();
    }

    private final void initViewModel() {
        this.getViewModel().getPollItem().observe(this, new PollCreatorActivity.sam.androidx_lifecycle_Observer.0(new Function1() {
            {
                PollCreatorActivity.this = pollCreatorActivity0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((PollItem)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable PollItem pollItem0) {
                PollCreatorActivity.this.setData(pollItem0);
            }
        }));
    }

    private final boolean isValidate() {
        Editable editable0 = this.getBinding().titleInput.getText();
        Intrinsics.checkNotNullExpressionValue(editable0, "getText(...)");
        if(editable0.length() == 0 || this.getPollAdapter().isInvalidItems()) {
            Toast toast0 = this.toast;
            if(toast0 != null) {
                toast0.cancel();
            }
            Toast toast1 = Toast.makeText(this, string.poll_validate_empty_form, 0);
            this.toast = toast1;
            if(toast1 != null) {
                toast1.show();
                return false;
            }
            return false;
        }
        return true;
    }

    @Override  // androidx.fragment.app.FragmentActivity
    public void onActivityResult(int v, int v1, @Nullable Intent intent0) {
        super.onActivityResult(v, v1, intent0);
        if(v == this.getPickerRequestCode() && intent0 != null && !this.isPickerIntentLauncher) {
            this.sendRequestToPollPlugin(new OnPollImagePickerResult("poll", this, this.getPollAdapter(), v1, intent0));
        }
    }

    private final void onAttachPoll() {
        if(this.isValidate()) {
            Intent intent0 = new Intent();
            intent0.putExtra("data", this.export());
            if(Intrinsics.areEqual(this.getViewModel().isEditMode().getValue(), Boolean.TRUE)) {
                intent0.putExtra("is_edit_flag", true);
            }
            this.setResult(-1, intent0);
            this.finish();
        }
    }

    public final void onClick(@NotNull View view0) {
        Intrinsics.checkNotNullParameter(view0, "view");
        int v = view0.getId();
        if(v == id.close) {
            Keditor.clickEvent$default(Keditor.INSTANCE, "kPoll", "close", null, 4, null);
            this.finish();
            return;
        }
        if(v == id.title_del_btn) {
            this.getBinding().titleInput.setText("");
            return;
        }
        if(v == id.attach_poll) {
            Keditor.clickEvent$default(Keditor.INSTANCE, "kPoll", "confirm", null, 4, null);
            this.onAttachPoll();
        }
    }

    @Override  // androidx.fragment.app.FragmentActivity
    public void onCreate(@Nullable Bundle bundle0) {
        super.onCreate(bundle0);
        ViewDataBinding viewDataBinding0 = DataBindingUtil.setContentView(this, layout.ke_activity_poll_creator);
        Intrinsics.checkNotNullExpressionValue(viewDataBinding0, "setContentView(...)");
        this.setBinding(((KeActivityPollCreatorBinding)viewDataBinding0));
        this.initViewModel();
        KeActivityPollCreatorBinding keActivityPollCreatorBinding0 = this.getBinding();
        Intrinsics.checkNotNull(keActivityPollCreatorBinding0.titleInput);
        EditTextStandardKt.applyCustomFont(keActivityPollCreatorBinding0.titleInput);
        com.kakao.keditor.plugin.pluginspec.poll.creator.PollCreatorActivity.onCreate.lambda.1..inlined.addTextChangedListener.default.1 pollCreatorActivity$onCreate$lambda$1$$inlined$addTextChangedListener$default$10 = new TextWatcher() {
            @Override  // android.text.TextWatcher
            public void afterTextChanged(@Nullable Editable editable0) {
                int v = TextStandardKt.getGraphemeLength(String.valueOf(editable0));
                if(v > 40) {
                    int v1 = this.getSelectionStart();
                    String s = TextStandardKt.getBreakIteratorSubstring(String.valueOf(editable0), 40);
                    this.setText(s);
                    if(v1 > s.length()) {
                        v1 = s.length();
                    }
                    this.setSelection(v1);
                }
                PollCreatorActivity.this.getBinding().titleDelBtn.setVisibility((v <= 0 ? 4 : 0));
            }

            @Override  // android.text.TextWatcher
            public void beforeTextChanged(@Nullable CharSequence charSequence0, int v, int v1, int v2) {
            }

            @Override  // android.text.TextWatcher
            public void onTextChanged(@Nullable CharSequence charSequence0, int v, int v1, int v2) {
            }
        };
        keActivityPollCreatorBinding0.titleInput.addTextChangedListener(pollCreatorActivity$onCreate$lambda$1$$inlined$addTextChangedListener$default$10);
        KeActivityPollCreatorBinding keActivityPollCreatorBinding1 = this.getBinding();
        LinearLayoutManager linearLayoutManager0 = new LinearLayoutManager(this);
        keActivityPollCreatorBinding1.pollItems.setLayoutManager(linearLayoutManager0);
        PollCreatorAdapter pollCreatorAdapter0 = this.getPollAdapter();
        pollCreatorAdapter0.setOnItemCountChangedListener(new Function1() {
            {
                PollCreatorActivity.this = pollCreatorActivity0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((Number)object0).intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int v) {
                SoftInputKt.hideSoftInput(PollCreatorActivity.this);
            }
        });
        keActivityPollCreatorBinding1.pollItems.setAdapter(pollCreatorAdapter0);
        com.kakao.keditor.plugin.pluginspec.poll.creator.PollCreatorActivity.onCreate.2.2 pollCreatorActivity$onCreate$2$20 = new OnScrollListener() {
            @Override  // androidx.recyclerview.widget.RecyclerView$OnScrollListener
            public void onScrollStateChanged(@NotNull RecyclerView recyclerView0, int v) {
                Intrinsics.checkNotNullParameter(recyclerView0, "recyclerView");
                super.onScrollStateChanged(recyclerView0, v);
                if(v == 1) {
                    SoftInputKt.hideSoftInput(PollCreatorActivity.this);
                }
            }
        };
        keActivityPollCreatorBinding1.pollItems.addOnScrollListener(pollCreatorActivity$onCreate$2$20);
        new ItemTouchHelper(new PollItemTouchHelperCallback(this.getPollAdapter())).attachToRecyclerView(this.getBinding().pollItems);
        this.getPollAdapter().setOnItemCountChangedListener(new Function1() {
            {
                PollCreatorActivity.this = pollCreatorActivity0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((Number)object0).intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int v) {
                PollCreatorActivity.this.getBinding().scrollView.smoothScrollBy(0, v);
            }
        });
        boolean z = this.getIntent().getBooleanExtra("picker_is_intent_launcher", false);
        this.isPickerIntentLauncher = z;
        if(z) {
            this.pickerResultLauncher = this.registerForActivityResult(new StartActivityForResult(), new b(this, 0));
        }
        this.attachedOtherImageUploadableCount = this.getIntent().getIntExtra("other_image_uploadable_count", 0);
        this.attachedPollImageCount = this.getIntent().getIntExtra("attached_poll_image_count", 0);
    }

    private static final void onCreate$lambda$5(PollCreatorActivity pollCreatorActivity0, ActivityResult activityResult0) {
        Intrinsics.checkNotNullParameter(pollCreatorActivity0, "this$0");
        pollCreatorActivity0.sendRequestToPollPlugin(new OnPollImagePickerResult("poll", pollCreatorActivity0, pollCreatorActivity0.getPollAdapter(), activityResult0.getResultCode(), activityResult0.getData()));
    }

    private final void onRemovePollImageClicked(int v) {
        Integer integer0 = string.poll_image_remove;
        int v1 = string.common_dialog_remove;
        int v2 = string.common_dialog_cancel;
        com.kakao.keditor.plugin.pluginspec.poll.creator.PollCreatorActivity.onRemovePollImageClicked.1 pollCreatorActivity$onRemovePollImageClicked$10 = new Function0(v) {
            final int $index;

            {
                PollCreatorActivity.this = pollCreatorActivity0;
                this.$index = v;
                super(0);
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                this.invoke();
                return Unit.INSTANCE;
            }

            public final void invoke() {
                ((PollSubItem)PollCreatorActivity.this.getPollAdapter().getItems().get(this.$index)).setImage("");
                PollCreatorActivity.this.getPollAdapter().notifyItemChanged(this.$index);
            }
        };
        Companion.newInstance$default(KeditorAlertDialog.Companion, integer0, null, v1, v2, false, pollCreatorActivity$onRemovePollImageClicked$10, 18, null).show(this.getSupportFragmentManager(), null);
    }

    private final void onRequestAddPollImage() {
        int v = this.getKeditorItemIndex();
        PollCreatorAdapter pollCreatorAdapter0 = this.getPollAdapter();
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: pollCreatorAdapter0.getItems()) {
            String s = ((PollSubItem)object0).getPath();
            if(s != null && s.length() != 0) {
                arrayList0.add(object0);
            }
        }
        this.sendRequestToPollPlugin(new OpenPollImagePicker("poll", this, v, arrayList0));
    }

    @Override  // androidx.activity.ComponentActivity
    public void onSaveInstanceState(@NotNull Bundle bundle0) {
        Intrinsics.checkNotNullParameter(bundle0, "outState");
        super.onSaveInstanceState(bundle0);
        this.saveCurrentState();
    }

    private final void saveCurrentState() {
        this.getViewModel().setItem(this.createTempSaveItem());
    }

    private final void sendRequestToPollPlugin(PluginSpecRequest pluginSpecRequest0) {
        int v = this.getEditorId();
        PluginSpecRequester.INSTANCE.request(pluginSpecRequest0, v);
    }

    public final void setBinding(@NotNull KeActivityPollCreatorBinding keActivityPollCreatorBinding0) {
        Intrinsics.checkNotNullParameter(keActivityPollCreatorBinding0, "<set-?>");
        this.binding = keActivityPollCreatorBinding0;
    }

    private final void setData(PollItem pollItem0) {
        if(pollItem0 == null) {
            return;
        }
        this.getBinding().navigationTitle.setText(string.title_poll_modify);
        this.getBinding().titleInput.setText(pollItem0.getTitle());
        Date date0 = PollCreatorConstKt.getCalendarDateFormat().parse(pollItem0.getStartDate());
        if(date0 != null) {
            this.getPollAdapter().getStartSelectedDate().setTime(date0);
        }
        Date date1 = PollCreatorConstKt.getCalendarDateFormat().parse(pollItem0.getEndDate());
        if(date1 != null) {
            this.getPollAdapter().getEndSelectedDate().setTime(date1);
        }
        this.getPollAdapter().setStartDate(PollCreatorConstKt.getCalendarDateDisplayFormat().format(this.getPollAdapter().getStartSelectedDate().getTime()));
        this.getPollAdapter().setEndDate(PollCreatorConstKt.getCalendarDateDisplayFormat().format(this.getPollAdapter().getEndSelectedDate().getTime()));
        this.getPollAdapter().setPickCount(pollItem0.getSelectCount());
        this.getPollAdapter().setPollId(pollItem0.getId());
        this.getPollAdapter().setItems(pollItem0.getSubItems());
        this.getPollAdapter().notifyDataSetChanged();
    }
}

