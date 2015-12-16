package com.kickstarter.ui.viewholders;

import android.support.annotation.NonNull;
import android.view.View;
import android.widget.TextView;

import com.kickstarter.R;

import butterknife.Bind;
import butterknife.BindString;
import butterknife.ButterKnife;

public class LoggedInMenuViewHolder {
  @Bind(R.id.menu_item_title) TextView menuItemTitleTextView;
  @BindString(R.string.button) String buttonString;

  public LoggedInMenuViewHolder(@NonNull final View view, final @NonNull String title) {
    ButterKnife.bind(this, view);

    menuItemTitleTextView.setText(title);
    menuItemTitleTextView.setContentDescription(title + buttonString);
  }
}
