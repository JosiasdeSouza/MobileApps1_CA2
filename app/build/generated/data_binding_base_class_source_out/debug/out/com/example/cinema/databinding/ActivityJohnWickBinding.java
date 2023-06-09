// Generated by view binder compiler. Do not edit!
package com.example.cinema.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.cinema.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityJohnWickBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView creedSeats;

  @NonNull
  public final Button johnBt1;

  @NonNull
  public final Button johnBt2;

  @NonNull
  public final TextView johnDescription;

  @NonNull
  public final TextView johnRemain;

  @NonNull
  public final TextView johnTicket;

  @NonNull
  public final TextView johnWickDetails;

  @NonNull
  public final ImageView uciImage;

  private ActivityJohnWickBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView creedSeats,
      @NonNull Button johnBt1, @NonNull Button johnBt2, @NonNull TextView johnDescription,
      @NonNull TextView johnRemain, @NonNull TextView johnTicket, @NonNull TextView johnWickDetails,
      @NonNull ImageView uciImage) {
    this.rootView = rootView;
    this.creedSeats = creedSeats;
    this.johnBt1 = johnBt1;
    this.johnBt2 = johnBt2;
    this.johnDescription = johnDescription;
    this.johnRemain = johnRemain;
    this.johnTicket = johnTicket;
    this.johnWickDetails = johnWickDetails;
    this.uciImage = uciImage;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityJohnWickBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityJohnWickBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_john_wick, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityJohnWickBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.creed_seats;
      ImageView creedSeats = ViewBindings.findChildViewById(rootView, id);
      if (creedSeats == null) {
        break missingId;
      }

      id = R.id.john_bt1;
      Button johnBt1 = ViewBindings.findChildViewById(rootView, id);
      if (johnBt1 == null) {
        break missingId;
      }

      id = R.id.john_bt2;
      Button johnBt2 = ViewBindings.findChildViewById(rootView, id);
      if (johnBt2 == null) {
        break missingId;
      }

      id = R.id.john_description;
      TextView johnDescription = ViewBindings.findChildViewById(rootView, id);
      if (johnDescription == null) {
        break missingId;
      }

      id = R.id.john_remain;
      TextView johnRemain = ViewBindings.findChildViewById(rootView, id);
      if (johnRemain == null) {
        break missingId;
      }

      id = R.id.john_ticket;
      TextView johnTicket = ViewBindings.findChildViewById(rootView, id);
      if (johnTicket == null) {
        break missingId;
      }

      id = R.id.john_wick_details;
      TextView johnWickDetails = ViewBindings.findChildViewById(rootView, id);
      if (johnWickDetails == null) {
        break missingId;
      }

      id = R.id.uci_image;
      ImageView uciImage = ViewBindings.findChildViewById(rootView, id);
      if (uciImage == null) {
        break missingId;
      }

      return new ActivityJohnWickBinding((ConstraintLayout) rootView, creedSeats, johnBt1, johnBt2,
          johnDescription, johnRemain, johnTicket, johnWickDetails, uciImage);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
