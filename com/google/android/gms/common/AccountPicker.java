package com.google.android.gms.common;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.ArrayList;
import java.util.List;

public final class AccountPicker {
    public static class AccountChooserOptions {
        public static class Builder {
            public Account a;
            public ArrayList b;
            public ArrayList c;
            public boolean d;
            public String e;
            public Bundle f;

            public Builder() {
                this.d = false;
            }

            @NonNull
            public AccountChooserOptions build() {
                Preconditions.checkArgument(true, "We only support hostedDomain filter for account chip styled account picker");
                Preconditions.checkArgument(true, "Consent is only valid for account chip styled account picker");
                AccountChooserOptions accountPicker$AccountChooserOptions0 = new AccountChooserOptions();
                accountPicker$AccountChooserOptions0.c = this.c;
                accountPicker$AccountChooserOptions0.b = this.b;
                accountPicker$AccountChooserOptions0.d = this.d;
                accountPicker$AccountChooserOptions0.f = this.f;
                accountPicker$AccountChooserOptions0.a = this.a;
                accountPicker$AccountChooserOptions0.e = this.e;
                return accountPicker$AccountChooserOptions0;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setAllowableAccounts(@Nullable List list0) {
                this.b = list0 == null ? null : new ArrayList(list0);
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setAllowableAccountsTypes(@Nullable List list0) {
                this.c = list0 == null ? null : new ArrayList(list0);
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setAlwaysShowAccountPicker(boolean z) {
                this.d = z;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setOptionsForAddingAccount(@Nullable Bundle bundle0) {
                this.f = bundle0;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setSelectedAccount(@Nullable Account account0) {
                this.a = account0;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setTitleOverrideText(@Nullable String s) {
                this.e = s;
                return this;
            }
        }

        public Account a;
        public ArrayList b;
        public ArrayList c;
        public boolean d;
        public String e;
        public Bundle f;

    }

    @NonNull
    @Deprecated
    public static Intent newChooseAccountIntent(@Nullable Account account0, @Nullable ArrayList arrayList0, @Nullable String[] arr_s, boolean z, @Nullable String s, @Nullable String s1, @Nullable String[] arr_s1, @Nullable Bundle bundle0) {
        Intent intent0 = new Intent();
        Preconditions.checkArgument(true, "We only support hostedDomain filter for account chip styled account picker");
        intent0.setAction("com.google.android.gms.common.account.CHOOSE_ACCOUNT");
        intent0.setPackage("com.google.android.gms");
        intent0.putExtra("allowableAccounts", arrayList0);
        intent0.putExtra("allowableAccountTypes", arr_s);
        intent0.putExtra("addAccountOptions", bundle0);
        intent0.putExtra("selectedAccount", account0);
        intent0.putExtra("alwaysPromptForAccount", z);
        intent0.putExtra("descriptionTextOverride", s);
        intent0.putExtra("authTokenType", s1);
        intent0.putExtra("addAccountRequiredFeatures", arr_s1);
        intent0.putExtra("setGmsCoreAccount", false);
        intent0.putExtra("overrideTheme", 0);
        intent0.putExtra("overrideCustomTheme", 0);
        intent0.putExtra("hostedDomainFilter", null);
        return intent0;
    }

    @NonNull
    public static Intent newChooseAccountIntent(@NonNull AccountChooserOptions accountPicker$AccountChooserOptions0) {
        Intent intent0 = new Intent();
        accountPicker$AccountChooserOptions0.getClass();
        Preconditions.checkArgument(true, "We only support hostedDomain filter for account chip styled account picker");
        Preconditions.checkArgument(true, "Consent is only valid for account chip styled account picker");
        Preconditions.checkArgument(true, "Making the selected account non-clickable is only supported for the theme THEME_DAY_NIGHT_GOOGLE_MATERIAL2");
        intent0.setAction("com.google.android.gms.common.account.CHOOSE_ACCOUNT");
        intent0.setPackage("com.google.android.gms");
        intent0.putExtra("allowableAccounts", accountPicker$AccountChooserOptions0.b);
        ArrayList arrayList0 = accountPicker$AccountChooserOptions0.c;
        if(arrayList0 != null) {
            intent0.putExtra("allowableAccountTypes", ((String[])arrayList0.toArray(new String[0])));
        }
        intent0.putExtra("addAccountOptions", accountPicker$AccountChooserOptions0.f);
        intent0.putExtra("selectedAccount", accountPicker$AccountChooserOptions0.a);
        intent0.putExtra("selectedAccountIsNotClickable", false);
        intent0.putExtra("alwaysPromptForAccount", accountPicker$AccountChooserOptions0.d);
        intent0.putExtra("descriptionTextOverride", accountPicker$AccountChooserOptions0.e);
        intent0.putExtra("setGmsCoreAccount", false);
        intent0.putExtra("realClientPackage", null);
        intent0.putExtra("overrideTheme", 0);
        intent0.putExtra("overrideCustomTheme", 0);
        intent0.putExtra("hostedDomainFilter", null);
        Bundle bundle0 = new Bundle();
        if(!bundle0.isEmpty()) {
            intent0.putExtra("first_party_options_bundle", bundle0);
        }
        return intent0;
    }
}

