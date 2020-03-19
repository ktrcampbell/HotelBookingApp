package com.bigbang.bookaroom.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.bigbang.bookaroom.R;
import com.bigbang.bookaroom.adapter.OccupiedRoomAdapter;
import com.bigbang.bookaroom.presenter.Contract;
import com.bigbang.bookaroom.presenter.Presenter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HomeActivity extends AppCompatActivity {

    @BindView(R.id.occupied_room_recyclerview)
    RecyclerView occupiedRoomRecyclerView;

    private Contract.Presenter mainPresenter;

    private ProfileFragment fragment;
    private OccupiedRoomAdapter occupiedRoomAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mainPresenter = new Presenter(this);
        fragment = new ProfileFragment();
    }

    private void getOccRooms(){


    }

    public void logout(){
        mainPresenter.signoutUser();
    }

    @OnClick(R.id.settings_imageview)
    public void onMenuOpen(View view) {
        MenuInflater menuInflater = new MenuInflater(this);
        PopupMenu popupMenu = new PopupMenu(this, view);
        menuInflater.inflate(R.menu.year_picker_menu, popupMenu.getMenu());
        popupMenu.setOnMenuItemClickListener(this);
        popupMenu.show();
    }

}
